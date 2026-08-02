package androidx.media3.extractor;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import coil3.svg.internal.AndroidSvg;
import java.nio.ByteOrder;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class FlacStreamMetadata {
    public final int bitsPerSample;
    public final int bitsPerSampleLookupKey;
    public final int channels;
    public final int maxBlockSizeSamples;
    public final int maxFrameSize;
    public final Metadata metadata;
    public final int minBlockSizeSamples;
    public final int minFrameSize;
    public final int sampleRate;
    public final int sampleRateLookupKey;
    public final AndroidSvg seekTable;
    public final long totalSamples;

    public FlacStreamMetadata(byte[] bArr, int i) {
        VorbisBitArray vorbisBitArray = new VorbisBitArray(bArr, bArr.length);
        vorbisBitArray.setPosition(i * 8);
        this.minBlockSizeSamples = vorbisBitArray.readBits(16);
        this.maxBlockSizeSamples = vorbisBitArray.readBits(16);
        this.minFrameSize = vorbisBitArray.readBits(24);
        this.maxFrameSize = vorbisBitArray.readBits(24);
        int readBits = vorbisBitArray.readBits(20);
        this.sampleRate = readBits;
        this.sampleRateLookupKey = getSampleRateLookupKey(readBits);
        this.channels = vorbisBitArray.readBits(3) + 1;
        int readBits2 = vorbisBitArray.readBits(5) + 1;
        this.bitsPerSample = readBits2;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(readBits2);
        this.totalSamples = vorbisBitArray.readBitsToLong(36);
        this.seekTable = null;
        this.metadata = null;
    }

    public static int getBitsPerSampleLookupKey(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int getSampleRateLookupKey(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long getDurationUs() {
        long j = this.totalSamples;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.sampleRate;
    }

    public final Format getFormat(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.maxFrameSize;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadata2 = this.metadata;
        if (metadata2 != null) {
            metadata = metadata2.copyWithAppendedEntriesFrom(metadata);
        }
        Format.Builder builder = new Format.Builder();
        builder.sampleMimeType = MimeTypes.normalizeMimeType("audio/flac");
        builder.maxInputSize = i;
        builder.channelCount = this.channels;
        builder.sampleRate = this.sampleRate;
        String str = Util.DEVICE_DEBUG_INFO;
        builder.pcmEncoding = Util.getPcmEncoding(this.bitsPerSample, ByteOrder.LITTLE_ENDIAN);
        builder.initializationData = Collections.singletonList(bArr);
        builder.metadata = metadata;
        return new Format(builder);
    }

    public FlacStreamMetadata(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, AndroidSvg androidSvg, Metadata metadata) {
        this.minBlockSizeSamples = i;
        this.maxBlockSizeSamples = i2;
        this.minFrameSize = i3;
        this.maxFrameSize = i4;
        this.sampleRate = i5;
        this.sampleRateLookupKey = getSampleRateLookupKey(i5);
        this.channels = i6;
        this.bitsPerSample = i7;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(i7);
        this.totalSamples = j;
        this.seekTable = androidSvg;
        this.metadata = metadata;
    }
}
