package defpackage;

/* loaded from: classes.dex */
public final class h61 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.i61 JlrlGoKF;
    public int SH1y5HwkJhh;
    public /* synthetic */ long ez2rX8ReCYw;
    public long riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h61(defpackage.i61 i61Var, defpackage.ej ejVar) {
        super(2, ejVar);
        this.JlrlGoKF = i61Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.SH1y5HwkJhh;
        defpackage.i61 i61Var = this.JlrlGoKF;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            j = this.ez2rX8ReCYw;
            defpackage.y yVar = i61Var.xiZrDbcSW0;
            this.ez2rX8ReCYw = j;
            this.SH1y5HwkJhh = 1;
            obj = yVar.EXtogiMhuM(j, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = this.riuEU0zW4;
                    j3 = this.ez2rX8ReCYw;
                    defpackage.f70.nBH8hAHy(obj);
                    return new defpackage.rl1(defpackage.rl1.F7NU4MC0GW(j3, defpackage.rl1.F7NU4MC0GW(j4, ((defpackage.rl1) obj).IHQe1A4L2xu)));
                }
                j2 = this.riuEU0zW4;
                j = this.ez2rX8ReCYw;
                defpackage.f70.nBH8hAHy(obj);
                long j5 = ((defpackage.rl1) obj).IHQe1A4L2xu;
                defpackage.y yVar2 = i61Var.xiZrDbcSW0;
                long F7NU4MC0GW = defpackage.rl1.F7NU4MC0GW(j2, j5);
                this.ez2rX8ReCYw = j;
                this.riuEU0zW4 = j5;
                this.SH1y5HwkJhh = 3;
                obj = yVar2.AARZUJiTa(F7NU4MC0GW, j5, this);
                if (obj != vjVar) {
                    j3 = j;
                    j4 = j5;
                    return new defpackage.rl1(defpackage.rl1.F7NU4MC0GW(j3, defpackage.rl1.F7NU4MC0GW(j4, ((defpackage.rl1) obj).IHQe1A4L2xu)));
                }
                return vjVar;
            }
            j = this.ez2rX8ReCYw;
            defpackage.f70.nBH8hAHy(obj);
        }
        long F7NU4MC0GW2 = defpackage.rl1.F7NU4MC0GW(j, ((defpackage.rl1) obj).IHQe1A4L2xu);
        this.ez2rX8ReCYw = j;
        this.riuEU0zW4 = F7NU4MC0GW2;
        this.SH1y5HwkJhh = 2;
        obj = i61Var.IHQe1A4L2xu(F7NU4MC0GW2, this);
        if (obj != vjVar) {
            j2 = F7NU4MC0GW2;
            long j52 = ((defpackage.rl1) obj).IHQe1A4L2xu;
            defpackage.y yVar22 = i61Var.xiZrDbcSW0;
            long F7NU4MC0GW3 = defpackage.rl1.F7NU4MC0GW(j2, j52);
            this.ez2rX8ReCYw = j;
            this.riuEU0zW4 = j52;
            this.SH1y5HwkJhh = 3;
            obj = yVar22.AARZUJiTa(F7NU4MC0GW3, j52, this);
            if (obj != vjVar) {
            }
        }
        return vjVar;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        long j = ((defpackage.rl1) obj).IHQe1A4L2xu;
        defpackage.h61 h61Var = new defpackage.h61(this.JlrlGoKF, (defpackage.ej) obj2);
        h61Var.ez2rX8ReCYw = j;
        return h61Var.SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.h61 h61Var = new defpackage.h61(this.JlrlGoKF, ejVar);
        h61Var.ez2rX8ReCYw = ((defpackage.rl1) obj).IHQe1A4L2xu;
        return h61Var;
    }
}
