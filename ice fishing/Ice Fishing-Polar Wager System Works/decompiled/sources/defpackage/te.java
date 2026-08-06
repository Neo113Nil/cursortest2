package defpackage;

/* loaded from: classes.dex */
public final class te extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.x9 DFo87pBq1E5;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger JlrlGoKF;
    public final /* synthetic */ defpackage.hw[] SH1y5HwkJhh;
    public final /* synthetic */ int ez2rX8ReCYw;
    public int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(defpackage.hw[] hwVarArr, int i, java.util.concurrent.atomic.AtomicInteger atomicInteger, defpackage.x9 x9Var, defpackage.ej ejVar) {
        super(2, ejVar);
        this.SH1y5HwkJhh = hwVarArr;
        this.ez2rX8ReCYw = i;
        this.JlrlGoKF = atomicInteger;
        this.DFo87pBq1E5 = x9Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.JlrlGoKF;
        defpackage.x9 x9Var = this.DFo87pBq1E5;
        try {
            if (i == 0) {
                defpackage.f70.nBH8hAHy(obj);
                defpackage.hw[] hwVarArr = this.SH1y5HwkJhh;
                int i2 = this.ez2rX8ReCYw;
                defpackage.hw hwVar = hwVarArr[i2];
                defpackage.se seVar = new defpackage.se(x9Var, i2);
                this.riuEU0zW4 = 1;
                java.lang.Object IHQe1A4L2xu = hwVar.IHQe1A4L2xu(seVar, this);
                defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                if (IHQe1A4L2xu == vjVar) {
                    return vjVar;
                }
            } else {
                if (i != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                defpackage.f70.xiZrDbcSW0(x9Var);
            }
            return defpackage.ok1.IHQe1A4L2xu;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                defpackage.f70.xiZrDbcSW0(x9Var);
            }
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.te) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        return new defpackage.te(this.SH1y5HwkJhh, this.ez2rX8ReCYw, this.JlrlGoKF, this.DFo87pBq1E5, ejVar);
    }
}
