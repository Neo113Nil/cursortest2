package androidx.compose.material3;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.BasicTooltipDefaults;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tooltip.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0007¢\u0006\u0002\b\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\u0014\u001ax\u0010\u0015\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u00192\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b \u0010!\u001a\u009c\u0001\u0010\"\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u00072\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u00192\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b(\u0010)\u001a+\u0010*\u001a\u00020\n2\b\b\u0002\u0010+\u001a\u00020\u00102\b\b\u0002\u0010,\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020.H\u0007¢\u0006\u0002\u0010/\u001a$\u00100\u001a\u00020\n2\b\b\u0002\u0010+\u001a\u00020\u00102\b\b\u0002\u0010,\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020.\u001a\u001c\u00101\u001a\u00020\f*\u00020\f2\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0010H\u0001\u001a \u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0000\u001aT\u0010;\u001a\u00020\f*\u00020\f2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0019\u0010C\u001a\u0015\u0012\u0004\u0012\u00020D\u0012\u0006\u0012\u0004\u0018\u00010E0\u0005¢\u0006\u0002\b\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0004\bF\u0010G\"\u0016\u0010H\u001a\u00020\u0019X\u0080\u0004¢\u0006\n\n\u0002\u0010K\u001a\u0004\bI\u0010J\"\u0016\u0010L\u001a\u00020\u0019X\u0080\u0004¢\u0006\n\n\u0002\u0010K\u001a\u0004\bM\u0010J\"\u0016\u0010N\u001a\u00020\u0019X\u0080\u0004¢\u0006\n\n\u0002\u0010K\u001a\u0004\bO\u0010J\"\u0010\u0010P\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010K\"\u0010\u0010Q\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010K\"\u0014\u0010R\u001a\u00020SX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010U\"\u0016\u0010V\u001a\u00020\u0019X\u0080\u0004¢\u0006\n\n\u0002\u0010K\u001a\u0004\bW\u0010J\"\u0016\u0010X\u001a\u00020\u0019X\u0080\u0004¢\u0006\n\n\u0002\u0010K\u001a\u0004\bY\u0010J\"\u0010\u0010Z\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010K\"\u0010\u0010[\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010K\"\u0016\u0010\\\u001a\u00020\u0019X\u0080\u0004¢\u0006\n\n\u0002\u0010K\u001a\u0004\b]\u0010J\"\u0016\u0010^\u001a\u00020\u0019X\u0080\u0004¢\u0006\n\n\u0002\u0010K\u001a\u0004\b_\u0010J¨\u0006`²\u0006\n\u0010a\u001a\u000208X\u008a\u0084\u0002²\u0006\n\u0010b\u001a\u000205X\u008a\u0084\u0002²\u0006\n\u0010c\u001a\u000205X\u008a\u0084\u0002"}, d2 = {"TooltipBox", "", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "tooltip", "Lkotlin/Function1;", "Landroidx/compose/material3/TooltipScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "state", "Landroidx/compose/material3/TooltipState;", "modifier", "Landroidx/compose/ui/Modifier;", "onDismissRequest", "Lkotlin/Function0;", "focusable", "", "enableUserInput", "hasAction", "content", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function3;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PlainTooltip", "caretShape", "Landroidx/compose/ui/graphics/Shape;", "maxWidth", "Landroidx/compose/ui/unit/Dp;", "shape", "contentColor", "Landroidx/compose/ui/graphics/Color;", "containerColor", "tonalElevation", "shadowElevation", "PlainTooltip-gv3ox5I", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "RichTooltip", "title", "action", "colors", "Landroidx/compose/material3/RichTooltipColors;", "text", "RichTooltip-EkvW5A0", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "rememberTooltipState", "initialIsVisible", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TooltipState;", "TooltipState", "textVerticalPadding", "subheadExists", "actionExists", "caretX", "", "tooltipWidth", "screenWidthPx", "", "anchorBounds", "Landroidx/compose/ui/geometry/Rect;", "layoutCaret", "transformationMatrix", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/Matrix;", "density", "Landroidx/compose/ui/unit/Density;", "windowContainerSize", "Landroidx/compose/ui/unit/IntSize;", "getAnchorLayoutCoordinates", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCaret-J5j9r9c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/unit/Density;JLkotlin/jvm/functions/Function1;Landroidx/compose/ui/window/PopupPositionProvider;)Landroidx/compose/ui/Modifier;", "SpacingBetweenTooltipAndAnchor", "getSpacingBetweenTooltipAndAnchor", "()F", "F", "TooltipMinHeight", "getTooltipMinHeight", "TooltipMinWidth", "getTooltipMinWidth", "PlainTooltipVerticalPadding", "PlainTooltipHorizontalPadding", "PlainTooltipContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getPlainTooltipContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "RichTooltipHorizontalPadding", "getRichTooltipHorizontalPadding", "HeightToSubheadFirstLine", "getHeightToSubheadFirstLine", "HeightFromSubheadToTextFirstLine", "TextBottomPadding", "ActionLabelMinHeight", "getActionLabelMinHeight", "ActionLabelBottomPadding", "getActionLabelBottomPadding", "material3", "tooltipSide", "scale", "alpha"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class TooltipKt {
    private static final float ActionLabelBottomPadding;
    private static final float ActionLabelMinHeight;
    private static final float HeightFromSubheadToTextFirstLine;
    private static final float HeightToSubheadFirstLine;
    private static final PaddingValues PlainTooltipContentPadding;
    private static final float PlainTooltipHorizontalPadding;
    private static final float PlainTooltipVerticalPadding;
    private static final float RichTooltipHorizontalPadding;
    private static final float SpacingBetweenTooltipAndAnchor;
    private static final float TextBottomPadding;
    private static final float TooltipMinHeight;
    private static final float TooltipMinWidth = Dp.m9732constructorimpl(40);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlainTooltip_gv3ox5I$lambda$4(TooltipScope tooltipScope, Modifier modifier, Shape shape, float f, Shape shape2, long j, long j2, float f2, float f3, Function2 function2, int i, int i2, Composer composer, int i3) {
        m4544PlainTooltipgv3ox5I(tooltipScope, modifier, shape, f, shape2, j, j2, f2, f3, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RichTooltip_EkvW5A0$lambda$4(TooltipScope tooltipScope, Modifier modifier, Function2 function2, Function2 function22, Shape shape, float f, Shape shape2, RichTooltipColors richTooltipColors, float f2, float f3, Function2 function23, int i, int i2, int i3, Composer composer, int i4) {
        m4545RichTooltipEkvW5A0(tooltipScope, modifier, function2, function22, shape, f, shape2, richTooltipColors, f2, f3, function23, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipBox$lambda$13(PopupPositionProvider popupPositionProvider, Function3 function3, TooltipState tooltipState, Modifier modifier, Function0 function0, boolean z, boolean z2, boolean z3, Function2 function2, int i, int i2, Composer composer, int i3) {
        TooltipBox(popupPositionProvider, function3, tooltipState, modifier, function0, z, z2, z3, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TooltipBox(final PopupPositionProvider popupPositionProvider, final Function3<? super TooltipScope, ? super Composer, ? super Integer, Unit> function3, final TooltipState tooltipState, Modifier modifier, Function0<Unit> function0, boolean z, boolean z2, boolean z3, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        int i8;
        final boolean z6;
        final Modifier modifier3;
        final Function0<Unit> function03;
        final boolean z7;
        final boolean z8;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        int i9;
        Object currentState;
        boolean z9;
        boolean z10;
        Float f;
        Object currentState2;
        Snapshot.Companion companion;
        Snapshot currentThreadSnapshot;
        Function1<Object, Unit> readObserver;
        Snapshot makeCurrentNonObservable;
        Function1<Object, Unit> function1;
        Composer startRestartGroup = composer.startRestartGroup(-293753984);
        ComposerKt.sourceInformation(startRestartGroup, "C(TooltipBox)N(positionProvider,tooltip,state,modifier,onDismissRequest,focusable,enableUserInput,hasAction,content)172@7713L64,173@7835L33,174@7885L71,176@8007L103,180@8138L42,182@8212L938,207@9273L14,208@9342L14,212@9453L163,221@9728L159,230@9973L506,228@9893L829:Tooltip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(tooltipState) : startRestartGroup.changedInstance(tooltipState) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    z4 = z;
                    i3 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        z5 = z2;
                    } else {
                        z5 = z2;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
                        }
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                        if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(function2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            Modifier.Companion companion2 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            Function0<Unit> function04 = i4 != 0 ? null : function02;
                            boolean z11 = i5 != 0 ? false : z4;
                            boolean z12 = i6 != 0 ? true : z5;
                            boolean z13 = i8 != 0 ? false : z3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-293753984, i3, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:170)");
                            }
                            final Transition updateTransition = TransitionKt.updateTransition((MutableTransitionState) tooltipState.getTransition(), "tooltip transition", startRestartGroup, MutableTransitionState.$stable | 48, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1170279873, "CC(remember):Tooltip.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final MutableState mutableState = (MutableState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1170281511, "CC(remember):Tooltip.kt#9igjgp");
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new TooltipScopeImpl(new Function0() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda17
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        LayoutCoordinates TooltipBox$lambda$1$0;
                                        TooltipBox$lambda$1$0 = TooltipKt.TooltipBox$lambda$1$0(MutableState.this);
                                        return TooltipBox$lambda$1$0;
                                    }
                                }, popupPositionProvider);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final TooltipScopeImpl tooltipScopeImpl = (TooltipScopeImpl) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-23901870, true, new Function2() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TooltipBox$lambda$2;
                                    TooltipBox$lambda$2 = TooltipKt.TooltipBox$lambda$2(MutableState.this, function2, (Composer) obj, ((Integer) obj2).intValue());
                                    return TooltipBox$lambda$2;
                                }
                            }, startRestartGroup, 54);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1170289578, "CC(remember):Tooltip.kt#9igjgp");
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            final MutableState mutableState2 = (MutableState) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1170292842, "CC(remember):Tooltip.kt#9igjgp");
                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int TooltipBox$lambda$4$0;
                                        TooltipBox$lambda$4$0 = TooltipKt.TooltipBox$lambda$4$0(MutableState.this, mutableState2);
                                        return Integer.valueOf(TooltipBox$lambda$4$0);
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            final State state = (State) rememberedValue4;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
                            final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                            Function3 function32 = new Function3() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    FiniteAnimationSpec TooltipBox$lambda$6;
                                    TooltipBox$lambda$6 = TooltipKt.TooltipBox$lambda$6(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    return TooltipBox$lambda$6;
                                }
                            };
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844118987, "CC(animateFloat)N(transitionSpec,label,targetValueByState)1971@84243L78:Transition.kt#pdpnli");
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
                            if (updateTransition.isSeeking()) {
                                modifier4 = companion2;
                                i9 = i3;
                                startRestartGroup.startReplaceGroup(1666827533);
                                startRestartGroup.endReplaceGroup();
                                currentState = updateTransition.getCurrentState();
                            } else {
                                startRestartGroup.startReplaceGroup(1666573488);
                                ComposerKt.sourceInformation(startRestartGroup, "1864@79141L67");
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054612652, "CC(remember):Transition.kt#9igjgp");
                                boolean changed = startRestartGroup.changed(updateTransition);
                                currentState = startRestartGroup.rememberedValue();
                                if (changed || currentState == Composer.INSTANCE.getEmpty()) {
                                    companion = Snapshot.INSTANCE;
                                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                    if (currentThreadSnapshot != null) {
                                        modifier4 = companion2;
                                        function1 = currentThreadSnapshot.getReadObserver();
                                    } else {
                                        modifier4 = companion2;
                                        function1 = null;
                                    }
                                    i9 = i3;
                                    makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                    try {
                                        Object currentState3 = updateTransition.getCurrentState();
                                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                        startRestartGroup.updateRememberedValue(currentState3);
                                        currentState = currentState3;
                                    } finally {
                                    }
                                } else {
                                    modifier4 = companion2;
                                    i9 = i3;
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceGroup();
                            }
                            boolean booleanValue = ((Boolean) currentState).booleanValue();
                            startRestartGroup.startReplaceGroup(838300572);
                            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Tooltip.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                z9 = booleanValue;
                                ComposerKt.traceEventStart(838300572, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:216)");
                            } else {
                                z9 = booleanValue;
                            }
                            float f2 = z9 ? 1.0f : 0.8f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            Float valueOf = Float.valueOf(f2);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
                            boolean changed2 = startRestartGroup.changed(updateTransition);
                            Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$$inlined$animateFloat$1
                                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        return Transition.this.getTargetState();
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            boolean booleanValue2 = ((Boolean) ((State) rememberedValue5).getValue()).booleanValue();
                            startRestartGroup.startReplaceGroup(838300572);
                            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Tooltip.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                z10 = booleanValue2;
                                f = valueOf;
                                ComposerKt.traceEventStart(838300572, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:216)");
                            } else {
                                z10 = booleanValue2;
                                f = valueOf;
                            }
                            float f3 = z10 ? 1.0f : 0.8f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            Float valueOf2 = Float.valueOf(f3);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
                            boolean changed3 = startRestartGroup.changed(updateTransition);
                            Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if (changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Boolean>>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$$inlined$animateFloat$2
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Transition.Segment<Boolean> invoke() {
                                        return Transition.this.getSegment();
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i11 = i9;
                            final State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, f, valueOf2, (FiniteAnimationSpec) function32.invoke(((State) rememberedValue6).getValue(), startRestartGroup, 0), vectorConverter, "tooltip transition: scaling", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Function3 function33 = new Function3() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    FiniteAnimationSpec TooltipBox$lambda$9;
                                    TooltipBox$lambda$9 = TooltipKt.TooltipBox$lambda$9(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    return TooltipBox$lambda$9;
                                }
                            };
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844118987, "CC(animateFloat)N(transitionSpec,label,targetValueByState)1971@84243L78:Transition.kt#pdpnli");
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
                            if (updateTransition.isSeeking()) {
                                startRestartGroup.startReplaceGroup(1666827533);
                                startRestartGroup.endReplaceGroup();
                                currentState2 = updateTransition.getCurrentState();
                            } else {
                                startRestartGroup.startReplaceGroup(1666573488);
                                ComposerKt.sourceInformation(startRestartGroup, "1864@79141L67");
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054612652, "CC(remember):Transition.kt#9igjgp");
                                boolean changed4 = startRestartGroup.changed(updateTransition);
                                currentState2 = startRestartGroup.rememberedValue();
                                if (changed4 || currentState2 == Composer.INSTANCE.getEmpty()) {
                                    companion = Snapshot.INSTANCE;
                                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                    makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                    try {
                                        Object currentState4 = updateTransition.getCurrentState();
                                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                        startRestartGroup.updateRememberedValue(currentState4);
                                        currentState2 = currentState4;
                                    } finally {
                                    }
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceGroup();
                            }
                            boolean booleanValue3 = ((Boolean) currentState2).booleanValue();
                            startRestartGroup.startReplaceGroup(-1903393104);
                            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Tooltip.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1903393104, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:225)");
                            }
                            float f4 = booleanValue3 ? 1.0f : 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            Float valueOf3 = Float.valueOf(f4);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
                            boolean changed5 = startRestartGroup.changed(updateTransition);
                            Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if (changed5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$$inlined$animateFloat$3
                                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        return Transition.this.getTargetState();
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            boolean booleanValue4 = ((Boolean) ((State) rememberedValue7).getValue()).booleanValue();
                            startRestartGroup.startReplaceGroup(-1903393104);
                            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Tooltip.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1903393104, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:225)");
                            }
                            float f5 = booleanValue4 ? 1.0f : 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            Float valueOf4 = Float.valueOf(f5);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
                            boolean changed6 = startRestartGroup.changed(updateTransition);
                            Object rememberedValue8 = startRestartGroup.rememberedValue();
                            if (changed6 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Boolean>>() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$$inlined$animateFloat$4
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Transition.Segment<Boolean> invoke() {
                                        return Transition.this.getSegment();
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, valueOf4, (FiniteAnimationSpec) function33.invoke(((State) rememberedValue8).getValue(), startRestartGroup, 0), vectorConverter2, "tooltip transition: alpha", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Function0<Unit> function05 = function04;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            boolean z16 = z13;
                            BasicTooltipKt.BasicTooltipBox(popupPositionProvider, ComposableLambdaKt.rememberComposableLambda(-527401546, true, new Function2() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TooltipBox$lambda$12;
                                    TooltipBox$lambda$12 = TooltipKt.TooltipBox$lambda$12(MutableState.this, createTransitionAnimation, createTransitionAnimation2, state, function3, tooltipScopeImpl, (Composer) obj, ((Integer) obj2).intValue());
                                    return TooltipBox$lambda$12;
                                }
                            }, startRestartGroup, 54), tooltipState, modifier4, function05, z14, z15, z16, rememberComposableLambda, startRestartGroup, (i11 & 14) | 100663344 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z8 = z16;
                            z6 = z15;
                            z7 = z14;
                            function03 = function05;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z6 = z5;
                            modifier3 = modifier2;
                            function03 = function02;
                            z7 = z4;
                            z8 = z3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TooltipBox$lambda$13;
                                    TooltipBox$lambda$13 = TooltipKt.TooltipBox$lambda$13(PopupPositionProvider.this, function3, tooltipState, modifier3, function03, z7, z6, z8, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return TooltipBox$lambda$13;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    if ((i & 100663296) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z4 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i & 100663296) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function02 = function0;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z4 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z4 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates TooltipBox$lambda$1$0(MutableState mutableState) {
        return (LayoutCoordinates) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipBox$lambda$2(final MutableState mutableState, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C177@8062L27,177@8017L87:Tooltip.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-23901870, i, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:177)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1494858803, "CC(remember):Tooltip.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TooltipBox$lambda$2$0$0;
                        TooltipBox$lambda$2$0$0 = TooltipKt.TooltipBox$lambda$2$0$0(MutableState.this, (LayoutCoordinates) obj);
                        return TooltipBox$lambda$2$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) rememberedValue);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, onGloballyPositioned);
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
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1430320766, "C177@8093L9:Tooltip.kt#uh7d8r");
            function2.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipBox$lambda$2$0$0(MutableState mutableState, LayoutCoordinates layoutCoordinates) {
        mutableState.setValue(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TooltipBox$lambda$4$0(MutableState mutableState, MutableState mutableState2) {
        if (mutableState.getValue() == null || mutableState2.getValue() == null) {
            return 0;
        }
        Object value = mutableState.getValue();
        Intrinsics.checkNotNull(value);
        long positionOnScreen = LayoutCoordinatesKt.positionOnScreen((LayoutCoordinates) value);
        Object value2 = mutableState2.getValue();
        Intrinsics.checkNotNull(value2);
        long m6529unboximpl = ((Offset) value2).m6529unboximpl();
        return Float.intBitsToFloat((int) (m6529unboximpl >> 32)) <= Float.intBitsToFloat((int) (positionOnScreen >> 32)) ? Float.intBitsToFloat((int) (m6529unboximpl & 4294967295L)) < Float.intBitsToFloat((int) (positionOnScreen & 4294967295L)) ? 1 : 3 : Float.intBitsToFloat((int) (m6529unboximpl & 4294967295L)) < Float.intBitsToFloat((int) (positionOnScreen & 4294967295L)) ? 2 : 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec TooltipBox$lambda$6(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(-1664496585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1664496585, i, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:213)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec TooltipBox$lambda$9(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(-111222965);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-111222965, i, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:222)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipBox$lambda$12(final MutableState mutableState, final State state, final State state2, State state3, Function3 function3, TooltipScopeImpl tooltipScopeImpl, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C231@10021L49,231@9987L482:Tooltip.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-527401546, i, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:231)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -26743193, "CC(remember):Tooltip.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TooltipBox$lambda$12$0$0;
                        TooltipBox$lambda$12$0$0 = TooltipKt.TooltipBox$lambda$12$0$0(MutableState.this, (LayoutCoordinates) obj);
                        return TooltipBox$lambda$12$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) rememberedValue);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, onGloballyPositioned);
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
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1084316090, "C:Tooltip.kt#uh7d8r");
            composer.startMovableGroup(-1350495383, Integer.valueOf(TooltipBox$lambda$5(state3)));
            ComposerKt.sourceInformation(composer, "234@10181L170,233@10129L308");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1350492666, "CC(remember):Tooltip.kt#9igjgp");
            boolean changed = composer.changed(state) | composer.changed(state2);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TooltipBox$lambda$12$1$0$0;
                        TooltipBox$lambda$12$1$0$0 = TooltipKt.TooltipBox$lambda$12$1$0$0(State.this, state2, (GraphicsLayerScope) obj);
                        return TooltipBox$lambda$12$1$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) rememberedValue2);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, graphicsLayer);
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
            Updater.m5872setimpl(m5864constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1874804875, "C240@10406L9:Tooltip.kt#uh7d8r");
            function3.invoke(tooltipScopeImpl, composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endMovableGroup();
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
    public static final Unit TooltipBox$lambda$12$0$0(MutableState mutableState, LayoutCoordinates layoutCoordinates) {
        mutableState.setValue(Offset.m6508boximpl(LayoutCoordinatesKt.positionOnScreen(layoutCoordinates)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipBox$lambda$12$1$0$0(State state, State state2, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setScaleX(TooltipBox$lambda$8(state));
        graphicsLayerScope.setScaleY(TooltipBox$lambda$8(state));
        graphicsLayerScope.setAlpha(TooltipBox$lambda$11(state2));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0287, code lost:
    
        if (r2.changedInstance(r3) != false) goto L167;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* renamed from: PlainTooltip-gv3ox5I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4544PlainTooltipgv3ox5I(final TooltipScope tooltipScope, Modifier modifier, Shape shape, float f, Shape shape2, long j, long j2, float f2, float f3, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Shape shape3;
        int i5;
        float f4;
        Shape shape4;
        long j3;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        final float f5;
        final Modifier modifier3;
        final Shape shape5;
        final float f6;
        final long j4;
        final Shape shape6;
        final float f7;
        final long j5;
        ScopeUpdateScope endRestartGroup;
        long j6;
        float m9732constructorimpl;
        int i9;
        int i10;
        long j7;
        int i11;
        float f8;
        final long j8;
        int i12;
        Modifier modifier4;
        Shape shape7;
        final TooltipScope tooltipScope2;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Object rememberedValue2;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-343758958);
        ComposerKt.sourceInformation(startRestartGroup, "C(PlainTooltip)N(modifier,caretShape,maxWidth:c#ui.unit.Dp,shape,contentColor:c#ui.graphics.Color,containerColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,content)356@14950L596,350@14753L793:Tooltip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 1;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                shape3 = shape;
                i3 |= startRestartGroup.changed(shape3) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    f4 = f;
                    i3 |= startRestartGroup.changed(f4) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 8) == 0) {
                            shape4 = shape2;
                            if (startRestartGroup.changed(shape4)) {
                                i13 = 16384;
                                i3 |= i13;
                            }
                        } else {
                            shape4 = shape2;
                        }
                        i13 = 8192;
                        i3 |= i13;
                    } else {
                        shape4 = shape2;
                    }
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        j3 = j;
                        i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j3)) ? 131072 : 65536;
                    } else {
                        j3 = j;
                    }
                    if ((i & 1572864) == 0) {
                        i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j2)) ? 1048576 : 524288;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changed(f3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if ((i & 805306368) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    i8 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i8 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "319@13645L26,320@13715L24,321@13785L26");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i8 &= -57345;
                            }
                            if ((i2 & 16) != 0) {
                                i8 &= -458753;
                            }
                            if ((i2 & 32) != 0) {
                                i8 &= -3670017;
                            }
                            j7 = j2;
                            m9732constructorimpl = f3;
                            j8 = j3;
                            f7 = f4;
                            i9 = 12582912;
                            i10 = i8;
                            i11 = 2;
                            f8 = f2;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                shape3 = null;
                            }
                            if (i5 != 0) {
                                f4 = TooltipDefaults.INSTANCE.m4532getPlainTooltipMaxWidthD9Ej5fM();
                            }
                            if ((i2 & 8) != 0) {
                                shape4 = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(startRestartGroup, 6);
                                i8 &= -57345;
                            }
                            if ((i2 & 16) != 0) {
                                j3 = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(startRestartGroup, 6);
                                i8 &= -458753;
                            }
                            if ((i2 & 32) != 0) {
                                j6 = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(startRestartGroup, 6);
                                i8 &= -3670017;
                            } else {
                                j6 = j2;
                            }
                            float m9732constructorimpl2 = i6 != 0 ? Dp.m9732constructorimpl(0) : f2;
                            m9732constructorimpl = i7 != 0 ? Dp.m9732constructorimpl(0) : f3;
                            i9 = 12582912;
                            i10 = i8;
                            j7 = j6;
                            i11 = 2;
                            f8 = m9732constructorimpl2;
                            j8 = j3;
                            f7 = f4;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            i12 = i9;
                            ComposerKt.traceEventStart(-343758958, i10, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                        } else {
                            i12 = i9;
                        }
                        if (shape3 != null) {
                            startRestartGroup.startReplaceGroup(-1720514983);
                            ComposerKt.sourceInformation(startRestartGroup, "329@14044L37,330@14117L7,331@14175L7,337@14389L24,342@14546L118");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 360142071, "CC(remember):Tooltip.kt#9igjgp");
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Matrix.m7039boximpl(Matrix.m7041constructorimpl$default(null, 1, null)), null, i11, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            MutableState mutableState = (MutableState) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Density density = (Density) consume;
                            ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localWindowInfo);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            long mo8822getContainerSizeYbymL2g = ((WindowInfo) consume2).mo8822getContainerSizeYbymL2g();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 360153098, "CC(remember):Tooltip.kt#9igjgp");
                            if ((i10 & 14) != 4) {
                                if ((i10 & 8) != 0) {
                                    tooltipScope2 = tooltipScope;
                                } else {
                                    tooltipScope2 = tooltipScope;
                                }
                                z = false;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function1() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            LayoutCoordinates obtainAnchorBounds;
                                            obtainAnchorBounds = TooltipScope.this.obtainAnchorBounds((MeasureScope) obj);
                                            return obtainAnchorBounds;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Modifier then = m4546layoutCaretJ5j9r9c(companion, mutableState, density, mo8822getContainerSizeYbymL2g, (Function1) rememberedValue, tooltipScope2.obtainPositionProvider()).then(modifier2);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 360158216, "CC(remember):Tooltip.kt#9igjgp");
                                z2 = ((((57344 & i10) ^ 24576) <= 16384 && startRestartGroup.changed(shape4)) || (i10 & 24576) == 16384) | ((i10 & 896) != 256);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new TooltipCaretShape(mutableState, shape4, shape3);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceGroup();
                                modifier4 = then;
                                shape7 = (TooltipCaretShape) rememberedValue2;
                            } else {
                                tooltipScope2 = tooltipScope;
                            }
                            z = true;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z) {
                            }
                            rememberedValue = new Function1() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    LayoutCoordinates obtainAnchorBounds;
                                    obtainAnchorBounds = TooltipScope.this.obtainAnchorBounds((MeasureScope) obj);
                                    return obtainAnchorBounds;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier then2 = m4546layoutCaretJ5j9r9c(companion, mutableState, density, mo8822getContainerSizeYbymL2g, (Function1) rememberedValue, tooltipScope2.obtainPositionProvider()).then(modifier2);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 360158216, "CC(remember):Tooltip.kt#9igjgp");
                            z2 = ((((57344 & i10) ^ 24576) <= 16384 && startRestartGroup.changed(shape4)) || (i10 & 24576) == 16384) | ((i10 & 896) != 256);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2) {
                            }
                            rememberedValue2 = new TooltipCaretShape(mutableState, shape4, shape3);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                            modifier4 = then2;
                            shape7 = (TooltipCaretShape) rememberedValue2;
                        } else {
                            startRestartGroup.startReplaceGroup(-1719869687);
                            startRestartGroup.endReplaceGroup();
                            modifier4 = modifier2;
                            shape7 = shape4;
                        }
                        int i15 = i10 >> 9;
                        composer2 = startRestartGroup;
                        SurfaceKt.m4112SurfaceT9BRK9s(modifier4, shape7, j7, 0L, f8, m9732constructorimpl, null, ComposableLambdaKt.rememberComposableLambda(-1573998995, true, new Function2() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit PlainTooltip_gv3ox5I$lambda$3;
                                PlainTooltip_gv3ox5I$lambda$3 = TooltipKt.PlainTooltip_gv3ox5I$lambda$3(f7, j8, function2, (Composer) obj, ((Integer) obj2).intValue());
                                return PlainTooltip_gv3ox5I$lambda$3;
                            }
                        }, startRestartGroup, 54), composer2, ((i10 >> 12) & 896) | i12 | (57344 & i15) | (i15 & 458752), 72);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        shape5 = shape3;
                        f6 = f8;
                        f5 = m9732constructorimpl;
                        j4 = j8;
                        shape6 = shape4;
                        j5 = j7;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        f5 = f3;
                        modifier3 = modifier2;
                        shape5 = shape3;
                        f6 = f2;
                        j4 = j3;
                        shape6 = shape4;
                        f7 = f4;
                        j5 = j2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit PlainTooltip_gv3ox5I$lambda$4;
                                PlainTooltip_gv3ox5I$lambda$4 = TooltipKt.PlainTooltip_gv3ox5I$lambda$4(TooltipScope.this, modifier3, shape5, f7, shape6, j4, j5, f6, f5, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return PlainTooltip_gv3ox5I$lambda$4;
                            }
                        });
                        return;
                    }
                    return;
                }
                f4 = f;
                if ((i & 24576) != 0) {
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i8 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i8 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            shape3 = shape;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            f4 = f;
            if ((i & 24576) != 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i8 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        shape3 = shape;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        f4 = f;
        if ((i & 24576) != 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i8 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlainTooltip_gv3ox5I$lambda$3(float f, long j, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C357@14960L580:Tooltip.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1573998995, i, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.kt:357)");
            }
            Modifier padding = PaddingKt.padding(SizeKt.m1275sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipMinWidth, TooltipMinHeight, f, 0.0f, 8, null), PlainTooltipContentPadding);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, padding);
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
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -959381731, "C366@15329L5,368@15348L182:Tooltip.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(j)), TextKt.getLocalTextStyle().provides(TypographyKt.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextFont(), composer, 6))}, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, ProvidedValue.$stable);
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

    /* JADX WARN: Removed duplicated region for block: B:113:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0172  */
    /* renamed from: RichTooltip-EkvW5A0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4545RichTooltipEkvW5A0(final TooltipScope tooltipScope, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, float f, Shape shape2, RichTooltipColors richTooltipColors, float f2, float f3, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        int i6;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer composer2;
        final Shape shape3;
        final float f4;
        final RichTooltipColors richTooltipColors2;
        final float f5;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Shape shape4;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        Shape shape5;
        float m4533getRichTooltipMaxWidthD9Ej5fM;
        Shape shape6;
        final RichTooltipColors richTooltipColors3;
        float f7;
        float f8;
        int i15;
        int i16;
        float f9;
        Modifier modifier4;
        Shape shape7;
        Composer startRestartGroup = composer.startRestartGroup(236290785);
        ComposerKt.sourceInformation(startRestartGroup, "C(RichTooltip)N(modifier,title,action,caretShape,maxWidth:c#ui.unit.Dp,shape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,text)444@18365L1598,433@18000L1963:Tooltip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i17 = i3 & 1;
        if (i17 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 2;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                function24 = function2;
                i4 |= startRestartGroup.changedInstance(function24) ? 256 : 128;
                i6 = i3 & 4;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    function25 = function22;
                    i4 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
                    i7 = i3 & 8;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changed(shape) ? 16384 : 8192;
                        i8 = i3 & 16;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(f) ? 131072 : 65536;
                        }
                        if ((i & 1572864) == 0) {
                            i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape2)) ? 1048576 : 524288;
                        }
                        if ((i & 12582912) == 0) {
                            i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(richTooltipColors)) ? 8388608 : 4194304;
                        }
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i10 = i9;
                            i4 |= startRestartGroup.changed(f2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                            i11 = i3 & 256;
                            if (i11 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i12 = i11;
                                i4 |= startRestartGroup.changed(f3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                if ((i2 & 6) == 0) {
                                    i13 = i2 | (startRestartGroup.changedInstance(function23) ? 4 : 2);
                                } else {
                                    i13 = i2;
                                }
                                i14 = i4;
                                if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "403@16917L25,404@16992L19");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        int i18 = (i3 & 32) != 0 ? i14 & (-3670017) : i14;
                                        if ((i3 & 64) != 0) {
                                            i18 &= -29360129;
                                        }
                                        shape5 = shape;
                                        shape6 = shape2;
                                        richTooltipColors3 = richTooltipColors;
                                        f8 = f2;
                                        f7 = f3;
                                        i15 = i18;
                                        companion = modifier2;
                                        i16 = 2;
                                        m4533getRichTooltipMaxWidthD9Ej5fM = f;
                                    } else {
                                        companion = i17 != 0 ? Modifier.INSTANCE : modifier2;
                                        if (i5 != 0) {
                                            function24 = null;
                                        }
                                        if (i6 != 0) {
                                            function25 = null;
                                        }
                                        shape5 = i7 != 0 ? null : shape;
                                        m4533getRichTooltipMaxWidthD9Ej5fM = i8 != 0 ? TooltipDefaults.INSTANCE.m4533getRichTooltipMaxWidthD9Ej5fM() : f;
                                        if ((i3 & 32) != 0) {
                                            shape6 = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(startRestartGroup, 6);
                                            i14 &= -3670017;
                                        } else {
                                            shape6 = shape2;
                                        }
                                        if ((i3 & 64) != 0) {
                                            richTooltipColors3 = TooltipDefaults.INSTANCE.richTooltipColors(startRestartGroup, 6);
                                            i14 &= -29360129;
                                        } else {
                                            richTooltipColors3 = richTooltipColors;
                                        }
                                        float m5175getLevel0D9Ej5fM = i10 != 0 ? ElevationTokens.INSTANCE.m5175getLevel0D9Ej5fM() : f2;
                                        if (i12 != 0) {
                                            f8 = m5175getLevel0D9Ej5fM;
                                            f7 = RichTooltipTokens.INSTANCE.m5528getContainerElevationD9Ej5fM();
                                        } else {
                                            f7 = f3;
                                            f8 = m5175getLevel0D9Ej5fM;
                                        }
                                        i15 = i14;
                                        i16 = 2;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(236290785, i15, i13, "androidx.compose.material3.RichTooltip (Tooltip.kt:408)");
                                    }
                                    if (shape5 != null) {
                                        startRestartGroup.startReplaceGroup(-111989590);
                                        ComposerKt.sourceInformation(startRestartGroup, "412@17291L37,413@17364L7,414@17422L7,420@17636L24,425@17793L118");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -557801338, "CC(remember):Tooltip.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            f9 = m4533getRichTooltipMaxWidthD9Ej5fM;
                                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Matrix.m7039boximpl(Matrix.m7041constructorimpl$default(null, 1, null)), null, i16, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        } else {
                                            f9 = m4533getRichTooltipMaxWidthD9Ej5fM;
                                        }
                                        MutableState mutableState = (MutableState) rememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        Density density = (Density) consume;
                                        ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume2 = startRestartGroup.consume(localWindowInfo);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        long mo8822getContainerSizeYbymL2g = ((WindowInfo) consume2).mo8822getContainerSizeYbymL2g();
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -557790311, "CC(remember):Tooltip.kt#9igjgp");
                                        boolean z = (i15 & 14) == 4 || ((i15 & 8) != 0 && startRestartGroup.changedInstance(tooltipScope));
                                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = new Function1() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda14
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    LayoutCoordinates obtainAnchorBounds;
                                                    obtainAnchorBounds = TooltipScope.this.obtainAnchorBounds((MeasureScope) obj);
                                                    return obtainAnchorBounds;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        Modifier then = m4546layoutCaretJ5j9r9c(companion2, mutableState, density, mo8822getContainerSizeYbymL2g, (Function1) rememberedValue2, tooltipScope.obtainPositionProvider()).then(companion);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -557785193, "CC(remember):Tooltip.kt#9igjgp");
                                        boolean z2 = ((((3670016 & i15) ^ 1572864) > 1048576 && startRestartGroup.changed(shape6)) || (i15 & 1572864) == 1048576) | ((57344 & i15) == 16384);
                                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = new TooltipCaretShape(mutableState, shape6, shape5);
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endReplaceGroup();
                                        modifier4 = then;
                                        shape7 = (TooltipCaretShape) rememberedValue3;
                                    } else {
                                        f9 = m4533getRichTooltipMaxWidthD9Ej5fM;
                                        startRestartGroup.startReplaceGroup(-111344294);
                                        startRestartGroup.endReplaceGroup();
                                        modifier4 = companion;
                                        shape7 = shape6;
                                    }
                                    float f10 = f9;
                                    int i19 = i15 >> 12;
                                    composer2 = startRestartGroup;
                                    SurfaceKt.m4112SurfaceT9BRK9s(SizeKt.m1275sizeInqDBjuR0$default(modifier4, TooltipMinWidth, TooltipMinHeight, f9, 0.0f, 8, null), shape7, richTooltipColors3.getContainerColor(), 0L, f8, f7, null, ComposableLambdaKt.rememberComposableLambda(-1249811482, true, new Function2() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit RichTooltip_EkvW5A0$lambda$3;
                                            RichTooltip_EkvW5A0$lambda$3 = TooltipKt.RichTooltip_EkvW5A0$lambda$3(Function2.this, function25, richTooltipColors3, function23, (Composer) obj, ((Integer) obj2).intValue());
                                            return RichTooltip_EkvW5A0$lambda$3;
                                        }
                                    }, startRestartGroup, 54), composer2, (57344 & i19) | 12582912 | (i19 & 458752), 72);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = companion;
                                    shape3 = shape5;
                                    f4 = f10;
                                    shape4 = shape6;
                                    function26 = function24;
                                    richTooltipColors2 = richTooltipColors3;
                                    f6 = f8;
                                    f5 = f7;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    shape3 = shape;
                                    f4 = f;
                                    richTooltipColors2 = richTooltipColors;
                                    f5 = f3;
                                    modifier3 = modifier2;
                                    function26 = function24;
                                    shape4 = shape2;
                                    f6 = f2;
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function27 = function25;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda16
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit RichTooltip_EkvW5A0$lambda$4;
                                            RichTooltip_EkvW5A0$lambda$4 = TooltipKt.RichTooltip_EkvW5A0$lambda$4(TooltipScope.this, modifier3, function26, function27, shape3, f4, shape4, richTooltipColors2, f6, f5, function23, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            return RichTooltip_EkvW5A0$lambda$4;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i12 = i11;
                            if ((i2 & 6) == 0) {
                            }
                            i14 = i4;
                            if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                            }
                            final Function2 function272 = function25;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i10 = i9;
                        i11 = i3 & 256;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        if ((i2 & 6) == 0) {
                        }
                        i14 = i4;
                        if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                        }
                        final Function2 function2722 = function25;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i8 = i3 & 16;
                    if (i8 != 0) {
                    }
                    if ((i & 1572864) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i3 & 256;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    if ((i2 & 6) == 0) {
                    }
                    i14 = i4;
                    if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                    }
                    final Function2 function27222 = function25;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function25 = function22;
                i7 = i3 & 8;
                if (i7 == 0) {
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i2 & 6) == 0) {
                }
                i14 = i4;
                if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                }
                final Function2 function272222 = function25;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function24 = function2;
            i6 = i3 & 4;
            if (i6 != 0) {
            }
            function25 = function22;
            i7 = i3 & 8;
            if (i7 == 0) {
            }
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i2 & 6) == 0) {
            }
            i14 = i4;
            if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
            }
            final Function2 function2722222 = function25;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 2;
        if (i5 == 0) {
        }
        function24 = function2;
        i6 = i3 & 4;
        if (i6 != 0) {
        }
        function25 = function22;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i2 & 6) == 0) {
        }
        i14 = i4;
        if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
        }
        final Function2 function27222222 = function25;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RichTooltip_EkvW5A0$lambda$3(Function2 function2, Function2 function22, RichTooltipColors richTooltipColors, Function2 function23, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C445@18440L5,446@18507L5,447@18584L5,449@18599L1358:Tooltip.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1249811482, i, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.kt:445)");
            }
            TextStyle value = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getActionLabelTextFont(), composer, 6);
            TextStyle value2 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSubheadFont(), composer, 6);
            TextStyle value3 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSupportingTextFont(), composer, 6);
            Modifier m1203paddingVpY3zN4$default = PaddingKt.m1203paddingVpY3zN4$default(Modifier.INSTANCE, RichTooltipHorizontalPadding, 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1203paddingVpY3zN4$default);
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
            ComposerKt.sourceInformationMarkerStart(composer, 112071776, "C459@19093L320:Tooltip.kt#uh7d8r");
            if (function2 == null) {
                composer.startReplaceGroup(112051624);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(112051625);
                ComposerKt.sourceInformation(composer, "*451@18721L345");
                Modifier m842paddingFromBaselineVpY3zN4$default = AlignmentLineKt.m842paddingFromBaselineVpY3zN4$default(Modifier.INSTANCE, HeightToSubheadFirstLine, 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m842paddingFromBaselineVpY3zN4$default);
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
                ComposerKt.sourceInformationMarkerStart(composer, 1350098263, "C452@18820L228:Tooltip.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(richTooltipColors.getTitleContentColor())), TextKt.getLocalTextStyle().provides(value2)}, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, ProvidedValue.$stable);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Unit unit = Unit.INSTANCE;
                composer.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            Modifier textVerticalPadding = textVerticalPadding(Modifier.INSTANCE, function2 != null, function22 != null);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, textVerticalPadding);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl3 = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 97538765, "C460@19187L212:Tooltip.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(richTooltipColors.getContentColor())), TextKt.getLocalTextStyle().provides(value3)}, (Function2<? super Composer, ? super Integer, Unit>) function23, composer, ProvidedValue.$stable);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (function22 == null) {
                composer.startReplaceGroup(112784836);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(112784837);
                ComposerKt.sourceInformation(composer, "*467@19456L477");
                Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(SizeKt.m1262requiredHeightInVpY3zN4$default(Modifier.INSTANCE, ActionLabelMinHeight, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, ActionLabelBottomPadding, 7, null);
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m4 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, m1205paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer m5864constructorimpl4 = Updater.m5864constructorimpl(composer);
                Updater.m5872setimpl(m5864constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl4, Integer.valueOf(m4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -424550181, "C472@19682L233:Tooltip.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(richTooltipColors.getActionContentColor())), TextKt.getLocalTextStyle().provides(value)}, (Function2<? super Composer, ? super Integer, Unit>) function22, composer, ProvidedValue.$stable);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Unit unit3 = Unit.INSTANCE;
                composer.endReplaceGroup();
                Unit unit4 = Unit.INSTANCE;
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
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final TooltipState rememberTooltipState(boolean z, boolean z2, MutatorMutex mutatorMutex, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1413230530, "C(rememberTooltipState)N(initialIsVisible,isPersistent,mutatorMutex)825@34550L211:Tooltip.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1413230530, i, -1, "androidx.compose.material3.rememberTooltipState (Tooltip.kt:825)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -904867311, "CC(remember):Tooltip.kt#9igjgp");
        boolean z3 = ((((i & 112) ^ 48) > 32 && composer.changed(z2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new TooltipStateImpl(z, z2, mutatorMutex);
            composer.updateRememberedValue(rememberedValue);
        }
        TooltipStateImpl tooltipStateImpl = (TooltipStateImpl) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return tooltipStateImpl;
    }

    public static /* synthetic */ TooltipState TooltipState$default(boolean z, boolean z2, MutatorMutex mutatorMutex, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return TooltipState(z, z2, mutatorMutex);
    }

    public static final TooltipState TooltipState(boolean z, boolean z2, MutatorMutex mutatorMutex) {
        return new TooltipStateImpl(z, z2, mutatorMutex);
    }

    public static final Modifier textVerticalPadding(Modifier modifier, boolean z, boolean z2) {
        if (!z && !z2) {
            return PaddingKt.m1203paddingVpY3zN4$default(modifier, 0.0f, PlainTooltipVerticalPadding, 1, null);
        }
        return PaddingKt.m1205paddingqDBjuR0$default(AlignmentLineKt.m842paddingFromBaselineVpY3zN4$default(modifier, HeightFromSubheadToTextFirstLine, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TextBottomPadding, 7, null);
    }

    public static final float caretX(float f, int i, Rect rect) {
        float min;
        float left = rect.getLeft();
        float right = rect.getRight();
        float f2 = 2;
        float f3 = (left + right) / f2;
        float f4 = i;
        if (f >= f4) {
            return f3;
        }
        float f5 = f / f2;
        if (f3 - f5 < 0.0f) {
            min = Math.max(f - f4, -left);
        } else {
            if (f3 + f5 <= f4) {
                return f5;
            }
            min = Math.min(f - right, 0.0f);
        }
        return f3 + min;
    }

    /* renamed from: layoutCaret-J5j9r9c, reason: not valid java name */
    private static final Modifier m4546layoutCaretJ5j9r9c(Modifier modifier, final MutableState<Matrix> mutableState, final Density density, final long j, final Function1<? super MeasureScope, ? extends LayoutCoordinates> function1, final PopupPositionProvider popupPositionProvider) {
        return LayoutModifierKt.layout(modifier, new Function3() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                MeasureResult layoutCaret_J5j9r9c$lambda$0;
                layoutCaret_J5j9r9c$lambda$0 = TooltipKt.layoutCaret_J5j9r9c$lambda$0(j, function1, density, popupPositionProvider, mutableState, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return layoutCaret_J5j9r9c$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00ce, code lost:
    
        r10 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00cc, code lost:
    
        if (((r11 - r10) - r13) < 0.0f) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015a, code lost:
    
        r6 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MeasureResult layoutCaret_J5j9r9c$lambda$0(long j, Function1 function1, Density density, PopupPositionProvider popupPositionProvider, MutableState mutableState, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        long m6511constructorimpl;
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(constraints.getValue());
        int width = mo8285measureBRTryo0.getWidth();
        int height = mo8285measureBRTryo0.getHeight();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        float f = width;
        float f2 = height;
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) function1.invoke(measureScope);
        if (layoutCoordinates != null) {
            int mo522roundToPx0680j_4 = density.mo522roundToPx0680j_4(SpacingBetweenTooltipAndAnchor);
            Rect boundsInWindow$default = LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null);
            float top = boundsInWindow$default.getTop();
            float bottom = boundsInWindow$default.getBottom();
            float right = boundsInWindow$default.getRight();
            float left = boundsInWindow$default.getLeft();
            boolean z = popupPositionProvider instanceof TooltipPositionProviderImpl;
            if (z) {
                int type = ((TooltipPositionProviderImpl) popupPositionProvider).getType();
                if (TooltipAnchorPosition.m4519equalsimpl0(type, TooltipAnchorPosition.INSTANCE.m4526getLeftlOKsHw4()) || TooltipAnchorPosition.m4519equalsimpl0(type, TooltipAnchorPosition.INSTANCE.m4527getRightlOKsHw4()) || TooltipAnchorPosition.m4519equalsimpl0(type, TooltipAnchorPosition.INSTANCE.m4528getStartlOKsHw4()) || TooltipAnchorPosition.m4519equalsimpl0(type, TooltipAnchorPosition.INSTANCE.m4525getEndlOKsHw4())) {
                    f2 /= 2;
                } else if (!TooltipAnchorPosition.m4519equalsimpl0(type, TooltipAnchorPosition.INSTANCE.m4523getAbovelOKsHw4())) {
                }
                if (z) {
                    int type2 = ((TooltipPositionProviderImpl) popupPositionProvider).getType();
                    if (!TooltipAnchorPosition.m4519equalsimpl0(type2, TooltipAnchorPosition.INSTANCE.m4526getLeftlOKsHw4())) {
                        if (!TooltipAnchorPosition.m4519equalsimpl0(type2, TooltipAnchorPosition.INSTANCE.m4527getRightlOKsHw4())) {
                            if (TooltipAnchorPosition.m4519equalsimpl0(type2, TooltipAnchorPosition.INSTANCE.m4528getStartlOKsHw4())) {
                                float f3 = measureScope.getLayoutDirection() == LayoutDirection.Ltr ? 0.0f : 0.0f;
                                m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                            } else if (TooltipAnchorPosition.m4519equalsimpl0(type2, TooltipAnchorPosition.INSTANCE.m4525getEndlOKsHw4())) {
                                m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits((measureScope.getLayoutDirection() != LayoutDirection.Ltr ? (left - ((float) mo522roundToPx0680j_4)) - f >= 0.0f : (right + ((float) mo522roundToPx0680j_4)) + f > ((float) i)) ? f : 0.0f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                            } else {
                                m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits(caretX(f, i, boundsInWindow$default)) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                            }
                        } else {
                            m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits((right + ((float) mo522roundToPx0680j_4)) + f > ((float) i) ? f : 0.0f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                        }
                    } else {
                        m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits((left - ((float) mo522roundToPx0680j_4)) - f < 0.0f ? 0.0f : f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                    }
                } else {
                    m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits(caretX(f, i, boundsInWindow$default)) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                }
                float[] m7041constructorimpl$default = Matrix.m7041constructorimpl$default(null, 1, null);
                Matrix.m7063translateimpl$default(m7041constructorimpl$default, Float.intBitsToFloat((int) (m6511constructorimpl >> 32)), Float.intBitsToFloat((int) (m6511constructorimpl & 4294967295L)), 0.0f, 4, null);
                if (z) {
                    int type3 = ((TooltipPositionProviderImpl) popupPositionProvider).getType();
                    if (TooltipAnchorPosition.m4519equalsimpl0(type3, TooltipAnchorPosition.INSTANCE.m4526getLeftlOKsHw4())) {
                        if ((left - mo522roundToPx0680j_4) - f < 0.0f) {
                            Matrix.m7055rotateZimpl(m7041constructorimpl$default, 90.0f);
                        } else {
                            Matrix.m7055rotateZimpl(m7041constructorimpl$default, -90.0f);
                        }
                    } else if (TooltipAnchorPosition.m4519equalsimpl0(type3, TooltipAnchorPosition.INSTANCE.m4527getRightlOKsHw4())) {
                        if (right + mo522roundToPx0680j_4 + f > i) {
                            Matrix.m7055rotateZimpl(m7041constructorimpl$default, -90.0f);
                        } else {
                            Matrix.m7055rotateZimpl(m7041constructorimpl$default, 90.0f);
                        }
                    } else if (TooltipAnchorPosition.m4519equalsimpl0(type3, TooltipAnchorPosition.INSTANCE.m4528getStartlOKsHw4())) {
                        if (measureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                            if ((left - mo522roundToPx0680j_4) - f < 0.0f) {
                                Matrix.m7055rotateZimpl(m7041constructorimpl$default, 90.0f);
                            } else {
                                Matrix.m7055rotateZimpl(m7041constructorimpl$default, -90.0f);
                            }
                        } else if (right + mo522roundToPx0680j_4 + f > i) {
                            Matrix.m7055rotateZimpl(m7041constructorimpl$default, -90.0f);
                        } else {
                            Matrix.m7055rotateZimpl(m7041constructorimpl$default, 90.0f);
                        }
                    } else if (TooltipAnchorPosition.m4519equalsimpl0(type3, TooltipAnchorPosition.INSTANCE.m4525getEndlOKsHw4())) {
                        if (measureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                            if (right + mo522roundToPx0680j_4 + f > i) {
                                Matrix.m7055rotateZimpl(m7041constructorimpl$default, -90.0f);
                            } else {
                                Matrix.m7055rotateZimpl(m7041constructorimpl$default, 90.0f);
                            }
                        } else if ((left - mo522roundToPx0680j_4) - f < 0.0f) {
                            Matrix.m7055rotateZimpl(m7041constructorimpl$default, 90.0f);
                        } else {
                            Matrix.m7055rotateZimpl(m7041constructorimpl$default, -90.0f);
                        }
                    } else if (f2 == 0.0f) {
                        Matrix.m7053rotateXimpl(m7041constructorimpl$default, 180.0f);
                    }
                } else if (f2 == 0.0f) {
                    Matrix.m7053rotateXimpl(m7041constructorimpl$default, 180.0f);
                }
                mutableState.setValue(Matrix.m7039boximpl(m7041constructorimpl$default));
            }
        }
        return MeasureScope.CC.layout$default(measureScope, width, height, null, new Function1() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit layoutCaret_J5j9r9c$lambda$0$1;
                layoutCaret_J5j9r9c$lambda$0$1 = TooltipKt.layoutCaret_J5j9r9c$lambda$0$1(Placeable.this, (Placeable.PlacementScope) obj);
                return layoutCaret_J5j9r9c$lambda$0$1;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit layoutCaret_J5j9r9c$lambda$0$1(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    public static final float getSpacingBetweenTooltipAndAnchor() {
        return SpacingBetweenTooltipAndAnchor;
    }

    public static final float getTooltipMinHeight() {
        return TooltipMinHeight;
    }

    public static final float getTooltipMinWidth() {
        return TooltipMinWidth;
    }

    public static final PaddingValues getPlainTooltipContentPadding() {
        return PlainTooltipContentPadding;
    }

    public static final float getRichTooltipHorizontalPadding() {
        return RichTooltipHorizontalPadding;
    }

    public static final float getHeightToSubheadFirstLine() {
        return HeightToSubheadFirstLine;
    }

    public static final float getActionLabelMinHeight() {
        return ActionLabelMinHeight;
    }

    public static final float getActionLabelBottomPadding() {
        return ActionLabelBottomPadding;
    }

    private static final int TooltipBox$lambda$5(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final float TooltipBox$lambda$8(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float TooltipBox$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    static {
        float f = 4;
        SpacingBetweenTooltipAndAnchor = Dp.m9732constructorimpl(f);
        float f2 = 24;
        TooltipMinHeight = Dp.m9732constructorimpl(f2);
        float m9732constructorimpl = Dp.m9732constructorimpl(f);
        PlainTooltipVerticalPadding = m9732constructorimpl;
        float f3 = 8;
        float m9732constructorimpl2 = Dp.m9732constructorimpl(f3);
        PlainTooltipHorizontalPadding = m9732constructorimpl2;
        PlainTooltipContentPadding = PaddingKt.m1195PaddingValuesYgX7TsA(m9732constructorimpl2, m9732constructorimpl);
        float f4 = 16;
        RichTooltipHorizontalPadding = Dp.m9732constructorimpl(f4);
        HeightToSubheadFirstLine = Dp.m9732constructorimpl(28);
        HeightFromSubheadToTextFirstLine = Dp.m9732constructorimpl(f2);
        TextBottomPadding = Dp.m9732constructorimpl(f4);
        ActionLabelMinHeight = Dp.m9732constructorimpl(36);
        ActionLabelBottomPadding = Dp.m9732constructorimpl(f3);
    }
}
