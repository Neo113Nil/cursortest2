package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineService;
import java.lang.ref.PhantomReference;

/* loaded from: classes3.dex */
public final class ZiplineServiceReference extends PhantomReference {
    public final OutboundCallHandler callHandler;
    public final Endpoint endpoint;
    public final String serviceName;

    public ZiplineServiceReference(Endpoint endpoint, String str, OutboundCallHandler outboundCallHandler, ZiplineService ziplineService) {
        super(ziplineService, LeakCanaryJniKt.allReferencesQueue);
        this.endpoint = endpoint;
        this.serviceName = str;
        this.callHandler = outboundCallHandler;
    }
}
