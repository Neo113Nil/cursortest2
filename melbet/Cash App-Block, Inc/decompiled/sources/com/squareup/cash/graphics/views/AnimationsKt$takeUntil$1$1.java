package com.squareup.cash.graphics.views;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.VideoCapture;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BundleKt;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.views.internal.LocalMapKt$LocalMap$2$1;
import app.cash.molecule.AndroidUiDispatcher;
import app.cash.molecule.PlatformKt;
import app.cash.molecule.RecompositionMode;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.google.android.gms.internal.mlkit_vision_barcode.zzap;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcj;
import com.google.android.gms.maps.zzai;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.camera.a.b;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.bitcoin.backend.bitcoinautowithdraw.RealBitcoinAutoWithdrawRepo;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.card.onboarding.EquatableBitmap$Companion$toEquatable$2;
import com.squareup.cash.cdf.booklet.BookletInteractDismissScreen;
import com.squareup.cash.cdf.booklet.BookletInteractScroll;
import com.squareup.cash.cdf.booklet.BookletInteractTapButton;
import com.squareup.cash.cdf.cashtagprovisioning.NfcReconnectionOutcome;
import com.squareup.cash.cdf.contact.ContactInviteFromSponsorViewStart;
import com.squareup.cash.cdf.customerprofile.CustomerProfileConnectViewAllYourHistory;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractDismissPage;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractScroll;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractTapButton;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractTapShareButton;
import com.squareup.cash.cdf.directdepositaccount.DirectDepositAccountTapEnterCompanyName;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.cdf.p2pblocklist.P2PBlockListViewStart;
import com.squareup.cash.cdf.passkey.PasskeyCreateFailedViewed;
import com.squareup.cash.cdf.passkey.PasskeyCreateSuccessViewed;
import com.squareup.cash.cdf.personalprofile.PersonalProfileShareSheetCopyCashtagLink;
import com.squareup.cash.cdf.personalprofile.PersonalProfileShareSheetMore;
import com.squareup.cash.cdf.personalprofile.PersonalProfileShareSheetSaveToPhotos;
import com.squareup.cash.cdf.personalprofile.PersonalProfileShareSheetSms;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.PaymentActionResult;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.CryptoBalanceRepoKt$asMoney$$inlined$map$1;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.activity.EntityColorForPayment;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.screens.DirectDepositEditCompanyNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckCurrencyAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckPercentageScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormDetailsScreen;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositEditPaycheckAmountViewEvent;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSingleInputViewEvent;
import com.squareup.cash.directdeposit.viewmodels.PaycheckDepositAllocationType;
import com.squareup.cash.discover.promotiondetails.backend.real.RealPromotionDetailsAnalyticsService;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetails;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewEvent;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel;
import com.squareup.cash.earnings.applets.viewmodels.EarnerAppletTileEvent$OnClickTile;
import com.squareup.cash.earnings.applets.viewmodels.EarnerAppletTileModel;
import com.squareup.cash.earnings.screens.home.EarningsHomeScreen;
import com.squareup.cash.earningstracker.screens.TimeframeSelectorSheetResult;
import com.squareup.cash.earningstracker.viewmodels.EarningsTimeframeSelectorSheetViewEvent;
import com.squareup.cash.earningstracker.viewmodels.Timeframe;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.DependentRecurringPreference;
import com.squareup.cash.family.familyhub.backend.api.FamilyParsingErrorFactory;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager$getDependents$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.presenters.DependentTeenQrCodeShareSheetPresenter$SharingState;
import com.squareup.cash.family.familyhub.presenters.SponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlsAndLimitsScreen;
import com.squareup.cash.family.familyhub.screens.DependentTeenQrCodeShareSheetScreen;
import com.squareup.cash.family.familyhub.screens.SponsorDetailScreen;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceSectionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.SponsorDetailViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.SponsorLedInviteViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.U13CelebrationViewEvent$ButtonPressed;
import com.squareup.cash.family.familyhub.views.WalletMetrics;
import com.squareup.cash.family.requestsponsorship.presenters.SelectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1;
import com.squareup.cash.family.requestsponsorship.presenters.SelectSponsorPresenter;
import com.squareup.cash.family.requestsponsorship.presenters.SponsorSelectionDetailsPresenter;
import com.squareup.cash.family.requestsponsorship.screens.SelectContactMethodScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectDependentScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorScreen;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectContactMethodViewEvent;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewEvent;
import com.squareup.cash.family.safetyhub.screens.SafetyHubScreens;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyHubViewEvent;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyHubViewModel;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.favorites.data.RealFavoritesManager$getFavorites$$inlined$map$1$2$1;
import com.squareup.cash.favorites.data.RealFavoritesRepository;
import com.squareup.cash.favorites.presenters.AddFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ReturningCustomerPasskeyLoginEnabled;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningErrorManager;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningFlowContext;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.fidesmo.views.ScanningShapePulseParams;
import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.real.RealAndroidFileParser;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.formview.components.FormCustomizedCardView;
import com.squareup.cash.formview.components.arcade.ArcadeFormDateInputView;
import com.squareup.cash.formview.components.arcade.ArcadeFormEmojiPickerKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.formview.components.arcade.InvalidInput;
import com.squareup.cash.formview.components.arcade.MultilineTextInputValidator$Result;
import com.squareup.cash.formview.components.arcade.MultilineTextInputValidator$validations$$inlined$map$1$2$1;
import com.squareup.cash.formview.components.arcade.TemplateConfig;
import com.squareup.cash.formview.components.arcade.TextInputValidator;
import com.squareup.cash.formview.components.arcade.TextInputValidator$validations$$inlined$map$1$2$1;
import com.squareup.cash.formview.presenters.FormCashtagPresenter;
import com.squareup.cash.formview.presenters.FormDateInputPresenter;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.formview.viewmodels.FormCashtagViewEvent$InputChange;
import com.squareup.cash.genericelements.backend.GenericTreeElementsData;
import com.squareup.cash.genericelements.backend.RealGenericTreeElementsRepo;
import com.squareup.cash.genericelements.presenters.GenericTreeElementsScreenPresenter$State;
import com.squareup.cash.genericelements.presenters.api.GenericTreeElementsItem;
import com.squareup.cash.genericelements.screens.GenericTreeElementsScreen;
import com.squareup.cash.genericelements.viewmodels.GenericAnalyticsData;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsHelper;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsHelper$getSharedPreference$2;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$FrameRenderer$6$1$1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.swampgl.components.Transform;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1$2$1;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.history.backend.real.RealInvestingActivitiesManager;
import com.squareup.cash.history.navigation.PaymentActionHandler$cancelOrder$$inlined$map$1$2$1;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$$inlined$filter$1;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.history.payments.presenters.ProfilePaymentHistoryPresenter;
import com.squareup.cash.history.payments.screens.PaymentHistoryScreens$ProfileCompletePaymentHistory;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewEvent$ViewAll;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.viewmodels.CheckStatusViewEvent;
import com.squareup.cash.initialscreenloader.backend.RealColdStartIntegrityChecker;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.contacts.ContactBook$Contact$DetailedContact;
import com.squareup.cash.investing.backend.real.PersistentEntityPriceCache;
import com.squareup.cash.investing.backend.real.RealHistoricalPriceTickRefresher;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.components.InvestingHomeView$2$1;
import com.squareup.cash.investing.db.WithHoldings;
import com.squareup.cash.investing.presenters.TransferStockPresenter;
import com.squareup.cash.investing.presenters.autoinvest.InvestingRecurringPurchaseReceiptPresenter;
import com.squareup.cash.investing.presenters.metrics.InvestingFinancialPresenter;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.invitations.InviteContactsPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.limits.viewmodels.UnifiedInlineMessageButton$Network;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.presenters.MoneyTabPresenter;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.moneybot.backend.api.GeneralMoneybotError;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.presenters.plugins.GenieCardPresenter;
import com.squareup.cash.moneybot.viewmodels.chat.ChatFooterViewModel$Attachment$ImageAttachment;
import com.squareup.cash.moneybot.viewmodels.plugins.GenieCardViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.onboarding.accountpicker.presenters.ValidatedAccount;
import com.squareup.cash.onboarding.accountpicker.presenters.ValidatedAccountList;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.p2pblocking.screens.P2PListData;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.cash.p2pblocking.screens.P2PScreenMode;
import com.squareup.cash.passkeys.backend.PasskeyRepository$DeregisterPasskeyResult;
import com.squareup.cash.passkeys.backend.PasskeyRepository$PasskeyRegistrationResult;
import com.squareup.cash.passkeys.backend.RealPasskeyAnalytics;
import com.squareup.cash.passkeys.backend.RealPasskeyFeatureManager;
import com.squareup.cash.passkeys.backend.RealPasskeyRepository;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$2$2;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recurringpayments.backend.RecurringPayment;
import com.squareup.cash.recurringpayments.backend.RecurringPayments;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareSheetViewEvent;
import com.squareup.cash.sharesheet.ShareTarget;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.preferences.BooleanPreference;
import com.squareup.protos.cash.aegis.api.SelectDependentsRequest;
import com.squareup.protos.cash.aegis.core.SafetyEducationHub;
import com.squareup.protos.cash.aegis.core.SafetyEducationPage;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.aegis.sync_values.GraduationCta;
import com.squareup.protos.cash.aegis.sync_values.LinkText;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.cash.blockly.api.BlocklistDetails;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersResponse;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.discover.api.app.v1.model.ShareSheet;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.CashtagStatus;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetCashtagStatusResponse;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.camera2.Camera2Controller;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;
import xyz.block.protos.genie.ViewPlan;

/* loaded from: classes6.dex */
public final class AnimationsKt$takeUntil$1$1 extends SuspendLambda implements Function2 {
    public Object $$this$flow;
    public final /* synthetic */ Object $expected;
    public final /* synthetic */ Object $other;
    public final /* synthetic */ int $r8$classId;
    public Object $this_takeUntil;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationsKt$takeUntil$1$1(String str, ValidatedAccountList validatedAccountList, Continuation continuation, TabToolbarPresenter tabToolbarPresenter, MutableState mutableState) {
        super(2, continuation);
        this.$r8$classId = 25;
        this.$this_takeUntil = str;
        this.$$this$flow = validatedAccountList;
        this.$other = tabToolbarPresenter;
        this.$expected = mutableState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r0 == r7) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$moneybot$presenters$MoneybotChatPresenter$convertAttachmentToImageMessage$2(Object obj) {
        Object m3556getData8YU3vEA;
        String str;
        byte[] bArr;
        Object withContext;
        MoneybotChatPresenter moneybotChatPresenter = (MoneybotChatPresenter) this.$expected;
        RealAndroidFileParser realAndroidFileParser = moneybotChatPresenter.androidFileParser;
        ChatFooterViewModel$Attachment$ImageAttachment chatFooterViewModel$Attachment$ImageAttachment = (ChatFooterViewModel$Attachment$ImageAttachment) this.$other;
        String str2 = chatFooterViewModel$Attachment$ImageAttachment.uri;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                str2.getClass();
                this.L$0 = coroutineScope;
                this.$this_takeUntil = str2;
                this.label = 1;
                m3556getData8YU3vEA = realAndroidFileParser.m3556getData8YU3vEA(str2, this);
                if (m3556getData8YU3vEA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = str2;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    byte[] bArr2 = (byte[]) this.$$this$flow;
                    SafeTrace.throwOnFailure(obj);
                    bArr = bArr2;
                    withContext = obj;
                    String str3 = ((FileMetadata) withContext).mimeType;
                    if (Intrinsics.areEqual(str3, "application/octet-stream")) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = chatFooterViewModel$Attachment$ImageAttachment.mimeType;
                    }
                    String str4 = str3;
                    ByteString.Companion companion = ByteString.Companion;
                    return new Message.ImageMessage(null, Message.Role.ROLE_USER, null, ByteString.Companion.of$default(bArr).base64(), str4, false, null, false);
                }
                String str5 = (String) this.$this_takeUntil;
                SafeTrace.throwOnFailure(obj);
                str = str5;
                m3556getData8YU3vEA = obj;
            }
            bArr = (byte[]) m3556getData8YU3vEA;
            if (bArr == null) {
                Timber.Forest.e("Failed to read image data from URI: " + str2, new Object[0]);
                return null;
            }
            this.L$0 = null;
            this.$this_takeUntil = null;
            this.$$this$flow = bArr;
            this.label = 2;
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new CheckStatusPresenter.AnonymousClass1.C00611(str, realAndroidFileParser, continuation, 10), this);
        } catch (Exception e) {
            moneybotChatPresenter.errorReporter.report(new GeneralMoneybotError("Failed to convert image attachment to ImageMessage", e), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            return null;
        }
    }

    private final Object invokeSuspend$com$squareup$cash$moneybot$presenters$plugins$GenieCardPresenter$content$content$2$1(Object obj) {
        ProduceStateScope produceStateScope;
        String str = (String) this.$other;
        ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = GenieCardViewModel.Content.Fallback.INSTANCE;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                if (str != null && !StringsKt.isBlank(str)) {
                    try {
                        EglCore eglCore = ((GenieCardPresenter) this.$expected).sceneLoader;
                        this.L$0 = null;
                        this.$this_takeUntil = produceStateScope2;
                        this.$$this$flow = produceStateScope2;
                        this.label = 1;
                        obj = eglCore.loadScene(str, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        produceStateScope = produceStateScope2;
                    } catch (Exception unused) {
                        obj2 = GenieCardViewModel.Content.Error.INSTANCE;
                        produceStateScope2.setValue(obj2);
                        return Unit.INSTANCE;
                    }
                }
                produceStateScope2.setValue(obj2);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            produceStateScope2 = (ProduceStateScope) this.$$this$flow;
            produceStateScope = (ProduceStateScope) this.$this_takeUntil;
            try {
                SafeTrace.throwOnFailure(obj);
            } catch (Exception unused2) {
                produceStateScope2 = produceStateScope;
                obj2 = GenieCardViewModel.Content.Error.INSTANCE;
                produceStateScope2.setValue(obj2);
                return Unit.INSTANCE;
            }
            ViewPlan viewPlan = (ViewPlan) obj;
            if (viewPlan != null) {
                obj2 = new GenieCardViewModel.Content.Rendered(viewPlan);
            }
            produceStateScope2.setValue(obj2);
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        }
    }

    private final Object invokeSuspend$com$squareup$cash$onboarding$accountpicker$presenters$AccountPickerPresenter$models$$inlined$LaunchedEffectNotNull$1(Object obj) {
        Object handleAliasFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            String str = (String) this.$this_takeUntil;
            ValidatedAccountList validatedAccountList = (ValidatedAccountList) this.$$this$flow;
            TabToolbarPresenter tabToolbarPresenter = (TabToolbarPresenter) this.$other;
            ValidatedAccount access$forAccountToken = TabToolbarPresenter.access$forAccountToken(tabToolbarPresenter, validatedAccountList.accounts, str);
            this.L$0 = null;
            this.label = 1;
            boolean enabled = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) ((RealPasskeyFeatureManager) tabToolbarPresenter.p2pSettingsManager).featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ReturningCustomerPasskeyLoginEnabled.INSTANCE)).enabled();
            if (access$forAccountToken.isPasskeyRegistered && enabled) {
                handleAliasFlow = tabToolbarPresenter.handlePasskeyFlow(access$forAccountToken, this);
                if (handleAliasFlow != coroutineSingletons) {
                    handleAliasFlow = Unit.INSTANCE;
                }
            } else {
                handleAliasFlow = tabToolbarPresenter.handleAliasFlow(access$forAccountToken, this);
                if (handleAliasFlow != coroutineSingletons) {
                    handleAliasFlow = Unit.INSTANCE;
                }
            }
            if (handleAliasFlow == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        ((MutableState) this.$expected).setValue(null);
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$p2pblocking$presenters$SelectCustomerPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$this_takeUntil;
            AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$2 = new AndroidPermissionChecker$granted$$inlined$map$2$2(coroutineScope, (SelectCustomerPresenter) this.$$this$flow, (CoroutineScope) this.$other, (MutableState) this.$expected, 5);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(androidPermissionChecker$granted$$inlined$map$2$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0051, code lost:
    
        if (r12 == r5) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$passkeys$presenters$PasskeyManagementPresenter$models$3$1(Object obj) {
        PasskeyManagementViewModel.OperationState operationState;
        PasskeyRepository$DeregisterPasskeyResult passkeyRepository$DeregisterPasskeyResult;
        Object error;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.$expected;
        MutableState mutableState = (MutableState) this.$other;
        WorkHomePresenter workHomePresenter = (WorkHomePresenter) this.$$this$flow;
        RealPasskeyRepository realPasskeyRepository = (RealPasskeyRepository) workHomePresenter.shiftsAnalytics;
        RealPasskeyAnalytics realPasskeyAnalytics = (RealPasskeyAnalytics) workHomePresenter.payPresenter;
        AndroidStringManager androidStringManager = (AndroidStringManager) workHomePresenter.shiftSection2Presenter;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            PasskeyManagementViewModel.OperationState operationState2 = (PasskeyManagementViewModel.OperationState) mutableState.getValue();
            if (operationState2 instanceof PasskeyManagementViewModel.OperationState.Create.InProgress) {
                this.L$0 = null;
                this.label = 1;
                obj = realPasskeyRepository.registerPasskey(null, null, this);
            } else if (operationState2 instanceof PasskeyManagementViewModel.OperationState.Remove.InProgress) {
                PasskeyManagementViewModel.OperationState.Remove.InProgress inProgress = (PasskeyManagementViewModel.OperationState.Remove.InProgress) operationState2;
                String str = inProgress.passkey.id;
                this.L$0 = inProgress;
                this.$this_takeUntil = mutableState;
                this.label = 2;
                Object deregisterPasskey = realPasskeyRepository.deregisterPasskey(str, this);
                if (deregisterPasskey != coroutineSingletons) {
                    obj = deregisterPasskey;
                    operationState = operationState2;
                    passkeyRepository$DeregisterPasskeyResult = (PasskeyRepository$DeregisterPasskeyResult) obj;
                    if (!Intrinsics.areEqual(passkeyRepository$DeregisterPasskeyResult, PasskeyRepository$DeregisterPasskeyResult.Success.INSTANCE)) {
                    }
                    mutableState.setValue(error);
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            SafeTrace.throwOnFailure(obj);
            PasskeyRepository$PasskeyRegistrationResult passkeyRepository$PasskeyRegistrationResult = (PasskeyRepository$PasskeyRegistrationResult) obj;
            if (Intrinsics.areEqual(passkeyRepository$PasskeyRegistrationResult, PasskeyRepository$PasskeyRegistrationResult.Success.INSTANCE)) {
                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                mutableState.setValue(new PasskeyManagementViewModel.OperationState.Create.Success(null));
                realPasskeyAnalytics.analytics.track(new PasskeyCreateSuccessViewed(), null);
            } else if (Intrinsics.areEqual(passkeyRepository$PasskeyRegistrationResult, PasskeyRepository$PasskeyRegistrationResult.Cancelled.INSTANCE)) {
                mutableState.setValue(null);
            } else if (Intrinsics.areEqual(passkeyRepository$PasskeyRegistrationResult, PasskeyRepository$PasskeyRegistrationResult.DuplicateCredentialOnDevice.INSTANCE)) {
                mutableState.setValue(new PasskeyManagementViewModel.OperationState.Create.Error(androidStringManager.get(R.string.passkeys_create_duplicate_title), androidStringManager.get(R.string.passkeys_create_duplicate_body), false, false));
                realPasskeyAnalytics.analytics.track(new PasskeyCreateFailedViewed(), null);
            } else if (Intrinsics.areEqual(passkeyRepository$PasskeyRegistrationResult, PasskeyRepository$PasskeyRegistrationResult.DeviceNotSupported.INSTANCE)) {
                mutableState.setValue(new PasskeyManagementViewModel.OperationState.Create.Error(androidStringManager.get(R.string.passkeys_create_device_not_supported_title), androidStringManager.get(R.string.passkeys_create_device_not_supported_body), false, true));
                realPasskeyAnalytics.analytics.track(new PasskeyCreateFailedViewed(), null);
            } else {
                if (!Intrinsics.areEqual(passkeyRepository$PasskeyRegistrationResult, PasskeyRepository$PasskeyRegistrationResult.Error.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                mutableState.setValue(new PasskeyManagementViewModel.OperationState.Create.Error(androidStringManager.get(R.string.passkeys_create_error_title), androidStringManager.get(R.string.passkeys_create_error_body), true, false));
                realPasskeyAnalytics.analytics.track(new PasskeyCreateFailedViewed(), null);
            }
            return Unit.INSTANCE;
        }
        if (i != 2) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mutableState = (MutableState) this.$this_takeUntil;
        operationState = (PasskeyManagementViewModel.OperationState.Remove.InProgress) this.L$0;
        SafeTrace.throwOnFailure(obj);
        passkeyRepository$DeregisterPasskeyResult = (PasskeyRepository$DeregisterPasskeyResult) obj;
        if (!Intrinsics.areEqual(passkeyRepository$DeregisterPasskeyResult, PasskeyRepository$DeregisterPasskeyResult.Success.INSTANCE)) {
            parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
            error = new PasskeyManagementViewModel.OperationState.Remove.Success(((PasskeyManagementViewModel.OperationState.Remove.InProgress) operationState).passkey);
        } else {
            if (!Intrinsics.areEqual(passkeyRepository$DeregisterPasskeyResult, PasskeyRepository$DeregisterPasskeyResult.Error.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            error = new PasskeyManagementViewModel.OperationState.Remove.Error(((PasskeyManagementViewModel.OperationState.Remove.InProgress) operationState).passkey);
        }
        mutableState.setValue(error);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$expected;
        Object obj3 = this.$other;
        switch (i) {
            case 0:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$1 = new AnimationsKt$takeUntil$1$1((SafeFlow) this.$this_takeUntil, (FlowCollector) this.$$this$flow, (SwipeableState$special$$inlined$filter$1) obj3, (CancellationException) obj2, continuation, 0);
                animationsKt$takeUntil$1$1.L$0 = obj;
                return animationsKt$takeUntil$1$1;
            case 1:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$12 = new AnimationsKt$takeUntil$1$1((Flow) this.$this_takeUntil, continuation, (MutableState) this.$$this$flow, (ArcadeFormDateInputView) obj3, (DelegatingSoftwareKeyboardController) obj2, 1);
                animationsKt$takeUntil$1$12.L$0 = obj;
                return animationsKt$takeUntil$1$12;
            case 2:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$13 = new AnimationsKt$takeUntil$1$1((Flow) this.$this_takeUntil, continuation, (FormDateInputPresenter) this.$$this$flow, (MutableState) obj3, (MutableState) obj2, 2);
                animationsKt$takeUntil$1$13.L$0 = obj;
                return animationsKt$takeUntil$1$13;
            case 3:
                return new AnimationsKt$takeUntil$1$1((LocalEditorialPresenter) obj3, (MutableState) obj2, continuation, 3);
            case 4:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$14 = new AnimationsKt$takeUntil$1$1((ProduceStateScope) this.$$this$flow, (GLSceneScope) obj3, (TextureType) obj2, continuation, 4);
                animationsKt$takeUntil$1$14.L$0 = obj;
                return animationsKt$takeUntil$1$14;
            case 5:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$15 = new AnimationsKt$takeUntil$1$1((Flow) this.$this_takeUntil, continuation, (zzai) this.$$this$flow, (GrowToolsManagerState) obj3, (MutableState) obj2, 5);
                animationsKt$takeUntil$1$15.L$0 = obj;
                return animationsKt$takeUntil$1$15;
            case 6:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$16 = new AnimationsKt$takeUntil$1$1((Flow) this.$this_takeUntil, continuation, (TransfersPresenter) this.$$this$flow, (MutableState) obj3, (MutableState) obj2, 6);
                animationsKt$takeUntil$1$16.L$0 = obj;
                return animationsKt$takeUntil$1$16;
            case 7:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$17 = new AnimationsKt$takeUntil$1$1((Set) obj3, (RealColdStartIntegrityChecker) obj2, continuation, 7);
                animationsKt$takeUntil$1$17.$$this$flow = obj;
                return animationsKt$takeUntil$1$17;
            case 8:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$18 = new AnimationsKt$takeUntil$1$1((GpsConfigQueries) this.$this_takeUntil, (PersistentEntityPriceCache) this.$$this$flow, (CryptoBalanceRepoKt$asMoney$$inlined$map$1) obj3, (ProducerScope) obj2, continuation, 8);
                animationsKt$takeUntil$1$18.L$0 = obj;
                return animationsKt$takeUntil$1$18;
            case 9:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$19 = new AnimationsKt$takeUntil$1$1((RealHistoricalPriceTickRefresher) obj3, (HistoricalRange) obj2, continuation, 9);
                animationsKt$takeUntil$1$19.$this_takeUntil = obj;
                return animationsKt$takeUntil$1$19;
            case 10:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$110 = new AnimationsKt$takeUntil$1$1((RealInvestingHistoricalData) this.$this_takeUntil, (HistoricalRange) this.$$this$flow, (String) obj3, (ProducerScope) obj2, continuation, 10);
                animationsKt$takeUntil$1$110.L$0 = obj;
                return animationsKt$takeUntil$1$110;
            case 11:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$111 = new AnimationsKt$takeUntil$1$1((Flow) this.$this_takeUntil, continuation, (TapToPayPresenter) this.$$this$flow, (MutableState) obj3, (MutableState) obj2, 11);
                animationsKt$takeUntil$1$111.L$0 = obj;
                return animationsKt$takeUntil$1$111;
            case 12:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$112 = new AnimationsKt$takeUntil$1$1((TransferStockPresenter) this.$this_takeUntil, (WithHoldings) obj3, (State) obj2, continuation);
                animationsKt$takeUntil$1$112.L$0 = obj;
                return animationsKt$takeUntil$1$112;
            case 13:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$113 = new AnimationsKt$takeUntil$1$1((Flow) this.$this_takeUntil, continuation, (DependentRecurringPreference.RecurringPreferenceLoaded) this.$$this$flow, (InvestingRecurringPurchaseReceiptPresenter) obj3, (MutableState) obj2, 13);
                animationsKt$takeUntil$1$113.L$0 = obj;
                return animationsKt$takeUntil$1$113;
            case 14:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$114 = new AnimationsKt$takeUntil$1$1((Flow) this.$this_takeUntil, continuation, (LocalHomePresenter) this.$$this$flow, (MutableState) obj3, (MutableState) obj2, 14);
                animationsKt$takeUntil$1$114.L$0 = obj;
                return animationsKt$takeUntil$1$114;
            case 15:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$115 = new AnimationsKt$takeUntil$1$1((Flow) this.$this_takeUntil, continuation, (InvestingFinancialPresenter) this.$$this$flow, (MutableState) obj3, (MutableState) obj2, 15);
                animationsKt$takeUntil$1$115.L$0 = obj;
                return animationsKt$takeUntil$1$115;
            case 16:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$116 = new AnimationsKt$takeUntil$1$1((Flow) this.$this_takeUntil, continuation, (InviteContactsPresenter) this.$$this$flow, (MutableSharedFlow) obj3, (MutableState) obj2, 16);
                animationsKt$takeUntil$1$116.L$0 = obj;
                return animationsKt$takeUntil$1$116;
            case 17:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$117 = new AnimationsKt$takeUntil$1$1((UnifiedInlineMessageButton$Network) this.$this_takeUntil, continuation, (MusicPresenter) this.$$this$flow, (MutableState) obj3, (MutableState) obj2, 17);
                animationsKt$takeUntil$1$117.L$0 = obj;
                return animationsKt$takeUntil$1$117;
            case 18:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$118 = new AnimationsKt$takeUntil$1$1((Flow) this.$this_takeUntil, continuation, (LocalCashBalancePresenter) this.$$this$flow, (MutableState) obj3, (State) obj2, 18);
                animationsKt$takeUntil$1$118.L$0 = obj;
                return animationsKt$takeUntil$1$118;
            case 19:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$119 = new AnimationsKt$takeUntil$1$1((EglCore) this.$this_takeUntil, (String) this.$$this$flow, (GetProfileDetailsContext) obj3, (String) obj2, continuation, 19);
                animationsKt$takeUntil$1$119.L$0 = obj;
                return animationsKt$takeUntil$1$119;
            case 20:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$120 = new AnimationsKt$takeUntil$1$1((Flow) this.$this_takeUntil, continuation, (ShareSheetPresenter) this.$$this$flow, (ParcelableSnapshotMutableIntState) obj3, (MutableState) obj2, 20);
                animationsKt$takeUntil$1$120.L$0 = obj;
                return animationsKt$takeUntil$1$120;
            case 21:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$121 = new AnimationsKt$takeUntil$1$1((MoneyTabPresenter$models$lambda$31$$inlined$map$1) this.$this_takeUntil, continuation, (MoneyTabPresenter) this.$$this$flow, (MutableState) obj3, (MutableState) obj2, 21);
                animationsKt$takeUntil$1$121.L$0 = obj;
                return animationsKt$takeUntil$1$121;
            case 22:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$122 = new AnimationsKt$takeUntil$1$1((ChatFooterViewModel$Attachment$ImageAttachment) obj3, (MoneybotChatPresenter) obj2, continuation, 22);
                animationsKt$takeUntil$1$122.L$0 = obj;
                return animationsKt$takeUntil$1$122;
            case 23:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$123 = new AnimationsKt$takeUntil$1$1((String) obj3, (GenieCardPresenter) obj2, continuation, 23);
                animationsKt$takeUntil$1$123.L$0 = obj;
                return animationsKt$takeUntil$1$123;
            case 24:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$124 = new AnimationsKt$takeUntil$1$1((Flow) this.$this_takeUntil, continuation, (CardLockPresenter) this.$$this$flow, (MutableState) obj3, (MutableState) obj2, 24);
                animationsKt$takeUntil$1$124.L$0 = obj;
                return animationsKt$takeUntil$1$124;
            case 25:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$125 = new AnimationsKt$takeUntil$1$1((String) this.$this_takeUntil, (ValidatedAccountList) this.$$this$flow, continuation, (TabToolbarPresenter) obj3, (MutableState) obj2);
                animationsKt$takeUntil$1$125.L$0 = obj;
                return animationsKt$takeUntil$1$125;
            case 26:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$126 = new AnimationsKt$takeUntil$1$1((Flow) this.$this_takeUntil, continuation, (CardLockPresenter) this.$$this$flow, (MutableState) obj3, (MutableState) obj2, 26);
                animationsKt$takeUntil$1$126.L$0 = obj;
                return animationsKt$takeUntil$1$126;
            case 27:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$127 = new AnimationsKt$takeUntil$1$1((Flow) this.$this_takeUntil, continuation, (SelectCustomerPresenter) this.$$this$flow, (CoroutineScope) obj3, (MutableState) obj2, 27);
                animationsKt$takeUntil$1$127.L$0 = obj;
                return animationsKt$takeUntil$1$127;
            case 28:
                return new AnimationsKt$takeUntil$1$1((WorkHomePresenter) this.$$this$flow, (MutableState) obj3, (ParcelableSnapshotMutableIntState) obj2, continuation, 28);
            default:
                AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$128 = new AnimationsKt$takeUntil$1$1((WorkHomePresenter) this.$this_takeUntil, (MutableState) this.$$this$flow, (MutableState) obj3, (MutableState) obj2, continuation, 29);
                animationsKt$takeUntil$1$128.L$0 = obj;
                return animationsKt$takeUntil$1$128;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((AnimationsKt$takeUntil$1$1) create((Bitmap) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((AnimationsKt$takeUntil$1$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((AnimationsKt$takeUntil$1$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((AnimationsKt$takeUntil$1$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((AnimationsKt$takeUntil$1$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((AnimationsKt$takeUntil$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((AnimationsKt$takeUntil$1$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:330:0x08dc -> B:331:0x0827). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 3152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public /* synthetic */ Object $$this$coroutineScope;
        public final /* synthetic */ Object $expected;
        public Object $other;
        public final /* synthetic */ int $r8$classId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ServiceDeliveryClient serviceDeliveryClient, int i, RealFidesmoClient realFidesmoClient, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 10;
            this.$$this$coroutineScope = serviceDeliveryClient;
            this.label = i;
            this.$expected = realFidesmoClient;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.$expected;
            switch (i) {
                case 0:
                    return new AnonymousClass1((SwipeableState$special$$inlined$filter$1) this.$other, (CoroutineScope) this.$$this$coroutineScope, (CancellationException) obj2, continuation, 0);
                case 1:
                    return new AnonymousClass1((Animatable) this.$other, (Animatable) this.$$this$coroutineScope, (WalletMetrics) obj2, continuation, 1);
                case 2:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((Flow) this.$$this$coroutineScope, continuation, (VerifyCheckDialogPresenter) obj2, 2);
                    anonymousClass1.$other = obj;
                    return anonymousClass1;
                case 3:
                    return new AnonymousClass1((LocalEditorialPresenter) this.$other, (SelectContactMethodViewEvent) this.$$this$coroutineScope, (MutableState) obj2, continuation, 3);
                case 4:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1((Flow) this.$$this$coroutineScope, continuation, (VerifyCheckDialogPresenter) obj2, 4);
                    anonymousClass12.$other = obj;
                    return anonymousClass12;
                case 5:
                    return new AnonymousClass1((SelectSponsorPresenter) this.$other, (SelectSponsorViewEvent) this.$$this$coroutineScope, (MutableState) obj2, continuation, 5);
                case 6:
                    return new AnonymousClass1((SponsorSelectionDetailsPresenter) this.$other, (SponsorSelectionDetailsPresenter.SmsParams) this.$$this$coroutineScope, (MutableState) obj2, continuation, 6);
                case 7:
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1((Flow) this.$$this$coroutineScope, continuation, (VerifyCheckDialogPresenter) obj2, 7);
                    anonymousClass13.$other = obj;
                    return anonymousClass13;
                case 8:
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1((Flow) this.$$this$coroutineScope, continuation, (EndAppLockPresenter) obj2, 8);
                    anonymousClass14.$other = obj;
                    return anonymousClass14;
                case 9:
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1((Flow) this.$$this$coroutineScope, continuation, (VerifyCheckDialogPresenter) obj2, 9);
                    anonymousClass15.$other = obj;
                    return anonymousClass15;
                case 10:
                    AnonymousClass1 anonymousClass16 = new AnonymousClass1((ServiceDeliveryClient) this.$$this$coroutineScope, this.label, (RealFidesmoClient) obj2, continuation);
                    anonymousClass16.$other = obj;
                    return anonymousClass16;
                case 11:
                    return new AnonymousClass1((Integer) this.$other, (Animatable) this.$$this$coroutineScope, (MutableState) obj2, continuation, 11);
                case 12:
                    return new AnonymousClass1((byte[]) this.$$this$coroutineScope, (MutableState) obj2, continuation, 12);
                case 13:
                    return new AnonymousClass1((MutableState) this.$other, (ArcadeFormDateInputView) this.$$this$coroutineScope, (DelegatingSoftwareKeyboardController) obj2, continuation, 13);
                case 14:
                    return new AnonymousClass1((ArcadeFormTextInputGroupView) this.$other, this.label, (TextFieldState) this.$$this$coroutineScope, (List) obj2, continuation, 14);
                case 15:
                    return new AnonymousClass1((List) this.$other, this.label, (ArcadeFormTextInputGroupView.InputFieldModel) this.$$this$coroutineScope, (MutableState) obj2, continuation, 15);
                case 16:
                    AnonymousClass1 anonymousClass17 = new AnonymousClass1((FormCashtagPresenter) this.$$this$coroutineScope, (String) obj2, continuation, 16);
                    anonymousClass17.$other = obj;
                    return anonymousClass17;
                case 17:
                    return new AnonymousClass1((FormCashtagPresenter) this.$other, (FormCashtagViewEvent$InputChange) this.$$this$coroutineScope, (MutableState) obj2, continuation, 17);
                case 18:
                    return new AnonymousClass1((EndAppLockPresenter) this.$other, (MutableState) this.$$this$coroutineScope, (MutableState) obj2, continuation, 18);
                case 19:
                    AnonymousClass1 anonymousClass18 = new AnonymousClass1((Flow) this.$$this$coroutineScope, continuation, (LocalEditorialPresenter) obj2, 19);
                    anonymousClass18.$other = obj;
                    return anonymousClass18;
                case 20:
                    return new AnonymousClass1((LocalEditorialPresenter) this.$other, (MutableState) this.$$this$coroutineScope, (MutableState) obj2, continuation, 20);
                case 21:
                    AnonymousClass1 anonymousClass19 = new AnonymousClass1((Flow) this.$$this$coroutineScope, continuation, (StuckPlayerDetector) obj2, 21);
                    anonymousClass19.$other = obj;
                    return anonymousClass19;
                case 22:
                    AnonymousClass1 anonymousClass110 = new AnonymousClass1((String) this.$$this$coroutineScope, (ComposableLambdaImpl) obj2, continuation, 22);
                    anonymousClass110.$other = obj;
                    return anonymousClass110;
                case 23:
                    return new AnonymousClass1((Function1) this.$other, (String) this.$$this$coroutineScope, (ComposableLambdaImpl) obj2, continuation, 23);
                case 24:
                    AnonymousClass1 anonymousClass111 = new AnonymousClass1((GLSceneScope) obj2, continuation);
                    anonymousClass111.$$this$coroutineScope = obj;
                    return anonymousClass111;
                case 25:
                    return new AnonymousClass1((State) this.$other, (Function1) this.$$this$coroutineScope, (MutableState) obj2, continuation, 25);
                case 26:
                    AnonymousClass1 anonymousClass112 = new AnonymousClass1((Flow) this.$$this$coroutineScope, continuation, (MusicPresenter) obj2, 26);
                    anonymousClass112.$other = obj;
                    return anonymousClass112;
                case 27:
                    AnonymousClass1 anonymousClass113 = new AnonymousClass1((Flow) this.$$this$coroutineScope, continuation, (DisclosurePresenter) obj2, 27);
                    anonymousClass113.$other = obj;
                    return anonymousClass113;
                case 28:
                    return new AnonymousClass1((RealBugReportSenderFactory) this.$other, (GrowToolsManagerState) this.$$this$coroutineScope, (MutableState) obj2, continuation, 28);
                default:
                    AnonymousClass1 anonymousClass114 = new AnonymousClass1((RealInvestingActivitiesManager) this.$$this$coroutineScope, (ChronoUnit) obj2, continuation, 29);
                    anonymousClass114.$other = obj;
                    return anonymousClass114;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 1:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 2:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 3:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 4:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 5:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 6:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 7:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 8:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 9:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 10:
                    return ((AnonymousClass1) create((RealFidesmoClient.ActiveDeliveryReconnectEvent) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 11:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 12:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 13:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 14:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 15:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 16:
                    return ((AnonymousClass1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 17:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 18:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 19:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 20:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 21:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 22:
                    ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                case 23:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 24:
                    ((AnonymousClass1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                case 25:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 26:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 27:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 28:
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                default:
                    return ((AnonymousClass1) create((Activities) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:106:0x01c4, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.first(r4, r19) == r1) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:229:0x04b4, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r0, r19) == r2) goto L220;
         */
        /* JADX WARN: Code restructure failed: missing block: B:231:?, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:247:0x0460, code lost:
        
            if (r0 == r2) goto L220;
         */
        /* JADX WARN: Code restructure failed: missing block: B:249:0x044b, code lost:
        
            if (r1.emit(r4, r19) == r2) goto L220;
         */
        /* JADX WARN: Code restructure failed: missing block: B:317:0x05f7, code lost:
        
            if (r1 == r0) goto L277;
         */
        /* JADX WARN: Code restructure failed: missing block: B:332:0x06e2, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, null, null, r19, 12) == r10) goto L311;
         */
        /* JADX WARN: Code restructure failed: missing block: B:334:?, code lost:
        
            return r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:337:0x06b7, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(r0, r19) == r10) goto L311;
         */
        /* JADX WARN: Code restructure failed: missing block: B:340:0x06a6, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r4, null, null, r19, 12) == r10) goto L311;
         */
        /* JADX WARN: Code restructure failed: missing block: B:343:0x0674, code lost:
        
            if (r0.snapTo(r1, r19) == r10) goto L311;
         */
        /* JADX WARN: Code restructure failed: missing block: B:347:0x0665, code lost:
        
            if (r0.stop(r19) == r10) goto L311;
         */
        /* JADX WARN: Code restructure failed: missing block: B:422:0x0880, code lost:
        
            if (r0 == r15) goto L399;
         */
        /* JADX WARN: Code restructure failed: missing block: B:424:?, code lost:
        
            return r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:433:0x08fe, code lost:
        
            if (r0 == r15) goto L399;
         */
        /* JADX WARN: Code restructure failed: missing block: B:486:0x0a43, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r2, r1, null, null, r19, 12) == r7) goto L447;
         */
        /* JADX WARN: Code restructure failed: missing block: B:488:?, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:490:0x0a1c, code lost:
        
            if (r0.snapTo(r1, r19) == r7) goto L447;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v54, types: [com.squareup.cash.card.onboarding.EquatableBitmap] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            Object obj4;
            float f;
            Object obj5;
            Object withContext;
            MutableState mutableState;
            Object withContext2;
            MutableState mutableState2;
            MutableState mutableState3;
            Object obj6;
            Object until;
            Flow appLockMonitor$special$$inlined$map$2;
            Object genericElementTree;
            Object withContext3;
            ProduceStateScope produceStateScope;
            Object disableAutoWithdraw;
            List list;
            int i = this.$r8$classId;
            int i2 = 23;
            int i3 = 24;
            int i4 = 8;
            int i5 = 5;
            int i6 = 3;
            int i7 = 2;
            Object obj7 = this.$expected;
            int i8 = 1;
            Continuation continuation = null;
            continuation = null;
            continuation = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$1 = (SwipeableState$special$$inlined$filter$1) this.$other;
                        C00601 c00601 = new C00601(r10 ? 1 : 0, (CoroutineScope) this.$$this$coroutineScope, (CancellationException) obj7);
                        this.label = 1;
                        if (swipeableState$special$$inlined$filter$1.collect(c00601, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable = (Animatable) this.$other;
                        Float f2 = new Float(1.0f);
                        this.label = 1;
                        break;
                    } else {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    Animatable animatable2 = (Animatable) this.$$this$coroutineScope;
                    Float f3 = new Float(((WalletMetrics) obj7).cardRestTopPx);
                    SpringSpec spring$default = AnimatableKt.spring$default(0.88f, 540.0f, null, 4);
                    this.label = 2;
                    break;
                case 2:
                    CoroutineScope coroutineScope = (CoroutineScope) this.$other;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow = (Flow) this.$$this$coroutineScope;
                        FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass4 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope, (VerifyCheckDialogPresenter) obj7, i2);
                        this.$other = null;
                        this.label = 1;
                        if (flow.collect(anonymousClass4, this) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    } else {
                        if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 3:
                    Object obj8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.$other;
                        SelectContactMethodViewEvent.Select select = (SelectContactMethodViewEvent.Select) ((SelectContactMethodViewEvent) this.$$this$coroutineScope);
                        MutableState mutableState4 = (MutableState) obj7;
                        this.label = 1;
                        mutableState4.setValue(Boolean.TRUE);
                        AppService appService = (AppService) localEditorialPresenter.service;
                        UiCustomer sendableUiCustomer = DrawableCompat.transform(select.sponsor).toSendableUiCustomer();
                        Recipient recipient = select.sponsor;
                        boolean z = recipient.isInContacts;
                        boolean z2 = recipient.isFavorited;
                        SelectContactMethodScreen selectContactMethodScreen = (SelectContactMethodScreen) localEditorialPresenter.screen;
                        Object selectSponsor = zzcj.selectSponsor(appService, sendableUiCustomer, z, z2, selectContactMethodScreen.isRecommended, (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator, selectContactMethodScreen, (BlockersDataNavigator) localEditorialPresenter.installedStore, (AndroidStringManager) localEditorialPresenter.stringManager, (Signal) localEditorialPresenter.clock, ((ModifiablePermissions) localEditorialPresenter.responseContextHandler).check(), recipient.isCashCustomer, recipient.fullName, new DrawerViewKt$$ExternalSyntheticLambda2(i2, mutableState4), this);
                        Object obj9 = selectSponsor;
                        if (selectSponsor != obj8) {
                            obj9 = Unit.INSTANCE;
                        }
                        if (obj9 == obj8) {
                            return obj8;
                        }
                    } else {
                        if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 4:
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.$other;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow2 = (Flow) this.$$this$coroutineScope;
                        FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass42 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope2, (VerifyCheckDialogPresenter) obj7, i3);
                        this.$other = null;
                        this.label = 1;
                        if (flow2.collect(anonymousClass42, this) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    } else {
                        if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 5:
                    MutableState mutableState5 = (MutableState) obj7;
                    Object obj10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SelectSponsorPresenter selectSponsorPresenter = (SelectSponsorPresenter) this.$other;
                        ModifiablePermissions modifiablePermissions = selectSponsorPresenter.contactsPermission;
                        Signal signal = selectSponsorPresenter.signOutSignal;
                        AndroidStringManager androidStringManager = selectSponsorPresenter.stringManager;
                        BlockersDataNavigator blockersDataNavigator = selectSponsorPresenter.blockersNavigator;
                        BetterNavigator.ScreenNavigator screenNavigator = selectSponsorPresenter.navigator;
                        SelectSponsorScreen selectSponsorScreen = selectSponsorPresenter.selectSponsorScreen;
                        SelectSponsorViewEvent selectSponsorViewEvent = (SelectSponsorViewEvent) this.$$this$coroutineScope;
                        if (selectSponsorScreen != null) {
                            SelectSponsorViewEvent.SponsorRowTapped sponsorRowTapped = (SelectSponsorViewEvent.SponsorRowTapped) selectSponsorViewEvent;
                            this.label = 1;
                            Recipient recipient2 = sponsorRowTapped.sponsor;
                            if (recipient2.isCashCustomer || !SelectSponsorPresenter.getHasMultipleContactMethods(recipient2)) {
                                mutableState5.setValue(Boolean.TRUE);
                                obj2 = obj10;
                                Object selectSponsor2 = zzcj.selectSponsor(selectSponsorPresenter.franklinAppService, DrawableCompat.transform(recipient2).toSendableUiCustomer(), recipient2.isInContacts, recipient2.isFavorited, sponsorRowTapped.isRecommended, screenNavigator, selectSponsorScreen, blockersDataNavigator, androidStringManager, signal, modifiablePermissions.check(), recipient2.isCashCustomer, recipient2.fullName, new DrawerViewKt$$ExternalSyntheticLambda2(25, mutableState5), this);
                                obj4 = selectSponsor2;
                                if (selectSponsor2 != obj2) {
                                    obj4 = Unit.INSTANCE;
                                    break;
                                }
                            } else {
                                screenNavigator.goTo(new SelectContactMethodScreen(selectSponsorScreen.blockersData, recipient2, sponsorRowTapped.isRecommended));
                                obj2 = obj10;
                                obj4 = Unit.INSTANCE;
                                break;
                            }
                        } else {
                            obj2 = obj10;
                            SelectSponsorViewEvent.SponsorRowTapped sponsorRowTapped2 = (SelectSponsorViewEvent.SponsorRowTapped) selectSponsorViewEvent;
                            this.label = 2;
                            SelectDependentScreen selectDependentScreen = selectSponsorPresenter.selectDependentScreen;
                            Recipient recipient3 = sponsorRowTapped2.sponsor;
                            if (recipient3.isCashCustomer || !SelectSponsorPresenter.getHasMultipleContactMethods(recipient3)) {
                                mutableState5.setValue(Boolean.TRUE);
                                AegisService aegisService = selectSponsorPresenter.service;
                                UiCustomer sendableUiCustomer2 = DrawableCompat.transform(recipient3).toSendableUiCustomer();
                                boolean z3 = recipient3.isInContacts;
                                boolean z4 = recipient3.isFavorited;
                                selectDependentScreen.getClass();
                                Object selectDependent = zzap.selectDependent(aegisService, SelectDependentsRequest.Action.SELECT, sendableUiCustomer2, Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(recipient3.isCashCustomer), recipient3.displayName, screenNavigator, selectDependentScreen, blockersDataNavigator, androidStringManager, signal, Boolean.valueOf(modifiablePermissions.check()), new DrawerViewKt$$ExternalSyntheticLambda2(i3, mutableState5), this);
                                obj3 = selectDependent;
                                if (selectDependent != obj2) {
                                    obj3 = Unit.INSTANCE;
                                }
                                if (obj3 != obj2) {
                                    obj3 = Unit.INSTANCE;
                                    break;
                                }
                            } else {
                                selectDependentScreen.getClass();
                                screenNavigator.goTo(new SelectContactMethodScreen(selectDependentScreen.blockersData, recipient3, sponsorRowTapped2.isRecommended));
                                obj3 = Unit.INSTANCE;
                                break;
                            }
                        }
                    } else {
                        if (i14 != 1 && i14 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 6:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SponsorSelectionDetailsPresenter sponsorSelectionDetailsPresenter = (SponsorSelectionDetailsPresenter) this.$other;
                        SponsorSelectionDetailsPresenter.SmsParams smsParams = (SponsorSelectionDetailsPresenter.SmsParams) this.$$this$coroutineScope;
                        this.label = 1;
                        if (sponsorSelectionDetailsPresenter.confirmSelectedSponsor(smsParams.sponsor, smsParams.inviteCode, null, null, null, null, (MutableState) obj7, this) == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 7:
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.$other;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow3 = (Flow) this.$$this$coroutineScope;
                        FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass43 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope3, (VerifyCheckDialogPresenter) obj7, 25);
                        this.$other = null;
                        this.label = 1;
                        if (flow3.collect(anonymousClass43, this) == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                    } else {
                        if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 8:
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.$other;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow4 = (Flow) this.$$this$coroutineScope;
                        FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass44 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope4, (EndAppLockPresenter) obj7, 26);
                        this.$other = null;
                        this.label = 1;
                        if (flow4.collect(anonymousClass44, this) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 9:
                    CoroutineScope coroutineScope5 = (CoroutineScope) this.$other;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow5 = (Flow) this.$$this$coroutineScope;
                        FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass45 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope5, (VerifyCheckDialogPresenter) obj7, 27);
                        this.$other = null;
                        this.label = 1;
                        if (flow5.collect(anonymousClass45, this) == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                    } else {
                        if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 10:
                    RealFidesmoClient.ActiveDeliveryReconnectEvent activeDeliveryReconnectEvent = (RealFidesmoClient.ActiveDeliveryReconnectEvent) this.$other;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ServiceDeliveryClient serviceDeliveryClient = activeDeliveryReconnectEvent.client;
                    ServiceDeliveryClient serviceDeliveryClient2 = (ServiceDeliveryClient) this.$$this$coroutineScope;
                    return Boolean.valueOf((serviceDeliveryClient.equals(serviceDeliveryClient2) && (activeDeliveryReconnectEvent.deliveryEnded || activeDeliveryReconnectEvent.reconnectCount > this.label)) || !RealFidesmoClient.access$isActiveDelivery((RealFidesmoClient) obj7, serviceDeliveryClient2));
                case 11:
                    Animatable animatable3 = (Animatable) this.$$this$coroutineScope;
                    MutableState mutableState6 = (MutableState) obj7;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (((Integer) this.$other) == null) {
                            return Unit.INSTANCE;
                        }
                        this.label = 1;
                        break;
                    } else if (i19 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i19 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        Animatable animatable4 = (Animatable) this.$$this$coroutineScope;
                        Float f4 = new Float(1.0f);
                        SpringSpec spring$default2 = AnimatableKt.spring$default(((ScanningShapePulseParams) mutableState6.getValue()).targetSpringDamping, ((ScanningShapePulseParams) mutableState6.getValue()).targetSpringStiffness, null, 4);
                        this.label = 3;
                        f = 0.0f;
                        obj5 = null;
                        break;
                    } else if (i19 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        f = 0.0f;
                        obj5 = null;
                        long j = ((ScanningShapePulseParams) mutableState6.getValue()).targetHoldMillis;
                        this.label = 4;
                        break;
                    } else {
                        if (i19 != 4) {
                            if (i19 == 5) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        f = 0.0f;
                        obj5 = null;
                        Animatable animatable5 = (Animatable) this.$$this$coroutineScope;
                        Float f5 = new Float(f);
                        SpringSpec spring$default3 = AnimatableKt.spring$default(((ScanningShapePulseParams) mutableState6.getValue()).targetSpringDamping, ((ScanningShapePulseParams) mutableState6.getValue()).targetSpringStiffness, obj5, 4);
                        this.label = 5;
                        break;
                    }
                    Float f6 = new Float(RecyclerView.DECELERATION_RATE);
                    this.label = 2;
                    break;
                case 12:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        MutableState mutableState7 = (MutableState) obj7;
                        byte[] bArr = (byte[]) this.$$this$coroutineScope;
                        mutableState3 = mutableState7;
                        if (bArr != null) {
                            mutableState3 = mutableState7;
                            if (bArr.length != 0) {
                                DefaultScheduler defaultScheduler = Dispatchers.Default;
                                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                                RealProfileManager$profileOrNull$2 realProfileManager$profileOrNull$2 = new RealProfileManager$profileOrNull$2(bArr, continuation, 15);
                                this.$other = mutableState7;
                                this.label = 1;
                                withContext = JobKt.withContext(defaultIoScheduler, realProfileManager$profileOrNull$2, this);
                                mutableState = mutableState7;
                                break;
                            }
                        }
                        int i21 = FormCustomizedCardView.$r8$clinit;
                        mutableState3.setValue(continuation);
                        return Unit.INSTANCE;
                    }
                    if (i20 != 1) {
                        if (i20 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableState2 = (MutableState) this.$other;
                        SafeTrace.throwOnFailure(obj);
                        withContext2 = obj;
                        mutableState3 = mutableState2;
                        continuation = (EquatableBitmap) withContext2;
                        int i212 = FormCustomizedCardView.$r8$clinit;
                        mutableState3.setValue(continuation);
                        return Unit.INSTANCE;
                    }
                    MutableState mutableState8 = (MutableState) this.$other;
                    SafeTrace.throwOnFailure(obj);
                    mutableState = mutableState8;
                    withContext = obj;
                    Bitmap bitmap = (Bitmap) withContext;
                    mutableState3 = mutableState;
                    if (bitmap != null) {
                        this.$other = mutableState;
                        this.label = 2;
                        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                        withContext2 = JobKt.withContext(DefaultIoScheduler.INSTANCE, new EquatableBitmap$Companion$toEquatable$2(bitmap, continuation, r10 ? 1 : 0), this);
                        if (withContext2 != coroutineSingletons11) {
                            mutableState2 = mutableState;
                            mutableState3 = mutableState2;
                            continuation = (EquatableBitmap) withContext2;
                        }
                        return coroutineSingletons11;
                    }
                    int i2122 = FormCustomizedCardView.$r8$clinit;
                    mutableState3.setValue(continuation);
                    return Unit.INSTANCE;
                case 13:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (JobKt.delay(500L, this) == coroutineSingletons12) {
                            return coroutineSingletons12;
                        }
                    } else {
                        if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    if (((Boolean) ((MutableState) this.$other).getValue()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    ArcadeFormDateInputView arcadeFormDateInputView = (ArcadeFormDateInputView) this.$$this$coroutineScope;
                    DBUtil.requestFocusCompat(arcadeFormDateInputView, arcadeFormDateInputView.focusRequester);
                    DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj7;
                    if (delegatingSoftwareKeyboardController != null) {
                        delegatingSoftwareKeyboardController.show();
                    }
                    return Unit.INSTANCE;
                case 14:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ArcadeFormTextInputGroupView arcadeFormTextInputGroupView = (ArcadeFormTextInputGroupView) this.$other;
                    StateFlowKt.emitOrThrow((MutableSharedFlow) arcadeFormTextInputGroupView.textChangesForValidations.get(this.label), ((TextFieldState) this.$$this$coroutineScope).getValue$foundation().text.toString());
                    Function1 function1 = arcadeFormTextInputGroupView.onEvent;
                    String str = arcadeFormTextInputGroupView.formElementId;
                    List list2 = (List) obj7;
                    ArrayList arrayList = new ArrayList(list2.size());
                    int size = list2.size();
                    for (int i23 = 0; i23 < size; i23++) {
                        arrayList.add(((TextFieldState) list2.get(i23)).getValue$foundation().text.toString());
                    }
                    function1.invoke(new FormViewEvent.UpdateResultEvent.InputChanged(str, new SubmitFormRequest.ElementResult.TextInputResult(arrayList)));
                    return Unit.INSTANCE;
                case 15:
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    String obj11 = ((TextFieldState) ((List) this.$other).get(this.label)).getValue$foundation().text.toString();
                    MutableState mutableState9 = (MutableState) obj7;
                    Iterator it = ((ArcadeFormTextInputGroupView.InputFieldModel) this.$$this$coroutineScope).invalidInputs.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj6 = it.next();
                            Regex regex = ((InvalidInput) obj6).regex;
                            if (regex == null || !regex.matches(obj11)) {
                            }
                        } else {
                            obj6 = null;
                        }
                    }
                    InvalidInput invalidInput = (InvalidInput) obj6;
                    String str2 = invalidInput != null ? invalidInput.message : null;
                    int i24 = ArcadeFormTextInputGroupView.$r8$clinit;
                    mutableState9.setValue(str2);
                    return Unit.INSTANCE;
                case 16:
                    FormCashtagPresenter formCashtagPresenter = (FormCashtagPresenter) this.$$this$coroutineScope;
                    FlowCollector flowCollector = (FlowCollector) this.$other;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FormCashtagPresenter.LookupResult lookupResult = new FormCashtagPresenter.LookupResult(null, true, false);
                        this.$other = flowCollector;
                        this.label = 1;
                        break;
                    } else {
                        if (i25 != 1) {
                            if (i25 != 2) {
                                if (i25 == 3) {
                                    SafeTrace.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            until = obj;
                            GetCashtagStatusResponse getCashtagStatusResponse = (GetCashtagStatusResponse) until;
                            if (getCashtagStatusResponse != null) {
                                GetCashtagStatusResponse.Status status = getCashtagStatusResponse.status;
                                if (status == null) {
                                    status = ProtoDefaults.GET_CASHTAG_STATUS_STATUS;
                                }
                                int ordinal = status.ordinal();
                                if (ordinal == 1) {
                                    CashtagStatus cashtagStatus = getCashtagStatusResponse.cashtag_status;
                                    if (cashtagStatus == null) {
                                        cashtagStatus = ProtoDefaults.GET_CASHTAG_STATUS_CASHTAG_STATUS;
                                    }
                                    int ordinal2 = cashtagStatus.ordinal();
                                    if (ordinal2 == 0) {
                                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new FormCashtagPresenter.LookupResult(getCashtagStatusResponse.cashtag_url_display_text, true, true), 19);
                                    } else {
                                        if (ordinal2 != 1 && ordinal2 != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new FormCashtagPresenter.LookupResult(getCashtagStatusResponse.failure_message, false, true), 19);
                                    }
                                } else {
                                    if (ordinal != 2) {
                                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                                        return null;
                                    }
                                    appLockMonitor$special$$inlined$map$2 = EmptyFlow.INSTANCE;
                                }
                                this.$other = null;
                                this.label = 3;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    Signal signal2 = formCashtagPresenter.signOut;
                    RealMRIFactory$sign$2.AnonymousClass1 anonymousClass1 = new RealMRIFactory$sign$2.AnonymousClass1(formCashtagPresenter, (String) obj7, continuation, i4);
                    this.$other = flowCollector;
                    this.label = 2;
                    until = StateFlowKt.until(signal2, anonymousClass1, this);
                    break;
                case 17:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.label;
                    if (i26 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FormCashtagPresenter formCashtagPresenter2 = (FormCashtagPresenter) this.$other;
                        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(((FormCashtagViewEvent$InputChange) this.$$this$coroutineScope).input, 19);
                        PaymentActionHandler$transform$$inlined$filter$1 paymentActionHandler$transform$$inlined$filter$1 = new PaymentActionHandler$transform$$inlined$filter$1(appLockMonitor$special$$inlined$map$22, i7);
                        Duration.Companion companion = Duration.Companion;
                        ChannelFlowBuilder merge = FlowKt.merge(FlowKt.transformLatest(FlowKt.m4195debounceHG0u8IE(paymentActionHandler$transform$$inlined$filter$1, DurationKt.toDuration(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, DurationUnit.MILLISECONDS)), new AnchoredDraggableNode$drag$2(continuation, formCashtagPresenter2, 20)), new FormCashtag$8$invokeSuspend$$inlined$map$1(new PaymentActionHandler$transform$$inlined$filter$1(appLockMonitor$special$$inlined$map$22, i6), i4));
                        MusicPresenter$models$2$1.AnonymousClass1 anonymousClass12 = new MusicPresenter$models$2$1.AnonymousClass1(21, (MutableState) obj7);
                        this.label = 1;
                        if (merge.collect(anonymousClass12, this) == coroutineSingletons16) {
                            return coroutineSingletons16;
                        }
                    } else {
                        if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 18:
                    EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) this.$other;
                    GenericTreeElementsScreen genericTreeElementsScreen = (GenericTreeElementsScreen) endAppLockPresenter.appLockState;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = this.label;
                    if (i27 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealGenericTreeElementsRepo realGenericTreeElementsRepo = (RealGenericTreeElementsRepo) endAppLockPresenter.navigatorSwitcher;
                        String elementsContext = genericTreeElementsScreen.getElementsContext();
                        String entityToken = genericTreeElementsScreen.getEntityToken();
                        this.label = 1;
                        genericElementTree = realGenericTreeElementsRepo.getGenericElementTree(elementsContext, entityToken, this);
                        if (genericElementTree == coroutineSingletons17) {
                            return coroutineSingletons17;
                        }
                    } else {
                        if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        genericElementTree = obj;
                    }
                    ApiResult apiResult = (ApiResult) genericElementTree;
                    if (apiResult instanceof ApiResult.Success) {
                        ((MutableState) this.$$this$coroutineScope).setValue((GenericTreeElementsData) ((ApiResult.Success) apiResult).response);
                    } else {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        MutableState mutableState10 = (MutableState) obj7;
                        GenericTreeElementsScreenPresenter$State genericTreeElementsScreenPresenter$State = (GenericTreeElementsScreenPresenter$State) mutableState10.getValue();
                        GenericTreeElementsViewModel.Loaded loaded = new GenericTreeElementsViewModel.Loaded(EmptyList.INSTANCE, new GenericTreeElementsViewModel.Loaded.Error("failed to load generic tree elements."));
                        genericTreeElementsScreenPresenter$State.getClass();
                        mutableState10.setValue(new GenericTreeElementsScreenPresenter$State(loaded));
                    }
                    return Unit.INSTANCE;
                case 19:
                    CoroutineScope coroutineScope6 = (CoroutineScope) this.$other;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.label;
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow6 = (Flow) this.$$this$coroutineScope;
                        InvestingHomeView$2$1 investingHomeView$2$1 = new InvestingHomeView$2$1(coroutineScope6, (LocalEditorialPresenter) obj7, i8);
                        this.$other = null;
                        this.label = 1;
                        if (flow6.collect(investingHomeView$2$1, this) == coroutineSingletons18) {
                            return coroutineSingletons18;
                        }
                    } else {
                        if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 20:
                    MutableState mutableState11 = (MutableState) obj7;
                    MutableState mutableState12 = (MutableState) this.$$this$coroutineScope;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i29 = this.label;
                    if (i29 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!Intrinsics.areEqual(((InputFieldText) mutableState12.getValue()).getValue(), ((InputFieldText) mutableState11.getValue()).getValue())) {
                            RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper = (RealGlobalSearchAnalyticsHelper) ((LocalEditorialPresenter) this.$other).service;
                            this.label = 1;
                            realGlobalSearchAnalyticsHelper.viewedItemsSet.clear();
                            if (JobKt.withContext(realGlobalSearchAnalyticsHelper.ioDispatcher, new RealGlobalSearchAnalyticsHelper$getSharedPreference$2(realGlobalSearchAnalyticsHelper, "GLOBAL_SEARCH_QUERY_TOKEN", continuation, i8), this) == coroutineSingletons19) {
                                return coroutineSingletons19;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    mutableState11.setValue((InputFieldText) mutableState12.getValue());
                    return Unit.INSTANCE;
                case 21:
                    CoroutineScope coroutineScope7 = (CoroutineScope) this.$other;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i30 = this.label;
                    if (i30 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow7 = (Flow) this.$$this$coroutineScope;
                        InvestingHomeView$2$1 investingHomeView$2$12 = new InvestingHomeView$2$1(coroutineScope7, (StuckPlayerDetector) obj7, i7);
                        this.$other = null;
                        this.label = 1;
                        if (flow7.collect(investingHomeView$2$12, this) == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                    } else {
                        if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 22:
                    CoroutineScope coroutineScope8 = (CoroutineScope) this.$other;
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i31 = this.label;
                    if (i31 != 0) {
                        if (i31 == 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(obj);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    BundleKt.launchMolecule$default(coroutineScope8, RecompositionMode.ContextClock, new CoroutineName((String) this.$$this$coroutineScope), (ComposableLambdaImpl) obj7, 4);
                    this.$other = null;
                    this.label = 1;
                    JobKt.awaitCancellation(this);
                    return coroutineSingletons21;
                case 23:
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i32 = this.label;
                    try {
                        if (i32 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.Main$delegate.getValue();
                            AnonymousClass1 anonymousClass13 = new AnonymousClass1((String) this.$$this$coroutineScope, (ComposableLambdaImpl) obj7, continuation, 22);
                            this.label = 1;
                            if (JobKt.withContext(coroutineContext, anonymousClass13, this) == coroutineSingletons22) {
                                return coroutineSingletons22;
                            }
                        } else {
                            if (i32 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        throw new KotlinNothingValueException();
                    } catch (Throwable th) {
                        if (!(th instanceof CancellationException)) {
                            ((Function1) this.$other).invoke(th);
                        }
                        return Unit.INSTANCE;
                    }
                case 24:
                    GLSceneScope gLSceneScope = (GLSceneScope) obj7;
                    ProduceStateScope produceStateScope2 = (ProduceStateScope) this.$$this$coroutineScope;
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = this.label;
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$12 = new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new GLSceneScope$$ExternalSyntheticLambda1(gLSceneScope, 9)), 11);
                        this.$$this$coroutineScope = produceStateScope2;
                        this.label = 1;
                        break;
                    } else {
                        if (i33 != 1) {
                            if (i33 != 2) {
                                if (i33 == 3) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(obj);
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ProduceStateScope produceStateScope3 = (ProduceStateScope) this.$other;
                            SafeTrace.throwOnFailure(obj);
                            produceStateScope = produceStateScope3;
                            withContext3 = obj;
                            produceStateScope.setValue(withContext3);
                            GLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1 gLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1 = new GLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1(gLSceneScope, produceStateScope2, i8);
                            this.$$this$coroutineScope = null;
                            this.$other = null;
                            this.label = 3;
                            produceStateScope2.awaitDispose(gLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1, this);
                            return coroutineSingletons23;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    CoroutineScope coroutineScope9 = gLSceneScope.glScope;
                    if (coroutineScope9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("glScope");
                        throw null;
                    }
                    CoroutineContext coroutineContext2 = coroutineScope9.getCoroutineContext();
                    GLSceneScope$FrameRenderer$6$1$1 gLSceneScope$FrameRenderer$6$1$1 = new GLSceneScope$FrameRenderer$6$1$1(gLSceneScope, continuation, i8);
                    this.$$this$coroutineScope = produceStateScope2;
                    this.$other = produceStateScope2;
                    this.label = 2;
                    withContext3 = JobKt.withContext(coroutineContext2, gLSceneScope$FrameRenderer$6$1$1, this);
                    if (withContext3 != coroutineSingletons23) {
                        produceStateScope = produceStateScope2;
                        produceStateScope.setValue(withContext3);
                        GLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1 gLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda12 = new GLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1(gLSceneScope, produceStateScope2, i8);
                        this.$$this$coroutineScope = null;
                        this.$other = null;
                        this.label = 3;
                        produceStateScope2.awaitDispose(gLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda12, this);
                    }
                    return coroutineSingletons23;
                case 25:
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i34 = this.label;
                    if (i34 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow snapshotFlow = Updater.snapshotFlow(new NavHostKt$$ExternalSyntheticLambda8((State) this.$other, 29));
                        LocalMapKt$LocalMap$2$1 localMapKt$LocalMap$2$1 = new LocalMapKt$LocalMap$2$1((Function1) this.$$this$coroutineScope, (MutableState) obj7, continuation, i6);
                        this.label = 1;
                        if (FlowKt.collectLatest(snapshotFlow, localMapKt$LocalMap$2$1, this) == coroutineSingletons24) {
                            return coroutineSingletons24;
                        }
                    } else {
                        if (i34 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 26:
                    CoroutineScope coroutineScope10 = (CoroutineScope) this.$other;
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i35 = this.label;
                    if (i35 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow8 = (Flow) this.$$this$coroutineScope;
                        InvestingHomeView$2$1 investingHomeView$2$13 = new InvestingHomeView$2$1(coroutineScope10, (MusicPresenter) obj7, i5);
                        this.$other = null;
                        this.label = 1;
                        if (flow8.collect(investingHomeView$2$13, this) == coroutineSingletons25) {
                            return coroutineSingletons25;
                        }
                    } else {
                        if (i35 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 27:
                    CoroutineScope coroutineScope11 = (CoroutineScope) this.$other;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i36 = this.label;
                    if (i36 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow9 = (Flow) this.$$this$coroutineScope;
                        InvestingHomeView$2$1 investingHomeView$2$14 = new InvestingHomeView$2$1(coroutineScope11, (DisclosurePresenter) obj7, 6);
                        this.$other = null;
                        this.label = 1;
                        if (flow9.collect(investingHomeView$2$14, this) == coroutineSingletons26) {
                            return coroutineSingletons26;
                        }
                    } else {
                        if (i36 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 28:
                    GrowToolsManagerState growToolsManagerState = (GrowToolsManagerState) this.$$this$coroutineScope;
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i37 = this.label;
                    if (i37 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealBitcoinAutoWithdrawRepo realBitcoinAutoWithdrawRepo = (RealBitcoinAutoWithdrawRepo) ((RealBugReportSenderFactory) this.$other).endpoint;
                        this.label = 1;
                        disableAutoWithdraw = realBitcoinAutoWithdrawRepo.disableAutoWithdraw(this);
                        if (disableAutoWithdraw == coroutineSingletons27) {
                            return coroutineSingletons27;
                        }
                    } else {
                        if (i37 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        disableAutoWithdraw = obj;
                    }
                    if (((Boolean) disableAutoWithdraw).booleanValue()) {
                        ((MutableState) obj7).setValue(Boolean.TRUE);
                        growToolsManagerState.setInteractive(true);
                    } else {
                        growToolsManagerState.setShowDialog(new GrowToolsManagerState.ShowDialog(GrowToolsManagerState.ShowDialog.DialogType.ERROR));
                    }
                    return Unit.INSTANCE;
                default:
                    RealInvestingActivitiesManager realInvestingActivitiesManager = (RealInvestingActivitiesManager) this.$$this$coroutineScope;
                    Activities activities = (Activities) this.$other;
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i38 = this.label;
                    if (i38 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (activities.hasMore && (list = activities.recentActivities) != null) {
                            if (activities.loadingState == LoadingState.LOADED && !list.isEmpty()) {
                                LocalDateTime ofInstant = LocalDateTime.ofInstant(((ActivityItem) CollectionsKt.last(list)).getDisplayInstant(), ZoneId.systemDefault());
                                LocalDateTime ofInstant2 = LocalDateTime.ofInstant(DimensionKt.now(realInvestingActivitiesManager.clock), ZoneId.systemDefault());
                                ChronoUnit chronoUnit = (ChronoUnit) obj7;
                                if (chronoUnit == null || chronoUnit.between(ofInstant, ofInstant2) < 1) {
                                    ActivitiesManager.LoadMode loadMode = ActivitiesManager.LoadMode.LOAD_NEXT_PAGE;
                                    this.$other = null;
                                    this.label = 1;
                                    if (realInvestingActivitiesManager.$$delegate_0.load(loadMode, this) == coroutineSingletons28) {
                                        return coroutineSingletons28;
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i38 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
            }
        }

        /* renamed from: com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00601 implements FlowCollector {
            public final /* synthetic */ Object $$this$coroutineScope;
            public final /* synthetic */ Object $expected;
            public final /* synthetic */ int $r8$classId;

            public /* synthetic */ C00601(int i, Object obj, Object obj2) {
                this.$r8$classId = i;
                this.$$this$coroutineScope = obj;
                this.$expected = obj2;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final Object emit$com$squareup$cash$favorites$presenters$AddFavoritesPresenter$models$lambda$13$$inlined$map$1$2(Object obj, Continuation continuation) {
                AddFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1 addFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1;
                int i;
                if (continuation instanceof AddFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1) {
                    addFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1 = (AddFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1) continuation;
                    int i2 = addFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        addFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj2 = addFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = addFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            FlowCollector flowCollector = (FlowCollector) this.$$this$coroutineScope;
                            Boolean valueOf = Boolean.valueOf((((Boolean) obj).booleanValue() || ((BooleanPreference) ((LocalHomePresenter) this.$expected).localHomeGeoPresenterFactory).get()) ? false : true);
                            addFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf, addFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                addFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1 = new AddFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1(this, continuation);
                Object obj22 = addFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addFavoritesPresenter$models$lambda$13$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }

            private final Object emit$com$squareup$cash$fidesmo$presenters$FidesmoDeprovisioningPresenter$models$11$1$2(Object obj, Continuation continuation) {
                Pair pair = (Pair) obj;
                FidesmoDeviceState fidesmoDeviceState = (FidesmoDeviceState) pair.first;
                FidesmoDeprovisioningPresenter.DeprovisionPhase deprovisionPhase = (FidesmoDeprovisioningPresenter.DeprovisionPhase) pair.second;
                FidesmoDeprovisioningPresenter fidesmoDeprovisioningPresenter = (FidesmoDeprovisioningPresenter) this.$$this$coroutineScope;
                ArrayList arrayList = fidesmoDeprovisioningPresenter.stateHistory;
                String str = (String) this.$expected;
                FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = fidesmoDeprovisioningPresenter.flowContext;
                if (Intrinsics.areEqual(deprovisionPhase, FidesmoDeprovisioningPresenter.DeprovisionPhase.AwaitingTag.INSTANCE) || Intrinsics.areEqual(deprovisionPhase, FidesmoDeprovisioningPresenter.DeprovisionPhase.FetchingResetInputs.INSTANCE)) {
                    arrayList.add(fidesmoDeviceState);
                    if (arrayList.size() > 50) {
                        arrayList.remove(0);
                    }
                } else {
                    if ((CollectionsKt.lastOrNull((List) arrayList) instanceof FidesmoDeviceState.Disconnected) && ((fidesmoDeviceState instanceof FidesmoDeviceState.Connected) || (fidesmoDeviceState instanceof FidesmoDeviceState.CheckingStability) || Intrinsics.areEqual(fidesmoDeviceState, FidesmoDeviceState.PreparingDelivery.INSTANCE) || (fidesmoDeviceState instanceof FidesmoDeviceState.DeliveringService) || (fidesmoDeviceState instanceof FidesmoDeviceState.ServiceDelivered))) {
                        fidesmoProvisioningFlowContext.logNfcReconnectionResult(NfcReconnectionOutcome.SUCCESS);
                    }
                    if (Intrinsics.areEqual(fidesmoDeviceState, FidesmoDeviceState.Disconnected.INSTANCE)) {
                        fidesmoProvisioningFlowContext.logNfcConnectionLost();
                        fidesmoDeprovisioningPresenter.deliveryStartedLogged = false;
                    } else if (fidesmoDeviceState instanceof FidesmoDeviceState.DeliveringService) {
                        FidesmoDeviceState.DeliveringService deliveringService = (FidesmoDeviceState.DeliveringService) fidesmoDeviceState;
                        if (!fidesmoDeprovisioningPresenter.deliveryStartedLogged) {
                            fidesmoProvisioningFlowContext.logDeliveryStarted();
                            fidesmoDeprovisioningPresenter.deliveryStartedLogged = true;
                        }
                        Integer num = deliveringService.currentStep;
                        Integer num2 = deliveringService.totalSteps;
                        if (num != null && num2 != null && num2.intValue() > 0) {
                            fidesmoProvisioningFlowContext.logStepCompleted(num.intValue(), num2.intValue(), RangesKt___RangesKt.coerceIn((num.intValue() * 100) / num2.intValue(), 0, 100));
                        }
                    } else if (fidesmoDeviceState instanceof FidesmoDeviceState.ServiceDelivered) {
                        if (!fidesmoDeprovisioningPresenter.deliveryCompletedLogged) {
                            fidesmoProvisioningFlowContext.logCompleted();
                            fidesmoDeprovisioningPresenter.endJourneyIfNeeded(UserJourney$Outcome.Succeeded.INSTANCE);
                            fidesmoDeprovisioningPresenter.deliveryCompletedLogged = true;
                        }
                    } else if (fidesmoDeviceState instanceof FidesmoDeviceState.ServiceDeliveryFailed) {
                        fidesmoDeprovisioningPresenter.recordErrorModel(fidesmoDeprovisioningPresenter.errorManager.serviceDeliveryFailed((FidesmoDeviceState.ServiceDeliveryFailed) fidesmoDeviceState, FidesmoFlowType.DEPROVISION, str));
                    }
                    arrayList.add(fidesmoDeviceState);
                    if (arrayList.size() > 50) {
                        arrayList.remove(0);
                    }
                }
                return Unit.INSTANCE;
            }

            private final Object emit$com$squareup$cash$fidesmo$presenters$FidesmoProvisioningPresenter$models$10$1$2(Object obj, Continuation continuation) {
                Pair pair = (Pair) obj;
                FidesmoDeviceState fidesmoDeviceState = (FidesmoDeviceState) pair.first;
                FidesmoProvisioningPresenter.ActivationPhase activationPhase = (FidesmoProvisioningPresenter.ActivationPhase) pair.second;
                Camera2Controller camera2Controller = ((FidesmoProvisioningPresenter) this.$$this$coroutineScope).loggingHandler;
                String str = (String) this.$expected;
                FidesmoProvisioningFlowContext fidesmoProvisioningFlowContext = (FidesmoProvisioningFlowContext) camera2Controller.cameraChoiceHelper;
                fidesmoDeviceState.getClass();
                activationPhase.getClass();
                str.getClass();
                boolean z = activationPhase instanceof FidesmoProvisioningPresenter.ActivationPhase.ActivationCompleted;
                ArrayList arrayList = (ArrayList) camera2Controller.currentStateCollectJob;
                if (z) {
                    if ((CollectionsKt.lastOrNull((List) arrayList) instanceof FidesmoDeviceState.Disconnected) && ((fidesmoDeviceState instanceof FidesmoDeviceState.Connected) || (fidesmoDeviceState instanceof FidesmoDeviceState.CheckingStability) || fidesmoDeviceState.equals(FidesmoDeviceState.PreparingDelivery.INSTANCE) || (fidesmoDeviceState instanceof FidesmoDeviceState.DeliveringService) || (fidesmoDeviceState instanceof FidesmoDeviceState.ServiceDelivered))) {
                        fidesmoProvisioningFlowContext.logNfcReconnectionResult(NfcReconnectionOutcome.SUCCESS);
                    }
                    if (fidesmoDeviceState.equals(FidesmoDeviceState.Disconnected.INSTANCE)) {
                        fidesmoProvisioningFlowContext.logNfcConnectionLost();
                        camera2Controller.recordingOngoing = false;
                    } else if (fidesmoDeviceState instanceof FidesmoDeviceState.DeliveringService) {
                        FidesmoDeviceState.DeliveringService deliveringService = (FidesmoDeviceState.DeliveringService) fidesmoDeviceState;
                        Integer num = deliveringService.currentStep;
                        Integer num2 = deliveringService.totalSteps;
                        if (!camera2Controller.recordingOngoing) {
                            fidesmoProvisioningFlowContext.logDeliveryStarted();
                            camera2Controller.recordingOngoing = true;
                        }
                        if (num != null && num2 != null && num2.intValue() > 0) {
                            fidesmoProvisioningFlowContext.logStepCompleted(num.intValue(), num2.intValue(), RangesKt___RangesKt.coerceIn((num.intValue() * 100) / num2.intValue(), 0, 100));
                        }
                    } else if (fidesmoDeviceState instanceof FidesmoDeviceState.ServiceDelivered) {
                        fidesmoProvisioningFlowContext.logCompleted();
                        ((EnumListAdapter$encode$1) camera2Controller._previewState).invoke(UserJourney$Outcome.Succeeded.INSTANCE);
                    } else if (fidesmoDeviceState instanceof FidesmoDeviceState.ServiceDeliveryFailed) {
                        ((EnumListAdapter$encode$1) camera2Controller.currentManager).invoke(((FidesmoProvisioningErrorManager) camera2Controller.camera2ManagerFactory).serviceDeliveryFailed((FidesmoDeviceState.ServiceDeliveryFailed) fidesmoDeviceState, (FidesmoFlowType) camera2Controller.coroutineScope, str));
                    }
                    arrayList.add(fidesmoDeviceState);
                    if (arrayList.size() > 50) {
                        arrayList.remove(0);
                    }
                } else {
                    arrayList.add(fidesmoDeviceState);
                    if (arrayList.size() > 50) {
                        arrayList.remove(0);
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final Object emit$com$squareup$cash$formview$components$arcade$MultilineTextInputValidator$validations$$inlined$map$1$2(Object obj, Continuation continuation) {
                MultilineTextInputValidator$validations$$inlined$map$1$2$1 multilineTextInputValidator$validations$$inlined$map$1$2$1;
                int i;
                Object failure;
                VideoCapture.AnonymousClass3 anonymousClass3 = (VideoCapture.AnonymousClass3) this.$expected;
                Integer num = (Integer) anonymousClass3.this$0;
                Integer num2 = (Integer) anonymousClass3.val$surfaceUpdateFuture;
                boolean z = anonymousClass3.val$isStreamActive;
                if (continuation instanceof MultilineTextInputValidator$validations$$inlined$map$1$2$1) {
                    multilineTextInputValidator$validations$$inlined$map$1$2$1 = (MultilineTextInputValidator$validations$$inlined$map$1$2$1) continuation;
                    int i2 = multilineTextInputValidator$validations$$inlined$map$1$2$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        multilineTextInputValidator$validations$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj2 = multilineTextInputValidator$validations$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = multilineTextInputValidator$validations$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            FlowCollector flowCollector = (FlowCollector) this.$$this$coroutineScope;
                            String str = (String) obj;
                            int length = str.length();
                            if (z && StringsKt.isBlank(str)) {
                                failure = new MultilineTextInputValidator$Result.Failure(new MultilineTextInputValidator$Result.Failure.Reason.EmptyRequiredInput(num2, num));
                            } else {
                                if (z || !StringsKt.isBlank(str)) {
                                    if (num2 != null && length < num2.intValue()) {
                                        failure = new MultilineTextInputValidator$Result.Failure(new MultilineTextInputValidator$Result.Failure.Reason.MinCharCountNotReached(num2.intValue(), length));
                                    } else if (num != null && length > num.intValue()) {
                                        failure = new MultilineTextInputValidator$Result.Failure(MultilineTextInputValidator$Result.Failure.Reason.MaxCharCountExceeded.INSTANCE);
                                    }
                                }
                                failure = new MultilineTextInputValidator$Result.Success(length, num, z);
                            }
                            multilineTextInputValidator$validations$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(failure, multilineTextInputValidator$validations$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                multilineTextInputValidator$validations$$inlined$map$1$2$1 = new MultilineTextInputValidator$validations$$inlined$map$1$2$1(this, continuation);
                Object obj22 = multilineTextInputValidator$validations$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multilineTextInputValidator$validations$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
            
                if (r7.length() == r0.intValue()) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00a4, code lost:
            
                if (r8.pattern.matcher(r7).matches() != false) goto L16;
             */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00b3 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final Object emit$com$squareup$cash$formview$components$arcade$TextInputValidator$validations$$inlined$map$1$2(Object obj, Continuation continuation) {
                TextInputValidator$validations$$inlined$map$1$2$1 textInputValidator$validations$$inlined$map$1$2$1;
                int i;
                boolean z;
                Boolean valueOf;
                ArrayList arrayList = ((TextInputValidator) this.$expected).templateConfigs;
                if (continuation instanceof TextInputValidator$validations$$inlined$map$1$2$1) {
                    textInputValidator$validations$$inlined$map$1$2$1 = (TextInputValidator$validations$$inlined$map$1$2$1) continuation;
                    int i2 = textInputValidator$validations$$inlined$map$1$2$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        textInputValidator$validations$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj2 = textInputValidator$validations$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = textInputValidator$validations$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            FlowCollector flowCollector = (FlowCollector) this.$$this$coroutineScope;
                            String str = (String) obj;
                            if (!arrayList.isEmpty()) {
                                z = false;
                                if (str.length() == 0) {
                                    if (arrayList == null || !arrayList.isEmpty()) {
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            if (((TemplateConfig) it.next()).pattern.matcher("").matches()) {
                                            }
                                        }
                                    }
                                    valueOf = Boolean.valueOf(z);
                                    textInputValidator$validations$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(valueOf, textInputValidator$validations$$inlined$map$1$2$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    TemplateConfig findConfigFor = ArcadeFormEmojiPickerKt.findConfigFor(str, arrayList);
                                    if (findConfigFor != null) {
                                        String filterFormattingChars = findConfigFor.filterFormattingChars(str);
                                        Integer num = findConfigFor.templateInputLength;
                                        if (num != null) {
                                        }
                                    } else if (arrayList.isEmpty()) {
                                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                                        return null;
                                    }
                                    valueOf = Boolean.valueOf(z);
                                    textInputValidator$validations$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(valueOf, textInputValidator$validations$$inlined$map$1$2$1) == coroutineSingletons) {
                                    }
                                }
                            }
                            z = true;
                            valueOf = Boolean.valueOf(z);
                            textInputValidator$validations$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf, textInputValidator$validations$$inlined$map$1$2$1) == coroutineSingletons) {
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                textInputValidator$validations$$inlined$map$1$2$1 = new TextInputValidator$validations$$inlined$map$1$2$1(this, continuation);
                Object obj22 = textInputValidator$validations$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = textInputValidator$validations$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final Object emit$com$squareup$cash$graphics$swampgl$components$Transform$special$$inlined$map$1$2(Object obj, Continuation continuation) {
                Transform$special$$inlined$map$1$2$1 transform$special$$inlined$map$1$2$1;
                int i;
                if (continuation instanceof Transform$special$$inlined$map$1$2$1) {
                    transform$special$$inlined$map$1$2$1 = (Transform$special$$inlined$map$1$2$1) continuation;
                    int i2 = transform$special$$inlined$map$1$2$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        transform$special$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj2 = transform$special$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = transform$special$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            FlowCollector flowCollector = (FlowCollector) this.$$this$coroutineScope;
                            Transform transform = (Transform) this.$expected;
                            transform._modelMatrix = transform.computeModelMatrix();
                            Unit unit = Unit.INSTANCE;
                            transform$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(unit, transform$special$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                transform$special$$inlined$map$1$2$1 = new Transform$special$$inlined$map$1$2$1(this, continuation);
                Object obj22 = transform$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transform$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final Object emit$com$squareup$cash$history$navigation$PaymentActionHandler$cancelOrder$$inlined$map$1$2(Object obj, Continuation continuation) {
                PaymentActionHandler$cancelOrder$$inlined$map$1$2$1 paymentActionHandler$cancelOrder$$inlined$map$1$2$1;
                int i;
                String str;
                Color color;
                if (continuation instanceof PaymentActionHandler$cancelOrder$$inlined$map$1$2$1) {
                    paymentActionHandler$cancelOrder$$inlined$map$1$2$1 = (PaymentActionHandler$cancelOrder$$inlined$map$1$2$1) continuation;
                    int i2 = paymentActionHandler$cancelOrder$$inlined$map$1$2$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        paymentActionHandler$cancelOrder$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj2 = paymentActionHandler$cancelOrder$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = paymentActionHandler$cancelOrder$$inlined$map$1$2$1.label;
                        Color color2 = null;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            FlowCollector flowCollector = (FlowCollector) this.$$this$coroutineScope;
                            EntityColorForPayment entityColorForPayment = (EntityColorForPayment) obj;
                            if (entityColorForPayment != null && (color = entityColorForPayment.entity_color) != null) {
                                color2 = color;
                            } else if (entityColorForPayment != null && (str = entityColorForPayment.color) != null) {
                                color2 = ColorsKt.toColor(str);
                            }
                            ColorModel accented = color2 != null ? new ColorModel.Accented(color2) : ColorModel.CashGreen.INSTANCE;
                            PaymentAction.CancelInvestmentOrderAction cancelInvestmentOrderAction = (PaymentAction.CancelInvestmentOrderAction) this.$expected;
                            PaymentActionResult.GoToScreen goToScreen = new PaymentActionResult.GoToScreen(new InvestingScreens.CancelScheduledOrderScreen(cancelInvestmentOrderAction.flowToken, cancelInvestmentOrderAction.orderToken, cancelInvestmentOrderAction.cancellationText, InvestingScreens.CancelScheduledOrderScreen.CancelType.STOCK, accented));
                            paymentActionHandler$cancelOrder$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(goToScreen, paymentActionHandler$cancelOrder$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                paymentActionHandler$cancelOrder$$inlined$map$1$2$1 = new PaymentActionHandler$cancelOrder$$inlined$map$1$2$1(this, continuation);
                Object obj22 = paymentActionHandler$cancelOrder$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentActionHandler$cancelOrder$$inlined$map$1$2$1.label;
                Color color22 = null;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final Object emit$com$squareup$cash$history$navigation$PaymentActionHandler$transform$lambda$2$$inlined$map$1$2(Object obj, Continuation continuation) {
                PaymentActionHandler$transform$lambda$2$$inlined$map$1$2$1 paymentActionHandler$transform$lambda$2$$inlined$map$1$2$1;
                int i;
                Object obj2 = (PaymentAction.HasPaymentToken) this.$expected;
                if (continuation instanceof PaymentActionHandler$transform$lambda$2$$inlined$map$1$2$1) {
                    paymentActionHandler$transform$lambda$2$$inlined$map$1$2$1 = (PaymentActionHandler$transform$lambda$2$$inlined$map$1$2$1) continuation;
                    int i2 = paymentActionHandler$transform$lambda$2$$inlined$map$1$2$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        paymentActionHandler$transform$lambda$2$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj3 = paymentActionHandler$transform$lambda$2$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = paymentActionHandler$transform$lambda$2$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            FlowCollector flowCollector = (FlowCollector) this.$$this$coroutineScope;
                            ((Boolean) obj).getClass();
                            obj2.getClass();
                            paymentActionHandler$transform$lambda$2$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit((PaymentAction) obj2, paymentActionHandler$transform$lambda$2$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj3);
                        }
                        return Unit.INSTANCE;
                    }
                }
                paymentActionHandler$transform$lambda$2$$inlined$map$1$2$1 = new PaymentActionHandler$transform$lambda$2$$inlined$map$1$2$1(this, continuation);
                Object obj32 = paymentActionHandler$transform$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentActionHandler$transform$lambda$2$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }

            private final Object emit$com$squareup$cash$history$payments$presenters$ProfilePaymentHistoryPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
                ProfilePaymentHistoryPresenter profilePaymentHistoryPresenter = (ProfilePaymentHistoryPresenter) this.$$this$coroutineScope;
                if (!Intrinsics.areEqual((ProfilePaymentHistoryViewEvent$ViewAll) obj, ProfilePaymentHistoryViewEvent$ViewAll.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                profilePaymentHistoryPresenter.analytics.track(new CustomerProfileConnectViewAllYourHistory(), null);
                profilePaymentHistoryPresenter.navigator.goTo(new PaymentHistoryScreens$ProfileCompletePaymentHistory((String) this.$expected));
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:289:0x050f, code lost:
            
                r1 = new com.squareup.cash.family.familyhub.presenters.DependentTeenQrCodeShareSheetPresenter$SharingState.Failure(r3.getTitle());
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x018d, code lost:
            
                if (r4.emit(r0, r3) != r2) goto L80;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
            
                return r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x00e4, code lost:
            
                if (r0 == r2) goto L79;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:136:0x0219  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x0223  */
            /* JADX WARN: Removed duplicated region for block: B:179:0x02ce  */
            /* JADX WARN: Removed duplicated region for block: B:185:0x02da  */
            /* JADX WARN: Removed duplicated region for block: B:334:0x05f5  */
            /* JADX WARN: Removed duplicated region for block: B:341:0x0600  */
            /* JADX WARN: Removed duplicated region for block: B:364:0x0662  */
            /* JADX WARN: Removed duplicated region for block: B:371:0x066d  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:487:0x095a  */
            /* JADX WARN: Removed duplicated region for block: B:498:0x0988  */
            /* JADX WARN: Removed duplicated region for block: B:499:0x0985  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0128  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0138  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x015e  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x00c9  */
            /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r9v46 */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                PromotionDetailsViewModel.DetailsPageData.ShareSheetDetails shareSheetDetails;
                String str;
                BookletInteractTapButton.BookletButtonLocation bookletButtonLocation;
                RealDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1 realDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1;
                int i;
                RealFamilyAccountsManager$getDependents$$inlined$map$1$2$1 realFamilyAccountsManager$getDependents$$inlined$map$1$2$1;
                int i2;
                StateFlowImpl stateFlowImpl;
                Object value;
                Object failure;
                Object value2;
                String str2;
                SponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1 sponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1;
                int i3;
                SelectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1 selectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1;
                int i4;
                SafetyEducationHub safetyEducationHub;
                List list;
                RealFavoritesManager$getFavorites$$inlined$map$1$2$1 realFavoritesManager$getFavorites$$inlined$map$1$2$1;
                int i5;
                FlowCollector flowCollector;
                List list2;
                int mapCapacity;
                Iterator it;
                int i6 = this.$r8$classId;
                Object obj2 = PaycheckDepositAllocation.All.INSTANCE;
                int i7 = 0;
                DirectDepositSingleInputViewEvent.NavigationIconClick navigationIconClick = DirectDepositSingleInputViewEvent.NavigationIconClick.INSTANCE;
                DirectDepositSingleInputViewEvent.ButtonClick buttonClick = DirectDepositSingleInputViewEvent.ButtonClick.INSTANCE;
                int i8 = 3;
                Back back = Back.INSTANCE;
                Object obj3 = this.$expected;
                Object obj4 = this.$$this$coroutineScope;
                Object obj5 = null;
                Object obj6 = null;
                r9 = null;
                AllowanceSectionViewModel allowanceSectionViewModel = null;
                String str3 = null;
                String str4 = null;
                switch (i6) {
                    case 0:
                        JobKt.cancel((CoroutineScope) obj4, (CancellationException) obj3);
                        return Unit.INSTANCE;
                    case 1:
                        MutableState mutableState = (MutableState) obj3;
                        CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj4;
                        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
                        DirectDepositSingleInputViewEvent directDepositSingleInputViewEvent = (DirectDepositSingleInputViewEvent) obj;
                        if (Intrinsics.areEqual(directDepositSingleInputViewEvent, buttonClick)) {
                            String obj7 = StringsKt.trim(((InputFieldText) mutableState.getValue()).getValue().toString()).toString();
                            ((Analytics) cardStudioPresenter.analytics).track(new DirectDepositAccountTapEnterCompanyName(), null);
                            AskedQuestion askedQuestion = (AskedQuestion) cardStudioPresenter.cardStudioQueries;
                            if (askedQuestion != null) {
                                screenNavigator.giveAnswer(askedQuestion, new RedactedString(obj7));
                            } else {
                                String str5 = ((DirectDepositEditCompanyNameScreen) cardStudioPresenter.appConfig).token;
                                str5.getClass();
                                obj7.getClass();
                                screenNavigator.goTo(new DirectDepositManualFormDetailsScreen(new RedactedString(obj7), str5));
                            }
                        } else if (directDepositSingleInputViewEvent instanceof DirectDepositSingleInputViewEvent.InputChanged) {
                            mutableState.setValue(((DirectDepositSingleInputViewEvent.InputChanged) directDepositSingleInputViewEvent).inputFieldText);
                        } else {
                            if (!Intrinsics.areEqual(directDepositSingleInputViewEvent, navigationIconClick)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator.goTo(back);
                        }
                        return Unit.INSTANCE;
                    case 2:
                        LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj4;
                        BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
                        MutableState mutableState2 = (MutableState) obj3;
                        DirectDepositSingleInputViewEvent directDepositSingleInputViewEvent2 = (DirectDepositSingleInputViewEvent) obj;
                        if (Intrinsics.areEqual(directDepositSingleInputViewEvent2, buttonClick)) {
                            screenNavigator2.giveAnswer((AskedQuestion) localPosCheckInPresenter.cameraPermissions, new RedactedString(StringsKt.trim(((InputFieldText) mutableState2.getValue()).getValue().toString()).toString()));
                        } else if (directDepositSingleInputViewEvent2 instanceof DirectDepositSingleInputViewEvent.InputChanged) {
                            mutableState2.setValue(((DirectDepositSingleInputViewEvent.InputChanged) directDepositSingleInputViewEvent2).inputFieldText);
                        } else {
                            if (!Intrinsics.areEqual(directDepositSingleInputViewEvent2, navigationIconClick)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator2.goTo(back);
                        }
                        return Unit.INSTANCE;
                    case 3:
                        MutableState mutableState3 = (MutableState) obj3;
                        VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) obj4;
                        DirectDepositEditPaycheckAllocationScreen directDepositEditPaycheckAllocationScreen = (DirectDepositEditPaycheckAllocationScreen) verifyCheckDialogPresenter.args;
                        BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) verifyCheckDialogPresenter.navigator;
                        DirectDepositEditPaycheckAmountViewEvent directDepositEditPaycheckAmountViewEvent = (DirectDepositEditPaycheckAmountViewEvent) obj;
                        if (Intrinsics.areEqual(directDepositEditPaycheckAmountViewEvent, DirectDepositEditPaycheckAmountViewEvent.NavigationIconClick.INSTANCE)) {
                            screenNavigator3.goTo(back);
                        } else if (directDepositEditPaycheckAmountViewEvent instanceof DirectDepositEditPaycheckAmountViewEvent.SelectPaycheckAmount) {
                            mutableState3.setValue(((DirectDepositEditPaycheckAmountViewEvent.SelectPaycheckAmount) directDepositEditPaycheckAmountViewEvent).paycheckDepositAmount);
                        } else {
                            if (!Intrinsics.areEqual(directDepositEditPaycheckAmountViewEvent, DirectDepositEditPaycheckAmountViewEvent.Submit.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            int ordinal = ((PaycheckDepositAllocationType) mutableState3.getValue()).ordinal();
                            if (ordinal == 0) {
                                screenNavigator3.goTo(new DirectDepositEditPaycheckCurrencyAllocationScreen(directDepositEditPaycheckAllocationScreen.token, directDepositEditPaycheckAllocationScreen.question));
                            } else if (ordinal == 1) {
                                screenNavigator3.goTo(new DirectDepositEditPaycheckPercentageScreen(directDepositEditPaycheckAllocationScreen.token, directDepositEditPaycheckAllocationScreen.question));
                            } else {
                                if (ordinal != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                screenNavigator3.giveAnswer(directDepositEditPaycheckAllocationScreen.question, obj2);
                            }
                        }
                        return Unit.INSTANCE;
                    case 4:
                        LocalPosCheckInPresenter localPosCheckInPresenter2 = (LocalPosCheckInPresenter) obj4;
                        BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter2.navigator;
                        MutableState mutableState4 = (MutableState) obj3;
                        DirectDepositSingleInputViewEvent directDepositSingleInputViewEvent3 = (DirectDepositSingleInputViewEvent) obj;
                        if (Intrinsics.areEqual(directDepositSingleInputViewEvent3, buttonClick)) {
                            int parseInt = Integer.parseInt(((InputFieldText) mutableState4.getValue()).getValue().toString());
                            AskedQuestion askedQuestion2 = (AskedQuestion) localPosCheckInPresenter2.cameraPermissions;
                            if (parseInt != 100) {
                                obj2 = new PaycheckDepositAllocation.Percentage(parseInt);
                            }
                            screenNavigator4.giveAnswer(askedQuestion2, obj2);
                        } else if (directDepositSingleInputViewEvent3 instanceof DirectDepositSingleInputViewEvent.InputChanged) {
                            mutableState4.setValue(((DirectDepositSingleInputViewEvent.InputChanged) directDepositSingleInputViewEvent3).inputFieldText);
                        } else {
                            if (!Intrinsics.areEqual(directDepositSingleInputViewEvent3, navigationIconClick)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator4.goTo(back);
                        }
                        return Unit.INSTANCE;
                    case 5:
                        DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj4;
                        RealPromotionDetailsAnalyticsService realPromotionDetailsAnalyticsService = (RealPromotionDetailsAnalyticsService) disclosurePresenter.args;
                        PromotionDetailsViewEvent promotionDetailsViewEvent = (PromotionDetailsViewEvent) obj;
                        if (promotionDetailsViewEvent instanceof PromotionDetailsViewEvent.Click) {
                            PromotionDetailsViewEvent.Click click = (PromotionDetailsViewEvent.Click) promotionDetailsViewEvent;
                            String str6 = click.buttonText;
                            DetailsPageInteractTapButton.DetailsPageButtonLocation detailsPageButtonLocation = click.location;
                            realPromotionDetailsAnalyticsService.getClass();
                            PromotionDetails promotionDetails = realPromotionDetailsAnalyticsService.args;
                            PromotionDetails.Identifier identifier = promotionDetails.identifier;
                            if (identifier instanceof PromotionDetails.Identifier.TemplateToken) {
                                PromotionDetails.Identifier.TemplateToken templateToken = (PromotionDetails.Identifier.TemplateToken) identifier;
                                realPromotionDetailsAnalyticsService.track(new DetailsPageInteractTapButton(templateToken.templateToken, templateToken.templateVersion, null, realPromotionDetailsAnalyticsService.flowToken, promotionDetails.referrerFlowToken, str6, detailsPageButtonLocation, 4), null);
                            } else {
                                if (!(identifier instanceof PromotionDetails.Identifier.TreehousePath) && !(identifier instanceof PromotionDetails.Identifier.DetailsToken)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                realPromotionDetailsAnalyticsService.track(new DetailsPageInteractTapButton(null, null, identifier.getToken(), realPromotionDetailsAnalyticsService.flowToken, promotionDetails.referrerFlowToken, str6, detailsPageButtonLocation, 3), null);
                                if (identifier instanceof PromotionDetails.Identifier.TreehousePath) {
                                    String str7 = ((PromotionDetails.Identifier.TreehousePath) identifier).token;
                                    String str8 = realPromotionDetailsAnalyticsService.flowToken;
                                    int ordinal2 = detailsPageButtonLocation.ordinal();
                                    if (ordinal2 == 0) {
                                        bookletButtonLocation = BookletInteractTapButton.BookletButtonLocation.TOP;
                                    } else {
                                        if (ordinal2 != 1) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        bookletButtonLocation = BookletInteractTapButton.BookletButtonLocation.BOTTOM;
                                    }
                                    realPromotionDetailsAnalyticsService.track(new BookletInteractTapButton(str7, str8, str6, bookletButtonLocation, 4), null);
                                }
                            }
                            ((RealRouter) disclosurePresenter.stringManager).route(new RoutingParams(null, null, ((PromotionDetails) disclosurePresenter.analytics).exitScreen, null, null, null, 503), click.actionUrl);
                        } else if (promotionDetailsViewEvent instanceof PromotionDetailsViewEvent.Close) {
                            PromotionDetails promotionDetails2 = realPromotionDetailsAnalyticsService.args;
                            PromotionDetails.Identifier identifier2 = promotionDetails2.identifier;
                            if (identifier2 instanceof PromotionDetails.Identifier.TemplateToken) {
                                PromotionDetails.Identifier.TemplateToken templateToken2 = (PromotionDetails.Identifier.TemplateToken) identifier2;
                                realPromotionDetailsAnalyticsService.track(new DetailsPageInteractDismissPage(4, templateToken2.templateToken, templateToken2.templateVersion, null, realPromotionDetailsAnalyticsService.flowToken, promotionDetails2.referrerFlowToken), null);
                            } else {
                                if (!(identifier2 instanceof PromotionDetails.Identifier.TreehousePath) && !(identifier2 instanceof PromotionDetails.Identifier.DetailsToken)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                realPromotionDetailsAnalyticsService.track(new DetailsPageInteractDismissPage(3, null, null, identifier2.getToken(), realPromotionDetailsAnalyticsService.flowToken, promotionDetails2.referrerFlowToken), null);
                                if (identifier2 instanceof PromotionDetails.Identifier.TreehousePath) {
                                    realPromotionDetailsAnalyticsService.track(new BookletInteractDismissScreen(((PromotionDetails.Identifier.TreehousePath) identifier2).token, realPromotionDetailsAnalyticsService.flowToken, 4), null);
                                }
                            }
                            ((BetterNavigator.ScreenNavigator) disclosurePresenter.navigator).goTo(back);
                        } else if (promotionDetailsViewEvent instanceof PromotionDetailsViewEvent.ViewedTreehouseContent) {
                            PromotionDetails promotionDetails3 = realPromotionDetailsAnalyticsService.args;
                            if (!realPromotionDetailsAnalyticsService.viewedContent.getAndSet(true)) {
                                PromotionDetails.Identifier identifier3 = promotionDetails3.identifier;
                                if (identifier3 instanceof PromotionDetails.Identifier.TemplateToken) {
                                    PromotionDetails.Identifier.TemplateToken templateToken3 = (PromotionDetails.Identifier.TemplateToken) identifier3;
                                    realPromotionDetailsAnalyticsService.track(new DetailsPageInteractScroll(4, templateToken3.templateToken, templateToken3.templateVersion, null, realPromotionDetailsAnalyticsService.flowToken, promotionDetails3.referrerFlowToken), null);
                                } else {
                                    if (!(identifier3 instanceof PromotionDetails.Identifier.TreehousePath) && !(identifier3 instanceof PromotionDetails.Identifier.DetailsToken)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    realPromotionDetailsAnalyticsService.track(new DetailsPageInteractScroll(3, null, null, identifier3.getToken(), realPromotionDetailsAnalyticsService.flowToken, promotionDetails3.referrerFlowToken), null);
                                    if (identifier3 instanceof PromotionDetails.Identifier.TreehousePath) {
                                        realPromotionDetailsAnalyticsService.track(new BookletInteractScroll(((PromotionDetails.Identifier.TreehousePath) identifier3).token, realPromotionDetailsAnalyticsService.flowToken, 4), null);
                                    }
                                }
                            }
                        } else {
                            if (!(promotionDetailsViewEvent instanceof PromotionDetailsViewEvent.ShareStarted)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            PromotionDetails promotionDetails4 = realPromotionDetailsAnalyticsService.args;
                            PromotionDetails.Identifier identifier4 = promotionDetails4.identifier;
                            if (identifier4 instanceof PromotionDetails.Identifier.TemplateToken) {
                                PromotionDetails.Identifier.TemplateToken templateToken4 = (PromotionDetails.Identifier.TemplateToken) identifier4;
                                realPromotionDetailsAnalyticsService.track(new DetailsPageInteractTapShareButton(4, templateToken4.templateToken, templateToken4.templateVersion, null, realPromotionDetailsAnalyticsService.flowToken, promotionDetails4.referrerFlowToken), null);
                            } else if (identifier4 instanceof PromotionDetails.Identifier.DetailsToken) {
                                realPromotionDetailsAnalyticsService.track(new DetailsPageInteractTapShareButton(3, null, null, ((PromotionDetails.Identifier.DetailsToken) identifier4).token, realPromotionDetailsAnalyticsService.flowToken, promotionDetails4.referrerFlowToken), null);
                            } else if (!(identifier4 instanceof PromotionDetails.Identifier.TreehousePath)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            PromotionDetailsViewModel promotionDetailsViewModel = (PromotionDetailsViewModel) ((State) obj3).getValue();
                            if (promotionDetailsViewModel instanceof PromotionDetailsViewModel.Loaded) {
                                PromotionDetailsViewModel.DetailsPageData detailsPageData = ((PromotionDetailsViewModel.Loaded) promotionDetailsViewModel).details;
                                if (detailsPageData instanceof PromotionDetailsViewModel.DetailsPageData.DetailsPageV1) {
                                    ShareSheet shareSheet = ((PromotionDetailsViewModel.DetailsPageData.DetailsPageV1) detailsPageData).details.share_sheet;
                                    if (shareSheet != null) {
                                        shareSheetDetails = new PromotionDetailsViewModel.DetailsPageData.ShareSheetDetails(shareSheet.message, shareSheet.url);
                                        if (shareSheetDetails == null) {
                                            String str9 = shareSheetDetails.url;
                                            StringBuilder sb = new StringBuilder();
                                            String str10 = shareSheetDetails.message;
                                            if (str10 != null && !StringsKt.isBlank(str10)) {
                                                sb.append(str10);
                                            }
                                            if (str9 != null && !StringsKt.isBlank(str9)) {
                                                sb.append("\n\n");
                                                sb.append(str9);
                                            }
                                            str = sb.toString();
                                        } else {
                                            str = null;
                                        }
                                        if (str != null) {
                                            ((IntentLauncher) disclosurePresenter.launcher).shareText(str, null, null);
                                        }
                                    }
                                    shareSheetDetails = null;
                                    if (shareSheetDetails == null) {
                                    }
                                    if (str != null) {
                                    }
                                } else {
                                    if (!(detailsPageData instanceof PromotionDetailsViewModel.DetailsPageData.DetailsPageV2)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    com.squareup.protos.cash.messagingplatformcommon.app.ShareSheet shareSheet2 = ((PromotionDetailsViewModel.DetailsPageData.DetailsPageV2) detailsPageData).detailsPageView.share_sheet;
                                    if (shareSheet2 != null) {
                                        shareSheetDetails = new PromotionDetailsViewModel.DetailsPageData.ShareSheetDetails(shareSheet2.message, shareSheet2.url);
                                        if (shareSheetDetails == null) {
                                        }
                                        if (str != null) {
                                        }
                                    }
                                    shareSheetDetails = null;
                                    if (shareSheetDetails == null) {
                                    }
                                    if (str != null) {
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    case 6:
                        if (!Intrinsics.areEqual((EarnerAppletTileEvent$OnClickTile) obj, EarnerAppletTileEvent$OnClickTile.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        CardStudioPresenter cardStudioPresenter2 = (CardStudioPresenter) obj4;
                        EarnerAppletTileModel earnerAppletTileModel = (EarnerAppletTileModel) ((MutableState) obj3).getValue();
                        Navigator navigator = (Navigator) cardStudioPresenter2.args;
                        ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) cardStudioPresenter2.appConfig)).submitSelectItemEvent(ItemId.EARNER.INSTANCE, null, MoneySelectAction.TAP);
                        if (earnerAppletTileModel instanceof EarnerAppletTileModel.Installed) {
                            String str11 = ((EarnerAppletTileModel.Installed) earnerAppletTileModel).clientRoute;
                            if (!(str11 != null ? cardStudioPresenter2.routeTo(str11) : false)) {
                                navigator.goTo(new EarningsHomeScreen(EarningsHomeScreen.Origin.MONEY_TAB_APPLET));
                            }
                        } else if (earnerAppletTileModel instanceof EarnerAppletTileModel.Uninstalled) {
                            String str12 = ((EarnerAppletTileModel.Uninstalled) earnerAppletTileModel).clientRoute;
                            if (!(str12 != null ? cardStudioPresenter2.routeTo(str12) : false)) {
                                navigator.goTo(FlowStarter.startPlasmaFlow$default((FlowStarter) cardStudioPresenter2.ioContext, Flow$Type.EARNER_ONBOARDING_FLOW, new MoneyTabScreen(null), null, null, 12));
                            }
                        } else if (!Intrinsics.areEqual(earnerAppletTileModel, EarnerAppletTileModel.Hidden.INSTANCE) && !Intrinsics.areEqual(earnerAppletTileModel, EarnerAppletTileModel.Loading.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        return Unit.INSTANCE;
                    case 7:
                        BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) ((LocalPosCheckInPresenter) obj4).navigator;
                        MutableState mutableState5 = (MutableState) obj3;
                        EarningsTimeframeSelectorSheetViewEvent earningsTimeframeSelectorSheetViewEvent = (EarningsTimeframeSelectorSheetViewEvent) obj;
                        if (earningsTimeframeSelectorSheetViewEvent instanceof EarningsTimeframeSelectorSheetViewEvent.TimeframeClicked) {
                            mutableState5.setValue(((EarningsTimeframeSelectorSheetViewEvent.TimeframeClicked) earningsTimeframeSelectorSheetViewEvent).timeframe);
                        } else if (Intrinsics.areEqual(earningsTimeframeSelectorSheetViewEvent, EarningsTimeframeSelectorSheetViewEvent.DoneButtonClicked.INSTANCE)) {
                            screenNavigator5.goTo(new Finish(new TimeframeSelectorSheetResult((Timeframe) mutableState5.getValue())));
                        } else {
                            if (!Intrinsics.areEqual(earningsTimeframeSelectorSheetViewEvent, EarningsTimeframeSelectorSheetViewEvent.SheetDismissed.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator5.goTo(back);
                        }
                        return Unit.INSTANCE;
                    case 8:
                        if (continuation instanceof RealDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1) {
                            realDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1 = (RealDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                            int i9 = realDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                                realDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1.label = i9 - PKIFailureInfo.systemUnavail;
                                Object obj8 = realDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1.result;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = realDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1.label;
                                if (i != 0) {
                                    SafeTrace.throwOnFailure(obj8);
                                    FlowCollector flowCollector2 = (FlowCollector) obj4;
                                    if (((ControlType) ((Pair) obj).first) == ((RealDependentControlStatusManager) obj3).controlType) {
                                        realDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                        if (flowCollector2.emit(obj, realDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    SafeTrace.throwOnFailure(obj8);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        realDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1 = new RealDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                        Object obj82 = realDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = realDependentControlStatusManager$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i != 0) {
                        }
                        return Unit.INSTANCE;
                    case 9:
                        if (continuation instanceof RealFamilyAccountsManager$getDependents$$inlined$map$1$2$1) {
                            realFamilyAccountsManager$getDependents$$inlined$map$1$2$1 = (RealFamilyAccountsManager$getDependents$$inlined$map$1$2$1) continuation;
                            int i10 = realFamilyAccountsManager$getDependents$$inlined$map$1$2$1.label;
                            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                                realFamilyAccountsManager$getDependents$$inlined$map$1$2$1.label = i10 - PKIFailureInfo.systemUnavail;
                                Object obj9 = realFamilyAccountsManager$getDependents$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i2 = realFamilyAccountsManager$getDependents$$inlined$map$1$2$1.label;
                                if (i2 != 0) {
                                    SafeTrace.throwOnFailure(obj9);
                                    FlowCollector flowCollector3 = (FlowCollector) obj4;
                                    ArrayList filterNotNull = CollectionsKt.filterNotNull((List) obj);
                                    WebLoginConfigQueries$$ExternalSyntheticLambda0 webLoginConfigQueries$$ExternalSyntheticLambda0 = ((RealFamilyAccountsManager) obj3).visibleDependentsPredicate;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it2 = filterNotNull.iterator();
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        if (((Boolean) webLoginConfigQueries$$ExternalSyntheticLambda0.invoke(next)).booleanValue()) {
                                            arrayList.add(next);
                                        }
                                    }
                                    realFamilyAccountsManager$getDependents$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector3.emit(arrayList, realFamilyAccountsManager$getDependents$$inlined$map$1$2$1) == coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    SafeTrace.throwOnFailure(obj9);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        realFamilyAccountsManager$getDependents$$inlined$map$1$2$1 = new RealFamilyAccountsManager$getDependents$$inlined$map$1$2$1(this, continuation);
                        Object obj92 = realFamilyAccountsManager$getDependents$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realFamilyAccountsManager$getDependents$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                        }
                        return Unit.INSTANCE;
                    case 10:
                        RealBitcoinAmountPickerPresenter realBitcoinAmountPickerPresenter = (RealBitcoinAmountPickerPresenter) obj4;
                        BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) realBitcoinAmountPickerPresenter.minimumAmount;
                        DependentControlsAndLimitsScreen dependentControlsAndLimitsScreen = (DependentControlsAndLimitsScreen) realBitcoinAmountPickerPresenter.activityEvents;
                        DependentControlsAndLimitsViewEvent dependentControlsAndLimitsViewEvent = (DependentControlsAndLimitsViewEvent) obj;
                        if (Intrinsics.areEqual(dependentControlsAndLimitsViewEvent, DependentControlsAndLimitsViewEvent.TapBack.INSTANCE)) {
                            screenNavigator6.goTo(back);
                        } else if (dependentControlsAndLimitsViewEvent instanceof DependentControlsAndLimitsViewEvent.ControlDetailNavigation) {
                            ControlType controlType = ((DependentControlsAndLimitsViewEvent.ControlDetailNavigation) dependentControlsAndLimitsViewEvent).controlType;
                            ControlType controlType2 = ControlType.P2P;
                            screenNavigator6.goTo((controlType == controlType2 && realBitcoinAmountPickerPresenter.hasError) ? new DependentControlScreen.ApprovedContactsControl(controlType2, dependentControlsAndLimitsScreen.dependentCustomerToken) : new DependentControlScreen.Toggle(controlType, dependentControlsAndLimitsScreen.dependentCustomerToken));
                        } else if (dependentControlsAndLimitsViewEvent instanceof DependentControlsAndLimitsViewEvent.LinkClicked) {
                            ((RealRouter) realBitcoinAmountPickerPresenter.appBackgroundedListener).route(new RoutingParams(null, null, null, null, null, null, 511), ((DependentControlsAndLimitsViewEvent.LinkClicked) dependentControlsAndLimitsViewEvent).url);
                        } else {
                            if (!Intrinsics.areEqual(dependentControlsAndLimitsViewEvent, DependentControlsAndLimitsViewEvent.TapBlockedAccounts.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Analytics analytics = (Analytics) realBitcoinAmountPickerPresenter.navigator;
                            String str13 = dependentControlsAndLimitsScreen.dependentCustomerToken;
                            BlockingContext blockingContext = BlockingContext.FAMILY_BLOCKLIST;
                            analytics.track(new P2PBlockListViewStart(str13, "FAMILY_BLOCKLIST"), null);
                            String str14 = dependentControlsAndLimitsScreen.dependentCustomerToken;
                            GetBlockedCustomersResponse getBlockedCustomersResponse = (GetBlockedCustomersResponse) ((MutableState) obj3).getValue();
                            getBlockedCustomersResponse.getClass();
                            List list3 = getBlockedCustomersResponse.blocked_customers;
                            BlocklistDetails blocklistDetails = getBlockedCustomersResponse.blocklist_details;
                            screenNavigator6.goTo(new P2PListScreen(str14, new P2PListData.BlockListData(list3, blocklistDetails != null ? blocklistDetails.support_page_client_route_url : 0), P2PScreenMode.BlockList.INSTANCE, blockingContext));
                        }
                        return Unit.INSTANCE;
                    case 11:
                        MutableStateFlow mutableStateFlow = (MutableStateFlow) obj3;
                        CardStudioPresenter cardStudioPresenter3 = (CardStudioPresenter) obj4;
                        BetterNavigator.ScreenNavigator screenNavigator7 = (BetterNavigator.ScreenNavigator) cardStudioPresenter3.navigator;
                        Analytics analytics2 = (Analytics) cardStudioPresenter3.analytics;
                        ShareSheetViewEvent shareSheetViewEvent = (ShareSheetViewEvent) obj;
                        if (shareSheetViewEvent instanceof ShareSheetViewEvent.Share) {
                            ShareTarget shareTarget = (ShareTarget) ((ShareSheetViewEvent.Share) shareSheetViewEvent).sharingOption.target;
                            int ordinal3 = shareTarget.getId().ordinal();
                            if (ordinal3 == 2) {
                                analytics2.track(new PersonalProfileShareSheetSms(), null);
                            } else if (ordinal3 == 3) {
                                analytics2.track(new PersonalProfileShareSheetCopyCashtagLink(), null);
                            } else if (ordinal3 == 4) {
                                analytics2.track(new PersonalProfileShareSheetSaveToPhotos(), null);
                            } else if (ordinal3 == 5) {
                                analytics2.track(new PersonalProfileShareSheetMore(), null);
                            }
                            do {
                                stateFlowImpl = (StateFlowImpl) mutableStateFlow;
                                value = stateFlowImpl.getValue();
                            } while (!stateFlowImpl.compareAndSet(value, new DependentTeenQrCodeShareSheetPresenter$SharingState.Loading(shareTarget.getTitle())));
                            if (((TextSetter) cardStudioPresenter3.appConfig).execute(shareTarget)) {
                                if (shareTarget instanceof ShareTarget.CopyToClipboard) {
                                    AndroidStringManager androidStringManager = (AndroidStringManager) cardStudioPresenter3.args;
                                    String str15 = ((DependentTeenQrCodeShareSheetScreen) cardStudioPresenter3.cardStudioQueries).currencySymbol;
                                    str15.getClass();
                                    Resources resources = androidStringManager.resources;
                                    resources.getClass();
                                    str4 = new MessageFormat(resources.getString(R.string.cash_tag_copied)).format(new Object[]{str15});
                                    str4.getClass();
                                }
                                failure = new DependentTeenQrCodeShareSheetPresenter$SharingState.Success(shareTarget.getTitle(), str4);
                            } else {
                                failure = new DependentTeenQrCodeShareSheetPresenter$SharingState.Failure(shareTarget.getTitle());
                            }
                            do {
                                value2 = stateFlowImpl.getValue();
                            } while (!stateFlowImpl.compareAndSet(value2, failure));
                        } else if (Intrinsics.areEqual(shareSheetViewEvent, ShareSheetViewEvent.ShareSuccess.INSTANCE)) {
                            screenNavigator7.goTo(back);
                        } else {
                            if (!Intrinsics.areEqual(shareSheetViewEvent, ShareSheetViewEvent.Dismiss.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator7.goTo(back);
                        }
                        return Unit.INSTANCE;
                    case 12:
                        ProfilePresenter profilePresenter = (ProfilePresenter) obj4;
                        BetterNavigator.ScreenNavigator screenNavigator8 = profilePresenter.navigator;
                        RealRouter realRouter = (RealRouter) profilePresenter.externalPaymentId;
                        SponsorDetailScreen sponsorDetailScreen = (SponsorDetailScreen) profilePresenter.screen;
                        SponsorDetailViewEvent sponsorDetailViewEvent = (SponsorDetailViewEvent) obj;
                        if (Intrinsics.areEqual(sponsorDetailViewEvent, SponsorDetailViewEvent.TapRequestCash.INSTANCE)) {
                            LinkText linkText = sponsorDetailScreen.sponsor.primary_cta;
                            if (linkText != null && (str2 = linkText.url) != null) {
                                realRouter.route(new RoutingParams(null, null, sponsorDetailScreen, null, null, null, 503), str2);
                            }
                        } else if (Intrinsics.areEqual(sponsorDetailViewEvent, SponsorDetailViewEvent.TapInviteFriends.INSTANCE)) {
                            profilePresenter.analytics.track(new ContactInviteFromSponsorViewStart(PlatformKt.activeAccountToken((SessionManager) profilePresenter.jurisdictionConfigManager)), null);
                            screenNavigator8.goTo(((RealFlowStarter) ((FlowStarter) profilePresenter.featureFlagManager)).startInviteFlow(back, BlockersScreens.StartFlowEntryPointScreen.Origin.FAMILIES));
                        } else if (Intrinsics.areEqual(sponsorDetailViewEvent, SponsorDetailViewEvent.TapBack.INSTANCE)) {
                            screenNavigator8.goTo(back);
                        } else {
                            if (!Intrinsics.areEqual(sponsorDetailViewEvent, SponsorDetailViewEvent.TapStartGraduation.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Sponsor sponsor = sponsorDetailScreen.sponsor;
                            FamilyParsingErrorFactory familyParsingErrorFactory = FamilyParsingErrorFactory.INSTANCE;
                            try {
                                GraduationCta graduationCta = sponsor.graduation_cta;
                                String str16 = graduationCta != null ? graduationCta.url : null;
                                if (str16 != null) {
                                    str3 = str16;
                                } else {
                                    try {
                                        throw new IllegalArgumentException("graduation_cta.url");
                                    } catch (Exception e) {
                                        ((ErrorReporter) profilePresenter.principalAccountToken).report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(Sponsor.class), familyParsingErrorFactory, null), (SampleStrategy) profilePresenter.allowlistRepository);
                                    }
                                }
                                if (str3 != null) {
                                    realRouter.route(new RoutingParams(null, null, (SponsorDetailScreen) profilePresenter.screen, null, null, null, 503), str3);
                                }
                            } catch (Exception e2) {
                                throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(sponsor.getClass()), familyParsingErrorFactory, null);
                            }
                        }
                        return Unit.INSTANCE;
                    case 13:
                        if (continuation instanceof SponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1) {
                            sponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1 = (SponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                            int i11 = sponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                                sponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1.label = i11 - PKIFailureInfo.systemUnavail;
                                Object obj10 = sponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i3 = sponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                                if (i3 != 0) {
                                    SafeTrace.throwOnFailure(obj10);
                                    FlowCollector flowCollector4 = (FlowCollector) obj4;
                                    RecurringPayments recurringPayments = (RecurringPayments) obj;
                                    ProfilePresenter profilePresenter2 = (ProfilePresenter) obj3;
                                    if (recurringPayments instanceof RecurringPayments.Loaded) {
                                        RecurringPayments.Loaded loaded = (RecurringPayments.Loaded) recurringPayments;
                                        String str17 = loaded.initializationUrl;
                                        ArrayList arrayList2 = loaded.recurringPayments;
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj11 : arrayList2) {
                                            if (!((RecurringPayment) obj11).isCanceled) {
                                                arrayList3.add(obj11);
                                            }
                                        }
                                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                                        Iterator it3 = arrayList3.iterator();
                                        while (it3.hasNext()) {
                                            RecurringPayment recurringPayment = (RecurringPayment) it3.next();
                                            String str18 = recurringPayment.token;
                                            String str19 = recurringPayment.scheduleDescription;
                                            String str20 = recurringPayment.timeToPaymentDescription;
                                            if (str20 == null) {
                                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                return null;
                                            }
                                            arrayList4.add(new AllowanceViewModel.AllowanceDetail(str18, str19, str20, ((MoneyFormatter) profilePresenter2.profileDetailsProvider).format(recurringPayment.amount), recurringPayment.editUrl, true));
                                        }
                                        AllowanceSectionViewModel allowanceSectionViewModel2 = new AllowanceSectionViewModel(arrayList4, str17);
                                        if (!arrayList2.isEmpty() || str17 != null) {
                                            allowanceSectionViewModel = allowanceSectionViewModel2;
                                        }
                                    } else if (recurringPayments instanceof RecurringPayments.Loading) {
                                        allowanceSectionViewModel = new AllowanceSectionViewModel(CollectionsKt__CollectionsJVMKt.listOf(AllowanceViewModel.Loading.INSTANCE), null);
                                    }
                                    sponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector4.emit(allowanceSectionViewModel, sponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1) == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                } else {
                                    if (i3 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    SafeTrace.throwOnFailure(obj10);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        sponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1 = new SponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                        Object obj102 = sponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = sponsorDetailPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                        }
                        return Unit.INSTANCE;
                    case 14:
                        LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj3;
                        CoroutineScope coroutineScope = (CoroutineScope) obj4;
                        SponsorLedInviteViewEvent sponsorLedInviteViewEvent = (SponsorLedInviteViewEvent) obj;
                        if (Intrinsics.areEqual(sponsorLedInviteViewEvent, SponsorLedInviteViewEvent.CtaClicked.INSTANCE)) {
                            JobKt.launch$default(coroutineScope, null, null, new RealProfileManager$profileOrNull$2(localEditorialPresenter, r9, 10), 3);
                        } else {
                            if (!Intrinsics.areEqual(sponsorLedInviteViewEvent, SponsorLedInviteViewEvent.TapBack.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(back);
                        }
                        return Unit.INSTANCE;
                    case 15:
                        CoroutineScope coroutineScope2 = (CoroutineScope) obj4;
                        if (Intrinsics.areEqual((U13CelebrationViewEvent$ButtonPressed) obj, U13CelebrationViewEvent$ButtonPressed.INSTANCE)) {
                            JobKt.launch$default(coroutineScope2, null, null, new GooglePayPresenter$models$1$1((EndAppLockPresenter) obj3, r9, 22), 3);
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 16:
                        if (continuation instanceof SelectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1) {
                            selectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1 = (SelectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1) continuation;
                            int i12 = selectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1.label;
                            if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                                selectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                                Object obj12 = selectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1.result;
                                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i4 = selectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1.label;
                                if (i4 != 0) {
                                    SafeTrace.throwOnFailure(obj12);
                                    FlowCollector flowCollector5 = (FlowCollector) obj4;
                                    Iterator it4 = ((List) obj).iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            Object next2 = it4.next();
                                            if (Intrinsics.areEqual(((ContactBook$Contact$DetailedContact) next2).lookupKey, ((SelectContactMethodScreen) ((LocalEditorialPresenter) obj3).screen).recipient.lookupKey)) {
                                                obj6 = next2;
                                            }
                                        }
                                    }
                                    selectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1.label = 1;
                                    if (flowCollector5.emit(obj6, selectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1) == coroutineSingletons5) {
                                        return coroutineSingletons5;
                                    }
                                } else {
                                    if (i4 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    SafeTrace.throwOnFailure(obj12);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        selectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1 = new SelectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1(this, continuation);
                        Object obj122 = selectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = selectContactMethodPresenter$models$lambda$0$$inlined$map$2$2$1.label;
                        if (i4 != 0) {
                        }
                        return Unit.INSTANCE;
                    case 17:
                        BetterNavigator.ScreenNavigator screenNavigator9 = (BetterNavigator.ScreenNavigator) ((VerifyCheckDialogPresenter) obj4).navigator;
                        SafetyHubViewEvent safetyHubViewEvent = (SafetyHubViewEvent) obj;
                        if (Intrinsics.areEqual(safetyHubViewEvent, SafetyHubViewEvent.TapClose.INSTANCE)) {
                            screenNavigator9.goTo(back);
                        } else {
                            if (!(safetyHubViewEvent instanceof SafetyHubViewEvent.TapTile)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            SafetyHubViewModel safetyHubViewModel = (SafetyHubViewModel) ((MutableState) obj3).getValue();
                            SafetyHubViewModel.Loaded loaded2 = safetyHubViewModel instanceof SafetyHubViewModel.Loaded ? (SafetyHubViewModel.Loaded) safetyHubViewModel : null;
                            if (loaded2 != null && (safetyEducationHub = loaded2.hub) != null && (list = safetyEducationHub.pages) != null) {
                                Iterator it5 = list.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        Object next3 = it5.next();
                                        if (Intrinsics.areEqual(((SafetyEducationPage) next3).id, ((SafetyHubViewEvent.TapTile) safetyHubViewEvent).tileId)) {
                                            obj5 = next3;
                                        }
                                    }
                                }
                                SafetyEducationPage safetyEducationPage = (SafetyEducationPage) obj5;
                                if (safetyEducationPage != null) {
                                    screenNavigator9.goTo(new SafetyHubScreens.SafetyEducationPageScreen(safetyEducationPage));
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    case 18:
                        if (continuation instanceof RealFavoritesManager$getFavorites$$inlined$map$1$2$1) {
                            realFavoritesManager$getFavorites$$inlined$map$1$2$1 = (RealFavoritesManager$getFavorites$$inlined$map$1$2$1) continuation;
                            int i13 = realFavoritesManager$getFavorites$$inlined$map$1$2$1.label;
                            if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                                realFavoritesManager$getFavorites$$inlined$map$1$2$1.label = i13 - PKIFailureInfo.systemUnavail;
                                Object obj13 = realFavoritesManager$getFavorites$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i5 = realFavoritesManager$getFavorites$$inlined$map$1$2$1.label;
                                if (i5 != 0) {
                                    SafeTrace.throwOnFailure(obj13);
                                    flowCollector = (FlowCollector) obj4;
                                    list2 = (List) obj;
                                    RealFavoritesRepository realFavoritesRepository = ((RealFavoritesManager) obj3).favoritesRepository;
                                    realFavoritesManager$getFavorites$$inlined$map$1$2$1.L$4 = flowCollector;
                                    realFavoritesManager$getFavorites$$inlined$map$1$2$1.L$6 = list2;
                                    realFavoritesManager$getFavorites$$inlined$map$1$2$1.I$0 = 0;
                                    realFavoritesManager$getFavorites$$inlined$map$1$2$1.label = 1;
                                    obj13 = JobKt.withContext(realFavoritesRepository.ioDispatcher, new RealProfileManager$profileOrNull$2(realFavoritesRepository, null, 11), realFavoritesManager$getFavorites$$inlined$map$1$2$1);
                                    break;
                                } else {
                                    if (i5 != 1) {
                                        if (i5 == 2) {
                                            SafeTrace.throwOnFailure(obj13);
                                            return Unit.INSTANCE;
                                        }
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    i7 = realFavoritesManager$getFavorites$$inlined$map$1$2$1.I$0;
                                    list2 = realFavoritesManager$getFavorites$$inlined$map$1$2$1.L$6;
                                    flowCollector = realFavoritesManager$getFavorites$$inlined$map$1$2$1.L$4;
                                    SafeTrace.throwOnFailure(obj13);
                                }
                                List list4 = (List) obj13;
                                ArrayList arrayList5 = new ArrayList();
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj14 : list2) {
                                    if (CollectionsKt.contains(list4, ((Recipient) obj14).customerId)) {
                                        arrayList5.add(obj14);
                                    } else {
                                        arrayList6.add(obj14);
                                    }
                                }
                                mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                                if (mapCapacity < 16) {
                                    mapCapacity = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                                for (Object obj15 : arrayList5) {
                                    Recipient recipient = (Recipient) obj15;
                                    String str21 = recipient.customerId;
                                    if (str21 == null && (str21 = recipient.lookupKey) == null) {
                                        str21 = "";
                                    }
                                    linkedHashMap.put(str21, obj15);
                                }
                                ArrayList arrayList7 = new ArrayList();
                                it = list4.iterator();
                                while (it.hasNext()) {
                                    Recipient recipient2 = (Recipient) linkedHashMap.get((String) it.next());
                                    if (recipient2 != null) {
                                        arrayList7.add(recipient2);
                                    }
                                }
                                ArrayList plus = CollectionsKt.plus((Iterable) CollectionsKt.sortedWith(arrayList6, new b.C0008b(15)), (Collection) arrayList7);
                                realFavoritesManager$getFavorites$$inlined$map$1$2$1.L$4 = null;
                                realFavoritesManager$getFavorites$$inlined$map$1$2$1.L$6 = null;
                                realFavoritesManager$getFavorites$$inlined$map$1$2$1.I$0 = i7;
                                realFavoritesManager$getFavorites$$inlined$map$1$2$1.label = 2;
                                break;
                            }
                        }
                        realFavoritesManager$getFavorites$$inlined$map$1$2$1 = new RealFavoritesManager$getFavorites$$inlined$map$1$2$1(this, continuation);
                        Object obj132 = realFavoritesManager$getFavorites$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realFavoritesManager$getFavorites$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                        }
                        List list42 = (List) obj132;
                        ArrayList arrayList52 = new ArrayList();
                        ArrayList arrayList62 = new ArrayList();
                        while (r1.hasNext()) {
                        }
                        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList52, 10));
                        if (mapCapacity < 16) {
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity);
                        while (r1.hasNext()) {
                        }
                        ArrayList arrayList72 = new ArrayList();
                        it = list42.iterator();
                        while (it.hasNext()) {
                        }
                        ArrayList plus2 = CollectionsKt.plus((Iterable) CollectionsKt.sortedWith(arrayList62, new b.C0008b(15)), (Collection) arrayList72);
                        realFavoritesManager$getFavorites$$inlined$map$1$2$1.L$4 = null;
                        realFavoritesManager$getFavorites$$inlined$map$1$2$1.L$6 = null;
                        realFavoritesManager$getFavorites$$inlined$map$1$2$1.I$0 = i7;
                        realFavoritesManager$getFavorites$$inlined$map$1$2$1.label = 2;
                        break;
                    case 19:
                        return emit$com$squareup$cash$favorites$presenters$AddFavoritesPresenter$models$lambda$13$$inlined$map$1$2(obj, continuation);
                    case 20:
                        return emit$com$squareup$cash$fidesmo$presenters$FidesmoDeprovisioningPresenter$models$11$1$2(obj, continuation);
                    case 21:
                        return emit$com$squareup$cash$fidesmo$presenters$FidesmoProvisioningPresenter$models$10$1$2(obj, continuation);
                    case 22:
                        return emit$com$squareup$cash$formview$components$arcade$MultilineTextInputValidator$validations$$inlined$map$1$2(obj, continuation);
                    case 23:
                        return emit$com$squareup$cash$formview$components$arcade$TextInputValidator$validations$$inlined$map$1$2(obj, continuation);
                    case 24:
                        GenericTreeElementsItem genericTreeElementsItem = (GenericTreeElementsItem) obj3;
                        SubtreeManager subtreeManager = (SubtreeManager) obj4;
                        GenericTreeElementsViewEvent genericTreeElementsViewEvent = (GenericTreeElementsViewEvent) obj;
                        GenericAnalyticsData analyticsData = genericTreeElementsViewEvent.getAnalyticsData();
                        if (analyticsData != null) {
                            subtreeManager.track(analyticsData, genericTreeElementsItem.overrideAnalytics);
                        }
                        SubtreeManager.access$process(subtreeManager, genericTreeElementsViewEvent, genericTreeElementsItem);
                        return Unit.INSTANCE;
                    case 25:
                        return emit$com$squareup$cash$graphics$swampgl$components$Transform$special$$inlined$map$1$2(obj, continuation);
                    case 26:
                        return emit$com$squareup$cash$history$navigation$PaymentActionHandler$cancelOrder$$inlined$map$1$2(obj, continuation);
                    case 27:
                        return emit$com$squareup$cash$history$navigation$PaymentActionHandler$transform$lambda$2$$inlined$map$1$2(obj, continuation);
                    case 28:
                        return emit$com$squareup$cash$history$payments$presenters$ProfilePaymentHistoryPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
                    default:
                        CheckStatusPresenter checkStatusPresenter = (CheckStatusPresenter) obj3;
                        CoroutineScope coroutineScope3 = (CoroutineScope) obj4;
                        CheckStatusViewEvent checkStatusViewEvent = (CheckStatusViewEvent) obj;
                        if (checkStatusViewEvent instanceof CheckStatusViewEvent.NegativeClicked) {
                            JobKt.launch$default(coroutineScope3, null, null, new CheckStatusPresenter.AnonymousClass1(checkStatusPresenter, checkStatusViewEvent, r9, i8), 3);
                        } else {
                            if (!(checkStatusViewEvent instanceof CheckStatusViewEvent.PositiveClicked)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            checkStatusPresenter.navigator.goTo(new Finish(AlertDialogResult.POSITIVE));
                        }
                        return Unit.INSTANCE;
                }
            }

            public /* synthetic */ C00601(CoroutineScope coroutineScope, Object obj, Object obj2, int i) {
                this.$r8$classId = i;
                this.$$this$coroutineScope = obj;
                this.$expected = obj2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GLSceneScope gLSceneScope, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 24;
            this.$expected = gLSceneScope;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, int i, Object obj2, Object obj3, Continuation continuation, int i2) {
            super(2, continuation);
            this.$r8$classId = i2;
            this.$other = obj;
            this.label = i;
            this.$$this$coroutineScope = obj2;
            this.$expected = obj3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$other = obj;
            this.$$this$coroutineScope = obj2;
            this.$expected = obj3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$$this$coroutineScope = obj;
            this.$expected = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Flow flow, Continuation continuation, Object obj, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$$this$coroutineScope = flow;
            this.$expected = obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimationsKt$takeUntil$1$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_takeUntil = obj;
        this.$$this$flow = obj2;
        this.$other = obj3;
        this.$expected = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimationsKt$takeUntil$1$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$$this$flow = obj;
        this.$other = obj2;
        this.$expected = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimationsKt$takeUntil$1$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$other = obj;
        this.$expected = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimationsKt$takeUntil$1$1(Object obj, Continuation continuation, Object obj2, Object obj3, Object obj4, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_takeUntil = obj;
        this.$$this$flow = obj2;
        this.$other = obj3;
        this.$expected = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationsKt$takeUntil$1$1(TransferStockPresenter transferStockPresenter, WithHoldings withHoldings, State state, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 12;
        this.$this_takeUntil = transferStockPresenter;
        this.$other = withHoldings;
        this.$expected = state;
    }
}
