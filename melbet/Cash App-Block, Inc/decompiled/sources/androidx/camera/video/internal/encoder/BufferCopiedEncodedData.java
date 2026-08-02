package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class BufferCopiedEncodedData implements EncodedData {
    public final MediaCodec.BufferInfo mBufferInfo;
    public final ByteBuffer mByteBuffer;
    public final CallbackToFutureAdapter$Completer mClosedCompleter;

    public BufferCopiedEncodedData(EncodedData encodedData) {
        MediaCodec.BufferInfo bufferInfo = encodedData.getBufferInfo();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        this.mBufferInfo = bufferInfo2;
        ByteBuffer byteBuffer = encodedData.getByteBuffer();
        MediaCodec.BufferInfo bufferInfo3 = encodedData.getBufferInfo();
        byteBuffer.position(bufferInfo3.offset);
        byteBuffer.limit(bufferInfo3.offset + bufferInfo3.size);
        ByteBuffer allocate = ByteBuffer.allocate(bufferInfo3.size);
        allocate.order(byteBuffer.order());
        allocate.put(byteBuffer);
        allocate.flip();
        this.mByteBuffer = allocate;
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
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = (CallbackToFutureAdapter$Completer) atomicReference.get();
        callbackToFutureAdapter$Completer2.getClass();
        this.mClosedCompleter = callbackToFutureAdapter$Completer2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.mClosedCompleter.set(null);
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final MediaCodec.BufferInfo getBufferInfo() {
        return this.mBufferInfo;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final ByteBuffer getByteBuffer() {
        return this.mByteBuffer;
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
