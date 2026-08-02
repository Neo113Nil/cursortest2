package com.squareup.cash.blockers.views;

import android.os.Build;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1;
import androidx.tracing.Trace;
import androidx.viewbinding.ViewBindings;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.ui.Ui;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.datadog.android.rum.internal.utils.WriteOperation;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.blockers.viewmodels.RegisterErrorViewEvent$Confirm;
import com.squareup.cash.blockers.viewmodels.RemoteSkipErrorViewEvent$Confirm;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.viewmodels.SetPinMessageViewEvent$PositiveClick;
import com.squareup.cash.blockers.viewmodels.SsnViewModel;
import com.squareup.cash.blockers.viewmodels.SuccessMessageViewEvent$Close;
import com.squareup.cash.blockers.viewmodels.VerifyErrorViewEvent$Confirm;
import com.squareup.cash.blockers.web.delegates.WebViewBlockerBridge;
import com.squareup.cash.buynowpaylater.presenters.AfterPayOrderHubDataSource;
import com.squareup.cash.card.onboarding.CardModelView$lighting$$inlined$map$1;
import com.squareup.cash.card.onboarding.ImageCarouselSection;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationPresenter;
import com.squareup.cash.card.onboarding.PerspectiveView;
import com.squareup.cash.card.onboarding.StyledCardPerspectiveView;
import com.squareup.cash.card.onboarding.StyledCardView;
import com.squareup.cash.card.onboarding.core.ContouredTextMaterial;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.card.onboarding.graphics.ContouredTextRing;
import com.squareup.cash.card.onboarding.views.databinding.CardStylePerspectiveViewBinding;
import com.squareup.cash.card.spendinginsights.screens.CardActivityListScreen;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightsHomeViewModel;
import com.squareup.cash.cashapplite.screens.LiteActivityScreen;
import com.squareup.cash.cashapplite.viewmodels.ActivityAppletTileViewModel;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.routers.earningsTracker.EarningsTrackerRouter;
import com.squareup.cash.clientrouting.routers.savings.SavingsRouter;
import com.squareup.cash.clientsync.persistence.BootstrappedSyncRangeStore;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import com.squareup.cash.core.navigationcontainer.AcceptableScrim;
import com.squareup.cash.core.navigationcontainer.UiContainer;
import com.squareup.cash.crypto.backend.eligibility.RealBitcoinEligibilityRepo;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.cashapproxy.api.CashApProxyClientService;
import com.squareup.protos.franklin.api.PaymentDeviceCustomizationBlockerConfig;
import com.squareup.protos.franklin.common.SyncValueType;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class SsnViewKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        CardStylePerspectiveViewBinding cardStylePerspectiveViewBinding;
        int i = this.$r8$classId;
        ActivityEmbeddedViewEvent.ShowMoreClicked showMoreClicked = ActivityEmbeddedViewEvent.ShowMoreClicked.INSTANCE;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                String str2 = ((SsnViewModel) obj).ssn;
                str = str2 != null ? str2 : "";
                int length = str.length();
                return Updater.mutableStateOf$default(new TextFieldValue(str, SizeKt.TextRange(length, length), 4));
            case 1:
                Ui.EventReceiver eventReceiver = ((RegisterErrorView) obj).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(RegisterErrorViewEvent$Confirm.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 2:
                Ui.EventReceiver eventReceiver2 = ((RemoteSkipErrorDialog) obj).eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(RemoteSkipErrorViewEvent$Confirm.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 3:
                String str3 = ((SetNameViewModel) obj).nameInputProperties.prefill;
                str = str3 != null ? str3 : "";
                int length2 = str.length();
                return Updater.mutableStateOf$default(new TextFieldValue(str, SizeKt.TextRange(length2, length2), 4));
            case 4:
                Ui.EventReceiver eventReceiver3 = ((SetPinMessageView) obj).eventReceiver;
                if (eventReceiver3 != null) {
                    eventReceiver3.sendEvent(SetPinMessageViewEvent$PositiveClick.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 5:
                Ui.EventReceiver eventReceiver4 = ((SuccessMessageView) obj).eventReceiver;
                if (eventReceiver4 != null) {
                    eventReceiver4.sendEvent(SuccessMessageViewEvent$Close.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 6:
                Ui.EventReceiver eventReceiver5 = ((VerifyErrorView) obj).eventReceiver;
                if (eventReceiver5 != null) {
                    eventReceiver5.sendEvent(VerifyErrorViewEvent$Confirm.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 7:
                ((WebViewBlockerBridge) obj).webView.reload();
                return Unit.INSTANCE;
            case 8:
                LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = ((LazyPagingItems) obj).pagingDataPresenter;
                lazyPagingItems$pagingDataPresenter$1.getClass();
                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                    Log.d("Paging", "Retry signal received", null);
                }
                lazyPagingItems$pagingDataPresenter$1.uiReceiver.retry();
                return Unit.INSTANCE;
            case 9:
                n nVar = (n) obj;
                return new AfterPayOrderHubDataSource((CashApProxyClientService) nVar.a, (BufferedChannel) nVar.c, (AndroidStringManager) nVar.b);
            case 10:
                return Float.valueOf(((Ref$FloatRef) obj).element);
            case 11:
                ((PatternStampState) obj).undo();
                return Unit.INSTANCE;
            case 12:
                PaymentDeviceCustomizationBlockerConfig paymentDeviceCustomizationBlockerConfig = ((PaymentDeviceCustomizationPresenter) obj).args.blocker.blocker_config;
                return Updater.mutableStateOf$default(paymentDeviceCustomizationBlockerConfig != null ? paymentDeviceCustomizationBlockerConfig.pre_selected_payment_device_id : null);
            case 13:
                StyledCardPerspectiveView styledCardPerspectiveView = (StyledCardPerspectiveView) obj;
                int i2 = StyledCardPerspectiveView.$r8$clinit;
                int i3 = R.id.bottom_card;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(styledCardPerspectiveView, R.id.bottom_card);
                if (imageView != null) {
                    i3 = R.id.card_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(styledCardPerspectiveView, R.id.card_container);
                    if (frameLayout != null) {
                        i3 = R.id.nfc_view;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(styledCardPerspectiveView, R.id.nfc_view);
                        if (imageView2 != null) {
                            i3 = R.id.perspective_view;
                            PerspectiveView perspectiveView = (PerspectiveView) ViewBindings.findChildViewById(styledCardPerspectiveView, R.id.perspective_view);
                            if (perspectiveView != null) {
                                i3 = R.id.styled_card_view;
                                StyledCardView styledCardView = (StyledCardView) ViewBindings.findChildViewById(styledCardPerspectiveView, R.id.styled_card_view);
                                if (styledCardView != null) {
                                    cardStylePerspectiveViewBinding = new CardStylePerspectiveViewBinding(styledCardPerspectiveView, imageView, frameLayout, imageView2, perspectiveView, styledCardView);
                                    return cardStylePerspectiveViewBinding;
                                }
                            }
                        }
                    }
                }
                cardStylePerspectiveViewBinding = null;
                a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(styledCardPerspectiveView.getResources().getResourceName(i3)));
                return cardStylePerspectiveViewBinding;
            case 14:
                return Float.valueOf(((ContouredTextMaterial) ((WriteOperation) obj).onSuccess).textureOffset);
            case 15:
                CardWobbleState cardWobbleState = (CardWobbleState) obj;
                return new Pair(cardWobbleState.wobbleRotation(), cardWobbleState.wobbleTranslation());
            case 16:
                return Float.valueOf(((ContouredTextRing) obj).material.textureOffset);
            case 17:
                return Integer.valueOf(((ImageCarouselSection) obj).images.size());
            case 18:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj;
                cardLockPresenter.navigator.goTo(new CardActivityListScreen(((AndroidStringManager) cardLockPresenter.stringManager).get(R.string.spending_insights_activity_list_title)));
                return Unit.INSTANCE;
            case 19:
                ((SpendingInsightsHomeViewModel.Content.ActivitySection) obj).embedded.onEvent.invoke(showMoreClicked);
                return Unit.INSTANCE;
            case 20:
                ((Navigator) ((EndAppLockPresenter) obj).appLockState).goTo(LiteActivityScreen.INSTANCE);
                return Unit.INSTANCE;
            case 21:
                UiCallbackModel activityModel = ((ActivityAppletTileViewModel) obj).getActivityModel();
                if (activityModel != null) {
                    activityModel.onEvent.invoke(showMoreClicked);
                }
                return Unit.INSTANCE;
            case 22:
                return ((EarningsTrackerRouter) obj).p2pSettingsManager.select();
            case 23:
                return new ChatKickoffParams(((ClientRoute.ViewMoneybotResumeChat) obj).sessionId, null, 11);
            case 24:
                SavingsRouter savingsRouter = (SavingsRouter) obj;
                return savingsRouter.routerFactory.create$1(savingsRouter.navigator);
            case 25:
                return ((BootstrappedSyncRangeStore) obj).destinationStore.getAllRanges();
            case 26:
                return new CollapsingToolbarScaffoldState((CollapsingToolbarState) obj, 0);
            case 27:
                StateFlowImpl stateFlowImpl = ((AcceptableScrim) obj).managedBounceAtBottom;
                Boolean bool = Boolean.TRUE;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, bool);
                return Unit.INSTANCE;
            case 28:
                return Integer.valueOf(((UiContainer) obj).getHeight());
            default:
                RealBitcoinEligibilityRepo realBitcoinEligibilityRepo = (RealBitcoinEligibilityRepo) obj;
                int i4 = 12;
                return Trace.selectClientSyncValues(realBitcoinEligibilityRepo.featureFlagManager, SyncValueType.CRYPTOCURRENCY_PROFILE, new RealDisclosureProvider$special$$inlined$map$1(realBitcoinEligibilityRepo.profileManager.balanceData(), 2), new CardModelView$lighting$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(realBitcoinEligibilityRepo.syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.CryptocurrencyProfile, null, new FlowStarter$$ExternalSyntheticLambda0(i4)), 24), i4));
        }
    }
}
