package com.gamericefishpro.space.f0;

import com.gamericefishpro.space.b2.e0;
import com.gamericefishpro.space.h0.p0;
import com.gamericefishpro.space.h0.t0;
import com.gamericefishpro.space.t0.d0;
import com.gamericefishpro.space.y.r0;
import com.gamericefishpro.space.z.v0;
import com.onesignal.core.activities.PermissionsActivity;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements p0 {
    public final d0 a;
    public final /* synthetic */ w b;

    public d(w wVar) {
        this.b = wVar;
        this.a = com.gamericefishpro.space.t0.i.p(new com.gamericefishpro.space.a3.b(5, wVar));
    }

    @Override // com.gamericefishpro.space.h0.p0
    public final int a() {
        w wVar = this.b;
        return (int) (wVar.g().o == v0.d ? wVar.g().g() & 4294967295L : wVar.g().g() >> 32);
    }

    @Override // com.gamericefishpro.space.h0.p0
    public final float b() {
        w wVar = this.b;
        return (wVar.e.b.g() * PermissionsActivity.DELAY_TIME_CALLBACK_CALL) + wVar.e.c.g();
    }

    @Override // com.gamericefishpro.space.h0.p0
    public final com.gamericefishpro.space.o2.c c() {
        return new com.gamericefishpro.space.o2.c(((Number) this.a.getValue()).intValue(), 1);
    }

    @Override // com.gamericefishpro.space.h0.p0
    public final int d() {
        w wVar = this.b;
        return (-wVar.g().l) + wVar.g().p;
    }

    @Override // com.gamericefishpro.space.h0.p0
    public final Object e(int i, t0 t0Var) {
        com.gamericefishpro.space.u6.c cVar = w.x;
        w wVar = this.b;
        wVar.getClass();
        Object objD = wVar.d(r0.d, new e0(wVar, i, null, 3), t0Var);
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        if (objD != aVar) {
            objD = Unit.a;
        }
        return objD == aVar ? objD : Unit.a;
    }

    @Override // com.gamericefishpro.space.h0.p0
    public final float f() {
        w wVar = this.b;
        int iG = wVar.e.b.g();
        int iG2 = wVar.e.c.g();
        return wVar.c() ? (iG * PermissionsActivity.DELAY_TIME_CALLBACK_CALL) + iG2 + 100 : (iG * PermissionsActivity.DELAY_TIME_CALLBACK_CALL) + iG2;
    }
}
