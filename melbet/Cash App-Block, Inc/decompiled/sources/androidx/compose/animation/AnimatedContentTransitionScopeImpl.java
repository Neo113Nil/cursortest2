package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl implements Transition.Segment {
    public Transition.DeferredAnimation.DeferredAnimationData animatedSize;
    public Alignment contentAlignment;
    public LayoutDirection layoutDirection;
    public final ParcelableSnapshotMutableState measuredSize$delegate = Updater.mutableStateOf$default(new IntSize(0));
    public final MutableScatterMap targetSizeMap;
    public final Transition transition;

    public final class ChildData implements ParentDataModifier {
        public final ParcelableSnapshotMutableState isTarget$delegate;

        public ChildData(boolean z) {
            this.isTarget$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z));
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public final Object modifyParentData(Density density, Object obj) {
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"androidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement", "S", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class SizeModifierElement<S> extends ModifierNodeElement {
        public final AnimatedContentTransitionScopeImpl scope;
        public final Transition.DeferredAnimation sizeAnimation;
        public final MutableState sizeTransform;

        public SizeModifierElement(Transition.DeferredAnimation deferredAnimation, MutableState mutableState, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = mutableState;
            this.scope = animatedContentTransitionScopeImpl;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final Modifier.Node create() {
            SizeModifierNode sizeModifierNode = new SizeModifierNode();
            sizeModifierNode.sizeAnimation = this.sizeAnimation;
            sizeModifierNode.sizeTransform = this.sizeTransform;
            sizeModifierNode.scope = this.scope;
            sizeModifierNode.lastSize = -9223372034707292160L;
            return sizeModifierNode;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SizeModifierElement)) {
                return false;
            }
            SizeModifierElement sizeModifierElement = (SizeModifierElement) obj;
            return Intrinsics.areEqual(sizeModifierElement.sizeAnimation, this.sizeAnimation) && sizeModifierElement.sizeTransform.equals(this.sizeTransform);
        }

        public final int hashCode() {
            int hashCode = this.scope.hashCode() * 31;
            Transition.DeferredAnimation deferredAnimation = this.sizeAnimation;
            return this.sizeTransform.hashCode() + ((hashCode + (deferredAnimation != null ? deferredAnimation.hashCode() : 0)) * 31);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("sizeTransform");
            inspectorInfo.getProperties().set(this.sizeAnimation, "sizeAnimation");
            inspectorInfo.getProperties().set(this.sizeTransform, "sizeTransform");
            inspectorInfo.getProperties().set(this.scope, "scope");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void update(Modifier.Node node) {
            SizeModifierNode sizeModifierNode = (SizeModifierNode) node;
            sizeModifierNode.sizeAnimation = this.sizeAnimation;
            sizeModifierNode.sizeTransform = this.sizeTransform;
            sizeModifierNode.scope = this.scope;
        }
    }

    public final class SizeModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
        public long lastSize;
        public AnimatedContentTransitionScopeImpl scope;
        public Transition.DeferredAnimation sizeAnimation;
        public MutableState sizeTransform;

        @Override // androidx.compose.ui.node.LayoutModifierNode
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
            final long j2;
            final Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
            if (measureScope.isLookingAhead()) {
                j2 = (mo833measureBRTryo0.width << 32) | (mo833measureBRTryo0.height & BodyPartID.bodyIdMax);
            } else {
                Transition.DeferredAnimation deferredAnimation = this.sizeAnimation;
                int i = mo833measureBRTryo0.width;
                if (deferredAnimation == null) {
                    j2 = (i << 32) | (mo833measureBRTryo0.height & BodyPartID.bodyIdMax);
                    this.lastSize = j2;
                } else {
                    final long j3 = (mo833measureBRTryo0.height & BodyPartID.bodyIdMax) | (i << 32);
                    final int i2 = 0;
                    final int i3 = 1;
                    Transition.DeferredAnimation.DeferredAnimationData animate = deferredAnimation.animate(new Function1(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                        public final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                            this.this$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            FiniteAnimationSpec finiteAnimationSpec;
                            int i4 = i2;
                            long j4 = j3;
                            AnimatedContentTransitionScopeImpl.SizeModifierNode sizeModifierNode = this.this$0;
                            switch (i4) {
                                case 0:
                                    Transition.Segment segment = (Transition.Segment) obj;
                                    if (!Intrinsics.areEqual(segment.getInitialState(), sizeModifierNode.scope.getInitialState())) {
                                        State state = (State) sizeModifierNode.scope.targetSizeMap.get(segment.getInitialState());
                                        j4 = state != null ? ((IntSize) state.getValue()).packedValue : 0L;
                                    } else if (!IntSize.m1055equalsimpl0(sizeModifierNode.lastSize, -9223372034707292160L)) {
                                        j4 = sizeModifierNode.lastSize;
                                    }
                                    State state2 = (State) sizeModifierNode.scope.targetSizeMap.get(segment.getTargetState());
                                    r1 = state2 != null ? ((IntSize) state2.getValue()).packedValue : 0L;
                                    SizeTransformImpl sizeTransformImpl = (SizeTransformImpl) sizeModifierNode.sizeTransform.getValue();
                                    return (sizeTransformImpl == null || (finiteAnimationSpec = (FiniteAnimationSpec) sizeTransformImpl.sizeAnimationSpec.invoke(new IntSize(j4), new IntSize(r1))) == null) ? AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, null, 5) : finiteAnimationSpec;
                                default:
                                    if (Intrinsics.areEqual(obj, sizeModifierNode.scope.getInitialState())) {
                                        r1 = IntSize.m1055equalsimpl0(sizeModifierNode.lastSize, -9223372034707292160L) ? j4 : sizeModifierNode.lastSize;
                                    } else {
                                        State state3 = (State) sizeModifierNode.scope.targetSizeMap.get(obj);
                                        if (state3 != null) {
                                            r1 = ((IntSize) state3.getValue()).packedValue;
                                        }
                                    }
                                    return new IntSize(r1);
                            }
                        }
                    }, new Function1(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                        public final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                            this.this$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            FiniteAnimationSpec finiteAnimationSpec;
                            int i4 = i3;
                            long j4 = j3;
                            AnimatedContentTransitionScopeImpl.SizeModifierNode sizeModifierNode = this.this$0;
                            switch (i4) {
                                case 0:
                                    Transition.Segment segment = (Transition.Segment) obj;
                                    if (!Intrinsics.areEqual(segment.getInitialState(), sizeModifierNode.scope.getInitialState())) {
                                        State state = (State) sizeModifierNode.scope.targetSizeMap.get(segment.getInitialState());
                                        j4 = state != null ? ((IntSize) state.getValue()).packedValue : 0L;
                                    } else if (!IntSize.m1055equalsimpl0(sizeModifierNode.lastSize, -9223372034707292160L)) {
                                        j4 = sizeModifierNode.lastSize;
                                    }
                                    State state2 = (State) sizeModifierNode.scope.targetSizeMap.get(segment.getTargetState());
                                    r1 = state2 != null ? ((IntSize) state2.getValue()).packedValue : 0L;
                                    SizeTransformImpl sizeTransformImpl = (SizeTransformImpl) sizeModifierNode.sizeTransform.getValue();
                                    return (sizeTransformImpl == null || (finiteAnimationSpec = (FiniteAnimationSpec) sizeTransformImpl.sizeAnimationSpec.invoke(new IntSize(j4), new IntSize(r1))) == null) ? AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, null, 5) : finiteAnimationSpec;
                                default:
                                    if (Intrinsics.areEqual(obj, sizeModifierNode.scope.getInitialState())) {
                                        r1 = IntSize.m1055equalsimpl0(sizeModifierNode.lastSize, -9223372034707292160L) ? j4 : sizeModifierNode.lastSize;
                                    } else {
                                        State state3 = (State) sizeModifierNode.scope.targetSizeMap.get(obj);
                                        if (state3 != null) {
                                            r1 = ((IntSize) state3.getValue()).packedValue;
                                        }
                                    }
                                    return new IntSize(r1);
                            }
                        }
                    });
                    this.scope.animatedSize = animate;
                    j2 = ((IntSize) animate.getValue()).packedValue;
                    this.lastSize = ((IntSize) animate.getValue()).packedValue;
                }
            }
            return MeasureScope.layout$default(measureScope, (int) (j2 >> 32), (int) (BodyPartID.bodyIdMax & j2), new Function1() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Alignment alignment = AnimatedContentTransitionScopeImpl.SizeModifierNode.this.scope.contentAlignment;
                    Placeable.PlacementScope.m854place70tqf50$default((Placeable.PlacementScope) obj, mo833measureBRTryo0, alignment.mo584alignKFBX0sM((r0.height & BodyPartID.bodyIdMax) | (r0.width << 32), j2, LayoutDirection.Ltr));
                    return Unit.INSTANCE;
                }
            });
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void onReset() {
            super.onReset();
            this.lastSize = -9223372034707292160L;
        }
    }

    public AnimatedContentTransitionScopeImpl(Transition transition, Alignment alignment, LayoutDirection layoutDirection) {
        this.transition = transition;
        this.contentAlignment = alignment;
        this.layoutDirection = layoutDirection;
        long[] jArr = ScatterMapKt.EmptyGroup;
        this.targetSizeMap = new MutableScatterMap();
    }

    /* renamed from: access$getCurrentSize-YbymL2g, reason: not valid java name */
    public static final long m140access$getCurrentSizeYbymL2g(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        Transition.DeferredAnimation.DeferredAnimationData deferredAnimationData = animatedContentTransitionScopeImpl.animatedSize;
        return deferredAnimationData != null ? ((IntSize) deferredAnimationData.getValue()).packedValue : ((IntSize) animatedContentTransitionScopeImpl.measuredSize$delegate.getValue()).packedValue;
    }

    /* renamed from: slideOutOfContainer-mOhB8PU$default, reason: not valid java name */
    public static ExitTransitionImpl m141slideOutOfContainermOhB8PU$default(final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, int i, TweenSpec tweenSpec) {
        if (animatedContentTransitionScopeImpl.m142isLeftgWo6LJ4(i)) {
            final int i2 = 0;
            return EnterExitTransitionKt.slideOutHorizontally(tweenSpec, new Function1(animatedContentTransitionScopeImpl) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
                public final /* synthetic */ AnimatedContentTransitionScopeImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = animatedContentTransitionScopeImpl;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = i2;
                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = this.this$0;
                    switch (i3) {
                        case 0:
                            int intValue = ((Number) obj).intValue();
                            State state = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                            long j = intValue;
                            return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j << 32) | (j & BodyPartID.bodyIdMax), state != null ? ((IntSize) state.getValue()).packedValue : 0L, LayoutDirection.Ltr) >> 32))) - intValue);
                        case 1:
                            int intValue2 = ((Number) obj).intValue();
                            State state2 = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                            long j2 = state2 != null ? ((IntSize) state2.getValue()).packedValue : 0L;
                            long j3 = intValue2;
                            return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j3 << 32) | (j3 & BodyPartID.bodyIdMax), j2, LayoutDirection.Ltr) >> 32))) + ((int) (j2 >> 32)));
                        case 2:
                            int intValue3 = ((Number) obj).intValue();
                            State state3 = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                            long j4 = intValue3;
                            return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j4 << 32) | (j4 & BodyPartID.bodyIdMax), state3 != null ? ((IntSize) state3.getValue()).packedValue : 0L, LayoutDirection.Ltr) & BodyPartID.bodyIdMax))) - intValue3);
                        default:
                            int intValue4 = ((Number) obj).intValue();
                            State state4 = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                            long j5 = state4 != null ? ((IntSize) state4.getValue()).packedValue : 0L;
                            long j6 = intValue4;
                            return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j6 << 32) | (j6 & BodyPartID.bodyIdMax), j5, LayoutDirection.Ltr) & BodyPartID.bodyIdMax))) + ((int) (j5 & BodyPartID.bodyIdMax)));
                    }
                }
            });
        }
        if (animatedContentTransitionScopeImpl.m143isRightgWo6LJ4(i)) {
            final int i3 = 1;
            return EnterExitTransitionKt.slideOutHorizontally(tweenSpec, new Function1(animatedContentTransitionScopeImpl) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
                public final /* synthetic */ AnimatedContentTransitionScopeImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = animatedContentTransitionScopeImpl;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i32 = i3;
                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = this.this$0;
                    switch (i32) {
                        case 0:
                            int intValue = ((Number) obj).intValue();
                            State state = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                            long j = intValue;
                            return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j << 32) | (j & BodyPartID.bodyIdMax), state != null ? ((IntSize) state.getValue()).packedValue : 0L, LayoutDirection.Ltr) >> 32))) - intValue);
                        case 1:
                            int intValue2 = ((Number) obj).intValue();
                            State state2 = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                            long j2 = state2 != null ? ((IntSize) state2.getValue()).packedValue : 0L;
                            long j3 = intValue2;
                            return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j3 << 32) | (j3 & BodyPartID.bodyIdMax), j2, LayoutDirection.Ltr) >> 32))) + ((int) (j2 >> 32)));
                        case 2:
                            int intValue3 = ((Number) obj).intValue();
                            State state3 = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                            long j4 = intValue3;
                            return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j4 << 32) | (j4 & BodyPartID.bodyIdMax), state3 != null ? ((IntSize) state3.getValue()).packedValue : 0L, LayoutDirection.Ltr) & BodyPartID.bodyIdMax))) - intValue3);
                        default:
                            int intValue4 = ((Number) obj).intValue();
                            State state4 = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                            long j5 = state4 != null ? ((IntSize) state4.getValue()).packedValue : 0L;
                            long j6 = intValue4;
                            return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j6 << 32) | (j6 & BodyPartID.bodyIdMax), j5, LayoutDirection.Ltr) & BodyPartID.bodyIdMax))) + ((int) (j5 & BodyPartID.bodyIdMax)));
                    }
                }
            });
        }
        final int i4 = 2;
        if (CrossfadeKt.m146equalsimpl0(i, 2)) {
            return EnterExitTransitionKt.slideOutVertically(tweenSpec, new Function1(animatedContentTransitionScopeImpl) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
                public final /* synthetic */ AnimatedContentTransitionScopeImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = animatedContentTransitionScopeImpl;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i32 = i4;
                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = this.this$0;
                    switch (i32) {
                        case 0:
                            int intValue = ((Number) obj).intValue();
                            State state = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                            long j = intValue;
                            return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j << 32) | (j & BodyPartID.bodyIdMax), state != null ? ((IntSize) state.getValue()).packedValue : 0L, LayoutDirection.Ltr) >> 32))) - intValue);
                        case 1:
                            int intValue2 = ((Number) obj).intValue();
                            State state2 = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                            long j2 = state2 != null ? ((IntSize) state2.getValue()).packedValue : 0L;
                            long j3 = intValue2;
                            return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j3 << 32) | (j3 & BodyPartID.bodyIdMax), j2, LayoutDirection.Ltr) >> 32))) + ((int) (j2 >> 32)));
                        case 2:
                            int intValue3 = ((Number) obj).intValue();
                            State state3 = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                            long j4 = intValue3;
                            return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j4 << 32) | (j4 & BodyPartID.bodyIdMax), state3 != null ? ((IntSize) state3.getValue()).packedValue : 0L, LayoutDirection.Ltr) & BodyPartID.bodyIdMax))) - intValue3);
                        default:
                            int intValue4 = ((Number) obj).intValue();
                            State state4 = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                            long j5 = state4 != null ? ((IntSize) state4.getValue()).packedValue : 0L;
                            long j6 = intValue4;
                            return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j6 << 32) | (j6 & BodyPartID.bodyIdMax), j5, LayoutDirection.Ltr) & BodyPartID.bodyIdMax))) + ((int) (j5 & BodyPartID.bodyIdMax)));
                    }
                }
            });
        }
        final int i5 = 3;
        return CrossfadeKt.m146equalsimpl0(i, 3) ? EnterExitTransitionKt.slideOutVertically(tweenSpec, new Function1(animatedContentTransitionScopeImpl) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
            public final /* synthetic */ AnimatedContentTransitionScopeImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = animatedContentTransitionScopeImpl;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i5;
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = this.this$0;
                switch (i32) {
                    case 0:
                        int intValue = ((Number) obj).intValue();
                        State state = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                        long j = intValue;
                        return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j << 32) | (j & BodyPartID.bodyIdMax), state != null ? ((IntSize) state.getValue()).packedValue : 0L, LayoutDirection.Ltr) >> 32))) - intValue);
                    case 1:
                        int intValue2 = ((Number) obj).intValue();
                        State state2 = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                        long j2 = state2 != null ? ((IntSize) state2.getValue()).packedValue : 0L;
                        long j3 = intValue2;
                        return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j3 << 32) | (j3 & BodyPartID.bodyIdMax), j2, LayoutDirection.Ltr) >> 32))) + ((int) (j2 >> 32)));
                    case 2:
                        int intValue3 = ((Number) obj).intValue();
                        State state3 = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                        long j4 = intValue3;
                        return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j4 << 32) | (j4 & BodyPartID.bodyIdMax), state3 != null ? ((IntSize) state3.getValue()).packedValue : 0L, LayoutDirection.Ltr) & BodyPartID.bodyIdMax))) - intValue3);
                    default:
                        int intValue4 = ((Number) obj).intValue();
                        State state4 = (State) animatedContentTransitionScopeImpl2.targetSizeMap.get(animatedContentTransitionScopeImpl2.transition.targetState$delegate.getValue());
                        long j5 = state4 != null ? ((IntSize) state4.getValue()).packedValue : 0L;
                        long j6 = intValue4;
                        return Integer.valueOf((-((int) (animatedContentTransitionScopeImpl2.contentAlignment.mo584alignKFBX0sM((j6 << 32) | (j6 & BodyPartID.bodyIdMax), j5, LayoutDirection.Ltr) & BodyPartID.bodyIdMax))) + ((int) (j5 & BodyPartID.bodyIdMax)));
                }
            }
        }) : ExitTransitionImpl.None;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public final Object getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public final Object getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    /* renamed from: isLeft-gWo6LJ4, reason: not valid java name */
    public final boolean m142isLeftgWo6LJ4(int i) {
        if (CrossfadeKt.m146equalsimpl0(i, 0)) {
            return true;
        }
        if (CrossfadeKt.m146equalsimpl0(i, 4) && this.layoutDirection == LayoutDirection.Ltr) {
            return true;
        }
        return CrossfadeKt.m146equalsimpl0(i, 5) && this.layoutDirection == LayoutDirection.Rtl;
    }

    /* renamed from: isRight-gWo6LJ4, reason: not valid java name */
    public final boolean m143isRightgWo6LJ4(int i) {
        return CrossfadeKt.m146equalsimpl0(i, 1) || (CrossfadeKt.m146equalsimpl0(i, 4) && this.layoutDirection == LayoutDirection.Rtl) || (CrossfadeKt.m146equalsimpl0(i, 5) && this.layoutDirection == LayoutDirection.Ltr);
    }
}
