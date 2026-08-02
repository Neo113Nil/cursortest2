package defpackage;

import android.app.Activity;
import com.yandex.go.address.address_map_picker.analytics.ClarifyAnalytics$ClarifyCloseReason;
import com.yandex.go.quark.ai_assistant.impl.ui.AiAssistantModalView;
import com.yandex.go.taxi.order.rate.RateView;
import com.yandex.go.taxi.order.rate.c;
import com.yandex.mobile.drive.sdk.DriveSdkView;
import io.flutter.embedding.android.FlutterEmbedViewDelegate;
import io.flutter.embedding.android.FlutterFragment;
import java.util.HashMap;
import ru.rt.ebs.cryptosdk.presentation.base.EbsSdkBaseFragment;
import ru.rt.ebs.cryptosdk.presentation.error.accessDenied.AccessDeniedFragment;
import ru.rt.ebs.cryptosdk.presentation.error.attemptsExceeded.VerificationAttemptsExceededFragment;
import ru.rt.ebs.cryptosdk.presentation.error.noInternetConnection.NoInternetConnectionFragment;
import ru.rt.ebs.cryptosdk.presentation.error.verification.VerificationErrorFragment;
import ru.yandex.taxi.contacts.SelectContactView;
import ru.yandex.taxi.contacts.d;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;
import ru.yandex.taxi.sdc.router.b;
import ru.yandex.taxi.web.view.WebViewContainerImpl;
import ru.yandex.taxi.widget.dialog.BaseDialog;

/* loaded from: classes5.dex */
public final class qc extends mx60 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc(int i, Object obj) {
        super(true);
        this.d = i;
        this.e = obj;
    }

    private final void i() {
    }

    private final void j(je4 je4Var) {
    }

    private final void k(je4 je4Var) {
    }

    @Override // defpackage.mx60
    public void c() {
        int i = this.d;
    }

    /* JADX WARN: Type inference failed for: r5v19, types: [vc5] */
    @Override // defpackage.mx60
    public final void d() {
        Exception argumentNoInternetConnectionError;
        d dVar;
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((b) obj).J.finish();
                break;
            case 1:
                ((AccessDeniedFragment) obj).setReturnEvent();
                break;
            case 2:
                e21 e21Var = (e21) obj;
                e21Var.J.b(ClarifyAnalytics$ClarifyCloseReason.Back);
                if (e21Var.H.a() != null && (!r5.equals(f11.a))) {
                    e21Var.M.b();
                }
                e21Var.r(new qu(9));
                break;
            case 3:
                AiAssistantModalView aiAssistantModalView = (AiAssistantModalView) obj;
                aiAssistantModalView.setEnabled(false);
                aiAssistantModalView.onBackPressed();
                aiAssistantModalView.setEnabled(true);
                break;
            case 4:
                ((sfd) obj).c.invoke();
                break;
            case 5:
                ((BaseDialog) obj).onBackPressed();
                break;
            case 6:
                jst.e.n("BeginnersFinalLoadingRouter.onBackPressedCallback: activity.finish()");
                ((Activity) ((kk5) obj).H).finish();
                break;
            case 7:
                jst.e.n("BeginnersOnboardingRouterImpl.onBackPressedCallback: activity.finish()");
                ((Activity) ((fl5) obj).I).finish();
                break;
            case 8:
                jst.e.n("BlockedUserRouterImpl.onBackPressedCallback: activity.finish()");
                ((i46) obj).D.finish();
                break;
            case 9:
                FlutterEmbedViewDelegate delegate = ((DriveSdkView) obj).getDelegate();
                if (delegate != null) {
                    FlutterEmbedViewDelegate flutterEmbedViewDelegate = delegate.isAttached() ? delegate : null;
                    if (flutterEmbedViewDelegate != null) {
                        flutterEmbedViewDelegate.onBackPressed();
                        break;
                    }
                }
                break;
            case 10:
                ((EbsSdkBaseFragment) obj).getViewModel().f0(new t5s0(null));
                break;
            case 11:
                ((FlutterFragment) obj).onBackPressed();
                break;
            case 12:
                jst.e.n("LocationWithAgreementRouterImpl.onBackPressedCallback: activity.finish()");
                ((Activity) ((y4c0) obj).E).finish();
                break;
            case 13:
                androidx.view.d dVar2 = (androidx.view.d) obj;
                x43 x43Var = dVar2.g;
                if (!x43Var.isEmpty()) {
                    androidx.view.b bVar = (androidx.view.b) x43Var.h();
                    if (dVar2.m((bVar != null ? bVar.b : null).A, true, false)) {
                        dVar2.b();
                        break;
                    }
                }
                break;
            case 14:
                NoInternetConnectionFragment noInternetConnectionFragment = (NoInternetConnectionFragment) obj;
                dc60 access$getViewModel = NoInternetConnectionFragment.access$getViewModel(noInternetConnectionFragment);
                argumentNoInternetConnectionError = noInternetConnectionFragment.getArgumentNoInternetConnectionError();
                access$getViewModel.f0(new t5s0(argumentNoInternetConnectionError));
                break;
            case 15:
                ((tls) obj).invoke(this);
                break;
            case 16:
                ((Activity) ((fl5) obj).I).finish();
                break;
            case 17:
                c presenter = ((RateView) obj).getPresenter();
                ci70 ci70Var = presenter.z;
                o2y0 o2y0Var = presenter.x;
                String str = o2y0Var.b().a;
                x4e.B(ci70Var.n.a, "Complete.DidTapBackButton", new HashMap(), 1);
                presenter.B.a(o2y0Var.b().a);
                presenter.Lg();
                break;
            case 18:
                ((com.yandex.mobile.drive.scan.ui.b) obj).j();
                break;
            case 19:
                dVar = ((SelectContactView) obj).presenter;
                if (!dVar.L) {
                    dVar.D.onBackPressed();
                    break;
                }
                break;
            case 20:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 21:
                ((VerificationAttemptsExceededFragment) obj).setReturnEvent();
                break;
            case 22:
                ((VerificationErrorFragment) obj).setReturnEvent();
                break;
            case 23:
                com.yandex.go.taxi.summary.router.b bVar2 = (com.yandex.go.taxi.summary.router.b) obj;
                SolidSummaryView solidSummaryView = bVar2.L;
                if (solidSummaryView == null || !solidSummaryView.onBackPressed()) {
                    h(false);
                    bVar2.G.c();
                    h(true);
                    break;
                }
                break;
            default:
                ((WebViewContainerImpl) obj).goBack();
                break;
        }
    }

    @Override // defpackage.mx60
    public void e(je4 je4Var) {
        int i = this.d;
    }

    @Override // defpackage.mx60
    public void f(je4 je4Var) {
        int i = this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc(int i, Object obj, boolean z) {
        super(false);
        this.d = i;
        this.e = obj;
    }
}
