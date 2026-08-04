package com.gamericefishpro.space.th;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a, com.gamericefishpro.space.vh.d {
    private static final c e = new c(null);
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "result");
    public final a d;
    private volatile Object result;

    public d(a delegate) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.d = delegate;
        this.result = aVar;
    }

    @Override // com.gamericefishpro.space.vh.d
    public final com.gamericefishpro.space.vh.d getCallerFrame() {
        a aVar = this.d;
        if (aVar instanceof com.gamericefishpro.space.vh.d) {
            return (com.gamericefishpro.space.vh.d) aVar;
        }
        return null;
    }

    @Override // com.gamericefishpro.space.th.a
    public final CoroutineContext getContext() {
        return this.d.getContext();
    }

    @Override // com.gamericefishpro.space.th.a
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.e;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    }
                }
                return;
            }
            com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i;
            com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.i;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    this.d.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == aVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.d;
    }
}
