package com.gamericefishpro.space.ri;

import com.gamericefishpro.space.pi.e2;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends com.gamericefishpro.space.ui.q {
    public final e e;
    public final /* synthetic */ AtomicReferenceArray f;

    public m(long j, m mVar, e eVar, int i) {
        super(j, mVar, i);
        this.e = eVar;
        this.f = new AtomicReferenceArray(g.b * 2);
    }

    @Override // com.gamericefishpro.space.ui.q
    public final int f() {
        return g.b;
    }

    @Override // com.gamericefishpro.space.ui.q
    public final void g(int i, CoroutineContext coroutineContext) {
        e eVar;
        int i2 = g.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f.get(i * 2);
        while (true) {
            Object objK = k(i);
            boolean z2 = objK instanceof e2;
            eVar = this.e;
            if (z2 || (objK instanceof u)) {
                if (j(i, objK, z ? g.j : g.k)) {
                    m(i, null);
                    l(i, !z);
                    if (z) {
                        Intrinsics.b(eVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objK == g.j || objK == g.k) {
                    break;
                }
                if (objK != g.g && objK != g.f) {
                    if (objK == g.i || objK == g.d || objK == g.l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objK).toString());
                }
            }
        }
        m(i, null);
        if (z) {
            Intrinsics.b(eVar);
        }
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object k(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void l(int i, boolean z) {
        if (z) {
            e eVar = this.e;
            Intrinsics.b(eVar);
            eVar.I((this.c * ((long) g.b)) + ((long) i));
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    public final void n(int i, Object obj) {
        this.f.set((i * 2) + 1, obj);
    }
}
