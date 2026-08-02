package A6;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class c implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f198n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f199u = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f200v = new AtomicBoolean(false);

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f201w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f202x;

    public c(d dVar, ArrayList arrayList, B6.a aVar) {
        this.f202x = dVar;
        AtomicReference atomicReference = new AtomicReference();
        this.f201w = atomicReference;
        this.f198n = arrayList;
        atomicReference.set(aVar);
    }

    public final void b() {
        if (this.f200v.get()) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f199u;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                B6.a aVar = (B6.a) this.f201w.get();
                Objects.requireNonNull(aVar);
                aVar.j();
            } catch (IOException e9) {
                atomicBoolean.set(false);
                throw e9;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f200v.compareAndSet(false, true)) {
            ((AtomicBoolean) this.f202x.f207x).set(false);
            this.f201w.set(null);
        }
    }
}
