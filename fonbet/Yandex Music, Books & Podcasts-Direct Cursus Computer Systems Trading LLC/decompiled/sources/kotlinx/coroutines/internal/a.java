package kotlinx.coroutines.internal;

import defpackage.ff7;
import defpackage.jk6;
import defpackage.lwn;
import defpackage.q8g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public class a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(a aVar, int i) {
        while (true) {
            a f = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            if (f == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f = (a) obj;
                    if (!f.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f);
                }
            }
            if (f instanceof q8g) {
                return (((q8g) f).d & i) == 0 && f.e(aVar, i);
            }
            atomicReferenceFieldUpdater.set(aVar, f);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            atomicReferenceFieldUpdater2.set(aVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f, this, aVar)) {
                if (atomicReferenceFieldUpdater2.get(f) != this) {
                    break;
                }
            }
            aVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((defpackage.lwn) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x001c, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a f() {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            a aVar = (a) atomicReferenceFieldUpdater.get(this);
            a aVar2 = aVar;
            while (true) {
                a aVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                    Object obj = atomicReferenceFieldUpdater2.get(aVar2);
                    if (obj == this) {
                        if (aVar != aVar2) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof lwn)) {
                        obj.getClass();
                        aVar3 = aVar2;
                        aVar2 = (a) obj;
                    } else {
                        if (aVar3 != null) {
                            break;
                        }
                        aVar2 = (a) atomicReferenceFieldUpdater.get(aVar2);
                    }
                }
                aVar2 = aVar3;
            }
        }
    }

    public final void g(a aVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            a aVar2 = (a) atomicReferenceFieldUpdater.get(aVar);
            if (a.get(this) != aVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, aVar2, this)) {
                if (atomicReferenceFieldUpdater.get(aVar) != aVar2) {
                    break;
                }
            }
            if (i()) {
                aVar.f();
                return;
            }
            return;
        }
    }

    public final a h() {
        Object obj = a.get(this);
        lwn lwnVar = obj instanceof lwn ? (lwn) obj : null;
        if (lwnVar != null) {
            return lwnVar.a;
        }
        obj.getClass();
        return (a) obj;
    }

    public boolean i() {
        return a.get(this) instanceof lwn;
    }

    public String toString() {
        return new jk6(1, 5, ff7.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + ff7.B(this);
    }
}
