package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.yandex.passport.sloth.ui.dependencies.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class n31 implements tyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n31(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        switch (this.a) {
            case 0:
                v31 v31Var = (v31) this.b;
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                hq5 hq5Var = (hq5) obj4;
                if ((((Integer) obj5).intValue() & 1025) == 1024) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                ksw.p(48, hq5Var, d.d(vci.a, 1.0f), v31Var.a);
                return Unit.a;
            case 1:
                r61 r61Var = (r61) this.b;
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                hq5 hq5Var2 = (hq5) obj4;
                if ((((Integer) obj5).intValue() & 1025) == 1024) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                qld.j(48, 0, hq5Var2, d.d(a.o(vci.a, 16, 0.0f, 2), 1.0f), r61Var.a);
                return Unit.a;
            case 2:
                Object obj6 = (a8a) this.b;
                int intValue = ((Integer) obj).intValue();
                m7a m7aVar = (m7a) obj2;
                cma cmaVar = (cma) obj3;
                hq5 hq5Var3 = (hq5) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                m7aVar.getClass();
                int i2 = (intValue2 & 14) ^ 6;
                boolean z = (i2 > 4 && ((oq5) hq5Var3).d(intValue)) || (intValue2 & 6) == 4;
                oq5 oq5Var3 = (oq5) hq5Var3;
                boolean f = z | oq5Var3.f(m7aVar);
                Object K = oq5Var3.K();
                Object obj7 = gq5.a;
                if (f || K == obj7) {
                    obj6.getClass();
                    K = new q7a(m7aVar, new x0(obj6, intValue, m7aVar, 7));
                    oq5Var3.k0(K);
                }
                p7a p7aVar = (p7a) K;
                s7a s7aVar = (s7a) gld.O(p7aVar.getState(), oq5Var3).getValue();
                boolean h = oq5Var3.h(p7aVar);
                Object K2 = oq5Var3.K();
                if (h || K2 == obj7) {
                    Object ej6Var = new ej6(0, p7aVar, p7a.class, "onArtistClick", "onArtistClick()V", 0, 28);
                    oq5Var3.k0(ej6Var);
                    K2 = ej6Var;
                }
                h9f h9fVar = (h9f) K2;
                boolean h2 = oq5Var3.h(p7aVar);
                Object K3 = oq5Var3.K();
                if (h2 || K3 == obj7) {
                    Object ej6Var2 = new ej6(0, p7aVar, p7a.class, "onDonationClick", "onDonationClick()V", 0, 29);
                    oq5Var3.k0(ej6Var2);
                    K3 = ej6Var2;
                }
                h9f h9fVar2 = (h9f) K3;
                yci d = d.d(vci.a, 1.0f);
                boolean h3 = oq5Var3.h(obj6) | ((i2 > 4 && oq5Var3.d(intValue)) || (intValue2 & 6) == 4) | oq5Var3.h(m7aVar);
                Object K4 = oq5Var3.K();
                if (h3 || K4 == obj7) {
                    K4 = new z2(obj6, intValue, m7aVar, 26);
                    oq5Var3.k0(K4);
                }
                qld.i(s7aVar, cmaVar.a, (Function0) h9fVar2, com.yandex.music.core.ui.compose.a.b(d, null, 0L, 0.0f, null, (Function2) K4, 15), (Function0) h9fVar, oq5Var3, (intValue2 >> 3) & 112);
                return Unit.a;
            case 3:
                e8a e8aVar = (e8a) this.b;
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                hq5 hq5Var4 = (hq5) obj4;
                int intValue3 = ((Integer) obj5).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue3 & 1, (intValue3 & 1025) != 1024)) {
                    qld.j(0, 2, oq5Var4, null, e8aVar.a);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 4:
                m mVar = (m) this.b;
                eca ecaVar = (eca) obj;
                ecaVar.getClass();
                ((fba) obj2).getClass();
                ((lja) obj3).getClass();
                ((vga) obj4).getClass();
                ((yca) obj5).getClass();
                return ((xba) mVar.e).a(ecaVar.a(), ecaVar.b);
            default:
                ftu ftuVar = (ftu) this.b;
                sdr sdrVar = (sdr) obj;
                enj enjVar = (enj) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                hq5 hq5Var5 = (hq5) obj4;
                int intValue4 = ((Integer) obj5).intValue();
                sdrVar.getClass();
                if ((intValue4 & 6) == 0) {
                    i = (((oq5) hq5Var5).f(sdrVar) ? 4 : 2) | intValue4;
                } else {
                    i = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i |= ((oq5) hq5Var5).e(enjVar.a) ? 32 : 16;
                }
                if ((intValue4 & 384) == 0) {
                    i |= ((oq5) hq5Var5).g(booleanValue) ? 256 : 128;
                }
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(i & 1, (i & 1171) != 1170)) {
                    long j = enjVar.a;
                    l0v l0vVar = (l0v) ftuVar.B.getValue();
                    Object K5 = oq5Var5.K();
                    if (K5 == gq5.a) {
                        K5 = new dtu();
                        oq5Var5.k0(K5);
                    }
                    ezf.p(sdrVar, j, booleanValue, l0vVar, (m5v) K5, oq5Var5, i & 1022);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
        }
    }
}
