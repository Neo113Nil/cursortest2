package com.squareup.cash.core.navigationcontainer;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda1;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardModelView$1$2$2;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class UiContainer$SwipeableScreenContent$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ PagerState $pagerState;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ NavigationModel.Ready.Swipe $swipe;
    public int label;
    public final /* synthetic */ UiContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiContainer$SwipeableScreenContent$2$1(PagerState pagerState, NavigationModel.Ready.Swipe swipe, UiContainer uiContainer, Continuation continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$swipe = swipe;
        this.this$0 = uiContainer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        UiContainer uiContainer = this.this$0;
        NavigationModel.Ready.Swipe swipe = this.$swipe;
        PagerState pagerState = this.$pagerState;
        switch (i) {
            case 0:
                return new UiContainer$SwipeableScreenContent$2$1(uiContainer, swipe, pagerState, continuation);
            default:
                return new UiContainer$SwipeableScreenContent$2$1(pagerState, swipe, uiContainer, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((UiContainer$SwipeableScreenContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object animateScrollToPage;
        int i = this.$r8$classId;
        UiContainer uiContainer = this.this$0;
        NavigationModel.Ready.Swipe swipe = this.$swipe;
        PagerState pagerState = this.$pagerState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i3 = UiContainer.$r8$clinit;
                    NavigationModel.Ready.Swipe.Page page = (NavigationModel.Ready.Swipe.Page) uiContainer.requestedSwipePage$delegate.getValue();
                    if (page != null) {
                        int indexOf = swipe.pages.indexOf(page);
                        if (((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue() != indexOf) {
                            this.label = 1;
                            animateScrollToPage = pagerState.animateScrollToPage(indexOf, RecyclerView.DECELERATION_RATE, AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7), this);
                            if (animateScrollToPage == coroutineSingletons) {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                int i4 = UiContainer.$r8$clinit;
                uiContainer.requestedSwipePage$delegate.setValue(null);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new RealTransferManager$addCash$$inlined$map$1(Updater.snapshotFlow(new PagerState$$ExternalSyntheticLambda1(pagerState, 6)), swipe, 16));
                    CardModelView$1$2$2 cardModelView$1$2$2 = new CardModelView$1$2$2(uiContainer, 22);
                    this.label = 1;
                    if (distinctUntilChanged.collect(cardModelView$1$2$2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i5 != 1) {
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
    public UiContainer$SwipeableScreenContent$2$1(UiContainer uiContainer, NavigationModel.Ready.Swipe swipe, PagerState pagerState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uiContainer;
        this.$swipe = swipe;
        this.$pagerState = pagerState;
    }
}
