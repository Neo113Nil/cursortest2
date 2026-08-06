package defpackage;

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

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class e31 extends AbstractMap {
    public static final /* synthetic */ int JFJ3QoxA = 0;
    public boolean AvO7iQsrTN;
    public Map EljAMC1QTz;
    public List OOA6hdeuvCS;
    public volatile w4 encWxUiV2;
    public Map mOu10nynGul;

    public static e31 EljAMC1QTz() {
        e31 e31Var = new e31();
        e31Var.OOA6hdeuvCS = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        e31Var.EljAMC1QTz = map;
        e31Var.mOu10nynGul = map;
        return e31Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: AvO7iQsrTN, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        Yi7zF1RB1();
        int GWasM1elztuh = GWasM1elztuh(comparable);
        if (GWasM1elztuh >= 0) {
            return ((f31) this.OOA6hdeuvCS.get(GWasM1elztuh)).setValue(obj);
        }
        Yi7zF1RB1();
        if (this.OOA6hdeuvCS.isEmpty() && !(this.OOA6hdeuvCS instanceof ArrayList)) {
            this.OOA6hdeuvCS = new ArrayList(16);
        }
        int i = -(GWasM1elztuh + 1);
        if (i >= 16) {
            return OOA6hdeuvCS().put(comparable, obj);
        }
        if (this.OOA6hdeuvCS.size() == 16) {
            f31 f31Var = (f31) this.OOA6hdeuvCS.remove(15);
            OOA6hdeuvCS().put(f31Var.OOA6hdeuvCS, f31Var.EljAMC1QTz);
        }
        this.OOA6hdeuvCS.add(i, new f31(this, comparable, obj));
        return null;
    }

    public final int GWasM1elztuh(Comparable comparable) {
        int i;
        int size = this.OOA6hdeuvCS.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((f31) this.OOA6hdeuvCS.get(i2)).OOA6hdeuvCS);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((f31) this.OOA6hdeuvCS.get(i4)).OOA6hdeuvCS);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final SortedMap OOA6hdeuvCS() {
        Yi7zF1RB1();
        if (this.EljAMC1QTz.isEmpty() && !(this.EljAMC1QTz instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.EljAMC1QTz = treeMap;
            this.mOu10nynGul = treeMap.descendingMap();
        }
        return (SortedMap) this.EljAMC1QTz;
    }

    public final Map.Entry X1lG3V04pd(int i) {
        return (Map.Entry) this.OOA6hdeuvCS.get(i);
    }

    public final void Yi7zF1RB1() {
        if (this.AvO7iQsrTN) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Yi7zF1RB1();
        if (!this.OOA6hdeuvCS.isEmpty()) {
            this.OOA6hdeuvCS.clear();
        }
        if (this.EljAMC1QTz.isEmpty()) {
            return;
        }
        this.EljAMC1QTz.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return GWasM1elztuh(comparable) >= 0 || this.EljAMC1QTz.containsKey(comparable);
    }

    public final Object encWxUiV2(int i) {
        Yi7zF1RB1();
        Object obj = ((f31) this.OOA6hdeuvCS.remove(i)).EljAMC1QTz;
        if (!this.EljAMC1QTz.isEmpty()) {
            Iterator it = OOA6hdeuvCS().entrySet().iterator();
            List list = this.OOA6hdeuvCS;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new f31(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.encWxUiV2 == null) {
            this.encWxUiV2 = new w4(this, 1);
        }
        return this.encWxUiV2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e31)) {
            return super.equals(obj);
        }
        e31 e31Var = (e31) obj;
        int size = size();
        if (size == e31Var.size()) {
            int size2 = this.OOA6hdeuvCS.size();
            if (size2 != e31Var.OOA6hdeuvCS.size()) {
                return ((AbstractSet) entrySet()).equals(e31Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (X1lG3V04pd(i).equals(e31Var.X1lG3V04pd(i))) {
                }
            }
            if (size2 != size) {
                return this.EljAMC1QTz.equals(e31Var.EljAMC1QTz);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int GWasM1elztuh = GWasM1elztuh(comparable);
        return GWasM1elztuh >= 0 ? ((f31) this.OOA6hdeuvCS.get(GWasM1elztuh)).EljAMC1QTz : this.EljAMC1QTz.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.OOA6hdeuvCS.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((f31) this.OOA6hdeuvCS.get(i2)).hashCode();
        }
        return this.EljAMC1QTz.size() > 0 ? this.EljAMC1QTz.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Yi7zF1RB1();
        Comparable comparable = (Comparable) obj;
        int GWasM1elztuh = GWasM1elztuh(comparable);
        if (GWasM1elztuh >= 0) {
            return encWxUiV2(GWasM1elztuh);
        }
        if (this.EljAMC1QTz.isEmpty()) {
            return null;
        }
        return this.EljAMC1QTz.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.EljAMC1QTz.size() + this.OOA6hdeuvCS.size();
    }

    public final Set xqGvceK5x() {
        return this.EljAMC1QTz.isEmpty() ? Collections.EMPTY_SET : this.EljAMC1QTz.entrySet();
    }
}
