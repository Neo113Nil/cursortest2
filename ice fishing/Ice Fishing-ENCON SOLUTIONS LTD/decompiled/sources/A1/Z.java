package A1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Z implements N {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f28b = AtomicIntegerFieldUpdater.newUpdater(Z.class, "_isCompleting");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f29c = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_rootCause");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30d = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f31a;

    public Z(c0 c0Var, Throwable th) {
        this.f31a = c0Var;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable c2 = c();
        if (c2 == null) {
            f29c.set(this, th);
            return;
        }
        if (th == c2) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30d;
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

    @Override // A1.N
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) f29c.get(this);
    }

    @Override // A1.N
    public final c0 d() {
        return this.f31a;
    }

    public final boolean e() {
        return c() != null;
    }

    public final boolean f() {
        return f28b.get(this) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30d;
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
        Throwable c2 = c();
        if (c2 != null) {
            arrayList.add(0, c2);
        }
        if (th != null && !th.equals(c2)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0022x.f80g);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + f30d.get(this) + ", list=" + this.f31a + ']';
    }
}
