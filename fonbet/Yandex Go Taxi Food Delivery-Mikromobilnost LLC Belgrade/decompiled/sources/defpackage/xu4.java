package defpackage;

import com.ybsdk.feature.banners.impl.data.a;
import com.ybsdk.feature.banners.impl.domain.interactors.b;
import com.ybsdk.feature.persistence.api.StorageType;

/* loaded from: classes12.dex */
public final class xu4 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ xu4(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new a((com.ybsdk.feature.banners.api.interactors.a) ((gwf) xvf0Var).get());
            case 1:
                return (b) ((tu4) ((eu0) xvf0Var).get()).a.get();
            case 2:
                return new v4f0(((c1b0) ((uu4) ((gwf) xvf0Var).get()).a).a(StorageType.PRIZES));
            case 3:
                return new kg5("FTAuthorizeAction", (q5p) ((c7n) xvf0Var).get(), p5p.Companion.serializer());
            case 4:
                return new kg5("CanMakeExternalRedirectAction", (md6) ((mu7) xvf0Var).get(), lu7.Companion.serializer());
            case 5:
                return new kg5("CustomHideOverlayAction", (gyc) ((p6f) xvf0Var).get(), tjf.Companion.serializer());
            case 6:
                return new kg5("DeviceChallengePubkeyAction", (wwf) ((pgi) xvf0Var).get(), kaj.Companion.serializer());
            case 7:
                return new kg5("DeviceChallengeSignatureAction", (apf) ((bpf) xvf0Var).get(), naj.Companion.serializer());
            case 8:
                return new kg5("ExecuteFlexActionOnScreenAction", (gym) ((c7n) xvf0Var).get(), lko.Companion.serializer());
            case 9:
                return new kg5("ExecuteOnWidgetDivAction", (pko) ((c7n) xvf0Var).get(), oko.Companion.serializer());
            case 10:
                return new kg5("FTRequestAction", (com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.a) ((qrb) xvf0Var).get(), j6p.Companion.serializer());
            case 11:
                return new kg5("FinishFlowAction", (zrm) ((c4p) xvf0Var).get(), aar.Companion.serializer());
            case 12:
                return new kg5("FintechRemoteAction", (com.yandex.fintechsdk.features.bdui.internal.presentation.action.fintechremote.a) ((wrh) xvf0Var).get(), nbr.Companion.serializer());
            case 13:
                return new kg5("GetViewCoordinatesAction", (agt) ((xat) xvf0Var).get(), zft.Companion.serializer());
            case 14:
                return new kg5("GooglePayAction", (zrm) ((rut) xvf0Var).get(), qut.Companion.serializer());
            case 15:
                return new kg5("HideCutoutAction", (q5p) ((xat) xvf0Var).get(), zhu.Companion.serializer());
            case 16:
                return new kg5("ObtainAuthAction", (com.yandex.fintechsdk.features.bdui.internal.presentation.action.obtainauth.a) ((fy30) xvf0Var).get(), hr60.Companion.serializer());
            case 17:
                return new kg5("OpenBrowserAction", (z370) ((wvq) xvf0Var).get(), y370.Companion.serializer());
            case 18:
                return new kg5("OpenDeeplinkAction", (ht10) ((ys10) xvf0Var).get(), s470.Companion.serializer());
            case 19:
                return new kg5("OpenPayCardAction", (com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.open.a) ((e840) xvf0Var).get(), c770.Companion.serializer());
            case 20:
                return new kg5("OpenPlusAction", (com.yandex.fintechsdk.features.bdui.internal.presentation.action.plus.a) ((e840) xvf0Var).get(), q770.Companion.serializer());
            case 21:
                return new kg5("PollPayCardAction", (com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.poll.a) ((ge50) xvf0Var).get(), uxd0.Companion.serializer());
            case 22:
                return new kg5("PopToRootAction", (agt) ((vqa0) xvf0Var).get(), t6e0.Companion.serializer());
            case 23:
                return new kg5("ProtectScreenRecordingAction", (q6c0) ((jde0) xvf0Var).get(), ztf0.Companion.serializer());
            case 24:
                return new kg5("ReloadWidgetAction", (pko) ((zni0) xvf0Var).get(), oti0.Companion.serializer());
            case 25:
                return new kg5("SendAnalyticsEventAction", (pgk0) ((gaq0) xvf0Var).get(), boq0.Companion.serializer());
            case 26:
                return new kg5("SendExternalEventAction", (pko) ((m7q0) xvf0Var).get(), voq0.Companion.serializer());
            case 27:
                return new kg5("SendNativePayloadAction", (q5p) ((m7q0) xvf0Var).get(), dpq0.Companion.serializer());
            case 28:
                return new kg5("SendTransportBannerReloadAction", (ndl0) ((gaq0) xvf0Var).get(), aqq0.Companion.serializer());
            default:
                return new kg5("SendTransportBannerSaveToLocalAction", (qgn0) ((m7q0) xvf0Var).get(), dqq0.Companion.serializer());
        }
    }
}
