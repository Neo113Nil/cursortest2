package app.cash.badging.backend;

import androidx.compose.material3.ThumbNode$onAttach$1;
import app.cash.local.presenters.home.LocalHomeGeoPresenter;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.account.presenters.ProfileUpsellPresenter;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$2$2;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager;
import com.squareup.cash.activity.backend.loader.RealSingleActivityManager;
import com.squareup.cash.activity.backend.offline.RealOfflineActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityInviteItemPresenter;
import com.squareup.cash.activity.views.ActivityTabViewKt$ActivityTab$5$1$3;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2;
import com.squareup.cash.afterpayapplet.presenters.FilteredActivitiesManager;
import com.squareup.cash.appmessages.holders.PendingInlineMessageHolder;
import com.squareup.cash.appmessages.holders.PendingPopupMessageHolder$CardTabPlacementHolder;
import com.squareup.cash.appmessages.presenters.CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2;
import com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2;
import com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$2$2;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.bitcoin.presenters.applet.allowlist.CashAppLiteBitcoinWidgetAllowlistProvider;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferTitleSubtitleProvider;
import com.squareup.cash.blockers.views.PasscodeViewKt$Passcode$3$1$1$1$2;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.profile.presenters.ProfilePresenter$models$lambda$8$$inlined$map$1$2;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.work.presenters.WorkReviewTermsBanner$configFlow$$inlined$map$1;
import com.squareup.cash.work.views.ScheduleCalendarKt$ScheduleCalendar$2$3$1$invokeSuspend$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.DistinctFlowImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes3.dex */
public final class RealBadger2$scheduleBadgeClearingWork$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(Flow flow, Object obj, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.this$0 = obj;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 3;
        int i3 = 11;
        int i4 = 15;
        int i5 = 12;
        int i6 = 1;
        int i7 = 2;
        int i8 = 0;
        Object obj = this.this$0;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new ThumbNode$onAttach$1.AnonymousClass1(i5, flowCollector, (RealBadger2) obj), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = flow.collect(new ThumbNode$onAttach$1.AnonymousClass1(i3, flowCollector, (TaxWebAppBridge.AnonymousClass4) obj), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = ((RealLocalInstalledStore$hideBrands$$inlined$map$1) flow).collect(new ThumbNode$onAttach$1.AnonymousClass1(i4, flowCollector, (LocalHomeGeoPresenter) obj), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = ((SafeFlow) flow).collect(new ThumbNode$onAttach$1.AnonymousClass1(19, flowCollector, (LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry) obj), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) flow).collect(new ThumbNode$onAttach$1.AnonymousClass1(21, flowCollector, (ProfileUpsellPresenter) obj), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = ((FinishSetupTileBadgeCounter) flow).collect(new AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$2$2(i6, (AccountDocumentsPresenter) obj, flowCollector), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = flow.collect(new AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$2$2(i7, (AccountDocumentsPresenter) obj, flowCollector), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = ((ScheduleCalendarKt$ScheduleCalendar$2$3$1$invokeSuspend$$inlined$map$1) flow).collect(new ProfilePresenter$models$lambda$8$$inlined$map$1$2(flowCollector, (String) obj, i7), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = ((RealLocalInstalledStore$hideBrands$$inlined$map$1) flow).collect(new AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$2$2(i2, (AccountDocumentsPresenter) obj, flowCollector), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = ((RealBadger2$scheduleBadgeClearingWork$$inlined$map$1) flow).collect(new ProfilePresenter$models$lambda$8$$inlined$map$1$2(flowCollector, (String) obj, i2), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = ((RealLocalInstalledStore$hideBrands$$inlined$map$1) flow).collect(new AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$2$2(i8, (AccountDocumentsPresenter) obj, flowCollector), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = ((RealLocalInstalledStore$hideBrands$$inlined$map$1) flow).collect(new ThumbNode$onAttach$1.AnonymousClass1(24, flowCollector, (RealProfilePhotoManager) obj), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = ((CallbackFlowBuilder) flow).collect(new ThumbNode$onAttach$1.AnonymousClass1(26, flowCollector, (RealSingleActivityManager) obj), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect14 = flow.collect(new ThumbNode$onAttach$1.AnonymousClass1(27, flowCollector, (RealOfflineActivitiesManager) obj), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect15 = ((FinishSetupTileBadgeCounter) flow).collect(new ThumbNode$onAttach$1.AnonymousClass1(28, flowCollector, (ActivityInviteItemPresenter) obj), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect16 = ((DistinctFlowImpl) flow).collect(new RealAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2(flowCollector, (RealAfterpayAppletRepository) obj, i8), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect17 = flow.collect(new ActivityTabViewKt$ActivityTab$5$1$3(i3, flowCollector, (FilteredActivitiesManager) obj), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect18 = flow.collect(new ActivityTabViewKt$ActivityTab$5$1$3(13, flowCollector, (WorkReviewTermsBanner$configFlow$$inlined$map$1) obj), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object collect19 = flow.collect(new ActivityTabViewKt$ActivityTab$5$1$3(14, flowCollector, (PendingInlineMessageHolder) obj), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect20 = flow.collect(new ActivityTabViewKt$ActivityTab$5$1$3(i4, flowCollector, (WorkReviewTermsBanner$configFlow$$inlined$map$1) obj), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object collect21 = flow.collect(new ActivityTabViewKt$ActivityTab$5$1$3(16, flowCollector, (PendingPopupMessageHolder$CardTabPlacementHolder) obj), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object collect22 = flow.collect(new CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2(flowCollector, (CardStudioPresenter) obj, 1), continuation);
                if (collect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object collect23 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) flow).collect(new CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2(flowCollector, (CardStudioPresenter) obj, 2), continuation);
                if (collect23 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object collect24 = ((RealBadger2$scheduleBadgeClearingWork$$inlined$map$1) flow).collect(new CardAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2(flowCollector, (CardStudioPresenter) obj, 0), continuation);
                if (collect24 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object collect25 = ((FlowKt__LimitKt$drop$$inlined$unsafeFlow$1) flow).collect(new InlineAppMessagePresenterHelper$models$lambda$1$$inlined$map$2$2(flowCollector, (DisclosurePresenter) obj, 0), continuation);
                if (collect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object collect26 = flow.collect(new InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$2$2(flowCollector, (DisclosurePresenter) obj, 1), continuation);
                if (collect26 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object collect27 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) flow).collect(new InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$2$2(flowCollector, (DisclosurePresenter) obj, 2), continuation);
                if (collect27 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object collect28 = ((RealBadger2$scheduleBadgeClearingWork$$inlined$map$1) flow).collect(new InlineAppMessageV2PresenterHelper$models$lambda$1$$inlined$map$2$2(flowCollector, (DisclosurePresenter) obj, 0), continuation);
                if (collect28 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object collect29 = ((RealAppConfigManager$cashLiteConfig$$inlined$map$1) flow).collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, (CashAppLiteBitcoinWidgetAllowlistProvider) obj), continuation);
                if (collect29 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect30 = ((AppLockMonitor$special$$inlined$map$2) flow).collect(new PasscodeViewKt$Passcode$3$1$1$1$2(i5, flowCollector, (BitcoinTransferTitleSubtitleProvider) obj), continuation);
                if (collect30 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
