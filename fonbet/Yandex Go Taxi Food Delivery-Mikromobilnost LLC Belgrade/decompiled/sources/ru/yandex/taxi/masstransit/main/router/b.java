package ru.yandex.taxi.masstransit.main.router;

import com.yandex.go.address.models.Address;
import defpackage.ap30;
import defpackage.bi30;
import defpackage.c0g;
import defpackage.co30;
import defpackage.di20;
import defpackage.dz00;
import defpackage.gzm0;
import defpackage.h3y;
import defpackage.h55;
import defpackage.hxx;
import defpackage.i3g;
import defpackage.jl00;
import defpackage.jo30;
import defpackage.lc30;
import defpackage.m010;
import defpackage.m950;
import defpackage.mo30;
import defpackage.n3w;
import defpackage.no30;
import defpackage.pv0;
import defpackage.qo30;
import defpackage.s14;
import defpackage.tje;
import defpackage.to30;
import defpackage.w511;
import defpackage.wr30;
import defpackage.xl10;
import defpackage.xvf0;
import defpackage.y030;
import defpackage.zgf;
import defpackage.zo30;
import defpackage.zzs;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class b extends h55 {
    public final zgf D;
    public final m010 E;
    public final di20 F;
    public final h3y G;
    public final jl00 H;
    public final di20 I;
    public final h3y J;
    public final dz00 K;
    public final wr30 L;
    public final xl10 M;
    public s14 N;

    public b(zgf zgfVar, m010 m010Var, di20 di20Var, h3y h3yVar, jl00 jl00Var, di20 di20Var2, h3y h3yVar2, dz00 dz00Var, wr30 wr30Var, xl10 xl10Var) {
        super(null);
        this.D = zgfVar;
        this.E = m010Var;
        this.F = di20Var;
        this.G = h3yVar;
        this.H = jl00Var;
        this.I = di20Var2;
        this.J = h3yVar2;
        this.K = dz00Var;
        this.L = wr30Var;
        this.M = xl10Var;
    }

    public static final void P(b bVar, PointType pointType, Address address, pv0 pv0Var) {
        Address address2;
        int i = no30.a[pointType.ordinal()];
        zzs zzsVar = null;
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            } else if (pv0Var != null && (address2 = pv0Var.a) != null) {
                zzsVar = address2.B();
            }
        } else if (address != null) {
            zzsVar = address.B();
        }
        bVar.E((m950) bVar.H.get(), new lc30(pointType, pv0Var, zzsVar), new to30(pointType, bVar, address), hxx.a);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        flex.engine.a aVar;
        s14 s14Var = this.N;
        if (s14Var != null && (aVar = (flex.engine.a) ((xvf0) s14Var.l).get()) != null) {
            aVar.i();
        }
        this.N = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        a aVar = new a(this);
        zgf zgfVar = this.D;
        zgfVar.getClass();
        i3g i3gVar = (i3g) zgfVar.b;
        s14 s14Var = new s14(i3gVar, aVar);
        this.N = s14Var;
        co30 co30Var = new co30(((y030) ((c0g) i3gVar.a).A.a.b.H3.get()).a(ContentContainer$ZOrder.FRAGMENT_MODAL_VIEW), (jo30) ((n3w) s14Var.k).a);
        gzm0 gzm0Var = new gzm0((ap30) ((n3w) s14Var.n).a, (zo30) ((n3w) s14Var.o).a);
        A(co30Var, (bi30) obj, new mo30(0, this));
        z(gzm0Var, new qo30(this));
        tje.N(o(), null, null, new MtMainFlexRouter$onLaunch$3(this, s14Var, null), 3);
    }
}
