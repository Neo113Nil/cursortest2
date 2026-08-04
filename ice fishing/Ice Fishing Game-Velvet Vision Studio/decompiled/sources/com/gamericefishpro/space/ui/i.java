package com.gamericefishpro.space.ui;

import com.gamericefishpro.space.pi.a0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class i {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(i iVar, int i2) {
        while (true) {
            i iVarF = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (iVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    iVarF = (i) obj;
                    if (!iVarF.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVarF);
                }
            }
            if (iVarF instanceof h) {
                return (((h) iVarF).v & i2) == 0 && iVarF.e(iVar, i2);
            }
            atomicReferenceFieldUpdater.set(iVar, iVarF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
            atomicReferenceFieldUpdater2.set(iVar, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(iVarF, this, iVar)) {
                    iVar.g(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(iVarF) == this);
        }
    }

    public final i f() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e;
            i iVar = (i) atomicReferenceFieldUpdater2.get(this);
            i iVar2 = iVar;
            while (true) {
                i iVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = d;
                    obj = atomicReferenceFieldUpdater.get(iVar2);
                    if (obj == this) {
                        if (iVar == iVar2) {
                            return iVar2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, iVar, iVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != iVar) {
                                break;
                            }
                        }
                        return iVar2;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof n)) {
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        iVar3 = iVar2;
                        iVar2 = (i) obj;
                    } else {
                        if (iVar3 != null) {
                            break;
                        }
                        iVar2 = (i) atomicReferenceFieldUpdater2.get(iVar2);
                    }
                }
                i iVar4 = ((n) obj).a;
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar3, iVar2, iVar4)) {
                    if (atomicReferenceFieldUpdater.get(iVar3) != iVar2) {
                        break;
                    }
                }
                iVar2 = iVar3;
            }
        }
    }

    public final void g(i iVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            i iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (d.get(this) != iVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                    if (i()) {
                        iVar.f();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(iVar) == iVar2);
        }
    }

    public final i h() {
        i iVar;
        Object obj = d.get(this);
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null && (iVar = nVar.a) != null) {
            return iVar;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (i) obj;
    }

    public boolean i() {
        return d.get(this) instanceof n;
    }

    public String toString() {
        return new com.gamericefishpro.space.f0.l(1, 2, a0.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + a0.m(this);
    }
}
