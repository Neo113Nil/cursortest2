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

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2358f = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f2359a;

    /* renamed from: b, reason: collision with root package name */
    public Map f2360b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2361c;

    /* renamed from: d, reason: collision with root package name */
    public volatile b0 f2362d;

    /* renamed from: e, reason: collision with root package name */
    public Map f2363e;

    public static Y f() {
        Y y2 = new Y();
        y2.f2359a = Collections.emptyList();
        y2.f2360b = Collections.emptyMap();
        y2.f2363e = Collections.emptyMap();
        return y2;
    }

    public final int a(Comparable comparable) {
        int i2;
        int size = this.f2359a.size();
        int i3 = size - 1;
        if (i3 >= 0) {
            int compareTo = comparable.compareTo(((Z) this.f2359a.get(i3)).f2364a);
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
            int compareTo2 = comparable.compareTo(((Z) this.f2359a.get(i5)).f2364a);
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
        if (this.f2361c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i2) {
        return (Map.Entry) this.f2359a.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f2359a.isEmpty()) {
            this.f2359a.clear();
        }
        if (this.f2360b.isEmpty()) {
            return;
        }
        this.f2360b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f2360b.containsKey(comparable);
    }

    public final Set d() {
        return this.f2360b.isEmpty() ? Collections.emptySet() : this.f2360b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f2360b.isEmpty() && !(this.f2360b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2360b = treeMap;
            this.f2363e = treeMap.descendingMap();
        }
        return (SortedMap) this.f2360b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f2362d == null) {
            this.f2362d = new b0(this);
        }
        return this.f2362d;
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
        int size2 = this.f2359a.size();
        if (size2 != y2.f2359a.size()) {
            return ((AbstractSet) entrySet()).equals(y2.entrySet());
        }
        for (int i2 = 0; i2 < size2; i2++) {
            if (!c(i2).equals(y2.c(i2))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f2360b.equals(y2.f2360b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((Z) this.f2359a.get(a2)).setValue(obj);
        }
        b();
        if (this.f2359a.isEmpty() && !(this.f2359a instanceof ArrayList)) {
            this.f2359a = new ArrayList(16);
        }
        int i2 = -(a2 + 1);
        if (i2 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f2359a.size() == 16) {
            Z z2 = (Z) this.f2359a.remove(15);
            e().put(z2.f2364a, z2.f2365b);
        }
        this.f2359a.add(i2, new Z(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? ((Z) this.f2359a.get(a2)).f2365b : this.f2360b.get(comparable);
    }

    public final Object h(int i2) {
        b();
        Object obj = ((Z) this.f2359a.remove(i2)).f2365b;
        if (!this.f2360b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f2359a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Z(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f2359a.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((Z) this.f2359a.get(i3)).hashCode();
        }
        return this.f2360b.size() > 0 ? i2 + this.f2360b.hashCode() : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return h(a2);
        }
        if (this.f2360b.isEmpty()) {
            return null;
        }
        return this.f2360b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2360b.size() + this.f2359a.size();
    }
}
