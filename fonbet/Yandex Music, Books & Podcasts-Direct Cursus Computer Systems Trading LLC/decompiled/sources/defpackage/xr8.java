package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public abstract class xr8 extends opn {
    public final j1a u;
    public final e23 v;
    public final hp8 w;
    public final p0a x;
    public jc8 y;

    public xr8(j1a j1aVar, e23 e23Var, hp8 hp8Var, p0a p0aVar) {
        super(j1aVar);
        this.u = j1aVar;
        this.v = e23Var;
        this.w = hp8Var;
        this.x = p0aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r1 != null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(e23 e23Var, jc8 jc8Var, int i, pm9 pm9Var) {
        e23 bindingContext;
        xzb xzbVar;
        View a;
        gc8 gc8Var = e23Var.a;
        xzb xzbVar2 = e23Var.b;
        j1a j1aVar = this.u;
        ado currentRebindReusableList$div_release = gc8Var.getCurrentRebindReusableList$div_release();
        if (currentRebindReusableList$div_release != null && (a = currentRebindReusableList$div_release.a(jc8Var)) != null) {
            j1aVar.addView(a);
            this.y = jc8Var;
            return;
        }
        View child = this.u.getChild();
        Continuation continuation = null;
        if (child != null) {
            if (this.y == null) {
                child = null;
            }
            if (child != null) {
                f29 f29Var = child instanceof f29 ? (f29) child : null;
                if (f29Var == null || (bindingContext = f29Var.getBindingContext()) == null || (xzbVar = bindingContext.b) == null || !h1b.B(this.y, jc8Var, xzbVar, xzbVar2)) {
                    child = null;
                }
            }
        }
        if (this.y != null) {
            u();
        }
        j1a j1aVar2 = this.u;
        gc8 gc8Var2 = e23Var.a;
        synchronized (d51.l) {
        }
        if (qht.a.a()) {
            int i2 = 0;
            while (true) {
                if (!(i2 < j1aVar2.getChildCount())) {
                    j1aVar2.removeAllViews();
                    break;
                }
                int i3 = i2 + 1;
                View childAt = j1aVar2.getChildAt(i2);
                if (childAt == null) {
                    rj7.m();
                    return;
                } else {
                    yd5.R(gc8Var2.getReleaseViewVisitor$div_release(), childAt);
                    i2 = i3;
                }
            }
        } else {
            dq7 dq7Var = ca8.a;
            x97.D(j5h.a, new seg(continuation, j1aVar2, gc8Var2, 23));
        }
        child = this.x.W(jc8Var, e23Var.b);
        this.u.addView(child);
        this.y = jc8Var;
        gc8Var.getRuntimeStore$div_release().j(pm9Var, jc8Var, xzbVar2, this.v.b);
        this.w.b(e23Var, child, jc8Var, pm9Var);
        gc8Var.getRuntimeStore$div_release().g(jc8Var.d());
    }

    public abstract void u();
}
