package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class EnterExitTransitionModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    public Alignment currentAlignment;
    public EnterTransitionImpl enter;
    public ExitTransitionImpl exit;
    public EnterExitTransitionKt$$ExternalSyntheticLambda0 graphicsLayerBlock;
    public Function0 isEnabled;
    public long lookaheadSize = -9223372034707292160L;
    public Transition.DeferredAnimation offsetAnimation;
    public Transition.DeferredAnimation sizeAnimation;
    public final EnterExitTransitionModifierNode$slideSpec$1 sizeTransitionSpec;
    public Transition.DeferredAnimation slideAnimation;
    public final EnterExitTransitionModifierNode$slideSpec$1 slideSpec;
    public Transition transition;

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1] */
    public EnterExitTransitionModifierNode(Transition transition, Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition.DeferredAnimation deferredAnimation3, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, Function0 function0, EnterExitTransitionKt$$ExternalSyntheticLambda0 enterExitTransitionKt$$ExternalSyntheticLambda0) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransitionImpl;
        this.exit = exitTransitionImpl;
        this.isEnabled = function0;
        this.graphicsLayerBlock = enterExitTransitionKt$$ExternalSyntheticLambda0;
        final int i = 0;
        ConstraintsKt.Constraints$default(0, 0, 0, 0, 15);
        final int i2 = 1;
        this.sizeTransitionSpec = new Function1(this) { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
            public final /* synthetic */ EnterExitTransitionModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Slide slide;
                int i3 = i2;
                EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.this$0;
                switch (i3) {
                    case 0:
                        Transition.Segment segment = (Transition.Segment) obj;
                        EnterExitState enterExitState = EnterExitState.PreEnter;
                        EnterExitState enterExitState2 = EnterExitState.Visible;
                        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                            Slide slide2 = enterExitTransitionModifierNode.enter.data.slide;
                            return slide2 != null ? slide2.animationSpec : EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                        }
                        if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit) && (slide = enterExitTransitionModifierNode.exit.data.slide) != null) {
                            return slide.animationSpec;
                        }
                        return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                    default:
                        Transition.Segment segment2 = (Transition.Segment) obj;
                        EnterExitState enterExitState3 = EnterExitState.PreEnter;
                        EnterExitState enterExitState4 = EnterExitState.Visible;
                        Object obj2 = null;
                        if (segment2.isTransitioningTo(enterExitState3, enterExitState4)) {
                            ChangeSize changeSize = enterExitTransitionModifierNode.enter.data.changeSize;
                            if (changeSize != null) {
                                obj2 = changeSize.animationSpec;
                            }
                        } else if (segment2.isTransitioningTo(enterExitState4, EnterExitState.PostExit)) {
                            ChangeSize changeSize2 = enterExitTransitionModifierNode.exit.data.changeSize;
                            if (changeSize2 != null) {
                                obj2 = changeSize2.animationSpec;
                            }
                        } else {
                            obj2 = EnterExitTransitionKt.DefaultSizeAnimationSpec;
                        }
                        return obj2 == null ? EnterExitTransitionKt.DefaultSizeAnimationSpec : obj2;
                }
            }
        };
        this.slideSpec = new Function1(this) { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
            public final /* synthetic */ EnterExitTransitionModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Slide slide;
                int i3 = i;
                EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.this$0;
                switch (i3) {
                    case 0:
                        Transition.Segment segment = (Transition.Segment) obj;
                        EnterExitState enterExitState = EnterExitState.PreEnter;
                        EnterExitState enterExitState2 = EnterExitState.Visible;
                        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                            Slide slide2 = enterExitTransitionModifierNode.enter.data.slide;
                            return slide2 != null ? slide2.animationSpec : EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                        }
                        if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit) && (slide = enterExitTransitionModifierNode.exit.data.slide) != null) {
                            return slide.animationSpec;
                        }
                        return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                    default:
                        Transition.Segment segment2 = (Transition.Segment) obj;
                        EnterExitState enterExitState3 = EnterExitState.PreEnter;
                        EnterExitState enterExitState4 = EnterExitState.Visible;
                        Object obj2 = null;
                        if (segment2.isTransitioningTo(enterExitState3, enterExitState4)) {
                            ChangeSize changeSize = enterExitTransitionModifierNode.enter.data.changeSize;
                            if (changeSize != null) {
                                obj2 = changeSize.animationSpec;
                            }
                        } else if (segment2.isTransitioningTo(enterExitState4, EnterExitState.PostExit)) {
                            ChangeSize changeSize2 = enterExitTransitionModifierNode.exit.data.changeSize;
                            if (changeSize2 != null) {
                                obj2 = changeSize2.animationSpec;
                            }
                        } else {
                            obj2 = EnterExitTransitionKt.DefaultSizeAnimationSpec;
                        }
                        return obj2 == null ? EnterExitTransitionKt.DefaultSizeAnimationSpec : obj2;
                }
            }
        };
    }

    public final Alignment getAlignment() {
        if (this.transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            ChangeSize changeSize = this.enter.data.changeSize;
            if (changeSize != null) {
                return changeSize.alignment;
            }
            ChangeSize changeSize2 = this.exit.data.changeSize;
            if (changeSize2 != null) {
                return changeSize2.alignment;
            }
            return null;
        }
        ChangeSize changeSize3 = this.exit.data.changeSize;
        if (changeSize3 != null) {
            return changeSize3.alignment;
        }
        ChangeSize changeSize4 = this.enter.data.changeSize;
        if (changeSize4 != null) {
            return changeSize4.alignment;
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        TransformOrigin transformOrigin;
        if (this.transition.transitionState.getCurrentState() == this.transition.targetState$delegate.getValue()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            Alignment alignment = getAlignment();
            if (alignment == null) {
                alignment = Alignment.Companion.TopStart;
            }
            this.currentAlignment = alignment;
        }
        final int i = 2;
        if (measureScope.isLookingAhead()) {
            Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
            long j2 = (mo833measureBRTryo0.width << 32) | (mo833measureBRTryo0.height & BodyPartID.bodyIdMax);
            this.lookaheadSize = j2;
            return MeasureScope.layout$default(measureScope, (int) (j2 >> 32), (int) (j2 & BodyPartID.bodyIdMax), new AnimatedEnterExitMeasurePolicy$measure$1(mo833measureBRTryo0, 2));
        }
        if (!((Boolean) this.isEnabled.invoke()).booleanValue()) {
            Placeable mo833measureBRTryo02 = measurable.mo833measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, mo833measureBRTryo02.width, mo833measureBRTryo02.height, new SkipToLookaheadSizeNode$measure$1$1(mo833measureBRTryo02, 2));
        }
        EnterExitTransitionKt$$ExternalSyntheticLambda0 enterExitTransitionKt$$ExternalSyntheticLambda0 = this.graphicsLayerBlock;
        Transition.DeferredAnimation deferredAnimation = enterExitTransitionKt$$ExternalSyntheticLambda0.f$0;
        Transition.DeferredAnimation deferredAnimation2 = enterExitTransitionKt$$ExternalSyntheticLambda0.f$1;
        Transition transition = enterExitTransitionKt$$ExternalSyntheticLambda0.f$2;
        final EnterTransitionImpl enterTransitionImpl = enterExitTransitionKt$$ExternalSyntheticLambda0.f$3;
        final ExitTransitionImpl exitTransitionImpl = enterExitTransitionKt$$ExternalSyntheticLambda0.f$4;
        Transition.DeferredAnimation deferredAnimation3 = enterExitTransitionKt$$ExternalSyntheticLambda0.f$5;
        final int i2 = 0;
        final int i3 = 1;
        Transition.DeferredAnimation.DeferredAnimationData animate = deferredAnimation != null ? deferredAnimation.animate(new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FiniteAnimationSpec finiteAnimationSpec;
                FiniteAnimationSpec finiteAnimationSpec2;
                int i4 = i2;
                EnterTransitionImpl enterTransitionImpl2 = enterTransitionImpl;
                ExitTransitionImpl exitTransitionImpl2 = exitTransitionImpl;
                switch (i4) {
                    case 0:
                        Transition.Segment segment = (Transition.Segment) obj;
                        EnterExitState enterExitState = EnterExitState.PreEnter;
                        EnterExitState enterExitState2 = EnterExitState.Visible;
                        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                            Fade fade = enterTransitionImpl2.data.fade;
                            return (fade == null || (finiteAnimationSpec2 = fade.animationSpec) == null) ? EnterExitTransitionKt.DefaultAlphaAndScaleSpring : finiteAnimationSpec2;
                        }
                        if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                            return EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                        }
                        Fade fade2 = exitTransitionImpl2.data.fade;
                        return (fade2 == null || (finiteAnimationSpec = fade2.animationSpec) == null) ? EnterExitTransitionKt.DefaultAlphaAndScaleSpring : finiteAnimationSpec;
                    default:
                        int ordinal = ((EnterExitState) obj).ordinal();
                        float f = 1.0f;
                        if (ordinal == 0) {
                            Fade fade3 = enterTransitionImpl2.data.fade;
                            if (fade3 != null) {
                                f = fade3.alpha;
                            }
                        } else if (ordinal != 1) {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Fade fade4 = exitTransitionImpl2.data.fade;
                            if (fade4 != null) {
                                f = fade4.alpha;
                            }
                        }
                        return Float.valueOf(f);
                }
            }
        }, new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FiniteAnimationSpec finiteAnimationSpec;
                FiniteAnimationSpec finiteAnimationSpec2;
                int i4 = i3;
                EnterTransitionImpl enterTransitionImpl2 = enterTransitionImpl;
                ExitTransitionImpl exitTransitionImpl2 = exitTransitionImpl;
                switch (i4) {
                    case 0:
                        Transition.Segment segment = (Transition.Segment) obj;
                        EnterExitState enterExitState = EnterExitState.PreEnter;
                        EnterExitState enterExitState2 = EnterExitState.Visible;
                        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                            Fade fade = enterTransitionImpl2.data.fade;
                            return (fade == null || (finiteAnimationSpec2 = fade.animationSpec) == null) ? EnterExitTransitionKt.DefaultAlphaAndScaleSpring : finiteAnimationSpec2;
                        }
                        if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                            return EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                        }
                        Fade fade2 = exitTransitionImpl2.data.fade;
                        return (fade2 == null || (finiteAnimationSpec = fade2.animationSpec) == null) ? EnterExitTransitionKt.DefaultAlphaAndScaleSpring : finiteAnimationSpec;
                    default:
                        int ordinal = ((EnterExitState) obj).ordinal();
                        float f = 1.0f;
                        if (ordinal == 0) {
                            Fade fade3 = enterTransitionImpl2.data.fade;
                            if (fade3 != null) {
                                f = fade3.alpha;
                            }
                        } else if (ordinal != 1) {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Fade fade4 = exitTransitionImpl2.data.fade;
                            if (fade4 != null) {
                                f = fade4.alpha;
                            }
                        }
                        return Float.valueOf(f);
                }
            }
        }) : null;
        Transition.DeferredAnimation.DeferredAnimationData animate2 = deferredAnimation2 != null ? deferredAnimation2.animate(new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FiniteAnimationSpec finiteAnimationSpec;
                FiniteAnimationSpec finiteAnimationSpec2;
                int i4 = i2;
                EnterTransitionImpl enterTransitionImpl2 = enterTransitionImpl;
                ExitTransitionImpl exitTransitionImpl2 = exitTransitionImpl;
                switch (i4) {
                    case 0:
                        Transition.Segment segment = (Transition.Segment) obj;
                        EnterExitState enterExitState = EnterExitState.PreEnter;
                        EnterExitState enterExitState2 = EnterExitState.Visible;
                        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                            Scale scale = enterTransitionImpl2.data.scale;
                            return (scale == null || (finiteAnimationSpec2 = scale.animationSpec) == null) ? EnterExitTransitionKt.DefaultAlphaAndScaleSpring : finiteAnimationSpec2;
                        }
                        if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                            return EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                        }
                        Scale scale2 = exitTransitionImpl2.data.scale;
                        return (scale2 == null || (finiteAnimationSpec = scale2.animationSpec) == null) ? EnterExitTransitionKt.DefaultAlphaAndScaleSpring : finiteAnimationSpec;
                    default:
                        int ordinal = ((EnterExitState) obj).ordinal();
                        float f = 1.0f;
                        if (ordinal == 0) {
                            Scale scale3 = enterTransitionImpl2.data.scale;
                            if (scale3 != null) {
                                f = scale3.scale;
                            }
                        } else if (ordinal != 1) {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Scale scale4 = exitTransitionImpl2.data.scale;
                            if (scale4 != null) {
                                f = scale4.scale;
                            }
                        }
                        return Float.valueOf(f);
                }
            }
        }, new Function1() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FiniteAnimationSpec finiteAnimationSpec;
                FiniteAnimationSpec finiteAnimationSpec2;
                int i4 = i3;
                EnterTransitionImpl enterTransitionImpl2 = enterTransitionImpl;
                ExitTransitionImpl exitTransitionImpl2 = exitTransitionImpl;
                switch (i4) {
                    case 0:
                        Transition.Segment segment = (Transition.Segment) obj;
                        EnterExitState enterExitState = EnterExitState.PreEnter;
                        EnterExitState enterExitState2 = EnterExitState.Visible;
                        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                            Scale scale = enterTransitionImpl2.data.scale;
                            return (scale == null || (finiteAnimationSpec2 = scale.animationSpec) == null) ? EnterExitTransitionKt.DefaultAlphaAndScaleSpring : finiteAnimationSpec2;
                        }
                        if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                            return EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                        }
                        Scale scale2 = exitTransitionImpl2.data.scale;
                        return (scale2 == null || (finiteAnimationSpec = scale2.animationSpec) == null) ? EnterExitTransitionKt.DefaultAlphaAndScaleSpring : finiteAnimationSpec;
                    default:
                        int ordinal = ((EnterExitState) obj).ordinal();
                        float f = 1.0f;
                        if (ordinal == 0) {
                            Scale scale3 = enterTransitionImpl2.data.scale;
                            if (scale3 != null) {
                                f = scale3.scale;
                            }
                        } else if (ordinal != 1) {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Scale scale4 = exitTransitionImpl2.data.scale;
                            if (scale4 != null) {
                                f = scale4.scale;
                            }
                        }
                        return Float.valueOf(f);
                }
            }
        }) : null;
        if (transition.transitionState.getCurrentState() == EnterExitState.PreEnter) {
            Scale scale = enterTransitionImpl.data.scale;
            if (scale != null) {
                transformOrigin = new TransformOrigin(scale.transformOrigin);
            } else {
                Scale scale2 = exitTransitionImpl.data.scale;
                if (scale2 != null) {
                    transformOrigin = new TransformOrigin(scale2.transformOrigin);
                }
                transformOrigin = null;
            }
        } else {
            Scale scale3 = exitTransitionImpl.data.scale;
            if (scale3 != null) {
                transformOrigin = new TransformOrigin(scale3.transformOrigin);
            } else {
                Scale scale4 = enterTransitionImpl.data.scale;
                if (scale4 != null) {
                    transformOrigin = new TransformOrigin(scale4.transformOrigin);
                }
                transformOrigin = null;
            }
        }
        final FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1 = new FocusOwnerImpl$focusSearch$1(i, animate, animate2, deferredAnimation3 != null ? deferredAnimation3.animate(CrossfadeKt$Crossfade$3$1.INSTANCE$10, new BoundsAnimation$animate$2(i3, transformOrigin, enterTransitionImpl, exitTransitionImpl)) : null);
        final Placeable mo833measureBRTryo03 = measurable.mo833measureBRTryo0(j);
        long j3 = (mo833measureBRTryo03.height & BodyPartID.bodyIdMax) | (mo833measureBRTryo03.width << 32);
        final long j4 = AnimatedContentKt.m137isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : j3;
        Transition.DeferredAnimation deferredAnimation4 = this.sizeAnimation;
        Transition.DeferredAnimation.DeferredAnimationData animate3 = deferredAnimation4 != null ? deferredAnimation4.animate(this.sizeTransitionSpec, new Function1(this) { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            public final /* synthetic */ EnterExitTransitionModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int ordinal;
                int i4 = i2;
                long j5 = 0;
                long j6 = j4;
                EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.this$0;
                switch (i4) {
                    case 0:
                        int ordinal2 = ((EnterExitState) obj).ordinal();
                        if (ordinal2 == 0) {
                            ChangeSize changeSize = enterExitTransitionModifierNode.enter.data.changeSize;
                            if (changeSize != null) {
                                j6 = ((IntSize) changeSize.size.invoke(new IntSize(j6))).packedValue;
                            }
                        } else if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ChangeSize changeSize2 = enterExitTransitionModifierNode.exit.data.changeSize;
                            if (changeSize2 != null) {
                                j6 = ((IntSize) changeSize2.size.invoke(new IntSize(j6))).packedValue;
                            }
                        }
                        return new IntSize(j6);
                    case 1:
                        EnterExitState enterExitState = (EnterExitState) obj;
                        if (enterExitTransitionModifierNode.currentAlignment != null && enterExitTransitionModifierNode.getAlignment() != null && !Intrinsics.areEqual(enterExitTransitionModifierNode.currentAlignment, enterExitTransitionModifierNode.getAlignment()) && (ordinal = enterExitState.ordinal()) != 0 && ordinal != 1) {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ChangeSize changeSize3 = enterExitTransitionModifierNode.exit.data.changeSize;
                            if (changeSize3 != null) {
                                Function1 function1 = changeSize3.size;
                                long j7 = j4;
                                long j8 = ((IntSize) function1.invoke(new IntSize(j7))).packedValue;
                                Alignment alignment2 = enterExitTransitionModifierNode.getAlignment();
                                alignment2.getClass();
                                LayoutDirection layoutDirection = LayoutDirection.Ltr;
                                long mo584alignKFBX0sM = ((BiasAlignment) alignment2).mo584alignKFBX0sM(j7, j8, layoutDirection);
                                Alignment alignment3 = enterExitTransitionModifierNode.currentAlignment;
                                alignment3.getClass();
                                j5 = IntOffset.m1048minusqkQi6aY(mo584alignKFBX0sM, alignment3.mo584alignKFBX0sM(j7, j8, layoutDirection));
                            }
                        }
                        return new IntOffset(j5);
                    default:
                        EnterExitState enterExitState2 = (EnterExitState) obj;
                        Slide slide = enterExitTransitionModifierNode.enter.data.slide;
                        long j9 = slide != null ? ((IntOffset) slide.slideOffset.invoke(new IntSize(j6))).packedValue : 0L;
                        Slide slide2 = enterExitTransitionModifierNode.exit.data.slide;
                        long j10 = slide2 != null ? ((IntOffset) slide2.slideOffset.invoke(new IntSize(j6))).packedValue : 0L;
                        int ordinal3 = enterExitState2.ordinal();
                        if (ordinal3 == 0) {
                            j5 = j9;
                        } else if (ordinal3 != 1) {
                            if (ordinal3 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            j5 = j10;
                        }
                        return new IntOffset(j5);
                }
            }
        }) : null;
        if (animate3 != null) {
            j3 = ((IntSize) animate3.getValue()).packedValue;
        }
        long m1030constrain4WqzIAM = ConstraintsKt.m1030constrain4WqzIAM(j, j3);
        Transition.DeferredAnimation deferredAnimation5 = this.offsetAnimation;
        long j5 = deferredAnimation5 != null ? ((IntOffset) deferredAnimation5.animate(CrossfadeKt$Crossfade$3$1.INSTANCE$16, new Function1(this) { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            public final /* synthetic */ EnterExitTransitionModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int ordinal;
                int i4 = i3;
                long j52 = 0;
                long j6 = j4;
                EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.this$0;
                switch (i4) {
                    case 0:
                        int ordinal2 = ((EnterExitState) obj).ordinal();
                        if (ordinal2 == 0) {
                            ChangeSize changeSize = enterExitTransitionModifierNode.enter.data.changeSize;
                            if (changeSize != null) {
                                j6 = ((IntSize) changeSize.size.invoke(new IntSize(j6))).packedValue;
                            }
                        } else if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ChangeSize changeSize2 = enterExitTransitionModifierNode.exit.data.changeSize;
                            if (changeSize2 != null) {
                                j6 = ((IntSize) changeSize2.size.invoke(new IntSize(j6))).packedValue;
                            }
                        }
                        return new IntSize(j6);
                    case 1:
                        EnterExitState enterExitState = (EnterExitState) obj;
                        if (enterExitTransitionModifierNode.currentAlignment != null && enterExitTransitionModifierNode.getAlignment() != null && !Intrinsics.areEqual(enterExitTransitionModifierNode.currentAlignment, enterExitTransitionModifierNode.getAlignment()) && (ordinal = enterExitState.ordinal()) != 0 && ordinal != 1) {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ChangeSize changeSize3 = enterExitTransitionModifierNode.exit.data.changeSize;
                            if (changeSize3 != null) {
                                Function1 function1 = changeSize3.size;
                                long j7 = j4;
                                long j8 = ((IntSize) function1.invoke(new IntSize(j7))).packedValue;
                                Alignment alignment2 = enterExitTransitionModifierNode.getAlignment();
                                alignment2.getClass();
                                LayoutDirection layoutDirection = LayoutDirection.Ltr;
                                long mo584alignKFBX0sM = ((BiasAlignment) alignment2).mo584alignKFBX0sM(j7, j8, layoutDirection);
                                Alignment alignment3 = enterExitTransitionModifierNode.currentAlignment;
                                alignment3.getClass();
                                j52 = IntOffset.m1048minusqkQi6aY(mo584alignKFBX0sM, alignment3.mo584alignKFBX0sM(j7, j8, layoutDirection));
                            }
                        }
                        return new IntOffset(j52);
                    default:
                        EnterExitState enterExitState2 = (EnterExitState) obj;
                        Slide slide = enterExitTransitionModifierNode.enter.data.slide;
                        long j9 = slide != null ? ((IntOffset) slide.slideOffset.invoke(new IntSize(j6))).packedValue : 0L;
                        Slide slide2 = enterExitTransitionModifierNode.exit.data.slide;
                        long j10 = slide2 != null ? ((IntOffset) slide2.slideOffset.invoke(new IntSize(j6))).packedValue : 0L;
                        int ordinal3 = enterExitState2.ordinal();
                        if (ordinal3 == 0) {
                            j52 = j9;
                        } else if (ordinal3 != 1) {
                            if (ordinal3 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            j52 = j10;
                        }
                        return new IntOffset(j52);
                }
            }
        }).getValue()).packedValue : 0L;
        Transition.DeferredAnimation deferredAnimation6 = this.slideAnimation;
        long j6 = deferredAnimation6 != null ? ((IntOffset) deferredAnimation6.animate(this.slideSpec, new Function1(this) { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            public final /* synthetic */ EnterExitTransitionModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int ordinal;
                int i4 = i;
                long j52 = 0;
                long j62 = j4;
                EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.this$0;
                switch (i4) {
                    case 0:
                        int ordinal2 = ((EnterExitState) obj).ordinal();
                        if (ordinal2 == 0) {
                            ChangeSize changeSize = enterExitTransitionModifierNode.enter.data.changeSize;
                            if (changeSize != null) {
                                j62 = ((IntSize) changeSize.size.invoke(new IntSize(j62))).packedValue;
                            }
                        } else if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ChangeSize changeSize2 = enterExitTransitionModifierNode.exit.data.changeSize;
                            if (changeSize2 != null) {
                                j62 = ((IntSize) changeSize2.size.invoke(new IntSize(j62))).packedValue;
                            }
                        }
                        return new IntSize(j62);
                    case 1:
                        EnterExitState enterExitState = (EnterExitState) obj;
                        if (enterExitTransitionModifierNode.currentAlignment != null && enterExitTransitionModifierNode.getAlignment() != null && !Intrinsics.areEqual(enterExitTransitionModifierNode.currentAlignment, enterExitTransitionModifierNode.getAlignment()) && (ordinal = enterExitState.ordinal()) != 0 && ordinal != 1) {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ChangeSize changeSize3 = enterExitTransitionModifierNode.exit.data.changeSize;
                            if (changeSize3 != null) {
                                Function1 function1 = changeSize3.size;
                                long j7 = j4;
                                long j8 = ((IntSize) function1.invoke(new IntSize(j7))).packedValue;
                                Alignment alignment2 = enterExitTransitionModifierNode.getAlignment();
                                alignment2.getClass();
                                LayoutDirection layoutDirection = LayoutDirection.Ltr;
                                long mo584alignKFBX0sM = ((BiasAlignment) alignment2).mo584alignKFBX0sM(j7, j8, layoutDirection);
                                Alignment alignment3 = enterExitTransitionModifierNode.currentAlignment;
                                alignment3.getClass();
                                j52 = IntOffset.m1048minusqkQi6aY(mo584alignKFBX0sM, alignment3.mo584alignKFBX0sM(j7, j8, layoutDirection));
                            }
                        }
                        return new IntOffset(j52);
                    default:
                        EnterExitState enterExitState2 = (EnterExitState) obj;
                        Slide slide = enterExitTransitionModifierNode.enter.data.slide;
                        long j9 = slide != null ? ((IntOffset) slide.slideOffset.invoke(new IntSize(j62))).packedValue : 0L;
                        Slide slide2 = enterExitTransitionModifierNode.exit.data.slide;
                        long j10 = slide2 != null ? ((IntOffset) slide2.slideOffset.invoke(new IntSize(j62))).packedValue : 0L;
                        int ordinal3 = enterExitState2.ordinal();
                        if (ordinal3 == 0) {
                            j52 = j9;
                        } else if (ordinal3 != 1) {
                            if (ordinal3 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            j52 = j10;
                        }
                        return new IntOffset(j52);
                }
            }
        }).getValue()).packedValue : 0L;
        Alignment alignment2 = this.currentAlignment;
        final long m1049plusqkQi6aY = IntOffset.m1049plusqkQi6aY(alignment2 != null ? alignment2.mo584alignKFBX0sM(j4, m1030constrain4WqzIAM, LayoutDirection.Ltr) : 0L, j6);
        final long j7 = j5;
        return MeasureScope.layout$default(measureScope, (int) (m1030constrain4WqzIAM >> 32), (int) (m1030constrain4WqzIAM & BodyPartID.bodyIdMax), new Function1() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long j8 = m1049plusqkQi6aY;
                long j9 = j7;
                ((Placeable.PlacementScope) obj).placeWithLayer(Placeable.this, ((int) (j8 >> 32)) + ((int) (j9 >> 32)), ((int) (j8 & BodyPartID.bodyIdMax)) + ((int) (j9 & BodyPartID.bodyIdMax)), RecyclerView.DECELERATION_RATE, focusOwnerImpl$focusSearch$1);
                return Unit.INSTANCE;
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        this.lookaheadSize = -9223372034707292160L;
    }
}
