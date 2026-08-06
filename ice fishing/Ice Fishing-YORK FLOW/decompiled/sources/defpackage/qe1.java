package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qe1 extends defpackage.f51 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public /* synthetic */ java.lang.Object Ns0WNyEWdPsk;
    public int P05cfTpS5W5L;
    public long[] QiMR8OkAhezm;
    public int e6mdH7fiFuta;
    public final /* synthetic */ defpackage.re1 fNwYGHIYeJcR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe1(defpackage.re1 re1Var, defpackage.kl klVar) {
        super(klVar);
        this.fNwYGHIYeJcR = re1Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.qe1) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.ec1) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.qe1 qe1Var = new defpackage.qe1(this.fNwYGHIYeJcR, klVar);
        qe1Var.Ns0WNyEWdPsk = obj;
        return qe1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00bc -> B:7:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.m9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.ec1 ec1Var;
        long[] jArr;
        int length;
        int i;
        defpackage.ec1 ec1Var2;
        int i2;
        defpackage.ec1 ec1Var3;
        int i3;
        defpackage.re1 re1Var = this.fNwYGHIYeJcR;
        long j = re1Var.WDYagTQQm9ns;
        long j2 = re1Var.QiMR8OkAhezm;
        long j3 = re1Var.oh71FJcDz6S2;
        int i4 = this.GE9mJIPrb8gP;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        if (i4 == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            ec1Var = (defpackage.ec1) this.Ns0WNyEWdPsk;
            jArr = re1Var.P05cfTpS5W5L;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                ec1Var2 = ec1Var;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return defpackage.gs1.ZpBGe2uQfcn8;
        }
        if (i4 == 1) {
            length = this.e6mdH7fiFuta;
            int i5 = this.P05cfTpS5W5L;
            jArr = this.QiMR8OkAhezm;
            ec1Var = (defpackage.ec1) this.Ns0WNyEWdPsk;
            defpackage.b80.KrtOTfE6jiS2(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = this.P05cfTpS5W5L;
                ec1Var3 = (defpackage.ec1) this.Ns0WNyEWdPsk;
                defpackage.b80.KrtOTfE6jiS2(obj);
                i3 = i6 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        java.lang.Long l = new java.lang.Long(j2 + i3 + 64);
                        this.Ns0WNyEWdPsk = ec1Var3;
                        this.QiMR8OkAhezm = null;
                        this.P05cfTpS5W5L = i3;
                        this.GE9mJIPrb8gP = 3;
                        ec1Var3.giKS3J6vZuNy(l, this);
                        return tmVar;
                    }
                    i6 = i3;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                    }
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            }
            i2 = this.P05cfTpS5W5L;
            ec1Var2 = (defpackage.ec1) this.Ns0WNyEWdPsk;
            defpackage.b80.KrtOTfE6jiS2(obj);
            i2++;
            if (i2 >= 64) {
                ec1Var = ec1Var2;
                if (j != 0) {
                    ec1Var3 = ec1Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            }
            if ((j3 & (1 << i2)) != 0) {
                java.lang.Long l2 = new java.lang.Long(j2 + i2);
                this.Ns0WNyEWdPsk = ec1Var2;
                this.QiMR8OkAhezm = null;
                this.P05cfTpS5W5L = i2;
                this.GE9mJIPrb8gP = 2;
                ec1Var2.giKS3J6vZuNy(l2, this);
                return tmVar;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            java.lang.Long l3 = new java.lang.Long(jArr[i]);
            this.Ns0WNyEWdPsk = ec1Var;
            this.QiMR8OkAhezm = jArr;
            this.P05cfTpS5W5L = i;
            this.e6mdH7fiFuta = length;
            this.GE9mJIPrb8gP = 1;
            ec1Var.giKS3J6vZuNy(l3, this);
            return tmVar;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
