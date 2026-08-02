package com.squareup.cash.blockers.views;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Parcelable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.compose.ui.platform.WindowInfoImpl;
import androidx.core.text.TextUtilsCompat;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.webkit.internal.AssetHelper;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.molecule.PlatformKt;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.zxing.Result;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.api.Aliases;
import com.squareup.cash.autofillweb.api.AutofillWebInfo;
import com.squareup.cash.autofillweb.real.AggregateAutofillWebManager;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.biometrics.BiometricsStore$read$1;
import com.squareup.cash.bitcoin.navigation.CryptoScannerSource;
import com.squareup.cash.bitcoin.presenters.applet.toolbar.RealBitcoinHomeToolbarPresenter;
import com.squareup.cash.bitcoin.presenters.map.BitcoinMapPresenter;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.PaidInBitcoinState;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation.RealPaidInBitcoinNavigator;
import com.squareup.cash.bitcoin.presenters.stablecoin.StablecoinDepositPresenter$models$3$1;
import com.squareup.cash.bitcoin.presenters.stablecoin.StablecoinOnboardingPresenter$models$1$1;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinInstrumentRecommendationPresenter$models$2$1;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferTitleSubtitleProvider;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.screens.BitcoinDisplayCurrencyScreen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinInstrumentRecommendationScreen;
import com.squareup.cash.bitcoin.screens.BitcoinLimitsLoadingScreen;
import com.squareup.cash.bitcoin.screens.BitcoinQrCodeScannerScreen;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.screens.ChangeNetworkQuestion;
import com.squareup.cash.bitcoin.screens.StablecoinDepositOptionsScreen;
import com.squareup.cash.bitcoin.screens.StablecoinDepositScreen;
import com.squareup.cash.bitcoin.screens.StablecoinOnboardingScreen;
import com.squareup.cash.bitcoin.screens.StablecoinOnboardingType;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.toolbar.BitcoinHomeToolbarEvent;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationFilter;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationViewEvent;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapOnboardingViewEvent;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapViewEvent;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinCardUpsellViewEvent;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositViewEvent;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinOnboardingViewEvent;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinInstrumentRecommendationViewEvent;
import com.squareup.cash.blockers.actions.presenters.BlockerActionConfirmDialogPresenter;
import com.squareup.cash.blockers.actions.presenters.BlockerActionConfirmDialogPresenter$models$1$1;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmDialogResult$Negative;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmDialogViewEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.BalanceTransferLoadingPresenter$models$1$1$2;
import com.squareup.cash.blockers.presenters.ContactsPermissionExplanationSheetPresenter$models$1$1;
import com.squareup.cash.blockers.presenters.FormattedResources;
import com.squareup.cash.blockers.presenters.InputCardInfoPresenter;
import com.squareup.cash.blockers.presenters.InputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1;
import com.squareup.cash.blockers.presenters.InviteFriendsPresenter$models$2$1;
import com.squareup.cash.blockers.presenters.PasscodeGenericGatedEndpointTypeTransformer;
import com.squareup.cash.blockers.presenters.PasscodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.blockers.presenters.ReferralCodePresenter;
import com.squareup.cash.blockers.presenters.SelectionPresenter;
import com.squareup.cash.blockers.presenters.SelectionPresenter$models$1$1;
import com.squareup.cash.blockers.presenters.SetAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import com.squareup.cash.blockers.presenters.VerifyContactsPresenter;
import com.squareup.cash.blockers.presenters.VerifyContactsPresenter$models$2$1$3$WhenMappings;
import com.squareup.cash.blockers.presenters.VerifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.ContactsPermissionExplanationSheetEvent;
import com.squareup.cash.blockers.viewmodels.Header;
import com.squareup.cash.blockers.viewmodels.InviteFriendsViewEvent;
import com.squareup.cash.blockers.viewmodels.PasscodeViewEvent;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewModel;
import com.squareup.cash.blockers.viewmodels.SelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewModel;
import com.squareup.cash.blockers.web.presenters.WebViewBlockerPresenter;
import com.squareup.cash.borrow.backend.RealBorrowDataManager;
import com.squareup.cash.borrow.backend.RealBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.borrow.backend.RealBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayEvent;
import com.squareup.cash.borrow.viewmodels.SheetButtonAction;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioViewKt$ThemedCard$1$4$1;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.ContactInviteEntryPoint;
import com.squareup.cash.cdf.account.AccountAuthenticatePasscodePrompt;
import com.squareup.cash.cdf.account.AccountLinkAutofill;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletInteractTapBulletinSheetButton;
import com.squareup.cash.cdf.contact.ContactInviteOpenContactPermissionExplanation;
import com.squareup.cash.cdf.crypto.CryptoAllocatePayrollBeginActivateCashCard;
import com.squareup.cash.cdf.crypto.CryptoAllocatePayrollBeginRequestCashCard;
import com.squareup.cash.cdf.crypto.CryptoChangeStart;
import com.squareup.cash.cdf.crypto.CryptoInteractClose;
import com.squareup.cash.cdf.crypto.CryptoInteractPerformanceDetailsInfoItem;
import com.squareup.cash.cdf.crypto.CryptoSpendApplyFilter;
import com.squareup.cash.cdf.crypto.CryptoSpendPayFromMap;
import com.squareup.cash.cdf.crypto.CryptoSpendViewDirections;
import com.squareup.cash.cdf.crypto.CryptoStablecoinDepositCopyDestinationAddress;
import com.squareup.cash.cdf.crypto.CryptoStablecoinDepositSelectNetwork;
import com.squareup.cash.cdf.crypto.CryptoStablecoinDepositShareDestinationAddress;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.PayloadWithMetadata;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.StablecoinDepositOption;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.contacts.ContactVerifier$Result;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.deposits.physical.screens.AddressSearchQuestion;
import com.squareup.cash.deposits.physical.screens.PhysicalCashDepositAddressEntryScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.contacts.ContactBook$AliasType;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.protos.lending.sync_values.GlobalBorrowData;
import com.squareup.util.android.Emails;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.cash.Bps;
import com.squareup.util.cash.Regions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class PasscodeViewKt$Passcode$3$1$1$1$2 implements FlowCollector {
    public final /* synthetic */ Object $contentModel;
    public final /* synthetic */ Object $onEvent;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PasscodeViewKt$Passcode$3$1$1$1$2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$onEvent = obj2;
        this.$contentModel = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$blockers$presenters$SetAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2(Object obj, Continuation continuation) {
        SetAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1 setAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        CardLockPresenter cardLockPresenter = (CardLockPresenter) this.$onEvent;
        if (continuation instanceof SetAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1) {
            setAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1 = (SetAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = setAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                setAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = setAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.$contentModel;
                    Boolean bool = ((BlockersConfig) obj).address_typeahead_enabled;
                    boolean booleanValue = bool != null ? bool.booleanValue() : ((BlockersScreens.StreetAddressScreen) cardLockPresenter.flowStarter).blockersData.addressTypeaheadEnabled;
                    BlockersData copy$default = BlockersData.copy$default(((BlockersScreens.StreetAddressScreen) cardLockPresenter.flowStarter).blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, booleanValue, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -32769, 65535);
                    BlockersScreens.StreetAddressScreen streetAddressScreen = (BlockersScreens.StreetAddressScreen) cardLockPresenter.flowStarter;
                    BlockersScreens.StreetAddressScreen.FormType formType = streetAddressScreen.formType;
                    Redacted redacted = streetAddressScreen.address;
                    String str = streetAddressScreen.titleOverride;
                    String str2 = streetAddressScreen.subtitleOverride;
                    String str3 = streetAddressScreen.hintOverride;
                    List list = streetAddressScreen.helpItems;
                    boolean z = streetAddressScreen.idvFlow;
                    boolean z2 = streetAddressScreen.canExit;
                    BlockersScreens.StreetAddressScreen.SetStreetAddressType setStreetAddressType = streetAddressScreen.setStreetAddressType;
                    boolean z3 = streetAddressScreen.autofill;
                    formType.getClass();
                    redacted.getClass();
                    setStreetAddressType.getClass();
                    cardLockPresenter.flowStarter = new BlockersScreens.StreetAddressScreen(copy$default, formType, redacted, str, str2, str3, booleanValue, list, z, z2, setStreetAddressType, z3);
                    Unit unit = Unit.INSTANCE;
                    setAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(unit, setAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        setAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1 = new SetAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = setAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$blockers$presenters$VerifyContactsPresenter$models$2$1$3(Object obj, Continuation continuation) {
        String str;
        ContactVerifier$Result contactVerifier$Result = (ContactVerifier$Result) obj;
        MutableState mutableState = (MutableState) this.$onEvent;
        VerifyContactsPresenter verifyContactsPresenter = (VerifyContactsPresenter) this.$contentModel;
        BlockersDataNavigator blockersDataNavigator = verifyContactsPresenter.blockersNavigator;
        BetterNavigator.ScreenNavigator screenNavigator = verifyContactsPresenter.navigator;
        BlockersScreens.ContactVerificationScreen contactVerificationScreen = verifyContactsPresenter.args;
        if (Intrinsics.areEqual(contactVerifier$Result, ContactVerifier$Result.Loading.INSTANCE)) {
            mutableState.setValue(VerifyContactsViewModel.copy$default((VerifyContactsViewModel) mutableState.getValue(), true, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE));
        } else if (contactVerifier$Result instanceof ContactVerifier$Result.Successful) {
            mutableState.setValue(VerifyContactsViewModel.copy$default((VerifyContactsViewModel) mutableState.getValue(), false, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE));
            Timber.Forest.d("Verify contacts success.", new Object[0]);
            BlockersData blockersData = contactVerificationScreen.blockersData;
            ContactVerifier$Result.Successful successful = (ContactVerifier$Result.Successful) contactVerifier$Result;
            String str2 = successful.failureMessage;
            ResponseContext responseContext = successful.responseContext;
            Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
            BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
            Screen next = blockersDataNavigator.getNext(contactVerificationScreen, updateFromResponseContext);
            if (str2 == null || StringsKt.isBlank(str2)) {
                screenNavigator.goTo(next);
            } else {
                screenNavigator.goTo(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, next, str2, null, 8));
            }
        } else if (contactVerifier$Result instanceof ContactVerifier$Result.NotSuccessful) {
            mutableState.setValue(VerifyContactsViewModel.copy$default((VerifyContactsViewModel) mutableState.getValue(), false, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE));
            ContactVerifier$Result.NotSuccessful notSuccessful = (ContactVerifier$Result.NotSuccessful) contactVerifier$Result;
            String str3 = notSuccessful.failureMessage;
            ContactVerifier$Result.NotSuccessful.Status status = notSuccessful.status;
            int i = VerifyContactsPresenter$models$2$1$3$WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                str = "Failure";
            } else if (i == 2) {
                str = "Too Many";
            } else {
                if (i != 3) {
                    OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                    return null;
                }
                str = "Concurrent Mod";
            }
            Timber.Forest forest = Timber.Forest;
            Locale locale = Locale.US;
            forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Verify contacts ", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, str, locale), "."), new Object[0]);
            BlockersData blockersData2 = contactVerificationScreen.blockersData;
            ResponseContext responseContext2 = notSuccessful.responseContext;
            responseContext2.getClass();
            Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
            BlockersData updateFromResponseContext2 = blockersData2.updateFromResponseContext(responseContext2, false);
            Screen next2 = blockersDataNavigator.getNext(contactVerificationScreen, updateFromResponseContext2);
            if (str3 == null || StringsKt.isBlank(str3)) {
                screenNavigator.goTo(next2);
            } else {
                screenNavigator.goTo(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext2, next2, str3, null, 8));
            }
        } else {
            if (!(contactVerifier$Result instanceof ContactVerifier$Result.NetworkFailure)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            mutableState.setValue(VerifyContactsViewModel.copy$default((VerifyContactsViewModel) mutableState.getValue(), false, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE));
            Timber.Forest.w("Failed to verify contacts.", new Object[0]);
            screenNavigator.goTo(new FailureMessageBlockerScreen(contactVerificationScreen.blockersData, TextUtilsCompat.errorMessaging(verifyContactsPresenter.stringManager, ((ContactVerifier$Result.NetworkFailure) contactVerifier$Result).failure, null).message, null, 4));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0132, code lost:
    
        if (r13.emit(r14, r9) == r2) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$blockers$presenters$VerifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2(Object obj, Continuation continuation) {
        VerifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1 verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        int i2;
        FlowCollector flowCollector;
        int i3;
        String normalize;
        ContactVerifier$Result contactVerifier$Result;
        ContactVerifier$Result contactVerifier$Result2;
        FlowCollector flowCollector2;
        ContactVerifier$Result contactVerifier$Result3;
        VerifyContactsPresenter verifyContactsPresenter = (VerifyContactsPresenter) this.$onEvent;
        BlockersScreens.ContactVerificationScreen contactVerificationScreen = verifyContactsPresenter.args;
        if (continuation instanceof VerifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1) {
            verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1 = (VerifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i4 = verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1.label = i4 - PKIFailureInfo.systemUnavail;
                VerifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1 verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12 = verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1;
                Object obj2 = verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.$contentModel;
                    Result result = verifyContactsPresenter.contactVerifier;
                    ArrayList arrayList = new ArrayList();
                    for (Pair pair : (Set) obj) {
                        ContactBook$AliasType contactBook$AliasType = (ContactBook$AliasType) pair.first;
                        String str = (String) pair.second;
                        int ordinal = contactBook$AliasType.ordinal();
                        if (ordinal == 0) {
                            normalize = PhoneNumbers.normalize(str, Regions.toCountry(contactVerificationScreen.blockersData.region).name());
                        } else {
                            if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            normalize = Emails.normalize(str);
                        }
                        if (normalize != null) {
                            arrayList.add(normalize);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        ByteString.Companion companion = ByteString.Companion;
                        arrayList2.add(ByteString.Companion.decodeHex(Aliases.hash(str2)));
                    }
                    ClientScenario clientScenario = contactVerificationScreen.blockersData.clientScenario;
                    clientScenario.getClass();
                    String str3 = contactVerificationScreen.blockersData.flowToken;
                    verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.L$4 = flowCollector3;
                    i2 = 0;
                    verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.I$0 = 0;
                    verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.I$1 = 0;
                    verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.label = 1;
                    obj2 = result.verify(arrayList2, clientScenario, str3, verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12);
                    if (obj2 != coroutineSingletons) {
                        flowCollector = flowCollector3;
                        i3 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    int i5 = verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.I$1;
                    int i6 = verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.I$0;
                    FlowCollector flowCollector4 = verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.L$4;
                    SafeTrace.throwOnFailure(obj2);
                    i2 = i5;
                    i3 = i6;
                    flowCollector = flowCollector4;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.I$0;
                    contactVerifier$Result3 = verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.L$7;
                    flowCollector2 = verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.L$4;
                    SafeTrace.throwOnFailure(obj2);
                    contactVerifier$Result2 = contactVerifier$Result3;
                    flowCollector = flowCollector2;
                    verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.L$4 = null;
                    verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.L$7 = null;
                    verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.I$0 = i3;
                    verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.label = 3;
                }
                contactVerifier$Result = (ContactVerifier$Result) obj2;
                if (contactVerifier$Result == null) {
                    Analytics analytics = verifyContactsPresenter.analytics;
                    BlockersData blockersData = contactVerificationScreen.blockersData;
                    AndroidStringManager androidStringManager = verifyContactsPresenter.stringManager;
                    verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.L$4 = flowCollector;
                    verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.L$7 = contactVerifier$Result;
                    verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.I$0 = i3;
                    verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.I$1 = i2;
                    verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.label = 2;
                    Object trackBlockerSubmissionAnalyticsInternal2 = PointerInputModifierNodeKt.trackBlockerSubmissionAnalyticsInternal2(analytics, androidStringManager, blockersData, R.string.blockers_retrofit_error_message, new BadgeQueries$$ExternalSyntheticLambda0(23, contactVerifier$Result, androidStringManager), new BiometricsStore$read$1(1, null, 3), verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12);
                    if (trackBlockerSubmissionAnalyticsInternal2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        trackBlockerSubmissionAnalyticsInternal2 = Unit.INSTANCE;
                    }
                    if (trackBlockerSubmissionAnalyticsInternal2 != coroutineSingletons) {
                        flowCollector2 = flowCollector;
                        contactVerifier$Result3 = contactVerifier$Result;
                        contactVerifier$Result2 = contactVerifier$Result3;
                        flowCollector = flowCollector2;
                        verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.L$4 = null;
                        verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.L$7 = null;
                        verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.I$0 = i3;
                        verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.label = 3;
                    }
                    return coroutineSingletons;
                }
                contactVerifier$Result2 = null;
                verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.L$4 = null;
                verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.L$7 = null;
                verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.I$0 = i3;
                verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$12.label = 3;
            }
        }
        verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1 = new VerifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        VerifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1 verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$122 = verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$1;
        Object obj22 = verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        contactVerifier$Result = (ContactVerifier$Result) obj22;
        if (contactVerifier$Result == null) {
        }
    }

    private final Object emit$com$squareup$cash$blockers$web$presenters$WebViewBlockerPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        Set set = (Set) obj;
        BlockersScreens.WebViewBlockerScreen webViewBlockerScreen = (BlockersScreens.WebViewBlockerScreen) this.$contentModel;
        BlockersData blockersData = webViewBlockerScreen.blockersData;
        Map map = webViewBlockerScreen.metadata;
        String str = (String) map.get("sms");
        String str2 = (String) map.get("email");
        WebViewBlockerPresenter webViewBlockerPresenter = (WebViewBlockerPresenter) this.$onEvent;
        Analytics analytics = webViewBlockerPresenter.analytics;
        AggregateAutofillWebManager aggregateAutofillWebManager = webViewBlockerPresenter.autofillManager;
        aggregateAutofillWebManager.setAutofillInfo(new AutofillWebInfo(null, null, null, null, str, str2, null, null, null, null, null, null, null, null, null, 32719));
        aggregateAutofillWebManager.triggerAutofill();
        if (set.contains("sms") && str != null) {
            analytics.track(new AccountLinkAutofill(AliasType.SMS, blockersData.flowToken), null);
        }
        if (set.contains("email") && str2 != null) {
            analytics.track(new AccountLinkAutofill(AliasType.EMAIL, blockersData.flowToken), null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$borrow$backend$RealBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2(Object obj, Continuation continuation) {
        RealBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1 realBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof RealBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1) {
            realBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1 = (RealBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = realBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1.label;
                BorrowLimitHubData borrowLimitHubData = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.$contentModel;
                    BorrowLimitHubData borrowLimitHubData2 = (BorrowLimitHubData) obj;
                    if (borrowLimitHubData2 != null) {
                        List list = borrowLimitHubData2.sections;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (AssetHelper.matchesAny(((RealBorrowDataManager) this.$onEvent).appVersion, ((BorrowLimitHubData.Section) obj3).app_supports)) {
                                arrayList.add(obj3);
                            }
                        }
                        LocalizedString localizedString = borrowLimitHubData2.title;
                        ByteString unknownFields = borrowLimitHubData2.unknownFields();
                        unknownFields.getClass();
                        borrowLimitHubData = new BorrowLimitHubData(localizedString, arrayList, unknownFields);
                    }
                    if (borrowLimitHubData != null) {
                        realBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(borrowLimitHubData, realBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        realBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1 = new RealBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = realBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2$1.label;
        BorrowLimitHubData borrowLimitHubData3 = null;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$borrow$backend$RealBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2(Object obj, Continuation continuation) {
        RealBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1 realBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1;
        int i;
        GlobalBorrowData globalBorrowData;
        List list;
        if (continuation instanceof RealBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1) {
            realBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1 = (RealBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = realBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.$contentModel;
                    PayloadWithMetadata payloadWithMetadata = (PayloadWithMetadata) obj;
                    boolean z = false;
                    if (payloadWithMetadata != null && (globalBorrowData = (GlobalBorrowData) payloadWithMetadata.value) != null && (list = globalBorrowData.country_supports) != null) {
                        List list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                GlobalBorrowData.CountrySupport countrySupport = (GlobalBorrowData.CountrySupport) it.next();
                                Country country = countrySupport.country;
                                if (country == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("CountrySupport.country is required");
                                    return null;
                                }
                                GlobalAddress globalAddress = (GlobalAddress) this.$onEvent;
                                Country country2 = globalAddress.country_code;
                                boolean z2 = country == country2 || (country == Country.US && country2 == null);
                                List list3 = countrySupport.supported_states;
                                String str = globalAddress.administrative_district_level_1;
                                if (str == null) {
                                    str = "";
                                }
                                boolean contains = list3.contains(str);
                                if (z2 && contains) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    realBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(valueOf, realBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        realBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1 = new RealBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = realBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARN: Type inference failed for: r0v153, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r0v187, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r0v60, types: [com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator$ScreenNavigator] */
    /* JADX WARN: Type inference failed for: r13v8, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r2v71, types: [com.squareup.cash.data.blockers.BlockersDataNavigator] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CryptoInteractPerformanceDetailsInfoItem.PerformanceDetailsInfoItemType performanceDetailsInfoItemType;
        BitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1 bitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1;
        int i;
        String str;
        InputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1 inputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1;
        int i2;
        String str2;
        CardStudioViewKt$ThemedCard$1$4$1 cardStudioViewKt$ThemedCard$1$4$1;
        ContactInviteEntryPoint contactInviteEntryPoint;
        PasscodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1 passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i3;
        ReferralCodeViewModel copy$default;
        FileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1 fileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1;
        int i4;
        int i5 = this.$r8$classId;
        int i6 = 2;
        int i7 = 0;
        int i8 = 1;
        Back back = Back.INSTANCE;
        Object obj2 = this.$contentModel;
        Object obj3 = this.$onEvent;
        PasscodeViewEvent.VerifyPasscode.WithFingerprint withFingerprint = null;
        ?? r14 = 0;
        ?? r142 = 0;
        ?? r143 = 0;
        ?? r144 = 0;
        ?? r145 = 0;
        ?? r146 = 0;
        ?? r147 = 0;
        ?? r148 = 0;
        ?? r149 = 0;
        ?? r1410 = 0;
        ?? r1411 = 0;
        switch (i5) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence.length() == ((PasscodeViewModel.Content) ((PasscodeViewModel) obj2)).passcodeLength) {
                    ((Function1) obj3).invoke(new PasscodeViewEvent.VerifyPasscode.WithoutFingerprint(charSequence.toString()));
                }
                return Unit.INSTANCE;
            case 1:
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) obj3;
                StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) obj2;
                Analytics analytics = (Analytics) stuckPlayerDetector.playerListener;
                BitcoinSettingsWidgetViewEvent bitcoinSettingsWidgetViewEvent = (BitcoinSettingsWidgetViewEvent) obj;
                if (Intrinsics.areEqual(bitcoinSettingsWidgetViewEvent, BitcoinSettingsWidgetViewEvent.DisplayCurrencyClicked.INSTANCE)) {
                    analytics.track(new CryptoChangeStart(CryptoChangeStart.Setting.DISPLAY_CURRENCY), null);
                    screenNavigator.goTo(BitcoinDisplayCurrencyScreen.INSTANCE);
                } else if (Intrinsics.areEqual(bitcoinSettingsWidgetViewEvent, BitcoinSettingsWidgetViewEvent.PriceAlertsClicked.INSTANCE)) {
                    analytics.track(new CryptoChangeStart(CryptoChangeStart.Setting.PRICE_ALERTS), null);
                    screenNavigator.goTo(new ProfileScreens.ChannelListScreen(NotificationCategory.NOTIFICATION_CATEGORY_BITCOIN_PRICE_ALERTS, PlatformKt.activeAccountToken((SessionManager) stuckPlayerDetector.clock)));
                } else {
                    if (!Intrinsics.areEqual(bitcoinSettingsWidgetViewEvent, BitcoinSettingsWidgetViewEvent.LimitsClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    analytics.track(new CryptoChangeStart(CryptoChangeStart.Setting.LIMITS), null);
                    screenNavigator.goTo(BitcoinLimitsLoadingScreen.INSTANCE);
                }
                return Unit.INSTANCE;
            case 2:
                RealBitcoinHomeToolbarPresenter realBitcoinHomeToolbarPresenter = (RealBitcoinHomeToolbarPresenter) obj3;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                BitcoinHomeToolbarEvent bitcoinHomeToolbarEvent = (BitcoinHomeToolbarEvent) obj;
                if (Intrinsics.areEqual(bitcoinHomeToolbarEvent, BitcoinHomeToolbarEvent.BitcoinScannerClicked.INSTANCE)) {
                    realBitcoinHomeToolbarPresenter.bitcoinInboundNavigator.showCryptoScanner(CryptoScannerSource.BITCOIN_TAB, CryptoPaymentOrigin.BITCOIN_TAB, null);
                } else if (Intrinsics.areEqual(bitcoinHomeToolbarEvent, BitcoinHomeToolbarEvent.BitcoinMapClicked.INSTANCE)) {
                    JobKt.launch$default(coroutineScope, null, null, new AmountPickerCondensedView.AnonymousClass14(realBitcoinHomeToolbarPresenter, r14 == true ? 1 : 0, 18), 3);
                } else {
                    if (!Intrinsics.areEqual(bitcoinHomeToolbarEvent, BitcoinHomeToolbarEvent.BackClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    realBitcoinHomeToolbarPresenter.analytics.track(new CryptoInteractClose(), null);
                    realBitcoinHomeToolbarPresenter.navigator.goTo(back);
                }
                return Unit.INSTANCE;
            case 3:
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
                BitcoinLocationViewEvent bitcoinLocationViewEvent = (BitcoinLocationViewEvent) obj;
                if (Intrinsics.areEqual(bitcoinLocationViewEvent, BitcoinLocationViewEvent.OpenDirections.INSTANCE)) {
                    ((Analytics) cardStudioPresenter.analytics).track(new CryptoSpendViewDirections((String) cardStudioPresenter.appConfig), null);
                    BitcoinLocationViewModel bitcoinLocationViewModel = (BitcoinLocationViewModel) obj3;
                    ((IntentLauncher) cardStudioPresenter.args).launchMap(bitcoinLocationViewModel.address, bitcoinLocationViewModel.latitude, bitcoinLocationViewModel.longitude);
                } else if (Intrinsics.areEqual(bitcoinLocationViewEvent, BitcoinLocationViewEvent.Pay.INSTANCE)) {
                    screenNavigator2.goTo(new BitcoinQrCodeScannerScreen(CryptoPaymentOrigin.BITCOIN_LOCATION, null, false));
                } else {
                    if (!Intrinsics.areEqual(bitcoinLocationViewEvent, BitcoinLocationViewEvent.Close.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator2.goTo(back);
                }
                return Unit.INSTANCE;
            case 4:
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj3;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj2;
                BitcoinMapOnboardingViewEvent bitcoinMapOnboardingViewEvent = (BitcoinMapOnboardingViewEvent) obj;
                if (Intrinsics.areEqual(bitcoinMapOnboardingViewEvent, BitcoinMapOnboardingViewEvent.Continue.INSTANCE)) {
                    JobKt.launch$default(coroutineScope2, null, null, new AmountPickerCondensedView.AnonymousClass14(localPosCheckInPresenter, r142 == true ? 1 : 0, 19), 3);
                } else {
                    if (!Intrinsics.areEqual(bitcoinMapOnboardingViewEvent, BitcoinMapOnboardingViewEvent.GoBack.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator).goTo(back);
                }
                return Unit.INSTANCE;
            case 5:
                BitcoinMapPresenter bitcoinMapPresenter = (BitcoinMapPresenter) obj2;
                Analytics analytics2 = bitcoinMapPresenter.analytics;
                BetterNavigator.ScreenNavigator screenNavigator3 = bitcoinMapPresenter.navigator;
                AndroidStringManager androidStringManager = bitcoinMapPresenter.stringManager;
                BitcoinMapViewEvent bitcoinMapViewEvent = (BitcoinMapViewEvent) obj;
                if (Intrinsics.areEqual(bitcoinMapViewEvent, BitcoinMapViewEvent.GoBack.INSTANCE)) {
                    screenNavigator3.goTo(back);
                } else if (bitcoinMapViewEvent instanceof BitcoinMapViewEvent.UpdateLocationFilter) {
                    BitcoinLocationFilter bitcoinLocationFilter = ((BitcoinMapViewEvent.UpdateLocationFilter) bitcoinMapViewEvent).locationFilter;
                    analytics2.track(new CryptoSpendApplyFilter(Boolean.valueOf(bitcoinLocationFilter.squareSellersOnly)), null);
                    ((MutableState) obj3).setValue(bitcoinLocationFilter);
                } else if (Intrinsics.areEqual(bitcoinMapViewEvent, BitcoinMapViewEvent.SearchLocations.INSTANCE)) {
                    screenNavigator3.askQuestion(new AddressSearchQuestion(), new KClasses$$Lambda$2(new PhysicalCashDepositAddressEntryScreen.SearchScreen(androidStringManager.get(R.string.bitcoin_location_search_searchbar_placeholder), androidStringManager.get(R.string.bitcoin_location_search_explanation_title), androidStringManager.get(R.string.bitcoin_location_search_explanation_detail), androidStringManager.get(R.string.bitcoin_location_search_recent_section_header), androidStringManager.get(R.string.bitcoin_location_search_results_section_header)), 8));
                } else {
                    if (!Intrinsics.areEqual(bitcoinMapViewEvent, BitcoinMapViewEvent.Pay.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    analytics2.track(new CryptoSpendPayFromMap(), null);
                    screenNavigator3.goTo(new BitcoinQrCodeScannerScreen(CryptoPaymentOrigin.BITCOIN_MAP, null, false));
                }
                return Unit.INSTANCE;
            case 6:
                MusicPresenter musicPresenter = (MusicPresenter) obj2;
                PaidInBitcoinCardUpsellViewEvent paidInBitcoinCardUpsellViewEvent = (PaidInBitcoinCardUpsellViewEvent) obj;
                if (Intrinsics.areEqual(paidInBitcoinCardUpsellViewEvent, PaidInBitcoinCardUpsellViewEvent.Close.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) musicPresenter.navigator).goTo(back);
                } else {
                    if (!Intrinsics.areEqual(paidInBitcoinCardUpsellViewEvent, PaidInBitcoinCardUpsellViewEvent.CardAction.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    PaidInBitcoinState paidInBitcoinState = (PaidInBitcoinState) ((MutableState) obj3).getValue();
                    RealPaidInBitcoinNavigator realPaidInBitcoinNavigator = (RealPaidInBitcoinNavigator) musicPresenter.args;
                    int ordinal = paidInBitcoinState.cardState.ordinal();
                    if (ordinal == 0 || ordinal == 1) {
                        realPaidInBitcoinNavigator.analytics.track(new CryptoAllocatePayrollBeginRequestCashCard(), null);
                        RealRouter realRouter = realPaidInBitcoinNavigator.router;
                        ClientRoute.ViewCashCardStylePicker viewCashCardStylePicker = new ClientRoute.ViewCashCardStylePicker(ClientRoute.ViewCashCardStylePicker.spec, ClientRoute.ViewCashCardStylePicker.deepLinkSpecs, null);
                        RoutingParams routingParams = new RoutingParams(null, null, new BitcoinHome(null, null, null, null, 15), null, null, null, 503);
                        realRouter.getClass();
                        realRouter.clientRouteRouter.route(viewCashCardStylePicker, routingParams);
                    } else if (ordinal == 2 || ordinal == 3) {
                        realPaidInBitcoinNavigator.analytics.track(new CryptoAllocatePayrollBeginActivateCashCard(), null);
                        realPaidInBitcoinNavigator.navigator.goTo(new WalletHomeScreen(7, (Integer) null, (String) null));
                    }
                }
                return Unit.INSTANCE;
            case 7:
                ?? r13 = (MutableState) obj3;
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                BitcoinPerformanceDetailsViewEvent bitcoinPerformanceDetailsViewEvent = (BitcoinPerformanceDetailsViewEvent) obj;
                if (Intrinsics.areEqual(bitcoinPerformanceDetailsViewEvent, BitcoinPerformanceDetailsViewEvent.BackClicked.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) disclosurePresenter.navigator).goTo(back);
                } else if (bitcoinPerformanceDetailsViewEvent instanceof BitcoinPerformanceDetailsViewEvent.InfoItemClicked) {
                    Analytics analytics3 = (Analytics) disclosurePresenter.analytics;
                    BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem bitcoinPerformanceDetailsSectionInfoItem = ((BitcoinPerformanceDetailsViewEvent.InfoItemClicked) bitcoinPerformanceDetailsViewEvent).item;
                    BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem.Type type2 = bitcoinPerformanceDetailsSectionInfoItem.f1058type;
                    if (type2 instanceof BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem.Type.AcquisitionType) {
                        int ordinal2 = ((BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem.Type.AcquisitionType) type2).f1059type.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 == 1) {
                                performanceDetailsInfoItemType = CryptoInteractPerformanceDetailsInfoItem.PerformanceDetailsInfoItemType.PURCHASES;
                            } else {
                                if (ordinal2 != 2 && ordinal2 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                performanceDetailsInfoItemType = CryptoInteractPerformanceDetailsInfoItem.PerformanceDetailsInfoItemType.DEPOSITS;
                            }
                            analytics3.track(new CryptoInteractPerformanceDetailsInfoItem(performanceDetailsInfoItemType), null);
                            r13.setValue(bitcoinPerformanceDetailsSectionInfoItem);
                        }
                        performanceDetailsInfoItemType = null;
                        analytics3.track(new CryptoInteractPerformanceDetailsInfoItem(performanceDetailsInfoItemType), null);
                        r13.setValue(bitcoinPerformanceDetailsSectionInfoItem);
                    } else if (type2 instanceof BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem.Type.AllTimeType) {
                        int ordinal3 = ((BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem.Type.AllTimeType) type2).f1060type.ordinal();
                        if (ordinal3 != 0) {
                            if (ordinal3 == 1) {
                                performanceDetailsInfoItemType = CryptoInteractPerformanceDetailsInfoItem.PerformanceDetailsInfoItemType.CURRENT_VALUE;
                            } else if (ordinal3 == 2) {
                                performanceDetailsInfoItemType = CryptoInteractPerformanceDetailsInfoItem.PerformanceDetailsInfoItemType.ALL_TIME_RETURNS;
                            } else {
                                if (ordinal3 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                performanceDetailsInfoItemType = CryptoInteractPerformanceDetailsInfoItem.PerformanceDetailsInfoItemType.ALL_TIME_RETURNS_PERCENT;
                            }
                            analytics3.track(new CryptoInteractPerformanceDetailsInfoItem(performanceDetailsInfoItemType), null);
                            r13.setValue(bitcoinPerformanceDetailsSectionInfoItem);
                        }
                        performanceDetailsInfoItemType = null;
                        analytics3.track(new CryptoInteractPerformanceDetailsInfoItem(performanceDetailsInfoItemType), null);
                        r13.setValue(bitcoinPerformanceDetailsSectionInfoItem);
                    } else {
                        if (type2 instanceof BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem.Type.DispositionType) {
                            int ordinal4 = ((BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionInfoItem.Type.DispositionType) type2).f1061type.ordinal();
                            if (ordinal4 != 0) {
                                if (ordinal4 == 1) {
                                    performanceDetailsInfoItemType = CryptoInteractPerformanceDetailsInfoItem.PerformanceDetailsInfoItemType.SALES;
                                } else if (ordinal4 == 2 || ordinal4 == 3) {
                                    performanceDetailsInfoItemType = CryptoInteractPerformanceDetailsInfoItem.PerformanceDetailsInfoItemType.WITHDRAWALS;
                                } else if (ordinal4 != 4) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                analytics3.track(new CryptoInteractPerformanceDetailsInfoItem(performanceDetailsInfoItemType), null);
                                r13.setValue(bitcoinPerformanceDetailsSectionInfoItem);
                            }
                        } else if (type2 != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        performanceDetailsInfoItemType = null;
                        analytics3.track(new CryptoInteractPerformanceDetailsInfoItem(performanceDetailsInfoItemType), null);
                        r13.setValue(bitcoinPerformanceDetailsSectionInfoItem);
                    }
                } else if (bitcoinPerformanceDetailsViewEvent instanceof BitcoinPerformanceDetailsViewEvent.UrlClicked) {
                    ((IntentLauncher) disclosurePresenter.launcher).launchUrlInInternalBrowser(((BitcoinPerformanceDetailsViewEvent.UrlClicked) bitcoinPerformanceDetailsViewEvent).url);
                } else {
                    if (!Intrinsics.areEqual(bitcoinPerformanceDetailsViewEvent, BitcoinPerformanceDetailsViewEvent.InfoBottomSheetClosed.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    r13.setValue(null);
                }
                return Unit.INSTANCE;
            case 8:
                CardStudioPresenter cardStudioPresenter2 = (CardStudioPresenter) obj2;
                ?? r0 = (BetterNavigator.ScreenNavigator) cardStudioPresenter2.navigator;
                StablecoinDepositOptionsViewEvent stablecoinDepositOptionsViewEvent = (StablecoinDepositOptionsViewEvent) obj;
                if (!Intrinsics.areEqual(stablecoinDepositOptionsViewEvent, StablecoinDepositOptionsViewEvent.CloseClicked.INSTANCE)) {
                    if (!(stablecoinDepositOptionsViewEvent instanceof StablecoinDepositOptionsViewEvent.NetworkSelected)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    for (StablecoinDepositOption stablecoinDepositOption : (List) ((MutableState) obj3).getValue()) {
                        if (Intrinsics.areEqual(stablecoinDepositOption.network, ((StablecoinDepositOptionsViewEvent.NetworkSelected) stablecoinDepositOptionsViewEvent).network)) {
                            Analytics analytics4 = (Analytics) cardStudioPresenter2.analytics;
                            StablecoinNetwork stablecoinNetwork = stablecoinDepositOption.network;
                            analytics4.track(new CryptoStablecoinDepositSelectNetwork(stablecoinNetwork.chain, stablecoinNetwork.asset), null);
                            AskedQuestion askedQuestion = ((StablecoinDepositOptionsScreen) cardStudioPresenter2.cardStudioQueries).askedQuestion;
                            if (askedQuestion != null) {
                                r0.giveAnswer(askedQuestion, stablecoinDepositOption);
                            } else {
                                r0.goTo(new StablecoinDepositScreen(stablecoinDepositOption));
                            }
                        }
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                    return null;
                }
                r0.goTo(back);
                return Unit.INSTANCE;
            case 9:
                MutableState mutableState = (MutableState) obj3;
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj2;
                Analytics analytics5 = (Analytics) localEditorialPresenter.launcher;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
                StablecoinDepositViewEvent stablecoinDepositViewEvent = (StablecoinDepositViewEvent) obj;
                if (Intrinsics.areEqual(stablecoinDepositViewEvent, StablecoinDepositViewEvent.BackPressed.INSTANCE)) {
                    screenNavigator4.goTo(back);
                } else if (Intrinsics.areEqual(stablecoinDepositViewEvent, StablecoinDepositViewEvent.HelpClicked.INSTANCE)) {
                    screenNavigator4.goTo(new StablecoinOnboardingScreen(StablecoinOnboardingType.RECEIVE, true));
                } else if (Intrinsics.areEqual(stablecoinDepositViewEvent, StablecoinDepositViewEvent.CopyAddress.INSTANCE)) {
                    StablecoinDepositOption stablecoinDepositOption2 = (StablecoinDepositOption) mutableState.getValue();
                    StablecoinNetwork stablecoinNetwork2 = stablecoinDepositOption2.network;
                    analytics5.track(new CryptoStablecoinDepositCopyDestinationAddress(stablecoinNetwork2.chain, stablecoinNetwork2.asset), null);
                    RealClipboardManager realClipboardManager = (RealClipboardManager) localEditorialPresenter.screen;
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) localEditorialPresenter.stringManager;
                    StablecoinNetwork stablecoinNetwork3 = stablecoinDepositOption2.network;
                    String str3 = stablecoinNetwork3.chainName;
                    str3.getClass();
                    Resources resources = androidStringManager2.resources;
                    resources.getClass();
                    String format2 = new MessageFormat(resources.getString(R.string.stablecoin_deposit_address_copy_label)).format(new Object[]{str3});
                    format2.getClass();
                    realClipboardManager.copy(format2, stablecoinNetwork3.address);
                } else if (Intrinsics.areEqual(stablecoinDepositViewEvent, StablecoinDepositViewEvent.Share.INSTANCE)) {
                    StablecoinDepositOption stablecoinDepositOption3 = (StablecoinDepositOption) mutableState.getValue();
                    StablecoinNetwork stablecoinNetwork4 = stablecoinDepositOption3.network;
                    analytics5.track(new CryptoStablecoinDepositShareDestinationAddress(stablecoinNetwork4.chain, stablecoinNetwork4.asset), null);
                    ((IntentLauncher) localEditorialPresenter.clock).shareText(stablecoinDepositOption3.network.address, null, null);
                } else if (!Intrinsics.areEqual(stablecoinDepositViewEvent, StablecoinDepositViewEvent.TryAgainClicked.INSTANCE)) {
                    if (!Intrinsics.areEqual(stablecoinDepositViewEvent, StablecoinDepositViewEvent.ChangeNetwork.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator4.askQuestion(ChangeNetworkQuestion.INSTANCE, StablecoinDepositPresenter$models$3$1.INSTANCE);
                }
                return Unit.INSTANCE;
            case 10:
                DisclosurePresenter disclosurePresenter2 = (DisclosurePresenter) obj3;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj2;
                StablecoinOnboardingViewEvent stablecoinOnboardingViewEvent = (StablecoinOnboardingViewEvent) obj;
                if (Intrinsics.areEqual(stablecoinOnboardingViewEvent, StablecoinOnboardingViewEvent.BackClicked.INSTANCE) || Intrinsics.areEqual(stablecoinOnboardingViewEvent, StablecoinOnboardingViewEvent.CallToActionClicked.INSTANCE)) {
                    JobKt.launch$default(coroutineScope3, null, null, new StablecoinOnboardingPresenter$models$1$1(disclosurePresenter2, r143 == true ? 1 : 0, i7), 3);
                } else {
                    if (!(stablecoinOnboardingViewEvent instanceof StablecoinOnboardingViewEvent.ViewDisclosure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((IntentLauncher) disclosurePresenter2.launcher).launchUrlInInternalBrowser(((StablecoinOnboardingViewEvent.ViewDisclosure) stablecoinOnboardingViewEvent).url);
                }
                return Unit.INSTANCE;
            case 11:
                CardStudioPresenter cardStudioPresenter3 = (CardStudioPresenter) obj3;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj2;
                BitcoinInstrumentRecommendationViewEvent bitcoinInstrumentRecommendationViewEvent = (BitcoinInstrumentRecommendationViewEvent) obj;
                if (Intrinsics.areEqual(bitcoinInstrumentRecommendationViewEvent, BitcoinInstrumentRecommendationViewEvent.CloseClicked.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) cardStudioPresenter3.navigator).goTo(((BitcoinInstrumentRecommendationScreen) cardStudioPresenter3.cardStudioQueries).exitScreen);
                } else if (Intrinsics.areEqual(bitcoinInstrumentRecommendationViewEvent, BitcoinInstrumentRecommendationViewEvent.PrimaryButtonClicked.INSTANCE)) {
                    JobKt.launch$default(coroutineScope4, null, null, new BitcoinInstrumentRecommendationPresenter$models$2$1(cardStudioPresenter3, r145 == true ? 1 : 0, i7), 3);
                } else {
                    if (!Intrinsics.areEqual(bitcoinInstrumentRecommendationViewEvent, BitcoinInstrumentRecommendationViewEvent.SecondaryButtonClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope4, null, null, new BitcoinInstrumentRecommendationPresenter$models$2$1(cardStudioPresenter3, r144 == true ? 1 : 0, i8), 3);
                }
                return Unit.INSTANCE;
            case 12:
                if (continuation instanceof BitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1) {
                    bitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1 = (BitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1) continuation;
                    int i9 = bitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1.label;
                    if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1.label = i9 - PKIFailureInfo.systemUnavail;
                        Object obj4 = bitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = bitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            FlowCollector flowCollector = (FlowCollector) obj2;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            BitcoinTransferTitleSubtitleProvider bitcoinTransferTitleSubtitleProvider = (BitcoinTransferTitleSubtitleProvider) obj3;
                            AndroidStringManager androidStringManager3 = bitcoinTransferTitleSubtitleProvider.stringManager;
                            if (booleanValue) {
                                str = androidStringManager3.get(R.string.bitcoin_presenters_convert_btc_title);
                            } else {
                                BitcoinTransferScreen bitcoinTransferScreen = bitcoinTransferTitleSubtitleProvider.args;
                                boolean z = bitcoinTransferScreen.isBuy;
                                BitcoinTransferScreen.OrderType orderType = bitcoinTransferScreen.orderType;
                                BitcoinTransferScreen.OrderType.Standard standard = BitcoinTransferScreen.OrderType.Standard.INSTANCE;
                                if (z) {
                                    if (orderType instanceof BitcoinTransferScreen.OrderType.CustomOrder) {
                                        str = androidStringManager3.get(R.string.investing_transfer_bitcoin_purchase_amount_custom);
                                    } else {
                                        if (!Intrinsics.areEqual(orderType, standard)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        str = androidStringManager3.get(R.string.profile_transfer_bitcoin_purchase_title);
                                    }
                                } else if (orderType instanceof BitcoinTransferScreen.OrderType.CustomOrder) {
                                    str = androidStringManager3.get(R.string.investing_transfer_bitcoin_sell_amount_custom);
                                } else {
                                    if (!Intrinsics.areEqual(orderType, standard)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    str = androidStringManager3.get(R.string.profile_transfer_bitcoin_sell_title);
                                }
                            }
                            bitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(str, bitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj4);
                        }
                        return Unit.INSTANCE;
                    }
                }
                bitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1 = new BitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1(this, continuation);
                Object obj42 = bitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitcoinTransferTitleSubtitleProvider$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            case 13:
                BlockerActionConfirmDialogPresenter blockerActionConfirmDialogPresenter = (BlockerActionConfirmDialogPresenter) obj3;
                CoroutineScope coroutineScope5 = (CoroutineScope) obj2;
                BlockerActionConfirmDialogViewEvent blockerActionConfirmDialogViewEvent = (BlockerActionConfirmDialogViewEvent) obj;
                if (Intrinsics.areEqual(blockerActionConfirmDialogViewEvent, BlockerActionConfirmDialogViewEvent.Cancel.INSTANCE)) {
                    blockerActionConfirmDialogPresenter.navigator.goTo(new Finish(BlockerActionConfirmDialogResult$Negative.INSTANCE));
                } else {
                    if (!Intrinsics.areEqual(blockerActionConfirmDialogViewEvent, BlockerActionConfirmDialogViewEvent.Confirm.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope5, null, null, new BlockerActionConfirmDialogPresenter$models$1$1(blockerActionConfirmDialogPresenter, null), 3);
                }
                return Unit.INSTANCE;
            case 14:
                TransferManager.TransferAction transferAction = (TransferManager.TransferAction) obj;
                LocalPosCheckInPresenter localPosCheckInPresenter2 = (LocalPosCheckInPresenter) obj2;
                CoroutineScope coroutineScope6 = (CoroutineScope) obj3;
                BlockersScreens.BalanceTransferLoading balanceTransferLoading = (BlockersScreens.BalanceTransferLoading) localPosCheckInPresenter2.cameraPermissions;
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter2.navigator;
                if ((transferAction instanceof TransferManager.TransferAction.HandleBlocker) || (transferAction instanceof TransferManager.TransferAction.HandleResult)) {
                    screenNavigator5.goTo(((BlockersDataNavigator) localPosCheckInPresenter2.launcher).getNext(balanceTransferLoading, transferAction.getBlockersData()));
                } else if (transferAction instanceof TransferManager.TransferAction.SendTransfer) {
                    JobKt.launch$default(coroutineScope6, null, null, new BalanceTransferLoadingPresenter$models$1$1$2(localPosCheckInPresenter2, r146 == true ? 1 : 0, i8), 3);
                } else {
                    if (!(transferAction instanceof TransferManager.TransferAction.HandleError)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator5.goTo(((RealFlowStarter) ((FlowStarter) localPosCheckInPresenter2.store)).startOfflineErrorTransfersFlow(((TransferManager.TransferAction.HandleError) transferAction).errorResult, balanceTransferLoading.blockersData.exitScreen));
                }
                return Unit.INSTANCE;
            case 15:
                LocalPosCheckInPresenter localPosCheckInPresenter3 = (LocalPosCheckInPresenter) obj3;
                CoroutineScope coroutineScope7 = (CoroutineScope) obj2;
                ContactsPermissionExplanationSheetEvent contactsPermissionExplanationSheetEvent = (ContactsPermissionExplanationSheetEvent) obj;
                if (Intrinsics.areEqual(contactsPermissionExplanationSheetEvent, ContactsPermissionExplanationSheetEvent.OnCloseClick.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) localPosCheckInPresenter3.navigator).goTo(back);
                } else {
                    if (!Intrinsics.areEqual(contactsPermissionExplanationSheetEvent, ContactsPermissionExplanationSheetEvent.OnPrivacyNoticeClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope7, null, null, new ContactsPermissionExplanationSheetPresenter$models$1$1(localPosCheckInPresenter3, r147 == true ? 1 : 0, i7), 3);
                }
                return Unit.INSTANCE;
            case 16:
                InputCardInfoPresenter inputCardInfoPresenter = (InputCardInfoPresenter) obj3;
                AndroidStringManager androidStringManager4 = inputCardInfoPresenter.stringManager;
                BlockersScreens.InputCardInfoScreen inputCardInfoScreen = inputCardInfoPresenter.args;
                if (continuation instanceof InputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1) {
                    inputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1 = (InputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1) continuation;
                    int i10 = inputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1.label;
                    if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                        inputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1.label = i10 - PKIFailureInfo.systemUnavail;
                        Object obj5 = inputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = inputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            FlowCollector flowCollector2 = (FlowCollector) obj2;
                            long longValue = ((Number) obj).longValue();
                            if (longValue > 0) {
                                boolean z2 = inputCardInfoScreen.sendingToBusinessWithCredit;
                                FormattedResources formattedResources = FormattedResources.INSTANCE;
                                if (z2) {
                                    cardStudioViewKt$ThemedCard$1$4$1 = new CardStudioViewKt$ThemedCard$1$4$1(1, formattedResources, FormattedResources.class, "profile_link_card_credit_card_business_warning", "profile_link_card_credit_card_business_warning(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 8);
                                } else {
                                    if (z2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    cardStudioViewKt$ThemedCard$1$4$1 = new CardStudioViewKt$ThemedCard$1$4$1(1, formattedResources, FormattedResources.class, "profile_link_card_credit_card_warning", "profile_link_card_credit_card_warning(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 9);
                                }
                                String format3 = Bps.DISPLAY_FORMAT.format(Float.valueOf(longValue / 100.0f));
                                format3.getClass();
                                str2 = androidStringManager4.getString((FormattedResource) cardStudioViewKt$ThemedCard$1$4$1.invoke(format3));
                            } else {
                                str2 = androidStringManager4.get(inputCardInfoScreen.sendingToBusinessWithCredit ? R.string.profile_link_card_credit_card_business_warning_no_fee : R.string.profile_link_card_credit_card_warning_no_fee);
                            }
                            inputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1.label = 1;
                            if (flowCollector2.emit(str2, inputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj5);
                        }
                        return Unit.INSTANCE;
                    }
                }
                inputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1 = new InputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1(this, continuation);
                Object obj52 = inputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = inputCardInfoPresenter$models$lambda$0$$inlined$map$2$2$1.label;
                if (i2 != 0) {
                }
                return Unit.INSTANCE;
            case 17:
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj3;
                BlockersData blockersData = (BlockersData) poolsListPresenter.moneyFormatter;
                ?? r2 = (BlockersDataNavigator) poolsListPresenter.sessionManager;
                BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) poolsListPresenter.navigator;
                BlockersScreens.InviteFriendsScreen inviteFriendsScreen = (BlockersScreens.InviteFriendsScreen) poolsListPresenter.dateFormatManager;
                CoroutineScope coroutineScope8 = (CoroutineScope) obj2;
                InviteFriendsViewEvent inviteFriendsViewEvent = (InviteFriendsViewEvent) obj;
                if (Intrinsics.areEqual(inviteFriendsViewEvent, InviteFriendsViewEvent.CloseClick.INSTANCE)) {
                    screenNavigator6.goTo(r2.getSkip(inviteFriendsScreen, blockersData));
                } else if (Intrinsics.areEqual(inviteFriendsViewEvent, InviteFriendsViewEvent.GoBack.INSTANCE)) {
                    ?? back2 = r2.getBack(inviteFriendsScreen, inviteFriendsScreen.blockersData);
                    if (back2 != 0) {
                        back = back2;
                    }
                    screenNavigator6.goTo(back);
                } else if (Intrinsics.areEqual(inviteFriendsViewEvent, InviteFriendsViewEvent.InviteClick.INSTANCE)) {
                    JobKt.launch$default(coroutineScope8, null, null, new InviteFriendsPresenter$models$2$1(poolsListPresenter, r148 == true ? 1 : 0, i7), 3);
                } else if (Intrinsics.areEqual(inviteFriendsViewEvent, InviteFriendsViewEvent.SkipClick.INSTANCE)) {
                    BlockersData blockersData2 = inviteFriendsScreen.blockersData;
                    if (blockersData2.flow != BlockersData.Flow.ONBOARDING) {
                        screenNavigator6.goTo(new BlockersScreens.InviteContactsScreen(BlockersData.copy$default(blockersData2, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -1073741825, 65535), false, inviteFriendsScreen.inviteFriendsData, inviteFriendsScreen.inviteFriendsOpportunityScreen, inviteFriendsScreen.inviteFriendsScreen, inviteFriendsScreen.recommendedContactsHashedAliasIds, inviteFriendsScreen.plasmaOrigin));
                    } else {
                        screenNavigator6.goTo(r2.getSkip(inviteFriendsScreen, blockersData));
                    }
                } else {
                    if (!Intrinsics.areEqual(inviteFriendsViewEvent, InviteFriendsViewEvent.HowWeUseContactsClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Analytics analytics6 = (Analytics) poolsListPresenter.analytics;
                    BlockersScreens.StartFlowEntryPointScreen.Origin origin = inviteFriendsScreen.plasmaOrigin;
                    if (origin != null) {
                        int ordinal5 = origin.ordinal();
                        if (ordinal5 == 0) {
                            contactInviteEntryPoint = ContactInviteEntryPoint.PROFILE;
                        } else if (ordinal5 == 1) {
                            contactInviteEntryPoint = ContactInviteEntryPoint.ACTIVITY;
                        } else if (ordinal5 == 2) {
                            contactInviteEntryPoint = ContactInviteEntryPoint.ONBOARDING;
                        } else if (ordinal5 == 3) {
                            contactInviteEntryPoint = ContactInviteEntryPoint.DISCOVER;
                        } else if (ordinal5 == 4) {
                            contactInviteEntryPoint = ContactInviteEntryPoint.PAYMENT;
                        }
                        analytics6.track(new ContactInviteOpenContactPermissionExplanation(contactInviteEntryPoint), null);
                        screenNavigator6.goTo(new BlockersScreens.ContactsPermissionExplanationSheet(inviteFriendsScreen.blockersData));
                    }
                    contactInviteEntryPoint = null;
                    analytics6.track(new ContactInviteOpenContactPermissionExplanation(contactInviteEntryPoint), null);
                    screenNavigator6.goTo(new BlockersScreens.ContactsPermissionExplanationSheet(inviteFriendsScreen.blockersData));
                }
                return Unit.INSTANCE;
            case 18:
                PasscodeGenericGatedEndpointTypeTransformer passcodeGenericGatedEndpointTypeTransformer = (PasscodeGenericGatedEndpointTypeTransformer) obj3;
                BlockersScreens.PasscodeScreen passcodeScreen = passcodeGenericGatedEndpointTypeTransformer.args;
                if (continuation instanceof PasscodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                    passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (PasscodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                    int i11 = passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                        passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i11 - PKIFailureInfo.systemUnavail;
                        Object obj6 = passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            FlowCollector flowCollector3 = (FlowCollector) obj2;
                            String str4 = (String) obj;
                            if (str4 != null) {
                                withFingerprint = new PasscodeViewEvent.VerifyPasscode.WithFingerprint(str4);
                            } else {
                                Duration.Companion companion = Duration.Companion;
                                passcodeGenericGatedEndpointTypeTransformer.startPasscodeInput = new Duration(DurationKt.toDuration(passcodeGenericGatedEndpointTypeTransformer.clock.elapsedRealtime(), DurationUnit.MILLISECONDS));
                                Analytics analytics7 = passcodeGenericGatedEndpointTypeTransformer.analytics;
                                ClientScenario clientScenario = passcodeScreen.blockersData.clientScenario;
                                analytics7.track(new AccountAuthenticatePasscodePrompt(clientScenario != null ? clientScenario.name() : null, passcodeScreen.blockersData.flowToken), null);
                            }
                            if (withFingerprint != null) {
                                passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector3.emit(withFingerprint, passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                            }
                        } else {
                            if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj6);
                        }
                        return Unit.INSTANCE;
                    }
                }
                passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new PasscodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj62 = passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = passcodeGenericGatedEndpointTypeTransformer$transform$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i3 != 0) {
                }
                return Unit.INSTANCE;
            case 19:
                ReferralCodePresenter.InternalUpdate internalUpdate = (ReferralCodePresenter.InternalUpdate) obj;
                MutableState mutableState2 = (MutableState) obj3;
                ReferralCodePresenter referralCodePresenter = (ReferralCodePresenter) obj2;
                ReferralCodeViewModel referralCodeViewModel = (ReferralCodeViewModel) mutableState2.getValue();
                if (internalUpdate instanceof ReferralCodePresenter.InternalUpdate.RewardCodeCheckInProgress) {
                    copy$default = ReferralCodeViewModel.copy$default(referralCodeViewModel, false, true, false, false, null, false, EnumC0170g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE);
                } else if (internalUpdate instanceof ReferralCodePresenter.InternalUpdate.RewardCodeCheckValid) {
                    copy$default = ReferralCodeViewModel.copy$default(referralCodeViewModel, true, true, false, false, ((ReferralCodePresenter.InternalUpdate.RewardCodeCheckValid) internalUpdate).header, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
                } else if (internalUpdate instanceof ReferralCodePresenter.InternalUpdate.RewardCodeCheckInvalid) {
                    copy$default = ReferralCodeViewModel.copy$default(referralCodeViewModel, false, true, false, false, referralCodePresenter.promptHeader, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
                } else if (internalUpdate instanceof ReferralCodePresenter.InternalUpdate.RewardCodeCheckRequestErrored) {
                    copy$default = ReferralCodeViewModel.copy$default(referralCodeViewModel, true, true, false, false, null, false, EnumC0170g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE);
                } else if (internalUpdate instanceof ReferralCodePresenter.InternalUpdate.RewardCodeApplyInProgress) {
                    copy$default = ReferralCodeViewModel.copy$default(referralCodeViewModel, false, false, true, false, null, false, EnumC0170g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE);
                } else if (internalUpdate instanceof ReferralCodePresenter.InternalUpdate.RewardCodeApplySucceeded) {
                    copy$default = ReferralCodeViewModel.copy$default(referralCodeViewModel, false, false, false, false, null, false, EnumC0170g.SDK_ASSET_ICON_CLIPBOARD_VALUE);
                } else if (internalUpdate instanceof ReferralCodePresenter.InternalUpdate.RewardCodeApplyFailed) {
                    Header header = ((ReferralCodePresenter.InternalUpdate.RewardCodeApplyFailed) internalUpdate).header;
                    if (header == null) {
                        header = referralCodePresenter.promptHeader;
                    }
                    copy$default = ReferralCodeViewModel.copy$default(referralCodeViewModel, false, true, false, true, header, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE);
                } else {
                    if (!(internalUpdate instanceof ReferralCodePresenter.InternalUpdate.RewardCodeApplyErrored)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    copy$default = ReferralCodeViewModel.copy$default(referralCodeViewModel, true, true, false, false, null, false, EnumC0170g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE);
                }
                mutableState2.setValue(ReferralCodeViewModel.copy$default(copy$default, false, false, false, false, null, !Intrinsics.areEqual(r14.header, referralCodeViewModel.header), EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
                return Unit.INSTANCE;
            case 20:
                SelectionPresenter selectionPresenter = (SelectionPresenter) obj3;
                BlockersScreens.SelectionScreen selectionScreen = selectionPresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator7 = selectionPresenter.navigator;
                CoroutineScope coroutineScope9 = (CoroutineScope) obj2;
                SelectionViewEvent selectionViewEvent = (SelectionViewEvent) obj;
                if (selectionViewEvent instanceof SelectionViewEvent.SelectOption) {
                    JobKt.launch$default(coroutineScope9, null, null, new SelectionPresenter$models$1$1(selectionPresenter, selectionViewEvent, r1411 == true ? 1 : 0, i7), 3);
                } else if (selectionViewEvent instanceof SelectionViewEvent.LinkClick) {
                    selectionPresenter.launcher.launchUrlInInternalBrowser(((SelectionViewEvent.LinkClick) selectionViewEvent).url);
                } else if (selectionViewEvent instanceof SelectionViewEvent.HelpClick) {
                    screenNavigator7.goTo(new BlockersScreens.HelpOptions.Impl(((BlockersScreens.SelectionFullScreen) selectionScreen).blockersData, ((SelectionViewEvent.HelpClick) selectionViewEvent).helpItems));
                } else if (selectionViewEvent instanceof SelectionViewEvent.HelpItemClick) {
                    JobKt.launch$default(coroutineScope9, null, null, new SelectionPresenter$models$1$1(selectionPresenter, selectionViewEvent, r1410 == true ? 1 : 0, i8), 3);
                } else if (selectionViewEvent instanceof SelectionViewEvent.GoBack) {
                    ?? back3 = selectionPresenter.blockersNavigator.getBack(selectionScreen, ((BlockersScreens.SelectionFullScreen) selectionScreen).blockersData);
                    if (back3 != 0) {
                        back = back3;
                    }
                    screenNavigator7.goTo(back);
                } else {
                    if (!(selectionViewEvent instanceof SelectionViewEvent.BlockerActionClick)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope9, null, null, new SelectionPresenter$models$1$1(selectionPresenter, selectionViewEvent, r149 == true ? 1 : 0, i6), 3);
                }
                return Unit.INSTANCE;
            case 21:
                return emit$com$squareup$cash$blockers$presenters$SetAddressPresenter$models$2$1$invokeSuspend$$inlined$map$1$2(obj, continuation);
            case 22:
                Object access$verify = VerifyAliasPresenter.access$verify((VerifyAliasPresenter) obj2, (String) obj, (CashCardKt$$ExternalSyntheticLambda0) obj3, continuation);
                return access$verify == CoroutineSingletons.COROUTINE_SUSPENDED ? access$verify : Unit.INSTANCE;
            case 23:
                return emit$com$squareup$cash$blockers$presenters$VerifyContactsPresenter$models$2$1$3(obj, continuation);
            case 24:
                return emit$com$squareup$cash$blockers$presenters$VerifyContactsPresenter$models$2$1$invokeSuspend$$inlined$map$1$2(obj, continuation);
            case 25:
                if (continuation instanceof FileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1) {
                    fileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1 = (FileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i12 = fileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                        fileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                        Object obj7 = fileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = fileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            FlowCollector flowCollector4 = (FlowCollector) obj2;
                            KProperty[] kPropertyArr = FileBlockerView.$$delegatedProperties;
                            if (((FileBlockerView) obj3).getScannerView().isStarted()) {
                                fileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector4.emit(obj, fileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                            }
                        } else {
                            if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj7);
                        }
                        return Unit.INSTANCE;
                    }
                }
                fileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1 = new FileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                Object obj72 = fileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = fileBlockerView$6$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i4 != 0) {
                }
                return Unit.INSTANCE;
            case 26:
                return emit$com$squareup$cash$blockers$web$presenters$WebViewBlockerPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 27:
                return emit$com$squareup$cash$borrow$backend$RealBorrowDataManager$borrowLimitHub$$inlined$mapNotNull$1$2(obj, continuation);
            case 28:
                return emit$com$squareup$cash$borrow$backend$RealBorrowGlobalEntryPointGate$hasValidAddress$lambda$0$$inlined$map$1$2(obj, continuation);
            default:
                MutableState mutableState3 = (MutableState) obj3;
                DisclosurePresenter disclosurePresenter3 = (DisclosurePresenter) obj2;
                AndroidClock androidClock = (AndroidClock) disclosurePresenter3.blockersNavigator;
                BetterNavigator.ScreenNavigator screenNavigator8 = (BetterNavigator.ScreenNavigator) disclosurePresenter3.navigator;
                BorrowHomeOverlayEvent borrowHomeOverlayEvent = (BorrowHomeOverlayEvent) obj;
                if (borrowHomeOverlayEvent instanceof BorrowHomeOverlayEvent.BulletinInfoOverlayEvent) {
                    BorrowHomeOverlayEvent.BulletinInfoOverlayEvent bulletinInfoOverlayEvent = (BorrowHomeOverlayEvent.BulletinInfoOverlayEvent) borrowHomeOverlayEvent;
                    if (bulletinInfoOverlayEvent instanceof BorrowHomeOverlayEvent.BulletinInfoOverlayEvent.Dismiss) {
                        screenNavigator8.goTo(back);
                    } else if (bulletinInfoOverlayEvent instanceof BorrowHomeOverlayEvent.BulletinInfoOverlayEvent.TapAction) {
                        Analytics analytics8 = (Analytics) disclosurePresenter3.analytics;
                        BorrowHomeOverlayEvent.BulletinInfoOverlayEvent.TapAction tapAction = (BorrowHomeOverlayEvent.BulletinInfoOverlayEvent.TapAction) borrowHomeOverlayEvent;
                        SheetButtonAction sheetButtonAction = tapAction.action;
                        String str5 = tapAction.analyticsId;
                        boolean z3 = sheetButtonAction instanceof SheetButtonAction.ActionUrl;
                        SheetButtonAction.ActionUrl actionUrl = z3 ? (SheetButtonAction.ActionUrl) sheetButtonAction : null;
                        analytics8.track(new BorrowAppletInteractTapBulletinSheetButton(str5, actionUrl != null ? actionUrl.url : null), null);
                        if (z3) {
                            DisclosurePresenter.access$routeActionUrl(disclosurePresenter3, ((SheetButtonAction.ActionUrl) sheetButtonAction).url);
                        } else {
                            if (!(sheetButtonAction instanceof SheetButtonAction.RepaymentSelection)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            TimeZone timeZone = androidClock.timeZone();
                            mutableState3.setValue(WindowInfoImpl.Companion.toSheet(((SheetButtonAction.RepaymentSelection) sheetButtonAction).data, timeZone, disclosurePresenter3.iconDateFormatter(timeZone), disclosurePresenter3.subtitleDateFormatter(timeZone)));
                        }
                    } else {
                        if (!(bulletinInfoOverlayEvent instanceof BorrowHomeOverlayEvent.BulletinInfoOverlayEvent.TapLink)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ((IntentLauncher) disclosurePresenter3.launcher).launchUrlInInternalBrowser(((BorrowHomeOverlayEvent.BulletinInfoOverlayEvent.TapLink) borrowHomeOverlayEvent).url);
                    }
                } else {
                    if (!(borrowHomeOverlayEvent instanceof BorrowHomeOverlayEvent.RepaymentSheetEvent)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BorrowHomeOverlayEvent.RepaymentSheetEvent repaymentSheetEvent = (BorrowHomeOverlayEvent.RepaymentSheetEvent) borrowHomeOverlayEvent;
                    if (repaymentSheetEvent instanceof BorrowHomeOverlayEvent.RepaymentSheetEvent.Dismiss) {
                        screenNavigator8.goTo(back);
                    } else if (repaymentSheetEvent instanceof BorrowHomeOverlayEvent.RepaymentSheetEvent.InitiateRepayment) {
                        SheetButtonAction sheetButtonAction2 = ((BorrowHomeOverlayEvent.RepaymentSheetEvent.InitiateRepayment) borrowHomeOverlayEvent).action;
                        if (sheetButtonAction2 instanceof SheetButtonAction.ActionUrl) {
                            DisclosurePresenter.access$routeActionUrl(disclosurePresenter3, ((SheetButtonAction.ActionUrl) sheetButtonAction2).url);
                        } else {
                            if (!(sheetButtonAction2 instanceof SheetButtonAction.RepaymentSelection)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            TimeZone timeZone2 = androidClock.timeZone();
                            mutableState3.setValue(WindowInfoImpl.Companion.toSheet(((SheetButtonAction.RepaymentSelection) sheetButtonAction2).data, timeZone2, disclosurePresenter3.iconDateFormatter(timeZone2), disclosurePresenter3.subtitleDateFormatter(timeZone2)));
                        }
                    } else {
                        if (!(repaymentSheetEvent instanceof BorrowHomeOverlayEvent.RepaymentSheetEvent.TapAction)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        DisclosurePresenter.access$routeActionUrl(disclosurePresenter3, ((BorrowHomeOverlayEvent.RepaymentSheetEvent.TapAction) borrowHomeOverlayEvent).route);
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PasscodeViewKt$Passcode$3$1$1$1$2(CoroutineScope coroutineScope, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.$contentModel = obj;
        this.$onEvent = obj2;
    }
}
