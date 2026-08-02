package com.squareup.cash.payments.presenters;

import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.opentelemetry.trace.OtelConventions;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.SsnPresenter;
import com.squareup.cash.cdf.ContactStatus;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.db2.activity.CashActivity;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientP2pPlatformPay;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayment;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.multiplatform.bitcoin.parsers.LightningInvoice;
import com.squareup.cash.offers.presenters.OffersFilterGroupSheetPresenter$models$sheet$2$1$1;
import com.squareup.cash.paychecks.presenters.PaychecksActivityItemHandler;
import com.squareup.cash.paychecks.presenters.PaychecksActivityItemPresenter;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$models$4$1$2;
import com.squareup.cash.payments.RealPaymentInitiator;
import com.squareup.cash.payments.backend.api.PaymentLinkRepository$GetPayLinkDataResult;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager$select$$inlined$map$1$2;
import com.squareup.cash.payments.backend.real.RealPersonalizationRepository;
import com.squareup.cash.payments.backend.real.RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2;
import com.squareup.cash.payments.presenters.PaymentClaimPresenter;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.payments.viewmodels.MainPaymentViewEvent;
import com.squareup.cash.payments.viewmodels.PaymentClaimViewModel;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.recipients.analytics.PaymentType;
import com.squareup.cash.recipients.analytics.RecipientAnalyticsKt;
import com.squareup.cash.recipients.backend.real.RealRecipientFinder;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.paymenttemplate.v1.GetPaymentTemplateRequest;
import com.squareup.protos.cash.paymenttemplate.v1.GetPaymentTemplateResponse;
import com.squareup.protos.cash.paymenttemplate.v1.PaymentTemplate;
import com.squareup.protos.cash.paymenttemplate.v1.PaymentTemplateService;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.ClaimByPaymentTokenRequest;
import com.squareup.protos.franklin.app.ClaimByPaymentTokenResponse;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.StatusResultButton;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.ProtoDefaults;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1;
import kotlinx.coroutines.flow.internal.CombineKt;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MainPaymentPresenter$models$4$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $event;
    public final /* synthetic */ int $r8$classId;
    public Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainPaymentPresenter$models$4$4(Recipient recipient, MainPaymentPresenter mainPaymentPresenter, Money money, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 16;
        this.L$0 = recipient;
        this.this$0 = mainPaymentPresenter;
        this.$event = money;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        Object obj3 = this.$event;
        switch (i) {
            case 0:
                return new MainPaymentPresenter$models$4$4((MainPaymentViewEvent) obj3, (MainPaymentPresenter) obj2, continuation, 0);
            case 1:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$4 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (LocalHomePresenter) obj2, 1);
                mainPaymentPresenter$models$4$4.L$0 = obj;
                return mainPaymentPresenter$models$4$4;
            case 2:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$42 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (VerifyCheckDialogPresenter) obj2, 2);
                mainPaymentPresenter$models$4$42.L$0 = obj;
                return mainPaymentPresenter$models$4$42;
            case 3:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$43 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (LocalHomePresenter) obj2, 3);
                mainPaymentPresenter$models$4$43.L$0 = obj;
                return mainPaymentPresenter$models$4$43;
            case 4:
                return new MainPaymentPresenter$models$4$4((PaychecksActivityItemPresenter) this.L$0, (ActivityItemViewModel) obj3, (ActivityItemViewEvent) obj2, continuation, 4);
            case 5:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$44 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (InviteErrorPresenter) obj2, 5);
                mainPaymentPresenter$models$4$44.L$0 = obj;
                return mainPaymentPresenter$models$4$44;
            case 6:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$45 = new MainPaymentPresenter$models$4$4((MoneyTabPresenter$models$lambda$31$$inlined$map$1) obj3, continuation, (UiCallbackModel) obj2, 6);
                mainPaymentPresenter$models$4$45.L$0 = obj;
                return mainPaymentPresenter$models$4$45;
            case 7:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$46 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (HomeViewPresenter) obj2, 7);
                mainPaymentPresenter$models$4$46.L$0 = obj;
                return mainPaymentPresenter$models$4$46;
            case 8:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$47 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (ShareSheetPresenter) obj2, 8);
                mainPaymentPresenter$models$4$47.L$0 = obj;
                return mainPaymentPresenter$models$4$47;
            case 9:
                return new MainPaymentPresenter$models$4$4((AssetPublicSuffixList) obj3, (String) obj2, continuation, 9);
            case 10:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$48 = new MainPaymentPresenter$models$4$4((RealPersonalizationRepository) obj3, (String) obj2, continuation, 10);
                mainPaymentPresenter$models$4$48.L$0 = obj;
                return mainPaymentPresenter$models$4$48;
            case 11:
                return new MainPaymentPresenter$models$4$4((ZiplineHistoryDataJavaScripter) this.L$0, (CashActivity) obj3, (String) obj2, continuation, 11);
            case 12:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$49 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (TaxReturnsPresenter) obj2, 12);
                mainPaymentPresenter$models$4$49.L$0 = obj;
                return mainPaymentPresenter$models$4$49;
            case 13:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$410 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (SsnPresenter) obj2, 13);
                mainPaymentPresenter$models$4$410.L$0 = obj;
                return mainPaymentPresenter$models$4$410;
            case 14:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$411 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (AddAliasPresenter) obj2, 14);
                mainPaymentPresenter$models$4$411.L$0 = obj;
                return mainPaymentPresenter$models$4$411;
            case 15:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$412 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (TaxReturnsPresenter) obj2, 15);
                mainPaymentPresenter$models$4$412.L$0 = obj;
                return mainPaymentPresenter$models$4$412;
            case 16:
                return new MainPaymentPresenter$models$4$4((Recipient) this.L$0, (MainPaymentPresenter) obj2, (Money) obj3, continuation);
            case 17:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$413 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (TaxReturnsPresenter) obj2, 17);
                mainPaymentPresenter$models$4$413.L$0 = obj;
                return mainPaymentPresenter$models$4$413;
            case 18:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$414 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (TaxReturnsPresenter) obj2, 18);
                mainPaymentPresenter$models$4$414.L$0 = obj;
                return mainPaymentPresenter$models$4$414;
            case 19:
                return new MainPaymentPresenter$models$4$4((LocalPosLocalCashRedemptionPresenter) this.L$0, (MutableState) obj3, (MutableState) obj2, continuation, 19);
            case 20:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$415 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (TaxReturnsPresenter) obj2, 20);
                mainPaymentPresenter$models$4$415.L$0 = obj;
                return mainPaymentPresenter$models$4$415;
            case 21:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$416 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (TaxReturnsPresenter) obj2, 21);
                mainPaymentPresenter$models$4$416.L$0 = obj;
                return mainPaymentPresenter$models$4$416;
            case 22:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$417 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (TaxReturnsPresenter) obj2, 22);
                mainPaymentPresenter$models$4$417.L$0 = obj;
                return mainPaymentPresenter$models$4$417;
            case 23:
                return new MainPaymentPresenter$models$4$4((PaymentClaimPresenter) obj3, (MutableState) obj2, continuation, 23);
            case 24:
                return new MainPaymentPresenter$models$4$4((PaymentConfigurationPresenter) obj3, (MutableState) obj2, continuation, 24);
            case 25:
                return new MainPaymentPresenter$models$4$4((RealPaymentConfigurationRouter) this.L$0, (PaymentRouterData) obj3, (MutableState) obj2, continuation, 25);
            case 26:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$418 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (PaymentLoadingPresenter) obj2, 26);
                mainPaymentPresenter$models$4$418.L$0 = obj;
                return mainPaymentPresenter$models$4$418;
            case 27:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$419 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (TaxReturnsPresenter) obj2, 27);
                mainPaymentPresenter$models$4$419.L$0 = obj;
                return mainPaymentPresenter$models$4$419;
            case 28:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$420 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (InviteErrorPresenter) obj2, 28);
                mainPaymentPresenter$models$4$420.L$0 = obj;
                return mainPaymentPresenter$models$4$420;
            default:
                MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$421 = new MainPaymentPresenter$models$4$4((Flow) obj3, continuation, (ErrorPresenter) obj2, 29);
                mainPaymentPresenter$models$4$421.L$0 = obj;
                return mainPaymentPresenter$models$4$421;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((MainPaymentPresenter$models$4$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:336:0x0643, code lost:
    
        if (r1 == r3) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x05f5, code lost:
    
        if (r0.emit(com.squareup.cash.payments.backend.api.RemotePersonalizedPaymentLoadingState.LoadingPersonalizedPayment.INSTANCE, r31) == r3) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0651, code lost:
    
        if (r0.emit(com.squareup.cash.payments.backend.api.RemotePersonalizedPaymentLoadingState.ErrorLoadingPersonalizedPayment.INSTANCE, r31) != r3) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0692, code lost:
    
        if (r1 == r0) goto L334;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06ef  */
    /* JADX WARN: Type inference failed for: r13v23, types: [com.squareup.protos.common.CurrencyCode] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object contactStatus;
        Recipient recipient;
        Object paymentTemplate;
        Object findByCashtag;
        GetPaymentTemplateResponse getPaymentTemplateResponse;
        com.squareup.cash.db.contacts.Recipient recipient2;
        Recipient.CryptoRecipientPayment cryptoRecipientPayment;
        Object initiate;
        String str;
        Object claimByPaymentToken;
        String str2;
        Screen screen;
        MutableState mutableState;
        Object isReadyToPay;
        MutableState mutableState2;
        int i = this.$r8$classId;
        int i2 = 16;
        int i3 = 21;
        int i4 = 25;
        boolean z = false;
        Object obj2 = this.this$0;
        Object obj3 = this.$event;
        r13 = null;
        InstrumentSelectionData instrumentSelectionData = null;
        switch (i) {
            case 0:
                MainPaymentPresenter mainPaymentPresenter = (MainPaymentPresenter) obj2;
                PaymentScreens.MainPayment mainPayment = mainPaymentPresenter.args;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Recipient recipient3 = ((MainPaymentViewEvent.RecipientViewed) ((MainPaymentViewEvent) obj3)).recipient;
                    String str3 = recipient3.customerId;
                    String str4 = (str3 == null && (str3 = recipient3.lookupKey) == null) ? "" : str3;
                    RealRecipientRepository realRecipientRepository = mainPaymentPresenter.repository;
                    this.L$0 = recipient3;
                    this.label = 1;
                    contactStatus = realRecipientRepository.getContactStatus(str4, this);
                    if (contactStatus == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    recipient = recipient3;
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    recipient = (Recipient) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    contactStatus = obj;
                }
                ContactsStatus contactsStatus = (ContactsStatus) contactStatus;
                ContactStatus analyticsContactStatus = contactsStatus != null ? RecipientAnalyticsKt.toAnalyticsContactStatus(contactsStatus) : ContactStatus.IN_CONTACTS;
                int length = ((CharSequence) mainPaymentPresenter.query.getValue()).length();
                Analytics analytics = mainPaymentPresenter.analytics;
                if (length == 0) {
                    ExperienceType experienceType = ExperienceType.LEGACY;
                    mainPayment.getClass();
                    recipient.getClass();
                    Recipient.Analytics analytics2 = recipient.analytics;
                    if (!(analytics2 != null ? analytics2.isAssetSendViewEventTracked : false)) {
                        Orientation orientation = mainPayment.orientation;
                        orientation.getClass();
                        PaymentType paymentType = orientation == Orientation.BILL ? PaymentType.REQUEST : PaymentType.SEND;
                        String uuid = mainPayment.paymentToken.toString();
                        uuid.getClass();
                        RecipientAnalyticsKt.logAssetViewRecipient(analytics, paymentType, uuid, analyticsContactStatus, recipient.analytics, experienceType, null);
                        if (analytics2 != null) {
                            analytics2.isAssetSendViewEventTracked = true;
                        }
                    }
                } else {
                    String str5 = mainPaymentPresenter.searchFlowToken;
                    mainPayment.getClass();
                    recipient.getClass();
                    Recipient.Analytics analytics3 = recipient.analytics;
                    if (!(analytics3 != null ? analytics3.isRecipientSearchEventTracked : false)) {
                        String uuid2 = mainPayment.paymentToken.toString();
                        uuid2.getClass();
                        Recipient.Analytics analytics4 = recipient.analytics;
                        Map map = RecipientAnalyticsKt.SEARCH_TYPES;
                        RecipientAnalyticsKt.logRecipientSearchViewContact(analytics, uuid2, str5, analyticsContactStatus, analytics4, com.squareup.cash.cdf.recipient.ExperienceType.LEGACY);
                        if (analytics3 != null) {
                            analytics3.isRecipientSearchEventTracked = true;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$2 = new HomeViewPresenter$models$4$1$2(coroutineScope, (LocalHomePresenter) obj2, 9);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$2, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$22 = new HomeViewPresenter$models$4$1$2(coroutineScope2, (VerifyCheckDialogPresenter) obj2, 10);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$22, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$23 = new HomeViewPresenter$models$4$1$2(coroutineScope3, (LocalHomePresenter) obj2, 11);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$23, this) == coroutineSingletons4) {
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
            case 4:
                PaychecksActivityItemPresenter paychecksActivityItemPresenter = (PaychecksActivityItemPresenter) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow handleEvent = ((PaychecksActivityItemHandler) paychecksActivityItemPresenter.eventHandler$delegate.getValue()).handleEvent((ActivityItemViewModel) obj3, (ActivityItemViewEvent) obj2, paychecksActivityItemPresenter.activityItem);
                    this.label = 1;
                    if (FlowKt.collect(handleEvent, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$24 = new HomeViewPresenter$models$4$1$2(coroutineScope4, (InviteErrorPresenter) obj2, 12);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$24, this) == coroutineSingletons6) {
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
            case 6:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$$inlined$CollectEffect$1$1 homeViewPresenter$models$$inlined$CollectEffect$1$1 = new HomeViewPresenter$models$$inlined$CollectEffect$1$1(coroutineScope5, (UiCallbackModel) obj2, r8 ? 1 : 0);
                    this.L$0 = null;
                    this.label = 1;
                    if (((MoneyTabPresenter$models$lambda$31$$inlined$map$1) obj3).collect(homeViewPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons7) {
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
            case 7:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$1 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(i4, coroutineScope6, (HomeViewPresenter) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(offersFilterGroupSheetPresenter$models$sheet$2$1$1, this) == coroutineSingletons8) {
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
            case 8:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$25 = new HomeViewPresenter$models$4$1$2(coroutineScope7, (ShareSheetPresenter) obj2, 13);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$25, this) == coroutineSingletons9) {
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
            case 9:
                AssetPublicSuffixList assetPublicSuffixList = (AssetPublicSuffixList) obj3;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentTemplateService paymentTemplateService = (PaymentTemplateService) assetPublicSuffixList.bytes;
                    GetPaymentTemplateRequest getPaymentTemplateRequest = new GetPaymentTemplateRequest((String) obj2, ByteString.EMPTY);
                    this.label = 1;
                    paymentTemplate = paymentTemplateService.getPaymentTemplate(getPaymentTemplateRequest, this);
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        getPaymentTemplateResponse = (GetPaymentTemplateResponse) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        findByCashtag = obj;
                        recipient2 = (com.squareup.cash.db.contacts.Recipient) findByCashtag;
                        if (recipient2 != null) {
                            PaymentTemplate paymentTemplate2 = getPaymentTemplateResponse.payment_template;
                            paymentTemplate2.getClass();
                            Money money = paymentTemplate2.amount;
                            money.getClass();
                            PaymentTemplate paymentTemplate3 = getPaymentTemplateResponse.payment_template;
                            paymentTemplate3.getClass();
                            String str6 = paymentTemplate3.note;
                            return new PaymentLinkRepository$GetPayLinkDataResult.Success(recipient2, str6 != null ? str6 : "", money);
                        }
                        return PaymentLinkRepository$GetPayLinkDataResult.Failed.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    paymentTemplate = obj;
                }
                ApiResult apiResult = (ApiResult) paymentTemplate;
                if (apiResult instanceof ApiResult.Success) {
                    GetPaymentTemplateResponse getPaymentTemplateResponse2 = (GetPaymentTemplateResponse) ((ApiResult.Success) apiResult).response;
                    GetPaymentTemplateResponse.ErrorCode errorCode = getPaymentTemplateResponse2.error_code;
                    PaymentTemplate paymentTemplate4 = getPaymentTemplateResponse2.payment_template;
                    if (errorCode == null && paymentTemplate4 != null) {
                        String str7 = paymentTemplate4.recipient_cashtag;
                        Money money2 = paymentTemplate4.amount;
                        if ((money2 != null ? money2.currency_code : null) != null && str7 != null) {
                            if (Intrinsics.areEqual(paymentTemplate4.recipient_customer_token, PlatformKt.activeAccountToken((SessionManager) assetPublicSuffixList.readFailure))) {
                                return PaymentLinkRepository$GetPayLinkDataResult.OwnLink.INSTANCE;
                            }
                            money2.getClass();
                            String symbol = Cashtags.symbol(money2.currency_code);
                            RealRecipientFinder realRecipientFinder = (RealRecipientFinder) assetPublicSuffixList.exceptionBytes;
                            str7.getClass();
                            String removePrefix = StringsKt.removePrefix(symbol, str7);
                            this.L$0 = getPaymentTemplateResponse2;
                            this.label = 2;
                            findByCashtag = realRecipientFinder.findByCashtag(symbol, removePrefix, this);
                            if (findByCashtag != coroutineSingletons10) {
                                getPaymentTemplateResponse = getPaymentTemplateResponse2;
                                recipient2 = (com.squareup.cash.db.contacts.Recipient) findByCashtag;
                                if (recipient2 != null) {
                                }
                            }
                            return coroutineSingletons10;
                        }
                    }
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return PaymentLinkRepository$GetPayLinkDataResult.Failed.INSTANCE;
            case 10:
                RealPersonalizationRepository realPersonalizationRepository = (RealPersonalizationRepository) obj3;
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    this.L$0 = null;
                    this.label = 3;
                    break;
                }
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = flowCollector;
                    this.label = 1;
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            SafeTrace.throwOnFailure(obj);
                        } else {
                            if (i15 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Flow flowOn = FlowKt.flowOn((Flow) realPersonalizationRepository.javaScripters.invoke(), realPersonalizationRepository.jsDispatcher);
                Flow flowOn2 = FlowKt.flowOn(new SwipeableState$special$$inlined$filter$1(DBUtil.toFlow(realPersonalizationRepository.reactionsQueries.select$2()), i2), realPersonalizationRepository.ioDispatcher);
                RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2 realPersonalizationRepository$loadPersonalizationFromMosaic$1$2 = new RealPersonalizationRepository$loadPersonalizationFromMosaic$1$2(realPersonalizationRepository, (String) obj2, null);
                RealP2pSettingsManager$select$$inlined$map$1$2 realP2pSettingsManager$select$$inlined$map$1$2 = new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, i3);
                this.L$0 = flowCollector;
                this.label = 2;
                Object combineInternal = CombineKt.combineInternal(this, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, new FlowKt__ZipKt$combine$1$1(realPersonalizationRepository$loadPersonalizationFromMosaic$1$2, r13, r8 ? 1 : 0), realP2pSettingsManager$select$$inlined$map$1$2, new Flow[]{flowOn, flowOn2});
                if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    combineInternal = Unit.INSTANCE;
                    break;
                } else {
                    break;
                }
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 != 0) {
                    if (i16 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) this.L$0;
                CashActivity cashActivity = (CashActivity) obj3;
                String str8 = cashActivity != null ? cashActivity.payment_render_data : null;
                String str9 = cashActivity != null ? cashActivity.sender_render_data : null;
                String str10 = cashActivity != null ? cashActivity.recipient_render_data : null;
                String str11 = cashActivity != null ? cashActivity.receipt_render_data : null;
                this.label = 1;
                Object paymentHistoryData = ziplineHistoryDataJavaScripter.paymentHistoryData(str8, str9, str10, str11, this);
                return paymentHistoryData == coroutineSingletons12 ? coroutineSingletons12 : paymentHistoryData;
            case 12:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$26 = new HomeViewPresenter$models$4$1$2(coroutineScope8, (TaxReturnsPresenter) obj2, 14);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$26, this) == coroutineSingletons13) {
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
            case 13:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$27 = new HomeViewPresenter$models$4$1$2(coroutineScope9, (SsnPresenter) obj2, 15);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$27, this) == coroutineSingletons14) {
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
            case 14:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$28 = new HomeViewPresenter$models$4$1$2(coroutineScope10, (AddAliasPresenter) obj2, i2);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$28, this) == coroutineSingletons15) {
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
            case 15:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$29 = new HomeViewPresenter$models$4$1$2(coroutineScope11, (TaxReturnsPresenter) obj2, 17);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$29, this) == coroutineSingletons16) {
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
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Recipient.CryptoRecipientPayment cryptoRecipientPayment2 = ((Recipient) this.L$0).invoice;
                    if (cryptoRecipientPayment2 != null) {
                        MainPaymentPresenter mainPaymentPresenter2 = (MainPaymentPresenter) obj2;
                        PaymentScreens.MainPayment mainPayment2 = mainPaymentPresenter2.args;
                        Money money3 = (Money) obj3;
                        if (cryptoRecipientPayment2 instanceof Recipient.CryptoRecipientPayment.Bitcoin) {
                            Recipient.CryptoRecipientPayment.Bitcoin bitcoin = (Recipient.CryptoRecipientPayment.Bitcoin) cryptoRecipientPayment2;
                            CryptoPaymentOrigin cryptoPaymentOrigin = mainPayment2.cryptoPaymentOrigin;
                            String str12 = mainPayment2.depositReversalToken;
                            String str13 = str12 == null ? "" : str12;
                            CryptoPaymentOrigin cryptoPaymentOrigin2 = CryptoPaymentOrigin.DEPOSIT_REVERSAL;
                            BitcoinPayments bitcoinPayments = bitcoin.payment;
                            if (cryptoPaymentOrigin == cryptoPaymentOrigin2) {
                                if (bitcoinPayments instanceof BitcoinPayments.Bitcoin) {
                                    BitcoinPayment bitcoinPayment = ((BitcoinPayments.Bitcoin) bitcoinPayments).bitcoinPayment;
                                    String str14 = bitcoinPayment.data;
                                    BitcoinAddress bitcoinAddress = bitcoinPayment.address;
                                    boolean z2 = bitcoinPayment.isUri;
                                    LightningInvoice lightningInvoice = bitcoinPayment.lightningInvoice;
                                    Long l = bitcoinPayment.amount;
                                    str14.getClass();
                                    bitcoinPayments = new BitcoinPayments.Bitcoin(new BitcoinPayment(str14, bitcoinAddress, z2, lightningInvoice, l, str13));
                                } else if (!(bitcoinPayments instanceof BitcoinPayments.Ethereum) && !(bitcoinPayments instanceof BitcoinPayments.Lightning) && !(bitcoinPayments instanceof BitcoinPayments.Stablecoin)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                            }
                            cryptoRecipientPayment = new Recipient.CryptoRecipientPayment.Bitcoin(bitcoinPayments);
                        } else {
                            cryptoRecipientPayment = cryptoRecipientPayment2;
                        }
                        CryptoPaymentManager cryptoPaymentManager = mainPaymentPresenter2.cryptoPaymentManager;
                        UUID uuid3 = mainPayment2.paymentToken;
                        Screen screen2 = mainPayment2.exitScreen;
                        BetterNavigator.ScreenNavigator screenNavigator = mainPaymentPresenter2.navigator;
                        this.label = 1;
                        if (cryptoPaymentManager.initiatePayment(uuid3, cryptoRecipientPayment, money3, screen2, screenNavigator, this) == coroutineSingletons17) {
                            return coroutineSingletons17;
                        }
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$210 = new HomeViewPresenter$models$4$1$2(coroutineScope12, (TaxReturnsPresenter) obj2, 18);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$210, this) == coroutineSingletons18) {
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
            case 18:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$211 = new HomeViewPresenter$models$4$1$2(coroutineScope13, (TaxReturnsPresenter) obj2, 19);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$211, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                MutableState mutableState3 = (MutableState) obj2;
                LocalPosLocalCashRedemptionPresenter localPosLocalCashRedemptionPresenter = (LocalPosLocalCashRedemptionPresenter) this.L$0;
                PaymentScreens.NearbyPaymentKeypad nearbyPaymentKeypad = (PaymentScreens.NearbyPaymentKeypad) localPosLocalCashRedemptionPresenter.localCashRedemption;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPaymentInitiator realPaymentInitiator = (RealPaymentInitiator) localPosLocalCashRedemptionPresenter.store;
                    UUID generate = RealUuidGenerator.generate();
                    Money parseMoneyFromString$default = Moneys.parseMoneyFromString$default((String) ((MutableState) obj3).getValue(), CurrencyCode.USD);
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(TextFieldValueKt.toPaymentRecipient((Recipient) nearbyPaymentKeypad.recipient.getValue()));
                    InstrumentSelection instrumentSelection = (InstrumentSelection) mutableState3.getValue();
                    if (instrumentSelection != null && (str = instrumentSelection.instrument_token) != null) {
                        InstrumentSelection instrumentSelection2 = (InstrumentSelection) mutableState3.getValue();
                        instrumentSelectionData = new InstrumentSelectionData(str, null, null, instrumentSelection2 != null ? instrumentSelection2.accepted_fee_amount : null);
                    }
                    Orientation orientation2 = Orientation.CASH;
                    AppCreationActivity appCreationActivity = AppCreationActivity.IN_APP_SCANNER;
                    ClientScenario.Companion companion = ClientScenario.INSTANCE;
                    Screen screen3 = nearbyPaymentKeypad.exitScreen;
                    String str15 = nearbyPaymentKeypad.nearbySessionToken;
                    this.label = 1;
                    initiate = realPaymentInitiator.initiate(generate, parseMoneyFromString$default, "", listOf, instrumentSelectionData, (r57 & 32) != 0 ? null : null, (r57 & 64) != 0 ? null : null, (r57 & 128) != 0 ? null : null, (r57 & 256) != 0 ? null : null, (r57 & 512) != 0 ? EmptyList.INSTANCE : null, orientation2, appCreationActivity, screen3, (32768 & r57) != 0 ? PaymentScreens$HomeScreens$Home.INSTANCE : screen3, true, false, null, null, null, (2097152 & r57) != 0 ? null : null, (4194304 & r57) != 0 ? null : null, (8388608 & r57) != 0 ? null : "NEARBY", (16777216 & r57) != 0 ? null : null, (33554432 & r57) != 0 ? null : str15, (r57 & 67108864) != 0 ? null : null, this);
                    if (initiate == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    initiate = obj;
                }
                localPosLocalCashRedemptionPresenter.navigator.goTo((Screen) initiate);
                return Unit.INSTANCE;
            case 20:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$212 = new HomeViewPresenter$models$4$1$2(coroutineScope14, (TaxReturnsPresenter) obj2, 20);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$212, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$213 = new HomeViewPresenter$models$4$1$2(coroutineScope15, (TaxReturnsPresenter) obj2, i3);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$213, this) == coroutineSingletons22) {
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
            case 22:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$214 = new HomeViewPresenter$models$4$1$2(coroutineScope16, (TaxReturnsPresenter) obj2, 22);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$214, this) == coroutineSingletons23) {
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
            case 23:
                PaymentClaimPresenter paymentClaimPresenter = (PaymentClaimPresenter) obj3;
                AndroidStringManager androidStringManager = paymentClaimPresenter.stringManager;
                BetterNavigator.ScreenNavigator screenNavigator2 = paymentClaimPresenter.navigator;
                PaymentScreens.PaymentClaim paymentClaim = paymentClaimPresenter.args;
                FlowStarter flowStarter = paymentClaimPresenter.flowStarter;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((MutableState) obj2).setValue(PaymentClaimViewModel.Loading.INSTANCE);
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    AppService appService = paymentClaimPresenter.appService;
                    ClientScenario clientScenario = ClientScenario.PAYMENT_FLOW;
                    ClaimByPaymentTokenRequest claimByPaymentTokenRequest = new ClaimByPaymentTokenRequest(null, paymentClaim.paymentToken, null, ByteString.EMPTY);
                    this.L$0 = generateToken;
                    this.label = 1;
                    claimByPaymentToken = appService.claimByPaymentToken(clientScenario, generateToken, claimByPaymentTokenRequest, this);
                    if (claimByPaymentToken == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                    str2 = generateToken;
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    claimByPaymentToken = obj;
                }
                ApiResult apiResult2 = (ApiResult) claimByPaymentToken;
                boolean z3 = apiResult2 instanceof ApiResult.Success;
                PaymentScreens$HomeScreens$Home paymentScreens$HomeScreens$Home = PaymentScreens$HomeScreens$Home.INSTANCE;
                if (z3) {
                    ClaimByPaymentTokenResponse claimByPaymentTokenResponse = (ClaimByPaymentTokenResponse) ((ApiResult.Success) apiResult2).response;
                    ResponseContext responseContext = claimByPaymentTokenResponse.response_context;
                    ScenarioPlan scenarioPlan = responseContext != null ? responseContext.scenario_plan : null;
                    if (responseContext != null) {
                        List<BlockerDescriptor> list = scenarioPlan != null ? scenarioPlan.blocker_descriptors : null;
                        if (list != null && !list.isEmpty()) {
                            screenNavigator2.goTo(paymentClaimPresenter.blockersDataNavigator.getNext(paymentClaim, OtelConventions.startPlasmaClientScenarioFlow(flowStarter, paymentScreens$HomeScreens$Home, responseContext, str2)));
                        }
                    }
                    ClaimByPaymentTokenResponse.Status status = claimByPaymentTokenResponse.status;
                    if (status == null) {
                        status = ProtoDefaults.CLAIM_BY_PAYMENT_TOKEN_STATUS;
                    }
                    int ordinal = status.ordinal();
                    if (ordinal == 1) {
                        screen = ActivityScreen.INSTANCE;
                    } else if (ordinal == 2) {
                        screen = FlowStarter.startStatusResultFlow$default(flowStarter, PaymentClaimPresenter.Companion.access$statusResult(androidStringManager.get(R.string.payment_claimed_text), androidStringManager.get(R.string.payment_claimed_button_text)), CollectionsKt__CollectionsJVMKt.listOf(paymentClaim.paymentToken), paymentScreens$HomeScreens$Home, null, null, 56);
                    } else {
                        if (ordinal != 3) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1(status, "Unknown status: ");
                            return null;
                        }
                        screen = FlowStarter.startStatusResultFlow$default(flowStarter, PaymentClaimPresenter.Companion.access$statusResult(androidStringManager.get(R.string.payment_failure_text), androidStringManager.get(R.string.payment_failure_button_text)), EmptyList.INSTANCE, paymentScreens$HomeScreens$Home, null, null, 56);
                    }
                    screenNavigator2.goTo(screen);
                } else {
                    if (!(apiResult2 instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator2.goTo(FlowStarter.startStatusResultFlow$default(flowStarter, new StatusResult(StatusResult.Icon.FAILURE, androidStringManager.get(R.string.payment_failure_text), new StatusResultButton(StatusResultButton.ButtonAction.PAY_SCREEN, androidStringManager.get(R.string.payment_failure_button_text), EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)), EmptyList.INSTANCE, paymentScreens$HomeScreens$Home, null, null, 56));
                }
                return Unit.INSTANCE;
            case 24:
                PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) obj3;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState = (MutableState) obj2;
                    if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) paymentConfigurationPresenter.featureFlagManager).currentValue(AmplitudeExperiments$ClientP2pPlatformPay.INSTANCE)).enabled()) {
                        GooglePayPaymentsClient googlePayPaymentsClient = paymentConfigurationPresenter.googlePayPaymentsClient;
                        this.L$0 = mutableState;
                        this.label = 1;
                        isReadyToPay = ((RealGooglePayPaymentsClient) googlePayPaymentsClient).isReadyToPay(this);
                        if (isReadyToPay == coroutineSingletons25) {
                            return coroutineSingletons25;
                        }
                        mutableState2 = mutableState;
                    }
                    mutableState2 = mutableState;
                    mutableState2.setValue(Boolean.valueOf(z));
                    return Unit.INSTANCE;
                }
                if (i29 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutableState2 = (MutableState) this.L$0;
                SafeTrace.throwOnFailure(obj);
                isReadyToPay = obj;
                if (((Boolean) isReadyToPay).booleanValue()) {
                    z = true;
                    mutableState2.setValue(Boolean.valueOf(z));
                    return Unit.INSTANCE;
                }
                mutableState = mutableState2;
                mutableState2 = mutableState;
                mutableState2.setValue(Boolean.valueOf(z));
                return Unit.INSTANCE;
            case 25:
                PaymentRouterData paymentRouterData = (PaymentRouterData) obj3;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPaymentConfigurationRouter realPaymentConfigurationRouter = (RealPaymentConfigurationRouter) this.L$0;
                    this.label = 1;
                    if (realPaymentConfigurationRouter.nextStep(paymentRouterData, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((MutableState) obj2).setValue(paymentRouterData);
                return Unit.INSTANCE;
            case 26:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$12 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(27, coroutineScope17, (PaymentLoadingPresenter) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(offersFilterGroupSheetPresenter$models$sheet$2$1$12, this) == coroutineSingletons27) {
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
            case 27:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$215 = new HomeViewPresenter$models$4$1$2(coroutineScope18, (TaxReturnsPresenter) obj2, 23);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$215, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineScope coroutineScope19 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$216 = new HomeViewPresenter$models$4$1$2(coroutineScope19, (InviteErrorPresenter) obj2, 24);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$216, this) == coroutineSingletons29) {
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
            default:
                CoroutineScope coroutineScope20 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$217 = new HomeViewPresenter$models$4$1$2(coroutineScope20, (ErrorPresenter) obj2, i4);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$217, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MainPaymentPresenter$models$4$4(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.$event = obj2;
        this.this$0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MainPaymentPresenter$models$4$4(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$event = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MainPaymentPresenter$models$4$4(Flow flow, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$event = flow;
        this.this$0 = obj;
    }
}
