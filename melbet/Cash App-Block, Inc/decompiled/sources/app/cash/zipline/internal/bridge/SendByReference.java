package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineService;

/* loaded from: classes3.dex */
public final class SendByReference implements PassByReference {
    public final ZiplineServiceAdapter adapter;
    public final ZiplineService service;

    public SendByReference(ZiplineService ziplineService, ZiplineServiceAdapter ziplineServiceAdapter) {
        ziplineService.getClass();
        this.service = ziplineService;
        this.adapter = ziplineServiceAdapter;
    }
}
