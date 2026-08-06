package defpackage;

/* loaded from: classes.dex */
public final class wl extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ int DFo87pBq1E5;
    public final /* synthetic */ defpackage.bm JlrlGoKF;
    public int SH1y5HwkJhh;
    public java.lang.Object SyNS6RMn;
    public /* synthetic */ boolean ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wl(defpackage.bm bmVar, int i, defpackage.ej ejVar, int i2) {
        super(2, ejVar);
        this.riuEU0zW4 = i2;
        this.JlrlGoKF = bmVar;
        this.DFo87pBq1E5 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
    
        if (r10 == r4) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        java.lang.Throwable th;
        defpackage.dc1 dc1Var;
        boolean z;
        boolean z2;
        java.lang.Object obj2;
        int i = this.riuEU0zW4;
        int i2 = this.DFo87pBq1E5;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        defpackage.bm bmVar = this.JlrlGoKF;
        switch (i) {
            case 0:
                boolean z3 = this.SH1y5HwkJhh;
                try {
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (z3 != 0) {
                        defpackage.x91 EXtogiMhuM = bmVar.EXtogiMhuM();
                        this.SyNS6RMn = th;
                        this.ez2rX8ReCYw = z3;
                        this.SH1y5HwkJhh = 2;
                        java.lang.Integer IHQe1A4L2xu = EXtogiMhuM.IHQe1A4L2xu();
                        if (IHQe1A4L2xu != vjVar) {
                            obj = IHQe1A4L2xu;
                            th = th;
                            z3 = z3;
                        }
                    }
                }
                if (z3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    boolean z4 = this.ez2rX8ReCYw;
                    this.ez2rX8ReCYw = z4;
                    this.SH1y5HwkJhh = 1;
                    obj = defpackage.bm.AARZUJiTa(bmVar, z4, this);
                    z3 = z4;
                    if (obj == vjVar) {
                        return vjVar;
                    }
                } else {
                    if (z3 != 1) {
                        if (z3 != 2) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z5 = this.ez2rX8ReCYw;
                        th = (java.lang.Throwable) this.SyNS6RMn;
                        defpackage.f70.nBH8hAHy(obj);
                        z3 = z5;
                        i2 = ((java.lang.Number) obj).intValue();
                        th = th;
                        dc1Var = new defpackage.uy0(th, i2);
                        z = z3;
                        return new defpackage.et0(dc1Var, java.lang.Boolean.valueOf(z));
                    }
                    boolean z6 = this.ez2rX8ReCYw;
                    defpackage.f70.nBH8hAHy(obj);
                    z3 = z6;
                }
                dc1Var = (defpackage.dc1) obj;
                z = z3;
                return new defpackage.et0(dc1Var, java.lang.Boolean.valueOf(z));
            default:
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    z2 = this.ez2rX8ReCYw;
                    this.ez2rX8ReCYw = z2;
                    this.SH1y5HwkJhh = 1;
                    obj = bmVar.SH1y5HwkJhh(this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.SyNS6RMn;
                        defpackage.f70.nBH8hAHy(obj);
                        i2 = ((java.lang.Number) obj).intValue();
                        obj = obj2;
                        return new defpackage.zk(obj == null ? obj.hashCode() : 0, i2, obj);
                    }
                    z2 = this.ez2rX8ReCYw;
                    defpackage.f70.nBH8hAHy(obj);
                }
                if (z2) {
                    defpackage.x91 EXtogiMhuM2 = bmVar.EXtogiMhuM();
                    this.SyNS6RMn = obj;
                    this.SH1y5HwkJhh = 2;
                    java.lang.Integer IHQe1A4L2xu2 = EXtogiMhuM2.IHQe1A4L2xu();
                    if (IHQe1A4L2xu2 != vjVar) {
                        java.lang.Object obj3 = obj;
                        obj = IHQe1A4L2xu2;
                        obj2 = obj3;
                        i2 = ((java.lang.Number) obj).intValue();
                        obj = obj2;
                    }
                    return vjVar;
                }
                return new defpackage.zk(obj == null ? obj.hashCode() : 0, i2, obj);
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        defpackage.ej ejVar = (defpackage.ej) obj2;
        switch (i) {
        }
        return ((defpackage.wl) ez2rX8ReCYw(ejVar, bool)).SyNS6RMn(ok1Var);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        int i2 = this.DFo87pBq1E5;
        defpackage.bm bmVar = this.JlrlGoKF;
        switch (i) {
            case 0:
                defpackage.wl wlVar = new defpackage.wl(bmVar, i2, ejVar, 0);
                wlVar.ez2rX8ReCYw = ((java.lang.Boolean) obj).booleanValue();
                return wlVar;
            default:
                defpackage.wl wlVar2 = new defpackage.wl(bmVar, i2, ejVar, 1);
                wlVar2.ez2rX8ReCYw = ((java.lang.Boolean) obj).booleanValue();
                return wlVar2;
        }
    }
}
