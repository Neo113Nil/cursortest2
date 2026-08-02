package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class duu implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ duu(euu euuVar, e9g e9gVar, boolean z, aqi aqiVar) {
        this.c = euuVar;
        this.d = e9gVar;
        this.b = z;
        this.e = aqiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        yci yciVar;
        boolean z;
        switch (this.a) {
            case 0:
                euu euuVar = (euu) this.c;
                e9g e9gVar = (e9g) this.d;
                aqi aqiVar = (aqi) this.e;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                fxf.o(euuVar.c, euuVar.d, (qmu) aqiVar.getValue(), d.m(vci.a, lsq.s(e9gVar)), this.b, hq5Var, 0);
            case 1:
                Function1 function1 = (Function1) this.c;
                Function2 function2 = (Function2) this.d;
                wn5 wn5Var = (wn5) this.e;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                vci vciVar = vci.a;
                if (function1 != null) {
                    if (!this.b) {
                        function1 = null;
                    }
                    if (function1 != null) {
                        yciVar = nfp.a(vciVar, function1);
                        break;
                    }
                }
                yciVar = vciVar;
                iz2 iz2Var = b2c.b;
                kfh d = ug3.d(iz2Var, false);
                oq5 oq5Var3 = (oq5) hq5Var2;
                int i = oq5Var3.P;
                a l = oq5Var3.l();
                yci H = vnj.H(hq5Var2, yciVar);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(hq5Var2, d, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(hq5Var2, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var3, i, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(hq5Var2, H, kb5Var4);
                if (function2 != null) {
                    oq5Var3.Z(-1893341434);
                    yci c = d.c(vciVar, 1.0f);
                    kfh d2 = ug3.d(iz2Var, false);
                    int i2 = oq5Var3.P;
                    a l2 = oq5Var3.l();
                    yci H2 = vnj.H(hq5Var2, c);
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(grbVar);
                    } else {
                        oq5Var3.n0();
                    }
                    g0g.U(hq5Var2, d2, kb5Var);
                    g0g.U(hq5Var2, l2, kb5Var2);
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var3, i2, kb5Var3);
                    }
                    g0g.U(hq5Var2, H2, kb5Var4);
                    wn5Var.invoke(hq5Var2, 6);
                    function2.invoke(hq5Var2, 0);
                    z = true;
                    oq5Var3.p(true);
                    oq5Var3.p(false);
                } else {
                    z = true;
                    oq5Var3.Z(-1893129580);
                    wn5Var.invoke(hq5Var2, 6);
                    oq5Var3.p(false);
                }
                oq5Var3.p(z);
                break;
            default:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                y7g.l(this.b, (Function0) this.c, (yci) this.d, (yci) this.e, (hq5) obj, R);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ duu(Function1 function1, boolean z, Function2 function2, wn5 wn5Var) {
        this.c = function1;
        this.b = z;
        this.d = function2;
        this.e = wn5Var;
    }

    public /* synthetic */ duu(boolean z, Function0 function0, yci yciVar, yci yciVar2, int i) {
        this.b = z;
        this.c = function0;
        this.d = yciVar;
        this.e = yciVar2;
    }
}
