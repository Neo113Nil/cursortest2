package app.cash.molecule;

import android.content.Context;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.runtime.saveable.SaveableStateRegistryWrapper;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import androidx.room.TransactorKt;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.appmessages.TooltipAppMessageViewEvent;
import com.squareup.cash.appmessages.views.RealTooltipTargetLoadedCallbackRegistry;
import com.squareup.cash.appmessages.views.TooltipAppMessageView;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.data.LinkingFlowsData;
import com.squareup.cash.blockers.navigation.InstitutionLinkingNavigator;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.screens.InstrumentSelectionBockerExtKt;
import com.squareup.cash.card.onboarding.screens.DisclosureScreen;
import com.squareup.cash.cashapplite.screens.PasskeySignatureBlockerScreen;
import com.squareup.cash.checks.screens.CheckDepositAmountScreen;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.readers.RealSyncValueReader;
import com.squareup.cash.clientsync.readers.SyncValueSpec;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens;
import com.squareup.cash.data.blockers.InstrumentSelectionBlockerExtKt;
import com.squareup.cash.data.blockers.RealBlockersDescriptorNavigator;
import com.squareup.cash.data.blockers.RealBlockersDescriptorNavigator$asScreen$$inlined$getStartScreenForLinkingService$1$wm$InstitutionLinkingNavigator$WhenMappings;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.screens.AtmRetailerMapScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositMapScreen;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersInstrumentLinkProfileStripeEnabled;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$InstrumentLinkResolveSuspensionStripeEnabled;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$InstrumentLinkTransferFundsStripeEnabled;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$UnsupportedBlockerFatalError;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.fidesmo.screens.FidesmoProvisioningScreen;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.passkeys.screens.PasskeyUpsellScreen;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.transfers.screens.BalanceBasedAutoReloadConfirmationExtKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ActivityPickerBlocker;
import com.squareup.protos.franklin.api.AddMoneyBlocker;
import com.squareup.protos.franklin.api.AddressBlocker;
import com.squareup.protos.franklin.api.AliasBlocker;
import com.squareup.protos.franklin.api.AmountBlocker;
import com.squareup.protos.franklin.api.AtmPickerAmountBlocker;
import com.squareup.protos.franklin.api.AuthorizeDigitalWalletPaymentBlocker;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.Blockers;
import com.squareup.protos.franklin.api.CalendarBlocker;
import com.squareup.protos.franklin.api.CardBlocker;
import com.squareup.protos.franklin.api.CardCustomizationBlocker;
import com.squareup.protos.franklin.api.CardStatus;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.CashtagBlocker;
import com.squareup.protos.franklin.api.CheckDepositBlocker;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.ConfirmBlocker;
import com.squareup.protos.franklin.api.CreditFirstTimeBorrowBlocker;
import com.squareup.protos.franklin.api.CreditMultiStepLoadingBlocker;
import com.squareup.protos.franklin.api.DisclosureBlocker;
import com.squareup.protos.franklin.api.EmailVerificationBlocker;
import com.squareup.protos.franklin.api.FidesmoProvisioningBlocker;
import com.squareup.protos.franklin.api.FileBlocker;
import com.squareup.protos.franklin.api.FileCategory;
import com.squareup.protos.franklin.api.FilesetUploadBlocker;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.GooglePayProvisioningBlocker;
import com.squareup.protos.franklin.api.GpsLocationConsentBlocker;
import com.squareup.protos.franklin.api.IdentityVerificationBlocker;
import com.squareup.protos.franklin.api.InstrumentVerificationBlocker;
import com.squareup.protos.franklin.api.InviteFriendsBlocker;
import com.squareup.protos.franklin.api.InviteFriendsOpportunityScreen;
import com.squareup.protos.franklin.api.InviteFriendsScreen;
import com.squareup.protos.franklin.api.ManagedAccountLoginQrCodeProviderBlocker;
import com.squareup.protos.franklin.api.MoneyTabBookletBlocker;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import com.squareup.protos.franklin.api.PasscodeCreationBlocker;
import com.squareup.protos.franklin.api.PasscodeVerificationBlocker;
import com.squareup.protos.franklin.api.PasskeySignatureBlocker;
import com.squareup.protos.franklin.api.PasskeyUpsellBlocker;
import com.squareup.protos.franklin.api.PasswordCreationBlocker;
import com.squareup.protos.franklin.api.PasswordVerificationBlocker;
import com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker;
import com.squareup.protos.franklin.api.PaymentDeviceCustomizationBlocker;
import com.squareup.protos.franklin.api.PaymentPlanDataBlocker;
import com.squareup.protos.franklin.api.PhonePlanESimCheckBlocker;
import com.squareup.protos.franklin.api.PhonePlanNewLineLoadingBlocker;
import com.squareup.protos.franklin.api.PhoneVerificationBlocker;
import com.squareup.protos.franklin.api.PrepurchaseCashCardFAQBlocker;
import com.squareup.protos.franklin.api.QrCodeBlocker;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import com.squareup.protos.franklin.api.RequestPushNotificationsBlocker;
import com.squareup.protos.franklin.api.RetailerMapBlocker;
import com.squareup.protos.franklin.api.RewardCodeBlocker;
import com.squareup.protos.franklin.api.ScheduledTransactionBlocker;
import com.squareup.protos.franklin.api.ScientificNumber;
import com.squareup.protos.franklin.api.SelectAllowlistCustomerBlocker;
import com.squareup.protos.franklin.api.SelectDependentsBlocker;
import com.squareup.protos.franklin.api.SelectPaymentPlanBlocker;
import com.squareup.protos.franklin.api.SelectSponsorsBlocker;
import com.squareup.protos.franklin.api.SelectionBlocker;
import com.squareup.protos.franklin.api.SetPaycheckAllocationAmountBlocker;
import com.squareup.protos.franklin.api.SetPaycheckMultiAllocationBlocker;
import com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker;
import com.squareup.protos.franklin.api.StatusInterstitialBlocker;
import com.squareup.protos.franklin.api.TagConfirmationBlocker;
import com.squareup.protos.franklin.api.TaxWebViewBlocker;
import com.squareup.protos.franklin.api.ThreeDsAuthenticationBlocker;
import com.squareup.protos.franklin.api.TransferOptionSelectionBlocker;
import com.squareup.protos.franklin.api.U13CelebrationBlocker;
import com.squareup.protos.franklin.api.WebviewBlocker;
import com.squareup.protos.franklin.api.WirelessProviderListBlocker;
import com.squareup.protos.franklin.app.GetBoostConfigResponse;
import com.squareup.protos.franklin.blockers.BalanceBasedAddCashPreferenceBlocker;
import com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker;
import com.squareup.protos.franklin.blockers.CashAppLocalOrderBlocker;
import com.squareup.protos.franklin.blockers.EarnerEnrollmentBlocker;
import com.squareup.protos.franklin.blockers.EarnerEnrollmentSuccessBlocker;
import com.squareup.protos.franklin.blockers.EarnerUpsellBlocker;
import com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker;
import com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3;
import com.squareup.protos.franklin.blockers.InvestmentEntitySelectionBlocker;
import com.squareup.protos.franklin.blockers.OnboardingInternalRouteBlocker;
import com.squareup.protos.franklin.blockers.PersonaDidvBlocker;
import com.squareup.protos.franklin.blockers.TreehouseBlocker;
import com.squareup.protos.franklin.common.FeatureFlag;
import com.squareup.protos.franklin.common.scenarios.AddressBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.BlockersSupplement;
import com.squareup.protos.franklin.common.scenarios.CardBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.ConfirmBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.ContactVerificationBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.EmailBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.FileBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.IdentityVerificationBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.InviteFriendsBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.InviteFriendsData;
import com.squareup.protos.franklin.common.scenarios.OAuthConfig;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import okhttp3.Call;
import okhttp3.internal.connection.RealCall;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class MoleculeKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ MoleculeKt$$ExternalSyntheticLambda1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0cef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0d02  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0d20 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:759:0x0353  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invoke$com$squareup$cash$data$blockers$RealBlockersDescriptorNavigator$$ExternalSyntheticLambda0(Object obj) {
        BlockersData blockersData;
        Screen screen;
        Screen screen2;
        Screen screen3;
        BlockerDescriptor blockerDescriptor;
        RealBlockersDescriptorNavigator realBlockersDescriptorNavigator;
        String str;
        Screen screen4;
        BlockersData blockersData2;
        Screen screen5;
        InviteFriendsBlocker inviteFriendsBlocker;
        BlockerAction dismissActionOrDefault;
        BlockerAction dismissActionOrDefault2;
        Boolean bool;
        BankAccountLinkingConfig.SupportedLinkingFlow supportedLinkingFlow;
        OAuthConfig oAuthConfig;
        BankAccountLinkingConfig.SupportedLinkingFlow supportedLinkingFlow2;
        Screen bankAccountLinkingScreen;
        String str2;
        BankAccountLinkingConfig.SupportedLinkingFlow supportedLinkingFlow3;
        String str3;
        String str4;
        BankAccountLinkingConfig bankAccountLinkingConfig;
        BankAccountLinkingConfig bankAccountLinkingConfig2;
        BankAccountLinkingConfig bankAccountLinkingConfig3;
        BankAccountLinkingConfig bankAccountLinkingConfig4;
        BankAccountLinkingConfig bankAccountLinkingConfig5;
        BlockersScreens.AmountScreen.Config config;
        AmountBlocker.Config config2;
        AmountBlocker.PercentageConfig percentageConfig;
        CurrencyCode currencyCode;
        CurrencyCode currencyCode2;
        Money minimumAmount;
        BlockersData blockersData3 = (BlockersData) this.f$0;
        RealBlockersDescriptorNavigator realBlockersDescriptorNavigator2 = (RealBlockersDescriptorNavigator) this.f$1;
        Screen screen6 = (Screen) this.f$2;
        BlockerDescriptor blockerDescriptor2 = (BlockerDescriptor) obj;
        blockerDescriptor2.getClass();
        String str5 = blockerDescriptor2.id;
        String str6 = blockerDescriptor2.group_id;
        BlockerDescriptor.Theme theme = blockerDescriptor2.theme;
        Color color = theme != null ? theme.accent_color : null;
        Color color2 = blockerDescriptor2.full_bleed_background_color;
        List list = blockersData3.flowPath;
        FeatureFlagManager featureFlagManager = realBlockersDescriptorNavigator2.featureFlagManager;
        if (str5 != null) {
            list = CollectionsKt.plus((Collection) list, (Object) str5);
        }
        BlockersData copy$default = BlockersData.copy$default(blockersData3, null, null, null, null, str5, str6, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, color, color2, list, Long.valueOf(System.currentTimeMillis()), false, null, null, null, -49, 61695);
        ClientScenario clientScenario = copy$default.clientScenario;
        BlockersData copy$default2 = BlockersData.copy$default(blockersData3, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, blockersData3.flowPath, null, false, null, null, null, -1, 64511);
        Blockers blockers = blockerDescriptor2.blocker;
        blockers.getClass();
        AddressBlocker addressBlocker = blockers.address;
        if (addressBlocker != null) {
            BlockersSupplement blockersSupplement = blockerDescriptor2.supplement;
            blockersSupplement.getClass();
            AddressBlockerSupplement addressBlockerSupplement = blockersSupplement.address;
            boolean isCancellable = RealBlockersDescriptorNavigator.isCancellable(blockerDescriptor2, clientScenario);
            Boolean bool2 = addressBlocker.requires_postal_code;
            if (!(bool2 != null ? bool2.booleanValue() : false)) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(copy$default, "Cannot handle address blockers ");
                return null;
            }
            Boolean bool3 = addressBlocker.requires_street_address;
            if (bool3 != null ? bool3.booleanValue() : false) {
                Boolean bool4 = addressBlocker.requires_city;
                if (bool4 != null ? bool4.booleanValue() : false) {
                    Boolean bool5 = addressBlocker.requires_state;
                    if (bool5 != null ? bool5.booleanValue() : false) {
                        BlockersScreens.StreetAddressScreen.FormType formType = BlockersScreens.StreetAddressScreen.FormType.FULL_ADDRESS;
                        RedactedParcelable redactedParcelable = new RedactedParcelable(addressBlockerSupplement != null ? addressBlockerSupplement.address_prefill : null);
                        String str7 = addressBlockerSupplement != null ? addressBlockerSupplement.main_text : null;
                        String str8 = addressBlockerSupplement != null ? addressBlockerSupplement.sub_text : null;
                        String str9 = addressBlockerSupplement != null ? addressBlockerSupplement.hint_text : null;
                        blockersData = copy$default;
                        boolean z = blockersData.addressTypeaheadEnabled;
                        Boolean bool6 = addressBlocker.autofill;
                        screen = new BlockersScreens.StreetAddressScreen(blockersData, formType, redactedParcelable, str7, str8, str9, z, null, isCancellable, bool6 != null ? bool6.booleanValue() : false, 1408);
                    }
                }
                blockersData = copy$default;
                boolean z2 = blockersData.addressTypeaheadEnabled;
                BlockersScreens.StreetAddressScreen.FormType formType2 = z2 ? BlockersScreens.StreetAddressScreen.FormType.FULL_ADDRESS : BlockersScreens.StreetAddressScreen.FormType.STREET_ADDRESS;
                RedactedParcelable redactedParcelable2 = new RedactedParcelable(addressBlockerSupplement != null ? addressBlockerSupplement.address_prefill : null);
                String str10 = addressBlockerSupplement != null ? addressBlockerSupplement.main_text : null;
                String str11 = addressBlockerSupplement != null ? addressBlockerSupplement.sub_text : null;
                String str12 = addressBlockerSupplement != null ? addressBlockerSupplement.hint_text : null;
                Boolean bool7 = addressBlocker.autofill;
                screen = new BlockersScreens.StreetAddressScreen(blockersData, formType2, redactedParcelable2, str10, str11, str12, z2, null, isCancellable, bool7 != null ? bool7.booleanValue() : false, 1408);
            } else {
                BlockersScreens.StreetAddressScreen.FormType formType3 = BlockersScreens.StreetAddressScreen.FormType.POSTAL_CODE;
                RedactedParcelable redactedParcelable3 = new RedactedParcelable(null);
                String str13 = addressBlockerSupplement != null ? addressBlockerSupplement.main_text : null;
                String str14 = addressBlockerSupplement != null ? addressBlockerSupplement.sub_text : null;
                String str15 = addressBlockerSupplement != null ? addressBlockerSupplement.hint_text : null;
                Boolean bool8 = addressBlocker.autofill;
                screen = new BlockersScreens.StreetAddressScreen(copy$default, formType3, redactedParcelable3, str13, str14, str15, false, null, isCancellable, bool8 != null ? bool8.booleanValue() : false, 1408);
                blockersData = copy$default;
            }
        } else {
            blockersData = copy$default;
            AliasBlocker aliasBlocker = blockers.alias_blocker;
            if (aliasBlocker != null) {
                screen = new BlockersScreens.RegisterAliasScreen(blockersData, BlockersScreens.RegisterAliasScreen.Mode.SIGN_IN, new RedactedString(aliasBlocker.main_text), null, null, aliasBlocker.sms_hint_text, aliasBlocker.email_hint_text, aliasBlocker.legal_agreement_text, false, blockerDescriptor2.dismiss_action != null && blockerDescriptor2.dismiss_action_display_behavior == BlockerDescriptor.DismissActionDisplayBehavior.SERVER_CONTROLLED, null, 1304);
            } else {
                AmountBlocker amountBlocker = blockers.amount_blocker;
                if (amountBlocker != null) {
                    BlockerAction dismissActionOrDefault3 = RealBlockersDescriptorNavigator.dismissActionOrDefault(blockerDescriptor2, null);
                    AmountBlocker.Config config3 = amountBlocker.config;
                    if (config3 != null) {
                        AmountBlocker.Config.MoneyConfig moneyConfig = config3 instanceof AmountBlocker.Config.MoneyConfig ? (AmountBlocker.Config.MoneyConfig) config3 : null;
                        AmountBlocker.MoneyConfig value = moneyConfig != null ? moneyConfig.getValue() : null;
                        if (value != null) {
                            Money money = value.minimum_amount;
                            money.getClass();
                            Money money2 = value.maximum_amount;
                            money2.getClass();
                            config = new BlockersScreens.AmountScreen.Config.MoneyConfig(money, money2, value.prefilled_amount);
                            config2 = amountBlocker.config;
                            if (config2 != null) {
                                AmountBlocker.Config.PercentageConfig percentageConfig2 = config2 instanceof AmountBlocker.Config.PercentageConfig ? (AmountBlocker.Config.PercentageConfig) config2 : null;
                                if (percentageConfig2 != null) {
                                    percentageConfig = percentageConfig2.getValue();
                                    currencyCode = (config != null || (minimumAmount = config.getMinimumAmount()) == null) ? null : minimumAmount.currency_code;
                                    currencyCode2 = CurrencyCode.BTC;
                                    String str16 = amountBlocker.title;
                                    if (currencyCode == currencyCode2) {
                                        str16.getClass();
                                        String str17 = amountBlocker.subtitle;
                                        str17.getClass();
                                        String str18 = amountBlocker.confirm_button_text;
                                        str18.getClass();
                                        screen = new BlockersScreens.BitcoinAmountScreen(blockersData, str16, str17, str18, config.getMinimumAmount(), config.getMaximumAmount(), dismissActionOrDefault3);
                                    } else {
                                        str16.getClass();
                                        String str19 = amountBlocker.subtitle;
                                        str19.getClass();
                                        String str20 = amountBlocker.confirm_button_text;
                                        str20.getClass();
                                        if (config == null) {
                                            if (percentageConfig == null) {
                                                a$$ExternalSyntheticBUOutline0.m$1("invalid or missing config");
                                                return null;
                                            }
                                            ScientificNumber scientificNumber = percentageConfig.minimum_amount;
                                            scientificNumber.getClass();
                                            ScientificNumber scientificNumber2 = percentageConfig.maximum_amount;
                                            scientificNumber2.getClass();
                                            config = new BlockersScreens.AmountScreen.Config.PercentConfig(scientificNumber, scientificNumber2);
                                        }
                                        screen = new BlockersScreens.AmountScreen(blockersData, str16, str19, str20, config, dismissActionOrDefault3, amountBlocker.help_action);
                                    }
                                    blockersData = blockersData;
                                }
                            }
                            percentageConfig = null;
                            if (config != null) {
                            }
                            currencyCode2 = CurrencyCode.BTC;
                            String str162 = amountBlocker.title;
                            if (currencyCode == currencyCode2) {
                            }
                            blockersData = blockersData;
                        }
                    }
                    config = null;
                    config2 = amountBlocker.config;
                    if (config2 != null) {
                    }
                    percentageConfig = null;
                    if (config != null) {
                    }
                    currencyCode2 = CurrencyCode.BTC;
                    String str1622 = amountBlocker.title;
                    if (currencyCode == currencyCode2) {
                    }
                    blockersData = blockersData;
                } else {
                    blockersData = blockersData;
                    screen = null;
                }
                if (screen == null) {
                    CardBlocker cardBlocker = blockers.card;
                    if (cardBlocker != null) {
                        BlockersSupplement blockersSupplement2 = blockerDescriptor2.supplement;
                        blockersSupplement2.getClass();
                        CardBlockerSupplement cardBlockerSupplement = blockersSupplement2.card;
                        Boolean bool9 = blockerDescriptor2.skippable;
                        BlockerAction blockerAction = blockerDescriptor2.dismiss_action;
                        OAuthConfig oAuthConfig2 = (cardBlockerSupplement == null || (bankAccountLinkingConfig5 = cardBlockerSupplement.bank_account_linking_config) == null) ? null : bankAccountLinkingConfig5.bank_account_oauth_config;
                        Boolean bool10 = (cardBlockerSupplement == null || (bankAccountLinkingConfig4 = cardBlockerSupplement.bank_account_linking_config) == null) ? null : bankAccountLinkingConfig4.manual_ach_enabled;
                        Boolean bool11 = (cardBlockerSupplement == null || (bankAccountLinkingConfig3 = cardBlockerSupplement.bank_account_linking_config) == null) ? null : bankAccountLinkingConfig3.force_manual_ach;
                        List<BankAccountLinkingConfig.SupportedLinkingFlow> list2 = (cardBlockerSupplement == null || (bankAccountLinkingConfig2 = cardBlockerSupplement.bank_account_linking_config) == null) ? null : bankAccountLinkingConfig2.supported_linking_flows;
                        BankAccountLinkingConfig.SupportedLinkingFlow supportedLinkingFlow4 = (cardBlockerSupplement == null || (bankAccountLinkingConfig = cardBlockerSupplement.bank_account_linking_config) == null) ? null : bankAccountLinkingConfig.preferred_linking_flow;
                        if (oAuthConfig2 == null || !((str4 = oAuthConfig2.launch_url) == null || StringsKt.isBlank(str4))) {
                            bool = bool11;
                            supportedLinkingFlow = supportedLinkingFlow4;
                            oAuthConfig = oAuthConfig2 == null ? blockersData.bankAccountOauthConfig : oAuthConfig2;
                        } else {
                            bool = bool11;
                            supportedLinkingFlow = supportedLinkingFlow4;
                            Timber.Forest.i("Skipping OAuth Blocker because blocker supplement said so.", new Object[0]);
                            oAuthConfig = null;
                        }
                        BlockersData.BankAccountOAuthConfigSource bankAccountOAuthConfigSource = oAuthConfig2 != null ? BlockersData.BankAccountOAuthConfigSource.CARD_BLOCKER_SUPPLEMENT : BlockersData.BankAccountOAuthConfigSource.APP_CONFIG;
                        boolean booleanValue = bool10 != null ? bool10.booleanValue() : blockersData.manualAchEnabled;
                        boolean booleanValue2 = bool != null ? bool.booleanValue() : blockersData.forceManualAch;
                        if (supportedLinkingFlow == null) {
                            LinkingFlowsData linkingFlowsData = blockersData.linkingFlowsData;
                            supportedLinkingFlow2 = linkingFlowsData != null ? linkingFlowsData.preferred : null;
                        } else {
                            supportedLinkingFlow2 = supportedLinkingFlow;
                        }
                        BlockersData blockersData4 = blockersData;
                        BlockersData copy$default3 = BlockersData.copy$default(blockersData4, null, null, null, null, null, null, null, null, booleanValue, booleanValue2, new LinkingFlowsData(list2, supportedLinkingFlow2), oAuthConfig, bankAccountOAuthConfigSource, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -31745, 65535);
                        List<CashInstrumentType> list3 = cardBlocker.supported_instrument_types;
                        boolean contains = list3.contains(CashInstrumentType.BANK_ACCOUNT);
                        CashInstrumentType cashInstrumentType = CashInstrumentType.DEBIT_CARD;
                        boolean contains2 = list3.contains(cashInstrumentType);
                        CashInstrumentType cashInstrumentType2 = CashInstrumentType.CREDIT_CARD;
                        boolean contains3 = list3.contains(cashInstrumentType2);
                        if (!contains && !contains2 && !contains3) {
                            a$$ExternalSyntheticBUOutline0.m$3("Can't handle card blocker without bank, debit, or credit types.");
                            return null;
                        }
                        if (list3.size() == 1 && contains) {
                            ClientScenario clientScenario2 = copy$default3.clientScenario;
                            int i = clientScenario2 == null ? -1 : RealBlockersDescriptorNavigator$asScreen$$inlined$getStartScreenForLinkingService$1$wm$InstitutionLinkingNavigator$WhenMappings.$EnumSwitchMapping$0[clientScenario2.ordinal()];
                            boolean enabled = i != 1 ? i != 2 ? i != 3 ? false : ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$InstrumentLinkResolveSuspensionStripeEnabled.INSTANCE)).enabled() : ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$InstrumentLinkTransferFundsStripeEnabled.INSTANCE)).enabled() : ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$ClientTransfersInstrumentLinkProfileStripeEnabled.INSTANCE)).enabled();
                            int i2 = 32;
                            if (copy$default3.forceManualAch || copy$default3.bankAccountOauthConfig == null) {
                                bankAccountLinkingScreen = new BlockersScreens.BankAccountLinkingScreen(copy$default3, (cardBlockerSupplement == null || (str2 = cardBlockerSupplement.main_text) == null) ? null : new RedactedString(str2), r10, i2);
                            } else {
                                LinkingFlowsData linkingFlowsData2 = copy$default3.linkingFlowsData;
                                if (linkingFlowsData2 == null || (supportedLinkingFlow3 = linkingFlowsData2.preferred) == null) {
                                    bankAccountLinkingScreen = InstitutionLinkingNavigator.linkWithPlaid(copy$default3, cardBlockerSupplement);
                                } else if (supportedLinkingFlow3 == BankAccountLinkingConfig.SupportedLinkingFlow.MANUAL) {
                                    bankAccountLinkingScreen = new BlockersScreens.BankAccountLinkingScreen(copy$default3, (cardBlockerSupplement == null || (str3 = cardBlockerSupplement.main_text) == null) ? null : new RedactedString(str3), r10, i2);
                                } else {
                                    bankAccountLinkingScreen = (supportedLinkingFlow3 == BankAccountLinkingConfig.SupportedLinkingFlow.STRIPE && enabled) ? InstitutionLinkingNavigator.linkWithStripe(copy$default3) : InstitutionLinkingNavigator.linkWithPlaid(copy$default3, cardBlockerSupplement);
                                }
                            }
                            screen2 = screen6;
                            screen3 = bankAccountLinkingScreen;
                            blockersData = blockersData4;
                        } else {
                            screen2 = screen6;
                            blockersData = blockersData4;
                            screen3 = new BlockersScreens.InputCardInfoScreen(blockersData4, contains2 ? cashInstrumentType : cashInstrumentType2, contains, false, screen2 instanceof BlockersScreens.PasscodeScreen, Intrinsics.areEqual(bool9, Boolean.TRUE), cardBlocker.card_status == CardStatus.EXPIRED, blockerAction, 20);
                        }
                    } else {
                        screen2 = screen6;
                        screen3 = null;
                    }
                    if (screen3 == null) {
                        CardCustomizationBlocker cardCustomizationBlocker = blockers.card_customization;
                        realBlockersDescriptorNavigator = realBlockersDescriptorNavigator2;
                        screen3 = cardCustomizationBlocker != null ? realBlockersDescriptorNavigator.asScreen(cardCustomizationBlocker, blockersData) : null;
                        if (screen3 == null) {
                            CashtagBlocker cashtagBlocker = blockers.cashtag;
                            if (cashtagBlocker != null) {
                                BlockerAction blockerAction2 = blockerDescriptor2.dismiss_action;
                                screen4 = new BlockersScreens.CashtagScreen(blockersData, cashtagBlocker.main_text, cashtagBlocker.subtitle, cashtagBlocker.label_text, cashtagBlocker.button_text, new RedactedString(cashtagBlocker.suggested_cashtag), cashtagBlocker.cashtag_restriction, (blockerAction2 == null || !RealBlockersDescriptorNavigator.isCancellable(blockerDescriptor2, clientScenario)) ? null : blockerAction2, RealBlockersDescriptorNavigator.isCancellable(blockerDescriptor2, clientScenario));
                            } else {
                                screen4 = null;
                            }
                            if (screen4 == null) {
                                CheckDepositBlocker checkDepositBlocker = blockers.check_deposit_blocker;
                                screen4 = checkDepositBlocker != null ? new CheckDepositAmountScreen(blockersData, checkDepositBlocker) : null;
                                if (screen4 == null) {
                                    ConfirmBlocker confirmBlocker = blockers.confirm;
                                    if (confirmBlocker != null) {
                                        BlockersSupplement blockersSupplement3 = blockerDescriptor2.supplement;
                                        blockersSupplement3.getClass();
                                        ConfirmBlockerSupplement confirmBlockerSupplement = blockersSupplement3.confirm;
                                        Boolean bool12 = confirmBlocker.requires_passcode;
                                        BlockersScreens.PasscodeScreen passcodeScreen = bool12 != null ? bool12.booleanValue() : false ? new BlockersScreens.PasscodeScreen(blockersData, confirmBlocker.brand, confirmBlocker.pan_suffix, confirmBlocker.instrument_token, null, BlockersScreens.PasscodeScreen.Type.CONFIRM, null, false, null, null) : null;
                                        if (confirmBlocker.suspected_duplicate_payment_token == null) {
                                            Boolean bool13 = confirmBlocker.explicit_confirmation;
                                            if (!(bool13 != null ? bool13.booleanValue() : false)) {
                                                blockersData2 = blockersData;
                                                screen3 = passcodeScreen;
                                            }
                                        }
                                        confirmBlockerSupplement.getClass();
                                        blockersData2 = blockersData;
                                        screen3 = new BlockersScreens.ConfirmPaymentScreen(blockersData2, confirmBlockerSupplement, passcodeScreen, confirmBlocker.suspected_duplicate_payment_token, blockersData.instrumentSelection);
                                    } else {
                                        blockersData2 = blockersData;
                                        screen3 = null;
                                    }
                                    if (screen3 == null) {
                                        if (blockers.contact_verification != null) {
                                            BlockerAction blockerAction3 = blockerDescriptor2.dismiss_action;
                                            BlockersSupplement blockersSupplement4 = blockerDescriptor2.supplement;
                                            blockersSupplement4.getClass();
                                            ContactVerificationBlockerSupplement contactVerificationBlockerSupplement = blockersSupplement4.contact_verification;
                                            BlockerDescriptor.HideableBlockerAction hideableBlockerAction = blockerDescriptor2.retreat_action;
                                            screen5 = new BlockersScreens.ContactVerificationScreen(blockersData2, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, contactVerificationBlockerSupplement != null ? contactVerificationBlockerSupplement.main_text : null, contactVerificationBlockerSupplement != null ? contactVerificationBlockerSupplement.sub_text : null, contactVerificationBlockerSupplement != null ? contactVerificationBlockerSupplement.additional_help_items : null, contactVerificationBlockerSupplement != null ? contactVerificationBlockerSupplement.primary_button_text : null, (blockerAction3 == null || !RealBlockersDescriptorNavigator.isCancellable(blockerDescriptor2, clientScenario)) ? null : blockerAction3, hideableBlockerAction != null ? hideableBlockerAction.action : null);
                                        } else {
                                            screen5 = null;
                                        }
                                        if (screen5 == null) {
                                            DisclosureBlocker disclosureBlocker = blockers.disclosure;
                                            if (disclosureBlocker != null) {
                                                String str21 = disclosureBlocker.headline_text;
                                                str21.getClass();
                                                RedactedString redactedString = new RedactedString(str21);
                                                List<DisclosureBlocker.LineItem> list4 = disclosureBlocker.line_items;
                                                String str22 = disclosureBlocker.description_text;
                                                str22.getClass();
                                                String str23 = disclosureBlocker.scroll_button_text;
                                                str23.getClass();
                                                String str24 = disclosureBlocker.accept_button_text;
                                                str24.getClass();
                                                List<DisclosureBlocker.LineItem> list5 = disclosureBlocker.more_info_panel_line_items;
                                                String str25 = disclosureBlocker.footer_text;
                                                str25.getClass();
                                                String str26 = disclosureBlocker.cancel_dialog_text;
                                                str26.getClass();
                                                String str27 = disclosureBlocker.cancel_dialog_cancel_text;
                                                str27.getClass();
                                                String str28 = disclosureBlocker.cancel_dialog_confirm_text;
                                                str28.getClass();
                                                screen5 = new DisclosureScreen(blockersData2, redactedString, list4, str22, str23, str24, list5, str25, str26, str27, str28);
                                            } else {
                                                screen5 = null;
                                            }
                                            if (screen5 == null) {
                                                if (blockers.email != null) {
                                                    BlockersSupplement blockersSupplement5 = blockerDescriptor2.supplement;
                                                    blockersSupplement5.getClass();
                                                    EmailBlockerSupplement emailBlockerSupplement = blockersSupplement5.email;
                                                    screen4 = new BlockersScreens.RegisterAliasScreen(blockersData2, BlockersScreens.RegisterAliasScreen.Mode.REGISTER_EMAIL, new RedactedString(emailBlockerSupplement != null ? emailBlockerSupplement.main_text : null), emailBlockerSupplement != null ? emailBlockerSupplement.headline : null, null, null, null, null, false, false, null, 2032);
                                                } else {
                                                    screen4 = null;
                                                }
                                                blockersData = blockersData2;
                                                if (screen4 == null) {
                                                    EmailVerificationBlocker emailVerificationBlocker = blockers.email_verification;
                                                    if (emailVerificationBlocker != null) {
                                                        BlockerAction blockerAction4 = blockerDescriptor2.dismiss_action;
                                                        BlockersSupplement blockersSupplement6 = blockerDescriptor2.supplement;
                                                        blockersSupplement6.getClass();
                                                        screen4 = RealBlockersDescriptorNavigator.asScreen(emailVerificationBlocker, blockersData, blockerAction4, blockerDescriptor2, blockersSupplement6.email_verification);
                                                    } else {
                                                        screen4 = null;
                                                    }
                                                    if (screen4 == null) {
                                                        FidesmoProvisioningBlocker fidesmoProvisioningBlocker = blockers.fidesmo_provisioning_blocker;
                                                        screen4 = fidesmoProvisioningBlocker != null ? new FidesmoProvisioningScreen(blockersData, fidesmoProvisioningBlocker, FidesmoFlowType.PROVISION) : null;
                                                        if (screen4 == null) {
                                                            FileBlocker fileBlocker = blockers.file;
                                                            if (fileBlocker != null) {
                                                                BlockersSupplement blockersSupplement7 = blockerDescriptor2.supplement;
                                                                blockersSupplement7.getClass();
                                                                FileBlockerSupplement fileBlockerSupplement = blockersSupplement7.file;
                                                                fileBlockerSupplement.getClass();
                                                                if (realBlockersDescriptorNavigator.hasCamera) {
                                                                    FileCategory fileCategory = fileBlocker.category;
                                                                    int i3 = fileCategory == null ? -1 : RealBlockersDescriptorNavigator.WhenMappings.$EnumSwitchMapping$2[fileCategory.ordinal()];
                                                                    if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
                                                                        FileCategory fileCategory2 = fileBlocker.category;
                                                                        fileCategory2.getClass();
                                                                        String str29 = fileBlockerSupplement.main_text;
                                                                        str29.getClass();
                                                                        blockersData2 = blockersData;
                                                                        screen3 = new BlockersScreens.FileBlockerScreen(blockersData2, fileCategory2, str29, fileBlockerSupplement.confirmation_main_text, fileBlocker.footer_text, fileBlocker.footer_icon, fileBlockerSupplement.help_items);
                                                                    } else {
                                                                        a$$ExternalSyntheticBUOutline0.m$1(blockersData, " (", fileBlocker.category, ")", "Unable to handle file blocker ");
                                                                    }
                                                                } else {
                                                                    screen3 = realBlockersDescriptorNavigator.getNext(screen2, blockersData.skipBlocker(new StampsConfigQueries$$ExternalSyntheticLambda0(fileBlocker, 1)));
                                                                    blockersData2 = blockersData;
                                                                }
                                                                if (screen3 == null) {
                                                                    FilesetUploadBlocker filesetUploadBlocker = blockers.fileset_upload_blocker;
                                                                    if (filesetUploadBlocker != null) {
                                                                        BlockerAction dismissActionOrDefault4 = RealBlockersDescriptorNavigator.dismissActionOrDefault(blockerDescriptor2, BlockerAction.EndFlowAction.Result.CANCELLED);
                                                                        String str30 = filesetUploadBlocker.title;
                                                                        str30.getClass();
                                                                        String str31 = filesetUploadBlocker.detail_text;
                                                                        Long l = filesetUploadBlocker.file_size_limit_bytes;
                                                                        long longValue = l != null ? l.longValue() : 0L;
                                                                        Integer num = filesetUploadBlocker.file_count_limit;
                                                                        int intValue = num != null ? num.intValue() : 0;
                                                                        Integer num2 = filesetUploadBlocker.minimum_file_count;
                                                                        screen5 = new BlockersScreens.FilesetUploadScreen(blockersData2, dismissActionOrDefault4, str30, str31, longValue, intValue, num2 != null ? num2.intValue() : 0, filesetUploadBlocker.upload_context, filesetUploadBlocker.primary_action, filesetUploadBlocker.secondary_action, filesetUploadBlocker.files);
                                                                    } else {
                                                                        screen5 = null;
                                                                    }
                                                                    if (screen5 == null) {
                                                                        FormBlocker formBlocker = blockers.form;
                                                                        if (formBlocker != null) {
                                                                            blockerDescriptor = blockerDescriptor2;
                                                                            blockersData = blockersData2;
                                                                            screen4 = RealBlockersDescriptorNavigator.asScreen(formBlocker, blockersData, blockerDescriptor2.dismiss_action, blockerDescriptor, blockerDescriptor2.retreat_action, blockerDescriptor2.on_appear_actions);
                                                                        } else {
                                                                            blockerDescriptor = blockerDescriptor2;
                                                                            blockersData = blockersData2;
                                                                            screen4 = null;
                                                                        }
                                                                        if (screen4 == null) {
                                                                            GooglePayProvisioningBlocker googlePayProvisioningBlocker = blockers.google_pay_provisioning;
                                                                            if (googlePayProvisioningBlocker != null) {
                                                                                Boolean bool14 = googlePayProvisioningBlocker.report_all_provisioning_failures;
                                                                                screen4 = new BlockersScreens.ProvisionGooglePayScreen(blockersData, bool14 != null ? bool14.booleanValue() : false);
                                                                            } else {
                                                                                screen4 = null;
                                                                            }
                                                                            if (screen4 == null) {
                                                                                screen4 = blockers.cash_lite_google_pay_push_provisioning_blocker != null ? new BlockersScreens.ProvisionGooglePayScreen(blockersData, false) : null;
                                                                                if (screen4 == null) {
                                                                                    IdentityVerificationBlocker identityVerificationBlocker = blockers.identity_verification;
                                                                                    if (identityVerificationBlocker != null) {
                                                                                        BlockersSupplement blockersSupplement8 = blockerDescriptor.supplement;
                                                                                        blockersSupplement8.getClass();
                                                                                        IdentityVerificationBlockerSupplement identityVerificationBlockerSupplement = blockersSupplement8.identity_verification;
                                                                                        identityVerificationBlockerSupplement.getClass();
                                                                                        screen3 = RealBlockersDescriptorNavigator.asScreen(identityVerificationBlocker, screen2, blockersData, copy$default2, identityVerificationBlockerSupplement);
                                                                                    } else {
                                                                                        screen3 = null;
                                                                                    }
                                                                                    if (screen3 == null) {
                                                                                        InstrumentSelectionBlocker instrumentSelectionBlocker = blockers.instrument_selection_blocker;
                                                                                        screen4 = instrumentSelectionBlocker != null ? new BlockersScreens.InstrumentSelectionScreen(blockersData, InstrumentSelectionBlockerExtKt.toData(instrumentSelectionBlocker)) : null;
                                                                                        if (screen4 == null) {
                                                                                            InstrumentVerificationBlocker instrumentVerificationBlocker = blockers.instrument_verification;
                                                                                            if (instrumentVerificationBlocker != null) {
                                                                                                BlockersSupplement blockersSupplement9 = blockerDescriptor.supplement;
                                                                                                blockersSupplement9.getClass();
                                                                                                screen3 = RealBlockersDescriptorNavigator.asScreen(instrumentVerificationBlocker, blockersData, blockersSupplement9.instrument_verification);
                                                                                            } else {
                                                                                                screen3 = null;
                                                                                            }
                                                                                            if (screen3 == null) {
                                                                                                if (!blockersData.seenInviteFriends && (inviteFriendsBlocker = blockers.invite_friends) != null) {
                                                                                                    BlockersSupplement blockersSupplement10 = blockerDescriptor.supplement;
                                                                                                    blockersSupplement10.getClass();
                                                                                                    InviteFriendsBlockerSupplement inviteFriendsBlockerSupplement = blockersSupplement10.invite_friends;
                                                                                                    inviteFriendsBlockerSupplement.getClass();
                                                                                                    InviteFriendsData inviteFriendsData = inviteFriendsBlockerSupplement.invite_friends_data;
                                                                                                    inviteFriendsData.getClass();
                                                                                                    InviteFriendsOpportunityScreen inviteFriendsOpportunityScreen = inviteFriendsBlocker.invite_friends_opportunity_screen;
                                                                                                    InviteFriendsScreen inviteFriendsScreen = inviteFriendsBlocker.invite_friends_screen;
                                                                                                    if (inviteFriendsScreen != null) {
                                                                                                        screen3 = new BlockersScreens.InviteFriendsScreen(blockersData, inviteFriendsData, inviteFriendsOpportunityScreen, inviteFriendsScreen, inviteFriendsBlocker.contact_access_preparation_screen, inviteFriendsBlocker.recommended_contacts_hashed_alias_ids, screen2 instanceof BlockersScreens.StartFlowEntryPointScreen ? ((BlockersScreens.StartFlowEntryPointScreen) screen2).origin : null);
                                                                                                        if (screen3 == null) {
                                                                                                            if (blockers.name != null) {
                                                                                                                BlockersSupplement blockersSupplement11 = blockerDescriptor.supplement;
                                                                                                                blockersSupplement11.getClass();
                                                                                                                screen3 = RealBlockersDescriptorNavigator.asScreen(blockersData, blockersSupplement11.name);
                                                                                                            } else {
                                                                                                                screen3 = null;
                                                                                                            }
                                                                                                            if (screen3 == null) {
                                                                                                                PaperCashDepositBlocker paperCashDepositBlocker = blockers.paper_cash_deposit_blocker;
                                                                                                                screen4 = paperCashDepositBlocker != null ? new PaperMoneyDepositMapScreen(paperCashDepositBlocker, blockersData) : null;
                                                                                                                if (screen4 == null) {
                                                                                                                    RetailerMapBlocker retailerMapBlocker = blockers.retailer_map_blocker;
                                                                                                                    screen4 = retailerMapBlocker != null ? new AtmRetailerMapScreen(retailerMapBlocker, blockersData) : null;
                                                                                                                    if (screen4 == null) {
                                                                                                                        PasscodeCreationBlocker passcodeCreationBlocker = blockers.passcode_creation;
                                                                                                                        if (passcodeCreationBlocker != null) {
                                                                                                                            BlockersSupplement blockersSupplement12 = blockerDescriptor.supplement;
                                                                                                                            blockersSupplement12.getClass();
                                                                                                                            screen3 = RealBlockersDescriptorNavigator.asScreen(passcodeCreationBlocker, blockersData, blockersSupplement12.passcode_creation);
                                                                                                                        } else {
                                                                                                                            screen3 = null;
                                                                                                                        }
                                                                                                                        if (screen3 == null) {
                                                                                                                            PasscodeVerificationBlocker passcodeVerificationBlocker = blockers.passcode_verification;
                                                                                                                            str = null;
                                                                                                                            if (passcodeVerificationBlocker != null) {
                                                                                                                                BlockerAction dismissActionOrDefault5 = RealBlockersDescriptorNavigator.dismissActionOrDefault(blockerDescriptor, null);
                                                                                                                                BlockersSupplement blockersSupplement13 = blockerDescriptor.supplement;
                                                                                                                                blockersSupplement13.getClass();
                                                                                                                                screen3 = RealBlockersDescriptorNavigator.asScreen(passcodeVerificationBlocker, blockersData, dismissActionOrDefault5, blockerDescriptor, blockersSupplement13.passcode_verification);
                                                                                                                            } else {
                                                                                                                                screen3 = null;
                                                                                                                            }
                                                                                                                            if (screen3 == null) {
                                                                                                                                PayWithCashAuthorizationBlocker payWithCashAuthorizationBlocker = blockers.pay_with_cash_authorization_blocker;
                                                                                                                                screen3 = payWithCashAuthorizationBlocker != null ? RealBlockersDescriptorNavigator.asScreen(payWithCashAuthorizationBlocker, blockersData, RealBlockersDescriptorNavigator.dismissActionOrDefault(blockerDescriptor, null)) : null;
                                                                                                                                if (screen3 == null) {
                                                                                                                                    StatusInterstitialBlocker statusInterstitialBlocker = blockers.status_interstitial_blocker;
                                                                                                                                    if (statusInterstitialBlocker != null) {
                                                                                                                                        BlockerAction dismissActionOrDefault6 = RealBlockersDescriptorNavigator.dismissActionOrDefault(blockerDescriptor, null);
                                                                                                                                        screen3 = blockersData.showAsHalfSheet ? new BlockersScreens.StatusInterstitialSheet(blockersData, statusInterstitialBlocker, dismissActionOrDefault6) : new BlockersScreens.StatusInterstitialScreen(blockersData, statusInterstitialBlocker, dismissActionOrDefault6);
                                                                                                                                    } else {
                                                                                                                                        screen3 = null;
                                                                                                                                    }
                                                                                                                                    if (screen3 == null) {
                                                                                                                                        if (blockers.phone_number != null) {
                                                                                                                                            BlockersSupplement blockersSupplement14 = blockerDescriptor.supplement;
                                                                                                                                            blockersSupplement14.getClass();
                                                                                                                                            screen3 = RealBlockersDescriptorNavigator.asScreen(blockersData, blockersSupplement14.phone_number, blockerDescriptor.skippable);
                                                                                                                                        } else {
                                                                                                                                            screen3 = null;
                                                                                                                                        }
                                                                                                                                        if (screen3 == null) {
                                                                                                                                            PhoneVerificationBlocker phoneVerificationBlocker = blockers.phone_verification;
                                                                                                                                            if (phoneVerificationBlocker != null) {
                                                                                                                                                BlockerAction blockerAction5 = blockerDescriptor.dismiss_action;
                                                                                                                                                BlockersSupplement blockersSupplement15 = blockerDescriptor.supplement;
                                                                                                                                                blockersSupplement15.getClass();
                                                                                                                                                screen3 = RealBlockersDescriptorNavigator.asScreen(phoneVerificationBlocker, blockersData, blockerAction5, blockerDescriptor, blockersSupplement15.phone_verification);
                                                                                                                                            } else {
                                                                                                                                                screen3 = null;
                                                                                                                                            }
                                                                                                                                            if (screen3 == null) {
                                                                                                                                                QrCodeBlocker qrCodeBlocker = blockers.qr_code;
                                                                                                                                                screen3 = qrCodeBlocker != null ? new BlockersScreens.CardActivationQrScreen(blockersData, qrCodeBlocker.info_text_above_scanner, qrCodeBlocker.info_text_below_scanner, qrCodeBlocker.button_text) : null;
                                                                                                                                                if (screen3 == null) {
                                                                                                                                                    RewardCodeBlocker rewardCodeBlocker = blockers.reward_code;
                                                                                                                                                    screen3 = rewardCodeBlocker != null ? RealBlockersDescriptorNavigator.asScreen(rewardCodeBlocker, blockersData, blockerDescriptor) : null;
                                                                                                                                                    if (screen3 == null) {
                                                                                                                                                        ScheduledTransactionBlocker scheduledTransactionBlocker = blockers.scheduled_transaction;
                                                                                                                                                        screen3 = scheduledTransactionBlocker != null ? RealBlockersDescriptorNavigator.asScreen(scheduledTransactionBlocker, blockersData) : null;
                                                                                                                                                        if (screen3 == null) {
                                                                                                                                                            SelectionBlocker selectionBlocker = blockers.selection;
                                                                                                                                                            if (selectionBlocker != null) {
                                                                                                                                                                BlockersSupplement blockersSupplement16 = blockerDescriptor.supplement;
                                                                                                                                                                blockersSupplement16.getClass();
                                                                                                                                                                screen3 = RealBlockersDescriptorNavigator.asScreen(selectionBlocker, blockersData, blockersSupplement16.selection);
                                                                                                                                                            } else {
                                                                                                                                                                screen3 = null;
                                                                                                                                                            }
                                                                                                                                                            if (screen3 == null) {
                                                                                                                                                                SelectSponsorsBlocker selectSponsorsBlocker = blockers.select_sponsors_blocker;
                                                                                                                                                                screen3 = selectSponsorsBlocker != null ? RealBlockersDescriptorNavigator.asScreen(selectSponsorsBlocker, blockersData) : null;
                                                                                                                                                                if (screen3 == null) {
                                                                                                                                                                    SelectAllowlistCustomerBlocker selectAllowlistCustomerBlocker = blockers.select_allowlist_customer_blocker;
                                                                                                                                                                    screen3 = selectAllowlistCustomerBlocker != null ? RealBlockersDescriptorNavigator.asScreen(selectAllowlistCustomerBlocker, blockersData) : null;
                                                                                                                                                                    if (screen3 == null) {
                                                                                                                                                                        SelectDependentsBlocker selectDependentsBlocker = blockers.select_dependents_blocker;
                                                                                                                                                                        screen3 = selectDependentsBlocker != null ? RealBlockersDescriptorNavigator.asScreen(selectDependentsBlocker, blockersData) : null;
                                                                                                                                                                        if (screen3 == null) {
                                                                                                                                                                            if (blockers.signature != null) {
                                                                                                                                                                                dismissActionOrDefault2 = RealBlockersDescriptorNavigator.dismissActionOrDefault(blockerDescriptor, null);
                                                                                                                                                                                screen3 = new BlockersScreens.SignatureScreen(blockersData, dismissActionOrDefault2);
                                                                                                                                                                            } else {
                                                                                                                                                                                screen3 = null;
                                                                                                                                                                            }
                                                                                                                                                                            if (screen3 == null) {
                                                                                                                                                                                screen3 = blockers.google_pay_complete_provisioning_blocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData) : null;
                                                                                                                                                                                if (screen3 == null) {
                                                                                                                                                                                    TaxWebViewBlocker taxWebViewBlocker = blockers.tax_web_view_blocker;
                                                                                                                                                                                    screen3 = taxWebViewBlocker != null ? RealBlockersDescriptorNavigator.asScreen(taxWebViewBlocker, blockersData) : null;
                                                                                                                                                                                    if (screen3 == null) {
                                                                                                                                                                                        PasswordCreationBlocker passwordCreationBlocker = blockers.password_creation_blocker;
                                                                                                                                                                                        screen3 = passwordCreationBlocker != null ? RealBlockersDescriptorNavigator.asScreen(passwordCreationBlocker, blockersData) : null;
                                                                                                                                                                                        if (screen3 == null) {
                                                                                                                                                                                            PasswordVerificationBlocker passwordVerificationBlocker = blockers.password_verification_blocker;
                                                                                                                                                                                            screen3 = passwordVerificationBlocker != null ? RealBlockersDescriptorNavigator.asScreen(passwordVerificationBlocker, blockersData) : null;
                                                                                                                                                                                            if (screen3 == null) {
                                                                                                                                                                                                PersonaDidvBlocker personaDidvBlocker = blockers.persona_didv_blocker;
                                                                                                                                                                                                screen3 = personaDidvBlocker != null ? RealBlockersDescriptorNavigator.asScreen(personaDidvBlocker, blockersData) : null;
                                                                                                                                                                                                if (screen3 == null) {
                                                                                                                                                                                                    ActivityPickerBlocker activityPickerBlocker = blockers.activity_picker_blocker;
                                                                                                                                                                                                    screen3 = activityPickerBlocker != null ? RealBlockersDescriptorNavigator.asScreen(activityPickerBlocker, blockersData) : null;
                                                                                                                                                                                                    if (screen3 == null) {
                                                                                                                                                                                                        WebviewBlocker webviewBlocker = blockers.webview_blocker;
                                                                                                                                                                                                        screen3 = webviewBlocker != null ? RealBlockersDescriptorNavigator.asScreen(webviewBlocker, blockersData) : null;
                                                                                                                                                                                                        if (screen3 == null) {
                                                                                                                                                                                                            TreehouseBlocker treehouseBlocker = blockers.treehouse_blocker;
                                                                                                                                                                                                            screen3 = treehouseBlocker != null ? RealBlockersDescriptorNavigator.asScreen(treehouseBlocker, blockersData) : null;
                                                                                                                                                                                                            if (screen3 == null) {
                                                                                                                                                                                                                RecurringPaymentBlocker recurringPaymentBlocker = blockers.recurring_payment_blocker;
                                                                                                                                                                                                                screen3 = recurringPaymentBlocker != null ? realBlockersDescriptorNavigator.asScreen(recurringPaymentBlocker, blockersData, screen2) : null;
                                                                                                                                                                                                                if (screen3 == null) {
                                                                                                                                                                                                                    CreditMultiStepLoadingBlocker creditMultiStepLoadingBlocker = blockers.credit_multi_step_loading_blocker;
                                                                                                                                                                                                                    screen3 = creditMultiStepLoadingBlocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData, creditMultiStepLoadingBlocker) : null;
                                                                                                                                                                                                                    if (screen3 == null) {
                                                                                                                                                                                                                        CreditFirstTimeBorrowBlocker creditFirstTimeBorrowBlocker = blockers.credit_first_time_borrow_blocker;
                                                                                                                                                                                                                        screen3 = creditFirstTimeBorrowBlocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData, creditFirstTimeBorrowBlocker) : null;
                                                                                                                                                                                                                        if (screen3 == null) {
                                                                                                                                                                                                                            InvestmentEntitySelectionBlocker investmentEntitySelectionBlocker = blockers.investment_entity_selection_blocker;
                                                                                                                                                                                                                            screen3 = investmentEntitySelectionBlocker != null ? RealBlockersDescriptorNavigator.asScreen(investmentEntitySelectionBlocker, blockersData) : null;
                                                                                                                                                                                                                            if (screen3 == null) {
                                                                                                                                                                                                                                OnboardingInternalRouteBlocker onboardingInternalRouteBlocker = blockers.onboarding_internal_route_blocker;
                                                                                                                                                                                                                                screen3 = onboardingInternalRouteBlocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData, onboardingInternalRouteBlocker) : null;
                                                                                                                                                                                                                                if (screen3 == null) {
                                                                                                                                                                                                                                    SponsorSelectionDetailsBlocker sponsorSelectionDetailsBlocker = blockers.sponsor_selection_details_blocker;
                                                                                                                                                                                                                                    screen3 = sponsorSelectionDetailsBlocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData, sponsorSelectionDetailsBlocker) : null;
                                                                                                                                                                                                                                    if (screen3 == null) {
                                                                                                                                                                                                                                        PaymentPlanDataBlocker paymentPlanDataBlocker = blockers.payment_plan_data_blocker;
                                                                                                                                                                                                                                        screen3 = paymentPlanDataBlocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData, paymentPlanDataBlocker) : null;
                                                                                                                                                                                                                                        if (screen3 == null) {
                                                                                                                                                                                                                                            SelectPaymentPlanBlocker selectPaymentPlanBlocker = blockers.select_payment_plan_blocker;
                                                                                                                                                                                                                                            screen3 = selectPaymentPlanBlocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData, selectPaymentPlanBlocker) : null;
                                                                                                                                                                                                                                            if (screen3 == null) {
                                                                                                                                                                                                                                                SetPaycheckAllocationAmountBlocker setPaycheckAllocationAmountBlocker = blockers.set_paycheck_allocation_amount_blocker;
                                                                                                                                                                                                                                                screen3 = setPaycheckAllocationAmountBlocker != null ? RealBlockersDescriptorNavigator.asScreen(setPaycheckAllocationAmountBlocker, blockersData) : null;
                                                                                                                                                                                                                                                if (screen3 == null) {
                                                                                                                                                                                                                                                    BalanceBasedAddCashPreferenceBlocker balanceBasedAddCashPreferenceBlocker = blockers.balance_based_add_cash_pref_blocker;
                                                                                                                                                                                                                                                    screen3 = balanceBasedAddCashPreferenceBlocker != null ? BalanceBasedAutoReloadConfirmationExtKt.asScreen(balanceBasedAddCashPreferenceBlocker, blockersData) : null;
                                                                                                                                                                                                                                                    if (screen3 == null) {
                                                                                                                                                                                                                                                        GpsLocationConsentBlocker gpsLocationConsentBlocker = blockers.gps_location_consent_blocker;
                                                                                                                                                                                                                                                        if (gpsLocationConsentBlocker != null) {
                                                                                                                                                                                                                                                            dismissActionOrDefault = RealBlockersDescriptorNavigator.dismissActionOrDefault(blockerDescriptor, null);
                                                                                                                                                                                                                                                            screen3 = RealBlockersDescriptorNavigator.asScreen(blockersData, dismissActionOrDefault, gpsLocationConsentBlocker);
                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                            screen3 = null;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if (screen3 == null) {
                                                                                                                                                                                                                                                            SetPaycheckMultiAllocationBlocker setPaycheckMultiAllocationBlocker = blockers.multi_allocation_blocker;
                                                                                                                                                                                                                                                            screen3 = setPaycheckMultiAllocationBlocker != null ? RealBlockersDescriptorNavigator.asScreen(setPaycheckMultiAllocationBlocker, blockersData) : null;
                                                                                                                                                                                                                                                            if (screen3 == null) {
                                                                                                                                                                                                                                                                CashAppLocalOrderBlocker cashAppLocalOrderBlocker = blockers.cash_app_local_order_blocker;
                                                                                                                                                                                                                                                                screen3 = cashAppLocalOrderBlocker != null ? RealBlockersDescriptorNavigator.asScreen(cashAppLocalOrderBlocker) : null;
                                                                                                                                                                                                                                                                if (screen3 == null) {
                                                                                                                                                                                                                                                                    ThreeDsAuthenticationBlocker threeDsAuthenticationBlocker = blockers.three_ds_authentication_blocker;
                                                                                                                                                                                                                                                                    screen3 = threeDsAuthenticationBlocker != null ? RealBlockersDescriptorNavigator.asScreen(threeDsAuthenticationBlocker, blockersData) : null;
                                                                                                                                                                                                                                                                    if (screen3 == null) {
                                                                                                                                                                                                                                                                        TransferOptionSelectionBlocker transferOptionSelectionBlocker = blockers.transfer_option_selection_blocker;
                                                                                                                                                                                                                                                                        screen3 = transferOptionSelectionBlocker != null ? RealBlockersDescriptorNavigator.asScreen(transferOptionSelectionBlocker, blockersData, blockerDescriptor.presentation_mode, blockerDescriptor.retreat_action) : null;
                                                                                                                                                                                                                                                                        if (screen3 == null) {
                                                                                                                                                                                                                                                                            AtmPickerAmountBlocker atmPickerAmountBlocker = blockers.atm_picker_amount_blocker;
                                                                                                                                                                                                                                                                            screen3 = atmPickerAmountBlocker != null ? RealBlockersDescriptorNavigator.asScreen(atmPickerAmountBlocker, blockersData, blockerDescriptor.retreat_action, blockerDescriptor.presentation_mode, blockerDescriptor.dismiss_action) : null;
                                                                                                                                                                                                                                                                            if (screen3 == null) {
                                                                                                                                                                                                                                                                                PrepurchaseCashCardFAQBlocker prepurchaseCashCardFAQBlocker = blockers.prepurchase_cash_card_faq_blocker;
                                                                                                                                                                                                                                                                                screen3 = prepurchaseCashCardFAQBlocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData, prepurchaseCashCardFAQBlocker) : null;
                                                                                                                                                                                                                                                                                if (screen3 == null) {
                                                                                                                                                                                                                                                                                    InstrumentSelectionBlockerV3 instrumentSelectionBlockerV3 = blockers.instrument_selection_blocker_v3;
                                                                                                                                                                                                                                                                                    screen3 = instrumentSelectionBlockerV3 != null ? InstrumentSelectionBockerExtKt.asScreen(instrumentSelectionBlockerV3, blockersData) : null;
                                                                                                                                                                                                                                                                                    if (screen3 == null) {
                                                                                                                                                                                                                                                                                        CalendarBlocker calendarBlocker = blockers.calendar_blocker;
                                                                                                                                                                                                                                                                                        screen3 = calendarBlocker != null ? RealBlockersDescriptorNavigator.asScreen(calendarBlocker, blockersData, blockerDescriptor.retreat_action, blockerDescriptor.dismiss_action) : null;
                                                                                                                                                                                                                                                                                        if (screen3 == null) {
                                                                                                                                                                                                                                                                                            AuthorizeDigitalWalletPaymentBlocker authorizeDigitalWalletPaymentBlocker = blockers.authorize_digital_wallet_payment_blocker;
                                                                                                                                                                                                                                                                                            screen3 = authorizeDigitalWalletPaymentBlocker != null ? RealBlockersDescriptorNavigator.asScreen(authorizeDigitalWalletPaymentBlocker, blockersData) : null;
                                                                                                                                                                                                                                                                                            if (screen3 == null) {
                                                                                                                                                                                                                                                                                                RequestPushNotificationsBlocker requestPushNotificationsBlocker = blockers.request_push_notifications_blocker;
                                                                                                                                                                                                                                                                                                screen3 = requestPushNotificationsBlocker != null ? RealBlockersDescriptorNavigator.asScreen(requestPushNotificationsBlocker, blockersData) : null;
                                                                                                                                                                                                                                                                                                if (screen3 == null) {
                                                                                                                                                                                                                                                                                                    AddMoneyBlocker addMoneyBlocker = blockers.add_money_blocker;
                                                                                                                                                                                                                                                                                                    screen3 = addMoneyBlocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData, addMoneyBlocker) : null;
                                                                                                                                                                                                                                                                                                    if (screen3 == null) {
                                                                                                                                                                                                                                                                                                        U13CelebrationBlocker u13CelebrationBlocker = blockers.u13_celebration_blocker;
                                                                                                                                                                                                                                                                                                        screen3 = u13CelebrationBlocker != null ? RealBlockersDescriptorNavigator.asScreen(u13CelebrationBlocker, blockersData) : null;
                                                                                                                                                                                                                                                                                                        if (screen3 == null) {
                                                                                                                                                                                                                                                                                                            ManagedAccountLoginQrCodeProviderBlocker managedAccountLoginQrCodeProviderBlocker = blockers.managed_account_login_qr_code_provider_blocker;
                                                                                                                                                                                                                                                                                                            screen3 = managedAccountLoginQrCodeProviderBlocker != null ? RealBlockersDescriptorNavigator.asScreen(managedAccountLoginQrCodeProviderBlocker, blockersData) : null;
                                                                                                                                                                                                                                                                                                            if (screen3 == null) {
                                                                                                                                                                                                                                                                                                                PaymentDeviceCustomizationBlocker paymentDeviceCustomizationBlocker = blockers.payment_device_customization_blocker;
                                                                                                                                                                                                                                                                                                                screen3 = paymentDeviceCustomizationBlocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData, paymentDeviceCustomizationBlocker) : null;
                                                                                                                                                                                                                                                                                                                if (screen3 == null) {
                                                                                                                                                                                                                                                                                                                    TagConfirmationBlocker tagConfirmationBlocker = blockers.tag_confirmation_blocker;
                                                                                                                                                                                                                                                                                                                    screen3 = tagConfirmationBlocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData, tagConfirmationBlocker) : null;
                                                                                                                                                                                                                                                                                                                    if (screen3 == null) {
                                                                                                                                                                                                                                                                                                                        MoneyTabBookletBlocker moneyTabBookletBlocker = blockers.money_tab_booklet_blocker;
                                                                                                                                                                                                                                                                                                                        screen3 = moneyTabBookletBlocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData, moneyTabBookletBlocker) : null;
                                                                                                                                                                                                                                                                                                                        if (screen3 == null) {
                                                                                                                                                                                                                                                                                                                            WirelessProviderListBlocker wirelessProviderListBlocker = blockers.wireless_provider_list_blocker;
                                                                                                                                                                                                                                                                                                                            screen3 = wirelessProviderListBlocker != null ? RealBlockersDescriptorNavigator.asScreen(wirelessProviderListBlocker, blockersData, blockerDescriptor.retreat_action, blockerDescriptor.dismiss_action) : null;
                                                                                                                                                                                                                                                                                                                            if (screen3 == null) {
                                                                                                                                                                                                                                                                                                                                PhonePlanESimCheckBlocker phonePlanESimCheckBlocker = blockers.phone_plan_esim_check_blocker;
                                                                                                                                                                                                                                                                                                                                screen3 = phonePlanESimCheckBlocker != null ? RealBlockersDescriptorNavigator.asScreen(phonePlanESimCheckBlocker, blockersData, blockerDescriptor.retreat_action, blockerDescriptor.dismiss_action) : null;
                                                                                                                                                                                                                                                                                                                                if (screen3 == null) {
                                                                                                                                                                                                                                                                                                                                    PhonePlanNewLineLoadingBlocker phonePlanNewLineLoadingBlocker = blockers.phone_plan_new_line_loading_blocker;
                                                                                                                                                                                                                                                                                                                                    screen3 = phonePlanNewLineLoadingBlocker != null ? RealBlockersDescriptorNavigator.asScreen(phonePlanNewLineLoadingBlocker, blockersData, blockerDescriptor.retreat_action, blockerDescriptor.dismiss_action) : null;
                                                                                                                                                                                                                                                                                                                                    if (screen3 == null) {
                                                                                                                                                                                                                                                                                                                                        BitcoinP2pConversionPercentageBlocker bitcoinP2pConversionPercentageBlocker = blockers.bitcoin_p2p_conversion_percentage_blocker;
                                                                                                                                                                                                                                                                                                                                        screen3 = bitcoinP2pConversionPercentageBlocker != null ? new CryptoCommonScreens.BitcoinP2pConversionPercentageScreen(blockersData, bitcoinP2pConversionPercentageBlocker) : null;
                                                                                                                                                                                                                                                                                                                                        if (screen3 == null) {
                                                                                                                                                                                                                                                                                                                                            PasskeyUpsellBlocker passkeyUpsellBlocker = blockers.passkey_upsell_blocker;
                                                                                                                                                                                                                                                                                                                                            if (passkeyUpsellBlocker != null) {
                                                                                                                                                                                                                                                                                                                                                Boolean bool15 = blockerDescriptor.skippable;
                                                                                                                                                                                                                                                                                                                                                screen3 = new PasskeyUpsellScreen(blockersData, passkeyUpsellBlocker, bool15 != null ? bool15.booleanValue() : false);
                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                screen3 = null;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            if (screen3 == null) {
                                                                                                                                                                                                                                                                                                                                                PasskeySignatureBlocker passkeySignatureBlocker = blockers.passkey_signature_blocker;
                                                                                                                                                                                                                                                                                                                                                screen3 = passkeySignatureBlocker != null ? new PasskeySignatureBlockerScreen(blockersData, passkeySignatureBlocker) : null;
                                                                                                                                                                                                                                                                                                                                                if (screen3 == null) {
                                                                                                                                                                                                                                                                                                                                                    EarnerEnrollmentBlocker earnerEnrollmentBlocker = blockers.earner_enrollment_blocker;
                                                                                                                                                                                                                                                                                                                                                    screen3 = earnerEnrollmentBlocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData, earnerEnrollmentBlocker) : null;
                                                                                                                                                                                                                                                                                                                                                    if (screen3 == null) {
                                                                                                                                                                                                                                                                                                                                                        EarnerEnrollmentSuccessBlocker earnerEnrollmentSuccessBlocker = blockers.earner_enrollment_success_blocker;
                                                                                                                                                                                                                                                                                                                                                        screen3 = earnerEnrollmentSuccessBlocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData, earnerEnrollmentSuccessBlocker) : null;
                                                                                                                                                                                                                                                                                                                                                        if (screen3 == null) {
                                                                                                                                                                                                                                                                                                                                                            EarnerUpsellBlocker earnerUpsellBlocker = blockers.earner_upsell_blocker;
                                                                                                                                                                                                                                                                                                                                                            screen3 = earnerUpsellBlocker != null ? RealBlockersDescriptorNavigator.asScreen(blockersData, earnerUpsellBlocker) : null;
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            screen = screen3;
                                                                                                                            if (screen != null) {
                                                                                                                                Blockers blockers2 = blockerDescriptor.blocker;
                                                                                                                                realBlockersDescriptorNavigator.blockerFlowAnalytics.onBlockerPresented(blockersData, blockerDescriptor.id, blockers2 != null ? TransactorKt.blockerType(blockers2) : str, blockerDescriptor);
                                                                                                                            }
                                                                                                                            if (screen == null) {
                                                                                                                                return screen;
                                                                                                                            }
                                                                                                                            RealBlockersDescriptorNavigator.UnknownBlockerError unknownBlockerError = new RealBlockersDescriptorNavigator.UnknownBlockerError(blockerDescriptor);
                                                                                                                            if (((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$UnsupportedBlockerFatalError.INSTANCE)).enabled()) {
                                                                                                                                throw unknownBlockerError;
                                                                                                                            }
                                                                                                                            realBlockersDescriptorNavigator.errorReporter.report(unknownBlockerError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                                                                                                            return screen;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        a$$ExternalSyntheticBUOutline0.m$1("Missing invite_friends_screen");
                                                                                                    }
                                                                                                }
                                                                                                screen3 = null;
                                                                                                if (screen3 == null) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        screen = screen4;
                                                                        str = null;
                                                                        if (screen != null) {
                                                                        }
                                                                        if (screen == null) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            blockersData2 = blockersData;
                                                            screen3 = null;
                                                            if (screen3 == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        blockerDescriptor = blockerDescriptor2;
                                        screen = screen5;
                                        blockersData = blockersData2;
                                        str = null;
                                        if (screen != null) {
                                        }
                                        if (screen == null) {
                                        }
                                    }
                                    blockerDescriptor = blockerDescriptor2;
                                    blockersData = blockersData2;
                                }
                            }
                            blockerDescriptor = blockerDescriptor2;
                            screen = screen4;
                            str = null;
                            if (screen != null) {
                            }
                            if (screen == null) {
                            }
                        } else {
                            blockerDescriptor = blockerDescriptor2;
                        }
                    } else {
                        blockerDescriptor = blockerDescriptor2;
                        realBlockersDescriptorNavigator = realBlockersDescriptorNavigator2;
                    }
                    str = null;
                    screen = screen3;
                    if (screen != null) {
                    }
                    if (screen == null) {
                    }
                }
            }
        }
        blockerDescriptor = blockerDescriptor2;
        realBlockersDescriptorNavigator = realBlockersDescriptorNavigator2;
        str = null;
        if (screen != null) {
        }
        if (screen == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 2;
        int i3 = 1;
        Object[] objArr = 0;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                CoroutineContext coroutineContext = (CoroutineContext) obj2;
                obj.getClass();
                if (!ref$BooleanRef.element) {
                    ref$BooleanRef.element = true;
                    JobKt.launch$default(coroutineScope, coroutineContext, null, new DiskLruCache$launchCleanup$1((Object) ref$BooleanRef, (Continuation) (objArr == true ? 1 : 0), 20), 2);
                }
                break;
            case 1:
                SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) obj4;
                SaveableStateRegistryWrapper saveableStateRegistryWrapper = (SaveableStateRegistryWrapper) obj2;
                MutableScatterMap mutableScatterMap = saveableStateHolderImpl.registries;
                if (!mutableScatterMap.contains(obj3)) {
                    saveableStateHolderImpl.savedStates.remove(obj3);
                    mutableScatterMap.set(obj3, saveableStateRegistryWrapper);
                    break;
                } else {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Key ", " was used multiple times ", obj3));
                    break;
                }
            case 2:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) obj4;
                final LifecycleStartStopEffectScope lifecycleStartStopEffectScope = (LifecycleStartStopEffectScope) obj3;
                final Function1 function1 = (Function1) obj2;
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda8
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        int i4 = LifecycleEffectKt$WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        if (i4 == 1) {
                            ref$ObjectRef2.element = function1.invoke(LifecycleStartStopEffectScope.this);
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) ref$ObjectRef2.element;
                            if (lifecycleStopOrDisposeEffectResult != null) {
                                lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
                            }
                            ref$ObjectRef2.element = null;
                        }
                    }
                };
                lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
                break;
            case 3:
                String str = (String) obj3;
                String str2 = (String) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                int ordinal = ((NavigationType) obj4).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        Path$$ExternalSyntheticBUOutline0.m();
                        break;
                    } else {
                        str = str2;
                    }
                }
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                break;
            case 4:
                GetBoostConfigResponse.BtcBoostUpsell btcBoostUpsell = (GetBoostConfigResponse.BtcBoostUpsell) obj3;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindLong(0, (Long) obj4);
                androidStatement.bindBytes(1, btcBoostUpsell != null ? (byte[]) ((Local_tab_content.Adapter) localTabContentQueries.local_tab_contentAdapter).responseAdapter.encode(btcBoostUpsell) : null);
                break;
            case 5:
                Function1 function12 = (Function1) obj4;
                RealSyncValueReader realSyncValueReader = (RealSyncValueReader) obj3;
                SyncValueSpec syncValueSpec = (SyncValueSpec) obj2;
                List list = (List) obj;
                list.getClass();
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(function12.invoke(syncValueSpec.getPayload(realSyncValueReader.entityDecryptor.decryptEntity((SyncEntity) it.next()).getEntityProto())));
                }
                break;
            case 6:
                final Function1 function13 = (Function1) obj2;
                Context context = (Context) obj;
                context.getClass();
                TooltipAppMessageView tooltipAppMessageView = new TooltipAppMessageView(context, (ElementBoundsRegistry) obj4, (RealTooltipTargetLoadedCallbackRegistry) obj3);
                tooltipAppMessageView.setVisibility(8);
                tooltipAppMessageView.setEventReceiver(new Ui.EventReceiver() { // from class: com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda50
                    @Override // app.cash.broadway.ui.Ui.EventReceiver
                    public final void sendEvent(Object obj5) {
                        TooltipAppMessageViewEvent tooltipAppMessageViewEvent = (TooltipAppMessageViewEvent) obj5;
                        tooltipAppMessageViewEvent.getClass();
                        Function1.this.invoke(tooltipAppMessageViewEvent);
                    }
                });
                break;
            case 7:
                break;
            case 8:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, (String) obj4);
                androidStatement2.bindBytes(1, (byte[]) ((Local_tab_content.Adapter) ((InstrumentQueries) obj3).instrumentAdapter).responseAdapter.encode((FeatureFlag) obj2));
                break;
            default:
                Call call = (Call) obj3;
                BufferedChannel bufferedChannel = (BufferedChannel) obj2;
                if (((BufferedChannel) obj4).isClosedForReceive()) {
                    ((RealCall) call).cancel();
                    bufferedChannel.cancel(null);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
