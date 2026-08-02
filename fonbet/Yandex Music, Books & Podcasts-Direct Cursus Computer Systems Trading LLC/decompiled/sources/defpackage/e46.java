package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public abstract class e46 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(e46.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(e46.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public e46(yap yapVar) {
        this._prev$volatile = yapVar;
    }

    public final void a() {
        b.set(this, null);
    }

    public final e46 c() {
        Object obj = a.get(this);
        if (obj == d46.a) {
            return null;
        }
        return (e46) obj;
    }

    public abstract boolean d();

    public final void e() {
        e46 c;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            e46 e46Var = (e46) atomicReferenceFieldUpdater.get(this);
            while (e46Var != null && e46Var.d()) {
                e46Var = (e46) atomicReferenceFieldUpdater.get(e46Var);
            }
            e46 c2 = c();
            c2.getClass();
            while (c2.d() && (c = c2.c()) != null) {
                c2 = c;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c2);
                e46 e46Var2 = ((e46) obj) == null ? null : e46Var;
                while (!atomicReferenceFieldUpdater.compareAndSet(c2, obj, e46Var2)) {
                    if (atomicReferenceFieldUpdater.get(c2) != obj) {
                        break;
                    }
                }
            }
            if (e46Var != null) {
                a.set(e46Var, c2);
            }
            if (!c2.d() || c2.c() == null) {
                if (e46Var == null || !e46Var.d()) {
                    return;
                }
            }
        }
    }
}
