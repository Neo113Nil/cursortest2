package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class vd4 implements Iterator, j9f {
    public abstract char a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
