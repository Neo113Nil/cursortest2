package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineService;

/* loaded from: classes3.dex */
public final class InboundService {
    public final Endpoint endpoint;
    public final ZiplineService service;

    /* renamed from: type, reason: collision with root package name */
    public final RealZiplineServiceType f925type;

    public InboundService(RealZiplineServiceType realZiplineServiceType, ZiplineService ziplineService, Endpoint endpoint) {
        ziplineService.getClass();
        this.f925type = realZiplineServiceType;
        this.service = ziplineService;
        this.endpoint = endpoint;
    }

    public final ZiplineService getService$zipline_release() {
        return this.service;
    }

    public final String toString() {
        return this.service.toString();
    }
}
