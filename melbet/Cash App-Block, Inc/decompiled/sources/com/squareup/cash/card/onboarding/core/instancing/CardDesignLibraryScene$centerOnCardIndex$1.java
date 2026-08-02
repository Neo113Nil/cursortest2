package com.squareup.cash.card.onboarding.core.instancing;

import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardModelView$1$2$2;
import com.squareup.cash.card.onboarding.ZoomLevel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardDesignLibraryScene$centerOnCardIndex$1 extends SuspendLambda implements Function1 {
    public int $canonicalIndex;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardDesignLibraryScene this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDesignLibraryScene$centerOnCardIndex$1(CardDesignLibraryScene cardDesignLibraryScene, int i, Continuation continuation) {
        super(1, continuation);
        this.$r8$classId = 0;
        this.this$0 = cardDesignLibraryScene;
        this.$canonicalIndex = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        CardDesignLibraryScene cardDesignLibraryScene = this.this$0;
        switch (i) {
            case 0:
                return new CardDesignLibraryScene$centerOnCardIndex$1(cardDesignLibraryScene, this.$canonicalIndex, continuation);
            case 1:
                return new CardDesignLibraryScene$centerOnCardIndex$1(cardDesignLibraryScene, continuation, 1);
            default:
                return new CardDesignLibraryScene$centerOnCardIndex$1(cardDesignLibraryScene, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
            case 0:
                return ((CardDesignLibraryScene$centerOnCardIndex$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((CardDesignLibraryScene$centerOnCardIndex$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                ((CardDesignLibraryScene$centerOnCardIndex$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GridConfig gridConfig;
        int i = this.$r8$classId;
        CardDesignLibraryScene cardDesignLibraryScene = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GridInteractionController gridInteractionController = cardDesignLibraryScene.interactionController;
                int i2 = this.$canonicalIndex;
                ZoomAnimator zoomAnimator = gridInteractionController.zoomAnimator;
                if (gridInteractionController.isInitialized && !zoomAnimator.isAnimating()) {
                    ZoomLevel zoomLevel = zoomAnimator.targetZoom;
                    ZoomLevel zoomLevel2 = ZoomLevel.MEDIUM;
                    if (zoomLevel == zoomLevel2 && (gridConfig = gridInteractionController.gridConfig) != null) {
                        GridRenderParams renderParams = GridLayout.getRenderParams(zoomLevel2, gridConfig);
                        Pair findNearestCellIndices = GridLayout.findNearestCellIndices(zoomAnimator.panX, zoomAnimator.panY, gridConfig, renderParams);
                        Pair nearestVirtualCellForCanonical = GridLayout.nearestVirtualCellForCanonical(i2, ((Number) findNearestCellIndices.first).intValue(), ((Number) findNearestCellIndices.second).intValue(), gridConfig);
                        Pair position = GridLayout.position(((Number) nearestVirtualCellForCanonical.first).intValue(), ((Number) nearestVirtualCellForCanonical.second).intValue(), gridConfig, renderParams);
                        float floatValue = ((Number) position.first).floatValue();
                        float floatValue2 = ((Number) position.second).floatValue();
                        gridInteractionController.isFlingSettling = false;
                        gridInteractionController.lastExploredCanonicalIndex = Integer.valueOf(i2);
                        ZoomAnimator.animatePanTo$default(gridInteractionController.zoomAnimator, floatValue, -floatValue2);
                        CardDesignLibraryScene$$ExternalSyntheticLambda0 cardDesignLibraryScene$$ExternalSyntheticLambda0 = gridInteractionController.onInteractionChanged;
                        if (cardDesignLibraryScene$$ExternalSyntheticLambda0 != null) {
                            cardDesignLibraryScene$$ExternalSyntheticLambda0.invoke();
                        }
                    }
                }
                cardDesignLibraryScene.wakeAnimationLoop();
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.$canonicalIndex;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    FlashControl$applyScreenFlash$3 flashControl$applyScreenFlash$3 = new FlashControl$applyScreenFlash$3(cardDesignLibraryScene, (Continuation) null);
                    this.$canonicalIndex = 1;
                    if (JobKt.withContext(defaultScheduler, flashControl$applyScreenFlash$3, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.$canonicalIndex;
                if (i4 != 0) {
                    if (i4 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl = cardDesignLibraryScene._animationTime;
                CardModelView$1$2$2 cardModelView$1$2$2 = new CardModelView$1$2$2(cardDesignLibraryScene, 4);
                this.$canonicalIndex = 1;
                stateFlowImpl.collect(cardModelView$1$2$2, this);
                return coroutineSingletons3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardDesignLibraryScene$centerOnCardIndex$1(CardDesignLibraryScene cardDesignLibraryScene, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = cardDesignLibraryScene;
    }
}
