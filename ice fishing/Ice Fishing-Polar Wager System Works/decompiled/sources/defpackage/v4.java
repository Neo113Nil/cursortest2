package defpackage;

/* loaded from: classes.dex */
public final class v4 extends defpackage.p90 implements defpackage.l00 {
    public final /* synthetic */ defpackage.li1 AARZUJiTa;
    public final /* synthetic */ defpackage.g00 xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(defpackage.g00 g00Var, defpackage.li1 li1Var) {
        super(3);
        this.xiZrDbcSW0 = g00Var;
        this.AARZUJiTa = li1Var;
    }

    @Override // defpackage.l00
    public final java.lang.Object F7NU4MC0GW(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j;
        defpackage.ki0 ki0Var = (defpackage.ki0) obj;
        defpackage.bv0 xiZrDbcSW0 = ((defpackage.di0) obj2).xiZrDbcSW0(((defpackage.ki) obj3).IHQe1A4L2xu);
        if (ki0Var.cnag84Bm()) {
            if (!((java.lang.Boolean) this.xiZrDbcSW0.AARZUJiTa(this.AARZUJiTa.F7NU4MC0GW.getValue())).booleanValue()) {
                j = 0;
                return ki0Var.EoOhNTTfIN7K((int) (j >> 32), (int) (4294967295L & j), defpackage.ot.adDC3e2L, new defpackage.j0(xiZrDbcSW0, 1));
            }
        }
        j = (xiZrDbcSW0.adDC3e2L << 32) | (xiZrDbcSW0.xiZrDbcSW0 & 4294967295L);
        return ki0Var.EoOhNTTfIN7K((int) (j >> 32), (int) (4294967295L & j), defpackage.ot.adDC3e2L, new defpackage.j0(xiZrDbcSW0, 1));
    }
}
