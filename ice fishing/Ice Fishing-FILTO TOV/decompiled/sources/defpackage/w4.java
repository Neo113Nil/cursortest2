package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class w4 extends AbstractSet {
    public final /* synthetic */ Map EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ w4(Map map, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((e31) this.EljAMC1QTz).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.OOA6hdeuvCS) {
            case 1:
                ((e31) this.EljAMC1QTz).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((e31) this.EljAMC1QTz).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.OOA6hdeuvCS;
        Map map = this.EljAMC1QTz;
        switch (i) {
            case 0:
                return new z4((b5) map);
            default:
                return new g31((e31) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((e31) this.EljAMC1QTz).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.OOA6hdeuvCS;
        Map map = this.EljAMC1QTz;
        switch (i) {
            case 0:
                return ((b5) map).AvO7iQsrTN;
            default:
                return ((e31) map).size();
        }
    }
}
