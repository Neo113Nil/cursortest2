package defpackage;

/* loaded from: classes.dex */
public final class iz extends defpackage.o11 implements defpackage.k00 {
    public final /* synthetic */ int AARZUJiTa = 1;
    public java.lang.Object EXtogiMhuM;
    public /* synthetic */ java.lang.Object SH1y5HwkJhh;
    public final /* synthetic */ defpackage.s00 ez2rX8ReCYw;
    public int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz(defpackage.lj ljVar, defpackage.k00 k00Var, defpackage.ej ejVar) {
        super(ejVar);
        this.SH1y5HwkJhh = ljVar;
        this.ez2rX8ReCYw = k00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (r13 != r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
    
        if (r13 == r4) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3, types: [fe1, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0040 -> B:7:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009a -> B:23:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00af -> B:23:0x006a). Please report as a decompilation issue!!! */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.fe1 fe1Var;
        defpackage.fe1 fe1Var2;
        defpackage.z71 z71Var;
        java.lang.Object IHQe1A4L2xu;
        int i = this.AARZUJiTa;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.s00 s00Var = this.ez2rX8ReCYw;
        defpackage.fe1 fe1Var3 = "call to 'resume' before 'invoke' with coroutine";
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        switch (i) {
            case 0:
                defpackage.lj ljVar = (defpackage.lj) this.SH1y5HwkJhh;
                int i2 = this.riuEU0zW4;
                defpackage.pv0 pv0Var = defpackage.pv0.AARZUJiTa;
                try {
                } catch (java.util.concurrent.CancellationException e) {
                    e = e;
                    if (!defpackage.x80.nBH8hAHy(ljVar)) {
                        this.EXtogiMhuM = fe1Var3;
                        this.riuEU0zW4 = 3;
                        java.lang.Object G3OKOH3wZRC = defpackage.fm.G3OKOH3wZRC(fe1Var3, pv0Var, this);
                        fe1Var2 = fe1Var3;
                        break;
                    } else {
                        throw e;
                    }
                }
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    fe1Var = (defpackage.fe1) this.EXtogiMhuM;
                    if (defpackage.x80.nBH8hAHy(ljVar)) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            defpackage.fe1 fe1Var4 = (defpackage.fe1) this.EXtogiMhuM;
                            defpackage.f70.nBH8hAHy(obj);
                            fe1Var2 = fe1Var4;
                        } else {
                            if (i2 != 3) {
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            defpackage.fe1 fe1Var5 = (defpackage.fe1) this.EXtogiMhuM;
                            defpackage.f70.nBH8hAHy(obj);
                            fe1Var2 = fe1Var5;
                        }
                        fe1Var = fe1Var2;
                        if (defpackage.x80.nBH8hAHy(ljVar)) {
                            return ok1Var;
                        }
                        try {
                        } catch (java.util.concurrent.CancellationException e2) {
                            fe1Var3 = fe1Var;
                            e = e2;
                            if (!defpackage.x80.nBH8hAHy(ljVar)) {
                            }
                        }
                        this.EXtogiMhuM = fe1Var;
                        this.riuEU0zW4 = 1;
                        if (((defpackage.k00) s00Var).adDC3e2L(fe1Var, this) != vjVar) {
                            fe1Var3 = fe1Var;
                            this.EXtogiMhuM = fe1Var3;
                            this.riuEU0zW4 = 2;
                            java.lang.Object G3OKOH3wZRC2 = defpackage.fm.G3OKOH3wZRC(fe1Var3, pv0Var, this);
                            fe1Var2 = fe1Var3;
                            break;
                        }
                        return vjVar;
                    }
                    defpackage.fe1 fe1Var6 = (defpackage.fe1) this.EXtogiMhuM;
                    defpackage.f70.nBH8hAHy(obj);
                    fe1Var3 = fe1Var6;
                    this.EXtogiMhuM = fe1Var3;
                    this.riuEU0zW4 = 2;
                    java.lang.Object G3OKOH3wZRC22 = defpackage.fm.G3OKOH3wZRC(fe1Var3, pv0Var, this);
                    fe1Var2 = fe1Var3;
                }
            default:
                int i3 = this.riuEU0zW4;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    z71Var = (defpackage.z71) this.SH1y5HwkJhh;
                    IHQe1A4L2xu = ((defpackage.e3) s00Var).IHQe1A4L2xu();
                    if (IHQe1A4L2xu != null) {
                    }
                } else {
                    if (i3 != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    java.lang.Object obj2 = this.EXtogiMhuM;
                    z71Var = (defpackage.z71) this.SH1y5HwkJhh;
                    defpackage.f70.nBH8hAHy(obj);
                    if (obj2 == null) {
                        return ok1Var;
                    }
                    IHQe1A4L2xu = ((defpackage.e3) s00Var).IHQe1A4L2xu();
                    if (IHQe1A4L2xu != null) {
                        this.SH1y5HwkJhh = z71Var;
                        this.EXtogiMhuM = IHQe1A4L2xu;
                        this.riuEU0zW4 = 1;
                        z71Var.oh6vYeIP(this, IHQe1A4L2xu);
                        return vjVar;
                    }
                    obj2 = null;
                    if (obj2 == null) {
                    }
                    IHQe1A4L2xu = ((defpackage.e3) s00Var).IHQe1A4L2xu();
                    if (IHQe1A4L2xu != null) {
                    }
                }
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.AARZUJiTa;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                return ((defpackage.iz) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.fe1) obj)).SyNS6RMn(ok1Var);
            default:
                return ((defpackage.iz) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.z71) obj)).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.AARZUJiTa;
        defpackage.s00 s00Var = this.ez2rX8ReCYw;
        switch (i) {
            case 0:
                defpackage.iz izVar = new defpackage.iz((defpackage.lj) this.SH1y5HwkJhh, (defpackage.k00) s00Var, ejVar);
                izVar.EXtogiMhuM = obj;
                return izVar;
            default:
                defpackage.iz izVar2 = new defpackage.iz((defpackage.e3) s00Var, ejVar);
                izVar2.SH1y5HwkJhh = obj;
                return izVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz(defpackage.e3 e3Var, defpackage.ej ejVar) {
        super(ejVar);
        this.ez2rX8ReCYw = e3Var;
    }
}
