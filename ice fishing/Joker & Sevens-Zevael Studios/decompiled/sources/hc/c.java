package hc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import yc.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class c extends a {
    private final fc.i _context;
    private transient fc.d intercepted;

    public c(fc.d dVar, fc.i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // fc.d
    public fc.i getContext() {
        fc.i iVar = this._context;
        pc.j.b(iVar);
        return iVar;
    }

    public final fc.d intercepted() {
        fc.d dVar = this.intercepted;
        if (dVar != null) {
            return dVar;
        }
        fc.f fVar = (fc.f) getContext().v(fc.e.f2347g);
        fc.d hVar = fVar != null ? new dd.h((u) fVar, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // hc.a
    public void releaseIntercepted() {
        fc.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            fc.g v10 = getContext().v(fc.e.f2347g);
            pc.j.b(v10);
            dd.h hVar = (dd.h) dVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dd.h.f1854n;
            while (atomicReferenceFieldUpdater.get(hVar) == dd.a.f1842d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            yc.g gVar = obj instanceof yc.g ? (yc.g) obj : null;
            if (gVar != null) {
                gVar.l();
            }
        }
        this.intercepted = b.f2871g;
    }

    public c(fc.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
