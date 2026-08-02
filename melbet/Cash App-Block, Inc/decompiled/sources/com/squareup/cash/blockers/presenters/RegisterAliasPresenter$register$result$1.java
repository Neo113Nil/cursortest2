package com.squareup.cash.blockers.presenters;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.analytics.BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda8;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.familyhub.views.WalletMetrics;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import com.squareup.cash.onboarding.util.AliasRegistrar$Result;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securitysignals.models.SignalsContext;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.data.real.RealClockInEssentialsProvider;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.protos.cash.cashliteflow.api.v1.CashLiteFlowClientService;
import com.squareup.protos.cash.cashliteflow.api.v1.PushProvisionGooglePayRequest;
import com.squareup.protos.franklin.api.FileCategory;
import com.squareup.protos.franklin.app.UploadFileRequest;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.sync.Mutex;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class RegisterAliasPresenter$register$result$1 extends SuspendLambda implements Function1 {
    public Object $alias;
    public Object $deliveryMechanism;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $signalsContext;
    public Object $updateViewModel;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterAliasPresenter$register$result$1(CardLockPresenter cardLockPresenter, String str, String str2, ClockInOverlayViewModel.BreakIdentifier breakIdentifier, CardModelView$1$3$4$2 cardModelView$1$3$4$2, Continuation continuation) {
        super(1, continuation);
        this.$r8$classId = 4;
        this.$updateViewModel = cardLockPresenter;
        this.$alias = str;
        this.this$0 = str2;
        this.$deliveryMechanism = breakIdentifier;
        this.$signalsContext = cardModelView$1$3$4$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$signalsContext;
        switch (i) {
            case 0:
                return new RegisterAliasPresenter$register$result$1((Function1) this.$updateViewModel, (RegisterAliasPresenter) this.this$0, (String) this.$alias, (AliasRegistrar$Args.DeliveryMechanism) this.$deliveryMechanism, (SignalsContext) obj, continuation, 0);
            case 1:
                return new RegisterAliasPresenter$register$result$1(this.$updateViewModel, (BlockersScreens) this.this$0, this.$deliveryMechanism, (String) this.$alias, obj, continuation, 1);
            case 2:
                return new RegisterAliasPresenter$register$result$1((Mutex) this.$updateViewModel, (Animatable) this.this$0, (WalletMetrics) this.$alias, (ParcelableSnapshotMutableIntState) this.$deliveryMechanism, (ParcelableSnapshotMutableIntState) obj, continuation, 2);
            case 3:
                return new RegisterAliasPresenter$register$result$1(this.$updateViewModel, (BlockersScreens) this.this$0, this.$deliveryMechanism, (String) this.$alias, obj, continuation, 3);
            case 4:
                return new RegisterAliasPresenter$register$result$1((CardLockPresenter) this.$updateViewModel, (String) this.$alias, (String) this.this$0, (ClockInOverlayViewModel.BreakIdentifier) this.$deliveryMechanism, (CardModelView$1$3$4$2) obj, continuation);
            default:
                return new RegisterAliasPresenter$register$result$1((ManualEntryViewModel) obj, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((RegisterAliasPresenter$register$result$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02ec, code lost:
    
        if (r0 == r7) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        if (r2 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0053, code lost:
    
        if (r1 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013e, code lost:
    
        if (r0.refresh(r57) == r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012c, code lost:
    
        if (r0.startBreak(r1, r3, r3, r11, r57) == r10) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object access$maybeLoginWithPasskey;
        CoroutineSingletons coroutineSingletons;
        Object trackBlockerSubmissionAnalyticsInternal2;
        Object invoke$default;
        SynchronizeSessionResponse synchronizeSessionResponse;
        Object invoke;
        SynchronizeSessionResponse synchronizeSessionResponse2;
        Object obj2;
        LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount;
        FinancialConnectionsSessionManifest.Pane pane;
        int i = this.$r8$classId;
        Object obj3 = this.$signalsContext;
        Continuation continuation = null;
        switch (i) {
            case 0:
                RegisterAliasPresenter registerAliasPresenter = (RegisterAliasPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((Function1) this.$updateViewModel).invoke(new MoveBitcoinViewKt$$ExternalSyntheticLambda3(25));
                    String str = (String) this.$alias;
                    AliasRegistrar$Args.DeliveryMechanism deliveryMechanism = (AliasRegistrar$Args.DeliveryMechanism) this.$deliveryMechanism;
                    this.label = 1;
                    access$maybeLoginWithPasskey = RegisterAliasPresenter.access$maybeLoginWithPasskey(registerAliasPresenter, str, deliveryMechanism, this);
                    if (access$maybeLoginWithPasskey == coroutineSingletons2) {
                        coroutineSingletons = coroutineSingletons2;
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        trackBlockerSubmissionAnalyticsInternal2 = obj;
                        return (AliasRegistrar$Result) trackBlockerSubmissionAnalyticsInternal2;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$maybeLoginWithPasskey = obj;
                }
                AliasRegistrar$Result aliasRegistrar$Result = (AliasRegistrar$Result) access$maybeLoginWithPasskey;
                if (aliasRegistrar$Result != null) {
                    return aliasRegistrar$Result;
                }
                Analytics analytics = registerAliasPresenter.analytics;
                BlockersData copy$default = BlockersData.copy$default(registerAliasPresenter.args.blockersData, null, registerAliasPresenter.flowToken, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -3, 65535);
                AndroidStringManager androidStringManager = registerAliasPresenter.stringManager;
                DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(registerAliasPresenter, (String) this.$alias, (AliasRegistrar$Args.DeliveryMechanism) this.$deliveryMechanism, (SignalsContext) obj3, null, 5);
                this.label = 2;
                coroutineSingletons = coroutineSingletons2;
                trackBlockerSubmissionAnalyticsInternal2 = PointerInputModifierNodeKt.trackBlockerSubmissionAnalyticsInternal2(analytics, androidStringManager, copy$default, R.string.blockers_retrofit_error_message, new BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda8(androidStringManager, 1), new Scene.AnonymousClass1(dataStoreImpl$readDataOrHandleCorruption$3, continuation, 12), this);
                break;
            case 1:
                BlockersScreens blockersScreens = (BlockersScreens) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                MultiBlockerFacilitator$Resolver multiBlockerFacilitator$Resolver = (MultiBlockerFacilitator$Resolver) this.$updateViewModel;
                UploadFileRequest uploadFileRequest = new UploadFileRequest(blockersScreens.getBlockersData().requestContext, null, (ByteString) this.$deliveryMechanism, (String) this.$alias, (FileCategory) obj3, blockersScreens.getBlockersData().requestContext.payment_tokens, blockersScreens.getBlockersData().requestContext.transfer_token, ByteString.EMPTY);
                this.label = 1;
                Object resolve = multiBlockerFacilitator$Resolver.resolve(uploadFileRequest, this);
                return resolve == coroutineSingletons3 ? coroutineSingletons3 : resolve;
            case 2:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Mutex mutex = (Mutex) this.$updateViewModel;
                    Animatable animatable = (Animatable) this.this$0;
                    WalletMetrics walletMetrics = (WalletMetrics) this.$alias;
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.$deliveryMechanism;
                    this.label = 1;
                    if (AllowanceViewKt.access$U13CelebrationHero$lambda$29$cycleCard(mutex, animatable, walletMetrics, parcelableSnapshotMutableIntState, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                NavAction$$ExternalSyntheticOutline0.m(1, (ParcelableSnapshotMutableIntState) obj3);
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                CashLiteFlowClientService cashLiteFlowClientService = (CashLiteFlowClientService) ((MarkwonConfiguration) this.$updateViewModel).theme;
                PushProvisionGooglePayRequest pushProvisionGooglePayRequest = new PushProvisionGooglePayRequest(((BlockersScreens.ProvisionGooglePayScreen) this.this$0).blockersData.requestContext, ((IssuedCardFactory.IssuedCard) this.$deliveryMechanism).token, (String) this.$alias, (String) obj3, ByteString.EMPTY);
                this.label = 1;
                Object pushProvisionGooglePay = cashLiteFlowClientService.pushProvisionGooglePay(pushProvisionGooglePayRequest, this);
                return pushProvisionGooglePay == coroutineSingletons5 ? coroutineSingletons5 : pushProvisionGooglePay;
            case 4:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) this.$updateViewModel;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealClockInRepository realClockInRepository = (RealClockInRepository) cardLockPresenter.franklinAppService;
                    String str2 = (String) this.$alias;
                    String str3 = (String) this.this$0;
                    ClockInOverlayViewModel.BreakIdentifier breakIdentifier = (ClockInOverlayViewModel.BreakIdentifier) this.$deliveryMechanism;
                    String str4 = breakIdentifier.token;
                    long j = breakIdentifier.versionNumber;
                    this.label = 1;
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((CardModelView$1$3$4$2) obj3).invoke();
                RealClockInEssentialsProvider realClockInEssentialsProvider = (RealClockInEssentialsProvider) cardLockPresenter.cardLockFlowTypeProvider;
                this.label = 2;
                break;
            default:
                ManualEntryViewModel manualEntryViewModel = (ManualEntryViewModel) obj3;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetOrFetchSync getOrFetchSync = manualEntryViewModel.getOrFetchSync;
                    this.label = 1;
                    invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, this, 3);
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            linkAccountSessionPaymentAccount = (LinkAccountSessionPaymentAccount) this.$deliveryMechanism;
                            manualEntryViewModel = (ManualEntryViewModel) this.$alias;
                            obj2 = this.this$0;
                            synchronizeSessionResponse2 = (SynchronizeSessionResponse) this.$updateViewModel;
                            SafeTrace.throwOnFailure(obj);
                            if (synchronizeSessionResponse2.manifest.manualEntryUsesMicrodeposits) {
                                SuccessContentRepository successContentRepository = manualEntryViewModel.successContentRepository;
                                TextResource.StringId stringId = new TextResource.StringId(R.string.stripe_success_pane_title_microdeposits);
                                String str5 = (String) manualEntryViewModel._account$delegate.getValue();
                                TextResource.StringId stringId2 = new TextResource.StringId(R.string.stripe_success_pane_desc_microdeposits, CollectionsKt__CollectionsJVMKt.listOf(StringsKt___StringsKt.takeLast(4, str5 != null ? str5 : "")));
                                successContentRepository.getClass();
                                ((SavedStateHandle) successContentRepository.zzd).set(new SuccessContentRepository.State(stringId2, stringId), (String) successContentRepository.zza);
                            }
                            pane = linkAccountSessionPaymentAccount.nextPane;
                            if (pane == null) {
                                pane = FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS;
                            }
                            NavigationManagerImpl.tryNavigateTo$default(manualEntryViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(pane), ManualEntryViewModel.PANE), null, 6);
                            return obj2;
                        }
                        synchronizeSessionResponse = (SynchronizeSessionResponse) this.$updateViewModel;
                        SafeTrace.throwOnFailure(obj);
                        invoke = obj;
                        LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount2 = (LinkAccountSessionPaymentAccount) invoke;
                        this.$updateViewModel = synchronizeSessionResponse;
                        this.this$0 = invoke;
                        this.$alias = manualEntryViewModel;
                        this.$deliveryMechanism = linkAccountSessionPaymentAccount2;
                        this.label = 3;
                        if (ManualEntryViewModel.access$clearCachedAccounts(manualEntryViewModel, this) != coroutineSingletons7) {
                            Object obj4 = invoke;
                            synchronizeSessionResponse2 = synchronizeSessionResponse;
                            obj2 = obj4;
                            linkAccountSessionPaymentAccount = linkAccountSessionPaymentAccount2;
                            if (synchronizeSessionResponse2.manifest.manualEntryUsesMicrodeposits) {
                            }
                            pane = linkAccountSessionPaymentAccount.nextPane;
                            if (pane == null) {
                            }
                            NavigationManagerImpl.tryNavigateTo$default(manualEntryViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(pane), ManualEntryViewModel.PANE), null, 6);
                            return obj2;
                        }
                        return coroutineSingletons7;
                    }
                    SafeTrace.throwOnFailure(obj);
                    invoke$default = obj;
                }
                synchronizeSessionResponse = (SynchronizeSessionResponse) invoke$default;
                PollAttachPaymentAccount pollAttachPaymentAccount = manualEntryViewModel.pollAttachPaymentAccount;
                String str6 = (String) manualEntryViewModel._routing$delegate.getValue();
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = (String) manualEntryViewModel._account$delegate.getValue();
                if (str7 == null) {
                    str7 = "";
                }
                PaymentAccountParams.BankAccount bankAccount = new PaymentAccountParams.BankAccount(str6, str7);
                this.$updateViewModel = synchronizeSessionResponse;
                this.label = 2;
                invoke = pollAttachPaymentAccount.invoke(synchronizeSessionResponse, null, bankAccount, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterAliasPresenter$register$result$1(ManualEntryViewModel manualEntryViewModel, Continuation continuation) {
        super(1, continuation);
        this.$r8$classId = 5;
        this.$signalsContext = manualEntryViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RegisterAliasPresenter$register$result$1(Object obj, BlockersScreens blockersScreens, Object obj2, String str, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.$updateViewModel = obj;
        this.this$0 = blockersScreens;
        this.$deliveryMechanism = obj2;
        this.$alias = str;
        this.$signalsContext = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RegisterAliasPresenter$register$result$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.$updateViewModel = obj;
        this.this$0 = obj2;
        this.$alias = obj3;
        this.$deliveryMechanism = obj4;
        this.$signalsContext = obj5;
    }
}
