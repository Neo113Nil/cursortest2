package H1;

import A1.K;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public abstract class g extends K {

    /* renamed from: c, reason: collision with root package name */
    public final b f687c;

    public g(int i2, int i3, long j2, String str) {
        this.f687c = new b(i2, i3, j2, str);
    }

    @Override // A1.AbstractC0018t
    public final void j(l1.i iVar, Runnable runnable) {
        b bVar = this.f687c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f672h;
        bVar.b(runnable, k.f698g, false);
    }
}
