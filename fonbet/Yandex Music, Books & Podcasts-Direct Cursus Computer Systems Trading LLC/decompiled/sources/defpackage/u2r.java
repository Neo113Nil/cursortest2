package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u2r implements mer, Map, n9f {
    public t2r a;
    public final h2r b;
    public final h2r c;
    public final h2r d;

    public u2r() {
        vlk vlkVar = vlk.f;
        b2r k = g2r.k();
        t2r t2rVar = new t2r(k.g(), vlkVar);
        if (!(k instanceof emd)) {
            t2rVar.b = new t2r(1, vlkVar);
        }
        this.a = t2rVar;
        this.b = new h2r(this, 0);
        this.c = new h2r(this, 1);
        this.d = new h2r(this, 2);
    }

    public static final boolean b(u2r u2rVar, t2r t2rVar, int i, dmk dmkVar) {
        boolean z;
        synchronized (wct.g) {
            int i2 = t2rVar.d;
            if (i2 == i) {
                t2rVar.c = dmkVar;
                z = true;
                t2rVar.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.mer
    public final void a(per perVar) {
        perVar.getClass();
        this.a = (t2r) perVar;
    }

    public final t2r c() {
        t2r t2rVar = this.a;
        t2rVar.getClass();
        return (t2r) g2r.t(t2rVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        b2r k;
        t2r t2rVar = this.a;
        t2rVar.getClass();
        t2r t2rVar2 = (t2r) g2r.i(t2rVar);
        vlk vlkVar = vlk.f;
        if (vlkVar != t2rVar2.c) {
            t2r t2rVar3 = this.a;
            t2rVar3.getClass();
            synchronized (g2r.b) {
                k = g2r.k();
                t2r t2rVar4 = (t2r) g2r.w(t2rVar3, this, k);
                synchronized (wct.g) {
                    t2rVar4.c = vlkVar;
                    t2rVar4.d++;
                }
            }
            g2r.n(k, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c().c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.b;
    }

    @Override // defpackage.mer
    public final per g() {
        return this.a;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return c().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        dmk dmkVar;
        int i;
        Object put;
        b2r k;
        boolean b;
        do {
            synchronized (wct.g) {
                t2r t2rVar = this.a;
                t2rVar.getClass();
                t2r t2rVar2 = (t2r) g2r.i(t2rVar);
                dmkVar = t2rVar2.c;
                i = t2rVar2.d;
            }
            dmkVar.getClass();
            xlk builder = dmkVar.builder();
            put = builder.put(obj, obj2);
            dmk e = builder.e();
            if (Intrinsics.d(e, dmkVar)) {
                break;
            }
            t2r t2rVar3 = this.a;
            t2rVar3.getClass();
            synchronized (g2r.b) {
                k = g2r.k();
                b = b(this, (t2r) g2r.w(t2rVar3, this, k), i, e);
            }
            g2r.n(k, this);
        } while (!b);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        dmk dmkVar;
        int i;
        b2r k;
        boolean b;
        do {
            synchronized (wct.g) {
                t2r t2rVar = this.a;
                t2rVar.getClass();
                t2r t2rVar2 = (t2r) g2r.i(t2rVar);
                dmkVar = t2rVar2.c;
                i = t2rVar2.d;
            }
            dmkVar.getClass();
            xlk builder = dmkVar.builder();
            builder.putAll(map);
            dmk e = builder.e();
            if (Intrinsics.d(e, dmkVar)) {
                return;
            }
            t2r t2rVar3 = this.a;
            t2rVar3.getClass();
            synchronized (g2r.b) {
                k = g2r.k();
                b = b(this, (t2r) g2r.w(t2rVar3, this, k), i, e);
            }
            g2r.n(k, this);
        } while (!b);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        dmk dmkVar;
        int i;
        V remove;
        b2r k;
        boolean b;
        do {
            synchronized (wct.g) {
                t2r t2rVar = this.a;
                t2rVar.getClass();
                t2r t2rVar2 = (t2r) g2r.i(t2rVar);
                dmkVar = t2rVar2.c;
                i = t2rVar2.d;
            }
            dmkVar.getClass();
            xlk builder = dmkVar.builder();
            remove = builder.remove(obj);
            dmk e = builder.e();
            if (Intrinsics.d(e, dmkVar)) {
                break;
            }
            t2r t2rVar3 = this.a;
            t2rVar3.getClass();
            synchronized (g2r.b) {
                k = g2r.k();
                b = b(this, (t2r) g2r.w(t2rVar3, this, k), i, e);
            }
            g2r.n(k, this);
        } while (!b);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        return c().c.size();
    }

    public final String toString() {
        t2r t2rVar = this.a;
        t2rVar.getClass();
        return "SnapshotStateMap(value=" + ((t2r) g2r.i(t2rVar)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d;
    }
}
