package com.squareup.cash.nearby.views;

import android.content.Context;
import androidx.biometric.CryptoObjectUtils;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.draw.ShadowKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.sqldelight.db.QueryResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import com.fillr.browsersdk.model.FillrWidget;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.activity.analytics.ActivityCdfMappingsKt;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.PaymentOrientation;
import com.squareup.cash.cdf.PaymentRole;
import com.squareup.cash.cdf.activityrecord.ActivityRecordViewOpen;
import com.squareup.cash.cdf.asset.AssetSendPersonalizationTooltipShown;
import com.squareup.cash.cdf.asset.AssetSendPersonalizationTransformed;
import com.squareup.cash.cdf.asset.EntryPoint;
import com.squareup.cash.cdf.asset.PersonalizationSparkleReason;
import com.squareup.cash.cdf.browser.BrowserCheckoutFormFieldFocused;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.cdf.moneybot.MoneybotTemplateCardResolved;
import com.squareup.cash.cdf.offers.SheetDismissOrigin;
import com.squareup.cash.cdf.trusteddevice.TrustedDeviceViewAll;
import com.squareup.cash.checks.CaptureCheckFacePresenter;
import com.squareup.cash.checks.CaptureCheckFacePresenter$models$2$1$1;
import com.squareup.cash.common.composeui.IconAnimationViewKt$IconAnimationView$1$1;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.backend.api.barcode.BarcodeInfo;
import com.squareup.cash.deposits.physical.backend.real.barcode.RealCashDepositBarcodeManager;
import com.squareup.cash.deposits.physical.presenter.map.PaperMoneyDepositMapPresenter;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositMapScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositMerchantDetailsScreen;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapSectionViewModel$MapDataViewModel;
import com.squareup.cash.family.familyhub.presenters.DependentTeenQrCodeShareSheetPresenter$SharingState;
import com.squareup.cash.family.familyhub.presenters.ManagedAccountTransferPresenter;
import com.squareup.cash.family.familyhub.screens.ManagedAccountTransferScreen;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.history.payments.presenters.ProfileActivityItemEventDecorator;
import com.squareup.cash.instruments.presenters.ResolvedTransferOption;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.data.FilterGroup;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.components.custom.order.DragWidgetState;
import com.squareup.cash.investing.components.custom.order.GraphState;
import com.squareup.cash.investing.components.custom.order.PriceWidgetState;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderContentModel;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderViewEvent;
import com.squareup.cash.maps.viewmodels.LocationSelection;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TemplateCard;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue;
import com.squareup.cash.moneybot.presenters.plugins.TemplateCardPresenter;
import com.squareup.cash.moneybot.presenters.plugins.TemplateCardPresenterKt;
import com.squareup.cash.mosaic.resources.api.v2.Music;
import com.squareup.cash.multiplatform.investing.PriceValue;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.backend.api.OffersSpanAction;
import com.squareup.cash.offers.backend.real.RealOffersSpanManager;
import com.squareup.cash.offers.presenters.OfferDetailsSheetMapperKt;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModel$Error;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModel$OffersTimelineSheet;
import com.squareup.cash.offers.viewmodels.viewevents.OffersTimelineViewEvent;
import com.squareup.cash.paymentpad.presenters.MainPaymentPadPresenter;
import com.squareup.cash.paymentpad.viewmodels.HypeConfig;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.presenters.PaymentClaimPresenter;
import com.squareup.cash.payments.presenters.PersonalizationDraft;
import com.squareup.cash.payments.presenters.PersonalizePaymentManager$PaymentFlow;
import com.squareup.cash.payments.presenters.PersonalizePaymentPresenter;
import com.squareup.cash.payments.presenters.PersonalizePaymentRecipientPresenter;
import com.squareup.cash.payments.presenters.QuickPayPresenter;
import com.squareup.cash.payments.presenters.QuickPayState;
import com.squareup.cash.payments.presenters.RealPersonalizePaymentManager;
import com.squareup.cash.payments.presenters.UtilsKt;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.Background;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentEntrypointButtonViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizedPaymentLoadingState;
import com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState;
import com.squareup.cash.payments.viewmodels.ScheduleCalendarDate;
import com.squareup.cash.payments.viewmodels.SelectedTrack;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.pools.presenters.PoolMemberListPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$1;
import com.squareup.cash.pools.viewmodels.MemberStatusUpdateSnackBarViewModel;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerAnalytics;
import com.squareup.cash.profile.devicemanager.presenters.DataLoadingState;
import com.squareup.cash.profile.views.OpenSourceKt$OpenSource$1$1$2;
import com.squareup.cash.reactions.api.ReactionsData;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.screens.Back;
import com.squareup.cash.sharesheet.ShareSheetViewModel;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetResponse;
import com.squareup.protos.cash.cashsuggest.api.SheetType;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.marketprices.service.GetInvestmentEntityHistoricalDataResponse;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsResponse;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.DismissTapAction;
import com.squareup.protos.cash.shop.rendering.api.OfferSheet;
import com.squareup.protos.cash.shop.rendering.api.OfferSheet$Sheet$TimelineSheet;
import com.squareup.protos.cash.shop.rendering.api.OfferTimelineSheet;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$DismissAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.app.GetHistoricalExchangeDataResponse;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.protos.franklin.ui.PaymentState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class DotGridKt$DotGrid$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $activePhase$delegate;
    public final /* synthetic */ Object $btPulseElapsed$delegate;
    public final /* synthetic */ Object $errorPulseElapsed$delegate;
    public /* synthetic */ Object $postFormationPhase;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotGridKt$DotGrid$3$1(MutableState mutableState, PaperMoneyDepositMapPresenter paperMoneyDepositMapPresenter, MutableState mutableState2, State state, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 5;
        this.$activePhase$delegate = mutableState;
        this.$postFormationPhase = paperMoneyDepositMapPresenter;
        this.$btPulseElapsed$delegate = mutableState2;
        this.$errorPulseElapsed$delegate = state;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$payments$presenters$QuickPayPresenter$models$4$1(Object obj) {
        boolean z;
        boolean z2;
        Boolean bool;
        MutableState mutableState = (MutableState) this.$btPulseElapsed$delegate;
        MutableState mutableState2 = (MutableState) this.$errorPulseElapsed$delegate;
        QuickPayPresenter quickPayPresenter = (QuickPayPresenter) this.$postFormationPhase;
        PaymentScreens.QuickPay quickPay = quickPayPresenter.args;
        Analytics analytics = quickPayPresenter.analytics;
        RealPersonalizePaymentManager realPersonalizePaymentManager = quickPayPresenter.personalizePaymentManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        MutableState mutableState3 = (MutableState) this.$activePhase$delegate;
        List list = ((QuickPayState) mutableState3.getValue()).paymentGetters;
        Long l = ((QuickPayState) mutableState3.getValue()).amount.amount;
        boolean isPersonalizedPaymentButtonEnabled = UtilsKt.isPersonalizedPaymentButtonEnabled(((double) (l != null ? l.longValue() : 0L)) >= Moneys.displayDivisor(((QuickPayState) mutableState3.getValue()).amount.currency_code), ((QuickPayState) mutableState3.getValue()).orientation == Orientation.CASH, quickPayPresenter.networkInfo.isNetworkAvailable(), list, ((QuickPayState) mutableState3.getValue()).region);
        if (!((QuickPayState) mutableState3.getValue()).paymentGetters.isEmpty() && isPersonalizedPaymentButtonEnabled) {
            PersonalizePaymentManager$PaymentFlow personalizePaymentManager$PaymentFlow = PersonalizePaymentManager$PaymentFlow.QUICK_PAY;
            String str = ((QuickPayState) mutableState3.getValue()).note;
            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            str.getClass();
            if ((realPersonalizePaymentManager.getAnimationCounter(personalizePaymentManager$PaymentFlow) < 3 && !booleanValue) || str.length() > 0) {
                z = true;
                PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel = (PersonalizePaymentEntrypointButtonViewModel) mutableState2.getValue();
                boolean isEmpty = ((QuickPayState) mutableState3.getValue()).paymentGetters.isEmpty();
                if (!((QuickPayState) mutableState3.getValue()).paymentGetters.isEmpty() && isPersonalizedPaymentButtonEnabled) {
                    PersonalizePaymentManager$PaymentFlow personalizePaymentManager$PaymentFlow2 = PersonalizePaymentManager$PaymentFlow.QUICK_PAY;
                    bool = (Boolean) ((Map) realPersonalizePaymentManager.showTooltip.blockingGet()).get("QUICK_PAY");
                    if (bool == null ? bool.booleanValue() : true) {
                        z2 = true;
                        mutableState2.setValue(personalizePaymentEntrypointButtonViewModel.updateState(isEmpty, isPersonalizedPaymentButtonEnabled, z2, z));
                        if (((PersonalizePaymentEntrypointButtonViewModel) mutableState2.getValue()).showTooltip) {
                            realPersonalizePaymentManager.markPersonalizePaymentTooltipAsSeen(PersonalizePaymentManager$PaymentFlow.QUICK_PAY);
                            analytics.track(new AssetSendPersonalizationTooltipShown(quickPay.analytics.externalPaymentId.toString(), EntryPoint.PERSON_FIRST, quickPayPresenter.personalizedPaymentFlowToken), null);
                        }
                        if (((PersonalizePaymentEntrypointButtonViewModel) mutableState2.getValue()).animate) {
                            PersonalizePaymentManager$PaymentFlow personalizePaymentManager$PaymentFlow3 = PersonalizePaymentManager$PaymentFlow.QUICK_PAY;
                            realPersonalizePaymentManager.updatePersonalizePaymentButtonAnimationTracker(personalizePaymentManager$PaymentFlow3);
                            mutableState.setValue(Boolean.TRUE);
                            boolean z3 = !((QuickPayState) mutableState3.getValue()).paymentGetters.isEmpty();
                            Long l2 = ((QuickPayState) mutableState3.getValue()).amount.amount;
                            boolean z4 = ((double) (l2 != null ? l2.longValue() : 0L)) >= Moneys.displayDivisor(((QuickPayState) mutableState3.getValue()).amount.currency_code);
                            String str2 = quickPayPresenter.personalizedPaymentFlowToken;
                            int animationCounter = realPersonalizePaymentManager.getAnimationCounter(personalizePaymentManager$PaymentFlow3);
                            PersonalizationSparkleReason personalizationSparkleReason = ((QuickPayState) mutableState3.getValue()).note.length() > 0 ? PersonalizationSparkleReason.NOTE_TYPED : PersonalizationSparkleReason.FIRST_IMPRESSION;
                            boolean z5 = z4;
                            EntryPoint entryPoint = EntryPoint.PERSON_FIRST;
                            String uuid = quickPay.analytics.externalPaymentId.toString();
                            uuid.getClass();
                            AnalyticsHelperKt.trackPersonalizationButtonSparkled(analytics, z3, z5, str2, animationCounter, personalizationSparkleReason, entryPoint, uuid);
                        }
                        mutableState3.setValue(QuickPayState.copy$default((QuickPayState) mutableState3.getValue(), null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, (PersonalizePaymentEntrypointButtonViewModel) mutableState2.getValue(), 131071));
                        return Unit.INSTANCE;
                    }
                }
                z2 = false;
                mutableState2.setValue(personalizePaymentEntrypointButtonViewModel.updateState(isEmpty, isPersonalizedPaymentButtonEnabled, z2, z));
                if (((PersonalizePaymentEntrypointButtonViewModel) mutableState2.getValue()).showTooltip) {
                }
                if (((PersonalizePaymentEntrypointButtonViewModel) mutableState2.getValue()).animate) {
                }
                mutableState3.setValue(QuickPayState.copy$default((QuickPayState) mutableState3.getValue(), null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, (PersonalizePaymentEntrypointButtonViewModel) mutableState2.getValue(), 131071));
                return Unit.INSTANCE;
            }
        }
        z = false;
        PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel2 = (PersonalizePaymentEntrypointButtonViewModel) mutableState2.getValue();
        boolean isEmpty2 = ((QuickPayState) mutableState3.getValue()).paymentGetters.isEmpty();
        if (!((QuickPayState) mutableState3.getValue()).paymentGetters.isEmpty()) {
            PersonalizePaymentManager$PaymentFlow personalizePaymentManager$PaymentFlow22 = PersonalizePaymentManager$PaymentFlow.QUICK_PAY;
            bool = (Boolean) ((Map) realPersonalizePaymentManager.showTooltip.blockingGet()).get("QUICK_PAY");
            if (bool == null ? bool.booleanValue() : true) {
            }
        }
        z2 = false;
        mutableState2.setValue(personalizePaymentEntrypointButtonViewModel2.updateState(isEmpty2, isPersonalizedPaymentButtonEnabled, z2, z));
        if (((PersonalizePaymentEntrypointButtonViewModel) mutableState2.getValue()).showTooltip) {
        }
        if (((PersonalizePaymentEntrypointButtonViewModel) mutableState2.getValue()).animate) {
        }
        mutableState3.setValue(QuickPayState.copy$default((QuickPayState) mutableState3.getValue(), null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, (PersonalizePaymentEntrypointButtonViewModel) mutableState2.getValue(), 131071));
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$errorPulseElapsed$delegate;
        Object obj3 = this.$btPulseElapsed$delegate;
        Object obj4 = this.$activePhase$delegate;
        switch (i) {
            case 0:
                return new DotGridKt$DotGrid$3$1(this.$postFormationPhase, obj4, obj3, obj2, continuation, 0);
            case 1:
                return new DotGridKt$DotGrid$3$1(this.$postFormationPhase, obj3, obj2, (MutableState) obj4, continuation, 1);
            case 2:
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1(obj3, (MutableState) obj4, (MutableState) obj2, continuation, 2);
                dotGridKt$DotGrid$3$1.$postFormationPhase = obj;
                return dotGridKt$DotGrid$3$1;
            case 3:
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$12 = new DotGridKt$DotGrid$3$1((Animatable) obj4, (TweenSpec) obj3, (Animatable) obj2, continuation, 3);
                dotGridKt$DotGrid$3$12.$postFormationPhase = obj;
                return dotGridKt$DotGrid$3$12;
            case 4:
                return new DotGridKt$DotGrid$3$1((RealCashDepositBarcodeManager) this.$postFormationPhase, (Long) obj4, (GetPaperCashDepositBarcodeResponse.Success) obj3, (GetPaperCashDepositBarcodeResponse.Failure) obj2, continuation, 4);
            case 5:
                return new DotGridKt$DotGrid$3$1((MutableState) obj4, (PaperMoneyDepositMapPresenter) this.$postFormationPhase, (MutableState) obj3, (State) obj2, continuation);
            case 6:
                return new DotGridKt$DotGrid$3$1(this.$postFormationPhase, obj3, (MutableState) obj4, (MutableState) obj2, continuation, 6);
            case 7:
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$13 = new DotGridKt$DotGrid$3$1((ShareSheetViewModel) obj3, obj2, continuation, (MutableState) obj4);
                dotGridKt$DotGrid$3$13.$postFormationPhase = obj;
                return dotGridKt$DotGrid$3$13;
            case 8:
                return new DotGridKt$DotGrid$3$1(this.$postFormationPhase, obj3, (MutableState) obj4, (MutableState) obj2, continuation, 8);
            case 9:
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$14 = new DotGridKt$DotGrid$3$1((ActivityItem) obj4, (ProfileActivityItemEventDecorator) obj3, (ActivityItemViewModel) obj2, continuation, 9);
                dotGridKt$DotGrid$3$14.$postFormationPhase = obj;
                return dotGridKt$DotGrid$3$14;
            case 10:
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$15 = new DotGridKt$DotGrid$3$1((PersistentHistoricalDataCache) obj4, (CurrencyCode) obj3, (HistoricalRange) obj2, continuation, 10);
                dotGridKt$DotGrid$3$15.$postFormationPhase = obj;
                return dotGridKt$DotGrid$3$15;
            case 11:
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$16 = new DotGridKt$DotGrid$3$1((PersistentHistoricalDataCache) obj4, (InvestmentEntityToken) obj3, (HistoricalRange) obj2, continuation, 11);
                dotGridKt$DotGrid$3$16.$postFormationPhase = obj;
                return dotGridKt$DotGrid$3$16;
            case 12:
                return new DotGridKt$DotGrid$3$1(this.$postFormationPhase, obj3, (MutableState) obj4, (MutableState) obj2, continuation, 12);
            case 13:
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$17 = new DotGridKt$DotGrid$3$1((Collection) obj4, (InvestingSearchPresenter) obj3, (ColorModel) obj2, continuation, 13);
                dotGridKt$DotGrid$3$17.$postFormationPhase = obj;
                return dotGridKt$DotGrid$3$17;
            case 14:
                return new DotGridKt$DotGrid$3$1(this.$postFormationPhase, obj3, obj2, (MutableState) obj4, continuation, 14);
            case 15:
                int i2 = 15;
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$18 = new DotGridKt$DotGrid$3$1(i2, (MutableState) obj4, (PoolsListPresenter) obj2, (ApiResult) obj3, continuation);
                dotGridKt$DotGrid$3$18.$postFormationPhase = obj;
                return dotGridKt$DotGrid$3$18;
            case 16:
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$19 = new DotGridKt$DotGrid$3$1((AssetPublicSuffixList) obj4, (OfferSheetKey) obj3, (Function1) obj2, continuation, 16);
                dotGridKt$DotGrid$3$19.$postFormationPhase = obj;
                return dotGridKt$DotGrid$3$19;
            case 17:
                return new DotGridKt$DotGrid$3$1(this.$postFormationPhase, obj4, obj3, obj2, continuation, 17);
            case 18:
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$110 = new DotGridKt$DotGrid$3$1(obj3, (MutableState) obj4, (MutableState) obj2, continuation, 18);
                dotGridKt$DotGrid$3$110.$postFormationPhase = obj;
                return dotGridKt$DotGrid$3$110;
            case 19:
                int i3 = 19;
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$111 = new DotGridKt$DotGrid$3$1(i3, (MutableState) obj4, (PaymentClaimPresenter) obj2, (PublicProfile) obj3, continuation);
                dotGridKt$DotGrid$3$111.$postFormationPhase = obj;
                return dotGridKt$DotGrid$3$111;
            case 20:
                return new DotGridKt$DotGrid$3$1(this.$postFormationPhase, obj4, obj3, obj2, continuation, 20);
            case 21:
                return new DotGridKt$DotGrid$3$1(this.$postFormationPhase, obj4, obj3, obj2, continuation, 21);
            case 22:
                return new DotGridKt$DotGrid$3$1(this.$postFormationPhase, obj4, obj3, obj2, continuation, 22);
            case 23:
                return new DotGridKt$DotGrid$3$1(this.$postFormationPhase, obj4, obj3, obj2, continuation, 23);
            case 24:
                return new DotGridKt$DotGrid$3$1(this.$postFormationPhase, obj3, obj2, (MutableState) obj4, continuation, 24);
            case 25:
                int i4 = 25;
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$112 = new DotGridKt$DotGrid$3$1(i4, (MutableState) obj4, (PoolMemberListPresenter) obj2, (MemberStatusUpdateSnackBarViewModel) obj3, continuation);
                dotGridKt$DotGrid$3$112.$postFormationPhase = obj;
                return dotGridKt$DotGrid$3$112;
            case 26:
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$113 = new DotGridKt$DotGrid$3$1(obj3, (MutableState) obj4, (MutableState) obj2, continuation, 26);
                dotGridKt$DotGrid$3$113.$postFormationPhase = obj;
                return dotGridKt$DotGrid$3$113;
            case 27:
                return new DotGridKt$DotGrid$3$1(this.$postFormationPhase, obj4, obj3, obj2, continuation, 27);
            case 28:
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$114 = new DotGridKt$DotGrid$3$1(obj3, (MutableState) obj4, (MutableState) obj2, continuation, 28);
                dotGridKt$DotGrid$3$114.$postFormationPhase = obj;
                return dotGridKt$DotGrid$3$114;
            default:
                return new DotGridKt$DotGrid$3$1((ShoppingWebPresenter) this.$postFormationPhase, (MutableState) obj4, (MutableState) obj3, (State) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((DotGridKt$DotGrid$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0556  */
    /* JADX WARN: Type inference failed for: r0v107, types: [com.squareup.cash.offers.viewmodels.viewevents.OffersTimelineViewEvent$CloseTimelineSheet] */
    /* JADX WARN: Type inference failed for: r11v2, types: [androidx.compose.runtime.MutableState, androidx.compose.runtime.State] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v1, types: [squareup.cash.bankingbenefits.ui.BenefitExplainerScreen] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2, types: [squareup.cash.bankingbenefits.ui.BenefitExplainerScreen] */
    /* JADX WARN: Type inference failed for: r2v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DotGridPhase dotGridPhase;
        DotGridPhase dotGridPhase2;
        DotGridPhase dotGridPhase3;
        Object obj2;
        Money money;
        Object offersTimelineViewModel$Error;
        OfferTimelineSheet offerTimelineSheet;
        String str;
        DismissTapAction dismissTapAction;
        String str2;
        OffersTimelineViewEvent.ActionUrl actionUrl;
        zzle zzleVar;
        UrlTapAction urlTapAction;
        zzle zzleVar2;
        AnalyticsEvent analyticsEvent;
        zzkw zzkwVar;
        Object obj3;
        String str3;
        int i = this.$r8$classId;
        int i2 = 4;
        int i3 = 2;
        int i4 = 10;
        int i5 = 3;
        int i6 = 1;
        Object obj4 = this.$btPulseElapsed$delegate;
        Object obj5 = this.$activePhase$delegate;
        ?? r12 = 0;
        FilterConfiguration filterConfiguration = null;
        r12 = 0;
        Object obj6 = this.$errorPulseElapsed$delegate;
        switch (i) {
            case 0:
                MutableFloatState mutableFloatState = (MutableFloatState) obj6;
                MutableFloatState mutableFloatState2 = (MutableFloatState) obj4;
                DotGridPhase dotGridPhase4 = (DotGridPhase) this.$postFormationPhase;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState = (MutableState) obj5;
                DotGridPhase dotGridPhase5 = (DotGridPhase) mutableState.getValue();
                DotGridPhase dotGridPhase6 = DotGridPhase.Scanning;
                if (dotGridPhase5 == dotGridPhase6 && dotGridPhase4 == (dotGridPhase3 = DotGridPhase.BluetoothPulse)) {
                    mutableState.setValue(dotGridPhase3);
                    ((ParcelableSnapshotMutableFloatState) mutableFloatState2).setFloatValue(RecyclerView.DECELERATION_RATE);
                } else {
                    DotGridPhase dotGridPhase7 = (DotGridPhase) mutableState.getValue();
                    DotGridPhase dotGridPhase8 = DotGridPhase.BluetoothPulse;
                    if (dotGridPhase7 == dotGridPhase8 && dotGridPhase4 == dotGridPhase6) {
                        mutableState.setValue(dotGridPhase6);
                    } else if (((DotGridPhase) mutableState.getValue()) == dotGridPhase8 && dotGridPhase4 == (dotGridPhase2 = DotGridPhase.ErrorPulse)) {
                        mutableState.setValue(dotGridPhase2);
                        ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(RecyclerView.DECELERATION_RATE);
                    } else if (((DotGridPhase) mutableState.getValue()) == dotGridPhase6 && dotGridPhase4 == (dotGridPhase = DotGridPhase.ErrorPulse)) {
                        mutableState.setValue(dotGridPhase);
                        ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(RecyclerView.DECELERATION_RATE);
                    } else {
                        DotGridPhase dotGridPhase9 = (DotGridPhase) mutableState.getValue();
                        DotGridPhase dotGridPhase10 = DotGridPhase.ErrorPulse;
                        if (dotGridPhase9 == dotGridPhase10 && dotGridPhase4 == dotGridPhase8) {
                            mutableState.setValue(dotGridPhase8);
                            ((ParcelableSnapshotMutableFloatState) mutableFloatState2).setFloatValue(RecyclerView.DECELERATION_RATE);
                        } else if (((DotGridPhase) mutableState.getValue()) == dotGridPhase10 && dotGridPhase4 == dotGridPhase6) {
                            mutableState.setValue(dotGridPhase6);
                        }
                    }
                }
                break;
            case 1:
                ?? r11 = (MutableState) obj5;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ScheduleCalendarDate scheduleCalendarDate = (ScheduleCalendarDate) this.$postFormationPhase;
                if (scheduleCalendarDate != null && ((ScheduleCalendarDate) r11.getValue()) != null && !scheduleCalendarDate.equals((ScheduleCalendarDate) r11.getValue())) {
                    ((RealHapticVibrator) obj4).vibrate(((Haptics) obj6).input.standard);
                }
                r11.setValue(scheduleCalendarDate);
                break;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.$postFormationPhase;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CaptureCheckFacePresenter captureCheckFacePresenter = (CaptureCheckFacePresenter) obj4;
                JobKt.launch$default(coroutineScope, null, null, new CaptureCheckFacePresenter$models$2$1$1(captureCheckFacePresenter, (MutableState) obj5, r12, r8), 3);
                JobKt.launch$default(coroutineScope, null, null, new CaptureCheckFacePresenter$models$2$1$1(captureCheckFacePresenter, (MutableState) obj6, r12, i6), 3);
                break;
            case 3:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$postFormationPhase;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TweenSpec tweenSpec = (TweenSpec) obj4;
                JobKt.launch$default(coroutineScope2, null, null, new IconAnimationViewKt$IconAnimationView$1$1.AnonymousClass1((Animatable) obj5, tweenSpec, r12, i3), 3);
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GpsConfigQueries gpsConfigQueries = ((RealCashDepositBarcodeManager) this.$postFormationPhase).paperDepositBarcodeQuery;
                QueryResult execute = gpsConfigQueries.driver.execute(765043263, "UPDATE paperDepositBarcodeInfo\nSET expires_at = ?,\n    success = ?,\n    failure = ?", new BankingConfigQueries$$ExternalSyntheticLambda0((Long) obj5, (GetPaperCashDepositBarcodeResponse.Success) obj4, (GetPaperCashDepositBarcodeResponse.Failure) obj6, gpsConfigQueries, 13));
                gpsConfigQueries.notifyQueries(765043263, new PasswordInfoQueries$$ExternalSyntheticLambda0(24));
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocationSelection locationSelection = (LocationSelection) ((MutableState) obj5).getValue();
                if (locationSelection != null) {
                    PaperMoneyDepositMapPresenter paperMoneyDepositMapPresenter = (PaperMoneyDepositMapPresenter) this.$postFormationPhase;
                    State state = (State) obj6;
                    Iterator it = ((PaperMoneyDepositMapSectionViewModel$MapDataViewModel) ((MutableState) obj4).getValue()).retailerLocations.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (Intrinsics.areEqual(((GetRetailerLocationsResponse.RetailerLocation) obj2).retailer_location_token, locationSelection.locationToken)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    GetRetailerLocationsResponse.RetailerLocation retailerLocation = (GetRetailerLocationsResponse.RetailerLocation) obj2;
                    if (retailerLocation != null) {
                        BetterNavigator.ScreenNavigator screenNavigator = paperMoneyDepositMapPresenter.navigator;
                        PaperMoneyDepositMapScreen paperMoneyDepositMapScreen = paperMoneyDepositMapPresenter.args;
                        PaperCashDepositBlocker paperCashDepositBlocker = paperMoneyDepositMapScreen.paperCashDepositBlocker;
                        BlockersData blockersData = paperMoneyDepositMapScreen.blockersData;
                        BarcodeInfo barcodeInfo = (BarcodeInfo) state.getValue();
                        if (barcodeInfo != null) {
                            BarcodeInfo.Success success = barcodeInfo instanceof BarcodeInfo.Success ? (BarcodeInfo.Success) barcodeInfo : null;
                            GetPaperCashDepositBarcodeResponse.Success success2 = success != null ? success.response : null;
                            if (success2 != null) {
                                r12 = success2.explainer_screen;
                            }
                        }
                        screenNavigator.goTo(new PaperMoneyDepositMerchantDetailsScreen(paperCashDepositBlocker, retailerLocation, r12, blockersData));
                    }
                }
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TransfersPresenter.access$models$fetchEarnings((TransfersPresenter) this.$postFormationPhase, (CoroutineScope) obj4, (MutableState) obj5, (MutableState) obj6, false);
                break;
            case 7:
                MutableState mutableState2 = (MutableState) obj5;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ShareSheetViewModel shareSheetViewModel = (ShareSheetViewModel) obj4;
                List list = shareSheetViewModel.sharingOptions;
                DependentTeenQrCodeShareSheetPresenter$SharingState dependentTeenQrCodeShareSheetPresenter$SharingState = (DependentTeenQrCodeShareSheetPresenter$SharingState) obj6;
                if (dependentTeenQrCodeShareSheetPresenter$SharingState instanceof DependentTeenQrCodeShareSheetPresenter$SharingState.Loading) {
                    List<ShareSheetViewModel.SharingOption> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (ShareSheetViewModel.SharingOption sharingOption : list2) {
                        if (Intrinsics.areEqual(sharingOption.title, ((DependentTeenQrCodeShareSheetPresenter$SharingState.Loading) dependentTeenQrCodeShareSheetPresenter$SharingState).title)) {
                            sharingOption = ShareSheetViewModel.SharingOption.copy$default(sharingOption, true);
                        }
                        arrayList.add(sharingOption);
                    }
                    mutableState2.setValue(ShareSheetViewModel.copy$default(shareSheetViewModel, arrayList, null, 29));
                } else if (dependentTeenQrCodeShareSheetPresenter$SharingState instanceof DependentTeenQrCodeShareSheetPresenter$SharingState.Success) {
                    List<ShareSheetViewModel.SharingOption> list3 = list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    for (ShareSheetViewModel.SharingOption sharingOption2 : list3) {
                        if (Intrinsics.areEqual(sharingOption2.title, ((DependentTeenQrCodeShareSheetPresenter$SharingState.Success) dependentTeenQrCodeShareSheetPresenter$SharingState).title)) {
                            sharingOption2 = ShareSheetViewModel.SharingOption.copy$default(sharingOption2, false);
                        }
                        arrayList2.add(sharingOption2);
                    }
                    mutableState2.setValue(ShareSheetViewModel.copy$default(shareSheetViewModel, arrayList2, ((DependentTeenQrCodeShareSheetPresenter$SharingState.Success) dependentTeenQrCodeShareSheetPresenter$SharingState).message, 5));
                } else if (!(dependentTeenQrCodeShareSheetPresenter$SharingState instanceof DependentTeenQrCodeShareSheetPresenter$SharingState.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    List<ShareSheetViewModel.SharingOption> list4 = list;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    for (ShareSheetViewModel.SharingOption sharingOption3 : list4) {
                        if (Intrinsics.areEqual(sharingOption3.title, ((DependentTeenQrCodeShareSheetPresenter$SharingState.Failure) dependentTeenQrCodeShareSheetPresenter$SharingState).title)) {
                            sharingOption3 = ShareSheetViewModel.SharingOption.copy$default(sharingOption3, false);
                        }
                        arrayList3.add(sharingOption3);
                    }
                    mutableState2.setValue(ShareSheetViewModel.copy$default(shareSheetViewModel, arrayList3, null, 25));
                }
                break;
            case 8:
                MutableState mutableState3 = (MutableState) obj5;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ManagedAccountTransferScreen managedAccountTransferScreen = ((ManagedAccountTransferPresenter) this.$postFormationPhase).args;
                if (managedAccountTransferScreen.autoPopulateWithdrawAmount && managedAccountTransferScreen.initialAmount == null && !((Boolean) mutableState3.getValue()).booleanValue() && (money = (Money) obj4) != null) {
                    ((MutableState) obj6).setValue(money);
                    mutableState3.setValue(Boolean.TRUE);
                }
                break;
            case 9:
                ActivityItemCallbackEvent activityItemCallbackEvent = (ActivityItemCallbackEvent) this.$postFormationPhase;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ActivityItem activityItem = (ActivityItem) obj5;
                if (activityItem instanceof FormattedPaymentHistoryActivityItem) {
                    if (activityItemCallbackEvent == ActivityItemCallbackEvent.AnalyticsEvent.ReceiptOpened) {
                        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = (FormattedPaymentHistoryActivityItem) activityItem;
                        boolean z = ((ActivityItemViewModel) obj6).isBadged;
                        Analytics analytics = ((ProfileActivityItemEventDecorator) obj4).analytics;
                        String itemId = ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem);
                        boolean isPending = CryptoObjectUtils.isPending(formattedPaymentHistoryActivityItem);
                        PaymentState state2 = formattedPaymentHistoryActivityItem.getState();
                        com.squareup.cash.cdf.PaymentState cdfPaymentState = state2 != null ? ActivityCdfMappingsKt.toCdfPaymentState(state2) : null;
                        Orientation orientation = formattedPaymentHistoryActivityItem.getUiPayment().orientation;
                        PaymentOrientation cdfPaymentOrientation = orientation != null ? ActivityCdfMappingsKt.toCdfPaymentOrientation(orientation) : null;
                        Role role = formattedPaymentHistoryActivityItem.getUiPayment().role;
                        PaymentRole cdfPaymentRole = role != null ? ActivityCdfMappingsKt.toCdfPaymentRole(role) : null;
                        ActivityItemType itemType = ActivityItemKt.getItemType(formattedPaymentHistoryActivityItem);
                        analytics.track(new ActivityRecordViewOpen(itemId, Boolean.valueOf(z), Boolean.valueOf(isPending), null, cdfPaymentRole, cdfPaymentOrientation, cdfPaymentState, null, null, null, CryptoObjectUtils.getUiCounterparty(formattedPaymentHistoryActivityItem).id, itemType != null ? itemType.toString() : null, null, 511624), null);
                    }
                    break;
                } else {
                    break;
                }
            case 10:
                GetHistoricalExchangeDataResponse getHistoricalExchangeDataResponse = (GetHistoricalExchangeDataResponse) this.$postFormationPhase;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((PersistentHistoricalDataCache) obj5).bitcoinPortfolio.put(new Pair((CurrencyCode) obj4, (HistoricalRange) obj6), getHistoricalExchangeDataResponse);
                break;
            case 11:
                GetInvestmentEntityHistoricalDataResponse getInvestmentEntityHistoricalDataResponse = (GetInvestmentEntityHistoricalDataResponse) this.$postFormationPhase;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((PersistentHistoricalDataCache) obj5).entityMemoryCache.put(new Pair((InvestmentEntityToken) obj4, (HistoricalRange) obj6), getInvestmentEntityHistoricalDataResponse);
                break;
            case 12:
                InvestingCustomOrderContentModel investingCustomOrderContentModel = (InvestingCustomOrderContentModel) this.$postFormationPhase;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState4 = (MutableState) obj5;
                if (((GraphState) mutableState4.getValue()).graphHeight$delegate.getIntValue() != 0) {
                    InvestingCustomOrderContentModel.Content content = (InvestingCustomOrderContentModel.Content) investingCustomOrderContentModel;
                    if (content.isGraphReady && !content.isGraphReset) {
                        ((DragWidgetState) ((PriceWidgetState) ((MutableState) obj6).getValue()).dragWidgetState$delegate.getValue()).expand$delegate.setValue(Boolean.FALSE);
                        GraphState graphState = (GraphState) mutableState4.getValue();
                        long j = content.currentPrice;
                        graphState.onSelectPrice.invoke(null);
                        graphState.selectedPrice$delegate.setValue(new PriceValue(j));
                        graphState.currentPrice = j;
                        graphState.priceWidgetOffsetY$delegate.setFloatValue(graphState.m3582pointForPricenM2_iWI(j));
                        ((Function1) obj4).invoke(InvestingCustomOrderViewEvent.GraphReset.INSTANCE);
                    }
                }
                break;
            case 13:
                InvestingSearchPresenter investingSearchPresenter = (InvestingSearchPresenter) obj4;
                RealCategoryBackend realCategoryBackend = investingSearchPresenter.categoryBackend;
                FilterGroup filterGroup = (FilterGroup) this.$postFormationPhase;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Iterator it2 = ((Collection) obj5).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ?? next = it2.next();
                        if (Intrinsics.areEqual(((FilterConfiguration) next).getFilterToken(), filterGroup.token)) {
                            filterConfiguration = next;
                        }
                    }
                }
                FilterConfiguration filterConfiguration2 = filterConfiguration;
                if (filterConfiguration2 instanceof FilterConfiguration.Categories) {
                    break;
                } else if (filterConfiguration2 instanceof FilterConfiguration.SubFilters) {
                    break;
                } else {
                    String str4 = filterGroup.name;
                    break;
                }
            case 14:
                Map map = (Map) obj4;
                TemplateCardPresenter templateCardPresenter = (TemplateCardPresenter) this.$postFormationPhase;
                TemplateCard templateCard = templateCardPresenter.metadata;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState5 = (MutableState) obj5;
                if (!((Boolean) mutableState5.getValue()).booleanValue()) {
                    Map map2 = (Map) obj6;
                    ArrayList allPickers = TemplateCardPresenterKt.allPickers(templateCard);
                    if (!allPickers.isEmpty()) {
                        if (!allPickers.isEmpty()) {
                            Iterator it3 = allPickers.iterator();
                            while (it3.hasNext()) {
                                Pair pair = (Pair) it3.next();
                                String str5 = (String) pair.first;
                                TemplateCard.Picker picker = (TemplateCard.Picker) pair.second;
                                if (!(picker instanceof TemplateCard.Picker.StaticPicker)) {
                                    if (!(picker instanceof TemplateCard.Picker.SavingsTransferOptionPicker)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else if (map.get(str5) instanceof SelectedInlineContentValue.TransferOption) {
                                        continue;
                                    } else if (((TemplateCard.Picker.SavingsTransferOptionPicker) picker).prefilledValue == null) {
                                        Iterable iterable = (List) map2.get(str5);
                                        if (iterable == null) {
                                            iterable = EmptyList.INSTANCE;
                                        }
                                        Iterable iterable2 = iterable;
                                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                            Iterator it4 = iterable2.iterator();
                                            while (it4.hasNext()) {
                                                if (((ResolvedTransferOption) it4.next()).isSelectable()) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else if (((TemplateCard.Picker.StaticPicker) picker).selectedValue != null && !(map.get(str5) instanceof SelectedInlineContentValue.Picker)) {
                                }
                            }
                        }
                        RealMoneybotAnalyticsService realMoneybotAnalyticsService = templateCardPresenter.analyticsService;
                        PluginContext pluginContext = templateCardPresenter.pluginContext;
                        String str6 = pluginContext.chatSessionId;
                        String str7 = pluginContext.requestId;
                        String serverToolName = templateCardPresenter.getServerToolName();
                        String str8 = templateCard.sourcePlaceholderKey;
                        String access$toOptionKind = str8 != null ? TemplateCardPresenterKt.access$toOptionKind(str8, map) : null;
                        String str9 = templateCard.targetPlaceholderKey;
                        realMoneybotAnalyticsService.analytics.track(new MoneybotTemplateCardResolved(str6, str7, serverToolName, access$toOptionKind, str9 != null ? TemplateCardPresenterKt.access$toOptionKind(str9, map) : null), null);
                        mutableState5.setValue(Boolean.TRUE);
                        break;
                    }
                }
                break;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ApiResult apiResult = (ApiResult) obj4;
                MutableState mutableState6 = (MutableState) obj5;
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj6;
                AndroidStringManager androidStringManager = (AndroidStringManager) poolsListPresenter.stringManager;
                boolean z2 = apiResult instanceof ApiResult.Success;
                if (z2) {
                    OffersSheetResponse offersSheetResponse = (OffersSheetResponse) ((ApiResult.Success) apiResult).response;
                    offersSheetResponse.getClass();
                    OfferSheet offerSheet = offersSheetResponse.sheet;
                    if (offerSheet != null && (zzkwVar = offerSheet.sheet) != null) {
                        OfferSheet$Sheet$TimelineSheet offerSheet$Sheet$TimelineSheet = zzkwVar instanceof OfferSheet$Sheet$TimelineSheet ? (OfferSheet$Sheet$TimelineSheet) zzkwVar : null;
                        if (offerSheet$Sheet$TimelineSheet != null) {
                            offerTimelineSheet = offerSheet$Sheet$TimelineSheet.value;
                            if (offerTimelineSheet == null) {
                                Button button = offerTimelineSheet.shop_button;
                                LocalizedString localizedString = offerTimelineSheet.l_title;
                                if (localizedString == null || (str = localizedString.translated_value) == null) {
                                    str = androidStringManager.get(R.string.offers_how_to_use_label);
                                }
                                String str10 = str;
                                if (button != null) {
                                    StyledText styledText = button.styled_text;
                                    String str11 = styledText != null ? styledText.text : null;
                                    if (str11 != null) {
                                        List list5 = offerTimelineSheet.line_items;
                                        if (list5.isEmpty()) {
                                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: line item list was null");
                                            break;
                                        } else {
                                            PersistentVectorBuilder builder = SmallPersistentVector.EMPTY.builder();
                                            Iterator it5 = list5.iterator();
                                            while (it5.hasNext()) {
                                                LocalizedString localizedString2 = ((OfferTimelineSheet.LineItem) it5.next()).l_title;
                                                String str12 = localizedString2 != null ? localizedString2.translated_value : null;
                                                if (str12 == null) {
                                                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: localized title translated value was null");
                                                    break;
                                                } else {
                                                    builder.add(str12);
                                                }
                                            }
                                            AbstractPersistentList build = builder.build();
                                            OffersAnalyticsEventSpec offersAnalyticsEventSpec = (offerSheet == null || (analyticsEvent = offerSheet.analytics_view_event) == null) ? null : ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent);
                                            if (button == null) {
                                                a$$ExternalSyntheticBUOutline0.m$3("Data validation: shop button was null");
                                                break;
                                            } else {
                                                TapAction tapAction = button.tap_action;
                                                if (tapAction != null && (zzleVar2 = tapAction.action) != null) {
                                                    TapAction$Action$DismissAction tapAction$Action$DismissAction = zzleVar2 instanceof TapAction$Action$DismissAction ? (TapAction$Action$DismissAction) zzleVar2 : null;
                                                    if (tapAction$Action$DismissAction != null) {
                                                        dismissTapAction = tapAction$Action$DismissAction.value;
                                                        if (tapAction != null && (zzleVar = tapAction.action) != null) {
                                                            TapAction$Action$UrlAction tapAction$Action$UrlAction = !(zzleVar instanceof TapAction$Action$UrlAction) ? (TapAction$Action$UrlAction) zzleVar : null;
                                                            urlTapAction = tapAction$Action$UrlAction == null ? tapAction$Action$UrlAction.value : null;
                                                            if (urlTapAction != null) {
                                                                str2 = urlTapAction.action_url;
                                                                if (dismissTapAction != null) {
                                                                    actionUrl = new OffersTimelineViewEvent.CloseTimelineSheet(SheetDismissOrigin.Button);
                                                                } else if (str2 == null) {
                                                                    a$$ExternalSyntheticBUOutline0.m$1("tap action for both dismiss and urlAction were null");
                                                                    break;
                                                                } else {
                                                                    actionUrl = new OffersTimelineViewEvent.ActionUrl(str2, OfferDetailsSheetMapperKt.getRequiredAnalyticsEventSpecs(button));
                                                                }
                                                                offersTimelineViewModel$Error = new OffersTimelineViewModel$OffersTimelineSheet(str10, str11, build, actionUrl, offersAnalyticsEventSpec);
                                                            }
                                                        }
                                                        str2 = null;
                                                        if (dismissTapAction != null) {
                                                        }
                                                        offersTimelineViewModel$Error = new OffersTimelineViewModel$OffersTimelineSheet(str10, str11, build, actionUrl, offersAnalyticsEventSpec);
                                                    }
                                                }
                                                dismissTapAction = null;
                                                if (tapAction != null) {
                                                    if (!(zzleVar instanceof TapAction$Action$UrlAction)) {
                                                    }
                                                    if (tapAction$Action$UrlAction == null) {
                                                    }
                                                    if (urlTapAction != null) {
                                                    }
                                                }
                                                str2 = null;
                                                if (dismissTapAction != null) {
                                                }
                                                offersTimelineViewModel$Error = new OffersTimelineViewModel$OffersTimelineSheet(str10, str11, build, actionUrl, offersAnalyticsEventSpec);
                                            }
                                        }
                                    } else {
                                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: text label was null");
                                        break;
                                    }
                                } else {
                                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: shop button was null");
                                    break;
                                }
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$3("Data validation: OffersTimelineSheet was null");
                                break;
                            }
                        }
                    }
                    offerTimelineSheet = null;
                    if (offerTimelineSheet == null) {
                    }
                } else if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                    offersTimelineViewModel$Error = new OffersTimelineViewModel$Error(androidStringManager.get(R.string.offers_tab_network_error_title));
                } else if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    offersTimelineViewModel$Error = new OffersTimelineViewModel$Error(androidStringManager.get(R.string.offers_tab_generic_error_title));
                }
                mutableState6.setValue(offersTimelineViewModel$Error);
                RealOffersSpanManager realOffersSpanManager = (RealOffersSpanManager) poolsListPresenter.localeAssetProvider;
                boolean z3 = apiResult instanceof ApiResult.Failure;
                OffersSpanAction.EndRootSpan endRootSpan = OffersSpanAction.EndRootSpan.INSTANCE;
                OffersSpanAction.EndLoading endLoading = OffersSpanAction.EndLoading.INSTANCE;
                if (z3) {
                    realOffersSpanManager.onAction(endLoading);
                    realOffersSpanManager.onAction(endRootSpan);
                } else if (!z2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    Long l = ((OffersSheetResponse) ((ApiResult.Success) apiResult).response).expire_at_ms;
                    if ((l != null ? l.longValue() : 0L) > ((AndroidClock) poolsListPresenter.args).millis()) {
                        realOffersSpanManager.onAction(endLoading);
                        realOffersSpanManager.onAction(endRootSpan);
                    }
                }
                break;
            case 16:
                ApiResult apiResult2 = (ApiResult) this.$postFormationPhase;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AssetPublicSuffixList assetPublicSuffixList = (AssetPublicSuffixList) obj5;
                Function1 function1 = (Function1) obj6;
                SheetType sheetType = ((OfferSheetKey) obj4).sheet_type;
                if (sheetType != null && !(apiResult2 instanceof ApiResult.Failure)) {
                    if (apiResult2 instanceof ApiResult.Success) {
                        Long l2 = ((OffersSheetResponse) ((ApiResult.Success) apiResult2).response).expire_at_ms;
                        if ((l2 != null ? l2.longValue() : 0L) <= ((AndroidClock) assetPublicSuffixList.path).millis()) {
                            int ordinal = sheetType.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                }
                            } else {
                                function1.invoke(new OffersSpanAction.StartLoading("offers_details_sheet_loading", false));
                            }
                        }
                    } else if (apiResult2 == null) {
                        int ordinal2 = sheetType.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            }
                        } else {
                            function1.invoke(new OffersSpanAction.StartLoading("offers_details_sheet_loading", true));
                        }
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                }
                break;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState7 = (MutableState) obj5;
                mutableState7.setValue(MainPaymentPadPresenter.updateConvertedFiatMoney(MainPaymentPadPresenter.State.copy$default((MainPaymentPadPresenter.State) mutableState7.getValue(), null, (CurrencyCode) ((MutableState) obj4).getValue(), null, null, null, false, false, null, ((Boolean) ((MutableState) obj6).getValue()).booleanValue(), false, null, 3579)));
                break;
            case 18:
                MutableState mutableState8 = (MutableState) obj5;
                String str13 = (String) this.$postFormationPhase;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (str13 != null && !str13.equals("0")) {
                    mutableState8.setValue(Boolean.TRUE);
                }
                MutableState mutableState9 = (MutableState) obj6;
                mutableState9.setValue(MainPaymentPadPresenter.State.copy$default((MainPaymentPadPresenter.State) mutableState9.getValue(), null, null, null, null, null, false, false, null, false, false, new HypeConfig(!((Boolean) mutableState8.getValue()).booleanValue(), (String) ((Map) obj4).get(str13)), 2047));
                break;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState10 = (MutableState) obj5;
                PaymentClaimPresenter paymentClaimPresenter = (PaymentClaimPresenter) obj6;
                FullCashtag fullCashtag = ((PublicProfile) obj4).fullCashtag;
                mutableState10.setValue(paymentClaimPresenter.createViewModel(fullCashtag != null ? FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag) : null));
                break;
            case 20:
                MutableState mutableState11 = (MutableState) obj6;
                MutableState mutableState12 = (MutableState) obj4;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) ((MutableState) obj5).getValue()).booleanValue()) {
                    break;
                } else {
                    PersonalizationDraft personalizationDraft = (PersonalizationDraft) this.$postFormationPhase;
                    String str14 = personalizationDraft != null ? personalizationDraft.backgroundId : null;
                    if (str14 != null) {
                        Iterator it6 = ((List) mutableState12.getValue()).iterator();
                        int i7 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i7 = -1;
                            } else if (!Intrinsics.areEqual(((Background) it6.next()).id, str14)) {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            mutableState11.setValue(Integer.valueOf(i7));
                            break;
                        }
                    }
                    Iterator it7 = ((List) mutableState12.getValue()).iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            r8 = -1;
                        } else if (!((Background) it7.next()).isDefault) {
                            r8++;
                        }
                    }
                    if (r8 != -1) {
                        mutableState11.setValue(Integer.valueOf(r8));
                    }
                    break;
                }
            case 21:
                PersonalizePaymentPresenter personalizePaymentPresenter = (PersonalizePaymentPresenter) this.$postFormationPhase;
                PaymentScreens.PersonalizePayment personalizePayment = personalizePaymentPresenter.args;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) ((MutableState) obj5).getValue()).booleanValue()) {
                    personalizePaymentPresenter.analytics.track(new AssetSendPersonalizationTransformed(personalizePayment.paymentToken.toString(), personalizePayment.flowToken, ((Background) ((List) ((MutableState) obj4).getValue()).get(((Number) ((MutableState) obj6).getValue()).intValue())).id, null, null, null, null, null, null, personalizePaymentPresenter.experienceType, 4088), null);
                }
                break;
            case 22:
                PersonalizePaymentRecipientPresenter personalizePaymentRecipientPresenter = (PersonalizePaymentRecipientPresenter) this.$postFormationPhase;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState13 = (MutableState) obj5;
                if (((PersonalizedPaymentLoadingState) mutableState13.getValue()) instanceof PersonalizedPaymentLoadingState.Loaded) {
                    PersonalizedPaymentLoadingState personalizedPaymentLoadingState = (PersonalizedPaymentLoadingState) mutableState13.getValue();
                    personalizedPaymentLoadingState.getClass();
                    PersonalizedPaymentLoadingState.Loaded loaded = (PersonalizedPaymentLoadingState.Loaded) personalizedPaymentLoadingState;
                    Music music = loaded.music;
                    MutableState mutableState14 = (MutableState) obj4;
                    ReactionsData reactionsData = loaded.reactions;
                    List list6 = reactionsData.quickReactions;
                    List list7 = reactionsData.existingReactions;
                    if (list7 == null || !(!list7.isEmpty())) {
                        List list8 = list6;
                        obj3 = (list8 == null || list8.isEmpty()) ? PersonalizedPaymentsReactionsState.ReactionsDisabled.INSTANCE : PersonalizedPaymentsReactionsState.ReactionsAvailable.INSTANCE;
                    } else {
                        obj3 = new PersonalizedPaymentsReactionsState.ShowingExistingReactions(list7);
                    }
                    mutableState14.setValue(obj3);
                    if (personalizePaymentRecipientPresenter.isMusicEnabled) {
                        if ((music != null ? music.music_id : null) != null) {
                            MutableState mutableState15 = (MutableState) obj6;
                            music.getClass();
                            String str15 = music.album_art_url;
                            Image image = new Image(str15, str15, 4);
                            String str16 = music.title;
                            if (str16 == null) {
                                str16 = "";
                            }
                            String str17 = music.artist;
                            String str18 = str17 != null ? str17 : "";
                            String str19 = music.music_id;
                            str19.getClass();
                            mutableState15.setValue(new SelectedTrack(image, str16, str18, str19));
                        }
                    }
                }
                break;
            case 23:
                break;
            case 24:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealImageLoader realImageLoader = (RealImageLoader) this.$postFormationPhase;
                ImageRequest.Builder builder2 = new ImageRequest.Builder((Context) obj4);
                builder2.data = (String) obj6;
                builder2.target = new OpenSourceKt$OpenSource$1$1$2((MutableState) obj5);
                realImageLoader.enqueue(builder2.build());
                break;
            case 25:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$postFormationPhase;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope3, ((PoolMemberListPresenter) obj6).ioDispatcher, null, new HeroCardViewKt$Render$1$8$1.AnonymousClass3((MutableState) obj5, r12, 12), 2);
                break;
            case 26:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.$postFormationPhase;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope4, null, null, new PoolsListPresenter$models$2$1((PoolsListPresenter) obj4, (MutableState) obj5, (MutableState) obj6, null, 1), 3);
                break;
            case 27:
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) this.$postFormationPhase;
                MutableState mutableState16 = (MutableState) obj4;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                DataLoadingState dataLoadingState = (DataLoadingState) ((MutableState) obj5).getValue();
                if (dataLoadingState instanceof DataLoadingState.DataLoaded) {
                    Object obj7 = ((DataLoadingState.DataLoaded) dataLoadingState).data;
                    Collection collection = (Collection) obj7;
                    if (collection == null || collection.isEmpty()) {
                        pdfPreviewPresenter.navigator.goTo(Back.INSTANCE);
                    } else if (!((Boolean) mutableState16.getValue()).booleanValue() && ((ParcelableSnapshotMutableIntState) obj6).getIntValue() == 0) {
                        ((RealDeviceManagerAnalytics) pdfPreviewPresenter.fileProvider).analytics.track(new TrustedDeviceViewAll(Integer.valueOf(((List) obj7).size())), null);
                        mutableState16.setValue(Boolean.TRUE);
                    }
                }
                break;
            case 28:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.$postFormationPhase;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj4;
                Continuation continuation = null;
                JobKt.launch$default(coroutineScope5, null, null, new ShoppingWebBridge.AnonymousClass1(localEditorialPresenter, continuation, i4), 3);
                JobKt.launch$default(coroutineScope5, null, null, new SelectPaymentPlanBlockerPresenter$models$1$2(localEditorialPresenter, (MutableState) obj5, (MutableState) obj6, continuation, 18), 3);
                break;
            default:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState17 = (MutableState) obj5;
                Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                if (((String) mutableState17.getValue()) != null) {
                    ShoppingWebPresenter shoppingWebPresenter = (ShoppingWebPresenter) this.$postFormationPhase;
                    Analytics analytics2 = shoppingWebPresenter.analytics;
                    RealBugReportSenderFactory realBugReportSenderFactory = shoppingWebPresenter.shoppingWebAnalytics;
                    String str20 = (String) mutableState17.getValue();
                    str20.getClass();
                    HashMap hashMap = (HashMap) ((MutableState) obj4).getValue();
                    if (hashMap != null) {
                        String str21 = (String) mutableState17.getValue();
                        str21.getClass();
                        str3 = (String) hashMap.get(str21);
                    } else {
                        str3 = null;
                    }
                    r8 = (str3 == null || StringsKt.isBlank(str3)) ? 1 : 0;
                    Set set2 = (Set) ((State) obj6).getValue();
                    realBugReportSenderFactory.getClass();
                    set2.getClass();
                    analytics2.track(new BrowserCheckoutFormFieldFocused((InfoContext) realBugReportSenderFactory.featureEligibilityDumper, (BrowserOrigin) realBugReportSenderFactory.sessionManager, (String) realBugReportSenderFactory.tempStorage, (String) realBugReportSenderFactory.recentMoneybotSession, (String) realBugReportSenderFactory.bugsnagClient, str20, Boolean.valueOf((boolean) (r8 ^ 1)), CollectionsKt.joinToString$default(set2, "|", null, null, 0, null, null, 62)), null);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DotGridKt$DotGrid$3$1(int i, MutableState mutableState, MoleculePresenter moleculePresenter, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$btPulseElapsed$delegate = obj;
        this.$errorPulseElapsed$delegate = moleculePresenter;
        this.$activePhase$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotGridKt$DotGrid$3$1(ShareSheetViewModel shareSheetViewModel, Object obj, Continuation continuation, MutableState mutableState) {
        super(2, continuation);
        this.$r8$classId = 7;
        this.$btPulseElapsed$delegate = shareSheetViewModel;
        this.$errorPulseElapsed$delegate = obj;
        this.$activePhase$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DotGridKt$DotGrid$3$1(Object obj, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$btPulseElapsed$delegate = obj;
        this.$activePhase$delegate = mutableState;
        this.$errorPulseElapsed$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DotGridKt$DotGrid$3$1(Object obj, Object obj2, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$postFormationPhase = obj;
        this.$btPulseElapsed$delegate = obj2;
        this.$activePhase$delegate = mutableState;
        this.$errorPulseElapsed$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DotGridKt$DotGrid$3$1(Object obj, Object obj2, Object obj3, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$postFormationPhase = obj;
        this.$btPulseElapsed$delegate = obj2;
        this.$errorPulseElapsed$delegate = obj3;
        this.$activePhase$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DotGridKt$DotGrid$3$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$postFormationPhase = obj;
        this.$activePhase$delegate = obj2;
        this.$btPulseElapsed$delegate = obj3;
        this.$errorPulseElapsed$delegate = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DotGridKt$DotGrid$3$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$activePhase$delegate = obj;
        this.$btPulseElapsed$delegate = obj2;
        this.$errorPulseElapsed$delegate = obj3;
    }
}
