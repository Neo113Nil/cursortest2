package defpackage;

import android.view.View;
import com.google.android.material.timepicker.i;
import com.yandex.go.preorder.suggested.menu.ui.SuggestMenuModalView;
import com.yandex.go.superapp.discovery.map.impl.ui.search.SuperAppDiscoveryMapSearchModalView;
import com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.SuperAppOrderBundleView;
import com.yandex.go.taxi.order.state.o;
import com.yandex.go.vault.ui.VaultStoreErrorView;
import com.yandex.messaging.internal.ThreadChat;
import com.yandex.messaging.internal.view.timeline.overlay.f;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import com.ybsdk.core.transfer.utils.UnconditionalWidget;
import com.ybsdk.feature.main.internal.screens.products.views.TsarButtonView;
import com.ybsdk.feature.stories.internal.screens.verticalstories.view.StoriesPageView;
import com.ybsdk.feature.transfer.internal.screens.result.presentation.TransferResultFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.TransferMe2MeConfirmPullFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.TransferReceiverNameFragment;
import com.ybsdk.screens.notice.presentation.TopupNoticeDeprecatedFragment;
import com.ybsdk.screens.upgrade.presentation.main.UpgradeFragment;
import ru.rt.ebs.cryptosdk.presentation.error.attemptsExceeded.VerificationAttemptsExceededFragment;
import ru.rt.ebs.cryptosdk.presentation.error.verification.VerificationErrorFragment;
import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;
import ru.yandex.taxi.order.state.transporting.TransportingStateView;
import ru.yandex.taxi.stories.presentation.story.StoryModalView;
import ru.yandex.taxi.tollroad.alert.item.TollRoadRideInfoView;

/* loaded from: classes14.dex */
public final /* synthetic */ class vmu0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vmu0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jcz0 jcz0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                StoriesPageView.lambda$7$lambda$6((StoriesPageView) obj, view);
                break;
            case 1:
                StoryModalView._init_$lambda$1((StoryModalView) obj, view);
                break;
            case 2:
                SuggestMenuModalView.setupState$lambda$0((a6v0) obj, view);
                break;
            case 3:
                SuperAppDiscoveryMapSearchModalView._init_$lambda$2((SuperAppDiscoveryMapSearchModalView) obj, view);
                break;
            case 4:
                ((r8c0) obj).invoke();
                break;
            case 5:
                ((SuperAppOrderBundleView) obj).onBackPressed();
                break;
            case 6:
                TaxiOnTheWayStateView.onAttachedToWindow$lambda$0((TaxiOnTheWayStateView) obj, view);
                break;
            case 7:
                ((o) obj).Pg(view);
                break;
            case 8:
                ((p4y0) obj).e.h();
                break;
            case 9:
                ((o4y0) obj).d.h();
                break;
            case 10:
                f fVar = (f) obj;
                ThreadChat threadChat = fVar.G;
                if (threadChat != null && (jcz0Var = fVar.E) != null) {
                    jcz0Var.m(threadChat.id(), fVar.L, fVar.M, fVar.N);
                    break;
                }
                break;
            case 11:
                ((i) obj).a(((Integer) view.getTag(leh0.selection_type)).intValue());
                break;
            case 12:
                TollRoadRideInfoView.onAttachedToWindow$lambda$0((TollRoadRideInfoView) obj, view);
                break;
            case 13:
                ((e350) obj).invoke(view);
                break;
            case 14:
                ((e350) obj).invoke(view);
                break;
            case 15:
                TopupNoticeDeprecatedFragment.getViewBinding$lambda$5$lambda$4$lambda$3((TopupNoticeDeprecatedFragment) obj, view);
                break;
            case 16:
                TransferMainFragment.getViewBinding$lambda$21$lambda$6((t961) obj, view);
                break;
            case 17:
                TransferMe2MeConfirmPullFragment.onViewCreated$lambda$5$lambda$2((TransferMe2MeConfirmPullFragment) obj, view);
                break;
            case 18:
                TransferReceiverNameFragment.getViewBinding$lambda$4$lambda$3((TransferReceiverNameFragment) obj, view);
                break;
            case 19:
                ((wq01) obj).invoke();
                break;
            case 20:
                ((r961) ((n70) obj).N).a.requestFocus();
                break;
            case 21:
                TransferResultFragment.onViewCreated$lambda$1((TransferResultFragment) obj, view);
                break;
            case 22:
                ((TransportCardsActivity) obj).finish();
                break;
            case 23:
                TransportingStateView._init_$lambda$0((TransportingStateView) obj, view);
                break;
            case 24:
                TsarButtonView.lambda$1$lambda$0((TsarButtonView) obj, view);
                break;
            case 25:
                UnconditionalWidget._init_$lambda$1((UnconditionalWidget) obj, view);
                break;
            case 26:
                UpgradeFragment.onViewCreated$lambda$5$lambda$4((UpgradeFragment) obj, view);
                break;
            case 27:
                VaultStoreErrorView.lambda$0$1((VaultStoreErrorView) obj, view);
                break;
            case 28:
                ((VerificationAttemptsExceededFragment) obj).setReturnEvent();
                break;
            default:
                ((VerificationErrorFragment) obj).setReturnEvent();
                break;
        }
    }
}
