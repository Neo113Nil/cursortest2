package com.squareup.cash.blockers.presenters;

import android.app.Activity;
import android.os.Parcelable;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FloatTweenSpec;
import androidx.compose.material3.DatePickerKt$updateDisplayedMonth$3;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.glance.session.SessionWorker$doWork$2$2;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.ta$$ExternalSyntheticLambda1;
import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import com.squareup.cash.R;
import com.squareup.cash.blockers.actions.util.CdfUtilsKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.data.BlockersDataKt;
import com.squareup.cash.blockers.presenters.SetNamePresenter$SubmitNameResult;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.IdvViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameEvent;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$Done;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$SubmissionFailed;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$Submitted;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.blockers.web.presenters.WebViewBlockerPresenter;
import com.squareup.cash.bugreporting.viewmodels.BugReport;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationPresenter;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewEvent;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.cashapppay.presenters.GrantPresenter;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractTriggerScheduledAction;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.CaptureCheckFacePresenter;
import com.squareup.cash.checks.VerifyCheckDepositPresenter;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$collectBlockersActions$2;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.deposits.physical.presenter.map.PaperMoneyDepositMapPresenter;
import com.squareup.cash.earningstracker.viewmodels.HeaderTitle;
import com.squareup.cash.family.familyhub.backend.api.ManagedAccountTransferManager$ManagedAccountTransferType;
import com.squareup.cash.family.familyhub.backend.real.RealManagedAccountTransferManager;
import com.squareup.cash.family.familyhub.presenters.FamilyHomePresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.presenters.NearbyPayRequestPresenter$models$10$1$1$1;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.securitysignals.backend.RealSecuritySignalsAggregator;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.PaymentCardGlobalConfig;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SelectOptionRequest;
import com.squareup.protos.franklin.app.SelectOptionResponse;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest$ElementResult$Result$TextInputResult;
import com.squareup.protos.franklin.app.VerifyIdentityRequest;
import com.squareup.protos.franklin.app.VerifyIdentityResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import com.squareup.util.cash.ProtoDefaults;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class RealIdvPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $address;
    public final /* synthetic */ Object $blockersData;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $request;
    public final /* synthetic */ Object $ssn;
    public Object $state$delegate;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealIdvPresenter$models$1$1(MutableState mutableState, CardStudioPresenter cardStudioPresenter, MutableState mutableState2, MutableState mutableState3, SnapshotStateSet snapshotStateSet, Map map, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 22;
        this.$state$delegate = mutableState;
        this.this$0 = cardStudioPresenter;
        this.$blockersData = mutableState2;
        this.$address = mutableState3;
        this.$ssn = snapshotStateSet;
        this.$request = map;
    }

    private final Object invokeSuspend$com$squareup$cash$earnings$presenters$payers$AddPayerCustomersPresenter$models$2$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(Updater.snapshotFlow(new DrawerViewKt$$ExternalSyntheticLambda2(16, (MutableState) this.$state$delegate)));
            RealIdvPresenter$models$1$1 realIdvPresenter$models$1$1 = new RealIdvPresenter$models$1$1((CardStudioPresenter) this.this$0, (MutableState) this.$blockersData, (MutableState) this.$address, (SnapshotStateSet) this.$ssn, (Map) this.$request, (Continuation) null, 21);
            this.label = 1;
            if (FlowKt.collectLatest(distinctUntilChanged, realIdvPresenter$models$1$1, this) == coroutineSingletons) {
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        if (com.squareup.cash.earningstracker.views.components.EarningsHeaderKt.access$EarningsCounter$startHeaderBounceEffect(r11, r12, r1, r3, r9) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, null, null, r9, 12) == r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$earningstracker$views$components$EarningsHeaderKt$EarningsCounter$startCountingAnimation$1(Object obj) {
        RealIdvPresenter$models$1$1 realIdvPresenter$models$1$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Animatable animatable = (Animatable) this.this$0;
            Float f = new Float(1.0f);
            Long l = ((HeaderTitle.EarningsCounterTitle) this.$blockersData).earnings.amount;
            l.getClass();
            FloatTweenSpec floatTweenSpec = new FloatTweenSpec(l.longValue() > 0 ? 800 : 0, EasingKt.LinearEasing, 2);
            this.label = 1;
            realIdvPresenter$models$1$1 = this;
        } else {
            if (i != 1) {
                if (i == 2) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            realIdvPresenter$models$1$1 = this;
        }
        CoroutineScope coroutineScope = (CoroutineScope) realIdvPresenter$models$1$1.$address;
        Function0 function0 = (Function0) realIdvPresenter$models$1$1.$ssn;
        Animatable animatable2 = (Animatable) realIdvPresenter$models$1$1.$request;
        Animatable animatable3 = (Animatable) realIdvPresenter$models$1$1.$state$delegate;
        realIdvPresenter$models$1$1.label = 2;
    }

    private final Object invokeSuspend$com$squareup$cash$family$familyhub$backend$real$RealManagedAccountTransferManager$initiateTransfer$1(Object obj) {
        RealManagedAccountTransferManager realManagedAccountTransferManager = (RealManagedAccountTransferManager) this.this$0;
        AtomicBoolean atomicBoolean = realManagedAccountTransferManager.transferInProgress;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                ManagedAccountTransferManager$ManagedAccountTransferType managedAccountTransferManager$ManagedAccountTransferType = (ManagedAccountTransferManager$ManagedAccountTransferType) this.$blockersData;
                Money money = (Money) this.$address;
                String str = (String) this.$ssn;
                String str2 = (String) this.$request;
                String str3 = (String) this.$state$delegate;
                this.label = 1;
                if (RealManagedAccountTransferManager.access$doTransfer(realManagedAccountTransferManager, managedAccountTransferManager$ManagedAccountTransferType, money, str, str2, str3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            atomicBoolean.set(false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            atomicBoolean.set(false);
            throw th;
        }
    }

    private final Object invokeSuspend$com$squareup$cash$family$familyhub$presenters$DependentDetailPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$blockersData;
            LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope, (MoleculePresenter) this.$address, (MutableState) this.$state$delegate, this.$ssn, (State) this.$request, 19);
            this.this$0 = null;
            this.label = 1;
            if (flow.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons) {
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

    private final Object invokeSuspend$com$squareup$cash$family$familyhub$presenters$FamilyHomePresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$blockersData;
            NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$1 = new NearbyPayRequestPresenter$models$10$1$1$1(coroutineScope, (FamilyHomePresenter) this.$address, (String) this.$ssn, (State) this.$request, (MutableState) this.$state$delegate, 5);
            this.this$0 = null;
            this.label = 1;
            if (flow.collect(nearbyPayRequestPresenter$models$10$1$1$1, this) == coroutineSingletons) {
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

    private final Object invokeSuspend$com$squareup$cash$family$requestsponsorship$presenters$SelectSponsorPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$blockersData;
            LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope, (MoleculePresenter) this.$address, (MutableState) this.$state$delegate, this.$ssn, (State) this.$request, 20);
            this.this$0 = null;
            this.label = 1;
            if (flow.collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons) {
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

    private final Object invokeSuspend$com$squareup$cash$fidesmo$presenters$FidesmoDeprovisioningPresenter$models$10$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            StateFlow stateFlow = (StateFlow) this.$blockersData;
            MutableState mutableState = (MutableState) this.$state$delegate;
            FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1 fidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1 = new FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1(stateFlow, mutableState, 1);
            DbSessionManager$updateDb$2 dbSessionManager$updateDb$2 = new DbSessionManager$updateDb$2((FidesmoDeprovisioningPresenter) this.$address, (Activity) this.$request, coroutineScope, (String) this.$ssn, mutableState, null, 3);
            this.this$0 = null;
            this.label = 1;
            if (FlowKt.collectLatest(fidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1, dbSessionManager$updateDb$2, this) == coroutineSingletons) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$ssn;
        Object obj3 = this.$request;
        Object obj4 = this.$address;
        Object obj5 = this.$blockersData;
        switch (i) {
            case 0:
                return new RealIdvPresenter$models$1$1((DisclosurePresenter) this.this$0, (BlockersData) obj5, (GlobalAddress) obj4, (String) obj2, (VerifyIdentityRequest) obj3, (MutableState) this.$state$delegate, continuation, 0);
            case 1:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$1 = new RealIdvPresenter$models$1$1((Flow) obj5, continuation, (MutableStateFlow) obj4, (CashtagPresenter) obj2, (MutableState) this.$state$delegate, (MutableState) obj3, 1);
                realIdvPresenter$models$1$1.this$0 = obj;
                return realIdvPresenter$models$1$1;
            case 2:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$12 = new RealIdvPresenter$models$1$1(obj5, continuation, (MoleculePresenter) obj4, (MutableState) this.$state$delegate, obj2, (State) obj3, 2);
                realIdvPresenter$models$1$12.this$0 = obj;
                return realIdvPresenter$models$1$12;
            case 3:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$13 = new RealIdvPresenter$models$1$1((Flow) obj5, continuation, (FormBlockerPresenter) obj4, (MutableSharedFlow) obj2, (Map) obj3, (MutableState) this.$state$delegate, 3);
                realIdvPresenter$models$1$13.this$0 = obj;
                return realIdvPresenter$models$1$13;
            case 4:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$14 = new RealIdvPresenter$models$1$1(obj5, continuation, (MoleculePresenter) obj4, (MutableState) this.$state$delegate, obj2, (State) obj3, 4);
                realIdvPresenter$models$1$14.this$0 = obj;
                return realIdvPresenter$models$1$14;
            case 5:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$15 = new RealIdvPresenter$models$1$1((CardLockPresenter) obj5, (CharSequence) obj4, (SetNameEvent) obj2, (MutableState) obj3, continuation);
                realIdvPresenter$models$1$15.this$0 = obj;
                return realIdvPresenter$models$1$15;
            case 6:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$16 = new RealIdvPresenter$models$1$1((Versioned) obj5, continuation, (SetPinPresenter) obj4, (MutableState) this.$state$delegate, (MutableState) obj2, (MutableState) obj3, 6);
                realIdvPresenter$models$1$16.this$0 = obj;
                return realIdvPresenter$models$1$16;
            case 7:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$17 = new RealIdvPresenter$models$1$1((Flow) obj5, continuation, obj4, obj2, (MutableState) this.$state$delegate, (MutableState) obj3, 7);
                realIdvPresenter$models$1$17.this$0 = obj;
                return realIdvPresenter$models$1$17;
            case 8:
                return new RealIdvPresenter$models$1$1((String) obj2, (RequestContext) this.this$0, (String) obj5, (Result) obj4, (ClientScenario) obj3, (String) this.$state$delegate, continuation);
            case 9:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$18 = new RealIdvPresenter$models$1$1((Flow) obj5, continuation, (BlockersScreens.WebViewBlockerScreen) obj4, (WebViewBlockerPresenter) obj2, (MutableState) this.$state$delegate, (MutableState) obj3, 9);
                realIdvPresenter$models$1$18.this$0 = obj;
                return realIdvPresenter$models$1$18;
            case 10:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$19 = new RealIdvPresenter$models$1$1((LocalHomePresenter) obj5, (MutableState) this.$state$delegate, (MutableState) obj4, (MutableState) obj2, (MutableState) obj3, continuation, 10);
                realIdvPresenter$models$1$19.this$0 = obj;
                return realIdvPresenter$models$1$19;
            case 11:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$110 = new RealIdvPresenter$models$1$1((Flow) obj5, continuation, obj4, obj2, (MutableState) this.$state$delegate, (MutableState) obj3, 11);
                realIdvPresenter$models$1$110.this$0 = obj;
                return realIdvPresenter$models$1$110;
            case 12:
                return new RealIdvPresenter$models$1$1((PaymentDeviceCustomizationViewEvent) this.this$0, (PaymentDeviceCustomizationPresenter) obj5, (List) obj4, (PaymentCardGlobalConfig) obj2, (MutableState) this.$state$delegate, (State) obj3, continuation);
            case 13:
                return new RealIdvPresenter$models$1$1((CardWobbleState) this.this$0, (State) obj5, (MutableState) this.$state$delegate, (State) obj4, (MutableState) obj2, (CardScene) obj3, continuation);
            case 14:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$111 = new RealIdvPresenter$models$1$1((Long) obj5, (BlockerAction) obj4, (MutableState) this.$state$delegate, (GrantPresenter) obj2, (MutableState) obj3, continuation);
                realIdvPresenter$models$1$111.this$0 = obj;
                return realIdvPresenter$models$1$111;
            case 15:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$112 = new RealIdvPresenter$models$1$1(obj5, continuation, (MoleculePresenter) obj4, (MutableState) this.$state$delegate, obj2, (State) obj3, 15);
                realIdvPresenter$models$1$112.this$0 = obj;
                return realIdvPresenter$models$1$112;
            case 16:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$113 = new RealIdvPresenter$models$1$1(obj5, continuation, (MoleculePresenter) obj4, (MutableState) this.$state$delegate, obj2, (State) obj3, 16);
                realIdvPresenter$models$1$113.this$0 = obj;
                return realIdvPresenter$models$1$113;
            case 17:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$114 = new RealIdvPresenter$models$1$1((Flow) obj5, continuation, obj4, obj2, (MutableState) this.$state$delegate, (MutableState) obj3, 17);
                realIdvPresenter$models$1$114.this$0 = obj;
                return realIdvPresenter$models$1$114;
            case 18:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$115 = new RealIdvPresenter$models$1$1((BlockersData) obj5, (String) obj2, (RealBlockersHelper) obj4, (Screen) obj3, (ClientScenario) this.$state$delegate, continuation);
                realIdvPresenter$models$1$115.this$0 = obj;
                return realIdvPresenter$models$1$115;
            case 19:
                return new RealIdvPresenter$models$1$1((RealTransferManager) obj5, (TransferFundsRequest) obj4, (TransferType) obj3, (String) obj2, (BlockersData.MoneybotContext) this.$state$delegate, continuation);
            case 20:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$116 = new RealIdvPresenter$models$1$1((Flow) obj5, continuation, obj4, obj2, (MutableState) this.$state$delegate, (MutableState) obj3, 20);
                realIdvPresenter$models$1$116.this$0 = obj;
                return realIdvPresenter$models$1$116;
            case 21:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$117 = new RealIdvPresenter$models$1$1((CardStudioPresenter) obj5, (MutableState) this.$state$delegate, (MutableState) obj4, (SnapshotStateSet) obj2, (Map) obj3, continuation, 21);
                realIdvPresenter$models$1$117.this$0 = obj;
                return realIdvPresenter$models$1$117;
            case 22:
                return new RealIdvPresenter$models$1$1((MutableState) this.$state$delegate, (CardStudioPresenter) this.this$0, (MutableState) obj5, (MutableState) obj4, (SnapshotStateSet) obj2, (Map) obj3, continuation);
            case 23:
                return new RealIdvPresenter$models$1$1((Animatable) this.this$0, (HeaderTitle.EarningsCounterTitle) obj5, (CoroutineScope) obj4, (Function0) obj2, (Animatable) obj3, (Animatable) this.$state$delegate, continuation, 23);
            case 24:
                return new RealIdvPresenter$models$1$1((RealManagedAccountTransferManager) this.this$0, (ManagedAccountTransferManager$ManagedAccountTransferType) obj5, (Money) obj4, (String) obj2, (String) obj3, (String) this.$state$delegate, continuation, 24);
            case 25:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$118 = new RealIdvPresenter$models$1$1((Flow) obj5, continuation, (SavingsScreenPresenter) obj4, (MutableState) this.$state$delegate, (State) obj2, (State) obj3, 25);
                realIdvPresenter$models$1$118.this$0 = obj;
                return realIdvPresenter$models$1$118;
            case 26:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$119 = new RealIdvPresenter$models$1$1((Flow) obj5, continuation, (FamilyHomePresenter) obj4, (String) obj2, (State) obj3, (MutableState) this.$state$delegate, 26);
                realIdvPresenter$models$1$119.this$0 = obj;
                return realIdvPresenter$models$1$119;
            case 27:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$120 = new RealIdvPresenter$models$1$1(obj5, continuation, (MoleculePresenter) obj4, (MutableState) this.$state$delegate, obj2, (State) obj3, 27);
                realIdvPresenter$models$1$120.this$0 = obj;
                return realIdvPresenter$models$1$120;
            case 28:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$121 = new RealIdvPresenter$models$1$1((StateFlow) obj5, (MutableState) this.$state$delegate, (FidesmoDeprovisioningPresenter) obj4, (Activity) obj3, (String) obj2, continuation, 28);
                realIdvPresenter$models$1$121.this$0 = obj;
                return realIdvPresenter$models$1$121;
            default:
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$122 = new RealIdvPresenter$models$1$1((StateFlow) obj5, (MutableState) this.$state$delegate, (FidesmoProvisioningPresenter) obj4, (Activity) obj3, (String) obj2, continuation, 29);
                realIdvPresenter$models$1$122.this$0 = obj;
                return realIdvPresenter$models$1$122;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((RealIdvPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0342, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r13, r0, r77) != r8) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025e, code lost:
    
        if (r0 == r8) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0b2e, code lost:
    
        if (r7.send(r2, r77) == r8) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010f, code lost:
    
        if (r0.collect(r11, r77) == r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0c5c, code lost:
    
        if (r0 == r8) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0af1, code lost:
    
        if (r0 == r8) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cf, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(300, r77) == r5) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:285:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x08e7  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DisclosurePresenter disclosurePresenter;
        BlockersData blockersData;
        ?? r10;
        Object trackBlockerSubmissionAnalytics$default;
        String str;
        Object send;
        String str2;
        Object access$submitShippingAddressName;
        MutableState mutableState;
        Object access$createShippingAddressWithName;
        MutableState mutableState2;
        SetNamePresenter$SubmitNameResult setNamePresenter$SubmitNameResult;
        SetNameViewModel copy$default;
        SetNamePresenter$SubmitNameResult setNamePresenter$SubmitNameResult2;
        SetNameViewModel copy$default2;
        Object m2100generateTitlegIAlus;
        CoroutineSingletons coroutineSingletons;
        Object trackBlockerSubmissionAnalytics$default2;
        Flow access$blockersFailure;
        Object obj2;
        TransferFundsRequest transferFundsRequest;
        Object doTransferFunds;
        RealTransferManager realTransferManager;
        int i = this.$r8$classId;
        int i2 = 24;
        int i3 = 2;
        Object obj3 = this.$ssn;
        Object obj4 = this.$request;
        Object obj5 = this.$address;
        Object obj6 = this.$blockersData;
        Continuation continuation = null;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                BlockersData blockersData2 = (BlockersData) obj6;
                DisclosurePresenter disclosurePresenter2 = (DisclosurePresenter) this.this$0;
                BufferedChannel bufferedChannel = (BufferedChannel) disclosurePresenter2.navigator;
                AndroidStringManager androidStringManager = (AndroidStringManager) disclosurePresenter2.stringManager;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                Continuation continuation2 = null;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = (Analytics) disclosurePresenter2.analytics;
                    KClasses$$Lambda$2 kClasses$$Lambda$2 = new KClasses$$Lambda$2(disclosurePresenter2, 9);
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(disclosurePresenter2, blockersData2, (VerifyIdentityRequest) obj4, continuation2, 9);
                    disclosurePresenter = disclosurePresenter2;
                    blockersData = blockersData2;
                    r10 = 0;
                    this.label = 1;
                    trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData, analytics, androidStringManager, this, kClasses$$Lambda$2, sessionWorker$doWork$2$2);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 == 2 || i4 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    disclosurePresenter = disclosurePresenter2;
                    blockersData = blockersData2;
                    r10 = 0;
                    trackBlockerSubmissionAnalytics$default = obj;
                }
                ApiResult apiResult = (ApiResult) trackBlockerSubmissionAnalytics$default;
                int i5 = 4;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    if (apiResult instanceof ApiResult.Success) {
                        VerifyIdentityResponse verifyIdentityResponse = (VerifyIdentityResponse) ((ApiResult.Success) apiResult).response;
                        GlobalAddress globalAddress = (GlobalAddress) obj5;
                        String str3 = (String) obj3;
                        this.label = 3;
                        ResponseContext responseContext = verifyIdentityResponse.response_context;
                        VerifyIdentityResponse.Status status = verifyIdentityResponse.status;
                        if (responseContext == null || (str2 = responseContext.dialog_message) == null) {
                            String str4 = responseContext != null ? responseContext.failure_message : r10;
                            str = str4 == null ? status != VerifyIdentityResponse.Status.SUCCESS ? androidStringManager.get(R.string.blockers_verify_identity_failed) : r10 : str4;
                        } else {
                            str = str2;
                        }
                        int ordinal = (status == null ? ProtoDefaults.VERIFY_IDENTITY_STATUS : status).ordinal();
                        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                            if (ordinal == 4) {
                                Timber.Forest.e("Failed to verify identity", new Object[0]);
                            } else {
                                OptionalProvider$$ExternalSyntheticLambda0.m$1(status, "Unknown status ");
                            }
                        }
                        boolean z = status != VerifyIdentityResponse.Status.SUCCESS;
                        ResponseContext responseContext2 = verifyIdentityResponse.response_context;
                        responseContext2.getClass();
                        Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                        BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext2, false);
                        Redacted redactedString = z ? new RedactedString(r10) : blockersData.birthday;
                        RedactedParcelable redactedParcelable = new RedactedParcelable(z ? r10 : globalAddress);
                        if (z) {
                            str3 = r10;
                        }
                        BlockersData copy$default3 = BlockersData.copy$default(updateFromResponseContext, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, redactedString, new RedactedString(str3), redactedParcelable, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -58720257, 65535);
                        if (str != null && !StringsKt.isBlank(str)) {
                            send = bufferedChannel.send(new BlockersScreens.SuccessMessageScreen(copy$default3, null, str, null, 10), this);
                            if (send != coroutineSingletons2) {
                                send = Unit.INSTANCE;
                                break;
                            }
                        } else {
                            send = bufferedChannel.send(((BlockersDataNavigator) disclosurePresenter.blockersNavigator).getNext((BlockersScreens) disclosurePresenter.args, copy$default3), this);
                            if (send != coroutineSingletons2) {
                                send = Unit.INSTANCE;
                                break;
                            }
                        }
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                    return null;
                }
                Timber.Forest.e("Failed to verify identity.", new Object[0]);
                MutableState mutableState3 = (MutableState) this.$state$delegate;
                ((IdvViewModel) mutableState3.getValue()).getClass();
                mutableState3.setValue(new IdvViewModel(false));
                FailureMessageBlockerScreen failureMessageBlockerScreen = new FailureMessageBlockerScreen(blockersData, TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, r10).message, r10, i5);
                this.label = 2;
                break;
                break;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$1 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope, (MutableStateFlow) obj5, (CashtagPresenter) obj3, (MutableState) this.$state$delegate, (MutableState) obj4, 10);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj6).collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons3) {
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
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$12 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(11, (MutableState) this.$state$delegate, (MutableState) obj3, (MutableState) obj4, (FileBlockerPresenter) obj5, coroutineScope2);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj6).collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$12, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
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
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$3 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope3, (FormBlockerPresenter) obj5, (MutableSharedFlow) obj3, (Map) obj4, (MutableState) this.$state$delegate, 21);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj6).collect(datePickerKt$updateDisplayedMonth$3, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
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
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$13 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(12, (MutableState) this.$state$delegate, (MutableState) obj3, (MutableState) obj4, (DisclosurePresenter) obj5, coroutineScope4);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj6).collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$13, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
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
                CharSequence charSequence = (CharSequence) obj5;
                MutableState mutableState4 = (MutableState) obj4;
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj6;
                BlockersScreens.SetNameScreen setNameScreen = (BlockersScreens.SetNameScreen) cardLockPresenter.args;
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                SetNamePresenter$SubmitNameResult.Successful successful = SetNamePresenter$SubmitNameResult.Successful.INSTANCE;
                SetNameViewModel$Event$SubmissionFailed setNameViewModel$Event$SubmissionFailed = SetNameViewModel$Event$SubmissionFailed.INSTANCE;
                SetNamePresenter$SubmitNameResult.NotSuccessful notSuccessful = SetNamePresenter$SubmitNameResult.NotSuccessful.INSTANCE;
                SetNameViewModel$Event$Done setNameViewModel$Event$Done = SetNameViewModel$Event$Done.INSTANCE;
                if (i10 != 0) {
                    if (i10 == 1) {
                        MutableState mutableState5 = (MutableState) this.$state$delegate;
                        SafeTrace.throwOnFailure(obj);
                        mutableState2 = mutableState5;
                        access$createShippingAddressWithName = obj;
                        setNamePresenter$SubmitNameResult = (SetNamePresenter$SubmitNameResult) access$createShippingAddressWithName;
                        if (!Intrinsics.areEqual(setNamePresenter$SubmitNameResult, notSuccessful)) {
                            copy$default = SetNameViewModel.copy$default((SetNameViewModel) mutableState4.getValue(), setNameViewModel$Event$SubmissionFailed, null, 510);
                        } else {
                            if (!Intrinsics.areEqual(setNamePresenter$SubmitNameResult, successful)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            copy$default = SetNameViewModel.copy$default((SetNameViewModel) mutableState4.getValue(), setNameViewModel$Event$Done, null, 510);
                        }
                        mutableState2.setValue(copy$default);
                        return Unit.INSTANCE;
                    }
                    if (i10 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    MutableState mutableState6 = (MutableState) this.$state$delegate;
                    SafeTrace.throwOnFailure(obj);
                    mutableState = mutableState6;
                    access$submitShippingAddressName = obj;
                    setNamePresenter$SubmitNameResult2 = (SetNamePresenter$SubmitNameResult) access$submitShippingAddressName;
                    if (!Intrinsics.areEqual(setNamePresenter$SubmitNameResult2, notSuccessful)) {
                        copy$default2 = SetNameViewModel.copy$default((SetNameViewModel) mutableState4.getValue(), setNameViewModel$Event$SubmissionFailed, null, 510);
                    } else {
                        if (!Intrinsics.areEqual(setNamePresenter$SubmitNameResult2, successful)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        copy$default2 = SetNameViewModel.copy$default((SetNameViewModel) mutableState4.getValue(), setNameViewModel$Event$Done, null, 510);
                    }
                    mutableState.setValue(copy$default2);
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                int ordinal2 = setNameScreen.nameType.ordinal();
                if (ordinal2 == 0) {
                    SetNameViewModel setNameViewModel = (SetNameViewModel) mutableState4.getValue();
                    SetNameViewModel.NameInputProperties nameInputProperties = ((SetNameViewModel) mutableState4.getValue()).nameInputProperties;
                    mutableState4.setValue(SetNameViewModel.copy$default(setNameViewModel, SetNameViewModel$Event$Submitted.INSTANCE, new SetNameViewModel.NameInputProperties(nameInputProperties.maxLength, nameInputProperties.hint, charSequence.toString()), 508));
                    BlockersScreens.SetNameScreen.SetNameType setNameType = setNameScreen.setNameType;
                    if (!Intrinsics.areEqual(setNameType, BlockersScreens.SetNameScreen.SetNameType.SetNameOnly.INSTANCE)) {
                        if (setNameType instanceof BlockersScreens.SetNameScreen.SetNameType.CreateShippingAddressWithName) {
                            String obj7 = charSequence.toString();
                            BlockersScreens.SetNameScreen.SetNameType setNameType2 = setNameScreen.setNameType;
                            setNameType2.getClass();
                            this.this$0 = null;
                            this.$state$delegate = mutableState4;
                            this.label = 1;
                            access$createShippingAddressWithName = CardLockPresenter.access$createShippingAddressWithName(cardLockPresenter, obj7, (BlockersScreens.SetNameScreen.SetNameType.CreateShippingAddressWithName) setNameType2, this);
                            if (access$createShippingAddressWithName != coroutineSingletons7) {
                                mutableState2 = mutableState4;
                                setNamePresenter$SubmitNameResult = (SetNamePresenter$SubmitNameResult) access$createShippingAddressWithName;
                                if (!Intrinsics.areEqual(setNamePresenter$SubmitNameResult, notSuccessful)) {
                                }
                                mutableState2.setValue(copy$default);
                            }
                        } else {
                            if (!(setNameType instanceof BlockersScreens.SetNameScreen.SetNameType.SetShippingAddressName)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            String obj8 = charSequence.toString();
                            BlockersScreens.SetNameScreen.SetNameType setNameType3 = setNameScreen.setNameType;
                            setNameType3.getClass();
                            this.this$0 = null;
                            this.$state$delegate = mutableState4;
                            this.label = 2;
                            access$submitShippingAddressName = CardLockPresenter.access$submitShippingAddressName(cardLockPresenter, obj8, (BlockersScreens.SetNameScreen.SetNameType.SetShippingAddressName) setNameType3, this);
                            if (access$submitShippingAddressName != coroutineSingletons7) {
                                mutableState = mutableState4;
                                setNamePresenter$SubmitNameResult2 = (SetNamePresenter$SubmitNameResult) access$submitShippingAddressName;
                                if (!Intrinsics.areEqual(setNamePresenter$SubmitNameResult2, notSuccessful)) {
                                }
                                mutableState.setValue(copy$default2);
                            }
                        }
                        return coroutineSingletons7;
                    }
                    JobKt.launch$default(coroutineScope5, null, null, new SetNamePresenter$models$1$1$1(cardLockPresenter, charSequence, mutableState4, (Continuation) null), 3);
                } else {
                    if (ordinal2 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    cardLockPresenter.navigator.goTo(((BlockersDataNavigator) cardLockPresenter.cardLockFlowTypeProvider).getNext(setNameScreen, BlockersData.copy$default(setNameScreen.blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, new RedactedString(charSequence.toString()), null, null, null, BlockersDataKt.plus(setNameScreen.blockersData.idvSignalsContext, ((RealSecuritySignalsAggregator) ((SecuritySignalsAggregator) cardLockPresenter.flowStarter)).buildSignalsContext(((SetNameEvent.NameSubmitted) ((SetNameEvent) obj3)).signalsContext)), null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -71303169, 65535)));
                    mutableState4.setValue(SetNameViewModel.copy$default((SetNameViewModel) mutableState4.getValue(), setNameViewModel$Event$Done, null, 510));
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str5 = (String) ((Versioned) obj6).value;
                    SetPinPresenter setPinPresenter = (SetPinPresenter) obj5;
                    KClassImpl$Data$$Lambda$23 kClassImpl$Data$$Lambda$23 = new KClassImpl$Data$$Lambda$23(i3, setPinPresenter, (MutableState) this.$state$delegate, (MutableState) obj3);
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1 = new RealBrandFollowPresenter$models$2$1$1(14, (MutableState) obj4);
                    this.this$0 = null;
                    this.label = 1;
                    if (SetPinPresenter.access$submitPin(setPinPresenter, str5, kClassImpl$Data$$Lambda$23, realBrandFollowPresenter$models$2$1$1, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
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
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$14 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope6, (VerifyContactsPresenter) obj5, (State) obj3, (MutableState) this.$state$delegate, (MutableState) obj4, 13);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj6).collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$14, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
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
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 != 0) {
                    if (i13 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SubmitFormRequest submitFormRequest = new SubmitFormRequest((RequestContext) this.this$0, (String) obj6, CollectionsKt__CollectionsJVMKt.listOf(new SubmitFormRequest.ElementResult((String) (objArr == true ? 1 : 0), (zzdi) new SubmitFormRequest$ElementResult$Result$TextInputResult(new SubmitFormRequest.ElementResult.TextInputResult(CollectionsKt__CollectionsJVMKt.listOf((String) obj3))), 5)), 8);
                String str6 = (String) this.$state$delegate;
                this.label = 1;
                Object submitForm = ((AppService) ((Result) obj5).text).submitForm((ClientScenario) obj4, str6, submitFormRequest, this);
                return submitForm == coroutineSingletons10 ? coroutineSingletons10 : submitForm;
            case 9:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$15 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(coroutineScope7, (BlockersScreens.WebViewBlockerScreen) obj5, (WebViewBlockerPresenter) obj3, (MutableState) this.$state$delegate, (MutableState) obj4, 14);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj6).collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$15, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                MutableState mutableState7 = (MutableState) this.$state$delegate;
                String str7 = (String) this.this$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                try {
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutableState7.setValue(Boolean.TRUE);
                        BinaryBitmap binaryBitmap = (BinaryBitmap) ((LocalHomePresenter) obj6).localHomeGeoPresenterFactory;
                        this.this$0 = null;
                        this.label = 1;
                        m2100generateTitlegIAlus = binaryBitmap.m2100generateTitlegIAlus(str7, this);
                        if (m2100generateTitlegIAlus == coroutineSingletons12) {
                            return coroutineSingletons12;
                        }
                    } else {
                        if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        m2100generateTitlegIAlus = ((kotlin.Result) obj).value;
                    }
                    MutableState mutableState8 = (MutableState) obj5;
                    MutableState mutableState9 = (MutableState) obj3;
                    Result.Companion companion = kotlin.Result.Companion;
                    if (!(m2100generateTitlegIAlus instanceof Result.Failure)) {
                        String str8 = (String) m2100generateTitlegIAlus;
                        if (!((Boolean) mutableState8.getValue()).booleanValue()) {
                            mutableState9.setValue(BugReport.copy$default((BugReport) mutableState9.getValue(), str8, null, null, null, 30));
                        }
                    }
                    MutableState mutableState10 = (MutableState) obj4;
                    Throwable m4120exceptionOrNullimpl = kotlin.Result.m4120exceptionOrNullimpl(m2100generateTitlegIAlus);
                    if (m4120exceptionOrNullimpl != null) {
                        mutableState10.setValue(Boolean.TRUE);
                        Timber.Forest.w("Title generation failed", new Object[0], m4120exceptionOrNullimpl);
                    }
                    mutableState7.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                } finally {
                    mutableState7.setValue(Boolean.FALSE);
                }
            case 11:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$32 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope8, (CardStudioPresenter) obj5, (CoroutineScope) obj3, (MutableState) this.$state$delegate, (MutableState) obj4, 26);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj6).collect(datePickerKt$updateDisplayedMonth$32, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                PaymentDeviceCustomizationViewEvent paymentDeviceCustomizationViewEvent = (PaymentDeviceCustomizationViewEvent) this.this$0;
                MutableState mutableState11 = (MutableState) this.$state$delegate;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str9 = (String) mutableState11.getValue();
                    PaymentDeviceCustomizationViewEvent.PersonalizeCard personalizeCard = (PaymentDeviceCustomizationViewEvent.PersonalizeCard) paymentDeviceCustomizationViewEvent;
                    mutableState11.setValue(personalizeCard.paymentDeviceId);
                    this.label = 1;
                    if (PaymentDeviceCustomizationPresenter.access$personalizeCard((PaymentDeviceCustomizationPresenter) obj6, personalizeCard.paymentDeviceId, str9, (List) obj5, (Map) ((State) obj4).getValue(), (PaymentCardGlobalConfig) obj3, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
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
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new ta$$ExternalSyntheticLambda1((CardWobbleState) this.this$0, (State) obj6, (MutableState) this.$state$delegate, (State) obj5, (MutableState) obj3, 8));
                    PlaidLinkView.AnonymousClass2 anonymousClass2 = new PlaidLinkView.AnonymousClass2((CardScene) obj4, continuation, i2);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow, anonymousClass2, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
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
                GrantPresenter grantPresenter = (GrantPresenter) obj3;
                BlockerAction blockerAction = (BlockerAction) obj5;
                Long l = (Long) obj6;
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) ((MutableState) this.$state$delegate).getValue()).booleanValue()) {
                        long longValue = l.longValue();
                        this.this$0 = coroutineScope9;
                        this.label = 1;
                        if (JobKt.delay(longValue, this) == coroutineSingletons16) {
                            return coroutineSingletons16;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                com.squareup.cash.cdf.BlockerAction cdfBlockerAction = CdfUtilsKt.toCdfBlockerAction(blockerAction);
                if (cdfBlockerAction != null) {
                    grantPresenter.analytics.track(new BlockerFlowInteractTriggerScheduledAction(new Integer((int) l.longValue()), cdfBlockerAction), null);
                }
                JobKt.launch$default(coroutineScope9, null, null, new VerifyCheckDepositPresenter$models$3$1(grantPresenter, blockerAction, (MutableState) obj4, (Continuation) null), 3);
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$33 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope10, (CaptureCheckFacePresenter) obj5, (MutableState) this.$state$delegate, (MutableState) obj3, (MutableState) obj4, 29);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj6).collect(datePickerKt$updateDisplayedMonth$33, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
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
                CoroutineScope coroutineScope11 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$16 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(16, (MutableState) this.$state$delegate, (MutableState) obj3, (MutableState) obj4, (VerifyCheckDepositPresenter) obj5, coroutineScope11);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj6).collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$16, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
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
                CoroutineScope coroutineScope12 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1 localCashBalancePresenter$models$$inlined$CollectEffect$1$17 = new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1((Object) coroutineScope12, obj5, obj3, this.$state$delegate, obj4, 17);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj6).collect(localCashBalancePresenter$models$$inlined$CollectEffect$1$17, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
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
                RealBlockersHelper realBlockersHelper = (RealBlockersHelper) obj5;
                BlockersData blockersData3 = (BlockersData) obj6;
                FlowCollector flowCollector = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersHelper.BlockersAction.ToggleSpinner toggleSpinner = new BlockersHelper.BlockersAction.ToggleSpinner(true);
                    this.this$0 = flowCollector;
                    this.label = 1;
                    if (flowCollector.emit(toggleSpinner, this) == coroutineSingletons20) {
                        coroutineSingletons = coroutineSingletons20;
                        return coroutineSingletons;
                    }
                } else if (i23 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i23 != 2) {
                        if (i23 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    coroutineSingletons = coroutineSingletons20;
                    trackBlockerSubmissionAnalytics$default2 = obj;
                    ApiResult apiResult2 = (ApiResult) trackBlockerSubmissionAnalytics$default2;
                    if (apiResult2 instanceof ApiResult.Success) {
                        Screen screen = (Screen) obj4;
                        BlockersData blockersData4 = (BlockersData) obj6;
                        ClientScenario clientScenario = (ClientScenario) this.$state$delegate;
                        SelectOptionResponse selectOptionResponse = (SelectOptionResponse) ((ApiResult.Success) apiResult2).response;
                        SelectOptionResponse.Status status2 = selectOptionResponse.status;
                        if (status2 == null) {
                            status2 = ProtoDefaults.SELECT_OPTION_STATUS;
                        }
                        int ordinal3 = status2.ordinal();
                        if (ordinal3 == 0) {
                            Timber.Forest.e("Select Option Invalid", new Object[0]);
                        } else if (ordinal3 == 1) {
                            Timber.Forest.d("Select Option Success", new Object[0]);
                        } else {
                            if (ordinal3 != 2) {
                                SelectOptionResponse.Status status3 = selectOptionResponse.status;
                                status3.getClass();
                                Path$$ExternalSyntheticBUOutline0.m(status3, "Unknown status: ");
                                return null;
                            }
                            Timber.Forest.e("Select Option Concurrent Mod", new Object[0]);
                        }
                        BlockersData copy$default4 = BlockersData.copy$default(blockersData4, null, null, null, null, null, null, null, null, false, false, null, null, null, false, clientScenario, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65537, 65535);
                        ResponseContext responseContext3 = selectOptionResponse.response_context;
                        responseContext3.getClass();
                        access$blockersFailure = new AppLockMonitor$special$$inlined$map$2(new BlockersHelper.BlockersAction.ShowScreen(realBlockersHelper.blockersNavigator.getNext(screen, copy$default4.updateFromResponseContext(responseContext3, false))), 19);
                        this.this$0 = null;
                        this.label = 3;
                        break;
                    } else {
                        if (!(apiResult2 instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        access$blockersFailure = RealBlockersHelper.access$blockersFailure(realBlockersHelper, (ApiResult.Failure) apiResult2, blockersData3);
                        this.this$0 = null;
                        this.label = 3;
                    }
                }
                RequestContext requestContext = blockersData3.requestContext;
                SelectOptionRequest selectOptionRequest = new SelectOptionRequest(requestContext, (String) obj3, requestContext.transfer_token, requestContext.payment_tokens, ByteString.EMPTY);
                Analytics analytics2 = realBlockersHelper.analytics;
                BlockersData blockersData5 = (BlockersData) obj6;
                AndroidStringManager androidStringManager2 = realBlockersHelper.stringManager;
                FlowStarter$$ExternalSyntheticLambda0 flowStarter$$ExternalSyntheticLambda0 = new FlowStarter$$ExternalSyntheticLambda0(25);
                DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(realBlockersHelper, (ClientScenario) this.$state$delegate, blockersData5, selectOptionRequest, null, 9);
                this.this$0 = flowCollector;
                this.label = 2;
                coroutineSingletons = coroutineSingletons20;
                trackBlockerSubmissionAnalytics$default2 = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData5, analytics2, androidStringManager2, this, flowStarter$$ExternalSyntheticLambda0, dataStoreImpl$readDataOrHandleCorruption$3);
                break;
            case 19:
                TransferFundsRequest transferFundsRequest2 = (TransferFundsRequest) obj5;
                RealTransferManager realTransferManager2 = (RealTransferManager) obj6;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str10 = (String) obj3;
                    BlockersData.MoneybotContext moneybotContext = (BlockersData.MoneybotContext) this.$state$delegate;
                    this.this$0 = realTransferManager2;
                    this.label = 1;
                    obj2 = null;
                    transferFundsRequest = transferFundsRequest2;
                    doTransferFunds = realTransferManager2.doTransferFunds(transferFundsRequest, (TransferType) obj4, str10, false, moneybotContext, this);
                    if (doTransferFunds == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                    realTransferManager = realTransferManager2;
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    RealTransferManager realTransferManager3 = (RealTransferManager) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    realTransferManager = realTransferManager3;
                    obj2 = null;
                    transferFundsRequest = transferFundsRequest2;
                    doTransferFunds = obj;
                }
                RealTransferManager.InternalTransferFundsResult internalTransferFundsResult = (RealTransferManager.InternalTransferFundsResult) doTransferFunds;
                CaptureCheckFaceKt$$ExternalSyntheticLambda11 captureCheckFaceKt$$ExternalSyntheticLambda11 = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(i2, transferFundsRequest, realTransferManager2, (TransferType) obj4);
                realTransferManager.getClass();
                if (internalTransferFundsResult instanceof RealTransferManager.InternalTransferFundsResult.Successful) {
                    return ((RealTransferManager.InternalTransferFundsResult.Successful) internalTransferFundsResult).result;
                }
                if (internalTransferFundsResult instanceof RealTransferManager.InternalTransferFundsResult.Failure) {
                    return (TransferManager.TransferFundsResult) captureCheckFaceKt$$ExternalSyntheticLambda11.invoke(internalTransferFundsResult);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return obj2;
            case 20:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$2 = new RealBlockersHelper$collectBlockersActions$2(coroutineScope13, (PaperMoneyDepositMapPresenter) obj5, (State) obj3, (MutableState) this.$state$delegate, (MutableState) obj4);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj6).collect(realBlockersHelper$collectBlockersActions$2, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
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
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj6;
                MutableState mutableState12 = (MutableState) obj5;
                String str11 = (String) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (str11.length() != 0) {
                        mutableState12.setValue(Boolean.TRUE);
                        this.this$0 = str11;
                        this.label = 1;
                        break;
                    } else {
                        ((MutableState) this.$state$delegate).setValue(EmptyList.INSTANCE);
                        return Unit.INSTANCE;
                    }
                } else if (i26 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    Flow search$default = RealRecipientRepository.search$default((RealRecipientRepository) cardStudioPresenter.analytics, str11, null, null, null, null, 14326);
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$1 = new NearbyPayRequestPresenter$models$10$1$1$1(cardStudioPresenter, (SnapshotStateSet) obj3, (Map) obj4, (MutableState) this.$state$delegate, (MutableState) obj5, 2);
                    this.this$0 = null;
                    this.label = 2;
                    break;
                } else {
                    if (i26 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 22:
                return invokeSuspend$com$squareup$cash$earnings$presenters$payers$AddPayerCustomersPresenter$models$2$1(obj);
            case 23:
                return invokeSuspend$com$squareup$cash$earningstracker$views$components$EarningsHeaderKt$EarningsCounter$startCountingAnimation$1(obj);
            case 24:
                return invokeSuspend$com$squareup$cash$family$familyhub$backend$real$RealManagedAccountTransferManager$initiateTransfer$1(obj);
            case 25:
                return invokeSuspend$com$squareup$cash$family$familyhub$presenters$DependentDetailPresenter$models$$inlined$CollectEffect$1(obj);
            case 26:
                return invokeSuspend$com$squareup$cash$family$familyhub$presenters$FamilyHomePresenter$models$$inlined$CollectEffect$1(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$family$requestsponsorship$presenters$SelectSponsorPresenter$models$$inlined$CollectEffect$1(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$fidesmo$presenters$FidesmoDeprovisioningPresenter$models$10$1(obj);
            default:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState13 = (MutableState) this.$state$delegate;
                    FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1 fidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1 = new FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1((StateFlow) obj6, mutableState13, 0);
                    DbSessionManager$updateDb$2 dbSessionManager$updateDb$2 = new DbSessionManager$updateDb$2((FidesmoProvisioningPresenter) obj5, (Activity) obj4, coroutineScope14, (String) obj3, mutableState13, null, 4);
                    this.this$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(fidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1, dbSessionManager$updateDb$2, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealIdvPresenter$models$1$1(MoleculePresenter moleculePresenter, MutableState mutableState, MutableState mutableState2, Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$blockersData = moleculePresenter;
        this.$state$delegate = mutableState;
        this.$address = mutableState2;
        this.$ssn = obj;
        this.$request = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealIdvPresenter$models$1$1(BlockersData blockersData, String str, RealBlockersHelper realBlockersHelper, Screen screen, ClientScenario clientScenario, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 18;
        this.$blockersData = blockersData;
        this.$ssn = str;
        this.$address = realBlockersHelper;
        this.$request = screen;
        this.$state$delegate = clientScenario;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealIdvPresenter$models$1$1(PaymentDeviceCustomizationViewEvent paymentDeviceCustomizationViewEvent, PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter, List list, PaymentCardGlobalConfig paymentCardGlobalConfig, MutableState mutableState, State state, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 12;
        this.this$0 = paymentDeviceCustomizationViewEvent;
        this.$blockersData = paymentDeviceCustomizationPresenter;
        this.$address = list;
        this.$ssn = paymentCardGlobalConfig;
        this.$state$delegate = mutableState;
        this.$request = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealIdvPresenter$models$1$1(CardWobbleState cardWobbleState, State state, MutableState mutableState, State state2, MutableState mutableState2, CardScene cardScene, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 13;
        this.this$0 = cardWobbleState;
        this.$blockersData = state;
        this.$state$delegate = mutableState;
        this.$address = state2;
        this.$ssn = mutableState2;
        this.$request = cardScene;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealIdvPresenter$models$1$1(RealTransferManager realTransferManager, TransferFundsRequest transferFundsRequest, TransferType transferType, String str, BlockersData.MoneybotContext moneybotContext, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 19;
        this.$blockersData = realTransferManager;
        this.$address = transferFundsRequest;
        this.$request = transferType;
        this.$ssn = str;
        this.$state$delegate = moneybotContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealIdvPresenter$models$1$1(CardLockPresenter cardLockPresenter, CharSequence charSequence, SetNameEvent setNameEvent, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 5;
        this.$blockersData = cardLockPresenter;
        this.$address = charSequence;
        this.$ssn = setNameEvent;
        this.$request = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealIdvPresenter$models$1$1(Long l, BlockerAction blockerAction, MutableState mutableState, GrantPresenter grantPresenter, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 14;
        this.$blockersData = l;
        this.$address = blockerAction;
        this.$state$delegate = mutableState;
        this.$ssn = grantPresenter;
        this.$request = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealIdvPresenter$models$1$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$blockersData = obj2;
        this.$address = obj3;
        this.$ssn = obj4;
        this.$request = obj5;
        this.$state$delegate = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealIdvPresenter$models$1$1(Object obj, Continuation continuation, MoleculePresenter moleculePresenter, MutableState mutableState, Object obj2, State state, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$blockersData = obj;
        this.$address = moleculePresenter;
        this.$state$delegate = mutableState;
        this.$ssn = obj2;
        this.$request = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealIdvPresenter$models$1$1(String str, RequestContext requestContext, String str2, com.google.zxing.Result result, ClientScenario clientScenario, String str3, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.$ssn = str;
        this.this$0 = requestContext;
        this.$blockersData = str2;
        this.$address = result;
        this.$request = clientScenario;
        this.$state$delegate = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealIdvPresenter$models$1$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, Object obj, Object obj2, MutableState mutableState, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$blockersData = flow;
        this.$address = moleculePresenter;
        this.$ssn = obj;
        this.$request = obj2;
        this.$state$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealIdvPresenter$models$1$1(Flow flow, Continuation continuation, Object obj, Object obj2, MutableState mutableState, MutableState mutableState2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$blockersData = flow;
        this.$address = obj;
        this.$ssn = obj2;
        this.$state$delegate = mutableState;
        this.$request = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealIdvPresenter$models$1$1(StateFlow stateFlow, MutableState mutableState, MoleculePresenter moleculePresenter, Activity activity, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$blockersData = stateFlow;
        this.$state$delegate = mutableState;
        this.$address = moleculePresenter;
        this.$request = activity;
        this.$ssn = str;
    }
}
