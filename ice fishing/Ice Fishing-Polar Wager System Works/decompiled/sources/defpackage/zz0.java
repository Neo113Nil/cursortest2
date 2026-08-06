package defpackage;

/* loaded from: classes.dex */
public final class zz0 {
    public final int IHQe1A4L2xu;
    public final defpackage.wg1 oh6vYeIP;
    public float r1MBDhnF;

    public zz0(int i, defpackage.wg1 wg1Var) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = wg1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object IHQe1A4L2xu(float f, defpackage.fj fjVar) {
        defpackage.yz0 yz0Var;
        int i;
        if (fjVar instanceof defpackage.yz0) {
            yz0Var = (defpackage.yz0) fjVar;
            int i2 = yz0Var.SH1y5HwkJhh;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yz0Var.SH1y5HwkJhh = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = yz0Var.EXtogiMhuM;
                i = yz0Var.SH1y5HwkJhh;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    java.lang.Float f2 = new java.lang.Float(f);
                    yz0Var.SH1y5HwkJhh = 1;
                    obj = this.oh6vYeIP.adDC3e2L(f2, yz0Var);
                    defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                    if (obj == vjVar) {
                        return vjVar;
                    }
                } else {
                    if (i != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.f70.nBH8hAHy(obj);
                }
                this.r1MBDhnF += ((java.lang.Number) obj).floatValue();
                return defpackage.ok1.IHQe1A4L2xu;
            }
        }
        yz0Var = new defpackage.yz0(this, fjVar);
        java.lang.Object obj2 = yz0Var.EXtogiMhuM;
        i = yz0Var.SH1y5HwkJhh;
        if (i != 0) {
        }
        this.r1MBDhnF += ((java.lang.Number) obj2).floatValue();
        return defpackage.ok1.IHQe1A4L2xu;
    }
}
