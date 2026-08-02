package defpackage;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.yandex.go.order.ui.order_list_modal_height.presentation.a;
import com.yandex.go.places.experiments.flex.b;
import com.yandex.go.places.impl.data.mappers.organizations.d;
import com.yandex.go.places.impl.data.mappers.organizations.e;
import com.yandex.go.places.impl.data.mappers.organizations.g;
import com.yandex.go.shortcuts.ui.interactors.ShortcutViewSourceType;
import com.yandex.go.taxi.order.cancel.v2.mvp.OrderCancelModalView;
import com.yandex.go.taxi.order.map_objects.f;
import defpackage.d680;
import defpackage.g18;
import defpackage.l30;
import defpackage.m30;
import defpackage.t680;
import java.lang.ref.WeakReference;
import ru.yandex.taxi.multiorder.tracked.c;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;

/* loaded from: classes14.dex */
public final class zi60 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ zi60(int i, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var) {
        this.a = i;
        this.c = v7pVar;
        this.d = v7pVar2;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                ((ybg) xvf0Var2).get();
                ((jc60) xvf0Var).get();
                return new yi60();
            case 1:
                return new h870((szf) xvf0Var2, xvf0Var3, (tzf) xvf0Var);
            case 2:
                return new ej1((Context) ((e7g) xvf0Var2).get(), (ra70) xvf0Var3.get(), (w030) ((n3w) xvf0Var).a, 13);
            case 3:
                return new OrderCancelModalView((Context) ((p4g) xvf0Var2).get(), (wk70) ((e840) xvf0Var3).get(), (yiz0) ((p4g) xvf0Var).get());
            case 4:
                brq brqVar = ((klr) xvf0Var3.get()).a() ? (brq) i5m.a((r2i) xvf0Var2).get() : (brq) i5m.a((vrt0) xvf0Var).get();
                q5z.i(brqVar);
                return brqVar;
            case 5:
                return new a((ymu) ((ze) xvf0Var2).get(), (tt2) xvf0Var3.get(), (c) ((y101) xvf0Var).get());
            case 6:
                return new cz70((y3u0) ((t4g) xvf0Var2).get(), (h080) ((t160) xvf0Var3).get(), (ow70) ((zyf) xvf0Var).get());
            case 7:
                return new a080((noe) ((t4g) xvf0Var2).get(), (toe) ((t4g) xvf0Var3).get(), (com.yandex.go.multimodal_route.store.a) ((u4g) xvf0Var).get());
            case 8:
                return new f((ah00) xvf0Var3.get(), (xm00) xvf0Var2.get(), (f080) ((mz70) xvf0Var).get());
            case 9:
                return new p370(7, (lp00) ((u4g) xvf0Var2).get(), (ah00) xvf0Var3.get(), (ru.yandex.taxi.map_common.map.utils.a) ((u4g) xvf0Var).get());
            case 10:
                ((y7f) xvf0Var2).get();
                return new com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.a((com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.metainfo.a) ((y7f) xvf0Var3).get(), (com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.redirecthost.a) ((jde0) xvf0Var).get());
            case 11:
                return new d480((a480) xvf0Var3.get(), (wc80) xvf0Var2.get(), (com.yandex.go.taxi.order.promotions.mapper.a) ((ge50) xvf0Var).get());
            case 12:
                h3y a = i5m.a(xvf0Var3);
                sm40 sm40Var = (sm40) xvf0Var2.get();
                i5m.a((jc50) xvf0Var);
                ((ul51) sm40Var.b).getClass();
                final t680 t680Var = (t680) a.get();
                q4s0 q4s0Var = new q4s0((p4s0) t680Var.r.get(), ShortcutViewSourceType.PRODUCTS, ShortcutViewSourceType.WIDGETS);
                d3s0 d3s0Var = (d3s0) t680Var.s.get();
                d680 d680Var = t680Var.a;
                s1s0 s1s0Var = t680Var.q;
                sxr0 sxr0Var = t680Var.b;
                h680 h680Var = t680Var.e;
                d3s0Var.getClass();
                d680Var.getClass();
                s1s0Var.getClass();
                sxr0Var.getClass();
                h680Var.getClass();
                oo2 oo2Var = new oo2(d3s0Var, d680Var, sxr0Var, h680Var);
                o4s0 o4s0Var = new o4s0();
                dz70 dz70Var = new dz70(t680Var.f, new zl50(17, t680Var, o4s0Var), t680Var.h, t680Var.i, t680Var.j, t680Var.k, t680Var.l, t680Var.m, t680Var.n);
                c4s0 c4s0Var = (c4s0) t680Var.d.get();
                f680 f680Var = t680Var.c;
                zzr0 zzr0Var = t680Var.o;
                p1s0 p1s0Var = t680Var.p;
                c4s0Var.getClass();
                f680Var.getClass();
                zzr0Var.getClass();
                p1s0Var.getClass();
                ShortcutsView a2 = new v9g(c4s0Var, oo2Var, sxr0Var, dz70Var, zzr0Var, p1s0Var, s1s0Var, q4s0Var, o4s0Var).a();
                a2.getViewTreeObserver().addOnWindowAttachListener(new ViewTreeObserver.OnWindowAttachListener() { // from class: ru.yandex.taxi.superapp.orders.multi.shortcuts.OrderShortcutsViewFactory$create$1
                    private g18 activeRouterCancellable = g18.u1;

                    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
                    public void onWindowAttached() {
                        t680 t680Var2 = t680.this;
                        m30 m30Var = t680Var2.t;
                        d680 d680Var2 = t680Var2.a;
                        m30Var.getClass();
                        m30Var.a = new WeakReference(d680Var2);
                        this.activeRouterCancellable = new l30(0, m30Var, d680Var2);
                    }

                    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
                    public void onWindowDetached() {
                        this.activeRouterCancellable.cancel();
                        this.activeRouterCancellable = g18.u1;
                    }
                });
                return a2;
            case 13:
                sm40 sm40Var2 = (sm40) xvf0Var3.get();
                i5m.a(xvf0Var2);
                h3y a3 = i5m.a((lok0) xvf0Var);
                ((ul51) sm40Var2.b).getClass();
                vc80 vc80Var = (vc80) a3.get();
                q5z.i(vc80Var);
                return vc80Var;
            case 14:
                return new com.yandex.go.taxi.order.notifications.multiclass.a((Context) xvf0Var3.get(), (tj60) xvf0Var2.get(), (xl10) ((wz30) xvf0Var).get());
            case 15:
                return new com.yandex.go.taxi.order.notifications.a((p2y0) xvf0Var3.get(), (wrr) ((e840) xvf0Var2).get(), (com.yandex.go.taxi.order.notifications.multiclass.a) ((zi60) xvf0Var).get());
            case 16:
                return new com.yandex.go.places.organization.card.api.navigation.common.a((yac0) xvf0Var3.get(), (b) xvf0Var2.get(), (com.yandex.go.places.experiments.gallery.b) ((faj) xvf0Var).get());
            case 17:
                com.yandex.go.places.impl.data.mappers.organizations.a aVar = (com.yandex.go.places.impl.data.mappers.organizations.a) ((jc50) xvf0Var2).get();
                d dVar = (d) ((e840) xvf0Var3).get();
                ((jc50) xvf0Var).get();
                return new com.yandex.go.places.impl.data.mappers.organizations.f(aVar, dVar);
            case 18:
                return new g((com.yandex.go.places.impl.data.mappers.organizations.a) ((jc50) xvf0Var2).get(), (e) ((ph70) xvf0Var).get(), (fg5) xvf0Var3.get());
            case 19:
                return new i290((vif) xvf0Var3.get(), (rgs) xvf0Var2.get(), (g941) ((ibz0) xvf0Var).get());
            case 20:
                return new com.yandex.go.taxi.order.map.passenger_detection.a((cjw0) ((y101) xvf0Var2).get(), (sxe) ((n2y0) xvf0Var).get(), (tt2) xvf0Var3.get());
            case 21:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.payment_button.a((ru.yandex.taxi.logistics.payment.a) ((hbg) xvf0Var2).get(), (osq) xvf0Var3.get(), (yuj0) ((gbg) xvf0Var).get());
            case 22:
                return new p370(24, (htg) ((exf) xvf0Var2).get(), (u1n) ((k0n) xvf0Var3).get(), (dv8) ((fxf) xvf0Var).get());
            case 23:
                return new ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_method.b((ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a) ((eqh) xvf0Var2).get(), (q8s) ((p1g) xvf0Var3).get(), (yuj0) ((gxf) xvf0Var).get());
            case 24:
                return new bf8(4, (icv0) ((b1g) xvf0Var2).get(), i5m.a((v0g) xvf0Var3), (wiq0) ((w0g) xvf0Var).get());
            case 25:
                return new baa0((g8a0) ((v0g) xvf0Var2).get(), (ycq0) ((w0g) xvf0Var3).get(), (qpt0) ((b1g) xvf0Var).get());
            case 26:
                return new com.ybsdk.feature.pdf.internal.domain.a((com.ybsdk.feature.pdf.internal.data.a) ((e840) xvf0Var2).get(), (f42) ((g42) xvf0Var3).get(), (com.ybsdk.utils.poller.b) ((l5g) xvf0Var).get());
            case 27:
                boj0 boj0Var = (boj0) ((yc) xvf0Var2).get();
                return new ev6((w030) xvf0Var.get(), (sr4) boj0Var.b, (yu6) boj0Var.w, (com.yandex.go.order.bundle.map.impl.data.repository.g) boj0Var.x, (m180) boj0Var.y, (gy70) xvf0Var3.get(), (fv6) boj0Var.z, (yvf0) boj0Var.c);
            case 28:
                return new l3b0((tt2) xvf0Var3.get(), (ru.yandex.taxi.summary.personalaction.notification.b) ((nt0) xvf0Var2).get(), (dx) xvf0Var.get());
            default:
                i8b0 i8b0Var = (i8b0) xvf0Var3.get();
                com.yandex.fintechsdk.data.personalization.impl.internal.datasources.network.a aVar2 = (com.yandex.fintechsdk.data.personalization.impl.internal.datasources.network.a) ((g680) xvf0Var2).get();
                ((vqa0) xvf0Var).get();
                return new com.yandex.fintechsdk.data.personalization.impl.internal.a(i8b0Var, aVar2);
        }
    }

    public /* synthetic */ zi60(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ zi60(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }
}
