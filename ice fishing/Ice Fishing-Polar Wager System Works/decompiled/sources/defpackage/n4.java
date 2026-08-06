package defpackage;

/* loaded from: classes.dex */
public final class n4 extends defpackage.p90 implements defpackage.g00 {
    public final /* synthetic */ defpackage.o4 AARZUJiTa;
    public final /* synthetic */ long EXtogiMhuM;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4(defpackage.o4 o4Var, long j, int i) {
        super(1);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = o4Var;
        this.EXtogiMhuM = j;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        defpackage.tv tvVar;
        int i = this.xiZrDbcSW0;
        long j = this.EXtogiMhuM;
        defpackage.o4 o4Var = this.AARZUJiTa;
        switch (i) {
            case 0:
                defpackage.hi1 hi1Var = (defpackage.hi1) obj;
                if (!defpackage.x70.QoRHpC4k(hi1Var.oh6vYeIP(), o4Var.kNAkVymC.oh6vYeIP())) {
                    defpackage.ec1 ec1Var = (defpackage.ec1) o4Var.kNAkVymC.F7NU4MC0GW.AARZUJiTa(hi1Var.oh6vYeIP());
                    j = ec1Var != null ? ((defpackage.i70) ec1Var.getValue()).IHQe1A4L2xu : 0L;
                } else if (!defpackage.i70.IHQe1A4L2xu(o4Var.V7bD7b8KA, -9223372034707292160L)) {
                    j = o4Var.V7bD7b8KA;
                }
                defpackage.ec1 ec1Var2 = (defpackage.ec1) o4Var.kNAkVymC.F7NU4MC0GW.AARZUJiTa(hi1Var.r1MBDhnF());
                r1 = ec1Var2 != null ? ((defpackage.i70) ec1Var2.getValue()).IHQe1A4L2xu : 0L;
                defpackage.da1 da1Var = (defpackage.da1) o4Var.fnWB2E7cs.getValue();
                return (da1Var == null || (tvVar = (defpackage.tv) da1Var.IHQe1A4L2xu.adDC3e2L(new defpackage.i70(j), new defpackage.i70(r1))) == null) ? defpackage.w70.SiPhmbmu(0.0f, 400.0f, null, 5) : tvVar;
            default:
                if (defpackage.x70.QoRHpC4k(obj, o4Var.kNAkVymC.oh6vYeIP())) {
                    r1 = defpackage.i70.IHQe1A4L2xu(o4Var.V7bD7b8KA, -9223372034707292160L) ? j : o4Var.V7bD7b8KA;
                } else {
                    defpackage.ec1 ec1Var3 = (defpackage.ec1) o4Var.kNAkVymC.F7NU4MC0GW.AARZUJiTa(obj);
                    if (ec1Var3 != null) {
                        r1 = ((defpackage.i70) ec1Var3.getValue()).IHQe1A4L2xu;
                    }
                }
                return new defpackage.i70(r1);
        }
    }
}
