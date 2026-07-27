package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.ads.IL;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class K2 extends AbstractMap {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f35556z = 0;

    /* renamed from: n, reason: collision with root package name */
    public Object[] f35557n;

    /* renamed from: u, reason: collision with root package name */
    public int f35558u;

    /* renamed from: v, reason: collision with root package name */
    public Map f35559v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f35560w;

    /* renamed from: x, reason: collision with root package name */
    public volatile IL f35561x;

    /* renamed from: y, reason: collision with root package name */
    public Map f35562y;

    public K2() {
        Map map = Collections.EMPTY_MAP;
        this.f35559v = map;
        this.f35562y = map;
    }

    public final Set a() {
        return this.f35559v.isEmpty() ? Collections.EMPTY_SET : this.f35559v.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int d2 = d(comparable);
        if (d2 >= 0) {
            return ((L2) this.f35557n[d2]).setValue(obj);
        }
        g();
        if (this.f35557n == null) {
            this.f35557n = new Object[16];
        }
        int i = -(d2 + 1);
        if (i >= 16) {
            return f().put(comparable, obj);
        }
        if (this.f35558u == 16) {
            L2 l22 = (L2) this.f35557n[15];
            this.f35558u = 15;
            f().put(l22.f35565n, l22.f35566u);
        }
        Object[] objArr = this.f35557n;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f35557n[i] = new L2(this, comparable, obj);
        this.f35558u++;
        return null;
    }

    public final L2 c(int i) {
        if (i < this.f35558u) {
            return (L2) this.f35557n[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.f35558u != 0) {
            this.f35557n = null;
            this.f35558u = 0;
        }
        if (this.f35559v.isEmpty()) {
            return;
        }
        this.f35559v.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return d(comparable) >= 0 || this.f35559v.containsKey(comparable);
    }

    public final int d(Comparable comparable) {
        int i = this.f35558u;
        int i6 = i - 1;
        int i9 = 0;
        if (i6 >= 0) {
            int compareTo = comparable.compareTo(((L2) this.f35557n[i6]).f35565n);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i6;
            }
        }
        while (i9 <= i6) {
            int i10 = (i9 + i6) / 2;
            int compareTo2 = comparable.compareTo(((L2) this.f35557n[i10]).f35565n);
            if (compareTo2 < 0) {
                i6 = i10 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i10;
                }
                i9 = i10 + 1;
            }
        }
        return -(i9 + 1);
    }

    public final Object e(int i) {
        g();
        Object[] objArr = this.f35557n;
        Object obj = ((L2) objArr[i]).f35566u;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f35558u - i) - 1);
        this.f35558u--;
        if (!this.f35559v.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            Object[] objArr2 = this.f35557n;
            int i6 = this.f35558u;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i6] = new L2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f35558u++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f35561x == null) {
            this.f35561x = new IL(this, 1);
        }
        return this.f35561x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K2)) {
            return super.equals(obj);
        }
        K2 k22 = (K2) obj;
        int size = size();
        if (size == k22.size()) {
            int i = this.f35558u;
            if (i != k22.f35558u) {
                return entrySet().equals(k22.entrySet());
            }
            for (int i6 = 0; i6 < i; i6++) {
                if (c(i6).equals(k22.c(i6))) {
                }
            }
            if (i != size) {
                return this.f35559v.equals(k22.f35559v);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        g();
        if (this.f35559v.isEmpty() && !(this.f35559v instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f35559v = treeMap;
            this.f35562y = treeMap.descendingMap();
        }
        return (SortedMap) this.f35559v;
    }

    public final void g() {
        if (this.f35560w) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d2 = d(comparable);
        return d2 >= 0 ? ((L2) this.f35557n[d2]).f35566u : this.f35559v.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f35558u;
        int i6 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i6 += this.f35557n[i9].hashCode();
        }
        return this.f35559v.size() > 0 ? this.f35559v.hashCode() + i6 : i6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int d2 = d(comparable);
        if (d2 >= 0) {
            return e(d2);
        }
        if (this.f35559v.isEmpty()) {
            return null;
        }
        return this.f35559v.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f35559v.size() + this.f35558u;
    }
}
