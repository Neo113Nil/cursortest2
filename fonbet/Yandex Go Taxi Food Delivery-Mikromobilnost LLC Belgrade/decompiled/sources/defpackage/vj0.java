package defpackage;

import android.content.Context;
import android.graphics.Rect;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class vj0 extends r8 {
    public final oep0 A;
    public final xm00 B;
    public f4c0 C;
    public Pair D;
    public final Context c;
    public final yj0 w;
    public final yvf0 x;
    public final ze0 y;
    public final uqx z;

    public vj0(ah00 ah00Var, xm00 xm00Var, Context context, yj0 yj0Var, yvf0 yvf0Var, ze0 ze0Var, uqx uqxVar, oep0 oep0Var) {
        super(5, ah00Var);
        this.c = context;
        this.w = yj0Var;
        this.x = yvf0Var;
        this.y = ze0Var;
        this.z = uqxVar;
        this.A = oep0Var;
        this.B = xm00Var.p();
    }

    public final void Hg() {
        yj0 yj0Var = this.w;
        yj0Var.b = null;
        r0 r0Var = yj0Var.a;
        Rect rect = new Rect();
        r0Var.getClass();
        r0Var.m(null, rect);
        this.B.m();
        this.C = null;
        this.D = null;
    }
}
