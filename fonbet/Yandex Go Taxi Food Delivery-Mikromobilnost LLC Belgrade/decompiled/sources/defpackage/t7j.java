package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.util.Log;
import androidx.compose.foundation.lazy.layout.h;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import com.yandex.go.external_service.router.b;
import com.yandex.go.flex.common.api.actions.ActionWithOnTapOnboarding;
import com.yandex.go.flex.main_screen.presentation.divkit.custom_view.onboarding_button.FeedOnboardingButton;
import com.yandex.go.flex.main_screen.presentation.divkit.custom_view.onboarding_button.MainScreenOnboardingButtonProperties;
import com.yandex.go.payments.shared.family.web.c;
import com.yandex.go.superapp.api.loading_tracker.GlobalLoadingEvent;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardPromoBannerContainerView;
import com.yandex.go.taxi.order.ActionButtonsClickListener$SourceScreen;
import com.yandex.go.taxi.order.details.v1.elements.buttons.o;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.mapkit.location.LocationManager;
import com.yandex.messaging.formatting.a;
import com.yandex.messaging.input.bricks.writing.d;
import com.yandex.plus.pay.ui.core.mobile.view.error.buttons.PlusPayErrorButtonsView;
import com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2Fragment;
import io.appmetrica.analytics.AppMetricaYandex;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.api.alicekit.directives.platform.utils.TDirective;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.analytics.InstallReferrerReceiver;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage;
import ru.yandex.taxi.eats_commons.EatsService;
import ru.yandex.taxi.preorder.source.userposition.repository.f;
import ru.yandex.taxi.promotions.model.PromotionBackground;
import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchModalView;
import ru.yandex.taxi.superapp.orders.models.ActionType;

/* loaded from: classes12.dex */
public final /* synthetic */ class t7j implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ t7j(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ClipData.Item itemAt;
        zy11 bindData$lambda$0;
        zy11 showOverlay$lambda$11;
        zy11 zy11Var;
        zy11 tryToSetImageBackground$lambda$0;
        zy11 tryToSetupAnimation$lambda$1;
        zy11 animateShow$lambda$0$0;
        zy11 onReceive$lambda$0;
        zy11 renderTip$lambda$12;
        Object failure;
        int i = this.a;
        int i2 = 1;
        int i3 = 6;
        Object obj = null;
        zy11 zy11Var2 = zy11.a;
        Object obj2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                o oVar = (o) obj4;
                p4j p4jVar = oVar.e;
                ActionType actionType = ((xw) obj3).a;
                p4jVar.getClass();
                p4jVar.c(p4j.a(actionType));
                oVar.b.a(((TaxiOrder) obj2).a, actionType, ActionButtonsClickListener$SourceScreen.ORDER_DETAILS);
                return zy11Var2;
            case 1:
                zwf0 zwf0Var = (zwf0) obj2;
                syj0 b = ((t830) ((gcx) obj4)).b(TDirective.class, (TDirective) obj3);
                if (b instanceof lyj0) {
                    obj = ((lyj0) b).a;
                } else {
                    if (!(b instanceof jyj0)) {
                        w511.b();
                        return null;
                    }
                    zwf0Var.f("DirectiveExtensions", ((fcx) ((jyj0) b).a).a);
                }
                return (String) obj;
            case 2:
                ((pep0) ((oep0) obj4)).f((m950) ((fdm) obj3).b.get(), new odm(((edm) obj2).a), hxx.a);
                return zy11Var2;
            case 3:
                ((tj) obj4).invoke(new vhf((ArrayList) obj3, (String) obj2));
                return zy11Var2;
            case 4:
                a aVar = (a) obj3;
                com.yandex.messaging.internal.view.input.edit.a aVar2 = (com.yandex.messaging.internal.view.input.edit.a) obj2;
                ClipData primaryClip = ((ClipboardManager) ((Activity) obj4).getSystemService("clipboard")).getPrimaryClip();
                String htmlText = (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null) ? null : itemAt.getHtmlText();
                if (htmlText == null) {
                    return null;
                }
                String a = aVar.a(htmlText);
                return aVar2.B.a(tz10.D) ? ((v3k0) aVar2.c).b(2, a) : new SpannableStringBuilder(a);
            case 5:
                return new pbd0((PlusPayErrorButtonsView) ((r6o) obj4).g.a(r6o.r[7]), (sls) obj3, (sls) obj2);
            case 6:
                b bVar = (b) obj4;
                v3p v3pVar = (v3p) obj3;
                o3p o3pVar = (o3p) obj2;
                bVar.H.a(GlobalLoadingEvent.ROUTING_START);
                ((bgn) bVar.F.get()).getClass();
                x6w0 x6w0Var = v3pVar.a;
                boolean l = jl40.l(x6w0Var.a.getValue(), EatsService.EATS.getValue());
                p3p p3pVar = (p3p) bVar.x;
                if (p3pVar != null) {
                    nvx nvxVar = p3pVar.a;
                    if (nvxVar instanceof lvx) {
                        String str = ((lvx) nvxVar).a.c;
                        ((bgn) v3pVar.b.F.get()).getClass();
                        if (str != null) {
                            evu0.J(str);
                        }
                    }
                }
                if (l) {
                    bVar.M.a.set(true);
                }
                bVar.A((m950) bVar.E.get(), new f2p(o3pVar, x6w0Var), new wui(bVar, i3));
                pzt0 pzt0Var = bVar.O;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                bVar.O = null;
                return zy11Var2;
            case 7:
                c cVar = (c) obj4;
                cVar.U = null;
                cVar.D(((scg) ((ff41) cVar.V.getValue())).b(), new dg41(c.P(cVar, (String) obj3), (com.yandex.go.payments.shared.family.web.b) obj2, cVar.Z, new sc(i3, cVar), null, null, null, 224), new gap(cVar, i2));
                return zy11Var2;
            case 8:
                bindData$lambda$0 = FeedOnboardingButton.bindData$lambda$0((FeedOnboardingButton) obj4, (MainScreenOnboardingButtonProperties) obj3, (tls) obj2);
                return bindData$lambda$0;
            case 9:
                ((zgr) obj4).handle(((ActionWithOnTapOnboarding) obj3).c, (n6u) obj2);
                return zy11Var2;
            case 10:
                showOverlay$lambda$11 = FlexRouteHandlerImpl.showOverlay$lambda$11((FlexRouteHandlerImpl) obj4, (String) obj3, (ywl) obj2);
                return showOverlay$lambda$11;
            case 11:
                zy11Var = FullScreenBannerPage.setupAnimation$lambda$1((FullScreenBannerPage) obj4, (nsz) obj3, (gr4) obj2);
                return zy11Var;
            case 12:
                tryToSetImageBackground$lambda$0 = FullScreenBannerPage.tryToSetImageBackground$lambda$0((FullScreenBannerPage) obj4, (PromotionBackground) obj3, (Bitmap) obj2);
                return tryToSetImageBackground$lambda$0;
            case 13:
                tryToSetupAnimation$lambda$1 = FullScreenBannerPage.tryToSetupAnimation$lambda$1((FullScreenBannerPage) obj4, (nsz) obj3, (PromotionBackground) obj2);
                return tryToSetupAnimation$lambda$1;
            case 14:
                animateShow$lambda$0$0 = FullscreenDestinationSearchModalView.animateShow$lambda$0$0((AddressInputView) obj4, (FullscreenDestinationSearchModalView) obj3, (Runnable) obj2);
                return animateShow$lambda$0$0;
            case 15:
                dna dnaVar = (dna) obj3;
                yrs.l(false, dnaVar);
                ((yrs) obj4).m((kps0) obj2, dnaVar);
                return zy11Var2;
            case 16:
                return new Pair((Exception) obj4, b64.l("Section preparing failed: ", (String) obj3, Extension.FIX_SPACE, (String) obj2));
            case 17:
                return new Pair((Throwable) obj4, b64.l("Corrupted section received: ", (String) obj3, Extension.FIX_SPACE, (String) obj2));
            case 18:
                g9e0 g9e0Var = (g9e0) obj3;
                g9e0Var.c.setVisibility(8);
                g9e0Var.b.setVisibility(8);
                kt6.d0((kt6) obj4, g9e0Var.g, ((x7e0) obj2).b, null, 6);
                return zy11Var2;
            case 19:
                ((d) obj4).B.e((String) obj3, (String) obj2);
                return zy11Var2;
            case 20:
                onReceive$lambda$0 = InstallReferrerReceiver.onReceive$lambda$0((InstallReferrerReceiver) obj4, (Context) obj3, (Intent) obj2);
                return onReceive$lambda$0;
            case 21:
                IntercityDashboardPromoBannerContainerView.promoBannerAdapter$lambda$0((IntercityDashboardPromoBannerContainerView) ((xbw) obj4).O.b, (faw) obj3, (String) obj2);
                return zy11Var2;
            case 22:
                IntercityDashboardPromoBannerContainerView.promoBannerAdapter$lambda$0((IntercityDashboardPromoBannerContainerView) ((vhw) obj4).O.b, (faw) obj3, (String) obj2);
                return zy11Var2;
            case 23:
                ew2 ew2Var = (ew2) obj4;
                String str2 = (String) obj3;
                Throwable th = (Throwable) obj2;
                if (ew2Var.a) {
                    Log.e("InternalAnalytics", str2, th);
                }
                AppMetricaYandex.getReporter(((t720) ew2Var.b).a, "96bbbe34-a1bd-4b8a-8126-29879cd5d463").reportError(str2, th);
                return zy11Var2;
            case 24:
                y2r y2rVar = (y2r) obj2;
                ((f02) obj4).invoke();
                k0b k0bVar = ((zzw) obj3).g;
                String str3 = y2rVar.a;
                String str4 = y2rVar.b;
                tje.e();
                b00 b00Var = k0bVar.a;
                ((Handler) b00Var.a.get()).post(new tz(b00Var, k0bVar.b, str3, str4, 1));
                return zy11Var2;
            case 25:
                renderTip$lambda$12 = KycPhotoV2Fragment.renderTip$lambda$12((KycPhotoV2Fragment) obj4, (CharSequence) obj3, (pox) obj2);
                return renderTip$lambda$12;
            case 26:
                return new o890((bms) ((oz40) obj4).getValue(), (tls) ((oz40) obj3).getValue(), ((Number) ((sls) obj2).invoke()).intValue());
            case 27:
                androidx.compose.foundation.lazy.b bVar2 = (androidx.compose.foundation.lazy.b) obj3;
                m6y m6yVar = (m6y) ((qxi) obj4).getValue();
                return new o6y(bVar2, m6yVar, (u4y) obj2, new h((d6w) bVar2.e.e.getValue(), m6yVar));
            case 28:
                f fVar = (f) obj2;
                try {
                    ((LocationManager) obj4).unsubscribe((dl00) obj3);
                    failure = zy11Var2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    failure = new Result.Failure(e2);
                }
                Throwable a2 = Result.a(failure);
                if (a2 != null) {
                    fVar.d.getClass();
                    ccz.a(a2, "Unsubscribe error");
                }
                return zy11Var2;
            default:
                ((gwz) obj4).a.r(new qu(9));
                ((rwz) ((com.yandex.go.loyalty.impl.selector.domain.d) obj3).k.get()).b((String) obj2);
                return zy11Var2;
        }
    }
}
