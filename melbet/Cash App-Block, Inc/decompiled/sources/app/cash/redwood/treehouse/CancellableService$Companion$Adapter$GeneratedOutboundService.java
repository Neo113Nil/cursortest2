package app.cash.redwood.treehouse;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;

/* loaded from: classes3.dex */
public final class CancellableService$Companion$Adapter$GeneratedOutboundService implements CancellableService, OutboundService {
    public final OutboundCallHandler callHandler;

    public CancellableService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.redwood.ui.Cancellable
    public final void cancel() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }
}
