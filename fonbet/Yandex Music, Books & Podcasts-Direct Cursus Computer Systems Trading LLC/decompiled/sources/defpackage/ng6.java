package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class ng6 implements pyc {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ng6(tm0 tm0Var, g4c[] g4cVarArr, float f) {
        this.c = tm0Var;
        this.d = g4cVarArr;
        this.b = f;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        cma cmaVar;
        int i = this.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        int i2 = 1;
        switch (i) {
            case 0:
                String str = (String) obj5;
                wn5 wn5Var = (wn5) obj4;
                c cVar = (c) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                int L = ((jx7) oq5Var2.j(es5.h)).L(cVar.d());
                float f = ug6.a;
                int i3 = ids.a(o5g.O(0, 1, oq5Var2), str, nu0.j(), 0, false, 0, ia6.b(L, 0, 13), 988).b.f;
                if (i3 > 2) {
                    i3 = 2;
                }
                int i4 = 3 - i3;
                yci q = a.q(d.b(vci.a, 1.0f), 0.0f, 0.0f, 4, 0.0f, 11);
                ta5 a = sa5.a(qx0.g, b2c.n, oq5Var2, 6);
                int i5 = oq5Var2.P;
                androidx.compose.runtime.internal.a l = oq5Var2.l();
                yci H = vnj.H(oq5Var2, q);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, a, wp5.f);
                g0g.U(oq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var2, i5, kb5Var);
                }
                g0g.U(oq5Var2, H, wp5.d);
                xv7.j(str, null, kg5.r(R.color.text_primary_night, oq5Var2), 0L, 0L, 5, 0L, 2, false, 2, 0, null, nu0.j(), oq5Var2, 0, 3120, 55034);
                if (Float.compare(w1g.p(nu0.j(), i3, oq5Var2, 0, 0) + (ug6.a * 2) + w1g.p(nu0.i(), 1, oq5Var2, 48, 0), this.b) <= 0) {
                    oq5Var2.Z(-693941880);
                    wn5Var.invoke(nu0.i(), new d85(kg5.r(R.color.text_secondary_night, oq5Var2)), Integer.valueOf(i4), oq5Var2, 0);
                } else {
                    oq5Var2.Z(-706142519);
                }
                oq5Var2.p(false);
                oq5Var2.p(true);
                return Unit.a;
            default:
                tm0 tm0Var = (tm0) obj5;
                g4c[] g4cVarArr = (g4c[]) obj4;
                yci yciVar = (yci) obj;
                ((Integer) obj3).getClass();
                yciVar.getClass();
                oq5 oq5Var3 = (oq5) ((hq5) obj2);
                oq5Var3.Z(-1795684713);
                float f2 = this.b;
                if (tm0Var == null) {
                    oq5Var3.Z(-1425566492);
                    oq5Var3.p(false);
                    cmaVar = null;
                } else {
                    oq5Var3.Z(-1425566491);
                    float f3 = ((cma) pk0.a(f2, tm0Var, "Fade width", oq5Var3, 384, 8).getValue()).a;
                    oq5Var3.p(false);
                    cmaVar = new cma(f3);
                }
                boolean h = oq5Var3.h(g4cVarArr) | oq5Var3.f(cmaVar) | oq5Var3.g(true) | oq5Var3.c(f2);
                Object K = oq5Var3.K();
                if (h || K == gq5.a) {
                    K = new po1(g4cVarArr, cmaVar, f2, i2);
                    oq5Var3.k0(K);
                }
                yci c = androidx.compose.ui.draw.a.c(yciVar, (Function1) K);
                oq5Var3.p(false);
                return c;
        }
    }

    public /* synthetic */ ng6(String str, float f, wn5 wn5Var) {
        this.c = str;
        this.b = f;
        this.d = wn5Var;
    }
}
