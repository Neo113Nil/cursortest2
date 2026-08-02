package androidx.media3.extractor.ogg;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.tracing.Trace;
import java.io.EOFException;

/* loaded from: classes3.dex */
public final class OggPacket {
    public boolean populated;
    public int segmentCount;
    public final OggPageHeader pageHeader = new OggPageHeader();
    public final ParsableByteArray packetArray = new ParsableByteArray(new byte[65025], 0);
    public int currentSegmentIndex = -1;

    public final int calculatePacketSize(int i) {
        int i2;
        int i3 = 0;
        this.segmentCount = 0;
        do {
            int i4 = this.segmentCount;
            int i5 = i + i4;
            OggPageHeader oggPageHeader = this.pageHeader;
            if (i5 >= oggPageHeader.pageSegmentCount) {
                break;
            }
            int[] iArr = oggPageHeader.laces;
            this.segmentCount = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean populate(ExtractorInput extractorInput) {
        int i;
        Trace.checkState(extractorInput != null);
        boolean z = this.populated;
        ParsableByteArray parsableByteArray = this.packetArray;
        if (z) {
            this.populated = false;
            parsableByteArray.reset(0);
        }
        while (!this.populated) {
            int i2 = this.currentSegmentIndex;
            OggPageHeader oggPageHeader = this.pageHeader;
            if (i2 < 0) {
                if (oggPageHeader.skipToNextPage(extractorInput, -1L) && oggPageHeader.populate(extractorInput, true)) {
                    int i3 = oggPageHeader.headerSize;
                    if ((oggPageHeader.f894type & 1) == 1 && parsableByteArray.limit == 0) {
                        i3 += calculatePacketSize(0);
                        i = this.segmentCount;
                    } else {
                        i = 0;
                    }
                    try {
                        extractorInput.skipFully(i3);
                        this.currentSegmentIndex = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int calculatePacketSize = calculatePacketSize(this.currentSegmentIndex);
            int i4 = this.currentSegmentIndex + this.segmentCount;
            if (calculatePacketSize > 0) {
                parsableByteArray.ensureCapacity(parsableByteArray.limit + calculatePacketSize);
                try {
                    extractorInput.readFully(parsableByteArray.data, parsableByteArray.limit, calculatePacketSize);
                    parsableByteArray.setLimit(parsableByteArray.limit + calculatePacketSize);
                    this.populated = oggPageHeader.laces[i4 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == oggPageHeader.pageSegmentCount) {
                i4 = -1;
            }
            this.currentSegmentIndex = i4;
        }
        return true;
    }
}
