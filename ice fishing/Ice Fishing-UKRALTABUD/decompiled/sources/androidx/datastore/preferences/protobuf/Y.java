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

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f1398k = 0;

    /* renamed from: f, reason: collision with root package name */
    public List f1399f;

    /* renamed from: g, reason: collision with root package name */
    public Map f1400g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1401h;

    /* renamed from: i, reason: collision with root package name */
    public volatile b0 f1402i;

    /* renamed from: j, reason: collision with root package name */
    public Map f1403j;

    public static Y f() {
        Y y2 = new Y();
        y2.f1399f = Collections.emptyList();
        y2.f1400g = Collections.emptyMap();
        y2.f1403j = Collections.emptyMap();
        return y2;
    }

    public final int a(Comparable comparable) {
        int i2;
        int size = this.f1399f.size();
        int i3 = size - 1;
        if (i3 >= 0) {
            int compareTo = comparable.compareTo(((Z) this.f1399f.get(i3)).f1404f);
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
            int compareTo2 = comparable.compareTo(((Z) this.f1399f.get(i5)).f1404f);
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
        if (this.f1401h) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i2) {
        return (Map.Entry) this.f1399f.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f1399f.isEmpty()) {
            this.f1399f.clear();
        }
        if (this.f1400g.isEmpty()) {
            return;
        }
        this.f1400g.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f1400g.containsKey(comparable);
    }

    public final Set d() {
        return this.f1400g.isEmpty() ? Collections.emptySet() : this.f1400g.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f1400g.isEmpty() && !(this.f1400g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1400g = treeMap;
            this.f1403j = treeMap.descendingMap();
        }
        return (SortedMap) this.f1400g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f1402i == null) {
            this.f1402i = new b0(this);
        }
        return this.f1402i;
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
        int size2 = this.f1399f.size();
        if (size2 != y2.f1399f.size()) {
            return ((AbstractSet) entrySet()).equals(y2.entrySet());
        }
        for (int i2 = 0; i2 < size2; i2++) {
            if (!c(i2).equals(y2.c(i2))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f1400g.equals(y2.f1400g);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((Z) this.f1399f.get(a2)).setValue(obj);
        }
        b();
        if (this.f1399f.isEmpty() && !(this.f1399f instanceof ArrayList)) {
            this.f1399f = new ArrayList(16);
        }
        int i2 = -(a2 + 1);
        if (i2 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f1399f.size() == 16) {
            Z z2 = (Z) this.f1399f.remove(15);
            e().put(z2.f1404f, z2.f1405g);
        }
        this.f1399f.add(i2, new Z(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? ((Z) this.f1399f.get(a2)).f1405g : this.f1400g.get(comparable);
    }

    public final Object h(int i2) {
        b();
        Object obj = ((Z) this.f1399f.remove(i2)).f1405g;
        if (!this.f1400g.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f1399f;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Z(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f1399f.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((Z) this.f1399f.get(i3)).hashCode();
        }
        return this.f1400g.size() > 0 ? i2 + this.f1400g.hashCode() : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return h(a2);
        }
        if (this.f1400g.isEmpty()) {
            return null;
        }
        return this.f1400g.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1400g.size() + this.f1399f.size();
    }
}
