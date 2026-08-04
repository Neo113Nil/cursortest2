package com.gamericefishpro.space.u8;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends com.gamericefishpro.space.p9.c implements com.gamericefishpro.space.t8.f, com.gamericefishpro.space.t8.g {
    public static final com.gamericefishpro.space.o9.b k = com.gamericefishpro.space.o9.c.a;
    public final Context d;
    public final Handler e;
    public final com.gamericefishpro.space.o9.b f = k;
    public final Set g;
    public final com.gamericefishpro.space.b8.k h;
    public com.gamericefishpro.space.p9.a i;
    public c0 j;

    public l0(Context context, com.gamericefishpro.space.f9.e eVar, com.gamericefishpro.space.b8.k kVar) {
        this.d = context;
        this.e = eVar;
        this.h = kVar;
        this.g = (Set) kVar.d;
    }

    @Override // com.gamericefishpro.space.p9.d
    public final void a(com.gamericefishpro.space.p9.g gVar) {
        this.e.post(new com.gamericefishpro.space.r9.l(5, this, gVar));
    }

    @Override // com.gamericefishpro.space.t8.f
    public final void onConnected(Bundle bundle) {
        this.i.B(this);
    }

    @Override // com.gamericefishpro.space.t8.g
    public final void onConnectionFailed(com.gamericefishpro.space.s8.b bVar) {
        this.j.b(bVar);
    }

    @Override // com.gamericefishpro.space.t8.f
    public final void onConnectionSuspended(int i) {
        c0 c0Var = this.j;
        a0 a0Var = (a0) c0Var.f.C.get(c0Var.b);
        if (a0Var != null) {
            if (a0Var.l) {
                a0Var.m(new com.gamericefishpro.space.s8.b(17, null, null));
            } else {
                a0Var.onConnectionSuspended(i);
            }
        }
    }
}
