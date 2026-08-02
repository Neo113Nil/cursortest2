package com.yandex.passport.internal.ui.challenge.vpn;

import defpackage.gq5;
import defpackage.hq5;
import defpackage.ild;
import defpackage.oq5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ VpnChallengeActivity c;

    public /* synthetic */ a(String str, VpnChallengeActivity vpnChallengeActivity, int i) {
        this.a = i;
        this.b = str;
        this.c = vpnChallengeActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                String str = this.b;
                VpnChallengeActivity vpnChallengeActivity = this.c;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean z = VpnChallengeActivity.a;
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.d.a(false, false, ild.C(-480385266, new a(str, vpnChallengeActivity, 1), hq5Var), hq5Var, 390, 2);
            default:
                String str2 = this.b;
                VpnChallengeActivity vpnChallengeActivity2 = this.c;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                boolean z2 = VpnChallengeActivity.a;
                if ((intValue2 & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean h = oq5Var3.h(vpnChallengeActivity2);
                Object K = oq5Var3.K();
                if (h || K == gq5.a) {
                    K = new com.yandex.passport.internal.ui.bouncer.roundabout.k(5, vpnChallengeActivity2);
                    oq5Var3.k0(K);
                }
                com.yandex.passport.internal.ui.a.l(str2, (Function1) K, oq5Var3, 0);
                break;
        }
        return Unit.a;
    }
}
