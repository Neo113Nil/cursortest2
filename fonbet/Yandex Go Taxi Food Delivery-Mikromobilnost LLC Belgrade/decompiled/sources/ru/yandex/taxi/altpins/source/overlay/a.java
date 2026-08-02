package ru.yandex.taxi.altpins.source.overlay;

import com.yandex.mapkit.geometry.Point;
import defpackage.a02;
import defpackage.ah00;
import defpackage.f4c0;
import defpackage.gh00;
import defpackage.jqr;
import defpackage.r8;
import defpackage.sz1;
import defpackage.tz1;
import defpackage.yz1;
import defpackage.zz1;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class a extends r8 {
    public final tz1 c;
    public final a02 w;
    public final f4c0 x;
    public final yz1 y;
    public zz1 z;

    public a(ah00 ah00Var, tz1 tz1Var, a02 a02Var) {
        super(5, ah00Var);
        this.c = tz1Var;
        this.w = a02Var;
        this.x = new f4c0(new Point(), null, 6);
        this.y = new yz1(this);
    }

    public final void Hg(sz1 sz1Var) {
        zz1 zz1Var = new zz1(sz1Var, this.w.a);
        this.z = zz1Var;
        yz1 yz1Var = this.y;
        zz1Var.Bg(yz1Var);
        e.H(zz1Var.Jg(), new jqr(e.t(zz1Var.y.a()), new AltpinSourceOverlayPresenter$attachView$1(yz1Var, zz1Var, null), 3));
        yz1Var.w1(zz1Var.x);
        this.x.b(((gh00) ((ah00) this.b)).i.p());
    }
}
