package com.gamericefishpro.space.f;

import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.j5.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d {
    public final /* synthetic */ b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, y3 y3Var) {
        super(y3Var, false);
        this.f = bVar;
    }

    @Override // com.gamericefishpro.space.j5.d
    public final void a() {
        this.f.t();
    }

    @Override // com.gamericefishpro.space.j5.d
    public final void b() {
        this.f.u();
    }

    @Override // com.gamericefishpro.space.j5.d
    public final void c(com.gamericefishpro.space.j5.b bVar) {
        this.f.v(new com.gamericefishpro.space.d.a(bVar));
    }

    @Override // com.gamericefishpro.space.j5.d
    public final void d(com.gamericefishpro.space.j5.b navigationEvent) {
        Intrinsics.checkNotNullParameter(navigationEvent, "navigationEvent");
        float f = navigationEvent.c;
        this.f.w();
    }
}
