package defpackage;

/* loaded from: classes.dex */
public final class z51 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ float JlrlGoKF;
    public final /* synthetic */ defpackage.a61 SH1y5HwkJhh;
    public final /* synthetic */ float ez2rX8ReCYw;
    public int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z51(defpackage.a61 a61Var, float f, float f2, defpackage.ej ejVar) {
        super(2, ejVar);
        this.SH1y5HwkJhh = a61Var;
        this.ez2rX8ReCYw = f;
        this.JlrlGoKF = f2;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            this.riuEU0zW4 = 1;
            java.lang.Object IHQe1A4L2xu = defpackage.u51.IHQe1A4L2xu(this.SH1y5HwkJhh.WLpAkxCo, (java.lang.Float.floatToRawIntBits(this.ez2rX8ReCYw) << 32) | (java.lang.Float.floatToRawIntBits(this.JlrlGoKF) & 4294967295L), this);
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
        return defpackage.ok1.IHQe1A4L2xu;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.z51) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        return new defpackage.z51(this.SH1y5HwkJhh, this.ez2rX8ReCYw, this.JlrlGoKF, ejVar);
    }
}
