package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class cp9 extends p9 {
    public static final uo9 p = new uo9(uo9.x, null, null, null, uo9.y, uo9.z, uo9.A, null, null, null, uo9.B, uo9.C, uo9.D, null, null, null, null, uo9.E, uo9.F, uo9.G, null, uo9.H);
    public final gp8 b;
    public final p0a c;
    public final szm d;
    public final ogu e;
    public final c5p f;
    public final qg8 g;
    public final yb8 h;
    public final a39 i;
    public final w1a j;
    public final xc9 k;
    public final Context l;
    public final wh9 m;
    public final w2s n;
    public Long o;

    public cp9(gp8 gp8Var, p0a p0aVar, szm szmVar, ogu oguVar, c5p c5pVar, qg8 qg8Var, yb8 yb8Var, a39 a39Var, w1a w1aVar, xc9 xc9Var, Context context, wh9 wh9Var, w2s w2sVar) {
        super(gp8Var);
        this.b = gp8Var;
        this.c = p0aVar;
        this.d = szmVar;
        this.e = oguVar;
        this.f = c5pVar;
        this.g = qg8Var;
        this.h = yb8Var;
        this.i = a39Var;
        this.j = w1aVar;
        this.k = xc9Var;
        this.l = context;
        this.m = wh9Var;
        this.n = w2sVar;
        oguVar.b("DIV2.TAB_HEADER_VIEW", new u1s(context), 12);
        oguVar.b("DIV2.TAB_ITEM_VIEW", new o0a(18, this), 2);
    }

    public static void H(v1s v1sVar, xzb xzbVar, uo9 uo9Var) {
        ir2 ir2Var;
        szb szbVar;
        szb szbVar2;
        szb szbVar3;
        szb szbVar4;
        int intValue = ((Number) uo9Var.e.a(xzbVar)).intValue();
        int intValue2 = ((Number) uo9Var.a.a(xzbVar)).intValue();
        int intValue3 = ((Number) uo9Var.r.a(xzbVar)).intValue();
        szb szbVar5 = uo9Var.n;
        int intValue4 = szbVar5 != null ? ((Number) szbVar5.a(xzbVar)).intValue() : 0;
        v1sVar.getClass();
        v1sVar.setTabTextColors(qr2.f(intValue3, intValue));
        v1sVar.setSelectedTabIndicatorColor(intValue2);
        v1sVar.setTabBackgroundColor(intValue4);
        DisplayMetrics displayMetrics = v1sVar.getResources().getDisplayMetrics();
        szb szbVar6 = uo9Var.h;
        fu8 fu8Var = uo9Var.i;
        float w = szbVar6 != null ? bg3.w((Long) szbVar6.a(xzbVar), displayMetrics) : fu8Var == null ? -1.0f : 0.0f;
        float w2 = (fu8Var == null || (szbVar4 = fu8Var.c) == null) ? w : bg3.w((Long) szbVar4.a(xzbVar), displayMetrics);
        float w3 = (fu8Var == null || (szbVar3 = fu8Var.d) == null) ? w : bg3.w((Long) szbVar3.a(xzbVar), displayMetrics);
        float w4 = (fu8Var == null || (szbVar2 = fu8Var.a) == null) ? w : bg3.w((Long) szbVar2.a(xzbVar), displayMetrics);
        if (fu8Var != null && (szbVar = fu8Var.b) != null) {
            w = bg3.w((Long) szbVar.a(xzbVar), displayMetrics);
        }
        v1sVar.setTabIndicatorCornersRadii(new float[]{w2, w2, w3, w3, w, w, w4, w4});
        v1sVar.setTabItemSpacing(bg3.w((Long) uo9Var.s.a(xzbVar), displayMetrics));
        int ordinal = ((to9) uo9Var.g.a(xzbVar)).ordinal();
        if (ordinal == 0) {
            ir2Var = ir2.a;
        } else if (ordinal == 1) {
            ir2Var = ir2.b;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return;
            }
            ir2Var = ir2.c;
        }
        v1sVar.setAnimationType(ir2Var);
        v1sVar.setAnimationDuration(((Number) uo9Var.f.a(xzbVar)).longValue());
        v1sVar.setTabTitleStyle(uo9Var);
    }

    public final void G(v1s v1sVar, xzb xzbVar, so9 so9Var, e23 e23Var) {
        DisplayMetrics displayMetrics = v1sVar.getResources().getDisplayMetrics();
        jz8 jz8Var = so9Var.c;
        int e0 = bg3.e0(((Number) jz8Var.b.a(xzbVar)).longValue(), (jk9) jz8Var.a.a(xzbVar), displayMetrics);
        jz8 jz8Var2 = so9Var.a;
        int e02 = bg3.e0(((Number) jz8Var2.b.a(xzbVar)).longValue(), (jk9) jz8Var2.a.a(xzbVar), displayMetrics);
        e23Var.a.p(this.i.b(((Uri) so9Var.b.a(xzbVar)).toString(), new yo9(v1sVar, e0, e02, e23Var.a)));
    }

    public final void I(lp9 lp9Var, e23 e23Var, vo9 vo9Var) {
        e23 e23Var2;
        szb szbVar;
        szb szbVar2;
        szb szbVar3;
        fu8 fu8Var;
        szb szbVar4;
        fu8 fu8Var2;
        szb szbVar5;
        fu8 fu8Var3;
        szb szbVar6;
        fu8 fu8Var4;
        szb szbVar7;
        szb szbVar8;
        szb szbVar9;
        szb szbVar10;
        szb szbVar11;
        szb szbVar12;
        ix8 ix8Var;
        szb szbVar13;
        ix8 ix8Var2;
        szb szbVar14;
        szb szbVar15;
        szb szbVar16;
        xzb xzbVar = e23Var.b;
        lp9Var.setClipToPadding(false);
        zo9 zo9Var = new zo9(lp9Var, vo9Var, xzbVar, 1);
        zo9Var.invoke(null);
        ix8 ix8Var3 = vo9Var.E;
        lp9Var.i(ix8Var3.c.c(xzbVar, zo9Var));
        lp9Var.i(ix8Var3.d.c(xzbVar, zo9Var));
        szb szbVar17 = ix8Var3.f;
        lp9Var.i(szbVar17.c(xzbVar, zo9Var));
        szb szbVar18 = ix8Var3.a;
        lp9Var.i(szbVar18.c(xzbVar, zo9Var));
        v1s titleLayout = lp9Var.getTitleLayout();
        lj0 lj0Var = new lj0(26, vo9Var, xzbVar, titleLayout);
        lj0Var.invoke(null);
        a0c A = a0g.A(titleLayout);
        uo9 uo9Var = vo9Var.D;
        A.i((uo9Var == null || (szbVar16 = uo9Var.u) == null) ? null : szbVar16.c(xzbVar, lj0Var));
        A.i((uo9Var == null || (szbVar15 = uo9Var.k) == null) ? null : szbVar15.c(xzbVar, lj0Var));
        A.i((uo9Var == null || (ix8Var2 = uo9Var.v) == null || (szbVar14 = ix8Var2.f) == null) ? null : szbVar14.c(xzbVar, lj0Var));
        A.i((uo9Var == null || (ix8Var = uo9Var.v) == null || (szbVar13 = ix8Var.a) == null) ? null : szbVar13.c(xzbVar, lj0Var));
        A.i(szbVar17.c(xzbVar, lj0Var));
        A.i(szbVar18.c(xzbVar, lj0Var));
        H(lp9Var.getTitleLayout(), xzbVar, uo9Var == null ? p : uo9Var);
        lj0 lj0Var2 = new lj0(this, lp9Var, xzbVar, uo9Var, 27);
        if (uo9Var != null && (szbVar12 = uo9Var.e) != null) {
            szbVar12.c(xzbVar, lj0Var2);
        }
        if (uo9Var != null && (szbVar11 = uo9Var.a) != null) {
            szbVar11.c(xzbVar, lj0Var2);
        }
        if (uo9Var != null && (szbVar10 = uo9Var.r) != null) {
            szbVar10.c(xzbVar, lj0Var2);
        }
        if (uo9Var != null && (szbVar9 = uo9Var.n) != null) {
            szbVar9.c(xzbVar, lj0Var2);
        }
        if (uo9Var != null && (szbVar8 = uo9Var.h) != null) {
            szbVar8.c(xzbVar, lj0Var2);
        }
        if (uo9Var != null && (fu8Var4 = uo9Var.i) != null && (szbVar7 = fu8Var4.c) != null) {
            szbVar7.c(xzbVar, lj0Var2);
        }
        if (uo9Var != null && (fu8Var3 = uo9Var.i) != null && (szbVar6 = fu8Var3.d) != null) {
            szbVar6.c(xzbVar, lj0Var2);
        }
        if (uo9Var != null && (fu8Var2 = uo9Var.i) != null && (szbVar5 = fu8Var2.b) != null) {
            szbVar5.c(xzbVar, lj0Var2);
        }
        if (uo9Var != null && (fu8Var = uo9Var.i) != null && (szbVar4 = fu8Var.a) != null) {
            szbVar4.c(xzbVar, lj0Var2);
        }
        if (uo9Var != null && (szbVar3 = uo9Var.s) != null) {
            szbVar3.c(xzbVar, lj0Var2);
        }
        if (uo9Var != null && (szbVar2 = uo9Var.g) != null) {
            szbVar2.c(xzbVar, lj0Var2);
        }
        if (uo9Var != null && (szbVar = uo9Var.f) != null) {
            szbVar.c(xzbVar, lj0Var2);
        }
        so9 so9Var = vo9Var.C;
        if (so9Var == null) {
            e23Var2 = e23Var;
        } else {
            jz8 jz8Var = so9Var.a;
            jz8 jz8Var2 = so9Var.c;
            G(lp9Var.getTitleLayout(), xzbVar, so9Var, e23Var);
            e23Var2 = e23Var;
            ii iiVar = new ii(this, lp9Var, xzbVar, so9Var, e23Var2, 18);
            jz8Var2.b.c(xzbVar, iiVar);
            jz8Var2.a.c(xzbVar, iiVar);
            jz8Var.b.c(xzbVar, iiVar);
            jz8Var.a.c(xzbVar, iiVar);
            so9Var.b.c(xzbVar, iiVar);
        }
        lp9Var.getPagerLayout().setClipToPadding(false);
        ix8 ix8Var4 = vo9Var.A;
        zo9 zo9Var2 = new zo9(lp9Var, vo9Var, xzbVar, 0);
        lp9Var.i(ix8Var4.c.c(xzbVar, zo9Var2));
        lp9Var.i(ix8Var4.d.c(xzbVar, zo9Var2));
        lp9Var.i(ix8Var4.f.c(xzbVar, zo9Var2));
        lp9Var.i(ix8Var4.a.c(xzbVar, zo9Var2));
        zo9Var2.invoke(null);
        lp9Var.i(vo9Var.z.d(xzbVar, new ap9(lp9Var, 0)));
        lp9Var.i(vo9Var.n.d(xzbVar, new ap9(lp9Var, 1)));
        lp9Var.getTitleLayout().setOnScrollChangedListener(new v13(13, this, e23Var2));
        lp9Var.getTitleLayout().setFocusTracker(e23Var2.a.getInputFocusTracker$div_release());
        lp9Var.i(vo9Var.u.d(xzbVar, new ap9(lp9Var, 2)));
    }

    public final void J(lp9 lp9Var, e23 e23Var, vo9 vo9Var, hp8 hp8Var, pm9 pm9Var, ArrayList arrayList, Integer num) {
        int i;
        ep9 ep9Var = new ep9(e23Var, this.g, this.h, this.j, lp9Var, vo9Var);
        szb szbVar = vo9Var.j;
        xzb xzbVar = e23Var.b;
        boolean booleanValue = ((Boolean) szbVar.a(xzbVar)).booleanValue();
        y19 y19Var = booleanValue ? new y19(20) : new y19(21);
        int currentItem = lp9Var.getViewPager().getCurrentItem();
        int currentItem2 = lp9Var.getViewPager().getCurrentItem();
        if (currentItem2 == currentItem) {
            d51.l.p(new bp9(ep9Var, currentItem2, 0));
        }
        xo9 xo9Var = new xo9(this.e, lp9Var, new ogp(), y19Var, booleanValue, e23Var, this.f, this.c, hp8Var, ep9Var, new wo9(e23Var, pm9Var, this.h, this.n, this.m, vo9Var), pm9Var, this.k);
        xo9Var.c(new n(28, arrayList));
        if (num != null) {
            i = num.intValue();
        } else {
            long longValue = ((Number) vo9Var.y.a(xzbVar)).longValue();
            long j = longValue >> 31;
            i = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        if (xo9Var.A != i) {
            xo9Var.d.x(i, true);
        }
        lp9Var.setDivTabsAdapter(xo9Var);
    }

    @Override // defpackage.p9
    public final /* bridge */ /* synthetic */ void j(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2) {
        I((lp9) view, e23Var, (vo9) dp8Var);
    }
}
