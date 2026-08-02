package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.j8;
import com.yandex.passport.internal.report.k8;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LogoutBottomSheetActivity b;
    public final /* synthetic */ n0 c;

    public /* synthetic */ f(LogoutBottomSheetActivity logoutBottomSheetActivity, n0 n0Var, int i) {
        this.a = i;
        this.b = logoutBottomSheetActivity;
        this.c = n0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        n0 n0Var = this.c;
        LogoutBottomSheetActivity logoutBottomSheetActivity = this.b;
        switch (i) {
            case 0:
                int i2 = LogoutBottomSheetActivity.k;
                ((com.yandex.passport.internal.report.reporters.i0) logoutBottomSheetActivity.j()).n(k8.d, new ff(n0Var.a));
                break;
            case 1:
                int i3 = LogoutBottomSheetActivity.k;
                logoutBottomSheetActivity.k().G(r0.c);
                com.yandex.passport.internal.report.reporters.h0 j = logoutBottomSheetActivity.j();
                com.yandex.passport.common.core.f fVar = n0Var.a;
                com.yandex.passport.common.core.f fVar2 = n0Var.b;
                List list = n0Var.f;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.yandex.passport.internal.entities.n) it.next()).a);
                }
                ((com.yandex.passport.internal.report.reporters.i0) j).v(fVar, fVar2, arrayList);
                break;
            case 2:
                int i4 = LogoutBottomSheetActivity.k;
                logoutBottomSheetActivity.k().G(r0.d);
                com.yandex.passport.internal.report.reporters.h0 j2 = logoutBottomSheetActivity.j();
                com.yandex.passport.common.core.f fVar3 = n0Var.a;
                com.yandex.passport.common.core.f fVar4 = n0Var.b;
                List list2 = n0Var.f;
                ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((com.yandex.passport.internal.entities.n) it2.next()).a);
                }
                ((com.yandex.passport.internal.report.reporters.i0) j2).u(fVar3, fVar4, arrayList2);
                break;
            default:
                int i5 = LogoutBottomSheetActivity.k;
                logoutBottomSheetActivity.k().G(r0.e);
                ((com.yandex.passport.internal.report.reporters.i0) logoutBottomSheetActivity.j()).n(j8.d, new ff(n0Var.a));
                break;
        }
        return Unit.a;
    }
}
