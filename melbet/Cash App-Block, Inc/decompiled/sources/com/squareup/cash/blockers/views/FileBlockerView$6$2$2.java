package com.squareup.cash.blockers.views;

import android.net.Uri;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Updater;
import androidx.core.text.TextUtilsCompat;
import androidx.emoji2.text.MetadataRepo;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.zxing.Result;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneySubmitted;
import com.squareup.cash.arcade.components.SearchBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.analytics.BlockerFlowAnalyticsHelperKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.presenters.SetPinPresenter;
import com.squareup.cash.blockers.presenters.StatusResultPresenter;
import com.squareup.cash.blockers.presenters.VerifyContactsPresenter;
import com.squareup.cash.blockers.presenters.onboarding.WelcomePresenter;
import com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan;
import com.squareup.cash.blockers.scenarioplan.presenters.ScenarioPlanErrorPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.FileBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.blockers.viewmodels.StatusResultViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyInstrumentViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyMagicViewModel;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.blockers.web.presenters.WebViewBlockerPresenter;
import com.squareup.cash.blockers.web.views.WebViewBlockerView;
import com.squareup.cash.borrow.presenters.BorrowHomePresenter;
import com.squareup.cash.borrow.presenters.CreditFirstTimeBorrowBlockerPresenter;
import com.squareup.cash.borrow.presenters.CreditMultiStepLoadingBlockerPresenter;
import com.squareup.cash.borrow.presenters.RepayCustomAmountPickerPresenter$models$1$1$1;
import com.squareup.cash.borrow.screens.BorrowHome;
import com.squareup.cash.borrow.screens.RepayCustomAmountPicker;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewEvent;
import com.squareup.cash.braze.RealBrazeManager$openSession$1$1;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.account.AccountSignInMagicLinkComplete;
import com.squareup.cash.cdf.promotionpane.PromotionPaneSelectInviteFriends;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.maps.views.CashMapViewKt$CashMapView$3$1;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$models$4$1$1;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.plasma.ui.inputs.WebViewCallbackInputs;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest$ElementResult$Result$WebviewResult;
import com.squareup.protos.franklin.app.VerifyMagicLinkRequest;
import com.squareup.protos.franklin.app.VerifyMagicLinkResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.StatusResultButton;
import com.squareup.util.compose.StableHolder;
import com.squareup.util.coroutines.StateFlowKt$combineState$2;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class FileBlockerView$6$2$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $cameraPermission;
    public final /* synthetic */ int $r8$classId;
    public Object L$0;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileBlockerView$6$2$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
        this.$cameraPermission = obj3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$cameraPermission;
        switch (i) {
            case 0:
                FileBlockerView$6$2$2 fileBlockerView$6$2$2 = new FileBlockerView$6$2$2((FileBlockerView) this.this$0, (AndroidPermissionManager$create$1) obj2, continuation, 0);
                fileBlockerView$6$2$2.L$0 = obj;
                return fileBlockerView$6$2$2;
            case 1:
                FileBlockerView$6$2$2 fileBlockerView$6$2$22 = new FileBlockerView$6$2$2((SetPinPresenter) obj2, continuation, 1);
                fileBlockerView$6$2$22.L$0 = obj;
                return fileBlockerView$6$2$22;
            case 2:
                FileBlockerView$6$2$2 fileBlockerView$6$2$23 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (ErrorPresenter) obj2, 2);
                fileBlockerView$6$2$23.L$0 = obj;
                return fileBlockerView$6$2$23;
            case 3:
                return new FileBlockerView$6$2$2((StatusResultPresenter) this.L$0, (StatusResultViewEvent) this.this$0, (MutableState) obj2, continuation, 3);
            case 4:
                FileBlockerView$6$2$2 fileBlockerView$6$2$24 = new FileBlockerView$6$2$2((CallbackFlowBuilder) this.this$0, continuation, (DisclosurePresenter) obj2, 4);
                fileBlockerView$6$2$24.L$0 = obj;
                return fileBlockerView$6$2$24;
            case 5:
                FileBlockerView$6$2$2 fileBlockerView$6$2$25 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (EndAppLockPresenter) obj2, 5);
                fileBlockerView$6$2$25.L$0 = obj;
                return fileBlockerView$6$2$25;
            case 6:
                FileBlockerView$6$2$2 fileBlockerView$6$2$26 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (ErrorPresenter) obj2, 6);
                fileBlockerView$6$2$26.L$0 = obj;
                return fileBlockerView$6$2$26;
            case 7:
                FileBlockerView$6$2$2 fileBlockerView$6$2$27 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (EndAppLockPresenter) obj2, 7);
                fileBlockerView$6$2$27.L$0 = obj;
                return fileBlockerView$6$2$27;
            case 8:
                return new FileBlockerView$6$2$2((VerifyContactsPresenter) this.this$0, (MutableState) obj2, continuation, 8);
            case 9:
                return new FileBlockerView$6$2$2((VerifyContactsPresenter) this.L$0, (VerifyContactsViewEvent) this.this$0, (MutableState) obj2, continuation, 9);
            case 10:
                FileBlockerView$6$2$2 fileBlockerView$6$2$28 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (ErrorPresenter) obj2, 10);
                fileBlockerView$6$2$28.L$0 = obj;
                return fileBlockerView$6$2$28;
            case 11:
                FileBlockerView$6$2$2 fileBlockerView$6$2$29 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (ErrorPresenter) obj2, 11);
                fileBlockerView$6$2$29.L$0 = obj;
                return fileBlockerView$6$2$29;
            case 12:
                return new FileBlockerView$6$2$2((LocalHomePresenter) this.L$0, (VerifyInstrumentViewEvent) this.this$0, (MutableState) obj2, continuation, 12);
            case 13:
                FileBlockerView$6$2$2 fileBlockerView$6$2$210 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (ParcelableSnapshotMutableIntState) obj2, 13);
                fileBlockerView$6$2$210.L$0 = obj;
                return fileBlockerView$6$2$210;
            case 14:
                FileBlockerView$6$2$2 fileBlockerView$6$2$211 = new FileBlockerView$6$2$2((LocalHomePresenter) obj2, continuation, 14);
                fileBlockerView$6$2$211.L$0 = obj;
                return fileBlockerView$6$2$211;
            case 15:
                FileBlockerView$6$2$2 fileBlockerView$6$2$212 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (WelcomePresenter) obj2, 15);
                fileBlockerView$6$2$212.L$0 = obj;
                return fileBlockerView$6$2$212;
            case 16:
                FileBlockerView$6$2$2 fileBlockerView$6$2$213 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (ScenarioPlanErrorPresenter) obj2, 16);
                fileBlockerView$6$2$213.L$0 = obj;
                return fileBlockerView$6$2$213;
            case 17:
                return new FileBlockerView$6$2$2((LocalPosCheckInPresenter) this.this$0, (MutableState) obj2, continuation, 17);
            case 18:
                FileBlockerView$6$2$2 fileBlockerView$6$2$214 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (Function1) obj2, 18);
                fileBlockerView$6$2$214.L$0 = obj;
                return fileBlockerView$6$2$214;
            case 19:
                FileBlockerView$6$2$2 fileBlockerView$6$2$215 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (EndAppLockPresenter) obj2, 19);
                fileBlockerView$6$2$215.L$0 = obj;
                return fileBlockerView$6$2$215;
            case 20:
                return new FileBlockerView$6$2$2((StableHolder) this.L$0, (StableHolder) this.this$0, (LazyGridState) obj2, continuation, 20);
            case 21:
                return new FileBlockerView$6$2$2((TextFieldState) this.L$0, (PasscodeViewModel) this.this$0, (Function1) obj2, continuation, 21);
            case 22:
                return new FileBlockerView$6$2$2((WebViewBlockerPresenter) this.L$0, (Uri) this.this$0, (BlockersScreens.WebViewBlockerScreen) obj2, continuation, 22);
            case 23:
                return new FileBlockerView$6$2$2((Channel) this.L$0, (WebViewBlockerView) this.this$0, (Function1) obj2, continuation, 23);
            case 24:
                FileBlockerView$6$2$2 fileBlockerView$6$2$216 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (BorrowHomePresenter) obj2, 24);
                fileBlockerView$6$2$216.L$0 = obj;
                return fileBlockerView$6$2$216;
            case 25:
                FileBlockerView$6$2$2 fileBlockerView$6$2$217 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (LocalEditorialPresenter) obj2, 25);
                fileBlockerView$6$2$217.L$0 = obj;
                return fileBlockerView$6$2$217;
            case 26:
                return new FileBlockerView$6$2$2((CreditFirstTimeBorrowBlockerPresenter) this.L$0, (FirstTimeBorrowViewEvent) this.this$0, (MutableState) obj2, continuation, 26);
            case 27:
                FileBlockerView$6$2$2 fileBlockerView$6$2$218 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (CreditMultiStepLoadingBlockerPresenter) obj2, 27);
                fileBlockerView$6$2$218.L$0 = obj;
                return fileBlockerView$6$2$218;
            case 28:
                FileBlockerView$6$2$2 fileBlockerView$6$2$219 = new FileBlockerView$6$2$2((Flow) this.this$0, continuation, (MusicPresenter) obj2, 28);
                fileBlockerView$6$2$219.L$0 = obj;
                return fileBlockerView$6$2$219;
            default:
                return new FileBlockerView$6$2$2((EndAppLockPresenter) this.L$0, (AmountPickerViewEvent) this.this$0, (ParcelableSnapshotMutableIntState) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((FileBlockerView$6$2$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x0390, code lost:
    
        if (app.cash.local.presenters.pos.LocalPosCheckInPresenter.access$handleSuccess(r0, r7, r1, r29) == r6) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03a1, code lost:
    
        if (app.cash.local.presenters.pos.LocalPosCheckInPresenter.access$handleFailure(r0, (app.cash.api.ApiResult.Failure) r2, r7, r29) == r6) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0379, code lost:
    
        if (r2 == r6) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x036c, code lost:
    
        if (r7 == r6) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x052c, code lost:
    
        if (r1.emit(r0, r29) == r2) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x047c, code lost:
    
        if (r4 == r2) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x045f, code lost:
    
        if (r1.emit(com.squareup.cash.blockers.viewmodels.VerifyMagicViewModel.Loading.INSTANCE, r29) == r2) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0a9e, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(500, r29) == r2) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0abe, code lost:
    
        if (r1 == r2) goto L476;
     */
    /* JADX WARN: Removed duplicated region for block: B:431:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0ae3  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0aeb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Object shouldShowOverridePrompt;
        Ui.EventReceiver eventReceiver;
        String str;
        Object obj2;
        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2;
        Flow flow;
        Object collect;
        ChannelFlowTransformLatest completeClientScenario;
        BlockersScreens.StatusResultScreen statusResultScreen;
        boolean z;
        BlockerAction.Action action;
        BlockerAction.InternalNavigationAction.Destination destination;
        String str2;
        Object shouldShowOverridePrompt2;
        MutableState mutableState;
        VerifyMagicLinkRequest verifyMagicLinkRequest;
        Object verifyMagicLink;
        AccountSignInMagicLinkComplete.Result result;
        Object createBlockersData;
        BlockersData blockersData;
        Object produceResponseContext;
        int i = this.$r8$classId;
        int i2 = 6;
        int i3 = 5;
        int i4 = 0;
        int i5 = 19;
        Object obj3 = this.$cameraPermission;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        switch (i) {
            case 0:
                FileBlockerView fileBlockerView = (FileBlockerView) this.this$0;
                Pair pair = (Pair) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean booleanValue = ((Boolean) pair.first).booleanValue();
                    boolean booleanValue2 = ((Boolean) pair.second).booleanValue();
                    if (booleanValue) {
                        this.L$0 = null;
                        this.label = 1;
                        break;
                    } else if (!booleanValue2) {
                        this.L$0 = null;
                        this.label = 2;
                        shouldShowOverridePrompt = ((AndroidPermissionManager$create$1) obj3).shouldShowOverridePrompt(this);
                        break;
                    } else {
                        th = null;
                        eventReceiver = fileBlockerView.eventReceiver;
                        if (eventReceiver == null) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i6 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    Ui.EventReceiver eventReceiver2 = fileBlockerView.eventReceiver;
                    if (eventReceiver2 != null) {
                        eventReceiver2.sendEvent(FileBlockerViewEvent.CameraAccessGranted.INSTANCE);
                        return Unit.INSTANCE;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
                if (i6 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                shouldShowOverridePrompt = obj;
                if (!((Boolean) shouldShowOverridePrompt).booleanValue()) {
                    Ui.EventReceiver eventReceiver3 = fileBlockerView.eventReceiver;
                    if (eventReceiver3 != null) {
                        eventReceiver3.sendEvent(FileBlockerViewEvent.NavigationAction.CameraAccessDenied.INSTANCE);
                        return Unit.INSTANCE;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
                th = null;
                eventReceiver = fileBlockerView.eventReceiver;
                if (eventReceiver == null) {
                    eventReceiver.sendEvent(FileBlockerViewEvent.NavigationAction.CameraAccessDeniedForever.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw th;
            case 1:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SetPinPresenter setPinPresenter = (SetPinPresenter) obj3;
                    str = setPinPresenter.titleTextOverride;
                    if (str == null) {
                        this.L$0 = null;
                        this.this$0 = produceStateScope;
                        this.label = 1;
                        String str3 = setPinPresenter.defaultTitleText;
                        boolean areEqual = Intrinsics.areEqual(str3, setPinPresenter.stringManager.get(R.string.set_pin_title));
                        obj2 = str3;
                        if (!areEqual) {
                            obj2 = setPinPresenter.pinScreensTitleGenerator.generateTitle(str3, this);
                        }
                        if (obj2 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    }
                    produceStateScope.setValue(str);
                    return Unit.INSTANCE;
                }
                if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                produceStateScope = (ProduceStateScope) this.this$0;
                SafeTrace.throwOnFailure(obj);
                obj2 = obj;
                str = (String) obj2;
                produceStateScope.setValue(str);
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.this$0;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$1 = new RealBrazeManager$openSession$1$1(coroutineScope, (ErrorPresenter) obj3, 11);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(realBrazeManager$openSession$1$1, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StatusResultPresenter statusResultPresenter = (StatusResultPresenter) this.L$0;
                    Analytics analytics = statusResultPresenter.analytics;
                    StatusResultButton statusResultButton = ((StatusResultViewEvent.ButtonClick) ((StatusResultViewEvent) this.this$0)).button;
                    QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$1 = new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(i3, (MutableState) obj3);
                    this.label = 1;
                    BlockersDataNavigator blockersDataNavigator = statusResultPresenter.blockersNavigator;
                    com.squareup.cash.cdf.BlockerAction blockerAction = com.squareup.cash.cdf.BlockerAction.SUBMIT_ACTION;
                    BlockersScreens.StatusResultScreen statusResultScreen2 = statusResultPresenter.args;
                    String str4 = statusResultScreen2.getBlockersData().flowToken;
                    ClientScenario clientScenario = statusResultScreen2.getBlockersData().clientScenario;
                    Flow$Type flow$Type = statusResultScreen2.getBlockersData().flowType;
                    String str5 = statusResultScreen2.getBlockersData().requestContext.blocker_descriptor_id;
                    String nextBlockerType = statusResultScreen2.getBlockersData().getNextBlockerType();
                    StatusResultButton.ButtonAction buttonAction = statusResultButton.action;
                    String name = buttonAction != null ? buttonAction.name() : null;
                    String valueOf = String.valueOf(buttonAction != null ? new Integer(buttonAction.value) : null);
                    BlockersData.AnalyticsData analyticsData = statusResultScreen2.getBlockersData().analyticsData;
                    String str6 = analyticsData != null ? analyticsData.referrerFlowToken : null;
                    BlockersData.AnalyticsData analyticsData2 = statusResultScreen2.getBlockersData().analyticsData;
                    BlockerFlowAnalyticsHelperKt.trackTapBlockerAction(analytics, blockerAction, str4, clientScenario, flow$Type, str5, nextBlockerType, valueOf, name, str6, analyticsData2 != null ? analyticsData2.referrerFlowType : null);
                    buttonAction.getClass();
                    int ordinal = buttonAction.ordinal();
                    if (ordinal != 0) {
                        switch (ordinal) {
                            case 2:
                                IntentLauncher intentLauncher = statusResultPresenter.launcher;
                                String str7 = statusResultButton.url;
                                str7.getClass();
                                intentLauncher.launchUrlInInternalBrowser(str7);
                                appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(blockersDataNavigator.getNext(statusResultScreen2, statusResultScreen2.getBlockersData()), 19);
                                break;
                            case 3:
                                analytics.track(new PromotionPaneSelectInviteFriends(), null);
                                FlowStarter flowStarter = statusResultPresenter.flowStarter;
                                Screen screen = statusResultScreen2.getBlockersData().exitScreen;
                                ClientScenario clientScenario2 = statusResultScreen2.getBlockersData().clientScenario;
                                int i10 = clientScenario2 == null ? -1 : StatusResultPresenter.WhenMappings.$EnumSwitchMapping$1[clientScenario2.ordinal()];
                                appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(((RealFlowStarter) flowStarter).startInviteFlow(screen, i10 != 1 ? i10 != 2 ? (i10 == 3 || i10 == 4) ? BlockersScreens.StartFlowEntryPointScreen.Origin.ONBOARDING : i10 != 5 ? null : BlockersScreens.StartFlowEntryPointScreen.Origin.PAYMENT : BlockersScreens.StartFlowEntryPointScreen.Origin.ACTIVITY : BlockersScreens.StartFlowEntryPointScreen.Origin.PROFILE), 19);
                                break;
                            case 4:
                                flow = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(statusResultPresenter.balanceSnapshotManager.select(), ((RealAppConfigManager) statusResultPresenter.appConfigManager).blockersConfig(), new StateFlowKt$combineState$2(3, statusResultPresenter, StatusResultPresenter.class, "addCashOrExitScreen", "addCashOrExitScreen(Lcom/squareup/cash/instruments/common/BalanceSnapshot;Lcom/squareup/cash/db2/BlockersConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1), 0);
                                collect = FlowKt.flowOn(flow, statusResultPresenter.ioDispatcher).collect(new RealBrazeManager$openSession$1$1(statusResultPresenter, 13), this);
                                if (collect != coroutineSingletons4) {
                                    collect = Unit.INSTANCE;
                                }
                                if (collect == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                                break;
                            case 5:
                                RealClientScenarioCompleter realClientScenarioCompleter = statusResultPresenter.clientScenarioCompleter;
                                ClientScenario clientScenario3 = statusResultButton.client_scenario;
                                clientScenario3.getClass();
                                completeClientScenario = realClientScenarioCompleter.completeClientScenario(clientScenario3, (r24 & 2) != 0 ? null : null, statusResultScreen2.getBlockersData().exitScreen, (r24 & 8) != 0 ? null : null, statusResultScreen2.getFlow(), true, (r24 & 64) != 0 ? null : null, (r24 & 128) != 0 ? EmptyList.INSTANCE : null, null, null, false);
                                flow = FlowKt.transformLatest(completeClientScenario, new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) null, quickPayViewKt$QuickPay$1$1$1$2$1$3$1, statusResultPresenter, 3));
                                collect = FlowKt.flowOn(flow, statusResultPresenter.ioDispatcher).collect(new RealBrazeManager$openSession$1$1(statusResultPresenter, 13), this);
                                if (collect != coroutineSingletons4) {
                                }
                                if (collect == coroutineSingletons4) {
                                }
                                break;
                            case 6:
                                ClientScenario clientScenario4 = statusResultScreen2.getBlockersData().clientScenario;
                                Timber.Forest.e(new IllegalStateException("Deprecated API StatusResult.StatusResultButton.ButtonAction.START_SUPPORT_FLOW is used: " + MapsKt__MapsKt.mapOf(new Pair("client_scenario", clientScenario4 != null ? clientScenario4.name() : null), new Pair("blocker_id", statusResultScreen2.getBlockersData().blockerId), new Pair("node_token", statusResultButton.support_flow_node))));
                                appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(RealSupportNavigator.startSupportFlow$default(statusResultPresenter.supportNavigator, statusResultButton.support_flow_node, null, statusResultScreen2.getBlockersData().exitScreen, SupportNavigator$Source.BLOCKER_FLOW, null, null, 102), 19);
                                break;
                            case 7:
                                BlockerAction blockerAction2 = statusResultButton.blocker_action;
                                if (blockerAction2 != null && (action = blockerAction2.action) != null) {
                                    BlockerAction.Action.InternalNavigationAction internalNavigationAction = action instanceof BlockerAction.Action.InternalNavigationAction ? (BlockerAction.Action.InternalNavigationAction) action : null;
                                    BlockerAction.InternalNavigationAction value = internalNavigationAction != null ? internalNavigationAction.getValue() : null;
                                    if (value != null && (destination = value.destination) != null) {
                                        BlockerAction.InternalNavigationAction.Destination.ClientRoute clientRoute = destination instanceof BlockerAction.InternalNavigationAction.Destination.ClientRoute ? (BlockerAction.InternalNavigationAction.Destination.ClientRoute) destination : null;
                                        BlockerAction.InternalNavigationAction.ClientRoute value2 = clientRoute != null ? clientRoute.getValue() : null;
                                        if (value2 != null && (str2 = value2.url) != null) {
                                            statusResultScreen = statusResultScreen2;
                                            z = statusResultPresenter.router.route(new RoutingParams(statusResultScreen2, null, statusResultScreen2.getBlockersData().exitScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str2);
                                            if (z) {
                                                appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(blockersDataNavigator.getNext(statusResultScreen, statusResultScreen.getBlockersData()), 19);
                                                break;
                                            } else {
                                                flow = EmptyFlow.INSTANCE;
                                                collect = FlowKt.flowOn(flow, statusResultPresenter.ioDispatcher).collect(new RealBrazeManager$openSession$1$1(statusResultPresenter, 13), this);
                                                if (collect != coroutineSingletons4) {
                                                }
                                                if (collect == coroutineSingletons4) {
                                                }
                                            }
                                        }
                                    }
                                }
                                statusResultScreen = statusResultScreen2;
                                z = false;
                                if (z) {
                                }
                                break;
                            default:
                                OptionalProvider$$ExternalSyntheticLambda0.m((Object) buttonAction, "Unexpected button action: ");
                                return null;
                        }
                    } else {
                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(blockersDataNavigator.getNext(statusResultScreen2, statusResultScreen2.getBlockersData()), 19);
                    }
                    flow = appLockMonitor$special$$inlined$map$2;
                    collect = FlowKt.flowOn(flow, statusResultPresenter.ioDispatcher).collect(new RealBrazeManager$openSession$1$1(statusResultPresenter, 13), this);
                    if (collect != coroutineSingletons4) {
                    }
                    if (collect == coroutineSingletons4) {
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CallbackFlowBuilder callbackFlowBuilder = (CallbackFlowBuilder) this.this$0;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$12 = new RealBrazeManager$openSession$1$1(coroutineScope2, (DisclosurePresenter) obj3, 14);
                    this.L$0 = null;
                    this.label = 1;
                    if (callbackFlowBuilder.collect(realBrazeManager$openSession$1$12, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.this$0;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$13 = new RealBrazeManager$openSession$1$1(coroutineScope3, (EndAppLockPresenter) obj3, 15);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(realBrazeManager$openSession$1$13, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.this$0;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$14 = new RealBrazeManager$openSession$1$1(coroutineScope4, (ErrorPresenter) obj3, 16);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(realBrazeManager$openSession$1$14, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.this$0;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$15 = new RealBrazeManager$openSession$1$1(coroutineScope5, (EndAppLockPresenter) obj3, 17);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(realBrazeManager$openSession$1$15, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState2 = (MutableState) obj3;
                    AndroidPermissionManager$create$1 androidPermissionManager$create$1 = ((VerifyContactsPresenter) this.this$0).readContactsPermissions;
                    this.L$0 = mutableState2;
                    this.label = 1;
                    shouldShowOverridePrompt2 = androidPermissionManager$create$1.shouldShowOverridePrompt(this);
                    if (shouldShowOverridePrompt2 == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                    mutableState = mutableState2;
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    shouldShowOverridePrompt2 = obj;
                }
                Boolean bool = (Boolean) shouldShowOverridePrompt2;
                bool.getClass();
                mutableState.setValue(bool);
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    VerifyContactsPresenter verifyContactsPresenter = (VerifyContactsPresenter) this.L$0;
                    RealBlockersHelper realBlockersHelper = verifyContactsPresenter.blockersHelper;
                    HelpItem helpItem = ((VerifyContactsViewEvent.HelpItemClick) ((VerifyContactsViewEvent) this.this$0)).item;
                    BlockersScreens.ContactVerificationScreen contactVerificationScreen = verifyContactsPresenter.args;
                    CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$1 = new CashMapViewKt$CashMapView$3$1((MutableState) obj3, z2 ? 1 : 0, i3);
                    this.label = 1;
                    if (realBlockersHelper.performHelpAction(helpItem, contactVerificationScreen, null, cashMapViewKt$CashMapView$3$1, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.this$0;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$16 = new RealBrazeManager$openSession$1$1(coroutineScope6, (ErrorPresenter) obj3, 18);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(realBrazeManager$openSession$1$16, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.this$0;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$17 = new RealBrazeManager$openSession$1$1(coroutineScope7, (ErrorPresenter) obj3, i5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(realBrazeManager$openSession$1$17, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.L$0;
                    RealBlockersHelper realBlockersHelper2 = (RealBlockersHelper) localHomePresenter.neighborhoodsTabContentEnabled$delegate;
                    HelpItem helpItem2 = ((VerifyInstrumentViewEvent.SelectHelpItem) ((VerifyInstrumentViewEvent) this.this$0)).helpItem;
                    BlockersScreens.VerifyCardScreen verifyCardScreen = (BlockersScreens.VerifyCardScreen) localHomePresenter.tabContentPresenterFactory;
                    CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$12 = new CashMapViewKt$CashMapView$3$1((MutableState) obj3, z3 ? 1 : 0, i2);
                    this.label = 1;
                    if (realBlockersHelper2.performHelpAction(helpItem2, verifyCardScreen, null, cashMapViewKt$CashMapView$3$12, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.this$0;
                    MerchantProfilePresenter$models$4$1$1 merchantProfilePresenter$models$4$1$1 = new MerchantProfilePresenter$models$4$1$1(coroutineScope8, (ParcelableSnapshotMutableIntState) obj3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow8.collect(merchantProfilePresenter$models$4$1$1, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                LocalHomePresenter localHomePresenter2 = (LocalHomePresenter) obj3;
                BlockersScreens.VerifyMagic verifyMagic = (BlockersScreens.VerifyMagic) localHomePresenter2.embeddedMapEnabled$delegate;
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    verifyMagicLinkRequest = new VerifyMagicLinkRequest(null, null, verifyMagic.verificationToken, ByteString.EMPTY);
                    this.L$0 = flowCollector;
                    this.this$0 = verifyMagicLinkRequest;
                    this.label = 1;
                    break;
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            if (i21 == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        verifyMagicLink = obj;
                        ApiResult apiResult = (ApiResult) verifyMagicLink;
                        if (apiResult instanceof ApiResult.Success) {
                            VerifyMagicLinkResponse verifyMagicLinkResponse = (VerifyMagicLinkResponse) ((ApiResult.Success) apiResult).response;
                            BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localHomePresenter2.navigator;
                            VerifyMagicLinkResponse.Status status = verifyMagicLinkResponse.status;
                            if (status == null) {
                                status = VerifyMagicLinkResponse.Status.INVALID;
                            }
                            Analytics analytics2 = (Analytics) localHomePresenter2.syncer;
                            BlockersData blockersData2 = verifyMagic.blockersData;
                            String str8 = blockersData2.flowToken;
                            switch (status) {
                                case INVALID:
                                    result = AccountSignInMagicLinkComplete.Result.INVALID;
                                    break;
                                case SUCCESS:
                                    result = AccountSignInMagicLinkComplete.Result.SUCCESS;
                                    break;
                                case INVALID_APP_TOKEN:
                                    result = AccountSignInMagicLinkComplete.Result.INVALID_APP_TOKEN;
                                    break;
                                case INVALID_VERIFICATION_TOKEN:
                                    result = AccountSignInMagicLinkComplete.Result.INVALID_VERIFICATION_TOKEN;
                                    break;
                                case EXPIRED_VERIFICATION_TOKEN:
                                    result = AccountSignInMagicLinkComplete.Result.EXPIRED_VERIFICATION_TOKEN;
                                    break;
                                case TOO_MANY_FAILED_ATTEMPTS:
                                    result = AccountSignInMagicLinkComplete.Result.TOO_MANY_FAILED_ATTEMPTS;
                                    break;
                                case NOT_ELIGIBLE:
                                    result = AccountSignInMagicLinkComplete.Result.NOT_ELIGIBLE;
                                    break;
                                default:
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                            }
                            analytics2.track(new AccountSignInMagicLinkComplete(str8, result), null);
                            switch (status) {
                                case INVALID:
                                    OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unexpected status: ");
                                    return null;
                                case SUCCESS:
                                    ResponseContext responseContext = verifyMagicLinkResponse.response_context;
                                    responseContext.getClass();
                                    screenNavigator.goTo(((BlockersDataNavigator) localHomePresenter2.featureFlagManager).getNext(verifyMagic, blockersData2.updateFromResponseContext(responseContext, false)));
                                    break;
                                case INVALID_APP_TOKEN:
                                case INVALID_VERIFICATION_TOKEN:
                                case EXPIRED_VERIFICATION_TOKEN:
                                case TOO_MANY_FAILED_ATTEMPTS:
                                case NOT_ELIGIBLE:
                                    if (blockersData2.flow == BlockersData.Flow.ONBOARDING) {
                                        screenNavigator.goTo(((RealFlowStarter) ((FlowStarter) localHomePresenter2.clearMarketingBadgesIfNeeded)).signOut());
                                        break;
                                    } else {
                                        ((BlockerFlowListener) localHomePresenter2.tabContentPresenterFactory).onFlowCancelled(blockersData2);
                                        screenNavigator.goTo(blockersData2.exitScreen);
                                        break;
                                    }
                                default:
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                            }
                        } else if (apiResult instanceof ApiResult.Failure) {
                            VerifyMagicViewModel.Error error = new VerifyMagicViewModel.Error(TextUtilsCompat.errorMessaging((AndroidStringManager) localHomePresenter2.localHomeGeoPresenterFactory, (ApiResult.Failure) apiResult, null).message);
                            this.L$0 = null;
                            this.this$0 = null;
                            this.label = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    verifyMagicLinkRequest = (VerifyMagicLinkRequest) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                }
                AppService appService = (AppService) localHomePresenter2.store;
                ClientScenario clientScenario5 = verifyMagic.blockersData.clientScenario;
                clientScenario5.getClass();
                String str9 = verifyMagic.blockersData.flowToken;
                this.L$0 = flowCollector;
                this.this$0 = null;
                this.label = 2;
                verifyMagicLink = appService.verifyMagicLink(clientScenario5, str9, verifyMagicLinkRequest, this);
                break;
            case 15:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.this$0;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$18 = new RealBrazeManager$openSession$1$1(coroutineScope9, (WelcomePresenter) obj3, 20);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow9.collect(realBrazeManager$openSession$1$18, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.this$0;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$19 = new RealBrazeManager$openSession$1$1(coroutineScope10, (ScenarioPlanErrorPresenter) obj3, 21);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow10.collect(realBrazeManager$openSession$1$19, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) this.this$0;
                ScenarioPlan scenarioPlan = (ScenarioPlan) localPosCheckInPresenter.cameraPermissions;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 != 0) {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            if (i24 != 3 && i24 != 4) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            ((MutableState) obj3).setValue(Boolean.FALSE);
                            return Unit.INSTANCE;
                        }
                        BlockersData blockersData3 = (BlockersData) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        blockersData = blockersData3;
                        produceResponseContext = obj;
                        ApiResult apiResult2 = (ApiResult) produceResponseContext;
                        if (!(apiResult2 instanceof ApiResult.Success)) {
                            if (!(apiResult2 instanceof ApiResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            this.L$0 = null;
                            this.label = 4;
                            break;
                        } else {
                            ResponseContext responseContext2 = (ResponseContext) ((ApiResult.Success) apiResult2).response;
                            this.L$0 = null;
                            this.label = 3;
                            break;
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        createBlockersData = obj;
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    createBlockersData = scenarioPlan.createBlockersData();
                    break;
                }
                blockersData = (BlockersData) createBlockersData;
                this.L$0 = blockersData;
                this.label = 2;
                produceResponseContext = scenarioPlan.produceResponseContext(blockersData, this);
                break;
            case 18:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.this$0;
                    SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2 anonymousClass2 = new SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2(i3, coroutineScope11, (Function1) obj3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow11.collect(anonymousClass2, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.this$0;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$110 = new RealBrazeManager$openSession$1$1(coroutineScope12, (EndAppLockPresenter) obj3, 22);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow12.collect(realBrazeManager$openSession$1$110, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                Object obj4 = ((StableHolder) this.this$0).model;
                StableHolder stableHolder = (StableHolder) this.L$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if ((stableHolder != null ? (LocalDate) stableHolder.model : null) != null) {
                        Object obj5 = stableHolder.model;
                        Object obj6 = stableHolder.model;
                        if (!Intrinsics.areEqual(CalendarDatePickerKt.getYearMonth((LocalDate) obj5), CalendarDatePickerKt.getYearMonth((LocalDate) obj4))) {
                            int m = Boxes$$ExternalSyntheticOutline1.m((int) ChronoUnit.MONTHS.between((Temporal) obj4, (Temporal) obj6), 2, (int) ChronoUnit.DAYS.between(((LocalDate) obj4).withDayOfMonth(1), ((LocalDate) obj6).withDayOfMonth(2)), 1);
                            this.label = 1;
                            if (LazyGridState.scrollToItem$default((LazyGridState) obj3, m, this) == coroutineSingletons21) {
                                return coroutineSingletons21;
                            }
                        }
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(8, (TextFieldState) this.L$0));
                    PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$2 = new PasscodeViewKt$Passcode$3$1$1$1$2(i4, (PasscodeViewModel) this.this$0, (Function1) obj3);
                    this.label = 1;
                    if (snapshotFlow.collect(passcodeViewKt$Passcode$3$1$1$1$2, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                BlockersData blockersData4 = ((BlockersScreens.WebViewBlockerScreen) obj3).blockersData;
                WebViewBlockerPresenter webViewBlockerPresenter = (WebViewBlockerPresenter) this.L$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 != 0) {
                    if (i29 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Result result2 = webViewBlockerPresenter.webViewBlockerRepo;
                Uri uri = (Uri) this.this$0;
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                queryParameterNames.getClass();
                Set<String> set = queryParameterNames;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
                for (String str10 : set) {
                    arrayList.add(new WebViewCallbackInputs.QueryParam(str10, uri.getQueryParameter(str10), ByteString.EMPTY));
                }
                WebViewCallbackInputs webViewCallbackInputs = new WebViewCallbackInputs(arrayList, ByteString.EMPTY);
                ClientScenario clientScenario6 = blockersData4.clientScenario;
                clientScenario6.getClass();
                String str11 = blockersData4.flowToken;
                RequestContext requestContext = blockersData4.requestContext;
                this.label = 1;
                Object submitForm = ((AppService) result2.text).submitForm(clientScenario6, str11, new SubmitFormRequest(requestContext, (String) null, CollectionsKt__CollectionsJVMKt.listOf(new SubmitFormRequest.ElementResult((String) (z4 ? 1 : 0), (zzdi) new SubmitFormRequest$ElementResult$Result$WebviewResult(webViewCallbackInputs), i3)), 10), this);
                return submitForm == coroutineSingletons23 ? coroutineSingletons23 : submitForm;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelAsFlow consumeAsFlow = FlowKt.consumeAsFlow((Channel) this.L$0);
                    SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2 anonymousClass22 = new SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2(i2, (WebViewBlockerView) this.this$0, (Function1) obj3);
                    this.label = 1;
                    if (consumeAsFlow.collect(anonymousClass22, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.this$0;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$111 = new RealBrazeManager$openSession$1$1(coroutineScope13, (BorrowHomePresenter) obj3, 23);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow13.collect(realBrazeManager$openSession$1$111, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.this$0;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$112 = new RealBrazeManager$openSession$1$1(coroutineScope14, (LocalEditorialPresenter) obj3, 24);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow14.collect(realBrazeManager$openSession$1$112, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (CreditFirstTimeBorrowBlockerPresenter.access$handleSecondaryButtonClick((CreditFirstTimeBorrowBlockerPresenter) this.L$0, (FirstTimeBorrowViewEvent.SecondaryButtonClick) ((FirstTimeBorrowViewEvent) this.this$0), (MutableState) obj3, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow15 = (Flow) this.this$0;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$113 = new RealBrazeManager$openSession$1$1(coroutineScope15, (CreditMultiStepLoadingBlockerPresenter) obj3, 25);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow15.collect(realBrazeManager$openSession$1$113, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow16 = (Flow) this.this$0;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$114 = new RealBrazeManager$openSession$1$1(coroutineScope16, (MusicPresenter) obj3, 26);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow16.collect(realBrazeManager$openSession$1$114, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) this.L$0;
                Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MetadataRepo metadataRepo = (MetadataRepo) endAppLockPresenter.navigatorSwitcher;
                    BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) endAppLockPresenter.accountOutboundNavigator;
                    Money money = ((AmountPickerViewEvent$Full$MoneySubmitted) ((AmountPickerViewEvent) this.this$0)).amount;
                    BorrowHome borrowHome = new BorrowHome();
                    String str12 = ((RepayCustomAmountPicker) endAppLockPresenter.appLockState).repaymentData.reference_token;
                    str12.getClass();
                    RepayCustomAmountPickerPresenter$models$1$1$1 repayCustomAmountPickerPresenter$models$1$1$1 = new RepayCustomAmountPickerPresenter$models$1$1$1(0, (ParcelableSnapshotMutableIntState) obj3);
                    this.label = 1;
                    Object coroutineScope17 = JobKt.coroutineScope(new EngineInterceptor$intercept$2(repayCustomAmountPickerPresenter$models$1$1$1, metadataRepo, str12, money, screenNavigator2, borrowHome, (Continuation) null), this);
                    Object obj8 = coroutineScope17;
                    if (coroutineScope17 != obj7) {
                        obj8 = Unit.INSTANCE;
                    }
                    if (obj8 == obj7) {
                        return obj7;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileBlockerView$6$2$2(MoleculePresenter moleculePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$cameraPermission = moleculePresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileBlockerView$6$2$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$cameraPermission = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileBlockerView$6$2$2(Flow flow, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = flow;
        this.$cameraPermission = obj;
    }
}
