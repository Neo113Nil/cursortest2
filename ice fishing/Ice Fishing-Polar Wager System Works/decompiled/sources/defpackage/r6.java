package defpackage;

/* loaded from: classes.dex */
public final class r6 extends defpackage.s91 implements java.util.Map {
    public defpackage.m6 EXtogiMhuM;
    public defpackage.q6 SH1y5HwkJhh;
    public defpackage.o6 riuEU0zW4;

    public final boolean SH1y5HwkJhh(java.util.Collection collection) {
        int i = this.AARZUJiTa;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.AARZUJiTa;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        defpackage.m6 m6Var = this.EXtogiMhuM;
        if (m6Var != null) {
            return m6Var;
        }
        defpackage.m6 m6Var2 = new defpackage.m6(this, 0);
        this.EXtogiMhuM = m6Var2;
        return m6Var2;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        defpackage.o6 o6Var = this.riuEU0zW4;
        if (o6Var != null) {
            return o6Var;
        }
        defpackage.o6 o6Var2 = new defpackage.o6(this);
        this.riuEU0zW4 = o6Var2;
        return o6Var2;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        int size = map.size() + this.AARZUJiTa;
        int i = this.AARZUJiTa;
        int[] iArr = this.adDC3e2L;
        if (iArr.length < size) {
            this.adDC3e2L = java.util.Arrays.copyOf(iArr, size);
            this.xiZrDbcSW0 = java.util.Arrays.copyOf(this.xiZrDbcSW0, size * 2);
        }
        if (this.AARZUJiTa != i) {
            throw new java.util.ConcurrentModificationException();
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final boolean riuEU0zW4(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        defpackage.q6 q6Var = this.SH1y5HwkJhh;
        if (q6Var != null) {
            return q6Var;
        }
        defpackage.q6 q6Var2 = new defpackage.q6(this);
        this.SH1y5HwkJhh = q6Var2;
        return q6Var2;
    }
}
