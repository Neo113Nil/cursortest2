package defpackage;

import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes3.dex */
public final class zp8 implements yp8 {
    public tp8 a;
    public boolean b;

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0087, code lost:
    
        if (defpackage.xp3.B(r3 != null ? r3.a : null, r4 != null ? r4.a : null) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0128, code lost:
    
        if (defpackage.vut.B(r12 != null ? r12.e : null, r2 != null ? r2.e : null) != false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0116, code lost:
    
        if (defpackage.vut.u(r3 != null ? r3.b : null, r4 != null ? r4.b : null) != false) goto L127;
     */
    @Override // defpackage.yp8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(e23 e23Var, op8 op8Var, View view) {
        boolean z;
        bf9 bf9Var;
        ow8 ow8Var;
        szb szbVar;
        bf9 bf9Var2;
        ow8 ow8Var2;
        szb szbVar2;
        bf9 bf9Var3;
        ow8 ow8Var3;
        szb szbVar3;
        bf9 bf9Var4;
        ow8 ow8Var4;
        szb szbVar4;
        szb szbVar5;
        szb szbVar6;
        szb szbVar7;
        szb szbVar8;
        szb szbVar9;
        szb szbVar10;
        szb szbVar11;
        szb szbVar12;
        szb szbVar13;
        szb szbVar14;
        bf9 bf9Var5;
        ow8 ow8Var5;
        ow8 ow8Var6;
        if (this.a == null && op8Var != null) {
            this.a = new tp8(e23Var.a, view);
        }
        tp8 tp8Var = this.a;
        if (tp8Var != null) {
            xzb xzbVar = e23Var.b;
            op8 op8Var2 = tp8Var.c;
            if (op8Var != null || op8Var2 != null) {
                if (xp3.B(op8Var != null ? op8Var.a : null, op8Var2 != null ? op8Var2.a : null)) {
                    fu8 fu8Var = op8Var != null ? op8Var.b : null;
                    fu8 fu8Var2 = op8Var2 != null ? op8Var2.b : null;
                    if (fu8Var != null || fu8Var2 != null) {
                        if (xp3.B(fu8Var != null ? fu8Var.c : null, fu8Var2 != null ? fu8Var2.c : null)) {
                            if (xp3.B(fu8Var != null ? fu8Var.d : null, fu8Var2 != null ? fu8Var2.d : null)) {
                                if (xp3.B(fu8Var != null ? fu8Var.b : null, fu8Var2 != null ? fu8Var2.b : null)) {
                                }
                            }
                        }
                    }
                    if (xp3.B(op8Var != null ? op8Var.c : null, op8Var2 != null ? op8Var2.c : null)) {
                        dj9 dj9Var = op8Var != null ? op8Var.d : null;
                        dj9 dj9Var2 = op8Var2 != null ? op8Var2.d : null;
                        if (dj9Var != null || dj9Var2 != null) {
                            if (xp3.B(dj9Var != null ? dj9Var.a : null, dj9Var2 != null ? dj9Var2.a : null)) {
                                if (xp3.B(dj9Var != null ? dj9Var.b : null, dj9Var2 != null ? dj9Var2.b : null)) {
                                    if (xp3.B(dj9Var != null ? dj9Var.c : null, dj9Var2 != null ? dj9Var2.c : null)) {
                                        bf9 bf9Var6 = dj9Var != null ? dj9Var.d : null;
                                        bf9 bf9Var7 = dj9Var2 != null ? dj9Var2.d : null;
                                        if (bf9Var6 != null || bf9Var7 != null) {
                                            if (vut.u(bf9Var6 != null ? bf9Var6.a : null, bf9Var7 != null ? bf9Var7.a : null)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                tp8Var.l();
                tp8Var.c = op8Var;
                tp8Var.b(op8Var, xzbVar);
                if (op8Var != null) {
                    szb szbVar15 = op8Var.c;
                    szb szbVar16 = op8Var.a;
                    ln9 ln9Var = op8Var.e;
                    fu8 fu8Var3 = op8Var.b;
                    dj9 dj9Var3 = op8Var.d;
                    if (!xp3.V(szbVar16) || ((fu8Var3 != null && (!xp3.V(fu8Var3.c) || !xp3.V(fu8Var3.d) || !xp3.V(fu8Var3.b) || !xp3.V(fu8Var3.a))) || !(szbVar15 instanceof ozb) || ((dj9Var3 != null && (!(dj9Var3.a instanceof ozb) || !(dj9Var3.b instanceof ozb) || !(dj9Var3.c instanceof ozb) || ((bf9Var5 = dj9Var3.d) != null && (((ow8Var5 = bf9Var5.a) != null && (!(ow8Var5.a instanceof ozb) || !(ow8Var5.b instanceof ozb))) || ((ow8Var6 = bf9Var5.b) != null && (!(ow8Var6.a instanceof ozb) || !(ow8Var6.b instanceof ozb))))))) || !vut.P(ln9Var)))) {
                        lj0 lj0Var = new lj0(16, tp8Var, op8Var, xzbVar);
                        tp8Var.i(szbVar16 != null ? szbVar16.c(xzbVar, lj0Var) : null);
                        tp8Var.i((fu8Var3 == null || (szbVar14 = fu8Var3.c) == null) ? null : szbVar14.c(xzbVar, lj0Var));
                        tp8Var.i((fu8Var3 == null || (szbVar13 = fu8Var3.d) == null) ? null : szbVar13.c(xzbVar, lj0Var));
                        tp8Var.i((fu8Var3 == null || (szbVar12 = fu8Var3.b) == null) ? null : szbVar12.c(xzbVar, lj0Var));
                        tp8Var.i((fu8Var3 == null || (szbVar11 = fu8Var3.a) == null) ? null : szbVar11.c(xzbVar, lj0Var));
                        tp8Var.i(szbVar15.c(xzbVar, lj0Var));
                        tp8Var.i((ln9Var == null || (szbVar10 = ln9Var.a) == null) ? null : szbVar10.c(xzbVar, lj0Var));
                        tp8Var.i((ln9Var == null || (szbVar9 = ln9Var.d) == null) ? null : szbVar9.c(xzbVar, lj0Var));
                        tp8Var.i((ln9Var == null || (szbVar8 = ln9Var.c) == null) ? null : szbVar8.c(xzbVar, lj0Var));
                        tp8Var.i((dj9Var3 == null || (szbVar7 = dj9Var3.a) == null) ? null : szbVar7.c(xzbVar, lj0Var));
                        tp8Var.i((dj9Var3 == null || (szbVar6 = dj9Var3.b) == null) ? null : szbVar6.c(xzbVar, lj0Var));
                        tp8Var.i((dj9Var3 == null || (szbVar5 = dj9Var3.c) == null) ? null : szbVar5.c(xzbVar, lj0Var));
                        tp8Var.i((dj9Var3 == null || (bf9Var4 = dj9Var3.d) == null || (ow8Var4 = bf9Var4.a) == null || (szbVar4 = ow8Var4.a) == null) ? null : szbVar4.c(xzbVar, lj0Var));
                        tp8Var.i((dj9Var3 == null || (bf9Var3 = dj9Var3.d) == null || (ow8Var3 = bf9Var3.a) == null || (szbVar3 = ow8Var3.b) == null) ? null : szbVar3.c(xzbVar, lj0Var));
                        tp8Var.i((dj9Var3 == null || (bf9Var2 = dj9Var3.d) == null || (ow8Var2 = bf9Var2.b) == null || (szbVar2 = ow8Var2.a) == null) ? null : szbVar2.c(xzbVar, lj0Var));
                        tp8Var.i((dj9Var3 == null || (bf9Var = dj9Var3.d) == null || (ow8Var = bf9Var.b) == null || (szbVar = ow8Var.b) == null) ? null : szbVar.c(xzbVar, lj0Var));
                    }
                }
            }
        }
        tp8 tp8Var2 = this.a;
        if (tp8Var2 != null && tp8Var2.n != (z = this.b)) {
            tp8Var2.n = z;
            tp8Var2.j();
            tp8Var2.b.invalidate();
        }
        if (op8Var == null) {
            view.setElevation(0.0f);
            view.setClipToOutline(false);
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            m();
            this.a = null;
        }
        view.invalidate();
    }

    @Override // defpackage.yp8
    public final tp8 getDivBorderDrawer() {
        return this.a;
    }

    @Override // defpackage.yp8
    public final boolean getNeedClipping() {
        return this.b;
    }

    @Override // defpackage.yp8
    public final void setNeedClipping(boolean z) {
        tp8 tp8Var = this.a;
        if (tp8Var != null && tp8Var.n != z) {
            tp8Var.n = z;
            tp8Var.j();
            tp8Var.b.invalidate();
        }
        this.b = z;
    }
}
