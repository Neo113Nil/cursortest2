package L0;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Y implements M {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f637f = AtomicIntegerFieldUpdater.newUpdater(Y.class, "_isCompleting");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f638g = AtomicReferenceFieldUpdater.newUpdater(Y.class, Object.class, "_rootCause");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f639h = AtomicReferenceFieldUpdater.newUpdater(Y.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f640e;

    public Y(b0 b0Var, Throwable th) {
        this.f640e = b0Var;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable d2 = d();
        if (d2 == null) {
            f638g.set(this, th);
            return;
        }
        if (th == d2) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f639h;
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

    @Override // L0.M
    public final boolean b() {
        return d() == null;
    }

    @Override // L0.M
    public final b0 c() {
        return this.f640e;
    }

    public final Throwable d() {
        return (Throwable) f638g.get(this);
    }

    public final boolean e() {
        return d() != null;
    }

    public final boolean f() {
        return f637f.get(this) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f639h;
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
        atomicReferenceFieldUpdater.set(this, AbstractC0064w.f689g);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + f639h.get(this) + ", list=" + this.f640e + ']';
    }
}
