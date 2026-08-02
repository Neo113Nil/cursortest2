package androidx.media3.extractor.ts;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.VorbisBitArray;
import com.google.android.libraries.places.internal.zzcjk;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class PesReader implements TsPayloadReader {
    public int bytesRead;
    public boolean dataAlignmentIndicator;
    public boolean dtsFlag;
    public int extendedHeaderLength;
    public int payloadSize;
    public boolean ptsFlag;
    public final ElementaryStreamReader reader;
    public boolean seenFirstDts;
    public long timeUs;
    public TimestampAdjuster timestampAdjuster;
    public final VorbisBitArray pesScratch = new VorbisBitArray(new byte[10], 10);
    public int state = 0;

    public PesReader(ElementaryStreamReader elementaryStreamReader) {
        this.reader = elementaryStreamReader;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void consume(int i, ParsableByteArray parsableByteArray) {
        int i2;
        int i3;
        this.timestampAdjuster.getClass();
        int i4 = i & 1;
        int i5 = -1;
        int i6 = 2;
        ElementaryStreamReader elementaryStreamReader = this.reader;
        if (i4 != 0) {
            int i7 = this.state;
            if (i7 != 0 && i7 != 1) {
                if (i7 == 2) {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i7 != 3) {
                        Path$$ExternalSyntheticBUOutline0.m();
                        return;
                    }
                    if (this.payloadSize != -1) {
                        Log.w("PesReader", "Unexpected start indicator: expected " + this.payloadSize + " more bytes");
                    }
                    elementaryStreamReader.packetFinished(parsableByteArray.limit == 0);
                }
            }
            this.state = 1;
            this.bytesRead = 0;
        }
        int i8 = i;
        while (parsableByteArray.bytesLeft() > 0) {
            int i9 = this.state;
            if (i9 != 0) {
                VorbisBitArray vorbisBitArray = this.pesScratch;
                if (i9 != 1) {
                    if (i9 == i6) {
                        if (continueRead(parsableByteArray, vorbisBitArray.data, Math.min(10, this.extendedHeaderLength)) && continueRead(parsableByteArray, null, this.extendedHeaderLength)) {
                            vorbisBitArray.setPosition(0);
                            this.timeUs = -9223372036854775807L;
                            if (this.ptsFlag) {
                                vorbisBitArray.skipBits(4);
                                vorbisBitArray.skipBits(1);
                                vorbisBitArray.skipBits(1);
                                long readBits = (vorbisBitArray.readBits(15) << 15) | (vorbisBitArray.readBits(3) << 30) | vorbisBitArray.readBits(15);
                                vorbisBitArray.skipBits(1);
                                if (!this.seenFirstDts && this.dtsFlag) {
                                    vorbisBitArray.skipBits(4);
                                    vorbisBitArray.skipBits(1);
                                    vorbisBitArray.skipBits(1);
                                    vorbisBitArray.skipBits(1);
                                    this.timestampAdjuster.adjustTsTimestamp((vorbisBitArray.readBits(3) << 30) | (vorbisBitArray.readBits(15) << 15) | vorbisBitArray.readBits(15));
                                    this.seenFirstDts = true;
                                }
                                this.timeUs = this.timestampAdjuster.adjustTsTimestamp(readBits);
                            }
                            i8 |= this.dataAlignmentIndicator ? 4 : 0;
                            elementaryStreamReader.packetStarted(i8, this.timeUs);
                            this.state = 3;
                            this.bytesRead = 0;
                            i5 = -1;
                            i6 = 2;
                        }
                    } else {
                        if (i9 != 3) {
                            Path$$ExternalSyntheticBUOutline0.m();
                            return;
                        }
                        int bytesLeft = parsableByteArray.bytesLeft();
                        int i10 = this.payloadSize;
                        int i11 = i10 == i5 ? 0 : bytesLeft - i10;
                        if (i11 > 0) {
                            bytesLeft -= i11;
                            parsableByteArray.setLimit(parsableByteArray.position + bytesLeft);
                        }
                        elementaryStreamReader.consume(parsableByteArray);
                        int i12 = this.payloadSize;
                        if (i12 != i5) {
                            int i13 = i12 - bytesLeft;
                            this.payloadSize = i13;
                            if (i13 == 0) {
                                elementaryStreamReader.packetFinished(false);
                                this.state = 1;
                                this.bytesRead = 0;
                            }
                        }
                    }
                    i2 = i6;
                } else if (continueRead(parsableByteArray, vorbisBitArray.data, 9)) {
                    vorbisBitArray.setPosition(0);
                    int readBits2 = vorbisBitArray.readBits(24);
                    if (readBits2 != 1) {
                        Fragment$5$$ExternalSyntheticOutline0.m(readBits2, "Unexpected start code prefix: ", "PesReader");
                        i5 = -1;
                        this.payloadSize = -1;
                        i3 = 0;
                        i2 = 2;
                    } else {
                        vorbisBitArray.skipBits(8);
                        int readBits3 = vorbisBitArray.readBits(16);
                        vorbisBitArray.skipBits(5);
                        this.dataAlignmentIndicator = vorbisBitArray.readBit();
                        i2 = 2;
                        vorbisBitArray.skipBits(2);
                        this.ptsFlag = vorbisBitArray.readBit();
                        this.dtsFlag = vorbisBitArray.readBit();
                        vorbisBitArray.skipBits(6);
                        int readBits4 = vorbisBitArray.readBits(8);
                        this.extendedHeaderLength = readBits4;
                        if (readBits3 == 0) {
                            this.payloadSize = -1;
                            i5 = -1;
                        } else {
                            int i14 = (readBits3 - 3) - readBits4;
                            this.payloadSize = i14;
                            if (i14 < 0) {
                                Log.w("PesReader", "Found negative packet payload size: " + this.payloadSize);
                                i5 = -1;
                                this.payloadSize = -1;
                            } else {
                                i5 = -1;
                            }
                        }
                        i3 = 2;
                    }
                    this.state = i3;
                    this.bytesRead = 0;
                } else {
                    i5 = -1;
                    i2 = 2;
                }
            } else {
                i2 = i6;
                parsableByteArray.skipBytes(parsableByteArray.bytesLeft());
            }
            i6 = i2;
        }
    }

    public final boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int min = Math.min(parsableByteArray.bytesLeft(), i - this.bytesRead);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            parsableByteArray.skipBytes(min);
        } else {
            parsableByteArray.readBytes(this.bytesRead, min, bArr);
        }
        int i2 = this.bytesRead + min;
        this.bytesRead = i2;
        return i2 == i;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, zzcjk zzcjkVar) {
        this.timestampAdjuster = timestampAdjuster;
        this.reader.createTracks(extractorOutput, zzcjkVar);
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.seenFirstDts = false;
        this.reader.seek();
    }
}
