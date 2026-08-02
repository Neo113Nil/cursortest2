package com.squareup.cash.payments.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.core.text.TextUtilsCompat;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.room.Room;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$result$1;
import com.google.android.gms.dynamite.zzb;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.squareup.cash.R;
import com.squareup.cash.account.backend.AccountholderAccountRepository$LoadAccountsResult;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.account.presenters.accountswitcher.AccountSwitcherPresenter$SettingsOptions;
import com.squareup.cash.account.screens.AccountSwitcherScreen;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountSwitcherViewModel;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.limits.util.BitcoinLimitsProvider;
import com.squareup.cash.bitcoin.presenters.send.SendBitcoinNavigator;
import com.squareup.cash.bitcoin.viewmodels.applet.sendreceive.BitcoinSendReceiveBottomSheetViewModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardModelView$textures$$inlined$combine$1;
import com.squareup.cash.cdf.asset.AssetRequestLoadingEnded;
import com.squareup.cash.cdf.asset.AssetSendLoadingEnded;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsViewSettings;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.balance.RealRestrictedBalanceStore;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatus;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatusRepo;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.activity.InitiatePaymentResult;
import com.squareup.cash.data.activity.PaymentNavigator;
import com.squareup.cash.data.activity.RealPaymentNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$AccountLinking;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileMessagingNotificationSettingsSam;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$BusinessAccountsFeeHoliday;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinEnableShowRestrictedBalance;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ForcePersonalizedPaymentsToUseExistingPaymentEndpoint;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.cash.notifications.NotificationSettingsChecker;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$8$1;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.screens.PaymentInitiatorData;
import com.squareup.cash.payments.screens.PaymentScheduleSelection;
import com.squareup.cash.payments.screens.PaymentScheduleSelectionKt;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.PaymentLoadingViewModel;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.profile.presenters.notifications.CategoryListPresenter$sendParentCategoryToggleUpdate$1;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsHelperKt;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.Accessory;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.Category$CategoryListHeader$ToggleHeader;
import com.squareup.cash.profile.viewmodels.CategoryListType;
import com.squareup.cash.profile.viewmodels.CategoryListViewModel;
import com.squareup.cash.profile.viewmodels.Channel;
import com.squareup.cash.profile.viewmodels.ChannelType;
import com.squareup.cash.profile.viewmodels.NotificationPageHeaderViewModel;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import com.squareup.cash.util.money.RealCurrencyConverter;
import com.squareup.protos.cash.fiatly.api.v1.InitiatePersonalizedPaymentRequest;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.cash.notificationsettings.api.v1.CategoryPreferenceUpdate;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiNotificationSettings;
import com.squareup.protos.cash.notificationsettings.common.v1.ClientChannelState;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.protos.cash.pools.Instrument;
import com.squareup.protos.cash.pools.SendPoolContributionRequest;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SignalsContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.UiPayment;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentLoadingPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId = 3;
    public final Object analytics;
    public final Object args;
    public final Object blockersNavigator;
    public final Object featureFlagManager;
    public final Object flowStarter;
    public final Object flowToken;
    public final boolean isRequest;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Object observabilityManager;
    public final Object paymentNavigator;
    public final Object paymentToken;

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentState.values().length];
            try {
                iArr[PaymentState.SCHEDULED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentState.WAITING_ON_SENDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentState.WAITING_ON_RECIPIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentState.PROCESSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentState.COMPLETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentState.WAITING_ON_RISK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentState.WAITING_ON_EXTERNAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentState.PAYMENT_NOT_KNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PaymentState.RECIPIENT_EMAIL_BOUNCED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PaymentState.RECIPIENT_REJECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PaymentState.SENDER_CANCELED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PaymentState.EXPIRED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PaymentState.BLOCKED_BY_RISK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PaymentState.FAILED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaymentLoadingPresenter(PaymentNavigator paymentNavigator, BlockersDataNavigator blockersDataNavigator, FlowStarter flowStarter, FeatureFlagManager featureFlagManager, RealObservabilityManager realObservabilityManager, Analytics analytics, PaymentScreens.PaymentLoading paymentLoading, BetterNavigator.ScreenNavigator screenNavigator) {
        paymentLoading.getClass();
        this.paymentNavigator = paymentNavigator;
        this.blockersNavigator = blockersDataNavigator;
        this.flowStarter = flowStarter;
        this.featureFlagManager = featureFlagManager;
        this.observabilityManager = realObservabilityManager;
        this.analytics = analytics;
        this.args = paymentLoading;
        this.navigator = screenNavigator;
        Redacted redacted = paymentLoading.paymentInitiatorData;
        Object value = redacted.getValue();
        value.getClass();
        this.isRequest = ((PaymentInitiatorData) value).orientation == Orientation.BILL;
        Object value2 = redacted.getValue();
        value2.getClass();
        String uuid = ((PaymentInitiatorData) value2).paymentToken.toString();
        uuid.getClass();
        this.paymentToken = uuid;
        this.flowToken = paymentLoading.blockersData.flowToken;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$initiatePayment(PaymentLoadingPresenter paymentLoadingPresenter, ContinuationImpl continuationImpl) {
        PaymentLoadingPresenter$initiatePayment$1 paymentLoadingPresenter$initiatePayment$1;
        int i;
        Long l;
        UiPayment uiPayment;
        boolean z;
        BlockersData copy$default;
        List<BlockerDescriptor> list;
        PaymentScreens.PaymentLoading paymentLoading = (PaymentScreens.PaymentLoading) paymentLoadingPresenter.args;
        if (continuationImpl instanceof PaymentLoadingPresenter$initiatePayment$1) {
            paymentLoadingPresenter$initiatePayment$1 = (PaymentLoadingPresenter$initiatePayment$1) continuationImpl;
            int i2 = paymentLoadingPresenter$initiatePayment$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentLoadingPresenter$initiatePayment$1.label = i2 - PKIFailureInfo.systemUnavail;
                PaymentLoadingPresenter$initiatePayment$1 paymentLoadingPresenter$initiatePayment$12 = paymentLoadingPresenter$initiatePayment$1;
                Object obj = paymentLoadingPresenter$initiatePayment$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentLoadingPresenter$initiatePayment$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Redacted redacted = paymentLoading.paymentInitiatorData;
                    BlockersData blockersData = paymentLoading.blockersData;
                    PaymentInitiatorData paymentInitiatorData = (PaymentInitiatorData) redacted.getValue();
                    if (paymentInitiatorData == null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    PersonalizationInput personalizationInput = paymentInitiatorData.personalizationInput;
                    paymentLoadingPresenter$initiatePayment$12.label = 1;
                    PaymentNavigator paymentNavigator = (PaymentNavigator) paymentLoadingPresenter.paymentNavigator;
                    String str = paymentInitiatorData.poolToken;
                    InstrumentSelectionData instrumentSelectionData = paymentInitiatorData.selection;
                    UUID uuid = paymentInitiatorData.paymentToken;
                    List list2 = paymentInitiatorData.getters;
                    if (str != null) {
                        ClientScenario clientScenario = blockersData.clientScenario;
                        clientScenario.getClass();
                        String str2 = blockersData.flowToken;
                        RealPaymentNavigator realPaymentNavigator = (RealPaymentNavigator) paymentNavigator;
                        String str3 = paymentInitiatorData.poolToken;
                        String uuid2 = uuid.toString();
                        Money money = paymentInitiatorData.amount;
                        String str4 = instrumentSelectionData != null ? instrumentSelectionData.token : null;
                        ByteString byteString = ByteString.EMPTY;
                        SendPoolContributionRequest sendPoolContributionRequest = new SendPoolContributionRequest(str3, uuid2, money, new Instrument(str4, byteString), paymentInitiatorData.note, null, null, null, null, null, null, paymentInitiatorData.poolContributorComment, byteString);
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((PaymentRecipient) it.next()).sendableUiCustomer);
                        }
                        obj = realPaymentNavigator.sendInitiatePoolPayment(clientScenario, str2, sendPoolContributionRequest, arrayList, paymentLoadingPresenter$initiatePayment$12);
                        l = null;
                    } else {
                        if (personalizationInput != null) {
                            FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options = (FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) paymentLoadingPresenter.featureFlagManager)).peekCurrentValue(LaunchDarklyFeatureFlags$ForcePersonalizedPaymentsToUseExistingPaymentEndpoint.INSTANCE);
                            featureFlag$EnabledDisabledFeatureFlag$Options.getClass();
                            if (featureFlag$EnabledDisabledFeatureFlag$Options == FeatureFlag$EnabledDisabledFeatureFlag$Options.Disabled) {
                                ClientScenario clientScenario2 = blockersData.clientScenario;
                                clientScenario2.getClass();
                                String str5 = blockersData.flowToken;
                                RealPaymentNavigator realPaymentNavigator2 = (RealPaymentNavigator) paymentNavigator;
                                ArrayList arrayList2 = new ArrayList(list2.size());
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((PaymentRecipient) it2.next()).sendableUiCustomer);
                                }
                                String uuid3 = uuid.toString();
                                Money money2 = paymentInitiatorData.amount;
                                Orientation orientation = paymentInitiatorData.orientation;
                                InstrumentSelection selectionProto = instrumentSelectionData != null ? instrumentSelectionData.toSelectionProto() : null;
                                String str6 = paymentInitiatorData.note;
                                SignalsContext signalsContext = paymentInitiatorData.signals;
                                RequestContext requestContext = signalsContext != null ? new RequestContext(null, null, null, signalsContext, null, null, null, null, 8063) : null;
                                String str7 = paymentInitiatorData.referrer;
                                l = null;
                                String str8 = paymentInitiatorData.launchUrl;
                                AppCreationActivity appCreationActivity = paymentInitiatorData.appCreationActivity;
                                String str9 = paymentInitiatorData.exchangeRatesToken;
                                PaymentScheduleSelection paymentScheduleSelection = paymentInitiatorData.scheduleSelection;
                                obj = realPaymentNavigator2.sendInitiatePersonalizedPayment(clientScenario2, str5, new InitiatePersonalizedPaymentRequest(new InitiatePaymentRequest(requestContext, uuid3, arrayList2, orientation, money2, str6, selectionProto, null, paymentScheduleSelection != null ? PaymentScheduleSelectionKt.toScheduleProto$default(paymentScheduleSelection) : null, str7, str8, appCreationActivity, null, str9, null, null, 8307520), null, paymentInitiatorData.personalizationFlowToken, (18 & 8) != 0 ? null : personalizationInput, ByteString.EMPTY), paymentInitiatorData.moneybotContext, paymentLoadingPresenter$initiatePayment$12);
                            }
                        }
                        l = null;
                        ClientScenario clientScenario3 = blockersData.clientScenario;
                        clientScenario3.getClass();
                        obj = ((RealPaymentNavigator) paymentNavigator).sendInitiatePayment(clientScenario3, blockersData.flowToken, paymentInitiatorData, paymentLoadingPresenter$initiatePayment$12);
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    l = null;
                }
                ResponseContext responseContext = ((InitiatePaymentResult) obj).responseContext;
                List list4 = responseContext.payments;
                ScenarioPlan scenarioPlan = responseContext.scenario_plan;
                BlockersData blockersData2 = paymentLoading.blockersData;
                uiPayment = (UiPayment) CollectionsKt.firstOrNull(list4);
                if (uiPayment != null) {
                    PaymentState paymentState = uiPayment.state;
                    switch (paymentState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paymentState.ordinal()]) {
                        case -1:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            break;
                        case 0:
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return l;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = true;
                            break;
                    }
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    copy$default = BlockersData.copy$default(blockersData2.updateFromResponseContext(responseContext, false), null, null, null, null, null, null, z ? blockersData2.exitScreenOnSuccess : blockersData2.exitScreen, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65, 65535);
                    String str10 = (String) paymentLoadingPresenter.flowToken;
                    String str11 = (String) paymentLoadingPresenter.paymentToken;
                    ((Analytics) paymentLoadingPresenter.analytics).track(paymentLoadingPresenter.isRequest ? new AssetRequestLoadingEnded(str11, str10) : new AssetSendLoadingEnded(str11, str10), l);
                    list = scenarioPlan != null ? scenarioPlan.blocker_descriptors : null;
                    if (list == null && !list.isEmpty()) {
                        return ((BlockersDataNavigator) paymentLoadingPresenter.blockersNavigator).getNext(paymentLoading, copy$default);
                    }
                    FlowStarter flowStarter = (FlowStarter) paymentLoadingPresenter.flowStarter;
                    StatusResult statusResult = responseContext.status_result;
                    statusResult.getClass();
                    List tokens = Room.getTokens(list4);
                    Screen screen = copy$default.exitScreen;
                    ClientScenario clientScenario4 = copy$default.clientScenario;
                    clientScenario4.getClass();
                    return ((RealFlowStarter) flowStarter).startStatusResultFlow(statusResult, tokens, screen, clientScenario4, copy$default.flowToken, copy$default.analyticsData);
                }
                z = false;
                Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
                copy$default = BlockersData.copy$default(blockersData2.updateFromResponseContext(responseContext, false), null, null, null, null, null, null, z ? blockersData2.exitScreenOnSuccess : blockersData2.exitScreen, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65, 65535);
                String str102 = (String) paymentLoadingPresenter.flowToken;
                String str112 = (String) paymentLoadingPresenter.paymentToken;
                ((Analytics) paymentLoadingPresenter.analytics).track(paymentLoadingPresenter.isRequest ? new AssetRequestLoadingEnded(str112, str102) : new AssetSendLoadingEnded(str112, str102), l);
                list = scenarioPlan != null ? scenarioPlan.blocker_descriptors : null;
                if (list == null) {
                }
                FlowStarter flowStarter2 = (FlowStarter) paymentLoadingPresenter.flowStarter;
                StatusResult statusResult2 = responseContext.status_result;
                statusResult2.getClass();
                List tokens2 = Room.getTokens(list4);
                Screen screen2 = copy$default.exitScreen;
                ClientScenario clientScenario42 = copy$default.clientScenario;
                clientScenario42.getClass();
                return ((RealFlowStarter) flowStarter2).startStatusResultFlow(statusResult2, tokens2, screen2, clientScenario42, copy$default.flowToken, copy$default.analyticsData);
            }
        }
        paymentLoadingPresenter$initiatePayment$1 = new PaymentLoadingPresenter$initiatePayment$1(paymentLoadingPresenter, continuationImpl);
        PaymentLoadingPresenter$initiatePayment$1 paymentLoadingPresenter$initiatePayment$122 = paymentLoadingPresenter$initiatePayment$1;
        Object obj2 = paymentLoadingPresenter$initiatePayment$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentLoadingPresenter$initiatePayment$122.label;
        if (i != 0) {
        }
        ResponseContext responseContext2 = ((InitiatePaymentResult) obj2).responseContext;
        List list42 = responseContext2.payments;
        ScenarioPlan scenarioPlan2 = responseContext2.scenario_plan;
        BlockersData blockersData22 = paymentLoading.blockersData;
        uiPayment = (UiPayment) CollectionsKt.firstOrNull(list42);
        if (uiPayment != null) {
        }
        z = false;
        Parcelable.Creator<BlockersData> creator22 = BlockersData.CREATOR;
        copy$default = BlockersData.copy$default(blockersData22.updateFromResponseContext(responseContext2, false), null, null, null, null, null, null, z ? blockersData22.exitScreenOnSuccess : blockersData22.exitScreen, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65, 65535);
        String str1022 = (String) paymentLoadingPresenter.flowToken;
        String str1122 = (String) paymentLoadingPresenter.paymentToken;
        ((Analytics) paymentLoadingPresenter.analytics).track(paymentLoadingPresenter.isRequest ? new AssetRequestLoadingEnded(str1122, str1022) : new AssetSendLoadingEnded(str1122, str1022), l);
        list = scenarioPlan2 != null ? scenarioPlan2.blocker_descriptors : null;
        if (list == null) {
        }
        FlowStarter flowStarter22 = (FlowStarter) paymentLoadingPresenter.flowStarter;
        StatusResult statusResult22 = responseContext2.status_result;
        statusResult22.getClass();
        List tokens22 = Room.getTokens(list42);
        Screen screen22 = copy$default.exitScreen;
        ClientScenario clientScenario422 = copy$default.clientScenario;
        clientScenario422.getClass();
        return ((RealFlowStarter) flowStarter22).startStatusResultFlow(statusResult22, tokens22, screen22, clientScenario422, copy$default.flowToken, copy$default.analyticsData);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$sendParentCategoryToggleUpdate(PaymentLoadingPresenter paymentLoadingPresenter, Category category, boolean z, String str, boolean z2, Map map, ContinuationImpl continuationImpl) {
        CategoryListPresenter$sendParentCategoryToggleUpdate$1 categoryListPresenter$sendParentCategoryToggleUpdate$1;
        int i;
        boolean z3;
        ApiResult apiResult;
        if (continuationImpl instanceof CategoryListPresenter$sendParentCategoryToggleUpdate$1) {
            categoryListPresenter$sendParentCategoryToggleUpdate$1 = (CategoryListPresenter$sendParentCategoryToggleUpdate$1) continuationImpl;
            int i2 = categoryListPresenter$sendParentCategoryToggleUpdate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                categoryListPresenter$sendParentCategoryToggleUpdate$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = categoryListPresenter$sendParentCategoryToggleUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = categoryListPresenter$sendParentCategoryToggleUpdate$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Category.CategoryType categoryType = category.categoryType;
                    Category.CategoryType.CategoryList categoryList = categoryType instanceof Category.CategoryType.CategoryList ? (Category.CategoryType.CategoryList) categoryType : null;
                    if (categoryList == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Category type must be category list");
                        return null;
                    }
                    List list = categoryList.children;
                    ClientChannelState clientChannelState = z ? ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_ON_ENABLED : ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_OFF_ENABLED;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        Category.CategoryType categoryType2 = ((Category) obj2).categoryType;
                        if ((categoryType2 instanceof Category.CategoryType.ChannelList ? (Category.CategoryType.ChannelList) categoryType2 : null) != null) {
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Category.CategoryType.ChannelList channelList = (Category.CategoryType.ChannelList) ((Category) it.next()).categoryType;
                        ArrayList arrayList3 = channelList.channels;
                        if (!arrayList3.isEmpty()) {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                if (ProfileNotificationsHelperKt.canToggle((Channel) it2.next(), z)) {
                                    NotificationCategory notificationCategory = channelList.notificationCategory;
                                    Long l = ((Integer) map.get(notificationCategory)) != null ? new Long(r10.intValue()) : null;
                                    ClientChannelState clientChannelState2 = canUpdateFromParentToggle(channelList, z, ChannelType.EMAIL) ? clientChannelState : null;
                                    ClientChannelState clientChannelState3 = canUpdateFromParentToggle(channelList, z, ChannelType.SMS) ? clientChannelState : null;
                                    ClientChannelState clientChannelState4 = (canUpdateFromParentToggle(channelList, z, ChannelType.PUSH) && z2) ? clientChannelState : null;
                                    if (str != null) {
                                        if (((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) paymentLoadingPresenter.featureFlagManager)).peekCurrentValue(AmplitudeExperiments$MobileMessagingNotificationSettingsSam.INSTANCE)).disabled()) {
                                            z3 = true;
                                            arrayList.add(new CategoryPreferenceUpdate(str, notificationCategory, clientChannelState2, clientChannelState4, clientChannelState3, l, (NotificationCategoryExtraConfig) null, Boolean.valueOf(z3), 320));
                                        }
                                    }
                                    z3 = false;
                                    arrayList.add(new CategoryPreferenceUpdate(str, notificationCategory, clientChannelState2, clientChannelState4, clientChannelState3, l, (NotificationCategoryExtraConfig) null, Boolean.valueOf(z3), 320));
                                }
                            }
                        }
                    }
                    RealProfileNotificationsRepository realProfileNotificationsRepository = (RealProfileNotificationsRepository) paymentLoadingPresenter.blockersNavigator;
                    categoryListPresenter$sendParentCategoryToggleUpdate$1.label = 1;
                    obj = JobKt.withContext(realProfileNotificationsRepository.ioDispatcher, new EntitySyncerKt$hasSyncedFlow$1(realProfileNotificationsRepository, arrayList, continuation, 21), categoryListPresenter$sendParentCategoryToggleUpdate$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    return Boolean.TRUE;
                }
                ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                zzaky.trackChangeSettingError((Analytics) paymentLoadingPresenter.analytics, zzaky.getReasonCode(failure));
                ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging((AndroidStringManager) paymentLoadingPresenter.flowStarter, failure, null);
                paymentLoadingPresenter.navigator.goTo(new ProfileScreens.ErrorScreen(errorMessaging.message, errorMessaging.title, 12));
                return Boolean.FALSE;
            }
        }
        categoryListPresenter$sendParentCategoryToggleUpdate$1 = new CategoryListPresenter$sendParentCategoryToggleUpdate$1(paymentLoadingPresenter, continuationImpl);
        Object obj3 = categoryListPresenter$sendParentCategoryToggleUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = categoryListPresenter$sendParentCategoryToggleUpdate$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (apiResult instanceof ApiResult.Failure) {
        }
    }

    public static final Category access$updateParentToggleState(PaymentLoadingPresenter paymentLoadingPresenter, Category category, boolean z) {
        paymentLoadingPresenter.getClass();
        Category.CategoryType categoryType = category.categoryType;
        Category.CategoryType.CategoryList categoryList = categoryType instanceof Category.CategoryType.CategoryList ? (Category.CategoryType.CategoryList) categoryType : null;
        if (categoryList == null) {
            return category;
        }
        Category$CategoryListHeader$ToggleHeader category$CategoryListHeader$ToggleHeader = categoryList.categoryListHeader;
        Category$CategoryListHeader$ToggleHeader category$CategoryListHeader$ToggleHeader2 = category$CategoryListHeader$ToggleHeader != null ? category$CategoryListHeader$ToggleHeader : null;
        if (category$CategoryListHeader$ToggleHeader2 != null) {
            String str = category$CategoryListHeader$ToggleHeader2.description;
            str.getClass();
            category$CategoryListHeader$ToggleHeader = new Category$CategoryListHeader$ToggleHeader(str, z);
        }
        List<Category> list = categoryList.children;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Category category2 : list) {
            Category.CategoryType categoryType2 = category2.categoryType;
            Category.CategoryType.ChannelList channelList = categoryType2 instanceof Category.CategoryType.ChannelList ? (Category.CategoryType.ChannelList) categoryType2 : null;
            if (channelList != null) {
                ArrayList<Channel> arrayList2 = channelList.channels;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                for (Channel channel : arrayList2) {
                    Accessory accessory = channel.accessory;
                    Accessory.Toggle toggle = accessory instanceof Accessory.Toggle ? (Accessory.Toggle) accessory : null;
                    if (toggle != null) {
                        channel = Channel.copy$default(channel, Accessory.Toggle.copy$default(toggle, z));
                    }
                    arrayList3.add(channel);
                }
                categoryType2 = new Category.CategoryType.ChannelList(arrayList3, channelList.notificationCategory, channelList.detailedDescription, channelList.adjustableThreshold, channelList.family);
            }
            arrayList.add(Category.copy$default(category2, categoryType2, z));
        }
        CategoryListType categoryListType = categoryList.categoryListType;
        categoryListType.getClass();
        return Category.copy$default(category, new Category.CategoryType.CategoryList(categoryListType, category$CategoryListHeader$ToggleHeader, arrayList), z);
    }

    public static boolean canUpdateFromParentToggle(Category.CategoryType.ChannelList channelList, boolean z, ChannelType channelType) {
        Object obj;
        Iterator it = channelList.channels.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Channel) obj).channelType == channelType) {
                break;
            }
        }
        Channel channel = (Channel) obj;
        if (channel != null) {
            return ProfileNotificationsHelperKt.canToggle(channel, z);
        }
        return false;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Continuation continuation;
        MutableState mutableState;
        Object obj;
        String str;
        Integer num;
        ArrayList arrayList;
        Continuation continuation2;
        Object moleculeKt$immediateClockFlow$1$1$1;
        String str2;
        MutableState mutableState2;
        int i2 = this.$r8$classId;
        Object obj2 = this.paymentToken;
        Object obj3 = this.analytics;
        Object obj4 = this.flowToken;
        Object obj5 = this.args;
        Object obj6 = this.observabilityManager;
        Object obj7 = this.blockersNavigator;
        Object obj8 = Composer.Companion.Empty;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1554653854);
                PaymentScreens.PaymentLoading paymentLoading = (PaymentScreens.PaymentLoading) obj5;
                Object value = paymentLoading.paymentInitiatorData.getValue();
                value.getClass();
                DragAndDrop_androidKt.AddViewAttributes((RealObservabilityManager) obj6, MapsKt__MapsJVMKt.mapOf(new Pair("orientation", ((PaymentInitiatorData) value).orientation.name())), gapComposer, 0);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == obj8) {
                    continuation = null;
                    rememberedValue = new InviteErrorPresenter$models$1$1(this, continuation, 22);
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    continuation = null;
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                Updater.LaunchedEffect(gapComposer, flow, new MainPaymentPresenter$models$4$4(flow, continuation, this, 26));
                Color color = paymentLoading.blockersData.serverAccentColor;
                PaymentLoadingViewModel paymentLoadingViewModel = new PaymentLoadingViewModel();
                gapComposer.end(false);
                return paymentLoadingViewModel;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(1731482474);
                boolean changedInstance2 = gapComposer2.changedInstance(this);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                Continuation continuation3 = null;
                if (changedInstance2 || rememberedValue2 == obj8) {
                    rememberedValue2 = new EditProfilePresenter$models$2$1(this, continuation3, 2);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                MutableState produceState = Updater.produceState(gapComposer2, null, (Function2) rememberedValue2);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == obj8) {
                    Object finishSetupTileBadgeCounter = new FinishSetupTileBadgeCounter(10, ((RealFeatureEligibilityRepository) obj6).currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.C4B_PROMOTION_VISIBILITY});
                    gapComposer2.updateRememberedValue(finishSetupTileBadgeCounter);
                    rememberedValue3 = finishSetupTileBadgeCounter;
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue3, Boolean.FALSE, null, gapComposer2, 48, 2);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (rememberedValue4 == obj8) {
                    BlockersData.Flow.INSTANCE.getClass();
                    rememberedValue4 = BlockersData.Flow.Companion.generateToken();
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                String str3 = (String) rememberedValue4;
                EmptyList emptyList = EmptyList.INSTANCE;
                boolean changedInstance3 = gapComposer2.changedInstance(this) | gapComposer2.changed(produceState);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (changedInstance3 || rememberedValue5 == obj8) {
                    Object zzmoVar = new zzmo(this, str3, produceState, continuation3, 19);
                    mutableState = produceState;
                    gapComposer2.updateRememberedValue(zzmoVar);
                    rememberedValue5 = zzmoVar;
                } else {
                    mutableState = produceState;
                }
                MutableState produceState2 = Updater.produceState(gapComposer2, emptyList, (Function2) rememberedValue5);
                Updater.LaunchedEffect(gapComposer2, flow, new RealImageLoader$execute$result$1(flow, (Continuation) null, this, str3, produceState2, 23));
                List list = (List) produceState2.getValue();
                AccountSwitcherPresenter$SettingsOptions accountSwitcherPresenter$SettingsOptions = (AccountSwitcherPresenter$SettingsOptions) mutableState.getValue();
                boolean booleanValue = ((Boolean) collectAsState.getValue()).booleanValue();
                AndroidStringManager androidStringManager = (AndroidStringManager) obj5;
                JsonFeatureFlags$BusinessAccountsFeeHoliday.FeeHolidayData feeHolidayData = (JsonFeatureFlags$BusinessAccountsFeeHoliday.FeeHolidayData) obj4;
                if (list.isEmpty() || accountSwitcherPresenter$SettingsOptions == null) {
                    obj = AccountSwitcherViewModel.Loading.INSTANCE;
                } else {
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(zzb.toAccountViewModel((FullAccount) it.next(), PlatformKt.activeAccountToken((SessionManager) obj7)));
                    }
                    String str4 = (!booleanValue || feeHolidayData.promotionAmount == null) ? androidStringManager.get(R.string.account_switcher_new_account) : androidStringManager.get(R.string.account_switcher_add_a_business_account);
                    if (!booleanValue || (num = feeHolidayData.promotionAmount) == null) {
                        str = androidStringManager.get(R.string.account_switcher_create_business_account);
                    } else {
                        Resources resources = androidStringManager.resources;
                        resources.getClass();
                        str = new MessageFormat(resources.getString(R.string.account_switcher_free_processing_on_your_first_amount)).format(new Object[]{num});
                        str.getClass();
                    }
                    obj = new AccountSwitcherViewModel.Loaded(arrayList2, new AccountSwitcherViewModel.Loaded.AccountCreationConfig(str4, str, accountSwitcherPresenter$SettingsOptions.createBusinessVisibility), accountSwitcherPresenter$SettingsOptions.createPersonalVisibility, accountSwitcherPresenter$SettingsOptions.linkAccountVisibility);
                }
                gapComposer2.end(false);
                return obj;
            case 2:
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj7;
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(686847315);
                RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) obj6;
                Updater.LaunchedEffect(gapComposer3, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, Updater.collectAsState(((CryptoIdvStatusRepo) this.flowStarter).idvStatus(), CryptoIdvStatus.NOT_VERIFIED, null, gapComposer3, 48, 2), Updater.collectAsState(new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new RealGooglePayer$createWallet$$inlined$filter$1(((RealRestrictedBalanceStore) obj5).syncValueReader.getSingleValue(AndroidSyncValueSpecs.CrowRestrictionsData), 1), 25), Boolean.FALSE, null, gapComposer3, 48, 2), Updater.collectAsState(realCryptoBalanceRepo.restrictedBitcoinBalance(((RealCurrencyConverter.Factory) ((CurrencyConverter$Factory) obj2)).get(CurrencyCode.USD)), null, null, gapComposer3, 48, 2), Updater.collectAsState(((BitcoinLimitsProvider) obj3).getMinimumWithdrawalLimit(), null, null, gapComposer3, 48, 2), Updater.collectAsState(realCryptoBalanceRepo.getBitcoinBalance(), null, null, gapComposer3, 48, 2), 13));
                Object rememberedValue6 = gapComposer3.rememberedValue();
                if (rememberedValue6 == obj8) {
                    Object bitcoinSendReceiveBottomSheetViewModel = new BitcoinSendReceiveBottomSheetViewModel(androidStringManager2.get(R.string.send_or_receive), androidStringManager2.get(R.string.transact_with_any_wallet), androidStringManager2.get(R.string.send_bitcoin), androidStringManager2.get(R.string.receive_bitcoin), androidStringManager2.get(R.string.close));
                    gapComposer3.updateRememberedValue(bitcoinSendReceiveBottomSheetViewModel);
                    rememberedValue6 = bitcoinSendReceiveBottomSheetViewModel;
                }
                BitcoinSendReceiveBottomSheetViewModel bitcoinSendReceiveBottomSheetViewModel2 = (BitcoinSendReceiveBottomSheetViewModel) rememberedValue6;
                gapComposer3.end(false);
                return bitcoinSendReceiveBottomSheetViewModel2;
            default:
                ProfileScreens.CategoryListScreen categoryListScreen = (ProfileScreens.CategoryListScreen) obj4;
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(90790676);
                Object[] objArr = new Object[0];
                Object rememberedValue7 = gapComposer4.rememberedValue();
                if (rememberedValue7 == obj8) {
                    rememberedValue7 = new DateScrubber$$ExternalSyntheticLambda0(15);
                    gapComposer4.updateRememberedValue(rememberedValue7);
                }
                MutableState mutableState3 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue7, gapComposer4, 48);
                if (!((Boolean) mutableState3.getValue()).booleanValue()) {
                    ((Analytics) obj3).track(new NotificationsSettingsViewSettings(zzaky.getCategoryListSettingsPage(categoryListScreen.categoryListType)), null);
                    mutableState3.setValue(Boolean.TRUE);
                }
                Object rememberedValue8 = gapComposer4.rememberedValue();
                if (rememberedValue8 == obj8) {
                    rememberedValue8 = ((RealProfileNotificationsRepository) obj7).getNotificationSettings();
                    gapComposer4.updateRememberedValue(rememberedValue8);
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue8, null, null, gapComposer4, 48, 2);
                Object rememberedValue9 = gapComposer4.rememberedValue();
                if (rememberedValue9 == obj8) {
                    rememberedValue9 = Updater.mutableStateOf$default(null);
                    gapComposer4.updateRememberedValue(rememberedValue9);
                }
                MutableState mutableState4 = (MutableState) rememberedValue9;
                Object rememberedValue10 = gapComposer4.rememberedValue();
                if (rememberedValue10 == obj8) {
                    rememberedValue10 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer4.updateRememberedValue(rememberedValue10);
                }
                MutableState mutableState5 = (MutableState) rememberedValue10;
                Object rememberedValue11 = gapComposer4.rememberedValue();
                if (rememberedValue11 == obj8) {
                    rememberedValue11 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer4.updateRememberedValue(rememberedValue11);
                }
                MutableState mutableState6 = (MutableState) rememberedValue11;
                String str5 = categoryListScreen.ownerAccountToken;
                Object rememberedValue12 = gapComposer4.rememberedValue();
                if (rememberedValue12 == obj8) {
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    rememberedValue12 = Updater.mutableStateOf$default(emptyMap);
                    gapComposer4.updateRememberedValue(rememberedValue12);
                }
                MutableState mutableState7 = (MutableState) rememberedValue12;
                boolean changed = gapComposer4.changed((Category) mutableState4.getValue());
                Object rememberedValue13 = gapComposer4.rememberedValue();
                if (changed || rememberedValue13 == obj8) {
                    Category category = (Category) mutableState4.getValue();
                    if (category != null) {
                        List list3 = ProfileNotificationsHelperKt.ACCOUNT_CATEGORIES;
                        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        Category.CategoryType categoryType = category.categoryType;
                        if (categoryType instanceof Category.CategoryType.CategoryList) {
                            Iterator it2 = ((Category.CategoryType.CategoryList) categoryType).children.iterator();
                            while (it2.hasNext()) {
                                Category.CategoryType categoryType2 = ((Category) it2.next()).categoryType;
                                if (categoryType2 instanceof Category.CategoryType.ChannelList) {
                                    createListBuilder.add(((Category.CategoryType.ChannelList) categoryType2).notificationCategory);
                                }
                            }
                        } else {
                            if (!(categoryType instanceof Category.CategoryType.ChannelList)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            createListBuilder.add(((Category.CategoryType.ChannelList) categoryType).notificationCategory);
                        }
                        ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                        if (build != null) {
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(build, 10));
                            ListIterator listIterator = build.listIterator(0);
                            while (true) {
                                ListBuilder.Itr itr = (ListBuilder.Itr) listIterator;
                                if (itr.hasNext()) {
                                    arrayList3.add(((NotificationCategory) itr.next()).name());
                                } else {
                                    EnumEntriesList enumEntriesList = NotificationChannelId.$ENTRIES;
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it3 = enumEntriesList.iterator();
                                    while (it3.hasNext()) {
                                        Object next = it3.next();
                                        if (arrayList3.contains(((NotificationChannelId) next).id)) {
                                            arrayList4.add(next);
                                        }
                                    }
                                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                                    Iterator it4 = arrayList4.iterator();
                                    while (it4.hasNext()) {
                                        arrayList.add(((RealAndroidNotificationSettingsChecker) ((NotificationSettingsChecker) obj2)).notificationChannelState((NotificationChannelId) it4.next()));
                                    }
                                    rememberedValue13 = FlowKt.distinctUntilChanged((arrayList != null || arrayList.isEmpty()) ? new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19) : new CardModelView$textures$$inlined$combine$1((Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]), 8));
                                    gapComposer4.updateRememberedValue(rememberedValue13);
                                }
                            }
                        }
                    }
                    arrayList = null;
                    rememberedValue13 = FlowKt.distinctUntilChanged((arrayList != null || arrayList.isEmpty()) ? new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19) : new CardModelView$textures$$inlined$combine$1((Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]), 8));
                    gapComposer4.updateRememberedValue(rememberedValue13);
                }
                Boolean bool = (Boolean) Updater.collectAsState((Flow) rememberedValue13, Boolean.FALSE, null, gapComposer4, 48, 2).getValue();
                bool.getClass();
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(bool, gapComposer4);
                boolean changedInstance4 = gapComposer4.changedInstance(this);
                Object rememberedValue14 = gapComposer4.rememberedValue();
                if (changedInstance4 || rememberedValue14 == obj8) {
                    continuation2 = null;
                    rememberedValue14 = new SelectPaymentPlanBlockerPresenter$models$1$2(this, continuation2, 8);
                    gapComposer4.updateRememberedValue(rememberedValue14);
                } else {
                    continuation2 = null;
                }
                MutableState produceState3 = Updater.produceState(gapComposer4, continuation2, (Function2) rememberedValue14);
                boolean changed2 = gapComposer4.changed((AccountholderAccountRepository$LoadAccountsResult) produceState3.getValue());
                Object rememberedValue15 = gapComposer4.rememberedValue();
                if (changed2 || rememberedValue15 == obj8) {
                    rememberedValue15 = Updater.derivedStateOf(new ProfileKt$$ExternalSyntheticLambda11(16, this, produceState3));
                    gapComposer4.updateRememberedValue(rememberedValue15);
                }
                State state = (State) rememberedValue15;
                UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) collectAsState2.getValue();
                boolean changedInstance5 = gapComposer4.changedInstance(this) | gapComposer4.changed(collectAsState2) | gapComposer4.changed(str5);
                Object rememberedValue16 = gapComposer4.rememberedValue();
                if (changedInstance5 || rememberedValue16 == obj8) {
                    str2 = str5;
                    mutableState2 = mutableState7;
                    moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(this, str2, collectAsState2, mutableState4, mutableState2, null, 25);
                    gapComposer4.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
                } else {
                    moleculeKt$immediateClockFlow$1$1$1 = rememberedValue16;
                    str2 = str5;
                    mutableState2 = mutableState7;
                }
                Updater.LaunchedEffect(gapComposer4, uiNotificationSettings, (Function2) moleculeKt$immediateClockFlow$1$1$1);
                Updater.LaunchedEffect(gapComposer4, flow, new OffersHomePresenter$models$8$1(flow, (Continuation) null, this, mutableState4, str2, rememberUpdatedState, mutableState6, mutableState5, mutableState2));
                Category category2 = (Category) mutableState4.getValue();
                CategoryListViewModel loaded = category2 != null ? new CategoryListViewModel.Loaded(category2, ((Boolean) mutableState5.getValue()).booleanValue(), ((Boolean) mutableState6.getValue()).booleanValue(), categoryListScreen.title, (NotificationPageHeaderViewModel) state.getValue()) : CategoryListViewModel.Loading.INSTANCE;
                gapComposer4.end(false);
                return loaded;
        }
    }

    public PaymentLoadingPresenter(SendBitcoinNavigator sendBitcoinNavigator, AndroidStringManager androidStringManager, CryptoIdvStatusRepo cryptoIdvStatusRepo, CryptoFlowStarter cryptoFlowStarter, RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl, RealCryptoBalanceRepo realCryptoBalanceRepo, BitcoinLimitsProvider bitcoinLimitsProvider, RealRestrictedBalanceStore realRestrictedBalanceStore, FeatureFlagManager featureFlagManager, CurrencyConverter$Factory currencyConverter$Factory, BetterNavigator.ScreenNavigator screenNavigator) {
        this.paymentNavigator = sendBitcoinNavigator;
        this.blockersNavigator = androidStringManager;
        this.flowStarter = cryptoIdvStatusRepo;
        this.featureFlagManager = cryptoFlowStarter;
        this.observabilityManager = realCryptoBalanceRepo;
        this.analytics = bitcoinLimitsProvider;
        this.args = realRestrictedBalanceStore;
        this.paymentToken = currencyConverter$Factory;
        this.navigator = screenNavigator;
        this.flowToken = realBitcoinInboundNavigator$Factory$Impl.create(screenNavigator);
        this.isRequest = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinEnableShowRestrictedBalance.INSTANCE)).enabled();
    }

    public PaymentLoadingPresenter(RealAccountholderAccountRepository realAccountholderAccountRepository, FeatureFlagManager featureFlagManager, FlowStarter flowStarter, SessionManager sessionManager, RealSettingsEligibilityManager realSettingsEligibilityManager, RealFeatureEligibilityRepository realFeatureEligibilityRepository, AndroidStringManager androidStringManager, Analytics analytics, AccountSwitcherScreen accountSwitcherScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        accountSwitcherScreen.getClass();
        this.paymentNavigator = realAccountholderAccountRepository;
        this.flowStarter = flowStarter;
        this.blockersNavigator = sessionManager;
        this.featureFlagManager = realSettingsEligibilityManager;
        this.observabilityManager = realFeatureEligibilityRepository;
        this.args = androidStringManager;
        this.analytics = analytics;
        this.paymentToken = accountSwitcherScreen;
        this.navigator = screenNavigator;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.flowToken = (JsonFeatureFlags$BusinessAccountsFeeHoliday.FeeHolidayData) ((FeatureFlag$JsonFeatureFlag.Options) realFeatureFlagManager.currentValue(JsonFeatureFlags$BusinessAccountsFeeHoliday.INSTANCE)).value;
        this.isRequest = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$AccountLinking.INSTANCE)).enabled();
    }

    public PaymentLoadingPresenter(RealAccountholderAccountRepository realAccountholderAccountRepository, RealProfileNotificationsRepository realProfileNotificationsRepository, AndroidStringManager androidStringManager, Analytics analytics, AndroidPermissionManager androidPermissionManager, IntentLauncher intentLauncher, FeatureFlagManager featureFlagManager, NotificationSettingsChecker notificationSettingsChecker, ProfileScreens.CategoryListScreen categoryListScreen, BetterNavigator.ScreenNavigator screenNavigator, boolean z) {
        categoryListScreen.getClass();
        this.paymentNavigator = realAccountholderAccountRepository;
        this.blockersNavigator = realProfileNotificationsRepository;
        this.flowStarter = androidStringManager;
        this.analytics = analytics;
        this.observabilityManager = androidPermissionManager;
        this.args = intentLauncher;
        this.featureFlagManager = featureFlagManager;
        this.paymentToken = notificationSettingsChecker;
        this.flowToken = categoryListScreen;
        this.navigator = screenNavigator;
        this.isRequest = z;
    }
}
