package a8;

import X7.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class j extends t {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4376x;

    public j(long j6, j jVar, int i) {
        super(j6, jVar, i);
        this.f4376x = new AtomicReferenceArray(i.f4375f);
    }

    @Override // X7.t
    public final int f() {
        return i.f4375f;
    }

    @Override // X7.t
    public final void g(int i, InterfaceC5245i interfaceC5245i) {
        this.f4376x.set(i, i.f4374e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f3815v + ", hashCode=" + hashCode() + ']';
    }
}
