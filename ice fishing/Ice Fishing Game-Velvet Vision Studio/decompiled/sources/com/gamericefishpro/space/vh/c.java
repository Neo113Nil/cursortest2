package com.gamericefishpro.space.vh;

import com.gamericefishpro.space.pi.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {
    private final CoroutineContext _context;
    private transient com.gamericefishpro.space.th.a intercepted;

    public c(com.gamericefishpro.space.th.a aVar, CoroutineContext coroutineContext) {
        super(aVar);
        this._context = coroutineContext;
    }

    @Override // com.gamericefishpro.space.th.a
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.b(coroutineContext);
        return coroutineContext;
    }

    public final com.gamericefishpro.space.th.a intercepted() {
        com.gamericefishpro.space.th.a aVar = this.intercepted;
        if (aVar != null) {
            return aVar;
        }
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().j(kotlin.coroutines.d.x);
        com.gamericefishpro.space.th.a fVar = dVar != null ? new com.gamericefishpro.space.ui.f((t) dVar, this) : this;
        this.intercepted = fVar;
        return fVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public void releaseIntercepted() {
        com.gamericefishpro.space.th.a aVar = this.intercepted;
        if (aVar != null && aVar != this) {
            CoroutineContext.Element elementJ = getContext().j(kotlin.coroutines.d.x);
            Intrinsics.b(elementJ);
            com.gamericefishpro.space.ui.f fVar = (com.gamericefishpro.space.ui.f) aVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = com.gamericefishpro.space.ui.f.A;
            while (atomicReferenceFieldUpdater.get(fVar) == com.gamericefishpro.space.ui.a.c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            com.gamericefishpro.space.pi.h hVar = obj instanceof com.gamericefishpro.space.pi.h ? (com.gamericefishpro.space.pi.h) obj : null;
            if (hVar != null) {
                hVar.n();
            }
        }
        this.intercepted = b.d;
    }

    public c(com.gamericefishpro.space.th.a aVar) {
        this(aVar, aVar != null ? aVar.getContext() : null);
    }
}
