package defpackage;

import androidx.compose.ui.graphics.a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e1r extends uif implements pyc {
    public final /* synthetic */ g1r r;
    public final /* synthetic */ g1r s;
    public final /* synthetic */ ArrayList t;
    public final /* synthetic */ c4c u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1r(g1r g1rVar, g1r g1rVar2, ArrayList arrayList, c4c c4cVar, String str) {
        super(3);
        this.r = g1rVar;
        this.s = g1rVar2;
        this.t = arrayList;
        this.u = c4cVar;
        this.v = str;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fk0 fk0Var;
        Object ak1Var;
        Object obj4;
        Boolean bool;
        Function2 function2 = (Function2) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).h(function2) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            g1r g1rVar = this.s;
            Object obj5 = this.r;
            boolean d = Intrinsics.d(obj5, g1rVar);
            int i = d ? 150 : 75;
            int i2 = (!d || lag.a(this.t).size() == 1) ? 0 : 75;
            Object actVar = new act(i, i2, nya.d);
            boolean h = oq5Var.h(obj5);
            Object obj6 = this.u;
            boolean h2 = h | oq5Var.h(obj6);
            Object K = oq5Var.K();
            Object obj7 = gq5.a;
            if (h2 || K == obj7) {
                K = new j5n(12, obj5, obj6);
                oq5Var.k0(K);
            }
            Object obj8 = (Function0) K;
            Object K2 = oq5Var.K();
            if (K2 == obj7) {
                K2 = vq2.a(!d ? 1.0f : 0.0f);
                oq5Var.k0(K2);
            }
            fk0 fk0Var2 = (fk0) K2;
            Boolean valueOf = Boolean.valueOf(d);
            boolean h3 = oq5Var.h(fk0Var2) | oq5Var.g(d) | oq5Var.h(actVar) | oq5Var.f(obj8);
            Object K3 = oq5Var.K();
            if (h3 || K3 == obj7) {
                fk0Var = fk0Var2;
                obj4 = obj7;
                bool = valueOf;
                ak1Var = new ak1(9, fk0Var, actVar, obj8, null, d);
                oq5Var.k0(ak1Var);
            } else {
                fk0Var = fk0Var2;
                obj4 = obj7;
                ak1Var = K3;
                bool = valueOf;
            }
            gld.w(oq5Var, bool, (Function2) ak1Var);
            vm0 vm0Var = fk0Var.c;
            Object actVar2 = new act(i, i2, nya.a);
            Object K4 = oq5Var.K();
            if (K4 == obj4) {
                K4 = vq2.a(d ? 0.8f : 1.0f);
                oq5Var.k0(K4);
            }
            fk0 fk0Var3 = (fk0) K4;
            Boolean valueOf2 = Boolean.valueOf(d);
            boolean h4 = oq5Var.h(fk0Var3) | oq5Var.g(d) | oq5Var.h(actVar2);
            Object K5 = oq5Var.K();
            if (h4 || K5 == obj4) {
                Object cg1Var = new cg1(fk0Var3, d, actVar2, (Continuation) null, 21);
                oq5Var.k0(cg1Var);
                K5 = cg1Var;
            }
            gld.w(oq5Var, valueOf2, (Function2) K5);
            vm0 vm0Var2 = fk0Var3.c;
            yci b = a.b(vci.a, ((Number) vm0Var2.b.getValue()).floatValue(), ((Number) vm0Var2.b.getValue()).floatValue(), ((Number) vm0Var.b.getValue()).floatValue(), 0.0f, 0.0f, null, false, 131064);
            boolean g = oq5Var.g(d);
            Object obj9 = this.v;
            boolean f = g | oq5Var.f(obj9) | oq5Var.h(obj5);
            Object K6 = oq5Var.K();
            if (f || K6 == obj4) {
                K6 = new xbi(d, obj9, obj5, 3);
                oq5Var.k0(K6);
            }
            yci b2 = nfp.b(b, false, (Function1) K6);
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
            xp5.T.getClass();
            Function0 function0 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(function0);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            function2.invoke(oq5Var, Integer.valueOf(intValue & 14));
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
