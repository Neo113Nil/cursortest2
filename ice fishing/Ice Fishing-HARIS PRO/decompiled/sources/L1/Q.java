package L1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Q implements I {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f540b = AtomicIntegerFieldUpdater.newUpdater(Q.class, "_isCompleting");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f541c = AtomicReferenceFieldUpdater.newUpdater(Q.class, Object.class, "_rootCause");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f542d = AtomicReferenceFieldUpdater.newUpdater(Q.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: a, reason: collision with root package name */
    public final U f543a;

    public Q(U u2, Throwable th) {
        this.f543a = u2;
        this._rootCause = th;
    }

    @Override // L1.I
    public final boolean a() {
        return d() == null;
    }

    @Override // L1.I
    public final U b() {
        return this.f543a;
    }

    public final void c(Throwable th) {
        Throwable d2 = d();
        if (d2 == null) {
            f541c.set(this, th);
            return;
        }
        if (th == d2) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f542d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final Throwable d() {
        return (Throwable) f541c.get(this);
    }

    public final boolean e() {
        return d() != null;
    }

    public final boolean f() {
        return f540b.get(this) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f542d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable d2 = d();
        if (d2 != null) {
            arrayList.add(0, d2);
        }
        if (th != null && !th.equals(d2)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0018t.f582g);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + f542d.get(this) + ", list=" + this.f543a + ']';
    }
}
