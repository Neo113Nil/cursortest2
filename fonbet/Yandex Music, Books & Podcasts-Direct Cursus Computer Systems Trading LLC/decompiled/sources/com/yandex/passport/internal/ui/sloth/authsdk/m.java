package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.gq5;
import defpackage.hq5;
import defpackage.ild;
import defpackage.oq5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ AuthSdkSlothComposeActivity c;

    public /* synthetic */ m(o oVar, AuthSdkSlothComposeActivity authSdkSlothComposeActivity, int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            default:
                com.yandex.passport.common.ui.a aVar = com.yandex.passport.common.ui.a.a;
                break;
        }
        this.b = oVar;
        this.c = authSdkSlothComposeActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        AuthSdkSlothComposeActivity authSdkSlothComposeActivity = this.c;
        o oVar = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.common.ui.a aVar = com.yandex.passport.common.ui.a.c;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = AuthSdkSlothComposeActivity.a;
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.d.a(com.yandex.plus.pay.ui.core.b.z(aVar, hq5Var), oVar.isWhiteLabel(), ild.C(-1236312741, new m(oVar, authSdkSlothComposeActivity, 1), hq5Var), hq5Var, 384, 0);
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = AuthSdkSlothComposeActivity.a;
                if ((intValue2 & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean h = oq5Var3.h(authSdkSlothComposeActivity);
                Object K = oq5Var3.K();
                if (h || K == gq5.a) {
                    K = new com.yandex.passport.internal.ui.bouncer.roundabout.k(8, authSdkSlothComposeActivity);
                    oq5Var3.k0(K);
                }
                com.yandex.plus.pay.ui.core.b.a(oVar, (Function1) K, oq5Var3, 0);
                break;
        }
        return Unit.a;
    }
}
