package defpackage;

/* loaded from: classes.dex */
public final class pl0 extends defpackage.o11 implements defpackage.k00 {
    public defpackage.f20 AARZUJiTa;
    public int DFo87pBq1E5;
    public defpackage.ql0 EXtogiMhuM;
    public final /* synthetic */ defpackage.ql0 G3OKOH3wZRC;
    public int JlrlGoKF;
    public /* synthetic */ java.lang.Object QoRHpC4k;
    public int SH1y5HwkJhh;
    public long SyNS6RMn;
    public int cnag84Bm;
    public int ez2rX8ReCYw;
    public final /* synthetic */ defpackage.f20 kd6TUFXn;
    public long[] riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl0(defpackage.ql0 ql0Var, defpackage.f20 f20Var, defpackage.ej ejVar) {
        super(ejVar);
        this.G3OKOH3wZRC = ql0Var;
        this.kd6TUFXn = f20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.z71 z71Var;
        defpackage.ql0 ql0Var;
        long[] jArr;
        int length;
        defpackage.f20 f20Var;
        int i;
        long j;
        int i2 = this.cnag84Bm;
        if (i2 == 0) {
            defpackage.f70.nBH8hAHy(obj);
            z71Var = (defpackage.z71) this.QoRHpC4k;
            ql0Var = this.G3OKOH3wZRC;
            jArr = ql0Var.xiZrDbcSW0.IHQe1A4L2xu;
            length = jArr.length - 2;
            if (length >= 0) {
                f20Var = this.kd6TUFXn;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return defpackage.ok1.IHQe1A4L2xu;
        }
        if (i2 != 1) {
            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.DFo87pBq1E5;
        int i4 = this.JlrlGoKF;
        long j2 = this.SyNS6RMn;
        int i5 = this.ez2rX8ReCYw;
        int i6 = this.SH1y5HwkJhh;
        long[] jArr2 = this.riuEU0zW4;
        defpackage.ql0 ql0Var2 = this.EXtogiMhuM;
        defpackage.f20 f20Var2 = this.AARZUJiTa;
        defpackage.z71 z71Var2 = (defpackage.z71) this.QoRHpC4k;
        defpackage.f70.nBH8hAHy(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                ql0Var = ql0Var2;
                z71Var = z71Var2;
                i = i5;
                f20Var = f20Var2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        z71Var2 = z71Var;
                        i3 = 0;
                        ql0Var2 = ql0Var;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        f20Var2 = f20Var;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                f20Var2.xiZrDbcSW0 = i7;
                                java.lang.Object obj2 = ql0Var2.xiZrDbcSW0.oh6vYeIP[i7];
                                this.QoRHpC4k = z71Var2;
                                this.AARZUJiTa = f20Var2;
                                this.EXtogiMhuM = ql0Var2;
                                this.riuEU0zW4 = jArr2;
                                this.SH1y5HwkJhh = i6;
                                this.ez2rX8ReCYw = i5;
                                this.SyNS6RMn = j2;
                                this.JlrlGoKF = i4;
                                this.DFo87pBq1E5 = i3;
                                this.cnag84Bm = 1;
                                z71Var2.oh6vYeIP(this, obj2);
                                return defpackage.vj.adDC3e2L;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return defpackage.ok1.IHQe1A4L2xu;
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.pl0) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.z71) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.pl0 pl0Var = new defpackage.pl0(this.G3OKOH3wZRC, this.kd6TUFXn, ejVar);
        pl0Var.QoRHpC4k = obj;
        return pl0Var;
    }
}
