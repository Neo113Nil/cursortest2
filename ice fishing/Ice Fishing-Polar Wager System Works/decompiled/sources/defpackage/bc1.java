package defpackage;

/* loaded from: classes.dex */
public final class bc1 extends defpackage.ce1 implements defpackage.l00 {
    public final /* synthetic */ defpackage.cc1 JlrlGoKF;
    public /* synthetic */ defpackage.iw SH1y5HwkJhh;
    public /* synthetic */ int ez2rX8ReCYw;
    public int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc1(defpackage.cc1 cc1Var, defpackage.ej ejVar) {
        super(3, ejVar);
        this.JlrlGoKF = cc1Var;
    }

    @Override // defpackage.l00
    public final java.lang.Object F7NU4MC0GW(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj2).intValue();
        defpackage.bc1 bc1Var = new defpackage.bc1(this.JlrlGoKF, (defpackage.ej) obj3);
        bc1Var.SH1y5HwkJhh = (defpackage.iw) obj;
        bc1Var.ez2rX8ReCYw = intValue;
        return bc1Var.SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r0.EXtogiMhuM(defpackage.o91.AARZUJiTa, r13) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (defpackage.fm.PAEGRtP0bX(r1, r13) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r0.EXtogiMhuM(defpackage.o91.xiZrDbcSW0, r13) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r14.EXtogiMhuM(defpackage.o91.adDC3e2L, r13) == r10) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.iw iwVar;
        defpackage.cc1 cc1Var = this.JlrlGoKF;
        long j = cc1Var.xiZrDbcSW0;
        int i = this.riuEU0zW4;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            defpackage.iw iwVar2 = this.SH1y5HwkJhh;
            if (this.ez2rX8ReCYw > 0) {
                this.riuEU0zW4 = 1;
            } else {
                long j2 = cc1Var.adDC3e2L;
                this.SH1y5HwkJhh = iwVar2;
                this.riuEU0zW4 = 2;
                if (defpackage.fm.PAEGRtP0bX(j2, this) != vjVar) {
                    iwVar = iwVar2;
                    if (j > 0) {
                    }
                    this.SH1y5HwkJhh = null;
                    this.riuEU0zW4 = 5;
                }
            }
            return vjVar;
        }
        if (i != 1) {
            if (i == 2) {
                iwVar = this.SH1y5HwkJhh;
                defpackage.f70.nBH8hAHy(obj);
                if (j > 0) {
                    this.SH1y5HwkJhh = iwVar;
                    this.riuEU0zW4 = 3;
                }
                this.SH1y5HwkJhh = null;
                this.riuEU0zW4 = 5;
            } else if (i == 3) {
                iwVar = this.SH1y5HwkJhh;
                defpackage.f70.nBH8hAHy(obj);
                this.SH1y5HwkJhh = iwVar;
                this.riuEU0zW4 = 4;
            } else if (i == 4) {
                iwVar = this.SH1y5HwkJhh;
                defpackage.f70.nBH8hAHy(obj);
                this.SH1y5HwkJhh = null;
                this.riuEU0zW4 = 5;
            } else if (i != 5) {
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        defpackage.f70.nBH8hAHy(obj);
        return defpackage.ok1.IHQe1A4L2xu;
    }
}
