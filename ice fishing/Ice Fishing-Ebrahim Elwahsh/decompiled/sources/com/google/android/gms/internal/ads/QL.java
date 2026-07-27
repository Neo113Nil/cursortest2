package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class QL extends AbstractMap {

    /* renamed from: n, reason: collision with root package name */
    public Object[] f27142n;

    /* renamed from: u, reason: collision with root package name */
    public int f27143u;

    /* renamed from: v, reason: collision with root package name */
    public Map f27144v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27145w;

    /* renamed from: x, reason: collision with root package name */
    public volatile TL f27146x;

    /* renamed from: y, reason: collision with root package name */
    public Map f27147y;

    public QL() {
        Map map = Collections.EMPTY_MAP;
        this.f27144v = map;
        this.f27147y = map;
    }

    public final RL a(int i) {
        if (i < this.f27143u) {
            return (RL) this.f27142n[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        return this.f27144v.isEmpty() ? Collections.EMPTY_SET : this.f27144v.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int e6 = e(comparable);
        if (e6 >= 0) {
            return ((RL) this.f27142n[e6]).setValue(obj);
        }
        f();
        if (this.f27142n == null) {
            this.f27142n = new Object[16];
        }
        int i = -(e6 + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f27143u == 16) {
            RL rl = (RL) this.f27142n[15];
            this.f27143u = 15;
            g().put(rl.f27345n, rl.f27346u);
        }
        Object[] objArr = this.f27142n;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f27142n[i] = new RL(this, comparable, obj);
        this.f27143u++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f27143u != 0) {
            this.f27142n = null;
            this.f27143u = 0;
        }
        if (this.f27144v.isEmpty()) {
            return;
        }
        this.f27144v.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f27144v.containsKey(comparable);
    }

    public final Object d(int i) {
        f();
        Object[] objArr = this.f27142n;
        Object obj = ((RL) objArr[i]).f27346u;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f27143u - i) - 1);
        this.f27143u--;
        if (!this.f27144v.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f27142n;
            int i4 = this.f27143u;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i4] = new RL(this, (Comparable) entry.getKey(), entry.getValue());
            this.f27143u++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i = this.f27143u;
        int i4 = i - 1;
        int i9 = 0;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo(((RL) this.f27142n[i4]).f27345n);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i4;
            }
        }
        while (i9 <= i4) {
            int i10 = (i9 + i4) / 2;
            int compareTo2 = comparable.compareTo(((RL) this.f27142n[i10]).f27345n);
            if (compareTo2 < 0) {
                i4 = i10 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i10;
                }
                i9 = i10 + 1;
            }
        }
        return -(i9 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f27146x == null) {
            this.f27146x = new TL(this, 0);
        }
        return this.f27146x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QL)) {
            return super.equals(obj);
        }
        QL ql = (QL) obj;
        int size = size();
        if (size == ql.size()) {
            int i = this.f27143u;
            if (i != ql.f27143u) {
                return entrySet().equals(ql.entrySet());
            }
            for (int i4 = 0; i4 < i; i4++) {
                if (a(i4).equals(ql.a(i4))) {
                }
            }
            if (i != size) {
                return this.f27144v.equals(ql.f27144v);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f27145w) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.f27144v.isEmpty() && !(this.f27144v instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f27144v = treeMap;
            this.f27147y = treeMap.descendingMap();
        }
        return (SortedMap) this.f27144v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e6 = e(comparable);
        return e6 >= 0 ? ((RL) this.f27142n[e6]).f27346u : this.f27144v.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f27143u;
        int i4 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i4 += this.f27142n[i9].hashCode();
        }
        return this.f27144v.size() > 0 ? this.f27144v.hashCode() + i4 : i4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int e6 = e(comparable);
        if (e6 >= 0) {
            return d(e6);
        }
        if (this.f27144v.isEmpty()) {
            return null;
        }
        return this.f27144v.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f27144v.size() + this.f27143u;
    }
}
