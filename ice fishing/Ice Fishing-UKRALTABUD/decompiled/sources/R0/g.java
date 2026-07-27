package R0;

import K0.J;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public abstract class g extends J {

    /* renamed from: h, reason: collision with root package name */
    public final b f961h;

    public g(int i2, int i3, long j2, String str) {
        this.f961h = new b(i2, i3, j2, str);
    }

    @Override // K0.AbstractC0043t
    public final void c(v0.i iVar, Runnable runnable) {
        b bVar = this.f961h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f946m;
        bVar.b(runnable, k.f972g, false);
    }
}
