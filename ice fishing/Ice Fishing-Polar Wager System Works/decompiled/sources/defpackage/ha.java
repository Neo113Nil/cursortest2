package defpackage;

/* loaded from: classes.dex */
public final class ha extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ boolean DFo87pBq1E5;
    public final /* synthetic */ float JlrlGoKF;
    public int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.l70 SyNS6RMn;
    public final /* synthetic */ java.lang.Object cnag84Bm;
    public final /* synthetic */ defpackage.w3 ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(defpackage.w3 w3Var, float f, boolean z, defpackage.ia iaVar, defpackage.l70 l70Var, defpackage.ej ejVar) {
        super(2, ejVar);
        this.ez2rX8ReCYw = w3Var;
        this.JlrlGoKF = f;
        this.DFo87pBq1E5 = z;
        this.cnag84Bm = iaVar;
        this.SyNS6RMn = l70Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r5.adDC3e2L(r13, r12) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (defpackage.qs.IHQe1A4L2xu(r5, r6, r13, r10, r12) == r4) goto L19;
     */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        boolean z = this.DFo87pBq1E5;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        defpackage.w3 w3Var = this.ez2rX8ReCYw;
        float f = this.JlrlGoKF;
        java.lang.Object obj2 = this.cnag84Bm;
        defpackage.l70 l70Var = this.SyNS6RMn;
        defpackage.l70 l70Var2 = null;
        switch (i) {
            case 0:
                defpackage.ia iaVar = (defpackage.ia) obj2;
                int i2 = this.SH1y5HwkJhh;
                if (i2 != 0) {
                    if (i2 == 1 || i2 == 2) {
                        defpackage.f70.nBH8hAHy(obj);
                        return ok1Var;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                if (defpackage.uq.oh6vYeIP(((defpackage.uq) w3Var.adDC3e2L.getValue()).adDC3e2L, f)) {
                    return ok1Var;
                }
                if (z) {
                    float f2 = ((defpackage.uq) w3Var.adDC3e2L.getValue()).adDC3e2L;
                    if (defpackage.uq.oh6vYeIP(f2, 0.0f)) {
                        l70Var2 = new defpackage.px0(0L);
                    } else if (defpackage.uq.oh6vYeIP(f2, iaVar.IHQe1A4L2xu)) {
                        l70Var2 = new defpackage.l40();
                    } else if (defpackage.uq.oh6vYeIP(f2, 0.0f)) {
                        l70Var2 = new defpackage.tx();
                    }
                    this.SH1y5HwkJhh = 2;
                    if (defpackage.qs.IHQe1A4L2xu(w3Var, f, l70Var2, l70Var, this) != vjVar) {
                        return ok1Var;
                    }
                } else {
                    defpackage.uq uqVar = new defpackage.uq(f);
                    this.SH1y5HwkJhh = 1;
                    if (w3Var.adDC3e2L(uqVar, this) != vjVar) {
                        return ok1Var;
                    }
                }
                return vjVar;
            default:
                defpackage.sl0 sl0Var = (defpackage.sl0) obj2;
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    if (!defpackage.uq.oh6vYeIP(((defpackage.uq) w3Var.adDC3e2L.getValue()).adDC3e2L, f)) {
                        if (!z) {
                            defpackage.uq uqVar2 = new defpackage.uq(f);
                            this.SH1y5HwkJhh = 1;
                            break;
                        } else {
                            defpackage.l70 l70Var3 = (defpackage.l70) sl0Var.getValue();
                            this.SH1y5HwkJhh = 2;
                            break;
                        }
                    } else {
                        return ok1Var;
                    }
                } else {
                    if (i3 != 1 && i3 != 2) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.f70.nBH8hAHy(obj);
                }
                sl0Var.setValue(l70Var);
                return ok1Var;
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.uj ujVar = (defpackage.uj) obj;
        defpackage.ej ejVar = (defpackage.ej) obj2;
        switch (i) {
        }
        return ((defpackage.ha) ez2rX8ReCYw(ejVar, ujVar)).SyNS6RMn(ok1Var);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        java.lang.Object obj2 = this.cnag84Bm;
        switch (i) {
            case 0:
                defpackage.l70 l70Var = this.SyNS6RMn;
                return new defpackage.ha(this.ez2rX8ReCYw, this.JlrlGoKF, this.DFo87pBq1E5, (defpackage.ia) obj2, l70Var, ejVar);
            default:
                return new defpackage.ha(this.ez2rX8ReCYw, this.JlrlGoKF, this.DFo87pBq1E5, this.SyNS6RMn, (defpackage.sl0) obj2, ejVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(defpackage.w3 w3Var, float f, boolean z, defpackage.l70 l70Var, defpackage.sl0 sl0Var, defpackage.ej ejVar) {
        super(2, ejVar);
        this.ez2rX8ReCYw = w3Var;
        this.JlrlGoKF = f;
        this.DFo87pBq1E5 = z;
        this.SyNS6RMn = l70Var;
        this.cnag84Bm = sl0Var;
    }
}
