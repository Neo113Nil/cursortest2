package app.cash.zipline;

import app.cash.zipline.internal.bridge.Endpoint;
import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import app.cash.zipline.internal.bridge.RealZiplineServiceType;
import app.cash.zipline.internal.bridge.ZiplineServiceAdapter;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class ZiplineScopedKt {
    public static final ZiplineService withScope(ZiplineService ziplineService, ZiplineScope ziplineScope) {
        ziplineScope.getClass();
        if (!(ziplineService instanceof OutboundService)) {
            a$$ExternalSyntheticBUOutline0.m("cannot scope ", ziplineService, "; it isn't an outbound service");
            return null;
        }
        OutboundCallHandler callHandler = ((OutboundService) ziplineService).getCallHandler();
        callHandler.getClass();
        RealZiplineServiceType realZiplineServiceType = callHandler.sourceType;
        String str = callHandler.serviceName;
        Endpoint endpoint = callHandler.endpoint;
        ZiplineServiceAdapter ziplineServiceAdapter = callHandler.adapter;
        return ziplineServiceAdapter.outboundService(new OutboundCallHandler(realZiplineServiceType, str, endpoint, ziplineServiceAdapter, ziplineScope, callHandler.serviceState));
    }
}
