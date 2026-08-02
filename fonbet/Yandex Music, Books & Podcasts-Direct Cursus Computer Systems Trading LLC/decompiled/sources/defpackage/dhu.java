package defpackage;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class dhu implements ViewTreeObserver.OnPreDrawListener {
    public boolean a;
    public final /* synthetic */ aln b;
    public final /* synthetic */ ViewTreeObserver c;
    public final /* synthetic */ zt3 d;

    public dhu(aln alnVar, ViewTreeObserver viewTreeObserver, zt3 zt3Var) {
        this.b = alnVar;
        this.c = viewTreeObserver;
        this.d = zt3Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        aln alnVar = this.b;
        lmq b = alnVar.b();
        if (b != null) {
            ViewTreeObserver viewTreeObserver = this.c;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                alnVar.a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.a) {
                this.a = true;
                r7o r7oVar = z7o.b;
                this.d.resumeWith(b);
            }
        }
        return true;
    }
}
