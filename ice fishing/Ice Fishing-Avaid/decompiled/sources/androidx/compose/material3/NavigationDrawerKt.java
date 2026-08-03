package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NavigationDrawer.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a]\u0010\b\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aQ\u0010\u0016\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u0017\u001a=\u0010\u0018\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u0019\u001ai\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\f¢\u0006\u0002\b$H\u0007¢\u0006\u0004\b%\u0010&\u001aq\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\f¢\u0006\u0002\b$H\u0007¢\u0006\u0004\b'\u0010(\u001ai\u0010)\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\f¢\u0006\u0002\b$H\u0007¢\u0006\u0004\b*\u0010&\u001aq\u0010)\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\f¢\u0006\u0002\b$H\u0007¢\u0006\u0004\b+\u0010(\u001ai\u0010,\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\f¢\u0006\u0002\b$H\u0007¢\u0006\u0004\b-\u0010&\u001a{\u0010.\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00101\u001a\u0002022\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\f¢\u0006\u0002\b$H\u0001¢\u0006\u0004\b3\u00104\u001a$\u00105\u001a\u00020\u000e*\u00020\u000e2\u0006\u00101\u001a\u0002022\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0006H\u0002\u001a$\u00109\u001a\u00020\u000e*\u00020\u000e2\u0006\u00101\u001a\u0002022\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0006H\u0002\u001a\u001c\u0010:\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010/\u001a\u0002002\u0006\u00108\u001a\u00020\u0006H\u0002\u001a\u001c\u0010;\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010/\u001a\u0002002\u0006\u00108\u001a\u00020\u0006H\u0002\u001a\u0014\u0010<\u001a\u000207*\u00020=2\u0006\u0010/\u001a\u000200H\u0002\u001a\u0014\u0010>\u001a\u000207*\u00020=2\u0006\u0010/\u001a\u000200H\u0002\u001a.\u0010?\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00012\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\fH\u0001¢\u0006\u0002\u0010@\u001a\u008e\u0001\u0010A\u001a\u00020\t2\u0011\u0010B\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\f2\u0006\u0010C\u001a\u00020\u00062\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0015\b\u0002\u0010E\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010F\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010G\u001a\u00020\u001c2\b\b\u0002\u0010H\u001a\u00020I2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010KH\u0007¢\u0006\u0002\u0010L\u001a \u0010M\u001a\u0002072\u0006\u0010N\u001a\u0002072\u0006\u0010O\u001a\u0002072\u0006\u0010P\u001a\u000207H\u0002\"\u000e\u0010Q\u001a\u000207X\u0082D¢\u0006\u0002\n\u0000\"\u0010\u0010R\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010S\"\u0010\u0010T\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010S\"\u0016\u0010U\u001a\u00020 X\u0080\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\bV\u0010W\"\u0016\u0010X\u001a\u00020 X\u0080\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\bY\u0010W\"\u0016\u0010Z\u001a\u00020 X\u0080\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\b[\u0010W\"\u0014\u0010\\\u001a\b\u0012\u0004\u0012\u0002070]X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006^²\u0006\n\u0010_\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010`\u001a\u000207X\u008a\u008e\u0002²\u0006\n\u0010_\u001a\u00020\u0006X\u008a\u008e\u0002"}, d2 = {"rememberDrawerState", "Landroidx/compose/material3/DrawerState;", "initialValue", "Landroidx/compose/material3/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;", "ModalNavigationDrawer", "", "drawerContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "drawerState", "gesturesEnabled", "scrimColor", "Landroidx/compose/ui/graphics/Color;", "content", "ModalNavigationDrawer-FHprtrg", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DismissibleNavigationDrawer", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PermanentNavigationDrawer", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalDrawerSheet", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerContainerColor", "drawerContentColor", "drawerTonalElevation", "Landroidx/compose/ui/unit/Dp;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalDrawerSheet-afqeVBk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ModalDrawerSheet-Snr_uVM", "(Landroidx/compose/material3/DrawerState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DismissibleDrawerSheet", "DismissibleDrawerSheet-afqeVBk", "DismissibleDrawerSheet-Snr_uVM", "PermanentDrawerSheet", "PermanentDrawerSheet-afqeVBk", "DrawerSheet", "drawerPredictiveBackState", "Landroidx/compose/material3/DrawerPredictiveBackState;", "drawerOffset", "Landroidx/compose/material3/internal/FloatProducer;", "DrawerSheet-cm3T3N0", "(Landroidx/compose/material3/DrawerPredictiveBackState;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/material3/internal/FloatProducer;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "horizontalScaleUp", "drawerWidth", "", "isRtl", "horizontalScaleDown", "predictiveBackDrawerContainer", "predictiveBackDrawerChild", "calculatePredictiveBackScaleX", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "calculatePredictiveBackScaleY", "DrawerPredictiveBackHandler", "(Landroidx/compose/material3/DrawerState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "NavigationDrawerItem", "label", "selected", "onClick", "icon", "badge", "shape", "colors", "Landroidx/compose/material3/NavigationDrawerItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "calculateFraction", "a", "b", "pos", "DrawerPositionalThreshold", "DrawerVelocityThreshold", "F", "MinimumDrawerWidth", "PredictiveBackDrawerMaxScaleXDistanceGrow", "getPredictiveBackDrawerMaxScaleXDistanceGrow", "()F", "PredictiveBackDrawerMaxScaleXDistanceShrink", "getPredictiveBackDrawerMaxScaleXDistanceShrink", "PredictiveBackDrawerMaxScaleYDistance", "getPredictiveBackDrawerMaxScaleYDistance", "AnchoredDraggableDefaultAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "material3", "anchorsInitialized", "minValue"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class NavigationDrawerKt {
    private static final float DrawerPositionalThreshold = 0.5f;
    private static final float DrawerVelocityThreshold = Dp.m9732constructorimpl(400);
    private static final float MinimumDrawerWidth = Dp.m9732constructorimpl(240);
    private static final float PredictiveBackDrawerMaxScaleXDistanceGrow = Dp.m9732constructorimpl(12);
    private static final float PredictiveBackDrawerMaxScaleXDistanceShrink = Dp.m9732constructorimpl(24);
    private static final float PredictiveBackDrawerMaxScaleYDistance = Dp.m9732constructorimpl(48);
    private static final TweenSpec<Float> AnchoredDraggableDefaultAnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DismissibleDrawerSheet_Snr_uVM$lambda$1(DrawerState drawerState, Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3627DismissibleDrawerSheetSnr_uVM(drawerState, modifier, shape, j, j2, f, windowInsets, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DismissibleDrawerSheet_afqeVBk$lambda$0(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3628DismissibleDrawerSheetafqeVBk(modifier, shape, j, j2, f, windowInsets, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DismissibleNavigationDrawer$lambda$7(Function2 function2, Modifier modifier, DrawerState drawerState, boolean z, Function2 function22, int i, int i2, Composer composer, int i3) {
        DismissibleNavigationDrawer(function2, modifier, drawerState, z, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerPredictiveBackHandler$lambda$4(DrawerState drawerState, Function3 function3, int i, Composer composer, int i2) {
        DrawerPredictiveBackHandler(drawerState, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DrawerSheet_cm3T3N0$lambda$0$0() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerSheet_cm3T3N0$lambda$3(DrawerPredictiveBackState drawerPredictiveBackState, WindowInsets windowInsets, Modifier modifier, Shape shape, long j, long j2, float f, FloatProducer floatProducer, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3629DrawerSheetcm3T3N0(drawerPredictiveBackState, windowInsets, modifier, shape, j, j2, f, floatProducer, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalDrawerSheet_Snr_uVM$lambda$1(DrawerState drawerState, Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3630ModalDrawerSheetSnr_uVM(drawerState, modifier, shape, j, j2, f, windowInsets, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalDrawerSheet_afqeVBk$lambda$0(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3631ModalDrawerSheetafqeVBk(modifier, shape, j, j2, f, windowInsets, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalNavigationDrawer_FHprtrg$lambda$10(Function2 function2, Modifier modifier, DrawerState drawerState, boolean z, long j, Function2 function22, int i, int i2, Composer composer, int i3) {
        m3632ModalNavigationDrawerFHprtrg(function2, modifier, drawerState, z, j, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationDrawerItem$lambda$2(Function2 function2, boolean z, Function0 function0, Modifier modifier, Function2 function22, Function2 function23, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        NavigationDrawerItem(function2, z, function0, modifier, function22, function23, shape, navigationDrawerItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermanentDrawerSheet_afqeVBk$lambda$1(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3633PermanentDrawerSheetafqeVBk(modifier, shape, j, j2, f, windowInsets, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermanentNavigationDrawer$lambda$1(Function2 function2, Modifier modifier, Function2 function22, int i, int i2, Composer composer, int i3) {
        PermanentNavigationDrawer(function2, modifier, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberDrawerState$lambda$0$0(DrawerValue drawerValue) {
        return true;
    }

    public static final DrawerState rememberDrawerState(final DrawerValue drawerValue, final Function1<? super DrawerValue, Boolean> function1, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 2098699222, "C(rememberDrawerState)N(initialValue,confirmStateChange)306@12503L8,308@12605L61,308@12541L125:NavigationDrawer.kt#uh7d8r");
        if ((i2 & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, -1784673346, "CC(remember):NavigationDrawer.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean rememberDrawerState$lambda$0$0;
                        rememberDrawerState$lambda$0$0 = NavigationDrawerKt.rememberDrawerState$lambda$0$0((DrawerValue) obj);
                        return Boolean.valueOf(rememberDrawerState$lambda$0$0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098699222, i, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:307)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.INSTANCE.Saver(function1);
        ComposerKt.sourceInformationMarkerStart(composer, -1784670029, "CC(remember):NavigationDrawer.kt#9igjgp");
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(drawerValue.ordinal())) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(function1)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DrawerState rememberDrawerState$lambda$1$0;
                    rememberDrawerState$lambda$1$0 = NavigationDrawerKt.rememberDrawerState$lambda$1$0(DrawerValue.this, function1);
                    return rememberDrawerState$lambda$1$0;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return drawerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawerState rememberDrawerState$lambda$1$0(DrawerValue drawerValue, Function1 function1) {
        return new DrawerState(drawerValue, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b0, code lost:
    
        if (r10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0334  */
    /* renamed from: ModalNavigationDrawer-FHprtrg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3632ModalNavigationDrawerFHprtrg(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, DrawerState drawerState, boolean z, long j, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DrawerState drawerState2;
        int i4;
        boolean z2;
        long j2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        final DrawerState drawerState3;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        float f;
        final DrawerState drawerState4;
        boolean z4;
        boolean changed;
        Object rememberedValue;
        final DrawerState drawerState5;
        boolean z5;
        Object rememberedValue2;
        boolean changedInstance;
        Object rememberedValue3;
        boolean changed2;
        Object rememberedValue4;
        boolean z6;
        Object rememberedValue5;
        boolean changed3;
        Object rememberedValue6;
        boolean changedInstance2;
        Object rememberedValue7;
        boolean changed4;
        Object rememberedValue8;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1907430816);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalNavigationDrawer)N(drawerContent,modifier,drawerState,gesturesEnabled,scrimColor:c#ui.graphics.Color,content)341@13960L24,342@14010L33,343@14075L7,344@14113L34,345@14168L45,347@14261L29,351@14471L7,352@14565L7,353@14657L7,355@14681L229,355@14670L240,362@14951L178,362@14916L213,369@15168L7,370@15203L4173:NavigationDrawer.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    drawerState2 = drawerState;
                    if (startRestartGroup.changed(drawerState2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    drawerState2 = drawerState;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                drawerState2 = drawerState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        if (startRestartGroup.changed(j2)) {
                            i5 = 16384;
                            i3 |= i5;
                        }
                    } else {
                        j2 = j;
                    }
                    i5 = 8192;
                    i3 |= i5;
                } else {
                    j2 = j;
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
                }
                if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "336@13774L39,338@13891L10");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        companion = modifier2;
                    } else {
                        companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            drawerState2 = rememberDrawerState(DrawerValue.Closed, null, startRestartGroup, 6, 2);
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            j2 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                            i3 &= -57345;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1907430816, i3, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:340)");
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                    Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue9;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Strings.Companion companion2 = Strings.INSTANCE;
                    final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density = (Density) consume;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 910036450, "CC(remember):NavigationDrawer.kt#9igjgp");
                    Object rememberedValue10 = startRestartGroup.rememberedValue();
                    if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue10);
                    }
                    MutableState mutableState = (MutableState) rememberedValue10;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 910038221, "CC(remember):NavigationDrawer.kt#9igjgp");
                    boolean changed5 = startRestartGroup.changed(density);
                    Object rememberedValue11 = startRestartGroup.rememberedValue();
                    if (changed5) {
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                    }
                    rememberedValue11 = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                    final MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue11;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 910041181, "CC(remember):NavigationDrawer.kt#9igjgp");
                    Object rememberedValue12 = startRestartGroup.rememberedValue();
                    if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue12 = new FocusRequester();
                        startRestartGroup.updateRememberedValue(rememberedValue12);
                    }
                    FocusRequester focusRequester = (FocusRequester) rememberedValue12;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final boolean z7 = z2;
                    final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
                    long j3 = j2;
                    final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
                    final FiniteAnimationSpec value3 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 910054821, "CC(remember):NavigationDrawer.kt#9igjgp");
                    int i8 = (i3 & 896) ^ 384;
                    if (i8 <= 256 || !startRestartGroup.changed(drawerState2)) {
                        drawerState4 = drawerState2;
                        if ((i3 & 384) != 256) {
                            z4 = false;
                            changed = z4 | startRestartGroup.changed(density) | startRestartGroup.changedInstance(value2) | startRestartGroup.changedInstance(value3) | startRestartGroup.changedInstance(value);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda34
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit ModalNavigationDrawer_FHprtrg$lambda$7$0;
                                        ModalNavigationDrawer_FHprtrg$lambda$7$0 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$7$0(DrawerState.this, density, value2, value3, value);
                                        return ModalNavigationDrawer_FHprtrg$lambda$7$0;
                                    }
                                };
                                drawerState5 = drawerState4;
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            } else {
                                drawerState5 = drawerState4;
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
                            Boolean valueOf = Boolean.valueOf(drawerState5.isOpen());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 910063410, "CC(remember):NavigationDrawer.kt#9igjgp");
                            z5 = (i8 <= 256 && startRestartGroup.changed(drawerState5)) || (i3 & 384) == 256;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z5 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = (Function2) new NavigationDrawerKt$ModalNavigationDrawer$2$1(drawerState5, focusRequester, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(SizeKt.fillMaxSize$default(companion, f, 1, null), drawerState5.getAnchoredDraggableState$material3(), consume2 != LayoutDirection.Rtl, Orientation.Horizontal, z7, (MutableInteractionSource) null, (OverscrollEffect) null, (FlingBehavior) null, 112, (Object) null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            Modifier modifier3 = companion;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, anchoredDraggable$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
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
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 101901996, "C380@15513L17,381@15562L167,387@15778L30,389@15904L70,386@15738L279,395@16126L601,407@16759L452,418@17244L501,431@17809L1561,392@16026L3344:NavigationDrawer.kt#uh7d8r");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor2);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m5864constructorimpl2 = Updater.m5864constructorimpl(startRestartGroup);
                            Updater.m5872setimpl(m5864constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 343987054, "C380@15519L9:NavigationDrawer.kt#uh7d8r");
                            function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 15) & 14));
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2081495021, "CC(remember):NavigationDrawer.kt#9igjgp");
                            changedInstance = ((i3 & 7168) != 2048) | ((i8 <= 256 && startRestartGroup.changed(drawerState5)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new Function0() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit ModalNavigationDrawer_FHprtrg$lambda$9$1$0;
                                        ModalNavigationDrawer_FHprtrg$lambda$9$1$0 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$9$1$0(z7, drawerState5, coroutineScope);
                                        return ModalNavigationDrawer_FHprtrg$lambda$9$1$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            Function0 function0 = (Function0) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Strings.Companion companion4 = Strings.INSTANCE;
                            String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.close_drawer), startRestartGroup, 0);
                            if (!drawerState5.isOpen()) {
                                function0 = null;
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2081505868, "CC(remember):NavigationDrawer.kt#9igjgp");
                            changed2 = startRestartGroup.changed(mutableFloatState) | ((i8 <= 256 && startRestartGroup.changed(drawerState5)) || (i3 & 384) == 256);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                final float f2 = 0.0f;
                                rememberedValue4 = new Function0() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        float ModalNavigationDrawer_FHprtrg$lambda$9$2$0;
                                        ModalNavigationDrawer_FHprtrg$lambda$9$2$0 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$9$2$0(f2, drawerState5, mutableFloatState);
                                        return Float.valueOf(ModalNavigationDrawer_FHprtrg$lambda$9$2$0);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            j2 = j3;
                            ScrimKt.m3803ScrimyrwZFoE(m4895getString2EP1pXo2, null, function0, (Function0) rememberedValue4, j2, startRestartGroup, i3 & 57344, 2);
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2081513503, "CC(remember):NavigationDrawer.kt#9igjgp");
                            z6 = (i8 <= 256 && startRestartGroup.changed(drawerState5)) || (i3 & 384) == 256;
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!z6 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        IntOffset ModalNavigationDrawer_FHprtrg$lambda$9$3$0;
                                        ModalNavigationDrawer_FHprtrg$lambda$9$3$0 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$9$3$0(DrawerState.this, (Density) obj);
                                        return ModalNavigationDrawer_FHprtrg$lambda$9$3$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier offset = OffsetKt.offset(companion5, (Function1) rememberedValue5);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2081533610, "CC(remember):NavigationDrawer.kt#9igjgp");
                            changed3 = startRestartGroup.changed(m4895getString2EP1pXo) | ((i8 <= 256 && startRestartGroup.changed(drawerState5)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope);
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (!changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit ModalNavigationDrawer_FHprtrg$lambda$9$4$0;
                                        ModalNavigationDrawer_FHprtrg$lambda$9$4$0 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$9$4$0(m4895getString2EP1pXo, drawerState5, coroutineScope, (SemanticsPropertyReceiver) obj);
                                        return ModalNavigationDrawer_FHprtrg$lambda$9$4$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier semantics$default = SemanticsModifierKt.semantics$default(offset, false, (Function1) rememberedValue6, 1, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2081549179, "CC(remember):NavigationDrawer.kt#9igjgp");
                            changedInstance2 = ((i8 <= 256 && startRestartGroup.changed(drawerState5)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope);
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (!changedInstance2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3$5$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                        return m3637invokeZmokQxo(keyEvent.m7966unboximpl());
                                    }

                                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                    public final Boolean m3637invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                        if (DrawerState.this.isOpen() && KeyEventType.m7970equalsimpl0(KeyEvent_androidKt.m7978getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m7975getKeyUpCS__XNY()) && Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7747getEscapeEK5gGoQ())) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(DrawerState.this, null), 3, null);
                                            return true;
                                        }
                                        return false;
                                    }

                                    /* compiled from: NavigationDrawer.kt */
                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                                    @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3$5$1$1", f = "NavigationDrawer.kt", i = {}, l = {426}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                                    /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3$5$1$1, reason: invalid class name */
                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ DrawerState $drawerState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                            super(2, continuation);
                                            this.$drawerState = drawerState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new AnonymousClass1(this.$drawerState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (this.$drawerState.close(this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(KeyInputModifierKt.onKeyEvent(semantics$default, (Function1) rememberedValue7), focusRequester);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2081568319, "CC(remember):NavigationDrawer.kt#9igjgp");
                            changed4 = startRestartGroup.changed(mutableFloatState) | ((i8 <= 256 && startRestartGroup.changed(drawerState5)) || (i3 & 384) == 256);
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (!changed4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = (MeasurePolicy) new NavigationDrawerKt$ModalNavigationDrawer$3$6$1(drawerState5, 0.0f, mutableState, mutableFloatState);
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue8;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i9 = i3 & 14;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, focusRequester2);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            int i10 = ((i9 << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor3);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m5864constructorimpl3 = Updater.m5864constructorimpl(startRestartGroup);
                            Updater.m5872setimpl(m5864constructorimpl3, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            function23 = function2;
                            function23.invoke(startRestartGroup, Integer.valueOf((i10 >> 6) & 14));
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            drawerState3 = drawerState5;
                            modifier2 = modifier3;
                            z3 = z7;
                        }
                    } else {
                        drawerState4 = drawerState2;
                    }
                    z4 = true;
                    changed = z4 | startRestartGroup.changed(density) | startRestartGroup.changedInstance(value2) | startRestartGroup.changedInstance(value3) | startRestartGroup.changedInstance(value);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    rememberedValue = new Function0() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda34
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ModalNavigationDrawer_FHprtrg$lambda$7$0;
                            ModalNavigationDrawer_FHprtrg$lambda$7$0 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$7$0(DrawerState.this, density, value2, value3, value);
                            return ModalNavigationDrawer_FHprtrg$lambda$7$0;
                        }
                    };
                    drawerState5 = drawerState4;
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
                    Boolean valueOf2 = Boolean.valueOf(drawerState5.isOpen());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 910063410, "CC(remember):NavigationDrawer.kt#9igjgp");
                    if (i8 <= 256) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z5) {
                    }
                    rememberedValue2 = (Function2) new NavigationDrawerKt$ModalNavigationDrawer$2$1(drawerState5, focusRequester, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localLayoutDirection2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier anchoredDraggable$default2 = AnchoredDraggableKt.anchoredDraggable$default(SizeKt.fillMaxSize$default(companion, f, 1, null), drawerState5.getAnchoredDraggableState$material3(), consume22 != LayoutDirection.Rtl, Orientation.Horizontal, z7, (MutableInteractionSource) null, (OverscrollEffect) null, (FlingBehavior) null, 112, (Object) null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    Modifier modifier32 = companion;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m4 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, anchoredDraggable$default2);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    Composer m5864constructorimpl4 = Updater.m5864constructorimpl(startRestartGroup);
                    Updater.m5872setimpl(m5864constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl4, Integer.valueOf(m4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 101901996, "C380@15513L17,381@15562L167,387@15778L30,389@15904L70,386@15738L279,395@16126L601,407@16759L452,418@17244L501,431@17809L1561,392@16026L3344:NavigationDrawer.kt#uh7d8r");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m22 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion32);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    Composer m5864constructorimpl22 = Updater.m5864constructorimpl(startRestartGroup);
                    Updater.m5872setimpl(m5864constructorimpl22, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl22, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl22, Integer.valueOf(m22), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl22, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl22, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 343987054, "C380@15519L9:NavigationDrawer.kt#uh7d8r");
                    function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 15) & 14));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2081495021, "CC(remember):NavigationDrawer.kt#9igjgp");
                    changedInstance = ((i3 & 7168) != 2048) | ((i8 <= 256 && startRestartGroup.changed(drawerState5)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue3 = new Function0() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ModalNavigationDrawer_FHprtrg$lambda$9$1$0;
                            ModalNavigationDrawer_FHprtrg$lambda$9$1$0 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$9$1$0(z7, drawerState5, coroutineScope);
                            return ModalNavigationDrawer_FHprtrg$lambda$9$1$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    Function0 function02 = (Function0) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Strings.Companion companion42 = Strings.INSTANCE;
                    String m4895getString2EP1pXo22 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.close_drawer), startRestartGroup, 0);
                    if (!drawerState5.isOpen()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2081505868, "CC(remember):NavigationDrawer.kt#9igjgp");
                    changed2 = startRestartGroup.changed(mutableFloatState) | ((i8 <= 256 && startRestartGroup.changed(drawerState5)) || (i3 & 384) == 256);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    final float f22 = 0.0f;
                    rememberedValue4 = new Function0() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            float ModalNavigationDrawer_FHprtrg$lambda$9$2$0;
                            ModalNavigationDrawer_FHprtrg$lambda$9$2$0 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$9$2$0(f22, drawerState5, mutableFloatState);
                            return Float.valueOf(ModalNavigationDrawer_FHprtrg$lambda$9$2$0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    j2 = j3;
                    ScrimKt.m3803ScrimyrwZFoE(m4895getString2EP1pXo22, null, function02, (Function0) rememberedValue4, j2, startRestartGroup, i3 & 57344, 2);
                    Modifier.Companion companion52 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2081513503, "CC(remember):NavigationDrawer.kt#9igjgp");
                    if (i8 <= 256) {
                    }
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!z6) {
                    }
                    rememberedValue5 = new Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            IntOffset ModalNavigationDrawer_FHprtrg$lambda$9$3$0;
                            ModalNavigationDrawer_FHprtrg$lambda$9$3$0 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$9$3$0(DrawerState.this, (Density) obj);
                            return ModalNavigationDrawer_FHprtrg$lambda$9$3$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier offset2 = OffsetKt.offset(companion52, (Function1) rememberedValue5);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2081533610, "CC(remember):NavigationDrawer.kt#9igjgp");
                    changed3 = startRestartGroup.changed(m4895getString2EP1pXo) | ((i8 <= 256 && startRestartGroup.changed(drawerState5)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue6 = new Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ModalNavigationDrawer_FHprtrg$lambda$9$4$0;
                            ModalNavigationDrawer_FHprtrg$lambda$9$4$0 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$9$4$0(m4895getString2EP1pXo, drawerState5, coroutineScope, (SemanticsPropertyReceiver) obj);
                            return ModalNavigationDrawer_FHprtrg$lambda$9$4$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier semantics$default2 = SemanticsModifierKt.semantics$default(offset2, false, (Function1) rememberedValue6, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2081549179, "CC(remember):NavigationDrawer.kt#9igjgp");
                    changedInstance2 = ((i8 <= 256 && startRestartGroup.changed(drawerState5)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue7 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3$5$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                            return m3637invokeZmokQxo(keyEvent.m7966unboximpl());
                        }

                        /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                        public final Boolean m3637invokeZmokQxo(android.view.KeyEvent keyEvent) {
                            if (DrawerState.this.isOpen() && KeyEventType.m7970equalsimpl0(KeyEvent_androidKt.m7978getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m7975getKeyUpCS__XNY()) && Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7747getEscapeEK5gGoQ())) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(DrawerState.this, null), 3, null);
                                return true;
                            }
                            return false;
                        }

                        /* compiled from: NavigationDrawer.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                        @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3$5$1$1", f = "NavigationDrawer.kt", i = {}, l = {426}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                        /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3$5$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ DrawerState $drawerState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$drawerState = drawerState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass1(this.$drawerState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (this.$drawerState.close(this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier focusRequester22 = FocusRequesterModifierKt.focusRequester(KeyInputModifierKt.onKeyEvent(semantics$default2, (Function1) rememberedValue7), focusRequester);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2081568319, "CC(remember):NavigationDrawer.kt#9igjgp");
                    changed4 = startRestartGroup.changed(mutableFloatState) | ((i8 <= 256 && startRestartGroup.changed(drawerState5)) || (i3 & 384) == 256);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changed4) {
                    }
                    rememberedValue8 = (MeasurePolicy) new NavigationDrawerKt$ModalNavigationDrawer$3$6$1(drawerState5, 0.0f, mutableState, mutableFloatState);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                    MeasurePolicy measurePolicy2 = (MeasurePolicy) rememberedValue8;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i92 = i3 & 14;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m32 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, focusRequester22);
                    Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    int i102 = ((i92 << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    Composer m5864constructorimpl32 = Updater.m5864constructorimpl(startRestartGroup);
                    Updater.m5872setimpl(m5864constructorimpl32, measurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl32, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl32, Integer.valueOf(m32), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl32, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl32, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    function23 = function2;
                    function23.invoke(startRestartGroup, Integer.valueOf((i102 >> 6) & 14));
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    drawerState3 = drawerState5;
                    modifier2 = modifier32;
                    z3 = z7;
                } else {
                    function23 = function2;
                    startRestartGroup.skipToGroupEnd();
                    drawerState3 = drawerState2;
                    z3 = z2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Function2<? super Composer, ? super Integer, Unit> function24 = function23;
                    final Modifier modifier4 = modifier2;
                    final long j4 = j2;
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ModalNavigationDrawer_FHprtrg$lambda$10;
                            ModalNavigationDrawer_FHprtrg$lambda$10 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$10(Function2.this, modifier4, drawerState3, z3, j4, function22, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return ModalNavigationDrawer_FHprtrg$lambda$10;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalNavigationDrawer_FHprtrg$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ModalNavigationDrawer_FHprtrg$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ModalNavigationDrawer_FHprtrg$lambda$4(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalNavigationDrawer_FHprtrg$lambda$7$0(DrawerState drawerState, Density density, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3) {
        drawerState.setDensity$material3(density);
        drawerState.setOpenDrawerMotionSpec$material3(finiteAnimationSpec);
        drawerState.setCloseDrawerMotionSpec$material3(finiteAnimationSpec2);
        drawerState.setAnchoredDraggableMotionSpec$material3(finiteAnimationSpec3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalNavigationDrawer_FHprtrg$lambda$9$1$0(boolean z, DrawerState drawerState, CoroutineScope coroutineScope) {
        if (z && drawerState.getConfirmStateChange$material3().invoke(DrawerValue.Closed).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new NavigationDrawerKt$ModalNavigationDrawer$3$onDismissRequest$1$1$1(drawerState, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ModalNavigationDrawer_FHprtrg$lambda$9$2$0(float f, DrawerState drawerState, MutableFloatState mutableFloatState) {
        return calculateFraction(ModalNavigationDrawer_FHprtrg$lambda$4(mutableFloatState), f, drawerState.requireOffset$material3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset ModalNavigationDrawer_FHprtrg$lambda$9$3$0(DrawerState drawerState, Density density) {
        int i;
        float currentOffset = drawerState.getCurrentOffset();
        if (Float.isNaN(currentOffset)) {
            i = drawerState.isOpen() ? 0 : -density.mo522roundToPx0680j_4(DrawerDefaults.INSTANCE.m3069getMaximumDrawerWidthD9Ej5fM());
        } else {
            i = MathKt.roundToInt(currentOffset);
        }
        return IntOffset.m9855boximpl(IntOffset.m9858constructorimpl((i << 32) | (0 & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalNavigationDrawer_FHprtrg$lambda$9$4$0(String str, final DrawerState drawerState, final CoroutineScope coroutineScope, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        if (drawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean ModalNavigationDrawer_FHprtrg$lambda$9$4$0$0;
                    ModalNavigationDrawer_FHprtrg$lambda$9$4$0$0 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$9$4$0$0(DrawerState.this, coroutineScope);
                    return Boolean.valueOf(ModalNavigationDrawer_FHprtrg$lambda$9$4$0$0);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalNavigationDrawer_FHprtrg$lambda$9$4$0$0(DrawerState drawerState, CoroutineScope coroutineScope) {
        if (!drawerState.getConfirmStateChange$material3().invoke(DrawerValue.Closed).booleanValue()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new NavigationDrawerKt$ModalNavigationDrawer$3$4$1$1$1(drawerState, null), 3, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x035c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DismissibleNavigationDrawer(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, DrawerState drawerState, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final DrawerState drawerState2;
        int i4;
        boolean z2;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        boolean z4;
        Object rememberedValue;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        boolean z5;
        NavigationDrawerKt$DismissibleNavigationDrawer$2$1 rememberedValue4;
        Object rememberedValue5;
        boolean z6;
        NavigationDrawerKt$DismissibleNavigationDrawer$3$2$1 rememberedValue6;
        boolean changed2;
        Object rememberedValue7;
        boolean changedInstance;
        Object rememberedValue8;
        int i5;
        final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
        Composer startRestartGroup = composer.startRestartGroup(1150092038);
        ComposerKt.sourceInformation(startRestartGroup, "C(DismissibleNavigationDrawer)N(drawerContent,modifier,drawerState,gesturesEnabled,content)494@20704L34,495@20770L7,496@20803L29,499@20992L7,500@21084L7,502@21108L155,502@21097L166,508@21304L178,508@21269L213,515@21500L24,516@21550L33,518@21622L7,519@21657L3133:NavigationDrawer.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    drawerState2 = drawerState;
                    if (startRestartGroup.changed(drawerState2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    drawerState2 = drawerState;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                drawerState2 = drawerState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "490@20555L39");
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            drawerState2 = rememberDrawerState(DrawerValue.Closed, null, startRestartGroup, 6, 2);
                        }
                        if (i4 != 0) {
                            modifier3 = modifier2;
                            z4 = true;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1150092038, i3, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:493)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1431862792, "CC(remember):NavigationDrawer.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            MutableState mutableState = (MutableState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Density density = (Density) consume;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1431865955, "CC(remember):NavigationDrawer.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new FocusRequester();
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            FocusRequester focusRequester = (FocusRequester) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
                            final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1431875841, "CC(remember):NavigationDrawer.kt#9igjgp");
                            int i7 = (i3 & 896) ^ 384;
                            changed = ((i7 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changed(density) | startRestartGroup.changedInstance(value) | startRestartGroup.changedInstance(value2);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new Function0() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda25
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit DismissibleNavigationDrawer$lambda$4$0;
                                        DismissibleNavigationDrawer$lambda$4$0 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$4$0(DrawerState.this, density, value, value2);
                                        return DismissibleNavigationDrawer$lambda$4$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            EffectsKt.SideEffect((Function0) rememberedValue3, startRestartGroup, 0);
                            Boolean valueOf = Boolean.valueOf(drawerState2.isOpen());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1431882136, "CC(remember):NavigationDrawer.kt#9igjgp");
                            z5 = (i7 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256;
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!z5 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new NavigationDrawerKt$DismissibleNavigationDrawer$2$1(drawerState2, focusRequester, null);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue5;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Strings.Companion companion = Strings.INSTANCE;
                            final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(modifier3, drawerState2.getAnchoredDraggableState$material3(), consume2 != LayoutDirection.Rtl, Orientation.Horizontal, z4, (MutableInteractionSource) null, (OverscrollEffect) null, (FlingBehavior) null, 112, (Object) null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, anchoredDraggable$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
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
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -901198438, "C559@23262L1522,527@21907L2877:NavigationDrawer.kt#uh7d8r");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1691596898, "CC(remember):NavigationDrawer.kt#9igjgp");
                            z6 = (i7 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256;
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (!z6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new NavigationDrawerKt$DismissibleNavigationDrawer$3$2$1(drawerState2, mutableState);
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue6;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor2);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m5864constructorimpl2 = Updater.m5864constructorimpl(startRestartGroup);
                            Updater.m5872setimpl(m5864constructorimpl2, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1778140254, "C530@21999L492,541@22528L545,529@21955L1248,557@23220L17:NavigationDrawer.kt#uh7d8r");
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2020850001, "CC(remember):NavigationDrawer.kt#9igjgp");
                            changed2 = startRestartGroup.changed(m4895getString2EP1pXo) | ((i7 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope);
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda26
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit DismissibleNavigationDrawer$lambda$6$0$0$0;
                                        DismissibleNavigationDrawer$lambda$6$0$0$0 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$6$0$0$0(m4895getString2EP1pXo, drawerState2, coroutineScope, (SemanticsPropertyReceiver) obj);
                                        return DismissibleNavigationDrawer$lambda$6$0$0$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier semantics$default = SemanticsModifierKt.semantics$default(companion3, false, (Function1) rememberedValue7, 1, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2020833020, "CC(remember):NavigationDrawer.kt#9igjgp");
                            changedInstance = startRestartGroup.changedInstance(coroutineScope) | ((i7 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256);
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (!changedInstance || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3$1$2$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                        return m3634invokeZmokQxo(keyEvent.m7966unboximpl());
                                    }

                                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                    public final Boolean m3634invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                        if (DrawerState.this.isOpen() && KeyEventType.m7970equalsimpl0(KeyEvent_androidKt.m7978getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m7975getKeyUpCS__XNY()) && Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7747getEscapeEK5gGoQ())) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(DrawerState.this, null), 3, null);
                                            return true;
                                        }
                                        return false;
                                    }

                                    /* compiled from: NavigationDrawer.kt */
                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                                    @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3$1$2$1$1", f = "NavigationDrawer.kt", i = {}, l = {549}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                                    /* renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3$1$2$1$1, reason: invalid class name */
                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ DrawerState $drawerState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                            super(2, continuation);
                                            this.$drawerState = drawerState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new AnonymousClass1(this.$drawerState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (this.$drawerState.close(this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(KeyInputModifierKt.onKeyEvent(semantics$default, (Function1) rememberedValue8), focusRequester);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, focusRequester2);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor3);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m5864constructorimpl3 = Updater.m5864constructorimpl(startRestartGroup);
                            Updater.m5872setimpl(m5864constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1897277909, "C555@23170L15:NavigationDrawer.kt#uh7d8r");
                            function2.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            int m4 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion4);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor4);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m5864constructorimpl4 = Updater.m5864constructorimpl(startRestartGroup);
                            Updater.m5872setimpl(m5864constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5872setimpl(m5864constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m5872setimpl(m5864constructorimpl4, Integer.valueOf(m4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            Updater.m5870reconcileimpl(m5864constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            Updater.m5872setimpl(m5864constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -272067686, "C557@23226L9:NavigationDrawer.kt#uh7d8r");
                            function23 = function22;
                            function23.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            z3 = z4;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                    }
                    modifier3 = modifier2;
                    z4 = z2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1431862792, "CC(remember):NavigationDrawer.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume3 = startRestartGroup.consume(localDensity2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density2 = (Density) consume3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1431865955, "CC(remember):NavigationDrawer.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    FocusRequester focusRequester3 = (FocusRequester) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final FiniteAnimationSpec value3 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
                    final FiniteAnimationSpec value22 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1431875841, "CC(remember):NavigationDrawer.kt#9igjgp");
                    int i72 = (i3 & 896) ^ 384;
                    changed = ((i72 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changed(density2) | startRestartGroup.changedInstance(value3) | startRestartGroup.changedInstance(value22);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue3 = new Function0() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit DismissibleNavigationDrawer$lambda$4$0;
                            DismissibleNavigationDrawer$lambda$4$0 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$4$0(DrawerState.this, density2, value3, value22);
                            return DismissibleNavigationDrawer$lambda$4$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.SideEffect((Function0) rememberedValue3, startRestartGroup, 0);
                    Boolean valueOf2 = Boolean.valueOf(drawerState2.isOpen());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1431882136, "CC(remember):NavigationDrawer.kt#9igjgp");
                    if (i72 <= 256) {
                    }
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!z5) {
                    }
                    rememberedValue4 = new NavigationDrawerKt$DismissibleNavigationDrawer$2$1(drawerState2, focusRequester3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    }
                    final CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Strings.Companion companion5 = Strings.INSTANCE;
                    final String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localLayoutDirection2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier anchoredDraggable$default2 = AnchoredDraggableKt.anchoredDraggable$default(modifier3, drawerState2.getAnchoredDraggableState$material3(), consume22 != LayoutDirection.Rtl, Orientation.Horizontal, z4, (MutableInteractionSource) null, (OverscrollEffect) null, (FlingBehavior) null, 112, (Object) null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m5 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, anchoredDraggable$default2);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    Composer m5864constructorimpl5 = Updater.m5864constructorimpl(startRestartGroup);
                    Updater.m5872setimpl(m5864constructorimpl5, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl5, Integer.valueOf(m5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -901198438, "C559@23262L1522,527@21907L2877:NavigationDrawer.kt#uh7d8r");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1691596898, "CC(remember):NavigationDrawer.kt#9igjgp");
                    if (i72 <= 256) {
                    }
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!z6) {
                    }
                    rememberedValue6 = new NavigationDrawerKt$DismissibleNavigationDrawer$3$2$1(drawerState2, mutableState2);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    MeasurePolicy measurePolicy2 = (MeasurePolicy) rememberedValue6;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    int m22 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    Composer m5864constructorimpl22 = Updater.m5864constructorimpl(startRestartGroup);
                    Updater.m5872setimpl(m5864constructorimpl22, measurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl22, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl22, Integer.valueOf(m22), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl22, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl22, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1778140254, "C530@21999L492,541@22528L545,529@21955L1248,557@23220L17:NavigationDrawer.kt#uh7d8r");
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2020850001, "CC(remember):NavigationDrawer.kt#9igjgp");
                    changed2 = startRestartGroup.changed(m4895getString2EP1pXo2) | ((i72 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope2);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue7 = new Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit DismissibleNavigationDrawer$lambda$6$0$0$0;
                            DismissibleNavigationDrawer$lambda$6$0$0$0 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$6$0$0$0(m4895getString2EP1pXo2, drawerState2, coroutineScope2, (SemanticsPropertyReceiver) obj);
                            return DismissibleNavigationDrawer$lambda$6$0$0$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier semantics$default2 = SemanticsModifierKt.semantics$default(companion32, false, (Function1) rememberedValue7, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2020833020, "CC(remember):NavigationDrawer.kt#9igjgp");
                    changedInstance = startRestartGroup.changedInstance(coroutineScope2) | ((i72 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue8 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3$1$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                            return m3634invokeZmokQxo(keyEvent.m7966unboximpl());
                        }

                        /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                        public final Boolean m3634invokeZmokQxo(android.view.KeyEvent keyEvent) {
                            if (DrawerState.this.isOpen() && KeyEventType.m7970equalsimpl0(KeyEvent_androidKt.m7978getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m7975getKeyUpCS__XNY()) && Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7747getEscapeEK5gGoQ())) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(DrawerState.this, null), 3, null);
                                return true;
                            }
                            return false;
                        }

                        /* compiled from: NavigationDrawer.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                        @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3$1$2$1$1", f = "NavigationDrawer.kt", i = {}, l = {549}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                        /* renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3$1$2$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ DrawerState $drawerState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$drawerState = drawerState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass1(this.$drawerState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (this.$drawerState.close(this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier focusRequester22 = FocusRequesterModifierKt.focusRequester(KeyInputModifierKt.onKeyEvent(semantics$default2, (Function1) rememberedValue8), focusRequester3);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m32 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, focusRequester22);
                    Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    Composer m5864constructorimpl32 = Updater.m5864constructorimpl(startRestartGroup);
                    Updater.m5872setimpl(m5864constructorimpl32, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl32, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl32, Integer.valueOf(m32), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl32, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl32, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1897277909, "C555@23170L15:NavigationDrawer.kt#uh7d8r");
                    function2.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m42 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, companion42);
                    Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    Composer m5864constructorimpl42 = Updater.m5864constructorimpl(startRestartGroup);
                    Updater.m5872setimpl(m5864constructorimpl42, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl42, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl42, Integer.valueOf(m42), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl42, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl42, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -272067686, "C557@23226L9:NavigationDrawer.kt#uh7d8r");
                    function23 = function22;
                    function23.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                    z3 = z4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z3 = z2;
                }
                final DrawerState drawerState3 = drawerState2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit DismissibleNavigationDrawer$lambda$7;
                            DismissibleNavigationDrawer$lambda$7 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$7(Function2.this, modifier4, drawerState3, z3, function23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return DismissibleNavigationDrawer$lambda$7;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            final DrawerState drawerState32 = drawerState2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        final DrawerState drawerState322 = drawerState2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DismissibleNavigationDrawer$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DismissibleNavigationDrawer$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DismissibleNavigationDrawer$lambda$4$0(DrawerState drawerState, Density density, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2) {
        drawerState.setDensity$material3(density);
        drawerState.setOpenDrawerMotionSpec$material3(finiteAnimationSpec);
        drawerState.setCloseDrawerMotionSpec$material3(finiteAnimationSpec2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DismissibleNavigationDrawer$lambda$6$0$0$0(String str, final DrawerState drawerState, final CoroutineScope coroutineScope, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        if (drawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean DismissibleNavigationDrawer$lambda$6$0$0$0$0;
                    DismissibleNavigationDrawer$lambda$6$0$0$0$0 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$6$0$0$0$0(DrawerState.this, coroutineScope);
                    return Boolean.valueOf(DismissibleNavigationDrawer$lambda$6$0$0$0$0);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DismissibleNavigationDrawer$lambda$6$0$0$0$0(DrawerState drawerState, CoroutineScope coroutineScope) {
        if (!drawerState.getConfirmStateChange$material3().invoke(DrawerValue.Closed).booleanValue()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new NavigationDrawerKt$DismissibleNavigationDrawer$3$1$1$1$1$1(drawerState, null), 3, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PermanentNavigationDrawer(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier.Companion companion;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(89297160);
        ComposerKt.sourceInformation(startRestartGroup, "C(PermanentNavigationDrawer)N(drawerContent,modifier,content)616@25780L85:NavigationDrawer.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            } else {
                companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(89297160, i3, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:615)");
                }
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -688649266, "C617@25818L15,618@25842L17:NavigationDrawer.kt#uh7d8r");
                function2.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m5864constructorimpl2 = Updater.m5864constructorimpl(startRestartGroup);
                Updater.m5872setimpl(m5864constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1964035624, "C618@25848L9:NavigationDrawer.kt#uh7d8r");
                function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = companion;
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit PermanentNavigationDrawer$lambda$1;
                        PermanentNavigationDrawer$lambda$1 = NavigationDrawerKt.PermanentNavigationDrawer$lambda$1(Function2.this, modifier3, function22, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return PermanentNavigationDrawer$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: ModalDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3631ModalDrawerSheetafqeVBk(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        long j3;
        long j4;
        float f2;
        WindowInsets windowInsets2;
        Composer composer2;
        final Modifier modifier3;
        final Shape shape3;
        final long j5;
        final long j6;
        final float f3;
        final WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        long j7;
        float f4;
        WindowInsets windowInsets4;
        int i4;
        Modifier modifier4;
        int i5;
        long j8;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1922633461);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalDrawerSheet)N(modifier,drawerShape,drawerContainerColor:c#ui.graphics.Color,drawerContentColor:c#ui.graphics.Color,drawerTonalElevation:c#ui.unit.Dp,windowInsets,content)652@27540L343:NavigationDrawer.kt#uh7d8r");
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                shape2 = shape;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            shape2 = shape;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i8 = 256;
                    i3 |= i8;
                }
            } else {
                j3 = j;
            }
            i8 = 128;
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i7 = 2048;
                    i3 |= i7;
                }
            } else {
                j4 = j2;
            }
            i7 = 1024;
            i3 |= i7;
        } else {
            j4 = j2;
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    windowInsets2 = windowInsets;
                    if (startRestartGroup.changed(windowInsets2)) {
                        i6 = 131072;
                        i3 |= i6;
                    }
                } else {
                    windowInsets2 = windowInsets;
                }
                i6 = 65536;
                i3 |= i6;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((1572864 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "645@27205L5,646@27261L19,647@27314L37,649@27469L12");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    shape4 = shape2;
                    j7 = j4;
                    f4 = f2;
                    windowInsets4 = windowInsets2;
                    i5 = 6;
                    i4 = 1922633461;
                    modifier4 = modifier2;
                } else {
                    Modifier.Companion companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        shape2 = DrawerDefaults.INSTANCE.getShape(startRestartGroup, 6);
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        j3 = DrawerDefaults.INSTANCE.getModalContainerColor(startRestartGroup, 6);
                    }
                    if ((i2 & 8) != 0) {
                        long m2784contentColorForek8zF_U = ColorSchemeKt.m2784contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                        j4 = m2784contentColorForek8zF_U;
                    }
                    if (i11 != 0) {
                        f2 = DrawerDefaults.INSTANCE.m3070getModalDrawerElevationD9Ej5fM();
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        modifier4 = companion;
                        shape4 = shape2;
                        j7 = j4;
                        f4 = f2;
                        i5 = 6;
                        windowInsets4 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                        j8 = j3;
                        i4 = 1922633461;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i4, i3, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:651)");
                        }
                        int i12 = ((i3 >> 12) & 112) | i5;
                        int i13 = i3 << 6;
                        composer2 = startRestartGroup;
                        m3629DrawerSheetcm3T3N0(null, windowInsets4, modifier4, shape4, j8, j7, f4, null, function3, composer2, i12 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (i13 & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets3 = windowInsets4;
                        modifier3 = modifier4;
                        shape3 = shape4;
                        j5 = j8;
                        j6 = j7;
                        f3 = f4;
                    } else {
                        shape4 = shape2;
                        j7 = j4;
                        f4 = f2;
                        windowInsets4 = windowInsets2;
                        i4 = 1922633461;
                        modifier4 = companion;
                        i5 = 6;
                    }
                }
                j8 = j3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i122 = ((i3 >> 12) & 112) | i5;
                int i132 = i3 << 6;
                composer2 = startRestartGroup;
                m3629DrawerSheetcm3T3N0(null, windowInsets4, modifier4, shape4, j8, j7, f4, null, function3, composer2, i122 | (i132 & 896) | (i132 & 7168) | (57344 & i132) | (458752 & i132) | (3670016 & i132) | (i132 & 234881024), 128);
                if (ComposerKt.isTraceInProgress()) {
                }
                windowInsets3 = windowInsets4;
                modifier3 = modifier4;
                shape3 = shape4;
                j5 = j8;
                j6 = j7;
                f3 = f4;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                shape3 = shape2;
                j5 = j3;
                j6 = j4;
                f3 = f2;
                windowInsets3 = windowInsets2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ModalDrawerSheet_afqeVBk$lambda$0;
                        ModalDrawerSheet_afqeVBk$lambda$0 = NavigationDrawerKt.ModalDrawerSheet_afqeVBk$lambda$0(Modifier.this, shape3, j5, j6, f3, windowInsets3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ModalDrawerSheet_afqeVBk$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        f2 = f;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: ModalDrawerSheet-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3630ModalDrawerSheetSnr_uVM(final DrawerState drawerState, Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        float f2;
        WindowInsets windowInsets2;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32;
        final Modifier modifier3;
        final Shape shape3;
        final long j5;
        final long j6;
        final float f3;
        final WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        final WindowInsets windowInsets4;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1620540727);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalDrawerSheet)N(drawerState,modifier,drawerShape,drawerContainerColor:c#ui.graphics.Color,drawerContentColor:c#ui.graphics.Color,drawerTonalElevation:c#ui.unit.Dp,windowInsets,content)696@29653L519,696@29612L560:NavigationDrawer.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(drawerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i9 = 256;
                        i3 |= i9;
                    }
                } else {
                    shape2 = shape;
                }
                i9 = 128;
                i3 |= i9;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                } else {
                    j4 = j2;
                }
                i7 = 8192;
                i3 |= i7;
            } else {
                j4 = j2;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i6 = 1048576;
                            i3 |= i6;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i6 = 524288;
                    i3 |= i6;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((12582912 & i) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 8388608 : 4194304;
                } else {
                    function32 = function3;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "689@29277L5,690@29333L19,691@29386L37,693@29541L12");
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            shape2 = DrawerDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        }
                        if ((i2 & 8) != 0) {
                            j3 = DrawerDefaults.INSTANCE.getModalContainerColor(startRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            j4 = ColorSchemeKt.m2784contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            f2 = DrawerDefaults.INSTANCE.m3070getModalDrawerElevationD9Ej5fM();
                        }
                        if ((i2 & 64) != 0) {
                            modifier3 = modifier2;
                            shape3 = shape2;
                            j5 = j3;
                            j6 = j4;
                            f3 = f2;
                            i5 = i3 & (-3670017);
                            windowInsets4 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1620540727, i5, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:695)");
                            }
                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                            DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(797187326, true, new Function3() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    Unit ModalDrawerSheet_Snr_uVM$lambda$0;
                                    ModalDrawerSheet_Snr_uVM$lambda$0 = NavigationDrawerKt.ModalDrawerSheet_Snr_uVM$lambda$0(WindowInsets.this, modifier3, shape3, j5, j6, f3, drawerState, function33, (DrawerPredictiveBackState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    return ModalDrawerSheet_Snr_uVM$lambda$0;
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i5 & 14) | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            windowInsets3 = windowInsets4;
                        }
                    } else {
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
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                    }
                    modifier3 = modifier2;
                    shape3 = shape2;
                    j5 = j3;
                    j6 = j4;
                    f3 = f2;
                    i5 = i3;
                    windowInsets4 = windowInsets2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Function3 function332 = function32;
                    DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(797187326, true, new Function3() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Unit ModalDrawerSheet_Snr_uVM$lambda$0;
                            ModalDrawerSheet_Snr_uVM$lambda$0 = NavigationDrawerKt.ModalDrawerSheet_Snr_uVM$lambda$0(WindowInsets.this, modifier3, shape3, j5, j6, f3, drawerState, function332, (DrawerPredictiveBackState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                            return ModalDrawerSheet_Snr_uVM$lambda$0;
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i5 & 14) | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    windowInsets3 = windowInsets4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    shape3 = shape2;
                    j5 = j3;
                    j6 = j4;
                    f3 = f2;
                    windowInsets3 = windowInsets2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ModalDrawerSheet_Snr_uVM$lambda$1;
                            ModalDrawerSheet_Snr_uVM$lambda$1 = NavigationDrawerKt.ModalDrawerSheet_Snr_uVM$lambda$1(DrawerState.this, modifier3, shape3, j5, j6, f3, windowInsets3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return ModalDrawerSheet_Snr_uVM$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            f2 = f;
            if ((1572864 & i) == 0) {
            }
            if ((12582912 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        f2 = f;
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalDrawerSheet_Snr_uVM$lambda$0(WindowInsets windowInsets, Modifier modifier, Shape shape, long j, long j2, float f, final DrawerState drawerState, Function3 function3, DrawerPredictiveBackState drawerPredictiveBackState, Composer composer, int i) {
        DrawerPredictiveBackState drawerPredictiveBackState2;
        int i2;
        ComposerKt.sourceInformation(composer, "CN(drawerPredictiveBackState)705@30079L45,697@29692L474:NavigationDrawer.kt#uh7d8r");
        if ((i & 6) == 0) {
            drawerPredictiveBackState2 = drawerPredictiveBackState;
            i2 = i | (composer.changed(drawerPredictiveBackState2) ? 4 : 2);
        } else {
            drawerPredictiveBackState2 = drawerPredictiveBackState;
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(797187326, i2, -1, "androidx.compose.material3.ModalDrawerSheet.<anonymous> (NavigationDrawer.kt:697)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1592855275, "CC(remember):NavigationDrawer.kt#9igjgp");
            boolean changed = composer.changed(drawerState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new FloatProducer() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda33
                    @Override // androidx.compose.material3.internal.FloatProducer
                    public final float invoke() {
                        float ModalDrawerSheet_Snr_uVM$lambda$0$0$0;
                        ModalDrawerSheet_Snr_uVM$lambda$0$0$0 = NavigationDrawerKt.ModalDrawerSheet_Snr_uVM$lambda$0$0$0(DrawerState.this);
                        return ModalDrawerSheet_Snr_uVM$lambda$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            m3629DrawerSheetcm3T3N0(drawerPredictiveBackState2, windowInsets, modifier, shape, j, j2, f, (FloatProducer) rememberedValue, function3, composer, i2 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ModalDrawerSheet_Snr_uVM$lambda$0$0$0(DrawerState drawerState) {
        return drawerState.getAnchoredDraggableState$material3().getOffset();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0085  */
    /* renamed from: DismissibleDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3628DismissibleDrawerSheetafqeVBk(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        float f2;
        WindowInsets windowInsets2;
        Composer composer2;
        final Modifier modifier3;
        final Shape shape3;
        final long j5;
        final long j6;
        final float f3;
        final WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        long j7;
        long j8;
        float f4;
        WindowInsets windowInsets4;
        Modifier modifier4;
        Shape shape4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1496398234);
        ComposerKt.sourceInformation(startRestartGroup, "C(DismissibleDrawerSheet)N(modifier,drawerShape,drawerContainerColor:c#ui.graphics.Color,drawerContentColor:c#ui.graphics.Color,drawerTonalElevation:c#ui.unit.Dp,windowInsets,content)741@31880L343:NavigationDrawer.kt#uh7d8r");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i6 = 131072;
                            i3 |= i6;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((1572864 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "735@31592L22,736@31648L37,738@31809L12");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        j7 = j3;
                        j8 = j4;
                        f4 = f2;
                        windowInsets4 = windowInsets2;
                        i5 = -1496398234;
                        modifier4 = modifier2;
                        shape4 = shape2;
                    } else {
                        Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                        if (i9 != 0) {
                            shape2 = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i2 & 4) != 0) {
                            j3 = DrawerDefaults.INSTANCE.getStandardContainerColor(startRestartGroup, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            j4 = ColorSchemeKt.m2784contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f2 = DrawerDefaults.INSTANCE.m3068getDismissibleDrawerElevationD9Ej5fM();
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            shape4 = shape2;
                            j7 = j3;
                            j8 = j4;
                            f4 = f2;
                            modifier4 = companion;
                            windowInsets4 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                        } else {
                            j7 = j3;
                            j8 = j4;
                            f4 = f2;
                            windowInsets4 = windowInsets2;
                            modifier4 = companion;
                            shape4 = shape2;
                        }
                        i5 = -1496398234;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i5, i3, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:740)");
                    }
                    int i10 = i3 << 6;
                    composer2 = startRestartGroup;
                    m3629DrawerSheetcm3T3N0(null, windowInsets4, modifier4, shape4, j7, j8, f4, null, function3, composer2, ((i3 >> 12) & 112) | 6 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (i10 & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets3 = windowInsets4;
                    modifier3 = modifier4;
                    shape3 = shape4;
                    j5 = j7;
                    j6 = j8;
                    f3 = f4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    shape3 = shape2;
                    j5 = j3;
                    j6 = j4;
                    f3 = f2;
                    windowInsets3 = windowInsets2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit DismissibleDrawerSheet_afqeVBk$lambda$0;
                            DismissibleDrawerSheet_afqeVBk$lambda$0 = NavigationDrawerKt.DismissibleDrawerSheet_afqeVBk$lambda$0(Modifier.this, shape3, j5, j6, f3, windowInsets3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return DismissibleDrawerSheet_afqeVBk$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        shape2 = shape;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00eb  */
    /* renamed from: DismissibleDrawerSheet-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3627DismissibleDrawerSheetSnr_uVM(final DrawerState drawerState, Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Shape shape2;
        long j3;
        long j4;
        int i5;
        float f2;
        WindowInsets windowInsets2;
        final Modifier modifier3;
        final Shape shape3;
        final long j5;
        final float f3;
        final long j6;
        final WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        int i6;
        final WindowInsets windowInsets4;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(496605370);
        ComposerKt.sourceInformation(startRestartGroup, "C(DismissibleDrawerSheet)N(drawerState,modifier,drawerShape,drawerContainerColor:c#ui.graphics.Color,drawerContentColor:c#ui.graphics.Color,drawerTonalElevation:c#ui.unit.Dp,windowInsets,content)785@34020L519,785@33979L560:NavigationDrawer.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(drawerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                shape2 = shape;
                i3 |= startRestartGroup.changed(shape2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i8 = 2048;
                            i3 |= i8;
                        }
                    } else {
                        j3 = j;
                    }
                    i8 = 1024;
                    i3 |= i8;
                } else {
                    j3 = j;
                }
                if ((i & 24576) == 0) {
                    j4 = j2;
                    i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            windowInsets2 = windowInsets;
                            if (startRestartGroup.changed(windowInsets2)) {
                                i7 = 1048576;
                                i3 |= i7;
                            }
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i7 = 524288;
                        i3 |= i7;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "779@33691L22,780@33747L37,782@33908L12");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                shape2 = RectangleShapeKt.getRectangleShape();
                            }
                            if ((i2 & 8) != 0) {
                                j3 = DrawerDefaults.INSTANCE.getStandardContainerColor(startRestartGroup, 6);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                j4 = ColorSchemeKt.m2784contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                                i3 &= -57345;
                            }
                            if (i5 != 0) {
                                f2 = DrawerDefaults.INSTANCE.m3068getDismissibleDrawerElevationD9Ej5fM();
                            }
                            if ((i2 & 64) != 0) {
                                modifier3 = modifier2;
                                shape3 = shape2;
                                j5 = j3;
                                f3 = f2;
                                j6 = j4;
                                i6 = i3 & (-3670017);
                                windowInsets4 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(496605370, i6, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:784)");
                                }
                                DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(1623455535, true, new Function3() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda19
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        Unit DismissibleDrawerSheet_Snr_uVM$lambda$0;
                                        DismissibleDrawerSheet_Snr_uVM$lambda$0 = NavigationDrawerKt.DismissibleDrawerSheet_Snr_uVM$lambda$0(WindowInsets.this, modifier3, shape3, j5, j6, f3, drawerState, function3, (DrawerPredictiveBackState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                        return DismissibleDrawerSheet_Snr_uVM$lambda$0;
                                    }
                                }, startRestartGroup, 54), startRestartGroup, (i6 & 14) | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                windowInsets3 = windowInsets4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                        }
                        modifier3 = modifier2;
                        shape3 = shape2;
                        j5 = j3;
                        f3 = f2;
                        j6 = j4;
                        i6 = i3;
                        windowInsets4 = windowInsets2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(1623455535, true, new Function3() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Unit DismissibleDrawerSheet_Snr_uVM$lambda$0;
                                DismissibleDrawerSheet_Snr_uVM$lambda$0 = NavigationDrawerKt.DismissibleDrawerSheet_Snr_uVM$lambda$0(WindowInsets.this, modifier3, shape3, j5, j6, f3, drawerState, function3, (DrawerPredictiveBackState) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                return DismissibleDrawerSheet_Snr_uVM$lambda$0;
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i6 & 14) | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        windowInsets3 = windowInsets4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        shape3 = shape2;
                        j5 = j3;
                        f3 = f2;
                        j6 = j4;
                        windowInsets3 = windowInsets2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit DismissibleDrawerSheet_Snr_uVM$lambda$1;
                                DismissibleDrawerSheet_Snr_uVM$lambda$1 = NavigationDrawerKt.DismissibleDrawerSheet_Snr_uVM$lambda$1(DrawerState.this, modifier3, shape3, j5, j6, f3, windowInsets3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return DismissibleDrawerSheet_Snr_uVM$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                f2 = f;
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            shape2 = shape;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        shape2 = shape;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DismissibleDrawerSheet_Snr_uVM$lambda$0(WindowInsets windowInsets, Modifier modifier, Shape shape, long j, long j2, float f, final DrawerState drawerState, Function3 function3, DrawerPredictiveBackState drawerPredictiveBackState, Composer composer, int i) {
        DrawerPredictiveBackState drawerPredictiveBackState2;
        int i2;
        ComposerKt.sourceInformation(composer, "CN(drawerPredictiveBackState)794@34446L45,786@34059L474:NavigationDrawer.kt#uh7d8r");
        if ((i & 6) == 0) {
            drawerPredictiveBackState2 = drawerPredictiveBackState;
            i2 = i | (composer.changed(drawerPredictiveBackState2) ? 4 : 2);
        } else {
            drawerPredictiveBackState2 = drawerPredictiveBackState;
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1623455535, i2, -1, "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:786)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1067654364, "CC(remember):NavigationDrawer.kt#9igjgp");
            boolean changed = composer.changed(drawerState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new FloatProducer() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda29
                    @Override // androidx.compose.material3.internal.FloatProducer
                    public final float invoke() {
                        float DismissibleDrawerSheet_Snr_uVM$lambda$0$0$0;
                        DismissibleDrawerSheet_Snr_uVM$lambda$0$0$0 = NavigationDrawerKt.DismissibleDrawerSheet_Snr_uVM$lambda$0$0$0(DrawerState.this);
                        return DismissibleDrawerSheet_Snr_uVM$lambda$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            m3629DrawerSheetcm3T3N0(drawerPredictiveBackState2, windowInsets, modifier, shape, j, j2, f, (FloatProducer) rememberedValue, function3, composer, i2 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DismissibleDrawerSheet_Snr_uVM$lambda$0$0$0(DrawerState drawerState) {
        return drawerState.getAnchoredDraggableState$material3().getOffset();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f8  */
    /* renamed from: PermanentDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3633PermanentDrawerSheetafqeVBk(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        float f2;
        WindowInsets windowInsets2;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32;
        Composer composer2;
        final Modifier modifier2;
        final Shape shape3;
        final long j5;
        final long j6;
        final float f3;
        final WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        long j7;
        float f4;
        long j8;
        WindowInsets windowInsets4;
        Shape shape4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1877158612);
        ComposerKt.sourceInformation(startRestartGroup, "C(PermanentDrawerSheet)N(modifier,drawerShape,drawerContainerColor:c#ui.graphics.Color,drawerContentColor:c#ui.graphics.Color,drawerTonalElevation:c#ui.unit.Dp,windowInsets,content)826@36018L33,830@36186L30,827@36056L384:NavigationDrawer.kt#uh7d8r");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i6 = 131072;
                            i3 |= i6;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((1572864 & i) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 1048576 : 524288;
                } else {
                    function32 = function3;
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "820@35711L22,821@35767L37,823@35926L12");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        companion = modifier;
                        j8 = j4;
                        f4 = f2;
                        windowInsets4 = windowInsets2;
                        i5 = 1877158612;
                        shape4 = shape2;
                        j7 = j3;
                    } else {
                        companion = i8 != 0 ? Modifier.INSTANCE : modifier;
                        Shape rectangleShape = i9 != 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                        if ((i2 & 4) != 0) {
                            j7 = DrawerDefaults.INSTANCE.getStandardContainerColor(startRestartGroup, 6);
                            i3 &= -897;
                        } else {
                            j7 = j3;
                        }
                        if ((i2 & 8) != 0) {
                            j4 = ColorSchemeKt.m2784contentColorForek8zF_U(j7, startRestartGroup, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        float m3071getPermanentDrawerElevationD9Ej5fM = i4 != 0 ? DrawerDefaults.INSTANCE.m3071getPermanentDrawerElevationD9Ej5fM() : f2;
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            shape4 = rectangleShape;
                            f4 = m3071getPermanentDrawerElevationD9Ej5fM;
                            j8 = j4;
                            i5 = 1877158612;
                            windowInsets4 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                        } else {
                            f4 = m3071getPermanentDrawerElevationD9Ej5fM;
                            j8 = j4;
                            windowInsets4 = windowInsets2;
                            shape4 = rectangleShape;
                            i5 = 1877158612;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i5, i3, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:825)");
                    }
                    Strings.Companion companion2 = Strings.INSTANCE;
                    final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 63181874, "CC(remember):NavigationDrawer.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(m4895getString2EP1pXo);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda23
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit PermanentDrawerSheet_afqeVBk$lambda$0$0;
                                PermanentDrawerSheet_afqeVBk$lambda$0$0 = NavigationDrawerKt.PermanentDrawerSheet_afqeVBk$lambda$0$0(m4895getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                                return PermanentDrawerSheet_afqeVBk$lambda$0$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i10 = i3 << 6;
                    composer2 = startRestartGroup;
                    Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                    long j9 = j7;
                    m3629DrawerSheetcm3T3N0(null, windowInsets4, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), shape4, j9, j8, f4, null, function33, composer2, ((i3 >> 12) & 112) | 6 | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (i10 & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    windowInsets3 = windowInsets4;
                    shape3 = shape4;
                    j5 = j9;
                    j6 = j8;
                    f3 = f4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    shape3 = shape2;
                    j5 = j3;
                    j6 = j4;
                    f3 = f2;
                    windowInsets3 = windowInsets2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit PermanentDrawerSheet_afqeVBk$lambda$1;
                            PermanentDrawerSheet_afqeVBk$lambda$1 = NavigationDrawerKt.PermanentDrawerSheet_afqeVBk$lambda$1(Modifier.this, shape3, j5, j6, f3, windowInsets3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return PermanentDrawerSheet_afqeVBk$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        shape2 = shape;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermanentDrawerSheet_afqeVBk$lambda$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: DrawerSheet-cm3T3N0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3629DrawerSheetcm3T3N0(final DrawerPredictiveBackState drawerPredictiveBackState, final WindowInsets windowInsets, Modifier modifier, Shape shape, long j, long j2, float f, FloatProducer floatProducer, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        WindowInsets windowInsets2;
        Modifier modifier2;
        int i4;
        Shape shape2;
        long j3;
        long j4;
        int i5;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final Shape shape3;
        final long j5;
        final long j6;
        final float f2;
        final FloatProducer floatProducer2;
        ScopeUpdateScope endRestartGroup;
        int i7;
        FloatProducer floatProducer3;
        float f3;
        long j7;
        int i8;
        Modifier.Companion companion;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1560288494);
        ComposerKt.sourceInformation(startRestartGroup, "C(DrawerSheet)N(drawerPredictiveBackState,windowInsets,modifier,drawerShape,drawerContainerColor:c#ui.graphics.Color,drawerContentColor:c#ui.graphics.Color,drawerTonalElevation:c#ui.unit.Dp,drawerOffset,content)851@37005L7,854@37162L7,880@38365L867,861@37427L1805:NavigationDrawer.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(drawerPredictiveBackState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            windowInsets2 = windowInsets;
            i3 |= startRestartGroup.changed(windowInsets2) ? 32 : 16;
        } else {
            windowInsets2 = windowInsets;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                shape2 = shape;
                i3 |= startRestartGroup.changed(shape2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i11 = 16384;
                            i3 |= i11;
                        }
                    } else {
                        j3 = j;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    j3 = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i10 = 131072;
                            i3 |= i10;
                        }
                    } else {
                        j4 = j2;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    if ((i2 & 128) == 0) {
                        if ((16777216 & i) == 0 ? startRestartGroup.changed(floatProducer) : startRestartGroup.changedInstance(floatProducer)) {
                            i9 = 8388608;
                            i3 |= i9;
                        }
                    }
                    i9 = 4194304;
                    i3 |= i9;
                }
                if ((100663296 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i6 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "845@36698L22,846@36754L37,848@36899L20");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        i7 = (i2 & 16) != 0 ? i6 & (-57345) : i6;
                        if ((i2 & 32) != 0) {
                            i7 &= -458753;
                        }
                        if ((i2 & 128) != 0) {
                            i7 &= -29360129;
                        }
                        f3 = f;
                        j7 = j3;
                        i8 = 12582912;
                        floatProducer3 = floatProducer;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            shape2 = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i2 & 16) != 0) {
                            j3 = DrawerDefaults.INSTANCE.getStandardContainerColor(startRestartGroup, 6);
                            i7 = i6 & (-57345);
                        } else {
                            i7 = i6;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ColorSchemeKt.m2784contentColorForek8zF_U(j3, startRestartGroup, (i7 >> 12) & 14);
                            i7 &= -458753;
                        }
                        float m3071getPermanentDrawerElevationD9Ej5fM = i5 != 0 ? DrawerDefaults.INSTANCE.m3071getPermanentDrawerElevationD9Ej5fM() : f;
                        if ((i2 & 128) != 0) {
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 493670338, "CC(remember):NavigationDrawer.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new FloatProducer() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda5
                                    @Override // androidx.compose.material3.internal.FloatProducer
                                    public final float invoke() {
                                        float DrawerSheet_cm3T3N0$lambda$0$0;
                                        DrawerSheet_cm3T3N0$lambda$0$0 = NavigationDrawerKt.DrawerSheet_cm3T3N0$lambda$0$0();
                                        return DrawerSheet_cm3T3N0$lambda$0$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            floatProducer3 = (FloatProducer) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            i7 &= -29360129;
                        } else {
                            floatProducer3 = floatProducer;
                        }
                        f3 = m3071getPermanentDrawerElevationD9Ej5fM;
                        j7 = j3;
                        i8 = 12582912;
                    }
                    long j8 = j4;
                    Shape shape4 = shape2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1560288494, i7, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:850)");
                    }
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float m5374getContainerWidthD9Ej5fM = NavigationDrawerTokens.INSTANCE.m5374getContainerWidthD9Ej5fM();
                    final float mo528toPx0680j_4 = ((Density) consume).mo528toPx0680j_4(m5374getContainerWidthD9Ej5fM);
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    boolean z = consume2 == LayoutDirection.Rtl;
                    if (drawerPredictiveBackState != null) {
                        companion = predictiveBackDrawerContainer(Modifier.INSTANCE, drawerPredictiveBackState, z);
                    } else {
                        companion = Modifier.INSTANCE;
                    }
                    Modifier modifier4 = modifier2;
                    final FloatProducer floatProducer4 = floatProducer3;
                    final WindowInsets windowInsets3 = windowInsets2;
                    final boolean z2 = z;
                    int i13 = i7 >> 6;
                    composer2 = startRestartGroup;
                    SurfaceKt.m4112SurfaceT9BRK9s(SizeKt.fillMaxHeight$default(horizontalScaleUp(SizeKt.m1275sizeInqDBjuR0$default(modifier4, MinimumDrawerWidth, 0.0f, m5374getContainerWidthD9Ej5fM, 0.0f, 10, null), floatProducer3, mo528toPx0680j_4, z).then(companion), 0.0f, 1, null), shape4, j7, j8, f3, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-315420087, true, new Function2() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit DrawerSheet_cm3T3N0$lambda$2;
                            DrawerSheet_cm3T3N0$lambda$2 = NavigationDrawerKt.DrawerSheet_cm3T3N0$lambda$2(DrawerPredictiveBackState.this, z2, m5374getContainerWidthD9Ej5fM, floatProducer4, mo528toPx0680j_4, windowInsets3, function3, (Composer) obj, ((Integer) obj2).intValue());
                            return DrawerSheet_cm3T3N0$lambda$2;
                        }
                    }, startRestartGroup, 54), composer2, (i13 & 112) | i8 | (i13 & 896) | (i13 & 7168) | (i13 & 57344), 96);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    floatProducer2 = floatProducer3;
                    shape3 = shape4;
                    j5 = j7;
                    j6 = j8;
                    f2 = f3;
                    modifier3 = modifier4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    shape3 = shape2;
                    j5 = j3;
                    j6 = j4;
                    f2 = f;
                    floatProducer2 = floatProducer;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit DrawerSheet_cm3T3N0$lambda$3;
                            DrawerSheet_cm3T3N0$lambda$3 = NavigationDrawerKt.DrawerSheet_cm3T3N0$lambda$3(DrawerPredictiveBackState.this, windowInsets, modifier3, shape3, j5, j6, f2, floatProducer2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return DrawerSheet_cm3T3N0$lambda$3;
                        }
                    });
                    return;
                }
                return;
            }
            shape2 = shape;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((100663296 & i) == 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        shape2 = shape;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((100663296 & i) == 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DrawerSheet_cm3T3N0$lambda$2(DrawerPredictiveBackState drawerPredictiveBackState, boolean z, float f, FloatProducer floatProducer, float f2, WindowInsets windowInsets, Function3 function3, Composer composer, int i) {
        Modifier.Companion companion;
        ComposerKt.sourceInformation(composer, "C885@38585L641:NavigationDrawer.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-315420087, i, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:881)");
            }
            if (drawerPredictiveBackState != null) {
                companion = predictiveBackDrawerChild(Modifier.INSTANCE, drawerPredictiveBackState, z);
            } else {
                companion = Modifier.INSTANCE;
            }
            Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(horizontalScaleDown(SizeKt.m1275sizeInqDBjuR0$default(Modifier.INSTANCE, MinimumDrawerWidth, 0.0f, f, 0.0f, 10, null), floatProducer, f2, z).then(companion), windowInsets);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, windowInsetsPadding);
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
            function3.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
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

    private static final Modifier horizontalScaleUp(Modifier modifier, final FloatProducer floatProducer, final float f, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit horizontalScaleUp$lambda$0;
                horizontalScaleUp$lambda$0 = NavigationDrawerKt.horizontalScaleUp$lambda$0(FloatProducer.this, f, z, (GraphicsLayerScope) obj);
                return horizontalScaleUp$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit horizontalScaleUp$lambda$0(FloatProducer floatProducer, float f, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float invoke = floatProducer.invoke();
        graphicsLayerScope.setScaleX(invoke > 0.0f ? (invoke / f) + 1.0f : 1.0f);
        graphicsLayerScope.mo6968setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 0.0f : 1.0f, 0.5f));
        return Unit.INSTANCE;
    }

    private static final Modifier horizontalScaleDown(Modifier modifier, final FloatProducer floatProducer, final float f, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit horizontalScaleDown$lambda$0;
                horizontalScaleDown$lambda$0 = NavigationDrawerKt.horizontalScaleDown$lambda$0(FloatProducer.this, f, z, (GraphicsLayerScope) obj);
                return horizontalScaleDown$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit horizontalScaleDown$lambda$0(FloatProducer floatProducer, float f, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float invoke = floatProducer.invoke();
        graphicsLayerScope.setScaleX(invoke > 0.0f ? 1 / ((invoke / f) + 1.0f) : 1.0f);
        graphicsLayerScope.mo6968setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 0.0f : 1.0f, 0.0f));
        return Unit.INSTANCE;
    }

    private static final Modifier predictiveBackDrawerContainer(Modifier modifier, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit predictiveBackDrawerContainer$lambda$0;
                predictiveBackDrawerContainer$lambda$0 = NavigationDrawerKt.predictiveBackDrawerContainer$lambda$0(DrawerPredictiveBackState.this, z, (GraphicsLayerScope) obj);
                return predictiveBackDrawerContainer$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit predictiveBackDrawerContainer$lambda$0(DrawerPredictiveBackState drawerPredictiveBackState, boolean z, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX(graphicsLayerScope, drawerPredictiveBackState));
        graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY(graphicsLayerScope, drawerPredictiveBackState));
        graphicsLayerScope.mo6968setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 1.0f : 0.0f, 0.5f));
        return Unit.INSTANCE;
    }

    private static final Modifier predictiveBackDrawerChild(Modifier modifier, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit predictiveBackDrawerChild$lambda$0;
                predictiveBackDrawerChild$lambda$0 = NavigationDrawerKt.predictiveBackDrawerChild$lambda$0(DrawerPredictiveBackState.this, z, (GraphicsLayerScope) obj);
                return predictiveBackDrawerChild$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit predictiveBackDrawerChild$lambda$0(DrawerPredictiveBackState drawerPredictiveBackState, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float calculatePredictiveBackScaleX = calculatePredictiveBackScaleX(graphicsLayerScope, drawerPredictiveBackState);
        graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX == 0.0f ? 1.0f : calculatePredictiveBackScaleY(graphicsLayerScope, drawerPredictiveBackState) / calculatePredictiveBackScaleX);
        graphicsLayerScope.mo6968setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 0.0f : 1.0f, 0.0f));
        return Unit.INSTANCE;
    }

    private static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.getSize() >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return ((drawerPredictiveBackState.getScaleXDistance() * (drawerPredictiveBackState.getSwipeEdgeMatchesDrawer() ? 1 : -1)) / intBitsToFloat) + 1.0f;
    }

    private static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (drawerPredictiveBackState.getScaleYDistance() / intBitsToFloat);
    }

    public static final void DrawerPredictiveBackHandler(final DrawerState drawerState, final Function3<? super DrawerPredictiveBackState, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        DrawerPredictiveBackState drawerPredictiveBackState;
        int i3;
        String str;
        NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 navigationDrawerKt$DrawerPredictiveBackHandler$2$1;
        Composer startRestartGroup = composer.startRestartGroup(-383087355);
        ComposerKt.sourceInformation(startRestartGroup, "C(DrawerPredictiveBackHandler)N(drawerState,content)996@42771L40,997@42828L24,998@42890L7,1002@43052L7,1008@43365L1297,1008@43313L1349,1040@44705L99,1040@44668L136,1046@44810L34:NavigationDrawer.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(drawerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-383087355, i4, -1, "androidx.compose.material3.DrawerPredictiveBackHandler (NavigationDrawer.kt:995)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1220244621, "CC(remember):NavigationDrawer.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new DrawerPredictiveBackState();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DrawerPredictiveBackState drawerPredictiveBackState2 = (DrawerPredictiveBackState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean z = consume == LayoutDirection.Rtl;
            Ref.FloatRef floatRef = new Ref.FloatRef();
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Ref.FloatRef floatRef3 = new Ref.FloatRef();
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume2;
            floatRef.element = density.mo528toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceGrow);
            floatRef2.element = density.mo528toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceShrink);
            floatRef3.element = density.mo528toPx0680j_4(PredictiveBackDrawerMaxScaleYDistance);
            boolean isOpen = drawerState.isOpen();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1220264886, "CC(remember):NavigationDrawer.kt#9igjgp");
            int i5 = i4 & 14;
            boolean changed = startRestartGroup.changed(z) | startRestartGroup.changed(floatRef.element) | startRestartGroup.changed(floatRef2.element) | startRestartGroup.changed(floatRef3.element) | startRestartGroup.changedInstance(coroutineScope) | (i5 == 4);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                drawerPredictiveBackState = drawerPredictiveBackState2;
                i3 = i5;
                str = "CC(remember):NavigationDrawer.kt#9igjgp";
                navigationDrawerKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(drawerPredictiveBackState, coroutineScope, drawerState, z, floatRef, floatRef2, floatRef3, null);
                startRestartGroup.updateRememberedValue(navigationDrawerKt$DrawerPredictiveBackHandler$2$1);
            } else {
                str = "CC(remember):NavigationDrawer.kt#9igjgp";
                drawerPredictiveBackState = drawerPredictiveBackState2;
                navigationDrawerKt$DrawerPredictiveBackHandler$2$1 = rememberedValue3;
                i3 = i5;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            BackHandler_androidKt.PredictiveBackHandler(isOpen, (Function2) navigationDrawerKt$DrawerPredictiveBackHandler$2$1, startRestartGroup, 0, 0);
            Boolean valueOf = Boolean.valueOf(drawerState.isClosed());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1220306568, str);
            boolean z2 = i3 == 4;
            NavigationDrawerKt$DrawerPredictiveBackHandler$3$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new NavigationDrawerKt$DrawerPredictiveBackHandler$3$1(drawerState, drawerPredictiveBackState, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
            function3.invoke(drawerPredictiveBackState, startRestartGroup, Integer.valueOf((i4 & 112) | 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DrawerPredictiveBackHandler$lambda$4;
                    DrawerPredictiveBackHandler$lambda$4 = NavigationDrawerKt.DrawerPredictiveBackHandler$lambda$4(DrawerState.this, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DrawerPredictiveBackHandler$lambda$4;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationDrawerItem(final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape2;
        int i6;
        Composer composer2;
        final NavigationDrawerItemColors navigationDrawerItemColors2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Shape shape3;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Shape shape4;
        Modifier modifier4;
        boolean z2;
        boolean z3;
        NavigationDrawerItemColors navigationDrawerItemColors3;
        MutableInteractionSource mutableInteractionSource3;
        NavigationDrawerItemColors navigationDrawerItemColors4;
        Modifier modifier5;
        ?? r2;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-583709666);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationDrawerItem)N(label,selected,onClick,modifier,icon,badge,shape,colors,interactionSource)1137@48733L19,1141@48910L24,1143@48995L885,1132@48601L1279:NavigationDrawer.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function24 = function22;
                i3 |= startRestartGroup.changedInstance(function24) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function25 = function23;
                    i3 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i8 = 1048576;
                                i3 |= i8;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i8 = 524288;
                        i3 |= i8;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(navigationDrawerItemColors)) {
                            i7 = 8388608;
                            i3 |= i7;
                        }
                        i7 = 4194304;
                        i3 |= i7;
                    }
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "1128@48449L5,1129@48526L8");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            mutableInteractionSource3 = mutableInteractionSource;
                            r2 = 1;
                            modifier5 = modifier2;
                            function28 = function25;
                            shape4 = shape2;
                            z3 = false;
                            navigationDrawerItemColors4 = navigationDrawerItemColors;
                        } else {
                            Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                            Function2<? super Composer, ? super Integer, Unit> function29 = i4 != 0 ? null : function24;
                            function28 = i5 != 0 ? null : function25;
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                shape4 = ShapesKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), startRestartGroup, 6);
                            } else {
                                shape4 = shape2;
                            }
                            int i10 = i3;
                            if ((i2 & 128) != 0) {
                                modifier4 = companion;
                                z3 = false;
                                z2 = true;
                                navigationDrawerItemColors3 = NavigationDrawerItemDefaults.INSTANCE.m3614colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 100663296, 255);
                                startRestartGroup = startRestartGroup;
                                i3 = i10 & (-29360129);
                            } else {
                                modifier4 = companion;
                                z2 = true;
                                z3 = false;
                                navigationDrawerItemColors3 = navigationDrawerItemColors;
                                i3 = i10;
                            }
                            mutableInteractionSource3 = i6 != 0 ? null : mutableInteractionSource;
                            navigationDrawerItemColors4 = navigationDrawerItemColors3;
                            function24 = function29;
                            modifier5 = modifier4;
                            r2 = z2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-583709666, i3, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1131)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1695745329, "CC(remember):NavigationDrawer.kt#9igjgp");
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function1() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit NavigationDrawerItem$lambda$0$0;
                                    NavigationDrawerItem$lambda$0$0 = NavigationDrawerKt.NavigationDrawerItem$lambda$0$0((SemanticsPropertyReceiver) obj);
                                    return NavigationDrawerItem$lambda$0$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i11 = i3 >> 3;
                        final NavigationDrawerItemColors navigationDrawerItemColors5 = navigationDrawerItemColors4;
                        final Function2<? super Composer, ? super Integer, Unit> function210 = function24;
                        final Function2<? super Composer, ? super Integer, Unit> function211 = function28;
                        Modifier modifier6 = modifier5;
                        Shape shape5 = shape4;
                        SurfaceKt.m4113Surfaced85dljk(z, function0, SizeKt.fillMaxWidth$default(SizeKt.m1259heightInVpY3zN4$default(SemanticsModifierKt.semantics$default(modifier5, z3, (Function1) rememberedValue, r2, null), NavigationDrawerTokens.INSTANCE.m5372getActiveIndicatorHeightD9Ej5fM(), 0.0f, 2, null), 0.0f, r2, null), false, shape5, navigationDrawerItemColors4.containerColor(z, startRestartGroup, (i11 & 14) | ((i3 >> 18) & 112)).getValue().m6796unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource3, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1173018444, r2, new Function2() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit NavigationDrawerItem$lambda$1;
                                NavigationDrawerItem$lambda$1 = NavigationDrawerKt.NavigationDrawerItem$lambda$1(Function2.this, navigationDrawerItemColors5, z, function211, function2, (Composer) obj, ((Integer) obj2).intValue());
                                return NavigationDrawerItem$lambda$1;
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i11 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                        composer2 = startRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape3 = shape5;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        navigationDrawerItemColors2 = navigationDrawerItemColors5;
                        modifier3 = modifier6;
                        function26 = function210;
                        function27 = function28;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        navigationDrawerItemColors2 = navigationDrawerItemColors;
                        modifier3 = modifier2;
                        function26 = function24;
                        function27 = function25;
                        shape3 = shape2;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.NavigationDrawerKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit NavigationDrawerItem$lambda$2;
                                NavigationDrawerItem$lambda$2 = NavigationDrawerKt.NavigationDrawerItem$lambda$2(Function2.this, z, function0, modifier3, function26, function27, shape3, navigationDrawerItemColors2, mutableInteractionSource2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return NavigationDrawerItem$lambda$2;
                            }
                        });
                        return;
                    }
                    return;
                }
                function25 = function23;
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function24 = function22;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function25 = function23;
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function24 = function22;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function25 = function23;
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationDrawerItem$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8888getTabo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationDrawerItem$lambda$1(Function2 function2, NavigationDrawerItemColors navigationDrawerItemColors, boolean z, Function2 function22, Function2 function23, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1144@49005L869:NavigationDrawer.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1173018444, i, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:1144)");
            }
            Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m9732constructorimpl(16), 0.0f, Dp.m9732constructorimpl(24), 0.0f, 10, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1205paddingqDBjuR0$default);
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
            Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -2013922645, "C1153@49404L203:NavigationDrawer.kt#uh7d8r");
            if (function2 != null) {
                composer.startReplaceGroup(-2013920011);
                ComposerKt.sourceInformation(composer, "1149@49211L19,1150@49253L78,1151@49348L29");
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(navigationDrawerItemColors.iconColor(z, composer, 0).getValue().m6796unboximpl())), (Function2<? super Composer, ? super Integer, Unit>) function2, composer, ProvidedValue.$stable);
                SpacerKt.Spacer(SizeKt.m1276width3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(12)), composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2013707630);
                composer.endReplaceGroup();
            }
            Modifier weight$default = RowScope.CC.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, weight$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl2 = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1767721817, "C1154@49471L19,1155@49513L80:NavigationDrawer.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(navigationDrawerItemColors.textColor(z, composer, 0).getValue().m6796unboximpl())), (Function2<? super Composer, ? super Integer, Unit>) function23, composer, ProvidedValue.$stable);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (function22 != null) {
                composer.startReplaceGroup(-2013454639);
                ComposerKt.sourceInformation(composer, "1158@49657L29,1159@49727L20,1160@49770L80");
                SpacerKt.Spacer(SizeKt.m1276width3ABfNKs(Modifier.INSTANCE, Dp.m9732constructorimpl(12)), composer, 6);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(navigationDrawerItemColors.badgeColor(z, composer, 0).getValue().m6796unboximpl())), (Function2<? super Composer, ? super Integer, Unit>) function22, composer, ProvidedValue.$stable);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2013238414);
                composer.endReplaceGroup();
            }
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
    public static final float calculateFraction(float f, float f2, float f3) {
        return RangesKt.coerceIn((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceGrow() {
        return PredictiveBackDrawerMaxScaleXDistanceGrow;
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceShrink() {
        return PredictiveBackDrawerMaxScaleXDistanceShrink;
    }

    public static final float getPredictiveBackDrawerMaxScaleYDistance() {
        return PredictiveBackDrawerMaxScaleYDistance;
    }
}
