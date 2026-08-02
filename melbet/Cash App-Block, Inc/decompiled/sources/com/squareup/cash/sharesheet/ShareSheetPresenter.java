package com.squareup.cash.sharesheet;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.tracing.Trace;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahj;
import com.google.android.play.core.splitinstall.internal.zzi;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.calendar.viewmodels.CalendarTextStyle;
import com.squareup.cash.calendar.viewmodels.DotStyle;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.cdf.cash.CashDepositConfirmPendingConfirmation;
import com.squareup.cash.cdf.cash.CashWithdrawConfirmPendingConfirmation;
import com.squareup.cash.cdf.cashappscore.AppletState;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.earnings.presenters.payers.AddPayerCustomersPresenter$models$1$1;
import com.squareup.cash.exchangedata.api.FxExchangeRate;
import com.squareup.cash.exchangedata.real.RealFxExchangeRateStreamingSubscriber;
import com.squareup.cash.featureflags.AmplitudeExperiments$ShowMoneyTabTaxBanner;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.genericelements.backend.GenericTreeElementsData;
import com.squareup.cash.genericelements.backend.RealGenericTreeElementsRepo;
import com.squareup.cash.genericelements.presenters.RealGenericTreeElementsPresenter$Factory$Impl;
import com.squareup.cash.genericelements.presenters.api.GenericTreeElementsAnalyticsData;
import com.squareup.cash.genericelements.presenters.api.GenericTreeElementsItem;
import com.squareup.cash.genericelements.presenters.api.GenericTreeElementsRefreshTrigger$BoostContentUpdateTrigger;
import com.squareup.cash.genericelements.viewmodels.GenericAnalyticsData;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.history.payments.presenters.ProfilePaymentHistoryPresenter;
import com.squareup.cash.history.payments.presenters.ProfilePaymentHistoryPresenter$Factory$Impl;
import com.squareup.cash.history.payments.screens.PaymentHistoryScreens$ProfilePaymentHistory;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingDetailsViewModel;
import com.squareup.cash.investing.viewmodels.holdings.InvestmentType;
import com.squareup.cash.investing.viewmodels.holdings.Sector;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$HeaderState;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$State;
import com.squareup.cash.merchant.presenters.SquareLoyaltyDetailsPresenter$State;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantAnalytics;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantInfoFeedbackBottomSheetScreen;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.merchant.screens.SquareLoyaltyDetailsScreen;
import com.squareup.cash.merchant.viewmodels.MerchantBodyViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantHeaderViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantProfileContentViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewModel;
import com.squareup.cash.merchant.viewmodels.NavigationIcon;
import com.squareup.cash.merchant.viewmodels.SquareLoyaltyDetailsViewModel;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.navigation.CashPaymentPadOutboundNavigator$Factory$Impl;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$8$1;
import com.squareup.cash.paymentpad.presenters.FxExchangeRates;
import com.squareup.cash.paymentpad.presenters.LitePaymentPadPresenter$WhenMappings;
import com.squareup.cash.paymentpad.presenters.LitePaymentPadPresenter$models$1$1;
import com.squareup.cash.paymentpad.screens.LowDiskSpaceAlertDialogScreen;
import com.squareup.cash.paymentpad.viewmodels.ExchangeRatePreview;
import com.squareup.cash.paymentpad.viewmodels.LitePaymentPadViewModel;
import com.squareup.cash.paymentpad.viewmodels.LowDiskSpaceAlertViewModel$Main;
import com.squareup.cash.payments.common.PaymentScheduleFrequency;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.payments.screens.PaymentScheduleSelection;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.ScheduleCalendarDate;
import com.squareup.cash.payments.viewmodels.SchedulePaymentViewModel;
import com.squareup.cash.presenters.AccentColorsKt;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.screens.TransferOutScreen$Full;
import com.squareup.cash.savings.viewmodels.TransferOutViewModel$Ready;
import com.squareup.cash.score.applets.presenters.ScoreAppletTilePresenter$SyncValueTimeoutException;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewModel;
import com.squareup.cash.score.backend.RealScoreRepository;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareTarget;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$17$1;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.support.chat.backend.api.ChatPermission;
import com.squareup.cash.support.chat.backend.api.ChatStatus;
import com.squareup.cash.support.chat.backend.real.RealChatManager;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.cash.support.chat.presenters.ChatLoadingPresenter$loadSupportChat$1;
import com.squareup.cash.support.chat.presenters.ChatLoadingPresenter$models$1$1;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.tax.applets.presenters.RealTaxesAppletTileRepository;
import com.squareup.cash.tax.applets.presenters.TaxesAppletTileRepository;
import com.squareup.cash.tax.viewmodels.TaxesAppletTileModel;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$Factory$Impl;
import com.squareup.cash.transfers.presenters.InstrumentNotLinkedPresenter$WhenMappings;
import com.squareup.cash.transfers.presenters.InstrumentNotLinkedPresenter$models$1$1;
import com.squareup.cash.transfers.presenters.PendingTransfersConfirmationDialogPresenter$continueTransfer$1;
import com.squareup.cash.transfers.presenters.TransferActionProcessor$Factory$Impl;
import com.squareup.cash.transfers.screens.InstrumentNotLinkedScreen;
import com.squareup.cash.transfers.screens.PendingTransfersConfirmationDialog;
import com.squareup.cash.transfers.viewmodels.InstrumentNotLinkedViewModel;
import com.squareup.cash.transfers.viewmodels.PendingTransfersConfirmationViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.screens.DeclareCashTipBottomSheetScreen;
import com.squareup.cash.work.viewmodels.DeclareCashTipBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.kotterknife.Lazy;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder;
import com.squareup.protos.cash.marketdata.model.HoldingsDetails;
import com.squareup.protos.cash.marketdata.model.SectorsDetails;
import com.squareup.protos.cash.marketdata.server.GetETFDetailsResponse;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.GrpcStatus;
import com.squareup.wire.MoshiJsonIntegration;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.networking.StripeErrorMappingKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import designsystem.arcade.ArcadeColors;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.Tags;
import okhttp3.internal.platform.AndroidPlatform;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ShareSheetPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final Object analytics;
    public final Object modelUpdates;
    public final Object navigator;
    public final Object profileManager;
    public final Object shareTargetsManager;
    public final Object stringManager;

    /* loaded from: classes7.dex */
    public abstract class StateUpdate {

        public final class DataUpdated extends StateUpdate {
            public final String headerText;
            public final List shareTargets;

            public DataUpdated(String str, List list) {
                str.getClass();
                list.getClass();
                this.headerText = str;
                this.shareTargets = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DataUpdated)) {
                    return false;
                }
                DataUpdated dataUpdated = (DataUpdated) obj;
                return Intrinsics.areEqual(this.headerText, dataUpdated.headerText) && Intrinsics.areEqual(this.shareTargets, dataUpdated.shareTargets);
            }

            public final int hashCode() {
                return this.shareTargets.hashCode() + (this.headerText.hashCode() * 31);
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("DataUpdated(headerText=", this.headerText, ", shareTargets=", ")", this.shareTargets);
            }
        }

        public final class SharingCompleted extends StateUpdate {
            public final ShareTargetsManager$ShareResult result;

            public SharingCompleted(ShareTargetsManager$ShareResult shareTargetsManager$ShareResult) {
                shareTargetsManager$ShareResult.getClass();
                this.result = shareTargetsManager$ShareResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SharingCompleted) && Intrinsics.areEqual(this.result, ((SharingCompleted) obj).result);
            }

            public final int hashCode() {
                return this.result.hashCode();
            }

            public final String toString() {
                return "SharingCompleted(result=" + this.result + ")";
            }
        }
    }

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareTarget.Id.values().length];
            try {
                ShareTarget.Id id = ShareTarget.Id.X_TARGET_ID;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ShareTarget.Id id2 = ShareTarget.Id.X_TARGET_ID;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ShareTarget.Id id3 = ShareTarget.Id.X_TARGET_ID;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ShareTarget.Id id4 = ShareTarget.Id.X_TARGET_ID;
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ShareSheetPresenter(RealTransfersInboundNavigator$Factory$Impl realTransfersInboundNavigator$Factory$Impl, AndroidStringManager androidStringManager, Analytics analytics, PendingTransfersConfirmationDialog pendingTransfersConfirmationDialog, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 13;
        pendingTransfersConfirmationDialog.getClass();
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.shareTargetsManager = pendingTransfersConfirmationDialog;
        this.navigator = screenNavigator;
        this.profileManager = realTransfersInboundNavigator$Factory$Impl.create$1(screenNavigator);
        TransferData transferData = pendingTransfersConfirmationDialog.destinationParams.blockersData.transferData;
        transferData.getClass();
        this.modelUpdates = transferData.f1215type;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f1, code lost:
    
        if (r1 == r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0115, code lost:
    
        if (r1 == r13) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$continueTransfer(ShareSheetPresenter shareSheetPresenter, ContinuationImpl continuationImpl) {
        PendingTransfersConfirmationDialogPresenter$continueTransfer$1 pendingTransfersConfirmationDialogPresenter$continueTransfer$1;
        int i;
        Screen screen;
        Lazy lazy = (Lazy) shareSheetPresenter.profileManager;
        PendingTransfersConfirmationDialog pendingTransfersConfirmationDialog = (PendingTransfersConfirmationDialog) shareSheetPresenter.shareTargetsManager;
        Analytics analytics = (Analytics) shareSheetPresenter.analytics;
        if (continuationImpl instanceof PendingTransfersConfirmationDialogPresenter$continueTransfer$1) {
            pendingTransfersConfirmationDialogPresenter$continueTransfer$1 = (PendingTransfersConfirmationDialogPresenter$continueTransfer$1) continuationImpl;
            int i2 = pendingTransfersConfirmationDialogPresenter$continueTransfer$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pendingTransfersConfirmationDialogPresenter$continueTransfer$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pendingTransfersConfirmationDialogPresenter$continueTransfer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pendingTransfersConfirmationDialogPresenter$continueTransfer$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    int ordinal = ((TransferType) shareSheetPresenter.modelUpdates).ordinal();
                    if (ordinal == 0) {
                        analytics.track(new CashDepositConfirmPendingConfirmation(), null);
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        analytics.track(new CashWithdrawConfirmPendingConfirmation(), null);
                    }
                    BlockersData blockersData = pendingTransfersConfirmationDialog.destinationParams.blockersData;
                    TransferData transferData = blockersData.transferData;
                    transferData.getClass();
                    BlockersData copy$default = BlockersData.copy$default(blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, TransferData.copy$default(transferData, null, null, null, null, null, null, null, null, 28671), null, null, null, null, null, null, null, null, null, false, null, null, null, -1, 65531);
                    PendingTransfersConfirmationDialog.DestinationParams destinationParams = pendingTransfersConfirmationDialog.destinationParams;
                    int ordinal2 = pendingTransfersConfirmationDialog.destination.ordinal();
                    if (ordinal2 == 0) {
                        Money money = destinationParams.initialAmount;
                        String str = destinationParams.instrumentToken;
                        String str2 = destinationParams.customTitle;
                        Money money2 = destinationParams.customSuggestedAmount;
                        boolean z = destinationParams.startInKeypad;
                        pendingTransfersConfirmationDialogPresenter$continueTransfer$1.label = 1;
                        lazy.getClass();
                        obj = Lazy.checkPendingBeforeStartFlow$default(lazy, copy$default, money, str, PendingTransfersConfirmationDialog.Destination.ADD_MONEY, null, str2, money2, z, 16);
                    } else {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Money money3 = destinationParams.initialAmount;
                        String str3 = destinationParams.instrumentToken;
                        pendingTransfersConfirmationDialogPresenter$continueTransfer$1.label = 2;
                        obj = Lazy.startWithdrawFlow$default(lazy, copy$default, money3, str3, 8);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    screen = (Screen) obj;
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    screen = (Screen) obj;
                }
                ((BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator).goTo(screen);
                return Unit.INSTANCE;
            }
        }
        pendingTransfersConfirmationDialogPresenter$continueTransfer$1 = new PendingTransfersConfirmationDialogPresenter$continueTransfer$1(shareSheetPresenter, continuationImpl);
        Object obj2 = pendingTransfersConfirmationDialogPresenter$continueTransfer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pendingTransfersConfirmationDialogPresenter$continueTransfer$1.label;
        if (i != 0) {
        }
        ((BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator).goTo(screen);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        if (r14 == r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        if (r14 == r8) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadSupportChat(ShareSheetPresenter shareSheetPresenter, ContinuationImpl continuationImpl) {
        ChatLoadingPresenter$loadSupportChat$1 chatLoadingPresenter$loadSupportChat$1;
        int i;
        int ordinal;
        List list;
        List list2;
        RealChatManager realChatManager = (RealChatManager) shareSheetPresenter.shareTargetsManager;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator;
        SupportChatScreens.FlowScreen.ChatLoading chatLoading = (SupportChatScreens.FlowScreen.ChatLoading) shareSheetPresenter.modelUpdates;
        if (continuationImpl instanceof ChatLoadingPresenter$loadSupportChat$1) {
            chatLoadingPresenter$loadSupportChat$1 = (ChatLoadingPresenter$loadSupportChat$1) continuationImpl;
            int i2 = chatLoadingPresenter$loadSupportChat$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                chatLoadingPresenter$loadSupportChat$1.label = i2 - PKIFailureInfo.systemUnavail;
                ChatLoadingPresenter$loadSupportChat$1 chatLoadingPresenter$loadSupportChat$12 = chatLoadingPresenter$loadSupportChat$1;
                Object obj = chatLoadingPresenter$loadSupportChat$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatLoadingPresenter$loadSupportChat$12.label;
                int i3 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((AndroidNotificationManager) shareSheetPresenter.profileManager).cancelAll(5);
                    String str = chatLoading.entityId;
                    String str2 = chatLoading.nodeToken;
                    String str3 = chatLoading.flowToken;
                    BlockersData.MoneybotContext moneybotContext = chatLoading.moneybotContext;
                    String str4 = moneybotContext != null ? moneybotContext.sessionId : null;
                    chatLoadingPresenter$loadSupportChat$12.label = 1;
                    obj = realChatManager.openChat(str, str2, str3, str4, chatLoadingPresenter$loadSupportChat$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            list2 = chatLoadingPresenter$loadSupportChat$12.L$1;
                            SafeTrace.throwOnFailure(obj);
                            screenNavigator.goTo(new SupportChatScreens.FlowScreen.ChatScreen(chatLoading.flowToken, list2, false));
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ChatStatus chatStatus = (ChatStatus) obj;
                        ChatStatus.Enabled enabled = chatStatus instanceof ChatStatus.Enabled ? (ChatStatus.Enabled) chatStatus : null;
                        if (enabled == null || (list = enabled.ignoredPhrases) == null) {
                            list = EmptyList.INSTANCE;
                        }
                        ChatLoadingPresenter$models$1$1 chatLoadingPresenter$models$1$1 = new ChatLoadingPresenter$models$1$1(shareSheetPresenter, continuation, i3);
                        chatLoadingPresenter$loadSupportChat$12.L$1 = list;
                        chatLoadingPresenter$loadSupportChat$12.label = 3;
                        if (JobKt.withTimeoutOrNull(3000L, chatLoadingPresenter$models$1$1, chatLoadingPresenter$loadSupportChat$12) != coroutineSingletons) {
                            list2 = list;
                            screenNavigator.goTo(new SupportChatScreens.FlowScreen.ChatScreen(chatLoading.flowToken, list2, false));
                            return Unit.INSTANCE;
                        }
                        return coroutineSingletons;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ordinal = ((ChatPermission) obj).ordinal();
                if (ordinal == 0) {
                    if (ordinal != 1 && ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.goTo(Back.INSTANCE);
                    AndroidStringManager androidStringManager = (AndroidStringManager) shareSheetPresenter.stringManager;
                    screenNavigator.goTo(new SupportChatScreens.SupportChatDialogs.ChatErrorDialog(androidStringManager.get(R.string.support_chat_permission_unknown_title), androidStringManager.get(R.string.support_chat_permission_unknown_message)));
                    return Unit.INSTANCE;
                }
                chatLoadingPresenter$loadSupportChat$12.label = 2;
                obj = realChatManager.getChatStatus(chatLoadingPresenter$loadSupportChat$12);
            }
        }
        chatLoadingPresenter$loadSupportChat$1 = new ChatLoadingPresenter$loadSupportChat$1(shareSheetPresenter, continuationImpl);
        ChatLoadingPresenter$loadSupportChat$1 chatLoadingPresenter$loadSupportChat$122 = chatLoadingPresenter$loadSupportChat$1;
        Object obj2 = chatLoadingPresenter$loadSupportChat$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatLoadingPresenter$loadSupportChat$122.label;
        int i32 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        ordinal = ((ChatPermission) obj2).ordinal();
        if (ordinal == 0) {
        }
    }

    public static Money convertTo(Money money, CurrencyCode currencyCode, FxExchangeRate fxExchangeRate) {
        Long l = money.amount;
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        CurrencyCode currencyCode2 = money.currency_code;
        if (currencyCode2 == currencyCode) {
            return money;
        }
        if (longValue == 0) {
            return new Money((Long) 0L, currencyCode, 4);
        }
        if (fxExchangeRate == null) {
            return null;
        }
        CurrencyCode currencyCode3 = fxExchangeRate.toCurrency;
        CurrencyCode currencyCode4 = fxExchangeRate.fromCurrency;
        if (currencyCode2 == currencyCode4 && currencyCode == currencyCode3) {
            return StripeErrorMappingKt.convert(fxExchangeRate, money);
        }
        if (currencyCode2 != currencyCode3 || currencyCode != currencyCode4) {
            return null;
        }
        try {
            BigDecimal valueOf = BigDecimal.valueOf(longValue);
            valueOf.getClass();
            return new Money(Long.valueOf(valueOf.divide(fxExchangeRate.rate, 0, RoundingMode.HALF_UP).longValueExact()), currencyCode, 4);
        } catch (ArithmeticException unused) {
            return null;
        }
    }

    private final Object models$com$squareup$cash$payments$presenters$SchedulePaymentPresenter(Flow flow, Composer composer, int i) {
        LocalDate localDate;
        Object obj;
        boolean z;
        Object obj2;
        Object obj3;
        Object shoppingWebPresenter$models$17$1;
        Unit unit;
        PaymentScreens.SchedulePayment schedulePayment = (PaymentScreens.SchedulePayment) this.modelUpdates;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-961274603);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj4 = Composer.Companion.Empty;
        if (rememberedValue == obj4) {
            rememberedValue = DimensionKt.nowLocalDate((AndroidClock) this.shareTargetsManager);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        LocalDate localDate2 = (LocalDate) rememberedValue;
        boolean changed = gapComposer.changed(localDate2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == obj4) {
            LocalDate with = localDate2.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
            Locale locale = Locale.getDefault();
            DateTimeFormatter withLocale = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);
            ArrayList arrayList = new ArrayList(364);
            int i2 = 0;
            for (int i3 = 364; i2 < i3; i3 = 364) {
                LocalDate plusDays = with.plusDays(i2);
                boolean isBefore = plusDays.isBefore(localDate2);
                CalendarTextStyle calendarTextStyle = isBefore ? CalendarTextStyle.DISABLED : CalendarTextStyle.STANDARD;
                int i4 = plusDays.get(ChronoField.DAY_OF_MONTH);
                String displayName = plusDays.getDayOfWeek().getDisplayName(TextStyle.NARROW, locale);
                displayName.getClass();
                String displayName2 = plusDays.getMonth().getDisplayName(TextStyle.SHORT, locale);
                displayName2.getClass();
                locale.getClass();
                String upperCase = displayName2.toUpperCase(locale);
                upperCase.getClass();
                String format2 = withLocale.format(plusDays);
                format2.getClass();
                arrayList.add(new ScheduleCalendarDate(plusDays, i4, displayName, upperCase, format2, calendarTextStyle, calendarTextStyle, plusDays.isEqual(localDate2) ? DotStyle.STANDARD : DotStyle.NONE, !isBefore, plusDays.isEqual(localDate2)));
                i2++;
            }
            rememberedValue2 = Tags.toImmutableList(arrayList);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        ImmutableList<ScheduleCalendarDate> immutableList = (ImmutableList) rememberedValue2;
        boolean changed2 = gapComposer.changed(androidStringManager);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue3 == obj4) {
            rememberedValue3 = Tags.toImmutableList(CollectionsKt__CollectionsKt.listOf((Object[]) new SchedulePaymentViewModel.FrequencyOption[]{new SchedulePaymentViewModel.FrequencyOption(PaymentScheduleFrequency.WEEKLY, androidStringManager.get(R.string.schedule_payment_frequency_weekly)), new SchedulePaymentViewModel.FrequencyOption(PaymentScheduleFrequency.BIWEEKLY, androidStringManager.get(R.string.schedule_payment_frequency_biweekly)), new SchedulePaymentViewModel.FrequencyOption(PaymentScheduleFrequency.MONTHLY, androidStringManager.get(R.string.schedule_payment_frequency_monthly))}));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        ImmutableList immutableList2 = (ImmutableList) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj4) {
            PaymentScheduleSelection paymentScheduleSelection = schedulePayment.initialSelection;
            if (paymentScheduleSelection == null || (rememberedValue4 = paymentScheduleSelection.frequency) == null) {
                rememberedValue4 = PaymentScheduleFrequency.WEEKLY;
            }
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        PaymentScheduleFrequency paymentScheduleFrequency = (PaymentScheduleFrequency) rememberedValue4;
        boolean changed3 = gapComposer.changed(localDate2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue5 == obj4) {
            PaymentScheduleSelection paymentScheduleSelection2 = schedulePayment.initialSelection;
            if (paymentScheduleSelection2 != null && (localDate = paymentScheduleSelection2.date) != null) {
                if (localDate.isBefore(localDate2)) {
                    localDate = null;
                }
                if (localDate != null) {
                    rememberedValue5 = localDate;
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
            }
            rememberedValue5 = localDate2;
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        LocalDate localDate3 = (LocalDate) rememberedValue5;
        if (schedulePayment.initialSelection != null) {
            obj = null;
            z = true;
        } else {
            obj = null;
            z = false;
        }
        String str = schedulePayment.paymentToken;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj4) {
            rememberedValue6 = Updater.mutableStateOf$default(paymentScheduleFrequency);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState = (MutableState) rememberedValue6;
        boolean changed4 = gapComposer.changed(immutableList);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changed4 || rememberedValue7 == obj4) {
            Iterator<E> it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = obj;
                    obj3 = obj2;
                    break;
                }
                obj3 = it.next();
                obj2 = obj;
                if (((ScheduleCalendarDate) obj3).date.isEqual(localDate3)) {
                    break;
                }
                obj = obj2;
            }
            r11 = (ScheduleCalendarDate) obj3;
            if (r11 == null) {
                for (ScheduleCalendarDate scheduleCalendarDate : immutableList) {
                    if (scheduleCalendarDate.date.isEqual(localDate2)) {
                    }
                }
                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                return obj2;
            }
            rememberedValue7 = Updater.mutableStateOf$default(scheduleCalendarDate);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState2 = (MutableState) rememberedValue7;
        Unit unit2 = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(str) | gapComposer.changed(z) | gapComposer.changedInstance(localDate2) | gapComposer.changedInstance(localDate3);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue8 == obj4) {
            unit = unit2;
            shoppingWebPresenter$models$17$1 = new ShoppingWebPresenter$models$17$1(this, str, z, paymentScheduleFrequency, localDate2, localDate3, (Continuation) null);
            gapComposer.updateRememberedValue(shoppingWebPresenter$models$17$1);
        } else {
            unit = unit2;
            shoppingWebPresenter$models$17$1 = rememberedValue8;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) shoppingWebPresenter$models$17$1);
        Updater.LaunchedEffect(gapComposer, flow, new AddPayerCustomersPresenter$models$1$1(flow, (Continuation) null, this, str, z, paymentScheduleFrequency, localDate3, localDate2, immutableList, mutableState, mutableState2));
        boolean changed5 = gapComposer.changed(((ScheduleCalendarDate) mutableState2.getValue()).date) | gapComposer.changed(localDate2) | gapComposer.changed(((PaymentScheduleFrequency) mutableState.getValue()).ordinal());
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changed5 || rememberedValue9 == obj4) {
            PaymentScheduleSelection paymentScheduleSelection3 = new PaymentScheduleSelection(((ScheduleCalendarDate) mutableState2.getValue()).date, (PaymentScheduleFrequency) mutableState.getValue());
            rememberedValue9 = zzahj.disclaimerText(paymentScheduleSelection3, androidStringManager, zzahj.startDateText(paymentScheduleSelection3, localDate2, androidStringManager, (AndroidDateFormatManager) this.profileManager));
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        SchedulePaymentViewModel schedulePaymentViewModel = new SchedulePaymentViewModel(immutableList2, (PaymentScheduleFrequency) mutableState.getValue(), immutableList, (ScheduleCalendarDate) mutableState2.getValue(), schedulePayment.initialSelection != null, (String) rememberedValue9);
        gapComposer.end(false);
        return schedulePaymentViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r8v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.ArrayList] */
    private final Object models$com$squareup$cash$score$applets$presenters$ScoreAppletTilePresenter(Flow flow, Composer composer, int i) {
        Object loading;
        String str;
        LocalizedString localizedString;
        LocalizedString localizedString2;
        String str2;
        ?? r8;
        List list;
        flow.getClass();
        ?? r7 = (GapComposer) composer;
        r7.startReplaceGroup(375332550);
        Object rememberedValue = r7.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = ((RealScoreRepository) this.shareTargetsManager).cashCreditScoreEntryPointData();
            r7.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, r7, 48, 2);
        String str3 = ((AndroidStringManager) this.stringManager).get(R.string.score_applets_presenters_offline_entry_point_title);
        CashCreditScoreEntryPointData cashCreditScoreEntryPointData = (CashCreditScoreEntryPointData) collectAsState.getValue();
        Continuation continuation = null;
        if (cashCreditScoreEntryPointData != null) {
            CashCreditScoreEntryPointData.UninstalledState uninstalledState = cashCreditScoreEntryPointData.uninstalled_state;
            CashCreditScoreEntryPointData.InstalledState installedState = cashCreditScoreEntryPointData.installed_state;
            str3.getClass();
            CashCreditScoreEntryPointData.Action action = cashCreditScoreEntryPointData.action;
            try {
                if (installedState != null) {
                    CashCreditScoreEntryPointData.InstalledState.Subtitle subtitle = installedState.subtitle;
                    LocalizedString localizedString3 = installedState.title;
                    localizedString3.getClass();
                    String str4 = localizedString3.translated_value;
                    str4.getClass();
                    Integer num = installedState.score;
                    num.getClass();
                    String valueOf = String.valueOf(num.intValue());
                    subtitle.getClass();
                    LocalizedString localizedString4 = subtitle.emphasis;
                    String str5 = localizedString4 != null ? localizedString4.translated_value : null;
                    LocalizedString localizedString5 = subtitle.brief;
                    String str6 = localizedString5 != null ? localizedString5.translated_value : null;
                    LocalizedString localizedString6 = subtitle.accessibility_description;
                    ScoreAppletTileViewModel.Installed.Subtitle subtitle2 = new ScoreAppletTileViewModel.Installed.Subtitle(str5, str6, localizedString6 != null ? localizedString6.translated_value : null);
                    CashCreditScoreEntryPointData.InstalledState.Graph graph = installedState.graph;
                    if (graph == null || (list = graph.items) == null) {
                        r8 = EmptyList.INSTANCE;
                    } else {
                        r8 = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Float f = ((CashCreditScoreEntryPointData.InstalledState.Graph.Item) it.next()).fill_fraction;
                            Float valueOf2 = f != null ? Float.valueOf(RangesKt___RangesKt.coerceIn(f.floatValue(), RecyclerView.DECELERATION_RATE, 1.0f)) : null;
                            if (valueOf2 != null) {
                                r8.add(valueOf2);
                            }
                        }
                    }
                    List list2 = r8;
                    action.getClass();
                    loading = new ScoreAppletTileViewModel.Installed(str4, valueOf, subtitle2, list2, action);
                } else {
                    if (uninstalledState == null) {
                        throw new IllegalArgumentException("Missing CashCreditScoreEntryPointData state");
                    }
                    LocalizedString localizedString7 = uninstalledState.title;
                    localizedString7.getClass();
                    String str7 = localizedString7.translated_value;
                    str7.getClass();
                    LocalizedString localizedString8 = uninstalledState.subtitle;
                    if (localizedString8 == null || (str2 = localizedString8.translated_value) == null) {
                        str2 = "";
                    }
                    action.getClass();
                    loading = new ScoreAppletTileViewModel.Uninstalled(str7, str2, action);
                }
            } catch (Exception e) {
                if (installedState == null || (localizedString2 = installedState.title) == null || (str = localizedString2.translated_value) == null) {
                    str = (uninstalledState == null || (localizedString = uninstalledState.title) == null) ? null : localizedString.translated_value;
                    if (str == null) {
                        str = str3;
                    }
                }
                loading = new ScoreAppletTileViewModel.Failure(str, e);
            }
        } else {
            loading = new ScoreAppletTileViewModel.Loading(str3);
        }
        Object[] objArr = new Object[0];
        Object rememberedValue2 = r7.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = new DateScrubber$$ExternalSyntheticLambda0(23);
            r7.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, r7, 48);
        if (!(loading instanceof ScoreAppletTileViewModel.Loading)) {
            mutableState.setValue(Boolean.FALSE);
        }
        boolean changedInstance = r7.changedInstance(loading) | r7.changed(mutableState);
        Object rememberedValue3 = r7.rememberedValue();
        if (changedInstance || rememberedValue3 == obj) {
            rememberedValue3 = new RingtoneView.AnonymousClass1(loading, mutableState, continuation, 29);
            r7.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect((Composer) r7, loading, (Function2) rememberedValue3);
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            loading = new ScoreAppletTileViewModel.Failure(str3, new ScoreAppletTilePresenter$SyncValueTimeoutException("Timed out waiting for entryPointData"));
        }
        Updater.LaunchedEffect((Composer) r7, flow, new RealQrCodesPresenter$models$1$1(flow, continuation, this, Updater.rememberUpdatedState(loading, r7), 18));
        boolean changedInstance2 = r7.changedInstance(loading) | r7.changedInstance(this);
        Object rememberedValue4 = r7.rememberedValue();
        if (changedInstance2 || rememberedValue4 == obj) {
            rememberedValue4 = new ProfileCropView.AnonymousClass3(loading, this, continuation, 11);
            r7.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect((Composer) r7, loading, (Function2) rememberedValue4);
        r7.end(false);
        return loading;
    }

    public static AppletState toCdfAppletState(ScoreAppletTileViewModel scoreAppletTileViewModel) {
        if ((scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Loading) || (scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Failure)) {
            return null;
        }
        if (scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Installed) {
            return AppletState.INSTALLED;
        }
        if (scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Uninstalled) {
            return AppletState.UNINSTALLED;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0b51  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0bc1  */
    /* JADX WARN: Type inference failed for: r1v67, types: [com.squareup.cash.history.payments.presenters.ProfilePaymentHistoryPresenter$Factory$Impl] */
    /* JADX WARN: Type inference failed for: r2v14, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v160 */
    /* JADX WARN: Type inference failed for: r2v161 */
    /* JADX WARN: Type inference failed for: r2v19, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.squareup.protos.cash.cashface.ui.GenericProfileElement$ActivityStatsElement, java.lang.String] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        boolean z;
        boolean z2;
        InvestmentType investmentType;
        HoldingsDetails holdingsDetails;
        List list;
        SectorsDetails sectorsDetails;
        HoldingsDetails holdingsDetails2;
        boolean z3;
        Recipient recipient;
        MutableState mutableState2;
        Recipient recipient2;
        String str;
        String str2;
        boolean z4;
        Loadable.Loading loading;
        MutableState mutableState3;
        MutableState mutableState4;
        Continuation continuation;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        NeverEqualPolicy neverEqualPolicy;
        Continuation continuation2;
        Loadable loadable;
        Object obj;
        Integer num;
        GapComposer gapComposer;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        MutableState mutableState8;
        MutableState mutableState9;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2;
        Continuation continuation3;
        ?? r4;
        Object rememberedValue;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        int ordinal;
        NavigationIcon navigationIcon;
        Loadable loadable2;
        MutableState mutableState10;
        MutableState mutableState11;
        CurrencyCode currencyCode;
        Money convertTo;
        String str3;
        ExchangeRatePreview exchangeRatePreview;
        String str4;
        String str5;
        ShareSheetPresenter shareSheetPresenter = this;
        int i2 = shareSheetPresenter.$r8$classId;
        Loadable.Loading loading2 = Loadable.Loading.INSTANCE;
        GenericTreeElementsViewModel.Loading loading3 = GenericTreeElementsViewModel.Loading.INSTANCE;
        int i3 = 15;
        int i4 = 17;
        int i5 = 25;
        int i6 = 8;
        Object obj2 = shareSheetPresenter.profileManager;
        int i7 = 2;
        Object obj3 = shareSheetPresenter.shareTargetsManager;
        Object obj4 = shareSheetPresenter.modelUpdates;
        Object obj5 = shareSheetPresenter.stringManager;
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        int i8 = 0;
        Continuation continuation4 = null;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(894682838);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy2) {
                    rememberedValue4 = Updater.mutableStateOf$default(new ShareSheetViewModel("", null, null, EmptyList.INSTANCE, false));
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState12 = (MutableState) rememberedValue4;
                Object rememberedValue5 = gapComposer2.rememberedValue();
                Continuation continuation5 = null;
                if (rememberedValue5 == neverEqualPolicy2) {
                    rememberedValue5 = Updater.mutableStateOf$default(null);
                    gapComposer2.updateRememberedValue(rememberedValue5);
                }
                MutableState mutableState13 = (MutableState) rememberedValue5;
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer2.changedInstance(shareSheetPresenter);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue6 == neverEqualPolicy2) {
                    rememberedValue6 = new ShoppingWebBridge$loadUrl$1(shareSheetPresenter, mutableState13, null, 6);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue6);
                ShareSheetViewModel shareSheetViewModel = (ShareSheetViewModel) mutableState12.getValue();
                StateUpdate stateUpdate = (StateUpdate) mutableState13.getValue();
                if (shareSheetViewModel == null || stateUpdate == null) {
                    mutableState = mutableState12;
                    z = false;
                    gapComposer2.startReplaceGroup(-1383879796);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-1383927846);
                    mutableState = mutableState12;
                    Updater.LaunchedEffect(shareSheetViewModel, stateUpdate, new MoleculeKt$immediateClockFlow$1$1$1(shareSheetViewModel, stateUpdate, (Continuation) null, this, mutableState12, 28), gapComposer2);
                    z = false;
                    gapComposer2.end(false);
                }
                Updater.LaunchedEffect(gapComposer2, flow, new RealQrCodesPresenter$models$1$1(flow, continuation5, this, mutableState13, 20));
                ShareSheetViewModel shareSheetViewModel2 = (ShareSheetViewModel) mutableState.getValue();
                gapComposer2.end(z);
                return shareSheetViewModel2;
            case 1:
                AndroidStringManager androidStringManager = (AndroidStringManager) obj5;
                AndroidClock androidClock = (AndroidClock) obj2;
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-1919984299);
                Object rememberedValue7 = gapComposer3.rememberedValue();
                if (rememberedValue7 == neverEqualPolicy2) {
                    rememberedValue7 = ((RealInvestingMetrics) obj3).getETFMetrics(((InvestingScreens.EtfHoldingsDetailsScreen) obj4).investmentEntityToken);
                    gapComposer3.updateRememberedValue(rememberedValue7);
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue7, null, null, gapComposer3, 48, 2);
                if (((GetETFDetailsResponse) collectAsState.getValue()) == null) {
                    gapComposer3.end(false);
                    return InvestingEtfHoldingDetailsViewModel.Loading.INSTANCE;
                }
                boolean changed2 = gapComposer3.changed((GetETFDetailsResponse) collectAsState.getValue());
                Object rememberedValue8 = gapComposer3.rememberedValue();
                if (changed2 || rememberedValue8 == neverEqualPolicy2) {
                    GetETFDetailsResponse getETFDetailsResponse = (GetETFDetailsResponse) collectAsState.getValue();
                    if (getETFDetailsResponse == null || (holdingsDetails = getETFDetailsResponse.holdings_details) == null || (list = holdingsDetails.holdings) == null) {
                        z2 = true;
                    } else {
                        z2 = true;
                        if (!list.isEmpty()) {
                            investmentType = InvestmentType.STOCK;
                            rememberedValue8 = Updater.mutableStateOf$default(investmentType);
                            gapComposer3.updateRememberedValue(rememberedValue8);
                        }
                    }
                    investmentType = InvestmentType.SECTOR;
                    rememberedValue8 = Updater.mutableStateOf$default(investmentType);
                    gapComposer3.updateRememberedValue(rememberedValue8);
                } else {
                    z2 = true;
                }
                MutableState mutableState14 = (MutableState) rememberedValue8;
                Collection collection = 0;
                collection = 0;
                Updater.LaunchedEffect(gapComposer3, flow, new GLThread$start$2(flow, (Continuation) collection, this, mutableState14, 22));
                GetETFDetailsResponse getETFDetailsResponse2 = (GetETFDetailsResponse) collectAsState.getValue();
                List list2 = (getETFDetailsResponse2 == null || (holdingsDetails2 = getETFDetailsResponse2.holdings_details) == null) ? null : holdingsDetails2.holdings;
                if (list2 == null) {
                    list2 = EmptyList.INSTANCE;
                }
                GetETFDetailsResponse getETFDetailsResponse3 = (GetETFDetailsResponse) collectAsState.getValue();
                if (getETFDetailsResponse3 != null && (sectorsDetails = getETFDetailsResponse3.sectors_details) != null) {
                    collection = sectorsDetails.sectors;
                }
                if (collection == 0) {
                    collection = EmptyList.INSTANCE;
                }
                DateTimeFormatter withZone = DateTimeFormatter.ofPattern("MMM dd, yyyy").withZone(androidClock.timeZone().toZoneId());
                GetETFDetailsResponse getETFDetailsResponse4 = (GetETFDetailsResponse) collectAsState.getValue();
                getETFDetailsResponse4.getClass();
                Long l = getETFDetailsResponse4.updated_at;
                l.getClass();
                String format2 = withZone.format(Instant.ofEpochMilli(l.longValue()));
                DateTimeFormatter withZone2 = DateTimeFormatter.ofPattern("h:mma").withZone(androidClock.timeZone().toZoneId());
                GetETFDetailsResponse getETFDetailsResponse5 = (GetETFDetailsResponse) collectAsState.getValue();
                getETFDetailsResponse5.getClass();
                Long l2 = getETFDetailsResponse5.updated_at;
                l2.getClass();
                String format3 = withZone2.format(Instant.ofEpochMilli(l2.longValue()));
                format2.getClass();
                format3.getClass();
                Object[] objArr = {format2, format3};
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format4 = new MessageFormat(resources.getString(R.string.investing_etf_holdings_details_updated_at)).format(objArr);
                format4.getClass();
                String str6 = androidStringManager.get(R.string.investing_etf_holdings_details_title);
                InvestmentType investmentType2 = (InvestmentType) mutableState14.getValue();
                boolean z5 = (collection.isEmpty() || list2.isEmpty()) ? false : z2;
                collection.getClass();
                Iterable<SectorsDetails.Sector> iterable = collection;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                for (SectorsDetails.Sector sector : iterable) {
                    String str7 = sector.name;
                    str7.getClass();
                    sector.weight.getClass();
                    arrayList.add(new Sector(str7, (r3.longValue() / 100.0f) + "%"));
                }
                InvestingEtfHoldingDetailsViewModel.Content content = new InvestingEtfHoldingDetailsViewModel.Content(str6, investmentType2, z5, format4, arrayList, AndroidPlatform.Companion.toViewModel(list2));
                gapComposer3.end(false);
                return content;
            case 2:
                Loadable loadable3 = loading2;
                MerchantScreen$MerchantInfoFeedbackBottomSheetScreen merchantScreen$MerchantInfoFeedbackBottomSheetScreen = (MerchantScreen$MerchantInfoFeedbackBottomSheetScreen) obj4;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj5;
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-510676542);
                Object rememberedValue9 = gapComposer4.rememberedValue();
                if (rememberedValue9 == neverEqualPolicy2) {
                    rememberedValue9 = ((RealCustomerStore) obj3).getCustomerForId(merchantScreen$MerchantInfoFeedbackBottomSheetScreen.merchantToken);
                    gapComposer4.updateRememberedValue(rememberedValue9);
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue9, null, null, gapComposer4, 48, 2);
                Object rememberedValue10 = gapComposer4.rememberedValue();
                if (rememberedValue10 == neverEqualPolicy2) {
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    rememberedValue10 = Updater.mutableStateOf$default(emptyMap);
                    gapComposer4.updateRememberedValue(rememberedValue10);
                }
                MutableState mutableState15 = (MutableState) rememberedValue10;
                Object rememberedValue11 = gapComposer4.rememberedValue();
                if (rememberedValue11 == neverEqualPolicy2) {
                    rememberedValue11 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer4.updateRememberedValue(rememberedValue11);
                }
                MutableState mutableState16 = (MutableState) rememberedValue11;
                Map map = (Map) mutableState15.getValue();
                if (!map.isEmpty()) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                            z3 = true;
                            Updater.LaunchedEffect(gapComposer4, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, shareSheetPresenter, mutableState15, collectAsState2, mutableState16));
                            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                            recipient = (Recipient) collectAsState2.getValue();
                            if (recipient != null) {
                                String str8 = recipient.displayName;
                                if (recipient.photo != null || str8 != null) {
                                    Map map2 = (Map) mutableState15.getValue();
                                    MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.Category category = MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.Category.LOGO;
                                    Boolean bool = (Boolean) map2.get(category);
                                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                                    ColorModel.Accented accented = new ColorModel.Accented(AccentColorsKt.getAccentColor(recipient));
                                    String str9 = recipient.fullName;
                                    MerchantData merchantData = recipient.merchantData;
                                    String avatarMonogramSource = RecipientAvatars.avatarMonogramSource(str9, str8);
                                    Character monogram = avatarMonogramSource != null ? GrpcStatus.Companion.monogram(avatarMonogramSource) : null;
                                    String str10 = recipient.displayName;
                                    Image image = recipient.photo;
                                    ColorModel model$default = MoshiJsonIntegration.toModel$default(ArcadeColors.IconInverse);
                                    if (merchantData != null) {
                                        mutableState2 = mutableState15;
                                        z4 = Intrinsics.areEqual(merchantData.should_colorize_avatar, Boolean.TRUE);
                                    } else {
                                        mutableState2 = mutableState15;
                                        z4 = false;
                                    }
                                    createListBuilder.add(new MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow(category, new MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Remote(new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(accented, monogram, str10, image, null, z4 ? model$default : null, ((merchantData != null ? Intrinsics.areEqual(merchantData.should_fill_background, Boolean.TRUE) : false) || recipient.isCashCustomer) ? new ColorModel.Accented(AccentColorsKt.getAccentColor(recipient)) : null, recipient.isFavorite, recipient.isSponsorAllowlisted, false, 3120))), androidStringManager2.get(R.string.merchant_info_feedback_logo), null, booleanValue));
                                    recipient2 = (Recipient) collectAsState2.getValue();
                                    if (recipient2 != null && (str2 = recipient2.displayName) != null) {
                                        Map map3 = (Map) mutableState2.getValue();
                                        MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.Category category2 = MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.Category.NAME;
                                        Boolean bool2 = (Boolean) map3.get(category2);
                                        boolean booleanValue2 = bool2 == null ? bool2.booleanValue() : false;
                                        zzd zzdVar = Icons.Companion;
                                        createListBuilder.add(new MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow(category2, new MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Local(new Icon("jttK4G")), androidStringManager2.get(R.string.merchant_info_feedback_name), str2, booleanValue2));
                                    }
                                    str = merchantScreen$MerchantInfoFeedbackBottomSheetScreen.address;
                                    if (str != null) {
                                        Map map4 = (Map) mutableState2.getValue();
                                        MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.Category category3 = MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.Category.LOCATION;
                                        Boolean bool3 = (Boolean) map4.get(category3);
                                        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                                        zzd zzdVar2 = Icons.Companion;
                                        createListBuilder.add(new MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow(category3, new MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Local(new Icon("VAJHPc")), androidStringManager2.get(R.string.merchant_info_feedback_location), str, booleanValue3));
                                    }
                                    ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                                    if (((Boolean) mutableState16.getValue()).booleanValue()) {
                                        loadable3 = new Loadable.Loaded(new MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Confirmation(androidStringManager2.get(R.string.merchant_info_feedback_confirmation_header), androidStringManager2.get(R.string.merchant_info_feedback_confirmation_description), androidStringManager2.get(R.string.merchant_info_feedback_confirmation_button_text)));
                                    } else if (!build.isEmpty()) {
                                        loadable3 = new Loadable.Loaded(new MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection(androidStringManager2.get(R.string.merchant_info_feedback_header), androidStringManager2.get(R.string.merchant_info_feedback_description), build, androidStringManager2.get(R.string.merchant_info_feedback_button_text), z3));
                                    }
                                    MerchantInfoFeedbackViewModel merchantInfoFeedbackViewModel = new MerchantInfoFeedbackViewModel(loadable3);
                                    gapComposer4.end(false);
                                    return merchantInfoFeedbackViewModel;
                                }
                            }
                            mutableState2 = mutableState15;
                            recipient2 = (Recipient) collectAsState2.getValue();
                            if (recipient2 != null) {
                                Map map32 = (Map) mutableState2.getValue();
                                MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.Category category22 = MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.Category.NAME;
                                Boolean bool22 = (Boolean) map32.get(category22);
                                if (bool22 == null) {
                                }
                                zzd zzdVar3 = Icons.Companion;
                                createListBuilder.add(new MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow(category22, new MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Local(new Icon("jttK4G")), androidStringManager2.get(R.string.merchant_info_feedback_name), str2, booleanValue2));
                            }
                            str = merchantScreen$MerchantInfoFeedbackBottomSheetScreen.address;
                            if (str != null) {
                            }
                            ListBuilder build2 = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                            if (((Boolean) mutableState16.getValue()).booleanValue()) {
                            }
                            MerchantInfoFeedbackViewModel merchantInfoFeedbackViewModel2 = new MerchantInfoFeedbackViewModel(loadable3);
                            gapComposer4.end(false);
                            return merchantInfoFeedbackViewModel2;
                        }
                    }
                }
                z3 = false;
                Updater.LaunchedEffect(gapComposer4, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, shareSheetPresenter, mutableState15, collectAsState2, mutableState16));
                ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                recipient = (Recipient) collectAsState2.getValue();
                if (recipient != null) {
                }
                mutableState2 = mutableState15;
                recipient2 = (Recipient) collectAsState2.getValue();
                if (recipient2 != null) {
                }
                str = merchantScreen$MerchantInfoFeedbackBottomSheetScreen.address;
                if (str != null) {
                }
                ListBuilder build22 = CollectionsKt__CollectionsJVMKt.build(createListBuilder2);
                if (((Boolean) mutableState16.getValue()).booleanValue()) {
                }
                MerchantInfoFeedbackViewModel merchantInfoFeedbackViewModel22 = new MerchantInfoFeedbackViewModel(loadable3);
                gapComposer4.end(false);
                return merchantInfoFeedbackViewModel22;
            case 3:
                MerchantScreen$MerchantProfileScreen merchantScreen$MerchantProfileScreen = (MerchantScreen$MerchantProfileScreen) obj3;
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(-79938238);
                Object rememberedValue12 = gapComposer5.rememberedValue();
                if (rememberedValue12 == neverEqualPolicy2) {
                    loading = loading2;
                    rememberedValue12 = Updater.mutableStateOf$default(new MerchantProfilePresenter$State(loading, loading3, loading, null));
                    gapComposer5.updateRememberedValue(rememberedValue12);
                } else {
                    loading = loading2;
                }
                MutableState mutableState17 = (MutableState) rememberedValue12;
                Object rememberedValue13 = gapComposer5.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy2) {
                    rememberedValue13 = Updater.mutableStateOf$default(null);
                    gapComposer5.updateRememberedValue(rememberedValue13);
                }
                MutableState mutableState18 = (MutableState) rememberedValue13;
                Object rememberedValue14 = gapComposer5.rememberedValue();
                if (rememberedValue14 == neverEqualPolicy2) {
                    rememberedValue14 = Updater.mutableStateOf$default(null);
                    gapComposer5.updateRememberedValue(rememberedValue14);
                }
                MutableState mutableState19 = (MutableState) rememberedValue14;
                Object rememberedValue15 = gapComposer5.rememberedValue();
                if (rememberedValue15 == neverEqualPolicy2) {
                    rememberedValue15 = Updater.mutableStateOf$default(null);
                    gapComposer5.updateRememberedValue(rememberedValue15);
                }
                MutableState mutableState20 = (MutableState) rememberedValue15;
                Object rememberedValue16 = gapComposer5.rememberedValue();
                if (rememberedValue16 == neverEqualPolicy2) {
                    rememberedValue16 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer5);
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) rememberedValue16;
                Object rememberedValue17 = gapComposer5.rememberedValue();
                if (rememberedValue17 == neverEqualPolicy2) {
                    rememberedValue17 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
                    gapComposer5.updateRememberedValue(rememberedValue17);
                }
                MutableState mutableState21 = (MutableState) rememberedValue17;
                Object rememberedValue18 = gapComposer5.rememberedValue();
                if (rememberedValue18 == neverEqualPolicy2) {
                    rememberedValue18 = Updater.mutableStateOf$default(merchantScreen$MerchantProfileScreen.merchantOrBrandToken);
                    gapComposer5.updateRememberedValue(rememberedValue18);
                }
                MutableState mutableState22 = (MutableState) rememberedValue18;
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer5.changedInstance(shareSheetPresenter);
                Object rememberedValue19 = gapComposer5.rememberedValue();
                if (changedInstance2 || rememberedValue19 == neverEqualPolicy2) {
                    mutableState3 = mutableState18;
                    mutableState4 = mutableState17;
                    continuation = null;
                    rememberedValue19 = new RealKeyStoreProvider$load$2(shareSheetPresenter, continuation, 25);
                    gapComposer5.updateRememberedValue(rememberedValue19);
                } else {
                    mutableState3 = mutableState18;
                    mutableState4 = mutableState17;
                    continuation = null;
                }
                Updater.LaunchedEffect(gapComposer5, unit2, (Function2) rememberedValue19);
                Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState3.getIntValue());
                boolean changedInstance3 = gapComposer5.changedInstance(shareSheetPresenter);
                Object rememberedValue20 = gapComposer5.rememberedValue();
                if (changedInstance3 || rememberedValue20 == neverEqualPolicy2) {
                    Continuation continuation6 = continuation;
                    MutableState mutableState23 = mutableState4;
                    parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState3;
                    neverEqualPolicy = neverEqualPolicy2;
                    continuation2 = continuation6;
                    loadable = loading;
                    obj = null;
                    num = valueOf;
                    gapComposer = gapComposer5;
                    MutableState mutableState24 = mutableState3;
                    DbSessionManager$updateDb$2 dbSessionManager$updateDb$2 = new DbSessionManager$updateDb$2(shareSheetPresenter, mutableState23, mutableState22, mutableState24, mutableState19, mutableState21, mutableState20, null, 11);
                    mutableState5 = mutableState23;
                    mutableState6 = mutableState21;
                    mutableState7 = mutableState22;
                    mutableState19 = mutableState19;
                    mutableState8 = mutableState20;
                    shareSheetPresenter = shareSheetPresenter;
                    mutableState9 = mutableState24;
                    gapComposer.updateRememberedValue(dbSessionManager$updateDb$2);
                    rememberedValue20 = dbSessionManager$updateDb$2;
                } else {
                    mutableState5 = mutableState4;
                    parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState3;
                    neverEqualPolicy = neverEqualPolicy2;
                    mutableState8 = mutableState20;
                    continuation2 = continuation;
                    loadable = loading;
                    mutableState7 = mutableState22;
                    mutableState6 = mutableState21;
                    obj = null;
                    mutableState9 = mutableState3;
                    gapComposer = gapComposer5;
                    num = valueOf;
                }
                Updater.LaunchedEffect(gapComposer, num, (Function2) rememberedValue20);
                List list3 = (List) mutableState6.getValue();
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (((GenericTreeElementsRefreshTrigger$BoostContentUpdateTrigger) it2.next()) != null) {
                            gapComposer.startReplaceGroup(-2025041596);
                            List list4 = (List) mutableState6.getValue();
                            boolean changedInstance4 = gapComposer.changedInstance(shareSheetPresenter);
                            Object rememberedValue21 = gapComposer.rememberedValue();
                            if (changedInstance4 || rememberedValue21 == neverEqualPolicy) {
                                ShareSheetPresenter shareSheetPresenter2 = shareSheetPresenter;
                                Continuation continuation7 = continuation2;
                                parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                                CashMapPresenter$models$3$1 cashMapPresenter$models$3$1 = new CashMapPresenter$models$3$1(shareSheetPresenter2, mutableState6, parcelableSnapshotMutableIntState2, continuation7, 12);
                                continuation3 = continuation7;
                                gapComposer.updateRememberedValue(cashMapPresenter$models$3$1);
                                rememberedValue21 = cashMapPresenter$models$3$1;
                            } else {
                                parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                                continuation3 = continuation2;
                            }
                            Updater.LaunchedEffect(gapComposer, list4, (Function2) rememberedValue21);
                            gapComposer.end(false);
                            r4 = continuation3;
                            MutableState mutableState25 = mutableState5;
                            Updater.LaunchedEffect(gapComposer, flow, new AnimationsKt$takeUntil$1$1(flow, (Continuation) null, this, parcelableSnapshotMutableIntState2, mutableState25, 20));
                            rememberedValue = gapComposer.rememberedValue();
                            if (rememberedValue == neverEqualPolicy) {
                                FormCashtag$8$invokeSuspend$$inlined$map$1 formCashtag$8$invokeSuspend$$inlined$map$1 = new FormCashtag$8$invokeSuspend$$inlined$map$1(new MoneyTabPresenter$models$lambda$31$$inlined$map$1(flow, 1), 29);
                                gapComposer.updateRememberedValue(formCashtag$8$invokeSuspend$$inlined$map$1);
                                rememberedValue = formCashtag$8$invokeSuspend$$inlined$map$1;
                            }
                            Flow flow2 = (Flow) rememberedValue;
                            if (((List) mutableState9.getValue()) != null) {
                                gapComposer.startReplaceGroup(-2023643900);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-2023643899);
                                SubtreeManager subtreeManager = (SubtreeManager) obj4;
                                String str11 = (String) merchantScreen$MerchantProfileScreen.merchantOrBrandToken.getValue();
                                MerchantScreen$MerchantAnalytics merchantScreen$MerchantAnalytics = merchantScreen$MerchantProfileScreen.analytics;
                                MutableState mutableState26 = mutableState9;
                                GenericTreeElementsAnalyticsData genericTreeElementsAnalyticsData = new GenericTreeElementsAnalyticsData(2, r4, merchantScreen$MerchantAnalytics != null ? merchantScreen$MerchantAnalytics.queryToken : r4, merchantScreen$MerchantAnalytics != null ? merchantScreen$MerchantAnalytics.genericCDFEventParameters : r4);
                                List list5 = (List) mutableState26.getValue();
                                list5.getClass();
                                mutableState25.setValue(MerchantProfilePresenter$State.copy$default((MerchantProfilePresenter$State) mutableState25.getValue(), null, subtreeManager.model(new GenericTreeElementsItem(str11, list5, genericTreeElementsAnalyticsData, (GenericAnalyticsData) mutableState19.getValue(), null, (Action) mutableState8.getValue(), GenericProfileElement.ActivityElement.ADAPTER, 16), flow2, gapComposer, 8), null, null, 13));
                                gapComposer.end(false);
                            }
                            rememberedValue2 = gapComposer.rememberedValue();
                            if (rememberedValue2 == neverEqualPolicy) {
                                NullStateSwipeConfigProvider nullStateSwipeConfigProvider = new NullStateSwipeConfigProvider(new MoneyTabPresenter$models$lambda$31$$inlined$map$1(flow, 2), 1);
                                gapComposer.updateRememberedValue(nullStateSwipeConfigProvider);
                                rememberedValue2 = nullStateSwipeConfigProvider;
                            }
                            Flow flow3 = (Flow) rememberedValue2;
                            changed = gapComposer.changed((Redacted) mutableState7.getValue());
                            rememberedValue3 = gapComposer.rememberedValue();
                            if (!changed || rememberedValue3 == neverEqualPolicy) {
                                rememberedValue3 = ((ProfilePaymentHistoryPresenter$Factory$Impl) obj2).create(new PaymentHistoryScreens$ProfilePaymentHistory((Redacted) mutableState7.getValue(), true, true), merchantScreen$MerchantProfileScreen, (BetterNavigator.ScreenNavigator) this.navigator, r4);
                                gapComposer.updateRememberedValue(rememberedValue3);
                            }
                            mutableState25.setValue(MerchantProfilePresenter$State.copy$default((MerchantProfilePresenter$State) mutableState25.getValue(), null, null, new Loadable.Loaded(((ProfilePaymentHistoryPresenter) rememberedValue3).models(flow3, (Composer) gapComposer, 64)), null, 11));
                            MerchantProfilePresenter$State merchantProfilePresenter$State = (MerchantProfilePresenter$State) mutableState25.getValue();
                            ordinal = merchantScreen$MerchantProfileScreen.backNavigationAction.ordinal();
                            if (ordinal != 0) {
                                navigationIcon = NavigationIcon.CLOSE;
                            } else {
                                if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return obj;
                                }
                                navigationIcon = NavigationIcon.BACK;
                            }
                            loadable2 = merchantProfilePresenter$State.headerState;
                            if (!Intrinsics.areEqual(loadable2, loadable)) {
                                if (loadable2 instanceof Loadable.Failed) {
                                    loadable = new Loadable.Failed(((Loadable.Failed) loadable2).error);
                                } else {
                                    if (!(loadable2 instanceof Loadable.Loaded)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return obj;
                                    }
                                    MerchantProfilePresenter$HeaderState merchantProfilePresenter$HeaderState = (MerchantProfilePresenter$HeaderState) ((Loadable.Loaded) loadable2).value;
                                    StackedAvatarViewModel.Single single = merchantProfilePresenter$HeaderState.avatarViewModel;
                                    MerchantHeaderViewModel merchantHeaderViewModel = new MerchantHeaderViewModel(single, merchantProfilePresenter$HeaderState.name, merchantProfilePresenter$HeaderState.category, single.avatar.remoteImage != null);
                                    Loadable loadable4 = merchantProfilePresenter$State.paymentHistory;
                                    GenericTreeElementsViewModel genericTreeElementsViewModel = merchantProfilePresenter$State.genericTreeModel;
                                    if ((loadable4 instanceof Loadable.Loaded) && (genericTreeElementsViewModel instanceof GenericTreeElementsViewModel.Loaded)) {
                                        loadable = new Loadable.Loaded(new MerchantBodyViewModel((GenericTreeElementsViewModel.Loaded) genericTreeElementsViewModel, (ProfilePaymentHistoryViewModel) ((Loadable.Loaded) loadable4).value));
                                    } else if ((loadable4 instanceof Loadable.Failed) || ((genericTreeElementsViewModel instanceof GenericTreeElementsViewModel.Loaded) && ((GenericTreeElementsViewModel.Loaded) genericTreeElementsViewModel).error != null)) {
                                        loadable = new Loadable.Failed(new Throwable());
                                    }
                                    loadable = new Loadable.Loaded(new MerchantProfileContentViewModel(merchantHeaderViewModel, loadable));
                                }
                            }
                            MerchantProfileViewModel merchantProfileViewModel = new MerchantProfileViewModel(navigationIcon, loadable, merchantProfilePresenter$State.profilePhoto);
                            gapComposer.end(false);
                            return merchantProfileViewModel;
                        }
                        shareSheetPresenter = this;
                    }
                }
                parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                continuation3 = continuation2;
                gapComposer.startReplaceGroup(-2024768672);
                gapComposer.end(false);
                r4 = continuation3;
                MutableState mutableState252 = mutableState5;
                Updater.LaunchedEffect(gapComposer, flow, new AnimationsKt$takeUntil$1$1(flow, (Continuation) null, this, parcelableSnapshotMutableIntState2, mutableState252, 20));
                rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                }
                Flow flow22 = (Flow) rememberedValue;
                if (((List) mutableState9.getValue()) != null) {
                }
                rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                }
                Flow flow32 = (Flow) rememberedValue2;
                changed = gapComposer.changed((Redacted) mutableState7.getValue());
                rememberedValue3 = gapComposer.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = ((ProfilePaymentHistoryPresenter$Factory$Impl) obj2).create(new PaymentHistoryScreens$ProfilePaymentHistory((Redacted) mutableState7.getValue(), true, true), merchantScreen$MerchantProfileScreen, (BetterNavigator.ScreenNavigator) this.navigator, r4);
                gapComposer.updateRememberedValue(rememberedValue3);
                mutableState252.setValue(MerchantProfilePresenter$State.copy$default((MerchantProfilePresenter$State) mutableState252.getValue(), null, null, new Loadable.Loaded(((ProfilePaymentHistoryPresenter) rememberedValue3).models(flow32, (Composer) gapComposer, 64)), null, 11));
                MerchantProfilePresenter$State merchantProfilePresenter$State2 = (MerchantProfilePresenter$State) mutableState252.getValue();
                ordinal = merchantScreen$MerchantProfileScreen.backNavigationAction.ordinal();
                if (ordinal != 0) {
                }
                loadable2 = merchantProfilePresenter$State2.headerState;
                if (!Intrinsics.areEqual(loadable2, loadable)) {
                }
                MerchantProfileViewModel merchantProfileViewModel2 = new MerchantProfileViewModel(navigationIcon, loadable, merchantProfilePresenter$State2.profilePhoto);
                gapComposer.end(false);
                return merchantProfileViewModel2;
            case 4:
                SquareLoyaltyDetailsScreen squareLoyaltyDetailsScreen = (SquareLoyaltyDetailsScreen) obj2;
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(1776326116);
                Object rememberedValue22 = gapComposer6.rememberedValue();
                Continuation continuation8 = null;
                if (rememberedValue22 == neverEqualPolicy2) {
                    rememberedValue22 = Updater.mutableStateOf$default(new SquareLoyaltyDetailsPresenter$State(loading3, null, false));
                    gapComposer6.updateRememberedValue(rememberedValue22);
                }
                MutableState mutableState27 = (MutableState) rememberedValue22;
                Object rememberedValue23 = gapComposer6.rememberedValue();
                if (rememberedValue23 == neverEqualPolicy2) {
                    rememberedValue23 = Updater.mutableStateOf$default(null);
                    gapComposer6.updateRememberedValue(rememberedValue23);
                }
                MutableState mutableState28 = (MutableState) rememberedValue23;
                String str12 = squareLoyaltyDetailsScreen.gteContext;
                boolean changedInstance5 = gapComposer6.changedInstance(shareSheetPresenter);
                Object rememberedValue24 = gapComposer6.rememberedValue();
                if (changedInstance5 || rememberedValue24 == neverEqualPolicy2) {
                    CashMapPresenter$models$3$1 cashMapPresenter$models$3$12 = new CashMapPresenter$models$3$1(this, mutableState28, mutableState27, continuation8, 14);
                    shareSheetPresenter = this;
                    mutableState10 = mutableState27;
                    gapComposer6.updateRememberedValue(cashMapPresenter$models$3$12);
                    rememberedValue24 = cashMapPresenter$models$3$12;
                } else {
                    mutableState10 = mutableState27;
                }
                Updater.LaunchedEffect(gapComposer6, str12, (Function2) rememberedValue24);
                Object rememberedValue25 = gapComposer6.rememberedValue();
                if (rememberedValue25 == neverEqualPolicy2) {
                    NullStateSwipeConfigProvider nullStateSwipeConfigProvider2 = new NullStateSwipeConfigProvider(new MoneyTabPresenter$models$lambda$31$$inlined$map$1(flow, 3), i7);
                    gapComposer6.updateRememberedValue(nullStateSwipeConfigProvider2);
                    rememberedValue25 = nullStateSwipeConfigProvider2;
                }
                Flow flow4 = (Flow) rememberedValue25;
                GenericTreeElementsData genericTreeElementsData = (GenericTreeElementsData) mutableState28.getValue();
                if (genericTreeElementsData == null) {
                    gapComposer6.startReplaceGroup(240234259);
                    gapComposer6.end(false);
                } else {
                    gapComposer6.startReplaceGroup(240234260);
                    SquareLoyaltyDetailsPresenter$State squareLoyaltyDetailsPresenter$State = (SquareLoyaltyDetailsPresenter$State) mutableState10.getValue();
                    SubtreeManager subtreeManager2 = (SubtreeManager) obj5;
                    String str13 = squareLoyaltyDetailsScreen.merchantToken;
                    List list6 = genericTreeElementsData.genericElementTree;
                    AnalyticsEvent analyticsEvent = genericTreeElementsData.viewEvent;
                    GenericAnalyticsData analyticsData = analyticsEvent != null ? zzi.toAnalyticsData(analyticsEvent) : null;
                    AnalyticsEvent analyticsEvent2 = genericTreeElementsData.dismissEvent;
                    GenericTreeElementsViewModel.Loaded model = subtreeManager2.model(new GenericTreeElementsItem(str13, list6, new GenericTreeElementsAnalyticsData(5, squareLoyaltyDetailsScreen.referrerFlowToken, null, null), analyticsData, analyticsEvent2 != null ? zzi.toAnalyticsData(analyticsEvent2) : null, null, LoyaltyPromotionDetailsPlaceholder.ADAPTER, 32), flow4, gapComposer6, 8);
                    String str14 = genericTreeElementsData.toolbarTitle;
                    boolean z6 = squareLoyaltyDetailsScreen.alwaysShowToolbarTitle;
                    squareLoyaltyDetailsPresenter$State.getClass();
                    mutableState10.setValue(new SquareLoyaltyDetailsPresenter$State(model, str14, z6));
                    gapComposer6.end(false);
                }
                Updater.LaunchedEffect(gapComposer6, flow, new CashMapPresenter$models$3$1(flow, continuation8, shareSheetPresenter, 13));
                SquareLoyaltyDetailsPresenter$State squareLoyaltyDetailsPresenter$State2 = (SquareLoyaltyDetailsPresenter$State) mutableState10.getValue();
                SquareLoyaltyDetailsViewModel squareLoyaltyDetailsViewModel = new SquareLoyaltyDetailsViewModel(squareLoyaltyDetailsPresenter$State2.model, squareLoyaltyDetailsPresenter$State2.toolbarTitle, squareLoyaltyDetailsPresenter$State2.alwaysShowToolbarTitle);
                gapComposer6.end(false);
                return squareLoyaltyDetailsViewModel;
            case 5:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(4860381);
                Object rememberedValue26 = gapComposer7.rememberedValue();
                Object obj6 = rememberedValue26;
                if (rememberedValue26 == neverEqualPolicy2) {
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new RealDisclosureProvider$special$$inlined$map$1(((RealProfileManager) obj2).profile(), i4));
                    gapComposer7.updateRememberedValue(distinctUntilChanged);
                    obj6 = distinctUntilChanged;
                }
                CurrencyCode currencyCode2 = CurrencyCode.USD;
                MutableState collectAsState3 = Updater.collectAsState((Flow) obj6, currencyCode2, null, gapComposer7, 48, 2);
                boolean changed3 = gapComposer7.changed(((CurrencyCode) collectAsState3.getValue()).ordinal());
                Object rememberedValue27 = gapComposer7.rememberedValue();
                Continuation continuation9 = null;
                if (changed3 || rememberedValue27 == neverEqualPolicy2) {
                    CurrencyCode currencyCode3 = (CurrencyCode) collectAsState3.getValue();
                    int i9 = LitePaymentPadPresenter$WhenMappings.$EnumSwitchMapping$0[currencyCode3.ordinal()];
                    CurrencyCode currencyCode4 = i9 != 1 ? i9 != 2 ? null : currencyCode2 : CurrencyCode.MXN;
                    if (currencyCode4 == null) {
                        rememberedValue27 = new AppLockMonitor$special$$inlined$map$2(new FxExchangeRates(null, null), 19);
                    } else {
                        RealFxExchangeRateStreamingSubscriber realFxExchangeRateStreamingSubscriber = (RealFxExchangeRateStreamingSubscriber) obj3;
                        rememberedValue27 = new FlowUtil$createFlow$$inlined$map$1(new FxExchangeRates(null, null), FlowKt.flowOn(FlowKt.channelFlow(new RealFidesmoClient$observeDeviceState$1(realFxExchangeRateStreamingSubscriber, currencyCode3, currencyCode4, continuation9, 9)), realFxExchangeRateStreamingSubscriber.ioDispatcher), new CardModelView.AnonymousClass1.AnonymousClass4(3, continuation9, i3));
                    }
                    gapComposer7.updateRememberedValue(rememberedValue27);
                }
                MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue27, new FxExchangeRates(null, null), null, gapComposer7, 0, 2);
                MutableState rememberUpdatedState = Updater.rememberUpdatedState((CurrencyCode) collectAsState3.getValue(), gapComposer7);
                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState((FxExchangeRates) collectAsState4.getValue(), gapComposer7);
                Object rememberedValue28 = gapComposer7.rememberedValue();
                Object obj7 = rememberedValue28;
                if (rememberedValue28 == neverEqualPolicy2) {
                    ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default("0");
                    gapComposer7.updateRememberedValue(mutableStateOf$default);
                    obj7 = mutableStateOf$default;
                }
                MutableState mutableState29 = (MutableState) obj7;
                Object rememberedValue29 = gapComposer7.rememberedValue();
                Object obj8 = rememberedValue29;
                if (rememberedValue29 == neverEqualPolicy2) {
                    ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default((CurrencyCode) collectAsState3.getValue());
                    gapComposer7.updateRememberedValue(mutableStateOf$default2);
                    obj8 = mutableStateOf$default2;
                }
                MutableState mutableState30 = (MutableState) obj8;
                Object rememberedValue30 = gapComposer7.rememberedValue();
                Object obj9 = rememberedValue30;
                if (rememberedValue30 == neverEqualPolicy2) {
                    ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(null);
                    gapComposer7.updateRememberedValue(mutableStateOf$default3);
                    obj9 = mutableStateOf$default3;
                }
                MutableState mutableState31 = (MutableState) obj9;
                Object rememberedValue31 = gapComposer7.rememberedValue();
                Object obj10 = rememberedValue31;
                if (rememberedValue31 == neverEqualPolicy2) {
                    ParcelableSnapshotMutableState mutableStateOf$default4 = Updater.mutableStateOf$default(null);
                    gapComposer7.updateRememberedValue(mutableStateOf$default4);
                    obj10 = mutableStateOf$default4;
                }
                MutableState mutableState32 = (MutableState) obj10;
                CurrencyCode currencyCode5 = (CurrencyCode) collectAsState3.getValue();
                boolean changed4 = gapComposer7.changed(collectAsState3);
                Object rememberedValue32 = gapComposer7.rememberedValue();
                if (changed4 || rememberedValue32 == neverEqualPolicy2) {
                    mutableState11 = collectAsState3;
                    rememberedValue32 = new LitePaymentPadPresenter$models$1$1(mutableState29, mutableState11, mutableState30, mutableState31, mutableState32, null, 0);
                    gapComposer7.updateRememberedValue(rememberedValue32);
                } else {
                    mutableState11 = collectAsState3;
                }
                Updater.LaunchedEffect(gapComposer7, currencyCode5, (Function2) rememberedValue32);
                CurrencyCode currencyCode6 = currencyCode2;
                Updater.LaunchedEffect(gapComposer7, flow, new OffersHomePresenter$models$8$1(flow, (Continuation) null, (MoleculePresenter) shareSheetPresenter, mutableState29, mutableState31, mutableState32, mutableState30, rememberUpdatedState, rememberUpdatedState2, 9));
                CurrencyCode currencyCode7 = (CurrencyCode) mutableState30.getValue();
                String str15 = (String) mutableState29.getValue();
                Versioned versioned = (Versioned) mutableState31.getValue();
                String str16 = (String) mutableState32.getValue();
                String str17 = (String) mutableState29.getValue();
                CurrencyCode currencyCode8 = (CurrencyCode) mutableState30.getValue();
                CurrencyCode currencyCode9 = (CurrencyCode) mutableState11.getValue();
                FxExchangeRate fxExchangeRate = ((FxExchangeRates) collectAsState4.getValue()).current;
                FxExchangeRate fxExchangeRate2 = ((FxExchangeRates) collectAsState4.getValue()).lastAvailable;
                AndroidStringManager androidStringManager3 = (AndroidStringManager) obj5;
                Money parseMoneyFromString$default = Moneys.parseMoneyFromString$default(str17, currencyCode8);
                int[] iArr = LitePaymentPadPresenter$WhenMappings.$EnumSwitchMapping$0;
                int i10 = iArr[currencyCode9.ordinal()];
                if (i10 == 1) {
                    currencyCode6 = CurrencyCode.MXN;
                } else if (i10 != 2) {
                    currencyCode = null;
                    if (currencyCode != null) {
                        if (currencyCode8 != currencyCode9) {
                            if (currencyCode8 == currencyCode) {
                                currencyCode = currencyCode9;
                            }
                        }
                        if (currencyCode == null || (convertTo = convertTo(parseMoneyFromString$default, currencyCode, fxExchangeRate2)) == null) {
                            str3 = str15;
                            exchangeRatePreview = null;
                        } else {
                            String quoteText = shareSheetPresenter.quoteText(convertTo);
                            String quoteText2 = shareSheetPresenter.quoteText(convertTo);
                            int i11 = iArr[currencyCode.ordinal()];
                            String name = i11 == 1 ? i11 != 2 ? currencyCode.name() : androidStringManager3.get(R.string.lite_payment_pad_mxn_currency_name) : androidStringManager3.get(R.string.lite_payment_pad_usd_currency_name);
                            name.getClass();
                            Object[] objArr2 = {quoteText2, name};
                            Resources resources2 = androidStringManager3.resources;
                            resources2.getClass();
                            String format5 = new MessageFormat(resources2.getString(R.string.lite_payment_pad_switch_entry_currency_accessibility_label)).format(objArr2);
                            format5.getClass();
                            ExchangeRatePreview exchangeRatePreview2 = new ExchangeRatePreview(quoteText, format5, fxExchangeRate == null && convertTo(parseMoneyFromString$default, currencyCode, fxExchangeRate) != null);
                            str3 = str15;
                            exchangeRatePreview = exchangeRatePreview2;
                        }
                        LitePaymentPadViewModel litePaymentPadViewModel = new LitePaymentPadViewModel(currencyCode7, str3, versioned, str16, exchangeRatePreview);
                        gapComposer7.end(false);
                        return litePaymentPadViewModel;
                    }
                    currencyCode = null;
                    if (currencyCode == null) {
                        String quoteText3 = shareSheetPresenter.quoteText(convertTo);
                        String quoteText22 = shareSheetPresenter.quoteText(convertTo);
                        int i112 = iArr[currencyCode.ordinal()];
                        if (i112 == 1) {
                        }
                        name.getClass();
                        Object[] objArr22 = {quoteText22, name};
                        Resources resources22 = androidStringManager3.resources;
                        resources22.getClass();
                        String format52 = new MessageFormat(resources22.getString(R.string.lite_payment_pad_switch_entry_currency_accessibility_label)).format(objArr22);
                        format52.getClass();
                        ExchangeRatePreview exchangeRatePreview22 = new ExchangeRatePreview(quoteText3, format52, fxExchangeRate == null && convertTo(parseMoneyFromString$default, currencyCode, fxExchangeRate) != null);
                        str3 = str15;
                        exchangeRatePreview = exchangeRatePreview22;
                        LitePaymentPadViewModel litePaymentPadViewModel2 = new LitePaymentPadViewModel(currencyCode7, str3, versioned, str16, exchangeRatePreview);
                        gapComposer7.end(false);
                        return litePaymentPadViewModel2;
                    }
                    str3 = str15;
                    exchangeRatePreview = null;
                    LitePaymentPadViewModel litePaymentPadViewModel22 = new LitePaymentPadViewModel(currencyCode7, str3, versioned, str16, exchangeRatePreview);
                    gapComposer7.end(false);
                    return litePaymentPadViewModel22;
                }
                currencyCode = currencyCode6;
                if (currencyCode != null) {
                }
                currencyCode = null;
                if (currencyCode == null) {
                }
                str3 = str15;
                exchangeRatePreview = null;
                LitePaymentPadViewModel litePaymentPadViewModel222 = new LitePaymentPadViewModel(currencyCode7, str3, versioned, str16, exchangeRatePreview);
                gapComposer7.end(false);
                return litePaymentPadViewModel222;
            case 6:
                AndroidStringManager androidStringManager4 = (AndroidStringManager) obj5;
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(1141700461);
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance6 = gapComposer8.changedInstance(shareSheetPresenter);
                Object rememberedValue33 = gapComposer8.rememberedValue();
                if (changedInstance6 || rememberedValue33 == neverEqualPolicy2) {
                    rememberedValue33 = new MusicPresenter$models$3$1(shareSheetPresenter, continuation4, i3);
                    gapComposer8.updateRememberedValue(rememberedValue33);
                }
                Updater.LaunchedEffect(gapComposer8, unit3, (Function2) rememberedValue33);
                Updater.LaunchedEffect(gapComposer8, flow, new MainPaymentPresenter$models$4$4(flow, continuation4, shareSheetPresenter, i6));
                String str18 = androidStringManager4.get(R.string.disk_space_low_alert_title);
                Object[] objArr3 = {Integer.valueOf((int) ((LowDiskSpaceAlertDialogScreen) obj4).spaceNeeded)};
                Resources resources3 = androidStringManager4.resources;
                resources3.getClass();
                String format6 = new MessageFormat(resources3.getString(R.string.disk_space_low_alert_message)).format(objArr3);
                format6.getClass();
                LowDiskSpaceAlertViewModel$Main lowDiskSpaceAlertViewModel$Main = new LowDiskSpaceAlertViewModel$Main(str18, format6, androidStringManager4.get(R.string.got_it), androidStringManager4.get(R.string.settings));
                gapComposer8.end(false);
                return lowDiskSpaceAlertViewModel$Main;
            case 7:
                return models$com$squareup$cash$payments$presenters$SchedulePaymentPresenter(flow, composer, i);
            case 8:
                return models(flow, composer, i);
            case 9:
                return models$com$squareup$cash$score$applets$presenters$ScoreAppletTilePresenter(flow, composer, i);
            case 10:
                m3744models(flow, composer, i);
                return Unit.INSTANCE;
            case 11:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(-1230619583);
                VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) obj4;
                verifyCheckDialogPresenter.getClass();
                gapComposer9.startReplaceGroup(-1613152821);
                boolean changed5 = gapComposer9.changed(((AppletId) verifyCheckDialogPresenter.navigator).ordinal());
                Object rememberedValue34 = gapComposer9.rememberedValue();
                Object obj11 = rememberedValue34;
                if (changed5 || rememberedValue34 == neverEqualPolicy2) {
                    InviteContactsPresenter$special$$inlined$map$1 inviteContactsPresenter$special$$inlined$map$1 = new InviteContactsPresenter$special$$inlined$map$1(((RealPromotedAppletTileStore) verifyCheckDialogPresenter.args).getPromotedAppletTiles(), verifyCheckDialogPresenter, i4);
                    gapComposer9.updateRememberedValue(inviteContactsPresenter$special$$inlined$map$1);
                    obj11 = inviteContactsPresenter$special$$inlined$map$1;
                }
                PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) Updater.collectAsState((Flow) obj11, PromotedAppletTileViewModel.Loading.INSTANCE, null, gapComposer9, 0, 2).getValue();
                gapComposer9.end(false);
                PromotedAppletTileViewModel.Loaded loaded = promotedAppletTileViewModel instanceof PromotedAppletTileViewModel.Loaded ? (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel : null;
                boolean changed6 = gapComposer9.changed(loaded);
                Object rememberedValue35 = gapComposer9.rememberedValue();
                Object obj12 = rememberedValue35;
                if (changed6 || rememberedValue35 == neverEqualPolicy2) {
                    DerivedStateFlow combineState = StateFlowKt.combineState(((RealTaxesAppletTileRepository) ((TaxesAppletTileRepository) obj3))._model, StateFlowKt.mapState(Trace.valuesStateExperiment((FeatureFlagManager) obj5, AmplitudeExperiments$ShowMoneyTabTaxBanner.INSTANCE), new TaxWebAppBridge$$ExternalSyntheticLambda1(i7)), new SheetKt$$ExternalSyntheticLambda6(shareSheetPresenter, loaded));
                    gapComposer9.updateRememberedValue(combineState);
                    obj12 = combineState;
                }
                MutableState collectAsState5 = Updater.collectAsState((StateFlow) obj12, null, gapComposer9, 1);
                Updater.LaunchedEffect(gapComposer9, flow, new TaxWebAppBridge.AnonymousClass4(flow, continuation4, shareSheetPresenter, 4));
                TaxesAppletTileModel taxesAppletTileModel = (TaxesAppletTileModel) collectAsState5.getValue();
                gapComposer9.end(false);
                return taxesAppletTileModel;
            case 12:
                AndroidStringManager androidStringManager5 = (AndroidStringManager) obj5;
                InstrumentNotLinkedScreen instrumentNotLinkedScreen = (InstrumentNotLinkedScreen) obj2;
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(1117387612);
                boolean changedInstance7 = gapComposer10.changedInstance(shareSheetPresenter);
                Object rememberedValue36 = gapComposer10.rememberedValue();
                if (changedInstance7 || rememberedValue36 == neverEqualPolicy2) {
                    rememberedValue36 = new InstrumentNotLinkedPresenter$models$1$1(shareSheetPresenter, continuation4, i8);
                    gapComposer10.updateRememberedValue(rememberedValue36);
                }
                Updater.LaunchedEffect(gapComposer10, "transfer-action-processing", (Function2) rememberedValue36);
                Updater.LaunchedEffect(gapComposer10, flow, new TaxWebAppBridge.AnonymousClass4(flow, continuation4, shareSheetPresenter, 20));
                TransferType transferType = instrumentNotLinkedScreen.transferType;
                DepositPreference depositPreference = instrumentNotLinkedScreen.depositPreference;
                int ordinal2 = transferType.ordinal();
                if (ordinal2 == 0) {
                    str4 = androidStringManager5.get(R.string.transfers_instrument_not_linked_add_money_header);
                } else {
                    if (ordinal2 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    int i12 = depositPreference == null ? -1 : InstrumentNotLinkedPresenter$WhenMappings.$EnumSwitchMapping$1[depositPreference.ordinal()];
                    if (i12 == 1) {
                        str4 = androidStringManager5.get(R.string.transfers_instrument_debit_not_linked_withdraw_header);
                    } else {
                        if (i12 != 2) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1(depositPreference, "Unexpected deposit preference provided for instrument not linked sheet: ");
                            return null;
                        }
                        str4 = androidStringManager5.get(R.string.transfers_instrument_bank_not_linked_withdraw_header);
                    }
                }
                int ordinal3 = instrumentNotLinkedScreen.transferType.ordinal();
                String str19 = "jSGGY9";
                if (ordinal3 == 0) {
                    zzd zzdVar4 = Icons.Companion;
                } else {
                    if (ordinal3 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    int i13 = depositPreference != null ? InstrumentNotLinkedPresenter$WhenMappings.$EnumSwitchMapping$1[depositPreference.ordinal()] : -1;
                    if (i13 == 1) {
                        zzd zzdVar5 = Icons.Companion;
                    } else {
                        if (i13 != 2) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1(depositPreference, "Unexpected deposit preference provided for instrument not linked sheet: ");
                            return null;
                        }
                        zzd zzdVar6 = Icons.Companion;
                        str19 = "NiiLjh";
                    }
                }
                InstrumentNotLinkedViewModel instrumentNotLinkedViewModel = new InstrumentNotLinkedViewModel(str4, str19, androidStringManager5.get(R.string.transfers_instrument_not_linked_continue_button), androidStringManager5.get(R.string.transfers_instrument_not_linked_back_button));
                gapComposer10.end(false);
                return instrumentNotLinkedViewModel;
            case 13:
                AndroidStringManager androidStringManager6 = (AndroidStringManager) obj5;
                flow.getClass();
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(-995310391);
                Unit unit4 = Unit.INSTANCE;
                boolean changedInstance8 = gapComposer11.changedInstance(shareSheetPresenter);
                Object rememberedValue37 = gapComposer11.rememberedValue();
                if (changedInstance8 || rememberedValue37 == neverEqualPolicy2) {
                    rememberedValue37 = new ChatInputView$Content$1$1$1(shareSheetPresenter, continuation4, i5);
                    gapComposer11.updateRememberedValue(rememberedValue37);
                }
                Updater.LaunchedEffect(gapComposer11, unit4, (Function2) rememberedValue37);
                Updater.LaunchedEffect(gapComposer11, flow, new TaxWebAppBridge.AnonymousClass4(flow, continuation4, shareSheetPresenter, 22));
                String str20 = androidStringManager6.get(R.string.transfers_pending_confirmation_title);
                int ordinal4 = ((TransferType) obj4).ordinal();
                if (ordinal4 == 0) {
                    str5 = androidStringManager6.get(R.string.transfers_pending_confirmation_message_cash_in);
                } else {
                    if (ordinal4 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str5 = androidStringManager6.get(R.string.transfers_pending_confirmation_message_cash_out);
                }
                PendingTransfersConfirmationViewModel pendingTransfersConfirmationViewModel = new PendingTransfersConfirmationViewModel(str20, str5, androidStringManager6.get(R.string.transfers_pending_confirmation_positive_button), androidStringManager6.get(R.string.transfers_pending_confirmation_negative_button));
                gapComposer11.end(false);
                return pendingTransfersConfirmationViewModel;
            default:
                flow.getClass();
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startReplaceGroup(645563660);
                Object rememberedValue38 = gapComposer12.rememberedValue();
                if (rememberedValue38 == neverEqualPolicy2) {
                    rememberedValue38 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer12);
                    gapComposer12.updateRememberedValue(rememberedValue38);
                }
                CoroutineScope coroutineScope = (CoroutineScope) rememberedValue38;
                AskedQuestion askedQuestion = ((DeclareCashTipBottomSheetScreen) obj3).askedQuestion;
                Object rememberedValue39 = gapComposer12.rememberedValue();
                if (rememberedValue39 == neverEqualPolicy2) {
                    rememberedValue39 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer12.updateRememberedValue(rememberedValue39);
                }
                MutableState mutableState33 = (MutableState) rememberedValue39;
                Object rememberedValue40 = gapComposer12.rememberedValue();
                if (rememberedValue40 == neverEqualPolicy2) {
                    rememberedValue40 = Updater.mutableStateOf$default(null);
                    gapComposer12.updateRememberedValue(rememberedValue40);
                }
                MutableState mutableState34 = (MutableState) rememberedValue40;
                Updater.LaunchedEffect(gapComposer12, flow, new HeroCardViewKt$Render$1$4$1(flow, null, shareSheetPresenter, askedQuestion, coroutineScope, mutableState33, mutableState34));
                CurrencyCode currencyCode10 = (CurrencyCode) obj4;
                DeclareCashTipBottomSheetViewModel declareCashTipBottomSheetViewModel = new DeclareCashTipBottomSheetViewModel(((MoneyFormatter) shareSheetPresenter.analytics).currencySymbol(currencyCode10), currencyCode10.name(), ((Boolean) mutableState33.getValue()).booleanValue(), (ToastState) mutableState34.getValue());
                gapComposer12.end(false);
                return declareCashTipBottomSheetViewModel;
        }
    }

    public String quoteText(Money money) {
        CurrencyCode currencyCode = money.currency_code;
        if (currencyCode == null) {
            currencyCode = CurrencyCode.USD;
        }
        return Recorder$$ExternalSyntheticOutline2.m(StringsKt___StringsKt.take(2, currencyCode.name()), ((MoneyFormatter) this.analytics).format(money), " ↑↓");
    }

    public ShareSheetPresenter(Context context, AndroidStringManager androidStringManager, Analytics analytics, Storage storage, BetterNavigator.ScreenNavigator screenNavigator, LowDiskSpaceAlertDialogScreen lowDiskSpaceAlertDialogScreen) {
        this.$r8$classId = 6;
        lowDiskSpaceAlertDialogScreen.getClass();
        this.shareTargetsManager = context;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.profileManager = storage;
        this.navigator = screenNavigator;
        this.modelUpdates = lowDiskSpaceAlertDialogScreen;
    }

    public ShareSheetPresenter(TransferManager transferManager, TransferActionProcessor$Factory$Impl transferActionProcessor$Factory$Impl, AndroidStringManager androidStringManager, Analytics analytics, InstrumentNotLinkedScreen instrumentNotLinkedScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 12;
        instrumentNotLinkedScreen.getClass();
        this.shareTargetsManager = transferManager;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.profileManager = instrumentNotLinkedScreen;
        this.navigator = screenNavigator;
        this.modelUpdates = transferActionProcessor$Factory$Impl.create(transferManager);
    }

    public ShareSheetPresenter(RealChatManager realChatManager, AndroidStringManager androidStringManager, AndroidNotificationManager androidNotificationManager, RealConversationService realConversationService, SupportChatScreens.FlowScreen.ChatLoading chatLoading, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 10;
        chatLoading.getClass();
        this.shareTargetsManager = realChatManager;
        this.stringManager = androidStringManager;
        this.profileManager = androidNotificationManager;
        this.analytics = realConversationService;
        this.modelUpdates = chatLoading;
        this.navigator = screenNavigator;
    }

    public ShareSheetPresenter(RealInvestingMetrics realInvestingMetrics, AndroidClock androidClock, AndroidStringManager androidStringManager, Analytics analytics, InvestingScreens.EtfHoldingsDetailsScreen etfHoldingsDetailsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 1;
        etfHoldingsDetailsScreen.getClass();
        this.shareTargetsManager = realInvestingMetrics;
        this.profileManager = androidClock;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.modelUpdates = etfHoldingsDetailsScreen;
        this.navigator = screenNavigator;
    }

    public ShareSheetPresenter(TransferOutScreen$Full transferOutScreen$Full, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, Analytics analytics, LocalizedMoneyFormatter.Factory factory) {
        this.$r8$classId = 8;
        this.shareTargetsManager = transferOutScreen$Full;
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.profileManager = factory.create(MoneyFormatterConfig.COMPACT);
        this.modelUpdates = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public ShareSheetPresenter(TaxesAppletTileRepository taxesAppletTileRepository, RealMoneyNavigatorHelper realMoneyNavigatorHelper, Analytics analytics, MoneyAnalyticsService moneyAnalyticsService, FeatureFlagManager featureFlagManager, PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl, Navigator navigator, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        this.$r8$classId = 11;
        navigator.getClass();
        this.shareTargetsManager = taxesAppletTileRepository;
        this.analytics = analytics;
        this.profileManager = moneyAnalyticsService;
        this.stringManager = featureFlagManager;
        this.navigator = realRouter$Factory$Impl.create$1(navigator);
        this.modelUpdates = promotedAppletTilePresenter$Factory$Impl.create(AppletId.TAXES);
    }

    public ShareSheetPresenter(DeclareCashTipBottomSheetScreen declareCashTipBottomSheetScreen, BetterNavigator.ScreenNavigator screenNavigator, RealClockInRepository realClockInRepository, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory) {
        CurrencyCode currencyCode;
        this.$r8$classId = 14;
        declareCashTipBottomSheetScreen.getClass();
        this.shareTargetsManager = declareCashTipBottomSheetScreen;
        this.navigator = screenNavigator;
        this.profileManager = realClockInRepository;
        this.stringManager = androidStringManager;
        this.analytics = factory.create(MoneyFormatterConfig.STANDARD);
        try {
            currencyCode = CurrencyCode.valueOf(declareCashTipBottomSheetScreen.currencyCode);
        } catch (IllegalArgumentException unused) {
            currencyCode = CurrencyCode.USD;
        }
        this.modelUpdates = currencyCode;
    }

    public ShareSheetPresenter(StuckPlayerDetector stuckPlayerDetector, RealProfileManager realProfileManager, AndroidStringManager androidStringManager, Analytics analytics, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 0;
        this.shareTargetsManager = stuckPlayerDetector;
        this.profileManager = realProfileManager;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.navigator = screenNavigator;
        this.modelUpdates = new ShareSheetPresenter$$ExternalSyntheticLambda0(this);
    }

    public ShareSheetPresenter(RealScoreRepository realScoreRepository, RealMoneyNavigatorHelper realMoneyNavigatorHelper, Navigator navigator, RealRouter$Factory$Impl realRouter$Factory$Impl, MoneyAnalyticsService moneyAnalyticsService, Analytics analytics, AndroidStringManager androidStringManager, ErrorReporter errorReporter) {
        this.$r8$classId = 9;
        navigator.getClass();
        this.shareTargetsManager = realScoreRepository;
        this.profileManager = moneyAnalyticsService;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.navigator = errorReporter;
        this.modelUpdates = realRouter$Factory$Impl.create$1(navigator);
    }

    public ShareSheetPresenter(Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, RealGenericTreeElementsRepo realGenericTreeElementsRepo, RealGenericTreeElementsPresenter$Factory$Impl realGenericTreeElementsPresenter$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator, SquareLoyaltyDetailsScreen squareLoyaltyDetailsScreen) {
        this.$r8$classId = 4;
        squareLoyaltyDetailsScreen.getClass();
        this.analytics = analytics;
        this.shareTargetsManager = realGenericTreeElementsRepo;
        this.navigator = screenNavigator;
        this.profileManager = squareLoyaltyDetailsScreen;
        this.stringManager = realGenericTreeElementsPresenter$Factory$Impl.create$1(squareLoyaltyDetailsScreen, screenNavigator);
        this.modelUpdates = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public ShareSheetPresenter(RealCustomerStore realCustomerStore, AndroidStringManager androidStringManager, Analytics analytics, SessionManager sessionManager, MerchantScreen$MerchantInfoFeedbackBottomSheetScreen merchantScreen$MerchantInfoFeedbackBottomSheetScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 2;
        merchantScreen$MerchantInfoFeedbackBottomSheetScreen.getClass();
        this.shareTargetsManager = realCustomerStore;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.profileManager = sessionManager;
        this.modelUpdates = merchantScreen$MerchantInfoFeedbackBottomSheetScreen;
        this.navigator = screenNavigator;
    }

    public ShareSheetPresenter(AndroidClock androidClock, AndroidStringManager androidStringManager, AndroidDateFormatManager androidDateFormatManager, Analytics analytics, PaymentScreens.SchedulePayment schedulePayment, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 7;
        schedulePayment.getClass();
        this.shareTargetsManager = androidClock;
        this.stringManager = androidStringManager;
        this.profileManager = androidDateFormatManager;
        this.analytics = analytics;
        this.modelUpdates = schedulePayment;
        this.navigator = screenNavigator;
    }

    public ShareSheetPresenter(RealProfileManager realProfileManager, RealUuidGenerator realUuidGenerator, LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager, CashPaymentPadOutboundNavigator$Factory$Impl cashPaymentPadOutboundNavigator$Factory$Impl, RealFxExchangeRateStreamingSubscriber realFxExchangeRateStreamingSubscriber, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 5;
        this.profileManager = realProfileManager;
        this.stringManager = androidStringManager;
        this.shareTargetsManager = realFxExchangeRateStreamingSubscriber;
        this.navigator = screenNavigator;
        this.analytics = factory.create(MoneyFormatterConfig.COMPACT);
        this.modelUpdates = cashPaymentPadOutboundNavigator$Factory$Impl.create$1(screenNavigator);
    }

    public ShareSheetPresenter(MerchantScreen$MerchantProfileScreen merchantScreen$MerchantProfileScreen, BetterNavigator.ScreenNavigator screenNavigator, ProfilePaymentHistoryPresenter$Factory$Impl profilePaymentHistoryPresenter$Factory$Impl, EglCore eglCore, RealGenericTreeElementsPresenter$Factory$Impl realGenericTreeElementsPresenter$Factory$Impl, RealBoostRepository realBoostRepository) {
        this.$r8$classId = 3;
        merchantScreen$MerchantProfileScreen.getClass();
        this.shareTargetsManager = merchantScreen$MerchantProfileScreen;
        this.navigator = screenNavigator;
        this.profileManager = profilePaymentHistoryPresenter$Factory$Impl;
        this.stringManager = eglCore;
        this.analytics = realBoostRepository;
        this.modelUpdates = realGenericTreeElementsPresenter$Factory$Impl.create$1(merchantScreen$MerchantProfileScreen, screenNavigator);
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m3744models(Flow flow, Composer composer, int i) {
        int i2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1859702632);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ChatLoadingPresenter$models$1$1(this, null, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(this, flow, i, 15);
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public TransferOutViewModel$Ready models(Flow flow, Composer composer, int i) {
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(244154731);
        TransferOutScreen$Full transferOutScreen$Full = (TransferOutScreen$Full) this.shareTargetsManager;
        Money money = transferOutScreen$Full.maxAmount;
        Money money2 = transferOutScreen$Full.currentAmount;
        AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount = new AmountPickerViewModel.Ready.Amount.MoneyAmount(money2);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(money2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Updater.LaunchedEffect(gapComposer, flow, new RealQrCodesPresenter$models$1$1(flow, (Continuation) null, this, mutableState, 17));
        Moneys.min((Money) mutableState.getValue(), money);
        Money money3 = transferOutScreen$Full.config.minimumAmount;
        AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount2 = new AmountPickerViewModel.Ready.Amount.MoneyAmount(money);
        String str = androidStringManager.get(R.string.savings_move_cash_title);
        String format2 = ((MoneyFormatter) this.modelUpdates).format(money);
        format2.getClass();
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.savings_move_cash_subtitle)).format(new Object[]{format2});
        format3.getClass();
        AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount3 = new AmountPickerViewModel.Ready.Amount.MoneyAmount(money3);
        Long l = money.amount;
        l.getClass();
        double longValue = l.longValue();
        CurrencyCode currencyCode = money.currency_code;
        currencyCode.getClass();
        final int i2 = 1;
        int displayDivisor = ((int) (longValue / Moneys.displayDivisor(currencyCode))) - 1;
        final int i3 = 0;
        int max = Math.max(0, displayDivisor);
        String str2 = androidStringManager.get(R.string.savings_move_cash_button_text);
        boolean z = Moneys.amount(money) > 0 && Moneys.compareTo((Money) mutableState.getValue(), money3) >= 0 && Moneys.compareTo((Money) mutableState.getValue(), money) <= 0;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new Function1(this) { // from class: com.squareup.cash.savings.presenters.TransferOutPresenter$$ExternalSyntheticLambda0
                public final /* synthetic */ ShareSheetPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i4 = i3;
                    ShareSheetPresenter shareSheetPresenter = this.f$0;
                    switch (i4) {
                        case 0:
                            float floatValue = ((Float) obj).floatValue();
                            TransferOutScreen$Full transferOutScreen$Full2 = (TransferOutScreen$Full) shareSheetPresenter.shareTargetsManager;
                            return floatValue == 1.0f ? new AmountPickerViewModel.Ready.Amount.MoneyAmount(transferOutScreen$Full2.maxAmount) : new AmountPickerViewModel.Ready.Amount.MoneyAmount(Moneys.roundedDown(Moneys.percent(transferOutScreen$Full2.maxAmount, floatValue)));
                        default:
                            AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount4 = (AmountPickerViewModel.Ready.Amount.MoneyAmount) obj;
                            moneyAmount4.getClass();
                            return ((MoneyFormatter) shareSheetPresenter.profileManager).format(moneyAmount4.money);
                    }
                }
            };
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Function1 function1 = (Function1) rememberedValue2;
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new Function1(this) { // from class: com.squareup.cash.savings.presenters.TransferOutPresenter$$ExternalSyntheticLambda0
                public final /* synthetic */ ShareSheetPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i4 = i2;
                    ShareSheetPresenter shareSheetPresenter = this.f$0;
                    switch (i4) {
                        case 0:
                            float floatValue = ((Float) obj).floatValue();
                            TransferOutScreen$Full transferOutScreen$Full2 = (TransferOutScreen$Full) shareSheetPresenter.shareTargetsManager;
                            return floatValue == 1.0f ? new AmountPickerViewModel.Ready.Amount.MoneyAmount(transferOutScreen$Full2.maxAmount) : new AmountPickerViewModel.Ready.Amount.MoneyAmount(Moneys.roundedDown(Moneys.percent(transferOutScreen$Full2.maxAmount, floatValue)));
                        default:
                            AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount4 = (AmountPickerViewModel.Ready.Amount.MoneyAmount) obj;
                            moneyAmount4.getClass();
                            return ((MoneyFormatter) shareSheetPresenter.profileManager).format(moneyAmount4.money);
                    }
                }
            };
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        TransferOutViewModel$Ready transferOutViewModel$Ready = new TransferOutViewModel$Ready(str, format3, moneyAmount, moneyAmount3, moneyAmount2, str2, z, function1, (Function1) rememberedValue3, max);
        gapComposer.end(false);
        return transferOutViewModel$Ready;
    }
}
