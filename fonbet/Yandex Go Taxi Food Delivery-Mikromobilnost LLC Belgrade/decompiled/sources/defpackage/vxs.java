package defpackage;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class vxs implements Iterator, xfx {
    public Object a;
    public int b = -2;
    public final /* synthetic */ e2k c;

    public vxs(e2k e2kVar) {
        this.c = e2kVar;
    }

    public final void a() {
        int i = this.b;
        e2k e2kVar = this.c;
        Object invoke = i == -2 ? ((sls) e2kVar.c).invoke() : ((tls) e2kVar.b).invoke(this.a);
        this.a = invoke;
        this.b = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < 0) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b < 0) {
            a();
        }
        if (this.b == 0) {
            ny61.p();
            return null;
        }
        Object obj = this.a;
        this.b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
