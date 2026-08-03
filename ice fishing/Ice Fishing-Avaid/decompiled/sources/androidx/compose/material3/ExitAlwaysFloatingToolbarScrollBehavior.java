package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;

/* compiled from: FloatingToolbar.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001fH\u0096@¢\u0006\u0004\b \u0010!J\f\u0010\"\u001a\u00020#*\u00020#H\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Landroidx/compose/material3/ExitAlwaysFloatingToolbarScrollBehavior;", "Landroidx/compose/material3/FloatingToolbarScrollBehavior;", "exitDirection", "Landroidx/compose/material3/FloatingToolbarExitDirection;", "state", "Landroidx/compose/material3/FloatingToolbarState;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "<init>", "(ILandroidx/compose/material3/FloatingToolbarState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getExitDirection-8LIK8-E", "()I", "I", "getState", "()Landroidx/compose/material3/FloatingToolbarState;", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getFlingAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "floatingScrollBehavior", "Landroidx/compose/ui/Modifier;", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ExitAlwaysFloatingToolbarScrollBehavior implements FloatingToolbarScrollBehavior {
    public static final int $stable = 0;
    private final int exitDirection;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final FloatingToolbarState state;

    public /* synthetic */ ExitAlwaysFloatingToolbarScrollBehavior(int i, FloatingToolbarState floatingToolbarState, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, floatingToolbarState, animationSpec, decayAnimationSpec);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ Object mo718onPreFlingQWom1Mo(long j, Continuation continuation) {
        return NestedScrollConnection.CC.m7994onPreFlingQWom1Mo$suspendImpl(this, j, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public /* synthetic */ long mo719onPreScrollOzD1aCk(long j, int i) {
        return NestedScrollConnection.CC.m7988$default$onPreScrollOzD1aCk(this, j, i);
    }

    private ExitAlwaysFloatingToolbarScrollBehavior(int i, FloatingToolbarState floatingToolbarState, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec) {
        this.exitDirection = i;
        this.state = floatingToolbarState;
        this.snapAnimationSpec = animationSpec;
        this.flingAnimationSpec = decayAnimationSpec;
    }

    @Override // androidx.compose.material3.FloatingToolbarScrollBehavior
    /* renamed from: getExitDirection-8LIK8-E, reason: not valid java name and from getter */
    public int getExitDirection() {
        return this.exitDirection;
    }

    @Override // androidx.compose.material3.FloatingToolbarScrollBehavior
    public FloatingToolbarState getState() {
        return this.state;
    }

    @Override // androidx.compose.material3.FloatingToolbarScrollBehavior
    public AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    @Override // androidx.compose.material3.FloatingToolbarScrollBehavior
    public DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo717onPostScrollDzOQY0M(long consumed, long available, int source) {
        FloatingToolbarState state = getState();
        int i = (int) (consumed & 4294967295L);
        state.setContentOffset(state.getContentOffset() + Float.intBitsToFloat(i));
        FloatingToolbarState state2 = getState();
        state2.setOffset(state2.getOffset() + Float.intBitsToFloat(i));
        return Offset.INSTANCE.m6535getZeroF1C5BW0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if (r13 != r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo716onPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
        ExitAlwaysFloatingToolbarScrollBehavior$onPostFling$1 exitAlwaysFloatingToolbarScrollBehavior$onPostFling$1;
        int i;
        long j3;
        long packedValue;
        if (continuation instanceof ExitAlwaysFloatingToolbarScrollBehavior$onPostFling$1) {
            exitAlwaysFloatingToolbarScrollBehavior$onPostFling$1 = (ExitAlwaysFloatingToolbarScrollBehavior$onPostFling$1) continuation;
            if ((exitAlwaysFloatingToolbarScrollBehavior$onPostFling$1.label & Integer.MIN_VALUE) != 0) {
                exitAlwaysFloatingToolbarScrollBehavior$onPostFling$1.label -= Integer.MIN_VALUE;
                ExitAlwaysFloatingToolbarScrollBehavior$onPostFling$1 exitAlwaysFloatingToolbarScrollBehavior$onPostFling$12 = exitAlwaysFloatingToolbarScrollBehavior$onPostFling$1;
                Object obj = exitAlwaysFloatingToolbarScrollBehavior$onPostFling$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = exitAlwaysFloatingToolbarScrollBehavior$onPostFling$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (Velocity.m9975getYimpl(j2) > 0.0f && (getState().getOffset() == 0.0f || getState().getOffset() == getState().getOffsetLimit())) {
                        getState().setContentOffset(0.0f);
                    }
                    exitAlwaysFloatingToolbarScrollBehavior$onPostFling$12.J$0 = j2;
                    exitAlwaysFloatingToolbarScrollBehavior$onPostFling$12.label = 1;
                    obj = NestedScrollConnection.CC.m7993onPostFlingRZ2iAVY$suspendImpl(this, j, j2, exitAlwaysFloatingToolbarScrollBehavior$onPostFling$12);
                    if (obj != coroutine_suspended) {
                        j3 = j2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    packedValue = exitAlwaysFloatingToolbarScrollBehavior$onPostFling$12.J$0;
                    ResultKt.throwOnFailure(obj);
                    return Velocity.m9965boximpl(Velocity.m9978plusAH228Gc(packedValue, ((Velocity) obj).getPackedValue()));
                }
                j3 = exitAlwaysFloatingToolbarScrollBehavior$onPostFling$12.J$0;
                ResultKt.throwOnFailure(obj);
                packedValue = ((Velocity) obj).getPackedValue();
                FloatingToolbarState state = getState();
                float m9975getYimpl = Velocity.m9975getYimpl(j3);
                AnimationSpec<Float> snapAnimationSpec = getSnapAnimationSpec();
                DecayAnimationSpec<Float> flingAnimationSpec = getFlingAnimationSpec();
                exitAlwaysFloatingToolbarScrollBehavior$onPostFling$12.J$0 = packedValue;
                exitAlwaysFloatingToolbarScrollBehavior$onPostFling$12.label = 2;
                obj = FloatingToolbarKt.settleFloatingToolbar(state, m9975getYimpl, snapAnimationSpec, flingAnimationSpec, exitAlwaysFloatingToolbarScrollBehavior$onPostFling$12);
            }
        }
        exitAlwaysFloatingToolbarScrollBehavior$onPostFling$1 = new ExitAlwaysFloatingToolbarScrollBehavior$onPostFling$1(this, continuation);
        ExitAlwaysFloatingToolbarScrollBehavior$onPostFling$1 exitAlwaysFloatingToolbarScrollBehavior$onPostFling$122 = exitAlwaysFloatingToolbarScrollBehavior$onPostFling$1;
        Object obj2 = exitAlwaysFloatingToolbarScrollBehavior$onPostFling$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = exitAlwaysFloatingToolbarScrollBehavior$onPostFling$122.label;
        if (i != 0) {
        }
        packedValue = ((Velocity) obj2).getPackedValue();
        FloatingToolbarState state2 = getState();
        float m9975getYimpl2 = Velocity.m9975getYimpl(j3);
        AnimationSpec<Float> snapAnimationSpec2 = getSnapAnimationSpec();
        DecayAnimationSpec<Float> flingAnimationSpec2 = getFlingAnimationSpec();
        exitAlwaysFloatingToolbarScrollBehavior$onPostFling$122.J$0 = packedValue;
        exitAlwaysFloatingToolbarScrollBehavior$onPostFling$122.label = 2;
        obj2 = FloatingToolbarKt.settleFloatingToolbar(state2, m9975getYimpl2, snapAnimationSpec2, flingAnimationSpec2, exitAlwaysFloatingToolbarScrollBehavior$onPostFling$122);
    }

    @Override // androidx.compose.material3.FloatingToolbarScrollBehavior
    public Modifier floatingScrollBehavior(Modifier modifier) {
        Orientation orientation;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        int exitDirection = getExitDirection();
        if (FloatingToolbarExitDirection.m3219equalsimpl0(exitDirection, FloatingToolbarExitDirection.INSTANCE.m3225getStart8LIK8E()) || FloatingToolbarExitDirection.m3219equalsimpl0(exitDirection, FloatingToolbarExitDirection.INSTANCE.m3224getEnd8LIK8E())) {
            orientation = Orientation.Horizontal;
        } else {
            orientation = Orientation.Vertical;
        }
        Orientation orientation2 = orientation;
        return OnGloballyPositionedModifierKt.onGloballyPositioned(DraggableKt.draggable$default(LayoutModifierKt.layout(modifier, new Function3() { // from class: androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                MeasureResult floatingScrollBehavior$lambda$1;
                floatingScrollBehavior$lambda$1 = ExitAlwaysFloatingToolbarScrollBehavior.floatingScrollBehavior$lambda$1(Ref.BooleanRef.this, this, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return floatingScrollBehavior$lambda$1;
            }
        }), DraggableKt.DraggableState(new Function1() { // from class: androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit floatingScrollBehavior$lambda$0;
                floatingScrollBehavior$lambda$0 = ExitAlwaysFloatingToolbarScrollBehavior.floatingScrollBehavior$lambda$0(ExitAlwaysFloatingToolbarScrollBehavior.this, booleanRef, ((Float) obj).floatValue());
                return floatingScrollBehavior$lambda$0;
            }
        }), orientation2, false, null, false, null, new ExitAlwaysFloatingToolbarScrollBehavior$floatingScrollBehavior$2(this, null), false, 188, null), new Function1() { // from class: androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit floatingScrollBehavior$lambda$2;
                floatingScrollBehavior$lambda$2 = ExitAlwaysFloatingToolbarScrollBehavior.floatingScrollBehavior$lambda$2(ExitAlwaysFloatingToolbarScrollBehavior.this, booleanRef, (LayoutCoordinates) obj);
                return floatingScrollBehavior$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit floatingScrollBehavior$lambda$0(ExitAlwaysFloatingToolbarScrollBehavior exitAlwaysFloatingToolbarScrollBehavior, Ref.BooleanRef booleanRef, float f) {
        if (CollectionsKt.listOf((Object[]) new FloatingToolbarExitDirection[]{FloatingToolbarExitDirection.m3216boximpl(FloatingToolbarExitDirection.INSTANCE.m3225getStart8LIK8E()), FloatingToolbarExitDirection.m3216boximpl(FloatingToolbarExitDirection.INSTANCE.m3224getEnd8LIK8E())}).contains(FloatingToolbarExitDirection.m3216boximpl(exitAlwaysFloatingToolbarScrollBehavior.getExitDirection())) && booleanRef.element) {
            f = -f;
        }
        int exitDirection = exitAlwaysFloatingToolbarScrollBehavior.getExitDirection();
        if (FloatingToolbarExitDirection.m3219equalsimpl0(exitDirection, FloatingToolbarExitDirection.INSTANCE.m3225getStart8LIK8E()) || FloatingToolbarExitDirection.m3219equalsimpl0(exitDirection, FloatingToolbarExitDirection.INSTANCE.m3226getTop8LIK8E())) {
            FloatingToolbarState state = exitAlwaysFloatingToolbarScrollBehavior.getState();
            state.setOffset(state.getOffset() + f);
        } else if (FloatingToolbarExitDirection.m3219equalsimpl0(exitDirection, FloatingToolbarExitDirection.INSTANCE.m3224getEnd8LIK8E()) || FloatingToolbarExitDirection.m3219equalsimpl0(exitDirection, FloatingToolbarExitDirection.INSTANCE.m3223getBottom8LIK8E())) {
            FloatingToolbarState state2 = exitAlwaysFloatingToolbarScrollBehavior.getState();
            state2.setOffset(state2.getOffset() - f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult floatingScrollBehavior$lambda$1(Ref.BooleanRef booleanRef, final ExitAlwaysFloatingToolbarScrollBehavior exitAlwaysFloatingToolbarScrollBehavior, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        booleanRef.element = measureScope.getLayoutDirection() == LayoutDirection.Rtl;
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(constraints.getValue());
        final float offset = (CollectionsKt.listOf((Object[]) new FloatingToolbarExitDirection[]{FloatingToolbarExitDirection.m3216boximpl(FloatingToolbarExitDirection.INSTANCE.m3225getStart8LIK8E()), FloatingToolbarExitDirection.m3216boximpl(FloatingToolbarExitDirection.INSTANCE.m3224getEnd8LIK8E())}).contains(FloatingToolbarExitDirection.m3216boximpl(exitAlwaysFloatingToolbarScrollBehavior.getExitDirection())) && booleanRef.element) ? -exitAlwaysFloatingToolbarScrollBehavior.getState().getOffset() : exitAlwaysFloatingToolbarScrollBehavior.getState().getOffset();
        return MeasureScope.CC.layout$default(measureScope, mo8285measureBRTryo0.getWidth(), mo8285measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit floatingScrollBehavior$lambda$1$0;
                floatingScrollBehavior$lambda$1$0 = ExitAlwaysFloatingToolbarScrollBehavior.floatingScrollBehavior$lambda$1$0(ExitAlwaysFloatingToolbarScrollBehavior.this, mo8285measureBRTryo0, offset, (Placeable.PlacementScope) obj);
                return floatingScrollBehavior$lambda$1$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit floatingScrollBehavior$lambda$1$0(ExitAlwaysFloatingToolbarScrollBehavior exitAlwaysFloatingToolbarScrollBehavior, Placeable placeable, float f, Placeable.PlacementScope placementScope) {
        int exitDirection = exitAlwaysFloatingToolbarScrollBehavior.getExitDirection();
        if (FloatingToolbarExitDirection.m3219equalsimpl0(exitDirection, FloatingToolbarExitDirection.INSTANCE.m3225getStart8LIK8E())) {
            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, MathKt.roundToInt(f), 0, 0.0f, (Function1) null, 12, (Object) null);
        } else if (FloatingToolbarExitDirection.m3219equalsimpl0(exitDirection, FloatingToolbarExitDirection.INSTANCE.m3224getEnd8LIK8E())) {
            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, -MathKt.roundToInt(f), 0, 0.0f, (Function1) null, 12, (Object) null);
        } else if (FloatingToolbarExitDirection.m3219equalsimpl0(exitDirection, FloatingToolbarExitDirection.INSTANCE.m3226getTop8LIK8E())) {
            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, MathKt.roundToInt(f), 0.0f, (Function1) null, 12, (Object) null);
        } else if (FloatingToolbarExitDirection.m3219equalsimpl0(exitDirection, FloatingToolbarExitDirection.INSTANCE.m3223getBottom8LIK8E())) {
            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, -MathKt.roundToInt(f), 0.0f, (Function1) null, 12, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit floatingScrollBehavior$lambda$2(ExitAlwaysFloatingToolbarScrollBehavior exitAlwaysFloatingToolbarScrollBehavior, Ref.BooleanRef booleanRef, LayoutCoordinates layoutCoordinates) {
        float f;
        float intBitsToFloat;
        float f2;
        float intBitsToFloat2;
        float f3;
        long positionInParent = LayoutCoordinatesKt.positionInParent(layoutCoordinates);
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        long mo8287getSizeYbymL2g = parentLayoutCoordinates != null ? parentLayoutCoordinates.mo8287getSizeYbymL2g() : IntSize.INSTANCE.m9912getZeroYbymL2g();
        int mo8287getSizeYbymL2g2 = (int) (layoutCoordinates.mo8287getSizeYbymL2g() >> 32);
        int mo8287getSizeYbymL2g3 = (int) (layoutCoordinates.mo8287getSizeYbymL2g() & 4294967295L);
        int exitDirection = exitAlwaysFloatingToolbarScrollBehavior.getExitDirection();
        if (FloatingToolbarExitDirection.m3219equalsimpl0(exitDirection, FloatingToolbarExitDirection.INSTANCE.m3225getStart8LIK8E())) {
            if (booleanRef.element) {
                f = (int) (mo8287getSizeYbymL2g >> 32);
                intBitsToFloat = Float.intBitsToFloat((int) (positionInParent >> 32));
                f3 = f - intBitsToFloat;
            } else {
                f2 = mo8287getSizeYbymL2g2;
                intBitsToFloat2 = Float.intBitsToFloat((int) (positionInParent >> 32));
                f3 = f2 + intBitsToFloat2;
            }
        } else if (FloatingToolbarExitDirection.m3219equalsimpl0(exitDirection, FloatingToolbarExitDirection.INSTANCE.m3224getEnd8LIK8E())) {
            if (booleanRef.element) {
                f2 = mo8287getSizeYbymL2g2;
                intBitsToFloat2 = Float.intBitsToFloat((int) (positionInParent >> 32));
                f3 = f2 + intBitsToFloat2;
            } else {
                f = (int) (mo8287getSizeYbymL2g >> 32);
                intBitsToFloat = Float.intBitsToFloat((int) (positionInParent >> 32));
                f3 = f - intBitsToFloat;
            }
        } else if (FloatingToolbarExitDirection.m3219equalsimpl0(exitDirection, FloatingToolbarExitDirection.INSTANCE.m3226getTop8LIK8E())) {
            f2 = mo8287getSizeYbymL2g3;
            intBitsToFloat2 = Float.intBitsToFloat((int) (positionInParent & 4294967295L));
            f3 = f2 + intBitsToFloat2;
        } else {
            f = (int) (mo8287getSizeYbymL2g & 4294967295L);
            intBitsToFloat = Float.intBitsToFloat((int) (positionInParent & 4294967295L));
            f3 = f - intBitsToFloat;
        }
        exitAlwaysFloatingToolbarScrollBehavior.getState().setOffsetLimit(-(f3 - exitAlwaysFloatingToolbarScrollBehavior.getState().getOffset()));
        return Unit.INSTANCE;
    }
}
