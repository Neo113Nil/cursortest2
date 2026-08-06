package defpackage;

/* loaded from: classes.dex */
public final class h4 extends defpackage.p90 implements defpackage.g00 {
    public final /* synthetic */ defpackage.i4 AARZUJiTa;
    public final /* synthetic */ int EXtogiMhuM;
    public final /* synthetic */ int riuEU0zW4;
    public final /* synthetic */ defpackage.bv0[] xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(defpackage.bv0[] bv0VarArr, defpackage.i4 i4Var, int i, int i2) {
        super(1);
        this.xiZrDbcSW0 = bv0VarArr;
        this.AARZUJiTa = i4Var;
        this.EXtogiMhuM = i;
        this.riuEU0zW4 = i2;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        defpackage.av0 av0Var = (defpackage.av0) obj;
        for (defpackage.bv0 bv0Var : this.xiZrDbcSW0) {
            if (bv0Var != null) {
                long IHQe1A4L2xu = this.AARZUJiTa.IHQe1A4L2xu.oh6vYeIP.IHQe1A4L2xu((bv0Var.adDC3e2L << 32) | (bv0Var.xiZrDbcSW0 & 4294967295L), (this.EXtogiMhuM << 32) | (this.riuEU0zW4 & 4294967295L), defpackage.w90.adDC3e2L);
                defpackage.av0.SH1y5HwkJhh(av0Var, bv0Var, (int) (IHQe1A4L2xu >> 32), (int) (IHQe1A4L2xu & 4294967295L));
            }
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }
}
