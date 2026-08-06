package defpackage;

/* loaded from: classes.dex */
public final class xq0 extends defpackage.p90 implements defpackage.g00 {
    public final /* synthetic */ defpackage.gy AARZUJiTa;
    public final /* synthetic */ defpackage.gy EXtogiMhuM;
    public final /* synthetic */ defpackage.c4 SH1y5HwkJhh;
    public final /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xq0(defpackage.gy gyVar, defpackage.gy gyVar2, java.lang.Object obj, int i, defpackage.c4 c4Var, int i2) {
        super(1);
        this.xiZrDbcSW0 = i2;
        this.AARZUJiTa = gyVar;
        this.EXtogiMhuM = gyVar2;
        this.ez2rX8ReCYw = obj;
        this.riuEU0zW4 = i;
        this.SH1y5HwkJhh = c4Var;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.xiZrDbcSW0;
        defpackage.c4 c4Var = this.SH1y5HwkJhh;
        int i2 = this.riuEU0zW4;
        java.lang.Object obj2 = this.ez2rX8ReCYw;
        defpackage.gy gyVar = this.EXtogiMhuM;
        defpackage.gy gyVar2 = this.AARZUJiTa;
        switch (i) {
            case 0:
                defpackage.b8 b8Var = (defpackage.b8) obj;
                if (gyVar2 != ((defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(gyVar)).getFocusOwner()).xiZrDbcSW0()) {
                    return java.lang.Boolean.TRUE;
                }
                boolean v5iciZok = defpackage.j70.v5iciZok(gyVar, (defpackage.gy) obj2, i2, c4Var);
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(v5iciZok);
                if (v5iciZok || !b8Var.IHQe1A4L2xu()) {
                    return valueOf;
                }
                return null;
            default:
                defpackage.b8 b8Var2 = (defpackage.b8) obj;
                if (gyVar2 != ((defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(gyVar)).getFocusOwner()).xiZrDbcSW0()) {
                    return java.lang.Boolean.TRUE;
                }
                boolean mAr5m2L7gYDP = defpackage.s70.mAr5m2L7gYDP(i2, c4Var, gyVar, (defpackage.kz0) obj2);
                java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(mAr5m2L7gYDP);
                if (mAr5m2L7gYDP || !b8Var2.IHQe1A4L2xu()) {
                    return valueOf2;
                }
                return null;
        }
    }
}
