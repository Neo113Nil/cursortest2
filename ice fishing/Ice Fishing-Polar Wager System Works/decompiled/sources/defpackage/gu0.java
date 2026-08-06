package defpackage;

/* loaded from: classes.dex */
public final class gu0 extends defpackage.hu0 implements defpackage.nh {
    public static final defpackage.gu0 EXtogiMhuM = new defpackage.gu0(defpackage.yi1.adDC3e2L, 0);

    @Override // defpackage.hu0, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof defpackage.ly0) {
            return super.containsKey((defpackage.ly0) obj);
        }
        return false;
    }

    @Override // defpackage.hu0, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof defpackage.kl1) {
            return super.containsValue((defpackage.kl1) obj);
        }
        return false;
    }

    @Override // defpackage.hu0, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof defpackage.ly0) {
            return (defpackage.kl1) super.get((defpackage.ly0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof defpackage.ly0) ? obj2 : (defpackage.kl1) super.getOrDefault((defpackage.ly0) obj, (defpackage.kl1) obj2);
    }

    public final defpackage.gu0 oh6vYeIP(defpackage.ly0 ly0Var, defpackage.kl1 kl1Var) {
        defpackage.fz kNAkVymC = this.adDC3e2L.kNAkVymC(ly0Var.hashCode(), 0, ly0Var, kl1Var);
        return kNAkVymC == null ? this : new defpackage.gu0((defpackage.yi1) kNAkVymC.oh6vYeIP, this.xiZrDbcSW0 + kNAkVymC.IHQe1A4L2xu);
    }
}
