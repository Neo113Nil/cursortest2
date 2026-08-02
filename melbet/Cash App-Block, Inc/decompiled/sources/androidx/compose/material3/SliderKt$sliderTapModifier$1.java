package androidx.compose.material3;

import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import app.cash.redwood.compose.HostFocusDirectorKt$depthFirst$1;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.card.onboarding.MoodHeatEffectKt$$ExternalSyntheticLambda2;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.card.onboarding.core.instancing.GridInteractionController;
import com.squareup.cash.card.onboarding.opengl.renderer.HeatRenderer;
import com.squareup.cash.moneybot.views.home.ParticleGridRenderer;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SliderKt$sliderTapModifier$1 implements PointerInputEventHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $state;

    /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function3 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object $state;
        public /* synthetic */ long J$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Continuation continuation, int i) {
            super(3, continuation);
            this.$r8$classId = i;
            this.$state = obj;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = this.$r8$classId;
            Object obj4 = this.$state;
            switch (i) {
                case 0:
                    long j = ((Offset) obj2).packedValue;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((SliderState) obj4, (Continuation) obj3, 0);
                    anonymousClass1.J$0 = j;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                default:
                    long j2 = ((Offset) obj2).packedValue;
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1((MutableFloatState) obj4, (Continuation) obj3, 1);
                    anonymousClass12.J$0 = j2;
                    return anonymousClass12.invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            Object obj2 = this.$state;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    long j = this.J$0;
                    SliderState sliderState = (SliderState) obj2;
                    sliderState.pressOffset$delegate.setFloatValue((sliderState.orientation == Orientation.Vertical ? Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) : sliderState.isRtl ? sliderState.totalWidth$delegate.getIntValue() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32))) - sliderState.rawOffset$delegate.getFloatValue());
                    break;
                default:
                    long j2 = this.J$0;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj2)).setFloatValue(Float.intBitsToFloat((int) (j2 >> 32)));
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SliderKt$sliderTapModifier$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$state = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryEffectKt$CardDesignLibraryEffect$13$2$1$$ExternalSyntheticLambda0] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final PointerInputScope pointerInputScope, Continuation continuation) {
        int i = this.$r8$classId;
        final int i2 = 1;
        final int i3 = 0;
        Continuation continuation2 = null;
        Object obj = this.$state;
        switch (i) {
            case 0:
                SliderState sliderState = (SliderState) obj;
                Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, new AnonymousClass1(sliderState, continuation2, i3), new SliderKt$$ExternalSyntheticLambda3(sliderState, 2), continuation, 3);
                if (detectTapGestures$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object coroutineScope = JobKt.coroutineScope(new VirtualCameraState$connect$2$1(pointerInputScope, (PagerState) obj, continuation2, 25), continuation);
                if (coroutineScope != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj;
                Object awaitSelectionGestures = SimpleLayoutKt.awaitSelectionGestures(pointerInputScope, textFieldSelectionManager.mouseSelectionObserver, textFieldSelectionManager.touchSelectionObserver, continuation);
                if (awaitSelectionGestures != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                HeatRenderer heatRenderer = (HeatRenderer) obj;
                Object detectDragGestures$default = DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, new MoodHeatEffectKt$$ExternalSyntheticLambda2(heatRenderer, 1), null, new BulletinTileKt$$ExternalSyntheticLambda6(heatRenderer, 13), continuation, 6);
                if (detectDragGestures$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                final CardDesignLibraryScene cardDesignLibraryScene = (CardDesignLibraryScene) obj;
                Object detectTapGestures$default2 = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, new Function1() { // from class: com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryEffectKt$CardDesignLibraryEffect$13$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ZoomLevel zoomLevel;
                        GridInteractionController.TappedCell findCellAtScreenPosition;
                        int i4 = i3;
                        PointerInputScope pointerInputScope2 = pointerInputScope;
                        CardDesignLibraryScene cardDesignLibraryScene2 = cardDesignLibraryScene;
                        Offset offset = (Offset) obj2;
                        switch (i4) {
                            case 0:
                                float intBitsToFloat = Float.intBitsToFloat((int) (offset.packedValue >> 32));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (offset.packedValue & BodyPartID.bodyIdMax));
                                float f = (int) (((SuspendingPointerInputModifierNodeImpl) pointerInputScope2).boundsSize >> 32);
                                float f2 = (int) (((SuspendingPointerInputModifierNodeImpl) pointerInputScope2).boundsSize & BodyPartID.bodyIdMax);
                                GridInteractionController gridInteractionController = cardDesignLibraryScene2.interactionController;
                                ZoomAnimator zoomAnimator = gridInteractionController.zoomAnimator;
                                if (gridInteractionController.isInitialized && !zoomAnimator.isAnimating()) {
                                    gridInteractionController.isFlingSettling = false;
                                    GridConfig gridConfig = gridInteractionController.gridConfig;
                                    if (gridConfig != null && (zoomLevel = zoomAnimator.targetZoom) != ZoomLevel.NEAR && (findCellAtScreenPosition = gridInteractionController.findCellAtScreenPosition(intBitsToFloat, intBitsToFloat2, f, f2, gridConfig, gridInteractionController.currentRenderParams$views(), zoomLevel)) != null) {
                                        int ordinal = zoomLevel.ordinal();
                                        if (ordinal == 0) {
                                            gridInteractionController.trackingStartCameraZ = GridLayout.getRenderParams(ZoomLevel.FAR, gridConfig).cameraZ;
                                            zoomAnimator.zoomTo(ZoomLevel.MEDIUM);
                                            gridInteractionController.trackingCell = new Pair(Integer.valueOf(findCellAtScreenPosition.virtualCol), Integer.valueOf(findCellAtScreenPosition.virtualRow));
                                            gridInteractionController.trackingStartPanX = zoomAnimator.panX;
                                            gridInteractionController.trackingStartPanY = zoomAnimator.panY;
                                            gridInteractionController.lastExploredCanonicalIndex = Integer.valueOf(findCellAtScreenPosition.canonicalIndex);
                                        } else if (ordinal == 1) {
                                            gridInteractionController.zoomToNear(findCellAtScreenPosition, zoomLevel);
                                        } else if (ordinal != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        }
                                        CardDesignLibraryScene$$ExternalSyntheticLambda0 cardDesignLibraryScene$$ExternalSyntheticLambda0 = gridInteractionController.onInteractionChanged;
                                        if (cardDesignLibraryScene$$ExternalSyntheticLambda0 != null) {
                                            cardDesignLibraryScene$$ExternalSyntheticLambda0.invoke();
                                        }
                                    }
                                }
                                break;
                            default:
                                cardDesignLibraryScene2.onTap(Float.intBitsToFloat((int) (offset.packedValue >> 32)), Float.intBitsToFloat((int) (offset.packedValue & BodyPartID.bodyIdMax)), (int) (((SuspendingPointerInputModifierNodeImpl) pointerInputScope2).boundsSize >> 32), (int) (BodyPartID.bodyIdMax & ((SuspendingPointerInputModifierNodeImpl) pointerInputScope2).boundsSize));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, null, new Function1() { // from class: com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryEffectKt$CardDesignLibraryEffect$13$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ZoomLevel zoomLevel;
                        GridInteractionController.TappedCell findCellAtScreenPosition;
                        int i4 = i2;
                        PointerInputScope pointerInputScope2 = pointerInputScope;
                        CardDesignLibraryScene cardDesignLibraryScene2 = cardDesignLibraryScene;
                        Offset offset = (Offset) obj2;
                        switch (i4) {
                            case 0:
                                float intBitsToFloat = Float.intBitsToFloat((int) (offset.packedValue >> 32));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (offset.packedValue & BodyPartID.bodyIdMax));
                                float f = (int) (((SuspendingPointerInputModifierNodeImpl) pointerInputScope2).boundsSize >> 32);
                                float f2 = (int) (((SuspendingPointerInputModifierNodeImpl) pointerInputScope2).boundsSize & BodyPartID.bodyIdMax);
                                GridInteractionController gridInteractionController = cardDesignLibraryScene2.interactionController;
                                ZoomAnimator zoomAnimator = gridInteractionController.zoomAnimator;
                                if (gridInteractionController.isInitialized && !zoomAnimator.isAnimating()) {
                                    gridInteractionController.isFlingSettling = false;
                                    GridConfig gridConfig = gridInteractionController.gridConfig;
                                    if (gridConfig != null && (zoomLevel = zoomAnimator.targetZoom) != ZoomLevel.NEAR && (findCellAtScreenPosition = gridInteractionController.findCellAtScreenPosition(intBitsToFloat, intBitsToFloat2, f, f2, gridConfig, gridInteractionController.currentRenderParams$views(), zoomLevel)) != null) {
                                        int ordinal = zoomLevel.ordinal();
                                        if (ordinal == 0) {
                                            gridInteractionController.trackingStartCameraZ = GridLayout.getRenderParams(ZoomLevel.FAR, gridConfig).cameraZ;
                                            zoomAnimator.zoomTo(ZoomLevel.MEDIUM);
                                            gridInteractionController.trackingCell = new Pair(Integer.valueOf(findCellAtScreenPosition.virtualCol), Integer.valueOf(findCellAtScreenPosition.virtualRow));
                                            gridInteractionController.trackingStartPanX = zoomAnimator.panX;
                                            gridInteractionController.trackingStartPanY = zoomAnimator.panY;
                                            gridInteractionController.lastExploredCanonicalIndex = Integer.valueOf(findCellAtScreenPosition.canonicalIndex);
                                        } else if (ordinal == 1) {
                                            gridInteractionController.zoomToNear(findCellAtScreenPosition, zoomLevel);
                                        } else if (ordinal != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        }
                                        CardDesignLibraryScene$$ExternalSyntheticLambda0 cardDesignLibraryScene$$ExternalSyntheticLambda0 = gridInteractionController.onInteractionChanged;
                                        if (cardDesignLibraryScene$$ExternalSyntheticLambda0 != null) {
                                            cardDesignLibraryScene$$ExternalSyntheticLambda0.invoke();
                                        }
                                    }
                                }
                                break;
                            default:
                                cardDesignLibraryScene2.onTap(Float.intBitsToFloat((int) (offset.packedValue >> 32)), Float.intBitsToFloat((int) (offset.packedValue & BodyPartID.bodyIdMax)), (int) (((SuspendingPointerInputModifierNodeImpl) pointerInputScope2).boundsSize >> 32), (int) (BodyPartID.bodyIdMax & ((SuspendingPointerInputModifierNodeImpl) pointerInputScope2).boundsSize));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, continuation, 6);
                if (detectTapGestures$default2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object detectTapGestures$default3 = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, (Function3) obj, null, continuation, 11);
                if (detectTapGestures$default3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object awaitPointerEventScope = ((SuspendingPointerInputModifierNodeImpl) pointerInputScope).awaitPointerEventScope(new HostFocusDirectorKt$depthFirst$1((ParticleGridRenderer) obj, continuation2, 4), continuation);
                if (awaitPointerEventScope != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
