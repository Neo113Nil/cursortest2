package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zx0 extends java.util.AbstractMap implements java.util.Map, defpackage.ob0 {
    public defpackage.ay0 GE9mJIPrb8gP;
    public int P05cfTpS5W5L;
    public java.lang.Object QiMR8OkAhezm;
    public defpackage.hu WDYagTQQm9ns = new defpackage.hu(19);
    public int e6mdH7fiFuta;
    public defpackage.vp1 oh71FJcDz6S2;

    public zx0(defpackage.ay0 ay0Var) {
        this.oh71FJcDz6S2 = ay0Var.WDYagTQQm9ns;
        this.e6mdH7fiFuta = ay0Var.oh71FJcDz6S2;
        this.GE9mJIPrb8gP = ay0Var;
    }

    public final java.lang.Object JhCgjQRTAOCT(java.lang.Object obj) {
        this.QiMR8OkAhezm = null;
        defpackage.vp1 gUjdnLbkVAaA = this.oh71FJcDz6S2.gUjdnLbkVAaA(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (gUjdnLbkVAaA == null) {
            gUjdnLbkVAaA = defpackage.vp1.WDYagTQQm9ns;
        }
        this.oh71FJcDz6S2 = gUjdnLbkVAaA;
        return this.QiMR8OkAhezm;
    }

    public final void WDYagTQQm9ns(int i) {
        this.e6mdH7fiFuta = i;
        this.P05cfTpS5W5L++;
    }

    public final defpackage.ay0 ZpBGe2uQfcn8() {
        defpackage.vp1 vp1Var = this.oh71FJcDz6S2;
        defpackage.ay0 ay0Var = this.GE9mJIPrb8gP;
        if (vp1Var != ay0Var.WDYagTQQm9ns) {
            this.WDYagTQQm9ns = new defpackage.hu(19);
            ay0Var = new defpackage.ay0(this.oh71FJcDz6S2, this.e6mdH7fiFuta);
        }
        this.GE9mJIPrb8gP = ay0Var;
        return ay0Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.oh71FJcDz6S2 = defpackage.vp1.WDYagTQQm9ns;
        WDYagTQQm9ns(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof defpackage.t21) {
            return giKS3J6vZuNy((defpackage.t21) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof defpackage.vs1) {
            return super.containsValue((defpackage.vs1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return new defpackage.ey0(0, this);
    }

    public final java.lang.Object fWTAfUmVKrZq(java.lang.Object obj) {
        return this.oh71FJcDz6S2.QiMR8OkAhezm(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof defpackage.t21) {
            return (defpackage.vs1) fWTAfUmVKrZq((defpackage.t21) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof defpackage.t21) ? obj2 : (defpackage.vs1) super.getOrDefault((defpackage.t21) obj, (defpackage.vs1) obj2);
    }

    public final boolean giKS3J6vZuNy(java.lang.Object obj) {
        return this.oh71FJcDz6S2.JhCgjQRTAOCT(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        return new defpackage.ey0(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        this.QiMR8OkAhezm = null;
        this.oh71FJcDz6S2 = this.oh71FJcDz6S2.fNwYGHIYeJcR(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.QiMR8OkAhezm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [by0] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        defpackage.ay0 ay0Var = null;
        defpackage.ay0 ay0Var2 = map instanceof defpackage.by0 ? (defpackage.by0) map : null;
        if (ay0Var2 == null) {
            defpackage.zx0 zx0Var = map instanceof defpackage.zx0 ? (defpackage.zx0) map : null;
            if (zx0Var != null) {
                ay0Var = zx0Var.ZpBGe2uQfcn8();
            }
        } else {
            ay0Var = ay0Var2;
        }
        if (ay0Var == null) {
            super.putAll(map);
            return;
        }
        defpackage.gp gpVar = new defpackage.gp();
        gpVar.ZpBGe2uQfcn8 = 0;
        int i = this.e6mdH7fiFuta;
        defpackage.vp1 vp1Var = this.oh71FJcDz6S2;
        defpackage.vp1 vp1Var2 = ay0Var.WDYagTQQm9ns;
        vp1Var2.getClass();
        this.oh71FJcDz6S2 = vp1Var.h3m55N1URyyK(vp1Var2, 0, gpVar, this);
        int i2 = (ay0Var.oh71FJcDz6S2 + i) - gpVar.ZpBGe2uQfcn8;
        if (i != i2) {
            WDYagTQQm9ns(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e6mdH7fiFuta;
        defpackage.vp1 T1fB7bDYiVJQ = this.oh71FJcDz6S2.T1fB7bDYiVJQ(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (T1fB7bDYiVJQ == null) {
            T1fB7bDYiVJQ = defpackage.vp1.WDYagTQQm9ns;
        }
        this.oh71FJcDz6S2 = T1fB7bDYiVJQ;
        return i != this.e6mdH7fiFuta;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.e6mdH7fiFuta;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        return new defpackage.ek0(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof defpackage.t21) {
            return (defpackage.vs1) JhCgjQRTAOCT((defpackage.t21) obj);
        }
        return null;
    }
}
