package com.gamericefishpro.space.t8;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends UnsupportedOperationException {
    public final com.gamericefishpro.space.s8.d d;

    public i(com.gamericefishpro.space.s8.d dVar) {
        this.d = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.d));
    }
}
