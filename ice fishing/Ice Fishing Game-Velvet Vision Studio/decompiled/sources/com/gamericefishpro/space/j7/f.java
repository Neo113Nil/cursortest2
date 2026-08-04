package com.gamericefishpro.space.j7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f5.d0;
import com.gamericefishpro.space.f5.m;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.t0.n;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.v.k;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.gamericefishpro.space.di.d {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    @Override // com.gamericefishpro.space.di.d
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k composable = (k) obj;
                com.gamericefishpro.space.f5.k it = (com.gamericefishpro.space.f5.k) obj2;
                r rVar = (r) obj3;
                ((Number) obj4).intValue();
                d0 d0Var = (d0) this.i;
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(it, "it");
                Unit unit = Unit.a;
                rVar.a0(1690049713);
                com.gamericefishpro.space.w7.b bVar = (com.gamericefishpro.space.w7.b) this.e;
                boolean zH = rVar.h(bVar);
                Object objP = rVar.P();
                com.gamericefishpro.space.t0.f fVar = n.a;
                if (zH || objP == fVar) {
                    objP = new com.gamericefishpro.space.f7.e(bVar, null, 1);
                    rVar.k0(objP);
                }
                rVar.p(false);
                i.e(rVar, unit, (Function2) objP);
                rVar.a0(1690054783);
                boolean zH2 = rVar.h(d0Var);
                Object objP2 = rVar.P();
                if (zH2 || objP2 == fVar) {
                    objP2 = new m(d0Var, 11);
                    rVar.k0(objP2);
                }
                Function0 function0 = (Function0) objP2;
                rVar.p(false);
                rVar.a0(1690057664);
                boolean zH3 = rVar.h(d0Var);
                Object objP3 = rVar.P();
                if (zH3 || objP3 == fVar) {
                    objP3 = new m(d0Var, 12);
                    rVar.k0(objP3);
                }
                Function0 function1 = (Function0) objP3;
                rVar.p(false);
                rVar.a0(1690060444);
                boolean zH4 = rVar.h(d0Var);
                Object objP4 = rVar.P();
                if (zH4 || objP4 == fVar) {
                    objP4 = new m(d0Var, 13);
                    rVar.k0(objP4);
                }
                Function0 function2 = (Function0) objP4;
                rVar.p(false);
                rVar.a0(1690062968);
                boolean zH5 = rVar.h(d0Var);
                Object objP5 = rVar.P();
                if (zH5 || objP5 == fVar) {
                    objP5 = new m(d0Var, 14);
                    rVar.k0(objP5);
                }
                Function0 function3 = (Function0) objP5;
                rVar.p(false);
                rVar.a0(1690065566);
                boolean zH6 = rVar.h(d0Var);
                Object objP6 = rVar.P();
                if (zH6 || objP6 == fVar) {
                    objP6 = new m(d0Var, 15);
                    rVar.k0(objP6);
                }
                Function0 function4 = (Function0) objP6;
                rVar.p(false);
                rVar.a0(1690068251);
                boolean zH7 = rVar.h(d0Var);
                Object objP7 = rVar.P();
                if (zH7 || objP7 == fVar) {
                    objP7 = new m(d0Var, 16);
                    rVar.k0(objP7);
                }
                rVar.p(false);
                com.gamericefishpro.space.l7.c.a(function0, function1, function2, function3, function4, (Function0) objP7, null, rVar, 0);
                return unit;
            default:
                com.gamericefishpro.space.g0.i iVar = (com.gamericefishpro.space.g0.i) obj;
                int iIntValue = ((Number) obj2).intValue();
                r rVar2 = (r) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                Function1 function5 = (Function1) this.i;
                if ((iIntValue2 & 6) == 0) {
                    i = (rVar2.f(iVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= rVar2.d(iIntValue) ? 32 : 16;
                }
                if (rVar2.S(i & 1, (i & 147) != 146)) {
                    com.gamericefishpro.space.d7.d dVar = (com.gamericefishpro.space.d7.d) ((List) this.e).get(iIntValue);
                    rVar2.a0(-1728316682);
                    int i2 = dVar.a;
                    int i3 = i2 * PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
                    int i4 = (i2 * 3) + 90;
                    if (i4 > 180) {
                        i4 = 180;
                    }
                    int i5 = dVar.d;
                    boolean z = dVar.c;
                    String str = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4 / 60), Integer.valueOf(i4 % 60)}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    rVar2.a0(82812302);
                    boolean zF = rVar2.f(dVar) | rVar2.f(function5);
                    Object objP8 = rVar2.P();
                    if (zF || objP8 == n.a) {
                        objP8 = new com.gamericefishpro.space.r7.b(dVar, function5);
                        rVar2.k0(objP8);
                    }
                    rVar2.p(false);
                    com.gamericefishpro.space.a.a.a(i2, i5, z, i3, str, (Function0) objP8, rVar2, 0);
                    rVar2.p(false);
                } else {
                    rVar2.V();
                }
                return Unit.a;
        }
    }
}
