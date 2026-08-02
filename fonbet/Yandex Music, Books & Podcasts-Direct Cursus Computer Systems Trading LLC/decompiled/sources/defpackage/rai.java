package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rai extends z5 implements b28 {
    public final Window i;
    public final boolean j;
    public final Function0 k;
    public final fk0 l;
    public final mm6 m;
    public final x6k n;
    public Object o;
    public boolean p;

    public rai(Context context, Window window, boolean z, Function0 function0, fk0 fk0Var, mm6 mm6Var) {
        super(context, null, 0, 6, null);
        this.i = window;
        this.j = z;
        this.k = function0;
        this.l = fk0Var;
        this.m = mm6Var;
        this.n = szf.g0(oo5.a);
    }

    @Override // defpackage.z5
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.p;
    }

    @Override // defpackage.b28
    public final Window getWindow() {
        return this.i;
    }

    @Override // defpackage.z5
    public final void j(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(576708319);
        if ((((oq5Var.h(this) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ((Function2) this.n.getValue()).invoke(oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new y5(this, i, 19);
        }
    }

    @Override // defpackage.z5, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (!this.j || (i = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.o == null) {
            Function0 function0 = this.k;
            this.o = i >= 34 ? qai.a(function0, this.l, this.m) : nai.a(function0);
        }
        nai.b(this, this.o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            nai.c(this, this.o);
        }
        this.o = null;
    }
}
