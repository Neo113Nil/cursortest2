package defpackage;

import java.util.Enumeration;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class ucc implements Iterator, xfx {
    public final /* synthetic */ Enumeration a;

    public ucc(Enumeration enumeration) {
        this.a = enumeration;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasMoreElements();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.nextElement();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
