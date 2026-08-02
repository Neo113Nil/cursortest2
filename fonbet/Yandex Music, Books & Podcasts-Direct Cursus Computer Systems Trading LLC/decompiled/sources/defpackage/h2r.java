package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h2r implements Set, o9f {
    public final u2r a;
    public final /* synthetic */ int b;

    public h2r(u2r u2rVar, int i) {
        this.b = i;
        this.a = u2rVar;
    }

    private final boolean a(Collection collection) {
        dmk dmkVar;
        int i;
        b2r k;
        boolean b;
        Set A0 = CollectionsKt.A0(collection);
        u2r u2rVar = this.a;
        boolean z = false;
        do {
            synchronized (wct.g) {
                t2r t2rVar = u2rVar.a;
                t2rVar.getClass();
                t2r t2rVar2 = (t2r) g2r.i(t2rVar);
                dmkVar = t2rVar2.c;
                i = t2rVar2.d;
            }
            dmkVar.getClass();
            xlk builder = dmkVar.builder();
            Iterator it = u2rVar.b.iterator();
            while (((ler) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((ler) it).next();
                if (!A0.contains(entry.getKey())) {
                    builder.remove(entry.getKey());
                    z = true;
                }
            }
            dmk e = builder.e();
            if (Intrinsics.d(e, dmkVar)) {
                break;
            }
            t2r t2rVar3 = u2rVar.a;
            t2rVar3.getClass();
            synchronized (g2r.b) {
                k = g2r.k();
                b = u2r.b(u2rVar, (t2r) g2r.w(t2rVar3, u2rVar, k), i, e);
            }
            g2r.n(k, u2rVar);
        } while (!b);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.b) {
            case 0:
                wct.N();
                throw null;
            case 1:
                wct.N();
                throw null;
            default:
                wct.N();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.b) {
            case 0:
                wct.N();
                throw null;
            case 1:
                wct.N();
                throw null;
            default:
                wct.N();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof j9f) && !(obj instanceof m9f))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return Intrinsics.d(this.a.get(entry.getKey()), entry.getValue());
            case 1:
                return this.a.containsKey(obj);
            default:
                return this.a.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.b) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!this.a.containsKey(it2.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!this.a.containsValue(it3.next())) {
                            break;
                        }
                    }
                    break;
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
        switch (this.b) {
            case 0:
                u2r u2rVar = this.a;
                return new ler(u2rVar, ((iee) u2rVar.c().c.entrySet()).iterator(), 0);
            case 1:
                u2r u2rVar2 = this.a;
                return new ler(u2rVar2, ((iee) u2rVar2.c().c.entrySet()).iterator(), 1);
            default:
                u2r u2rVar3 = this.a;
                return new ler(u2rVar3, ((iee) u2rVar3.c().c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    return (!(obj instanceof j9f) || (obj instanceof m9f)) && this.a.remove(((Map.Entry) obj).getKey()) != null;
                }
                return false;
            case 1:
                return this.a.remove(obj) != null;
            default:
                u2r u2rVar = this.a;
                Iterator it = u2rVar.b.iterator();
                while (true) {
                    if (((ler) it).hasNext()) {
                        obj2 = ((ler) it).next();
                        if (Intrinsics.d(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry == null) {
                    return false;
                }
                u2rVar.remove(entry.getKey());
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        dmk dmkVar;
        int i;
        b2r k;
        boolean b;
        switch (this.b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z = false;
                    while (it.hasNext()) {
                        if (this.a.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                            z = true;
                        }
                    }
                    return z;
                    break;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it2.hasNext()) {
                        if (this.a.remove(it2.next()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                    break;
                }
                break;
            default:
                Set A0 = CollectionsKt.A0(collection);
                u2r u2rVar = this.a;
                boolean z3 = false;
                do {
                    synchronized (wct.g) {
                        t2r t2rVar = u2rVar.a;
                        t2rVar.getClass();
                        t2r t2rVar2 = (t2r) g2r.i(t2rVar);
                        dmkVar = t2rVar2.c;
                        i = t2rVar2.d;
                    }
                    dmkVar.getClass();
                    xlk builder = dmkVar.builder();
                    Iterator it3 = u2rVar.b.iterator();
                    while (((ler) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((ler) it3).next();
                        if (A0.contains(entry.getValue())) {
                            builder.remove(entry.getKey());
                            z3 = true;
                        }
                    }
                    dmk e = builder.e();
                    if (!Intrinsics.d(e, dmkVar)) {
                        t2r t2rVar3 = u2rVar.a;
                        t2rVar3.getClass();
                        synchronized (g2r.b) {
                            k = g2r.k();
                            b = u2r.b(u2rVar, (t2r) g2r.w(t2rVar3, u2rVar, k), i, e);
                        }
                        g2r.n(k, u2rVar);
                    }
                    return z3;
                } while (!b);
                return z3;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        dmk dmkVar;
        int i;
        b2r k;
        boolean b;
        dmk dmkVar2;
        int i2;
        b2r k2;
        boolean b2;
        switch (this.b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int a = tah.a(v75.o(collection2, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                u2r u2rVar = this.a;
                boolean z = false;
                do {
                    synchronized (wct.g) {
                        t2r t2rVar = u2rVar.a;
                        t2rVar.getClass();
                        t2r t2rVar2 = (t2r) g2r.i(t2rVar);
                        dmkVar = t2rVar2.c;
                        i = t2rVar2.d;
                    }
                    dmkVar.getClass();
                    xlk builder = dmkVar.builder();
                    Iterator it = u2rVar.b.iterator();
                    while (((ler) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((ler) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.d(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            builder.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    dmk e = builder.e();
                    if (!Intrinsics.d(e, dmkVar)) {
                        t2r t2rVar3 = u2rVar.a;
                        t2rVar3.getClass();
                        synchronized (g2r.b) {
                            k = g2r.k();
                            b = u2r.b(u2rVar, (t2r) g2r.w(t2rVar3, u2rVar, k), i, e);
                        }
                        g2r.n(k, u2rVar);
                    }
                    return z;
                } while (!b);
                return z;
            case 1:
                return a(collection);
            default:
                Set A0 = CollectionsKt.A0(collection);
                u2r u2rVar2 = this.a;
                boolean z2 = false;
                do {
                    synchronized (wct.g) {
                        t2r t2rVar4 = u2rVar2.a;
                        t2rVar4.getClass();
                        t2r t2rVar5 = (t2r) g2r.i(t2rVar4);
                        dmkVar2 = t2rVar5.c;
                        i2 = t2rVar5.d;
                    }
                    dmkVar2.getClass();
                    xlk builder2 = dmkVar2.builder();
                    Iterator it2 = u2rVar2.b.iterator();
                    while (((ler) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((ler) it2).next();
                        if (!A0.contains(entry3.getValue())) {
                            builder2.remove(entry3.getKey());
                            z2 = true;
                        }
                    }
                    dmk e2 = builder2.e();
                    if (!Intrinsics.d(e2, dmkVar2)) {
                        t2r t2rVar6 = u2rVar2.a;
                        t2rVar6.getClass();
                        synchronized (g2r.b) {
                            k2 = g2r.k();
                            b2 = u2r.b(u2rVar2, (t2r) g2r.w(t2rVar6, u2rVar2, k2), i2, e2);
                        }
                        g2r.n(k2, u2rVar2);
                    }
                    return z2;
                } while (!b2);
                return z2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return hld.K(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return hld.L(this, objArr);
    }
}
