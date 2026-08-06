package defpackage;

/* loaded from: classes.dex */
public final class zt extends defpackage.p90 implements defpackage.g00 {
    public final /* synthetic */ defpackage.bu AARZUJiTa;
    public final /* synthetic */ long EXtogiMhuM;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zt(defpackage.bu buVar, long j, int i) {
        super(1);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = buVar;
        this.EXtogiMhuM = j;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        defpackage.g00 g00Var;
        defpackage.g00 g00Var2;
        long j;
        int ordinal;
        int i = this.xiZrDbcSW0;
        defpackage.bu buVar = this.AARZUJiTa;
        switch (i) {
            case 0:
                int ordinal2 = ((defpackage.st) obj).ordinal();
                long j2 = this.EXtogiMhuM;
                if (ordinal2 == 0) {
                    defpackage.qb qbVar = buVar.V7bD7b8KA.IHQe1A4L2xu.oh6vYeIP;
                    if (qbVar != null && (g00Var = qbVar.oh6vYeIP) != null) {
                        j2 = ((defpackage.i70) g00Var.AARZUJiTa(new defpackage.i70(j2))).IHQe1A4L2xu;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        defpackage.db.F7NU4MC0GW();
                        return null;
                    }
                    defpackage.qb qbVar2 = buVar.PAEGRtP0bX.IHQe1A4L2xu.oh6vYeIP;
                    if (qbVar2 != null && (g00Var2 = qbVar2.oh6vYeIP) != null) {
                        j2 = ((defpackage.i70) g00Var2.AARZUJiTa(new defpackage.i70(j2))).IHQe1A4L2xu;
                    }
                }
                return new defpackage.i70(j2);
            default:
                defpackage.st stVar = (defpackage.st) obj;
                if (buVar.C0U8sNJm != null && buVar.UVjEelCZ() != null && !defpackage.x70.QoRHpC4k(buVar.C0U8sNJm, buVar.UVjEelCZ()) && (ordinal = stVar.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        defpackage.db.F7NU4MC0GW();
                        return null;
                    }
                    defpackage.qb qbVar3 = buVar.PAEGRtP0bX.IHQe1A4L2xu.oh6vYeIP;
                    if (qbVar3 != null) {
                        defpackage.g00 g00Var3 = qbVar3.oh6vYeIP;
                        long j3 = this.EXtogiMhuM;
                        long j4 = ((defpackage.i70) g00Var3.AARZUJiTa(new defpackage.i70(j3))).IHQe1A4L2xu;
                        defpackage.e8 UVjEelCZ = buVar.UVjEelCZ();
                        UVjEelCZ.getClass();
                        defpackage.w90 w90Var = defpackage.w90.adDC3e2L;
                        long IHQe1A4L2xu = UVjEelCZ.IHQe1A4L2xu(j3, j4, w90Var);
                        defpackage.e8 e8Var = buVar.C0U8sNJm;
                        e8Var.getClass();
                        j = defpackage.z60.oh6vYeIP(IHQe1A4L2xu, e8Var.IHQe1A4L2xu(j3, j4, w90Var));
                        return new defpackage.z60(j);
                    }
                }
                j = 0;
                return new defpackage.z60(j);
        }
    }
}
