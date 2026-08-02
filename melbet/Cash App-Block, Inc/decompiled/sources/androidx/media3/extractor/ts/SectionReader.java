package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;
import com.google.android.libraries.places.internal.zzcjk;

/* loaded from: classes3.dex */
public final class SectionReader implements TsPayloadReader {
    public int bytesRead;
    public final SectionPayloadReader reader;
    public final ParsableByteArray sectionData = new ParsableByteArray(32);
    public boolean sectionSyntaxIndicator;
    public int totalSectionLength;
    public boolean waitingForPayloadStart;

    public SectionReader(SectionPayloadReader sectionPayloadReader) {
        this.reader = sectionPayloadReader;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void consume(int i, ParsableByteArray parsableByteArray) {
        boolean z = (i & 1) != 0;
        int readUnsignedByte = z ? parsableByteArray.position + parsableByteArray.readUnsignedByte() : -1;
        if (this.waitingForPayloadStart) {
            if (!z) {
                return;
            }
            this.waitingForPayloadStart = false;
            parsableByteArray.setPosition(readUnsignedByte);
            this.bytesRead = 0;
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i2 = this.bytesRead;
            ParsableByteArray parsableByteArray2 = this.sectionData;
            if (i2 < 3) {
                if (i2 == 0) {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    parsableByteArray.setPosition(parsableByteArray.position - 1);
                    if (readUnsignedByte2 == 255) {
                        this.waitingForPayloadStart = true;
                        return;
                    }
                }
                int min = Math.min(parsableByteArray.bytesLeft(), 3 - this.bytesRead);
                parsableByteArray.readBytes(this.bytesRead, min, parsableByteArray2.data);
                int i3 = this.bytesRead + min;
                this.bytesRead = i3;
                if (i3 == 3) {
                    parsableByteArray2.setPosition(0);
                    parsableByteArray2.setLimit(3);
                    parsableByteArray2.skipBytes(1);
                    int readUnsignedByte3 = parsableByteArray2.readUnsignedByte();
                    int readUnsignedByte4 = parsableByteArray2.readUnsignedByte();
                    this.sectionSyntaxIndicator = (readUnsignedByte3 & 128) != 0;
                    int i4 = (((readUnsignedByte3 & 15) << 8) | readUnsignedByte4) + 3;
                    this.totalSectionLength = i4;
                    byte[] bArr = parsableByteArray2.data;
                    if (bArr.length < i4) {
                        parsableByteArray2.ensureCapacity(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(parsableByteArray.bytesLeft(), this.totalSectionLength - this.bytesRead);
                parsableByteArray.readBytes(this.bytesRead, min2, parsableByteArray2.data);
                int i5 = this.bytesRead + min2;
                this.bytesRead = i5;
                int i6 = this.totalSectionLength;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.sectionSyntaxIndicator) {
                        parsableByteArray2.setLimit(i6);
                    } else {
                        if (Util.crc32(0, i6, -1, parsableByteArray2.data) != 0) {
                            this.waitingForPayloadStart = true;
                            return;
                        }
                        parsableByteArray2.setLimit(this.totalSectionLength - 4);
                    }
                    parsableByteArray2.setPosition(0);
                    this.reader.consume(parsableByteArray2);
                    this.bytesRead = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, zzcjk zzcjkVar) {
        this.reader.init(timestampAdjuster, extractorOutput, zzcjkVar);
        this.waitingForPayloadStart = true;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void seek() {
        this.waitingForPayloadStart = true;
    }
}
