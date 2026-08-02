package defpackage;

import androidx.compose.ui.layout.a;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class mbh implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ mbh(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object ibhVar;
        aqi aqiVar;
        switch (this.a) {
            case 0:
                ((Integer) obj3).getClass();
                ((yci) obj).getClass();
                oq5 oq5Var = (oq5) ((hq5) obj2);
                oq5Var.Z(982810710);
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = szf.g0(hbh.e);
                    oq5Var.k0(K);
                }
                aqi aqiVar2 = (aqi) K;
                oq5Var.Z(-411708558);
                hbh hbhVar = (hbh) aqiVar2.getValue();
                wje wjeVar = null;
                if (hbhVar.b != 0.0f && hbhVar.a > hbhVar.c) {
                    oq5Var.Z(-719071286);
                    wjeVar = fgq.s(fgq.D(null, oq5Var, 1), 0.0f, -hbhVar.b, weo.C(new act(hbhVar.d, 1000, nya.d), jyn.a, 0L, 4), null, oq5Var, 4152, 8);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-718521501);
                    oq5Var.p(false);
                }
                wje wjeVar2 = wjeVar;
                oq5Var.p(false);
                float f = this.b;
                boolean c = oq5Var.c(f);
                float f2 = this.c;
                boolean c2 = c | oq5Var.c(f2) | oq5Var.f(wjeVar2);
                Object K2 = oq5Var.K();
                if (c2 || K2 == kjnVar) {
                    aqiVar = aqiVar2;
                    ibhVar = new ibh(f, f2, aqiVar, wjeVar2, 0);
                    oq5Var.k0(ibhVar);
                } else {
                    ibhVar = K2;
                    aqiVar = aqiVar2;
                }
                vci vciVar = vci.a;
                yci b = a.b(vciVar, (pyc) ibhVar);
                boolean f3 = oq5Var.f(wjeVar2);
                Object K3 = oq5Var.K();
                if (f3 || K3 == kjnVar) {
                    K3 = new jbh(wjeVar2, aqiVar, 1);
                    oq5Var.k0(K3);
                }
                yci b2 = androidx.compose.ui.draw.a.b(vciVar, (Function1) K3);
                yci v = xp3.v(vciVar);
                Object K4 = oq5Var.K();
                if (K4 == kjnVar) {
                    K4 = new s2h(13);
                    oq5Var.k0(K4);
                }
                yci f4 = androidx.compose.ui.graphics.a.a(v, (Function1) K4).f(b2).f(b);
                oq5Var.p(false);
                return f4;
            case 1:
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                mfhVar.getClass();
                ffhVar.getClass();
                float f5 = this.b;
                int L = mfhVar.L(f5) * 2;
                float f6 = this.c;
                int L2 = mfhVar.L(f6) * 2;
                ksk M = ffhVar.M(ia6.i(((ga6) obj3).a, L, L2));
                return mfh.m0(mfhVar, M.a - L, M.b - L2, new gdi(M, mfhVar, f5, f6, 0));
            default:
                mfh mfhVar2 = (mfh) obj;
                ffh ffhVar2 = (ffh) obj2;
                mfhVar2.getClass();
                ffhVar2.getClass();
                float f7 = this.b;
                int L3 = mfhVar2.L(f7) * 2;
                float f8 = this.c;
                int L4 = mfhVar2.L(f8) * 2;
                ksk M2 = ffhVar2.M(ia6.i(((ga6) obj3).a, L3, L4));
                return mfh.m0(mfhVar2, M2.a - L3, M2.b - L4, new gdi(M2, mfhVar2, f7, f8, 1));
        }
    }
}
