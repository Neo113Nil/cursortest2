package defpackage;

/* loaded from: classes.dex */
public final class ka1 extends java.util.AbstractMap {
    public static final /* synthetic */ int SH1y5HwkJhh = 0;
    public boolean AARZUJiTa;
    public volatile defpackage.m6 EXtogiMhuM;
    public java.util.List adDC3e2L;
    public java.util.Map riuEU0zW4;
    public java.util.Map xiZrDbcSW0;

    public static defpackage.ka1 xiZrDbcSW0() {
        defpackage.ka1 ka1Var = new defpackage.ka1();
        ka1Var.adDC3e2L = java.util.Collections.EMPTY_LIST;
        java.util.Map map = java.util.Collections.EMPTY_MAP;
        ka1Var.xiZrDbcSW0 = map;
        ka1Var.riuEU0zW4 = map;
        return ka1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: AARZUJiTa, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        oh6vYeIP();
        int IHQe1A4L2xu = IHQe1A4L2xu(comparable);
        if (IHQe1A4L2xu >= 0) {
            return ((defpackage.la1) this.adDC3e2L.get(IHQe1A4L2xu)).setValue(obj);
        }
        oh6vYeIP();
        if (this.adDC3e2L.isEmpty() && !(this.adDC3e2L instanceof java.util.ArrayList)) {
            this.adDC3e2L = new java.util.ArrayList(16);
        }
        int i = -(IHQe1A4L2xu + 1);
        if (i >= 16) {
            return adDC3e2L().put(comparable, obj);
        }
        if (this.adDC3e2L.size() == 16) {
            defpackage.la1 la1Var = (defpackage.la1) this.adDC3e2L.remove(15);
            adDC3e2L().put(la1Var.adDC3e2L, la1Var.xiZrDbcSW0);
        }
        this.adDC3e2L.add(i, new defpackage.la1(this, comparable, obj));
        return null;
    }

    public final java.lang.Object EXtogiMhuM(int i) {
        oh6vYeIP();
        java.lang.Object obj = ((defpackage.la1) this.adDC3e2L.remove(i)).xiZrDbcSW0;
        if (!this.xiZrDbcSW0.isEmpty()) {
            java.util.Iterator it = adDC3e2L().entrySet().iterator();
            java.util.List list = this.adDC3e2L;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            list.add(new defpackage.la1(this, (java.lang.Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final java.util.Set F7NU4MC0GW() {
        return this.xiZrDbcSW0.isEmpty() ? java.util.Collections.EMPTY_SET : this.xiZrDbcSW0.entrySet();
    }

    public final int IHQe1A4L2xu(java.lang.Comparable comparable) {
        int i;
        int size = this.adDC3e2L.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((defpackage.la1) this.adDC3e2L.get(i2)).adDC3e2L);
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
            int compareTo2 = comparable.compareTo(((defpackage.la1) this.adDC3e2L.get(i4)).adDC3e2L);
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

    public final java.util.SortedMap adDC3e2L() {
        oh6vYeIP();
        if (this.xiZrDbcSW0.isEmpty() && !(this.xiZrDbcSW0 instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.xiZrDbcSW0 = treeMap;
            this.riuEU0zW4 = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.xiZrDbcSW0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        oh6vYeIP();
        if (!this.adDC3e2L.isEmpty()) {
            this.adDC3e2L.clear();
        }
        if (this.xiZrDbcSW0.isEmpty()) {
            return;
        }
        this.xiZrDbcSW0.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return IHQe1A4L2xu(comparable) >= 0 || this.xiZrDbcSW0.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.EXtogiMhuM == null) {
            this.EXtogiMhuM = new defpackage.m6(this, 1);
        }
        return this.EXtogiMhuM;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ka1)) {
            return super.equals(obj);
        }
        defpackage.ka1 ka1Var = (defpackage.ka1) obj;
        int size = size();
        if (size == ka1Var.size()) {
            int size2 = this.adDC3e2L.size();
            if (size2 != ka1Var.adDC3e2L.size()) {
                return ((java.util.AbstractSet) entrySet()).equals(ka1Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (r1MBDhnF(i).equals(ka1Var.r1MBDhnF(i))) {
                }
            }
            if (size2 != size) {
                return this.xiZrDbcSW0.equals(ka1Var.xiZrDbcSW0);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int IHQe1A4L2xu = IHQe1A4L2xu(comparable);
        return IHQe1A4L2xu >= 0 ? ((defpackage.la1) this.adDC3e2L.get(IHQe1A4L2xu)).xiZrDbcSW0 : this.xiZrDbcSW0.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.adDC3e2L.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((defpackage.la1) this.adDC3e2L.get(i2)).hashCode();
        }
        return this.xiZrDbcSW0.size() > 0 ? this.xiZrDbcSW0.hashCode() + i : i;
    }

    public final void oh6vYeIP() {
        if (this.AARZUJiTa) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final java.util.Map.Entry r1MBDhnF(int i) {
        return (java.util.Map.Entry) this.adDC3e2L.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        oh6vYeIP();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int IHQe1A4L2xu = IHQe1A4L2xu(comparable);
        if (IHQe1A4L2xu >= 0) {
            return EXtogiMhuM(IHQe1A4L2xu);
        }
        if (this.xiZrDbcSW0.isEmpty()) {
            return null;
        }
        return this.xiZrDbcSW0.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.xiZrDbcSW0.size() + this.adDC3e2L.size();
    }
}
