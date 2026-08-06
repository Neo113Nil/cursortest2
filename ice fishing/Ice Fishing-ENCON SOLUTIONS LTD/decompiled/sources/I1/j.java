package I1;

import F1.u;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends u {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceArray f745e;

    public j(long j2, j jVar, int i2) {
        super(j2, jVar, i2);
        this.f745e = new AtomicReferenceArray(i.f744f);
    }

    @Override // F1.u
    public final int f() {
        return i.f744f;
    }

    @Override // F1.u
    public final void g(int i2, l1.i iVar) {
        this.f745e.set(i2, i.f743e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f631c + ", hashCode=" + hashCode() + ']';
    }
}
