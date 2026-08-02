package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class xlk extends i8 implements Map, n9f {
    public vlk a;
    public hs4 b = new hs4(28);
    public aat c;
    public Object d;
    public int e;
    public int f;

    public xlk(vlk vlkVar) {
        this.a = vlkVar;
        this.c = vlkVar.d;
        this.f = vlkVar.e;
    }

    @Override // defpackage.i8
    public final Set a() {
        return new zlk(0, this);
    }

    @Override // defpackage.i8
    public final Set b() {
        return new zlk(1, this);
    }

    @Override // defpackage.i8
    public final Collection c() {
        return new h9h(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = aat.e;
        g(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* renamed from: d */
    public vlk e() {
        aat aatVar = this.c;
        vlk vlkVar = this.a;
        if (aatVar != vlkVar.d) {
            this.b = new hs4(28);
            vlkVar = new vlk(this.c, f());
        }
        this.a = vlkVar;
        return vlkVar;
    }

    public /* bridge */ dmk e() {
        return e();
    }

    @Override // defpackage.i8
    public final int f() {
        return this.f;
    }

    public final void g(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.d = null;
        this.c = this.c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        vlk vlkVar = null;
        vlk vlkVar2 = map instanceof vlk ? (vlk) map : null;
        if (vlkVar2 == null) {
            xlk xlkVar = map instanceof xlk ? (xlk) map : null;
            if (xlkVar != null) {
                vlkVar = xlkVar.e();
            }
        } else {
            vlkVar = vlkVar2;
        }
        if (vlkVar == null) {
            super.putAll(map);
            return;
        }
        ix7 ix7Var = new ix7();
        ix7Var.a = 0;
        int i = this.f;
        aat aatVar = this.c;
        aat aatVar2 = vlkVar.d;
        aatVar2.getClass();
        this.c = aatVar.m(aatVar2, 0, ix7Var, this);
        int i2 = (vlkVar.e + i) - ix7Var.a;
        if (i != i2) {
            g(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int f = f();
        aat o = this.c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o == null) {
            o = aat.e;
        }
        this.c = o;
        return f != f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.d = null;
        aat n = this.c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = aat.e;
        }
        this.c = n;
        return this.d;
    }
}
