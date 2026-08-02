package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class gqq implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ k2s d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ mm6 f;
    public final /* synthetic */ fvf g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Function0 i;

    public /* synthetic */ gqq(Function0 function0, boolean z, k2s k2sVar, Function1 function1, mm6 mm6Var, fvf fvfVar, String str, Function0 function02, int i) {
        this.a = i;
        this.b = function0;
        this.c = z;
        this.d = k2sVar;
        this.e = function1;
        this.f = mm6Var;
        this.g = fvfVar;
        this.h = str;
        this.i = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        oq5 oq5Var;
        Unit unit;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    etn.l(t2b.a.a(null), ild.C(2052353342, new gqq(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, 1), oq5Var2), oq5Var2, 56);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ozm ozmVar = eq0.a;
                    long j = ((dq0) oq5Var3.j(ozmVar)).c.a;
                    jzk jzkVar = vnj.i;
                    vci vciVar = vci.a;
                    yci b = a.b(vciVar, j, jzkVar);
                    kfh d = ug3.d(b2c.b, true);
                    int i = oq5Var3.P;
                    androidx.compose.runtime.internal.a l = oq5Var3.l();
                    yci H = vnj.H(oq5Var3, b);
                    xp5.T.getClass();
                    Function0 function0 = wp5.b;
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(function0);
                    } else {
                        oq5Var3.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var3, d, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var3, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var3, i, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var3, H, kb5Var4);
                    float f = 4;
                    yci q = androidx.compose.foundation.layout.a.q(d.e(d.d(gut.p1(vciVar), 1.0f), 56), f, 0.0f, f, 0.0f, 10);
                    nho a = lho.a(qx0.a, b2c.l, oq5Var3, 48);
                    int i2 = oq5Var3.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                    yci H2 = vnj.H(oq5Var3, q);
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(function0);
                    } else {
                        oq5Var3.n0();
                    }
                    g0g.U(oq5Var3, a, kb5Var);
                    g0g.U(oq5Var3, l2, kb5Var2);
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var3, i2, kb5Var3);
                    }
                    g0g.U(oq5Var3, H2, kb5Var4);
                    zsd.g(this.b, null, 0, ((dq0) oq5Var3.j(ozmVar)).a.a, 0, oq5Var3, 0, 22);
                    oq5 oq5Var4 = oq5Var3;
                    boolean z = this.c;
                    if (z) {
                        oq5Var4.Z(-622285610);
                        k2s k2sVar = this.d;
                        j2s j2sVar = k2sVar.b;
                        Function1 function1 = this.e;
                        boolean f2 = oq5Var4.f(function1);
                        mm6 mm6Var = this.f;
                        boolean h = f2 | oq5Var4.h(mm6Var);
                        fvf fvfVar = this.g;
                        boolean f3 = oq5Var4.f(fvfVar) | h | oq5Var4.h(k2sVar);
                        Object K = oq5Var4.K();
                        if (f3 || K == gq5.a) {
                            K = new hjf(function1, mm6Var, fvfVar, k2sVar, 1);
                            oq5Var4.k0(K);
                        }
                        Function1 function12 = (Function1) K;
                        if (1.0f <= 0.0d) {
                            qme.a("invalid weight; must be greater than zero");
                        }
                        hdg.v(j2sVar, function12, new LayoutWeightElement(false, 1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE), false, oq5Var4, 0);
                        oq5Var4.p(false);
                        oq5Var = oq5Var4;
                    } else {
                        if (z) {
                            throw vz1.i(oq5Var4, 1503945964, false);
                        }
                        oq5Var4.Z(-621747140);
                        if (1.0f <= 0.0d) {
                            qme.a("invalid weight; must be greater than zero");
                        }
                        xcs.b(this.h, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(new LayoutWeightElement(true, 1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE), 20, 0.0f, 0.0f, 0.0f, 14), "skeleton_screen_title"), ((dq0) oq5Var4.j(ozmVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.g(), oq5Var4, 0, 3120, 55288);
                        oq5 oq5Var5 = oq5Var4;
                        oq5Var5.p(false);
                        oq5Var = oq5Var5;
                    }
                    Function0 function02 = this.i;
                    if (function02 == null) {
                        oq5Var.Z(-621080920);
                        oq5Var.p(false);
                        unit = null;
                    } else {
                        oq5Var.Z(-621080919);
                        a0g.o(0, 2, ((dq0) oq5Var.j(ozmVar)).a.a, oq5Var, null, function02);
                        oq5Var.p(false);
                        unit = Unit.a;
                    }
                    if (unit == null) {
                        oq5Var.Z(-620877869);
                        u1g.l(oq5Var, d.m(vciVar, 48));
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(1503985422);
                        oq5Var.p(false);
                    }
                    oq5Var.p(true);
                    oq5Var.p(true);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
        }
    }
}
