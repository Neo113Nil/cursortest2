package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.internal.ui.bouncer.model.n1;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.ild;
import defpackage.kjn;
import defpackage.oq5;
import defpackage.q0v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ n1 c;

    public /* synthetic */ g(h hVar, n1 n1Var, int i) {
        this.a = i;
        this.b = hVar;
        this.c = n1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.d.a(false, false, ild.C(-1602580842, new g(this.b, this.c, 1), hq5Var), hq5Var, 384, 3);
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                h hVar = this.b;
                a aVar = hVar.l;
                n1 n1Var = this.c;
                b build = aVar.setMasters(n1Var.b).setCreateMasterEnterPhoneNumberOption(n1Var.a).build();
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean h = oq5Var3.h(hVar);
                Object K = oq5Var3.K();
                kjn kjnVar = gq5.a;
                if (h || K == kjnVar) {
                    K = new com.yandex.passport.internal.common.e(14, hVar);
                    oq5Var3.k0(K);
                }
                Function0 function0 = (Function0) K;
                boolean h2 = oq5Var3.h(hVar);
                Object K2 = oq5Var3.K();
                if (h2 || K2 == kjnVar) {
                    K2 = new q0v(28, hVar);
                    oq5Var3.k0(K2);
                }
                com.yandex.plus.core.locale.b.a(build, function0, (Function1) K2, null, oq5Var3, 0, 8);
        }
        return Unit.a;
    }
}
