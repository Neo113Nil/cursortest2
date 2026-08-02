package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class j1f implements Iterator, j9f {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public final /* synthetic */ h6s d;

    public j1f(w55 w55Var) {
        this.d = w55Var;
        this.b = w55Var.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c * 400 < this.b) {
                }
                break;
            default:
                if (this.b < this.c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                int i = this.c;
                h1f h1fVar = new h1f(i * 400, this, (w55) this.d);
                this.c = i + 1;
                return h1fVar;
            default:
                int i2 = this.b;
                this.b = i2 + 1;
                return this.d.get(i2);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public j1f(int i, h6s h6sVar) {
        this.c = i;
        this.d = h6sVar;
    }
}
