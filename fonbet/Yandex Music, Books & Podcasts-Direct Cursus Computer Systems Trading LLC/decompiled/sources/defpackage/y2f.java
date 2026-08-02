package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.a;

/* loaded from: classes5.dex */
public abstract class y2f extends a implements qa8, iie {
    public h3f d;

    @Override // defpackage.qa8
    public final void a() {
        h3f j = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h3f.a;
            Object obj = atomicReferenceFieldUpdater.get(j);
            if (obj instanceof y2f) {
                if (obj != this) {
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(j, obj, i3f.g)) {
                    if (atomicReferenceFieldUpdater.get(j) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof iie) || ((iie) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a.a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof lwn) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                obj2.getClass();
                a aVar = (a) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = a.c;
                lwn lwnVar = (lwn) atomicReferenceFieldUpdater3.get(aVar);
                if (lwnVar == null) {
                    lwnVar = new lwn(aVar);
                    atomicReferenceFieldUpdater3.set(aVar, lwnVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, lwnVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                aVar.f();
                return;
            }
        }
    }

    @Override // defpackage.iie
    public final boolean b() {
        return true;
    }

    @Override // defpackage.iie
    public final h8j d() {
        return null;
    }

    public r2f getParent() {
        return j();
    }

    public final h3f j() {
        h3f h3fVar = this.d;
        if (h3fVar != null) {
            return h3fVar;
        }
        Intrinsics.j("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // kotlinx.coroutines.internal.a
    public final String toString() {
        return getClass().getSimpleName() + '@' + ff7.B(this) + "[job@" + ff7.B(j()) + ']';
    }
}
