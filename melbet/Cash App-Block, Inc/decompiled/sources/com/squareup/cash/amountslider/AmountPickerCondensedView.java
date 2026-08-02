package com.squareup.cash.amountslider;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.compose.ui.draw.RotateKt;
import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.google.zxing.BinaryBitmap;
import com.plaid.internal.EnumC0170g;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesManager;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletAnalyticsEventsSpec;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletMerchantSheetRepository$MerchantSheetResult;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletParsingErrorFactory;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletMerchantSheetRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.db.AfterpayApplet;
import com.squareup.cash.afterpayapplet.db.AfterpayAppletQueries$forKey$2;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletActivityListEmbeddedPresenter$models$2$1$1;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomeMapperKt;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletMerchantSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.internal.TooltipState;
import com.squareup.cash.arcade.components.internal.TooltipState$hide$1$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.benefits.presenters.BankingBenefitsBookletPresenter;
import com.squareup.cash.benefits.presenters.BenefitsHomePresenter;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$models$2$1$1;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.BitcoinStackingToolsInfoPresenter;
import com.squareup.cash.bitcoin.presenters.applet.toolbar.RealBitcoinHomeToolbarPresenter;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinInvoiceEntryScreen;
import com.squareup.cash.bitcoin.screens.BitcoinMapOnboardingScreen;
import com.squareup.cash.bitcoin.screens.BitcoinMapScreen;
import com.squareup.cash.bitcoin.views.compose.CopyCheckIconState;
import com.squareup.cash.blockers.actions.presenters.BlockerActionConfirmDialogPresenter;
import com.squareup.cash.blockers.actions.presenters.BlockerActionConfirmDialogPresenter$models$1$1$1$1;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter;
import com.squareup.cash.blockers.presenters.CardActivationQrScannerPresenter$models$1$1$2;
import com.squareup.cash.blockers.presenters.ClientScenarioLauncherPresenter$models$1$1$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.crypto.CryptoSendStart;
import com.squareup.cash.cdf.crypto.CryptoSpendOnboard;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.crypto.navigation.CryptoPaymentSource;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$CashBitcoinSymbolDisplaySetting;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.cash.money.privacy.RealBalancePrivacy;
import com.squareup.cash.mooncake.components.LoadingHelper$Position;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.overdraftly.api.v1_0.app.ComputeOverdraftSyncValuesRequest;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.tax.web.TaxWebAppBridge$openTakePhoto$1$1;
import com.squareup.cash.transfers.backend.real.RealTransferRequirementHandler;
import com.squareup.cash.ui.widget.AmountSelector;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheet;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheet$Content$PasteboardTextLines;
import com.squareup.protos.cash.overdraftly.OverdraftlyService;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.util.android.coroutines.ViewKt;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okio.ByteString;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import timber.log.Timber;

/* loaded from: classes5.dex */
public class AmountPickerCondensedView extends ContourLayout implements Ui {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final AmountSelector amountSelector;
    public final MooncakePillButton buttonView;
    public Ui.EventReceiver eventReceiver;
    public final PausedCompositionImpl loadingHelper;
    public final AppCompatTextView subtitleView;
    public final AppCompatTextView titleView;

    /* renamed from: com.squareup.cash.amountslider.AmountPickerCondensedView$14, reason: invalid class name */
    public final class AnonymousClass14 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass14(Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass14((AmountPickerCondensedView) obj2, continuation, 0);
                case 1:
                    return new AnonymousClass14((RealActivitiesManager) obj2, continuation, 1);
                case 2:
                    return new AnonymousClass14((RealActivityEmbeddedPresenter) obj2, continuation, 2);
                case 3:
                    return new AnonymousClass14((RealAfterpayAppletRepository) obj2, continuation, 3);
                case 4:
                    return new AnonymousClass14((LocalHomePresenter) obj2, continuation, 4);
                case 5:
                    return new AnonymousClass14((LocalHomePresenter) obj2, continuation, 5);
                case 6:
                    return new AnonymousClass14((AfterpayAppletPurchasesEmbeddedPresenter) obj2, continuation, 6);
                case 7:
                    return new AnonymousClass14((TooltipState) obj2, continuation, 7);
                case 8:
                    return new AnonymousClass14((TapToPayPresenter) obj2, continuation, 8);
                case 9:
                    return new AnonymousClass14((TransfersPresenter) obj2, continuation, 9);
                case 10:
                    return new AnonymousClass14((LocalHomePresenter) obj2, continuation, 10);
                case 11:
                    return new AnonymousClass14((LocalPosCheckInPresenter) obj2, continuation, 11);
                case 12:
                    return new AnonymousClass14((UnleashContext) obj2, continuation, 12);
                case 13:
                    return new AnonymousClass14((BankingBenefitsBookletPresenter) obj2, continuation, 13);
                case 14:
                    return new AnonymousClass14((BenefitsHomePresenter) obj2, continuation, 14);
                case 15:
                    return new AnonymousClass14((TapToPayPresenter) obj2, continuation, 15);
                case 16:
                    return new AnonymousClass14((MusicPresenter) obj2, continuation, 16);
                case 17:
                    return new AnonymousClass14((BitcoinStackingToolsInfoPresenter) obj2, continuation, 17);
                case 18:
                    return new AnonymousClass14((RealBitcoinHomeToolbarPresenter) obj2, continuation, 18);
                case 19:
                    return new AnonymousClass14((LocalPosCheckInPresenter) obj2, continuation, 19);
                case 20:
                    return new AnonymousClass14((BitcoinTransferPresenter) obj2, continuation, 20);
                case 21:
                    return new AnonymousClass14((BinaryBitmap) obj2, continuation, 21);
                case 22:
                    return new AnonymousClass14((CopyCheckIconState) obj2, continuation, 22);
                case 23:
                    return new AnonymousClass14((BlockerActionConfirmDialogPresenter) obj2, continuation, 23);
                case 24:
                    return new AnonymousClass14((AmountBlockerPresenter) obj2, continuation, 24);
                case 25:
                    return new AnonymousClass14((CardLockPresenter) obj2, continuation, 25);
                case 26:
                    return new AnonymousClass14((CardStudioPresenter) obj2, continuation, 26);
                case 27:
                    return new AnonymousClass14((LocalPosCheckInPresenter) obj2, continuation, 27);
                case 28:
                    return new AnonymousClass14((EndAppLockPresenter) obj2, continuation, 28);
                default:
                    return new AnonymousClass14((DisclosurePresenter) obj2, continuation, 29);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v11, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object sheet;
            String required;
            String required2;
            StackedAvatarViewModel.Avatar avatar;
            Button button;
            String required3;
            Tap tapViewModel;
            ?? r6;
            AfterpayMerchantSheet.PasteboardTextLines pasteboardTextLines;
            List list;
            int i = this.$r8$classId;
            int i2 = 10;
            int i3 = 2;
            byte b = 0;
            Object obj2 = this.this$0;
            Object obj3 = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    AmountPickerCondensedView amountPickerCondensedView = (AmountPickerCondensedView) obj2;
                    AmountSelector amountSelector = amountPickerCondensedView.amountSelector;
                    SharedFlowImpl sharedFlowImpl = amountSelector.selections;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$2 = new LazyPagingItems$collectLoadState$2(amountPickerCondensedView, 29);
                    this.label = 1;
                    sharedFlowImpl.collect(new TaxWebAppBridge$openTakePhoto$1$1(24, new AmountPickerCondensedView$events$$inlined$map$1$2(lazyPagingItems$collectLoadState$2, b), amountSelector), this);
                    return coroutineSingletons;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (((RealActivitiesManager) obj2).load(ActivitiesManager.LoadMode.LOAD_NEXT_PAGE, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ActivitiesManager activitiesManager = ((RealActivityEmbeddedPresenter) obj2).activitiesManager;
                        ActivitiesManager.LoadMode loadMode = ActivitiesManager.LoadMode.LOAD_NEXT_PAGE;
                        this.label = 1;
                        if (activitiesManager.load(loadMode, this) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    } else {
                        if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 3:
                    RealAfterpayAppletRepository realAfterpayAppletRepository = (RealAfterpayAppletRepository) obj2;
                    Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        LocalTabContentQueries localTabContentQueries = realAfterpayAppletRepository.accountDatabase.afterpayAppletQueries;
                        localTabContentQueries.getClass();
                        AfterpayAppletQueries$forKey$2 afterpayAppletQueries$forKey$2 = AfterpayAppletQueries$forKey$2.INSTANCE;
                        AfterpayApplet afterpayApplet = (AfterpayApplet) new OffersHomeQueries$ForIdQuery(localTabContentQueries, new ContextKt$$ExternalSyntheticLambda1(localTabContentQueries, b), i3).executeAsOneOrNull();
                        if (afterpayApplet == null) {
                            return null;
                        }
                        AfterpayAppletResponse afterpayAppletResponse = afterpayApplet.afterpay_applet_response;
                        this.label = 1;
                        Object withContext = JobKt.withContext(realAfterpayAppletRepository.ioContext, new FlashControl$applyScreenFlash$2(realAfterpayAppletRepository, -1L, afterpayAppletResponse, (Continuation) null, 3), this);
                        if (withContext != obj4) {
                            withContext = Unit.INSTANCE;
                        }
                        if (withContext == obj4) {
                            return obj4;
                        }
                    } else {
                        if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 4:
                    LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj2;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowQuery$mapToList$$inlined$map$1 afterpayAppletCache = ((RealAfterpayAppletRepository) localHomePresenter.featureFlagManager).getAfterpayAppletCache();
                        AfterpayAppletActivityListEmbeddedPresenter$models$2$1$1 afterpayAppletActivityListEmbeddedPresenter$models$2$1$1 = new AfterpayAppletActivityListEmbeddedPresenter$models$2$1$1(localHomePresenter);
                        this.label = 1;
                        Object collect = afterpayAppletCache.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(afterpayAppletActivityListEmbeddedPresenter$models$2$1$1, i2), this);
                        if (collect != coroutineSingletons4) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    } else {
                        if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 5:
                    LocalHomePresenter localHomePresenter2 = (LocalHomePresenter) obj2;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) localHomePresenter2.embeddedMapEnabled$delegate;
                    AndroidStringManager androidStringManager = (AndroidStringManager) localHomePresenter2.neighborhoodsTabContentEnabled$delegate;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealAfterpayAppletMerchantSheetRepository realAfterpayAppletMerchantSheetRepository = (RealAfterpayAppletMerchantSheetRepository) localHomePresenter2.tabContentPresenterFactory;
                        String str = ((AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen) localHomePresenter2.syncer).merchantToken;
                        this.label = 1;
                        sheet = realAfterpayAppletMerchantSheetRepository.getSheet(str, this);
                        if (sheet == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        sheet = obj;
                    }
                    AfterpayAppletMerchantSheetRepository$MerchantSheetResult afterpayAppletMerchantSheetRepository$MerchantSheetResult = (AfterpayAppletMerchantSheetRepository$MerchantSheetResult) sheet;
                    if (afterpayAppletMerchantSheetRepository$MerchantSheetResult instanceof AfterpayAppletMerchantSheetRepository$MerchantSheetResult.Failure) {
                        parcelableSnapshotMutableState.setValue(new AfterpayAppletMerchantSheetViewModel.Error(androidStringManager.get(R.string.afterpay_applet_merchant_sheet_error_title), androidStringManager.get(R.string.afterpay_applet_merchant_sheet_retry_button_title)));
                    } else {
                        if (!(afterpayAppletMerchantSheetRepository$MerchantSheetResult instanceof AfterpayAppletMerchantSheetRepository$MerchantSheetResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        AfterpayMerchantSheet afterpayMerchantSheet = ((AfterpayAppletMerchantSheetRepository$MerchantSheetResult.Success) afterpayAppletMerchantSheetRepository$MerchantSheetResult).response;
                        try {
                            AfterpayAppletParsingErrorFactory afterpayAppletParsingErrorFactory = AfterpayAppletParsingErrorFactory.INSTANCE;
                            try {
                                ProtoValidationScope protoValidationScope = new ProtoValidationScope(afterpayMerchantSheet, afterpayAppletParsingErrorFactory, localHomePresenter2);
                                required = ProtoValidationScope.required(afterpayMerchantSheet.title, "title");
                                required2 = ProtoValidationScope.required(afterpayMerchantSheet.body, "body");
                                UiAvatar uiAvatar = afterpayMerchantSheet.avatar;
                                ProtoValidationScope.required(uiAvatar, "avatar");
                                avatar = StackedAvatarViewModelKt.toStackedAvatarViewModel(uiAvatar).avatar;
                                button = afterpayMerchantSheet.cta_button;
                                ProtoValidationScope.required(button, "cta_button");
                                required3 = ProtoValidationScope.required(button.l_text, "cta_button_text");
                                TapAction tapAction = button.tap_action;
                                tapViewModel = tapAction != null ? AfterpayAppletHomeMapperKt.toTapViewModel(protoValidationScope, tapAction) : null;
                            } catch (Exception e) {
                                throw RotateKt.toProtoParsingExceptionFor(e, afterpayMerchantSheet != null ? Reflection.factory.getOrCreateKotlinClass(AfterpayMerchantSheet.class) : null, afterpayAppletParsingErrorFactory, null);
                            }
                        } catch (ProtoParsingError e2) {
                            ((ErrorReporter) localHomePresenter2.clearMarketingBadgesIfNeeded).report(e2, (SampleStrategy) localHomePresenter2.store);
                        }
                        if (tapViewModel == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        AfterpayAppletMerchantSheetViewModel.Loaded.ButtonModel buttonModel = new AfterpayAppletMerchantSheetViewModel.Loaded.ButtonModel(required3, tapViewModel, AfterpayAppletHomeMapperKt.toProminence(button.prominence));
                        AfterpayMerchantSheet$Content$PasteboardTextLines afterpayMerchantSheet$Content$PasteboardTextLines = afterpayMerchantSheet.content;
                        if (afterpayMerchantSheet$Content$PasteboardTextLines == null || (pasteboardTextLines = afterpayMerchantSheet$Content$PasteboardTextLines.value) == null || (list = pasteboardTextLines.pasteboard_text_lines) == null) {
                            r6 = EmptyList.INSTANCE;
                        } else {
                            List list2 = list;
                            r6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                r6.add((String) it.next());
                            }
                        }
                        List list3 = r6;
                        AnalyticsEvent analyticsEvent = afterpayMerchantSheet.analytic_view_event;
                        AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec = analyticsEvent != null ? HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent) : null;
                        AnalyticsEvent analyticsEvent2 = afterpayMerchantSheet.analytic_dismiss_event;
                        obj3 = new AfterpayAppletMerchantSheetViewModel.Loaded(required, required2, avatar, buttonModel, list3, afterpayAppletAnalyticsEventsSpec, analyticsEvent2 != null ? HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent2) : null);
                        if (obj3 == null) {
                            obj3 = new AfterpayAppletMerchantSheetViewModel.Error(androidStringManager.get(R.string.afterpay_applet_merchant_sheet_error_title), androidStringManager.get(R.string.afterpay_applet_merchant_sheet_retry_button_title));
                        }
                        parcelableSnapshotMutableState.setValue(obj3);
                    }
                    return Unit.INSTANCE;
                case 6:
                    AfterpayAppletPurchasesEmbeddedPresenter afterpayAppletPurchasesEmbeddedPresenter = (AfterpayAppletPurchasesEmbeddedPresenter) obj2;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowQuery$mapToList$$inlined$map$1 afterpayAppletCache2 = afterpayAppletPurchasesEmbeddedPresenter.afterpayAppletRepository.getAfterpayAppletCache();
                        LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$22 = new LazyPagingItems$collectLoadState$2(afterpayAppletPurchasesEmbeddedPresenter, 26);
                        this.label = 1;
                        Object collect2 = afterpayAppletCache2.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(lazyPagingItems$collectLoadState$22, 9), this);
                        if (collect2 != coroutineSingletons6) {
                            collect2 = Unit.INSTANCE;
                        }
                        if (collect2 == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                    } else {
                        if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 7:
                    TooltipState tooltipState = (TooltipState) obj2;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        float floatValue = tooltipState._alpha$delegate.getFloatValue();
                        TweenSpec tween$default = AnimatableKt.tween$default(0, 0, null, 7);
                        TooltipState$hide$1$$ExternalSyntheticLambda0 tooltipState$hide$1$$ExternalSyntheticLambda0 = new TooltipState$hide$1$$ExternalSyntheticLambda0(tooltipState, 0);
                        this.label = 1;
                        if (AnimatableKt.animate$default(floatValue, RecyclerView.DECELERATION_RATE, tween$default, tooltipState$hide$1$$ExternalSyntheticLambda0, this, 4) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 8:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealBalancePrivacy realBalancePrivacy = (RealBalancePrivacy) ((TapToPayPresenter) obj2).profileManager;
                        this.label = 1;
                        if (realBalancePrivacy.toggleObfuscation(this) == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                    } else {
                        if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 9:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealBalancePrivacy realBalancePrivacy2 = (RealBalancePrivacy) ((TransfersPresenter) obj2).accountFormatter;
                        this.label = 1;
                        if (realBalancePrivacy2.toggleObfuscation(this) == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                    } else {
                        if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 10:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        OverdraftlyService overdraftlyService = (OverdraftlyService) ((LocalHomePresenter) obj2).store;
                        ComputeOverdraftSyncValuesRequest computeOverdraftSyncValuesRequest = new ComputeOverdraftSyncValuesRequest(null, ByteString.EMPTY);
                        this.label = 1;
                        if (overdraftlyService.computeOverdraftSyncValuesRequest(computeOverdraftSyncValuesRequest, this) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    } else {
                        if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 11:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        KeyValue keyValue = (KeyValue) ((LocalPosCheckInPresenter) obj2).launcher;
                        Boolean bool = Boolean.TRUE;
                        this.label = 1;
                        if (keyValue.set(bool, this) == coroutineSingletons11) {
                            return coroutineSingletons11;
                        }
                    } else {
                        if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 12:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (UnleashContext.access$refreshCashGreenSyncValues((UnleashContext) obj2, this) == coroutineSingletons12) {
                            return coroutineSingletons12;
                        }
                    } else {
                        if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 13:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (BankingBenefitsBookletPresenter.access$refreshCashGreenSyncValues((BankingBenefitsBookletPresenter) obj2, this) == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                    } else {
                        if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 14:
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (BenefitsHomePresenter.access$refreshCashGreenSyncValues((BenefitsHomePresenter) obj2, this) == coroutineSingletons14) {
                            return coroutineSingletons14;
                        }
                    } else {
                        if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 15:
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) obj2;
                        BitcoinDepositsPresenter$special$$inlined$filter$1 bitcoinDepositsPresenter$special$$inlined$filter$1 = (BitcoinDepositsPresenter$special$$inlined$filter$1) tapToPayPresenter.screen;
                        BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$1 = new BitcoinDepositsPresenter$models$2$1$1(tapToPayPresenter, b);
                        this.label = 1;
                        if (bitcoinDepositsPresenter$special$$inlined$filter$1.collect(bitcoinDepositsPresenter$models$2$1$1, this) == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    } else {
                        if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 16:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        MusicPresenter musicPresenter = (MusicPresenter) obj2;
                        this.label = 1;
                        BitcoinInvoiceEntryScreen bitcoinInvoiceEntryScreen = (BitcoinInvoiceEntryScreen) musicPresenter.args;
                        CryptoPayment cryptoPayment = bitcoinInvoiceEntryScreen.payment;
                        ((Analytics) musicPresenter.musicRepository).track(new CryptoSendStart(((cryptoPayment instanceof CryptoPayment.InvoicePayment) && ((CryptoPayment.InvoicePayment) cryptoPayment).source == CryptoPaymentSource.NFC_SCAN) ? CryptoSendStart.CryptoSendStartSource.NFC : CryptoSendStart.CryptoSendStartSource.DEEP_LINK), null);
                        Unit initiateCryptoPayment = ((RealCryptoFlowStarter) ((CryptoFlowStarter) musicPresenter.musicPlayer)).initiateCryptoPayment(bitcoinInvoiceEntryScreen.payment, PaymentScreens$HomeScreens$Home.INSTANCE, (BetterNavigator.ScreenNavigator) musicPresenter.navigator);
                        if (initiateCryptoPayment != coroutineSingletons16) {
                            initiateCryptoPayment = Unit.INSTANCE;
                        }
                        if (initiateCryptoPayment == coroutineSingletons16) {
                            return coroutineSingletons16;
                        }
                    } else {
                        if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 17:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i21 = this.label;
                    if (i21 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BitcoinStackingToolsInfoPresenter bitcoinStackingToolsInfoPresenter = (BitcoinStackingToolsInfoPresenter) obj2;
                        CryptoFlowStarter cryptoFlowStarter = bitcoinStackingToolsInfoPresenter.cryptoFlowStarter;
                        BetterNavigator.ScreenNavigator screenNavigator = bitcoinStackingToolsInfoPresenter.navigator;
                        this.label = 1;
                        if (((RealCryptoFlowStarter) cryptoFlowStarter).startBitcoinRoundUpsEnrollment(screenNavigator, this) == coroutineSingletons17) {
                            return coroutineSingletons17;
                        }
                    } else {
                        if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 18:
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealBitcoinInboundNavigator realBitcoinInboundNavigator = ((RealBitcoinHomeToolbarPresenter) obj2).bitcoinInboundNavigator;
                        BitcoinMapScreen.Source source = BitcoinMapScreen.Source.BITCOIN_APPLET_HEADER;
                        this.label = 1;
                        if (realBitcoinInboundNavigator.showBitcoinMap(source, this) == coroutineSingletons18) {
                            return coroutineSingletons18;
                        }
                    } else {
                        if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 19:
                    LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj2;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = this.label;
                    if (i23 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealBitcoinInboundNavigator realBitcoinInboundNavigator2 = (RealBitcoinInboundNavigator) localPosCheckInPresenter.cameraPermissions;
                        this.label = 1;
                        Object obj5 = realBitcoinInboundNavigator2.hasAcceptedBtcMapOnboardingScreen.set(Boolean.TRUE, this);
                        if (obj5 != coroutineSingletons19) {
                            obj5 = Unit.INSTANCE;
                        }
                        if (obj5 == coroutineSingletons19) {
                            return coroutineSingletons19;
                        }
                    } else {
                        if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    ((Analytics) localPosCheckInPresenter.stringManager).track(new CryptoSpendOnboard(), null);
                    ((BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator).goTo(new BitcoinMapScreen(((BitcoinMapOnboardingScreen) localPosCheckInPresenter.store).source));
                    return Unit.INSTANCE;
                case 20:
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.label;
                    if (i24 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BitcoinTransferPresenter bitcoinTransferPresenter = (BitcoinTransferPresenter) obj2;
                        if (bitcoinTransferPresenter.bitcoinEnqueueRequirementsEnabled) {
                            RealTransferRequirementHandler realTransferRequirementHandler = bitcoinTransferPresenter.transferRequirementHandler;
                            this.label = 1;
                            if (realTransferRequirementHandler.enqueueTransferRequirements(this) == coroutineSingletons20) {
                                return coroutineSingletons20;
                            }
                        }
                    } else {
                        if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 21:
                    BinaryBitmap binaryBitmap = (BinaryBitmap) obj2;
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) binaryBitmap.binarizer)).currentValue(AmplitudeExperiments$CashBitcoinSymbolDisplaySetting.INSTANCE)).enabled()) {
                            RealProfileManager realProfileManager = (RealProfileManager) binaryBitmap.matrix;
                            BitcoinDisplayUnits bitcoinDisplayUnits = BitcoinDisplayUnits.SATOSHIS;
                            this.label = 1;
                            if (realProfileManager.setBitcoinDisplayPreference(bitcoinDisplayUnits, this) == coroutineSingletons21) {
                                return coroutineSingletons21;
                            }
                        }
                    } else {
                        if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 22:
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.label;
                    if (i26 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (((CopyCheckIconState) obj2).showCheck(this) == coroutineSingletons22) {
                            return coroutineSingletons22;
                        }
                    } else {
                        if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 23:
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = this.label;
                    if (i27 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BlockerActionConfirmDialogPresenter blockerActionConfirmDialogPresenter = (BlockerActionConfirmDialogPresenter) obj2;
                        RealBlockersHelper realBlockersHelper = blockerActionConfirmDialogPresenter.blockersHelper;
                        BlockersScreens.BlockerActionConfirmDialogScreen blockerActionConfirmDialogScreen = blockerActionConfirmDialogPresenter.args;
                        BlockerAction blockerAction = blockerActionConfirmDialogScreen.positiveAction;
                        BlockerActionConfirmDialogPresenter$models$1$1$1$1 blockerActionConfirmDialogPresenter$models$1$1$1$1 = new BlockerActionConfirmDialogPresenter$models$1$1$1$1(2, null);
                        this.label = 1;
                        if (BlockersHelper.handleBlockerAction$default(realBlockersHelper, blockerAction, blockerActionConfirmDialogScreen, null, null, false, null, blockerActionConfirmDialogPresenter$models$1$1$1$1, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    } else {
                        if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 24:
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.label;
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        AmountBlockerPresenter amountBlockerPresenter = (AmountBlockerPresenter) obj2;
                        RealBlockersHelper realBlockersHelper2 = amountBlockerPresenter.blockersHelper;
                        BlockersScreens.AmountScreen amountScreen = amountBlockerPresenter.args;
                        BlockerAction blockerAction2 = amountScreen.dismissAction;
                        this.label = 1;
                        if (BlockersHelper.handleBlockerAction$default(realBlockersHelper2, blockerAction2, amountScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons24) {
                            return coroutineSingletons24;
                        }
                    } else {
                        if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 25:
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i29 = this.label;
                    if (i29 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        CardLockPresenter cardLockPresenter = (CardLockPresenter) obj2;
                        RealBlockersHelper realBlockersHelper3 = (RealBlockersHelper) cardLockPresenter.flowStarter;
                        BlockersScreens.BitcoinAmountScreen bitcoinAmountScreen = (BlockersScreens.BitcoinAmountScreen) cardLockPresenter.cashAppTagManager;
                        BlockerAction blockerAction3 = bitcoinAmountScreen.dismissAction;
                        this.label = 1;
                        if (BlockersHelper.handleBlockerAction$default(realBlockersHelper3, blockerAction3, bitcoinAmountScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons25) {
                            return coroutineSingletons25;
                        }
                    } else {
                        if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 26:
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i30 = this.label;
                    if (i30 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (CardStudioPresenter.access$verifyQrCode((CardStudioPresenter) obj2, this) == coroutineSingletons26) {
                            return coroutineSingletons26;
                        }
                    } else {
                        if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 27:
                    LocalPosCheckInPresenter localPosCheckInPresenter2 = (LocalPosCheckInPresenter) obj2;
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i31 = this.label;
                    if (i31 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow denials = ((PermissionChecker) localPosCheckInPresenter2.launcher).denials();
                        CardActivationQrScannerPresenter$models$1$1$2 cardActivationQrScannerPresenter$models$1$1$2 = new CardActivationQrScannerPresenter$models$1$1$2(localPosCheckInPresenter2);
                        this.label = 1;
                        Object collect3 = denials.collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(cardActivationQrScannerPresenter$models$1$1$2, 2), this);
                        if (collect3 != coroutineSingletons27) {
                            collect3 = Unit.INSTANCE;
                        }
                        if (collect3 == coroutineSingletons27) {
                            return coroutineSingletons27;
                        }
                    } else {
                        if (i31 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 28:
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i32 = this.label;
                    if (i32 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Duration.Companion companion = Duration.Companion;
                        long duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
                        this.label = 1;
                        if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons28) {
                            return coroutineSingletons28;
                        }
                    } else {
                        if (i32 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) obj2;
                    BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) endAppLockPresenter.accountOutboundNavigator;
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) endAppLockPresenter.navigatorSwitcher;
                    BlockersScreens.CheckmarkScreen checkmarkScreen = (BlockersScreens.CheckmarkScreen) endAppLockPresenter.appLockState;
                    screenNavigator2.goTo(blockersDataNavigator.getNext(checkmarkScreen, checkmarkScreen.blockersData));
                    return Unit.INSTANCE;
                default:
                    DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                    BlockersScreens.ClientScenarioLauncher clientScenarioLauncher = (BlockersScreens.ClientScenarioLauncher) disclosurePresenter.args;
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = this.label;
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Timber.Forest.i("Completing client scenario " + clientScenarioLauncher.clientScenario, new Object[0]);
                        Flow flowOn = FlowKt.flowOn(((RealClientScenarioCompleter) disclosurePresenter.analytics).completeClientScenario(clientScenarioLauncher.clientScenario, clientScenarioLauncher.analyticsData, clientScenarioLauncher.requester, clientScenarioLauncher.exitOnSuccess, clientScenarioLauncher.flow, clientScenarioLauncher.foreground, clientScenarioLauncher.customFlowToken, clientScenarioLauncher.paymentTokens, clientScenarioLauncher.promotionToken, clientScenarioLauncher.moneybotContext, clientScenarioLauncher.skipBiometrics), (CoroutineContext) disclosurePresenter.launcher);
                        ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$1 = new ClientScenarioLauncherPresenter$models$1$1$1(disclosurePresenter, b);
                        this.label = 1;
                        if (flowOn.collect(clientScenarioLauncherPresenter$models$1$1$1, this) == coroutineSingletons29) {
                            return coroutineSingletons29;
                        }
                    } else {
                        if (i33 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountPickerCondensedView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setGravity(17);
        Strings.applyStyle(appCompatTextView, TextStyles.mainTitle);
        appCompatTextView.setTextColor(colorPalette.label);
        this.titleView = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setGravity(17);
        Strings.applyStyle(appCompatTextView2, TextStyles.smallBody);
        appCompatTextView2.setTextColor(colorPalette.tertiaryLabel);
        this.subtitleView = appCompatTextView2;
        AmountSelector amountSelector = new AmountSelector(context, null);
        this.amountSelector = amountSelector;
        MooncakePillButton mooncakePillButton = new MooncakePillButton(context, null, MooncakePillButton.Size.LARGE, MooncakePillButton.Style.PRIMARY, 2, null);
        this.buttonView = mooncakePillButton;
        final int i = 3;
        final int i2 = 0;
        final int i3 = 1;
        final int i4 = 2;
        this.loadingHelper = new PausedCompositionImpl(this, CollectionsKt__CollectionsKt.arrayListOf(appCompatTextView, appCompatTextView2, mooncakePillButton), new ToolbarTuckTargets(LoadingHelper$Position.Center, new Overlay$$ExternalSyntheticLambda0(amountSelector, 11)), null, 50);
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.amountslider.AmountPickerCondensedView$$ExternalSyntheticLambda0
            public final /* synthetic */ AmountPickerCondensedView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i2;
                AmountPickerCondensedView amountPickerCondensedView = this.f$0;
                switch (i5) {
                    case 0:
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.buttonView));
                    case 1:
                        int i6 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 38) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.subtitleView));
                    case 2:
                        int i7 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 3:
                        int i8 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    case 4:
                        int i9 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 46) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.amountSelector));
                    case 5:
                        int i10 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        int i11 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - Views.dip((View) amountPickerCondensedView, 24));
                    case 7:
                        int i12 = AmountPickerCondensedView.$r8$clinit;
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 8:
                        int i13 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 9:
                        int i14 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    default:
                        int i15 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 6) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.titleView));
                }
            }
        });
        setRespectPadding(false);
        final int i5 = 5;
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.amountslider.AmountPickerCondensedView$$ExternalSyntheticLambda0
            public final /* synthetic */ AmountPickerCondensedView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i5;
                AmountPickerCondensedView amountPickerCondensedView = this.f$0;
                switch (i52) {
                    case 0:
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.buttonView));
                    case 1:
                        int i6 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 38) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.subtitleView));
                    case 2:
                        int i7 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 3:
                        int i8 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    case 4:
                        int i9 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 46) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.amountSelector));
                    case 5:
                        int i10 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        int i11 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - Views.dip((View) amountPickerCondensedView, 24));
                    case 7:
                        int i12 = AmountPickerCondensedView.$r8$clinit;
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 8:
                        int i13 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 9:
                        int i14 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    default:
                        int i15 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 6) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.titleView));
                }
            }
        });
        final int i6 = 6;
        leftTo.rightTo(1, new Function1(this) { // from class: com.squareup.cash.amountslider.AmountPickerCondensedView$$ExternalSyntheticLambda0
            public final /* synthetic */ AmountPickerCondensedView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i6;
                AmountPickerCondensedView amountPickerCondensedView = this.f$0;
                switch (i52) {
                    case 0:
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.buttonView));
                    case 1:
                        int i62 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 38) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.subtitleView));
                    case 2:
                        int i7 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 3:
                        int i8 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    case 4:
                        int i9 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 46) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.amountSelector));
                    case 5:
                        int i10 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        int i11 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - Views.dip((View) amountPickerCondensedView, 24));
                    case 7:
                        int i12 = AmountPickerCondensedView.$r8$clinit;
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 8:
                        int i13 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 9:
                        int i14 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    default:
                        int i15 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 6) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.titleView));
                }
            }
        });
        final int i7 = 7;
        ContourLayout.layoutBy$default(this, appCompatTextView, leftTo, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.amountslider.AmountPickerCondensedView$$ExternalSyntheticLambda0
            public final /* synthetic */ AmountPickerCondensedView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i7;
                AmountPickerCondensedView amountPickerCondensedView = this.f$0;
                switch (i52) {
                    case 0:
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.buttonView));
                    case 1:
                        int i62 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 38) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.subtitleView));
                    case 2:
                        int i72 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 3:
                        int i8 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    case 4:
                        int i9 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 46) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.amountSelector));
                    case 5:
                        int i10 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        int i11 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - Views.dip((View) amountPickerCondensedView, 24));
                    case 7:
                        int i12 = AmountPickerCondensedView.$r8$clinit;
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 8:
                        int i13 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 9:
                        int i14 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    default:
                        int i15 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 6) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.titleView));
                }
            }
        }));
        final int i8 = 8;
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.amountslider.AmountPickerCondensedView$$ExternalSyntheticLambda0
            public final /* synthetic */ AmountPickerCondensedView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i8;
                AmountPickerCondensedView amountPickerCondensedView = this.f$0;
                switch (i52) {
                    case 0:
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.buttonView));
                    case 1:
                        int i62 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 38) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.subtitleView));
                    case 2:
                        int i72 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 3:
                        int i82 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    case 4:
                        int i9 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 46) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.amountSelector));
                    case 5:
                        int i10 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        int i11 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - Views.dip((View) amountPickerCondensedView, 24));
                    case 7:
                        int i12 = AmountPickerCondensedView.$r8$clinit;
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 8:
                        int i13 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 9:
                        int i14 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    default:
                        int i15 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 6) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.titleView));
                }
            }
        });
        final int i9 = 9;
        leftTo2.rightTo(1, new Function1(this) { // from class: com.squareup.cash.amountslider.AmountPickerCondensedView$$ExternalSyntheticLambda0
            public final /* synthetic */ AmountPickerCondensedView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i9;
                AmountPickerCondensedView amountPickerCondensedView = this.f$0;
                switch (i52) {
                    case 0:
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.buttonView));
                    case 1:
                        int i62 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 38) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.subtitleView));
                    case 2:
                        int i72 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 3:
                        int i82 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    case 4:
                        int i92 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 46) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.amountSelector));
                    case 5:
                        int i10 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        int i11 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - Views.dip((View) amountPickerCondensedView, 24));
                    case 7:
                        int i12 = AmountPickerCondensedView.$r8$clinit;
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 8:
                        int i13 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 9:
                        int i14 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    default:
                        int i15 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 6) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.titleView));
                }
            }
        });
        final int i10 = 10;
        ContourLayout.layoutBy$default(this, appCompatTextView2, leftTo2, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.amountslider.AmountPickerCondensedView$$ExternalSyntheticLambda0
            public final /* synthetic */ AmountPickerCondensedView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i10;
                AmountPickerCondensedView amountPickerCondensedView = this.f$0;
                switch (i52) {
                    case 0:
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.buttonView));
                    case 1:
                        int i62 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 38) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.subtitleView));
                    case 2:
                        int i72 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 3:
                        int i82 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    case 4:
                        int i92 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 46) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.amountSelector));
                    case 5:
                        int i102 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        int i11 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - Views.dip((View) amountPickerCondensedView, 24));
                    case 7:
                        int i12 = AmountPickerCondensedView.$r8$clinit;
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 8:
                        int i13 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 9:
                        int i14 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    default:
                        int i15 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 6) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.titleView));
                }
            }
        }));
        ContourLayout.layoutBy$default(this, amountSelector, ContourLayout.centerHorizontallyTo(new CardMessageQueries$$ExternalSyntheticLambda1(23)), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.amountslider.AmountPickerCondensedView$$ExternalSyntheticLambda0
            public final /* synthetic */ AmountPickerCondensedView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i3;
                AmountPickerCondensedView amountPickerCondensedView = this.f$0;
                switch (i52) {
                    case 0:
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.buttonView));
                    case 1:
                        int i62 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 38) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.subtitleView));
                    case 2:
                        int i72 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 3:
                        int i82 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    case 4:
                        int i92 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 46) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.amountSelector));
                    case 5:
                        int i102 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        int i11 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - Views.dip((View) amountPickerCondensedView, 24));
                    case 7:
                        int i12 = AmountPickerCondensedView.$r8$clinit;
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 8:
                        int i13 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 9:
                        int i14 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    default:
                        int i15 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 6) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.titleView));
                }
            }
        }));
        ByteArrayProtoReader32 leftTo3 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.amountslider.AmountPickerCondensedView$$ExternalSyntheticLambda0
            public final /* synthetic */ AmountPickerCondensedView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i4;
                AmountPickerCondensedView amountPickerCondensedView = this.f$0;
                switch (i52) {
                    case 0:
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.buttonView));
                    case 1:
                        int i62 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 38) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.subtitleView));
                    case 2:
                        int i72 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 3:
                        int i82 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    case 4:
                        int i92 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 46) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.amountSelector));
                    case 5:
                        int i102 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        int i11 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - Views.dip((View) amountPickerCondensedView, 24));
                    case 7:
                        int i12 = AmountPickerCondensedView.$r8$clinit;
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 8:
                        int i13 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 9:
                        int i14 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    default:
                        int i15 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 6) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.titleView));
                }
            }
        });
        leftTo3.rightTo(1, new Function1(this) { // from class: com.squareup.cash.amountslider.AmountPickerCondensedView$$ExternalSyntheticLambda0
            public final /* synthetic */ AmountPickerCondensedView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i;
                AmountPickerCondensedView amountPickerCondensedView = this.f$0;
                switch (i52) {
                    case 0:
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.buttonView));
                    case 1:
                        int i62 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 38) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.subtitleView));
                    case 2:
                        int i72 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 3:
                        int i82 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    case 4:
                        int i92 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 46) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.amountSelector));
                    case 5:
                        int i102 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        int i11 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - Views.dip((View) amountPickerCondensedView, 24));
                    case 7:
                        int i12 = AmountPickerCondensedView.$r8$clinit;
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 8:
                        int i13 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 9:
                        int i14 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    default:
                        int i15 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 6) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.titleView));
                }
            }
        });
        final int i11 = 4;
        ContourLayout.layoutBy$default(this, mooncakePillButton, leftTo3, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.amountslider.AmountPickerCondensedView$$ExternalSyntheticLambda0
            public final /* synthetic */ AmountPickerCondensedView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i11;
                AmountPickerCondensedView amountPickerCondensedView = this.f$0;
                switch (i52) {
                    case 0:
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.buttonView));
                    case 1:
                        int i62 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 38) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.subtitleView));
                    case 2:
                        int i72 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 3:
                        int i82 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    case 4:
                        int i92 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 46) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.amountSelector));
                    case 5:
                        int i102 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 6:
                        int i112 = AmountPickerCondensedView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - Views.dip((View) amountPickerCondensedView, 24));
                    case 7:
                        int i12 = AmountPickerCondensedView.$r8$clinit;
                        return new YInt(Views.dip((View) amountPickerCondensedView, 24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 8:
                        int i13 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3816leftTENr5nQ(amountPickerCondensedView.titleView));
                    case 9:
                        int i14 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(amountPickerCondensedView.m3818rightTENr5nQ(amountPickerCondensedView.titleView));
                    default:
                        int i15 = AmountPickerCondensedView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(Views.dip((View) amountPickerCondensedView, 6) + amountPickerCondensedView.m3810bottomdBGyhoQ(amountPickerCondensedView.titleView));
                }
            }
        }));
        mooncakePillButton.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 19));
        ViewKt.whileEachAttached(this, EmptyCoroutineContext.INSTANCE, new AnonymousClass14(this, null, i2));
    }

    public final void setColors(int i) {
        this.amountSelector.setAccentColor(i);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(AmountPickerViewModel amountPickerViewModel) {
        amountPickerViewModel.getClass();
        if (amountPickerViewModel.equals(AmountPickerViewModel.InitialLoading.INSTANCE)) {
            return;
        }
        boolean z = amountPickerViewModel instanceof AmountPickerViewModel.Loading;
        PausedCompositionImpl pausedCompositionImpl = this.loadingHelper;
        MooncakePillButton mooncakePillButton = this.buttonView;
        if (z) {
            if (true != pausedCompositionImpl.reusable) {
                pausedCompositionImpl.setLoading(true);
                mooncakePillButton.setEnabled(false);
                return;
            }
            return;
        }
        if (!(amountPickerViewModel instanceof AmountPickerViewModel.Ready)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        if (pausedCompositionImpl.reusable) {
            pausedCompositionImpl.setLoading(false);
            mooncakePillButton.setEnabled(true);
        }
        AmountPickerViewModel.Ready ready = (AmountPickerViewModel.Ready) amountPickerViewModel;
        String str = ready.subtitle;
        this.titleView.setText(ready.title);
        AppCompatTextView appCompatTextView = this.subtitleView;
        if (str == null) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setVisibility(0);
            appCompatTextView.setText(str);
        }
        this.amountSelector.setModel(ready.amountSelections);
        mooncakePillButton.setText(ready.buttonText);
        mooncakePillButton.setEnabled(ready.buttonEnabled);
    }
}
