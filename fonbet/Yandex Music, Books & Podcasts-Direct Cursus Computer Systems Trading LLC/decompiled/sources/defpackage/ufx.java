package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class ufx extends uwf {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public ufx(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.uwf
    public final void O(fix fixVar, fix fixVar2) {
        this.b.lazySet(fixVar, fixVar2);
    }

    @Override // defpackage.uwf
    public final void P(fix fixVar, Thread thread) {
        this.a.lazySet(fixVar, thread);
    }

    @Override // defpackage.uwf
    public final boolean Q(tjx tjxVar, pex pexVar, pex pexVar2) {
        return p1g.R(this.d, tjxVar, pexVar, pexVar2);
    }

    @Override // defpackage.uwf
    public final boolean R(tjx tjxVar, Object obj, Object obj2) {
        return p1g.R(this.e, tjxVar, obj, obj2);
    }

    @Override // defpackage.uwf
    public final boolean S(tjx tjxVar, fix fixVar, fix fixVar2) {
        return p1g.R(this.c, tjxVar, fixVar, fixVar2);
    }
}
