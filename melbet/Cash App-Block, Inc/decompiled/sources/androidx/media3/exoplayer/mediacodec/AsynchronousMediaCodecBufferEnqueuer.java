package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.scannerview.CameraOperator;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class AsynchronousMediaCodecBufferEnqueuer implements MediaCodecBufferEnqueuer {
    public static final ArrayDeque MESSAGE_PARAMS_INSTANCE_POOL = new ArrayDeque();
    public static final Object QUEUE_SECURE_LOCK = new Object();
    public final MediaCodec codec;
    public final ConditionVariable conditionVariable;
    public CameraOperator.AnonymousClass2 handler;
    public final HandlerThread handlerThread;
    public final AtomicReference pendingRuntimeException;
    public boolean started;

    public final class MessageParams {
        public final MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        public int flags;
        public int index;
        public long presentationTimeUs;
        public int size;
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ConditionVariable conditionVariable = new ConditionVariable();
        this.codec = mediaCodec;
        this.handlerThread = handlerThread;
        this.conditionVariable = conditionVariable;
        this.pendingRuntimeException = new AtomicReference();
    }

    public static MessageParams getMessageParams() {
        ArrayDeque arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new MessageParams();
                }
                return (MessageParams) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void flush() {
        if (this.started) {
            try {
                CameraOperator.AnonymousClass2 anonymousClass2 = this.handler;
                anonymousClass2.getClass();
                anonymousClass2.removeCallbacksAndMessages(null);
                ConditionVariable conditionVariable = this.conditionVariable;
                synchronized (conditionVariable) {
                    conditionVariable.isOpen = false;
                }
                CameraOperator.AnonymousClass2 anonymousClass22 = this.handler;
                anonymousClass22.getClass();
                anonymousClass22.obtainMessage(3).sendToTarget();
                synchronized (conditionVariable) {
                    while (!conditionVariable.isOpen) {
                        conditionVariable.clock.getClass();
                        conditionVariable.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                OptionalProvider$$ExternalSyntheticLambda0.m(e);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void maybeThrowException() {
        RuntimeException runtimeException = (RuntimeException) this.pendingRuntimeException.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void queueInputBuffer(int i, int i2, int i3, long j) {
        maybeThrowException();
        MessageParams messageParams = getMessageParams();
        messageParams.index = i;
        messageParams.size = i2;
        messageParams.presentationTimeUs = j;
        messageParams.flags = i3;
        CameraOperator.AnonymousClass2 anonymousClass2 = this.handler;
        String str = Util.DEVICE_DEBUG_INFO;
        anonymousClass2.obtainMessage(1, messageParams).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void queueSecureInputBuffer(int i, CryptoInfo cryptoInfo, long j, int i2) {
        maybeThrowException();
        MessageParams messageParams = getMessageParams();
        messageParams.index = i;
        messageParams.size = 0;
        messageParams.presentationTimeUs = j;
        messageParams.flags = i2;
        MediaCodec.CryptoInfo cryptoInfo2 = messageParams.cryptoInfo;
        cryptoInfo2.numSubSamples = cryptoInfo.numSubSamples;
        int[] iArr = cryptoInfo.numBytesOfClearData;
        int[] iArr2 = cryptoInfo2.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo2.numBytesOfClearData = iArr2;
        int[] iArr3 = cryptoInfo.numBytesOfEncryptedData;
        int[] iArr4 = cryptoInfo2.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo2.numBytesOfEncryptedData = iArr4;
        byte[] bArr = cryptoInfo.key;
        byte[] bArr2 = cryptoInfo2.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo2.key = bArr2;
        byte[] bArr3 = cryptoInfo.iv;
        byte[] bArr4 = cryptoInfo2.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo2.iv = bArr4;
        cryptoInfo2.mode = cryptoInfo.mode;
        cryptoInfo2.setPattern(new MediaCodec.CryptoInfo.Pattern(cryptoInfo.encryptedBlocks, cryptoInfo.clearBlocks));
        CameraOperator.AnonymousClass2 anonymousClass2 = this.handler;
        String str = Util.DEVICE_DEBUG_INFO;
        anonymousClass2.obtainMessage(2, messageParams).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void setParameters(Bundle bundle) {
        maybeThrowException();
        CameraOperator.AnonymousClass2 anonymousClass2 = this.handler;
        String str = Util.DEVICE_DEBUG_INFO;
        anonymousClass2.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void shutdown() {
        if (this.started) {
            flush();
            this.handlerThread.quit();
        }
        this.started = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void start() {
        if (this.started) {
            return;
        }
        HandlerThread handlerThread = this.handlerThread;
        handlerThread.start();
        this.handler = new CameraOperator.AnonymousClass2(this, handlerThread.getLooper(), 3);
        this.started = true;
    }
}
