package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.FabBaselineTokens;
import androidx.compose.material3.tokens.FabMediumTokens;
import androidx.compose.material3.tokens.FloatingToolbarTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;

/* compiled from: FloatingToolbar.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002opB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001c\"\u0004\b\u0000\u0010\u001dH\u0007¢\u0006\u0002\u0010\u001eJA\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0)H\u0007¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0007¢\u0006\u0002\u00100J\u0015\u00101\u001a\u00020-2\u0006\u0010.\u001a\u000202H\u0007¢\u0006\u0002\u00103J\u0015\u00104\u001a\u0002052\u0006\u00106\u001a\u00020/H\u0007¢\u0006\u0002\u00107J\u0015\u00108\u001a\u0002052\u0006\u00106\u001a\u000202H\u0007¢\u0006\u0002\u00109J\r\u0010:\u001a\u00020;H\u0007¢\u0006\u0002\u0010<J\r\u0010=\u001a\u00020;H\u0007¢\u0006\u0002\u0010<J7\u0010:\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\b\b\u0002\u0010B\u001a\u00020?H\u0007¢\u0006\u0004\bC\u0010DJ7\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\b\b\u0002\u0010B\u001a\u00020?H\u0007¢\u0006\u0004\bE\u0010DJd\u0010F\u001a\u00020G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0I2\b\b\u0002\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020\u00122\b\b\u0002\u0010M\u001a\u00020?2\b\b\u0002\u0010N\u001a\u00020?2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P2\u0011\u0010Q\u001a\r\u0012\u0004\u0012\u00020G0I¢\u0006\u0002\bRH\u0007¢\u0006\u0004\bS\u0010TJd\u0010U\u001a\u00020G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0I2\b\b\u0002\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020\u00122\b\b\u0002\u0010M\u001a\u00020?2\b\b\u0002\u0010N\u001a\u00020?2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P2\u0011\u0010Q\u001a\r\u0012\u0004\u0012\u00020G0I¢\u0006\u0002\bRH\u0007¢\u0006\u0004\bV\u0010TJS\u0010W\u001a\u00020K*\u00020K2\u0006\u0010X\u001a\u00020Y2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020G0I2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020G0I2\b\b\u0002\u0010\\\u001a\u00020\u00052\b\b\u0002\u0010]\u001a\u00020\u00052\b\b\u0002\u0010^\u001a\u00020Y¢\u0006\u0004\b_\u0010`R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001a\u0010\u0007R\u0018\u0010a\u001a\u00020;*\u00020b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0018\u0010e\u001a\u00020;*\u00020b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010dR\u0013\u0010g\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\bh\u0010\u0007R\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00050jX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\bn\u0010\u0007¨\u0006q"}, d2 = {"Landroidx/compose/material3/FloatingToolbarDefaults;", "", "<init>", "()V", "ContainerSize", "Landroidx/compose/ui/unit/Dp;", "getContainerSize-D9Ej5fM", "()F", "F", "ContainerExpandedElevation", "getContainerExpandedElevation-D9Ej5fM", "ContainerCollapsedElevation", "getContainerCollapsedElevation-D9Ej5fM", "ContainerExpandedElevationWithFab", "getContainerExpandedElevationWithFab-D9Ej5fM", "ContainerCollapsedElevationWithFab", "getContainerCollapsedElevationWithFab-D9Ej5fM", "ContainerShape", "Landroidx/compose/ui/graphics/Shape;", "getContainerShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ScreenOffset", "getScreenOffset-D9Ej5fM", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "T", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/FiniteAnimationSpec;", "exitAlwaysScrollBehavior", "Landroidx/compose/material3/FloatingToolbarScrollBehavior;", "exitDirection", "Landroidx/compose/material3/FloatingToolbarExitDirection;", "state", "Landroidx/compose/material3/FloatingToolbarState;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "exitAlwaysScrollBehavior-YyGo6vs", "(ILandroidx/compose/material3/FloatingToolbarState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingToolbarScrollBehavior;", "horizontalEnterTransition", "Landroidx/compose/animation/EnterTransition;", "expandFrom", "Landroidx/compose/ui/Alignment$Horizontal;", "(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "verticalEnterTransition", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "horizontalExitTransition", "Landroidx/compose/animation/ExitTransition;", "shrinkTowards", "(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/ExitTransition;", "verticalExitTransition", "(Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/ExitTransition;", "standardFloatingToolbarColors", "Landroidx/compose/material3/FloatingToolbarColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/FloatingToolbarColors;", "vibrantFloatingToolbarColors", "toolbarContainerColor", "Landroidx/compose/ui/graphics/Color;", "toolbarContentColor", "fabContainerColor", "fabContentColor", "standardFloatingToolbarColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingToolbarColors;", "vibrantFloatingToolbarColors-ro_MJ88", "VibrantFloatingActionButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "containerColor", "contentColor", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "VibrantFloatingActionButton-vRFhKjU", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "StandardFloatingActionButton", "StandardFloatingActionButton-vRFhKjU", "floatingToolbarVerticalNestedScroll", "expanded", "", "onExpand", "onCollapse", "expandScrollDistanceThreshold", "collapseScrollDistanceThreshold", "reverseLayout", "floatingToolbarVerticalNestedScroll-gKdo67w", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;FFZ)Landroidx/compose/ui/Modifier;", "defaultFloatingToolbarStandardColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultFloatingToolbarStandardColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/FloatingToolbarColors;", "defaultFloatingToolbarVibrantColors", "getDefaultFloatingToolbarVibrantColors$material3", "ScrollDistanceThreshold", "getScrollDistanceThreshold-D9Ej5fM", "FabSizeRange", "Lkotlin/ranges/ClosedRange;", "getFabSizeRange$material3", "()Lkotlin/ranges/ClosedRange;", "ToolbarToFabGap", "getToolbarToFabGap-D9Ej5fM$material3", "VerticalNestedScrollExpansionElement", "VerticalNestedScrollExpansionNode", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class FloatingToolbarDefaults {
    public static final int $stable = 0;
    public static final FloatingToolbarDefaults INSTANCE = new FloatingToolbarDefaults();
    private static final float ContainerSize = FloatingToolbarTokens.INSTANCE.m5289getContainerHeightD9Ej5fM();
    private static final float ContainerExpandedElevation = ElevationTokens.INSTANCE.m5175getLevel0D9Ej5fM();
    private static final float ContainerCollapsedElevation = ElevationTokens.INSTANCE.m5175getLevel0D9Ej5fM();
    private static final float ContainerExpandedElevationWithFab = ElevationTokens.INSTANCE.m5176getLevel1D9Ej5fM();
    private static final float ContainerCollapsedElevationWithFab = ElevationTokens.INSTANCE.m5175getLevel0D9Ej5fM();
    private static final PaddingValues ContentPadding = PaddingKt.m1197PaddingValuesa9UjIt4(FloatingToolbarTokens.INSTANCE.m5290getContainerLeadingSpaceD9Ej5fM(), FloatingToolbarTokens.INSTANCE.m5290getContainerLeadingSpaceD9Ej5fM(), FloatingToolbarTokens.INSTANCE.m5291getContainerTrailingSpaceD9Ej5fM(), FloatingToolbarTokens.INSTANCE.m5291getContainerTrailingSpaceD9Ej5fM());
    private static final float ScreenOffset = FloatingToolbarTokens.INSTANCE.m5288getContainerExternalPaddingD9Ej5fM();
    private static final float ScrollDistanceThreshold = Dp.m9732constructorimpl(40);
    private static final ClosedRange<Dp> FabSizeRange = RangesKt.rangeTo(Dp.m9730boximpl(FabBaselineTokens.INSTANCE.m5207getContainerWidthD9Ej5fM()), Dp.m9730boximpl(FabMediumTokens.INSTANCE.m5213getContainerWidthD9Ej5fM()));
    private static final float ToolbarToFabGap = Dp.m9732constructorimpl(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StandardFloatingActionButton_vRFhKjU$lambda$0(FloatingToolbarDefaults floatingToolbarDefaults, Function0 function0, Modifier modifier, Shape shape, long j, long j2, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        floatingToolbarDefaults.m3195StandardFloatingActionButtonvRFhKjU(function0, modifier, shape, j, j2, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VibrantFloatingActionButton_vRFhKjU$lambda$0(FloatingToolbarDefaults floatingToolbarDefaults, Function0 function0, Modifier modifier, Shape shape, long j, long j2, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        floatingToolbarDefaults.m3196VibrantFloatingActionButtonvRFhKjU(function0, modifier, shape, j, j2, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private FloatingToolbarDefaults() {
    }

    /* renamed from: getContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m3203getContainerSizeD9Ej5fM() {
        return ContainerSize;
    }

    /* renamed from: getContainerExpandedElevation-D9Ej5fM, reason: not valid java name */
    public final float m3201getContainerExpandedElevationD9Ej5fM() {
        return ContainerExpandedElevation;
    }

    /* renamed from: getContainerCollapsedElevation-D9Ej5fM, reason: not valid java name */
    public final float m3199getContainerCollapsedElevationD9Ej5fM() {
        return ContainerCollapsedElevation;
    }

    /* renamed from: getContainerExpandedElevationWithFab-D9Ej5fM, reason: not valid java name */
    public final float m3202getContainerExpandedElevationWithFabD9Ej5fM() {
        return ContainerExpandedElevationWithFab;
    }

    /* renamed from: getContainerCollapsedElevationWithFab-D9Ej5fM, reason: not valid java name */
    public final float m3200getContainerCollapsedElevationWithFabD9Ej5fM() {
        return ContainerCollapsedElevationWithFab;
    }

    public final Shape getContainerShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 177994961, "C(<get-ContainerShape>)769@40080L5:FloatingToolbar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(177994961, i, -1, "androidx.compose.material3.FloatingToolbarDefaults.<get-ContainerShape> (FloatingToolbar.kt:769)");
        }
        Shape value = ShapesKt.getValue(FloatingToolbarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getScreenOffset-D9Ej5fM, reason: not valid java name */
    public final float m3204getScreenOffsetD9Ej5fM() {
        return ScreenOffset;
    }

    public final <T> FiniteAnimationSpec<T> animationSpec(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1357414174, "C(animationSpec)797@41168L7:FloatingToolbar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1357414174, i, -1, "androidx.compose.material3.FloatingToolbarDefaults.animationSpec (FloatingToolbar.kt:795)");
        }
        FiniteAnimationSpec<T> value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* renamed from: exitAlwaysScrollBehavior-YyGo6vs, reason: not valid java name */
    public final FloatingToolbarScrollBehavior m3197exitAlwaysScrollBehaviorYyGo6vs(int i, FloatingToolbarState floatingToolbarState, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 735238945, "C(exitAlwaysScrollBehavior)N(exitDirection:c#material3.FloatingToolbarExitDirection,state,snapAnimationSpec,flingAnimationSpec)825@42731L30,826@42850L7,827@42915L26,829@42990L338:FloatingToolbar.kt#uh7d8r");
        FloatingToolbarState rememberFloatingToolbarState = (i3 & 2) != 0 ? FloatingToolbarKt.rememberFloatingToolbarState(0.0f, 0.0f, 0.0f, composer, 0, 7) : floatingToolbarState;
        AnimationSpec<Float> value = (i3 & 4) != 0 ? MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6) : animationSpec;
        DecayAnimationSpec<Float> rememberSplineBasedDecay = (i3 & 8) != 0 ? SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(735238945, i2, -1, "androidx.compose.material3.FloatingToolbarDefaults.exitAlwaysScrollBehavior (FloatingToolbar.kt:829)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -2104965197, "CC(remember):FloatingToolbar.kt#9igjgp");
        boolean changed = ((((i2 & 14) ^ 6) > 4 && composer.changed(i)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(rememberFloatingToolbarState)) || (i2 & 48) == 32) | composer.changed(value) | composer.changed(rememberSplineBasedDecay);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            ExitAlwaysFloatingToolbarScrollBehavior exitAlwaysFloatingToolbarScrollBehavior = new ExitAlwaysFloatingToolbarScrollBehavior(i, rememberFloatingToolbarState, value, rememberSplineBasedDecay, null);
            composer.updateRememberedValue(exitAlwaysFloatingToolbarScrollBehavior);
            rememberedValue = exitAlwaysFloatingToolbarScrollBehavior;
        }
        ExitAlwaysFloatingToolbarScrollBehavior exitAlwaysFloatingToolbarScrollBehavior2 = (ExitAlwaysFloatingToolbarScrollBehavior) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return exitAlwaysFloatingToolbarScrollBehavior2;
    }

    public final EnterTransition horizontalEnterTransition(Alignment.Horizontal horizontal, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 206634759, "C(horizontalEnterTransition)N(expandFrom)841@43547L15:FloatingToolbar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(206634759, i, -1, "androidx.compose.material3.FloatingToolbarDefaults.horizontalEnterTransition (FloatingToolbar.kt:841)");
        }
        EnterTransition expandHorizontally$default = EnterExitTransitionKt.expandHorizontally$default(animationSpec(composer, (i >> 3) & 14), horizontal, false, null, 12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return expandHorizontally$default;
    }

    public final EnterTransition verticalEnterTransition(Alignment.Vertical vertical, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -319808989, "C(verticalEnterTransition)N(expandFrom)846@43799L15:FloatingToolbar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-319808989, i, -1, "androidx.compose.material3.FloatingToolbarDefaults.verticalEnterTransition (FloatingToolbar.kt:846)");
        }
        EnterTransition expandVertically$default = EnterExitTransitionKt.expandVertically$default(animationSpec(composer, (i >> 3) & 14), vertical, false, null, 12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return expandVertically$default;
    }

    public final ExitTransition horizontalExitTransition(Alignment.Horizontal horizontal, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1906978713, "C(horizontalExitTransition)N(shrinkTowards)851@44060L15:FloatingToolbar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1906978713, i, -1, "androidx.compose.material3.FloatingToolbarDefaults.horizontalExitTransition (FloatingToolbar.kt:851)");
        }
        ExitTransition shrinkHorizontally$default = EnterExitTransitionKt.shrinkHorizontally$default(animationSpec(composer, (i >> 3) & 14), horizontal, false, null, 12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return shrinkHorizontally$default;
    }

    public final ExitTransition verticalExitTransition(Alignment.Vertical vertical, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1329237351, "C(verticalExitTransition)N(shrinkTowards)856@44319L15:FloatingToolbar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1329237351, i, -1, "androidx.compose.material3.FloatingToolbarDefaults.verticalExitTransition (FloatingToolbar.kt:856)");
        }
        ExitTransition shrinkVertically$default = EnterExitTransitionKt.shrinkVertically$default(animationSpec(composer, (i >> 3) & 14), vertical, false, null, 12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return shrinkVertically$default;
    }

    public final FloatingToolbarColors standardFloatingToolbarColors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1804011246, "C(standardFloatingToolbarColors)864@44618L11:FloatingToolbar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1804011246, i, -1, "androidx.compose.material3.FloatingToolbarDefaults.standardFloatingToolbarColors (FloatingToolbar.kt:864)");
        }
        FloatingToolbarColors defaultFloatingToolbarStandardColors$material3 = getDefaultFloatingToolbarStandardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultFloatingToolbarStandardColors$material3;
    }

    public final FloatingToolbarColors vibrantFloatingToolbarColors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1253239623, "C(vibrantFloatingToolbarColors)872@44916L11:FloatingToolbar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1253239623, i, -1, "androidx.compose.material3.FloatingToolbarDefaults.vibrantFloatingToolbarColors (FloatingToolbar.kt:872)");
        }
        FloatingToolbarColors defaultFloatingToolbarVibrantColors$material3 = getDefaultFloatingToolbarVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultFloatingToolbarVibrantColors$material3;
    }

    /* renamed from: standardFloatingToolbarColors-ro_MJ88, reason: not valid java name */
    public final FloatingToolbarColors m3207standardFloatingToolbarColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1582276582, "C(standardFloatingToolbarColors)N(toolbarContainerColor:c#ui.graphics.Color,toolbarContentColor:c#ui.graphics.Color,fabContainerColor:c#ui.graphics.Color,fabContentColor:c#ui.graphics.Color)890@45787L11:FloatingToolbar.kt#uh7d8r");
        long m6822getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j;
        long m6822getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j2;
        long m6822getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j3;
        long m6822getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1582276582, i, -1, "androidx.compose.material3.FloatingToolbarDefaults.standardFloatingToolbarColors (FloatingToolbar.kt:890)");
        }
        FloatingToolbarColors m3188copyjRlVdoo = getDefaultFloatingToolbarStandardColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m3188copyjRlVdoo(m6822getUnspecified0d7_KjU, m6822getUnspecified0d7_KjU2, m6822getUnspecified0d7_KjU3, m6822getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m3188copyjRlVdoo;
    }

    /* renamed from: vibrantFloatingToolbarColors-ro_MJ88, reason: not valid java name */
    public final FloatingToolbarColors m3208vibrantFloatingToolbarColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1566048785, "C(vibrantFloatingToolbarColors)N(toolbarContainerColor:c#ui.graphics.Color,toolbarContentColor:c#ui.graphics.Color,fabContainerColor:c#ui.graphics.Color,fabContentColor:c#ui.graphics.Color)913@46885L11:FloatingToolbar.kt#uh7d8r");
        long m6822getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j;
        long m6822getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j2;
        long m6822getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j3;
        long m6822getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1566048785, i, -1, "androidx.compose.material3.FloatingToolbarDefaults.vibrantFloatingToolbarColors (FloatingToolbar.kt:913)");
        }
        FloatingToolbarColors m3188copyjRlVdoo = getDefaultFloatingToolbarVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m3188copyjRlVdoo(m6822getUnspecified0d7_KjU, m6822getUnspecified0d7_KjU2, m6822getUnspecified0d7_KjU3, m6822getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m3188copyjRlVdoo;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: VibrantFloatingActionButton-vRFhKjU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3196VibrantFloatingActionButtonvRFhKjU(final Function0<Unit> function0, Modifier modifier, Shape shape, long j, long j2, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier2;
        final Shape shape3;
        final long j5;
        final MutableInteractionSource mutableInteractionSource3;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        Shape shape4;
        long j7;
        MutableInteractionSource mutableInteractionSource4;
        long j8;
        int i5;
        Shape shape5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-501522609);
        ComposerKt.sourceInformation(startRestartGroup, "C(VibrantFloatingActionButton)N(onClick,modifier,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,interactionSource,content)957@49133L280,950@48851L655:FloatingToolbar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    shape2 = shape;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? 2048 : 1024;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
            } else {
                j4 = j2;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "944@48566L5,945@48605L30,946@48685L30");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        companion = modifier;
                        j7 = j3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        j8 = j4;
                        i5 = i3;
                        shape5 = shape2;
                    } else {
                        companion = i8 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 4) != 0) {
                            shape4 = FloatingActionButtonDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            i3 &= -897;
                        } else {
                            shape4 = shape2;
                        }
                        if ((i2 & 8) != 0) {
                            j3 = vibrantFloatingToolbarColors(startRestartGroup, (i3 >> 21) & 14).getFabContainerColor();
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            j4 = vibrantFloatingToolbarColors(startRestartGroup, (i3 >> 21) & 14).getFabContentColor();
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            i5 = i3;
                            j7 = j3;
                            j8 = j4;
                            i6 = -501522609;
                            mutableInteractionSource4 = null;
                            shape5 = shape4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i6, i5, -1, "androidx.compose.material3.FloatingToolbarDefaults.VibrantFloatingActionButton (FloatingToolbar.kt:950)");
                            }
                            composer2 = startRestartGroup;
                            int i9 = i5 << 3;
                            FloatingActionButtonKt.m3168FloatingActionButtonXz6DiA(function0, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), shape5, j7, j8, FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(ElevationTokens.INSTANCE.m5177getLevel2D9Ej5fM(), ElevationTokens.INSTANCE.m5177getLevel2D9Ej5fM(), ElevationTokens.INSTANCE.m5177getLevel2D9Ej5fM(), ElevationTokens.INSTANCE.m5178getLevel3D9Ej5fM(), startRestartGroup, 28086, 0), mutableInteractionSource4, function2, composer2, (65422 & i5) | (3670016 & i9) | (i9 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            shape3 = shape5;
                            j5 = j7;
                            j6 = j8;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            j7 = j3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            j8 = j4;
                            i5 = i3;
                            shape5 = shape4;
                        }
                    }
                    i6 = -501522609;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    int i92 = i5 << 3;
                    FloatingActionButtonKt.m3168FloatingActionButtonXz6DiA(function0, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), shape5, j7, j8, FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(ElevationTokens.INSTANCE.m5177getLevel2D9Ej5fM(), ElevationTokens.INSTANCE.m5177getLevel2D9Ej5fM(), ElevationTokens.INSTANCE.m5177getLevel2D9Ej5fM(), ElevationTokens.INSTANCE.m5178getLevel3D9Ej5fM(), startRestartGroup, 28086, 0), mutableInteractionSource4, function2, composer2, (65422 & i5) | (3670016 & i92) | (i92 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    shape3 = shape5;
                    j5 = j7;
                    j6 = j8;
                    mutableInteractionSource3 = mutableInteractionSource4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    shape3 = shape2;
                    j5 = j3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j6 = j4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingToolbarDefaults$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit VibrantFloatingActionButton_vRFhKjU$lambda$0;
                            VibrantFloatingActionButton_vRFhKjU$lambda$0 = FloatingToolbarDefaults.VibrantFloatingActionButton_vRFhKjU$lambda$0(FloatingToolbarDefaults.this, function0, modifier2, shape3, j5, j6, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return VibrantFloatingActionButton_vRFhKjU$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: StandardFloatingActionButton-vRFhKjU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3195StandardFloatingActionButtonvRFhKjU(final Function0<Unit> function0, Modifier modifier, Shape shape, long j, long j2, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier2;
        final Shape shape3;
        final long j5;
        final MutableInteractionSource mutableInteractionSource3;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        Shape shape4;
        long j7;
        MutableInteractionSource mutableInteractionSource4;
        long j8;
        int i5;
        Shape shape5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-556691356);
        ComposerKt.sourceInformation(startRestartGroup, "C(StandardFloatingActionButton)N(onClick,modifier,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,interactionSource,content)1004@51485L280,997@51203L655:FloatingToolbar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    shape2 = shape;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? 2048 : 1024;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
            } else {
                j4 = j2;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "991@50916L5,992@50955L31,993@51036L31");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        companion = modifier;
                        j7 = j3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        j8 = j4;
                        i5 = i3;
                        shape5 = shape2;
                    } else {
                        companion = i8 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 4) != 0) {
                            shape4 = FloatingActionButtonDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            i3 &= -897;
                        } else {
                            shape4 = shape2;
                        }
                        if ((i2 & 8) != 0) {
                            j3 = standardFloatingToolbarColors(startRestartGroup, (i3 >> 21) & 14).getFabContainerColor();
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            j4 = standardFloatingToolbarColors(startRestartGroup, (i3 >> 21) & 14).getFabContentColor();
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            i5 = i3;
                            j7 = j3;
                            j8 = j4;
                            i6 = -556691356;
                            mutableInteractionSource4 = null;
                            shape5 = shape4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i6, i5, -1, "androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton (FloatingToolbar.kt:997)");
                            }
                            composer2 = startRestartGroup;
                            int i9 = i5 << 3;
                            FloatingActionButtonKt.m3168FloatingActionButtonXz6DiA(function0, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), shape5, j7, j8, FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(ElevationTokens.INSTANCE.m5177getLevel2D9Ej5fM(), ElevationTokens.INSTANCE.m5177getLevel2D9Ej5fM(), ElevationTokens.INSTANCE.m5177getLevel2D9Ej5fM(), ElevationTokens.INSTANCE.m5178getLevel3D9Ej5fM(), startRestartGroup, 28086, 0), mutableInteractionSource4, function2, composer2, (65422 & i5) | (3670016 & i9) | (i9 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            shape3 = shape5;
                            j5 = j7;
                            j6 = j8;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            j7 = j3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            j8 = j4;
                            i5 = i3;
                            shape5 = shape4;
                        }
                    }
                    i6 = -556691356;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    int i92 = i5 << 3;
                    FloatingActionButtonKt.m3168FloatingActionButtonXz6DiA(function0, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), shape5, j7, j8, FloatingActionButtonDefaults.INSTANCE.m3148elevationxZ9QkE(ElevationTokens.INSTANCE.m5177getLevel2D9Ej5fM(), ElevationTokens.INSTANCE.m5177getLevel2D9Ej5fM(), ElevationTokens.INSTANCE.m5177getLevel2D9Ej5fM(), ElevationTokens.INSTANCE.m5178getLevel3D9Ej5fM(), startRestartGroup, 28086, 0), mutableInteractionSource4, function2, composer2, (65422 & i5) | (3670016 & i92) | (i92 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    shape3 = shape5;
                    j5 = j7;
                    j6 = j8;
                    mutableInteractionSource3 = mutableInteractionSource4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    shape3 = shape2;
                    j5 = j3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    j6 = j4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingToolbarDefaults$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit StandardFloatingActionButton_vRFhKjU$lambda$0;
                            StandardFloatingActionButton_vRFhKjU$lambda$0 = FloatingToolbarDefaults.StandardFloatingActionButton_vRFhKjU$lambda$0(FloatingToolbarDefaults.this, function0, modifier2, shape3, j5, j6, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return StandardFloatingActionButton_vRFhKjU$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: floatingToolbarVerticalNestedScroll-gKdo67w$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3194floatingToolbarVerticalNestedScrollgKdo67w$default(FloatingToolbarDefaults floatingToolbarDefaults, Modifier modifier, boolean z, Function0 function0, Function0 function02, float f, float f2, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            f = ScrollDistanceThreshold;
        }
        float f3 = f;
        if ((i & 16) != 0) {
            f2 = ScrollDistanceThreshold;
        }
        return floatingToolbarDefaults.m3198floatingToolbarVerticalNestedScrollgKdo67w(modifier, z, function0, function02, f3, f2, (i & 32) != 0 ? false : z2);
    }

    /* renamed from: floatingToolbarVerticalNestedScroll-gKdo67w, reason: not valid java name */
    public final Modifier m3198floatingToolbarVerticalNestedScrollgKdo67w(Modifier modifier, boolean z, Function0<Unit> function0, Function0<Unit> function02, float f, float f2, boolean z2) {
        return modifier.then(new VerticalNestedScrollExpansionElement(z, function0, function02, z2, f, f2, null));
    }

    /* compiled from: FloatingToolbar.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\f\u0010\u001c\u001a\u00020\u0007*\u00020\u001dH\u0016J\u0013\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\n\u001a\u00020\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u00020\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016¨\u0006#"}, d2 = {"Landroidx/compose/material3/FloatingToolbarDefaults$VerticalNestedScrollExpansionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/FloatingToolbarDefaults$VerticalNestedScrollExpansionNode;", "expanded", "", "onExpand", "Lkotlin/Function0;", "", "onCollapse", "reverseLayout", "expandScrollThreshold", "Landroidx/compose/ui/unit/Dp;", "collapseScrollThreshold", "<init>", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getExpanded", "()Z", "getOnExpand", "()Lkotlin/jvm/functions/Function0;", "getOnCollapse", "getReverseLayout", "getExpandScrollThreshold-D9Ej5fM", "()F", "F", "getCollapseScrollThreshold-D9Ej5fM", "create", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "equals", "other", "", "hashCode", "", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final class VerticalNestedScrollExpansionElement extends ModifierNodeElement<VerticalNestedScrollExpansionNode> {
        public static final int $stable = 0;
        private final float collapseScrollThreshold;
        private final float expandScrollThreshold;
        private final boolean expanded;
        private final Function0<Unit> onCollapse;
        private final Function0<Unit> onExpand;
        private final boolean reverseLayout;

        public /* synthetic */ VerticalNestedScrollExpansionElement(boolean z, Function0 function0, Function0 function02, boolean z2, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, function0, function02, z2, f, f2);
        }

        private VerticalNestedScrollExpansionElement(boolean z, Function0<Unit> function0, Function0<Unit> function02, boolean z2, float f, float f2) {
            this.expanded = z;
            this.onExpand = function0;
            this.onCollapse = function02;
            this.reverseLayout = z2;
            this.expandScrollThreshold = f;
            this.collapseScrollThreshold = f2;
        }

        public final boolean getExpanded() {
            return this.expanded;
        }

        public final Function0<Unit> getOnExpand() {
            return this.onExpand;
        }

        public final Function0<Unit> getOnCollapse() {
            return this.onCollapse;
        }

        public final boolean getReverseLayout() {
            return this.reverseLayout;
        }

        /* renamed from: getExpandScrollThreshold-D9Ej5fM, reason: not valid java name and from getter */
        public final float getExpandScrollThreshold() {
            return this.expandScrollThreshold;
        }

        /* renamed from: getCollapseScrollThreshold-D9Ej5fM, reason: not valid java name and from getter */
        public final float getCollapseScrollThreshold() {
            return this.collapseScrollThreshold;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* renamed from: create */
        public VerticalNestedScrollExpansionNode getNode() {
            return new VerticalNestedScrollExpansionNode(this.expanded, this.onExpand, this.onCollapse, this.reverseLayout, this.expandScrollThreshold, this.collapseScrollThreshold, null);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(VerticalNestedScrollExpansionNode node) {
            node.m3215updateNodeKr38dQ(this.expanded, this.onExpand, this.onCollapse, this.reverseLayout, this.expandScrollThreshold, this.collapseScrollThreshold);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("floatingToolbarVerticalNestedScroll");
            inspectorInfo.getProperties().set("expanded", Boolean.valueOf(this.expanded));
            inspectorInfo.getProperties().set("expandScrollThreshold", Dp.m9730boximpl(this.expandScrollThreshold));
            inspectorInfo.getProperties().set("collapseScrollThreshold", Dp.m9730boximpl(this.collapseScrollThreshold));
            inspectorInfo.getProperties().set("reverseLayout", Boolean.valueOf(this.reverseLayout));
            inspectorInfo.getProperties().set("onExpand", this.onExpand);
            inspectorInfo.getProperties().set("onCollapse", this.onCollapse);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerticalNestedScrollExpansionElement)) {
                return false;
            }
            VerticalNestedScrollExpansionElement verticalNestedScrollExpansionElement = (VerticalNestedScrollExpansionElement) other;
            return this.expanded == verticalNestedScrollExpansionElement.expanded && this.reverseLayout == verticalNestedScrollExpansionElement.reverseLayout && this.onExpand == verticalNestedScrollExpansionElement.onExpand && this.onCollapse == verticalNestedScrollExpansionElement.onCollapse && Dp.m9737equalsimpl0(this.expandScrollThreshold, verticalNestedScrollExpansionElement.expandScrollThreshold) && Dp.m9737equalsimpl0(this.collapseScrollThreshold, verticalNestedScrollExpansionElement.collapseScrollThreshold);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return (((((((((UByte$$ExternalSyntheticBackport0.m(this.expanded) * 31) + UByte$$ExternalSyntheticBackport0.m(this.reverseLayout)) * 31) + this.onExpand.hashCode()) * 31) + this.onCollapse.hashCode()) * 31) + Dp.m9738hashCodeimpl(this.expandScrollThreshold)) * 31) + Dp.m9738hashCodeimpl(this.collapseScrollThreshold);
        }
    }

    /* compiled from: FloatingToolbar.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BC\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010.\u001a\u00020\bH\u0016J'\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106JI\u00107\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b8\u00109J\b\u0010:\u001a\u00020\bH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001c\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0011R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Landroidx/compose/material3/FloatingToolbarDefaults$VerticalNestedScrollExpansionNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "expanded", "", "onExpand", "Lkotlin/Function0;", "", "onCollapse", "reverseLayout", "expandScrollThreshold", "Landroidx/compose/ui/unit/Dp;", "collapseScrollThreshold", "<init>", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getExpanded", "()Z", "setExpanded", "(Z)V", "getOnExpand", "()Lkotlin/jvm/functions/Function0;", "setOnExpand", "(Lkotlin/jvm/functions/Function0;)V", "getOnCollapse", "setOnCollapse", "getReverseLayout", "setReverseLayout", "getExpandScrollThreshold-D9Ej5fM", "()F", "setExpandScrollThreshold-0680j_4", "(F)V", "F", "getCollapseScrollThreshold-D9Ej5fM", "setCollapseScrollThreshold-0680j_4", "expandScrollThresholdPx", "", "collapseScrollThresholdPx", "contentOffset", "threshold", "reverseLayoutFactor", "", "shouldAutoInvalidate", "getShouldAutoInvalidate", "nestedScrollNode", "Landroidx/compose/ui/node/DelegatableNode;", "onAttach", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "updateNode", "updateNode-Kr38-dQ", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZFF)V", "updateThreshold", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final class VerticalNestedScrollExpansionNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, NestedScrollConnection {
        public static final int $stable = 8;
        private float collapseScrollThreshold;
        private float collapseScrollThresholdPx;
        private float contentOffset;
        private float expandScrollThreshold;
        private float expandScrollThresholdPx;
        private boolean expanded;
        private DelegatableNode nestedScrollNode;
        private Function0<Unit> onCollapse;
        private Function0<Unit> onExpand;
        private boolean reverseLayout;
        private int reverseLayoutFactor;
        private float threshold;

        public /* synthetic */ VerticalNestedScrollExpansionNode(boolean z, Function0 function0, Function0 function02, boolean z2, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, function0, function02, z2, f, f2);
        }

        @Override // androidx.compose.ui.Modifier.Node
        public boolean getShouldAutoInvalidate() {
            return false;
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY */
        public /* synthetic */ Object mo716onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
            return NestedScrollConnection.CC.m7993onPostFlingRZ2iAVY$suspendImpl(this, j, j2, continuation);
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

        private VerticalNestedScrollExpansionNode(boolean z, Function0<Unit> function0, Function0<Unit> function02, boolean z2, float f, float f2) {
            this.expanded = z;
            this.onExpand = function0;
            this.onCollapse = function02;
            this.reverseLayout = z2;
            this.expandScrollThreshold = f;
            this.collapseScrollThreshold = f2;
            this.reverseLayoutFactor = z2 ? -1 : 1;
            this.nestedScrollNode = NestedScrollNodeKt.nestedScrollModifierNode(this, null);
        }

        public final boolean getExpanded() {
            return this.expanded;
        }

        public final void setExpanded(boolean z) {
            this.expanded = z;
        }

        public final Function0<Unit> getOnExpand() {
            return this.onExpand;
        }

        public final void setOnExpand(Function0<Unit> function0) {
            this.onExpand = function0;
        }

        public final Function0<Unit> getOnCollapse() {
            return this.onCollapse;
        }

        public final void setOnCollapse(Function0<Unit> function0) {
            this.onCollapse = function0;
        }

        public final boolean getReverseLayout() {
            return this.reverseLayout;
        }

        public final void setReverseLayout(boolean z) {
            this.reverseLayout = z;
        }

        /* renamed from: getExpandScrollThreshold-D9Ej5fM, reason: not valid java name and from getter */
        public final float getExpandScrollThreshold() {
            return this.expandScrollThreshold;
        }

        /* renamed from: setExpandScrollThreshold-0680j_4, reason: not valid java name */
        public final void m3214setExpandScrollThreshold0680j_4(float f) {
            this.expandScrollThreshold = f;
        }

        /* renamed from: getCollapseScrollThreshold-D9Ej5fM, reason: not valid java name and from getter */
        public final float getCollapseScrollThreshold() {
            return this.collapseScrollThreshold;
        }

        /* renamed from: setCollapseScrollThreshold-0680j_4, reason: not valid java name */
        public final void m3213setCollapseScrollThreshold0680j_4(float f) {
            this.collapseScrollThreshold = f;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            delegate(this.nestedScrollNode);
            Density requireDensity = DelegatableNodeKt.requireDensity(this.nestedScrollNode);
            this.expandScrollThresholdPx = requireDensity.mo528toPx0680j_4(this.expandScrollThreshold);
            this.collapseScrollThresholdPx = requireDensity.mo528toPx0680j_4(this.collapseScrollThreshold);
            updateThreshold();
        }

        /* renamed from: updateNode-Kr38-dQ, reason: not valid java name */
        public final void m3215updateNodeKr38dQ(boolean expanded, Function0<Unit> onExpand, Function0<Unit> onCollapse, boolean reverseLayout, float expandScrollThreshold, float collapseScrollThreshold) {
            if (!Dp.m9737equalsimpl0(this.expandScrollThreshold, expandScrollThreshold) || !Dp.m9737equalsimpl0(this.collapseScrollThreshold, collapseScrollThreshold)) {
                this.expandScrollThreshold = expandScrollThreshold;
                this.collapseScrollThreshold = collapseScrollThreshold;
                Density requireDensity = DelegatableNodeKt.requireDensity(this.nestedScrollNode);
                this.expandScrollThresholdPx = requireDensity.mo528toPx0680j_4(expandScrollThreshold);
                this.collapseScrollThresholdPx = requireDensity.mo528toPx0680j_4(collapseScrollThreshold);
                updateThreshold();
            }
            if (this.reverseLayout != reverseLayout) {
                this.reverseLayout = reverseLayout;
                this.reverseLayoutFactor = reverseLayout ? -1 : 1;
            }
            this.onExpand = onExpand;
            this.onCollapse = onCollapse;
            if (this.expanded != expanded) {
                this.expanded = expanded;
                updateThreshold();
            }
        }

        private final void updateThreshold() {
            float f;
            if (this.expanded) {
                f = this.contentOffset - this.collapseScrollThresholdPx;
            } else {
                f = this.contentOffset + this.expandScrollThresholdPx;
            }
            this.threshold = f;
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public long mo717onPostScrollDzOQY0M(long consumed, long available, int source) {
            float intBitsToFloat = Float.intBitsToFloat((int) (consumed & 4294967295L)) * this.reverseLayoutFactor;
            float f = this.contentOffset + intBitsToFloat;
            this.contentOffset = f;
            if (intBitsToFloat < 0.0f && f <= this.threshold) {
                this.threshold = f + this.expandScrollThresholdPx;
                this.onCollapse.invoke();
            } else if (intBitsToFloat > 0.0f && f >= this.threshold) {
                this.threshold = f - this.collapseScrollThresholdPx;
                this.onExpand.invoke();
            }
            return Offset.INSTANCE.m6535getZeroF1C5BW0();
        }
    }

    public final FloatingToolbarColors getDefaultFloatingToolbarStandardColors$material3(ColorScheme colorScheme) {
        FloatingToolbarColors defaultFloatingToolbarStandardColorsCached = colorScheme.getDefaultFloatingToolbarStandardColorsCached();
        if (defaultFloatingToolbarStandardColorsCached != null) {
            return defaultFloatingToolbarStandardColorsCached;
        }
        FloatingToolbarColors floatingToolbarColors = new FloatingToolbarColors(ColorSchemeKt.fromToken(colorScheme, FloatingToolbarTokens.INSTANCE.getStandardContainerColor()), ColorSchemeKt.m2783contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, FloatingToolbarTokens.INSTANCE.getStandardContainerColor())), ColorSchemeKt.fromToken(colorScheme, ColorSchemeKeyTokens.PrimaryContainer), ColorSchemeKt.m2783contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, ColorSchemeKeyTokens.PrimaryContainer)), null);
        colorScheme.setDefaultFloatingToolbarStandardColorsCached$material3(floatingToolbarColors);
        return floatingToolbarColors;
    }

    public final FloatingToolbarColors getDefaultFloatingToolbarVibrantColors$material3(ColorScheme colorScheme) {
        FloatingToolbarColors defaultFloatingToolbarVibrantColorsCached = colorScheme.getDefaultFloatingToolbarVibrantColorsCached();
        if (defaultFloatingToolbarVibrantColorsCached != null) {
            return defaultFloatingToolbarVibrantColorsCached;
        }
        FloatingToolbarColors floatingToolbarColors = new FloatingToolbarColors(ColorSchemeKt.fromToken(colorScheme, FloatingToolbarTokens.INSTANCE.getVibrantContainerColor()), ColorSchemeKt.m2783contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, FloatingToolbarTokens.INSTANCE.getVibrantContainerColor())), ColorSchemeKt.fromToken(colorScheme, ColorSchemeKeyTokens.TertiaryContainer), ColorSchemeKt.m2783contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, ColorSchemeKeyTokens.TertiaryContainer)), null);
        colorScheme.setDefaultFloatingToolbarVibrantColorsCached$material3(floatingToolbarColors);
        return floatingToolbarColors;
    }

    /* renamed from: getScrollDistanceThreshold-D9Ej5fM, reason: not valid java name */
    public final float m3205getScrollDistanceThresholdD9Ej5fM() {
        return ScrollDistanceThreshold;
    }

    public final ClosedRange<Dp> getFabSizeRange$material3() {
        return FabSizeRange;
    }

    /* renamed from: getToolbarToFabGap-D9Ej5fM$material3, reason: not valid java name */
    public final float m3206getToolbarToFabGapD9Ej5fM$material3() {
        return ToolbarToFabGap;
    }
}
