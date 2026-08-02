package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c8x extends rvf {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public c8x(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.rvf
    public final b8x S(j8x j8xVar) {
        return (b8x) this.d.getAndSet(j8xVar, b8x.d);
    }

    @Override // defpackage.rvf
    public final i8x T(j8x j8xVar) {
        return (i8x) this.c.getAndSet(j8xVar, i8x.c);
    }

    @Override // defpackage.rvf
    public final void U(i8x i8xVar, i8x i8xVar2) {
        this.b.lazySet(i8xVar, i8xVar2);
    }

    @Override // defpackage.rvf
    public final void V(i8x i8xVar, Thread thread) {
        this.a.lazySet(i8xVar, thread);
    }

    @Override // defpackage.rvf
    public final boolean W(j8x j8xVar, b8x b8xVar, b8x b8xVar2) {
        return swf.p0(this.d, j8xVar, b8xVar, b8xVar2);
    }

    @Override // defpackage.rvf
    public final boolean X(j8x j8xVar, Object obj, Object obj2) {
        return swf.p0(this.e, j8xVar, obj, obj2);
    }

    @Override // defpackage.rvf
    public final boolean Y(j8x j8xVar, i8x i8xVar, i8x i8xVar2) {
        return swf.p0(this.c, j8xVar, i8xVar, i8xVar2);
    }
}
