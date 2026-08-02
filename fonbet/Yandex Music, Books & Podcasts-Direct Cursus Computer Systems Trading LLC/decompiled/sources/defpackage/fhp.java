package defpackage;

import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class fhp implements Iterator, j9f {
    public boolean a = true;
    public final /* synthetic */ Pair b;

    public fhp(Pair pair) {
        this.b = pair;
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
        wvs.n();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
