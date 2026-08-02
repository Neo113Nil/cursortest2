package app.cash.redwood.treehouse;

import app.cash.zipline.ZiplineService;
import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;

/* loaded from: classes3.dex */
public final class AppLifecycle$Companion$Adapter$GeneratedOutboundService implements OutboundService, ZiplineService {
    public final OutboundCallHandler callHandler;

    public AppLifecycle$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 2, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }
}
