package androidx.datastore.preferences.protobuf;

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

/* loaded from: classes.dex */
public final class Y extends AbstractMap {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f1406j = 0;

    /* renamed from: e, reason: collision with root package name */
    public List f1407e;

    /* renamed from: f, reason: collision with root package name */
    public Map f1408f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1409g;

    /* renamed from: h, reason: collision with root package name */
    public volatile b0 f1410h;

    /* renamed from: i, reason: collision with root package name */
    public Map f1411i;

    public static Y f() {
        Y y2 = new Y();
        y2.f1407e = Collections.emptyList();
        y2.f1408f = Collections.emptyMap();
        y2.f1411i = Collections.emptyMap();
        return y2;
    }

    public final int a(Comparable comparable) {
        int i2;
        int size = this.f1407e.size();
        int i3 = size - 1;
        if (i3 >= 0) {
            int compareTo = comparable.compareTo(((Z) this.f1407e.get(i3)).f1412e);
            if (compareTo > 0) {
                i2 = size + 1;
                return -i2;
            }
            if (compareTo == 0) {
                return i3;
            }
        }
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int compareTo2 = comparable.compareTo(((Z) this.f1407e.get(i5)).f1412e);
            if (compareTo2 < 0) {
                i3 = i5 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i5;
                }
                i4 = i5 + 1;
            }
        }
        i2 = i4 + 1;
        return -i2;
    }

    public final void b() {
        if (this.f1409g) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i2) {
        return (Map.Entry) this.f1407e.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f1407e.isEmpty()) {
            this.f1407e.clear();
        }
        if (this.f1408f.isEmpty()) {
            return;
        }
        this.f1408f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f1408f.containsKey(comparable);
    }

    public final Set d() {
        return this.f1408f.isEmpty() ? Collections.emptySet() : this.f1408f.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f1408f.isEmpty() && !(this.f1408f instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1408f = treeMap;
            this.f1411i = treeMap.descendingMap();
        }
        return (SortedMap) this.f1408f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f1410h == null) {
            this.f1410h = new b0(this);
        }
        return this.f1410h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return super.equals(obj);
        }
        Y y2 = (Y) obj;
        int size = size();
        if (size != y2.size()) {
            return false;
        }
        int size2 = this.f1407e.size();
        if (size2 != y2.f1407e.size()) {
            return ((AbstractSet) entrySet()).equals(y2.entrySet());
        }
        for (int i2 = 0; i2 < size2; i2++) {
            if (!c(i2).equals(y2.c(i2))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f1408f.equals(y2.f1408f);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((Z) this.f1407e.get(a2)).setValue(obj);
        }
        b();
        if (this.f1407e.isEmpty() && !(this.f1407e instanceof ArrayList)) {
            this.f1407e = new ArrayList(16);
        }
        int i2 = -(a2 + 1);
        if (i2 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f1407e.size() == 16) {
            Z z2 = (Z) this.f1407e.remove(15);
            e().put(z2.f1412e, z2.f1413f);
        }
        this.f1407e.add(i2, new Z(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? ((Z) this.f1407e.get(a2)).f1413f : this.f1408f.get(comparable);
    }

    public final Object h(int i2) {
        b();
        Object obj = ((Z) this.f1407e.remove(i2)).f1413f;
        if (!this.f1408f.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f1407e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Z(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f1407e.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((Z) this.f1407e.get(i3)).hashCode();
        }
        return this.f1408f.size() > 0 ? i2 + this.f1408f.hashCode() : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return h(a2);
        }
        if (this.f1408f.isEmpty()) {
            return null;
        }
        return this.f1408f.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1408f.size() + this.f1407e.size();
    }
}
