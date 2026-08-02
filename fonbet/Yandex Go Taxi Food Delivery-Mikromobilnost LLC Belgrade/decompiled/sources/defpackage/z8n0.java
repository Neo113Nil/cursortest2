package defpackage;

import android.content.Context;
import com.yandex.go.scooters.ignition.a;
import com.yandex.go.scooters.ignition.controlling.disabling_confirmation.b;
import com.yandex.go.scooters.offers.v2.surge.info.i;
import com.yandex.go.scooters.passes.data.ScootersPassesApi;
import com.yandex.go.scooters.passes.data.d;
import com.yandex.go.scooters.qr.preview.ScootersPreviewView;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.scooters.data.q;
import ru.yandex.taxi.scooters.data.v;
import ru.yandex.taxi.scooters.data.w;
import ru.yandex.taxi.scooters.domain.h;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.c;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.e;

/* loaded from: classes13.dex */
public final class z8n0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public z8n0(j7g j7gVar, j7g j7gVar2, l7g l7gVar, xvf0 xvf0Var) {
        this.a = 17;
        this.b = j7gVar;
        this.d = j7gVar2;
        this.e = l7gVar;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new y8n0((tt2) ((e7g) xvf0Var4).get(), (pwy0) xvf0Var3.get(), (a9n0) ((qzm0) xvf0Var).get(), (xnn0) ((qzm0) xvf0Var2).get());
            case 1:
                return new c((tt2) ((e7g) xvf0Var4).get(), (wuy) xvf0Var3.get(), (aan0) xvf0Var.get(), (e) ((p8k0) xvf0Var2).get());
            case 2:
                return new com.yandex.go.scooters.data.mapper.c((k7x0) ((n7g) xvf0Var4).get(), (xdf) ((j7g) xvf0Var).get(), (ru.yandex.taxi.widget.c) xvf0Var3.get(), (cno0) ((lwl0) xvf0Var2).get());
            case 3:
                return new h((w) xvf0Var3.get(), (v) xvf0Var4.get(), (oln0) ((m7g) xvf0Var).get(), (ywm0) xvf0Var2.get());
            case 4:
                return new pej((qxm0) xvf0Var3.get(), (b) ((fzm0) xvf0Var4).get(), (Context) xvf0Var.get(), (w030) xvf0Var2.get());
            case 5:
                return new a(i5m.a((ur3) xvf0Var4), (q150) xvf0Var, (brn0) xvf0Var3.get(), (m580) xvf0Var2);
            case 6:
                return new com.yandex.go.scooters.insurance.data.b((xdf) xvf0Var3.get(), (ru.yandex.taxi.widget.c) xvf0Var4.get(), (ru.yandex.taxi.scooters.data.h) xvf0Var.get(), (m7n0) ((yxm0) xvf0Var2).get());
            case 7:
                return new ru.yandex.taxi.scooters.presentation.route.a((ah00) xvf0Var3.get(), (m0o0) ((lwl0) xvf0Var4).get(), (qr40) ((k7g) xvf0Var).get(), (k7g) xvf0Var2);
            case 8:
                return new g2o0((tt2) ((e7g) xvf0Var4).get(), (pwy0) xvf0Var3.get(), (ru.yandex.taxi.widget.c) xvf0Var.get(), (u1o0) ((bwn0) xvf0Var2).get());
            case 9:
                return new dwn0(scc.g((r3o0) ((fzm0) xvf0Var3).get(), (cvn0) ((bwn0) xvf0Var).get(), (z3o0) ((g1n0) xvf0Var2).get(), (com.yandex.go.scooters.offers.v2.domain.e) ((xv8) xvf0Var4).get()));
            case 10:
                return new com.yandex.go.scooters.offers.v2.domain.mapper.a((qwo0) xvf0Var3.get(), (com.yandex.go.scooters.domain.c) xvf0Var4.get(), (com.yandex.go.scooters.data.e) ((bwn0) xvf0Var).get(), (j9p0) ((ivo0) xvf0Var2).get());
            case 11:
                return new d((wnt) ((j7g) xvf0Var4).get(), (ScootersPassesApi) ((m7g) xvf0Var3).get(), (ru.yandex.taxi.widget.c) ((j7g) xvf0Var).get(), (ru.yandex.taxi.scooters.data.a) ((l7g) xvf0Var2).get());
            case 12:
                return new com.yandex.go.scooters.passes.v2.domain.a((tt2) ((e7g) xvf0Var4).get(), (com.yandex.go.scooters.passes.v2.e) ((gzn0) xvf0Var).get(), (tuo0) xvf0Var3.get(), (ufo0) xvf0Var2.get());
            case 13:
                return new kdd0((Context) xvf0Var3.get(), (fva0) xvf0Var4.get(), (vr) ((mbo0) xvf0Var).get(), (vio0) ((n3w) xvf0Var2).a);
            case 14:
                return new com.yandex.go.scooters.qr.preview.data.mapper.a((ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (ukn0) xvf0Var4.get(), (com.yandex.go.scooters.qr.preview.data.a) xvf0Var.get(), (q) ((g1n0) xvf0Var2).get());
            case 15:
                return new ScootersPreviewView((Context) xvf0Var3.get(), (c0n0) xvf0Var4.get(), (wro0) xvf0Var.get(), (bno0) ((zmm0) xvf0Var2).get());
            case 16:
                return new y4c0((y50) xvf0Var3.get(), (l7g) xvf0Var4, (MapNotificationsMuteRepository) xvf0Var.get(), (fcj0) ((n7g) xvf0Var2).get(), 14);
            case 17:
                tst tstVar = (tst) ((j7g) xvf0Var4).get();
                k421 k421Var = (k421) ((j7g) xvf0Var).get();
                aye0 aye0Var = (aye0) ((l7g) xvf0Var2).get();
                eqo0 eqo0Var = (eqo0) xvf0Var3.get();
                gl glVar = new gl();
                glVar.b = tstVar;
                glVar.c = k421Var;
                glVar.w = aye0Var;
                glVar.x = eqo0Var;
                glVar.a = true;
                return glVar;
            case 18:
                return new com.yandex.go.scooters.qr.unavailable_scooter.domain.a((tt2) ((e7g) xvf0Var4).get(), (pwy0) xvf0Var3.get(), (com.yandex.go.scooters.qr.unavailable_scooter.ui.d) ((wun0) xvf0Var).get(), (com.yandex.go.scooters.qr.unavailable_scooter.data.a) xvf0Var2.get());
            case 19:
                return new i((tt2) ((e7g) xvf0Var4).get(), (pwy0) xvf0Var3.get(), (y5p0) xvf0Var.get(), (com.yandex.go.scooters.offers.v2.surge.info.e) ((oto0) xvf0Var2).get());
            case 20:
                return new x4p0((ah00) xvf0Var3.get(), (Context) xvf0Var4.get(), (zuj0) xvf0Var.get(), (o7g) xvf0Var2);
            case 21:
                return new com.yandex.go.scooters.offers.v2.components.tariffs.a((Context) xvf0Var3.get(), (n5p0) ((p8k0) xvf0Var4).get(), (s6n0) xvf0Var.get(), (com.yandex.go.scooters.offers.v2.components.tariffs.ui.b) ((gzn0) xvf0Var2).get());
            case 22:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scrollable_items.c((u3s) ((n3w) xvf0Var4).a, (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scrollable_items.b) ((qy8) xvf0Var3).get(), (hwy0) ((gxf) xvf0Var).get(), (sae) ((srb) xvf0Var2).get());
            case 23:
                return new com.yandex.go.taxi.order.search.factory.a((eco) ((kgn) xvf0Var4).get(), (com.yandex.go.pin.api.widget.a) ((j9g) xvf0Var3).get(), (r0c0) ((j9g) xvf0Var).get(), (tt2) ((i9g) xvf0Var2).get());
            case 24:
                return new sts((w030) xvf0Var3.get(), (abr0) xvf0Var4.get(), (xbr0) ((n3w) xvf0Var).a, (r6r0) ((m7q0) xvf0Var2).get(), 2);
            case 25:
                return new f28((i130) xvf0Var3.get(), (hwo0) ((p8k0) xvf0Var4).get(), this.d, (ze0) xvf0Var2.get(), 13);
            case 26:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.shortcut_widget.a((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text.b) ((a9i) xvf0Var4).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.image.a) ((a9i) xvf0Var3).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.progress_bar.a) ((qy8) xvf0Var).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a) ((eqh) xvf0Var2).get());
            case 27:
                return new f6s0((Context) ((w9g) xvf0Var4).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.show_content.ui.a) xvf0Var3.get(), (tgg) ((p6f) xvf0Var).get(), (hwy0) ((w9g) xvf0Var2).get());
            case 28:
                return new t((amp0) ((wun0) xvf0Var4).get(), (dgs0) ((elo0) xvf0Var).get(), (Context) xvf0Var3.get(), (w030) xvf0Var2.get());
            default:
                return new pys0((y30) ((y9g) xvf0Var4).get(), (yys0) ((y2s0) xvf0Var3).get(), (hwy0) ((y9g) xvf0Var).get(), (l7s0) ((ywf) xvf0Var2).get());
        }
    }

    public /* synthetic */ z8n0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, byte b) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ z8n0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ z8n0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public z8n0(o3o0 o3o0Var, xv8 xv8Var, fzm0 fzm0Var, bwn0 bwn0Var, g1n0 g1n0Var) {
        this.a = 9;
        this.b = xv8Var;
        this.c = fzm0Var;
        this.d = bwn0Var;
        this.e = g1n0Var;
    }
}
