package defpackage;

import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public final class tdy {
    public static final Object f = new Object();
    public static tdy g;
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayDeque d = new ArrayDeque();
    public jm7 e;

    public final void a(ody odyVar, pbj pbjVar, jm7 jm7Var) {
        boolean z;
        synchronized (this.a) {
            try {
                d6z.n(!((List) pbjVar.A).isEmpty());
                this.e = jm7Var;
                pey p = odyVar.p();
                sdy c = c(p);
                if (c == null) {
                    return;
                }
                Set set = (Set) this.c.get(c);
                jm7 jm7Var2 = this.e;
                if (jm7Var2 == null || jm7Var2.b() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ody odyVar2 = (ody) this.b.get((e74) it.next());
                        odyVar2.getClass();
                        if (!odyVar2.equals(odyVar) && !odyVar2.r().isEmpty()) {
                            synchronized (odyVar2.a) {
                                pbj pbjVar2 = odyVar2.x;
                                z = pbjVar2 == null ? false : pbjVar2.b;
                            }
                            if (z || pbjVar.b) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                            odyVar2.v();
                        }
                    }
                }
                try {
                    odyVar.k(pbjVar);
                    if (p.getLifecycle().b().a(Lifecycle.State.STARTED)) {
                        g(p);
                    }
                } catch (CameraUseCaseAdapter$CameraException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ody b(pey peyVar, qt7 qt7Var) {
        synchronized (this.a) {
            try {
                d6z.m("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.b.get(new e74(System.identityHashCode(peyVar), qt7Var.w)) == null);
                ody odyVar = new ody(peyVar, qt7Var);
                if (((ArrayList) qt7Var.y()).isEmpty()) {
                    odyVar.t();
                }
                if (peyVar.getLifecycle().b() == Lifecycle.State.DESTROYED) {
                    return odyVar;
                }
                f(odyVar);
                return odyVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final sdy c(pey peyVar) {
        synchronized (this.a) {
            try {
                for (sdy sdyVar : this.c.keySet()) {
                    if (peyVar.equals(sdyVar.b)) {
                        return sdyVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Collection d() {
        Collection unmodifiableCollection;
        synchronized (this.a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.b.values());
        }
        return unmodifiableCollection;
    }

    public final boolean e(pey peyVar) {
        synchronized (this.a) {
            try {
                sdy c = c(peyVar);
                if (c == null) {
                    return false;
                }
                Iterator it = ((Set) this.c.get(c)).iterator();
                while (it.hasNext()) {
                    ody odyVar = (ody) this.b.get((e74) it.next());
                    odyVar.getClass();
                    if (!odyVar.r().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(ody odyVar) {
        synchronized (this.a) {
            try {
                pey p = odyVar.p();
                e74 e74Var = new e74(System.identityHashCode(p), odyVar.c.w);
                sdy c = c(p);
                Set hashSet = c != null ? (Set) this.c.get(c) : new HashSet();
                hashSet.add(e74Var);
                this.b.put(e74Var, odyVar);
                if (c == null) {
                    sdy sdyVar = new sdy(p, this);
                    this.c.put(sdyVar, hashSet);
                    p.getLifecycle().a(sdyVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(pey peyVar) {
        synchronized (this.a) {
            try {
                if (e(peyVar)) {
                    if (this.d.isEmpty()) {
                        this.d.push(peyVar);
                    } else {
                        jm7 jm7Var = this.e;
                        if (jm7Var == null || jm7Var.b() != 2) {
                            pey peyVar2 = (pey) this.d.peek();
                            if (!peyVar.equals(peyVar2)) {
                                i(peyVar2);
                                this.d.remove(peyVar);
                                this.d.push(peyVar);
                            }
                        }
                    }
                    n(peyVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(pey peyVar) {
        synchronized (this.a) {
            try {
                this.d.remove(peyVar);
                i(peyVar);
                if (!this.d.isEmpty()) {
                    n((pey) this.d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(pey peyVar) {
        synchronized (this.a) {
            try {
                sdy c = c(peyVar);
                if (c == null) {
                    return;
                }
                Iterator it = ((Set) this.c.get(c)).iterator();
                while (it.hasNext()) {
                    ody odyVar = (ody) this.b.get((e74) it.next());
                    odyVar.getClass();
                    odyVar.t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Set] */
    public final void j(pbj pbjVar, HashSet hashSet) {
        HashSet<e74> hashSet2 = hashSet;
        synchronized (this.a) {
            if (hashSet == null) {
                try {
                    hashSet2 = this.b.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (e74 e74Var : hashSet2) {
                if (this.b.containsKey(e74Var)) {
                    ody odyVar = (ody) this.b.get(e74Var);
                    boolean isEmpty = odyVar.r().isEmpty();
                    odyVar.u(pbjVar);
                    if (!isEmpty && odyVar.r().isEmpty()) {
                        h(odyVar.p());
                    }
                } else {
                    sgb1.g(5, "LifecycleCameraRepository");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Set] */
    public final void k(HashSet hashSet) {
        HashSet hashSet2 = hashSet;
        synchronized (this.a) {
            if (hashSet == null) {
                try {
                    hashSet2 = this.b.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                ody odyVar = (ody) this.b.get((e74) it.next());
                if (odyVar != null) {
                    odyVar.v();
                    h(odyVar.p());
                }
            }
        }
    }

    public final void l(ody odyVar) {
        synchronized (this.a) {
            try {
                pey p = odyVar.p();
                e74 e74Var = new e74(System.identityHashCode(p), odyVar.c.w);
                this.b.remove(e74Var);
                HashSet hashSet = new HashSet();
                for (sdy sdyVar : this.c.keySet()) {
                    if (p.equals(sdyVar.b)) {
                        Set set = (Set) this.c.get(sdyVar);
                        set.remove(e74Var);
                        if (set.isEmpty()) {
                            hashSet.add(sdyVar.b);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m((pey) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(pey peyVar) {
        synchronized (this.a) {
            try {
                sdy c = c(peyVar);
                if (c == null) {
                    return;
                }
                h(peyVar);
                Iterator it = ((Set) this.c.get(c)).iterator();
                while (it.hasNext()) {
                    this.b.remove((e74) it.next());
                }
                this.c.remove(c);
                c.b.getLifecycle().d(c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(pey peyVar) {
        synchronized (this.a) {
            try {
                Iterator it = ((Set) this.c.get(c(peyVar))).iterator();
                while (it.hasNext()) {
                    ody odyVar = (ody) this.b.get((e74) it.next());
                    odyVar.getClass();
                    if (!odyVar.r().isEmpty()) {
                        odyVar.w();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
