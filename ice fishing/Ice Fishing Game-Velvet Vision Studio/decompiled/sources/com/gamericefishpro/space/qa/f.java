package com.gamericefishpro.space.qa;

import com.gamericefishpro.space.sa.o;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.h9.h {
    public final o e;
    public final com.gamericefishpro.space.r9.h f;
    public final /* synthetic */ g g;

    public f(g gVar, com.gamericefishpro.space.r9.h hVar) {
        this.g = gVar;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.e = new o("OnRequestIntegrityTokenCallback");
        this.f = hVar;
    }
}
