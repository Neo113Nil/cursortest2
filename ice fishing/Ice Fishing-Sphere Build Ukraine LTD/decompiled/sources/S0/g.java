package S0;

import L0.J;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public abstract class g extends J {

    /* renamed from: g, reason: collision with root package name */
    public final b f972g;

    public g(int i2, int i3, long j2, String str) {
        this.f972g = new b(i2, i3, j2, str);
    }

    @Override // L0.AbstractC0061t
    public final void c(v0.i iVar, Runnable runnable) {
        b bVar = this.f972g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f957l;
        bVar.b(runnable, k.f983g, false);
    }
}
