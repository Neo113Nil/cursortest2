package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class mg6 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public /* synthetic */ mg6(int i, List list, float f, u6k u6kVar, u6k u6kVar2, u6k u6kVar3, u6k u6kVar4, vm0 vm0Var, u6k u6kVar5) {
        this.i = i;
        this.j = list;
        this.f = f;
        this.b = u6kVar;
        this.c = u6kVar2;
        this.d = u6kVar3;
        this.e = u6kVar4;
        this.g = vm0Var;
        this.h = u6kVar5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                leu.q((String) this.b, (List) this.j, (String) this.c, (String) this.d, (Function1) this.e, this.f, (yci) this.g, (hh6) this.h, (hq5) obj, rvf.R(this.i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                leu.t((String) this.b, (String) this.c, (String) this.d, (String) this.j, (Function1) this.e, this.f, (yci) this.g, (hh6) this.h, (hq5) obj, rvf.R(this.i | 1));
                break;
            default:
                List list = (List) this.j;
                u6k u6kVar = (u6k) this.b;
                u6k u6kVar2 = (u6k) this.c;
                u6k u6kVar3 = (u6k) this.d;
                u6k u6kVar4 = (u6k) this.e;
                sdr sdrVar = (sdr) this.g;
                u6k u6kVar5 = (u6k) this.h;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                Object K = oq5Var2.K();
                int i = this.i;
                Object obj3 = gq5.a;
                if (K == obj3) {
                    K = szf.g0(((ctv) list.get(i)).a());
                    oq5Var2.k0(K);
                }
                aqi aqiVar = (aqi) K;
                Integer valueOf = Integer.valueOf(u6kVar.h());
                boolean d = oq5Var2.d(i) | oq5Var2.f(list);
                Object K2 = oq5Var2.K();
                if (d || K2 == obj3) {
                    Object ocuVar = new ocu(i, list, u6kVar2, u6kVar, aqiVar, (Continuation) null);
                    oq5Var2.k0(ocuVar);
                    K2 = ocuVar;
                }
                gld.w(oq5Var2, valueOf, (Function2) K2);
                float d2 = qzv.d(i == u6kVar2.h() ? (i + 1) % 6 : i, u6kVar2.h(), u6kVar3.h());
                int i2 = i == u6kVar4.h() ? 0 : 600;
                ov6 ov6Var = lya.c;
                sdr b = pk0.b(d2, weo.S(i2, 0, ov6Var, 2), "outboarding artist scaling animation", null, oq5Var2, 3072, 20);
                float f = 0.0f;
                sdr b2 = pk0.b(i == u6kVar2.h() ? 0.0f : 1.0f, new act(300, i == u6kVar2.h() ? 300 : 0, ov6Var), "outboarding artist alpha animation", null, oq5Var2, 3072, 20);
                boolean c = oq5Var2.c(((Number) sdrVar.getValue()).floatValue());
                Object K3 = oq5Var2.K();
                float f2 = this.f;
                if (c || K3 == obj3) {
                    K3 = k5r.h(i == u6kVar4.h() ? (int) (((Number) sdrVar.getValue()).floatValue() * ((Number) b.getValue()).floatValue() * f2 * 0.6666667f) : 0, oq5Var2);
                }
                u6k u6kVar6 = (u6k) K3;
                sdr b3 = pk0.b(qzv.d(i == u6kVar2.h() ? (i + 2) % 6 : i == u6kVar4.h() ? i : i + 1, u6kVar2.h(), u6kVar3.h()), weo.S(600, 0, ov6Var, 2), "outboarding artist shape scaling animation", null, oq5Var2, 3072, 20);
                if (u6kVar5.h() != 0 && i == (u6kVar2.h() + 4) % 6) {
                    f = ((Number) b3.getValue()).floatValue() * f2 * 0.6666667f;
                }
                final vm0 q = ltg.q(f, 0.0f, weo.S(600, 0, ov6Var, 2), Integer.valueOf(u6kVar2.h()), oq5Var2, 48, 0);
                float f3 = qzv.a;
                final float floatValue = ((Number) b.getValue()).floatValue() * f3;
                final float floatValue2 = ((Number) b3.getValue()).floatValue() * f3;
                boolean f4 = oq5Var2.f(u6kVar6);
                Object K4 = oq5Var2.K();
                if (f4 || K4 == obj3) {
                    K4 = new aq(u6kVar6, 7);
                    oq5Var2.k0(K4);
                }
                vci vciVar = vci.a;
                yci u = xp3.u(a.i(vciVar, (Function1) K4), ugo.a);
                boolean f5 = oq5Var2.f(b2);
                Object K5 = oq5Var2.K();
                if (f5 || K5 == obj3) {
                    K5 = new nzv(b2, 0);
                    oq5Var2.k0(K5);
                }
                yci s = wyf.s(u, (Function0) K5);
                float f6 = (floatValue2 / 2) + qzv.b;
                boolean z = i == u6kVar4.h();
                boolean c2 = oq5Var2.c(floatValue) | oq5Var2.c(floatValue2) | oq5Var2.f(q);
                Object K6 = oq5Var2.K();
                if (c2 || K6 == obj3) {
                    K6 = new Function1() { // from class: ozv
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            jx7 jx7Var = (jx7) obj4;
                            jx7Var.getClass();
                            float f7 = floatValue;
                            float f8 = 2;
                            return new enj(swf.i(((Number) q.getValue()).floatValue() + jx7Var.n0((floatValue2 / f8) + (0.6666667f * f7)), jx7Var.n0(f7 / f8)));
                        }
                    };
                    oq5Var2.k0(K6);
                }
                yci w = xee.w(s, floatValue, f6, z, gar.a, (Function1) K6);
                if (((Boolean) oq5Var2.j(koe.a)).booleanValue()) {
                    oq5Var2.Z(1108573517);
                    List h = u75.h(new d85(c3x.h(4294198070L)), new d85(c3x.h(4294951175L)), new d85(c3x.h(4283215696L)), new d85(c3x.h(4280391411L)), new d85(c3x.h(4288423856L)), new d85(c3x.h(4278228616L)), new d85(c3x.h(4293467747L)), new d85(c3x.h(4294924066L)));
                    u1g.l(oq5Var2, androidx.compose.foundation.a.b(w, ((d85) h.get(i % h.size())).a, vnj.i));
                    oq5Var2.p(false);
                } else {
                    oq5Var2.Z(1108732330);
                    asq.s((String) aqiVar.getValue(), w, d.m(vciVar, floatValue), null, null, oq5Var2, 0);
                    oq5Var2.p(false);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mg6(String str, String str2, String str3, String str4, Function1 function1, float f, yci yciVar, hh6 hh6Var, int i) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.j = str4;
        this.e = function1;
        this.f = f;
        this.g = yciVar;
        this.h = hh6Var;
        this.i = i;
    }

    public /* synthetic */ mg6(String str, List list, String str2, String str3, Function1 function1, float f, yci yciVar, hh6 hh6Var, int i) {
        this.b = str;
        this.j = list;
        this.c = str2;
        this.d = str3;
        this.e = function1;
        this.f = f;
        this.g = yciVar;
        this.h = hh6Var;
        this.i = i;
    }
}
