package R1;

import L1.F;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public abstract class g extends F {

    /* renamed from: c, reason: collision with root package name */
    public b f1038c;

    @Override // L1.AbstractC0015p
    public final void b(v1.i iVar, Runnable runnable) {
        b bVar = this.f1038c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1026h;
        bVar.b(runnable, k.f1048g, false);
    }
}
