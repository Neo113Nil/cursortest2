package defpackage;

/* loaded from: classes.dex */
public final class jj1 extends defpackage.ce1 implements defpackage.k00 {
    public int DFo87pBq1E5;
    public final /* synthetic */ defpackage.kj1 G3OKOH3wZRC;
    public int JlrlGoKF;
    public final /* synthetic */ defpackage.aq0[] QoRHpC4k;
    public defpackage.kj1 SH1y5HwkJhh;
    public int SyNS6RMn;
    public int cnag84Bm;
    public defpackage.ai1 ez2rX8ReCYw;
    public final /* synthetic */ defpackage.ai1 kd6TUFXn;
    public defpackage.aq0[] riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj1(defpackage.aq0[] aq0VarArr, defpackage.kj1 kj1Var, defpackage.ai1 ai1Var, defpackage.ej ejVar) {
        super(2, ejVar);
        this.QoRHpC4k = aq0VarArr;
        this.G3OKOH3wZRC = kj1Var;
        this.kd6TUFXn = ai1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (defpackage.kj1.r1MBDhnF(r7, r6, r12, r11) == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:10:0x0073). Please report as a decompilation issue!!! */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int length;
        int i;
        defpackage.ai1 ai1Var;
        defpackage.aq0[] aq0VarArr;
        int i2;
        defpackage.kj1 kj1Var;
        int i3 = this.cnag84Bm;
        if (i3 == 0) {
            defpackage.f70.nBH8hAHy(obj);
            defpackage.aq0[] aq0VarArr2 = this.QoRHpC4k;
            length = aq0VarArr2.length;
            i = 0;
            defpackage.kj1 kj1Var2 = this.G3OKOH3wZRC;
            ai1Var = this.kd6TUFXn;
            aq0VarArr = aq0VarArr2;
            i2 = 0;
            kj1Var = kj1Var2;
            if (i >= length) {
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.SyNS6RMn;
            i = this.DFo87pBq1E5;
            int i4 = this.JlrlGoKF;
            ai1Var = this.ez2rX8ReCYw;
            kj1Var = this.SH1y5HwkJhh;
            aq0VarArr = this.riuEU0zW4;
            defpackage.f70.nBH8hAHy(obj);
            i2 = i4;
            i++;
            if (i >= length) {
                int i5 = i2 + 1;
                int ordinal = aq0VarArr[i].ordinal();
                if (ordinal != 0) {
                    defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            defpackage.db.F7NU4MC0GW();
                            return null;
                        }
                        this.riuEU0zW4 = aq0VarArr;
                        this.SH1y5HwkJhh = kj1Var;
                        this.ez2rX8ReCYw = ai1Var;
                        this.JlrlGoKF = i5;
                        this.DFo87pBq1E5 = i;
                        this.SyNS6RMn = length;
                        this.cnag84Bm = 2;
                        if (defpackage.kj1.F7NU4MC0GW(kj1Var, ai1Var, i2, this) != vjVar) {
                            i4 = i5;
                            i2 = i4;
                        }
                        return vjVar;
                    }
                    this.riuEU0zW4 = aq0VarArr;
                    this.SH1y5HwkJhh = kj1Var;
                    this.ez2rX8ReCYw = ai1Var;
                    this.JlrlGoKF = i5;
                    this.DFo87pBq1E5 = i;
                    this.SyNS6RMn = length;
                    this.cnag84Bm = 1;
                    i++;
                    if (i >= length) {
                        return defpackage.ok1.IHQe1A4L2xu;
                    }
                } else {
                    i2 = i5;
                    i++;
                    if (i >= length) {
                    }
                }
            }
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.jj1) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.tt0) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        return new defpackage.jj1(this.QoRHpC4k, this.G3OKOH3wZRC, this.kd6TUFXn, ejVar);
    }
}
