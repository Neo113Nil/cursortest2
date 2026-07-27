package S0;

import P0.v;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends v {

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceArray f1004j;

    public j(long j2, j jVar, int i2) {
        super(j2, jVar, i2);
        this.f1004j = new AtomicReferenceArray(i.f1003f);
    }

    @Override // P0.v
    public final int f() {
        return i.f1003f;
    }

    @Override // P0.v
    public final void g(int i2, v0.i iVar) {
        this.f1004j.set(i2, i.f1002e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f905h + ", hashCode=" + hashCode() + ']';
    }
}
