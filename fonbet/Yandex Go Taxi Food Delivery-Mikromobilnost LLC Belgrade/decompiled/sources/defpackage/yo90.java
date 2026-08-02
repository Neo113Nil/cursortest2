package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.camera2.internal.x;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.core.view.b;
import androidx.media3.ui.PlayerView;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.go.beginners.flow.PreGeoAuthOnboardingModalView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.payments.paymentlist.domain.k;
import com.yandex.go.payments.promo.ui.PaymentPromoModalView;
import com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons.PlacesPaymentsCheckoutButtonsView;
import com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons.PlacesPaymentsCheckoutButtonsViewProperties;
import com.yandex.go.superapp.print_animation_text.PrintAnimationTextView;
import com.yandex.go.user_profile.ui.primary.ProfileModalView;
import com.yandex.go.vault.ui.PrizeModalView;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.messaging.core.net.entities.PrivacyBucket;
import com.yandex.payment.sdk.ui.view.webview.PaymentSdkTinkoffWebView;
import defpackage.tge0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutionException;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.phone_select.PhoneSelectModalView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider;

/* loaded from: classes13.dex */
public final /* synthetic */ class yo90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yo90(c8c0 c8c0Var, View view, View view2) {
        this.a = 10;
        this.b = view;
        this.c = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PaymentSdkTinkoffWebView.TinkoffState tinkoffState;
        String str;
        int i = 0;
        switch (this.a) {
            case 0:
                ap90 ap90Var = (ap90) this.b;
                Object obj = this.c;
                z83.g(null, ap90Var.a.getLooper(), Looper.myLooper());
                z83.h(null, ap90Var.z);
                x22 x22Var = ap90Var.w;
                zo90 zo90Var = ap90Var.x;
                x22Var.c("passport_request_succeed", "method", zo90Var.name());
                ap90Var.z = false;
                if (ap90Var.A) {
                    return;
                }
                zo90Var.l(obj);
                return;
            case 1:
                ap90 ap90Var2 = (ap90) this.b;
                String message = ((Exception) this.c).getMessage();
                Handler handler = ap90Var2.a;
                z83.g(null, handler.getLooper(), Looper.myLooper());
                z83.h(null, ap90Var2.z);
                ap90Var2.w.f("passport_request_failed", "method", ap90Var2.x.name(), Constants.KEY_MESSAGE, message);
                ap90Var2.z = false;
                if (ap90Var2.A) {
                    return;
                }
                handler.postAtTime(ap90Var2, ap90.B, SystemClock.uptimeMillis() + 2000);
                return;
            case 2:
                k kVar = (k) this.b;
                String str2 = (String) this.c;
                qc20 qc20Var = kVar.G;
                String openReason = kVar.x.a.getOpenReason();
                i d = ((j) ((lx4) qc20Var.a)).d("PaymentMethods.PromoBanner.Shown");
                d.d("banner_id", str2);
                d.d("open_reason", openReason);
                d.m();
                return;
            case 3:
                k kVar2 = (k) this.b;
                evz evzVar = (evz) this.c;
                g9a0 g9a0Var = kVar2.J;
                String name = evzVar != null ? evzVar.getName() : null;
                if (name == null) {
                    name = "";
                }
                String a = evzVar != null ? evzVar.a() : null;
                String str3 = a != null ? a : "";
                String openReason2 = kVar2.x.a.getOpenReason();
                g9a0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("loyalty_program", name);
                hashMap.put("loyalty_balance", str3);
                g9a0Var.a.a("PaymentMethods.LoyaltyProgram.Shown", hashMap, 1, tse0.r("source", hashMap, openReason2));
                return;
            case 4:
                bda0 bda0Var = (bda0) this.b;
                xba0 xba0Var = (xba0) this.c;
                bda0Var.T.M1(xba0Var.b, xba0Var.h);
                return;
            case 5:
                ((hba0) ((vp4) this.b).U).Q2(((ngz0) this.c).i);
                return;
            case 6:
                PaymentPromoModalView._init_$lambda$0((PaymentPromoModalView) this.b, (ptv) this.c);
                return;
            case 7:
                String str4 = (String) this.b;
                PaymentSdkTinkoffWebView paymentSdkTinkoffWebView = (PaymentSdkTinkoffWebView) this.c;
                PaymentSdkTinkoffWebView.TinkoffState.Companion.getClass();
                PaymentSdkTinkoffWebView.TinkoffState[] values = PaymentSdkTinkoffWebView.TinkoffState.values();
                int length = values.length;
                while (true) {
                    if (i < length) {
                        tinkoffState = values[i];
                        str = tinkoffState.value;
                        if (!jl40.l(str, str4)) {
                            i++;
                        }
                    } else {
                        tinkoffState = null;
                    }
                }
                if (tinkoffState == null) {
                    return;
                }
                PaymentSdkTinkoffWebView.access$getCallback$p(paymentSdkTinkoffWebView);
                throw null;
            case 8:
                hta0 hta0Var = (hta0) this.b;
                ssa0 ssa0Var = (ssa0) this.c;
                ebi0 ebi0Var = hta0Var.b;
                if (ebi0Var != null) {
                    ebi0Var.c(ssa0Var);
                    return;
                }
                return;
            case 9:
                PhoneSelectModalView.onAttachedToWindow$lambda$0((ViewGroup) this.b, (PhoneSelectModalView) this.c);
                return;
            case 10:
                c8c0.b((View) this.b, (View) this.c);
                return;
            case 11:
                PlacesPaymentsCheckoutButtonsView.initViews$lambda$0$2((PlacesPaymentsCheckoutButtonsView) this.b, (PlacesPaymentsCheckoutButtonsViewProperties) this.c);
                return;
            case 12:
                PlaybackStatsProvider.runOnPlayerFront$lambda$1((Exchanger) this.b, (sls) this.c);
                return;
            case 13:
                ((PlayerView) this.b).lambda$onImageAvailable$1((Bitmap) this.c);
                return;
            case 14:
                v1e0 v1e0Var = (v1e0) this.b;
                ScreenPoint e = ((gh00) v1e0Var.a).e.e((Point) this.c);
                if (e == null) {
                    a3y0.d((a3y0) v1e0Var.g.getValue(), "SEARCH_POLLING:NULL_SCREEN_POINT", new IllegalStateException("Screen point is null for non null point"), null, 4);
                    return;
                } else {
                    v1e0Var.b.animateBubbleAppearingAt(a.x(e, 0, -((Number) v1e0Var.e.invoke()).intValue()));
                    return;
                }
            case 15:
                final tge0 tge0Var = (tge0) this.b;
                PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView = (PreGeoAuthOnboardingModalView) this.c;
                PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView2 = tge0Var.j;
                RobotoTextView robotoTextView = PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView2).m;
                GoFrameLayout goFrameLayout = PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView2).k;
                GoImageView goImageView = PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView2).j;
                int height = robotoTextView.getHeight();
                if (height > 0) {
                    Resources resources = PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView2).a.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(ftg0.pre_geo_ride_icon_slot_padding_top);
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(ftg0.pre_geo_ride_icon_slot_padding_bottom);
                    int dimensionPixelSize3 = resources.getDimensionPixelSize(ftg0.pre_geo_ride_icon_content_height);
                    r1 = dimensionPixelSize3 >= 1 ? dimensionPixelSize3 : 1;
                    int dimensionPixelSize4 = resources.getDimensionPixelSize(ftg0.pre_geo_ride_icon_gap_to_text);
                    int dimensionPixelSize5 = resources.getDimensionPixelSize(ftg0.pre_geo_ride_icon_recoil);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) goFrameLayout.getLayoutParams();
                    layoutParams.height = height;
                    layoutParams.width = -2;
                    layoutParams.setMarginStart(dimensionPixelSize4 + dimensionPixelSize5);
                    goFrameLayout.setLayoutParams(layoutParams);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) goImageView.getLayoutParams();
                    layoutParams2.width = -2;
                    layoutParams2.height = r1;
                    layoutParams2.topMargin = dimensionPixelSize;
                    layoutParams2.bottomMargin = dimensionPixelSize2;
                    layoutParams2.gravity = NavigationBarView.ITEM_GRAVITY_START_CENTER;
                    goImageView.setLayoutParams(layoutParams2);
                    goFrameLayout.requestLayout();
                    goImageView.requestLayout();
                }
                GoFrameLayout goFrameLayout2 = PreGeoAuthOnboardingModalView.access$getBinding(preGeoAuthOnboardingModalView).k;
                WeakHashMap weakHashMap = b.a;
                if (!goFrameLayout2.isLaidOut() || goFrameLayout2.isLayoutRequested()) {
                    goFrameLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.beginners.flow.PreGeoAuthOnboardingModalView$EntranceAnimations$tryScheduleRideIconSlideInOnce$lambda$0$$inlined$doOnLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            view.removeOnLayoutChangeListener(this);
                            tge0.a(tge0.this);
                            tge0.b(tge0.this);
                        }
                    });
                    return;
                } else {
                    tge0.a(tge0Var);
                    tge0.b(tge0Var);
                    return;
                }
            case 16:
                gpe0 gpe0Var = (gpe0) this.b;
                tls tlsVar = (tls) this.c;
                gpe0Var.a.setVisibility(0);
                tlsVar.invoke(gpe0Var);
                cma1.b(1.0f, gpe0Var.a).withEndAction(new wnb0(26, gpe0Var)).start();
                return;
            case 17:
                ((rxe0) this.b).a((znw0) this.c);
                return;
            case 18:
                ((PrintAnimationTextView) this.b).animateToNextKeyframe((x2f0) this.c);
                return;
            case 19:
                a4f0 a4f0Var = (a4f0) this.b;
                PrivacyBucket privacyBucket = (PrivacyBucket) this.c;
                tje.e();
                tf4 tf4Var = a4f0Var.a;
                if (tf4Var != null) {
                    ((x6f0) tf4Var.b).d(new myj0(privacyBucket));
                    return;
                }
                return;
            case 20:
                PrizeModalView.addActionButton$lambda$1((PrizeModalView) this.b, (x231) this.c);
                return;
            case 21:
                o89 o89Var = (o89) this.b;
                wrb0 wrb0Var = (wrb0) this.c;
                try {
                    czj0.b((i5f0) o89Var.get(), wrb0Var);
                    return;
                } catch (InterruptedException | ExecutionException e2) {
                    czj0.a(wrb0Var, e2);
                    return;
                }
            case 22:
                x xVar = (x) this.b;
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.c;
                androidx.camera.core.impl.a.a(xVar.f);
                if (deferrableSurface != null) {
                    deferrableSurface.b();
                    return;
                }
                return;
            case 23:
                m6f0 m6f0Var = (m6f0) this.b;
                jdv jdvVar = (jdv) this.c;
                n9j0 n9j0Var = m6f0Var.i;
                n9j0Var.getClass();
                tob1.b();
                if (n9j0Var.g) {
                    jdvVar.close();
                    return;
                }
                d6z.y("onImageCaptured() must be called before onFinalResult()", n9j0Var.c.b.isDone());
                n9j0Var.a();
                b8x0 b8x0Var = n9j0Var.a;
                b8x0Var.a().execute(new y7x0(r1, b8x0Var, jdvVar));
                return;
            case 24:
                m6f0 m6f0Var2 = (m6f0) this.b;
                reu reuVar = (reu) this.c;
                n9j0 n9j0Var2 = m6f0Var2.i;
                n9j0Var2.getClass();
                tob1.b();
                if (n9j0Var2.g) {
                    return;
                }
                d6z.y("onImageCaptured() must be called before onFinalResult()", n9j0Var2.c.b.isDone());
                n9j0Var2.a();
                b8x0 b8x0Var2 = n9j0Var2.a;
                b8x0Var2.a().execute(new y7x0(2, b8x0Var2, reuVar));
                return;
            case 25:
                m6f0 m6f0Var3 = (m6f0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                n9j0 n9j0Var3 = m6f0Var3.i;
                n9j0Var3.getClass();
                tob1.b();
                if (n9j0Var3.g) {
                    return;
                }
                b8x0 b8x0Var3 = n9j0Var3.a;
                b8x0Var3.a().execute(new a8x0(b8x0Var3, bitmap));
                return;
            case 26:
                m6f0 m6f0Var4 = (m6f0) this.b;
                ImageCaptureException imageCaptureException = (ImageCaptureException) this.c;
                n9j0 n9j0Var4 = m6f0Var4.i;
                n9j0Var4.getClass();
                tob1.b();
                if (n9j0Var4.g) {
                    return;
                }
                d6z.y("onImageCaptured() must be called before onFinalResult()", n9j0Var4.c.b.isDone());
                n9j0Var4.a();
                tob1.b();
                b8x0 b8x0Var4 = n9j0Var4.a;
                b8x0Var4.a().execute(new y7x0(3, b8x0Var4, imageCaptureException));
                return;
            case 27:
                r6f0 r6f0Var = (r6f0) this.b;
                n951 n951Var = (n951) this.c;
                synchronized (r6f0Var.k) {
                    try {
                        Iterator it = r6f0Var.j.iterator();
                        while (it.hasNext()) {
                            ((uko) it.next()).onExecuted(n951Var, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 28:
                ProfileModalView.applyRating$lambda$0((ProfileModalView) this.b, (rff0) this.c);
                return;
            default:
                ((qkf0) this.b).C((f7q0) this.c);
                return;
        }
    }

    public /* synthetic */ yo90(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
