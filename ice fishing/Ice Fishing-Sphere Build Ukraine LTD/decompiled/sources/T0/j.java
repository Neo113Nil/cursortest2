package T0;

import Q0.v;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends v {

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceArray f1012i;

    public j(long j2, j jVar, int i2) {
        super(j2, jVar, i2);
        this.f1012i = new AtomicReferenceArray(i.f1011f);
    }

    @Override // Q0.v
    public final int f() {
        return i.f1011f;
    }

    @Override // Q0.v
    public final void g(int i2, v0.i iVar) {
        this.f1012i.set(i2, i.f1010e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f914g + ", hashCode=" + hashCode() + ']';
    }
}
