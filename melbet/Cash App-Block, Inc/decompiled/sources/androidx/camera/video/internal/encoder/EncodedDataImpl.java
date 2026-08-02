package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class EncodedDataImpl implements EncodedData {
    public final int mBufferIndex;
    public final MediaCodec.BufferInfo mBufferInfo;
    public final ByteBuffer mByteBuffer;
    public final AtomicBoolean mClosed = new AtomicBoolean(false);
    public final CallbackToFutureAdapter$Completer mClosedCompleter;
    public final CallbackToFutureAdapter$SafeFuture mClosedFuture;
    public final MediaCodec mMediaCodec;

    public EncodedDataImpl(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.mMediaCodec = mediaCodec;
        this.mBufferIndex = i;
        this.mByteBuffer = mediaCodec.getOutputBuffer(i);
        this.mBufferInfo = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            atomicReference.set(callbackToFutureAdapter$Completer);
            callbackToFutureAdapter$Completer.tag = "Data closed";
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        this.mClosedFuture = callbackToFutureAdapter$SafeFuture;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = (CallbackToFutureAdapter$Completer) atomicReference.get();
        callbackToFutureAdapter$Completer2.getClass();
        this.mClosedCompleter = callbackToFutureAdapter$Completer2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = this.mClosedCompleter;
        if (this.mClosed.getAndSet(true)) {
            return;
        }
        try {
            this.mMediaCodec.releaseOutputBuffer(this.mBufferIndex, false);
            callbackToFutureAdapter$Completer.set(null);
        } catch (IllegalStateException e) {
            callbackToFutureAdapter$Completer.setException(e);
        }
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final MediaCodec.BufferInfo getBufferInfo() {
        return this.mBufferInfo;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final ByteBuffer getByteBuffer() {
        if (this.mClosed.get()) {
            a$$ExternalSyntheticBUOutline0.m$1("encoded data is closed.");
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = this.mBufferInfo;
        int i = bufferInfo.offset;
        ByteBuffer byteBuffer = this.mByteBuffer;
        byteBuffer.position(i);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final long getPresentationTimeUs() {
        return this.mBufferInfo.presentationTimeUs;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final boolean isKeyFrame() {
        return (this.mBufferInfo.flags & 1) != 0;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final long size() {
        return this.mBufferInfo.size;
    }
}
