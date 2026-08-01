package J1;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f354a;

    public a(d dVar) {
        this.f354a = new AtomicReference(dVar);
    }

    @Override // J1.f
    public final Iterator iterator() {
        f fVar = (f) this.f354a.getAndSet(null);
        if (fVar != null) {
            return fVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
