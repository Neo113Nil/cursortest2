package defpackage;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.widget.PopupWindow;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import com.yandex.go.beginners.flow.PreGeoAuthOnboardingModalView;
import com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoModalView;
import com.yandex.go.places.impl.ui.bookings.PlacesBookingsModalView;
import com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons.PlacesPaymentsCheckoutButtonsView;
import com.yandex.go.position_alert.b;
import java.util.HashMap;
import ru.yandex.taxi.cashback.analytics.CashbackCardContext;
import ru.yandex.taxi.cashback.login.PlusPortalLoginModalView;
import ru.yandex.taxi.cashback.router.c;
import ru.yandex.taxi.fragment.order.PoolRulesReminderModalView;
import ru.yandex.taxi.map.overlay.pickup.d;
import ru.yandex.taxi.modal.popup.ui.PopupDialogModalView;
import ru.yandex.taxi.plus.sdk.plus_subs_promo.PlusSubsPromoModalView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.yaplus.a;
import ru.yandex.video.m3.player.impl.tracking.PlayerAliveStateLog;
import ru.yandex.video.m3.preload_manager.PreloadWorkerJobHandle;
import ru.yandex.video.m3.preload_manager.PreloaderTransactionImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class wnb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wnb0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 9;
        Object obj = this.b;
        switch (i) {
            case 0:
                PickupFromPhotoModalView._init_$lambda$1((PickupFromPhotoModalView) obj);
                break;
            case 1:
                d dVar = (d) obj;
                erx erxVar = dVar.A;
                HashMap hashMap = dVar.M;
                erxVar.b(hashMap);
                dVar.F.c(hashMap, erxVar);
                break;
            case 2:
                ((ttb0) obj).h();
                break;
            case 3:
                f4c0 f4c0Var = (f4c0) obj;
                Object obj2 = f4c0Var.d;
                if (!(obj2 instanceof pp60)) {
                    obj2 = null;
                }
                pp60 pp60Var = (pp60) obj2;
                if (pp60Var == null) {
                    pp60Var = oyr.c(f4c0Var);
                }
                pp60Var.b = null;
                break;
            case 4:
                PlacesBookingsModalView._init_$onBackButtonClicked((y5c0) obj);
                break;
            case 5:
                PlacesPaymentsCheckoutButtonsView.initViews$lambda$0$1((PlacesPaymentsCheckoutButtonsView) obj);
                break;
            case 6:
                ((io.flutter.plugin.platform.d) obj).i(false);
                break;
            case 7:
                PlayerAliveStateLog.restartTimer$lambda$0((PlayerAliveStateLog) obj);
                break;
            case 8:
                ((PlayerControlView) obj).updateProgress();
                break;
            case 9:
                ((PlayerView) obj).invalidate();
                break;
            case 10:
                ((a46) obj).r(new qu(i2));
                break;
            case 11:
                ((c) ((s3d0) obj).d.getValue()).i();
                break;
            case 12:
                ((s5d0) obj).a();
                break;
            case 13:
                ((PlusPortalLoginModalView) obj).requestFocus();
                break;
            case 14:
                ((bid0) obj).c.m(PlusPortalLoginModalView.class);
                break;
            case 15:
                ((w030) obj).h();
                break;
            case 16:
                a aVar = (a) obj;
                iid0 iid0Var = aVar.b.c;
                cne0 cne0Var = iid0Var.a;
                cne0Var.u(iid0Var.b, false);
                cne0Var.b();
                d49 d49Var = aVar.c;
                d49Var.getClass();
                d49.d(d49Var, CashbackCardContext.STARTUP);
                break;
            case 17:
                ((PlusSubsPromoModalView) obj).onBackPressed();
                break;
            case 18:
                ((c) obj).r(new qu(i2));
                break;
            case 19:
                ((v1e0) obj).b.animateBubbleDisappear();
                break;
            case 20:
                ((PoolRulesReminderModalView) obj).dismiss();
                break;
            case 21:
                ((PopupDialogModalView) obj).onBackPressed();
                break;
            case 22:
                mae0 mae0Var = (mae0) obj;
                mae0Var.g.setImageResource(0);
                PopupWindow popupWindow = mae0Var.m;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                mae0Var.m = null;
                AnimatorSet animatorSet = mae0Var.l;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                mae0Var.l = null;
                break;
            case 23:
                b bVar = (b) obj;
                bVar.J = null;
                bVar.r(new qu(i2));
                break;
            case 24:
                ((pfe0) obj).close();
                break;
            case 25:
                tge0 tge0Var = (tge0) obj;
                PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView = tge0Var.j;
                if (!tge0Var.c) {
                    tge0Var.c = true;
                    RobotoTextView robotoTextView = PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView).m;
                    robotoTextView.post(new ud30(17, robotoTextView, new yo90(15, tge0Var, preGeoAuthOnboardingModalView), tge0Var));
                }
                ValueAnimator valueAnimator = tge0Var.a;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                RobotoTextView robotoTextView2 = PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView).m;
                int t = qje.t(xng0.textMain, preGeoAuthOnboardingModalView.getContext());
                int t2 = qje.t(xng0.controlMain, preGeoAuthOnboardingModalView.getContext());
                robotoTextView2.setTextColor(t);
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(t), Integer.valueOf(t2));
                ofObject.setDuration(900L);
                ofObject.setInterpolator(vge0.a);
                ofObject.addUpdateListener(new rge0(0, robotoTextView2));
                ofObject.start();
                tge0Var.a = ofObject;
                break;
            case 26:
                ((gpe0) obj).e.setEnabled(true);
                break;
            case 27:
                ((PreloadWorkerJobHandle) obj).body();
                break;
            case 28:
                PreloaderTransactionImpl.commit$lambda$2((PreloaderTransactionImpl) obj);
                break;
            default:
                rwe0 rwe0Var = (rwe0) obj;
                shb1.e(new agc0(i2, ((yv90) rwe0Var.b).g(), rwe0Var));
                break;
        }
    }
}
