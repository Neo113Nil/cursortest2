package androidx.media3.extractor.ogg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.tracing.Trace;
import java.io.EOFException;

/* loaded from: classes3.dex */
public final class OggPageHeader {
    public int bodySize;
    public long granulePosition;
    public int headerSize;
    public int pageSegmentCount;

    /* renamed from: type, reason: collision with root package name */
    public int f894type;
    public final int[] laces = new int[255];
    public final ParsableByteArray scratch = new ParsableByteArray(255);

    public final boolean populate(ExtractorInput extractorInput, boolean z) {
        boolean z2;
        boolean z3;
        this.f894type = 0;
        this.granulePosition = 0L;
        this.pageSegmentCount = 0;
        this.headerSize = 0;
        this.bodySize = 0;
        ParsableByteArray parsableByteArray = this.scratch;
        parsableByteArray.reset(27);
        try {
            z2 = extractorInput.peekFully(parsableByteArray.data, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            z2 = false;
        }
        if (z2 && parsableByteArray.readUnsignedInt() == 1332176723) {
            if (parsableByteArray.readUnsignedByte() == 0) {
                this.f894type = parsableByteArray.readUnsignedByte();
                this.granulePosition = parsableByteArray.readLittleEndianLong();
                parsableByteArray.readLittleEndianUnsignedInt();
                parsableByteArray.readLittleEndianUnsignedInt();
                parsableByteArray.readLittleEndianUnsignedInt();
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                this.pageSegmentCount = readUnsignedByte;
                this.headerSize = readUnsignedByte + 27;
                parsableByteArray.reset(readUnsignedByte);
                try {
                    z3 = extractorInput.peekFully(parsableByteArray.data, 0, this.pageSegmentCount, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    z3 = false;
                }
                if (z3) {
                    for (int i = 0; i < this.pageSegmentCount; i++) {
                        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                        this.laces[i] = readUnsignedByte2;
                        this.bodySize += readUnsignedByte2;
                    }
                    return true;
                }
            } else if (!z) {
                throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean skipToNextPage(ExtractorInput extractorInput, long j) {
        boolean z;
        Trace.checkArgument(extractorInput.getPosition() == extractorInput.getPeekPosition());
        ParsableByteArray parsableByteArray = this.scratch;
        parsableByteArray.reset(4);
        while (true) {
            if (j != -1 && extractorInput.getPosition() + 4 >= j) {
                break;
            }
            try {
                z = extractorInput.peekFully(parsableByteArray.data, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            parsableByteArray.setPosition(0);
            if (parsableByteArray.readUnsignedInt() == 1332176723) {
                extractorInput.resetPeekPosition();
                return true;
            }
            extractorInput.skipFully(1);
        }
        do {
            if (j != -1 && extractorInput.getPosition() >= j) {
                break;
            }
        } while (extractorInput.skip(1) != -1);
        return false;
    }
}
