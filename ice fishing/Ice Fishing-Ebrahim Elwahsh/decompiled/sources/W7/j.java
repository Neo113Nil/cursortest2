package W7;

import T7.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class j extends t {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3519x;

    public j(long j9, j jVar, int i) {
        super(j9, jVar, i);
        this.f3519x = new AtomicReferenceArray(i.f3518f);
    }

    @Override // T7.t
    public final int f() {
        return i.f3518f;
    }

    @Override // T7.t
    public final void g(int i, InterfaceC5138i interfaceC5138i) {
        this.f3519x.set(i, i.f3517e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f3166v + ", hashCode=" + hashCode() + ']';
    }
}
