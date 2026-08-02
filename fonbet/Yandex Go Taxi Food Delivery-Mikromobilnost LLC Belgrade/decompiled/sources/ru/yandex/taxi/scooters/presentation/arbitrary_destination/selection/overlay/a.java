package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.overlay;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import defpackage.ah00;
import defpackage.eym0;
import defpackage.f1h0;
import defpackage.f4c0;
import defpackage.fym0;
import defpackage.gh00;
import defpackage.i3y;
import defpackage.j6m0;
import defpackage.r8;
import defpackage.tje;
import defpackage.w4e0;
import defpackage.xm00;
import defpackage.z4p0;

/* loaded from: classes6.dex */
public final class a extends r8 {
    public xm00 A;
    public f4c0 B;
    public f4c0 C;
    public final i3y D;
    public final ScootersRouteInfoView E;
    public final Drawable F;
    public final Context c;
    public final z4p0 w;
    public final eym0 x;
    public xm00 y;
    public w4e0 z;

    public a(ah00 ah00Var, Context context, z4p0 z4p0Var) {
        super(5, ah00Var);
        this.c = context;
        this.w = z4p0Var;
        this.x = new eym0(0, this);
        this.D = kotlin.a.a(new j6m0(13, this));
        ScootersRouteInfoView scootersRouteInfoView = new ScootersRouteInfoView(context);
        scootersRouteInfoView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, scootersRouteInfoView.getResources().getDisplayMetrics()));
        this.E = scootersRouteInfoView;
        this.F = tje.y(f1h0.route_end_point, context);
    }

    public final void Hg() {
        ah00 ah00Var = (ah00) this.b;
        this.z = null;
        this.B = null;
        this.C = null;
        xm00 xm00Var = this.y;
        if (xm00Var != null) {
            ((gh00) ah00Var).i.o(xm00Var);
        }
        this.y = null;
        xm00 xm00Var2 = this.A;
        if (xm00Var2 != null) {
            ((gh00) ah00Var).i.o(xm00Var2);
        }
        this.A = null;
    }

    public final void attach() {
        ((gh00) ((ah00) this.b)).e(this.x);
        fym0 fym0Var = new fym0(this);
        z4p0 z4p0Var = this.w;
        z4p0Var.Bg(fym0Var);
        tje.N(z4p0Var.Jg(), null, null, new ScootersTariffFixSelectionRouteOverlayPresenter$attachView$1(z4p0Var, fym0Var, null), 3);
        tje.N(z4p0Var.Jg(), null, null, new ScootersTariffFixSelectionRouteOverlayPresenter$attachView$2(z4p0Var, fym0Var, null), 3);
    }
}
