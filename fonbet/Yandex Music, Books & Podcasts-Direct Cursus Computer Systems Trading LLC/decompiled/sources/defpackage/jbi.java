package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class jbi extends uif implements Function2 {
    public final /* synthetic */ Function2 r;
    public final /* synthetic */ fk0 s;
    public final /* synthetic */ wn5 t;
    public final /* synthetic */ zcq u;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ mm6 w;
    public final /* synthetic */ wn5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbi(Function2 function2, fk0 fk0Var, wn5 wn5Var, zcq zcqVar, Function0 function0, mm6 mm6Var, wn5 wn5Var2) {
        super(2);
        this.r = function2;
        this.s = fk0Var;
        this.t = wn5Var;
        this.u = zcqVar;
        this.v = function0;
        this.w = mm6Var;
        this.x = wn5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        wa5 wa5Var;
        Object a03Var;
        hq5 hq5Var = (hq5) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        vci vciVar = vci.a;
        yci a = sqv.a(d.d(vciVar, 1.0f), (opv) this.r.invoke(hq5Var, 0));
        oq5 oq5Var2 = (oq5) hq5Var;
        fk0 fk0Var = this.s;
        boolean h = oq5Var2.h(fk0Var);
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (h || K == kjnVar) {
            K = new ybg(8, fk0Var);
            oq5Var2.k0(K);
        }
        yci a2 = a.a(a, (Function1) K);
        ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
        int i = oq5Var2.P;
        androidx.compose.runtime.internal.a l = oq5Var2.l();
        yci H = vnj.H(oq5Var2, a2);
        xp5.T.getClass();
        grb grbVar = wp5.b;
        oq5Var2.d0();
        if (oq5Var2.O) {
            oq5Var2.k(grbVar);
        } else {
            oq5Var2.n0();
        }
        kb5 kb5Var = wp5.f;
        g0g.U(oq5Var2, a3, kb5Var);
        kb5 kb5Var2 = wp5.e;
        g0g.U(oq5Var2, l, kb5Var2);
        kb5 kb5Var3 = wp5.g;
        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var2, i, kb5Var3);
        }
        kb5 kb5Var4 = wp5.d;
        g0g.U(oq5Var2, H, kb5Var4);
        oq5Var2.Z(-1636564008);
        String y = wxf.y(R.string.m3c_bottom_sheet_collapse_description, oq5Var2);
        String y2 = wxf.y(R.string.m3c_bottom_sheet_dismiss_description, oq5Var2);
        String y3 = wxf.y(R.string.m3c_bottom_sheet_expand_description, oq5Var2);
        gz2 gz2Var = b2c.o;
        wa5 wa5Var2 = wa5.a;
        yci a4 = wa5Var2.a(vciVar, gz2Var);
        zcq zcqVar = this.u;
        boolean f = oq5Var2.f(zcqVar) | oq5Var2.f(y2);
        Function0 function0 = this.v;
        boolean f2 = f | oq5Var2.f(function0) | oq5Var2.f(y3);
        mm6 mm6Var = this.w;
        boolean h2 = f2 | oq5Var2.h(mm6Var) | oq5Var2.f(y);
        Object K2 = oq5Var2.K();
        if (h2 || K2 == kjnVar) {
            wa5Var = wa5Var2;
            a03Var = new a03(zcqVar, y2, y3, y, function0, mm6Var, 8);
            oq5Var2.k0(a03Var);
        } else {
            a03Var = K2;
            wa5Var = wa5Var2;
        }
        yci b = nfp.b(a4, true, (Function1) a03Var);
        kfh d = ug3.d(b2c.b, false);
        int i2 = oq5Var2.P;
        androidx.compose.runtime.internal.a l2 = oq5Var2.l();
        yci H2 = vnj.H(oq5Var2, b);
        oq5Var2.d0();
        if (oq5Var2.O) {
            oq5Var2.k(grbVar);
        } else {
            oq5Var2.n0();
        }
        g0g.U(oq5Var2, d, kb5Var);
        g0g.U(oq5Var2, l2, kb5Var2);
        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
            ouj.x(i2, oq5Var2, i2, kb5Var3);
        }
        g0g.U(oq5Var2, H2, kb5Var4);
        this.t.invoke(oq5Var2, 0);
        oq5Var2.p(true);
        oq5Var2.p(false);
        this.x.invoke(wa5Var, oq5Var2, 6);
        oq5Var2.p(true);
        return Unit.a;
    }
}
