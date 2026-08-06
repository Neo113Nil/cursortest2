package defpackage;

/* loaded from: classes.dex */
public final class k20 implements defpackage.g00 {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ k20(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
        this.AARZUJiTa = obj2;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        long j;
        switch (this.adDC3e2L) {
            case 0:
                defpackage.ua1 ua1Var = (defpackage.ua1) obj;
                synchronized (defpackage.wa1.r1MBDhnF) {
                    j = defpackage.wa1.adDC3e2L;
                    defpackage.wa1.adDC3e2L = 1 + j;
                }
                return new defpackage.rl0(j, ua1Var, (defpackage.g00) this.xiZrDbcSW0, (defpackage.g00) this.AARZUJiTa);
            case 1:
                return ((defpackage.JX5fKip1C6) this.xiZrDbcSW0).AARZUJiTa(((java.util.List) this.AARZUJiTa).get(((java.lang.Number) obj).intValue()));
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.q90 q90Var = (defpackage.q90) this.xiZrDbcSW0;
                java.lang.Object obj2 = q90Var.oh6vYeIP;
                defpackage.bb bbVar = (defpackage.bb) this.AARZUJiTa;
                synchronized (obj2) {
                    ((java.util.ArrayList) q90Var.r1MBDhnF).remove(bbVar);
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.uc0) this.xiZrDbcSW0).AARZUJiTa(((java.util.List) this.AARZUJiTa).get(((java.lang.Number) obj).intValue()));
            default:
                return ((defpackage.uc0) this.xiZrDbcSW0).AARZUJiTa(((java.util.List) this.AARZUJiTa).get(((java.lang.Number) obj).intValue()));
        }
    }
}
