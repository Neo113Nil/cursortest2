package gd;

import dd.u;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends u {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f2589e;

    public j(long j3, j jVar, int i10) {
        super(j3, jVar, i10);
        this.f2589e = new AtomicReferenceArray(i.f2588f);
    }

    @Override // dd.u
    public final int f() {
        return i.f2588f;
    }

    @Override // dd.u
    public final void g(int i10, fc.i iVar) {
        this.f2589e.set(i10, i.f2587e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1884c + ", hashCode=" + hashCode() + ']';
    }
}
