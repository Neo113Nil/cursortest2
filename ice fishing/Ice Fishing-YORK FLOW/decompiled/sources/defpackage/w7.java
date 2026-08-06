package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class w7 extends defpackage.ud1 implements java.util.Map {
    public defpackage.v7 GE9mJIPrb8gP;
    public defpackage.r7 P05cfTpS5W5L;
    public defpackage.t7 e6mdH7fiFuta;

    public final boolean GE9mJIPrb8gP(java.util.Collection collection) {
        int i = this.QiMR8OkAhezm;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.QiMR8OkAhezm;
    }

    public final boolean e6mdH7fiFuta(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        defpackage.r7 r7Var = this.P05cfTpS5W5L;
        if (r7Var != null) {
            return r7Var;
        }
        defpackage.r7 r7Var2 = new defpackage.r7(this);
        this.P05cfTpS5W5L = r7Var2;
        return r7Var2;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        defpackage.t7 t7Var = this.e6mdH7fiFuta;
        if (t7Var != null) {
            return t7Var;
        }
        defpackage.t7 t7Var2 = new defpackage.t7(this);
        this.e6mdH7fiFuta = t7Var2;
        return t7Var2;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        int size = map.size() + this.QiMR8OkAhezm;
        int i = this.QiMR8OkAhezm;
        int[] iArr = this.WDYagTQQm9ns;
        if (iArr.length < size) {
            this.WDYagTQQm9ns = java.util.Arrays.copyOf(iArr, size);
            this.oh71FJcDz6S2 = java.util.Arrays.copyOf(this.oh71FJcDz6S2, size * 2);
        }
        if (this.QiMR8OkAhezm != i) {
            throw new java.util.ConcurrentModificationException();
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        defpackage.v7 v7Var = this.GE9mJIPrb8gP;
        if (v7Var != null) {
            return v7Var;
        }
        defpackage.v7 v7Var2 = new defpackage.v7(this);
        this.GE9mJIPrb8gP = v7Var2;
        return v7Var2;
    }
}
