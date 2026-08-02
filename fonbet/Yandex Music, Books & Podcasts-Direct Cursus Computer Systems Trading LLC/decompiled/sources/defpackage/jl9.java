package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class jl9 extends p9 {
    public final yb8 b;
    public final ly9 c;
    public final pct d;
    public final efb e;
    public final float f;
    public final boolean g;
    public dfb h;

    public jl9(gp8 gp8Var, yb8 yb8Var, ly9 ly9Var, pct pctVar, efb efbVar, float f, boolean z) {
        super(gp8Var);
        this.b = yb8Var;
        this.c = ly9Var;
        this.d = pctVar;
        this.e = efbVar;
        this.f = f;
        this.g = z;
    }

    public final void G(wl9 wl9Var) {
        if (!this.g || this.h == null) {
            return;
        }
        srj.c(wl9Var, new nud(wl9Var, wl9Var, this, 7));
    }

    @Override // defpackage.p9
    public final void k(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2, pm9 pm9Var) {
        jas jasVar;
        int i;
        ix8 ix8Var;
        xzb xzbVar;
        szb szbVar;
        xzb xzbVar2;
        wl9 wl9Var = (wl9) view;
        zk9 zk9Var = (zk9) dp8Var;
        xzb xzbVar3 = e23Var.b;
        gc8 gc8Var = e23Var.a;
        this.h = this.e.a(gc8Var.getDivData(), gc8Var.getDataTag());
        wl9Var.setInterceptionAngle(this.f);
        szb szbVar2 = zk9Var.s;
        dx8 dx8Var = zk9Var.J;
        dx8 dx8Var2 = zk9Var.I;
        dx8 dx8Var3 = zk9Var.C;
        wl9Var.i(szbVar2.d(xzbVar3, new al9(wl9Var, this, 0)));
        szb szbVar3 = zk9Var.r;
        wl9Var.i(szbVar3.d(xzbVar3, new al9(wl9Var, this, 1)));
        wl9Var.i(zk9Var.o.d(xzbVar3, new az6(22, wl9Var)));
        wl9Var.b.clear();
        String str = zk9Var.E;
        pct pctVar = this.d;
        if (str != null) {
            wl9Var.i(pctVar.l(e23Var, str, new vx6(9, wl9Var, this, e23Var)));
        }
        wl9Var.setThumbDrawable(vq1.g0(dx8Var3, wl9Var.getResources().getDisplayMetrics(), xzbVar3));
        sk3.J(wl9Var, dx8Var3, xzbVar3, new bl9(this, wl9Var, xzbVar3, dx8Var3, 1));
        yk9 yk9Var = zk9Var.D;
        ly9 ly9Var = this.c;
        wl9Var.setThumbTextDrawable(yk9Var != null ? new jas(c3x.W(yk9Var, wl9Var.getResources().getDisplayMetrics(), ly9Var, xzbVar3)) : null);
        if (yk9Var != null) {
            wl9Var.i(yk9Var.i.c(xzbVar3, new cl9(this, wl9Var, xzbVar3, yk9Var, 1)));
        }
        String str2 = zk9Var.B;
        if (str2 == null) {
            wl9Var.setThumbSecondaryDrawable(null);
            wl9Var.t(null, false, true);
            i = 0;
            jasVar = null;
        } else {
            Unit unit = null;
            wl9Var.i(pctVar.l(e23Var, str2, new es6(wl9Var, this, e23Var)));
            dx8 dx8Var4 = zk9Var.z;
            if (dx8Var4 != null) {
                wl9Var.setThumbSecondaryDrawable(vq1.g0(dx8Var4, wl9Var.getResources().getDisplayMetrics(), xzbVar3));
                jasVar = null;
                i = 0;
                sk3.J(wl9Var, dx8Var4, xzbVar3, new bl9(this, wl9Var, xzbVar3, dx8Var4, 0));
                unit = Unit.a;
            } else {
                jasVar = null;
                i = 0;
            }
            if (unit == null) {
                wl9Var.setThumbSecondaryDrawable(vq1.g0(dx8Var3, wl9Var.getResources().getDisplayMetrics(), xzbVar3));
                sk3.J(wl9Var, dx8Var3, xzbVar3, new bl9(this, wl9Var, xzbVar3, dx8Var3, 0));
            }
            yk9 yk9Var2 = zk9Var.A;
            wl9Var.setThumbSecondTextDrawable(yk9Var2 != null ? new jas(c3x.W(yk9Var2, wl9Var.getResources().getDisplayMetrics(), ly9Var, xzbVar3)) : jasVar);
            if (yk9Var2 != null) {
                wl9Var.i(yk9Var2.i.c(xzbVar3, new cl9(this, wl9Var, xzbVar3, yk9Var2, 0)));
            }
        }
        wl9Var.setActiveTrackDrawable(vq1.g0(dx8Var2, wl9Var.getResources().getDisplayMetrics(), xzbVar3));
        sk3.J(wl9Var, dx8Var2, xzbVar3, new bl9(this, wl9Var, xzbVar3, dx8Var2, 2));
        wl9Var.setInactiveTrackDrawable(vq1.g0(dx8Var, wl9Var.getResources().getDisplayMetrics(), xzbVar3));
        sk3.J(wl9Var, dx8Var, xzbVar3, new bl9(this, wl9Var, xzbVar3, dx8Var, 3));
        dx8 dx8Var5 = zk9Var.F;
        wl9Var.setActiveTickMarkDrawable(dx8Var5 != null ? vq1.g0(dx8Var5, wl9Var.getResources().getDisplayMetrics(), xzbVar3) : jasVar);
        G(wl9Var);
        sk3.J(wl9Var, dx8Var5, xzbVar3, new fl9(this, wl9Var, xzbVar3, dx8Var5, 0));
        dx8 dx8Var6 = zk9Var.G;
        wl9Var.setInactiveTickMarkDrawable(dx8Var6 != null ? vq1.g0(dx8Var6, wl9Var.getResources().getDisplayMetrics(), xzbVar3) : jasVar);
        G(wl9Var);
        sk3.J(wl9Var, dx8Var6, xzbVar3, new fl9(this, wl9Var, xzbVar3, dx8Var6, 1));
        wl9Var.getRanges().clear();
        List<xk9> list = zk9Var.u;
        if (list == null) {
            return;
        }
        DisplayMetrics displayMetrics = wl9Var.getResources().getDisplayMetrics();
        for (xk9 xk9Var : list) {
            ouq ouqVar = new ouq();
            wl9Var.getRanges().add(ouqVar);
            szb szbVar4 = xk9Var.c;
            if (szbVar4 == null) {
                szbVar4 = szbVar2;
            }
            wl9Var.i(szbVar4.d(xzbVar3, new gl9(wl9Var, ouqVar, 0)));
            szb szbVar5 = xk9Var.a;
            if (szbVar5 == null) {
                szbVar5 = szbVar3;
            }
            wl9Var.i(szbVar5.d(xzbVar3, new gl9(wl9Var, ouqVar, 1)));
            xzb xzbVar4 = xzbVar3;
            ix8 ix8Var2 = xk9Var.b;
            if (ix8Var2 == null) {
                ouqVar.c = i;
                ouqVar.d = i;
                xzbVar2 = xzbVar4;
            } else {
                szb szbVar6 = ix8Var2.b;
                szb szbVar7 = ix8Var2.e;
                int i2 = (szbVar7 == null && szbVar6 == null) ? i : 1;
                if (i2 == 0) {
                    szbVar7 = ix8Var2.c;
                }
                if (i2 == 0) {
                    szbVar6 = ix8Var2.d;
                }
                szb szbVar8 = szbVar6;
                if (szbVar7 != null) {
                    wl9 wl9Var2 = wl9Var;
                    DisplayMetrics displayMetrics2 = displayMetrics;
                    szbVar = szbVar7;
                    hl9 hl9Var = new hl9(wl9Var2, ouqVar, ix8Var2, xzbVar4, displayMetrics2, 0);
                    ouqVar = ouqVar;
                    wl9Var = wl9Var2;
                    ix8Var = ix8Var2;
                    xzbVar = xzbVar4;
                    displayMetrics = displayMetrics2;
                    wl9Var.i(szbVar.c(xzbVar, hl9Var));
                } else {
                    ix8Var = ix8Var2;
                    xzbVar = xzbVar4;
                    szbVar = szbVar7;
                }
                if (szbVar8 != null) {
                    xzb xzbVar5 = xzbVar;
                    ix8 ix8Var3 = ix8Var;
                    wl9 wl9Var3 = wl9Var;
                    ouq ouqVar2 = ouqVar;
                    DisplayMetrics displayMetrics3 = displayMetrics;
                    hl9 hl9Var2 = new hl9(wl9Var3, ouqVar2, ix8Var3, xzbVar5, displayMetrics3, 1);
                    ouqVar = ouqVar2;
                    wl9Var = wl9Var3;
                    ix8Var = ix8Var3;
                    xzbVar = xzbVar5;
                    displayMetrics = displayMetrics3;
                    wl9Var.i(szbVar8.c(xzbVar, hl9Var2));
                }
                szb szbVar9 = ix8Var.g;
                DisplayMetrics displayMetrics4 = displayMetrics;
                ouq ouqVar3 = ouqVar;
                xzb xzbVar6 = xzbVar;
                wl9 wl9Var4 = wl9Var;
                a03 a03Var = new a03(wl9Var4, szbVar, szbVar8, ouqVar3, xzbVar6, displayMetrics4, 6);
                wl9Var = wl9Var4;
                xzbVar2 = xzbVar6;
                ouqVar = ouqVar3;
                displayMetrics = displayMetrics4;
                szbVar9.d(xzbVar2, a03Var);
            }
            dx8 dx8Var7 = xk9Var.d;
            if (dx8Var7 == null) {
                dx8Var7 = dx8Var2;
            }
            wl9 wl9Var5 = wl9Var;
            ouq ouqVar4 = ouqVar;
            xzb xzbVar7 = xzbVar2;
            dx8 dx8Var8 = dx8Var7;
            il9 il9Var = new il9(wl9Var5, ouqVar4, dx8Var8, displayMetrics, xzbVar7, 0);
            Unit unit2 = Unit.a;
            il9Var.invoke(unit2);
            sk3.J(wl9Var5, dx8Var8, xzbVar7, il9Var);
            dx8 dx8Var9 = xk9Var.e;
            if (dx8Var9 == null) {
                dx8Var9 = dx8Var;
            }
            dx8 dx8Var10 = dx8Var9;
            il9 il9Var2 = new il9(wl9Var5, ouqVar4, dx8Var10, displayMetrics, xzbVar7, 1);
            wl9Var = wl9Var5;
            xzbVar3 = xzbVar7;
            il9Var2.invoke(unit2);
            sk3.J(wl9Var, dx8Var10, xzbVar3, il9Var2);
            i = 0;
        }
    }
}
