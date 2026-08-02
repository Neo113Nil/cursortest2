package com.yandex.passport.internal.ui.router;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.hq5;
import defpackage.ild;
import defpackage.oq5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoginRouterActivity b;

    public /* synthetic */ r(LoginRouterActivity loginRouterActivity, int i) {
        this.a = i;
        this.b = loginRouterActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        LoginRouterActivity loginRouterActivity = this.b;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) == 2) {
                    int i2 = LoginRouterActivity.l;
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                com.yandex.passport.internal.properties.l lVar = loginRouterActivity.b;
                if (lVar == null) {
                    Intrinsics.j("loginProperties");
                    throw null;
                }
                boolean z = com.yandex.plus.pay.ui.core.b.z(com.yandex.plus.pay.ui.core.b.G(lVar.e), hq5Var);
                PassportProcessGlobalComponent passportProcessGlobalComponent = loginRouterActivity.f;
                if (passportProcessGlobalComponent != null) {
                    com.yandex.passport.common.ui.compose.theme.d.a(z, passportProcessGlobalComponent.getProperties().x, ild.C(1901417063, new r(loginRouterActivity, 1), hq5Var), hq5Var, 384, 0);
                    return Unit.a;
                }
                Intrinsics.j("component");
                throw null;
            default:
                if ((intValue & 3) == 2) {
                    int i3 = LoginRouterActivity.l;
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                com.yandex.passport.internal.properties.l lVar2 = loginRouterActivity.b;
                if (lVar2 == null) {
                    Intrinsics.j("loginProperties");
                    throw null;
                }
                com.yandex.passport.common.ui.progress.g C = com.yandex.plus.core.locale.b.C(lVar2.p.n);
                boolean booleanValue = ((Boolean) loginRouterActivity.k.getValue()).booleanValue();
                com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
                com.yandex.passport.internal.ui.a.f(C, booleanValue, hq5Var, 0);
                return Unit.a;
        }
    }
}
