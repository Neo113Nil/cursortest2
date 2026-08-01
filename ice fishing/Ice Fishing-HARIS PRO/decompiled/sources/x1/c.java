package x1;

import L1.C0003d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v1.i;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final i f4760b;

    /* renamed from: c, reason: collision with root package name */
    public transient v1.d f4761c;

    public c(v1.d dVar, i iVar) {
        super(dVar);
        this.f4760b = iVar;
    }

    @Override // v1.d
    public i h() {
        i iVar = this.f4760b;
        D1.i.b(iVar);
        return iVar;
    }

    @Override // x1.a
    public void l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        v1.d dVar = this.f4761c;
        if (dVar != null && dVar != this) {
            v1.g e = h().e(v1.e.f4496a);
            D1.i.b(e);
            Q1.g gVar = (Q1.g) dVar;
            do {
                atomicReferenceFieldUpdater = Q1.g.f944h;
            } while (atomicReferenceFieldUpdater.get(gVar) == Q1.a.f936d);
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            C0003d c0003d = obj instanceof C0003d ? (C0003d) obj : null;
            if (c0003d != null) {
                c0003d.o();
            }
        }
        this.f4761c = b.f4759a;
    }

    public c(v1.d dVar) {
        this(dVar, dVar != null ? dVar.h() : null);
    }
}
