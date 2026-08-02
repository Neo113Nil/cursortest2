package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.camera.view.PreviewView;
import androidx.media3.common.util.CircularIntArray;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class AsynchronousMediaCodecCallback extends MediaCodec.Callback {
    public final HandlerThread callbackThread;
    public MediaFormat currentFormat;
    public Handler handler;
    public IllegalStateException internalException;
    public MediaCodec.CryptoException mediaCodecCryptoException;
    public MediaCodec.CodecException mediaCodecException;
    public PreviewView.AnonymousClass1 onBufferAvailableListener;
    public long pendingFlushCount;
    public MediaFormat pendingOutputFormat;
    public boolean shutDown;
    public final Object lock = new Object();
    public final CircularIntArray availableInputBuffers = new CircularIntArray();
    public final CircularIntArray availableOutputBuffers = new CircularIntArray();
    public final ArrayDeque bufferInfos = new ArrayDeque();
    public final ArrayDeque formats = new ArrayDeque();

    public AsynchronousMediaCodecCallback(HandlerThread handlerThread) {
        this.callbackThread = handlerThread;
    }

    public final void flushInternal() {
        ArrayDeque arrayDeque = this.formats;
        if (!arrayDeque.isEmpty()) {
            this.pendingOutputFormat = (MediaFormat) arrayDeque.getLast();
        }
        CircularIntArray circularIntArray = this.availableInputBuffers;
        circularIntArray.tail = circularIntArray.head;
        CircularIntArray circularIntArray2 = this.availableOutputBuffers;
        circularIntArray2.tail = circularIntArray2.head;
        this.bufferInfos.clear();
        arrayDeque.clear();
    }

    public final void maybeThrowException() {
        IllegalStateException illegalStateException = this.internalException;
        if (illegalStateException != null) {
            this.internalException = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.mediaCodecException;
        if (codecException != null) {
            this.mediaCodecException = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.mediaCodecCryptoException;
        if (cryptoException == null) {
            return;
        }
        this.mediaCodecCryptoException = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.lock) {
            this.mediaCodecCryptoException = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.lock) {
            this.mediaCodecException = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        ExoPlayerImplInternal.AnonymousClass1 anonymousClass1;
        synchronized (this.lock) {
            this.availableInputBuffers.addLast(i);
            PreviewView.AnonymousClass1 anonymousClass12 = this.onBufferAvailableListener;
            if (anonymousClass12 != null && (anonymousClass1 = ((MediaCodecRenderer) anonymousClass12.this$0).wakeupListener) != null) {
                anonymousClass1.onWakeup();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        ExoPlayerImplInternal.AnonymousClass1 anonymousClass1;
        synchronized (this.lock) {
            try {
                MediaFormat mediaFormat = this.pendingOutputFormat;
                if (mediaFormat != null) {
                    this.availableOutputBuffers.addLast(-2);
                    this.formats.add(mediaFormat);
                    this.pendingOutputFormat = null;
                }
                this.availableOutputBuffers.addLast(i);
                this.bufferInfos.add(bufferInfo);
                PreviewView.AnonymousClass1 anonymousClass12 = this.onBufferAvailableListener;
                if (anonymousClass12 != null && (anonymousClass1 = ((MediaCodecRenderer) anonymousClass12.this$0).wakeupListener) != null) {
                    anonymousClass1.onWakeup();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.lock) {
            this.availableOutputBuffers.addLast(-2);
            this.formats.add(mediaFormat);
            this.pendingOutputFormat = null;
        }
    }
}
