package defpackage;

import android.widget.TextView;

/* loaded from: classes3.dex */
public final class wj {
    public final TextView a;
    public final kqa b;
    public jb c;
    public gzj d;
    public vj e;
    public boolean f;

    public wj(d89 d89Var, kqa kqaVar) {
        this.a = d89Var;
        this.b = kqaVar;
    }

    public final void a() {
        gzj gzjVar = this.d;
        if (gzjVar != null) {
            this.a.getViewTreeObserver().removeOnPreDrawListener(gzjVar);
        }
        this.d = null;
    }
}
