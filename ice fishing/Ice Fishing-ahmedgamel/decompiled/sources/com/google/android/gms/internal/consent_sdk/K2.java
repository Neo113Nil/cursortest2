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
    public static final /* synthetic */ int f36325z = 0;

    /* renamed from: n, reason: collision with root package name */
    public Object[] f36326n;

    /* renamed from: u, reason: collision with root package name */
    public int f36327u;

    /* renamed from: v, reason: collision with root package name */
    public Map f36328v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f36329w;

    /* renamed from: x, reason: collision with root package name */
    public volatile IL f36330x;

    /* renamed from: y, reason: collision with root package name */
    public Map f36331y;

    public K2() {
        Map map = Collections.EMPTY_MAP;
        this.f36328v = map;
        this.f36331y = map;
    }

    public final Set a() {
        return this.f36328v.isEmpty() ? Collections.EMPTY_SET : this.f36328v.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int d9 = d(comparable);
        if (d9 >= 0) {
            return ((L2) this.f36326n[d9]).setValue(obj);
        }
        g();
        if (this.f36326n == null) {
            this.f36326n = new Object[16];
        }
        int i = -(d9 + 1);
        if (i >= 16) {
            return f().put(comparable, obj);
        }
        if (this.f36327u == 16) {
            L2 l22 = (L2) this.f36326n[15];
            this.f36327u = 15;
            f().put(l22.f36334n, l22.f36335u);
        }
        Object[] objArr = this.f36326n;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f36326n[i] = new L2(this, comparable, obj);
        this.f36327u++;
        return null;
    }

    public final L2 c(int i) {
        if (i < this.f36327u) {
            return (L2) this.f36326n[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.f36327u != 0) {
            this.f36326n = null;
            this.f36327u = 0;
        }
        if (this.f36328v.isEmpty()) {
            return;
        }
        this.f36328v.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return d(comparable) >= 0 || this.f36328v.containsKey(comparable);
    }

    public final int d(Comparable comparable) {
        int i = this.f36327u;
        int i4 = i - 1;
        int i6 = 0;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo(((L2) this.f36326n[i4]).f36334n);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i4;
            }
        }
        while (i6 <= i4) {
            int i9 = (i6 + i4) / 2;
            int compareTo2 = comparable.compareTo(((L2) this.f36326n[i9]).f36334n);
            if (compareTo2 < 0) {
                i4 = i9 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i9;
                }
                i6 = i9 + 1;
            }
        }
        return -(i6 + 1);
    }

    public final Object e(int i) {
        g();
        Object[] objArr = this.f36326n;
        Object obj = ((L2) objArr[i]).f36335u;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f36327u - i) - 1);
        this.f36327u--;
        if (!this.f36328v.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            Object[] objArr2 = this.f36326n;
            int i4 = this.f36327u;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i4] = new L2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f36327u++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f36330x == null) {
            this.f36330x = new IL(this, 1);
        }
        return this.f36330x;
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
            int i = this.f36327u;
            if (i != k22.f36327u) {
                return entrySet().equals(k22.entrySet());
            }
            for (int i4 = 0; i4 < i; i4++) {
                if (c(i4).equals(k22.c(i4))) {
                }
            }
            if (i != size) {
                return this.f36328v.equals(k22.f36328v);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        g();
        if (this.f36328v.isEmpty() && !(this.f36328v instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f36328v = treeMap;
            this.f36331y = treeMap.descendingMap();
        }
        return (SortedMap) this.f36328v;
    }

    public final void g() {
        if (this.f36329w) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d9 = d(comparable);
        return d9 >= 0 ? ((L2) this.f36326n[d9]).f36335u : this.f36328v.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f36327u;
        int i4 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            i4 += this.f36326n[i6].hashCode();
        }
        return this.f36328v.size() > 0 ? this.f36328v.hashCode() + i4 : i4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int d9 = d(comparable);
        if (d9 >= 0) {
            return e(d9);
        }
        if (this.f36328v.isEmpty()) {
            return null;
        }
        return this.f36328v.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f36328v.size() + this.f36327u;
    }
}
