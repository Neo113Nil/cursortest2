package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class uk5 implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ xk5 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ xk5 f;

    public uk5(xk5 xk5Var, int i) {
        this.e = i;
        this.f = xk5Var;
        this.d = xk5Var;
        this.a = xk5Var.e;
        this.b = xk5Var.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        xk5 xk5Var = this.d;
        if (xk5Var.e != this.a) {
            xq0.i();
            return null;
        }
        if (!hasNext()) {
            wvs.n();
            return null;
        }
        int i = this.b;
        this.c = i;
        switch (this.e) {
            case 0:
                obj = this.f.k()[i];
                break;
            case 1:
                obj = new wk5(this.f, i);
                break;
            default:
                obj = this.f.l()[i];
                break;
        }
        int i2 = this.b + 1;
        if (i2 >= xk5Var.f) {
            i2 = -1;
        }
        this.b = i2;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        xk5 xk5Var = this.d;
        if (xk5Var.e != this.a) {
            xq0.i();
            return;
        }
        o2g.U("no calls to next() since the last call to remove()", this.c >= 0);
        this.a += 32;
        xk5Var.remove(xk5Var.k()[this.c]);
        this.b--;
        this.c = -1;
    }
}
