package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes12.dex */
public final /* synthetic */ class sj5 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sj5(float f, m3u0 m3u0Var) {
        this.a = 2;
        this.c = m3u0Var;
        this.b = f;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        aa10 w;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        float f = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                i611 i611Var = (i611) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    f530 o = an91.o(c530.a, 0.0f, this.b, 0.0f, 0.0f, 13);
                    sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d = b.d(btsVar, o);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o2);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    qgy.b(i611Var.a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 0, 0, xya1.e(btsVar).g.b, null, btsVar, 805309440, 0, 11766);
                    btsVar.e0(15779647);
                    btsVar.t(false);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                tls tlsVar = (tls) obj4;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    f530 g = ljs0.g(ljs0.c(c530.a, 1.0f), f, 0.0f, 2);
                    z910 d2 = pi6.d(x4c.A, false);
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o3 = btsVar2.o();
                    f530 d3 = b.d(btsVar2, g);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar2);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, d2);
                    qje.W(btsVar2, d.e, o3);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d3);
                    boolean k = btsVar2.k(tlsVar);
                    Object Q = btsVar2.Q();
                    if (k || Q == did.a) {
                        Q = new fv9(2, tlsVar);
                        btsVar2.o0(Q);
                    }
                    iab1.a(null, null, null, null, null, null, (sls) Q, btsVar2, 0);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            default:
                k kVar = (k) obj;
                o l0 = ((x910) obj2).l0(((n8e) obj3).a);
                int b = m810.b((f - (l0.b / 2.0f)) * ((Number) ((m3u0) obj4).getValue()).floatValue());
                int i2 = b >= 0 ? b : 0;
                w = kVar.w(l0.a, l0.b + i2, kotlin.collections.b.f(), new l4p(l0, i2, 2));
                return w;
        }
    }

    public /* synthetic */ sj5(float f, Object obj, int i) {
        this.a = i;
        this.b = f;
        this.c = obj;
    }
}
