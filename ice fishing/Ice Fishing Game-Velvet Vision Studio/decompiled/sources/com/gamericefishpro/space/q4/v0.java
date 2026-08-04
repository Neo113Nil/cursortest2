package com.gamericefishpro.space.q4;

import com.gamericefishpro.space.i9.n6;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends AbstractMap {
    public static final /* synthetic */ int y = 0;
    public List d;
    public Map e;
    public boolean i;
    public volatile n6 v;
    public Map w;

    public static v0 f() {
        v0 v0Var = new v0();
        v0Var.d = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        v0Var.e = map;
        v0Var.w = map;
        return v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.d.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((w0) this.d.get(i3)).d);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((w0) this.d.get(i4)).d);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((w0) this.d.get(i3)).d);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final void b() {
        if (this.i) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.d.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
        if (this.e.isEmpty()) {
            return;
        }
        this.e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.e.containsKey(comparable);
    }

    public final Set d() {
        return this.e.isEmpty() ? Collections.EMPTY_SET : this.e.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.e.isEmpty() && !(this.e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.e = treeMap;
            this.w = treeMap.descendingMap();
        }
        return (SortedMap) this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.v == null) {
            this.v = new n6(this, 1);
        }
        return this.v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return super.equals(obj);
        }
        v0 v0Var = (v0) obj;
        int size = size();
        if (size == v0Var.size()) {
            int size2 = this.d.size();
            if (size2 != v0Var.d.size()) {
                return ((AbstractSet) entrySet()).equals(v0Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(v0Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.e.equals(v0Var.e);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((w0) this.d.get(iA)).setValue(obj);
        }
        b();
        if (this.d.isEmpty() && !(this.d instanceof ArrayList)) {
            this.d = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.d.size() == 16) {
            w0 w0Var = (w0) this.d.remove(15);
            e().put(w0Var.d, w0Var.e);
        }
        this.d.add(i, new w0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((w0) this.d.get(iA)).e : this.e.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((w0) this.d.remove(i)).e;
        if (!this.e.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.d;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new w0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.d.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((w0) this.d.get(i)).hashCode();
        }
        return this.e.size() > 0 ? this.e.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.e.isEmpty()) {
            return null;
        }
        return this.e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.e.size() + this.d.size();
    }
}
