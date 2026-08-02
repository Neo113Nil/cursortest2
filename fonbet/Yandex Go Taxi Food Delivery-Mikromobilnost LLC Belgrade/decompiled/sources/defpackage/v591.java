package defpackage;

import java.util.Iterator;

/* loaded from: classes11.dex */
public final class v591 implements Iterator {
    public final /* synthetic */ Iterator a;

    public v591(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new a791((String) this.a.next());
    }
}
