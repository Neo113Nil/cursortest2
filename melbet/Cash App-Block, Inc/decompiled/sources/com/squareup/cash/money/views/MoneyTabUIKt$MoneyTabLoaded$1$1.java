package com.squareup.cash.money.views;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.webkit.WebView;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.video.VideoCapture;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListScrollPosition;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureResult;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerScrollScopeKt$LazyLayoutScrollScope$1;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda52;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeEvent;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.backend.gl.core.WindowSurface;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.shopping.viewmodels.ShoppingWebBridgeEvent;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.shopping.web.ShoppingWebChromeClient;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.ui.PaymentPasscodeActivity$loadView$3$1;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetReceiver;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes6.dex */
public final class MoneyTabUIKt$MoneyTabLoaded$1$1 extends SuspendLambda implements Function2 {
    public int $bottomPaddingPx;
    public /* synthetic */ Object $listState;
    public final /* synthetic */ Object $onEvent;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyTabUIKt$MoneyTabLoaded$1$1(GLSceneScope gLSceneScope, int i, int i2, WindowSurface windowSurface, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 9;
        this.$listState = gLSceneScope;
        this.label = i;
        this.$bottomPaddingPx = i2;
        this.$onEvent = windowSurface;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$onEvent;
        switch (i) {
            case 0:
                return new MoneyTabUIKt$MoneyTabLoaded$1$1((LazyListState) this.$listState, this.$bottomPaddingPx, (Function1) obj2, continuation, 0);
            case 1:
                return new MoneyTabUIKt$MoneyTabLoaded$1$1((List) this.$listState, continuation, (CapturePipelineImpl) obj2, this.$bottomPaddingPx);
            case 2:
                MoneyTabUIKt$MoneyTabLoaded$1$1 moneyTabUIKt$MoneyTabLoaded$1$1 = new MoneyTabUIKt$MoneyTabLoaded$1$1((LazyGridState) obj2, this.$bottomPaddingPx, continuation);
                moneyTabUIKt$MoneyTabLoaded$1$1.$listState = obj;
                return moneyTabUIKt$MoneyTabLoaded$1$1;
            case 3:
                return new MoneyTabUIKt$MoneyTabLoaded$1$1((CashQrWidgetReceiver) this.$listState, (Context) obj2, this.$bottomPaddingPx, continuation, 3);
            case 4:
                return new MoneyTabUIKt$MoneyTabLoaded$1$1((LazyListState) this.$listState, this.$bottomPaddingPx, (AnimationSpec) obj2, continuation, 4);
            case 5:
                return new MoneyTabUIKt$MoneyTabLoaded$1$1((VerifyAliasPresenter) this.$listState, (MutableState) obj2, continuation);
            case 6:
                MoneyTabUIKt$MoneyTabLoaded$1$1 moneyTabUIKt$MoneyTabLoaded$1$12 = new MoneyTabUIKt$MoneyTabLoaded$1$1(this.$bottomPaddingPx, (PagerState) obj2, continuation);
                moneyTabUIKt$MoneyTabLoaded$1$12.$listState = obj;
                return moneyTabUIKt$MoneyTabLoaded$1$12;
            case 7:
                return new MoneyTabUIKt$MoneyTabLoaded$1$1((PaperMoneyDepositBarcodeViewModel) this.$listState, (Function1) obj2, this.label, this.$bottomPaddingPx, continuation);
            case 8:
                return new MoneyTabUIKt$MoneyTabLoaded$1$1((ArcadeFormTextInputGroupView.InputFieldModel) this.$listState, (ArcadeFormTextInputGroupView) obj2, this.$bottomPaddingPx, continuation, 8);
            case 9:
                return new MoneyTabUIKt$MoneyTabLoaded$1$1((GLSceneScope) this.$listState, this.label, this.$bottomPaddingPx, (WindowSurface) obj2, continuation);
            case 10:
                return new MoneyTabUIKt$MoneyTabLoaded$1$1((ShoppingWebChromeClient) this.$listState, this.$bottomPaddingPx, (WebView) obj2, continuation, 10);
            case 11:
                return new MoneyTabUIKt$MoneyTabLoaded$1$1((RecurringReloadConfigurationViewModel.SelectDay) obj2, (LazyListState) this.$listState, this.$bottomPaddingPx, continuation);
            case 12:
                return new MoneyTabUIKt$MoneyTabLoaded$1$1((CardSchemeViewModel.Module.HeroPaymentDevices) this.$listState, this.$bottomPaddingPx, (DefaultPagerState) obj2, continuation, 12);
            default:
                return new MoneyTabUIKt$MoneyTabLoaded$1$1((GooglePayLauncherViewModel) this.$listState, this.$bottomPaddingPx, (Intent) obj2, continuation, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((MoneyTabUIKt$MoneyTabLoaded$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x02be, code lost:
    
        if (app.cash.molecule.PlatformKt.animateScrollBy(r0, r9.scrollOffset$delegate.getIntValue() + r2, (androidx.compose.animation.core.AnimationSpec) r7, r16) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02c7, code lost:
    
        if (r0.animateScrollToItem(r4, 0, r16) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r0.emit((com.stripe.android.googlepaylauncher.GooglePayLauncher$Result) r2, r16) == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x038a, code lost:
    
        if (((androidx.camera.camera2.impl.CapturePipelineImpl) r7).invokeScreenFlashPostCaptureTasks(r1, r16) == r0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0372, code lost:
    
        if (kotlinx.coroutines.AwaitKt.joinAll(r1, r16) == r0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r2 == r1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x021a -> B:87:0x021b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i;
        Object animateScrollToPage;
        Object resultFromConfirmation$payments_core_release;
        int i2 = this.$r8$classId;
        int i3 = 5;
        int i4 = 0;
        int i5 = 2;
        Object obj3 = this.$onEvent;
        Object obj4 = null;
        switch (i2) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new MoneyTabUIKt$MoneyTabLoaded$1$1$$ExternalSyntheticLambda0((LazyListState) this.$listState, this.$bottomPaddingPx, i4));
                    SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2 anonymousClass2 = new SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2(11, (Function1) obj3);
                    this.label = 1;
                    if (snapshotFlow.collect(anonymousClass2, this) == coroutineSingletons) {
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
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal");
                    }
                    List list = (List) this.$listState;
                    this.label = 1;
                    break;
                } else if (i7 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i7 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal done");
                }
                int i8 = this.$bottomPaddingPx;
                this.label = 2;
                break;
            case 2:
                LazyGridState lazyGridState = (LazyGridState) obj3;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PagerScrollScopeKt$LazyLayoutScrollScope$1 pagerScrollScopeKt$LazyLayoutScrollScope$1 = new PagerScrollScopeKt$LazyLayoutScrollScope$1((ScrollScope) this.$listState, lazyGridState, i5);
                    int i10 = this.$bottomPaddingPx;
                    WorkLauncherImpl workLauncherImpl = LazyGridState.Saver;
                    int i11 = ((LazyGridMeasureResult) lazyGridState.layoutInfoState.getValue()).slotsPerLine * 100;
                    Density density = ((LazyGridMeasureResult) lazyGridState.layoutInfoState.getValue()).density;
                    this.label = 1;
                    if (LazyLayoutKt.animateScrollToItem(pagerScrollScopeKt$LazyLayoutScrollScope$1, i10, 0, i11, density, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i9 != 1) {
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
                    int i13 = this.$bottomPaddingPx;
                    this.label = 1;
                    if (CashQrWidget.update$glance_appwidget_release$default(((CashQrWidgetReceiver) this.$listState).glanceAppWidget, (Context) obj3, i13, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                LazyListState lazyListState = (LazyListState) this.$listState;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LazyListScrollPosition lazyListScrollPosition = lazyListState.scrollPosition;
                    LazyListScrollPosition lazyListScrollPosition2 = lazyListState.scrollPosition;
                    int intValue = lazyListScrollPosition.index$delegate.getIntValue() + 1;
                    if (intValue < this.$bottomPaddingPx) {
                        LazyListMeasureResult layoutInfo = lazyListState.getLayoutInfo();
                        Iterator it = layoutInfo.visibleItemsInfo.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (((LazyListMeasuredItem) obj2).index == lazyListScrollPosition2.index$delegate.getIntValue()) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) obj2;
                        Iterator it2 = layoutInfo.visibleItemsInfo.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (((LazyListMeasuredItem) next).index == intValue) {
                                    obj4 = next;
                                }
                            }
                        }
                        LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) obj4;
                        if (lazyListMeasuredItem != null && lazyListMeasuredItem2 != null) {
                            int i15 = lazyListMeasuredItem2.offset - lazyListMeasuredItem.offset;
                            this.label = 1;
                            break;
                        } else {
                            this.label = 2;
                            break;
                        }
                    }
                } else if (i14 != 1 && i14 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                MutableState mutableState = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.$bottomPaddingPx;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((VerifyAliasPresenter.State) mutableState.getValue()).resendCodeButtonEnabled) {
                        i = ((VerifyAliasPresenter) this.$listState).resendCodeButtonDelaySeconds;
                        if (i > 0) {
                        }
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i17 = this.label;
                    SafeTrace.throwOnFailure(obj);
                    i = i17 - 1;
                    if (i > 0) {
                        mutableState.setValue(VerifyAliasPresenter.State.copy$default((VerifyAliasPresenter.State) mutableState.getValue(), null, false, false, null, false, i, 31));
                        Duration.Companion companion = Duration.Companion;
                        long duration = DurationKt.toDuration(1, DurationUnit.SECONDS);
                        this.label = i;
                        this.$bottomPaddingPx = 1;
                        if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons6) {
                            break;
                        } else {
                            i17 = i;
                            i = i17 - 1;
                            if (i > 0) {
                                mutableState.setValue(VerifyAliasPresenter.State.copy$default((VerifyAliasPresenter.State) mutableState.getValue(), null, false, false, null, true, 0, 47));
                                break;
                            }
                        }
                    }
                }
            case 6:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.$listState;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(new UiContainer$$ExternalSyntheticLambda52(this.$bottomPaddingPx, (PagerState) obj3));
                    FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 flowExtKt$collectAsStateWithLifecycle$1$1$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1$1$1(produceStateScope, 5);
                    this.$listState = null;
                    this.label = 1;
                    if (snapshotFlow2.collect(flowExtKt$collectAsStateWithLifecycle$1$1$1$1, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((PaperMoneyDepositBarcodeViewModel) this.$listState) instanceof PaperMoneyDepositBarcodeViewModel.Loading) {
                    ((Function1) obj3).invoke(new PaperMoneyDepositBarcodeEvent.BarcodeParams(this.label, this.$bottomPaddingPx));
                }
                break;
            case 8:
                int i19 = this.$bottomPaddingPx;
                ArcadeFormTextInputGroupView arcadeFormTextInputGroupView = (ArcadeFormTextInputGroupView) obj3;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    VideoCapture.AnonymousClass3 anonymousClass3 = new VideoCapture.AnonymousClass3((ArcadeFormTextInputGroupView.InputFieldModel) this.$listState);
                    Flow flow = (Flow) arcadeFormTextInputGroupView.textChangesForValidations.get(i19);
                    flow.getClass();
                    PaymentPasscodeActivity$loadView$3$1 paymentPasscodeActivity$loadView$3$1 = new PaymentPasscodeActivity$loadView$3$1((MutableStateFlow) arcadeFormTextInputGroupView.multilineValidationResults.get(i19), i3);
                    this.label = 1;
                    Object collect = flow.collect(new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(22, paymentPasscodeActivity$loadView$3$1, anonymousClass3), this);
                    if (collect != coroutineSingletons9) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons9) {
                        break;
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GLSceneScope gLSceneScope = (GLSceneScope) this.$listState;
                gLSceneScope._screenSize.setValue(new IntSize((this.$bottomPaddingPx & BodyPartID.bodyIdMax) | (this.label << 32)));
                gLSceneScope._windowSurface.setValue((WindowSurface) obj3);
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BufferedChannel bufferedChannel = ((ShoppingWebBridge) ((ShoppingWebChromeClient) this.$listState).shoppingWebBridge).webEvents;
                    ShoppingWebBridgeEvent.ProgressUpdated progressUpdated = new ShoppingWebBridgeEvent.ProgressUpdated(this.$bottomPaddingPx, ((WebView) obj3).getUrl());
                    this.label = 1;
                    if (bufferedChannel.send(progressUpdated, this) == coroutineSingletons11) {
                        break;
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((RecurringReloadConfigurationViewModel.SelectDay) obj3).selectedIndex != null) {
                        LazyListState lazyListState2 = (LazyListState) this.$listState;
                        int i23 = this.$bottomPaddingPx;
                        this.label = 1;
                        if (lazyListState2.scrollToItem(i23, 0, this) == coroutineSingletons12) {
                            break;
                        }
                    }
                } else if (i22 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                DefaultPagerState defaultPagerState = (DefaultPagerState) obj3;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int coerceIn = RangesKt___RangesKt.coerceIn(((CardSchemeViewModel.Module.HeroPaymentDevices) this.$listState).currentPage, 0, this.$bottomPaddingPx - 1);
                    if (((ParcelableSnapshotMutableIntState) defaultPagerState.scrollPosition.elementTypes).getIntValue() != coerceIn && !defaultPagerState.scrollableState.isScrollInProgress()) {
                        this.label = 1;
                        animateScrollToPage = defaultPagerState.animateScrollToPage(coerceIn, RecyclerView.DECELERATION_RATE, AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7), this);
                        if (animateScrollToPage == coroutineSingletons13) {
                            break;
                        }
                    }
                } else if (i24 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                GooglePayLauncherViewModel googlePayLauncherViewModel = (GooglePayLauncherViewModel) this.$listState;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    resultFromConfirmation$payments_core_release = googlePayLauncherViewModel.getResultFromConfirmation$payments_core_release(this.$bottomPaddingPx, (Intent) obj3, this);
                    break;
                } else if (i25 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    resultFromConfirmation$payments_core_release = obj;
                } else if (i25 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                SharedFlowImpl sharedFlowImpl = googlePayLauncherViewModel._googleResult;
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyTabUIKt$MoneyTabLoaded$1$1(LazyGridState lazyGridState, int i, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$onEvent = lazyGridState;
        this.$bottomPaddingPx = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyTabUIKt$MoneyTabLoaded$1$1(VerifyAliasPresenter verifyAliasPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 5;
        this.$listState = verifyAliasPresenter;
        this.$onEvent = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyTabUIKt$MoneyTabLoaded$1$1(PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel, Function1 function1, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 7;
        this.$listState = paperMoneyDepositBarcodeViewModel;
        this.$onEvent = function1;
        this.label = i;
        this.$bottomPaddingPx = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyTabUIKt$MoneyTabLoaded$1$1(int i, PagerState pagerState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 6;
        this.$bottomPaddingPx = i;
        this.$onEvent = pagerState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyTabUIKt$MoneyTabLoaded$1$1(RecurringReloadConfigurationViewModel.SelectDay selectDay, LazyListState lazyListState, int i, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 11;
        this.$onEvent = selectDay;
        this.$listState = lazyListState;
        this.$bottomPaddingPx = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneyTabUIKt$MoneyTabLoaded$1$1(Object obj, int i, Object obj2, Continuation continuation, int i2) {
        super(2, continuation);
        this.$r8$classId = i2;
        this.$listState = obj;
        this.$bottomPaddingPx = i;
        this.$onEvent = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneyTabUIKt$MoneyTabLoaded$1$1(Object obj, Object obj2, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.$r8$classId = i2;
        this.$listState = obj;
        this.$onEvent = obj2;
        this.$bottomPaddingPx = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyTabUIKt$MoneyTabLoaded$1$1(List list, Continuation continuation, CapturePipelineImpl capturePipelineImpl, int i) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$listState = list;
        this.$onEvent = capturePipelineImpl;
        this.$bottomPaddingPx = i;
    }
}
