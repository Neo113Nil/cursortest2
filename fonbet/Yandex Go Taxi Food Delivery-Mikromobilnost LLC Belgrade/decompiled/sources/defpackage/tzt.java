package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.yandex.go.inapp_calls.dynamic.InAppCallsDynamicApiImpl;
import com.yandex.go.inapp_calls.ui.loader.InAppCallsLoadingLoadingModalView;
import com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images.b;
import com.yandex.go.tariffs.SummaryHighTariffSelectorExperiment;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.comment_suggests.IntercityDashboardChipsView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.comment_suggests.IntercityDashboardCommentSuggestsModalView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardCommentSelectorContainerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.popup.IntercityDashboardPopupView;
import com.yandex.messaging.internal.authorized.sync.e;
import com.yandex.messaging.ui.imageviewer.ImageViewerActivity;
import com.yandex.messaging.ui.imageviewer.a;
import com.ybsdk.core.qr.scanner.ui.InteractorQrScannerView;
import com.ybsdk.screens.upgrade.presentation.edit.c;
import com.ybsdk.screens.upgrade.presentation.edit.d;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import okhttp3.internal.http2.ErrorCode;

/* loaded from: classes15.dex */
public final /* synthetic */ class tzt implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tzt(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        os11 ui_delegate$lambda$0;
        View insetsType$lambda$0;
        nlm0 interactor_delegate$lambda$1;
        int rippleColor_delegate$lambda$0;
        zy11 _init_$lambda$1;
        View cardContentView;
        View cardContentView2;
        int i = this.a;
        int i2 = 6;
        int i3 = 9;
        Long l = null;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                h9g h9gVar = (h9g) ((tw51) obj);
                x8g x8gVar = h9gVar.v;
                h9g h9gVar2 = h9gVar.w;
                b9g b9gVar = new b9g();
                b9gVar.a = i5m.b(new nb11(x8gVar.t, 15));
                b9gVar.b = new nb11(x8gVar.A, 14);
                xvf0 b = i5m.b(oa21.a);
                oto0 oto0Var = new oto0(b9gVar.b, b, 28);
                b9gVar.c = oto0Var;
                xvf0 b2 = i5m.b(new uw11(b9gVar.a, h9gVar2.L, oto0Var, x8gVar.u, x8gVar.q, b));
                b9gVar.d = b2;
                xvf0 xvf0Var = x8gVar.A;
                z1n0 z1n0Var = new z1n0(new nb11(xvf0Var, 13), 29);
                b9gVar.e = z1n0Var;
                oto0 oto0Var2 = b9gVar.c;
                b9gVar.f = i5m.b(new jpn0(b2, h9gVar2.M, (xvf0) oto0Var2, xvf0Var, (v7p) new mg11(oto0Var2, z1n0Var, 11), (v7p) h9gVar2.S, x8gVar.q, h9gVar2.E, 22));
                oto0 oto0Var3 = b9gVar.c;
                b9gVar.g = n3w.a(new d(new c(b9gVar.d, new y101(oto0Var3, b9gVar.b, b9gVar.e, i2), oto0Var3, x8gVar.q, x8gVar.A, h9gVar2.M, h9gVar2.S, h9gVar2.E)));
                break;
            case 2:
                ((k20) obj).cancel();
                break;
            case 3:
                ceu ceuVar = (ceu) obj;
                ObjectAnimator objectAnimator = ceuVar.O;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                EditText editText = ceuVar.N;
                float d = kjs0.d(3);
                float f = -d;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(editText, "translationX", 0.0f, f, 0.0f, d, 0.0f, f, 0.0f, d, 0.0f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(new FastOutSlowInInterpolator());
                ofFloat.start();
                ceuVar.O = ofFloat;
                break;
            case 4:
                rqo rqoVar = ((kgu) obj).a;
                SummaryHighTariffSelectorExperiment.Companion.getClass();
                break;
            case 5:
                e eVar = (e) obj;
                pzt0 pzt0Var = eVar.H;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                eVar.H = null;
                aj20 aj20Var = eVar.h;
                xo3 xo3Var = aj20Var.f;
                if (xo3Var != null) {
                    xo3Var.cancel();
                }
                aj20Var.f = null;
                break;
            case 6:
                euu euuVar = (euu) obj;
                euuVar.getClass();
                try {
                    euuVar.P.n(2, 0, false);
                    break;
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    euuVar.a(errorCode, errorCode, e);
                    break;
                }
            case 7:
                Activity activity = ((a) obj).a;
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), activity.getApplicationInfo().loadLabel(activity.getPackageManager()).toString());
                if (!file.exists() && !file.mkdirs()) {
                    ny61.v("Can't create file");
                    break;
                } else {
                    break;
                }
                break;
            case 8:
                ((b) obj).W.invoke();
                break;
            case 9:
                ui_delegate$lambda$0 = ImageViewerActivity.ui_delegate$lambda$0((ImageViewerActivity) obj);
                break;
            case 10:
                khv khvVar = (khv) obj;
                j3b j3bVar = (j3b) khvVar.h.getValue();
                if (j3bVar != null) {
                    break;
                }
                break;
            case 11:
                ((com.yandex.go.inapp_calls.navigation.c) obj).G.c("DOWNLOAD_SUCCESS_NOTIFICATION_ID");
                break;
            case 12:
                InAppCallsDynamicApiImpl.m((qjv) obj);
                break;
            case 13:
                insetsType$lambda$0 = InAppCallsLoadingLoadingModalView.insetsType$lambda$0((InAppCallsLoadingLoadingModalView) obj);
                break;
            case 14:
                qkv qkvVar = (qkv) obj;
                if (qkvVar.u()) {
                    qkvVar.r(new qu(i3));
                    break;
                }
                break;
            case 15:
                Iterator it = ((sxe0) ((v5c0) obj).b).c.values().iterator();
                if (it.hasNext()) {
                    Long valueOf = Long.valueOf(((rfd) it.next()).a());
                    while (true) {
                        l = valueOf;
                        while (it.hasNext()) {
                            valueOf = Long.valueOf(((rfd) it.next()).a());
                            if (l.compareTo(valueOf) < 0) {
                                break;
                            }
                        }
                    }
                }
                break;
            case 16:
                ryv ryvVar = (ryv) obj;
                ryvVar.e = false;
                ((com.yandex.messaging.input.c) ryvVar.b.get()).c();
                break;
            case 18:
                j0g j0gVar = ((a8w) obj).a;
                break;
            case 19:
                interactor_delegate$lambda$1 = InteractorQrScannerView.interactor_delegate$lambda$1((InteractorQrScannerView) obj);
                break;
            case 20:
                rippleColor_delegate$lambda$0 = IntercityDashboardChipsView.rippleColor_delegate$lambda$0((IntercityDashboardChipsView) obj);
                break;
            case 21:
                ((dbw) obj).d.getImageView().setVisibility(8);
                break;
            case 22:
                _init_$lambda$1 = IntercityDashboardCommentSelectorContainerView._init_$lambda$1((IntercityDashboardCommentSelectorContainerView) obj);
                break;
            case 23:
                cardContentView = ((IntercityDashboardCommentSuggestsModalView) obj).getCardContentView();
                break;
            case 24:
                Iterator it2 = ((olw) ((com.yandex.go.intercity.flex.dashboard.router.a) obj).y).b.iterator();
                while (it2.hasNext()) {
                    llw llwVar = (llw) it2.next();
                    cma1.J(llwVar.itemView());
                    llwVar.onResume();
                }
                break;
            case 25:
                jgw jgwVar = (jgw) obj;
                break;
            case 26:
                cardContentView2 = ((IntercityDashboardPopupView) obj).getCardContentView();
                break;
        }
        return (dw) ((how) obj).b.get();
        return zy11Var;
    }
}
