package a8;

import X7.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class j extends t {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4408x;

    public j(long j6, j jVar, int i) {
        super(j6, jVar, i);
        this.f4408x = new AtomicReferenceArray(i.f4407f);
    }

    @Override // X7.t
    public final int f() {
        return i.f4407f;
    }

    @Override // X7.t
    public final void g(int i, InterfaceC5272i interfaceC5272i) {
        this.f4408x.set(i, i.f4406e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f3860v + ", hashCode=" + hashCode() + ']';
    }
}
