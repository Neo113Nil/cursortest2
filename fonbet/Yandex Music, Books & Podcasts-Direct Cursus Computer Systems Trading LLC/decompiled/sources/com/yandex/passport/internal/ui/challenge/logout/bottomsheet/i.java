package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.b6e;
import defpackage.jyr;
import defpackage.lqr;
import defpackage.orq;
import defpackage.r13;
import defpackage.rjc;
import defpackage.srq;
import defpackage.vat;
import defpackage.wn5;
import defpackage.wyf;
import defpackage.x97;
import defpackage.zh;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ LogoutBottomSheetActivity b;

    public /* synthetic */ i(LogoutBottomSheetActivity logoutBottomSheetActivity, int i) {
        this.a = i;
        this.b = logoutBottomSheetActivity;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        LogoutBottomSheetActivity logoutBottomSheetActivity = this.b;
        switch (i) {
            case 0:
                m0 m0Var = (m0) obj;
                if (m0Var instanceof l0) {
                    l0 l0Var = (l0) m0Var;
                    com.yandex.passport.internal.properties.u uVar = l0Var.a;
                    com.yandex.passport.internal.ui.challenge.logout.d dVar = l0Var.b;
                    int i2 = LogoutBottomSheetActivity.k;
                    BottomSheetBehavior bottomSheetBehavior = ((com.yandex.passport.internal.ui.bouncer.roundabout.o) logoutBottomSheetActivity.d.getValue()).e;
                    bottomSheetBehavior.removeBottomSheetCallback((g) logoutBottomSheetActivity.f.getValue());
                    bottomSheetBehavior.setState(4);
                    zh zhVar = logoutBottomSheetActivity.h;
                    com.yandex.passport.internal.flags.i iVar = logoutBottomSheetActivity.a;
                    if (iVar == null) {
                        Intrinsics.j("flagRepository");
                        throw null;
                    }
                    Boolean bool = (Boolean) iVar.b(com.yandex.passport.internal.flags.o.T);
                    bool.getClass();
                    zhVar.a(new vat(uVar, dVar, bool));
                } else if (m0Var instanceof j0) {
                    com.yandex.passport.internal.properties.u uVar2 = ((j0) m0Var).a;
                    int i3 = LogoutBottomSheetActivity.k;
                    com.yandex.passport.internal.flags.i iVar2 = logoutBottomSheetActivity.a;
                    if (iVar2 == null) {
                        Intrinsics.j("flagRepository");
                        throw null;
                    }
                    (((Boolean) iVar2.b(com.yandex.passport.internal.flags.o.X)).booleanValue() ? logoutBottomSheetActivity.j : logoutBottomSheetActivity.i).a(new com.yandex.passport.internal.properties.r(uVar2.a, uVar2.e, uVar2.b, uVar2.f));
                } else if (m0Var instanceof k0) {
                    com.yandex.passport.internal.ui.a.q(logoutBottomSheetActivity, ((k0) m0Var).a);
                } else {
                    if (!Intrinsics.d(m0Var, i0.a)) {
                        b6e.s();
                        return null;
                    }
                    logoutBottomSheetActivity.setResult(4);
                    logoutBottomSheetActivity.finish();
                }
                return Unit.a;
            default:
                n0 n0Var = (n0) obj;
                if (n0Var == null) {
                    b6e.s();
                    return null;
                }
                int i4 = LogoutBottomSheetActivity.k;
                com.yandex.passport.internal.flags.i iVar3 = logoutBottomSheetActivity.a;
                if (iVar3 == null) {
                    Intrinsics.j("flagRepository");
                    throw null;
                }
                boolean booleanValue = ((Boolean) iVar3.b(com.yandex.passport.internal.flags.o.S)).booleanValue();
                jyr jyrVar = logoutBottomSheetActivity.e;
                int i5 = 2;
                if (booleanValue) {
                    orq orqVar = (orq) jyrVar.getValue();
                    com.yandex.passport.internal.ui.common.a aVar = orqVar instanceof com.yandex.passport.internal.ui.common.a ? (com.yandex.passport.internal.ui.common.a) orqVar : null;
                    if (aVar != null) {
                        aVar.k.setContent(new wn5(new lqr(new wn5(new com.yandex.passport.internal.ui.bouncer.p(6, logoutBottomSheetActivity, n0Var), 1548159984, true), 18), 344971532, true));
                    }
                } else {
                    srq srqVar = (orq) jyrVar.getValue();
                    r13 r13Var = srqVar instanceof r13 ? (r13) srqVar : null;
                    if (r13Var != null) {
                        r13Var.e(new g0(n0Var.a, n0Var.f, n0Var.c, n0Var.d, n0Var.e, new f(logoutBottomSheetActivity, n0Var, 0), new f(logoutBottomSheetActivity, n0Var, 1), new f(logoutBottomSheetActivity, n0Var, 2), new f(logoutBottomSheetActivity, n0Var, 3), new e(logoutBottomSheetActivity, 3)));
                    }
                }
                x97.y(wyf.F(logoutBottomSheetActivity.getLifecycle()), null, null, new j(logoutBottomSheetActivity, null, i5), 3);
                return Unit.a;
        }
    }
}
