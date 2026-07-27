package J0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f461a;

    public a(e eVar) {
        this.f461a = new AtomicReference(eVar);
    }

    @Override // J0.b
    public final Iterator iterator() {
        b bVar = (b) this.f461a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
