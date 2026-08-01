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
    public final ArrayList f41n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f42u = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f43v = new AtomicBoolean(false);

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f44w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f45x;

    public c(d dVar, ArrayList arrayList, B6.a aVar) {
        this.f45x = dVar;
        AtomicReference atomicReference = new AtomicReference();
        this.f44w = atomicReference;
        this.f41n = arrayList;
        atomicReference.set(aVar);
    }

    public final void b() {
        if (this.f43v.get()) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f42u;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                B6.a aVar = (B6.a) this.f44w.get();
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
        if (this.f43v.compareAndSet(false, true)) {
            ((AtomicBoolean) this.f45x.f50x).set(false);
            this.f44w.set(null);
        }
    }
}
