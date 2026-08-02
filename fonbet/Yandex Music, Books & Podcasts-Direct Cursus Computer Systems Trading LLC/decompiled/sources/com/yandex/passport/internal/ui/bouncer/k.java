package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.internal.ui.bouncer.model.i1;
import com.yandex.passport.internal.ui.bouncer.model.k1;
import com.yandex.passport.internal.ui.bouncer.model.l1;
import com.yandex.passport.internal.ui.bouncer.model.m1;
import com.yandex.passport.internal.ui.bouncer.model.o1;
import com.yandex.passport.internal.ui.bouncer.model.p1;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import com.yandex.passport.internal.ui.bouncer.model.u1;
import com.yandex.passport.internal.ui.bouncer.model.v1;
import defpackage.gld;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.ild;
import defpackage.oq5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ k(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        oq5 oq5Var;
        int i = this.a;
        l lVar = this.b;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) == 2) {
                    int i2 = l.i;
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.d.a(com.yandex.plus.pay.ui.core.b.z(lVar.c, hq5Var), lVar.b, ild.C(-2074710705, new k(lVar, 1), hq5Var), hq5Var, 384, 0);
            default:
                if ((intValue & 3) == 2) {
                    int i3 = l.i;
                    oq5 oq5Var3 = (oq5) hq5Var;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                l1 l1Var = (l1) lVar.g.getValue();
                if (l1Var == null) {
                    oq5Var = (oq5) hq5Var;
                    oq5Var.Z(1167794271);
                } else {
                    k1 k1Var = l1Var.b;
                    v1 v1Var = l1Var.a;
                    oq5Var = (oq5) hq5Var;
                    oq5Var.Z(1167794272);
                    lVar.e.w(l1Var);
                    if ((v1Var instanceof m1) || (v1Var instanceof s1) || (v1Var instanceof o1) || (v1Var instanceof r1) || (v1Var instanceof t1) || (v1Var instanceof u1) || (v1Var instanceof p1)) {
                        lVar.d.e(com.yandex.passport.internal.ui.bouncer.model.b.e(v1Var));
                    }
                    if (!Intrinsics.d(k1Var, i1.a)) {
                        oq5Var.Z(442617765);
                        boolean h = oq5Var.h(lVar) | oq5Var.h(l1Var);
                        Object K = oq5Var.K();
                        if (h || K == gq5.a) {
                            K = new com.yandex.passport.internal.storage.a(lVar, l1Var, null, 3);
                            oq5Var.k0(K);
                        }
                        gld.w(oq5Var, k1Var, (Function2) K);
                        oq5Var.p(false);
                        oq5Var.p(false);
                        break;
                    } else {
                        oq5Var.Z(440085003);
                        oq5Var.p(false);
                        q.c(lVar.f, v1Var, oq5Var, 0);
                    }
                }
                oq5Var.p(false);
                break;
        }
        return Unit.a;
    }
}
