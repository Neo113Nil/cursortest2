package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.FlacStreamMetadata;
import coil3.memory.RealStrongMemoryCache$cache$1;
import coil3.svg.internal.AndroidSvg;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class FlacReader extends StreamReader {
    public RealStrongMemoryCache$cache$1 flacOggSeeker;
    public FlacStreamMetadata streamMetadata;

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final long preparePayload(ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.data;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            parsableByteArray.skipBytes(4);
            parsableByteArray.readUtf8EncodedLong();
        }
        int readFrameBlockSizeSamplesFromKey = AacUtil.readFrameBlockSizeSamplesFromKey(i, parsableByteArray);
        parsableByteArray.setPosition(0);
        return readFrameBlockSizeSamplesFromKey;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final boolean readHeaders(ParsableByteArray parsableByteArray, long j, AndroidSvg androidSvg) {
        byte[] bArr = parsableByteArray.data;
        FlacStreamMetadata flacStreamMetadata = this.streamMetadata;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArr, 17);
            this.streamMetadata = flacStreamMetadata2;
            Format.Builder buildUpon = flacStreamMetadata2.getFormat(Arrays.copyOfRange(bArr, 9, parsableByteArray.limit), null).buildUpon();
            buildUpon.containerMimeType = MimeTypes.normalizeMimeType("audio/ogg");
            androidSvg.svg = new Format(buildUpon);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) != 3) {
            if (b != -1) {
                return true;
            }
            RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = this.flacOggSeeker;
            if (realStrongMemoryCache$cache$1 != null) {
                realStrongMemoryCache$cache$1.maxSize = j;
                androidSvg.renderOptions = realStrongMemoryCache$cache$1;
            }
            ((Format) androidSvg.svg).getClass();
            return false;
        }
        AndroidSvg readSeekTableMetadataBlock = AacUtil.readSeekTableMetadataBlock(parsableByteArray);
        FlacStreamMetadata flacStreamMetadata3 = new FlacStreamMetadata(flacStreamMetadata.minBlockSizeSamples, flacStreamMetadata.maxBlockSizeSamples, flacStreamMetadata.minFrameSize, flacStreamMetadata.maxFrameSize, flacStreamMetadata.sampleRate, flacStreamMetadata.channels, flacStreamMetadata.bitsPerSample, flacStreamMetadata.totalSamples, readSeekTableMetadataBlock, flacStreamMetadata.metadata);
        this.streamMetadata = flacStreamMetadata3;
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$12 = new RealStrongMemoryCache$cache$1();
        realStrongMemoryCache$cache$12.map = flacStreamMetadata3;
        realStrongMemoryCache$cache$12.this$0 = readSeekTableMetadataBlock;
        realStrongMemoryCache$cache$12.maxSize = -1L;
        realStrongMemoryCache$cache$12.size = -1L;
        this.flacOggSeeker = realStrongMemoryCache$cache$12;
        return true;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final void reset(boolean z) {
        super.reset(z);
        if (z) {
            this.streamMetadata = null;
            this.flacOggSeeker = null;
        }
    }
}
