package P7;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2602a;

    public a(h hVar) {
        this.f2602a = new AtomicReference(hVar);
    }

    @Override // P7.h
    public final Iterator iterator() {
        h hVar = (h) this.f2602a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
