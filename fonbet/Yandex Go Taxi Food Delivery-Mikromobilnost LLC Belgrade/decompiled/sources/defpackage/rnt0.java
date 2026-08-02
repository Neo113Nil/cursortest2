package defpackage;

import java.util.Iterator;

/* loaded from: classes11.dex */
public final class rnt0 implements Iterator, xfx {
    public final /* synthetic */ int a;
    public int b;
    public final pnt0 c;

    public /* synthetic */ rnt0(pnt0 pnt0Var, int i) {
        this.a = i;
        this.c = pnt0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        pnt0 pnt0Var = this.c;
        switch (i) {
            case 0:
                if (pnt0Var.e() > this.b) {
                    break;
                }
                break;
            default:
                if (this.b < pnt0Var.e()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        pnt0 pnt0Var = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                this.b = i2 + 1;
                return pnt0Var.f(i2);
            default:
                int i3 = this.b;
                this.b = i3 + 1;
                return pnt0Var.f(i3);
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
}
