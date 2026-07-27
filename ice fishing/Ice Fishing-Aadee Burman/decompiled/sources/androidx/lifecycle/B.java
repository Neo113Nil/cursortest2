package androidx.lifecycle;

import g1.C4523c;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: n, reason: collision with root package name */
    public final C4523c f5086n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5087u;

    /* renamed from: v, reason: collision with root package name */
    public int f5088v = -1;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C f5089w;

    public B(C c9, C4523c c4523c) {
        this.f5089w = c9;
        this.f5086n = c4523c;
    }

    public final void b(boolean z3) {
        if (z3 == this.f5087u) {
            return;
        }
        this.f5087u = z3;
        int i = z3 ? 1 : -1;
        C c9 = this.f5089w;
        int i6 = c9.f5093c;
        c9.f5093c = i + i6;
        if (!c9.f5094d) {
            c9.f5094d = true;
            while (true) {
                try {
                    int i9 = c9.f5093c;
                    if (i6 == i9) {
                        break;
                    } else {
                        i6 = i9;
                    }
                } finally {
                    c9.f5094d = false;
                }
            }
        }
        if (this.f5087u) {
            c9.c(this);
        }
    }

    public void c() {
    }

    public abstract boolean d();
}
