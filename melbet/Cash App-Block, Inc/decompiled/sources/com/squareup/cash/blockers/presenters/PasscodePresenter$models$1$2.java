package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.paging.PageFetcher$flow$1;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.InputHandlerKt;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.PasscodePresenter;
import com.squareup.cash.blockers.presenters.ReferralCodePresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.Header;
import com.squareup.cash.blockers.viewmodels.Header$Avatar$Placeholder;
import com.squareup.cash.blockers.viewmodels.Header$Avatar$Url;
import com.squareup.cash.blockers.viewmodels.IdvViewModel;
import com.squareup.cash.blockers.viewmodels.OnboardingInternalRouteViewModel;
import com.squareup.cash.blockers.viewmodels.PasscodeViewEvent;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewEvent;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.SetAddressViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameEvent;
import com.squareup.cash.blockers.views.PasscodeViewKt$Passcode$3$1$1$1$2;
import com.squareup.cash.braze.RealBrazeManager$openSession$1$1;
import com.squareup.cash.card.onboarding.CardModelView$contouredTextTexture$2$1;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.invitations.InviteContactsPresenter$includingEmail$$inlined$map$1;
import com.squareup.cash.maps.views.CashMapViewKt$CashMapView$3$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$complete$2;
import com.squareup.protos.cash.usher.api.OnboardingInternalRouteRequest;
import com.squareup.protos.cash.usher.api.OnboardingInternalRouteResponse;
import com.squareup.protos.cash.usher.api.UsherService;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.CheckRewardCodeRequest;
import com.squareup.protos.franklin.app.CheckRewardCodeResponse;
import com.squareup.protos.franklin.app.RegisterAppMessageActionRequest;
import com.squareup.protos.franklin.blockers.OnboardingInternalRouteBlocker;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.appmessaging.AppMessageAction;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class PasscodePresenter$models$1$2 extends SuspendLambda implements Function2 {
    public Object $event;
    public /* synthetic */ Object $helpActionIsLoading$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodePresenter$models$1$2(LocalEditorialPresenter localEditorialPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.this$0 = localEditorialPresenter;
        this.$helpActionIsLoading$delegate = mutableState;
        this.$event = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new PasscodePresenter$models$1$2((PasscodePresenter) this.this$0, (PasscodeViewEvent) this.$event, (MutableState) this.$helpActionIsLoading$delegate, continuation, 0);
            case 1:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$2 = new PasscodePresenter$models$1$2((Flow) this.$event, continuation, (EndAppLockPresenter) this.$helpActionIsLoading$delegate, 1);
                passcodePresenter$models$1$2.this$0 = obj;
                return passcodePresenter$models$1$2;
            case 2:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$22 = new PasscodePresenter$models$1$2((Flow) this.$event, continuation, (ErrorPresenter) this.$helpActionIsLoading$delegate, 2);
                passcodePresenter$models$1$22.this$0 = obj;
                return passcodePresenter$models$1$22;
            case 3:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$23 = new PasscodePresenter$models$1$2((Flow) this.$event, continuation, (ErrorPresenter) this.$helpActionIsLoading$delegate, 3);
                passcodePresenter$models$1$23.this$0 = obj;
                return passcodePresenter$models$1$23;
            case 4:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$24 = new PasscodePresenter$models$1$2((Flow) this.$event, continuation, (ErrorPresenter) this.$helpActionIsLoading$delegate, 4);
                passcodePresenter$models$1$24.this$0 = obj;
                return passcodePresenter$models$1$24;
            case 5:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$25 = new PasscodePresenter$models$1$2((Flow) this.$event, continuation, (InstrumentSelectionListSheetPresenter) this.$helpActionIsLoading$delegate, 5);
                passcodePresenter$models$1$25.this$0 = obj;
                return passcodePresenter$models$1$25;
            case 6:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$26 = new PasscodePresenter$models$1$2((Flow) this.$event, continuation, (ErrorPresenter) this.$helpActionIsLoading$delegate, 6);
                passcodePresenter$models$1$26.this$0 = obj;
                return passcodePresenter$models$1$26;
            case 7:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$27 = new PasscodePresenter$models$1$2((Flow) this.$event, continuation, (PoolsListPresenter) this.$helpActionIsLoading$delegate, 7);
                passcodePresenter$models$1$27.this$0 = obj;
                return passcodePresenter$models$1$27;
            case 8:
                return new PasscodePresenter$models$1$2((LocalEditorialPresenter) this.this$0, (MutableState) this.$helpActionIsLoading$delegate, (MutableState) this.$event, continuation);
            case 9:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$28 = new PasscodePresenter$models$1$2((PasscodeConfirmTypeTransformer) this.$event, (Flow) this.$helpActionIsLoading$delegate, continuation, 9);
                passcodePresenter$models$1$28.this$0 = obj;
                return passcodePresenter$models$1$28;
            case 10:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$29 = new PasscodePresenter$models$1$2((PasscodeGenericGatedEndpointTypeTransformer) this.$event, (Flow) this.$helpActionIsLoading$delegate, continuation, 10);
                passcodePresenter$models$1$29.this$0 = obj;
                return passcodePresenter$models$1$29;
            case 11:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$210 = new PasscodePresenter$models$1$2((Flow) this.$event, continuation, (AddAliasPresenter) this.$helpActionIsLoading$delegate, 11);
                passcodePresenter$models$1$210.this$0 = obj;
                return passcodePresenter$models$1$210;
            case 12:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$211 = new PasscodePresenter$models$1$2((PasscodePresenter) this.this$0, continuation);
                passcodePresenter$models$1$211.$helpActionIsLoading$delegate = obj;
                return passcodePresenter$models$1$211;
            case 13:
                return new PasscodePresenter$models$1$2((PasscodeTypedTransformer) this.this$0, (Flow) this.$event, (ProducerScope) this.$helpActionIsLoading$delegate, continuation, 13);
            case 14:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$212 = new PasscodePresenter$models$1$2((PasscodeVerifyTypeTransformer) this.$event, (Flow) this.$helpActionIsLoading$delegate, continuation, 14);
                passcodePresenter$models$1$212.this$0 = obj;
                return passcodePresenter$models$1$212;
            case 15:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$213 = new PasscodePresenter$models$1$2((CallbackFlowBuilder) this.$event, continuation, (PlaidLinkPresenter) this.$helpActionIsLoading$delegate, 15);
                passcodePresenter$models$1$213.this$0 = obj;
                return passcodePresenter$models$1$213;
            case 16:
                return new PasscodePresenter$models$1$2((PromotionPanePresenter) this.this$0, (RegisterAppMessageActionRequest) this.$event, (AppMessageAction) this.$helpActionIsLoading$delegate, continuation, 16);
            case 17:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$214 = new PasscodePresenter$models$1$2((Flow) this.$event, continuation, (CameraPermissionPresenter) this.$helpActionIsLoading$delegate, 17);
                passcodePresenter$models$1$214.this$0 = obj;
                return passcodePresenter$models$1$214;
            case 18:
                return new PasscodePresenter$models$1$2((ReferralCodePresenter) this.this$0, (CharSequence) this.$event, (MutableSharedFlow) this.$helpActionIsLoading$delegate, continuation, 18);
            case 19:
                return new PasscodePresenter$models$1$2((MutableSharedFlow) this.this$0, (ReferralCodePresenter) this.$event, (MutableState) this.$helpActionIsLoading$delegate, continuation, 19);
            case 20:
                return new PasscodePresenter$models$1$2((RegisterAliasPresenter) this.this$0, (RegisterAliasViewEvent) this.$event, (Function1) this.$helpActionIsLoading$delegate, continuation, 20);
            case 21:
                return new PasscodePresenter$models$1$2((RegisterAliasPresenter) this.this$0, (Function1) this.$event, (MutableState) this.$helpActionIsLoading$delegate, continuation, 21);
            case 22:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$215 = new PasscodePresenter$models$1$2((Flow) this.$event, continuation, (ErrorPresenter) this.$helpActionIsLoading$delegate, 22);
                passcodePresenter$models$1$215.this$0 = obj;
                return passcodePresenter$models$1$215;
            case 23:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$216 = new PasscodePresenter$models$1$2((Flow) this.$event, continuation, (ErrorPresenter) this.$helpActionIsLoading$delegate, 23);
                passcodePresenter$models$1$216.this$0 = obj;
                return passcodePresenter$models$1$216;
            case 24:
                return new PasscodePresenter$models$1$2((Flow) this.this$0, (EndAppLockPresenter) this.$event, (ClientScenario) this.$helpActionIsLoading$delegate, continuation, 24);
            case 25:
                return new PasscodePresenter$models$1$2((SavingsTransferOptionSelectionPresenter) this.this$0, (SavingsTransferOptionSelectionViewEvent) this.$event, (MutableState) this.$helpActionIsLoading$delegate, continuation, 25);
            case 26:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$217 = new PasscodePresenter$models$1$2((Flow) this.$event, continuation, (SelectionPresenter) this.$helpActionIsLoading$delegate, 26);
                passcodePresenter$models$1$217.this$0 = obj;
                return passcodePresenter$models$1$217;
            case 27:
                return new PasscodePresenter$models$1$2((CardLockPresenter) this.this$0, (IdvViewModel) this.$event, (MutableState) this.$helpActionIsLoading$delegate, continuation, 27);
            case 28:
                return new PasscodePresenter$models$1$2((CardLockPresenter) this.this$0, (SetNameEvent) this.$event, (MutableState) this.$helpActionIsLoading$delegate, continuation, 28);
            default:
                PasscodePresenter$models$1$2 passcodePresenter$models$1$218 = new PasscodePresenter$models$1$2((Flow) this.$event, continuation, (EndAppLockPresenter) this.$helpActionIsLoading$delegate, 29);
                passcodePresenter$models$1$218.this$0 = obj;
                return passcodePresenter$models$1$218;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 19:
                ((PasscodePresenter$models$1$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((PasscodePresenter$models$1$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0322, code lost:
    
        if (r0.emit(com.squareup.cash.blockers.presenters.ReferralCodePresenter.InternalUpdate.RewardCodeCheckRequestErrored.INSTANCE, r22) == r3) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0362, code lost:
    
        if (r0.emit(r1, r22) == r3) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0311, code lost:
    
        if (r1 == r3) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0484, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r2, r4, r22) == r3) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0455, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r1)._channel.send(r8, r22) == r3) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x05ae, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r1, r4, r22) == r3) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x057d, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r2)._channel.send(r4, r22) == r3) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x061b, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r1, r6, r22) == r3) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x05ec, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r2)._channel.send(r11, r22) == r3) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
    
        if (r0 != false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object onboardingInternalRoute;
        String str;
        Object generateTitle;
        Object registerAppMessageAction;
        Object checkRewardCode;
        Object rewardCodeCheckValid;
        Object skip;
        boolean z;
        int i = 18;
        int i2 = 19;
        int i3 = 6;
        int i4 = 3;
        boolean z2 = false;
        Object[] objArr = 0;
        int i5 = 2;
        boolean z3 = true;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodePresenter passcodePresenter = (PasscodePresenter) this.this$0;
                    RealBlockersHelper realBlockersHelper = passcodePresenter.blockersHelper;
                    HelpItem helpItem = ((PasscodeViewEvent.HelpClick) ((PasscodeViewEvent) this.$event)).item;
                    BlockersScreens.PasscodeScreen passcodeScreen = passcodePresenter.args;
                    InteractiveCardView$flingTo$1.AnonymousClass2 anonymousClass2 = new InteractiveCardView$flingTo$1.AnonymousClass2(passcodePresenter, continuation, 9);
                    CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$1 = new CashMapViewKt$CashMapView$3$1((MutableState) this.$helpActionIsLoading$delegate, continuation, i4);
                    this.label = 1;
                    if (realBlockersHelper.performHelpAction(helpItem, passcodeScreen, anonymousClass2, cashMapViewKt$CashMapView$3$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$event;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$1 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope, (EndAppLockPresenter) this.$helpActionIsLoading$delegate, 26);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow.collect(clientScenarioLauncherPresenter$models$1$1$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$event;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$12 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope2, (ErrorPresenter) this.$helpActionIsLoading$delegate, 27);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow2.collect(clientScenarioLauncherPresenter$models$1$1$12, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$event;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$13 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope3, (ErrorPresenter) this.$helpActionIsLoading$delegate, 28);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow3.collect(clientScenarioLauncherPresenter$models$1$1$13, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$event;
                    ClientScenarioLauncherPresenter$models$1$1$1 clientScenarioLauncherPresenter$models$1$1$14 = new ClientScenarioLauncherPresenter$models$1$1$1(coroutineScope4, (ErrorPresenter) this.$helpActionIsLoading$delegate, 29);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow4.collect(clientScenarioLauncherPresenter$models$1$1$14, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$event;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$1 = new RealBrazeManager$openSession$1$1(coroutineScope5, (InstrumentSelectionListSheetPresenter) this.$helpActionIsLoading$delegate, c == true ? 1 : 0);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow5.collect(realBrazeManager$openSession$1$1, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$event;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$12 = new RealBrazeManager$openSession$1$1(coroutineScope6, (ErrorPresenter) this.$helpActionIsLoading$delegate, i5);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow6.collect(realBrazeManager$openSession$1$12, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$event;
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$2 = new PasscodeViewKt$Passcode$3$1$1$1$2(17, coroutineScope7, (PoolsListPresenter) this.$helpActionIsLoading$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow7.collect(passcodeViewKt$Passcode$3$1$1$1$2, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.this$0;
                BlockersScreens.OnboardingInternalRouteScreen onboardingInternalRouteScreen = (BlockersScreens.OnboardingInternalRouteScreen) localEditorialPresenter.launcher;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UsherService usherService = (UsherService) localEditorialPresenter.service;
                    OnboardingInternalRouteBlocker onboardingInternalRouteBlocker = onboardingInternalRouteScreen.data;
                    OnboardingInternalRouteRequest onboardingInternalRouteRequest = new OnboardingInternalRouteRequest(onboardingInternalRouteBlocker.flow_token, onboardingInternalRouteBlocker.child_flow_type, onboardingInternalRouteScreen.blockersData.requestContext, onboardingInternalRouteBlocker.encoded_flow_params, ByteString.EMPTY);
                    this.label = 1;
                    onboardingInternalRoute = usherService.onboardingInternalRoute(onboardingInternalRouteRequest, this);
                    if (onboardingInternalRoute == coroutineSingletons9) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    onboardingInternalRoute = obj;
                }
                ApiResult apiResult = (ApiResult) onboardingInternalRoute;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        OnboardingInternalRouteResponse onboardingInternalRouteResponse = (OnboardingInternalRouteResponse) ((ApiResult.Success) apiResult).response;
                        OnboardingInternalRouteResponse.Instruction instruction = onboardingInternalRouteResponse.instruction;
                        instruction.getClass();
                        int ordinal = instruction.ordinal();
                        if (ordinal == 0) {
                            RealRouter realRouter = (RealRouter) localEditorialPresenter.responseContextHandler;
                            String str2 = onboardingInternalRouteResponse.internal_navigation_url;
                            str2.getClass();
                            z3 = realRouter.route(new RoutingParams(null, null, onboardingInternalRouteScreen, null, null, null, 503), str2);
                        } else if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            BlockersData blockersData = onboardingInternalRouteScreen.blockersData;
                            ResponseContext responseContext = onboardingInternalRouteResponse.response_context;
                            responseContext.getClass();
                            Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                            ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(((BlockersDataNavigator) localEditorialPresenter.installedStore).getNext(onboardingInternalRouteScreen, blockersData.updateFromResponseContext(responseContext, false)));
                        }
                        if (!z3) {
                            Timber.Forest.d("Client Route failed to route in OnboardingInternalRoutePresenter", new Object[0]);
                            ((MutableState) this.$event).setValue(new Object());
                        }
                    }
                } else {
                    ((MutableState) this.$helpActionIsLoading$delegate).setValue(new OnboardingInternalRouteViewModel(false, (String) localEditorialPresenter.clock, (String) localEditorialPresenter.stringManager, (String) localEditorialPresenter.screen));
                }
                break;
            case 9:
                PasscodeConfirmTypeTransformer passcodeConfirmTypeTransformer = (PasscodeConfirmTypeTransformer) this.$event;
                ProducerScope producerScope = (ProducerScope) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodeViewModel.VerifyPasscodeModel.BiometricsPrompt biometricsPrompt = new PasscodeViewModel.VerifyPasscodeModel.BiometricsPrompt(passcodeConfirmTypeTransformer.biometricsInfo.moveFunds);
                    this.this$0 = producerScope;
                    this.label = 1;
                    break;
                } else if (i15 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i15 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                ChannelFlowBuilder merge = FlowKt.merge(new CardModelView$iconTexture$$inlined$map$1((Flow) this.$helpActionIsLoading$delegate, 12), new SafeFlow(new SsnPresenter$models$2$2(passcodeConfirmTypeTransformer, continuation, i)));
                BufferCountKt$bufferSkip$1 bufferCountKt$bufferSkip$1 = new BufferCountKt$bufferSkip$1(producerScope, passcodeConfirmTypeTransformer, continuation, i4);
                this.this$0 = null;
                this.label = 2;
                break;
            case 10:
                PasscodeGenericGatedEndpointTypeTransformer passcodeGenericGatedEndpointTypeTransformer = (PasscodeGenericGatedEndpointTypeTransformer) this.$event;
                ProducerScope producerScope2 = (ProducerScope) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodeViewModel.VerifyPasscodeModel.BiometricsPrompt promptModel = passcodeGenericGatedEndpointTypeTransformer.passcodeGatedEndpoint.promptModel(passcodeGenericGatedEndpointTypeTransformer.stringManager);
                    this.this$0 = producerScope2;
                    this.label = 1;
                    break;
                } else if (i16 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i16 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                ChannelFlowBuilder merge2 = FlowKt.merge(new RealTransferManager$addCash$$inlined$map$1(new AppLockMonitor$special$$inlined$map$2(passcodeGenericGatedEndpointTypeTransformer.biometricsToken, i), passcodeGenericGatedEndpointTypeTransformer, i5), new CardModelView$iconTexture$$inlined$map$1((Flow) this.$helpActionIsLoading$delegate, 13));
                SetNamePresenter$models$1$1$1 setNamePresenter$models$1$1$1 = new SetNamePresenter$models$1$1$1(producerScope2, passcodeGenericGatedEndpointTypeTransformer, null);
                this.this$0 = null;
                this.label = 2;
                break;
            case 11:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$event;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$13 = new RealBrazeManager$openSession$1$1(coroutineScope8, (AddAliasPresenter) this.$helpActionIsLoading$delegate, i4);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow8.collect(realBrazeManager$openSession$1$13, this) == coroutineSingletons12) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.$helpActionIsLoading$delegate;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodePresenter passcodePresenter2 = (PasscodePresenter) this.this$0;
                    str = passcodePresenter2.titleTextOverride;
                    if (str == null) {
                        this.$helpActionIsLoading$delegate = null;
                        this.$event = produceStateScope;
                        this.label = 1;
                        String str3 = passcodePresenter2.defaultTitleText;
                        generateTitle = PasscodePresenter.WhenMappings.$EnumSwitchMapping$0[InputHandlerKt.toBrand(passcodePresenter2.args.instrumentType).ordinal()] == 1 ? passcodePresenter2.pinScreensTitleGenerator.generateTitle(str3, this) : str3;
                        if (generateTitle == coroutineSingletons13) {
                            break;
                        }
                    }
                    produceStateScope.setValue(str);
                    break;
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    produceStateScope = (ProduceStateScope) this.$event;
                    SafeTrace.throwOnFailure(obj);
                    generateTitle = obj;
                }
                str = (String) generateTitle;
                produceStateScope.setValue(str);
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow transform = ((PasscodeTypedTransformer) this.this$0).transform((Flow) this.$event);
                    PasscodePresenter$models$verifyPasscodeModel$2$1$2$1 passcodePresenter$models$verifyPasscodeModel$2$1$2$1 = new PasscodePresenter$models$verifyPasscodeModel$2$1$2$1((ProducerScope) this.$helpActionIsLoading$delegate, objArr == true ? 1 : 0);
                    this.label = 1;
                    if (transform.collect(passcodePresenter$models$verifyPasscodeModel$2$1$2$1, this) == coroutineSingletons14) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 14:
                PasscodeVerifyTypeTransformer passcodeVerifyTypeTransformer = (PasscodeVerifyTypeTransformer) this.$event;
                ProducerScope producerScope3 = (ProducerScope) this.this$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasscodeViewModel.VerifyPasscodeModel.BiometricsPrompt biometricsPrompt2 = new PasscodeViewModel.VerifyPasscodeModel.BiometricsPrompt(passcodeVerifyTypeTransformer.biometricsInfo.moveFunds);
                    this.this$0 = producerScope3;
                    this.label = 1;
                    break;
                } else if (i20 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i20 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                ChannelFlowBuilder merge3 = FlowKt.merge(new CardModelView$iconTexture$$inlined$map$1((Flow) this.$helpActionIsLoading$delegate, 14), new SafeFlow(new SsnPresenter$models$2$2(passcodeVerifyTypeTransformer, continuation, i2)));
                CardModelView$contouredTextTexture$2$1 cardModelView$contouredTextTexture$2$1 = new CardModelView$contouredTextTexture$2$1(producerScope3, passcodeVerifyTypeTransformer, continuation, c2 == true ? 1 : 0);
                this.this$0 = null;
                this.label = 2;
                break;
            case 15:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CallbackFlowBuilder callbackFlowBuilder = (CallbackFlowBuilder) this.$event;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$14 = new RealBrazeManager$openSession$1$1(coroutineScope9, (PlaidLinkPresenter) this.$helpActionIsLoading$delegate, 4);
                    this.this$0 = null;
                    this.label = 1;
                    if (callbackFlowBuilder.collect(realBrazeManager$openSession$1$14, this) == coroutineSingletons16) {
                        break;
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = ((PromotionPanePresenter) this.this$0).appService;
                    RegisterAppMessageActionRequest registerAppMessageActionRequest = (RegisterAppMessageActionRequest) this.$event;
                    this.label = 1;
                    registerAppMessageAction = appService.registerAppMessageAction(registerAppMessageActionRequest, this);
                    if (registerAppMessageAction == coroutineSingletons17) {
                        break;
                    }
                } else if (i22 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    registerAppMessageAction = obj;
                }
                if (((ApiResult) registerAppMessageAction) instanceof ApiResult.Success) {
                    Timber.Forest.d("Successfully registered app message action %s", ((AppMessageAction) this.$helpActionIsLoading$delegate).action_identifier);
                } else {
                    Timber.Forest.e("Failed to register app message action", new Object[0]);
                }
                break;
            case 17:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$event;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$15 = new RealBrazeManager$openSession$1$1(coroutineScope10, (CameraPermissionPresenter) this.$helpActionIsLoading$delegate, 5);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow9.collect(realBrazeManager$openSession$1$15, this) == coroutineSingletons18) {
                        break;
                    }
                } else if (i23 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 18:
                MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.$helpActionIsLoading$delegate;
                ReferralCodePresenter referralCodePresenter = (ReferralCodePresenter) this.this$0;
                BlockersScreens.ReferralCodeScreen referralCodeScreen = referralCodePresenter.args;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService2 = referralCodePresenter.appService;
                    ClientScenario clientScenario = referralCodeScreen.blockersData.clientScenario;
                    clientScenario.getClass();
                    String str4 = referralCodeScreen.blockersData.flowToken;
                    CheckRewardCodeRequest checkRewardCodeRequest = new CheckRewardCodeRequest(((CharSequence) this.$event).toString(), ByteString.EMPTY);
                    this.label = 1;
                    checkRewardCode = appService2.checkRewardCode(clientScenario, str4, checkRewardCodeRequest, this);
                    break;
                } else if (i24 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    checkRewardCode = obj;
                } else if (i24 != 2 && i24 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                ApiResult apiResult2 = (ApiResult) checkRewardCode;
                if (!(apiResult2 instanceof ApiResult.Success)) {
                    this.label = 2;
                    break;
                } else {
                    Timber.Forest.w("Request succeeded!!", new Object[0]);
                    CheckRewardCodeResponse checkRewardCodeResponse = (CheckRewardCodeResponse) ((ApiResult.Success) apiResult2).response;
                    Boolean bool = checkRewardCodeResponse.valid;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        String str5 = checkRewardCodeResponse.inviter_photo_url;
                        rewardCodeCheckValid = new ReferralCodePresenter.InternalUpdate.RewardCodeCheckValid(new Header(str5 == null ? Header$Avatar$Placeholder.INSTANCE : new Header$Avatar$Url(str5), checkRewardCodeResponse.reward_text));
                    } else {
                        rewardCodeCheckValid = ReferralCodePresenter.InternalUpdate.RewardCodeCheckInvalid.INSTANCE;
                    }
                    this.label = 3;
                    break;
                }
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow2 = (MutableSharedFlow) this.this$0;
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$22 = new PasscodeViewKt$Passcode$3$1$1$1$2(i2, (ReferralCodePresenter) this.$event, (MutableState) this.$helpActionIsLoading$delegate);
                    this.label = 1;
                    if (mutableSharedFlow2.collect(passcodeViewKt$Passcode$3$1$1$1$22, this) == coroutineSingletons20) {
                        break;
                    }
                } else if (i25 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                break;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RegisterAliasPresenter registerAliasPresenter = (RegisterAliasPresenter) this.this$0;
                    RealBlockersHelper realBlockersHelper2 = registerAliasPresenter.blockersHelper;
                    HelpItem helpItem2 = ((RegisterAliasViewEvent.HelpItemClick) ((RegisterAliasViewEvent) this.$event)).item;
                    BlockersScreens.RegisterAliasScreen registerAliasScreen = registerAliasPresenter.args;
                    CardSchemePresenter$complete$2 cardSchemePresenter$complete$2 = new CardSchemePresenter$complete$2((Function1) this.$helpActionIsLoading$delegate, continuation, c3 == true ? 1 : 0);
                    this.label = 1;
                    if (realBlockersHelper2.performHelpAction(helpItem2, registerAliasScreen, null, cardSchemePresenter$complete$2, this) == coroutineSingletons21) {
                        break;
                    }
                } else if (i26 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RegisterAliasPresenter registerAliasPresenter2 = (RegisterAliasPresenter) this.this$0;
                    RegisterAliasViewModel.Mode mode = ((RegisterAliasViewModel) ((MutableState) this.$helpActionIsLoading$delegate).getValue()).mode;
                    Function1 function1 = (Function1) this.$event;
                    this.label = 1;
                    RegisterAliasHelper registerAliasHelper = registerAliasPresenter2.helper;
                    BlockersScreens.RegisterAliasScreen registerAliasScreen2 = registerAliasPresenter2.args;
                    if (!registerAliasHelper.isModeSwitchable(registerAliasScreen2, registerAliasPresenter2.isSmsOnly())) {
                        if (registerAliasScreen2.skippable) {
                            skip = registerAliasPresenter2.skip(function1, this);
                            if (skip != coroutineSingletons22) {
                                skip = Unit.INSTANCE;
                            }
                            if (skip == coroutineSingletons22) {
                                break;
                            }
                        }
                    } else if (mode == RegisterAliasViewModel.Mode.SMS) {
                        registerAliasPresenter2.switchToEmailMode(function1);
                    } else {
                        registerAliasPresenter2.switchToSmsMode(function1);
                    }
                    skip = Unit.INSTANCE;
                    if (skip == coroutineSingletons22) {
                    }
                } else if (i27 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 22:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.$event;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$16 = new RealBrazeManager$openSession$1$1(coroutineScope11, (ErrorPresenter) this.$helpActionIsLoading$delegate, i3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow10.collect(realBrazeManager$openSession$1$16, this) == coroutineSingletons23) {
                        break;
                    }
                } else if (i28 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 23:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.$event;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$17 = new RealBrazeManager$openSession$1$1(coroutineScope12, (ErrorPresenter) this.$helpActionIsLoading$delegate, 7);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow11.collect(realBrazeManager$openSession$1$17, this) == coroutineSingletons24) {
                        break;
                    }
                } else if (i29 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 24:
                EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) this.$event;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(new InviteContactsPresenter$includingEmail$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i5, continuation, 8), (Flow) this.this$0), i5), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation, endAppLockPresenter, (ClientScenario) this.$helpActionIsLoading$delegate, i5));
                    InteractiveCardView$flingTo$1.AnonymousClass2 anonymousClass22 = new InteractiveCardView$flingTo$1.AnonymousClass2(endAppLockPresenter, continuation, 11);
                    this.label = 1;
                    if (FlowKt.collectLatest(transformLatest, anonymousClass22, this) == coroutineSingletons25) {
                        break;
                    }
                } else if (i30 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((MutableState) this.$helpActionIsLoading$delegate).setValue(Boolean.TRUE);
                    SavingsTransferOptionSelectionPresenter savingsTransferOptionSelectionPresenter = (SavingsTransferOptionSelectionPresenter) this.this$0;
                    SavingsTransferOptionSelectionViewEvent.SelectTransferOption selectTransferOption = (SavingsTransferOptionSelectionViewEvent.SelectTransferOption) ((SavingsTransferOptionSelectionViewEvent) this.$event);
                    this.label = 1;
                    if (SavingsTransferOptionSelectionPresenter.access$handleSelectTransferOption(savingsTransferOptionSelectionPresenter, selectTransferOption, this) == coroutineSingletons26) {
                        break;
                    }
                } else if (i31 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 26:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.$event;
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$23 = new PasscodeViewKt$Passcode$3$1$1$1$2(20, coroutineScope13, (SelectionPresenter) this.$helpActionIsLoading$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow12.collect(passcodeViewKt$Passcode$3$1$1$1$23, this) == coroutineSingletons27) {
                        break;
                    }
                } else if (i32 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 27:
                MutableState mutableState = (MutableState) this.$helpActionIsLoading$delegate;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) ((CardLockPresenter) this.this$0).ioDispatcher;
                    SetAddressViewModel setAddressViewModel = (SetAddressViewModel) mutableState.getValue();
                    if (!((SetAddressViewModel) mutableState.getValue()).isLoading) {
                        IdvViewModel idvViewModel = (IdvViewModel) this.$event;
                        if (idvViewModel == null) {
                            z = false;
                            break;
                        } else {
                            z = idvViewModel.isLoading;
                            break;
                        }
                    }
                    z2 = true;
                    SetAddressViewModel copy$default = SetAddressViewModel.copy$default(setAddressViewModel, z2);
                    this.label = 1;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, copy$default);
                    if (Unit.INSTANCE == coroutineSingletons28) {
                        break;
                    }
                } else if (i33 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardLockPresenter cardLockPresenter = (CardLockPresenter) this.this$0;
                    RealBlockersHelper realBlockersHelper3 = (RealBlockersHelper) cardLockPresenter.ioDispatcher;
                    HelpItem helpItem3 = ((SetNameEvent.HelpItemClick) ((SetNameEvent) this.$event)).item;
                    BlockersScreens.SetNameScreen setNameScreen = (BlockersScreens.SetNameScreen) cardLockPresenter.args;
                    ToastKt$Toast$7$1 toastKt$Toast$7$1 = new ToastKt$Toast$7$1((MutableState) this.$helpActionIsLoading$delegate, continuation, i3);
                    this.label = 1;
                    if (realBlockersHelper3.performHelpAction(helpItem3, setNameScreen, null, toastKt$Toast$7$1, this) == coroutineSingletons29) {
                        break;
                    }
                } else if (i34 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.$event;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$18 = new RealBrazeManager$openSession$1$1(coroutineScope14, (EndAppLockPresenter) this.$helpActionIsLoading$delegate, 10);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow13.collect(realBrazeManager$openSession$1$18, this) == coroutineSingletons30) {
                        break;
                    }
                } else if (i35 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodePresenter$models$1$2(PasscodePresenter passcodePresenter, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 12;
        this.this$0 = passcodePresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasscodePresenter$models$1$2(PasscodeTypedTransformer passcodeTypedTransformer, Flow flow, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$event = passcodeTypedTransformer;
        this.$helpActionIsLoading$delegate = flow;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasscodePresenter$models$1$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$event = obj2;
        this.$helpActionIsLoading$delegate = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasscodePresenter$models$1$2(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$event = flow;
        this.$helpActionIsLoading$delegate = moleculePresenter;
    }
}
