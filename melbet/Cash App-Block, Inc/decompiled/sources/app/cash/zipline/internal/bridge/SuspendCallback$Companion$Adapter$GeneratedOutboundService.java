package app.cash.zipline.internal.bridge;

/* loaded from: classes3.dex */
public final class SuspendCallback$Companion$Adapter$GeneratedOutboundService implements SuspendCallback, OutboundService {
    public final OutboundCallHandler callHandler;

    public SuspendCallback$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 2, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.SuspendCallback
    public final void failure(Throwable th) {
        Object call = this.callHandler.call(this, 1, th);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // app.cash.zipline.internal.bridge.SuspendCallback
    public final void success(Object obj) {
        Object call = this.callHandler.call(this, 0, obj);
        call.getClass();
    }
}
