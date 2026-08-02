package app.cash.zipline.internal.bridge;

import kotlinx.coroutines.DeferredCoroutine;

/* loaded from: classes3.dex */
public final class InboundService$callSuspending$cancelCallback$1 implements CancelCallback, HasPassByReferenceName {
    public final /* synthetic */ DeferredCoroutine $deferred;
    public final /* synthetic */ InternalCall $internalCall;
    public String passByReferenceName;

    public InboundService$callSuspending$cancelCallback$1(DeferredCoroutine deferredCoroutine, InternalCall internalCall) {
        this.$deferred = deferredCoroutine;
        this.$internalCall = internalCall;
    }

    @Override // app.cash.zipline.internal.bridge.CancelCallback
    public final void cancel() {
        this.$deferred.cancel(ThrowablesKt.theOnlyCancellationException);
    }

    @Override // app.cash.zipline.internal.bridge.HasPassByReferenceName
    public final void setPassByReferenceName(String str) {
        this.passByReferenceName = str;
    }

    public final String toString() {
        return "CancelCallback/" + this.$internalCall;
    }
}
