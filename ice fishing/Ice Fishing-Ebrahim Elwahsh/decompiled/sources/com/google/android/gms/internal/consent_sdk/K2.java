package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.ads.TL;
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
    public static final /* synthetic */ int f35719z = 0;

    /* renamed from: n, reason: collision with root package name */
    public Object[] f35720n;

    /* renamed from: u, reason: collision with root package name */
    public int f35721u;

    /* renamed from: v, reason: collision with root package name */
    public Map f35722v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f35723w;

    /* renamed from: x, reason: collision with root package name */
    public volatile TL f35724x;

    /* renamed from: y, reason: collision with root package name */
    public Map f35725y;

    public K2() {
        Map map = Collections.EMPTY_MAP;
        this.f35722v = map;
        this.f35725y = map;
    }

    public final Set a() {
        return this.f35722v.isEmpty() ? Collections.EMPTY_SET : this.f35722v.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int d2 = d(comparable);
        if (d2 >= 0) {
            return ((L2) this.f35720n[d2]).setValue(obj);
        }
        g();
        if (this.f35720n == null) {
            this.f35720n = new Object[16];
        }
        int i = -(d2 + 1);
        if (i >= 16) {
            return f().put(comparable, obj);
        }
        if (this.f35721u == 16) {
            L2 l22 = (L2) this.f35720n[15];
            this.f35721u = 15;
            f().put(l22.f35728n, l22.f35729u);
        }
        Object[] objArr = this.f35720n;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f35720n[i] = new L2(this, comparable, obj);
        this.f35721u++;
        return null;
    }

    public final L2 c(int i) {
        if (i < this.f35721u) {
            return (L2) this.f35720n[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.f35721u != 0) {
            this.f35720n = null;
            this.f35721u = 0;
        }
        if (this.f35722v.isEmpty()) {
            return;
        }
        this.f35722v.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return d(comparable) >= 0 || this.f35722v.containsKey(comparable);
    }

    public final int d(Comparable comparable) {
        int i = this.f35721u;
        int i4 = i - 1;
        int i9 = 0;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo(((L2) this.f35720n[i4]).f35728n);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i4;
            }
        }
        while (i9 <= i4) {
            int i10 = (i9 + i4) / 2;
            int compareTo2 = comparable.compareTo(((L2) this.f35720n[i10]).f35728n);
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

    public final Object e(int i) {
        g();
        Object[] objArr = this.f35720n;
        Object obj = ((L2) objArr[i]).f35729u;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f35721u - i) - 1);
        this.f35721u--;
        if (!this.f35722v.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            Object[] objArr2 = this.f35720n;
            int i4 = this.f35721u;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i4] = new L2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f35721u++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f35724x == null) {
            this.f35724x = new TL(this, 1);
        }
        return this.f35724x;
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
            int i = this.f35721u;
            if (i != k22.f35721u) {
                return entrySet().equals(k22.entrySet());
            }
            for (int i4 = 0; i4 < i; i4++) {
                if (c(i4).equals(k22.c(i4))) {
                }
            }
            if (i != size) {
                return this.f35722v.equals(k22.f35722v);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        g();
        if (this.f35722v.isEmpty() && !(this.f35722v instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f35722v = treeMap;
            this.f35725y = treeMap.descendingMap();
        }
        return (SortedMap) this.f35722v;
    }

    public final void g() {
        if (this.f35723w) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d2 = d(comparable);
        return d2 >= 0 ? ((L2) this.f35720n[d2]).f35729u : this.f35722v.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f35721u;
        int i4 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i4 += this.f35720n[i9].hashCode();
        }
        return this.f35722v.size() > 0 ? this.f35722v.hashCode() + i4 : i4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int d2 = d(comparable);
        if (d2 >= 0) {
            return e(d2);
        }
        if (this.f35722v.isEmpty()) {
            return null;
        }
        return this.f35722v.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f35722v.size() + this.f35721u;
    }
}
