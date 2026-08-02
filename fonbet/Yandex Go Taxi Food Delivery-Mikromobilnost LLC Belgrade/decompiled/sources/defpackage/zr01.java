package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.navigation.UserPhotoUploadingEntryPoint;
import com.yandex.go.shortcuts.impl.view.adapter.w;
import com.yandex.go.taxi.order.jobs.UpdateOrderStatusJob;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.y;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1ModalView;
import com.yandex.go.ui.CircleLoadingImageView;
import com.yandex.go.ui.UserPhotoNotificationItemComponent;
import com.yandex.go.universal_qr_scanner.presentation.d;
import com.yandex.go.vault.flexsdk.descriptors.widget.animation.LockOverlayView;
import com.yandex.mapkit.navigation.transport.layer.RouteView;
import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.payment.sdk.transportcards.nfc.a;
import com.yandex.runtime.image.ImageProvider;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.internal.screens.result.presentation.TransferResultFragment;
import com.ybsdk.feature.transfer.internal.screens.targets.presentation.TransferTargetsFragment;
import com.ybsdk.rconfig.configs.YbMobileTabBarConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.settings.profile.UserInfoProfileView;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes14.dex */
public final /* synthetic */ class zr01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zr01(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 actionButtonText$lambda$17$lambda$15;
        zy11 consumeSideEffect$lambda$14;
        zy11 render$lambda$13$lambda$11$lambda$9;
        Object value;
        CircleLoadingImageView circleLoadingImageView_delegate$lambda$0;
        StatusAvailability findByType;
        kk31 hubItemsAdapter$lambda$0;
        switch (this.a) {
            case 0:
                actionButtonText$lambda$17$lambda$15 = TransferResultFragment.setActionButtonText$lambda$17$lambda$15((ca61) this.b, (Text) this.c);
                return actionButtonText$lambda$17$lambda$15;
            case 1:
                consumeSideEffect$lambda$14 = TransferTargetsFragment.consumeSideEffect$lambda$14((TransferTargetsFragment) this.b, (qas0) this.c);
                return consumeSideEffect$lambda$14;
            case 2:
                render$lambda$13$lambda$11$lambda$9 = TransferTargetsFragment.render$lambda$13$lambda$11$lambda$9((ea61) this.b, (au01) this.c);
                return render$lambda$13$lambda$11$lambda$9;
            case 3:
                ro01 ro01Var = (ro01) this.b;
                c06 c06Var = (c06) this.c;
                List<YbMobileTabBarConfig.TabBarItem> items = ((qu01) ro01Var).b.q().getItems();
                ArrayList arrayList = new ArrayList(tcc.n(items, 10));
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    arrayList.add(((YbMobileTabBarConfig.TabBarItem) it.next()).toEntity());
                }
                return new vv01(arrayList, c06Var.p() ? new te6(new t8j0()) : bei.y, null, false, false, false);
            case 4:
                ewi ewiVar = (ewi) this.b;
                Bitmap bitmap = ((ImageProvider) this.c).get$image();
                if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                    unr0.D(new Object[]{String.valueOf(bitmap.getConfig())}, 1, "Have pickup image config %s", jst.e, new IllegalStateException("Wrong pickup image config"));
                    bitmap = u8b1.f(bitmap);
                }
                int width = (int) (bitmap.getWidth() * ewiVar.a);
                return Bitmap.createScaledBitmap(bitmap, width, width, true);
            case 5:
                return b.i(new Pair("type", "onBalloonViewsChanged"), new Pair("routeId", ((msv) this.b).d.a(ReferenceType.TRANSPORT_ROUTE_VIEW, (RouteView) this.c)));
            case 6:
                ((hba0) ((vp4) this.b).U).b9((String) this.c);
                return zy11.a;
            case 7:
                ((hba0) ((vp4) this.b).U).Q2(((y011) this.c).h);
                return zy11.a;
            case 8:
                return b.i(new Pair("type", "onRouteTap"), new Pair("routeId", ((r811) this.b).c.a(ReferenceType.TRANSPORT_ROUTE_VIEW, (RouteView) this.c)));
            case 9:
                ((tls) this.b).invoke(((qa11) this.c).a);
                return zy11.a;
            case 10:
                ((tls) this.b).invoke(new va11(((ab11) this.c).b.a));
                return zy11.a;
            case 11:
                ((com.yandex.go.places.impl.ui.organizations.chips.viewholders.b) this.b).S.invoke((ei80) this.c);
                return zy11.a;
            case 12:
                ((a) this.b).g((jgr) ((mgr) this.c));
                return zy11.a;
            case 13:
                ((w) this.b).R.a((yj11) this.c);
                return zy11.a;
            case 14:
                l47 l47Var = (l47) this.b;
                l47Var.b.setImageResource(((yj11) this.c).i);
                l47Var.d.setVisibility(8);
                l47Var.b.setVisibility(0);
                return zy11.a;
            case 15:
                jo11 jo11Var = (jo11) this.b;
                oo11 oo11Var = (oo11) this.c;
                int i = no11.a[jo11Var.a.ordinal()];
                if (i == 1) {
                    oo11Var.Q(jo11Var);
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    oo11Var.P(jo11Var);
                }
                return zy11.a;
            case 16:
                d dVar = (d) this.b;
                u021 u021Var = (u021) this.c;
                r0 r0Var = dVar.A.e;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, kotlin.collections.a.j0((List) value, u021Var)));
                return zy11.a;
            case 17:
                TaxiOrder taxiOrder = (TaxiOrder) this.b;
                y yVar = (y) this.c;
                int i2 = UpdateOrderStatusJob.f;
                return "status=" + taxiOrder.h.getB() + ", due=" + yVar.o(taxiOrder);
            case 18:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.b.X((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.b) this.b, (be21) this.c);
                return zy11.a;
            case 19:
                com.ybsdk.persistence.b bVar = (com.ybsdk.persistence.b) this.b;
                hn21 hn21Var = (hn21) this.c;
                i5z0.a.a("preference listener unregistered", new Object[0]);
                bVar.a.unregisterOnSharedPreferenceChangeListener(hn21Var);
                return zy11.a;
            case 20:
                circleLoadingImageView_delegate$lambda$0 = UserInfoProfileView.circleLoadingImageView_delegate$lambda$0((Context) this.b, (UserInfoProfileView) this.c);
                return circleLoadingImageView_delegate$lambda$0;
            case 21:
                com.yandex.go.domain.interactor.b bVar2 = (com.yandex.go.domain.interactor.b) this.b;
                String str = ((kq21) this.c).e;
                ((pep0) bVar2.i).f((m950) bVar2.h.get(), new hr21(UserPhotoUploadingEntryPoint.IN_APP_NOTIFICATION, false, 6), hxx.a);
                bVar2.g.c(UserPhotoNotificationItemComponent.NOTIFICATION_ID);
                cug cugVar = bVar2.j.b;
                cugVar.getClass();
                HashMap hashMap = new HashMap();
                if (str != null) {
                    hashMap.put("photo_status", str);
                }
                cugVar.a.a("UserPhotoUploading.Notification.Tapped", hashMap, 1, new HashMap());
                return zy11.a;
            case 22:
                yt21 yt21Var = (yt21) this.b;
                String str2 = (String) this.c;
                st21 a = yt21Var.h.a(str2);
                if (a == null || (findByType = StatusAvailability.INSTANCE.findByType(a.d)) == null) {
                    return null;
                }
                String str3 = a.h;
                String str4 = a.g;
                clf clfVar = (str3 == null || str4 == null) ? null : new clf(str3, str4, a.i, a.j);
                long j = a.c;
                boolean z = a.e == 1;
                o430 o430Var = e3n.b;
                return new it21(str2, j, findByType, z, kp50.U(a.f, DurationUnit.SECONDS), clfVar);
            case 23:
                b431 b431Var = (b431) this.b;
                a431 a431Var = (a431) this.c;
                ValueAnimator valueAnimator = b431Var.b;
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
                LottieAnimationView lottieAnimationView = a431Var.O;
                if (lottieAnimationView == null) {
                    lottieAnimationView = null;
                }
                lottieAnimationView.setRepeatCount(0);
                LottieAnimationView lottieAnimationView2 = a431Var.O;
                if (lottieAnimationView2 == null) {
                    lottieAnimationView2 = null;
                }
                lottieAnimationView2.removeAllAnimatorListeners();
                LockOverlayView lockOverlayView = a431Var.Q;
                if (lockOverlayView == null) {
                    lockOverlayView = null;
                }
                lockOverlayView.setVisibility(0);
                LockOverlayView lockOverlayView2 = a431Var.Q;
                (lockOverlayView2 != null ? lockOverlayView2 : null).setAlpha(1.0f);
                b431Var.D = false;
                return zy11.a;
            case 24:
                qb31 qb31Var = (qb31) this.b;
                jb31 jb31Var = (jb31) this.c;
                int E = qb31Var.E();
                if (E != -1) {
                    jb31Var.a.invoke(Integer.valueOf(E), jb31Var.c.get(E));
                }
                return zy11.a;
            case 25:
                kz6 kz6Var = (kz6) this.b;
                tls tlsVar = (tls) this.c;
                if (kz6Var.c != null) {
                    tlsVar.invoke(be31.a);
                    tlsVar.invoke(new id31(kz6Var.c));
                }
                return zy11.a;
            case 26:
                k0s k0sVar = (k0s) this.b;
                tls tlsVar2 = (tls) this.c;
                pzu pzuVar = k0sVar.c;
                if (pzuVar != null) {
                    tlsVar2.invoke(new id31(pzuVar));
                }
                return zy11.a;
            case 27:
                hubItemsAdapter$lambda$0 = VerticalHubV1ModalView.hubItemsAdapter$lambda$0((lk31) this.b, (VerticalHubV1ModalView) this.c);
                return hubItemsAdapter$lambda$0;
            case 28:
                kt60 kt60Var = (kt60) this.b;
                tls tlsVar3 = (tls) this.c;
                pzu pzuVar2 = kt60Var.f;
                if (pzuVar2 != null) {
                    tlsVar3.invoke(pzuVar2);
                }
                return zy11.a;
            default:
                return Boolean.valueOf(((dtr0) ((wg6) this.b).g.getValue()).a == ((dh31) this.c).a.c);
        }
    }
}
