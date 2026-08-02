package defpackage;

import androidx.compose.runtime.f;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a;
import java.util.List;

/* loaded from: classes11.dex */
public final class qcx0 implements bms {
    public final /* synthetic */ List a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ qor c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ m3u0 x;
    public final /* synthetic */ yur y;
    public final /* synthetic */ lz40 z;

    public qcx0(List list, f530 f530Var, qor qorVar, tls tlsVar, m3u0 m3u0Var, yur yurVar, lz40 lz40Var) {
        this.a = list;
        this.b = f530Var;
        this.c = qorVar;
        this.w = tlsVar;
        this.x = m3u0Var;
        this.y = yurVar;
        this.z = lz40Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        u4y u4yVar = (u4y) obj;
        int intValue = ((Number) obj2).intValue();
        fid fidVar = (fid) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((bts) fidVar).k(u4yVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= fidVar.c(intValue) ? 32 : 16;
        }
        boolean z = true;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            rcx0 rcx0Var = (rcx0) this.a.get(intValue);
            btsVar.e0(-91761686);
            if ((((i & 112) ^ 48) <= 32 || !btsVar.c(intValue)) && (i & 48) != 32) {
                z = false;
            }
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new yx8(intValue, 2);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(c530.a, false, (tls) Q);
            f530 k = b.k(this.b);
            boolean z2 = rcx0Var instanceof krl;
            qor qorVar = this.c;
            if (z2) {
                btsVar.e0(-91596891);
                if (((krl) rcx0Var).b) {
                    btsVar.e0(-91538890);
                    Object Q2 = btsVar.Q();
                    if (Q2 == o430Var) {
                        Q2 = f.f(1.0f);
                        btsVar.o0(Q2);
                    }
                    qorVar = (tx40) Q2;
                    btsVar.t(false);
                } else {
                    btsVar.e0(-91460243);
                    btsVar.t(false);
                }
                uj91.b(b, qorVar, btsVar, 0, 0);
                btsVar.t(false);
            } else if (rcx0Var instanceof orl) {
                btsVar.e0(-91271174);
                orl orlVar = (orl) rcx0Var;
                yrl.c(an91.o(b, 0.0f, orlVar.b, 0.0f, orlVar.c, 5), qorVar, btsVar, 0, 2);
                btsVar.t(false);
            } else if (rcx0Var instanceof nrl) {
                btsVar.e0(-90943597);
                yrl.e(an91.m(b, ((nrl) rcx0Var).b, 0.0f, 2), qorVar, btsVar, 0, 2);
                btsVar.t(false);
            } else if (rcx0Var instanceof lrl) {
                btsVar.e0(-90681306);
                if (((lrl) rcx0Var).b) {
                    btsVar.e0(-90623274);
                    Object Q3 = btsVar.Q();
                    if (Q3 == o430Var) {
                        Q3 = f.f(1.0f);
                        btsVar.o0(Q3);
                    }
                    qorVar = (tx40) Q3;
                    btsVar.t(false);
                } else {
                    btsVar.e0(-90544627);
                    btsVar.t(false);
                }
                uj91.c(0, btsVar, qorVar, b);
                btsVar.t(false);
            } else if (rcx0Var instanceof mrl) {
                btsVar.e0(-90341360);
                wrl.a(((mrl) rcx0Var).b, ljs0.c(k, 1.0f), xya1.d(btsVar).h.b, AppColor$Palette.TextMinor, AppColor$Palette.BgMinor, btsVar, 0);
                btsVar = btsVar;
                btsVar.t(false);
            } else if (rcx0Var instanceof irl) {
                btsVar.e0(-90147455);
                qub1.a((irl) rcx0Var, k, btsVar, 0);
                btsVar.t(false);
            } else if (rcx0Var instanceof jrl) {
                btsVar.e0(-89963873);
                oeb1.c(btsVar, ljs0.e(k, ((jrl) rcx0Var).b));
                btsVar.t(false);
            } else {
                boolean z3 = rcx0Var instanceof amj0;
                tls tlsVar = this.w;
                if (z3) {
                    btsVar.e0(-89810578);
                    amj0 amj0Var = (amj0) rcx0Var;
                    Object Q4 = btsVar.Q();
                    if (Q4 == o430Var) {
                        Q4 = av0.M;
                        btsVar.o0(Q4);
                    }
                    zla1.c(amj0Var, k, yn91.g(tlsVar, (tls) Q4, btsVar, 48), btsVar, 0);
                    btsVar.t(false);
                } else if (rcx0Var instanceof sn40) {
                    btsVar.e0(-89437648);
                    sn40 sn40Var = (sn40) rcx0Var;
                    Object Q5 = btsVar.Q();
                    if (Q5 == o430Var) {
                        Q5 = av0.N;
                        btsVar.o0(Q5);
                    }
                    dqb1.e(sn40Var, k, yn91.g(tlsVar, (tls) Q5, btsVar, 48), btsVar, 0);
                    btsVar.t(false);
                } else if (rcx0Var instanceof sdu) {
                    btsVar.e0(-89045808);
                    sdu sduVar = (sdu) rcx0Var;
                    Object Q6 = btsVar.Q();
                    if (Q6 == o430Var) {
                        Q6 = av0.O;
                        btsVar.o0(Q6);
                    }
                    a.f(sduVar, null, this.x, this.y, yn91.g(tlsVar, (tls) Q6, btsVar, 48), btsVar, 0);
                    btsVar = btsVar;
                    btsVar.t(false);
                } else if (rcx0Var instanceof mdx0) {
                    btsVar.e0(-88613079);
                    mdx0 mdx0Var = (mdx0) rcx0Var;
                    Object Q7 = btsVar.Q();
                    if (Q7 == o430Var) {
                        Q7 = av0.P;
                        btsVar.o0(Q7);
                    }
                    okb1.a(mdx0Var, k, yn91.g(tlsVar, (tls) Q7, btsVar, 48), btsVar, 0);
                    btsVar.t(false);
                } else if (rcx0Var instanceof hz8) {
                    btsVar.e0(-88243187);
                    hz8 hz8Var = (hz8) rcx0Var;
                    Object Q8 = btsVar.Q();
                    if (Q8 == o430Var) {
                        Q8 = av0.Q;
                        btsVar.o0(Q8);
                    }
                    com.yandex.go.summary.ui.compose.expanded.content.tariffcard.carousel.a.d(hz8Var, k, yn91.g(tlsVar, (tls) Q8, btsVar, 48), this.z, btsVar, 0);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-87864832);
                    btsVar.t(false);
                }
            }
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }
}
