package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class ty0 implements Iterator, j9f {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ty0(xy0 xy0Var, int i) {
        this(xy0Var.c);
        this.d = i;
        switch (i) {
            case 1:
                this.e = xy0Var;
                this(xy0Var.c);
                break;
            default:
                this.e = xy0Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f;
        if (!hasNext()) {
            wvs.n();
            return null;
        }
        int i = this.b;
        switch (this.d) {
            case 0:
                f = ((xy0) this.e).f(i);
                break;
            case 1:
                f = ((xy0) this.e).j(i);
                break;
            default:
                f = ((cz0) this.e).b[i];
                break;
        }
        this.b++;
        this.c = true;
        return f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            xq0.q("Call next() before removing an element.");
            return;
        }
        int i = this.b - 1;
        this.b = i;
        switch (this.d) {
            case 0:
                ((xy0) this.e).h(i);
                break;
            case 1:
                ((xy0) this.e).h(i);
                break;
            default:
                ((cz0) this.e).a(i);
                break;
        }
        this.a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ty0(cz0 cz0Var) {
        this(cz0Var.c);
        this.d = 2;
        this.e = cz0Var;
    }

    public ty0(int i) {
        this.a = i;
    }
}
