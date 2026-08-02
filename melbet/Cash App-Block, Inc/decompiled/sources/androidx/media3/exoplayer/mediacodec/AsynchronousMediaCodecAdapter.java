package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.common.util.CircularIntArray;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.tracing.Trace;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {
    public final AsynchronousMediaCodecCallback asynchronousMediaCodecCallback;
    public final MediaCodecBufferEnqueuer bufferEnqueuer;
    public final MediaCodec codec;
    public boolean codecReleased;
    public final LoudnessCodecController loudnessCodecController;
    public int state = 0;

    public AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, MediaCodecBufferEnqueuer mediaCodecBufferEnqueuer, LoudnessCodecController loudnessCodecController) {
        this.codec = mediaCodec;
        this.asynchronousMediaCodecCallback = new AsynchronousMediaCodecCallback(handlerThread);
        this.bufferEnqueuer = mediaCodecBufferEnqueuer;
        this.loudnessCodecController = loudnessCodecController;
    }

    public static void access$100(AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        LoudnessCodecController loudnessCodecController;
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = asynchronousMediaCodecAdapter.asynchronousMediaCodecCallback;
        MediaCodec mediaCodec = asynchronousMediaCodecAdapter.codec;
        HandlerThread handlerThread = asynchronousMediaCodecCallback.callbackThread;
        Trace.checkState(asynchronousMediaCodecCallback.handler == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(asynchronousMediaCodecCallback, handler);
        asynchronousMediaCodecCallback.handler = handler;
        android.os.Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        android.os.Trace.endSection();
        asynchronousMediaCodecAdapter.bufferEnqueuer.start();
        android.os.Trace.beginSection("startCodec");
        mediaCodec.start();
        android.os.Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (loudnessCodecController = asynchronousMediaCodecAdapter.loudnessCodecController) != null) {
            loudnessCodecController.addMediaCodec(mediaCodec);
        }
        asynchronousMediaCodecAdapter.state = 1;
    }

    public static String createThreadLabel(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0026, B:20:0x003e, B:23:0x0034, B:24:0x0040, B:25:0x0045), top: B:3:0x000a }] */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int dequeueInputBufferIndex() {
        boolean z;
        this.bufferEnqueuer.maybeThrowException();
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.asynchronousMediaCodecCallback;
        synchronized (asynchronousMediaCodecCallback.lock) {
            try {
                asynchronousMediaCodecCallback.maybeThrowException();
                if (asynchronousMediaCodecCallback.pendingFlushCount <= 0 && !asynchronousMediaCodecCallback.shutDown) {
                    z = false;
                    int i = -1;
                    if (!z) {
                        return -1;
                    }
                    CircularIntArray circularIntArray = asynchronousMediaCodecCallback.availableInputBuffers;
                    int i2 = circularIntArray.head;
                    int i3 = circularIntArray.tail;
                    if (!(i2 == i3)) {
                        if (i2 == i3) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = circularIntArray.elements[i2];
                        circularIntArray.head = (i2 + 1) & circularIntArray.capacityBitmask;
                    }
                    return i;
                }
                z = true;
                int i4 = -1;
                if (!z) {
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0024, DONT_GENERATE, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:25:0x0069, B:29:0x005f, B:30:0x006b, B:31:0x0070), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000a, B:6:0x0017, B:12:0x0022, B:15:0x0027, B:19:0x0032, B:22:0x0036, B:24:0x0042, B:25:0x0069, B:29:0x005f, B:30:0x006b, B:31:0x0070), top: B:3:0x000a }] */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        this.bufferEnqueuer.maybeThrowException();
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.asynchronousMediaCodecCallback;
        synchronized (asynchronousMediaCodecCallback.lock) {
            try {
                asynchronousMediaCodecCallback.maybeThrowException();
                if (asynchronousMediaCodecCallback.pendingFlushCount <= 0 && !asynchronousMediaCodecCallback.shutDown) {
                    z = false;
                    if (!z) {
                        return -1;
                    }
                    CircularIntArray circularIntArray = asynchronousMediaCodecCallback.availableOutputBuffers;
                    int i = circularIntArray.head;
                    int i2 = circularIntArray.tail;
                    if (i == i2) {
                        return -1;
                    }
                    if (i == i2) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i3 = circularIntArray.elements[i];
                    circularIntArray.head = circularIntArray.capacityBitmask & (i + 1);
                    if (i3 >= 0) {
                        asynchronousMediaCodecCallback.currentFormat.getClass();
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) asynchronousMediaCodecCallback.bufferInfos.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i3 == -2) {
                        asynchronousMediaCodecCallback.currentFormat = (MediaFormat) asynchronousMediaCodecCallback.formats.remove();
                    }
                    return i3;
                }
                z = true;
                if (!z) {
                }
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void detachOutputSurface() {
        this.codec.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void flush() {
        this.bufferEnqueuer.flush();
        this.codec.flush();
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.asynchronousMediaCodecCallback;
        synchronized (asynchronousMediaCodecCallback.lock) {
            asynchronousMediaCodecCallback.pendingFlushCount++;
            Handler handler = asynchronousMediaCodecCallback.handler;
            String str = Util.DEVICE_DEBUG_INFO;
            handler.post(new AFd1lSDK$$ExternalSyntheticLambda0(asynchronousMediaCodecCallback, 15));
        }
        this.codec.start();
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
        MediaFormat mediaFormat;
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.asynchronousMediaCodecCallback;
        synchronized (asynchronousMediaCodecCallback.lock) {
            try {
                mediaFormat = asynchronousMediaCodecCallback.currentFormat;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void queueInputBuffer(int i, int i2, int i3, long j) {
        this.bufferEnqueuer.queueInputBuffer(i, i2, i3, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void queueSecureInputBuffer(int i, CryptoInfo cryptoInfo, long j, int i2) {
        this.bufferEnqueuer.queueSecureInputBuffer(i, cryptoInfo, j, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final boolean registerOnBufferAvailableListener(PreviewView.AnonymousClass1 anonymousClass1) {
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.asynchronousMediaCodecCallback;
        synchronized (asynchronousMediaCodecCallback.lock) {
            asynchronousMediaCodecCallback.onBufferAvailableListener = anonymousClass1;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void release() {
        LoudnessCodecController loudnessCodecController;
        LoudnessCodecController loudnessCodecController2;
        try {
            if (this.state == 1) {
                this.bufferEnqueuer.shutdown();
                AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.asynchronousMediaCodecCallback;
                synchronized (asynchronousMediaCodecCallback.lock) {
                    asynchronousMediaCodecCallback.shutDown = true;
                    asynchronousMediaCodecCallback.callbackThread.quit();
                    asynchronousMediaCodecCallback.flushInternal();
                }
            }
            this.state = 2;
            if (this.codecReleased) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.codec.stop();
                }
                if (i >= 35 && (loudnessCodecController2 = this.loudnessCodecController) != null) {
                    loudnessCodecController2.removeMediaCodec(this.codec);
                }
                this.codec.release();
                this.codecReleased = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.codecReleased) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.codec.stop();
                    }
                    if (i2 >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
                        loudnessCodecController.removeMediaCodec(this.codec);
                    }
                    this.codec.release();
                    this.codecReleased = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void releaseOutputBuffer(int i) {
        this.codec.releaseOutputBuffer(i, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void setOnFrameRenderedListener(MediaCodecVideoRenderer.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.codec.setOnFrameRenderedListener(new SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0(this, onFrameRenderedListener, 1), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void setOutputSurface(Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void setParameters(Bundle bundle) {
        this.bufferEnqueuer.setParameters(bundle);
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
    public final void useInputBuffer(DispatchQueue$$ExternalSyntheticLambda0 dispatchQueue$$ExternalSyntheticLambda0) {
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.asynchronousMediaCodecCallback;
        DispatchQueue$$ExternalSyntheticLambda0 dispatchQueue$$ExternalSyntheticLambda02 = new DispatchQueue$$ExternalSyntheticLambda0(27, this, dispatchQueue$$ExternalSyntheticLambda0);
        synchronized (asynchronousMediaCodecCallback.lock) {
            asynchronousMediaCodecCallback.maybeThrowException();
            dispatchQueue$$ExternalSyntheticLambda02.run();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void releaseOutputBuffer(int i, long j) {
        this.codec.releaseOutputBuffer(i, j);
    }
}
