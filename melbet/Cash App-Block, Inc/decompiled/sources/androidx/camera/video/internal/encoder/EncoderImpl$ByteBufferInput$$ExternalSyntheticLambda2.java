package androidx.camera.video.internal.encoder;

import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.BufferProvider$State;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EncoderImpl.ByteBufferInput f$0;
    public final /* synthetic */ CallbackToFutureAdapter$Completer f$1;

    public /* synthetic */ EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda2(EncoderImpl.ByteBufferInput byteBufferInput, CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer, int i) {
        this.$r8$classId = i;
        this.f$0 = byteBufferInput;
        this.f$1 = callbackToFutureAdapter$Completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = this.f$1;
        final EncoderImpl.ByteBufferInput byteBufferInput = this.f$0;
        switch (i) {
            case 0:
                callbackToFutureAdapter$Completer.set(byteBufferInput.mBufferProviderState);
                break;
            default:
                EncoderImpl encoderImpl = byteBufferInput.this$0;
                BufferProvider$State bufferProvider$State = byteBufferInput.mBufferProviderState;
                if (bufferProvider$State != BufferProvider$State.ACTIVE) {
                    if (bufferProvider$State != BufferProvider$State.INACTIVE) {
                        callbackToFutureAdapter$Completer.setException(new IllegalStateException("Unknown state: " + byteBufferInput.mBufferProviderState));
                        break;
                    } else {
                        callbackToFutureAdapter$Completer.setException(new IllegalStateException("BufferProvider is not active."));
                        break;
                    }
                } else {
                    final ListenableFuture acquireInputBuffer = encoderImpl.acquireInputBuffer();
                    final int i2 = 1;
                    Futures.propagateTransform(true, acquireInputBuffer, callbackToFutureAdapter$Completer, zzabp.directExecutor());
                    final int i3 = 0;
                    callbackToFutureAdapter$Completer.addCancellationListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i3;
                            ListenableFuture listenableFuture = acquireInputBuffer;
                            EncoderImpl.ByteBufferInput byteBufferInput2 = byteBufferInput;
                            switch (i4) {
                                case 0:
                                    byteBufferInput2.getClass();
                                    if (!listenableFuture.cancel(true)) {
                                        TransactorKt.checkState(null, listenableFuture.isDone());
                                        try {
                                            ((EncoderImpl.AnonymousClass2) listenableFuture.get()).cancel();
                                            break;
                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                            StringUtilsKt.w(byteBufferInput2.this$0.mTag, "Unable to cancel the input buffer: " + e);
                                            return;
                                        }
                                    }
                                    break;
                                default:
                                    byteBufferInput2.mAcquisitionList.remove(listenableFuture);
                                    break;
                            }
                        }
                    }, zzabp.directExecutor());
                    byteBufferInput.mAcquisitionList.add(acquireInputBuffer);
                    acquireInputBuffer.addListener(new Runnable() { // from class: androidx.camera.video.internal.encoder.EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i2;
                            ListenableFuture listenableFuture = acquireInputBuffer;
                            EncoderImpl.ByteBufferInput byteBufferInput2 = byteBufferInput;
                            switch (i4) {
                                case 0:
                                    byteBufferInput2.getClass();
                                    if (!listenableFuture.cancel(true)) {
                                        TransactorKt.checkState(null, listenableFuture.isDone());
                                        try {
                                            ((EncoderImpl.AnonymousClass2) listenableFuture.get()).cancel();
                                            break;
                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                            StringUtilsKt.w(byteBufferInput2.this$0.mTag, "Unable to cancel the input buffer: " + e);
                                            return;
                                        }
                                    }
                                    break;
                                default:
                                    byteBufferInput2.mAcquisitionList.remove(listenableFuture);
                                    break;
                            }
                        }
                    }, encoderImpl.mEncoderExecutor);
                    break;
                }
        }
    }
}
