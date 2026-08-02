package defpackage;

import android.content.Context;
import com.yandex.go.call_order_fallback.domain.c;
import com.yandex.go.call_order_fallback.domain.d;
import com.yandex.go.navigator.main_screen.experiement.e;
import com.yandex.go.pickup_from_photo.domain.f;
import com.yandex.go.pickup_from_photo.experiment.p;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.zone.repository.o;
import com.ybsdk.feature.about.internal.presentation.b;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.logistics.sdk.address_details.api.a;
import ru.yandex.taxi.order.l;

/* loaded from: classes5.dex */
public final class t4 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public t4(pg5 pg5Var, di20 di20Var, xvf0 xvf0Var, owf owfVar, br00 br00Var) {
        this.a = 21;
        this.b = pg5Var;
        this.c = xvf0Var;
        this.d = owfVar;
        this.e = br00Var;
    }

    public static t4 a(xvf0 xvf0Var, xvf0 xvf0Var2, bsz bszVar, xvf0 xvf0Var3) {
        return new t4(xvf0Var, xvf0Var2, bszVar, xvf0Var3, 5);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new s4((c1x0) ((sk21) xvf0Var4).get(), (pk51) ((q1g) xvf0Var3).get(), (o) ((d2g) xvf0Var2).get(), (zuj0) ((d2g) xvf0Var).get());
            case 1:
                return new b((Context) ((gwf) xvf0Var4).get(), (g5) ((gwf) xvf0Var3).get(), (ddf) ((gwf) xvf0Var2).get(), (e5) ((gwf) xvf0Var).get());
            case 2:
                wiq0 wiq0Var = (wiq0) ((w0g) xvf0Var4).get();
                return new yb(wiq0Var, (zuj0) xvf0Var2.get(), (jgv) ((y0g) xvf0Var).get());
            case 3:
                return new m2v((vj0) xvf0Var4.get(), (zav0) xvf0Var3.get(), (l7s0) ((uzu0) xvf0Var2).get(), (yj0) xvf0Var.get());
            case 4:
                return new ss0((qcp0) ((k2g) xvf0Var4).get(), (gt0) xvf0Var3.get(), (es0) ((n3w) xvf0Var2).a, (a) ((n3w) xvf0Var).a);
            case 5:
                lp00 lp00Var = (lp00) xvf0Var4.get();
                com.yandex.go.pin.api.a aVar = (com.yandex.go.pin.api.a) xvf0Var3.get();
                so00 so00Var = (so00) ((bsz) xvf0Var2).get();
                zuj0 zuj0Var = (zuj0) xvf0Var.get();
                gl glVar = new gl();
                glVar.b = lp00Var;
                glVar.c = aVar;
                glVar.w = so00Var;
                glVar.x = zuj0Var;
                return glVar;
            case 6:
                return new u61((u1n) ((k0n) xvf0Var4).get(), i5m.a((gc) xvf0Var3), (htg) ((exf) xvf0Var2).get(), i5m.a((eqh) xvf0Var));
            case 7:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.ui.a((bq1) ((js0) xvf0Var4).get(), (mrj) ((c4) xvf0Var3).get(), (u3s) xvf0Var2.get(), (ofg) ((exf) xvf0Var).get());
            case 8:
                tse tseVar = (tse) ((y0g) xvf0Var4).get();
                dqe0 dqe0Var = (dqe0) ((w0g) xvf0Var3).get();
                ney neyVar = (ney) ((v0g) xvf0Var2).get();
                com.yandex.go.preorder.payments.a aVar2 = (com.yandex.go.preorder.payments.a) ((y0g) xvf0Var).get();
                bc bcVar = new bc();
                bcVar.a = tseVar;
                bcVar.b = dqe0Var;
                bcVar.c = neyVar;
                bcVar.w = aVar2;
                return bcVar;
            case 9:
                return new com.yandex.go.taxi.auction.domain.a((ge3) xvf0Var4.get(), (dqe0) ((w0g) xvf0Var3).get(), (wiq0) ((w0g) xvf0Var2).get(), (pd3) xvf0Var.get());
            case 10:
                return new m2v((pk3) xvf0Var4.get(), (jn3) xvf0Var3.get(), (oo90) ((ge50) xvf0Var2).get(), (zm90) ((ahu) xvf0Var).get());
            case 11:
                return new kn3((g) ((s0g) xvf0Var4).get(), (wiq0) ((w0g) xvf0Var3).get(), (vfc0) ((t0g) xvf0Var2).get(), i5m.a((u0g) xvf0Var), 0);
            case 12:
                return new com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation.a((bt3) xvf0Var4.get(), (tfl0) ((qbg) xvf0Var3).get(), (com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.data.a) ((tl3) xvf0Var2).get(), (us3) ((vs3) xvf0Var).get());
            case 13:
                return new tr4((u3s) ((n3w) xvf0Var4).a, (dv8) ((fxf) xvf0Var3).get(), (v0k) ((p1g) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            case 14:
                return new vm6((tt2) xvf0Var4.get(), (ldj0) ((ii9) xvf0Var3).get(), (bxi0) xvf0Var2.get(), (f580) xvf0Var.get());
            case 15:
                return new m2v((TaxiOrder) ((n3w) xvf0Var4).a, (zuj0) ((zag) xvf0Var3).get(), (c06) ((p4) xvf0Var2).get(), (mh7) ((kk) xvf0Var).get());
            case 16:
                return new d((sb1) xvf0Var4, (tt2) xvf0Var3.get(), (c) ((kj7) xvf0Var2).get(), (oep0) xvf0Var.get());
            case 17:
                return new f((epb0) xvf0Var4.get(), (p) xvf0Var3.get(), (pav) ((n5g) xvf0Var2).get(), (tt2) ((z4g) xvf0Var).get());
            case 18:
                return new bv7((Context) ((n3w) xvf0Var4).a, (w030) ((n3w) xvf0Var3).a, (co40) ((uzu0) xvf0Var2).get(), (gv7) xvf0Var.get());
            case 19:
                l lVar = (l) xvf0Var4.get();
                i5m.a((w7y0) xvf0Var3);
                return new z18(lVar, i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 20:
                return new com.yandex.go.navigator.map_interactions.parkings.analytics.a((bb50) ((wz30) xvf0Var4).get(), (eb50) xvf0Var3.get(), (e) xvf0Var2.get(), (hbp0) xvf0Var.get());
            case 21:
                return new df8((pg5) xvf0Var4, (pn8) xvf0Var3.get(), (wm8) ((owf) xvf0Var2).get(), ((br00) xvf0Var).a);
            case 22:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items.d((u3s) ((n3w) xvf0Var4).a, (hwy0) ((gxf) xvf0Var3).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items.c) ((qy8) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            case 23:
                return new com.yandex.go.taxi.cars.preorder.source.a((ah00) ((lxf) xvf0Var4).get(), (c09) ((k4) xvf0Var3).get(), (p58) ((yc) xvf0Var2).get(), (xm00) ((n3w) xvf0Var).a);
            case 24:
                return new i19((n3h) ((h4g) xvf0Var4).get(), (i4u) ((h1t) xvf0Var3).get(), i5m.a((dx7) xvf0Var2), i5m.a((dx7) xvf0Var));
            case 25:
                return new ia9((qcp0) ((mxf) xvf0Var4).get(), (ma9) xvf0Var3.get(), (la9) ((nxf) xvf0Var2).get(), (na9) ((nxf) xvf0Var).get());
            case 26:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui.d((la9) ((nxf) xvf0Var4).b.a, (na9) ((nxf) xvf0Var3).b.b, (ds0) ((ba9) xvf0Var2).get(), (ru.yandex.taxi.logistics.sdk.delivery.edit.b) ((mxf) xvf0Var).get());
            case 27:
                return new jn9((tt2) ((lxf) xvf0Var4).get(), (pwy0) xvf0Var3.get(), (en9) xvf0Var2.get(), (com.yandex.go.chargers.attention.presentation.a) ((mu7) xvf0Var).get());
            case 28:
                return new d5a((tt2) ((lxf) xvf0Var4).get(), (pwy0) xvf0Var3.get(), (com.yandex.go.chargers.multiorder.ui.g) xvf0Var2.get(), (com.yandex.go.chargers.data.e) xvf0Var.get());
            default:
                return new eca((tt2) ((lxf) xvf0Var4).get(), (pwy0) xvf0Var3.get(), (com.yandex.go.chargers.order.details.a) ((lu9) xvf0Var2).get(), (com.yandex.go.chargers.data.e) xvf0Var.get());
        }
    }

    public /* synthetic */ t4(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }
}
