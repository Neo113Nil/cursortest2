package com.gamericefishpro.space.g0;

import com.gamericefishpro.space.b2.e0;
import com.gamericefishpro.space.h0.p0;
import com.gamericefishpro.space.h0.t0;
import com.gamericefishpro.space.y.r0;
import com.gamericefishpro.space.z.v0;
import com.onesignal.core.activities.PermissionsActivity;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements p0 {
    public final /* synthetic */ v a;

    public x(v vVar) {
        this.a = vVar;
    }

    @Override // com.gamericefishpro.space.h0.p0
    public final int a() {
        v vVar = this.a;
        return (int) (vVar.g().q == v0.d ? vVar.g().g() & 4294967295L : vVar.g().g() >> 32);
    }

    @Override // com.gamericefishpro.space.h0.p0
    public final float b() {
        v vVar = this.a;
        return (vVar.d.b.g() * PermissionsActivity.DELAY_TIME_CALLBACK_CALL) + vVar.d.c.g();
    }

    @Override // com.gamericefishpro.space.h0.p0
    public final com.gamericefishpro.space.o2.c c() {
        return new com.gamericefishpro.space.o2.c(-1, -1);
    }

    @Override // com.gamericefishpro.space.h0.p0
    public final int d() {
        v vVar = this.a;
        return (-vVar.g().n) + vVar.g().r;
    }

    @Override // com.gamericefishpro.space.h0.p0
    public final Object e(int i, t0 t0Var) {
        com.gamericefishpro.space.u6.c cVar = v.w;
        v vVar = this.a;
        vVar.getClass();
        Object objD = vVar.d(r0.d, new e0(vVar, i, null, 4), t0Var);
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        if (objD != aVar) {
            objD = Unit.a;
        }
        return objD == aVar ? objD : Unit.a;
    }

    @Override // com.gamericefishpro.space.h0.p0
    public final float f() {
        v vVar = this.a;
        int iG = vVar.d.b.g();
        int iG2 = vVar.d.c.g();
        return vVar.c() ? (iG * PermissionsActivity.DELAY_TIME_CALLBACK_CALL) + iG2 + 100 : (iG * PermissionsActivity.DELAY_TIME_CALLBACK_CALL) + iG2;
    }
}
