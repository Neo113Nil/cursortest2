package defpackage;

/* loaded from: classes.dex */
public final class SH1y5HwkJhh extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.dd DFo87pBq1E5;
    public final /* synthetic */ boolean JlrlGoKF;
    public final /* synthetic */ defpackage.zk0 SH1y5HwkJhh;
    public final /* synthetic */ defpackage.px0 ez2rX8ReCYw;
    public int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SH1y5HwkJhh(defpackage.zk0 zk0Var, defpackage.px0 px0Var, boolean z, defpackage.dd ddVar, defpackage.ej ejVar) {
        super(2, ejVar);
        this.SH1y5HwkJhh = zk0Var;
        this.ez2rX8ReCYw = px0Var;
        this.JlrlGoKF = z;
        this.DFo87pBq1E5 = ddVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r7.SH1y5HwkJhh.IHQe1A4L2xu(r3, r7) == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
    
        if (defpackage.fm.PAEGRtP0bX(r5, r7) == r4) goto L15;
     */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.px0 px0Var = this.ez2rX8ReCYw;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            long j = defpackage.ed.IHQe1A4L2xu;
            this.riuEU0zW4 = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                boolean z = this.JlrlGoKF;
                defpackage.dd ddVar = this.DFo87pBq1E5;
                if (z) {
                    ddVar.p4kuH6PDtgom = px0Var;
                } else {
                    ddVar.v5iciZok = px0Var;
                }
                return defpackage.ok1.IHQe1A4L2xu;
            }
            defpackage.f70.nBH8hAHy(obj);
        }
        this.riuEU0zW4 = 2;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.SH1y5HwkJhh) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        return new defpackage.SH1y5HwkJhh(this.SH1y5HwkJhh, this.ez2rX8ReCYw, this.JlrlGoKF, this.DFo87pBq1E5, ejVar);
    }
}
