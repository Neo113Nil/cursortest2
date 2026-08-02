package app.cash.zipline.internal.bridge;

/* loaded from: classes3.dex */
public final class CancelCallback$Companion$Adapter$GeneratedOutboundService implements CancelCallback, OutboundService {
    public final OutboundCallHandler callHandler;

    public CancelCallback$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.internal.bridge.CancelCallback
    public final void cancel() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }
}
