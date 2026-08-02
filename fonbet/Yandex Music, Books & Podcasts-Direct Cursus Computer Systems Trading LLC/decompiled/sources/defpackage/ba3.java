package defpackage;

import android.content.Context;
import androidx.compose.foundation.lazy.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ba3 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ba3(int i, wn5 wn5Var, nb6 nb6Var, xsq xsqVar, zsq zsqVar, hvq hvqVar) {
        this.a = 2;
        this.c = xsqVar;
        this.d = nb6Var;
        this.e = wn5Var;
        this.f = zsqVar;
        this.b = i;
        this.g = hvqVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        bg5 bg5Var;
        switch (this.a) {
            case 0:
                k93 k93Var = (k93) this.c;
                gb3 gb3Var = (gb3) this.d;
                va3 va3Var = (va3) this.e;
                u0s u0sVar = (u0s) this.f;
                jab jabVar = (jab) this.g;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    thj v = qwp.v(k93Var.a);
                    te teVar = k93Var.a;
                    boolean z = gb3Var instanceof fb3;
                    boolean h = oq5Var.h(va3Var) | oq5Var.h(u0sVar) | oq5Var.h(jabVar) | oq5Var.h(v);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (h || K == kjnVar) {
                        i50 i50Var = new i50(va3Var, u0sVar, jabVar, v, 3);
                        oq5Var.k0(i50Var);
                        K = i50Var;
                    }
                    Function1 function1 = (Function1) K;
                    boolean h2 = oq5Var.h(va3Var) | oq5Var.h(jabVar) | oq5Var.h(v) | oq5Var.h(u0sVar);
                    Object K2 = oq5Var.K();
                    if (h2 || K2 == kjnVar) {
                        g93 g93Var = new g93(va3Var, jabVar, v, u0sVar, 1);
                        oq5Var.k0(g93Var);
                        K2 = g93Var;
                    }
                    y1g.g(teVar, this.b, z, function1, com.yandex.music.core.ui.compose.a.b(vci.a, null, 0L, 0.0f, null, (Function2) K2, 15), oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                j1b j1bVar = (j1b) this.c;
                Object obj4 = (List) this.d;
                lf5 lf5Var = (lf5) this.e;
                Function0 function0 = (Function0) this.f;
                oxn oxnVar = (oxn) this.g;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue2 & 17) == 16) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                po6 po6Var = j1bVar.c;
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean h3 = oq5Var3.h(j1bVar);
                int i = this.b;
                boolean d = h3 | oq5Var3.d(i) | oq5Var3.h(obj4);
                Object K3 = oq5Var3.K();
                Object obj5 = gq5.a;
                if (d || K3 == obj5) {
                    K3 = new v50(j1bVar, i, obj4, 15);
                    oq5Var3.k0(K3);
                }
                yci a = nfp.a(vci.a, (Function1) K3);
                mqs mqsVar = j1bVar.b;
                l2m l2mVar = new l2m(function0);
                oq5Var3.Z(1691121061);
                if (((Boolean) oq5Var3.j(koe.a)).booleanValue()) {
                    bg5Var = crm.a;
                    oq5Var3.p(false);
                } else {
                    Object K4 = oq5Var3.K();
                    if (K4 == obj5) {
                        K4 = tlm.f(gld.R(g.a, oq5Var3), oq5Var3);
                    }
                    mm6 mm6Var = ((fs5) K4).a;
                    Context context = (Context) oq5Var3.j(AndroidCompositionLocals_androidKt.b);
                    boolean f = oq5Var3.f(mqsVar) | oq5Var3.f(l2mVar) | oq5Var3.f(context) | oq5Var3.g(false);
                    Object K5 = oq5Var3.K();
                    if (f || K5 == obj5) {
                        lf5Var.getClass();
                        mqsVar.getClass();
                        context.getClass();
                        K5 = new fg5(lf5Var, mqsVar, false, mm6Var, context, l2mVar);
                        oq5Var3.k0(K5);
                    }
                    bg5Var = (bg5) K5;
                    oq5Var3.p(false);
                }
                ngg.c(po6Var, bg5Var, a, ild.C(585125313, new tik(4, oxnVar), oq5Var3), true, oq5Var3, 27648, 0);
            default:
                xsq xsqVar = (xsq) this.c;
                nb6 nb6Var = (nb6) this.d;
                wn5 wn5Var = (wn5) this.e;
                zsq zsqVar = (zsq) this.f;
                hvq hvqVar = (hvq) this.g;
                ua5 ua5Var = (ua5) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ua5Var.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var3).f(ua5Var) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                pcg.k(ua5Var, ((dsq) xsqVar).k, nb6Var, null, ild.C(184801506, new dv(xsqVar, this.b, hvqVar, 4), hq5Var3), hq5Var3, (intValue3 & 14) | 24576, 4);
                wn5Var.invoke(zsqVar, hq5Var3, 48);
        }
        return Unit.a;
    }

    public /* synthetic */ ba3(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }
}
