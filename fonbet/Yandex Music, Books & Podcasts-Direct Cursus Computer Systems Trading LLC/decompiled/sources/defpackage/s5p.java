package defpackage;

import android.os.Build;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class s5p implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6p b;

    public /* synthetic */ s5p(b6p b6pVar, int i) {
        this.a = i;
        this.b = b6pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    this.b.E(0, oq5Var);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                this.b.E(rvf.R(1), (hq5) obj);
                return Unit.a;
            case 2:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    this.b.F(0, oq5Var2);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                this.b.D(rvf.R(1), (hq5) obj);
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                this.b.A(rvf.R(1), (hq5) obj);
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                this.b.B(rvf.R(1), (hq5) obj);
                return Unit.a;
            case 6:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object K = oq5Var3.K();
                    Object obj3 = gq5.a;
                    if (K == obj3) {
                        K = new yoc();
                        oq5Var3.k0(K);
                    }
                    yoc yocVar = (yoc) K;
                    Object obj4 = (toc) oq5Var3.j(es5.i);
                    vci vciVar = vci.a;
                    Continuation continuation = null;
                    yci f = gut.p1(d.c(vciVar, 1.0f)).f(Build.VERSION.SDK_INT <= 27 ? a.k(vciVar, true, null) : vciVar);
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
                    int i = oq5Var3.P;
                    androidx.compose.runtime.internal.a l = oq5Var3.l();
                    yci H = vnj.H(oq5Var3, f);
                    xp5.T.getClass();
                    Function0 function0 = wp5.b;
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(function0);
                    } else {
                        oq5Var3.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var3, a, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var3, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var3, i, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var3, H, kb5Var4);
                    Unit unit = Unit.a;
                    b6p b6pVar = this.b;
                    boolean h = oq5Var3.h(b6pVar);
                    Object K2 = oq5Var3.K();
                    if (h || K2 == obj3) {
                        K2 = new d7i(b6pVar, continuation, 17);
                        oq5Var3.k0(K2);
                    }
                    gld.w(oq5Var3, unit, (Function2) K2);
                    xdr xdrVar = b6pVar.q;
                    boolean h2 = oq5Var3.h(b6pVar) | oq5Var3.h(obj4);
                    Object K3 = oq5Var3.K();
                    if (h2 || K3 == obj3) {
                        K3 = new v5p(b6pVar, obj4, continuation, 0);
                        oq5Var3.k0(K3);
                    }
                    gld.y(xdrVar, obj4, (Function2) K3, oq5Var3);
                    c0p c0pVar = b6pVar.o;
                    if (c0pVar == null) {
                        Intrinsics.j("argSearchContext");
                        throw null;
                    }
                    boolean h3 = oq5Var3.h(b6pVar);
                    Object K4 = oq5Var3.K();
                    if (h3 || K4 == obj3) {
                        K4 = new kun(b6pVar, continuation, 14);
                        oq5Var3.k0(K4);
                    }
                    aqi l0 = szf.l0(null, c0pVar, (Function2) K4, oq5Var3);
                    String str = (String) gld.M(b6pVar.K().o, oq5Var3).getValue();
                    boolean z2 = gld.M(b6pVar.K().q, oq5Var3).getValue() == m6p.a && b6pVar.n;
                    boolean h4 = oq5Var3.h(b6pVar);
                    Object K5 = oq5Var3.K();
                    if (h4 || K5 == obj3) {
                        K5 = new q5p(b6pVar, 1);
                        oq5Var3.k0(K5);
                    }
                    Function1 function1 = (Function1) K5;
                    wn5 C = ild.C(1756124659, new wd1(l0, 4), oq5Var3);
                    boolean h5 = oq5Var3.h(b6pVar);
                    Object K6 = oq5Var3.K();
                    if (h5 || K6 == obj3) {
                        K6 = new r5p(b6pVar, 0);
                        oq5Var3.k0(K6);
                    }
                    Function0 function02 = (Function0) K6;
                    boolean h6 = oq5Var3.h(b6pVar);
                    Object K7 = oq5Var3.K();
                    if (h6 || K7 == obj3) {
                        K7 = new r5p(b6pVar, 1);
                        oq5Var3.k0(K7);
                    }
                    Function0 function03 = (Function0) K7;
                    boolean h7 = oq5Var3.h(b6pVar);
                    Object K8 = oq5Var3.K();
                    if (h7 || K8 == obj3) {
                        K8 = new q5p(b6pVar, 2);
                        oq5Var3.k0(K8);
                    }
                    Function1 function12 = (Function1) K8;
                    boolean h8 = oq5Var3.h(b6pVar);
                    Object K9 = oq5Var3.K();
                    if (h8 || K9 == obj3) {
                        K9 = new r5p(b6pVar, 2);
                        oq5Var3.k0(K9);
                    }
                    Continuation continuation2 = null;
                    u1g.k(str, function1, C, z2, function02, function03, yocVar, function12, (Function0) K9, oq5Var3, 14156160);
                    xdr xdrVar2 = b6pVar.y.b;
                    boolean h9 = oq5Var3.h(b6pVar);
                    Object K10 = oq5Var3.K();
                    if (h9 || K10 == obj3) {
                        K10 = new u5p(b6pVar, continuation2, 1);
                        oq5Var3.k0(K10);
                    }
                    gld.w(oq5Var3, xdrVar2, (Function2) K10);
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
                    kfh d = ug3.d(b2c.b, false);
                    int i2 = oq5Var3.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                    yci H2 = vnj.H(oq5Var3, layoutWeightElement);
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(function0);
                    } else {
                        oq5Var3.n0();
                    }
                    g0g.U(oq5Var3, d, kb5Var);
                    g0g.U(oq5Var3, l2, kb5Var2);
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var3, i2, kb5Var3);
                    }
                    g0g.U(oq5Var3, H2, kb5Var4);
                    q5g.k(null, null, ((dq0) oq5Var3.j(eq0.a)).c.a, 0L, null, 0.0f, ild.C(-386650128, new s5p(b6pVar, 0), oq5Var3), oq5Var3, ScreenMirroringConfig.Video.BITRATE_1_5MB, 59);
                    if (((Boolean) gld.O(b6pVar.K().r, oq5Var3).getValue()).booleanValue()) {
                        oq5Var3.Z(-1238357343);
                        boolean h10 = oq5Var3.h(b6pVar);
                        Object K11 = oq5Var3.K();
                        if (h10 || K11 == obj3) {
                            K11 = new r5p(b6pVar, 3);
                            oq5Var3.k0(K11);
                        }
                        z = false;
                        doi.a((Function0) K11, b.a.a(vciVar, b2c.j), oq5Var3, 0, 0);
                    } else {
                        z = false;
                        oq5Var3.Z(-1252889554);
                    }
                    oq5Var3.p(z);
                    oq5Var3.p(true);
                    oq5Var3.p(true);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                this.b.F(rvf.R(1), (hq5) obj);
                return Unit.a;
        }
    }

    public /* synthetic */ s5p(b6p b6pVar, int i, int i2) {
        this.a = i2;
        this.b = b6pVar;
    }
}
