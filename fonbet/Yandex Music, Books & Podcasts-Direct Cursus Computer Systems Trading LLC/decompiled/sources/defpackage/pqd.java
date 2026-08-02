package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class pqd implements Iterator, j9f {
    public final /* synthetic */ int a = 0;
    public final fxq b;
    public final int c;
    public int d;
    public int e;

    public pqd(fxq fxqVar, int i, int i2) {
        this.b = fxqVar;
        this.c = i2;
        this.d = i;
        this.e = fxqVar.h;
        if (fxqVar.g) {
            hxq.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.d < this.c;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                fxq fxqVar = this.b;
                int i = fxqVar.h;
                int i2 = this.e;
                if (i != i2) {
                    hxq.e();
                }
                int i3 = this.d;
                this.d = fxqVar.a[(i3 * 5) + 3] + i3;
                return new gxq(fxqVar, i3, i2);
            default:
                throw null;
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

    public pqd(fxq fxqVar, int i, qqd qqdVar, cb0 cb0Var) {
        this.b = fxqVar;
        this.c = i;
        this.d = fxqVar.h;
    }
}
