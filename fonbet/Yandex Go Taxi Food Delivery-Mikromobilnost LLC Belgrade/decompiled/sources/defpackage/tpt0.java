package defpackage;

import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import androidx.camera.camera2.internal.u;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.dto.response.Action$SdcRouteSelection;
import com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemErrorView;
import com.yandex.go.superapp.discovery.map.impl.ui.search.SuperAppDiscoveryMapSearchModalView;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowNotification;
import com.yandex.go.taxi.order.support.ui.details.SupportDetailsModalView;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.StickerPacksData;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.communications.api.dto.StoryWidgets;
import ru.yandex.taxi.communications.model.widgets.b;
import ru.yandex.taxi.design.CheckBoxComponent;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.domain.o;
import ru.yandex.taxi.statebar.a;
import ru.yandex.taxi.stories.presentation.story.StoryContentView;
import ru.yandex.taxi.stories.presentation.story.StoryModalView;
import ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.mvp.SummaryPromotionModalWindowsModalView;
import ru.yandex.taxi.widget.RoundedCornersImageView;
import ru.yandex.video.m3.player.impl.tracking.StrmTrackingApi;
import ru.yandex.video.m3.player.impl.utils.observable.StatefulProvider;
import ru.yandex.video.m3.player.provider.ValueObserver;

/* loaded from: classes10.dex */
public final /* synthetic */ class tpt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tpt0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ejw0 ejw0Var;
        Object[] objArr = 0;
        tdj tdjVar = null;
        switch (this.a) {
            case 0:
                ((SphericalGLSurfaceView) this.b).lambda$onSurfaceTextureAvailable$1((SurfaceTexture) this.c);
                return;
            case 1:
                a aVar = (a) this.b;
                Runnable runnable = (Runnable) this.c;
                if (aVar.c.a.isEmpty()) {
                    runnable.run();
                    aVar.g.g(zy11.a);
                    return;
                }
                return;
            case 2:
                s020 e = ((y5u0) this.b).e.e(((ChatData) this.c).getChatId());
                if (e != null) {
                    l270 l270Var = (l270) ((m8g) e).s0.get();
                    z83.g(null, l270Var.a, Looper.myLooper());
                    if (l270Var.e != null) {
                        return;
                    }
                    l270Var.e = l270Var.d.f(new t7b(2, l270Var));
                    return;
                }
                return;
            case 3:
                StatefulProvider.addObserver$lambda$2((ValueObserver) this.b, (StatefulProvider) this.c);
                return;
            case 4:
                u8u0 u8u0Var = (u8u0) this.b;
                o2y0 o2y0Var = (o2y0) this.c;
                pit pitVar = u8u0Var.a;
                pitVar.getClass();
                xh60 w = o2y0Var.b().l.w();
                if (w == null) {
                    return;
                }
                t8u0 t8u0Var = pitVar.f;
                OrderStatusWindowNotification orderStatusWindowNotification = (OrderStatusWindowNotification) w.b;
                zrm zrmVar = new zrm(26, pitVar, o2y0Var);
                if (t8u0Var.b.a.n(o2y0Var.b().a).contains(orderStatusWindowNotification.e) ? false : eg3.k(orderStatusWindowNotification).isEmpty()) {
                    tdjVar = new tdj(o2y0Var);
                    tdjVar.i = orderStatusWindowNotification;
                    tdjVar.f = new f83(t8u0Var, o2y0Var, zrmVar, orderStatusWindowNotification, 13);
                }
                String str = ((OrderStatusWindowNotification) w.b).e;
                if (tdjVar != null) {
                    sa2 sa2Var = new sa2(str, 1);
                    apf apfVar = pitVar.h;
                    tdj tdjVar2 = (tdj) apfVar.w;
                    if (tdjVar2 != null ? apf.r(tdjVar2, OrderStatusWindowNotification.class, sa2Var) : false) {
                        return;
                    }
                    Iterator it = ((ArrayDeque) apfVar.c).iterator();
                    while (it.hasNext()) {
                        if (apf.r((tdj) it.next(), OrderStatusWindowNotification.class, sa2Var)) {
                            it.remove();
                        }
                    }
                    pitVar.h.l(tdjVar);
                    u8u0Var.c.a.c(w.a);
                    return;
                }
                return;
            case 5:
                jcu0 jcu0Var = (jcu0) this.b;
                StickerPacksData.PackData packData = (StickerPacksData.PackData) this.c;
                tje.e();
                scu0 scu0Var = jcu0Var.c;
                if (scu0Var != null) {
                    scu0Var.d.setStickerPackData(packData);
                    return;
                }
                return;
            case 6:
                kdu0 kdu0Var = (kdu0) this.b;
                kdu0Var.x = kdu0Var.y.b.b((ykn0) this.c, kdu0Var.a);
                return;
            case 7:
                kdu0 kdu0Var2 = (kdu0) this.b;
                StickerPacksData.PackData packData2 = (StickerPacksData.PackData) this.c;
                ykn0 ykn0Var = kdu0Var2.w;
                if (ykn0Var != null) {
                    jcu0 jcu0Var2 = (jcu0) ykn0Var.b;
                    tje.e();
                    scu0 scu0Var2 = jcu0Var2.c;
                    if (scu0Var2 != null) {
                        scu0Var2.d.setStickerPackData(packData2);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                StoryContentView.setupLink$lambda$0((StoryContentView) this.b, (StoryWidgets.c) this.c);
                return;
            case 9:
                super/*android.view.View*/.dispatchDraw((Canvas) this.c);
                return;
            case 10:
                StoryContentView.addActionButton$lambda$0((StoryContentView) this.b, (gqu0) this.c);
                return;
            case 11:
                bqu0 bqu0Var = (bqu0) this.b;
                you0 you0Var = (you0) this.c;
                wor0 wor0Var = bqu0Var.i;
                RoundedCornersImageView roundedCornersImageView = bqu0Var.l;
                z = ((StoryModalView) wor0Var.a).attached;
                if (z) {
                    roundedCornersImageView.animate().setListener(null);
                    roundedCornersImageView.setAlpha(1.0f);
                    you0Var.run();
                    return;
                }
                return;
            case 12:
                ((StrmTrackingApi) this.b).trackEventInternal(this.c);
                return;
            case 13:
                g8v0 g8v0Var = (g8v0) this.b;
                hp8 hp8Var = (hp8) this.c;
                boolean isChecked = ((CheckBoxComponent) g8v0Var.T.e).isChecked();
                boolean z2 = !isChecked;
                boolean z3 = hp8Var.l;
                if (z3 || !isChecked) {
                    g8v0Var.V.invoke(hp8Var.a, Boolean.valueOf(z2), Boolean.valueOf(z3));
                } else {
                    z2 = true;
                }
                g8v0Var.e0(z2, true, z3);
                return;
            case 14:
                ((n1c) this.b).onPickedAddress((FavoriteAddress) this.c);
                return;
            case 15:
                ((h28) this.b).T.H9((FavoriteAddress) this.c);
                return;
            case 16:
                zxs0 zxs0Var = (zxs0) this.b;
                ogv0 ogv0Var = (ogv0) this.c;
                e7t0 e7t0Var = (e7t0) zxs0Var.b;
                ogv0Var.getClass();
                e7t0Var.invoke(ugv0.b);
                return;
            case 17:
                SummaryPromotionModalWindowsModalView.setupButton$lambda$1((SummaryPromotionModalWindowsModalView) this.b, (b) this.c);
                return;
            case 18:
                jov0 jov0Var = (jov0) this.b;
                khv0 khv0Var = ((bov0) this.c).b;
                if (khv0Var instanceof fhv0) {
                    jov0Var.O.b(SourcePicker.B_FROM_SUMMARY, ModalViewOrigin.SUMMARY, true);
                    return;
                } else if (khv0Var instanceof ehv0) {
                    ((o) jov0Var.P.get()).a(new ogu0(14, jov0Var));
                    return;
                } else {
                    if (khv0Var instanceof chv0) {
                        ((ru.yandex.taxi.orderforanother.router.a) ((aw70) jov0Var.Q.get())).b(new d82(1), new d82(1));
                        return;
                    }
                    return;
                }
            case 19:
                SuperAppDiscoveryMapSearchModalView.adapter$lambda$0((SuperAppDiscoveryMapSearchModalView) ((com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder.a) this.b).U.b, (bxv0) this.c);
                return;
            case 20:
                y4c0 y4c0Var = (y4c0) this.b;
                ogu0 ogu0Var = (ogu0) this.c;
                ((fc5) y4c0Var.H).a(null, "SuperAppMainScreenCarsOnMapOverlayRouter");
                ((tt2) y4c0Var.G).getClass();
                sjh sjhVar = uyj.a;
                o400.a.o(EmptyCoroutineContext.a, new lnv0(4, ogu0Var));
                return;
            case 21:
                u8w0 u8w0Var = (u8w0) this.b;
                Action$SdcRouteSelection action$SdcRouteSelection = (Action$SdcRouteSelection) this.c;
                u8w0Var.b.b(new oxr0(action$SdcRouteSelection.a, action$SdcRouteSelection.b, action$SdcRouteSelection.c));
                return;
            case 22:
                ((y4c0) this.b).T((x8w0) this.c);
                return;
            case 23:
                SuperappSuggestMapItemErrorView.setData$lambda$2$1((SuperappSuggestMapItemErrorView) this.b, (sls) this.c);
                return;
            case 24:
                SupportDetailsModalView supportDetailsModalView = (SupportDetailsModalView) this.b;
                niw0 niw0Var = (niw0) this.c;
                ejw0Var = supportDetailsModalView.presenter;
                piw0 piw0Var = ejw0Var.z;
                String str2 = niw0Var.a;
                String str3 = ejw0Var.y.a;
                piw0Var.getClass();
                piw0Var.b(piw0.a("DetailsScreen", "ButtonTapped"), new Pair("type", str2), new Pair("from", str3));
                ((bjw0) ejw0Var.x.a).r(new ajw0(niw0Var.d, objArr == true ? 1 : 0));
                return;
            case 25:
                ((e9e) ((AtomicReference) this.c).get()).accept(new t84((snw0) this.b));
                return;
            case 26:
                ((ynw0) this.b).d((w84) this.c);
                return;
            case 27:
                ((ynw0) this.b).d((xnw0) this.c);
                return;
            case 28:
                e1x0 e1x0Var = (e1x0) this.b;
                b1x0 b1x0Var = (b1x0) this.c;
                u uVar = e1x0Var.b;
                synchronized (uVar.b) {
                    uVar.c.remove(e1x0Var);
                    uVar.d.remove(e1x0Var);
                }
                e1x0Var.g(b1x0Var);
                if (e1x0Var.f == null) {
                    sgb1.g(5, "SyncCaptureSessionBase");
                    return;
                } else {
                    Objects.requireNonNull(e1x0Var.e);
                    e1x0Var.e.c(b1x0Var);
                    return;
                }
            default:
                d1x0 d1x0Var = (d1x0) this.b;
                b1x0 b1x0Var2 = (b1x0) this.c;
                Objects.requireNonNull(d1x0Var.e);
                d1x0Var.e.g(b1x0Var2);
                return;
        }
    }
}
