package com.gamericefishpro.space.i9;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k6 extends AbstractMap {
    public Object[] d;
    public int e;
    public Map i;
    public boolean v;
    public volatile n6 w;
    public Map y;

    public k6() {
        Map map = Collections.EMPTY_MAP;
        this.i = map;
        this.y = map;
    }

    public final l6 a(int i) {
        if (i < this.e) {
            return (l6) this.d[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        return this.i.isEmpty() ? Collections.EMPTY_SET : this.i.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((l6) this.d[iE]).setValue(obj);
        }
        f();
        if (this.d == null) {
            this.d = new Object[16];
        }
        int i = -(iE + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.e == 16) {
            l6 l6Var = (l6) this.d[15];
            this.e = 15;
            g().put(l6Var.d, l6Var.e);
        }
        Object[] objArr = this.d;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.d[i] = new l6(this, comparable, obj);
        this.e++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.e != 0) {
            this.d = null;
            this.e = 0;
        }
        if (this.i.isEmpty()) {
            return;
        }
        this.i.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.i.containsKey(comparable);
    }

    public final Object d(int i) {
        f();
        Object[] objArr = this.d;
        Object obj = ((l6) objArr[i]).e;
        System.arraycopy(objArr, i + 1, objArr, i, (this.e - i) - 1);
        this.e--;
        if (!this.i.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.d;
            int i2 = this.e;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new l6(this, (Comparable) entry.getKey(), entry.getValue());
            this.e++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i = this.e;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((l6) this.d[i2]).d);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((l6) this.d[i4]).d);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.w == null) {
            this.w = new n6(this, 0);
        }
        return this.w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return super.equals(obj);
        }
        k6 k6Var = (k6) obj;
        int size = size();
        if (size == k6Var.size()) {
            int i = this.e;
            if (i != k6Var.e) {
                return entrySet().equals(k6Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (a(i2).equals(k6Var.a(i2))) {
                }
            }
            if (i != size) {
                return this.i.equals(k6Var.i);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.v) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.i.isEmpty() && !(this.i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.i = treeMap;
            this.y = treeMap.descendingMap();
        }
        return (SortedMap) this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((l6) this.d[iE]).e : this.i.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.e;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.d[i2].hashCode();
        }
        return this.i.size() > 0 ? this.i.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return d(iE);
        }
        if (this.i.isEmpty()) {
            return null;
        }
        return this.i.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.i.size() + this.e;
    }
}
