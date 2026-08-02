package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class FL extends AbstractMap {

    /* renamed from: n, reason: collision with root package name */
    public Object[] f25546n;

    /* renamed from: u, reason: collision with root package name */
    public int f25547u;

    /* renamed from: v, reason: collision with root package name */
    public Map f25548v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f25549w;

    /* renamed from: x, reason: collision with root package name */
    public volatile IL f25550x;

    /* renamed from: y, reason: collision with root package name */
    public Map f25551y;

    public FL() {
        Map map = Collections.EMPTY_MAP;
        this.f25548v = map;
        this.f25551y = map;
    }

    public final GL a(int i) {
        if (i < this.f25547u) {
            return (GL) this.f25546n[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        return this.f25548v.isEmpty() ? Collections.EMPTY_SET : this.f25548v.entrySet();
    }

    public final Object c(Object obj) {
        e();
        d();
        e();
        if (this.f25546n == null) {
            this.f25546n = new Object[16];
        }
        if (this.f25547u == 16) {
            GL gl = (GL) this.f25546n[15];
            this.f25547u = 15;
            SortedMap f2 = f();
            gl.getClass();
            f2.put(null, gl.f25758n);
        }
        Object[] objArr = this.f25546n;
        int length = objArr.length;
        System.arraycopy(objArr, 0, objArr, 1, 15);
        this.f25546n[0] = new GL(this, obj);
        this.f25547u++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        e();
        if (this.f25547u != 0) {
            this.f25546n = null;
            this.f25547u = 0;
        }
        if (this.f25548v.isEmpty()) {
            return;
        }
        this.f25548v.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        d();
        return this.f25548v.containsKey(null);
    }

    public final int d() {
        int i = this.f25547u - 1;
        if (i >= 0) {
            ((GL) this.f25546n[i]).getClass();
            throw null;
        }
        if (i < 0) {
            return -1;
        }
        ((GL) this.f25546n[i / 2]).getClass();
        throw null;
    }

    public final void e() {
        if (this.f25549w) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f25550x == null) {
            this.f25550x = new IL(this, 0);
        }
        return this.f25550x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FL)) {
            return super.equals(obj);
        }
        FL fl = (FL) obj;
        int size = size();
        if (size == fl.size()) {
            int i = this.f25547u;
            if (i != fl.f25547u) {
                return entrySet().equals(fl.entrySet());
            }
            for (int i4 = 0; i4 < i; i4++) {
                if (a(i4).equals(fl.a(i4))) {
                }
            }
            if (i != size) {
                return this.f25548v.equals(fl.f25548v);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        e();
        if (this.f25548v.isEmpty() && !(this.f25548v instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f25548v = treeMap;
            this.f25551y = treeMap.descendingMap();
        }
        return (SortedMap) this.f25548v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        d();
        return this.f25548v.get(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f25547u;
        int i4 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            i4 += this.f25546n[i6].hashCode();
        }
        return this.f25548v.size() > 0 ? this.f25548v.hashCode() + i4 : i4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        c(obj2);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        e();
        if (obj != null) {
            throw new ClassCastException();
        }
        d();
        if (this.f25548v.isEmpty()) {
            return null;
        }
        return this.f25548v.remove(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f25548v.size() + this.f25547u;
    }
}
