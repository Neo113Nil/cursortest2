package com.yandex.passport.internal.ui.bouncer.sloth;

import com.yandex.passport.internal.push.w0;
import com.yandex.passport.sloth.ui.c1;
import com.yandex.passport.sloth.ui.t0;
import defpackage.aqi;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.ild;
import defpackage.o2g;
import defpackage.oq5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ t0 c;

    public /* synthetic */ e(f fVar, t0 t0Var, int i) {
        this.a = i;
        this.b = fVar;
        this.c = t0Var;
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
                f fVar = this.b;
                com.yandex.passport.common.ui.compose.theme.d.a(false, fVar.k, ild.C(-86547642, new e(fVar, this.c, 1), hq5Var), hq5Var, 384, 1);
            default:
                b bVar = this.b.l;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                t0 t0Var = this.c;
                boolean f = oq5Var3.f(t0Var) | oq5Var3.f(bVar);
                Object K = oq5Var3.K();
                Object obj3 = gq5.a;
                if (f || K == obj3) {
                    K = bVar.slothUiInteractor(t0Var.a).build();
                    oq5Var3.k0(K);
                }
                c cVar = (c) K;
                Object[] objArr = new Object[0];
                Object K2 = oq5Var3.K();
                if (K2 == obj3) {
                    K2 = new w0(10);
                    oq5Var3.k0(K2);
                }
                c1.b(cVar, (String) ((aqi) o2g.g0(objArr, null, (Function0) K2, oq5Var3, 0, 6)).getValue(), oq5Var3, 0, 0);
        }
        return Unit.a;
    }
}
