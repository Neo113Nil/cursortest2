package com.yandex.passport.internal.ui.bouncer.challenge;

import com.yandex.passport.internal.ui.challenge.c0;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.ild;
import defpackage.oq5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;
    public final /* synthetic */ e c;

    public /* synthetic */ d(c0 c0Var, e eVar, int i) {
        this.a = i;
        this.b = c0Var;
        this.c = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        e eVar = this.c;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.d.a(false, com.yandex.passport.internal.di.a.a().getProperties().x, ild.C(918384242, new d(this.b, eVar, 1), hq5Var), hq5Var, 384, 1);
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                com.yandex.passport.common.ui.progress.g C = com.yandex.plus.core.locale.b.C(eVar.k);
                oq5 oq5Var3 = (oq5) hq5Var2;
                Object K = oq5Var3.K();
                if (K == gq5.a) {
                    K = new com.yandex.passport.internal.storage.d(4);
                    oq5Var3.k0(K);
                }
                Function1 function1 = (Function1) K;
                com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
                com.yandex.passport.internal.ui.a.b(this.b, C, null, function1, oq5Var3, 3072, 4);
        }
        return Unit.a;
    }
}
