package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {
    public final MediaCodec codec;
    public final LoudnessCodecController loudnessCodecController;

    public SynchronousMediaCodecAdapter(MediaCodec mediaCodec, LoudnessCodecController loudnessCodecController) {
        this.codec = mediaCodec;
        this.loudnessCodecController = loudnessCodecController;
        if (Build.VERSION.SDK_INT < 35 || loudnessCodecController == null) {
            return;
        }
        loudnessCodecController.addMediaCodec(mediaCodec);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final int dequeueInputBufferIndex() {
        return this.codec.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void detachOutputSurface() {
        this.codec.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void flush() {
        this.codec.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final ByteBuffer getInputBuffer(int i) {
        return this.codec.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final ByteBuffer getOutputBuffer(int i) {
        return this.codec.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final MediaFormat getOutputFormat() {
        return this.codec.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void queueInputBuffer(int i, int i2, int i3, long j) {
        this.codec.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void queueSecureInputBuffer(int i, CryptoInfo cryptoInfo, long j, int i2) {
        this.codec.queueSecureInputBuffer(i, 0, cryptoInfo.frameworkCryptoInfo, j, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void release() {
        LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        MediaCodec mediaCodec = this.codec;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && loudnessCodecController != null) {
                loudnessCodecController.removeMediaCodec(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && loudnessCodecController != null) {
                loudnessCodecController.removeMediaCodec(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void releaseOutputBuffer(int i) {
        this.codec.releaseOutputBuffer(i, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void setOnFrameRenderedListener(MediaCodecVideoRenderer.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.codec.setOnFrameRenderedListener(new SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0(this, onFrameRenderedListener, 0), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void setOutputSurface(Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void setParameters(Bundle bundle) {
        this.codec.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void setVideoScalingMode(int i) {
        this.codec.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void subscribeToVendorParameters(ArrayList arrayList) {
        this.codec.subscribeToVendorParameters(arrayList);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void unsubscribeFromVendorParameters(ArrayList arrayList) {
        this.codec.unsubscribeFromVendorParameters(arrayList);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void releaseOutputBuffer(int i, long j) {
        this.codec.releaseOutputBuffer(i, j);
    }
}
