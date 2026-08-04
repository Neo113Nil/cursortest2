package com.gamericefishpro.space.xi;

import com.gamericefishpro.space.pi.a0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c() {
        super(1);
        this.owner$volatile = d.a;
    }

    @Override // com.gamericefishpro.space.xi.a
    public final void b(Object obj) {
        while (e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            com.gamericefishpro.space.d6.a aVar = d.a;
            if (obj2 != aVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                        d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override // com.gamericefishpro.space.xi.a
    public final Object c(com.gamericefishpro.space.vh.c frame) {
        if (f()) {
            return Unit.a;
        }
        com.gamericefishpro.space.pi.h hVarO = a0.o(com.gamericefishpro.space.uh.f.b(frame));
        try {
            b bVar = new b(this, hVarO);
            while (true) {
                int andDecrement = g.z.getAndDecrement(this);
                if (andDecrement <= this.d) {
                    if (andDecrement > 0) {
                        bVar.h(Unit.a, this.e);
                        break;
                    }
                    if (a(bVar)) {
                        break;
                    }
                }
            }
            Object objR = hVarO.r();
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (objR == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objR != aVar) {
                objR = Unit.a;
            }
            return objR == aVar ? objR : Unit.a;
        } catch (Throwable th) {
            hVarO.A();
            throw th;
        }
    }

    public final boolean e() {
        return Math.max(g.z.get(this), 0) == 0;
    }

    public final boolean f() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.z;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.d;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    A.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        return "Mutex@" + a0.m(this) + "[isLocked=" + e() + ",owner=" + A.get(this) + ']';
    }
}
