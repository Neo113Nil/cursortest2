package y1;

import i1.p;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f8604a;

    public a(p pVar) {
        this.f8604a = new AtomicReference(pVar);
    }

    @Override // y1.c
    public final Iterator iterator() {
        c cVar = (c) this.f8604a.getAndSet(null);
        if (cVar != null) {
            return cVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
