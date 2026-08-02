package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class xrq0 implements Iterator, xfx {
    public boolean a = true;
    public final /* synthetic */ Object b;

    public xrq0(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            this.a = false;
            return this.b;
        }
        ny61.p();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
