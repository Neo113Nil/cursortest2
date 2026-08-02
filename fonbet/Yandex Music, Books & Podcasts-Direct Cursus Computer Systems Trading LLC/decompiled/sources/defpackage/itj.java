package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.List;

/* loaded from: classes.dex */
public final class itj extends s17 {
    public static final itj d = new itj(0, 4, 1);

    @Override // defpackage.s17
    public final void a(n8n n8nVar, nw0 nw0Var, oxq oxqVar, m mVar) {
        mfi mfiVar = (mfi) n8nVar.j(2);
        mfi mfiVar2 = (mfi) n8nVar.j(3);
        tr5 tr5Var = (tr5) n8nVar.j(1);
        lfi lfiVar = (lfi) n8nVar.j(0);
        if (lfiVar == null && (lfiVar = tr5Var.m(mfiVar)) == null) {
            pq5.d("Could not resolve state for movable content");
            rj7.f();
            return;
        }
        fxq fxqVar = lfiVar.a;
        if (oxqVar.n > 0 || oxqVar.s(oxqVar.t + 1) != 1) {
            pq5.c("Check failed");
        }
        int i = oxqVar.t;
        int i2 = oxqVar.i;
        int i3 = oxqVar.j;
        oxqVar.a(1);
        oxqVar.P();
        oxqVar.d();
        oxq o = fxqVar.o();
        try {
            List N = avf.N(o, 2, oxqVar, false, true, true);
            o.e(true);
            oxqVar.j();
            oxqVar.i();
            oxqVar.t = i;
            oxqVar.i = i2;
            oxqVar.j = i3;
            ivf.w(oxqVar, N, mfiVar2.c);
        } catch (Throwable th) {
            o.e(false);
            throw th;
        }
    }
}
