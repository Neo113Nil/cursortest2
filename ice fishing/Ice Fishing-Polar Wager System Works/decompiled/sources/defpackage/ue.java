package defpackage;

/* loaded from: classes.dex */
public final class ue extends defpackage.ce1 implements defpackage.k00 {
    public int DFo87pBq1E5;
    public final /* synthetic */ defpackage.iw G3OKOH3wZRC;
    public int JlrlGoKF;
    public final /* synthetic */ defpackage.l00 QoRHpC4k;
    public byte[] SH1y5HwkJhh;
    public /* synthetic */ java.lang.Object SyNS6RMn;
    public final /* synthetic */ defpackage.hw[] cnag84Bm;
    public int ez2rX8ReCYw;
    public defpackage.sb riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue(defpackage.hw[] hwVarArr, defpackage.l00 l00Var, defpackage.iw iwVar, defpackage.ej ejVar) {
        super(2, ejVar);
        this.cnag84Bm = hwVarArr;
        this.QoRHpC4k = l00Var;
        this.G3OKOH3wZRC = iwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008c, code lost:
    
        if (r10 == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        if (r17.QoRHpC4k.F7NU4MC0GW(r17.G3OKOH3wZRC, r9, r17) == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        return r7;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00cf -> B:10:0x007a). Please report as a decompilation issue!!! */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        byte[] bArr;
        defpackage.sb sbVar;
        int i;
        java.lang.Object[] objArr;
        int i2;
        java.lang.Object obj2;
        defpackage.et etVar = defpackage.x70.adDC3e2L;
        int i3 = this.DFo87pBq1E5;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (i3 == 0) {
            defpackage.f70.nBH8hAHy(obj);
            defpackage.uj ujVar = (defpackage.uj) this.SyNS6RMn;
            defpackage.hw[] hwVarArr = this.cnag84Bm;
            int length = hwVarArr.length;
            if (length != 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[length];
                int i4 = 0;
                defpackage.t6.nVhUznk1t(0, length, etVar, objArr2);
                defpackage.x9 oh6vYeIP = defpackage.w70.oh6vYeIP(length, 6, null);
                java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(length);
                int i5 = 0;
                while (i5 < length) {
                    defpackage.fm.SiPhmbmu(ujVar, null, new defpackage.te(hwVarArr, i5, atomicInteger, oh6vYeIP, null), 3);
                    i5++;
                    i4 = i4;
                }
                int i6 = i4;
                bArr = new byte[length];
                sbVar = oh6vYeIP;
                i = length;
                objArr = objArr2;
                i2 = i6;
            }
            return defpackage.ok1.IHQe1A4L2xu;
        }
        if (i3 == 1) {
            i2 = this.JlrlGoKF;
            i = this.ez2rX8ReCYw;
            bArr = this.SH1y5HwkJhh;
            sbVar = this.riuEU0zW4;
            objArr = (java.lang.Object[]) this.SyNS6RMn;
            defpackage.f70.nBH8hAHy(obj);
            obj2 = ((defpackage.dc) obj).IHQe1A4L2xu;
            defpackage.b50 b50Var = (defpackage.b50) defpackage.dc.IHQe1A4L2xu(obj2);
            if (b50Var != null) {
                while (true) {
                    int i7 = b50Var.IHQe1A4L2xu;
                    java.lang.Object obj3 = objArr[i7];
                    objArr[i7] = b50Var.oh6vYeIP;
                    if (obj3 == etVar) {
                        i--;
                    }
                    if (bArr[i7] != i2) {
                        bArr[i7] = (byte) i2;
                        b50Var = (defpackage.b50) defpackage.dc.IHQe1A4L2xu(sbVar.EXtogiMhuM());
                        if (b50Var != null) {
                        }
                    }
                    if (i == 0) {
                        this.SyNS6RMn = objArr;
                        this.riuEU0zW4 = sbVar;
                        this.SH1y5HwkJhh = bArr;
                        this.ez2rX8ReCYw = i;
                        this.JlrlGoKF = i2;
                        this.DFo87pBq1E5 = 2;
                    }
                }
            }
            return defpackage.ok1.IHQe1A4L2xu;
        }
        if (i3 != 2 && i3 != 3) {
            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = this.JlrlGoKF;
        i = this.ez2rX8ReCYw;
        bArr = this.SH1y5HwkJhh;
        sbVar = this.riuEU0zW4;
        objArr = (java.lang.Object[]) this.SyNS6RMn;
        defpackage.f70.nBH8hAHy(obj);
        i2 = (byte) (i2 + 1);
        this.SyNS6RMn = objArr;
        this.riuEU0zW4 = sbVar;
        this.SH1y5HwkJhh = bArr;
        this.ez2rX8ReCYw = i;
        this.JlrlGoKF = i2;
        this.DFo87pBq1E5 = 1;
        obj2 = sbVar.SyNS6RMn(this);
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ue) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.ue ueVar = new defpackage.ue(this.cnag84Bm, this.QoRHpC4k, this.G3OKOH3wZRC, ejVar);
        ueVar.SyNS6RMn = obj;
        return ueVar;
    }
}
