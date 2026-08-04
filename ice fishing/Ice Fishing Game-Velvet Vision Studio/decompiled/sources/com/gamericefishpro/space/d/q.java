package com.gamericefishpro.space.d;

import com.gamericefishpro.space.z4.u;
import com.gamericefishpro.space.z4.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements com.gamericefishpro.space.z4.s, AutoCloseable {
    public final /* synthetic */ n d;
    public final /* synthetic */ w e;

    public q(n nVar, r rVar, w wVar) {
        this.d = nVar;
        this.e = wVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e.f(this);
    }

    @Override // com.gamericefishpro.space.z4.s
    public final void j(u source, com.gamericefishpro.space.z4.o event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        com.gamericefishpro.space.z4.o oVar = com.gamericefishpro.space.z4.o.ON_START;
        n nVar = this.d;
        if (event == oVar) {
            nVar.g(true);
        } else if (event == com.gamericefishpro.space.z4.o.ON_STOP) {
            nVar.g(false);
        }
        if (event == com.gamericefishpro.space.z4.o.ON_DESTROY) {
            nVar.e();
            this.e.f(this);
        }
    }
}
