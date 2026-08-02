package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class yx0 implements Iterator {
    public int a;
    public int b;
    public int c = -1;
    public final /* synthetic */ ay0 d;

    public yx0(ay0 ay0Var) {
        this.d = ay0Var;
        this.a = ay0Var.b;
        this.b = ay0Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        int i2 = this.b;
        if (i == i2) {
            wvs.n();
            return null;
        }
        ay0 ay0Var = this.d;
        Object obj = ay0Var.a[i];
        if (ay0Var.c != i2 || obj == null) {
            xq0.i();
            return null;
        }
        this.c = i;
        this.a = (i + 1) & (r3.length - 1);
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.c;
        if (i < 0) {
            e7o.n();
            return;
        }
        ay0 ay0Var = this.d;
        if (ay0Var.n(i)) {
            this.a = (this.a - 1) & (ay0Var.a.length - 1);
            this.b = ay0Var.c;
        }
        this.c = -1;
    }
}
