package com.squareup.cash.card.onboarding.core.instancing;

import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.paging.Pager$pageFetcher$2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.instancing.GridInteractionController;
import com.squareup.cash.card.onboarding.graphics.TagPoseController;
import com.squareup.cash.graphics.backend.math.Quat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $currentNearBounds$delegate;
    public final /* synthetic */ MutableState $currentZoomLevel$delegate;
    public final /* synthetic */ CardDesignLibraryScene $scene;
    public float F$0;
    public int I$0;
    public int I$1;
    public int I$2;
    public long J$0;
    public long J$1;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1(CardDesignLibraryScene cardDesignLibraryScene, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$scene = cardDesignLibraryScene;
        this.$currentZoomLevel$delegate = mutableState;
        this.$currentNearBounds$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1 cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1 = new CardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1(this.$scene, this.$currentZoomLevel$delegate, this.$currentNearBounds$delegate, continuation);
        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.L$0 = obj;
        return cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x00ca, code lost:
    
        if (r11 == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x00cc, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0103, code lost:
    
        r12 = r3;
        r28 = r4;
        r29 = r5;
        r30 = r9;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x00a5, code lost:
    
        if (r7 <= r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0055, code lost:
    
        if (r6 == r4) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0454 A[LOOP:6: B:224:0x044e->B:226:0x0454, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x055c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x00ca -> B:6:0x00cd). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        char c;
        Object awaitFirstDown$default;
        int i;
        long j;
        int i2;
        long j2;
        int i3;
        float f;
        int i4;
        Object awaitPointerEvent;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine;
        CoroutineSingletons coroutineSingletons;
        int i5;
        long j3;
        CardDesignLibraryScene cardDesignLibraryScene;
        List list;
        Iterator it;
        GridConfig gridConfig;
        Pair pair;
        float f2;
        ZoomLevel zoomLevel;
        ZoomLevel zoomLevel2;
        CardDesignLibraryScene cardDesignLibraryScene2;
        long j4;
        Iterator it2;
        TagPoseController focusedTagController;
        TagPoseController focusedTagController2;
        CardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1 cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1 = this;
        CardDesignLibraryScene cardDesignLibraryScene3 = cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.$scene;
        GridInteractionController gridInteractionController = cardDesignLibraryScene3.interactionController;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.L$0;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.label;
        MutableState mutableState2 = cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.$currentZoomLevel$delegate;
        if (i6 == 0) {
            mutableState = mutableState2;
            c = ' ';
            SafeTrace.throwOnFailure(obj);
            cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.L$0 = pointerEventHandlerCoroutine2;
            cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.label = 1;
            awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(pointerEventHandlerCoroutine2, cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1, 2);
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.I$2;
                f = cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.F$0;
                j2 = cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.J$1;
                i3 = cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.I$1;
                c = ' ';
                i4 = cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.I$0;
                mutableState = mutableState2;
                j = cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.J$0;
                SafeTrace.throwOnFailure(obj);
                awaitPointerEvent = obj;
                PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent;
                List list2 = pointerEvent.changes;
                List list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        if (((PointerInputChange) it3.next()).isConsumed()) {
                            break;
                        }
                    }
                }
                if (list2.size() >= 2) {
                    float calculateZoom = Draggable2DKt.calculateZoom(pointerEvent) * f;
                    if (i3 != 0) {
                        cardDesignLibraryScene2 = cardDesignLibraryScene3;
                        coroutineSingletons = coroutineSingletons2;
                    } else {
                        if (i4 != 0 && ((ZoomLevel) mutableState.getValue()) == ZoomLevel.NEAR && cardDesignLibraryScene3.isFocusedOnWand() && (focusedTagController2 = cardDesignLibraryScene3.focusedTagController()) != null) {
                            focusedTagController2.onDragEnd(RecyclerView.DECELERATION_RATE);
                        }
                        ZoomAnimator zoomAnimator = gridInteractionController.zoomAnimator;
                        if (gridInteractionController.isInitialized) {
                            gridInteractionController.isPinching = true;
                            gridInteractionController.isDragging = false;
                            gridInteractionController.trackingCell = null;
                            gridInteractionController.blendingToFarRest = false;
                            gridInteractionController.pinchTargetLogZoom = RecyclerView.DECELERATION_RATE;
                            gridInteractionController.pinchCurrentLogZoom = RecyclerView.DECELERATION_RATE;
                            gridInteractionController.pinchLogZoomVelocity = RecyclerView.DECELERATION_RATE;
                            gridInteractionController.isFlingSettling = false;
                            gridInteractionController.velocitySamples.clear();
                            cardDesignLibraryScene2 = cardDesignLibraryScene3;
                            gridInteractionController.lastDragTimeNanos = 0L;
                            gridInteractionController.pinchStartPanX = zoomAnimator.panX;
                            gridInteractionController.pinchStartPanY = zoomAnimator.panY;
                            gridInteractionController.pinchBaseZoom = zoomAnimator.targetZoom;
                            gridInteractionController.pinchHasTargetCard = false;
                            GridConfig gridConfig2 = gridInteractionController.gridConfig;
                            if (gridConfig2 != null) {
                                coroutineSingletons = coroutineSingletons2;
                                Pair findNearestCanonicalOrigin = GridLayout.findNearestCanonicalOrigin(gridInteractionController.pinchStartPanX, gridInteractionController.pinchStartPanY, GridLayout.getRenderParams(ZoomLevel.FAR, gridConfig2), gridConfig2, GridLayout.getRenderParams(ZoomLevel.MEDIUM, gridConfig2));
                                float floatValue = ((Number) findNearestCanonicalOrigin.first).floatValue();
                                float floatValue2 = ((Number) findNearestCanonicalOrigin.second).floatValue();
                                gridInteractionController.pinchFarTargetPanX = floatValue;
                                float f3 = (gridConfig2.rows * gridConfig2.farStepY) / 2.0f;
                                gridInteractionController.pinchFarTargetPanY = RangesKt___RangesKt.coerceIn(gridInteractionController.farRestOffsetY(gridConfig2) + floatValue2, (floatValue2 - f3) + 0.001f, (f3 + floatValue2) - 0.001f);
                                zoomAnimator.farTileOriginY = floatValue2;
                            } else {
                                coroutineSingletons = coroutineSingletons2;
                            }
                            zoomAnimator.isPinchDriven = true;
                            zoomAnimator.panAnimProgress = 1.0f;
                            if (zoomAnimator.transitionProgress < 1.0f) {
                                zoomAnimator.currentZoom = zoomAnimator.targetZoom;
                                zoomAnimator.transitionProgress = 1.0f;
                            }
                            gridInteractionController.pinchStartCameraZ = gridInteractionController.currentRenderParams$views().cameraZ;
                        } else {
                            cardDesignLibraryScene2 = cardDesignLibraryScene3;
                            coroutineSingletons = coroutineSingletons2;
                        }
                        i3 = 1;
                    }
                    List list4 = list2;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(new Float(Float.intBitsToFloat((int) (((PointerInputChange) it4.next()).position >> c))));
                        i2 = i2;
                    }
                    i5 = i2;
                    float averageOfFloat = (float) CollectionsKt.averageOfFloat(arrayList);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        arrayList2.add(new Float(Float.intBitsToFloat((int) (((PointerInputChange) it5.next()).position & BodyPartID.bodyIdMax))));
                    }
                    long floatToRawIntBits = (Float.floatToRawIntBits((float) CollectionsKt.averageOfFloat(arrayList2)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(averageOfFloat) << c);
                    float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> c));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax));
                    long j5 = SuspendingPointerInputModifierNodeImpl.this.boundsSize;
                    int i7 = i3;
                    j3 = j;
                    float f4 = (int) (j5 >> c);
                    float f5 = (int) (j5 & BodyPartID.bodyIdMax);
                    if (gridInteractionController.isInitialized) {
                        gridInteractionController.pinchTargetLogZoom = (float) Math.log(calculateZoom >= 0.01f ? calculateZoom : 0.01f);
                        gridInteractionController.pinchLastCentroidX = intBitsToFloat;
                        gridInteractionController.pinchLastCentroidY = intBitsToFloat2;
                        gridInteractionController.pinchLastScreenWidth = f4;
                        gridInteractionController.pinchLastScreenHeight = f5;
                        CardDesignLibraryScene$$ExternalSyntheticLambda0 cardDesignLibraryScene$$ExternalSyntheticLambda0 = gridInteractionController.onInteractionChanged;
                        if (cardDesignLibraryScene$$ExternalSyntheticLambda0 != null) {
                            cardDesignLibraryScene$$ExternalSyntheticLambda0.invoke();
                        }
                    }
                    Iterator it6 = list4.iterator();
                    while (it6.hasNext()) {
                        ((PointerInputChange) it6.next()).consume();
                    }
                    pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                    i3 = i7;
                    f = calculateZoom;
                } else {
                    cardDesignLibraryScene2 = cardDesignLibraryScene3;
                    coroutineSingletons = coroutineSingletons2;
                    i5 = i2;
                    j3 = j;
                    if (list2.size() == 1 && i3 == 0 && i5 != 0) {
                        long calculatePan = Draggable2DKt.calculatePan(pointerEvent);
                        long m626plusMKHz9U = Offset.m626plusMKHz9U(j2, calculatePan);
                        ZoomLevel zoomLevel3 = (ZoomLevel) mutableState.getValue();
                        ZoomLevel zoomLevel4 = ZoomLevel.NEAR;
                        boolean z = zoomLevel3 == zoomLevel4 && cardDesignLibraryScene2.isFocusedOnWand();
                        if (i4 == 0 && Offset.m623getDistanceimpl(m626plusMKHz9U) > 10.0f) {
                            if (z && (focusedTagController = cardDesignLibraryScene2.focusedTagController()) != null) {
                                focusedTagController.onDragStart();
                            }
                            i4 = 1;
                        }
                        if (i4 != 0) {
                            if (((ZoomLevel) mutableState.getValue()) != zoomLevel4) {
                                cardDesignLibraryScene = cardDesignLibraryScene2;
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (calculatePan >> c));
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (calculatePan & BodyPartID.bodyIdMax));
                                ArrayDeque arrayDeque = gridInteractionController.velocitySamples;
                                if (gridInteractionController.isInitialized) {
                                    if (!gridInteractionController.isDragging) {
                                        gridInteractionController.isDragging = true;
                                        gridInteractionController.isFlingSettling = false;
                                        arrayDeque.clear();
                                        gridInteractionController.lastDragTimeNanos = 0L;
                                    }
                                    float f6 = (gridInteractionController.currentRenderParams$views().cameraZ / 25.0f) * 0.009f;
                                    float f7 = (-intBitsToFloat3) * f6;
                                    float f8 = (-intBitsToFloat4) * f6;
                                    long nanoTime = System.nanoTime();
                                    pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                                    j4 = m626plusMKHz9U;
                                    if (gridInteractionController.lastDragTimeNanos != 0) {
                                        float f9 = (nanoTime - r3) / 1.0E9f;
                                        if (f9 > RecyclerView.DECELERATION_RATE) {
                                            if (arrayDeque.size >= 5) {
                                                arrayDeque.removeFirst();
                                            }
                                            arrayDeque.addLast(new GridInteractionController.VelocitySample(f7, f8, f9));
                                        }
                                    }
                                    gridInteractionController.lastDragTimeNanos = nanoTime;
                                    ZoomAnimator zoomAnimator2 = gridInteractionController.zoomAnimator;
                                    if (gridInteractionController.gridConfig != null) {
                                        zoomAnimator2.panAnimProgress = 1.0f;
                                        ZoomLevel zoomLevel5 = zoomAnimator2.targetZoom;
                                        if (zoomLevel5 == ZoomLevel.FAR && zoomAnimator2.transitionProgress >= 1.0f) {
                                            zoomAnimator2.panY = RangesKt___RangesKt.coerceIn(zoomAnimator2.panY + f8, zoomAnimator2.farPanMinY, zoomAnimator2.farPanMaxY);
                                        } else if (zoomLevel5 != zoomLevel4 || zoomAnimator2.transitionProgress < 1.0f) {
                                            zoomAnimator2.panX += f7;
                                            zoomAnimator2.panY += f8;
                                        }
                                        CardDesignLibraryScene$$ExternalSyntheticLambda0 cardDesignLibraryScene$$ExternalSyntheticLambda02 = gridInteractionController.onInteractionChanged;
                                        if (cardDesignLibraryScene$$ExternalSyntheticLambda02 != null) {
                                            cardDesignLibraryScene$$ExternalSyntheticLambda02.invoke();
                                        }
                                    }
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        ((PointerInputChange) it2.next()).consume();
                                    }
                                }
                                pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                                j4 = m626plusMKHz9U;
                                it2 = list2.iterator();
                                while (it2.hasNext()) {
                                }
                            } else if (z) {
                                float intBitsToFloat5 = Float.intBitsToFloat((int) (calculatePan >> c)) / pointerEventHandlerCoroutine2.$$delegate_0.getDensity();
                                float intBitsToFloat6 = Float.intBitsToFloat((int) (calculatePan & BodyPartID.bodyIdMax)) / pointerEventHandlerCoroutine2.$$delegate_0.getDensity();
                                TagPoseController focusedTagController3 = cardDesignLibraryScene2.focusedTagController();
                                if (focusedTagController3 != null) {
                                    focusedTagController3.onDrag(intBitsToFloat5, intBitsToFloat6);
                                }
                                pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                                j4 = m626plusMKHz9U;
                                cardDesignLibraryScene = cardDesignLibraryScene2;
                                it2 = list2.iterator();
                                while (it2.hasNext()) {
                                }
                            } else {
                                float intBitsToFloat7 = (Float.intBitsToFloat((int) (calculatePan >> c)) / pointerEventHandlerCoroutine2.$$delegate_0.getDensity()) * 0.8f;
                                float intBitsToFloat8 = (Float.intBitsToFloat((int) (calculatePan & BodyPartID.bodyIdMax)) / pointerEventHandlerCoroutine2.$$delegate_0.getDensity()) * 0.8f;
                                cardDesignLibraryScene = cardDesignLibraryScene2;
                                cardDesignLibraryScene.nearRotationSettling = false;
                                if (intBitsToFloat7 != RecyclerView.DECELERATION_RATE || intBitsToFloat8 != RecyclerView.DECELERATION_RATE) {
                                    cardDesignLibraryScene.lastDragDeltaX = intBitsToFloat7;
                                    cardDesignLibraryScene.lastDragDeltaY = intBitsToFloat8;
                                }
                                cardDesignLibraryScene.nearDragRotation = cardDesignLibraryScene.nearDragRotation.times(new Quat((float) Math.toRadians(-intBitsToFloat7), CardDesignLibraryScene.Y_AXIS)).times(new Quat((float) Math.toRadians(-intBitsToFloat8), CardDesignLibraryScene.X_AXIS));
                                cardDesignLibraryScene.glLauncher.launch(new Pager$pageFetcher$2(cardDesignLibraryScene, null, 7));
                                pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                                j4 = m626plusMKHz9U;
                                it2 = list2.iterator();
                                while (it2.hasNext()) {
                                }
                            }
                            list = list2;
                            if ((list instanceof Collection) || !list.isEmpty()) {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    if (((PointerInputChange) it.next()).pressed) {
                                        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1 = this;
                                        cardDesignLibraryScene3 = cardDesignLibraryScene;
                                        pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                                        coroutineSingletons2 = coroutineSingletons;
                                        i2 = i5;
                                        j = j3;
                                        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.L$0 = pointerEventHandlerCoroutine2;
                                        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.J$0 = j;
                                        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.I$0 = i4;
                                        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.I$1 = i3;
                                        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.J$1 = j2;
                                        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.F$0 = f;
                                        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.I$2 = i2;
                                        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.label = 2;
                                        awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1);
                                    }
                                }
                            }
                            if (i3 != 0) {
                                boolean z2 = gridInteractionController.isInitialized;
                                ZoomAnimator zoomAnimator3 = gridInteractionController.zoomAnimator;
                                if (z2) {
                                    gridInteractionController.isPinching = false;
                                    GridConfig gridConfig3 = gridInteractionController.gridConfig;
                                    if (gridConfig3 != null) {
                                        zoomAnimator3.isPinchDriven = false;
                                        if (zoomAnimator3.transitionProgress >= 0.4f) {
                                            f2 = 1.0f;
                                            zoomAnimator3.transitionProgress = 1.0f - ((float) Math.pow(1.0f - r3, 0.3333333432674408d));
                                            zoomLevel = zoomAnimator3.targetZoom;
                                        } else {
                                            f2 = 1.0f;
                                            ZoomLevel zoomLevel6 = zoomAnimator3.currentZoom;
                                            zoomAnimator3.currentZoom = zoomAnimator3.targetZoom;
                                            zoomAnimator3.targetZoom = zoomLevel6;
                                            zoomAnimator3.transitionProgress = 1.0f - ((float) Math.pow(1.0f - (1.0f - r3), 0.3333333432674408d));
                                            zoomLevel = zoomLevel6;
                                        }
                                        ZoomLevel zoomLevel7 = ZoomLevel.NEAR;
                                        if (zoomLevel == zoomLevel7 && (zoomLevel2 = gridInteractionController.pinchBaseZoom) != zoomLevel7) {
                                            gridInteractionController.zoomOriginBeforeNear = zoomLevel2;
                                        }
                                        if (zoomLevel == gridInteractionController.pinchBaseZoom) {
                                            ZoomAnimator.animatePanTo$default(zoomAnimator3, gridInteractionController.pinchStartPanX, gridInteractionController.pinchStartPanY);
                                            gridInteractionController.blendingToFarRest = false;
                                        } else if (zoomLevel == ZoomLevel.FAR) {
                                            gridInteractionController.blendingToFarRest = true;
                                        } else if (gridInteractionController.pinchHasTargetCard) {
                                            Pair position = GridLayout.position(gridInteractionController.pinchTargetCardCol, gridInteractionController.pinchTargetCardRow, gridConfig3, GridLayout.getRenderParams(zoomLevel, gridConfig3));
                                            float floatValue3 = ((Number) position.first).floatValue();
                                            float floatValue4 = ((Number) position.second).floatValue();
                                            if (zoomLevel != zoomLevel7) {
                                                f2 = RecyclerView.DECELERATION_RATE;
                                            }
                                            Integer cardMetadataIndex = GridLayout.cardMetadataIndex(gridInteractionController.pinchTargetCardRow, gridInteractionController.pinchTargetCardCol, gridConfig3);
                                            if (cardMetadataIndex != null) {
                                                gridInteractionController.lastExploredCanonicalIndex = Integer.valueOf(cardMetadataIndex.intValue());
                                            }
                                            ZoomAnimator.animatePanTo$default(zoomAnimator3, floatValue3, (-floatValue4) + f2);
                                        }
                                        if (zoomLevel == ZoomLevel.MEDIUM && !gridInteractionController.pinchHasTargetCard) {
                                            gridInteractionController.centerOnNearestCard();
                                        }
                                        CardDesignLibraryScene$$ExternalSyntheticLambda0 cardDesignLibraryScene$$ExternalSyntheticLambda03 = gridInteractionController.onInteractionChanged;
                                        if (cardDesignLibraryScene$$ExternalSyntheticLambda03 != null) {
                                            cardDesignLibraryScene$$ExternalSyntheticLambda03.invoke();
                                        }
                                    }
                                }
                            } else if (i4 != 0) {
                                if (((ZoomLevel) mutableState.getValue()) != ZoomLevel.NEAR) {
                                    ArrayDeque arrayDeque2 = gridInteractionController.velocitySamples;
                                    ZoomAnimator zoomAnimator4 = gridInteractionController.zoomAnimator;
                                    gridInteractionController.isDragging = false;
                                    if (zoomAnimator4.targetZoom != ZoomLevel.MEDIUM || zoomAnimator4.isAnimating()) {
                                        ZoomLevel zoomLevel8 = zoomAnimator4.targetZoom;
                                        ZoomLevel zoomLevel9 = ZoomLevel.FAR;
                                        if (zoomLevel8 == zoomLevel9 && !zoomAnimator4.isAnimating() && (gridConfig = gridInteractionController.gridConfig) != null) {
                                            Pair findNearestCanonicalOrigin2 = GridLayout.findNearestCanonicalOrigin(zoomAnimator4.panX, zoomAnimator4.panY, GridLayout.getRenderParams(zoomLevel9, gridConfig), gridConfig, null);
                                            float floatValue5 = ((Number) findNearestCanonicalOrigin2.first).floatValue();
                                            float floatValue6 = ((Number) findNearestCanonicalOrigin2.second).floatValue();
                                            zoomAnimator4.farTileOriginY = floatValue6;
                                            Pair farPanBounds = gridInteractionController.farPanBounds(gridConfig);
                                            float floatValue7 = ((Number) farPanBounds.first).floatValue();
                                            float floatValue8 = ((Number) farPanBounds.second).floatValue();
                                            float f10 = floatValue7 + floatValue6;
                                            zoomAnimator4.farPanMinY = f10;
                                            zoomAnimator4.farPanMaxY = floatValue6 + floatValue8;
                                            ZoomAnimator.animatePanTo$default(zoomAnimator4, floatValue5, f10);
                                        }
                                    } else {
                                        float nanoTime2 = gridInteractionController.lastDragTimeNanos != 0 ? (System.nanoTime() - gridInteractionController.lastDragTimeNanos) / 1.0E9f : Float.MAX_VALUE;
                                        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
                                        if (arrayDeque2.isEmpty()) {
                                            pair = new Pair(valueOf, valueOf);
                                        } else {
                                            Iterator<E> it7 = arrayDeque2.iterator();
                                            float f11 = RecyclerView.DECELERATION_RATE;
                                            float f12 = RecyclerView.DECELERATION_RATE;
                                            float f13 = RecyclerView.DECELERATION_RATE;
                                            while (it7.hasNext()) {
                                                GridInteractionController.VelocitySample velocitySample = (GridInteractionController.VelocitySample) it7.next();
                                                f11 += velocitySample.dx;
                                                f12 += velocitySample.dy;
                                                f13 += velocitySample.dtSeconds;
                                            }
                                            pair = f13 > RecyclerView.DECELERATION_RATE ? new Pair(Float.valueOf(f11 / f13), Float.valueOf(f12 / f13)) : new Pair(valueOf, valueOf);
                                        }
                                        float floatValue9 = ((Number) pair.first).floatValue();
                                        float floatValue10 = ((Number) pair.second).floatValue();
                                        if (((float) Math.sqrt((floatValue10 * floatValue10) + (floatValue9 * floatValue9))) <= 0.5f || nanoTime2 >= 0.1f) {
                                            gridInteractionController.centerOnNearestCard();
                                        } else {
                                            GridConfig gridConfig4 = gridInteractionController.gridConfig;
                                            if (gridConfig4 != null) {
                                                GridRenderParams renderParams = GridLayout.getRenderParams(ZoomLevel.MEDIUM, gridConfig4);
                                                Pair findNearestCellIndices = GridLayout.findNearestCellIndices((floatValue9 * 0.25f) + zoomAnimator4.panX, (floatValue10 * 0.25f) + zoomAnimator4.panY, gridConfig4, renderParams);
                                                int intValue = ((Number) findNearestCellIndices.first).intValue();
                                                int intValue2 = ((Number) findNearestCellIndices.second).intValue();
                                                gridInteractionController.flingTargetCol = intValue;
                                                gridInteractionController.flingTargetRow = intValue2;
                                                Pair position2 = GridLayout.position(intValue, intValue2, gridConfig4, renderParams);
                                                float floatValue11 = ((Number) position2.first).floatValue();
                                                float f14 = -((Number) position2.second).floatValue();
                                                Integer cardMetadataIndex2 = GridLayout.cardMetadataIndex(intValue2, intValue, gridConfig4);
                                                if (cardMetadataIndex2 != null) {
                                                    gridInteractionController.lastExploredCanonicalIndex = Integer.valueOf(cardMetadataIndex2.intValue());
                                                }
                                                float f15 = floatValue11 - zoomAnimator4.panX;
                                                float f16 = f14 - zoomAnimator4.panY;
                                                float sqrt = (((float) Math.sqrt((f16 * f16) + (f15 * f15))) * 0.15f) + 0.3f;
                                                if (sqrt > 0.8f) {
                                                    sqrt = 0.8f;
                                                }
                                                gridInteractionController.isFlingSettling = true;
                                                zoomAnimator4.panAnimStartX = zoomAnimator4.panX;
                                                zoomAnimator4.panAnimStartY = zoomAnimator4.panY;
                                                zoomAnimator4.panAnimTargetX = floatValue11;
                                                zoomAnimator4.panAnimTargetY = f14;
                                                zoomAnimator4.panSettleDuration = sqrt;
                                                zoomAnimator4.panAnimProgress = RecyclerView.DECELERATION_RATE;
                                            }
                                        }
                                    }
                                    arrayDeque2.clear();
                                    gridInteractionController.lastDragTimeNanos = 0L;
                                    CardDesignLibraryScene$$ExternalSyntheticLambda0 cardDesignLibraryScene$$ExternalSyntheticLambda04 = gridInteractionController.onInteractionChanged;
                                    if (cardDesignLibraryScene$$ExternalSyntheticLambda04 != null) {
                                        cardDesignLibraryScene$$ExternalSyntheticLambda04.invoke();
                                    }
                                } else if (cardDesignLibraryScene.isFocusedOnWand()) {
                                    TagPoseController focusedTagController4 = cardDesignLibraryScene.focusedTagController();
                                    if (focusedTagController4 != null) {
                                        focusedTagController4.onDragEnd(RecyclerView.DECELERATION_RATE);
                                    }
                                } else {
                                    Quat quat = cardDesignLibraryScene.nearDragRotation;
                                    Quat quat2 = CardDesignLibraryScene.NEAR_CARD_ROTATION;
                                    float angleShortestPath = quat.angleShortestPath(quat2);
                                    if (Math.abs(angleShortestPath) > Float.MAX_VALUE) {
                                        angleShortestPath = RecyclerView.DECELERATION_RATE;
                                    }
                                    Quat quat3 = CardDesignLibraryScene.NEAR_CARD_BACK_ROTATION;
                                    float angleShortestPath2 = quat.angleShortestPath(quat3);
                                    if (Math.abs(angleShortestPath2) > Float.MAX_VALUE) {
                                        angleShortestPath2 = RecyclerView.DECELERATION_RATE;
                                    }
                                    if (angleShortestPath > angleShortestPath2) {
                                        quat2 = quat3;
                                    }
                                    long floatToRawIntBits2 = (Float.floatToRawIntBits(cardDesignLibraryScene.lastDragDeltaY) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(cardDesignLibraryScene.lastDragDeltaX) << c);
                                    cardDesignLibraryScene.lastDragDeltaX = RecyclerView.DECELERATION_RATE;
                                    cardDesignLibraryScene.lastDragDeltaY = RecyclerView.DECELERATION_RATE;
                                    float[] eulerAngles = quat.toEulerAngles();
                                    float[] eulerAngles2 = quat2.toEulerAngles();
                                    float[] eulerAngles3 = quat.times(new Quat((float) Math.toRadians(-RangesKt___RangesKt.coerceIn(Float.intBitsToFloat((int) (floatToRawIntBits2 >> c)), -15.0d, 15.0d)), CardDesignLibraryScene.Y_AXIS)).times(new Quat((float) Math.toRadians(-RangesKt___RangesKt.coerceIn(Float.intBitsToFloat((int) (floatToRawIntBits2 & BodyPartID.bodyIdMax)), -15.0d, 15.0d)), CardDesignLibraryScene.X_AXIS)).toEulerAngles();
                                    for (int i8 = 0; i8 < 3; i8++) {
                                        cardDesignLibraryScene.nearEulerCurrent[i8] = eulerAngles[i8];
                                        float f17 = eulerAngles2[i8];
                                        float f18 = eulerAngles[i8];
                                        float f19 = f17 - f18;
                                        double d = f19;
                                        if (d > 3.141592653589793d) {
                                            f19 -= 6.2831855f;
                                        } else if (d < -3.141592653589793d) {
                                            f19 += 6.2831855f;
                                        }
                                        cardDesignLibraryScene.nearEulerTarget[i8] = f18 + f19;
                                        float f20 = eulerAngles3[i8] - eulerAngles[i8];
                                        double d2 = f20;
                                        if (d2 > 3.141592653589793d) {
                                            f20 -= 6.2831855f;
                                        } else if (d2 < -3.141592653589793d) {
                                            f20 += 6.2831855f;
                                        }
                                        cardDesignLibraryScene.nearEulerVelocity[i8] = f20 * 25.0f;
                                    }
                                    cardDesignLibraryScene.nearRotationSettling = true;
                                    cardDesignLibraryScene.wakeAnimationLoop();
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                        j4 = m626plusMKHz9U;
                        cardDesignLibraryScene = cardDesignLibraryScene2;
                        j2 = j4;
                        list = list2;
                        if (list instanceof Collection) {
                        }
                        it = list.iterator();
                        while (it.hasNext()) {
                        }
                        if (i3 != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                    pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                }
                cardDesignLibraryScene = cardDesignLibraryScene2;
                list = list2;
                if (list instanceof Collection) {
                }
                it = list.iterator();
                while (it.hasNext()) {
                }
                if (i3 != 0) {
                }
                return Unit.INSTANCE;
            }
            mutableState = mutableState2;
            c = ' ';
            SafeTrace.throwOnFailure(obj);
            awaitFirstDown$default = obj;
        }
        long j6 = ((PointerInputChange) awaitFirstDown$default).position;
        if (((ZoomLevel) mutableState.getValue()) == ZoomLevel.NEAR) {
            float f21 = ((int) (SuspendingPointerInputModifierNodeImpl.this.boundsSize >> c)) * 0.05f;
            CardScreenBounds cardScreenBounds = (CardScreenBounds) cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.$currentNearBounds$delegate.getValue();
            if (cardScreenBounds != null) {
                float f22 = cardScreenBounds.left - f21;
                float f23 = cardScreenBounds.right + f21;
                float intBitsToFloat9 = Float.intBitsToFloat((int) (j6 >> c));
                if (f22 <= intBitsToFloat9 && intBitsToFloat9 <= f23) {
                    float f24 = cardScreenBounds.top - f21;
                    float f25 = cardScreenBounds.bottom + f21;
                    float intBitsToFloat10 = Float.intBitsToFloat((int) (j6 & BodyPartID.bodyIdMax));
                    if (f24 <= intBitsToFloat10) {
                    }
                }
                i = 0;
                j = j6;
                i2 = i;
                j2 = 0;
                i3 = 0;
                f = 1.0f;
                i4 = 0;
                cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.L$0 = pointerEventHandlerCoroutine2;
                cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.J$0 = j;
                cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.I$0 = i4;
                cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.I$1 = i3;
                cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.J$1 = j2;
                cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.F$0 = f;
                cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.I$2 = i2;
                cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.label = 2;
                awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1);
            }
        }
        i = 1;
        j = j6;
        i2 = i;
        j2 = 0;
        i3 = 0;
        f = 1.0f;
        i4 = 0;
        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.L$0 = pointerEventHandlerCoroutine2;
        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.J$0 = j;
        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.I$0 = i4;
        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.I$1 = i3;
        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.J$1 = j2;
        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.F$0 = f;
        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.I$2 = i2;
        cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1.label = 2;
        awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$3$1$1);
    }
}
