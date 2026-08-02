package com.squareup.cash.data.profile;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.views.internal.LocalMapKt$LocalMap$2$1;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$PercentSubmitted;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardModelView$1$2$2;
import com.squareup.cash.checks.CaptureCheckFacePresenter;
import com.squareup.cash.checks.CaptureCheckFacePresenter$models$2$1$1;
import com.squareup.cash.checks.CaptureCheckFaceViewModel;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.checks.screens.CaptureCheckFaceScreen;
import com.squareup.cash.checks.screens.CheckCaptureAnswer;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.FeatureContext;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.routers.bitcoin.BitkeyAutoWithdrawRouter;
import com.squareup.cash.clientrouting.routers.moneybot.MoneybotRouter;
import com.squareup.cash.clientsync.pipeline.SessionAwareClientSyncRequestExecutor;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState$expand$2$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.text.LinkTapDetectorState;
import com.squareup.cash.composeUi.foundation.text.PressGestureScopeImpl;
import com.squareup.cash.core.navigationcontainer.UiContainer;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionPercentagePresenter;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionPercentageSubmitter;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.data.profile.documents.RealAfterpayStatementManager;
import com.squareup.cash.deposits.physical.backend.real.barcode.RealCashDepositBarcodeManager;
import com.squareup.cash.deposits.physical.presenter.atm.AtmWithdrawalExplainerPresenter;
import com.squareup.cash.deposits.physical.presenter.atm.AtmWithdrawalMapPresenter;
import com.squareup.cash.deposits.physical.presenter.map.LimitReachedDialogPresenter;
import com.squareup.cash.deposits.physical.presenter.map.PaperMoneyDepositMapPresenter;
import com.squareup.cash.deposits.physical.presenter.onboarding.SwipeToLoadOnboardingPresenter;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.moneybot.screens.HomeItemType;
import com.squareup.cash.moneybot.screens.HomeSourceContext;
import com.squareup.cash.moneybot.screens.MoneybotChatEntryPoint;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotPendingSheet$TransferOptionPicker;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.protos.cash.cryptoinvestflow.api.blockers.v1.BitcoinP2pConversionPercentageInputs;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.EndFlowRequest;
import com.squareup.protos.franklin.app.SetProfilePhotoRequest;
import com.squareup.protos.franklin.app.SetProfilePhotoResponse;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealProfileManager$setPhoto$2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object $photoData;
    public final /* synthetic */ int $r8$classId;
    public Object L$1;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealProfileManager$setPhoto$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.$photoData = obj2;
        this.this$0 = obj3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new RealProfileManager$setPhoto$2((ByteString) this.$photoData, (RealProfileManager) obj2, continuation, 0);
            case 1:
                return new RealProfileManager$setPhoto$2((MutableState) this.L$1, (CaptureCheckFacePresenter) this.$photoData, (MutableState) obj2, continuation, 1);
            case 2:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$2 = new RealProfileManager$setPhoto$2((Flow) this.$photoData, continuation, (VerifyCheckDialogPresenter) obj2, 2);
                realProfileManager$setPhoto$2.L$1 = obj;
                return realProfileManager$setPhoto$2;
            case 3:
                return new RealProfileManager$setPhoto$2((BitkeyAutoWithdrawRouter) this.L$1, (String) this.$photoData, (String) obj2, continuation, 3);
            case 4:
                return new RealProfileManager$setPhoto$2((MoneybotRouter) this.L$1, (RoutingParams) this.$photoData, (Function0) obj2, continuation, 4);
            case 5:
                return new RealProfileManager$setPhoto$2((SessionAwareClientSyncRequestExecutor.DeferredSyncRequest) this.$photoData, (Deferred) obj2, continuation, 5);
            case 6:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$22 = new RealProfileManager$setPhoto$2((AnimationState) this.$photoData, (CollapsingToolbarState) obj2, continuation, 6);
                realProfileManager$setPhoto$22.L$1 = obj;
                return realProfileManager$setPhoto$22;
            case 7:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$23 = new RealProfileManager$setPhoto$2((Flow) this.$photoData, continuation, (VerifyCheckDialogPresenter) obj2, 7);
                realProfileManager$setPhoto$23.L$1 = obj;
                return realProfileManager$setPhoto$23;
            case 8:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$24 = new RealProfileManager$setPhoto$2((Flow) this.$photoData, continuation, (EndAppLockPresenter) obj2, 8);
                realProfileManager$setPhoto$24.L$1 = obj;
                return realProfileManager$setPhoto$24;
            case 9:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$25 = new RealProfileManager$setPhoto$2((Flow) this.$photoData, continuation, (EndAppLockPresenter) obj2, 9);
                realProfileManager$setPhoto$25.L$1 = obj;
                return realProfileManager$setPhoto$25;
            case 10:
                return new RealProfileManager$setPhoto$2((RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1) this.L$1, (PressGestureScopeImpl) this.$photoData, (PointerInputChange) obj2, continuation, 10);
            case 11:
                return new RealProfileManager$setPhoto$2((PagerState) this.L$1, (SeekableTransitionState) this.$photoData, (NavigationModel.Ready.Swipe) obj2, continuation, 11);
            case 12:
                return new RealProfileManager$setPhoto$2((NavigationModel.Ready.Swipe) this.L$1, (PagerState) this.$photoData, (ParcelableSnapshotMutableIntState) obj2, continuation, 12);
            case 13:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$26 = new RealProfileManager$setPhoto$2((RealAppConfigManager$cashLiteConfig$$inlined$map$1) this.$photoData, continuation, (RealBitcoinRoundUpsRepo) obj2, 13);
                realProfileManager$setPhoto$26.L$1 = obj;
                return realProfileManager$setPhoto$26;
            case 14:
                return new RealProfileManager$setPhoto$2((LocalPosCheckInPresenter) this.L$1, (AmountPickerViewEvent) this.$photoData, (MutableState) obj2, continuation, 14);
            case 15:
                return new RealProfileManager$setPhoto$2((BitcoinP2pConversionPercentagePresenter) this.L$1, (ParcelableSnapshotMutableLongState) this.$photoData, (MutableState) obj2, continuation, 15);
            case 16:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$27 = new RealProfileManager$setPhoto$2((Flow) this.$photoData, continuation, (EndAppLockPresenter) obj2, 16);
                realProfileManager$setPhoto$27.L$1 = obj;
                return realProfileManager$setPhoto$27;
            case 17:
                return new RealProfileManager$setPhoto$2((RealBlockersHelper) this.L$1, (BlockersScreens) this.$photoData, (String) obj2, continuation, 17);
            case 18:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$28 = new RealProfileManager$setPhoto$2((RealAfterpayStatementManager) obj2, continuation);
                realProfileManager$setPhoto$28.$photoData = obj;
                return realProfileManager$setPhoto$28;
            case 19:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$29 = new RealProfileManager$setPhoto$2((FinishSetupTileBadgeCounter) this.$photoData, continuation, (RealCashDepositBarcodeManager) obj2, 19);
                realProfileManager$setPhoto$29.L$1 = obj;
                return realProfileManager$setPhoto$29;
            case 20:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$210 = new RealProfileManager$setPhoto$2((Flow) this.$photoData, continuation, (MusicPresenter) obj2, 20);
                realProfileManager$setPhoto$210.L$1 = obj;
                return realProfileManager$setPhoto$210;
            case 21:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$211 = new RealProfileManager$setPhoto$2((Flow) this.$photoData, continuation, (PoolsListPresenter) obj2, 21);
                realProfileManager$setPhoto$211.L$1 = obj;
                return realProfileManager$setPhoto$211;
            case 22:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$212 = new RealProfileManager$setPhoto$2((Flow) this.$photoData, continuation, (AtmWithdrawalExplainerPresenter) obj2, 22);
                realProfileManager$setPhoto$212.L$1 = obj;
                return realProfileManager$setPhoto$212;
            case 23:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$213 = new RealProfileManager$setPhoto$2((Flow) this.$photoData, continuation, (AtmWithdrawalMapPresenter) obj2, 23);
                realProfileManager$setPhoto$213.L$1 = obj;
                return realProfileManager$setPhoto$213;
            case 24:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$214 = new RealProfileManager$setPhoto$2((Flow) this.$photoData, continuation, (LocalHomePresenter) obj2, 24);
                realProfileManager$setPhoto$214.L$1 = obj;
                return realProfileManager$setPhoto$214;
            case 25:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$215 = new RealProfileManager$setPhoto$2((Flow) this.$photoData, continuation, (VerifyCheckDialogPresenter) obj2, 25);
                realProfileManager$setPhoto$215.L$1 = obj;
                return realProfileManager$setPhoto$215;
            case 26:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$216 = new RealProfileManager$setPhoto$2((Flow) this.$photoData, continuation, (EndAppLockPresenter) obj2, 26);
                realProfileManager$setPhoto$216.L$1 = obj;
                return realProfileManager$setPhoto$216;
            case 27:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$217 = new RealProfileManager$setPhoto$2((Flow) this.$photoData, continuation, (LimitReachedDialogPresenter) obj2, 27);
                realProfileManager$setPhoto$217.L$1 = obj;
                return realProfileManager$setPhoto$217;
            case 28:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$218 = new RealProfileManager$setPhoto$2((MutableState) this.$photoData, (PaperMoneyDepositMapPresenter) obj2, continuation, 28);
                realProfileManager$setPhoto$218.L$1 = obj;
                return realProfileManager$setPhoto$218;
            default:
                RealProfileManager$setPhoto$2 realProfileManager$setPhoto$219 = new RealProfileManager$setPhoto$2((Flow) this.$photoData, continuation, (SwipeToLoadOnboardingPresenter) obj2, 29);
                realProfileManager$setPhoto$219.L$1 = obj;
                return realProfileManager$setPhoto$219;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((RealProfileManager$setPhoto$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x029b, code lost:
    
        if (r0.emit(r2, r20) == r1) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0283, code lost:
    
        if (r2 == r1) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x07bc, code lost:
    
        if (r1 == r0) goto L364;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x066a  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v67 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object profilePhoto;
        Object first;
        MoneybotChatEntryPoint moneybotChatEntryPoint;
        MoneybotChatEntryPoint moneybotChatEntryPoint2;
        FeatureContext.MoneybotHomeContext moneybotHomeContext;
        HomeSourceContext homeSourceContext;
        Object failure;
        Object await;
        CompletableDeferredImpl completableDeferredImpl;
        Object animateScrollToPage;
        Object afterpayStatements;
        int i = this.$r8$classId;
        int i2 = 21;
        int i3 = 26;
        int i4 = 27;
        int i5 = 19;
        int i6 = 3;
        int i7 = 2;
        Object obj2 = this.this$0;
        int i8 = 1;
        HomeItemType homeItemType = 0;
        switch (i) {
            case 0:
                RealProfileManager realProfileManager = (RealProfileManager) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SetProfilePhotoRequest setProfilePhotoRequest = new SetProfilePhotoRequest(null, (ByteString) this.$photoData, "image/jpeg", null, ByteString.EMPTY);
                    AppService appService = realProfileManager.appService;
                    ClientScenario clientScenario = ClientScenario.PROFILE;
                    this.label = 1;
                    profilePhoto = appService.setProfilePhoto(clientScenario, null, setProfilePhotoRequest, this);
                    break;
                } else if (i9 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    profilePhoto = obj;
                } else if (i9 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ApiResult.Success success = (ApiResult.Success) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                ApiResult apiResult = (ApiResult) profilePhoto;
                if (apiResult instanceof ApiResult.Success) {
                    ApiResult.Success success2 = (ApiResult.Success) apiResult;
                    SetProfilePhotoResponse setProfilePhotoResponse = (SetProfilePhotoResponse) success2.response;
                    if (setProfilePhotoResponse.status == SetProfilePhotoResponse.Status.SUCCESS) {
                        RealProfileSyncer realProfileSyncer = realProfileManager.profileSyncer;
                        String str = setProfilePhotoResponse.image_url;
                        this.L$1 = success2;
                        this.label = 2;
                        realProfileSyncer.blockingUpdateProfilePhoto(str);
                        if (Unit.INSTANCE != coroutineSingletons) {
                        }
                        break;
                    }
                }
                break;
            case 1:
                MutableState mutableState = (MutableState) this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((CaptureCheckFaceViewModel.Loaded.FinalFrame) mutableState.getValue()) != null) {
                        this.label = 1;
                        if (JobKt.delay(1250L, this) == coroutineSingletons2) {
                            break;
                        }
                    }
                    break;
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                CaptureCheckFaceViewModel.Loaded.FinalFrame finalFrame = (CaptureCheckFaceViewModel.Loaded.FinalFrame) mutableState.getValue();
                finalFrame.getClass();
                CaptureCheckFacePresenter captureCheckFacePresenter = (CaptureCheckFacePresenter) this.$photoData;
                CaptureCheckFaceScreen captureCheckFaceScreen = captureCheckFacePresenter.args;
                MutableState mutableState2 = (MutableState) obj2;
                boolean isEmpty = ((List) mutableState2.getValue()).isEmpty();
                BetterNavigator.ScreenNavigator screenNavigator = captureCheckFacePresenter.navigator;
                if (isEmpty) {
                    screenNavigator.giveAnswer(captureCheckFaceScreen.question, new CheckCaptureAnswer.Success(captureCheckFaceScreen.checkFace, finalFrame.frame));
                } else {
                    screenNavigator.giveAnswer(captureCheckFaceScreen.question, new CheckCaptureAnswer.Failure(captureCheckFaceScreen.checkFace, (List) mutableState2.getValue()));
                }
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$photoData;
                    CardModelView$1$2$2 cardModelView$1$2$2 = new CardModelView$1$2$2(coroutineScope, (VerifyCheckDialogPresenter) obj2, 17);
                    this.L$1 = null;
                    this.label = 1;
                    if (flow.collect(cardModelView$1$2$2, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object access$submitToPlasmaBlocker = BitkeyAutoWithdrawRouter.access$submitToPlasmaBlocker((BitkeyAutoWithdrawRouter) this.L$1, (String) this.$photoData, (String) obj2, this);
                    if (access$submitToPlasmaBlocker != coroutineSingletons4) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                break;
            case 4:
                RoutingParams routingParams = (RoutingParams) this.$photoData;
                MoneybotRouter moneybotRouter = (MoneybotRouter) this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow moneybotEnabled = moneybotRouter.moneybotFlagsHelper.moneybotEnabled();
                    this.label = 1;
                    first = FlowKt.first(moneybotEnabled, this);
                    if (first == coroutineSingletons5) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    first = obj;
                }
                if (((Boolean) first).booleanValue()) {
                    if (routingParams.analyticsParams instanceof AnalyticsParams.InAppNotificationParams) {
                        moneybotChatEntryPoint2 = MoneybotChatEntryPoint.IN_APP_MESSAGE;
                    } else if (Intrinsics.areEqual(routingParams.source, BlockersData.AnalyticsData.Source.PUSH_NOTIFICATION.getAnalyticsName())) {
                        moneybotChatEntryPoint2 = MoneybotChatEntryPoint.PUSH_NOTIFICATION;
                    } else if (routingParams.deepLinkMetadata != null) {
                        moneybotChatEntryPoint2 = MoneybotChatEntryPoint.DEEP_LINK;
                    } else {
                        moneybotChatEntryPoint = null;
                        FeatureContext featureContext = routingParams.featureContext;
                        moneybotHomeContext = !(featureContext instanceof FeatureContext.MoneybotHomeContext) ? (FeatureContext.MoneybotHomeContext) featureContext : null;
                        if (moneybotHomeContext == null) {
                            String str2 = moneybotHomeContext.homeSessionId;
                            String str3 = moneybotHomeContext.homeItemType;
                            if (str3 != null) {
                                try {
                                    Result.Companion companion = Result.Companion;
                                    failure = HomeItemType.valueOf(str3);
                                } catch (Throwable th) {
                                    Result.Companion companion2 = Result.Companion;
                                    failure = new Result.Failure(th);
                                }
                                homeItemType = (HomeItemType) (failure instanceof Result.Failure ? null : failure);
                            }
                            homeSourceContext = new HomeSourceContext(str2, homeItemType, moneybotHomeContext.homeItemId);
                        } else {
                            homeSourceContext = null;
                        }
                        moneybotRouter.navigator.goTo(new MoneybotChatScreen((ChatKickoffParams) ((Function0) obj2).invoke(), moneybotChatEntryPoint, homeSourceContext, (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 56));
                    }
                    moneybotChatEntryPoint = moneybotChatEntryPoint2;
                    FeatureContext featureContext2 = routingParams.featureContext;
                    if (!(featureContext2 instanceof FeatureContext.MoneybotHomeContext)) {
                    }
                    if (moneybotHomeContext == null) {
                    }
                    moneybotRouter.navigator.goTo(new MoneybotChatScreen((ChatKickoffParams) ((Function0) obj2).invoke(), moneybotChatEntryPoint, homeSourceContext, (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 56));
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CompletableDeferredImpl completableDeferredImpl2 = ((SessionAwareClientSyncRequestExecutor.DeferredSyncRequest) this.$photoData).syncRequestOperationResult;
                    this.L$1 = completableDeferredImpl2;
                    this.label = 1;
                    await = ((Deferred) obj2).await(this);
                    if (await == coroutineSingletons6) {
                        break;
                    } else {
                        completableDeferredImpl = completableDeferredImpl2;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    completableDeferredImpl = (CompletableDeferredImpl) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    await = obj;
                }
                completableDeferredImpl.complete(await);
                break;
            case 6:
                AnimationState animationState = (AnimationState) this.$photoData;
                ScrollScope scrollScope = (ScrollScope) this.L$1;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    ref$FloatRef.element = ((Number) animationState.value$delegate.getValue()).floatValue();
                    Float f = new Float(((CollapsingToolbarState) obj2).minHeightState$delegate.getIntValue());
                    TweenSpec tween$default = AnimatableKt.tween$default(200, 0, null, 6);
                    CollapsingToolbarState$expand$2$$ExternalSyntheticLambda0 collapsingToolbarState$expand$2$$ExternalSyntheticLambda0 = new CollapsingToolbarState$expand$2$$ExternalSyntheticLambda0(1, scrollScope, ref$FloatRef);
                    this.L$1 = null;
                    this.label = 1;
                    if (AnimatableKt.animateTo$default(animationState, f, tween$default, false, collapsingToolbarState$expand$2$$ExternalSyntheticLambda0, this, 4) == coroutineSingletons7) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$photoData;
                    CardModelView$1$2$2 cardModelView$1$2$22 = new CardModelView$1$2$2(coroutineScope2, (VerifyCheckDialogPresenter) obj2, i5);
                    this.L$1 = null;
                    this.label = 1;
                    if (flow2.collect(cardModelView$1$2$22, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$photoData;
                    CardModelView$1$2$2 cardModelView$1$2$23 = new CardModelView$1$2$2(coroutineScope3, (EndAppLockPresenter) obj2, 20);
                    this.L$1 = null;
                    this.label = 1;
                    if (flow3.collect(cardModelView$1$2$23, this) == coroutineSingletons9) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$photoData;
                    CardModelView$1$2$2 cardModelView$1$2$24 = new CardModelView$1$2$2(coroutineScope4, (EndAppLockPresenter) obj2, i2);
                    this.L$1 = null;
                    this.label = 1;
                    if (flow4.collect(cardModelView$1$2$24, this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$1 = (RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1) this.L$1;
                    PressGestureScopeImpl pressGestureScopeImpl = (PressGestureScopeImpl) this.$photoData;
                    this.label = 1;
                    RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1 realShareTargetsManager$shareTo$$inlined$flatMapLatest$12 = new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Ref$ObjectRef) realShareTargetsManager$shareTo$$inlined$flatMapLatest$1.$target$inlined, (LinkTapDetectorState) realShareTargetsManager$shareTo$$inlined$flatMapLatest$1.this$0, this, 8);
                    realShareTargetsManager$shareTo$$inlined$flatMapLatest$12.L$1 = pressGestureScopeImpl;
                    if (realShareTargetsManager$shareTo$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE) == coroutineSingletons11) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                PagerState pagerState = (PagerState) this.L$1;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                    ref$IntRef.element = pagerState.getSettledPage();
                    FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(Updater.snapshotFlow(new PagerState$$ExternalSyntheticLambda1(pagerState, 5)), new LocalMapKt$LocalMap$2$1(ref$IntRef, pagerState, (Continuation) homeItemType, i7), 3);
                    VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$1 = new VerifyCheckDepositPresenter$models$3$1(ref$IntRef, (PagerState) this.L$1, (SeekableTransitionState) this.$photoData, (NavigationModel.Ready.Swipe) obj2, (Continuation) null, 14);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowKt__MergeKt$flatMapConcat$$inlined$map$1, verifyCheckDepositPresenter$models$3$1, this) == coroutineSingletons12) {
                        break;
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                PagerState pagerState2 = (PagerState) this.$photoData;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
                NavigationModel.Ready.Swipe swipe = (NavigationModel.Ready.Swipe) this.L$1;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Versioned versioned = swipe.activePage;
                    int i22 = versioned.version;
                    int i23 = UiContainer.$r8$clinit;
                    if (i22 > parcelableSnapshotMutableIntState.getIntValue()) {
                        parcelableSnapshotMutableIntState.setIntValue(versioned.version);
                        int indexOf = swipe.pages.indexOf(versioned.value);
                        if (((ParcelableSnapshotMutableIntState) pagerState2.scrollPosition.elementTypes).getIntValue() != indexOf) {
                            this.label = 1;
                            animateScrollToPage = pagerState2.animateScrollToPage(indexOf, RecyclerView.DECELERATION_RATE, AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7), this);
                            if (animateScrollToPage == coroutineSingletons13) {
                                break;
                            }
                        }
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 13:
                FlowCollector flowCollector = (FlowCollector) this.L$1;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAppConfigManager$cashLiteConfig$$inlined$map$1 realAppConfigManager$cashLiteConfig$$inlined$map$1 = (RealAppConfigManager$cashLiteConfig$$inlined$map$1) this.$photoData;
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass1 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(i2, flowCollector, (RealBitcoinRoundUpsRepo) obj2);
                    this.L$1 = null;
                    this.label = 1;
                    if (realAppConfigManager$cashLiteConfig$$inlined$map$1.collect(anonymousClass1, this) == coroutineSingletons14) {
                        break;
                    }
                } else if (i24 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) this.L$1;
                    CryptoCommonScreens.BitcoinP2pConversionCustomPercentageScreen bitcoinP2pConversionCustomPercentageScreen = (CryptoCommonScreens.BitcoinP2pConversionCustomPercentageScreen) localPosCheckInPresenter.launcher;
                    long coerceIn = RangesKt___RangesKt.coerceIn(((AmountPickerViewEvent$Full$PercentSubmitted) ((AmountPickerViewEvent) this.$photoData)).amount.longValue() * 100, 100L, bitcoinP2pConversionCustomPercentageScreen.maxPercentageBps);
                    this.label = 1;
                    Object submit = ((BitcoinP2pConversionPercentageSubmitter) localPosCheckInPresenter.store).submit(bitcoinP2pConversionCustomPercentageScreen, bitcoinP2pConversionCustomPercentageScreen.blockersData, coerceIn, BitcoinP2pConversionPercentageInputs.SubmissionInteraction.SUBMISSION_INTERACTION_CONFIRM, (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator, this);
                    if (submit != coroutineSingletons15) {
                        submit = Unit.INSTANCE;
                    }
                    if (submit == coroutineSingletons15) {
                        break;
                    }
                } else if (i25 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ((MutableState) obj2).setValue(Boolean.FALSE);
                break;
            case 15:
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinP2pConversionPercentagePresenter bitcoinP2pConversionPercentagePresenter = (BitcoinP2pConversionPercentagePresenter) this.L$1;
                    ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = (ParcelableSnapshotMutableLongState) this.$photoData;
                    List list = BitcoinP2pConversionPercentagePresenter.DEFAULT_PICKER_OPTIONS;
                    long longValue = parcelableSnapshotMutableLongState.getLongValue();
                    BitcoinP2pConversionPercentageInputs.SubmissionInteraction submissionInteraction = BitcoinP2pConversionPercentageInputs.SubmissionInteraction.SUBMISSION_INTERACTION_CONFIRM;
                    this.label = 1;
                    BitcoinP2pConversionPercentageSubmitter bitcoinP2pConversionPercentageSubmitter = bitcoinP2pConversionPercentagePresenter.submitter;
                    CryptoCommonScreens.BitcoinP2pConversionPercentageScreen bitcoinP2pConversionPercentageScreen = bitcoinP2pConversionPercentagePresenter.args;
                    Object submit2 = bitcoinP2pConversionPercentageSubmitter.submit(bitcoinP2pConversionPercentageScreen, bitcoinP2pConversionPercentageScreen.blockersData, longValue, submissionInteraction, bitcoinP2pConversionPercentagePresenter.navigator, this);
                    Object obj4 = submit2;
                    if (submit2 != obj3) {
                        obj4 = Unit.INSTANCE;
                    }
                    if (obj4 == obj3) {
                        break;
                    }
                } else if (i26 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                List list2 = BitcoinP2pConversionPercentagePresenter.DEFAULT_PICKER_OPTIONS;
                ((MutableState) obj2).setValue(Boolean.FALSE);
                break;
            case 16:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$photoData;
                    CardModelView$1$2$2 cardModelView$1$2$25 = new CardModelView$1$2$2(coroutineScope5, (EndAppLockPresenter) obj2, 23);
                    this.L$1 = null;
                    this.label = 1;
                    if (flow5.collect(cardModelView$1$2$25, this) == coroutineSingletons16) {
                        break;
                    }
                } else if (i27 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 17:
                BlockersScreens blockersScreens = (BlockersScreens) this.$photoData;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService2 = ((RealBlockersHelper) this.L$1).appService;
                    ClientScenario clientScenario2 = blockersScreens.getBlockersData().clientScenario;
                    clientScenario2.getClass();
                    String str4 = blockersScreens.getBlockersData().flowToken;
                    EndFlowRequest endFlowRequest = new EndFlowRequest(blockersScreens.getBlockersData().requestContext, (String) obj2, 4);
                    this.label = 1;
                    if (appService2.endFlow(clientScenario2, str4, endFlowRequest, this) == coroutineSingletons17) {
                        break;
                    }
                } else if (i28 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 18:
                FlowCollector flowCollector2 = (FlowCollector) this.$photoData;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.$photoData = null;
                    this.L$1 = flowCollector2;
                    this.label = 1;
                    afterpayStatements = ((RealAfterpayStatementManager) obj2).getAfterpayStatements(this);
                    break;
                } else if (i29 == 1) {
                    flowCollector2 = (FlowCollector) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    afterpayStatements = obj;
                } else if (i29 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                Boolean valueOf = Boolean.valueOf(!((Collection) afterpayStatements).isEmpty());
                this.$photoData = null;
                this.L$1 = null;
                this.label = 2;
                break;
            case 19:
                FlowCollector flowCollector3 = (FlowCollector) this.L$1;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = (FinishSetupTileBadgeCounter) this.$photoData;
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass12 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(i3, flowCollector3, (RealCashDepositBarcodeManager) obj2);
                    this.L$1 = null;
                    this.label = 1;
                    if (finishSetupTileBadgeCounter.collect(anonymousClass12, this) == coroutineSingletons19) {
                        break;
                    }
                } else if (i30 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 20:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$photoData;
                    CardModelView$1$2$2 cardModelView$1$2$26 = new CardModelView$1$2$2(coroutineScope6, (MusicPresenter) obj2, 25);
                    this.L$1 = null;
                    this.label = 1;
                    if (flow6.collect(cardModelView$1$2$26, this) == coroutineSingletons20) {
                        break;
                    }
                } else if (i31 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 21:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$photoData;
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass13 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(i4, coroutineScope7, (PoolsListPresenter) obj2);
                    this.L$1 = null;
                    this.label = 1;
                    if (flow7.collect(anonymousClass13, this) == coroutineSingletons21) {
                        break;
                    }
                } else if (i32 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 22:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$photoData;
                    CardModelView$1$2$2 cardModelView$1$2$27 = new CardModelView$1$2$2(coroutineScope8, (AtmWithdrawalExplainerPresenter) obj2, i3);
                    this.L$1 = null;
                    this.label = 1;
                    if (flow8.collect(cardModelView$1$2$27, this) == coroutineSingletons22) {
                        break;
                    }
                } else if (i33 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 23:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$photoData;
                    CardModelView$1$2$2 cardModelView$1$2$28 = new CardModelView$1$2$2(coroutineScope9, (AtmWithdrawalMapPresenter) obj2, i4);
                    this.L$1 = null;
                    this.label = 1;
                    if (flow9.collect(cardModelView$1$2$28, this) == coroutineSingletons23) {
                        break;
                    }
                } else if (i34 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 24:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.$photoData;
                    CardModelView$1$2$2 cardModelView$1$2$29 = new CardModelView$1$2$2(coroutineScope10, (LocalHomePresenter) obj2, 28);
                    this.L$1 = null;
                    this.label = 1;
                    if (flow10.collect(cardModelView$1$2$29, this) == coroutineSingletons24) {
                        break;
                    }
                } else if (i35 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 25:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.$photoData;
                    CardModelView$1$2$2 cardModelView$1$2$210 = new CardModelView$1$2$2(coroutineScope11, (VerifyCheckDialogPresenter) obj2, 29);
                    this.L$1 = null;
                    this.label = 1;
                    if (flow11.collect(cardModelView$1$2$210, this) == coroutineSingletons25) {
                        break;
                    }
                } else if (i36 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 26:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.$photoData;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass4 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope12, (EndAppLockPresenter) obj2, i8);
                    this.L$1 = null;
                    this.label = 1;
                    if (flow12.collect(anonymousClass4, this) == coroutineSingletons26) {
                        break;
                    }
                } else if (i37 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 27:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.$photoData;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass42 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope13, (LimitReachedDialogPresenter) obj2, i7);
                    this.L$1 = null;
                    this.label = 1;
                    if (flow13.collect(anonymousClass42, this) == coroutineSingletons27) {
                        break;
                    }
                } else if (i38 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 28:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$12 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new DrawerViewKt$$ExternalSyntheticLambda2(13, (MutableState) this.$photoData)), 24), new DataStoreImpl$data$1.AnonymousClass2(i7, homeItemType, i5), 2);
                    GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1((PaperMoneyDepositMapPresenter) obj2, coroutineScope14, (Continuation) homeItemType, i6);
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(flowKt__MergeKt$flatMapConcat$$inlined$map$12, gLSceneScopeProvider$SceneScope$2$1$1, this) == coroutineSingletons28) {
                        break;
                    }
                } else if (i39 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.L$1;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.$photoData;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass43 = new FormCashtag.AnonymousClass8.AnonymousClass4(coroutineScope15, (SwipeToLoadOnboardingPresenter) obj2, i6);
                    this.L$1 = null;
                    this.label = 1;
                    if (flow14.collect(anonymousClass43, this) == coroutineSingletons29) {
                        break;
                    }
                } else if (i40 != 1) {
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
    public RealProfileManager$setPhoto$2(RealAfterpayStatementManager realAfterpayStatementManager, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 18;
        this.this$0 = realAfterpayStatementManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealProfileManager$setPhoto$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$photoData = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealProfileManager$setPhoto$2(Flow flow, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$photoData = flow;
        this.this$0 = obj;
    }
}
