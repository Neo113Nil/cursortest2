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
    public Object[] f24790n;

    /* renamed from: u, reason: collision with root package name */
    public int f24791u;

    /* renamed from: v, reason: collision with root package name */
    public Map f24792v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24793w;

    /* renamed from: x, reason: collision with root package name */
    public volatile IL f24794x;

    /* renamed from: y, reason: collision with root package name */
    public Map f24795y;

    public FL() {
        Map map = Collections.EMPTY_MAP;
        this.f24792v = map;
        this.f24795y = map;
    }

    public final GL a(int i) {
        if (i < this.f24791u) {
            return (GL) this.f24790n[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        return this.f24792v.isEmpty() ? Collections.EMPTY_SET : this.f24792v.entrySet();
    }

    public final Object c(Object obj) {
        e();
        d();
        e();
        if (this.f24790n == null) {
            this.f24790n = new Object[16];
        }
        if (this.f24791u == 16) {
            GL gl = (GL) this.f24790n[15];
            this.f24791u = 15;
            SortedMap f3 = f();
            gl.getClass();
            f3.put(null, gl.f24968n);
        }
        Object[] objArr = this.f24790n;
        int length = objArr.length;
        System.arraycopy(objArr, 0, objArr, 1, 15);
        this.f24790n[0] = new GL(this, obj);
        this.f24791u++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        e();
        if (this.f24791u != 0) {
            this.f24790n = null;
            this.f24791u = 0;
        }
        if (this.f24792v.isEmpty()) {
            return;
        }
        this.f24792v.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        d();
        return this.f24792v.containsKey(null);
    }

    public final int d() {
        int i = this.f24791u - 1;
        if (i >= 0) {
            ((GL) this.f24790n[i]).getClass();
            throw null;
        }
        if (i < 0) {
            return -1;
        }
        ((GL) this.f24790n[i / 2]).getClass();
        throw null;
    }

    public final void e() {
        if (this.f24793w) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f24794x == null) {
            this.f24794x = new IL(this, 0);
        }
        return this.f24794x;
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
            int i = this.f24791u;
            if (i != fl.f24791u) {
                return entrySet().equals(fl.entrySet());
            }
            for (int i6 = 0; i6 < i; i6++) {
                if (a(i6).equals(fl.a(i6))) {
                }
            }
            if (i != size) {
                return this.f24792v.equals(fl.f24792v);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        e();
        if (this.f24792v.isEmpty() && !(this.f24792v instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f24792v = treeMap;
            this.f24795y = treeMap.descendingMap();
        }
        return (SortedMap) this.f24792v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        d();
        return this.f24792v.get(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f24791u;
        int i6 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i6 += this.f24790n[i9].hashCode();
        }
        return this.f24792v.size() > 0 ? this.f24792v.hashCode() + i6 : i6;
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
        if (this.f24792v.isEmpty()) {
            return null;
        }
        return this.f24792v.remove(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f24792v.size() + this.f24791u;
    }
}
