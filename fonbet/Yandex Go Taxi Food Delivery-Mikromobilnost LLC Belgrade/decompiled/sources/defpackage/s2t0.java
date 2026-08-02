package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class s2t0 implements Set, fgx {
    public final l3t0 a;
    public final /* synthetic */ int b;

    public s2t0(l3t0 l3t0Var, int i) {
        this.b = i;
        this.a = l3t0Var;
    }

    private final boolean a(Collection collection) {
        b2b0 b2b0Var;
        int i;
        i2t0 j;
        boolean a;
        Set N0 = a.N0(collection);
        l3t0 l3t0Var = this.a;
        boolean z = false;
        do {
            synchronized (yz91.a) {
                k3t0 k3t0Var = (k3t0) q2t0.h(l3t0Var.a);
                b2b0Var = k3t0Var.c;
                i = k3t0Var.d;
            }
            d2b0 b = b2b0Var.b();
            Iterator it = l3t0Var.b.iterator();
            while (((c5u0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((c5u0) it).next();
                if (!N0.contains(entry.getKey())) {
                    b.remove(entry.getKey());
                    z = true;
                }
            }
            b2b0 b2 = b.b();
            if (jl40.l(b2, b2b0Var)) {
                break;
            }
            k3t0 k3t0Var2 = l3t0Var.a;
            synchronized (q2t0.c) {
                j = q2t0.j();
                a = l3t0.a(l3t0Var, (k3t0) q2t0.w(k3t0Var2, l3t0Var, j), i, b2);
            }
            q2t0.n(j, l3t0Var);
        } while (!a);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.b) {
            case 0:
                yz91.e();
                throw null;
            case 1:
                yz91.e();
                throw null;
            default:
                yz91.e();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.b) {
            case 0:
                yz91.e();
                throw null;
            case 1:
                yz91.e();
                throw null;
            default:
                yz91.e();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.b;
        l3t0 l3t0Var = this.a;
        switch (i) {
            case 0:
                if (!ym11.i(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return jl40.l(l3t0Var.get(entry.getKey()), entry.getValue());
            case 1:
                return l3t0Var.containsKey(obj);
            default:
                return l3t0Var.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.b;
        l3t0 l3t0Var = this.a;
        switch (i) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!l3t0Var.containsKey(it2.next())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!l3t0Var.containsValue(it3.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.b;
        l3t0 l3t0Var = this.a;
        switch (i) {
            case 0:
                return new c5u0(l3t0Var, ((siv) l3t0Var.b().c.entrySet()).iterator(), 0);
            case 1:
                return new c5u0(l3t0Var, ((siv) l3t0Var.b().c.entrySet()).iterator(), 1);
            default:
                return new c5u0(l3t0Var, ((siv) l3t0Var.b().c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        int i = this.b;
        l3t0 l3t0Var = this.a;
        switch (i) {
            case 0:
                if (ym11.i(obj) && l3t0Var.remove(((Map.Entry) obj).getKey()) != null) {
                    break;
                }
                break;
            case 1:
                if (l3t0Var.remove(obj) != null) {
                    break;
                }
                break;
            default:
                Iterator it = l3t0Var.b.iterator();
                while (true) {
                    if (((c5u0) it).hasNext()) {
                        obj2 = ((c5u0) it).next();
                        if (jl40.l(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry != null) {
                    l3t0Var.remove(entry.getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        b2b0 b2b0Var;
        int i;
        i2t0 j;
        boolean a;
        boolean z = false;
        switch (this.b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.a.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                    break;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.a.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                    break;
                }
                break;
            default:
                Set N0 = a.N0(collection);
                l3t0 l3t0Var = this.a;
                do {
                    synchronized (yz91.a) {
                        k3t0 k3t0Var = (k3t0) q2t0.h(l3t0Var.a);
                        b2b0Var = k3t0Var.c;
                        i = k3t0Var.d;
                    }
                    d2b0 b = b2b0Var.b();
                    Iterator it3 = l3t0Var.b.iterator();
                    while (((c5u0) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((c5u0) it3).next();
                        if (N0.contains(entry.getValue())) {
                            b.remove(entry.getKey());
                            z = true;
                        }
                    }
                    b2b0 b2 = b.b();
                    if (!jl40.l(b2, b2b0Var)) {
                        k3t0 k3t0Var2 = l3t0Var.a;
                        synchronized (q2t0.c) {
                            j = q2t0.j();
                            a = l3t0.a(l3t0Var, (k3t0) q2t0.w(k3t0Var2, l3t0Var, j), i, b2);
                        }
                        q2t0.n(j, l3t0Var);
                    }
                    return z;
                } while (!a);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        b2b0 b2b0Var;
        int i;
        i2t0 j;
        boolean a;
        b2b0 b2b0Var2;
        int i2;
        i2t0 j2;
        boolean a2;
        boolean z = false;
        switch (this.b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int d = gw00.d(tcc.n(collection2, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                for (Map.Entry entry : collection2) {
                    Pair pair = new Pair(entry.getKey(), entry.getValue());
                    linkedHashMap.put(pair.c(), pair.f());
                }
                l3t0 l3t0Var = this.a;
                do {
                    synchronized (yz91.a) {
                        k3t0 k3t0Var = (k3t0) q2t0.h(l3t0Var.a);
                        b2b0Var = k3t0Var.c;
                        i = k3t0Var.d;
                    }
                    d2b0 b = b2b0Var.b();
                    Iterator it = l3t0Var.b.iterator();
                    while (((c5u0) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((c5u0) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !jl40.l(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            b.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    b2b0 b2 = b.b();
                    if (!jl40.l(b2, b2b0Var)) {
                        k3t0 k3t0Var2 = l3t0Var.a;
                        synchronized (q2t0.c) {
                            j = q2t0.j();
                            a = l3t0.a(l3t0Var, (k3t0) q2t0.w(k3t0Var2, l3t0Var, j), i, b2);
                        }
                        q2t0.n(j, l3t0Var);
                    }
                    return z;
                } while (!a);
                return z;
            case 1:
                return a(collection);
            default:
                Set N0 = a.N0(collection);
                l3t0 l3t0Var2 = this.a;
                do {
                    synchronized (yz91.a) {
                        k3t0 k3t0Var3 = (k3t0) q2t0.h(l3t0Var2.a);
                        b2b0Var2 = k3t0Var3.c;
                        i2 = k3t0Var3.d;
                    }
                    d2b0 b3 = b2b0Var2.b();
                    Iterator it2 = l3t0Var2.b.iterator();
                    while (((c5u0) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((c5u0) it2).next();
                        if (!N0.contains(entry3.getValue())) {
                            b3.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    b2b0 b4 = b3.b();
                    if (!jl40.l(b4, b2b0Var2)) {
                        k3t0 k3t0Var4 = l3t0Var2.a;
                        synchronized (q2t0.c) {
                            j2 = q2t0.j();
                            a2 = l3t0.a(l3t0Var2, (k3t0) q2t0.w(k3t0Var4, l3t0Var2, j2), i2, b4);
                        }
                        q2t0.n(j2, l3t0Var2);
                    }
                    return z;
                } while (!a2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return vng.J(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return vng.K(this, objArr);
    }
}
