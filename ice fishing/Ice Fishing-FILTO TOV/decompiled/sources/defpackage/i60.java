package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class i60 implements ho {
    public go EljAMC1QTz;
    public final u9 OOA6hdeuvCS = new u9();

    @Override // defpackage.ho
    public final void A1EKNP6CxJ(long j, float f, long j2, float f2, qj qjVar) {
        this.OOA6hdeuvCS.A1EKNP6CxJ(j, f, j2, f2, qjVar);
    }

    @Override // defpackage.el
    public final float AEn1Rrio(long j) {
        return this.OOA6hdeuvCS.AEn1Rrio(j);
    }

    @Override // defpackage.el
    public final long CMh55RymNfS(long j) {
        return this.OOA6hdeuvCS.CMh55RymNfS(j);
    }

    public final void EljAMC1QTz(qj qjVar, long j, long j2, long j3, float f, qj qjVar2) {
        u9 u9Var = this.OOA6hdeuvCS;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        u9Var.OOA6hdeuvCS.X1lG3V04pd.rQPn8YBR(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), u9Var.X1lG3V04pd(qjVar, qjVar2, f, null, 3));
    }

    public final void GWasM1elztuh() {
        u9 u9Var = this.OOA6hdeuvCS;
        s9 EljAMC1QTz = u9Var.EljAMC1QTz.EljAMC1QTz();
        xk xkVar = this.EljAMC1QTz;
        if (xkVar == null) {
            throw mr0.EljAMC1QTz("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        he0 he0Var = (he0) xkVar;
        he0 he0Var2 = he0Var.OOA6hdeuvCS.JFJ3QoxA;
        if (he0Var2 != null && (he0Var2.encWxUiV2 & 4) != 0) {
            while (he0Var2 != null) {
                int i = he0Var2.AvO7iQsrTN;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    he0Var2 = he0Var2.JFJ3QoxA;
                }
            }
        }
        he0Var2 = null;
        if (he0Var2 == null) {
            bk0 AEn1Rrio = vc0.AEn1Rrio(xkVar, 4);
            if (AEn1Rrio.iK7aQfvhG() == he0Var.OOA6hdeuvCS) {
                AEn1Rrio = AEn1Rrio.jivtDDk9H;
                AEn1Rrio.getClass();
            }
            AEn1Rrio.gY3jNtCS0(EljAMC1QTz, (oy) u9Var.EljAMC1QTz.X1lG3V04pd);
            return;
        }
        rg0 rg0Var = null;
        while (he0Var2 != null) {
            if (he0Var2 instanceof go) {
                go goVar = (go) he0Var2;
                oy oyVar = (oy) u9Var.EljAMC1QTz.X1lG3V04pd;
                bk0 AEn1Rrio2 = vc0.AEn1Rrio(goVar, 4);
                long CMh55RymNfS = o30.CMh55RymNfS(AEn1Rrio2.AvO7iQsrTN);
                g60 g60Var = AEn1Rrio2.mE4lRynR;
                g60Var.getClass();
                ((c) j60.GWasM1elztuh(g60Var)).getSharedDrawScope().X1lG3V04pd(EljAMC1QTz, CMh55RymNfS, AEn1Rrio2, goVar, oyVar);
            } else if ((he0Var2.AvO7iQsrTN & 4) != 0 && (he0Var2 instanceof yk)) {
                int i2 = 0;
                for (he0 he0Var3 = ((yk) he0Var2).jivtDDk9H; he0Var3 != null; he0Var3 = he0Var3.JFJ3QoxA) {
                    if ((he0Var3.AvO7iQsrTN & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            he0Var2 = he0Var3;
                        } else {
                            if (rg0Var == null) {
                                rg0Var = new rg0(new he0[16]);
                            }
                            if (he0Var2 != null) {
                                rg0Var.Yi7zF1RB1(he0Var2);
                                he0Var2 = null;
                            }
                            rg0Var.Yi7zF1RB1(he0Var3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            he0Var2 = vc0.E7jCp8Ls(rg0Var);
        }
    }

    @Override // defpackage.el
    public final float K0ReC6MK(int i) {
        return this.OOA6hdeuvCS.K0ReC6MK(i);
    }

    @Override // defpackage.el
    public final float MItybXapHX(long j) {
        return this.OOA6hdeuvCS.MItybXapHX(j);
    }

    @Override // defpackage.ho
    public final void MZhzXH72(ma0 ma0Var, long j, long j2, float f) {
        this.OOA6hdeuvCS.MZhzXH72(ma0Var, j, j2, f);
    }

    @Override // defpackage.el
    public final long Mjvvu5DE(long j) {
        return this.OOA6hdeuvCS.Mjvvu5DE(j);
    }

    @Override // defpackage.el
    public final long NyNgffpi(float f) {
        return this.OOA6hdeuvCS.NyNgffpi(f);
    }

    public final void OOA6hdeuvCS(h1 h1Var, long j, qj qjVar) {
        u9 u9Var = this.OOA6hdeuvCS;
        u9Var.OOA6hdeuvCS.X1lG3V04pd.encWxUiV2(h1Var, u9.GWasM1elztuh(u9Var, j, qjVar, 1.0f, 3));
    }

    @Override // defpackage.ho
    public final void SyyZR548qbcW(h1 h1Var, qj qjVar, float f, qj qjVar2, int i) {
        this.OOA6hdeuvCS.SyyZR548qbcW(h1Var, qjVar, f, qjVar2, i);
    }

    @Override // defpackage.ho
    public final void TpUsjqg3bxO(w0 w0Var, long j, long j2, float f, s6 s6Var) {
        this.OOA6hdeuvCS.TpUsjqg3bxO(w0Var, j, j2, f, s6Var);
    }

    @Override // defpackage.ho
    public final void WdrkLMV3xh(ss0 ss0Var, float f, long j) {
        this.OOA6hdeuvCS.WdrkLMV3xh(ss0Var, f, j);
    }

    public final void X1lG3V04pd(s9 s9Var, long j, bk0 bk0Var, go goVar, oy oyVar) {
        go goVar2 = this.EljAMC1QTz;
        this.EljAMC1QTz = goVar;
        p50 p50Var = bk0Var.mE4lRynR.k8h8IjolWQ;
        u9 u9Var = this.OOA6hdeuvCS;
        f4 f4Var = u9Var.EljAMC1QTz;
        t9 t9Var = ((u9) f4Var.xqGvceK5x).OOA6hdeuvCS;
        el elVar = t9Var.GWasM1elztuh;
        p50 p50Var2 = t9Var.Yi7zF1RB1;
        s9 EljAMC1QTz = f4Var.EljAMC1QTz();
        f4 f4Var2 = u9Var.EljAMC1QTz;
        long mOu10nynGul = f4Var2.mOu10nynGul();
        oy oyVar2 = (oy) f4Var2.X1lG3V04pd;
        f4Var2.Mjvvu5DE(bk0Var);
        f4Var2.mE4lRynR(p50Var);
        f4Var2.YmKjaVtbfp5Z(s9Var);
        f4Var2.jivtDDk9H(j);
        f4Var2.X1lG3V04pd = oyVar;
        s9Var.E7jCp8Ls();
        try {
            goVar.DmJncFq5(this);
            s9Var.JFJ3QoxA();
            f4Var2.Mjvvu5DE(elVar);
            f4Var2.mE4lRynR(p50Var2);
            f4Var2.YmKjaVtbfp5Z(EljAMC1QTz);
            f4Var2.jivtDDk9H(mOu10nynGul);
            f4Var2.X1lG3V04pd = oyVar2;
            this.EljAMC1QTz = goVar2;
        } catch (Throwable th) {
            s9Var.JFJ3QoxA();
            f4Var2.Mjvvu5DE(elVar);
            f4Var2.mE4lRynR(p50Var2);
            f4Var2.YmKjaVtbfp5Z(EljAMC1QTz);
            f4Var2.jivtDDk9H(mOu10nynGul);
            f4Var2.X1lG3V04pd = oyVar2;
            throw th;
        }
    }

    @Override // defpackage.el
    public final float Yi7zF1RB1() {
        return this.OOA6hdeuvCS.Yi7zF1RB1();
    }

    @Override // defpackage.el
    public final long YmKjaVtbfp5Z(float f) {
        return this.OOA6hdeuvCS.YmKjaVtbfp5Z(f);
    }

    @Override // defpackage.ho
    public final void ZB4nixHlTE(long j, long j2, long j3, qj qjVar, int i) {
        this.OOA6hdeuvCS.ZB4nixHlTE(j, j2, j3, qjVar, i);
    }

    @Override // defpackage.ho
    public final f4 arNh8D4Z5gB() {
        return this.OOA6hdeuvCS.EljAMC1QTz;
    }

    @Override // defpackage.ho
    public final void c4eaifQP(long j, long j2, long j3, float f) {
        this.OOA6hdeuvCS.c4eaifQP(j, j2, j3, f);
    }

    @Override // defpackage.ho
    public final void cilMamHF(qj qjVar, long j, long j2, float f, qj qjVar2) {
        this.OOA6hdeuvCS.cilMamHF(qjVar, j, j2, f, qjVar2);
    }

    @Override // defpackage.ho
    public final p50 getLayoutDirection() {
        return this.OOA6hdeuvCS.OOA6hdeuvCS.Yi7zF1RB1;
    }

    @Override // defpackage.el
    public final float jivtDDk9H(float f) {
        return this.OOA6hdeuvCS.Yi7zF1RB1() * f;
    }

    @Override // defpackage.el
    public final float mOu10nynGul() {
        return this.OOA6hdeuvCS.mOu10nynGul();
    }

    @Override // defpackage.ho
    public final void pog2g9KITJA(long j, long j2, long j3, long j4, qj qjVar) {
        this.OOA6hdeuvCS.pog2g9KITJA(j, j2, j3, j4, qjVar);
    }

    @Override // defpackage.ho
    public final void qugwajBSa59j(ma0 ma0Var, long j, long j2) {
        this.OOA6hdeuvCS.qugwajBSa59j(ma0Var, j, j2);
    }

    @Override // defpackage.el
    public final float rASgSCrgZkT7(float f) {
        return f / this.OOA6hdeuvCS.Yi7zF1RB1();
    }

    @Override // defpackage.el
    public final int rezfBrjOrqK(float f) {
        return this.OOA6hdeuvCS.rezfBrjOrqK(f);
    }

    @Override // defpackage.ho
    public final void uFEq9NpZ(long j, float f, long j2, long j3, qj qjVar) {
        this.OOA6hdeuvCS.uFEq9NpZ(j, f, j2, j3, qjVar);
    }

    @Override // defpackage.ho
    public final long xqGvceK5x() {
        return this.OOA6hdeuvCS.xqGvceK5x();
    }

    @Override // defpackage.ho
    public final long z19UFEN2I() {
        return this.OOA6hdeuvCS.z19UFEN2I();
    }
}
