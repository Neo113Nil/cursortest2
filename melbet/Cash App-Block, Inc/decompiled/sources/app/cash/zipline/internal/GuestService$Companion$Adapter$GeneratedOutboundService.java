package app.cash.zipline.internal;

import app.cash.zipline.ZiplineService;
import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import app.cash.zipline.internal.bridge.SerializableZiplineServiceType;
import java.util.Set;

/* loaded from: classes3.dex */
public final class GuestService$Companion$Adapter$GeneratedOutboundService implements OutboundService, EndpointService, ZiplineService {
    public final OutboundCallHandler callHandler;

    public GuestService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
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

    @Override // app.cash.zipline.internal.EndpointService
    public final Set getServiceNames() {
        Object call = this.callHandler.call(this, 3, new Object[0]);
        call.getClass();
        return (Set) call;
    }

    @Override // app.cash.zipline.internal.EndpointService
    public final SerializableZiplineServiceType serviceType(String str) {
        return (SerializableZiplineServiceType) this.callHandler.call(this, 1, str);
    }
}
