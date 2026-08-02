package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class alx extends w1g {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public alx(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.w1g
    public final zkx M(flx flxVar) {
        return (zkx) this.d.getAndSet(flxVar, zkx.d);
    }

    @Override // defpackage.w1g
    public final elx N(flx flxVar) {
        return (elx) this.c.getAndSet(flxVar, elx.c);
    }

    @Override // defpackage.w1g
    public final void O(elx elxVar, elx elxVar2) {
        this.b.lazySet(elxVar, elxVar2);
    }

    @Override // defpackage.w1g
    public final void P(elx elxVar, Thread thread) {
        this.a.lazySet(elxVar, thread);
    }

    @Override // defpackage.w1g
    public final boolean Q(flx flxVar, zkx zkxVar, zkx zkxVar2) {
        return y1g.g0(this.d, flxVar, zkxVar, zkxVar2);
    }

    @Override // defpackage.w1g
    public final boolean R(flx flxVar, Object obj, Object obj2) {
        return y1g.g0(this.e, flxVar, obj, obj2);
    }

    @Override // defpackage.w1g
    public final boolean S(flx flxVar, elx elxVar, elx elxVar2) {
        return y1g.g0(this.c, flxVar, elxVar, elxVar2);
    }
}
