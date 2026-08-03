package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SegmentedButton.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006J\u0087\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010(J\r\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u00101JA\u00102\u001a\u0002002\u0006\u00103\u001a\u0002042\u0013\b\u0002\u00105\u001a\r\u0012\u0004\u0012\u00020006¢\u0006\u0002\b72\u0015\b\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u000200\u0018\u000106¢\u0006\u0002\b7H\u0007¢\u0006\u0002\u00109J\u001f\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\b2\b\b\u0002\u0010=\u001a\u00020\u001f¢\u0006\u0004\b>\u0010?R\u0018\u0010\u0016\u001a\u00020\u0005*\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001e\u001a\u00020\u001f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010)\u001a\u00020\u001f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b*\u0010!R\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006@"}, d2 = {"Landroidx/compose/material3/SegmentedButtonDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material3/SegmentedButtonColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SegmentedButtonColors;", "activeContainerColor", "Landroidx/compose/ui/graphics/Color;", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "colors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SegmentedButtonColors;", "defaultSegmentedButtonColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultSegmentedButtonColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SegmentedButtonColors;", "baseShape", "Landroidx/compose/foundation/shape/CornerBasedShape;", "getBaseShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/shape/CornerBasedShape;", "BorderWidth", "Landroidx/compose/ui/unit/Dp;", "getBorderWidth-D9Ej5fM", "()F", "F", "itemShape", "Landroidx/compose/ui/graphics/Shape;", "index", "", "count", "(IILandroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/Shape;", "IconSize", "getIconSize-D9Ej5fM", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ActiveIcon", "", "(Landroidx/compose/runtime/Composer;I)V", "Icon", "active", "", "activeContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "inactiveContent", "(ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "borderStroke", "Landroidx/compose/foundation/BorderStroke;", "color", "width", "borderStroke-l07J4OM", "(JF)Landroidx/compose/foundation/BorderStroke;", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class SegmentedButtonDefaults {
    public static final int $stable = 0;
    private static final PaddingValues ContentPadding;
    public static final SegmentedButtonDefaults INSTANCE = new SegmentedButtonDefaults();
    private static final float BorderWidth = OutlinedSegmentedButtonTokens.INSTANCE.m5422getOutlineWidthD9Ej5fM();
    private static final float IconSize = OutlinedSegmentedButtonTokens.INSTANCE.m5421getIconSizeD9Ej5fM();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActiveIcon$lambda$0(SegmentedButtonDefaults segmentedButtonDefaults, int i, Composer composer, int i2) {
        segmentedButtonDefaults.ActiveIcon(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon$lambda$2(SegmentedButtonDefaults segmentedButtonDefaults, boolean z, Function2 function2, Function2 function22, int i, int i2, Composer composer, int i3) {
        segmentedButtonDefaults.Icon(z, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private SegmentedButtonDefaults() {
    }

    public final SegmentedButtonColors colors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 679457321, "C(colors)494@21121L11:SegmentedButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(679457321, i, -1, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:494)");
        }
        SegmentedButtonColors defaultSegmentedButtonColors$material3 = getDefaultSegmentedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultSegmentedButtonColors$material3;
    }

    /* renamed from: colors-XqyqHi0, reason: not valid java name */
    public final SegmentedButtonColors m3914colorsXqyqHi0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, Composer composer, int i, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 132526205, "C(colors)N(activeContainerColor:c#ui.graphics.Color,activeContentColor:c#ui.graphics.Color,activeBorderColor:c#ui.graphics.Color,inactiveContainerColor:c#ui.graphics.Color,inactiveContentColor:c#ui.graphics.Color,inactiveBorderColor:c#ui.graphics.Color,disabledActiveContainerColor:c#ui.graphics.Color,disabledActiveContentColor:c#ui.graphics.Color,disabledActiveBorderColor:c#ui.graphics.Color,disabledInactiveContainerColor:c#ui.graphics.Color,disabledInactiveContentColor:c#ui.graphics.Color,disabledInactiveBorderColor:c#ui.graphics.Color)530@23288L11:SegmentedButton.kt#uh7d8r");
        long m6822getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j;
        long m6822getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j2;
        long m6822getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j3;
        long m6822getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j4;
        long m6822getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j5;
        long m6822getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j6;
        long m6822getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j7;
        long m6822getUnspecified0d7_KjU8 = (i3 & 128) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j8;
        long m6822getUnspecified0d7_KjU9 = (i3 & 256) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j9;
        long m6822getUnspecified0d7_KjU10 = (i3 & 512) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j10;
        long m6822getUnspecified0d7_KjU11 = (i3 & 1024) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j11;
        long m6822getUnspecified0d7_KjU12 = (i3 & 2048) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(132526205, i, i2, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:530)");
        }
        SegmentedButtonColors m3896copy2qZNXz8 = getDefaultSegmentedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m3896copy2qZNXz8(m6822getUnspecified0d7_KjU, m6822getUnspecified0d7_KjU2, m6822getUnspecified0d7_KjU3, m6822getUnspecified0d7_KjU4, m6822getUnspecified0d7_KjU5, m6822getUnspecified0d7_KjU6, m6822getUnspecified0d7_KjU7, m6822getUnspecified0d7_KjU8, m6822getUnspecified0d7_KjU9, m6822getUnspecified0d7_KjU10, m6822getUnspecified0d7_KjU11, m6822getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m3896copy2qZNXz8;
    }

    public final SegmentedButtonColors getDefaultSegmentedButtonColors$material3(ColorScheme colorScheme) {
        SegmentedButtonColors defaultSegmentedButtonColorsCached = colorScheme.getDefaultSegmentedButtonColorsCached();
        if (defaultSegmentedButtonColorsCached != null) {
            return defaultSegmentedButtonColorsCached;
        }
        SegmentedButtonColors segmentedButtonColors = new SegmentedButtonColors(ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), Color.INSTANCE.m6821getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedContainerColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextColor()), OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), OutlinedSegmentedButtonTokens.INSTANCE.getDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.INSTANCE.m6821getTransparent0d7_KjU(), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextColor()), OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), OutlinedSegmentedButtonTokens.INSTANCE.getDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSegmentedButtonColorsCached$material3(segmentedButtonColors);
        return segmentedButtonColors;
    }

    public final CornerBasedShape getBaseShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1264240381, "C(<get-baseShape>)578@26037L5:SegmentedButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1264240381, i, -1, "androidx.compose.material3.SegmentedButtonDefaults.<get-baseShape> (SegmentedButton.kt:578)");
        }
        Shape value = ShapesKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getShape(), composer, 6);
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return cornerBasedShape;
    }

    static {
        float f = 12;
        ContentPadding = PaddingKt.m1197PaddingValuesa9UjIt4(Dp.m9732constructorimpl(f), ButtonDefaults.INSTANCE.getContentPadding().getTop(), Dp.m9732constructorimpl(f), ButtonDefaults.INSTANCE.getContentPadding().getBottom());
    }

    /* renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name */
    public final float m3915getBorderWidthD9Ej5fM() {
        return BorderWidth;
    }

    public final Shape itemShape(int i, int i2, CornerBasedShape cornerBasedShape, Composer composer, int i3, int i4) {
        CornerBasedShape rectangleShape;
        ComposerKt.sourceInformationMarkerStart(composer, -942072063, "C(itemShape)N(index,count,baseShape)594@26703L9:SegmentedButton.kt#uh7d8r");
        if ((i4 & 4) != 0) {
            cornerBasedShape = getBaseShape(composer, (i3 >> 9) & 14);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-942072063, i3, -1, "androidx.compose.material3.SegmentedButtonDefaults.itemShape (SegmentedButton.kt:594)");
        }
        if (i2 == 1) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return cornerBasedShape;
        }
        if (i == 0) {
            rectangleShape = ShapesKt.start$default(cornerBasedShape, null, 1, null);
        } else if (i == i2 - 1) {
            rectangleShape = ShapesKt.end$default(cornerBasedShape, null, 1, null);
        } else {
            rectangleShape = RectangleShapeKt.getRectangleShape();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return rectangleShape;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3916getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final void ActiveIcon(Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1273041460);
        ComposerKt.sourceInformation(startRestartGroup, "C(ActiveIcon)621@27517L148:SegmentedButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1273041460, i2, -1, "androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon (SegmentedButton.kt:620)");
            }
            IconKt.m3345Iconww6aTOc(Icons.Filled.INSTANCE.getCheck$material3(), (String) null, SizeKt.m1271size3ABfNKs(Modifier.INSTANCE, IconSize), 0L, startRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SegmentedButtonDefaults$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ActiveIcon$lambda$0;
                    ActiveIcon$lambda$0 = SegmentedButtonDefaults.ActiveIcon$lambda$0(SegmentedButtonDefaults.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ActiveIcon$lambda$0;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Icon(final boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-657462570);
        ComposerKt.sourceInformation(startRestartGroup, "C(Icon)N(active,activeContent,inactiveContent):SegmentedButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function23 = function2;
            i3 |= startRestartGroup.changedInstance(function23) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function24 = function22;
                i3 |= startRestartGroup.changedInstance(function24) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    function25 = function23;
                    function26 = function24;
                } else {
                    function25 = i5 != 0 ? ComposableSingletons$SegmentedButtonKt.INSTANCE.getLambda$1863131183$material3() : function23;
                    final Function2<? super Composer, ? super Integer, Unit> function27 = i4 != 0 ? null : function24;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-657462570, i3, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon (SegmentedButton.kt:641)");
                    }
                    if (function27 == null) {
                        startRestartGroup.startReplaceGroup(-1416240287);
                        ComposerKt.sourceInformation(startRestartGroup, "648@28525L7,652@28765L7,654@28815L47,644@28339L523");
                        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), 0.0f, 2, null).plus(EnterExitTransitionKt.m129scaleInL8ZKhE(MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), 0.0f, TransformOriginKt.TransformOrigin(0.0f, 1.0f))), ExitTransition.INSTANCE.getNone(), (String) null, ComposableLambdaKt.rememberComposableLambda(2059591811, true, new Function3() { // from class: androidx.compose.material3.SegmentedButtonDefaults$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Unit Icon$lambda$0;
                                Icon$lambda$0 = SegmentedButtonDefaults.Icon$lambda$0(Function2.this, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                return Icon$lambda$0;
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                        startRestartGroup = startRestartGroup;
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1415711675);
                        ComposerKt.sourceInformation(startRestartGroup, "661@29094L7,662@29117L78,658@28892L303");
                        CrossfadeKt.Crossfade(Boolean.valueOf(z), (Modifier) null, (FiniteAnimationSpec<Float>) MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), (String) null, ComposableLambdaKt.rememberComposableLambda(-1785818285, true, new Function3() { // from class: androidx.compose.material3.SegmentedButtonDefaults$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Unit Icon$lambda$1;
                                Icon$lambda$1 = SegmentedButtonDefaults.Icon$lambda$1(Function2.this, function27, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
                                return Icon$lambda$1;
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 24576, 10);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function26 = function27;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.SegmentedButtonDefaults$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Icon$lambda$2;
                            Icon$lambda$2 = SegmentedButtonDefaults.Icon$lambda$2(SegmentedButtonDefaults.this, z, function25, function26, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return Icon$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            function24 = function22;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function23 = function2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function24 = function22;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon$lambda$0(Function2 function2, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C655@28833L15:SegmentedButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2059591811, i, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:655)");
        }
        function2.invoke(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon$lambda$1(Function2 function2, Function2 function22, boolean z, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(it):SegmentedButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i |= composer.changed(z) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1785818285, i, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:663)");
            }
            if (z) {
                composer.startReplaceGroup(1815547362);
                ComposerKt.sourceInformation(composer, "663@29143L15");
                function2.invoke(composer, 0);
            } else {
                composer.startReplaceGroup(1815548036);
                ComposerKt.sourceInformation(composer, "663@29164L17");
                function22.invoke(composer, 0);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: borderStroke-l07J4OM$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m3912borderStrokel07J4OM$default(SegmentedButtonDefaults segmentedButtonDefaults, long j, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = BorderWidth;
        }
        return segmentedButtonDefaults.m3913borderStrokel07J4OM(j, f);
    }

    /* renamed from: borderStroke-l07J4OM, reason: not valid java name */
    public final BorderStroke m3913borderStrokel07J4OM(long color, float width) {
        return BorderStrokeKt.m388BorderStrokecXLIe8U(width, color);
    }
}
