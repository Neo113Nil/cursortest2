package defpackage;

/* loaded from: classes.dex */
public final class ta1 extends defpackage.o11 implements defpackage.k00 {
    public long[] AARZUJiTa;
    public int EXtogiMhuM;
    public final /* synthetic */ defpackage.ua1 JlrlGoKF;
    public int SH1y5HwkJhh;
    public /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta1(defpackage.ua1 ua1Var, defpackage.ej ejVar) {
        super(ejVar);
        this.JlrlGoKF = ua1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00bc -> B:7:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.z71 z71Var;
        long[] jArr;
        int length;
        int i;
        defpackage.z71 z71Var2;
        int i2;
        defpackage.z71 z71Var3;
        int i3;
        defpackage.ua1 ua1Var = this.JlrlGoKF;
        long j = ua1Var.adDC3e2L;
        long j2 = ua1Var.AARZUJiTa;
        long j3 = ua1Var.xiZrDbcSW0;
        int i4 = this.SH1y5HwkJhh;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (i4 == 0) {
            defpackage.f70.nBH8hAHy(obj);
            z71Var = (defpackage.z71) this.ez2rX8ReCYw;
            jArr = ua1Var.EXtogiMhuM;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                z71Var2 = z71Var;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return defpackage.ok1.IHQe1A4L2xu;
        }
        if (i4 == 1) {
            length = this.riuEU0zW4;
            int i5 = this.EXtogiMhuM;
            jArr = this.AARZUJiTa;
            z71Var = (defpackage.z71) this.ez2rX8ReCYw;
            defpackage.f70.nBH8hAHy(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = this.EXtogiMhuM;
                z71Var3 = (defpackage.z71) this.ez2rX8ReCYw;
                defpackage.f70.nBH8hAHy(obj);
                i3 = i6 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        java.lang.Long l = new java.lang.Long(j2 + i3 + 64);
                        this.ez2rX8ReCYw = z71Var3;
                        this.AARZUJiTa = null;
                        this.EXtogiMhuM = i3;
                        this.SH1y5HwkJhh = 3;
                        z71Var3.oh6vYeIP(this, l);
                        return vjVar;
                    }
                    i6 = i3;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                    }
                }
                return defpackage.ok1.IHQe1A4L2xu;
            }
            i2 = this.EXtogiMhuM;
            z71Var2 = (defpackage.z71) this.ez2rX8ReCYw;
            defpackage.f70.nBH8hAHy(obj);
            i2++;
            if (i2 >= 64) {
                z71Var = z71Var2;
                if (j != 0) {
                    z71Var3 = z71Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return defpackage.ok1.IHQe1A4L2xu;
            }
            if ((j3 & (1 << i2)) != 0) {
                java.lang.Long l2 = new java.lang.Long(j2 + i2);
                this.ez2rX8ReCYw = z71Var2;
                this.AARZUJiTa = null;
                this.EXtogiMhuM = i2;
                this.SH1y5HwkJhh = 2;
                z71Var2.oh6vYeIP(this, l2);
                return vjVar;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            java.lang.Long l3 = new java.lang.Long(jArr[i]);
            this.ez2rX8ReCYw = z71Var;
            this.AARZUJiTa = jArr;
            this.EXtogiMhuM = i;
            this.riuEU0zW4 = length;
            this.SH1y5HwkJhh = 1;
            z71Var.oh6vYeIP(this, l3);
            return vjVar;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ta1) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.z71) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.ta1 ta1Var = new defpackage.ta1(this.JlrlGoKF, ejVar);
        ta1Var.ez2rX8ReCYw = obj;
        return ta1Var;
    }
}
