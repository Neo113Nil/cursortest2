package androidx.datastore.core;

import android.content.Intent;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.lifecycle.SavedStateHandle;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.sqldelight.ExecutableQuery;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.datadog.android.rum.internal.utils.WriteOperation;
import com.datadog.trace.core.util.Matchers;
import com.fillr.n;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.zxing.Result;
import com.squareup.cash.R;
import com.squareup.cash.api.ContextKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.RegisterAliasPresenter;
import com.squareup.cash.blockers.presenters.RegisterAliasPresenter$createShippingAddressWithAlias$3$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationPresenter;
import com.squareup.cash.card.onboarding.core.CardAssetManager;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$ContouredText;
import com.squareup.cash.card.onboarding.core.CardAssetManager$AssetKey$CopyPan;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.screens.PaymentDeviceCustomizationScreen;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.google.pay.GooglePayService;
import com.squareup.cash.initialscreenloader.backend.ColdStartIntegrityChecker$ColdStartIntegrityCheckResult;
import com.squareup.cash.initialscreenloader.backend.OpenTheAppUserJourney;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenLoader;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenLoader$resetSandbox$2;
import com.squareup.cash.initialscreenloader.backend.RealOpenTheAppUserJourney;
import com.squareup.cash.initialscreenloader.screens.GenericErrorScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.intent.RealIntentHandler;
import com.squareup.cash.marketcapabilities.screens.MarketCapabilitiesErrorScreen;
import com.squareup.cash.onboarding.check.IntegrityCheckFactory$Type;
import com.squareup.cash.onboarding.check.IntegrityChecker$Result;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import com.squareup.cash.onboarding.util.RealAliasRegistrar;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.profile.screens.ProfileUnavailableScreen;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securitysignals.backend.RealSecuritySignalsAggregator;
import com.squareup.cash.securitysignals.models.SignalsContext;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashliteflow.blockers.v1.CashLiteGooglePayPushProvisioningInputs;
import com.squareup.protos.cash.cashliteflow.blockers.v1.GooglePayPushProvisioningFailureReason;
import com.squareup.protos.cash.cashliteflow.blockers.v1.PushProvisioningStatus;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.CompleteScenarioRequest;
import com.squareup.protos.franklin.app.CustomizationInputs;
import com.squareup.protos.franklin.app.PaymentDeviceCustomizationRequest;
import com.squareup.protos.franklin.app.PaymentDeviceType;
import com.squareup.protos.franklin.app.ProvisionDigitalWalletTokenRequest;
import com.squareup.protos.franklin.app.SelectOptionRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest$Request$Request$CashLiteGooglePayPushProvisioningInputs;
import com.squareup.protos.franklin.app.SubmitBlockerRequest$Request$Request$PaymentDeviceCustomizationRequest;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.app.VerifyContactsRequest;
import com.squareup.protos.franklin.common.DigitalWalletToken$Issuer;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningRequestData;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningRequestData$ProviderRequest$GooglePayRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.domain.UpdateCachedAccounts;
import com.stripe.android.financialconnections.exception.AccountNumberRetrievalError;
import com.stripe.android.financialconnections.exception.UnclassifiedError;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkedAccount;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.features.success.SuccessViewModel;
import com.stripe.android.financialconnections.model.AddNewAccount;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.Display;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.model.NetworkedAccountsList;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.model.ReturningNetworkingUserAccountPicker;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.ui.TextResource;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobKt;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okio.ByteString;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class DataStoreImpl$readDataOrHandleCorruption$3 extends SuspendLambda implements Function1 {
    public Object $newData;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $version;
    public Object L$0;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataStoreImpl$readDataOrHandleCorruption$3(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.$newData = obj2;
        this.this$0 = obj3;
        this.$version = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x002d, code lost:
    
        if (r6 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$stripe$android$financialconnections$features$success$SuccessViewModel$1(Object obj) {
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        SuccessContentRepository.State state;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str2 = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            GetOrFetchSync getOrFetchSync = (GetOrFetchSync) this.$newData;
            this.label = 1;
            obj = GetOrFetchSync.invoke$default(getOrFetchSync, null, this, 3);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.L$0;
                SafeTrace.throwOnFailure(obj);
                List list = (List) obj;
                state = (SuccessContentRepository.State) ((SuccessViewModel) this.$version).successContentRepository.get();
                if (state != null || (r1 = state.heading) == null) {
                    TextResource stringId = new TextResource.StringId(R.string.stripe_success_pane_title);
                }
                if (state != null || (r5 = state.message) == null) {
                    TextResource pluralId = new TextResource.PluralId(R.string.stripe_success_pane_desc_singular, R.string.stripe_success_pane_desc_plural, list.size());
                }
                Boolean bool = financialConnectionsSessionManifest.skipSuccessPane;
                boolean booleanValue = bool == null ? bool.booleanValue() : false;
                str = financialConnectionsSessionManifest.businessName;
                if (str != null) {
                    Map map = financialConnectionsSessionManifest.features;
                    if (map != null ? Intrinsics.areEqual(map.get("bank_connections_continue_with_merchant_text"), Boolean.TRUE) : false) {
                        str2 = str;
                    }
                }
                return new SuccessState.Payload(str2, stringId, pluralId, booleanValue);
            }
            SafeTrace.throwOnFailure(obj);
        }
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = ((SynchronizeSessionResponse) obj).manifest;
        GetCachedAccounts getCachedAccounts = (GetCachedAccounts) this.this$0;
        this.L$0 = financialConnectionsSessionManifest2;
        this.label = 2;
        Object invoke = getCachedAccounts.invoke(this);
        if (invoke != coroutineSingletons) {
            financialConnectionsSessionManifest = financialConnectionsSessionManifest2;
            obj = invoke;
            List list2 = (List) obj;
            state = (SuccessContentRepository.State) ((SuccessViewModel) this.$version).successContentRepository.get();
            if (state != null) {
            }
            TextResource stringId2 = new TextResource.StringId(R.string.stripe_success_pane_title);
            if (state != null) {
            }
            TextResource pluralId2 = new TextResource.PluralId(R.string.stripe_success_pane_desc_singular, R.string.stripe_success_pane_desc_plural, list2.size());
            Boolean bool2 = financialConnectionsSessionManifest.skipSuccessPane;
            if (bool2 == null) {
            }
            str = financialConnectionsSessionManifest.businessName;
            if (str != null) {
            }
            return new SuccessState.Payload(str2, stringId2, pluralId2, booleanValue);
        }
        return coroutineSingletons;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$version;
        switch (i) {
            case 0:
                return new DataStoreImpl$readDataOrHandleCorruption$3((Ref$ObjectRef) this.$newData, (DataStoreImpl) this.this$0, (Ref$IntRef) obj, continuation, 0);
            case 1:
                return new DataStoreImpl$readDataOrHandleCorruption$3((Transition) this.L$0, (SeekableTransitionState) this.$newData, this.this$0, (FiniteAnimationSpec) obj, continuation, 1);
            case 2:
                return new DataStoreImpl$readDataOrHandleCorruption$3((QueryResult.AsyncValue) this.L$0, (ArrayList) this.$newData, (ExecutableQuery) this.this$0, (AndroidCursor) obj, continuation, 2);
            case 3:
                return new DataStoreImpl$readDataOrHandleCorruption$3((QueryResult.AsyncValue) this.$newData, (ExecutableQuery) this.this$0, (AndroidCursor) obj, continuation, 3);
            case 4:
                return new DataStoreImpl$readDataOrHandleCorruption$3((RegisterAliasPresenter) this.L$0, (BlockersScreens.RegisterAliasScreen.RegisterAliasType.CreateShippingAddressWithAlias) this.$newData, (AliasRegistrar$Args.DeliveryMechanism) this.this$0, (String) obj, continuation, 4);
            case 5:
                return new DataStoreImpl$readDataOrHandleCorruption$3((RegisterAliasPresenter) this.L$0, (String) this.$newData, (AliasRegistrar$Args.DeliveryMechanism) this.this$0, (SignalsContext) obj, continuation, 5);
            case 6:
                return new DataStoreImpl$readDataOrHandleCorruption$3((PaymentDeviceCustomizationPresenter) this.L$0, (String) this.$newData, (PaymentDeviceType) this.this$0, (CustomizationInputs) obj, continuation, 6);
            case 7:
                return new DataStoreImpl$readDataOrHandleCorruption$3((CompletableDeferredImpl) this.$newData, (CardScene) this.this$0, (CardAssetManager$AssetKey$CopyPan) obj, continuation, 7);
            case 8:
                return new DataStoreImpl$readDataOrHandleCorruption$3((CompletableDeferredImpl) this.$newData, (WriteOperation) this.this$0, (CardAssetManager$AssetKey$ContouredText) obj, continuation, 8);
            case 9:
                return new DataStoreImpl$readDataOrHandleCorruption$3((RealBlockersHelper) this.L$0, (ClientScenario) this.$newData, (BlockersData) this.this$0, (SelectOptionRequest) obj, continuation, 9);
            case 10:
                return new DataStoreImpl$readDataOrHandleCorruption$3((RealClientScenarioCompleter) this.L$0, (ClientScenario) this.$newData, (BlockersData) this.this$0, (List) obj, continuation, 10);
            case 11:
                return new DataStoreImpl$readDataOrHandleCorruption$3((Result) this.L$0, (ClientScenario) this.$newData, (String) this.this$0, (VerifyContactsRequest) obj, continuation, 11);
            case 12:
                return new DataStoreImpl$readDataOrHandleCorruption$3((MarkwonConfiguration) this.L$0, (BlockersScreens.ProvisionGooglePayScreen) this.$newData, (DigitalWalletTokenProvisioningCompletionData.ProvisioningResult) this.this$0, (String) obj, continuation, 12);
            case 13:
                return new DataStoreImpl$readDataOrHandleCorruption$3((n) this.L$0, (BlockersScreens.ProvisionGooglePayScreen) this.$newData, (String) this.this$0, (String) obj, continuation, 13);
            case 14:
                return new DataStoreImpl$readDataOrHandleCorruption$3((RealInitialScreenLoader) this.$newData, (Intent) this.this$0, (Function2) obj, continuation, 14);
            case 15:
                return new DataStoreImpl$readDataOrHandleCorruption$3((PollAttachPaymentAccount) this.L$0, (PaymentAccountParams) this.$newData, (FinancialConnectionsInstitution) this.this$0, (SynchronizeSessionResponse) obj, continuation, 15);
            case 16:
                return new DataStoreImpl$readDataOrHandleCorruption$3((LinkAccountPickerViewModel) obj, continuation, 16);
            case 17:
                return new DataStoreImpl$readDataOrHandleCorruption$3((LinkAccountPickerViewModel) obj, continuation, 17);
            case 18:
                return new DataStoreImpl$readDataOrHandleCorruption$3((GetOrFetchSync) this.$newData, (GetCachedAccounts) this.this$0, (SuccessViewModel) obj, continuation, 18);
            default:
                return new DataStoreImpl$readDataOrHandleCorruption$3((GovernmentIdState.HolographicTorchDelay) this.L$0, (SubtreeManager) this.$newData, (GovernmentIdWorkflow.Input) this.this$0, (POPMatchingFactory) obj, continuation, 19);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((DataStoreImpl$readDataOrHandleCorruption$3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0219, code lost:
    
        if (r1 == r0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0476, code lost:
    
        if (r12.set(r7, r61) == r13) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x046a, code lost:
    
        if (r7 == r13) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x045c, code lost:
    
        if (r7 == r13) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04e8, code lost:
    
        if (r0 == r13) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04fc, code lost:
    
        if (r0 == r13) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0510, code lost:
    
        if (r0 == r13) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0432, code lost:
    
        if (r9 == r13) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x091d, code lost:
    
        if (r2 == r1) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x099c, code lost:
    
        if (r3 != r2) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0980, code lost:
    
        if (r3 == r2) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0a67, code lost:
    
        if (r0 != r2) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01cb, code lost:
    
        if (com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel.access$selectAccounts(r8, r1, r3, r2, r61) == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01da, code lost:
    
        if (com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel.access$handleNonSuccessNextPane(r8, r9, r1, r61) == r0) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0259  */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:394:0x099c -> B:390:0x09a0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object writeData$datastore_core_release;
        Object readDataFromFileOrDefault;
        Ref$ObjectRef ref$ObjectRef;
        Object version;
        Ref$IntRef ref$IntRef;
        Object invoke;
        Object obj2;
        Object invoke2;
        Object obj3;
        Object submitBlocker;
        Object acquire;
        CompletableDeferredImpl completableDeferredImpl;
        Object acquire2;
        CompletableDeferredImpl completableDeferredImpl2;
        GooglePayPushProvisioningFailureReason googlePayPushProvisioningFailureReason;
        Object withContext;
        Object invoke3;
        Object invoke4;
        Object invoke5;
        Object obj4;
        Object access$recoverPrincipalAccountToken;
        Map map;
        Object postAttachPaymentAccountToLinkAccountSession;
        Object invoke$default;
        SynchronizeSessionResponse synchronizeSessionResponse;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        Object networkedAccounts;
        CachedConsumerSession cachedConsumerSession;
        ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker;
        Object obj5;
        ConsentPane consentPane;
        Object obj6;
        TextUpdate textUpdate;
        LinkAccountPickerState.Payload payload;
        ArrayList arrayList;
        List list;
        List list2;
        int i = this.$r8$classId;
        int i2 = 3;
        int i3 = 2;
        Object obj7 = this.$version;
        Continuation continuation = null;
        continuation = null;
        switch (i) {
            case 0:
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) obj7;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.$newData;
                DataStoreImpl dataStoreImpl = (DataStoreImpl) this.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                try {
                } catch (CorruptionException unused) {
                    Object obj8 = ref$ObjectRef2.element;
                    this.L$0 = ref$IntRef2;
                    this.label = 3;
                    writeData$datastore_core_release = dataStoreImpl.writeData$datastore_core_release(obj8, true, this);
                    break;
                }
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = ref$ObjectRef2;
                    this.label = 1;
                    readDataFromFileOrDefault = dataStoreImpl.readDataFromFileOrDefault(this);
                    if (readDataFromFileOrDefault == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Ref$IntRef ref$IntRef3 = (Ref$IntRef) ((Serializable) this.L$0);
                            SafeTrace.throwOnFailure(obj);
                            ref$IntRef = ref$IntRef3;
                            version = obj;
                            ref$IntRef.element = ((Number) version).intValue();
                            return Unit.INSTANCE;
                        }
                        if (i4 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ref$IntRef2 = (Ref$IntRef) ((Serializable) this.L$0);
                        SafeTrace.throwOnFailure(obj);
                        writeData$datastore_core_release = obj;
                        ref$IntRef2.element = ((Number) writeData$datastore_core_release).intValue();
                        return Unit.INSTANCE;
                    }
                    Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) ((Serializable) this.L$0);
                    SafeTrace.throwOnFailure(obj);
                    ref$ObjectRef = ref$ObjectRef3;
                    readDataFromFileOrDefault = obj;
                }
                ref$ObjectRef.element = readDataFromFileOrDefault;
                SingleProcessCoordinator coordinator = dataStoreImpl.getCoordinator();
                this.L$0 = ref$IntRef2;
                this.label = 2;
                version = coordinator.getVersion();
                if (version == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$IntRef = ref$IntRef2;
                ref$IntRef.element = ((Number) version).intValue();
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = new NetworkFetcher$doFetch$fetchResult$1((SeekableTransitionState) this.$newData, this.this$0, (Transition) this.L$0, (FiniteAnimationSpec) obj7, (Continuation) null);
                    this.label = 1;
                    if (JobKt.coroutineScope(networkFetcher$doFetch$fetchResult$1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((Transition) this.L$0).onTransitionEnd$animation_core();
                return Unit.INSTANCE;
            case 2:
                ExecutableQuery executableQuery = (ExecutableQuery) this.this$0;
                ArrayList arrayList2 = (ArrayList) this.$newData;
                AndroidCursor androidCursor = (AndroidCursor) obj7;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Function1 function1 = ((QueryResult.AsyncValue) this.L$0).getter;
                    this.label = 1;
                    invoke = function1.invoke(this);
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        obj2 = obj;
                        if (((Boolean) obj2).booleanValue()) {
                            arrayList2.add(executableQuery.mapper.invoke(androidCursor));
                            QueryResult.Value next = androidCursor.next();
                            this.label = 2;
                            obj2 = next.value;
                            break;
                        }
                        return arrayList2;
                    }
                    SafeTrace.throwOnFailure(obj);
                    invoke = obj;
                }
                if (((Boolean) invoke).booleanValue()) {
                    arrayList2.add(executableQuery.mapper.invoke(androidCursor));
                    QueryResult.Value next2 = androidCursor.next();
                    this.label = 2;
                    obj2 = next2.value;
                }
                return arrayList2;
            case 3:
                AndroidCursor androidCursor2 = (AndroidCursor) obj7;
                ExecutableQuery executableQuery2 = (ExecutableQuery) this.this$0;
                Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Function1 function12 = ((QueryResult.AsyncValue) this.$newData).getter;
                    this.label = 1;
                    invoke2 = function12.invoke(this);
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj9 = this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        obj3 = obj;
                        if (((Boolean) obj3).booleanValue()) {
                            Handlers$$ExternalSyntheticBUOutline0.m(executableQuery2, "ResultSet returned more than 1 row for ");
                            return null;
                        }
                        return obj9;
                    }
                    SafeTrace.throwOnFailure(obj);
                    invoke2 = obj;
                }
                if (!((Boolean) invoke2).booleanValue()) {
                    return null;
                }
                Object invoke6 = executableQuery2.mapper.invoke(androidCursor2);
                QueryResult.Value next3 = androidCursor2.next();
                this.L$0 = invoke6;
                this.label = 2;
                obj3 = next3.value;
                if (obj3 != obj9) {
                    obj9 = invoke6;
                    if (((Boolean) obj3).booleanValue()) {
                    }
                }
                return obj9;
            case 4:
                RegisterAliasPresenter registerAliasPresenter = (RegisterAliasPresenter) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Analytics analytics = registerAliasPresenter.analytics;
                BlockersData copy$default = BlockersData.copy$default(registerAliasPresenter.args.blockersData, null, registerAliasPresenter.flowToken, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -3, 65535);
                AndroidStringManager androidStringManager = registerAliasPresenter.stringManager;
                RegisterAliasPresenter$createShippingAddressWithAlias$3$1 registerAliasPresenter$createShippingAddressWithAlias$3$1 = new RegisterAliasPresenter$createShippingAddressWithAlias$3$1(registerAliasPresenter, (BlockersScreens.RegisterAliasScreen.RegisterAliasType.CreateShippingAddressWithAlias) this.$newData, (AliasRegistrar$Args.DeliveryMechanism) this.this$0, (String) obj7, null);
                this.label = 1;
                Object trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, copy$default, analytics, androidStringManager, this, null, registerAliasPresenter$createShippingAddressWithAlias$3$1);
                return trackBlockerSubmissionAnalytics$default == coroutineSingletons4 ? coroutineSingletons4 : trackBlockerSubmissionAnalytics$default;
            case 5:
                RegisterAliasPresenter registerAliasPresenter2 = (RegisterAliasPresenter) this.L$0;
                BlockersScreens.RegisterAliasScreen registerAliasScreen = registerAliasPresenter2.args;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 != 0) {
                    if (i9 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealAliasRegistrar realAliasRegistrar = registerAliasPresenter2.aliasRegistrar;
                AliasRegistrar$Args aliasRegistrar$Args = new AliasRegistrar$Args((String) this.$newData, (AliasRegistrar$Args.DeliveryMechanism) this.this$0, RequestContext.copy$default(registerAliasScreen.blockersData.requestContext, null, null, null, null, null, null, null, ((RealSecuritySignalsAggregator) registerAliasPresenter2.securitySignalsAggregator).buildSignalsContext((SignalsContext) obj7), null, null, null, null, 8063), registerAliasScreen.blockersData.clientScenario, registerAliasPresenter2.flowToken, Intrinsics.areEqual((String) this.$newData, (Object) null), null, 64);
                this.label = 1;
                Object register = realAliasRegistrar.register(aliasRegistrar$Args, this);
                return register == coroutineSingletons5 ? coroutineSingletons5 : register;
            case 6:
                PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter = (PaymentDeviceCustomizationPresenter) this.L$0;
                PaymentDeviceCustomizationScreen paymentDeviceCustomizationScreen = paymentDeviceCustomizationPresenter.args;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = paymentDeviceCustomizationPresenter.appService;
                    ClientScenario clientScenario = paymentDeviceCustomizationScreen.blockersData.clientScenario;
                    clientScenario.getClass();
                    String str = paymentDeviceCustomizationScreen.blockersData.flowToken;
                    SubmitBlockerRequest.Request.Builder builder = new SubmitBlockerRequest.Request.Builder();
                    String str2 = paymentDeviceCustomizationScreen.blockersData.blockerId;
                    str2.getClass();
                    builder.blocker_descriptor_id = str2;
                    builder.request = new SubmitBlockerRequest$Request$Request$PaymentDeviceCustomizationRequest(new PaymentDeviceCustomizationRequest(paymentDeviceCustomizationScreen.blockersData.requestContext, (String) this.$newData, (PaymentDeviceType) this.this$0, (CustomizationInputs) obj7, ByteString.EMPTY));
                    SubmitBlockerRequest submitBlockerRequest = new SubmitBlockerRequest(null, CollectionsKt__CollectionsJVMKt.listOf(builder.build()), 11);
                    this.label = 1;
                    submitBlocker = appService.submitBlocker(clientScenario, str, submitBlockerRequest, this);
                    if (submitBlocker == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    submitBlocker = obj;
                }
                ApiResult apiResult = (ApiResult) submitBlocker;
                if (apiResult instanceof ApiResult.Success) {
                    SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) ((ApiResult.Success) apiResult).response;
                    ResponseContext mergeResponseContexts = ContextKt.mergeResponseContexts(submitBlockerResponse.app_response_context, submitBlockerResponse.blocker_response_context, submitBlockerResponse.flow_response_context);
                    return Matcher$$ExternalSyntheticOutline0.m(mergeResponseContexts, mergeResponseContexts);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 7:
                CompletableDeferredImpl completableDeferredImpl3 = (CompletableDeferredImpl) this.$newData;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                try {
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = completableDeferredImpl3;
                        this.label = 1;
                        acquire = ((CardScene) this.this$0).assetManager.acquire((CardAssetManager$AssetKey$CopyPan) obj7, this);
                        if (acquire == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                        completableDeferredImpl = completableDeferredImpl3;
                    } else {
                        if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        completableDeferredImpl = (CompletableDeferredImpl) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        acquire = obj;
                    }
                    completableDeferredImpl.complete(acquire);
                } catch (CancellationException e) {
                    completableDeferredImpl3.cancelInternal(e);
                    throw e;
                } catch (Exception e2) {
                    completableDeferredImpl3.completeExceptionally(e2);
                }
                return Unit.INSTANCE;
            case 8:
                CompletableDeferredImpl completableDeferredImpl4 = (CompletableDeferredImpl) this.$newData;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                try {
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = completableDeferredImpl4;
                        this.label = 1;
                        acquire2 = ((CardAssetManager) ((WriteOperation) this.this$0).writeScope).acquire((CardAssetManager$AssetKey$ContouredText) obj7, this);
                        if (acquire2 == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                        completableDeferredImpl2 = completableDeferredImpl4;
                    } else {
                        if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        completableDeferredImpl2 = (CompletableDeferredImpl) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        acquire2 = obj;
                    }
                    completableDeferredImpl2.complete(acquire2);
                } catch (CancellationException e3) {
                    completableDeferredImpl4.cancelInternal(e3);
                    throw e3;
                } catch (Exception e4) {
                    completableDeferredImpl4.completeExceptionally(e4);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object selectOption = ((RealBlockersHelper) this.L$0).appService.selectOption((ClientScenario) this.$newData, ((BlockersData) this.this$0).flowToken, (SelectOptionRequest) obj7, this);
                    return selectOption == coroutineSingletons9 ? coroutineSingletons9 : selectOption;
                }
                if (i13 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 != 0) {
                    if (i14 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService2 = ((RealClientScenarioCompleter) this.L$0).appService;
                ClientScenario clientScenario2 = (ClientScenario) this.$newData;
                BlockersData blockersData = (BlockersData) this.this$0;
                String str3 = blockersData.flowToken;
                BlockersData.MoneybotContext moneybotContext = blockersData.moneybotContext;
                String str4 = moneybotContext != null ? moneybotContext.sessionId : null;
                String str5 = moneybotContext != null ? moneybotContext.toolRequestId : null;
                String str6 = str4;
                CompleteScenarioRequest completeScenarioRequest = new CompleteScenarioRequest(29, null, (List) obj7);
                this.label = 1;
                Object completeScenario = appService2.completeScenario(clientScenario2, str3, str6, str5, completeScenarioRequest, this);
                return completeScenario == coroutineSingletons10 ? coroutineSingletons10 : completeScenario;
            case 11:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object verifyContacts = ((AppService) ((Result) this.L$0).text).verifyContacts((ClientScenario) this.$newData, (String) this.this$0, (VerifyContactsRequest) obj7, this);
                    return verifyContacts == coroutineSingletons11 ? coroutineSingletons11 : verifyContacts;
                }
                if (i15 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
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
                AppService appService3 = (AppService) ((MarkwonConfiguration) this.L$0).syntaxHighlight;
                BlockersData blockersData2 = ((BlockersScreens.ProvisionGooglePayScreen) this.$newData).blockersData;
                ClientScenario clientScenario3 = blockersData2.clientScenario;
                if (clientScenario3 == null) {
                    clientScenario3 = ClientScenario.PLASMA;
                }
                String str7 = blockersData2.flowToken;
                DigitalWalletTokenProvisioningCompletionData.ProvisioningResult provisioningResult = (DigitalWalletTokenProvisioningCompletionData.ProvisioningResult) this.this$0;
                String str8 = (String) obj7;
                int ordinal = provisioningResult.ordinal();
                PushProvisioningStatus pushProvisioningStatus = ordinal != 0 ? ordinal != 1 ? PushProvisioningStatus.PUSH_PROVISIONING_STATUS_FAILED : PushProvisioningStatus.PUSH_PROVISIONING_STATUS_USER_CANCELED : PushProvisioningStatus.PUSH_PROVISIONING_STATUS_SUCCESS;
                int ordinal2 = provisioningResult.ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    switch (ordinal2) {
                        case 9:
                            googlePayPushProvisioningFailureReason = GooglePayPushProvisioningFailureReason.GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_NO_ACTIVE_WALLET;
                            break;
                        case 10:
                            googlePayPushProvisioningFailureReason = GooglePayPushProvisioningFailureReason.GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_TOKEN_NOT_FOUND;
                            break;
                        case 11:
                            googlePayPushProvisioningFailureReason = GooglePayPushProvisioningFailureReason.GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_INVALID_TOKEN_STATE;
                            break;
                        case 12:
                            googlePayPushProvisioningFailureReason = GooglePayPushProvisioningFailureReason.GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_ATTESTATION_ERROR;
                            break;
                        case 13:
                            googlePayPushProvisioningFailureReason = GooglePayPushProvisioningFailureReason.GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_TAP_AND_PAY_UNAVAILABLE;
                            break;
                        default:
                            googlePayPushProvisioningFailureReason = GooglePayPushProvisioningFailureReason.GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNKNOWN_ERROR;
                            break;
                    }
                } else {
                    googlePayPushProvisioningFailureReason = null;
                }
                ByteString byteString = ByteString.EMPTY;
                SubmitBlockerRequest submitBlockerRequest2 = new SubmitBlockerRequest(null, CollectionsKt__CollectionsJVMKt.listOf(new SubmitBlockerRequest.Request(str8, new SubmitBlockerRequest$Request$Request$CashLiteGooglePayPushProvisioningInputs(new CashLiteGooglePayPushProvisioningInputs(pushProvisioningStatus, googlePayPushProvisioningFailureReason, byteString)), byteString)), 11);
                this.label = 1;
                Object submitBlocker2 = appService3.submitBlocker(clientScenario3, str7, submitBlockerRequest2, this);
                return submitBlocker2 == coroutineSingletons12 ? coroutineSingletons12 : submitBlocker2;
            case 13:
                BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen = (BlockersScreens.ProvisionGooglePayScreen) this.$newData;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 != 0) {
                    if (i17 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                GooglePayService googlePayService = (GooglePayService) ((n) this.L$0).b;
                ClientScenario clientScenario4 = ClientScenario.PROVISION_GOOGLE_PAY;
                String str9 = provisionGooglePayScreen.blockersData.flowToken;
                DigitalWalletToken$Issuer digitalWalletToken$Issuer = DigitalWalletToken$Issuer.ANDROID_PAY;
                ByteString byteString2 = ByteString.EMPTY;
                ProvisionDigitalWalletTokenRequest provisionDigitalWalletTokenRequest = new ProvisionDigitalWalletTokenRequest(new DigitalWalletTokenProvisioningRequestData(digitalWalletToken$Issuer, new DigitalWalletTokenProvisioningRequestData$ProviderRequest$GooglePayRequest(new DigitalWalletTokenProvisioningRequestData.GooglePayRequest((String) this.this$0, (String) obj7, byteString2)), byteString2), provisionGooglePayScreen.blockersData.requestContext, byteString2);
                this.label = 1;
                Object provisionDigitalWalletToken = googlePayService.provisionDigitalWalletToken(clientScenario4, str9, provisionDigitalWalletTokenRequest, this);
                return provisionDigitalWalletToken == coroutineSingletons13 ? coroutineSingletons13 : provisionDigitalWalletToken;
            case 14:
                Intent intent = (Intent) this.this$0;
                Function2 function2 = (Function2) obj7;
                RealInitialScreenLoader realInitialScreenLoader = (RealInitialScreenLoader) this.$newData;
                Navigator navigator = realInitialScreenLoader.unlockedNavigator;
                KeyValue keyValue = realInitialScreenLoader.principalAccountToken;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (this.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        CoroutineContext coroutineContext = realInitialScreenLoader.ioDispatcher;
                        RealInitialScreenLoader$resetSandbox$2 realInitialScreenLoader$resetSandbox$2 = new RealInitialScreenLoader$resetSandbox$2(realInitialScreenLoader, continuation, i3);
                        this.label = 1;
                        withContext = JobKt.withContext(coroutineContext, realInitialScreenLoader$resetSandbox$2, this);
                        break;
                    case 1:
                        SafeTrace.throwOnFailure(obj);
                        withContext = obj;
                        ColdStartIntegrityChecker$ColdStartIntegrityCheckResult coldStartIntegrityChecker$ColdStartIntegrityCheckResult = (ColdStartIntegrityChecker$ColdStartIntegrityCheckResult) withContext;
                        if (!(coldStartIntegrityChecker$ColdStartIntegrityCheckResult instanceof ColdStartIntegrityChecker$ColdStartIntegrityCheckResult.Success)) {
                            if (!(coldStartIntegrityChecker$ColdStartIntegrityCheckResult instanceof ColdStartIntegrityChecker$ColdStartIntegrityCheckResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ColdStartIntegrityChecker$ColdStartIntegrityCheckResult.Failure failure = (ColdStartIntegrityChecker$ColdStartIntegrityCheckResult.Failure) coldStartIntegrityChecker$ColdStartIntegrityCheckResult;
                            IntegrityChecker$Result.Failure failure2 = failure.mandatoryCheckFailure;
                            Iterator it = CollectionsKt.plus((Collection) failure.optionalCheckFailures, (Object) failure2).iterator();
                            while (it.hasNext()) {
                                RealInitialScreenLoader.access$logError(realInitialScreenLoader, (IntegrityChecker$Result.Failure) it.next());
                            }
                            IntegrityCheckFactory$Type type2 = failure2.integrityCheck.getType();
                            int ordinal3 = type2.ordinal();
                            if (ordinal3 != 0) {
                                if (ordinal3 != 1) {
                                    if (ordinal3 != 2 && ordinal3 != 3) {
                                        OptionalProvider$$ExternalSyntheticLambda0.m$1(type2, "Missing error handling for ");
                                        return null;
                                    }
                                    this.L$0 = null;
                                    this.label = 7;
                                    invoke5 = function2.invoke(GenericErrorScreen.INSTANCE, this);
                                    break;
                                } else {
                                    this.L$0 = null;
                                    this.label = 6;
                                    invoke4 = function2.invoke(MarketCapabilitiesErrorScreen.INSTANCE, this);
                                    break;
                                }
                            } else {
                                this.L$0 = null;
                                this.label = 5;
                                invoke3 = function2.invoke(ProfileUnavailableScreen.INSTANCE, this);
                                break;
                            }
                        } else {
                            Iterator it2 = ((ColdStartIntegrityChecker$ColdStartIntegrityCheckResult.Success) coldStartIntegrityChecker$ColdStartIntegrityCheckResult).optionalCheckFailures.iterator();
                            while (it2.hasNext()) {
                                RealInitialScreenLoader.access$logError(realInitialScreenLoader, (IntegrityChecker$Result.Failure) it2.next());
                            }
                            this.label = 2;
                            obj4 = keyValue.get(this);
                            break;
                        }
                        return coroutineSingletons14;
                    case 2:
                        SafeTrace.throwOnFailure(obj);
                        obj4 = obj;
                        if (obj4 == null) {
                            this.L$0 = keyValue;
                            this.label = 3;
                            access$recoverPrincipalAccountToken = RealInitialScreenLoader.access$recoverPrincipalAccountToken(realInitialScreenLoader, this);
                            break;
                        }
                        JobKt.launch$default(realInitialScreenLoader.coroutineScope, null, null, new RealInitialScreenLoader$resetSandbox$2(realInitialScreenLoader, continuation, i2), 3);
                        navigator.goTo(PaymentScreens$HomeScreens$Home.INSTANCE);
                        ((RealOpenTheAppUserJourney) realInitialScreenLoader.openTheAppUserJourney).onInitialScreenLoaded(OpenTheAppUserJourney.InitialScreen.HOME);
                        ((RealIntentHandler) realInitialScreenLoader.intentHandler).handleIntent(intent, navigator, false);
                        intent.putExtra("deep_link_consumed", true);
                        return RealInitialScreenLoader.StartSignedInResult.Success;
                    case 3:
                        keyValue = (KeyValue) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        access$recoverPrincipalAccountToken = obj;
                        this.L$0 = null;
                        this.label = 4;
                        break;
                    case 4:
                        SafeTrace.throwOnFailure(obj);
                        JobKt.launch$default(realInitialScreenLoader.coroutineScope, null, null, new RealInitialScreenLoader$resetSandbox$2(realInitialScreenLoader, continuation, i2), 3);
                        navigator.goTo(PaymentScreens$HomeScreens$Home.INSTANCE);
                        ((RealOpenTheAppUserJourney) realInitialScreenLoader.openTheAppUserJourney).onInitialScreenLoaded(OpenTheAppUserJourney.InitialScreen.HOME);
                        ((RealIntentHandler) realInitialScreenLoader.intentHandler).handleIntent(intent, navigator, false);
                        intent.putExtra("deep_link_consumed", true);
                        return RealInitialScreenLoader.StartSignedInResult.Success;
                    case 5:
                        SafeTrace.throwOnFailure(obj);
                        invoke3 = obj;
                        ((Boolean) invoke3).getClass();
                        return RealInitialScreenLoader.StartSignedInResult.Failed;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        invoke4 = obj;
                        ((Boolean) invoke4).getClass();
                        return RealInitialScreenLoader.StartSignedInResult.Failed;
                    case 7:
                        SafeTrace.throwOnFailure(obj);
                        invoke5 = obj;
                        ((Boolean) invoke5).getClass();
                        return RealInitialScreenLoader.StartSignedInResult.Failed;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 15:
                PaymentAccountParams paymentAccountParams = (PaymentAccountParams) this.$newData;
                PollAttachPaymentAccount pollAttachPaymentAccount = (PollAttachPaymentAccount) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                try {
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl = pollAttachPaymentAccount.repository;
                        String str10 = pollAttachPaymentAccount.configuration.financialConnectionsSessionClientSecret;
                        CachedConsumerSession provideConsumerSession = pollAttachPaymentAccount.consumerSessionProvider.provideConsumerSession();
                        String str11 = provideConsumerSession != null ? provideConsumerSession.clientSecret : null;
                        this.label = 1;
                        postAttachPaymentAccountToLinkAccountSession = financialConnectionsAccountsRepositoryImpl.postAttachPaymentAccountToLinkAccountSession(str10, paymentAccountParams, str11, this);
                        if (postAttachPaymentAccountToLinkAccountSession == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    } else {
                        if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        postAttachPaymentAccountToLinkAccountSession = obj;
                    }
                    AttachedPaymentAccountRepository attachedPaymentAccountRepository = pollAttachPaymentAccount.attachedPaymentAccountRepository;
                    attachedPaymentAccountRepository.getClass();
                    attachedPaymentAccountRepository.logger.debug("payment account set to " + paymentAccountParams);
                    ((SavedStateHandle) attachedPaymentAccountRepository.zzd).set(new AttachedPaymentAccountRepository.State(paymentAccountParams), (String) attachedPaymentAccountRepository.zza);
                    return (LinkAccountSessionPaymentAccount) postAttachPaymentAccountToLinkAccountSession;
                } catch (StripeException e5) {
                    FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) this.this$0;
                    boolean showManualEntryInErrors = ListItemKt.showManualEntryInErrors((SynchronizeSessionResponse) obj7);
                    if (financialConnectionsInstitution == null) {
                        throw e5;
                    }
                    StripeError stripeError = e5.stripeError;
                    if (stripeError != null && (map = stripeError.extraFields) != null) {
                        continuation = (String) map.get("reason");
                    }
                    if (Intrinsics.areEqual(continuation, "account_number_retrieval_failed")) {
                        throw new AccountNumberRetrievalError(e5, financialConnectionsInstitution, showManualEntryInErrors);
                    }
                    throw e5;
                }
            case 16:
                LinkAccountPickerViewModel linkAccountPickerViewModel = (LinkAccountPickerViewModel) obj7;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetOrFetchSync getOrFetchSync = linkAccountPickerViewModel.getSync;
                    this.label = 1;
                    invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, this, 3);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cachedConsumerSession = (CachedConsumerSession) this.this$0;
                        financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.$newData;
                        synchronizeSessionResponse = (SynchronizeSessionResponse) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        networkedAccounts = obj;
                        NetworkedAccountsList networkedAccountsList = (NetworkedAccountsList) networkedAccounts;
                        Display display = networkedAccountsList.display;
                        returningNetworkingUserAccountPicker = (display != null || (textUpdate = display.text) == null) ? null : textUpdate.returningNetworkingUserAccountPicker;
                        if (returningNetworkingUserAccountPicker != null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return null;
                        }
                        List<NetworkedAccount> list3 = returningNetworkingUserAccountPicker.accounts;
                        ArrayList arrayList3 = new ArrayList();
                        for (NetworkedAccount networkedAccount : list3) {
                            Iterator it3 = networkedAccountsList.data.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj6 = it3.next();
                                    if (Intrinsics.areEqual(((PartnerAccount) obj6).id, networkedAccount.id)) {
                                    }
                                } else {
                                    obj6 = null;
                                }
                            }
                            PartnerAccount partnerAccount = (PartnerAccount) obj6;
                            LinkedAccount linkedAccount = partnerAccount != null ? new LinkedAccount(partnerAccount, networkedAccount) : null;
                            if (linkedAccount != null) {
                                arrayList3.add(linkedAccount);
                            }
                        }
                        Iterator it4 = arrayList3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj5 = it4.next();
                                NetworkedAccount networkedAccount2 = ((LinkedAccount) obj5).display;
                                if (!networkedAccount2.allowSelection || networkedAccount2.drawerOnSelection != null) {
                                }
                            } else {
                                obj5 = null;
                            }
                        }
                        LinkedAccount linkedAccount2 = (LinkedAccount) obj5;
                        List listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(linkedAccount2 != null ? linkedAccount2.account.id : null);
                        linkAccountPickerViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(LinkAccountPickerViewModel.PANE, 25));
                        Map map2 = networkedAccountsList.partnerToCoreAuths;
                        String str12 = returningNetworkingUserAccountPicker.aboveCta;
                        TextUpdate textUpdate2 = synchronizeSessionResponse.text;
                        DataAccessNotice dataAccessNotice = (textUpdate2 == null || (consentPane = textUpdate2.consent) == null) ? null : consentPane.dataAccessNotice;
                        FinancialConnectionsSessionManifest.Pane pane = networkedAccountsList.nextPaneOnAddAccount;
                        DataAccessNotice dataAccessNotice2 = returningNetworkingUserAccountPicker.multipleAccountTypesSelectedDataAccessNotice;
                        AddNewAccount addNewAccount = returningNetworkingUserAccountPicker.addNewAccount;
                        if (addNewAccount == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return null;
                        }
                        String str13 = returningNetworkingUserAccountPicker.title;
                        String str14 = returningNetworkingUserAccountPicker.defaultCta;
                        String str15 = cachedConsumerSession.clientSecret;
                        boolean z = financialConnectionsSessionManifest.singleAccount;
                        Boolean bool = networkedAccountsList.acquireConsentOnPrimaryCtaClick;
                        return new LinkAccountPickerState.Payload(str13, arrayList3, listOfNotNull, addNewAccount, str15, str14, pane, map2, z, dataAccessNotice2, str12, dataAccessNotice, bool != null ? bool.booleanValue() : false);
                    }
                    SafeTrace.throwOnFailure(obj);
                    invoke$default = obj;
                }
                synchronizeSessionResponse = (SynchronizeSessionResponse) invoke$default;
                financialConnectionsSessionManifest = synchronizeSessionResponse.manifest;
                CachedConsumerSession provideConsumerSession2 = linkAccountPickerViewModel.consumerSessionProvider.provideConsumerSession();
                if (provideConsumerSession2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                }
                ToolbarTuckTargets toolbarTuckTargets = linkAccountPickerViewModel.fetchNetworkedAccounts;
                String str16 = provideConsumerSession2.clientSecret;
                this.L$0 = synchronizeSessionResponse;
                this.$newData = financialConnectionsSessionManifest;
                this.this$0 = provideConsumerSession2;
                this.label = 2;
                networkedAccounts = ((FinancialConnectionsAccountsRepositoryImpl) toolbarTuckTargets.startCornerCenterX$delegate).getNetworkedAccounts(((FinancialConnectionsSheetConfiguration) toolbarTuckTargets.endCornerCenterX$delegate).financialConnectionsSessionClientSecret, str16, this);
                if (networkedAccounts != coroutineSingletons16) {
                    cachedConsumerSession = provideConsumerSession2;
                    NetworkedAccountsList networkedAccountsList2 = (NetworkedAccountsList) networkedAccounts;
                    Display display2 = networkedAccountsList2.display;
                    if (display2 != null) {
                    }
                    if (returningNetworkingUserAccountPicker != null) {
                    }
                }
                return coroutineSingletons16;
            case 17:
                LinkAccountPickerViewModel linkAccountPickerViewModel2 = (LinkAccountPickerViewModel) obj7;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object invoke7 = ((LinkAccountPickerState) linkAccountPickerViewModel2.stateFlow.$$delegate_0.getValue()).payload.invoke();
                    if (invoke7 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    payload = (LinkAccountPickerState.Payload) invoke7;
                    ArrayList selectedAccounts = payload.getSelectedAccounts();
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(selectedAccounts, 10));
                    Iterator it5 = selectedAccounts.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(((LinkedAccount) it5.next()).account);
                    }
                    ArrayList selectedAccounts2 = payload.getSelectedAccounts();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it6 = selectedAccounts2.iterator();
                    while (it6.hasNext()) {
                        NoticeSheetState.NoticeSheetContent computeDrawerPayload = LinkAccountPickerViewModel.computeDrawerPayload(((LinkedAccount) it6.next()).account, payload);
                        if (computeDrawerPayload != null) {
                            arrayList4.add(computeDrawerPayload);
                        }
                    }
                    UpdateCachedAccounts updateCachedAccounts = linkAccountPickerViewModel2.updateCachedAccounts;
                    this.L$0 = payload;
                    this.$newData = arrayList;
                    this.this$0 = arrayList4;
                    this.label = 1;
                    FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl2 = updateCachedAccounts.repository;
                    financialConnectionsAccountsRepositoryImpl2.getClass();
                    financialConnectionsAccountsRepositoryImpl2.updateCachedAccounts("updateCachedAccounts", arrayList);
                    Unit unit = Unit.INSTANCE;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (unit != coroutineSingletons17) {
                        list = arrayList4;
                    }
                    return coroutineSingletons17;
                }
                if (i20 != 1) {
                    if (i20 == 2) {
                        list2 = (List) this.this$0;
                        SafeTrace.throwOnFailure(obj);
                        NoticeSheetState.NoticeSheetContent noticeSheetContent = (NoticeSheetState.NoticeSheetContent) CollectionsKt.first(list2);
                        FinancialConnectionsSessionManifest.Pane pane2 = LinkAccountPickerViewModel.PANE;
                        linkAccountPickerViewModel2.present(noticeSheetContent);
                        return Unit.INSTANCE;
                    }
                    if (i20 != 3 && i20 != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                list = (List) this.this$0;
                arrayList = (ArrayList) this.$newData;
                payload = (LinkAccountPickerState.Payload) this.L$0;
                SafeTrace.throwOnFailure(obj);
                if (list.isEmpty()) {
                    PartnerAccount partnerAccount2 = (PartnerAccount) CollectionsKt.lastOrNull((List) arrayList);
                    FinancialConnectionsSessionManifest.Pane pane3 = partnerAccount2 != null ? partnerAccount2.nextPaneOnSelection : null;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it7 = arrayList.iterator();
                    while (it7.hasNext()) {
                        arrayList5.add(((PartnerAccount) it7.next()).id);
                    }
                    Set set = CollectionsKt.toSet(arrayList5);
                    FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = linkAccountPickerViewModel2.eventTracker;
                    FinancialConnectionsSessionManifest.Pane pane4 = LinkAccountPickerViewModel.PANE;
                    financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(pane4, set, false, 3));
                    linkAccountPickerViewModel2.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click("click.link_accounts", pane4));
                    if (pane3 == FinancialConnectionsSessionManifest.Pane.SUCCESS) {
                        boolean z2 = payload.acquireConsentOnPrimaryCtaClick;
                        String str17 = payload.consumerSessionClientSecret;
                        this.L$0 = null;
                        this.$newData = null;
                        this.this$0 = null;
                        this.label = 3;
                        break;
                    } else {
                        this.L$0 = null;
                        this.$newData = null;
                        this.this$0 = null;
                        this.label = 4;
                        break;
                    }
                } else {
                    if (list.size() > 1) {
                        Matchers.logError(linkAccountPickerViewModel2.eventTracker, "Multiple accounts with drawers on selection", new UnclassifiedError("MultipleAccountsSelectedError", null), linkAccountPickerViewModel2.logger, LinkAccountPickerViewModel.PANE);
                    }
                    AcceptConsent acceptConsent = linkAccountPickerViewModel2.acceptConsent;
                    this.L$0 = null;
                    this.$newData = null;
                    this.this$0 = list;
                    this.label = 2;
                    if (acceptConsent.repository.markConsentAcquired(acceptConsent.configuration.financialConnectionsSessionClientSecret, this) != coroutineSingletons17) {
                        list2 = list;
                        NoticeSheetState.NoticeSheetContent noticeSheetContent2 = (NoticeSheetState.NoticeSheetContent) CollectionsKt.first(list2);
                        FinancialConnectionsSessionManifest.Pane pane22 = LinkAccountPickerViewModel.PANE;
                        linkAccountPickerViewModel2.present(noticeSheetContent2);
                        return Unit.INSTANCE;
                    }
                }
                return coroutineSingletons17;
            case 18:
                return invokeSuspend$com$stripe$android$financialconnections$features$success$SuccessViewModel$1(obj);
            default:
                GovernmentIdState.HolographicTorchDelay holographicTorchDelay = (GovernmentIdState.HolographicTorchDelay) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j = holographicTorchDelay.torchDurationMs;
                    this.label = 1;
                    if (JobKt.delay(j, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                GovernmentIdStateManagerUtilsKt.moveToNextStep$default(holographicTorchDelay, (SubtreeManager) this.$newData, (GovernmentIdWorkflow.Input) this.this$0, holographicTorchDelay.acceptedId, holographicTorchDelay.id, (POPMatchingFactory) obj7, holographicTorchDelay.cameraProperties, false, null, 0, null, 3840);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataStoreImpl$readDataOrHandleCorruption$3(LinkAccountPickerViewModel linkAccountPickerViewModel, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.$version = linkAccountPickerViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataStoreImpl$readDataOrHandleCorruption$3(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.$newData = obj;
        this.this$0 = obj2;
        this.$version = obj3;
    }
}
