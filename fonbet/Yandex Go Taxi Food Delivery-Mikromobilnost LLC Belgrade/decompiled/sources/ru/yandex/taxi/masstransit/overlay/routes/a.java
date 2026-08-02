package ru.yandex.taxi.masstransit.overlay.routes;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.ah00;
import defpackage.ay30;
import defpackage.b01;
import defpackage.b2l0;
import defpackage.br30;
import defpackage.by30;
import defpackage.cr30;
import defpackage.cy30;
import defpackage.dr30;
import defpackage.ds30;
import defpackage.dy30;
import defpackage.er30;
import defpackage.fi6;
import defpackage.gh00;
import defpackage.gw30;
import defpackage.i3y;
import defpackage.qtb1;
import defpackage.tje;
import defpackage.uo21;
import defpackage.w4e0;
import defpackage.w511;
import defpackage.wx30;
import defpackage.xx30;
import defpackage.y9x0;
import defpackage.z9x0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* loaded from: classes6.dex */
public final class a {
    public final ay30 a;
    public final ah00 b;
    public final b2l0 c;
    public final gw30 d;
    public final uo21 e;
    public final y9x0 f;
    public final i3y g;
    public final i3y h;
    public w4e0 i;
    public dy30 j;
    public boolean k;
    public boolean l;
    public final b01 m;

    public a(ay30 ay30Var, ah00 ah00Var, b2l0 b2l0Var, gw30 gw30Var, uo21 uo21Var, y9x0 y9x0Var) {
        this.a = ay30Var;
        this.b = ah00Var;
        this.c = b2l0Var;
        this.d = gw30Var;
        this.e = uo21Var;
        this.f = y9x0Var;
        wx30 wx30Var = new wx30(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = kotlin.a.b(lazyThreadSafetyMode, wx30Var);
        this.h = kotlin.a.b(lazyThreadSafetyMode, new wx30(this, 1));
        this.l = true;
        this.m = new b01(20, this);
    }

    public final void a() {
        xx30 xx30Var = new xx30(this);
        ay30 ay30Var = this.a;
        ay30Var.Bg(xx30Var);
        tje.N(ay30Var.Jg(), null, null, new MtRoutesOverlayPresenter$attachView$1(ay30Var, xx30Var, null), 3);
        ay30Var.x.b8(ay30Var);
        tje.N(ay30Var.Jg(), null, null, new MtRoutesOverlayPresenter$attachView$2(ay30Var, xx30Var, null), 3);
        tje.N(ay30Var.Jg(), null, null, new MtRoutesOverlayPresenter$attachView$3(ay30Var, xx30Var, null), 3);
        tje.N(ay30Var.Jg(), null, null, new MtRoutesOverlayPresenter$attachView$4(ay30Var, null), 3);
        tje.N(ay30Var.Jg(), null, null, new MtRoutesOverlayPresenter$attachView$5(ay30Var, null), 3);
        ((gh00) this.b).e(this.m);
        ((z9x0) this.f).a(qtb1.j(null, null, null, null, null, new wx30(this, 2), new wx30(this, 3), 31));
    }

    public final void b() {
        Pair pair;
        Polyline geometry;
        dy30 dy30Var = this.j;
        if (dy30Var == null) {
            return;
        }
        boolean z = dy30Var instanceof by30;
        if (z) {
            by30 by30Var = (by30) dy30Var;
            pair = new Pair(by30Var.a, by30Var.b);
        } else if (!(dy30Var instanceof cy30)) {
            w511.b();
            return;
        } else {
            cy30 cy30Var = (cy30) dy30Var;
            pair = new Pair(cy30Var.a, cy30Var.b);
        }
        ds30 ds30Var = (ds30) pair.getFirst();
        ds30 ds30Var2 = (ds30) pair.getSecond();
        ay30 ay30Var = this.a;
        ah00 ah00Var = this.b;
        if (ds30Var != null && ds30Var2 == null) {
            ((gh00) ah00Var).C(ds30Var.a);
            ay30Var.C.a(false);
            return;
        }
        if (ds30Var == null || ds30Var2 == null) {
            return;
        }
        fi6 fi6Var = new fi6();
        fi6Var.c(ds30Var.a);
        fi6Var.c(ds30Var2.a);
        if (z) {
            DrivingRoute drivingRoute = ((by30) dy30Var).c;
            if (drivingRoute != null && (geometry = drivingRoute.getGeometry()) != null) {
                fi6Var.d(geometry);
            }
        } else {
            if (!(dy30Var instanceof cy30)) {
                w511.b();
                return;
            }
            for (er30 er30Var : ((cy30) dy30Var).c) {
                if (er30Var instanceof cr30) {
                    fi6Var.d(((cr30) er30Var).a);
                } else if (er30Var instanceof dr30) {
                    fi6Var.d(((dr30) er30Var).a.a);
                } else {
                    if (!(er30Var instanceof br30)) {
                        w511.b();
                        return;
                    }
                    fi6Var.c(((br30) er30Var).b);
                }
            }
        }
        ((gh00) ah00Var).A(fi6Var.g(), null);
        ay30Var.C.a(false);
    }
}
