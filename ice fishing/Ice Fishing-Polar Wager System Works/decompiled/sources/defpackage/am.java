package defpackage;

/* loaded from: classes.dex */
public final class am extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.bm DFo87pBq1E5;
    public final /* synthetic */ defpackage.pz0 JlrlGoKF;
    public int SH1y5HwkJhh;
    public final /* synthetic */ java.lang.Object SyNS6RMn;
    public final /* synthetic */ boolean cnag84Bm;
    public /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public defpackage.pz0 riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(defpackage.pz0 pz0Var, defpackage.bm bmVar, java.lang.Object obj, boolean z, defpackage.ej ejVar) {
        super(2, ejVar);
        this.JlrlGoKF = pz0Var;
        this.DFo87pBq1E5 = bmVar;
        this.SyNS6RMn = obj;
        this.cnag84Bm = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r6.oh6vYeIP(r2, r8) == r7) goto L16;
     */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.mv mvVar;
        defpackage.pz0 pz0Var;
        int i = this.SH1y5HwkJhh;
        java.lang.Object obj2 = this.SyNS6RMn;
        defpackage.bm bmVar = this.DFo87pBq1E5;
        defpackage.pz0 pz0Var2 = this.JlrlGoKF;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            defpackage.mv mvVar2 = (defpackage.mv) this.ez2rX8ReCYw;
            defpackage.x91 EXtogiMhuM = bmVar.EXtogiMhuM();
            this.ez2rX8ReCYw = mvVar2;
            this.riuEU0zW4 = pz0Var2;
            this.SH1y5HwkJhh = 1;
            java.lang.Integer num = new java.lang.Integer(((java.util.concurrent.atomic.AtomicInteger) EXtogiMhuM.oh6vYeIP.xiZrDbcSW0).incrementAndGet());
            if (num != vjVar) {
                mvVar = mvVar2;
                obj = num;
                pz0Var = pz0Var2;
            }
            return vjVar;
        }
        if (i != 1) {
            if (i != 2) {
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            defpackage.f70.nBH8hAHy(obj);
            if (this.cnag84Bm) {
                bmVar.EXtogiMhuM.r1MBDhnF(new defpackage.zk(obj2 != null ? obj2.hashCode() : 0, pz0Var2.adDC3e2L, obj2));
            }
            return defpackage.ok1.IHQe1A4L2xu;
        }
        pz0Var = this.riuEU0zW4;
        mvVar = (defpackage.mv) this.ez2rX8ReCYw;
        defpackage.f70.nBH8hAHy(obj);
        pz0Var.adDC3e2L = ((java.lang.Number) obj).intValue();
        this.ez2rX8ReCYw = null;
        this.riuEU0zW4 = null;
        this.SH1y5HwkJhh = 2;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.am) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.mv) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.am amVar = new defpackage.am(this.JlrlGoKF, this.DFo87pBq1E5, this.SyNS6RMn, this.cnag84Bm, ejVar);
        amVar.ez2rX8ReCYw = obj;
        return amVar;
    }
}
