package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class xmm implements Iterator, xfx {
    public final /* synthetic */ int a = 1;
    public final Iterator b;
    public int c;

    public xmm(ymm ymmVar) {
        this.b = ymmVar.a.iterator();
        this.c = ymmVar.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                break;
            default:
                return it.hasNext();
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                break;
            default:
                int i2 = this.c;
                this.c = i2 + 1;
                if (i2 >= 0) {
                    return new hrv(i2, it.next());
                }
                scc.m();
                throw null;
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.next();
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

    public xmm(i73 i73Var) {
        this.b = ((qrq0) i73Var.b).iterator();
    }
}
