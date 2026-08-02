package defpackage;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class u2u implements Iterator, xfx {
    public final sus0 a;
    public final int b;
    public int c;
    public final int w;

    public u2u(sus0 sus0Var, int i, int i2) {
        this.a = sus0Var;
        this.b = i2;
        this.c = i;
        this.w = sus0Var.A;
        if (sus0Var.z) {
            uus0.h();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        sus0 sus0Var = this.a;
        int i = sus0Var.A;
        int i2 = this.w;
        if (i != i2) {
            uus0.h();
        }
        int i3 = this.c;
        this.c = uus0.a(i3, sus0Var.a) + i3;
        return new tus0(sus0Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
