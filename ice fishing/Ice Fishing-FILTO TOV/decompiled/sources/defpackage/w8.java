package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class w8 extends d71 implements lv {
    public final /* synthetic */ boolean E7jCp8Ls;
    public final /* synthetic */ g2 JFJ3QoxA;
    public final /* synthetic */ d30 XnEVoBF0td1l;
    public int mOu10nynGul;
    public final /* synthetic */ float rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(g2 g2Var, float f, boolean z, p pVar, d30 d30Var, vg vgVar) {
        super(2, vgVar);
        this.JFJ3QoxA = g2Var;
        this.rQPn8YBR = f;
        this.E7jCp8Ls = z;
        this.XnEVoBF0td1l = d30Var;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((w8) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if ((r7 instanceof defpackage.et) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        if (r9 == r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e4, code lost:
    
        if (r9 != r6) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (r9 == r6) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        Object GWasM1elztuh;
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        if (i != 0) {
            if (i == 1) {
                o50.A1EKNP6CxJ(obj);
                return kc1Var;
            }
            if (i == 2) {
                o50.A1EKNP6CxJ(obj);
                return kc1Var;
            }
            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o50.A1EKNP6CxJ(obj);
        g2 g2Var = this.JFJ3QoxA;
        float f = ((cn) g2Var.OOA6hdeuvCS.getValue()).OOA6hdeuvCS;
        float f2 = this.rQPn8YBR;
        if (!cn.Yi7zF1RB1(f, f2)) {
            boolean z = this.E7jCp8Ls;
            qh qhVar = qh.OOA6hdeuvCS;
            if (z) {
                float f3 = ((cn) g2Var.OOA6hdeuvCS.getValue()).OOA6hdeuvCS;
                d30 vr0Var = cn.Yi7zF1RB1(f3, 0.0f) ? new vr0(0L) : cn.Yi7zF1RB1(f3, 0.0f) ? new vz() : cn.Yi7zF1RB1(f3, 0.0f) ? new et() : null;
                this.mOu10nynGul = 2;
                db1 db1Var = bp.Yi7zF1RB1;
                db1 db1Var2 = bp.GWasM1elztuh;
                d30 d30Var = this.XnEVoBF0td1l;
                if (d30Var != null) {
                    if (!(d30Var instanceof vr0)) {
                        if (!(d30Var instanceof yn)) {
                            if (!(d30Var instanceof vz)) {
                            }
                        }
                    }
                    if (db1Var2 != null) {
                        GWasM1elztuh = g2.X1lG3V04pd(g2Var, new cn(f2), db1Var2, this);
                    } else {
                        GWasM1elztuh = zg0.GWasM1elztuh(g2Var.EljAMC1QTz, new f2(g2Var, new cn(f2), null), this);
                        if (GWasM1elztuh != qhVar) {
                            GWasM1elztuh = kc1Var;
                        }
                    }
                } else {
                    if (vr0Var != null) {
                        if (!(vr0Var instanceof vr0) && !(vr0Var instanceof yn)) {
                            if (vr0Var instanceof vz) {
                                db1Var = bp.X1lG3V04pd;
                            } else if (!(vr0Var instanceof et)) {
                                db1Var = null;
                            }
                        }
                        db1Var2 = db1Var;
                        if (db1Var2 != null) {
                        }
                    }
                    db1Var2 = null;
                    if (db1Var2 != null) {
                    }
                }
            } else {
                cn cnVar = new cn(f2);
                this.mOu10nynGul = 1;
                Object GWasM1elztuh2 = zg0.GWasM1elztuh(g2Var.EljAMC1QTz, new f2(g2Var, cnVar, null), this);
                if (GWasM1elztuh2 != qhVar) {
                    GWasM1elztuh2 = kc1Var;
                }
                if (GWasM1elztuh2 == qhVar) {
                    return qhVar;
                }
            }
        }
        return kc1Var;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        return new w8(this.JFJ3QoxA, this.rQPn8YBR, this.E7jCp8Ls, null, this.XnEVoBF0td1l, vgVar);
    }
}
