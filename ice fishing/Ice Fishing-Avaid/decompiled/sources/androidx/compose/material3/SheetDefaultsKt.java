package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchors;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.material3.internal.DraggableAnchorsKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: SheetDefaults.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÍ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00100\u0007¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aË\u0001\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00100\u0007¢\u0006\u0002\b\u000e2\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0004\b!\u0010\"\u001a(\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0002\u0010$\u001a \u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0000\u001aW\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020\u000b2\u0014\b\u0002\u0010.\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000b0\u00192\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020\u000b2\b\b\u0002\u00102\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\tH\u0001¢\u0006\u0004\b4\u00105\u001a\u0014\u00106\u001a\u00020 *\u0002072\u0006\u00108\u001a\u00020 H\u0000\u001a\u0014\u00109\u001a\u00020 *\u0002072\u0006\u00108\u001a\u00020 H\u0000\u001a\u001c\u0010:\u001a\u00020\u0003*\u00020\u00032\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 H\u0000\u001a\u0014\u0010;\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H\u0000\u001a\u0014\u0010<\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0014\u0010=\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\"\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020 0?X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010A\"\u0010\u0010B\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010C\"\u0010\u0010D\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010C\"\u0010\u0010E\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010C\"\u0016\u0010F\u001a\u00020GX\u0080\u0004¢\u0006\n\n\u0002\u0010J\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"BottomSheet", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material3/SheetState;", "onDismissRequest", "Lkotlin/Function0;", "maxWidth", "Landroidx/compose/ui/unit/Dp;", "gesturesEnabled", "", "backHandlerEnabled", "dragHandle", "Landroidx/compose/runtime/Composable;", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "shadowElevation", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "BottomSheet-jyqLk6I", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;FZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BottomSheetImpl", "predictiveBackProgress", "", "BottomSheetImpl-l84tTqM", "(FLandroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;FZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "DragHandleWithTooltip", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "sheetState", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "rememberSheetState", "skipPartiallyExpanded", "confirmValueChange", "Landroidx/compose/material3/SheetValue;", "initialValue", "skipHiddenState", "positionalThreshold", "velocityThreshold", "rememberSheetState-AGcomas", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "calculateSheetPredictiveBackScaleX", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", NotificationCompat.CATEGORY_PROGRESS, "calculateSheetPredictiveBackScaleY", "sheetPredictiveBackScaling", "contentPredictiveBackScaling", "verticalScaleUp", "verticalScaleDown", "BottomSheetAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getBottomSheetAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "DragHandleVerticalPadding", "F", "PredictiveBackMaxScaleXDistance", "PredictiveBackMaxScaleYDistance", "PredictiveBackChildTransformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "getPredictiveBackChildTransformOrigin", "()J", "J", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class SheetDefaultsKt {
    private static final AnimationSpec<Float> BottomSheetAnimationSpec = AnimationSpecKt.tween$default(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float DragHandleVerticalPadding = Dp.m9732constructorimpl(22);
    private static final float PredictiveBackMaxScaleXDistance = Dp.m9732constructorimpl(48);
    private static final float PredictiveBackMaxScaleYDistance = Dp.m9732constructorimpl(24);
    private static final long PredictiveBackChildTransformOrigin = TransformOriginKt.TransformOrigin(0.5f, 0.0f);

    /* compiled from: SheetDefaults.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetValue.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetImpl_l84tTqM$lambda$9(float f, Modifier modifier, SheetState sheetState, Function0 function0, float f2, boolean z, Shape shape, long j, long j2, float f3, float f4, Function2 function2, Function2 function22, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m3944BottomSheetImpll84tTqM(f, modifier, sheetState, function0, f2, z, shape, j, j2, f3, f4, function2, function22, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheet_jyqLk6I$lambda$6(Modifier modifier, SheetState sheetState, Function0 function0, float f, boolean z, boolean z2, Function2 function2, Function2 function22, Shape shape, long j, long j2, float f2, float f3, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m3943BottomSheetjyqLk6I(modifier, sheetState, function0, f, z, z2, function2, function22, shape, j, j2, f2, f3, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DragHandleWithTooltip$lambda$1(Modifier modifier, Function2 function2, int i, Composer composer, int i2) {
        DragHandleWithTooltip(modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberSheetState_AGcomas$lambda$0$0(SheetValue sheetValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets BottomSheet_jyqLk6I$lambda$1(Composer composer, int i) {
        composer.startReplaceGroup(-1280141503);
        ComposerKt.sourceInformation(composer, "C153@7562L20:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1280141503, i, -1, "androidx.compose.material3.BottomSheet.<anonymous> (SheetDefaults.kt:153)");
        }
        WindowInsets standardWindowInsets = BottomSheetDefaults.INSTANCE.getStandardWindowInsets(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return standardWindowInsets;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dc  */
    /* renamed from: BottomSheet-jyqLk6I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3943BottomSheetjyqLk6I(Modifier modifier, SheetState sheetState, Function0<Unit> function0, float f, boolean z, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, ? extends WindowInsets> function22, Shape shape, long j, long j2, float f2, float f3, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        SheetState sheetState2;
        int i5;
        float f4;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        int i8;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        Function2<? super Composer, ? super Integer, ? extends WindowInsets> function24;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Composer composer2;
        final Function0<Unit> function02;
        final Shape shape2;
        final Modifier modifier3;
        final SheetState sheetState3;
        final float f5;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function25;
        final boolean z5;
        final boolean z6;
        final long j3;
        final long j4;
        final float f6;
        final float f7;
        ScopeUpdateScope endRestartGroup;
        final SheetState sheetState4;
        Function0<Unit> function03;
        Shape shape3;
        int i19;
        Modifier modifier4;
        long j5;
        long j6;
        int i20;
        long j7;
        Modifier modifier5;
        boolean z7;
        float f8;
        float f9;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i21;
        final Function0<Unit> function04;
        Shape shape4;
        boolean z8;
        long j8;
        float f10;
        boolean z9;
        boolean changedInstance;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        boolean changedInstance2;
        Object rememberedValue4;
        boolean changedInstance3;
        SheetDefaultsKt$BottomSheet$4$1 rememberedValue5;
        int i22;
        int i23;
        int i24;
        int i25;
        Composer startRestartGroup = composer.startRestartGroup(143447414);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheet)N(modifier,state,onDismissRequest,maxWidth:c#ui.unit.Dp,gesturesEnabled,backHandlerEnabled,dragHandle,contentWindowInsets,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,content)162@7943L12,163@8019L12,164@8105L12,165@8161L159,165@8150L170,171@8355L42,172@8414L24,173@8477L372,184@8926L317,184@8855L388,194@9248L550:SheetDefaults.kt#uh7d8r");
        int i26 = i3 & 1;
        if (i26 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i & 48) == 0) {
            if ((i3 & 2) == 0) {
                sheetState2 = sheetState;
                if (startRestartGroup.changed(sheetState2)) {
                    i25 = 32;
                    i4 |= i25;
                }
            } else {
                sheetState2 = sheetState;
            }
            i25 = 16;
            i4 |= i25;
        } else {
            sheetState2 = sheetState;
        }
        int i27 = i3 & 4;
        if (i27 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f;
                i4 |= startRestartGroup.changed(f4) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    z3 = z;
                    i4 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        z4 = z2;
                    } else {
                        z4 = z2;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        function23 = function2;
                    } else {
                        function23 = function2;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changedInstance(function23) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            function24 = function22;
                            if (startRestartGroup.changedInstance(function24)) {
                                i24 = 8388608;
                                i4 |= i24;
                            }
                        } else {
                            function24 = function22;
                        }
                        i24 = 4194304;
                        i4 |= i24;
                    } else {
                        function24 = function22;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(shape)) {
                            i23 = 67108864;
                            i4 |= i23;
                        }
                        i23 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i23;
                    }
                    if ((i & 805306368) != 0) {
                        if ((i3 & 512) == 0) {
                            i9 = i26;
                            if (startRestartGroup.changed(j)) {
                                i22 = GroupFlagsKt.HasMovableContentFlag;
                                i4 |= i22;
                            }
                        } else {
                            i9 = i26;
                        }
                        i22 = GroupFlagsKt.IsMovableContentFlag;
                        i4 |= i22;
                    } else {
                        i9 = i26;
                    }
                    if ((i2 & 6) != 0) {
                        i10 = i9;
                        i11 = (((i3 & 1024) == 0 && startRestartGroup.changed(j2)) ? 4 : 2) | i2;
                    } else {
                        i10 = i9;
                        i11 = i2;
                    }
                    int i28 = i11;
                    i12 = i3 & 2048;
                    if (i12 == 0) {
                        i15 = i28 | 48;
                        i13 = i12;
                    } else if ((i2 & 48) == 0) {
                        i13 = i12;
                        i15 = i28 | (startRestartGroup.changed(f2) ? 32 : 16);
                    } else {
                        i13 = i12;
                        i14 = i28;
                        i16 = i3 & 4096;
                        if (i16 != 0) {
                            i17 = i14 | 384;
                        } else {
                            i17 = i14;
                            if ((i2 & 384) == 0) {
                                i17 |= startRestartGroup.changed(f3) ? 256 : 128;
                                if ((i2 & 3072) == 0) {
                                    i17 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
                                }
                                i18 = i17;
                                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 1171) != 1170, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "146@7189L31,147@7257L2,155@7629L13,156@7692L14,157@7734L31");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 2) != 0) {
                                            i4 &= -113;
                                        }
                                        if ((i3 & 128) != 0) {
                                            i4 &= -29360129;
                                        }
                                        if ((i3 & 256) != 0) {
                                            i4 &= -234881025;
                                        }
                                        if ((i3 & 512) != 0) {
                                            i4 &= -1879048193;
                                        }
                                        if ((i3 & 1024) != 0) {
                                            i18 &= -15;
                                        }
                                        j7 = j;
                                        f9 = f3;
                                        i20 = i18;
                                        function26 = function23;
                                        modifier5 = modifier2;
                                        i21 = i4;
                                        sheetState4 = sheetState2;
                                        z8 = z3;
                                        z7 = z4;
                                        function04 = function0;
                                        shape4 = shape;
                                        j8 = j2;
                                        f8 = f2;
                                    } else {
                                        Modifier.Companion companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                                        if ((i3 & 2) != 0) {
                                            sheetState4 = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, startRestartGroup, 0, 3);
                                            i4 &= -113;
                                        } else {
                                            sheetState4 = sheetState2;
                                        }
                                        if (i27 != 0) {
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 414015992, "CC(remember):SheetDefaults.kt#9igjgp");
                                            Object rememberedValue6 = startRestartGroup.rememberedValue();
                                            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue6 = new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda28
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit unit;
                                                        unit = Unit.INSTANCE;
                                                        return unit;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue6);
                                            }
                                            function03 = (Function0) rememberedValue6;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        } else {
                                            function03 = function0;
                                        }
                                        if (i5 != 0) {
                                            f4 = BottomSheetDefaults.INSTANCE.m2554getSheetMaxWidthD9Ej5fM();
                                        }
                                        if (i6 != 0) {
                                            z3 = true;
                                        }
                                        if (i7 != 0) {
                                            z4 = true;
                                        }
                                        if (i8 != 0) {
                                            function23 = ComposableSingletons$SheetDefaultsKt.INSTANCE.getLambda$1335949740$material3();
                                        }
                                        if ((i3 & 128) != 0) {
                                            function24 = new Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda29
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    WindowInsets BottomSheet_jyqLk6I$lambda$1;
                                                    BottomSheet_jyqLk6I$lambda$1 = SheetDefaultsKt.BottomSheet_jyqLk6I$lambda$1((Composer) obj, ((Integer) obj2).intValue());
                                                    return BottomSheet_jyqLk6I$lambda$1;
                                                }
                                            };
                                            i4 &= -29360129;
                                        }
                                        if ((i3 & 256) != 0) {
                                            shape3 = BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                                            i4 &= -234881025;
                                        } else {
                                            shape3 = shape;
                                        }
                                        if ((i3 & 512) != 0) {
                                            modifier4 = companion;
                                            i4 = (-1879048193) & i4;
                                            i19 = i18;
                                            j5 = BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                        } else {
                                            i19 = i18;
                                            modifier4 = companion;
                                            j5 = j;
                                        }
                                        if ((i3 & 1024) != 0) {
                                            j6 = ColorSchemeKt.m2784contentColorForek8zF_U(j5, startRestartGroup, (i4 >> 27) & 14);
                                            i20 = i19 & (-15);
                                        } else {
                                            j6 = j2;
                                            i20 = i19;
                                        }
                                        float m2552getElevationD9Ej5fM = i13 != 0 ? BottomSheetDefaults.INSTANCE.m2552getElevationD9Ej5fM() : f2;
                                        j7 = j5;
                                        if (i16 != 0) {
                                            float f11 = m2552getElevationD9Ej5fM;
                                            modifier5 = modifier4;
                                            z7 = z4;
                                            f8 = f11;
                                            f9 = Dp.m9732constructorimpl(0);
                                        } else {
                                            float f12 = m2552getElevationD9Ej5fM;
                                            modifier5 = modifier4;
                                            z7 = z4;
                                            f8 = f12;
                                            f9 = f3;
                                        }
                                        function26 = function23;
                                        i21 = i4;
                                        function04 = function03;
                                        shape4 = shape3;
                                        z8 = z3;
                                        j8 = j6;
                                    }
                                    startRestartGroup.endDefaults();
                                    float f13 = f9;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(143447414, i21, i20, "androidx.compose.material3.BottomSheet (SheetDefaults.kt:161)");
                                    }
                                    final FiniteAnimationSpec defaultSpatialSpec = MaterialTheme.INSTANCE.getMotionScheme(startRestartGroup, 6).defaultSpatialSpec();
                                    Modifier modifier6 = modifier5;
                                    final FiniteAnimationSpec fastEffectsSpec = MaterialTheme.INSTANCE.getMotionScheme(startRestartGroup, 6).fastEffectsSpec();
                                    boolean z10 = z8;
                                    final FiniteAnimationSpec defaultSpatialSpec2 = MaterialTheme.INSTANCE.getMotionScheme(startRestartGroup, 6).defaultSpatialSpec();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 414045077, "CC(remember):SheetDefaults.kt#9igjgp");
                                    int i29 = (i21 & 112) ^ 48;
                                    Shape shape5 = shape4;
                                    if (i29 <= 32 || !startRestartGroup.changed(sheetState4)) {
                                        f10 = f4;
                                        if ((i21 & 48) != 32) {
                                            z9 = false;
                                            changedInstance = z9 | startRestartGroup.changedInstance(defaultSpatialSpec) | startRestartGroup.changedInstance(fastEffectsSpec) | startRestartGroup.changedInstance(defaultSpatialSpec2);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda30
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit BottomSheet_jyqLk6I$lambda$2$0;
                                                        BottomSheet_jyqLk6I$lambda$2$0 = SheetDefaultsKt.BottomSheet_jyqLk6I$lambda$2$0(SheetState.this, defaultSpatialSpec, fastEffectsSpec, defaultSpatialSpec2);
                                                        return BottomSheet_jyqLk6I$lambda$2$0;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 414051168, "CC(remember):SheetDefaults.kt#9igjgp");
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                            }
                                            final Animatable animatable = (Animatable) rememberedValue2;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                                            rememberedValue3 = startRestartGroup.rememberedValue();
                                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                            }
                                            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 414055402, "CC(remember):SheetDefaults.kt#9igjgp");
                                            changedInstance2 = ((i29 <= 32 && startRestartGroup.changed(sheetState4)) || (i21 & 48) == 32) | startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(animatable) | ((i21 & 896) != 256);
                                            rememberedValue4 = startRestartGroup.rememberedValue();
                                            if (!changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue4 = new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda31
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit BottomSheet_jyqLk6I$lambda$4$0;
                                                        BottomSheet_jyqLk6I$lambda$4$0 = SheetDefaultsKt.BottomSheet_jyqLk6I$lambda$4$0(SheetState.this, coroutineScope, animatable, function04);
                                                        return BottomSheet_jyqLk6I$lambda$4$0;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue4);
                                            }
                                            Function0 function05 = (Function0) rememberedValue4;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            boolean z11 = !z7 && sheetState4.isVisible();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 414069715, "CC(remember):SheetDefaults.kt#9igjgp");
                                            changedInstance3 = startRestartGroup.changedInstance(animatable) | startRestartGroup.changed(function05);
                                            rememberedValue5 = startRestartGroup.rememberedValue();
                                            if (!changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue5 = new SheetDefaultsKt$BottomSheet$4$1(function05, animatable, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue5);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            BackHandler_androidKt.PredictiveBackHandler(z11, (Function2) rememberedValue5, startRestartGroup, 0, 0);
                                            int i30 = i21 >> 6;
                                            int i31 = ((i21 << 3) & 524272) | (3670016 & i30) | (i30 & 29360128);
                                            int i32 = i20 << 24;
                                            int i33 = i21 >> 15;
                                            composer2 = startRestartGroup;
                                            SheetState sheetState5 = sheetState4;
                                            Function2<? super Composer, ? super Integer, ? extends WindowInsets> function27 = function24;
                                            long j9 = j7;
                                            float f14 = f10;
                                            m3944BottomSheetImpll84tTqM(((Number) animatable.getValue()).floatValue(), modifier6, sheetState5, function04, f14, z10, shape5, j9, j8, f8, f13, function26, function27, function3, composer2, i31 | (234881024 & i32) | (i32 & 1879048192), (i33 & 896) | ((i20 >> 6) & 14) | (i33 & 112) | (i20 & 7168), 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            modifier3 = modifier6;
                                            sheetState3 = sheetState5;
                                            function02 = function04;
                                            f5 = f14;
                                            z5 = z10;
                                            shape2 = shape5;
                                            j3 = j9;
                                            j4 = j8;
                                            f6 = f8;
                                            f7 = f13;
                                            function23 = function26;
                                            function25 = function27;
                                            z6 = z7;
                                        }
                                    } else {
                                        f10 = f4;
                                    }
                                    z9 = true;
                                    changedInstance = z9 | startRestartGroup.changedInstance(defaultSpatialSpec) | startRestartGroup.changedInstance(fastEffectsSpec) | startRestartGroup.changedInstance(defaultSpatialSpec2);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changedInstance) {
                                    }
                                    rememberedValue = new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda30
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit BottomSheet_jyqLk6I$lambda$2$0;
                                            BottomSheet_jyqLk6I$lambda$2$0 = SheetDefaultsKt.BottomSheet_jyqLk6I$lambda$2$0(SheetState.this, defaultSpatialSpec, fastEffectsSpec, defaultSpatialSpec2);
                                            return BottomSheet_jyqLk6I$lambda$2$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 414051168, "CC(remember):SheetDefaults.kt#9igjgp");
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    final Animatable animatable2 = (Animatable) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    final CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue3;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 414055402, "CC(remember):SheetDefaults.kt#9igjgp");
                                    changedInstance2 = ((i29 <= 32 && startRestartGroup.changed(sheetState4)) || (i21 & 48) == 32) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(animatable2) | ((i21 & 896) != 256);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (!changedInstance2) {
                                    }
                                    rememberedValue4 = new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda31
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit BottomSheet_jyqLk6I$lambda$4$0;
                                            BottomSheet_jyqLk6I$lambda$4$0 = SheetDefaultsKt.BottomSheet_jyqLk6I$lambda$4$0(SheetState.this, coroutineScope2, animatable2, function04);
                                            return BottomSheet_jyqLk6I$lambda$4$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                    Function0 function052 = (Function0) rememberedValue4;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    if (z7) {
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 414069715, "CC(remember):SheetDefaults.kt#9igjgp");
                                    changedInstance3 = startRestartGroup.changedInstance(animatable2) | startRestartGroup.changed(function052);
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (!changedInstance3) {
                                    }
                                    rememberedValue5 = new SheetDefaultsKt$BottomSheet$4$1(function052, animatable2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    BackHandler_androidKt.PredictiveBackHandler(z11, (Function2) rememberedValue5, startRestartGroup, 0, 0);
                                    int i302 = i21 >> 6;
                                    int i312 = ((i21 << 3) & 524272) | (3670016 & i302) | (i302 & 29360128);
                                    int i322 = i20 << 24;
                                    int i332 = i21 >> 15;
                                    composer2 = startRestartGroup;
                                    SheetState sheetState52 = sheetState4;
                                    Function2<? super Composer, ? super Integer, ? extends WindowInsets> function272 = function24;
                                    long j92 = j7;
                                    float f142 = f10;
                                    m3944BottomSheetImpll84tTqM(((Number) animatable2.getValue()).floatValue(), modifier6, sheetState52, function04, f142, z10, shape5, j92, j8, f8, f13, function26, function272, function3, composer2, i312 | (234881024 & i322) | (i322 & 1879048192), (i332 & 896) | ((i20 >> 6) & 14) | (i332 & 112) | (i20 & 7168), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier6;
                                    sheetState3 = sheetState52;
                                    function02 = function04;
                                    f5 = f142;
                                    z5 = z10;
                                    shape2 = shape5;
                                    j3 = j92;
                                    j4 = j8;
                                    f6 = f8;
                                    f7 = f13;
                                    function23 = function26;
                                    function25 = function272;
                                    z6 = z7;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    function02 = function0;
                                    shape2 = shape;
                                    modifier3 = modifier2;
                                    sheetState3 = sheetState2;
                                    f5 = f4;
                                    function25 = function24;
                                    z5 = z3;
                                    z6 = z4;
                                    j3 = j;
                                    j4 = j2;
                                    f6 = f2;
                                    f7 = f3;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit BottomSheet_jyqLk6I$lambda$6;
                                            BottomSheet_jyqLk6I$lambda$6 = SheetDefaultsKt.BottomSheet_jyqLk6I$lambda$6(Modifier.this, sheetState3, function02, f5, z5, z6, function23, function25, shape2, j3, j4, f6, f7, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            return BottomSheet_jyqLk6I$lambda$6;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                        }
                        if ((i2 & 3072) == 0) {
                        }
                        i18 = i17;
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 1171) != 1170, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i14 = i15;
                    i16 = i3 & 4096;
                    if (i16 != 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    i18 = i17;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 1171) != 1170, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) != 0) {
                }
                if ((i2 & 6) != 0) {
                }
                int i282 = i11;
                i12 = i3 & 2048;
                if (i12 == 0) {
                }
                i14 = i15;
                i16 = i3 & 4096;
                if (i16 != 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                i18 = i17;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 1171) != 1170, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f4 = f;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z3 = z;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) != 0) {
            }
            if ((i2 & 6) != 0) {
            }
            int i2822 = i11;
            i12 = i3 & 2048;
            if (i12 == 0) {
            }
            i14 = i15;
            i16 = i3 & 4096;
            if (i16 != 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            i18 = i17;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 1171) != 1170, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f4 = f;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z3 = z;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) != 0) {
        }
        if ((i2 & 6) != 0) {
        }
        int i28222 = i11;
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        i14 = i15;
        i16 = i3 & 4096;
        if (i16 != 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        i18 = i17;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 1171) != 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheet_jyqLk6I$lambda$2$0(SheetState sheetState, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3) {
        sheetState.setShowMotionSpec$material3(finiteAnimationSpec);
        sheetState.setHideMotionSpec$material3(finiteAnimationSpec2);
        sheetState.setAnchoredDraggableMotionSpec$material3(finiteAnimationSpec3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheet_jyqLk6I$lambda$4$0(final SheetState sheetState, CoroutineScope coroutineScope, Animatable animatable, final Function0 function0) {
        Job launch$default;
        if (sheetState.getCurrentValue() != SheetValue.Expanded || !sheetState.getHasPartiallyExpandedState()) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SheetDefaultsKt$BottomSheet$settleToDismiss$1$1$3(sheetState, null), 3, null);
            launch$default.invokeOnCompletion(new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit BottomSheet_jyqLk6I$lambda$4$0$0;
                    BottomSheet_jyqLk6I$lambda$4$0$0 = SheetDefaultsKt.BottomSheet_jyqLk6I$lambda$4$0$0(SheetState.this, function0, (Throwable) obj);
                    return BottomSheet_jyqLk6I$lambda$4$0$0;
                }
            });
        } else {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SheetDefaultsKt$BottomSheet$settleToDismiss$1$1$1(sheetState, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SheetDefaultsKt$BottomSheet$settleToDismiss$1$1$2(animatable, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheet_jyqLk6I$lambda$4$0$0(SheetState sheetState, Function0 function0, Throwable th) {
        if (!sheetState.isVisible()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets BottomSheetImpl_l84tTqM$lambda$1(Composer composer, int i) {
        composer.startReplaceGroup(725322197);
        ComposerKt.sourceInformation(composer, "C229@10638L20:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(725322197, i, -1, "androidx.compose.material3.BottomSheetImpl.<anonymous> (SheetDefaults.kt:229)");
        }
        WindowInsets standardWindowInsets = BottomSheetDefaults.INSTANCE.getStandardWindowInsets(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return standardWindowInsets;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c6  */
    /* renamed from: BottomSheetImpl-l84tTqM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3944BottomSheetImpll84tTqM(final float f, Modifier modifier, SheetState sheetState, Function0<Unit> function0, float f2, boolean z, Shape shape, long j, long j2, float f3, float f4, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, ? extends WindowInsets> function22, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        final SheetState sheetState2;
        int i5;
        Function0<Unit> function02;
        int i6;
        float f5;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final Shape shape2;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function23;
        Composer composer2;
        final Function0<Unit> function03;
        final float f6;
        final Modifier modifier3;
        final SheetState sheetState3;
        final boolean z3;
        final long j3;
        final long j4;
        final float f7;
        final float f8;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope endRestartGroup;
        Function0<Unit> function04;
        float m2554getSheetMaxWidthD9Ej5fM;
        Shape shape3;
        String str;
        long j5;
        long j6;
        float m2552getElevationD9Ej5fM;
        float m9732constructorimpl;
        Function2<? super Composer, ? super Integer, Unit> m2836getLambda$2061828736$material3;
        int i16;
        int i17;
        Function2<? super Composer, ? super Integer, ? extends WindowInsets> function25;
        Shape shape4;
        Function0<Unit> function05;
        boolean z4;
        Object rememberedValue;
        boolean changed;
        boolean z5;
        boolean z6;
        boolean changed2;
        Object rememberedValue2;
        final Function0<Unit> function06;
        SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1 sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1;
        Object rememberedValue3;
        SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1 sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$12;
        boolean z7;
        boolean changedInstance;
        Object rememberedValue4;
        final Function0 function07;
        Modifier.Companion companion;
        boolean z8;
        Object rememberedValue5;
        boolean changed3;
        Object rememberedValue6;
        int i18;
        int i19;
        int i20;
        int i21;
        Composer startRestartGroup = composer.startRestartGroup(-1300295990);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetImpl)N(predictiveBackProgress,modifier,state,onDismissRequest,maxWidth:c#ui.unit.Dp,gesturesEnabled,shape,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,dragHandle,contentWindowInsets,content)233@10750L48,234@10840L12,235@10932L7,236@10971L7,241@11154L43,239@11055L199,246@11304L2176,289@13498L24,290@13562L289,320@14666L1449,357@16457L112,372@17247L3002,302@13857L6392:SheetDefaults.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i22 = i3 & 2;
        if (i22 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    sheetState2 = sheetState;
                    if (startRestartGroup.changed(sheetState2)) {
                        i21 = 256;
                        i4 |= i21;
                    }
                } else {
                    sheetState2 = sheetState;
                }
                i21 = 128;
                i4 |= i21;
            } else {
                sheetState2 = sheetState;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                function02 = function0;
                i4 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    f5 = f2;
                    i4 |= startRestartGroup.changed(f5) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        z2 = z;
                    } else {
                        z2 = z;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                        }
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            i19 = i4;
                            if (startRestartGroup.changed(j)) {
                                i20 = 8388608;
                                i8 = i19 | i20;
                            }
                        } else {
                            i19 = i4;
                        }
                        i20 = 4194304;
                        i8 = i19 | i20;
                    } else {
                        i8 = i4;
                    }
                    if ((i & 100663296) == 0) {
                        i8 |= ((i3 & 256) == 0 && startRestartGroup.changed(j2)) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i8 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i8 |= startRestartGroup.changed(f3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i12 = i2 | 6;
                        i11 = i10;
                    } else if ((i2 & 6) == 0) {
                        i11 = i10;
                        i12 = i2 | (startRestartGroup.changed(f4) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    i13 = i3 & 2048;
                    if (i13 == 0) {
                        i12 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i14 = i13;
                        i12 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
                        if ((i2 & 384) == 0) {
                            if ((i3 & 4096) == 0 && startRestartGroup.changedInstance(function22)) {
                                i18 = 256;
                                i12 |= i18;
                            }
                            i18 = 128;
                            i12 |= i18;
                        }
                        if ((i2 & 3072) == 0) {
                            i12 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
                        }
                        i15 = i12;
                        if (startRestartGroup.shouldExecute((i8 & 306783379) == 306783378 || (i15 & 1171) != 1170, i8 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "218@10040L31,219@10108L2,222@10242L13,223@10305L14,224@10347L31");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i8 &= -897;
                                }
                                if ((i3 & 64) != 0) {
                                    i8 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    i8 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i8 &= -234881025;
                                }
                                if ((i3 & 4096) != 0) {
                                    i15 &= -897;
                                }
                                int i23 = i8;
                                i16 = i15;
                                i17 = i23;
                                j6 = j2;
                                m9732constructorimpl = f4;
                                m2836getLambda$2061828736$material3 = function2;
                                function25 = function22;
                                str = "CC(remember):SheetDefaults.kt#9igjgp";
                                m2554getSheetMaxWidthD9Ej5fM = f5;
                                shape4 = shape;
                                j5 = j;
                                m2552getElevationD9Ej5fM = f3;
                            } else {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    i8 &= -897;
                                    sheetState2 = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, startRestartGroup, 0, 3);
                                }
                                if (i5 != 0) {
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251042604, "CC(remember):SheetDefaults.kt#9igjgp");
                                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue7 = new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda11
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                    }
                                    function04 = (Function0) rememberedValue7;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                } else {
                                    function04 = function02;
                                }
                                m2554getSheetMaxWidthD9Ej5fM = i6 != 0 ? BottomSheetDefaults.INSTANCE.m2554getSheetMaxWidthD9Ej5fM() : f5;
                                if (i7 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 64) != 0) {
                                    shape3 = BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                                    i8 &= -3670017;
                                } else {
                                    shape3 = shape;
                                }
                                if ((i3 & 128) != 0) {
                                    i8 &= -29360129;
                                    str = "CC(remember):SheetDefaults.kt#9igjgp";
                                    j5 = BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                } else {
                                    str = "CC(remember):SheetDefaults.kt#9igjgp";
                                    j5 = j;
                                }
                                if ((i3 & 256) != 0) {
                                    j6 = ColorSchemeKt.m2784contentColorForek8zF_U(j5, startRestartGroup, (i8 >> 21) & 14);
                                    i8 &= -234881025;
                                } else {
                                    j6 = j2;
                                }
                                m2552getElevationD9Ej5fM = i9 != 0 ? BottomSheetDefaults.INSTANCE.m2552getElevationD9Ej5fM() : f3;
                                m9732constructorimpl = i11 != 0 ? Dp.m9732constructorimpl(0) : f4;
                                m2836getLambda$2061828736$material3 = i14 != 0 ? ComposableSingletons$SheetDefaultsKt.INSTANCE.m2836getLambda$2061828736$material3() : function2;
                                Function0<Unit> function08 = function04;
                                if ((i3 & 4096) != 0) {
                                    function25 = new Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            WindowInsets BottomSheetImpl_l84tTqM$lambda$1;
                                            BottomSheetImpl_l84tTqM$lambda$1 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$1((Composer) obj, ((Integer) obj2).intValue());
                                            return BottomSheetImpl_l84tTqM$lambda$1;
                                        }
                                    };
                                    int i24 = i8;
                                    i16 = i15 & (-897);
                                    i17 = i24;
                                } else {
                                    int i25 = i8;
                                    i16 = i15;
                                    i17 = i25;
                                    function25 = function22;
                                }
                                shape4 = shape3;
                                function02 = function08;
                            }
                            startRestartGroup.endDefaults();
                            final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function26 = function25;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1300295990, i17, i16, "androidx.compose.material3.BottomSheetImpl (SheetDefaults.kt:232)");
                            }
                            Strings.Companion companion2 = Strings.INSTANCE;
                            final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_bottom_sheet_pane_title), startRestartGroup, 0);
                            float f9 = m9732constructorimpl;
                            FiniteAnimationSpec defaultSpatialSpec = MaterialTheme.INSTANCE.getMotionScheme(startRestartGroup, 6).defaultSpatialSpec();
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            long j7 = j5;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume;
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Density density = (Density) consume2;
                            AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
                            AnchoredDraggableState<SheetValue> anchoredDraggableState$material3 = sheetState2.getAnchoredDraggableState$material3();
                            String str2 = str;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251076117, str2);
                            int i26 = (i17 & 896) ^ 384;
                            int i27 = i16;
                            if (i26 <= 256 || !startRestartGroup.changed(sheetState2)) {
                                function05 = function02;
                                if ((i17 & 384) != 256) {
                                    z4 = false;
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda13
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                float BottomSheetImpl_l84tTqM$lambda$2$0;
                                                BottomSheetImpl_l84tTqM$lambda$2$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$2$0(SheetState.this, ((Float) obj).floatValue());
                                                return Float.valueOf(BottomSheetImpl_l84tTqM$lambda$2$0);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    TargetedFlingBehavior flingBehavior = anchoredDraggableDefaults.flingBehavior(anchoredDraggableState$material3, (Function1) rememberedValue, defaultSpatialSpec, startRestartGroup, AnchoredDraggableDefaults.$stable << 9, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251083050, str2);
                                    changed = startRestartGroup.changed(flingBehavior);
                                    if (i26 > 256 || !startRestartGroup.changed(sheetState2)) {
                                        z5 = changed;
                                        if ((i17 & 384) != 256) {
                                            z6 = false;
                                            changed2 = z5 | z6 | startRestartGroup.changed(viewConfiguration) | startRestartGroup.changed(density);
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                Function0<Unit> function09 = function05;
                                                rememberedValue2 = new SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1(viewConfiguration, sheetState2, density, flingBehavior, function09);
                                                function06 = function09;
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                            } else {
                                                function06 = function05;
                                            }
                                            sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1 = (SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1) rememberedValue2;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                                            rememberedValue3 = startRestartGroup.rememberedValue();
                                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                            }
                                            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251153419, str2);
                                            if (i26 > 256 || !startRestartGroup.changed(sheetState2)) {
                                                sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$12 = sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1;
                                                if ((i17 & 384) != 256) {
                                                    z7 = false;
                                                    changedInstance = z7 | startRestartGroup.changedInstance(coroutineScope) | ((i17 & 7168) != 2048);
                                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                                    if (!changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue4 = new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda14
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit BottomSheetImpl_l84tTqM$lambda$4$0;
                                                                BottomSheetImpl_l84tTqM$lambda$4$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$4$0(SheetState.this, coroutineScope, function06);
                                                                return BottomSheetImpl_l84tTqM$lambda$4$0;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                                    }
                                                    Function0 function010 = (Function0) rememberedValue4;
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    Function0<Unit> function011 = function06;
                                                    float f10 = m2554getSheetMaxWidthD9Ej5fM;
                                                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m1278widthInVpY3zN4$default(modifier2, 0.0f, m2554getSheetMaxWidthD9Ej5fM, 1, null), 0.0f, 1, null);
                                                    if (!z2) {
                                                        startRestartGroup.startReplaceGroup(251170029);
                                                        ComposerKt.sourceInformation(startRestartGroup, "310@14118L383");
                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251171305, str2);
                                                        boolean z9 = (i26 > 256 && startRestartGroup.changed(sheetState2)) || (i17 & 384) == 256;
                                                        Object rememberedValue8 = startRestartGroup.rememberedValue();
                                                        if (z9 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue8 = ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState2, Orientation.Vertical, sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$12);
                                                            startRestartGroup.updateRememberedValue(rememberedValue8);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        function07 = function010;
                                                        companion = NestedScrollModifierKt.nestedScroll$default(companion3, (NestedScrollConnection) rememberedValue8, null, 2, null);
                                                        startRestartGroup.endReplaceGroup();
                                                    } else {
                                                        function07 = function010;
                                                        startRestartGroup.startReplaceGroup(251184850);
                                                        startRestartGroup.endReplaceGroup();
                                                        companion = Modifier.INSTANCE;
                                                    }
                                                    Modifier then = fillMaxWidth$default.then(companion);
                                                    AnchoredDraggableState<SheetValue> anchoredDraggableState$material32 = sheetState2.getAnchoredDraggableState$material3();
                                                    Orientation orientation = Orientation.Vertical;
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251189907, str2);
                                                    z8 = (i26 <= 256 && startRestartGroup.changed(sheetState2)) || (i17 & 384) == 256;
                                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                                    if (!z8 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue5 = new Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda15
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj, Object obj2) {
                                                                Pair BottomSheetImpl_l84tTqM$lambda$6$0;
                                                                BottomSheetImpl_l84tTqM$lambda$6$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$6$0(SheetState.this, (IntSize) obj, (Constraints) obj2);
                                                                return BottomSheetImpl_l84tTqM$lambda$6$0;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(DraggableAnchorsKt.draggableAnchors(then, anchoredDraggableState$material32, orientation, (Function2) rememberedValue5), sheetState2.getAnchoredDraggableState$material3(), Orientation.Vertical, (z2 || sheetState2.getCurrentValue() == SheetValue.Hidden) ? false : true, null, null, sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$12, 24, null);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251245882, str2);
                                                    changed3 = startRestartGroup.changed(m4895getString2EP1pXo);
                                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                                    if (!changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue6 = new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda16
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                Unit BottomSheetImpl_l84tTqM$lambda$7$0;
                                                                BottomSheetImpl_l84tTqM$lambda$7$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$7$0(m4895getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                                                                return BottomSheetImpl_l84tTqM$lambda$7$0;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    final SheetState sheetState4 = sheetState2;
                                                    final boolean z10 = z2;
                                                    final Function2<? super Composer, ? super Integer, Unit> function27 = m2836getLambda$2061828736$material3;
                                                    int i28 = i17 >> 15;
                                                    Shape shape5 = shape4;
                                                    SurfaceKt.m4112SurfaceT9BRK9s(verticalScaleUp(sheetPredictiveBackScaling(SemanticsModifierKt.semantics$default(anchoredDraggable$default, false, (Function1) rememberedValue6, 1, null), sheetState2, f), sheetState2), shape5, j7, j6, m2552getElevationD9Ej5fM, f9, null, ComposableLambdaKt.rememberComposableLambda(623721295, true, new Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda17
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            Unit BottomSheetImpl_l84tTqM$lambda$8;
                                                            BottomSheetImpl_l84tTqM$lambda$8 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$8(Function2.this, f, sheetState4, function27, function07, coroutineScope, z10, function3, (Composer) obj, ((Integer) obj2).intValue());
                                                            return BottomSheetImpl_l84tTqM$lambda$8;
                                                        }
                                                    }, startRestartGroup, 54), startRestartGroup, (i28 & 57344) | (i28 & 112) | 12582912 | (i28 & 896) | (i28 & 7168) | ((i27 << 15) & 458752), 64);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    composer2 = startRestartGroup;
                                                    modifier3 = modifier2;
                                                    f6 = f10;
                                                    j3 = j7;
                                                    shape2 = shape5;
                                                    f7 = m2552getElevationD9Ej5fM;
                                                    z3 = z2;
                                                    function24 = m2836getLambda$2061828736$material3;
                                                    j4 = j6;
                                                    function23 = function26;
                                                    sheetState3 = sheetState2;
                                                    f8 = f9;
                                                    function03 = function011;
                                                }
                                            } else {
                                                sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$12 = sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1;
                                            }
                                            z7 = true;
                                            changedInstance = z7 | startRestartGroup.changedInstance(coroutineScope) | ((i17 & 7168) != 2048);
                                            rememberedValue4 = startRestartGroup.rememberedValue();
                                            if (!changedInstance) {
                                            }
                                            rememberedValue4 = new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda14
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit BottomSheetImpl_l84tTqM$lambda$4$0;
                                                    BottomSheetImpl_l84tTqM$lambda$4$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$4$0(SheetState.this, coroutineScope, function06);
                                                    return BottomSheetImpl_l84tTqM$lambda$4$0;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                            Function0 function0102 = (Function0) rememberedValue4;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            Function0<Unit> function0112 = function06;
                                            float f102 = m2554getSheetMaxWidthD9Ej5fM;
                                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m1278widthInVpY3zN4$default(modifier2, 0.0f, m2554getSheetMaxWidthD9Ej5fM, 1, null), 0.0f, 1, null);
                                            if (!z2) {
                                            }
                                            Modifier then2 = fillMaxWidth$default2.then(companion);
                                            AnchoredDraggableState<SheetValue> anchoredDraggableState$material322 = sheetState2.getAnchoredDraggableState$material3();
                                            Orientation orientation2 = Orientation.Vertical;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251189907, str2);
                                            if (i26 <= 256) {
                                            }
                                            rememberedValue5 = startRestartGroup.rememberedValue();
                                            if (!z8) {
                                            }
                                            rememberedValue5 = new Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda15
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    Pair BottomSheetImpl_l84tTqM$lambda$6$0;
                                                    BottomSheetImpl_l84tTqM$lambda$6$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$6$0(SheetState.this, (IntSize) obj, (Constraints) obj2);
                                                    return BottomSheetImpl_l84tTqM$lambda$6$0;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue5);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            Modifier anchoredDraggable$default2 = AnchoredDraggableKt.anchoredDraggable$default(DraggableAnchorsKt.draggableAnchors(then2, anchoredDraggableState$material322, orientation2, (Function2) rememberedValue5), sheetState2.getAnchoredDraggableState$material3(), Orientation.Vertical, (z2 || sheetState2.getCurrentValue() == SheetValue.Hidden) ? false : true, null, null, sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$12, 24, null);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251245882, str2);
                                            changed3 = startRestartGroup.changed(m4895getString2EP1pXo);
                                            rememberedValue6 = startRestartGroup.rememberedValue();
                                            if (!changed3) {
                                            }
                                            rememberedValue6 = new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda16
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    Unit BottomSheetImpl_l84tTqM$lambda$7$0;
                                                    BottomSheetImpl_l84tTqM$lambda$7$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$7$0(m4895getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                                                    return BottomSheetImpl_l84tTqM$lambda$7$0;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue6);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            final SheetState sheetState42 = sheetState2;
                                            final boolean z102 = z2;
                                            final Function2 function272 = m2836getLambda$2061828736$material3;
                                            int i282 = i17 >> 15;
                                            Shape shape52 = shape4;
                                            SurfaceKt.m4112SurfaceT9BRK9s(verticalScaleUp(sheetPredictiveBackScaling(SemanticsModifierKt.semantics$default(anchoredDraggable$default2, false, (Function1) rememberedValue6, 1, null), sheetState2, f), sheetState2), shape52, j7, j6, m2552getElevationD9Ej5fM, f9, null, ComposableLambdaKt.rememberComposableLambda(623721295, true, new Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda17
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    Unit BottomSheetImpl_l84tTqM$lambda$8;
                                                    BottomSheetImpl_l84tTqM$lambda$8 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$8(Function2.this, f, sheetState42, function272, function07, coroutineScope, z102, function3, (Composer) obj, ((Integer) obj2).intValue());
                                                    return BottomSheetImpl_l84tTqM$lambda$8;
                                                }
                                            }, startRestartGroup, 54), startRestartGroup, (i282 & 57344) | (i282 & 112) | 12582912 | (i282 & 896) | (i282 & 7168) | ((i27 << 15) & 458752), 64);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            composer2 = startRestartGroup;
                                            modifier3 = modifier2;
                                            f6 = f102;
                                            j3 = j7;
                                            shape2 = shape52;
                                            f7 = m2552getElevationD9Ej5fM;
                                            z3 = z2;
                                            function24 = m2836getLambda$2061828736$material3;
                                            j4 = j6;
                                            function23 = function26;
                                            sheetState3 = sheetState2;
                                            f8 = f9;
                                            function03 = function0112;
                                        }
                                    } else {
                                        z5 = changed;
                                    }
                                    z6 = true;
                                    changed2 = z5 | z6 | startRestartGroup.changed(viewConfiguration) | startRestartGroup.changed(density);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (changed2) {
                                    }
                                    Function0<Unit> function092 = function05;
                                    rememberedValue2 = new SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1(viewConfiguration, sheetState2, density, flingBehavior, function092);
                                    function06 = function092;
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                    sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1 = (SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    final CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue3;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251153419, str2);
                                    if (i26 > 256) {
                                    }
                                    sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$12 = sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1;
                                    if ((i17 & 384) != 256) {
                                    }
                                    z7 = true;
                                    changedInstance = z7 | startRestartGroup.changedInstance(coroutineScope2) | ((i17 & 7168) != 2048);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (!changedInstance) {
                                    }
                                    rememberedValue4 = new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda14
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit BottomSheetImpl_l84tTqM$lambda$4$0;
                                            BottomSheetImpl_l84tTqM$lambda$4$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$4$0(SheetState.this, coroutineScope2, function06);
                                            return BottomSheetImpl_l84tTqM$lambda$4$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                    Function0 function01022 = (Function0) rememberedValue4;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Function0<Unit> function01122 = function06;
                                    float f1022 = m2554getSheetMaxWidthD9Ej5fM;
                                    Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(SizeKt.m1278widthInVpY3zN4$default(modifier2, 0.0f, m2554getSheetMaxWidthD9Ej5fM, 1, null), 0.0f, 1, null);
                                    if (!z2) {
                                    }
                                    Modifier then22 = fillMaxWidth$default22.then(companion);
                                    AnchoredDraggableState<SheetValue> anchoredDraggableState$material3222 = sheetState2.getAnchoredDraggableState$material3();
                                    Orientation orientation22 = Orientation.Vertical;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251189907, str2);
                                    if (i26 <= 256) {
                                    }
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (!z8) {
                                    }
                                    rememberedValue5 = new Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Pair BottomSheetImpl_l84tTqM$lambda$6$0;
                                            BottomSheetImpl_l84tTqM$lambda$6$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$6$0(SheetState.this, (IntSize) obj, (Constraints) obj2);
                                            return BottomSheetImpl_l84tTqM$lambda$6$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Modifier anchoredDraggable$default22 = AnchoredDraggableKt.anchoredDraggable$default(DraggableAnchorsKt.draggableAnchors(then22, anchoredDraggableState$material3222, orientation22, (Function2) rememberedValue5), sheetState2.getAnchoredDraggableState$material3(), Orientation.Vertical, (z2 || sheetState2.getCurrentValue() == SheetValue.Hidden) ? false : true, null, null, sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$12, 24, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251245882, str2);
                                    changed3 = startRestartGroup.changed(m4895getString2EP1pXo);
                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (!changed3) {
                                    }
                                    rememberedValue6 = new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda16
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit BottomSheetImpl_l84tTqM$lambda$7$0;
                                            BottomSheetImpl_l84tTqM$lambda$7$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$7$0(m4895getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                                            return BottomSheetImpl_l84tTqM$lambda$7$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final SheetState sheetState422 = sheetState2;
                                    final boolean z1022 = z2;
                                    final Function2 function2722 = m2836getLambda$2061828736$material3;
                                    int i2822 = i17 >> 15;
                                    Shape shape522 = shape4;
                                    SurfaceKt.m4112SurfaceT9BRK9s(verticalScaleUp(sheetPredictiveBackScaling(SemanticsModifierKt.semantics$default(anchoredDraggable$default22, false, (Function1) rememberedValue6, 1, null), sheetState2, f), sheetState2), shape522, j7, j6, m2552getElevationD9Ej5fM, f9, null, ComposableLambdaKt.rememberComposableLambda(623721295, true, new Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda17
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit BottomSheetImpl_l84tTqM$lambda$8;
                                            BottomSheetImpl_l84tTqM$lambda$8 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$8(Function2.this, f, sheetState422, function2722, function07, coroutineScope2, z1022, function3, (Composer) obj, ((Integer) obj2).intValue());
                                            return BottomSheetImpl_l84tTqM$lambda$8;
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, (i2822 & 57344) | (i2822 & 112) | 12582912 | (i2822 & 896) | (i2822 & 7168) | ((i27 << 15) & 458752), 64);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composer2 = startRestartGroup;
                                    modifier3 = modifier2;
                                    f6 = f1022;
                                    j3 = j7;
                                    shape2 = shape522;
                                    f7 = m2552getElevationD9Ej5fM;
                                    z3 = z2;
                                    function24 = m2836getLambda$2061828736$material3;
                                    j4 = j6;
                                    function23 = function26;
                                    sheetState3 = sheetState2;
                                    f8 = f9;
                                    function03 = function01122;
                                }
                            } else {
                                function05 = function02;
                            }
                            z4 = true;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z4) {
                            }
                            rememberedValue = new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    float BottomSheetImpl_l84tTqM$lambda$2$0;
                                    BottomSheetImpl_l84tTqM$lambda$2$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$2$0(SheetState.this, ((Float) obj).floatValue());
                                    return Float.valueOf(BottomSheetImpl_l84tTqM$lambda$2$0);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            TargetedFlingBehavior flingBehavior2 = anchoredDraggableDefaults.flingBehavior(anchoredDraggableState$material3, (Function1) rememberedValue, defaultSpatialSpec, startRestartGroup, AnchoredDraggableDefaults.$stable << 9, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251083050, str2);
                            changed = startRestartGroup.changed(flingBehavior2);
                            if (i26 > 256) {
                            }
                            z5 = changed;
                            if ((i17 & 384) != 256) {
                            }
                            z6 = true;
                            changed2 = z5 | z6 | startRestartGroup.changed(viewConfiguration) | startRestartGroup.changed(density);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (changed2) {
                            }
                            Function0<Unit> function0922 = function05;
                            rememberedValue2 = new SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1(viewConfiguration, sheetState2, density, flingBehavior2, function0922);
                            function06 = function0922;
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1 = (SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            }
                            final CoroutineScope coroutineScope22 = (CoroutineScope) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251153419, str2);
                            if (i26 > 256) {
                            }
                            sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$12 = sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1;
                            if ((i17 & 384) != 256) {
                            }
                            z7 = true;
                            changedInstance = z7 | startRestartGroup.changedInstance(coroutineScope22) | ((i17 & 7168) != 2048);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changedInstance) {
                            }
                            rememberedValue4 = new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit BottomSheetImpl_l84tTqM$lambda$4$0;
                                    BottomSheetImpl_l84tTqM$lambda$4$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$4$0(SheetState.this, coroutineScope22, function06);
                                    return BottomSheetImpl_l84tTqM$lambda$4$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                            Function0 function010222 = (Function0) rememberedValue4;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Function0<Unit> function011222 = function06;
                            float f10222 = m2554getSheetMaxWidthD9Ej5fM;
                            Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(SizeKt.m1278widthInVpY3zN4$default(modifier2, 0.0f, m2554getSheetMaxWidthD9Ej5fM, 1, null), 0.0f, 1, null);
                            if (!z2) {
                            }
                            Modifier then222 = fillMaxWidth$default222.then(companion);
                            AnchoredDraggableState<SheetValue> anchoredDraggableState$material32222 = sheetState2.getAnchoredDraggableState$material3();
                            Orientation orientation222 = Orientation.Vertical;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251189907, str2);
                            if (i26 <= 256) {
                            }
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!z8) {
                            }
                            rememberedValue5 = new Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Pair BottomSheetImpl_l84tTqM$lambda$6$0;
                                    BottomSheetImpl_l84tTqM$lambda$6$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$6$0(SheetState.this, (IntSize) obj, (Constraints) obj2);
                                    return BottomSheetImpl_l84tTqM$lambda$6$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier anchoredDraggable$default222 = AnchoredDraggableKt.anchoredDraggable$default(DraggableAnchorsKt.draggableAnchors(then222, anchoredDraggableState$material32222, orientation222, (Function2) rememberedValue5), sheetState2.getAnchoredDraggableState$material3(), Orientation.Vertical, (z2 || sheetState2.getCurrentValue() == SheetValue.Hidden) ? false : true, null, null, sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$12, 24, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 251245882, str2);
                            changed3 = startRestartGroup.changed(m4895getString2EP1pXo);
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (!changed3) {
                            }
                            rememberedValue6 = new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit BottomSheetImpl_l84tTqM$lambda$7$0;
                                    BottomSheetImpl_l84tTqM$lambda$7$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$7$0(m4895getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                                    return BottomSheetImpl_l84tTqM$lambda$7$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final SheetState sheetState4222 = sheetState2;
                            final boolean z10222 = z2;
                            final Function2 function27222 = m2836getLambda$2061828736$material3;
                            int i28222 = i17 >> 15;
                            Shape shape5222 = shape4;
                            SurfaceKt.m4112SurfaceT9BRK9s(verticalScaleUp(sheetPredictiveBackScaling(SemanticsModifierKt.semantics$default(anchoredDraggable$default222, false, (Function1) rememberedValue6, 1, null), sheetState2, f), sheetState2), shape5222, j7, j6, m2552getElevationD9Ej5fM, f9, null, ComposableLambdaKt.rememberComposableLambda(623721295, true, new Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda17
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BottomSheetImpl_l84tTqM$lambda$8;
                                    BottomSheetImpl_l84tTqM$lambda$8 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$8(Function2.this, f, sheetState4222, function27222, function07, coroutineScope22, z10222, function3, (Composer) obj, ((Integer) obj2).intValue());
                                    return BottomSheetImpl_l84tTqM$lambda$8;
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i28222 & 57344) | (i28222 & 112) | 12582912 | (i28222 & 896) | (i28222 & 7168) | ((i27 << 15) & 458752), 64);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = startRestartGroup;
                            modifier3 = modifier2;
                            f6 = f10222;
                            j3 = j7;
                            shape2 = shape5222;
                            f7 = m2552getElevationD9Ej5fM;
                            z3 = z2;
                            function24 = m2836getLambda$2061828736$material3;
                            j4 = j6;
                            function23 = function26;
                            sheetState3 = sheetState2;
                            f8 = f9;
                            function03 = function011222;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            shape2 = shape;
                            function23 = function22;
                            composer2 = startRestartGroup;
                            function03 = function02;
                            f6 = f5;
                            modifier3 = modifier2;
                            sheetState3 = sheetState2;
                            z3 = z2;
                            j3 = j;
                            j4 = j2;
                            f7 = f3;
                            f8 = f4;
                            function24 = function2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BottomSheetImpl_l84tTqM$lambda$9;
                                    BottomSheetImpl_l84tTqM$lambda$9 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$9(f, modifier3, sheetState3, function03, f6, z3, shape2, j3, j4, f7, f8, function24, function23, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return BottomSheetImpl_l84tTqM$lambda$9;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i14 = i13;
                    if ((i2 & 384) == 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    i15 = i12;
                    if (startRestartGroup.shouldExecute((i8 & 306783379) == 306783378 || (i15 & 1171) != 1170, i8 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f5 = f2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                i13 = i3 & 2048;
                if (i13 == 0) {
                }
                i14 = i13;
                if ((i2 & 384) == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                i15 = i12;
                if (startRestartGroup.shouldExecute((i8 & 306783379) == 306783378 || (i15 & 1171) != 1170, i8 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function02 = function0;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            f5 = f2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            i13 = i3 & 2048;
            if (i13 == 0) {
            }
            i14 = i13;
            if ((i2 & 384) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            i15 = i12;
            if (startRestartGroup.shouldExecute((i8 & 306783379) == 306783378 || (i15 & 1171) != 1170, i8 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        function02 = function0;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        f5 = f2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i13 = i3 & 2048;
        if (i13 == 0) {
        }
        i14 = i13;
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        i15 = i12;
        if (startRestartGroup.shouldExecute((i8 & 306783379) == 306783378 || (i15 & 1171) != 1170, i8 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BottomSheetImpl_l84tTqM$lambda$2$0(SheetState sheetState, float f) {
        return sheetState.getPositionalThreshold$material3().invoke().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetImpl_l84tTqM$lambda$4$0(final SheetState sheetState, CoroutineScope coroutineScope, final Function0 function0) {
        Job launch$default;
        if (sheetState.getConfirmValueChange$material3().invoke(SheetValue.Hidden).booleanValue()) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SheetDefaultsKt$BottomSheetImpl$animateToDismiss$1$1$1(sheetState, null), 3, null);
            launch$default.invokeOnCompletion(new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit BottomSheetImpl_l84tTqM$lambda$4$0$0;
                    BottomSheetImpl_l84tTqM$lambda$4$0$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$4$0$0(SheetState.this, function0, (Throwable) obj);
                    return BottomSheetImpl_l84tTqM$lambda$4$0$0;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetImpl_l84tTqM$lambda$4$0$0(SheetState sheetState, Function0 function0, Throwable th) {
        if (!sheetState.isVisible()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair BottomSheetImpl_l84tTqM$lambda$6$0(final SheetState sheetState, final IntSize intSize, Constraints constraints) {
        SheetValue sheetValue;
        final float m9674getMaxHeightimpl = Constraints.m9674getMaxHeightimpl(constraints.getValue());
        DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BottomSheetImpl_l84tTqM$lambda$6$0$0;
                BottomSheetImpl_l84tTqM$lambda$6$0$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$6$0$0(m9674getMaxHeightimpl, intSize, sheetState, (DraggableAnchorsConfig) obj);
                return BottomSheetImpl_l84tTqM$lambda$6$0$0;
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$0[sheetState.getTargetValue().ordinal()];
        if (i == 1) {
            sheetValue = SheetValue.Hidden;
        } else if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sheetValue = DraggableAnchors.hasPositionFor(SheetValue.Expanded) ? SheetValue.Expanded : SheetValue.Hidden;
        } else if (DraggableAnchors.hasPositionFor(SheetValue.PartiallyExpanded)) {
            sheetValue = SheetValue.PartiallyExpanded;
        } else {
            sheetValue = DraggableAnchors.hasPositionFor(SheetValue.Expanded) ? SheetValue.Expanded : SheetValue.Hidden;
        }
        return TuplesKt.to(DraggableAnchors, sheetValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetImpl_l84tTqM$lambda$6$0$0(float f, IntSize intSize, SheetState sheetState, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(SheetValue.Hidden, f);
        if (((int) (intSize.m9911unboximpl() & 4294967295L)) > f / 2 && !sheetState.getSkipPartiallyExpanded()) {
            draggableAnchorsConfig.at(SheetValue.PartiallyExpanded, f / 2.0f);
        }
        if (((int) (intSize.m9911unboximpl() & 4294967295L)) != 0) {
            draggableAnchorsConfig.at(SheetValue.Expanded, Math.max(0.0f, f - ((int) (intSize.m9911unboximpl() & 4294967295L))));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetImpl_l84tTqM$lambda$7$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 0.0f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetImpl_l84tTqM$lambda$8(Function2 function2, float f, final SheetState sheetState, Function2 function22, final Function0 function0, final CoroutineScope coroutineScope, final boolean z, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C375@17338L21,373@17257L2986:SheetDefaults.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(623721295, i, -1, "androidx.compose.material3.BottomSheetImpl.<anonymous> (SheetDefaults.kt:373)");
            }
            Modifier verticalScaleDown = verticalScaleDown(contentPredictiveBackScaling(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (WindowInsets) function2.invoke(composer, 0)), f), sheetState);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, verticalScaleDown);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 611673874, "C425@20224L9:SheetDefaults.kt#uh7d8r");
            if (function22 != null) {
                composer.startReplaceGroup(611696255);
                ComposerKt.sourceInformation(composer, "383@17793L54,384@17889L48,385@17978L47,388@18139L355,395@18559L1577,386@18042L2155");
                Strings.Companion companion = Strings.INSTANCE;
                final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_bottom_sheet_collapse_description), composer, 0);
                Strings.Companion companion2 = Strings.INSTANCE;
                final String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_bottom_sheet_dismiss_description), composer, 0);
                Strings.Companion companion3 = Strings.INSTANCE;
                final String m4895getString2EP1pXo3 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_bottom_sheet_expand_description), composer, 0);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 1959405160, "CC(remember):SheetDefaults.kt#9igjgp");
                boolean changed = composer.changed(sheetState) | composer.changed(function0) | composer.changedInstance(coroutineScope);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit BottomSheetImpl_l84tTqM$lambda$8$0$0$0;
                            BottomSheetImpl_l84tTqM$lambda$8$0$0$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$8$0$0$0(SheetState.this, function0, coroutineScope);
                            return BottomSheetImpl_l84tTqM$lambda$8$0$0$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier m399clickableoSLSa3U$default = ClickableKt.m399clickableoSLSa3U$default(companion4, false, null, null, null, (Function0) rememberedValue, 15, null);
                ComposerKt.sourceInformationMarkerStart(composer, 1959419822, "CC(remember):SheetDefaults.kt#9igjgp");
                boolean changed2 = composer.changed(z) | composer.changed(sheetState) | composer.changed(m4895getString2EP1pXo2) | composer.changed(function0) | composer.changed(m4895getString2EP1pXo3) | composer.changedInstance(coroutineScope) | composer.changed(m4895getString2EP1pXo);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit BottomSheetImpl_l84tTqM$lambda$8$0$1$0;
                            BottomSheetImpl_l84tTqM$lambda$8$0$1$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$8$0$1$0(z, sheetState, m4895getString2EP1pXo2, m4895getString2EP1pXo3, m4895getString2EP1pXo, function0, coroutineScope, (SemanticsPropertyReceiver) obj2);
                            return BottomSheetImpl_l84tTqM$lambda$8$0$1$0;
                        }
                    };
                    composer.updateRememberedValue(obj);
                    rememberedValue2 = obj;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                DragHandleWithTooltip(SemanticsModifierKt.semantics(m399clickableoSLSa3U$default, true, (Function1) rememberedValue2), function22, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(614062237);
                composer.endReplaceGroup();
            }
            function3.invoke(columnScopeInstance, composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetImpl_l84tTqM$lambda$8$0$0$0(SheetState sheetState, Function0 function0, CoroutineScope coroutineScope) {
        int i = WhenMappings.$EnumSwitchMapping$0[sheetState.getCurrentValue().ordinal()];
        if (i == 2) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SheetDefaultsKt$BottomSheetImpl$6$1$1$1$1(sheetState, null), 3, null);
        } else if (i != 3) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SheetDefaultsKt$BottomSheetImpl$6$1$1$1$2(sheetState, null), 3, null);
        } else {
            function0.invoke();
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetImpl_l84tTqM$lambda$8$0$1$0(boolean z, final SheetState sheetState, String str, String str2, String str3, final Function0 function0, final CoroutineScope coroutineScope, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (z) {
            SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str, new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$0;
                    BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$0 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$0(Function0.this);
                    return Boolean.valueOf(BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$0);
                }
            });
            if (sheetState.getCurrentValue() == SheetValue.PartiallyExpanded) {
                SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str2, new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$1;
                        BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$1 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$1(SheetState.this, coroutineScope, sheetState);
                        return Boolean.valueOf(BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$1);
                    }
                });
            } else if (sheetState.getHasPartiallyExpandedState()) {
                SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str3, new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$2;
                        BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$2 = SheetDefaultsKt.BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$2(SheetState.this, coroutineScope);
                        return Boolean.valueOf(BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$2);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$0(Function0 function0) {
        function0.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$1(SheetState sheetState, CoroutineScope coroutineScope, SheetState sheetState2) {
        if (!sheetState.getConfirmValueChange$material3().invoke(SheetValue.Expanded).booleanValue()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SheetDefaultsKt$BottomSheetImpl$6$1$2$1$1$2$1(sheetState2, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BottomSheetImpl_l84tTqM$lambda$8$0$1$0$0$2(SheetState sheetState, CoroutineScope coroutineScope) {
        if (!sheetState.getConfirmValueChange$material3().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SheetDefaultsKt$BottomSheetImpl$6$1$2$1$1$3$1(sheetState, null), 3, null);
        return true;
    }

    public static final void DragHandleWithTooltip(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1361920385);
        ComposerKt.sourceInformation(startRestartGroup, "C(DragHandleWithTooltip)N(modifier,content)852@37874L51,853@37930L408:SheetDefaults.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1361920385, i2, -1, "androidx.compose.material3.DragHandleWithTooltip (SheetDefaults.kt:851)");
            }
            Strings.Companion companion = Strings.INSTANCE;
            final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_bottom_sheet_drag_handle_description), startRestartGroup, 0);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(startRestartGroup);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 124564130, "C857@38114L60,859@38268L22,858@38198L48,854@38006L326:SheetDefaults.kt#uh7d8r");
            composer2 = startRestartGroup;
            TooltipKt.TooltipBox(TooltipDefaults.INSTANCE.m4536rememberTooltipPositionProviderHu5FAss(TooltipAnchorPosition.INSTANCE.m4523getAbovelOKsHw4(), 0.0f, composer2, 390, 2), ComposableLambdaKt.rememberComposableLambda(1497042086, true, new Function3() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit DragHandleWithTooltip$lambda$0$0;
                    DragHandleWithTooltip$lambda$0$0 = SheetDefaultsKt.DragHandleWithTooltip$lambda$0$0(m4895getString2EP1pXo, (TooltipScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return DragHandleWithTooltip$lambda$0$0;
                }
            }, startRestartGroup, 54), TooltipKt.rememberTooltipState(false, false, null, composer2, 0, 7), modifier, null, false, false, false, function2, startRestartGroup, ((i2 << 9) & 7168) | 48 | ((i2 << 21) & 234881024), 240);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DragHandleWithTooltip$lambda$1;
                    DragHandleWithTooltip$lambda$1 = SheetDefaultsKt.DragHandleWithTooltip$lambda$1(Modifier.this, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DragHandleWithTooltip$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DragHandleWithTooltip$lambda$0$0(final String str, TooltipScope tooltipScope, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "C858@38213L31,858@38200L44:SheetDefaults.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(tooltipScope) : composer.changedInstance(tooltipScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1497042086, i2, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous> (SheetDefaults.kt:858)");
            }
            TooltipKt.m4544PlainTooltipgv3ox5I(tooltipScope, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(435848468, true, new Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DragHandleWithTooltip$lambda$0$0$0;
                    DragHandleWithTooltip$lambda$0$0$0 = SheetDefaultsKt.DragHandleWithTooltip$lambda$0$0$0(str, (Composer) obj, ((Integer) obj2).intValue());
                    return DragHandleWithTooltip$lambda$0$0$0;
                }
            }, composer, 54), composer, (i2 & 14) | 805306368, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DragHandleWithTooltip$lambda$0$0$0(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C858@38215L27:SheetDefaults.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(435848468, i, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous>.<anonymous> (SheetDefaults.kt:858)");
            }
            TextKt.m4292TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(SheetState sheetState, Orientation orientation, FlingBehavior flingBehavior) {
        return new SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(sheetState, flingBehavior, orientation);
    }

    /* renamed from: rememberSheetState-AGcomas, reason: not valid java name */
    public static final SheetState m3945rememberSheetStateAGcomas(boolean z, Function1<? super SheetValue, Boolean> function1, SheetValue sheetValue, boolean z2, float f, float f2, Composer composer, int i, int i2) {
        final Function1<? super SheetValue, Boolean> function12;
        ComposerKt.sourceInformationMarkerStart(composer, -20307384, "C(rememberSheetState)N(skipPartiallyExpanded,confirmValueChange,initialValue,skipHiddenState,positionalThreshold:c#ui.unit.Dp,velocityThreshold:c#ui.unit.Dp)929@40958L8,935@41230L7,936@41272L48,937@41353L46,950@41873L231,938@41411L693:SheetDefaults.kt#uh7d8r");
        final boolean z3 = (i2 & 1) != 0 ? false : z;
        if ((i2 & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 1959444240, "CC(remember):SheetDefaults.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean rememberSheetState_AGcomas$lambda$0$0;
                        rememberSheetState_AGcomas$lambda$0$0 = SheetDefaultsKt.rememberSheetState_AGcomas$lambda$0$0((SheetValue) obj);
                        return Boolean.valueOf(rememberSheetState_AGcomas$lambda$0$0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            function12 = (Function1) rememberedValue;
        } else {
            function12 = function1;
        }
        final SheetValue sheetValue2 = (i2 & 4) != 0 ? SheetValue.Hidden : sheetValue;
        final boolean z4 = (i2 & 8) != 0 ? false : z2;
        final float m2553getPositionalThresholdD9Ej5fM$material3 = (i2 & 16) != 0 ? BottomSheetDefaults.INSTANCE.m2553getPositionalThresholdD9Ej5fM$material3() : f;
        final float m2556getVelocityThresholdD9Ej5fM$material3 = (i2 & 32) != 0 ? BottomSheetDefaults.INSTANCE.m2556getVelocityThresholdD9Ej5fM$material3() : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20307384, i, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:934)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) consume;
        ComposerKt.sourceInformationMarkerStart(composer, 1959454328, "CC(remember):SheetDefaults.kt#9igjgp");
        boolean z5 = true;
        boolean changed = composer.changed(density) | ((((57344 & i) ^ 24576) > 16384 && composer.changed(m2553getPositionalThresholdD9Ej5fM$material3)) || (i & 24576) == 16384);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    float mo528toPx0680j_4;
                    mo528toPx0680j_4 = Density.this.mo528toPx0680j_4(m2553getPositionalThresholdD9Ej5fM$material3);
                    return Float.valueOf(mo528toPx0680j_4);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        final Function0<Float> function0 = (Function0) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1959456918, "CC(remember):SheetDefaults.kt#9igjgp");
        boolean changed2 = composer.changed(density) | ((((458752 & i) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(m2556getVelocityThresholdD9Ej5fM$material3)) || (i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    float mo528toPx0680j_4;
                    mo528toPx0680j_4 = Density.this.mo528toPx0680j_4(m2556getVelocityThresholdD9Ej5fM$material3);
                    return Float.valueOf(mo528toPx0680j_4);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        final Function0<Float> function02 = (Function0) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(composer);
        Object[] objArr = {Boolean.valueOf(z3), function12, Boolean.valueOf(z4)};
        Saver<SheetState, SheetValue> Saver = SheetState.INSTANCE.Saver(z3, function0, function02, function12, z4);
        ComposerKt.sourceInformationMarkerStart(composer, 1959473743, "CC(remember):SheetDefaults.kt#9igjgp");
        boolean changed3 = ((((i & 14) ^ 6) > 4 && composer.changed(z3)) || (i & 6) == 4) | composer.changed(function0) | composer.changed(function02) | ((((i & 896) ^ 384) > 256 && composer.changed(sheetValue2.ordinal())) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && composer.changed(function12)) || (i & 48) == 32);
        if ((((i & 7168) ^ 3072) <= 2048 || !composer.changed(z4)) && (i & 3072) != 2048) {
            z5 = false;
        }
        boolean z6 = changed3 | z5;
        Object rememberedValue4 = composer.rememberedValue();
        if (z6 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    SheetState rememberSheetState_AGcomas$lambda$3$0;
                    rememberSheetState_AGcomas$lambda$3$0 = SheetDefaultsKt.rememberSheetState_AGcomas$lambda$3$0(z3, function0, function02, sheetValue2, function12, z4);
                    return rememberSheetState_AGcomas$lambda$3$0;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue4 = obj;
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SheetState sheetState = (SheetState) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue4, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return sheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SheetState rememberSheetState_AGcomas$lambda$3$0(boolean z, Function0 function0, Function0 function02, SheetValue sheetValue, Function1 function1, boolean z2) {
        return new SheetState(z, function0, function02, sheetValue, function1, z2);
    }

    public static final float calculateSheetPredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.getSize() >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo528toPx0680j_4(PredictiveBackMaxScaleXDistance), intBitsToFloat), f) / intBitsToFloat);
    }

    public static final float calculateSheetPredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo528toPx0680j_4(PredictiveBackMaxScaleYDistance), intBitsToFloat), f) / intBitsToFloat);
    }

    public static final Modifier sheetPredictiveBackScaling(Modifier modifier, final SheetState sheetState, final float f) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit sheetPredictiveBackScaling$lambda$0;
                sheetPredictiveBackScaling$lambda$0 = SheetDefaultsKt.sheetPredictiveBackScaling$lambda$0(SheetState.this, f, (GraphicsLayerScope) obj);
                return sheetPredictiveBackScaling$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sheetPredictiveBackScaling$lambda$0(SheetState sheetState, float f, GraphicsLayerScope graphicsLayerScope) {
        float offset = sheetState.getAnchoredDraggableState$material3().getOffset();
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L));
        if (!Float.isNaN(offset) && !Float.isNaN(intBitsToFloat) && intBitsToFloat != 0.0f) {
            graphicsLayerScope.setScaleX(calculateSheetPredictiveBackScaleX(graphicsLayerScope, f));
            graphicsLayerScope.setScaleY(calculateSheetPredictiveBackScaleY(graphicsLayerScope, f));
            graphicsLayerScope.mo6968setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, (offset + intBitsToFloat) / intBitsToFloat));
        }
        return Unit.INSTANCE;
    }

    public static final Modifier contentPredictiveBackScaling(Modifier modifier, final float f) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit contentPredictiveBackScaling$lambda$0;
                contentPredictiveBackScaling$lambda$0 = SheetDefaultsKt.contentPredictiveBackScaling$lambda$0(f, (GraphicsLayerScope) obj);
                return contentPredictiveBackScaling$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit contentPredictiveBackScaling$lambda$0(float f, GraphicsLayerScope graphicsLayerScope) {
        float calculateSheetPredictiveBackScaleX = calculateSheetPredictiveBackScaleX(graphicsLayerScope, f);
        float calculateSheetPredictiveBackScaleY = calculateSheetPredictiveBackScaleY(graphicsLayerScope, f);
        graphicsLayerScope.setScaleY(calculateSheetPredictiveBackScaleY == 0.0f ? 1.0f : calculateSheetPredictiveBackScaleX / calculateSheetPredictiveBackScaleY);
        graphicsLayerScope.mo6968setTransformOrigin__ExYCQ(PredictiveBackChildTransformOrigin);
        return Unit.INSTANCE;
    }

    public static final Modifier verticalScaleUp(Modifier modifier, final SheetState sheetState) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit verticalScaleUp$lambda$0;
                verticalScaleUp$lambda$0 = SheetDefaultsKt.verticalScaleUp$lambda$0(SheetState.this, (GraphicsLayerScope) obj);
                return verticalScaleUp$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verticalScaleUp$lambda$0(SheetState sheetState, GraphicsLayerScope graphicsLayerScope) {
        float offset = sheetState.getAnchoredDraggableState$material3().getOffset();
        float minPosition = sheetState.getAnchoredDraggableState$material3().getAnchors().minPosition();
        float f = offset < minPosition ? minPosition - offset : 0.0f;
        graphicsLayerScope.setScaleY(f > 0.0f ? (Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L)) + f) / Float.intBitsToFloat((int) (4294967295L & graphicsLayerScope.getSize())) : 1.0f);
        graphicsLayerScope.mo6968setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, 0.0f));
        return Unit.INSTANCE;
    }

    public static final Modifier verticalScaleDown(Modifier modifier, final SheetState sheetState) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit verticalScaleDown$lambda$0;
                verticalScaleDown$lambda$0 = SheetDefaultsKt.verticalScaleDown$lambda$0(SheetState.this, (GraphicsLayerScope) obj);
                return verticalScaleDown$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verticalScaleDown$lambda$0(SheetState sheetState, GraphicsLayerScope graphicsLayerScope) {
        float offset = sheetState.getAnchoredDraggableState$material3().getOffset();
        float minPosition = sheetState.getAnchoredDraggableState$material3().getAnchors().minPosition();
        float f = offset < minPosition ? minPosition - offset : 0.0f;
        graphicsLayerScope.setScaleY(f > 0.0f ? 1 / ((Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L)) + f) / Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L))) : 1.0f);
        graphicsLayerScope.mo6968setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, 0.0f));
        return Unit.INSTANCE;
    }

    public static final AnimationSpec<Float> getBottomSheetAnimationSpec() {
        return BottomSheetAnimationSpec;
    }

    public static final long getPredictiveBackChildTransformOrigin() {
        return PredictiveBackChildTransformOrigin;
    }
}
