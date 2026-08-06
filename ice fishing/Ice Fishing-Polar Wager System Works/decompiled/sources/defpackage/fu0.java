package defpackage;

/* loaded from: classes.dex */
public final class fu0 extends java.util.AbstractMap implements java.util.Map, defpackage.h90 {
    public java.lang.Object AARZUJiTa;
    public int EXtogiMhuM;
    public defpackage.gu0 SH1y5HwkJhh;
    public defpackage.ky adDC3e2L = new defpackage.ky(10);
    public int riuEU0zW4;
    public defpackage.yi1 xiZrDbcSW0;

    public fu0(defpackage.gu0 gu0Var) {
        this.xiZrDbcSW0 = gu0Var.adDC3e2L;
        this.riuEU0zW4 = gu0Var.xiZrDbcSW0;
        this.SH1y5HwkJhh = gu0Var;
    }

    public final java.lang.Object F7NU4MC0GW(java.lang.Object obj) {
        this.AARZUJiTa = null;
        defpackage.yi1 SyNS6RMn = this.xiZrDbcSW0.SyNS6RMn(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (SyNS6RMn == null) {
            SyNS6RMn = defpackage.yi1.adDC3e2L;
        }
        this.xiZrDbcSW0 = SyNS6RMn;
        return this.AARZUJiTa;
    }

    public final defpackage.gu0 IHQe1A4L2xu() {
        defpackage.yi1 yi1Var = this.xiZrDbcSW0;
        defpackage.gu0 gu0Var = this.SH1y5HwkJhh;
        if (yi1Var != gu0Var.adDC3e2L) {
            this.adDC3e2L = new defpackage.ky(10);
            gu0Var = new defpackage.gu0(this.xiZrDbcSW0, this.riuEU0zW4);
        }
        this.SH1y5HwkJhh = gu0Var;
        return gu0Var;
    }

    public final void adDC3e2L(int i) {
        this.riuEU0zW4 = i;
        this.EXtogiMhuM++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.xiZrDbcSW0 = defpackage.yi1.adDC3e2L;
        adDC3e2L(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof defpackage.ly0) {
            return oh6vYeIP((defpackage.ly0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof defpackage.kl1) {
            return super.containsValue((defpackage.kl1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return new defpackage.ku0(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof defpackage.ly0) {
            return (defpackage.kl1) r1MBDhnF((defpackage.ly0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof defpackage.ly0) ? obj2 : (defpackage.kl1) super.getOrDefault((defpackage.ly0) obj, (defpackage.kl1) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        return new defpackage.ku0(1, this);
    }

    public final boolean oh6vYeIP(java.lang.Object obj) {
        return this.xiZrDbcSW0.F7NU4MC0GW(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        this.AARZUJiTa = null;
        this.xiZrDbcSW0 = this.xiZrDbcSW0.JlrlGoKF(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.AARZUJiTa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [hu0] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        defpackage.gu0 gu0Var = null;
        defpackage.gu0 gu0Var2 = map instanceof defpackage.hu0 ? (defpackage.hu0) map : null;
        if (gu0Var2 == null) {
            defpackage.fu0 fu0Var = map instanceof defpackage.fu0 ? (defpackage.fu0) map : null;
            if (fu0Var != null) {
                gu0Var = fu0Var.IHQe1A4L2xu();
            }
        } else {
            gu0Var = gu0Var2;
        }
        if (gu0Var == null) {
            super.putAll(map);
            return;
        }
        defpackage.pn pnVar = new defpackage.pn();
        pnVar.IHQe1A4L2xu = 0;
        int i = this.riuEU0zW4;
        defpackage.yi1 yi1Var = this.xiZrDbcSW0;
        defpackage.yi1 yi1Var2 = gu0Var.adDC3e2L;
        yi1Var2.getClass();
        this.xiZrDbcSW0 = yi1Var.DFo87pBq1E5(yi1Var2, 0, pnVar, this);
        int i2 = (gu0Var.xiZrDbcSW0 + i) - pnVar.IHQe1A4L2xu;
        if (i != i2) {
            adDC3e2L(i2);
        }
    }

    public final java.lang.Object r1MBDhnF(java.lang.Object obj) {
        return this.xiZrDbcSW0.AARZUJiTa(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.yi1 cnag84Bm = this.xiZrDbcSW0.cnag84Bm(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (cnag84Bm == null) {
            cnag84Bm = defpackage.yi1.adDC3e2L;
        }
        this.xiZrDbcSW0 = cnag84Bm;
        return i != this.riuEU0zW4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.riuEU0zW4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        return new defpackage.nu0(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof defpackage.ly0) {
            return (defpackage.kl1) F7NU4MC0GW((defpackage.ly0) obj);
        }
        return null;
    }
}
