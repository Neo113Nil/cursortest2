package androidx.media3.decoder.flac;

import androidx.media3.extractor.FlacStreamMetadata;
import defpackage.dvt;
import defpackage.eap;
import defpackage.iap;
import defpackage.qgc;
import defpackage.r7k;
import defpackage.rgc;
import defpackage.s2c;
import defpackage.tgc;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class FlacDecoderJni {
    private static final int TEMP_BUFFER_SIZE = 8192;
    private ByteBuffer byteBufferData;
    private boolean endOfExtractorInput;
    private s2c extractorInput;
    private final long nativeDecoderContext;
    private byte[] tempBuffer;

    public FlacDecoderJni() throws qgc {
        if (!tgc.isAvailable()) {
            throw new qgc("Failed to load decoder native libraries.");
        }
        long flacInit = flacInit();
        this.nativeDecoderContext = flacInit;
        if (flacInit == 0) {
            throw new qgc("Failed to initialize decoder");
        }
    }

    private native FlacStreamMetadata flacDecodeMetadata(long j) throws IOException;

    private native int flacDecodeToArray(long j, byte[] bArr) throws IOException;

    private native int flacDecodeToBuffer(long j, ByteBuffer byteBuffer) throws IOException;

    private native void flacFlush(long j);

    private native long flacGetDecodePosition(long j);

    private native long flacGetLastFrameFirstSampleIndex(long j);

    private native long flacGetLastFrameTimestamp(long j);

    private native long flacGetNextFrameFirstSampleIndex(long j);

    private native boolean flacGetSeekPoints(long j, long j2, long[] jArr);

    private native String flacGetStateString(long j);

    private native long flacInit();

    private native boolean flacIsDecoderAtEndOfStream(long j);

    private native void flacRelease(long j);

    private native void flacReset(long j, long j2);

    private int readFromExtractorInput(s2c s2cVar, byte[] bArr, int i, int i2) throws IOException {
        int read = s2cVar.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        this.endOfExtractorInput = true;
        return 0;
    }

    public void clearData() {
        this.byteBufferData = null;
        this.extractorInput = null;
    }

    public void decodeSample(ByteBuffer byteBuffer) throws IOException, rgc {
        byteBuffer.clear();
        boolean isDirect = byteBuffer.isDirect();
        long j = this.nativeDecoderContext;
        int flacDecodeToBuffer = isDirect ? flacDecodeToBuffer(j, byteBuffer) : flacDecodeToArray(j, byteBuffer.array());
        if (flacDecodeToBuffer >= 0) {
            byteBuffer.limit(flacDecodeToBuffer);
        } else {
            if (!isDecoderAtEndOfInput()) {
                throw new rgc("Cannot decode FLAC frame");
            }
            byteBuffer.limit(0);
        }
    }

    public void decodeSampleWithBacktrackPosition(ByteBuffer byteBuffer, long j) throws IOException, rgc {
        try {
            decodeSample(byteBuffer);
        } catch (IOException e) {
            if (j >= 0) {
                reset(j);
                s2c s2cVar = this.extractorInput;
                if (s2cVar != null) {
                    s2cVar.m(j, e);
                }
            }
            throw e;
        }
    }

    public FlacStreamMetadata decodeStreamMetadata() throws IOException {
        FlacStreamMetadata flacDecodeMetadata = flacDecodeMetadata(this.nativeDecoderContext);
        if (flacDecodeMetadata != null) {
            return flacDecodeMetadata;
        }
        throw r7k.a(null, "Failed to decode stream metadata");
    }

    public void flush() {
        flacFlush(this.nativeDecoderContext);
    }

    public long getDecodePosition() {
        return flacGetDecodePosition(this.nativeDecoderContext);
    }

    public long getLastFrameFirstSampleIndex() {
        return flacGetLastFrameFirstSampleIndex(this.nativeDecoderContext);
    }

    public long getLastFrameTimestamp() {
        return flacGetLastFrameTimestamp(this.nativeDecoderContext);
    }

    public long getNextFrameFirstSampleIndex() {
        return flacGetNextFrameFirstSampleIndex(this.nativeDecoderContext);
    }

    public eap getSeekPoints(long j) {
        long[] jArr = new long[4];
        if (!flacGetSeekPoints(this.nativeDecoderContext, j, jArr)) {
            return null;
        }
        long j2 = jArr[0];
        iap iapVar = new iap(j2, jArr[1]);
        long j3 = jArr[2];
        return new eap(iapVar, j3 == j2 ? iapVar : new iap(j3, jArr[3]));
    }

    public String getStateString() {
        return flacGetStateString(this.nativeDecoderContext);
    }

    public boolean isDecoderAtEndOfInput() {
        return flacIsDecoderAtEndOfStream(this.nativeDecoderContext);
    }

    public boolean isEndOfData() {
        ByteBuffer byteBuffer = this.byteBufferData;
        if (byteBuffer != null) {
            return byteBuffer.remaining() == 0;
        }
        if (this.extractorInput != null) {
            return this.endOfExtractorInput;
        }
        return true;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.byteBufferData;
        if (byteBuffer2 != null) {
            int min = Math.min(remaining, byteBuffer2.remaining());
            int limit = this.byteBufferData.limit();
            ByteBuffer byteBuffer3 = this.byteBufferData;
            byteBuffer3.limit(byteBuffer3.position() + min);
            byteBuffer.put(this.byteBufferData);
            this.byteBufferData.limit(limit);
            return min;
        }
        s2c s2cVar = this.extractorInput;
        if (s2cVar == null) {
            return -1;
        }
        byte[] bArr = this.tempBuffer;
        int i = dvt.a;
        int min2 = Math.min(remaining, 8192);
        int readFromExtractorInput = readFromExtractorInput(s2cVar, bArr, 0, min2);
        if (readFromExtractorInput < 4) {
            readFromExtractorInput += readFromExtractorInput(s2cVar, bArr, readFromExtractorInput, min2 - readFromExtractorInput);
        }
        byteBuffer.put(bArr, 0, readFromExtractorInput);
        return readFromExtractorInput;
    }

    public void release() {
        flacRelease(this.nativeDecoderContext);
    }

    public void reset(long j) {
        flacReset(this.nativeDecoderContext, j);
    }

    public void setData(s2c s2cVar) {
        this.byteBufferData = null;
        this.extractorInput = s2cVar;
        this.endOfExtractorInput = false;
        if (this.tempBuffer == null) {
            this.tempBuffer = new byte[8192];
        }
    }

    public void setData(ByteBuffer byteBuffer) {
        this.byteBufferData = byteBuffer;
        this.extractorInput = null;
    }
}
