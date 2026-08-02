package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class uhh {
    public final Object a;
    public boolean b;
    public boolean c;
    public int d;

    public uhh(Object obj) {
        this.a = obj;
    }

    public void a() {
        boolean z = this.b;
        Object obj = this.a;
        if (z) {
            xq0.q(hrg.n(obj, "detach() called when detach() had already been called for: "));
        } else if (this.c) {
            xq0.q(hrg.n(obj, "detach() called when sendResult() had already been called for: "));
        } else {
            this.b = true;
        }
    }

    public final boolean b() {
        return this.b || this.c;
    }

    public abstract void c(Object obj);

    public final void d(List list) {
        if (this.c) {
            b6e.w(this.a, "sendResult() called when either sendResult() or sendError() had already been called for: ");
        } else {
            this.c = true;
            c(list);
        }
    }
}
