package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class yqv implements Iterator, xfx {
    public int a;
    public int b;
    public boolean c;

    public yqv(int i) {
        this.a = i;
    }

    public abstract Object a(int i);

    public abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        Object a = a(this.b);
        this.b++;
        this.c = true;
        return a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            xva1.c("Call next() before removing an element.");
            throw null;
        }
        int i = this.b - 1;
        this.b = i;
        b(i);
        this.a--;
        this.c = false;
    }
}
