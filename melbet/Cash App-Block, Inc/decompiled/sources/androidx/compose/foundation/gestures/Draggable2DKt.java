package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.biometric.BiometricPrompt;
import androidx.collection.MutableObjectList;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.material.AnchoredDraggableKt$restartable$2;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt__ArraysJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.JobKt;
import okio.internal.FileSystem$commonDeleteRecursively$sequence$1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class Draggable2DKt {
    public static final BorderKt$$ExternalSyntheticLambda1 AlwaysDrag = new BorderKt$$ExternalSyntheticLambda1(19);
    public static final DecayAnimationSpecImpl NoOpDecayAnimationSpec = new DecayAnimationSpecImpl(new Transition.AnonymousClass1());
    public static final BorderKt$$ExternalSyntheticLambda1 NoOpOnDragStart = new BorderKt$$ExternalSyntheticLambda1(24);
    public static final BorderKt$$ExternalSyntheticLambda1 NoOpOnDragStop = new BorderKt$$ExternalSyntheticLambda1(25);
    public static final BorderKt$$ExternalSyntheticLambda1 NoOnReport = new BorderKt$$ExternalSyntheticLambda1(28);

    public static final DefaultDraggableAnchors DraggableAnchors(Function1 function1) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        function1.invoke(draggableAnchorsConfig);
        float[] fArr = draggableAnchorsConfig.positions;
        ArrayList arrayList = draggableAnchorsConfig.keys;
        int size = arrayList.size();
        fArr.getClass();
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(size, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, 0, size);
        copyOfRange.getClass();
        return new DefaultDraggableAnchors(arrayList, copyOfRange);
    }

    /* renamed from: access$addIndirectPointerInputChange-Qf4Zb88, reason: not valid java name */
    public static final void m218access$addIndirectPointerInputChangeQf4Zb88(BiometricPrompt biometricPrompt, IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, Sniffer sniffer, long j) {
        float intBitsToFloat;
        MutableObjectList mutableObjectList = (MutableObjectList) sniffer.scratch;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (indirectPointerInputChange.position >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (indirectPointerInputChange.position & BodyPartID.bodyIdMax));
        if (changedToDownIgnoreConsumed(indirectPointerInputChange)) {
            sniffer.peekLength = 0;
            mutableObjectList.clear();
        }
        if (!access$changedToUpIgnoreConsumed(indirectPointerInputChange) && !changedToDownIgnoreConsumed(indirectPointerInputChange)) {
            if (mutableObjectList._size == 3) {
                int i = sniffer.peekLength;
                sniffer.peekLength = i + 1;
                mutableObjectList.set(i, indirectPointerInputChange);
            } else {
                mutableObjectList.add(indirectPointerInputChange);
            }
            if (sniffer.peekLength == 3) {
                sniffer.peekLength = 0;
            }
            Object[] objArr = mutableObjectList.content;
            int i2 = mutableObjectList._size;
            float f = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                f += Float.intBitsToFloat((int) (((IndirectPointerInputChange) objArr[i3]).position >> 32));
            }
            int i4 = mutableObjectList._size;
            intBitsToFloat2 = f / i4;
            Object[] objArr2 = mutableObjectList.content;
            float f2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f2 += Float.intBitsToFloat((int) (((IndirectPointerInputChange) objArr2[i5]).position & BodyPartID.bodyIdMax));
            }
            intBitsToFloat3 = f2 / mutableObjectList._size;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & BodyPartID.bodyIdMax);
        if (orientation != null) {
            int i6 = indirectPointerEventPrimaryDirectionalMotionAxis.value;
            if (i6 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i6 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax));
            }
            floatToRawIntBits = orientation == Orientation.Horizontal ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax) : (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax);
        }
        ((RealStrongMemoryCache) biometricPrompt.mClientFragmentManager).m1456addPositionUv8p0NA(indirectPointerInputChange.uptimeMillis, Offset.m626plusMKHz9U(floatToRawIntBits, j));
    }

    public static final Object access$animateTo(AnchoredDraggableState anchoredDraggableState, float f, AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1, DefaultDraggableAnchors defaultDraggableAnchors, Object obj, AnimationSpec animationSpec, SuspendLambda suspendLambda) {
        Object animate;
        float positionOf = defaultDraggableAnchors.positionOf(obj);
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.element = Float.isNaN(anchoredDraggableState.offset$delegate.getFloatValue()) ? RecyclerView.DECELERATION_RATE : anchoredDraggableState.offset$delegate.getFloatValue();
        if (!Float.isNaN(positionOf)) {
            float f2 = ref$FloatRef.element;
            if (f2 != positionOf && (animate = AnimatableKt.animate(f2, positionOf, f, animationSpec, new TextKt$$ExternalSyntheticLambda0(3, anchoredDraggableState$anchoredDragScope$1, ref$FloatRef), suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return animate;
            }
        }
        return Unit.INSTANCE;
    }

    public static final boolean access$changedToUpIgnoreConsumed(IndirectPointerInputChange indirectPointerInputChange) {
        return indirectPointerInputChange.previousPressed && !indirectPointerInputChange.pressed;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$computeTarget(DefaultDraggableAnchors defaultDraggableAnchors, float f, float f2, Function1 function1, Function0 function0) {
        if (Float.isNaN(f)) {
            a$$ExternalSyntheticBUOutline0.m$3("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z = Math.abs(f2) > RecyclerView.DECELERATION_RATE;
        boolean z2 = z && f2 > RecyclerView.DECELERATION_RATE;
        if (!z) {
            Object closestAnchor = defaultDraggableAnchors.closestAnchor(f);
            closestAnchor.getClass();
            return closestAnchor;
        }
        if (Math.abs(f2) >= Math.abs(((Number) function0.invoke()).floatValue())) {
            Object closestAnchor2 = defaultDraggableAnchors.closestAnchor(f, z2);
            closestAnchor2.getClass();
            return closestAnchor2;
        }
        Object closestAnchor3 = defaultDraggableAnchors.closestAnchor(f, false);
        closestAnchor3.getClass();
        float positionOf = defaultDraggableAnchors.positionOf(closestAnchor3);
        Object closestAnchor4 = defaultDraggableAnchors.closestAnchor(f, true);
        closestAnchor4.getClass();
        float positionOf2 = defaultDraggableAnchors.positionOf(closestAnchor4);
        float abs = Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(positionOf - positionOf2)))).floatValue());
        if (!z2) {
            positionOf = positionOf2;
        }
        boolean z3 = Math.abs(positionOf - f) >= abs;
        if (z3) {
            return z2 ? closestAnchor4 : closestAnchor3;
        }
        if (z3) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (z2) {
        }
    }

    public static final boolean access$isLowScrollingDelta(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$restartable(Function0 function0, Function2 function2, ContinuationImpl continuationImpl) {
        AnchoredDraggableKt$restartable$1 anchoredDraggableKt$restartable$1;
        int i;
        if (continuationImpl instanceof AnchoredDraggableKt$restartable$1) {
            anchoredDraggableKt$restartable$1 = (AnchoredDraggableKt$restartable$1) continuationImpl;
            int i2 = anchoredDraggableKt$restartable$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                anchoredDraggableKt$restartable$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = anchoredDraggableKt$restartable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anchoredDraggableKt$restartable$1.label;
                Continuation continuation = null;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(function0, function2, continuation, i3);
                    anchoredDraggableKt$restartable$1.label = 1;
                    if (JobKt.coroutineScope(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1) == coroutineSingletons) {
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
        }
        anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(continuationImpl);
        Object obj2 = anchoredDraggableKt$restartable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anchoredDraggableKt$restartable$1.label;
        Continuation continuation2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    public static final boolean allPointersUp(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine) {
        List list = SuspendingPointerInputModifierNodeImpl.this.currentEvent.changes;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((PointerInputChange) list.get(i)).pressed) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    public static Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, SnapFlingBehavior snapFlingBehavior, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            snapFlingBehavior = null;
        }
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z2, null, null, snapFlingBehavior));
    }

    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    public static final float m219anglek4lQ0M(long j) {
        if (Float.intBitsToFloat((int) (j >> 32)) == RecyclerView.DECELERATION_RATE && Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) == RecyclerView.DECELERATION_RATE) {
            return RecyclerView.DECELERATION_RATE;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))))) * 180.0f) / 3.1415927f;
    }

    public static Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, ContinuationImpl continuationImpl) {
        AnimationSpec animationSpec;
        if (anchoredDraggableState.getUsePreModifierChangeBehavior$foundation()) {
            animationSpec = anchoredDraggableState.snapAnimationSpec;
            if (animationSpec == null) {
                Intrinsics.throwUninitializedPropertyAccessException("snapAnimationSpec");
                throw null;
            }
        } else {
            animationSpec = AnchoredDraggableDefaults.SnapAnimationSpec;
        }
        Object anchoredDrag = anchoredDraggableState.anchoredDrag(obj, MutatePriority.Default, new AnchoredDraggableKt$animateTo$4(anchoredDraggableState, animationSpec, null), continuationImpl);
        return anchoredDrag == CoroutineSingletons.COROUTINE_SUSPENDED ? anchoredDrag : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateToWithDecay(AnchoredDraggableState anchoredDraggableState, Object obj, float f, AnimationSpec animationSpec, DecayAnimationSpecImpl decayAnimationSpecImpl, Continuation continuation) {
        AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$1;
        int i;
        float f2;
        Ref$FloatRef ref$FloatRef;
        if (continuation instanceof AnchoredDraggableKt$animateToWithDecay$1) {
            anchoredDraggableKt$animateToWithDecay$1 = (AnchoredDraggableKt$animateToWithDecay$1) continuation;
            int i2 = anchoredDraggableKt$animateToWithDecay$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                anchoredDraggableKt$animateToWithDecay$1.label = i2 - PKIFailureInfo.systemUnavail;
                AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$12 = anchoredDraggableKt$animateToWithDecay$1;
                Object obj2 = anchoredDraggableKt$animateToWithDecay$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anchoredDraggableKt$animateToWithDecay$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    ref$FloatRef2.element = f;
                    Function4 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(anchoredDraggableState, f, animationSpec, ref$FloatRef2, decayAnimationSpecImpl, null);
                    anchoredDraggableKt$animateToWithDecay$12.L$0 = ref$FloatRef2;
                    anchoredDraggableKt$animateToWithDecay$12.F$0 = f;
                    anchoredDraggableKt$animateToWithDecay$12.label = 1;
                    if (anchoredDraggableState.anchoredDrag(obj, MutatePriority.Default, anchoredDraggableKt$animateToWithDecay$2, anchoredDraggableKt$animateToWithDecay$12) == obj3) {
                        return obj3;
                    }
                    f2 = f;
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f2 = anchoredDraggableKt$animateToWithDecay$12.F$0;
                    ref$FloatRef = anchoredDraggableKt$animateToWithDecay$12.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                return new Float(f2 - ref$FloatRef.element);
            }
        }
        anchoredDraggableKt$animateToWithDecay$1 = new AnchoredDraggableKt$animateToWithDecay$1(continuation);
        AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$122 = anchoredDraggableKt$animateToWithDecay$1;
        Object obj22 = anchoredDraggableKt$animateToWithDecay$122.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anchoredDraggableKt$animateToWithDecay$122.label;
        if (i != 0) {
        }
        return new Float(f2 - ref$FloatRef.element);
    }

    public static Object animateToWithDecay$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f, Continuation continuation) {
        AnimationSpec animationSpec;
        DecayAnimationSpecImpl decayAnimationSpecImpl;
        if (anchoredDraggableState.getUsePreModifierChangeBehavior$foundation()) {
            animationSpec = anchoredDraggableState.snapAnimationSpec;
            if (animationSpec == null) {
                Intrinsics.throwUninitializedPropertyAccessException("snapAnimationSpec");
                throw null;
            }
        } else {
            animationSpec = AnchoredDraggableDefaults.SnapAnimationSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if (anchoredDraggableState.getUsePreModifierChangeBehavior$foundation()) {
            decayAnimationSpecImpl = anchoredDraggableState.decayAnimationSpec;
            if (decayAnimationSpecImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("decayAnimationSpec");
                throw null;
            }
        } else {
            decayAnimationSpecImpl = AnchoredDraggableDefaults.DecayAnimationSpec;
        }
        return animateToWithDecay(anchoredDraggableState, obj, f, animationSpec2, decayAnimationSpecImpl, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        if (allPointersUp(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitAllPointersUp(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        ForEachGestureKt$awaitAllPointersUp$3 forEachGestureKt$awaitAllPointersUp$3;
        int i;
        if (baseContinuationImpl instanceof ForEachGestureKt$awaitAllPointersUp$3) {
            forEachGestureKt$awaitAllPointersUp$3 = (ForEachGestureKt$awaitAllPointersUp$3) baseContinuationImpl;
            int i2 = forEachGestureKt$awaitAllPointersUp$3.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                forEachGestureKt$awaitAllPointersUp$3.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = forEachGestureKt$awaitAllPointersUp$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forEachGestureKt$awaitAllPointersUp$3.label;
                if (i == 0) {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PointerEventPass pointerEventPass2 = forEachGestureKt$awaitAllPointersUp$3.L$1;
                    SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2 = forEachGestureKt$awaitAllPointersUp$3.L$0;
                    SafeTrace.throwOnFailure(obj);
                    pointerEventPass = pointerEventPass2;
                    pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                    List list = ((PointerEvent) obj).changes;
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        if (((PointerInputChange) list.get(i3)).pressed) {
                            forEachGestureKt$awaitAllPointersUp$3.L$0 = pointerEventHandlerCoroutine;
                            forEachGestureKt$awaitAllPointersUp$3.L$1 = pointerEventPass;
                            forEachGestureKt$awaitAllPointersUp$3.label = 1;
                            obj = pointerEventHandlerCoroutine.awaitPointerEvent(pointerEventPass, forEachGestureKt$awaitAllPointersUp$3);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            List list2 = ((PointerEvent) obj).changes;
                            int size2 = list2.size();
                            int i32 = 0;
                            while (i32 < size2) {
                            }
                        } else {
                            i32++;
                        }
                    }
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
            }
        }
        forEachGestureKt$awaitAllPointersUp$3 = new ForEachGestureKt$awaitAllPointersUp$3(baseContinuationImpl);
        Object obj2 = forEachGestureKt$awaitAllPointersUp$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forEachGestureKt$awaitAllPointersUp$3.label;
        if (i == 0) {
        }
    }

    public static final Object awaitEachGesture(PointerInputScope pointerInputScope, Function2 function2, Continuation continuation) {
        Object awaitPointerEventScope = ((SuspendingPointerInputModifierNodeImpl) pointerInputScope).awaitPointerEventScope(new FileSystem$commonDeleteRecursively$sequence$1(continuation.getContext(), function2, null, 1), continuation);
        return awaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED ? awaitPointerEventScope : Unit.INSTANCE;
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z) {
        List list = pointerEvent.changes;
        int size = list.size();
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i2);
            if (pointerInputChange.pressed && pointerInputChange.previousPressed) {
                j = Offset.m626plusMKHz9U(j, z ? pointerInputChange.position : pointerInputChange.previousPosition);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return Offset.m621divtuRUvjQ(j, i);
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z) {
        long calculateCentroid = calculateCentroid(pointerEvent, z);
        boolean m622equalsimpl0 = Offset.m622equalsimpl0(calculateCentroid, 9205357640488583168L);
        float f = RecyclerView.DECELERATION_RATE;
        if (m622equalsimpl0) {
            return RecyclerView.DECELERATION_RATE;
        }
        List list = pointerEvent.changes;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i2);
            if (pointerInputChange.pressed && pointerInputChange.previousPressed) {
                i++;
                f = Offset.m623getDistanceimpl(Offset.m625minusMKHz9U(z ? pointerInputChange.position : pointerInputChange.previousPosition, calculateCentroid)) + f;
            }
        }
        return f / i;
    }

    public static final long calculatePan(PointerEvent pointerEvent) {
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        if (Offset.m622equalsimpl0(calculateCentroid, 9205357640488583168L)) {
            return 0L;
        }
        return Offset.m625minusMKHz9U(calculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(PointerEvent pointerEvent) {
        List list = pointerEvent.changes;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i);
            if (!pointerInputChange.previousPressed || !pointerInputChange.pressed) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 >= 2) {
            long calculateCentroid = calculateCentroid(pointerEvent, true);
            long calculateCentroid2 = calculateCentroid(pointerEvent, false);
            int size2 = list.size();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                PointerInputChange pointerInputChange2 = (PointerInputChange) list.get(i4);
                if (pointerInputChange2.pressed && pointerInputChange2.previousPressed) {
                    long j = pointerInputChange2.position;
                    long m625minusMKHz9U = Offset.m625minusMKHz9U(pointerInputChange2.previousPosition, calculateCentroid2);
                    long m625minusMKHz9U2 = Offset.m625minusMKHz9U(j, calculateCentroid);
                    float m219anglek4lQ0M = m219anglek4lQ0M(m625minusMKHz9U2) - m219anglek4lQ0M(m625minusMKHz9U);
                    float m623getDistanceimpl = Offset.m623getDistanceimpl(Offset.m626plusMKHz9U(m625minusMKHz9U2, m625minusMKHz9U)) / 2.0f;
                    if (m219anglek4lQ0M > 180.0f) {
                        m219anglek4lQ0M -= 360.0f;
                    } else if (m219anglek4lQ0M < -180.0f) {
                        m219anglek4lQ0M += 360.0f;
                    }
                    f2 += m219anglek4lQ0M * m623getDistanceimpl;
                    f += m623getDistanceimpl;
                }
            }
            if (f != RecyclerView.DECELERATION_RATE) {
                return f2 / f;
            }
        }
        return RecyclerView.DECELERATION_RATE;
    }

    public static final float calculateZoom(PointerEvent pointerEvent) {
        float calculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float calculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (calculateCentroidSize == RecyclerView.DECELERATION_RATE || calculateCentroidSize2 == RecyclerView.DECELERATION_RATE) {
            return 1.0f;
        }
        return calculateCentroidSize / calculateCentroidSize2;
    }

    public static final boolean changedToDownIgnoreConsumed(IndirectPointerInputChange indirectPointerInputChange) {
        return !indirectPointerInputChange.previousPressed && indirectPointerInputChange.pressed;
    }

    public static final boolean isDeepPress(PointerEvent pointerEvent) {
        return pointerEvent.classification == 2;
    }

    public static final BiometricPrompt platformScrollConfig(ScrollableNode scrollableNode) {
        return new BiometricPrompt(ViewConfiguration.get(DepthSortedSetKt.requireView(scrollableNode).getContext()), 16);
    }

    /* renamed from: positionChangeInternal-wfG_k4k, reason: not valid java name */
    public static final long m220positionChangeInternalwfG_k4k(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        long j2 = indirectPointerInputChange.previousPosition;
        if (orientation != null) {
            int i = indirectPointerEventPrimaryDirectionalMotionAxis.value;
            if (i == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax));
            }
            if (orientation == Orientation.Horizontal) {
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits = Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE);
                j = floatToRawIntBits2 << 32;
            } else {
                long floatToRawIntBits3 = Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE);
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                j = floatToRawIntBits3 << 32;
            }
            j2 = j | (floatToRawIntBits & BodyPartID.bodyIdMax);
        }
        long m625minusMKHz9U = Offset.m625minusMKHz9U(m221primaryAxisPosition_bfSUIo(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis), j2);
        if (z || !indirectPointerInputChange.isConsumed) {
            return m625minusMKHz9U;
        }
        return 0L;
    }

    /* renamed from: primaryAxisPosition-_bfSUIo, reason: not valid java name */
    public static final long m221primaryAxisPosition_bfSUIo(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        if (orientation == null) {
            return indirectPointerInputChange.position;
        }
        int i = indirectPointerEventPrimaryDirectionalMotionAxis.value;
        if (i == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.position >> 32));
        } else {
            if (i != 2) {
                return indirectPointerInputChange.position;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.position & BodyPartID.bodyIdMax));
        }
        if (orientation == Orientation.Horizontal) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j = floatToRawIntBits3 << 32;
        }
        return j | (BodyPartID.bodyIdMax & floatToRawIntBits);
    }
}
