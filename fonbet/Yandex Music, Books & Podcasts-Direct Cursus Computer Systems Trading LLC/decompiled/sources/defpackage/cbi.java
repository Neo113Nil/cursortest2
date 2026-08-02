package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cbi extends uif implements Function2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ float C;
    public final /* synthetic */ wn5 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ wn5 F;
    public final /* synthetic */ long r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ zcq t;
    public final /* synthetic */ fk0 u;
    public final /* synthetic */ mm6 v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ yci x;
    public final /* synthetic */ float y;
    public final /* synthetic */ dup z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbi(long j, Function0 function0, zcq zcqVar, fk0 fk0Var, mm6 mm6Var, Function1 function1, yci yciVar, float f, dup dupVar, long j2, long j3, float f2, wn5 wn5Var, Function2 function2, wn5 wn5Var2) {
        super(2);
        this.r = j;
        this.s = function0;
        this.t = zcqVar;
        this.u = fk0Var;
        this.v = mm6Var;
        this.w = function1;
        this.x = yciVar;
        this.y = f;
        this.z = dupVar;
        this.A = j2;
        this.B = j3;
        this.C = f2;
        this.D = wn5Var;
        this.E = function2;
        this.F = wn5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        yci b = nfp.b(vnj.q(d.c(vci.a, 1.0f), new ag0(3, 12)), false, k9i.B);
        kfh d = ug3.d(b2c.b, false);
        oq5 oq5Var2 = (oq5) hq5Var;
        int i = oq5Var2.P;
        a l = oq5Var2.l();
        yci H = vnj.H(hq5Var, b);
        xp5.T.getClass();
        grb grbVar = wp5.b;
        oq5Var2.d0();
        if (oq5Var2.O) {
            oq5Var2.k(grbVar);
        } else {
            oq5Var2.n0();
        }
        g0g.U(hq5Var, d, wp5.f);
        g0g.U(hq5Var, l, wp5.e);
        kb5 kb5Var = wp5.g;
        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var2, i, kb5Var);
        }
        g0g.U(hq5Var, H, wp5.d);
        zcq zcqVar = this.t;
        boolean z = ((gdq) ((zx7) zcqVar.b.j).getValue()) != gdq.a;
        long j = this.r;
        Function0 function0 = this.s;
        sbi.c(j, function0, z, hq5Var, 0);
        sbi.b(this.u, this.v, function0, this.w, this.x, zcqVar, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, hq5Var, 70);
        oq5Var2.p(true);
        return Unit.a;
    }
}
