package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.material3.tokens.NavigationBarVerticalItemTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: NavigationBar.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\u001a_\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0085\u0001\u0010\u0012\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\u0010\u001f\u001a\u007f\u0010 \u001a\u00020\u00012\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u000e2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u000e2\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u000e2\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u000e2\u0006\u0010\u001a\u001a\u00020\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00162\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0016H\u0003¢\u0006\u0002\u0010&\u001a5\u0010'\u001a\u00020(*\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101\u001aM\u00102\u001a\u00020(*\u00020)2\u0006\u00103\u001a\u00020+2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020/2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u00104\u001a\u00020$H\u0002¢\u0006\u0004\b5\u00106\"\u000e\u00107\u001a\u000208X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u000208X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u000208X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u000208X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010<\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010=\"\u0016\u0010>\u001a\u00020\bX\u0080\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\b?\u0010@\"\u0016\u0010A\u001a\u00020\bX\u0080\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\bB\u0010@\"\u0010\u0010C\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010=\"\u0016\u0010D\u001a\u00020\bX\u0080\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\bE\u0010@\"\u0010\u0010F\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010=\"\u0016\u0010G\u001a\u00020\bX\u0080\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\bH\u0010@\"\"\u0010I\u001a\b\u0012\u0004\u0012\u00020K0J8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006P²\u0006\n\u0010Q\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010R\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010S\u001a\u00020TX\u008a\u008e\u0002"}, d2 = {"NavigationBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "NavigationBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationBarItem", "selected", "", "onClick", "Lkotlin/Function0;", NavigationBarKt.IconLayoutIdTag, "enabled", NavigationBarKt.LabelLayoutIdTag, "alwaysShowLabel", "colors", "Landroidx/compose/material3/NavigationBarItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "NavigationBarItemLayout", NavigationBarKt.IndicatorRippleLayoutIdTag, NavigationBarKt.IndicatorLayoutIdTag, "alphaAnimationProgress", "", "sizeAnimationProgress", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "indicatorRipplePlaceable", "indicatorPlaceable", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "animationProgress", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "IndicatorRippleLayoutIdTag", "", "IndicatorLayoutIdTag", "IconLayoutIdTag", "LabelLayoutIdTag", "NavigationBarHeight", "F", "NavigationBarItemHorizontalPadding", "getNavigationBarItemHorizontalPadding", "()F", "NavigationBarIndicatorToLabelPadding", "getNavigationBarIndicatorToLabelPadding", "IndicatorHorizontalPadding", "IndicatorVerticalPadding", "getIndicatorVerticalPadding", "IndicatorVerticalOffset", "NavigationBarItemToIconMinimumPadding", "getNavigationBarItemToIconMinimumPadding", "LocalNavigationBarOverride", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/NavigationBarOverride;", "getLocalNavigationBarOverride$annotations", "()V", "getLocalNavigationBarOverride", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material3", "iconColor", "textColor", "itemWidth", ""}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class NavigationBarKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalPadding;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationBarHeight = NavigationBarTokens.INSTANCE.m5367getTallContainerHeightD9Ej5fM();
    private static final float NavigationBarItemHorizontalPadding = Dp.m9732constructorimpl(8);
    private static final float NavigationBarIndicatorToLabelPadding = Dp.m9732constructorimpl(4);
    private static final float IndicatorVerticalOffset = Dp.m9732constructorimpl(12);
    private static final float NavigationBarItemToIconMinimumPadding = Dp.m9732constructorimpl(44);
    private static final ProvidableCompositionLocal<NavigationBarOverride> LocalNavigationBarOverride = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            NavigationBarOverride LocalNavigationBarOverride$lambda$0;
            LocalNavigationBarOverride$lambda$0 = NavigationBarKt.LocalNavigationBarOverride$lambda$0();
            return LocalNavigationBarOverride$lambda$0;
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationBarItem$lambda$8(RowScope rowScope, boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function22, boolean z3, NavigationBarItemColors navigationBarItemColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        NavigationBarItem(rowScope, z, function0, function2, modifier, z2, function22, z3, navigationBarItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationBarItemLayout$lambda$2(Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        NavigationBarItemLayout(function2, function22, function23, function24, z, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationBar_HsRjFd4$lambda$1(Modifier modifier, long j, long j2, float f, WindowInsets windowInsets, Function3 function3, int i, int i2, Composer composer, int i3) {
        m3606NavigationBarHsRjFd4(modifier, j, j2, f, windowInsets, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getLocalNavigationBarOverride$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0099  */
    /* renamed from: NavigationBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3606NavigationBarHsRjFd4(Modifier modifier, long j, long j2, float f, WindowInsets windowInsets, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        WindowInsets windowInsets2;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        Modifier modifier3;
        final long j5;
        final long j6;
        final float f3;
        final WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        WindowInsets windowInsets4;
        long j7;
        long j8;
        float f4;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(1054099326);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationBar)N(modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,windowInsets,content)121@5752L7,*130@6086L15:NavigationBar.kt#uh7d8r");
        int i7 = i2 & 1;
        if (i7 != 0) {
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
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                j3 = j;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                j4 = j2;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            j4 = j2;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    windowInsets2 = windowInsets;
                    if (startRestartGroup.changed(windowInsets2)) {
                        i4 = 16384;
                        i3 |= i4;
                    }
                } else {
                    windowInsets2 = windowInsets;
                }
                i4 = 8192;
                i3 |= i4;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((196608 & i) != 0) {
                function32 = function3;
                i3 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
            } else {
                function32 = function3;
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "115@5438L14,116@5494L11,118@5652L12");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier3 = modifier2;
                } else {
                    Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        j3 = NavigationBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        j4 = ColorSchemeKt.m2783contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6), j3);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        f2 = NavigationBarDefaults.INSTANCE.m3587getElevationD9Ej5fM();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        modifier3 = companion;
                        windowInsets4 = NavigationBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                        j7 = j3;
                        j8 = j4;
                        f4 = f2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1054099326, i3, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:120)");
                        }
                        ProvidableCompositionLocal<NavigationBarOverride> providableCompositionLocal = LocalNavigationBarOverride;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(providableCompositionLocal);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ((NavigationBarOverride) consume).NavigationBar(new NavigationBarOverrideScope(modifier3, j7, j8, f4, windowInsets4, function32, null), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                        windowInsets3 = windowInsets4;
                    } else {
                        modifier3 = companion;
                    }
                }
                j7 = j3;
                j8 = j4;
                f4 = f2;
                windowInsets4 = windowInsets2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<NavigationBarOverride> providableCompositionLocal2 = LocalNavigationBarOverride;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(providableCompositionLocal2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ((NavigationBarOverride) consume2).NavigationBar(new NavigationBarOverrideScope(modifier3, j7, j8, f4, windowInsets4, function32, null), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j5 = j7;
                j6 = j8;
                f3 = f4;
                windowInsets3 = windowInsets4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j5 = j3;
                j6 = j4;
                f3 = f2;
                windowInsets3 = windowInsets2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit NavigationBar_HsRjFd4$lambda$1;
                        NavigationBar_HsRjFd4$lambda$1 = NavigationBarKt.NavigationBar_HsRjFd4$lambda$1(Modifier.this, j5, j6, f3, windowInsets3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return NavigationBar_HsRjFd4$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        f2 = f;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0387  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationBarItem(final RowScope rowScope, final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z3, NavigationBarItemColors navigationBarItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z4;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i6;
        int i7;
        int i8;
        int i9;
        final boolean z5;
        final NavigationBarItemColors navigationBarItemColors2;
        final MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope endRestartGroup;
        NavigationBarItemColors navigationBarItemColors3;
        int i10;
        final boolean z7;
        int i11;
        final NavigationBarItemColors navigationBarItemColors4;
        Modifier modifier3;
        final boolean z8;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        NavigationBarItemColors navigationBarItemColors5;
        Function2<? super Composer, ? super Integer, Unit> function26;
        ComposableLambda composableLambda;
        Object rememberedValue;
        final MutableIntState mutableIntState;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        boolean changed2;
        Object rememberedValue4;
        boolean changed3;
        Object rememberedValue5;
        boolean changed4;
        Object rememberedValue6;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(974293026);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationBarItem)N(selected,onClick,icon,modifier,enabled,label,alwaysShowLabel,colors,interactionSource)212@9724L14,214@9780L618,244@11048L33,258@11490L24,246@11087L3247:NavigationBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        int i13 = i2 & 8;
        if (i13 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    function23 = function22;
                    i3 |= startRestartGroup.changedInstance(function23) ? 1048576 : 524288;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(navigationBarItemColors)) {
                            i12 = 67108864;
                            i3 |= i12;
                        }
                        i12 = GroupFlagsKt.HasAuxSlotFlag;
                        i3 |= i12;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i9 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "206@9394L8");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i13 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i5 != 0) {
                                    function23 = null;
                                }
                                boolean z9 = i6 != 0 ? true : z3;
                                if ((i2 & 128) != 0) {
                                    navigationBarItemColors3 = NavigationBarItemDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    i10 = i9 & (-234881025);
                                } else {
                                    navigationBarItemColors3 = navigationBarItemColors;
                                    i10 = i9;
                                }
                                z7 = z9;
                                i11 = i10;
                                navigationBarItemColors4 = navigationBarItemColors3;
                                modifier3 = modifier2;
                                z8 = z4;
                                function25 = function23;
                                if (i8 != 0) {
                                    mutableInteractionSource3 = null;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(974293026, i11, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:208)");
                                    }
                                    if (mutableInteractionSource3 != null) {
                                        startRestartGroup.startReplaceGroup(-224975399);
                                        ComposerKt.sourceInformation(startRestartGroup, "210@9546L39");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -7257271, "CC(remember):NavigationBar.kt#9igjgp");
                                        Object rememberedValue7 = startRestartGroup.rememberedValue();
                                        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue7 = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue7);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = (MutableInteractionSource) rememberedValue7;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-7257922);
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                    final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6);
                                    boolean z10 = z7;
                                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-876637252, true, new Function2() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit NavigationBarItem$lambda$1;
                                            NavigationBarItem$lambda$1 = NavigationBarKt.NavigationBarItem$lambda$1(NavigationBarItemColors.this, z, z8, value, function25, z7, function2, (Composer) obj, ((Integer) obj2).intValue());
                                            return NavigationBarItem$lambda$1;
                                        }
                                    }, startRestartGroup, 54);
                                    if (function25 != null) {
                                        startRestartGroup.startReplaceGroup(-224048562);
                                        startRestartGroup.endReplaceGroup();
                                        navigationBarItemColors5 = navigationBarItemColors4;
                                        function26 = function25;
                                        composableLambda = null;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-224048561);
                                        ComposerKt.sourceInformation(startRestartGroup, "*229@10494L521");
                                        final NavigationBarItemColors navigationBarItemColors6 = navigationBarItemColors4;
                                        final boolean z11 = z8;
                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function25;
                                        navigationBarItemColors5 = navigationBarItemColors6;
                                        function26 = function27;
                                        ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(802208206, true, new Function2() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda14
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit NavigationBarItem$lambda$2$0;
                                                NavigationBarItem$lambda$2$0 = NavigationBarKt.NavigationBarItem$lambda$2$0(NavigationBarItemColors.this, z, z11, value, function27, (Composer) obj, ((Integer) obj2).intValue());
                                                return NavigationBarItem$lambda$2$0;
                                            }
                                        }, startRestartGroup, 54);
                                        startRestartGroup.endReplaceGroup();
                                        composableLambda = rememberComposableLambda2;
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -7209213, "CC(remember):NavigationBar.kt#9igjgp");
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    mutableIntState = (MutableIntState) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    boolean z12 = z8;
                                    Modifier modifier4 = modifier3;
                                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                    Modifier weight$default = RowScope.CC.weight$default(rowScope, SizeKt.m1256defaultMinSizeVpY3zN4$default(SelectableKt.m1542selectableO2vRcR0(modifier4, z, mutableInteractionSource5, null, z12, Role.m8874boximpl(Role.INSTANCE.m8888getTabo7Vup1c()), function0), 0.0f, NavigationBarHeight, 1, null), 1.0f, false, 2, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -7195078, "CC(remember):NavigationBar.kt#9igjgp");
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new Function1() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda15
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit NavigationBarItem$lambda$6$0;
                                                NavigationBarItem$lambda$6$0 = NavigationBarKt.NavigationBarItem$lambda$6$0(MutableIntState.this, (IntSize) obj);
                                                return NavigationBarItem$lambda$6$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(weight$default, (Function1) rememberedValue2);
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, true);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                                    int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onSizeChanged);
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
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1565189072, "C266@11902L7,263@11672L252,272@12214L7,269@11987L249,277@12496L7,278@12539L274,286@12864L146,293@13225L273,301@13547L404,318@14216L32,319@14286L31,312@13961L367:NavigationBar.kt#uh7d8r");
                                    final NavigationBarItemColors navigationBarItemColors7 = navigationBarItemColors5;
                                    final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(!z ? 1.0f : 0.0f, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
                                    final State<Float> animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(!z ? 1.0f : 0.0f, MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Density density = (Density) consume;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1196463086, "CC(remember):NavigationBar.kt#9igjgp");
                                    changed = startRestartGroup.changed(density);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new Function0() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda16
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Offset NavigationBarItem$lambda$7$0$0;
                                                NavigationBarItem$lambda$7$0$0 = NavigationBarKt.NavigationBarItem$lambda$7$0$0(Density.this, mutableIntState);
                                                return NavigationBarItem$lambda$7$0$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    Function0 function02 = (Function0) rememberedValue3;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1196473358, "CC(remember):NavigationBar.kt#9igjgp");
                                    changed2 = startRestartGroup.changed(mutableInteractionSource5) | startRestartGroup.changed(function02);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (!changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new MappedInteractionSource(mutableInteractionSource5, function02);
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    final MappedInteractionSource mappedInteractionSource = (MappedInteractionSource) rememberedValue4;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-2082182507, true, new Function2() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit NavigationBarItem$lambda$7$2;
                                            NavigationBarItem$lambda$7$2 = NavigationBarKt.NavigationBarItem$lambda$7$2(MappedInteractionSource.this, (Composer) obj, ((Integer) obj2).intValue());
                                            return NavigationBarItem$lambda$7$2;
                                        }
                                    }, startRestartGroup, 54);
                                    ComposableLambda rememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(-799524251, true, new Function2() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit NavigationBarItem$lambda$7$3;
                                            NavigationBarItem$lambda$7$3 = NavigationBarKt.NavigationBarItem$lambda$7$3(State.this, navigationBarItemColors7, (Composer) obj, ((Integer) obj2).intValue());
                                            return NavigationBarItem$lambda$7$3;
                                        }
                                    }, startRestartGroup, 54);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1196516508, "CC(remember):NavigationBar.kt#9igjgp");
                                    changed3 = startRestartGroup.changed(animateFloatAsState);
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (!changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = new Function0() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                float NavigationBarItem$lambda$7$4$0;
                                                NavigationBarItem$lambda$7$4$0 = NavigationBarKt.NavigationBarItem$lambda$7$4$0(State.this);
                                                return Float.valueOf(NavigationBarItem$lambda$7$4$0);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    Function0 function03 = (Function0) rememberedValue5;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1196518747, "CC(remember):NavigationBar.kt#9igjgp");
                                    changed4 = startRestartGroup.changed(animateFloatAsState2);
                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (!changed4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue6 = new Function0() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                float NavigationBarItem$lambda$7$5$0;
                                                NavigationBarItem$lambda$7$5$0 = NavigationBarKt.NavigationBarItem$lambda$7$5$0(State.this);
                                                return Float.valueOf(NavigationBarItem$lambda$7$5$0);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    NavigationBarItemLayout(rememberComposableLambda3, rememberComposableLambda4, rememberComposableLambda, composableLambda, z10, function03, (Function0) rememberedValue6, startRestartGroup, ((i11 >> 9) & 57344) | 438);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    navigationBarItemColors2 = navigationBarItemColors7;
                                    composer2 = startRestartGroup;
                                    z6 = z12;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    modifier2 = modifier4;
                                    z5 = z10;
                                    function24 = function26;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 128) != 0) {
                                    z7 = z3;
                                    i11 = i9 & (-234881025);
                                    modifier3 = modifier2;
                                    z8 = z4;
                                    function25 = function23;
                                    navigationBarItemColors4 = navigationBarItemColors;
                                } else {
                                    z7 = z3;
                                    navigationBarItemColors4 = navigationBarItemColors;
                                    i11 = i9;
                                    modifier3 = modifier2;
                                    z8 = z4;
                                    function25 = function23;
                                }
                            }
                            mutableInteractionSource3 = mutableInteractionSource;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (mutableInteractionSource3 != null) {
                            }
                            final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6);
                            boolean z102 = z7;
                            ComposableLambda rememberComposableLambda5 = ComposableLambdaKt.rememberComposableLambda(-876637252, true, new Function2() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit NavigationBarItem$lambda$1;
                                    NavigationBarItem$lambda$1 = NavigationBarKt.NavigationBarItem$lambda$1(NavigationBarItemColors.this, z, z8, value2, function25, z7, function2, (Composer) obj, ((Integer) obj2).intValue());
                                    return NavigationBarItem$lambda$1;
                                }
                            }, startRestartGroup, 54);
                            if (function25 != null) {
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -7209213, "CC(remember):NavigationBar.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            mutableIntState = (MutableIntState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            boolean z122 = z8;
                            Modifier modifier42 = modifier3;
                            MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource4;
                            Modifier weight$default2 = RowScope.CC.weight$default(rowScope, SizeKt.m1256defaultMinSizeVpY3zN4$default(SelectableKt.m1542selectableO2vRcR0(modifier42, z, mutableInteractionSource52, null, z122, Role.m8874boximpl(Role.INSTANCE.m8888getTabo7Vup1c()), function0), 0.0f, NavigationBarHeight, 1, null), 1.0f, false, 2, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -7195078, "CC(remember):NavigationBar.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier onSizeChanged2 = OnRemeasuredModifierKt.onSizeChanged(weight$default2, (Function1) rememberedValue2);
                            Alignment center2 = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, true);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, onSizeChanged2);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            Composer m5864constructorimpl2 = Updater.m5864constructorimpl(startRestartGroup);
                            Updater.m5872setimpl(m5864constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1565189072, "C266@11902L7,263@11672L252,272@12214L7,269@11987L249,277@12496L7,278@12539L274,286@12864L146,293@13225L273,301@13547L404,318@14216L32,319@14286L31,312@13961L367:NavigationBar.kt#uh7d8r");
                            final NavigationBarItemColors navigationBarItemColors72 = navigationBarItemColors5;
                            final State animateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(!z ? 1.0f : 0.0f, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
                            final State animateFloatAsState22 = AnimateAsStateKt.animateFloatAsState(!z ? 1.0f : 0.0f, MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localDensity2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Density density2 = (Density) consume2;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1196463086, "CC(remember):NavigationBar.kt#9igjgp");
                            changed = startRestartGroup.changed(density2);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue3 = new Function0() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Offset NavigationBarItem$lambda$7$0$0;
                                    NavigationBarItem$lambda$7$0$0 = NavigationBarKt.NavigationBarItem$lambda$7$0$0(Density.this, mutableIntState);
                                    return NavigationBarItem$lambda$7$0$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            Function0 function022 = (Function0) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1196473358, "CC(remember):NavigationBar.kt#9igjgp");
                            changed2 = startRestartGroup.changed(mutableInteractionSource52) | startRestartGroup.changed(function022);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue4 = new MappedInteractionSource(mutableInteractionSource52, function022);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                            final MappedInteractionSource mappedInteractionSource2 = (MappedInteractionSource) rememberedValue4;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposableLambda rememberComposableLambda32 = ComposableLambdaKt.rememberComposableLambda(-2082182507, true, new Function2() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit NavigationBarItem$lambda$7$2;
                                    NavigationBarItem$lambda$7$2 = NavigationBarKt.NavigationBarItem$lambda$7$2(MappedInteractionSource.this, (Composer) obj, ((Integer) obj2).intValue());
                                    return NavigationBarItem$lambda$7$2;
                                }
                            }, startRestartGroup, 54);
                            ComposableLambda rememberComposableLambda42 = ComposableLambdaKt.rememberComposableLambda(-799524251, true, new Function2() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit NavigationBarItem$lambda$7$3;
                                    NavigationBarItem$lambda$7$3 = NavigationBarKt.NavigationBarItem$lambda$7$3(State.this, navigationBarItemColors72, (Composer) obj, ((Integer) obj2).intValue());
                                    return NavigationBarItem$lambda$7$3;
                                }
                            }, startRestartGroup, 54);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1196516508, "CC(remember):NavigationBar.kt#9igjgp");
                            changed3 = startRestartGroup.changed(animateFloatAsState3);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!changed3) {
                            }
                            rememberedValue5 = new Function0() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    float NavigationBarItem$lambda$7$4$0;
                                    NavigationBarItem$lambda$7$4$0 = NavigationBarKt.NavigationBarItem$lambda$7$4$0(State.this);
                                    return Float.valueOf(NavigationBarItem$lambda$7$4$0);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                            Function0 function032 = (Function0) rememberedValue5;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1196518747, "CC(remember):NavigationBar.kt#9igjgp");
                            changed4 = startRestartGroup.changed(animateFloatAsState22);
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (!changed4) {
                            }
                            rememberedValue6 = new Function0() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    float NavigationBarItem$lambda$7$5$0;
                                    NavigationBarItem$lambda$7$5$0 = NavigationBarKt.NavigationBarItem$lambda$7$5$0(State.this);
                                    return Float.valueOf(NavigationBarItem$lambda$7$5$0);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            NavigationBarItemLayout(rememberComposableLambda32, rememberComposableLambda42, rememberComposableLambda5, composableLambda, z102, function032, (Function0) rememberedValue6, startRestartGroup, ((i11 >> 9) & 57344) | 438);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            navigationBarItemColors2 = navigationBarItemColors72;
                            composer2 = startRestartGroup;
                            z6 = z122;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            modifier2 = modifier42;
                            z5 = z102;
                            function24 = function26;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z5 = z3;
                            navigationBarItemColors2 = navigationBarItemColors;
                            mutableInteractionSource2 = mutableInteractionSource;
                            composer2 = startRestartGroup;
                            z6 = z4;
                            function24 = function23;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit NavigationBarItem$lambda$8;
                                    NavigationBarItem$lambda$8 = NavigationBarKt.NavigationBarItem$lambda$8(RowScope.this, z, function0, function2, modifier2, z6, function24, z5, navigationBarItemColors2, mutableInteractionSource2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return NavigationBarItem$lambda$8;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    i9 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function23 = function22;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                i9 = i3;
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function23 = function22;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            i9 = i3;
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function23 = function22;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3;
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationBarItem$lambda$1(NavigationBarItemColors navigationBarItemColors, boolean z, boolean z2, FiniteAnimationSpec finiteAnimationSpec, Function2 function2, boolean z3, Function2 function22, Composer composer, int i) {
        Modifier.Companion companion;
        ComposerKt.sourceInformation(composer, "C216@9827L186,222@10195L193:NavigationBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-876637252, i, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:215)");
            }
            State<Color> m200animateColorAsStateeuL9pac = SingleValueAnimationKt.m200animateColorAsStateeuL9pac(navigationBarItemColors.m3598iconColorWaAFU9c$material3(z, z2), finiteAnimationSpec, null, null, composer, 0, 12);
            if (function2 == null || !(z3 || z)) {
                composer.startReplaceGroup(-634793532);
                composer.endReplaceGroup();
                companion = Modifier.INSTANCE;
            } else {
                composer.startReplaceGroup(-634794445);
                ComposerKt.sourceInformation(composer, "222@10260L2");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -634793794, "CC(remember):NavigationBar.kt#9igjgp");
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit NavigationBarItem$lambda$1$1$0;
                            NavigationBarItem$lambda$1$1$0 = NavigationBarKt.NavigationBarItem$lambda$1$1$0((SemanticsPropertyReceiver) obj);
                            return NavigationBarItem$lambda$1$1$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                companion = SemanticsModifierKt.clearAndSetSemantics(companion2, (Function1) rememberedValue);
                composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            ComposerKt.sourceInformationMarkerStart(composer, 192646451, "C223@10296L78:NavigationBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(NavigationBarItem$lambda$1$0(m200animateColorAsStateeuL9pac))), (Function2<? super Composer, ? super Integer, Unit>) function22, composer, ProvidedValue.$stable);
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
    public static final Unit NavigationBarItem$lambda$1$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationBarItem$lambda$2$0(NavigationBarItemColors navigationBarItemColors, boolean z, boolean z2, FiniteAnimationSpec finiteAnimationSpec, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C230@10558L5,232@10617L198,236@10832L169:NavigationBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(802208206, i, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:230)");
            }
            ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(NavigationBarItem$lambda$2$0$0(SingleValueAnimationKt.m200animateColorAsStateeuL9pac(navigationBarItemColors.m3599textColorWaAFU9c$material3(z, z2), finiteAnimationSpec, null, null, composer, 0, 12)), TypographyKt.getValue(NavigationBarTokens.INSTANCE.getLabelTextFont(), composer, 6), function2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final int NavigationBarItem$lambda$4(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationBarItem$lambda$6$0(MutableIntState mutableIntState, IntSize intSize) {
        mutableIntState.setIntValue((int) (intSize.m9911unboximpl() >> 32));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset NavigationBarItem$lambda$7$0$0(Density density, MutableIntState mutableIntState) {
        float NavigationBarItem$lambda$4 = (NavigationBarItem$lambda$4(mutableIntState) - density.mo522roundToPx0680j_4(NavigationBarVerticalItemTokens.INSTANCE.m5369getActiveIndicatorWidthD9Ej5fM())) / 2;
        float mo528toPx0680j_4 = density.mo528toPx0680j_4(IndicatorVerticalOffset);
        return Offset.m6508boximpl(Offset.m6511constructorimpl((Float.floatToRawIntBits(mo528toPx0680j_4) & 4294967295L) | (Float.floatToRawIntBits(NavigationBarItem$lambda$4) << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationBarItem$lambda$7$2(MappedInteractionSource mappedInteractionSource, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C296@13389L5,294@13243L241:NavigationBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2082182507, i, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:294)");
            }
            BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(Modifier.INSTANCE, IndicatorRippleLayoutIdTag), ShapesKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveIndicatorShape(), composer, 6)), mappedInteractionSource, RippleKt.m3792rippleH2RKhps$default(false, 0.0f, 0L, 7, null)), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationBarItem$lambda$7$3(final State state, NavigationBarItemColors navigationBarItemColors, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C304@13669L40,307@13887L5,302@13565L372:NavigationBar.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-799524251, i, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:302)");
            }
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, IndicatorLayoutIdTag);
            ComposerKt.sourceInformationMarkerStart(composer, 456344717, "CC(remember):NavigationBar.kt#9igjgp");
            boolean changed = composer.changed(state);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit NavigationBarItem$lambda$7$3$0$0;
                        NavigationBarItem$lambda$7$3$0$0 = NavigationBarKt.NavigationBarItem$lambda$7$3$0$0(State.this, (GraphicsLayerScope) obj);
                        return NavigationBarItem$lambda$7$3$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            BoxKt.Box(BackgroundKt.m352backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(layoutId, (Function1) rememberedValue), navigationBarItemColors.getSelectedIndicatorColor(), ShapesKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveIndicatorShape(), composer, 6)), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationBarItem$lambda$7$3$0$0(State state, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) state.getValue()).floatValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationBarItem$lambda$7$4$0(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationBarItem$lambda$7$5$0(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final void NavigationBarItemLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final Function0<Float> function0, final Function0<Float> function02, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1019541078);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationBarItemLayout)N(indicatorRipple,indicator,icon,label,alwaysShowLabel,alphaAnimationProgress,sizeAnimationProgress)577@25586L1844,559@25065L2365:NavigationBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1019541078, i2, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:558)");
            }
            Modifier badgeBounds = BadgeKt.badgeBounds(Modifier.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -526404226, "CC(remember):NavigationBar.kt#9igjgp");
            int i3 = 57344 & i2;
            boolean z2 = ((3670016 & i2) == 1048576) | ((i2 & 7168) == 2048) | (i3 == 16384);
            MeasurePolicy rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo81measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        float f;
                        Measurable measurable;
                        Placeable placeable;
                        MeasureResult m3610placeLabelAndIconzUg2_y0;
                        MeasureResult m3609placeIconX9ElhV4;
                        MeasureScope measureScope2 = measureScope;
                        float coerceAtLeast = RangesKt.coerceAtLeast(function02.invoke().floatValue(), 0.0f);
                        long m9665copyZbe2FdA$default = Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        List<? extends Measurable> list2 = list;
                        int size = list2.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Measurable measurable2 = list.get(i4);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                Placeable mo8285measureBRTryo0 = measurable2.mo8285measureBRTryo0(m9665copyZbe2FdA$default);
                                int width = mo8285measureBRTryo0.getWidth();
                                f = NavigationBarKt.IndicatorHorizontalPadding;
                                float f2 = 2;
                                int i5 = width + measureScope2.mo522roundToPx0680j_4(Dp.m9732constructorimpl(f * f2));
                                int roundToInt = MathKt.roundToInt(i5 * coerceAtLeast);
                                int height = mo8285measureBRTryo0.getHeight() + measureScope2.mo522roundToPx0680j_4(Dp.m9732constructorimpl(NavigationBarKt.getIndicatorVerticalPadding() * f2));
                                int size2 = list2.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    Measurable measurable3 = list.get(i6);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                        Placeable mo8285measureBRTryo02 = measurable3.mo8285measureBRTryo0(Constraints.INSTANCE.m9685fixedJhjzzOo(i5, height));
                                        int size3 = list2.size();
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i7);
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "indicator")) {
                                                break;
                                            }
                                            i7++;
                                        }
                                        Measurable measurable4 = measurable;
                                        Placeable mo8285measureBRTryo03 = measurable4 != null ? measurable4.mo8285measureBRTryo0(Constraints.INSTANCE.m9685fixedJhjzzOo(roundToInt, height)) : null;
                                        if (function24 != null) {
                                            int size4 = list2.size();
                                            for (int i8 = 0; i8 < size4; i8++) {
                                                Measurable measurable5 = list.get(i8);
                                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable5), "label")) {
                                                    placeable = measurable5.mo8285measureBRTryo0(m9665copyZbe2FdA$default);
                                                }
                                            }
                                            ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                                            throw new KotlinNothingValueException();
                                        }
                                        placeable = null;
                                        if (function24 == null) {
                                            m3609placeIconX9ElhV4 = NavigationBarKt.m3609placeIconX9ElhV4(measureScope, mo8285measureBRTryo0, mo8285measureBRTryo02, mo8285measureBRTryo03, j);
                                            return m3609placeIconX9ElhV4;
                                        }
                                        Intrinsics.checkNotNull(placeable);
                                        m3610placeLabelAndIconzUg2_y0 = NavigationBarKt.m3610placeLabelAndIconzUg2_y0(measureScope, placeable, mo8285measureBRTryo0, mo8285measureBRTryo02, mo8285measureBRTryo03, j, z, coerceAtLeast);
                                        return m3610placeLabelAndIconzUg2_y0;
                                    }
                                }
                                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                                throw new KotlinNothingValueException();
                            }
                            i4++;
                            measureScope2 = measureScope;
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, badgeBounds);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = i2;
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
            Updater.m5872setimpl(m5864constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -660603938, "C562@25148L17,563@25178L11,565@25203L50:NavigationBar.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf(i4 & 14));
            function22.invoke(startRestartGroup, Integer.valueOf((i4 >> 3) & 14));
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, IconLayoutIdTag);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1252746358, "C565@25245L6:NavigationBar.kt#uh7d8r");
            function23.invoke(startRestartGroup, Integer.valueOf((i4 >> 6) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (function24 != null) {
                startRestartGroup.startReplaceGroup(-660471321);
                ComposerKt.sourceInformation(startRestartGroup, "569@25379L109,568@25304L250");
                Modifier layoutId2 = LayoutIdKt.layoutId(Modifier.INSTANCE, LabelLayoutIdTag);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1641265262, "CC(remember):NavigationBar.kt#9igjgp");
                boolean z3 = (i3 == 16384) | ((i4 & 458752) == 131072);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit NavigationBarItemLayout$lambda$1$1$0;
                            NavigationBarItemLayout$lambda$1$1$0 = NavigationBarKt.NavigationBarItemLayout$lambda$1$1$0(z, function0, (GraphicsLayerScope) obj);
                            return NavigationBarItemLayout$lambda$1$1$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(layoutId2, (Function1) rememberedValue2);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, graphicsLayer);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 874979034, "C573@25529L7:NavigationBar.kt#uh7d8r");
                function24.invoke(startRestartGroup, Integer.valueOf((i4 >> 9) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-660200319);
                startRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NavigationBarItemLayout$lambda$2;
                    NavigationBarItemLayout$lambda$2 = NavigationBarKt.NavigationBarItemLayout$lambda$2(Function2.this, function22, function23, function24, z, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                    return NavigationBarItemLayout$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationBarItemLayout$lambda$1$1$0(boolean z, Function0 function0, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(z ? 1.0f : ((Number) function0.invoke()).floatValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m3609placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j) {
        int m9675getMaxWidthimpl;
        if (Constraints.m9675getMaxWidthimpl(j) == Integer.MAX_VALUE) {
            m9675getMaxWidthimpl = placeable.getWidth() + (measureScope.mo522roundToPx0680j_4(NavigationBarItemToIconMinimumPadding) * 2);
        } else {
            m9675getMaxWidthimpl = Constraints.m9675getMaxWidthimpl(j);
        }
        final int i = m9675getMaxWidthimpl;
        final int m9691constrainHeightK40F9xA = ConstraintsKt.m9691constrainHeightK40F9xA(j, measureScope.mo522roundToPx0680j_4(NavigationBarHeight));
        final int width = (i - placeable.getWidth()) / 2;
        final int height = (m9691constrainHeightK40F9xA - placeable.getHeight()) / 2;
        final int width2 = (i - placeable2.getWidth()) / 2;
        final int height2 = (m9691constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        return MeasureScope.CC.layout$default(measureScope, i, m9691constrainHeightK40F9xA, null, new Function1() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit placeIcon_X9ElhV4$lambda$0;
                placeIcon_X9ElhV4$lambda$0 = NavigationBarKt.placeIcon_X9ElhV4$lambda$0(Placeable.this, placeable, width, height, placeable2, width2, height2, i, m9691constrainHeightK40F9xA, (Placeable.PlacementScope) obj);
                return placeIcon_X9ElhV4$lambda$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit placeIcon_X9ElhV4$lambda$0(Placeable placeable, Placeable placeable2, int i, int i2, Placeable placeable3, int i3, int i4, int i5, int i6, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i5 - placeable.getWidth()) / 2, (i6 - placeable.getHeight()) / 2, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i, i2, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i3, i4, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m3610placeLabelAndIconzUg2_y0(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j, final boolean z, final float f) {
        int m9675getMaxWidthimpl;
        float height = placeable2.getHeight();
        float f2 = IndicatorVerticalPadding;
        float f3 = height + measureScope.mo528toPx0680j_4(f2);
        float f4 = NavigationBarIndicatorToLabelPadding;
        float f5 = f3 + measureScope.mo528toPx0680j_4(f4) + placeable.getHeight();
        float f6 = 2;
        final float coerceAtLeast = RangesKt.coerceAtLeast((Constraints.m9676getMinHeightimpl(j) - f5) / f6, measureScope.mo528toPx0680j_4(f2));
        float f7 = f5 + (coerceAtLeast * f6);
        final float height2 = ((z ? coerceAtLeast : (f7 - placeable2.getHeight()) / f6) - coerceAtLeast) * (1 - f);
        final float height3 = coerceAtLeast + placeable2.getHeight() + measureScope.mo528toPx0680j_4(f2) + measureScope.mo528toPx0680j_4(f4);
        if (Constraints.m9675getMaxWidthimpl(j) == Integer.MAX_VALUE) {
            m9675getMaxWidthimpl = placeable2.getWidth() + (measureScope.mo522roundToPx0680j_4(NavigationBarItemToIconMinimumPadding) * 2);
        } else {
            m9675getMaxWidthimpl = Constraints.m9675getMaxWidthimpl(j);
        }
        final int i = m9675getMaxWidthimpl;
        final int width = (i - placeable.getWidth()) / 2;
        final int width2 = (i - placeable2.getWidth()) / 2;
        final int width3 = (i - placeable3.getWidth()) / 2;
        final float f8 = coerceAtLeast - measureScope.mo528toPx0680j_4(f2);
        return MeasureScope.CC.layout$default(measureScope, i, MathKt.roundToInt(f7), null, new Function1() { // from class: androidx.compose.material3.NavigationBarKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit placeLabelAndIcon_zUg2_y0$lambda$0;
                placeLabelAndIcon_zUg2_y0$lambda$0 = NavigationBarKt.placeLabelAndIcon_zUg2_y0$lambda$0(Placeable.this, z, f, placeable, width, height3, height2, placeable2, width2, coerceAtLeast, placeable3, width3, f8, i, (Placeable.PlacementScope) obj);
                return placeLabelAndIcon_zUg2_y0$lambda$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit placeLabelAndIcon_zUg2_y0$lambda$0(Placeable placeable, boolean z, float f, Placeable placeable2, int i, float f2, float f3, Placeable placeable3, int i2, float f4, Placeable placeable4, int i3, float f5, int i4, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i4 - placeable.getWidth()) / 2, MathKt.roundToInt((f4 - placementScope.mo522roundToPx0680j_4(IndicatorVerticalPadding)) + f3), 0.0f, 4, null);
        }
        if (z || f != 0.0f) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i, MathKt.roundToInt(f2 + f3), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i2, MathKt.roundToInt(f4 + f3), 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i3, MathKt.roundToInt(f5 + f3), 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    static {
        float f = 2;
        IndicatorHorizontalPadding = Dp.m9732constructorimpl(Dp.m9732constructorimpl(NavigationBarVerticalItemTokens.INSTANCE.m5369getActiveIndicatorWidthD9Ej5fM() - NavigationBarVerticalItemTokens.INSTANCE.m5371getIconSizeD9Ej5fM()) / f);
        IndicatorVerticalPadding = Dp.m9732constructorimpl(Dp.m9732constructorimpl(NavigationBarVerticalItemTokens.INSTANCE.m5368getActiveIndicatorHeightD9Ej5fM() - NavigationBarVerticalItemTokens.INSTANCE.m5371getIconSizeD9Ej5fM()) / f);
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return NavigationBarItemHorizontalPadding;
    }

    public static final float getNavigationBarIndicatorToLabelPadding() {
        return NavigationBarIndicatorToLabelPadding;
    }

    public static final float getIndicatorVerticalPadding() {
        return IndicatorVerticalPadding;
    }

    public static final float getNavigationBarItemToIconMinimumPadding() {
        return NavigationBarItemToIconMinimumPadding;
    }

    public static final ProvidableCompositionLocal<NavigationBarOverride> getLocalNavigationBarOverride() {
        return LocalNavigationBarOverride;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavigationBarOverride LocalNavigationBarOverride$lambda$0() {
        return DefaultNavigationBarOverride.INSTANCE;
    }

    private static final long NavigationBarItem$lambda$1$0(State<Color> state) {
        return state.getValue().m6796unboximpl();
    }

    private static final long NavigationBarItem$lambda$2$0$0(State<Color> state) {
        return state.getValue().m6796unboximpl();
    }
}
