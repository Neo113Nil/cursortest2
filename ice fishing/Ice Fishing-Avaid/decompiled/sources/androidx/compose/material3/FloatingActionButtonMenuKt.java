package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.material3.tokens.FabBaselineTokens;
import androidx.compose.material3.tokens.FabLargeTokens;
import androidx.compose.material3.tokens.FabMediumTokens;
import androidx.compose.material3.tokens.FabMenuBaselineTokens;
import androidx.compose.material3.tokens.FabPrimaryContainerTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.HorizontalRuler;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FloatingActionButtonMenu.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aZ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001aQ\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0002\u0010\u0013\u001ae\u0010\u0014\u001a\u00020\u0001*\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u009d\u0001\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00032\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00190\f2\b\b\u0002\u0010#\u001a\u00020$2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020&0\f2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020&0\f2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010)\u001a«\u0001\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00032\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00190\f2\b\b\u0002\u0010#\u001a\u00020$2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020&0\f2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020&0\f2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0002\u0010+\u001a\u001a\u0010,\u001a\u00020\b*\u00020\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0003\"\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010-\u001a\u00020\u0003*\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010/\"\u0010\u00100\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u00102\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u00103\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u00104\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u00105\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u00106\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u00107\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u00108\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u00109\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u0010:\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u0010;\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u0010<\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u0010=\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u0010>\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u0010?\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u0010@\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u0010A\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u0010B\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u0010C\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u0010D\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u0010E\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101\"\u0010\u0010F\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u00101¨\u0006G²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010H\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010I\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\u0018\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020L\u0018\u00010KX\u008a\u008e\u0002²\u0006\u0018\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020L\u0018\u00010KX\u008a\u008e\u0002²\u0006\u0018\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020L\u0018\u00010KX\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"FloatingActionButtonMenu", "", "expanded", "", "button", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/material3/FloatingActionButtonMenuScope;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButtonMenuItemColumn", "buttonHeight", "", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Alignment$Horizontal;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "FloatingActionButtonMenuItem", "onClick", "text", "icon", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "FloatingActionButtonMenuItem-WMdw5o4", "(Landroidx/compose/material3/FloatingActionButtonMenuScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "MenuItemRuler", "Landroidx/compose/ui/layout/HorizontalRuler;", "ToggleFloatingActionButton", "checked", "onCheckedChange", "", "contentAlignment", "Landroidx/compose/ui/Alignment;", "containerSize", "Landroidx/compose/ui/unit/Dp;", "containerCornerRadius", "Landroidx/compose/material3/ToggleFloatingActionButtonScope;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "checkedProgress", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "itemVisible", "isVisible", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/ui/layout/Placeable;)Z", "FabInitialSize", "F", "FabInitialCornerRadius", "FabInitialIconSize", "FabMediumInitialSize", "FabMediumInitialCornerRadius", "FabMediumInitialIconSize", "FabLargeInitialSize", "FabLargeInitialCornerRadius", "FabLargeInitialIconSize", "FabFinalSize", "FabFinalCornerRadius", "FabFinalIconSize", "FabShadowElevation", "FabMenuPaddingHorizontal", "FabMenuPaddingBottom", "FabMenuButtonPaddingBottom", "FabMenuItemMinWidth", "FabMenuItemHeight", "FabMenuItemSpacingVertical", "FabMenuItemContentPaddingStart", "FabMenuItemContentPaddingEnd", "FabMenuItemContentSpacingHorizontal", "material3", "itemCount", "itemsNeedVerticalScroll", "staggerAnim", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "widthAnim", "alphaAnim"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class FloatingActionButtonMenuKt {
    private static final float FabFinalCornerRadius;
    private static final float FabFinalIconSize;
    private static final float FabFinalSize;
    private static final float FabInitialCornerRadius;
    private static final float FabMenuButtonPaddingBottom;
    private static final float FabMenuItemContentPaddingEnd;
    private static final float FabMenuItemContentPaddingStart;
    private static final float FabMenuItemContentSpacingHorizontal;
    private static final float FabMenuItemHeight;
    private static final float FabMenuItemMinWidth;
    private static final float FabMenuItemSpacingVertical;
    private static final float FabMenuPaddingBottom;
    private static final float FabMenuPaddingHorizontal;
    private static final float FabShadowElevation;
    private static final HorizontalRuler MenuItemRuler = new HorizontalRuler();
    private static final float FabInitialSize = FabBaselineTokens.INSTANCE.m5206getContainerHeightD9Ej5fM();
    private static final float FabInitialIconSize = FabBaselineTokens.INSTANCE.m5208getIconSizeD9Ej5fM();
    private static final float FabMediumInitialSize = FabMediumTokens.INSTANCE.m5212getContainerHeightD9Ej5fM();
    private static final float FabMediumInitialCornerRadius = Dp.m9732constructorimpl(20);
    private static final float FabMediumInitialIconSize = FabMediumTokens.INSTANCE.m5214getIconSizeD9Ej5fM();
    private static final float FabLargeInitialSize = FabLargeTokens.INSTANCE.m5209getContainerHeightD9Ej5fM();
    private static final float FabLargeInitialCornerRadius = Dp.m9732constructorimpl(28);
    private static final float FabLargeInitialIconSize = Dp.m9732constructorimpl(36);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButtonMenu$lambda$6(boolean z, Function2 function2, Modifier modifier, Alignment.Horizontal horizontal, Function3 function3, int i, int i2, Composer composer, int i3) {
        FloatingActionButtonMenu(z, function2, modifier, horizontal, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButtonMenuItemColumn$lambda$12(Modifier modifier, boolean z, Alignment.Horizontal horizontal, Function0 function0, Function3 function3, int i, Composer composer, int i2) {
        FloatingActionButtonMenuItemColumn(modifier, z, horizontal, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButtonMenuItem_WMdw5o4$lambda$10(FloatingActionButtonMenuScope floatingActionButtonMenuScope, Function0 function0, Function2 function2, Function2 function22, Modifier modifier, long j, long j2, int i, int i2, Composer composer, int i3) {
        m3184FloatingActionButtonMenuItemWMdw5o4(floatingActionButtonMenuScope, function0, function2, function22, modifier, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleFloatingActionButton$lambda$1(boolean z, Function1 function1, Modifier modifier, Function1 function12, Alignment alignment, Function1 function13, Function1 function14, Function3 function3, int i, int i2, Composer composer, int i3) {
        ToggleFloatingActionButton(z, function1, modifier, function12, alignment, function13, function14, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleFloatingActionButton$lambda$4(boolean z, Function1 function1, Function0 function0, Modifier modifier, Function1 function12, Alignment alignment, Function1 function13, Function1 function14, Function3 function3, int i, int i2, Composer composer, int i3) {
        ToggleFloatingActionButton(z, function1, function0, modifier, function12, alignment, function13, function14, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FloatingActionButtonMenu(boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Alignment.Horizontal horizontal, final Function3<? super FloatingActionButtonMenuScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Alignment.Horizontal horizontal2;
        int i5;
        final Modifier modifier3;
        final Alignment.Horizontal horizontal3;
        ScopeUpdateScope endRestartGroup;
        final boolean z2 = z;
        Composer startRestartGroup = composer.startRestartGroup(-1619207533);
        ComposerKt.sourceInformation(startRestartGroup, "C(FloatingActionButtonMenu)N(expanded,button,modifier,horizontalAlignment,content)121@5531L33,122@5590L29,154@6712L1462,124@5625L2549:FloatingActionButtonMenu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                horizontal2 = horizontal;
                i3 |= startRestartGroup.changed(horizontal2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                }
                i5 = i3;
                if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    horizontal3 = horizontal2;
                } else {
                    Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    Alignment.Horizontal end = i4 != 0 ? Alignment.INSTANCE.getEnd() : horizontal2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1619207533, i5, -1, "androidx.compose.material3.FloatingActionButtonMenu (FloatingActionButtonMenu.kt:120)");
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1280269004, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final MutableIntState mutableIntState = (MutableIntState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1280267120, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new FocusRequester();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final FocusRequester focusRequester = (FocusRequester) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier m1203paddingVpY3zN4$default = PaddingKt.m1203paddingVpY3zN4$default(modifier4, FabMenuPaddingHorizontal, 0.0f, 2, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1280229783, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                    boolean z3 = (i5 & 7168) == 2048;
                    FloatingActionButtonMenuKt$FloatingActionButtonMenu$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new FloatingActionButtonMenuKt$FloatingActionButtonMenu$1$1(mutableIntState, end);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1203paddingVpY3zN4$default);
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
                    Updater.m5872setimpl(m5864constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 768392800, "C131@5913L16,127@5741L228,136@6024L615,135@5983L711:FloatingActionButtonMenu.kt#uh7d8r");
                    Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1499229222, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function0() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int FloatingActionButtonMenu$lambda$1;
                                FloatingActionButtonMenu$lambda$1 = FloatingActionButtonMenuKt.FloatingActionButtonMenu$lambda$1(MutableIntState.this);
                                return Integer.valueOf(FloatingActionButtonMenu$lambda$1);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i7 = i5 >> 3;
                    z2 = z;
                    FloatingActionButtonMenuItemColumn(focusRequester2, z2, end, (Function0) rememberedValue4, function3, startRestartGroup, ((i5 << 3) & 112) | 3072 | (i7 & 896) | (57344 & i5));
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1499225071, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                    boolean z4 = (i5 & 14) == 4;
                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (z4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$FloatingActionButtonMenu$2$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return m3185invokeZmokQxo(keyEvent.m7966unboximpl());
                            }

                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m3185invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                if (z2 && KeyEventType.m7970equalsimpl0(KeyEvent_androidKt.m7978getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m7974getKeyDownCS__XNY()) && ((Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7905getTabEK5gGoQ()) && !KeyEvent_androidKt.m7983isShiftPressedZmokQxo(keyEvent)) || Key.m7657equalsimpl0(KeyEvent_androidKt.m7977getKeyZmokQxo(keyEvent), Key.INSTANCE.m7731getDirectionDownEK5gGoQ()))) {
                                    FocusRequester.m6424requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                                    return true;
                                }
                                return false;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion, (Function1) rememberedValue5);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, onKeyEvent);
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
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1412194219, "C151@6672L8:FloatingActionButtonMenu.kt#uh7d8r");
                    function2.invoke(startRestartGroup, Integer.valueOf(i7 & 14));
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
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontal3 = end;
                    modifier3 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FloatingActionButtonMenu$lambda$6;
                            FloatingActionButtonMenu$lambda$6 = FloatingActionButtonMenuKt.FloatingActionButtonMenu$lambda$6(z2, function2, modifier3, horizontal3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return FloatingActionButtonMenu$lambda$6;
                        }
                    });
                    return;
                }
                return;
            }
            horizontal2 = horizontal;
            if ((i & 24576) == 0) {
            }
            i5 = i3;
            if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        horizontal2 = horizontal;
        if ((i & 24576) == 0) {
        }
        i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FloatingActionButtonMenu$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v21, types: [T, androidx.compose.animation.core.SpringSpec] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, androidx.compose.animation.core.FiniteAnimationSpec] */
    private static final void FloatingActionButtonMenuItemColumn(final Modifier modifier, final boolean z, final Alignment.Horizontal horizontal, final Function0<Integer> function0, final Function3<? super FloatingActionButtonMenuScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Function0<Integer> function02;
        int i3;
        int i4;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-353421035);
        ComposerKt.sourceInformation(startRestartGroup, "C(FloatingActionButtonMenuItemColumn)N(modifier,expanded,horizontalAlignment,buttonHeight,content)200@8503L33,201@8572L34,203@8679L70,204@8775L24,206@8958L7,221@9509L106,217@9402L3707:FloatingActionButtonMenu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(horizontal) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-353421035, i2, -1, "androidx.compose.material3.FloatingActionButtonMenuItemColumn (FloatingActionButtonMenu.kt:199)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -335190058, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableIntState mutableIntState = (MutableIntState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -335187849, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -335184389, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState2 = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = MotionSchemeKt.value(MotionSchemeKeyTokens.SlowEffects, startRestartGroup, 6);
            if (objectRef2.element instanceof SpringSpec) {
                objectRef2.element = AnimationSpecKt.spring(((SpringSpec) objectRef2.element).getDampingRatio(), ((SpringSpec) objectRef2.element).getStiffness(), 1);
            }
            Modifier clipToBounds = ClipKt.clipToBounds(modifier);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -335157793, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function1() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit FloatingActionButtonMenuItemColumn$lambda$9$0;
                        FloatingActionButtonMenuItemColumn$lambda$9$0 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$9$0((SemanticsPropertyReceiver) obj);
                        return FloatingActionButtonMenuItemColumn$lambda$9$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i5 = i2;
            Modifier layout = LayoutModifierKt.layout(SemanticsModifierKt.semantics$default(clipToBounds, false, (Function1) rememberedValue5, 1, null), new Function3() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    MeasureResult FloatingActionButtonMenuItemColumn$lambda$10;
                    FloatingActionButtonMenuItemColumn$lambda$10 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$10(Ref.ObjectRef.this, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                    return FloatingActionButtonMenuItemColumn$lambda$10;
                }
            });
            if (FloatingActionButtonMenuItemColumn$lambda$4(mutableState)) {
                startRestartGroup.startReplaceGroup(-335134346);
                ComposerKt.sourceInformation(startRestartGroup, "235@10266L21");
                i3 = 1;
                i4 = 0;
                companion = ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), z, null, false, 12, null);
                startRestartGroup.endReplaceGroup();
            } else {
                i3 = 1;
                i4 = 0;
                startRestartGroup.startReplaceGroup(-335131491);
                startRestartGroup.endReplaceGroup();
                companion = Modifier.INSTANCE;
            }
            Modifier then = layout.then(companion);
            int i6 = i3;
            int i7 = i4;
            FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3 floatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3 = new FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3(z, function02, objectRef, mutableIntState, mutableState2, coroutineScope, objectRef2, mutableState, horizontal);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i7));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
            Updater.m5872setimpl(m5864constructorimpl, floatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1076277, "C240@10422L267,246@10702L14:FloatingActionButtonMenu.kt#uh7d8r");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -554153769, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
            int i8 = (i5 & 896) == 256 ? i6 : i7;
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (i8 != 0 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new FloatingActionButtonMenuScope() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$4$scope$1$1
                    @Override // androidx.compose.material3.FloatingActionButtonMenuScope
                    /* renamed from: getHorizontalAlignment, reason: from getter */
                    public Alignment.Horizontal get$horizontalAlignment() {
                        return Alignment.Horizontal.this;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            function3.invoke((FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$4$scope$1$1) rememberedValue6, startRestartGroup, Integer.valueOf((i5 >> 9) & 112));
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FloatingActionButtonMenuItemColumn$lambda$12;
                    FloatingActionButtonMenuItemColumn$lambda$12 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$12(Modifier.this, z, horizontal, function0, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FloatingActionButtonMenuItemColumn$lambda$12;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FloatingActionButtonMenuItemColumn$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    private static final boolean FloatingActionButtonMenuItemColumn$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FloatingActionButtonMenuItemColumn$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animatable<Integer, AnimationVector1D> FloatingActionButtonMenuItemColumn$lambda$7(MutableState<Animatable<Integer, AnimationVector1D>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButtonMenuItemColumn$lambda$9$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, -0.9f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final MeasureResult FloatingActionButtonMenuItemColumn$lambda$10(Ref.ObjectRef objectRef, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        objectRef.element = constraints;
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(constraints.getValue());
        return MeasureScope.CC.layout$default(measureScope, mo8285measureBRTryo0.getWidth(), mo8285measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit FloatingActionButtonMenuItemColumn$lambda$10$0;
                FloatingActionButtonMenuItemColumn$lambda$10$0 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$10$0(Placeable.this, (Placeable.PlacementScope) obj);
                return FloatingActionButtonMenuItemColumn$lambda$10$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButtonMenuItemColumn$lambda$10$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d7  */
    /* renamed from: FloatingActionButtonMenuItem-WMdw5o4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3184FloatingActionButtonMenuItemWMdw5o4(final FloatingActionButtonMenuScope floatingActionButtonMenuScope, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function02;
        Modifier modifier2;
        long j3;
        long j4;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        Object rememberedValue4;
        CoroutineScope coroutineScope;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(1448697100);
        ComposerKt.sourceInformation(startRestartGroup, "C(FloatingActionButtonMenuItem)N(onClick,text,icon,modifier,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color)339@14546L72,340@14640L72,342@14869L7,343@14961L7,344@14994L24,346@15041L34,349@15319L2991,349@15242L3068:FloatingActionButtonMenu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(floatingActionButtonMenuScope) : startRestartGroup.changedInstance(floatingActionButtonMenuScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 16) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i5 = 131072;
                        i3 |= i5;
                    }
                } else {
                    j3 = j;
                }
                i5 = 65536;
                i3 |= i5;
            } else {
                j3 = j;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 32) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i4 = 1048576;
                        i3 |= i4;
                    }
                } else {
                    j4 = j2;
                }
                i4 = 524288;
                i3 |= i4;
            } else {
                j4 = j2;
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "336@14432L11,337@14488L31");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -3670017;
                    }
                    companion = modifier2;
                    j5 = j3;
                } else {
                    companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
                        j5 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getPrimaryContainer();
                        i3 &= -458753;
                    } else {
                        j5 = j3;
                    }
                    if ((i2 & 32) != 0) {
                        j6 = ColorSchemeKt.m2784contentColorForek8zF_U(j5, startRestartGroup, (i3 >> 15) & 14);
                        i3 &= -3670017;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1448697100, i3, -1, "androidx.compose.material3.FloatingActionButtonMenuItem (FloatingActionButtonMenu.kt:338)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 628520404, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final MutableState mutableState = (MutableState) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 628523412, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        final MutableState mutableState2 = (MutableState) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
                        final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 628536206, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 != Composer.INSTANCE.getEmpty()) {
                            coroutineScope = coroutineScope2;
                            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        } else {
                            coroutineScope = coroutineScope2;
                        }
                        final MutableState mutableState3 = (MutableState) rememberedValue4;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final CoroutineScope coroutineScope3 = coroutineScope;
                        final Modifier modifier4 = companion;
                        composer2 = startRestartGroup;
                        CompositionLocalKt.CompositionLocalProvider(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(Dp.m9730boximpl(Dp.m9732constructorimpl(0))), ComposableLambdaKt.rememberComposableLambda(-581009332, true, new Function2() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FloatingActionButtonMenuItem_WMdw5o4$lambda$9;
                                FloatingActionButtonMenuItem_WMdw5o4$lambda$9 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$9(Modifier.this, coroutineScope3, value, value2, function02, j5, j6, mutableState3, mutableState, mutableState2, floatingActionButtonMenuScope, function22, function2, (Composer) obj, ((Integer) obj2).intValue());
                                return FloatingActionButtonMenuItem_WMdw5o4$lambda$9;
                            }
                        }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    }
                }
                j6 = j4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 628520404, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState4 = (MutableState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 628523412, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState22 = (MutableState) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final FiniteAnimationSpec value3 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
                final FiniteAnimationSpec value22 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683736516, "CC(remember):Effects.kt#9igjgp");
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                CoroutineScope coroutineScope22 = (CoroutineScope) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 628536206, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 != Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState32 = (MutableState) rememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final CoroutineScope coroutineScope32 = coroutineScope;
                final Modifier modifier42 = companion;
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(Dp.m9730boximpl(Dp.m9732constructorimpl(0))), ComposableLambdaKt.rememberComposableLambda(-581009332, true, new Function2() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit FloatingActionButtonMenuItem_WMdw5o4$lambda$9;
                        FloatingActionButtonMenuItem_WMdw5o4$lambda$9 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$9(Modifier.this, coroutineScope32, value3, value22, function02, j5, j6, mutableState32, mutableState4, mutableState22, floatingActionButtonMenuScope, function22, function2, (Composer) obj, ((Integer) obj2).intValue());
                        return FloatingActionButtonMenuItem_WMdw5o4$lambda$9;
                    }
                }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                j5 = j3;
                j6 = j4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit FloatingActionButtonMenuItem_WMdw5o4$lambda$10;
                        FloatingActionButtonMenuItem_WMdw5o4$lambda$10 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$10(FloatingActionButtonMenuScope.this, function0, function2, function22, modifier3, j5, j6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return FloatingActionButtonMenuItem_WMdw5o4$lambda$10;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final Animatable<Float, AnimationVector1D> FloatingActionButtonMenuItem_WMdw5o4$lambda$1(MutableState<Animatable<Float, AnimationVector1D>> mutableState) {
        return mutableState.getValue();
    }

    private static final Animatable<Float, AnimationVector1D> FloatingActionButtonMenuItem_WMdw5o4$lambda$4(MutableState<Animatable<Float, AnimationVector1D>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FloatingActionButtonMenuItem_WMdw5o4$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FloatingActionButtonMenuItem_WMdw5o4$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButtonMenuItem_WMdw5o4$lambda$9(Modifier modifier, final CoroutineScope coroutineScope, final FiniteAnimationSpec finiteAnimationSpec, final FiniteAnimationSpec finiteAnimationSpec2, Function0 function0, long j, long j2, MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final FloatingActionButtonMenuScope floatingActionButtonMenuScope, final Function2 function2, final Function2 function22, Composer composer, int i) {
        final MutableState mutableState4;
        ComposerKt.sourceInformation(composer, "C352@15398L13,352@15420L1315,378@16802L5,382@16927L1377,350@15329L2975:FloatingActionButtonMenu.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-581009332, i, -1, "androidx.compose.material3.FloatingActionButtonMenuItem.<anonymous> (FloatingActionButtonMenu.kt:350)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -4217031, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState4 = mutableState;
                rememberedValue = new Function0() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean FloatingActionButtonMenuItem_WMdw5o4$lambda$7;
                        FloatingActionButtonMenuItem_WMdw5o4$lambda$7 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$7(MutableState.this);
                        return Boolean.valueOf(FloatingActionButtonMenuItem_WMdw5o4$lambda$7);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            } else {
                mutableState4 = mutableState;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier itemVisible = itemVisible(modifier, (Function0) rememberedValue);
            ComposerKt.sourceInformationMarkerStart(composer, -4215025, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(coroutineScope) | composer.changedInstance(finiteAnimationSpec) | composer.changedInstance(finiteAnimationSpec2);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Function3 function3 = new Function3() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        MeasureResult FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0;
                        FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0(MutableState.this, coroutineScope, finiteAnimationSpec, mutableState3, finiteAnimationSpec2, mutableState4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                        return FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0;
                    }
                };
                composer.updateRememberedValue(function3);
                rememberedValue2 = function3;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            SurfaceKt.m4115Surfaceo_FOJdg(function0, LayoutModifierKt.layout(itemVisible, (Function3) rememberedValue2), false, ShapesKt.getValue(FabMenuBaselineTokens.INSTANCE.getListItemContainerShape(), composer, 6), j, j2, 0.0f, 0.0f, null, null, ComposableLambdaKt.rememberComposableLambda(-267751263, true, new Function2() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2;
                    FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2(FloatingActionButtonMenuScope.this, mutableState2, function2, function22, (Composer) obj, ((Integer) obj2).intValue());
                    return FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2;
                }
            }, composer, 54), composer, 0, 6, 964);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0(final MutableState mutableState, final CoroutineScope coroutineScope, final FiniteAnimationSpec finiteAnimationSpec, final MutableState mutableState2, final FiniteAnimationSpec finiteAnimationSpec2, final MutableState mutableState3, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(constraints.getValue());
        return MeasureScope.CC.layout$default(measureScope, mo8285measureBRTryo0.getWidth(), mo8285measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0$0;
                FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0$0 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0$0(Placeable.this, mutableState, coroutineScope, finiteAnimationSpec, mutableState2, finiteAnimationSpec2, mutableState3, (Placeable.PlacementScope) obj);
                return FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0$0(Placeable placeable, MutableState mutableState, CoroutineScope coroutineScope, FiniteAnimationSpec finiteAnimationSpec, MutableState mutableState2, FiniteAnimationSpec finiteAnimationSpec2, MutableState mutableState3, Placeable.PlacementScope placementScope) {
        float f = placementScope.current(MenuItemRuler, Float.POSITIVE_INFINITY) <= 0.0f ? 1.0f : 0.0f;
        Animatable<Float, AnimationVector1D> FloatingActionButtonMenuItem_WMdw5o4$lambda$1 = FloatingActionButtonMenuItem_WMdw5o4$lambda$1(mutableState);
        if (FloatingActionButtonMenuItem_WMdw5o4$lambda$1 == null) {
            FloatingActionButtonMenuItem_WMdw5o4$lambda$1 = new Animatable<>(Float.valueOf(f), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), null, null, 12, null);
        } else if (FloatingActionButtonMenuItem_WMdw5o4$lambda$1.getTargetValue().floatValue() != f) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FloatingActionButtonMenuKt$FloatingActionButtonMenuItem$1$2$1$1$1$1(FloatingActionButtonMenuItem_WMdw5o4$lambda$1, f, finiteAnimationSpec, null), 3, null);
        }
        mutableState.setValue(FloatingActionButtonMenuItem_WMdw5o4$lambda$1);
        final Animatable<Float, AnimationVector1D> FloatingActionButtonMenuItem_WMdw5o4$lambda$4 = FloatingActionButtonMenuItem_WMdw5o4$lambda$4(mutableState2);
        if (FloatingActionButtonMenuItem_WMdw5o4$lambda$4 == null) {
            FloatingActionButtonMenuItem_WMdw5o4$lambda$4 = new Animatable<>(Float.valueOf(f), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), null, null, 12, null);
        } else if (FloatingActionButtonMenuItem_WMdw5o4$lambda$4.getTargetValue().floatValue() != f) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FloatingActionButtonMenuKt$FloatingActionButtonMenuItem$1$2$1$1$tempAlphaAnim$1$1(FloatingActionButtonMenuItem_WMdw5o4$lambda$4, f, finiteAnimationSpec2, null), 3, null);
        }
        mutableState2.setValue(FloatingActionButtonMenuItem_WMdw5o4$lambda$4);
        FloatingActionButtonMenuItem_WMdw5o4$lambda$8(mutableState3, !(FloatingActionButtonMenuItem_WMdw5o4$lambda$4.getValue().floatValue() == 0.0f));
        if (FloatingActionButtonMenuItem_WMdw5o4$lambda$7(mutableState3)) {
            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, new Function1() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0$0$2;
                    FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0$0$2 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0$0$2(Animatable.this, (GraphicsLayerScope) obj);
                    return FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0$0$2;
                }
            }, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0$0$2(Animatable animatable, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) animatable.getValue()).floatValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2(final FloatingActionButtonMenuScope floatingActionButtonMenuScope, final MutableState mutableState, Function2 function2, Function2 function22, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C384@16978L533,383@16941L1353:FloatingActionButtonMenu.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-267751263, i, -1, "androidx.compose.material3.FloatingActionButtonMenuItem.<anonymous>.<anonymous> (FloatingActionButtonMenu.kt:383)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 389076182, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(floatingActionButtonMenuScope);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function3() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        MeasureResult FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2$0$0;
                        FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2$0$0 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2$0$0(MutableState.this, floatingActionButtonMenuScope, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                        return FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(SizeKt.m1275sizeInqDBjuR0$default(LayoutModifierKt.layout(companion, (Function3) rememberedValue), FabMenuItemMinWidth, FabMenuItemHeight, 0.0f, 0.0f, 12, null), FabMenuItemContentPaddingStart, 0.0f, FabMenuItemContentPaddingEnd, 0.0f, 10, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal m869spacedByD5KLDUw = Arrangement.INSTANCE.m869spacedByD5KLDUw(FabMenuItemContentSpacingHorizontal, Alignment.INSTANCE.getCenterHorizontally());
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m869spacedByD5KLDUw, centerVertically, composer, 54);
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
            ComposerKt.sourceInformationMarkerStart(composer, 541710382, "C406@18096L6,408@18203L10,407@18119L161:FloatingActionButtonMenu.kt#uh7d8r");
            function2.invoke(composer, 0);
            CompositionLocalKt.CompositionLocalProvider(TextKt.getLocalTextStyle().provides(MaterialTheme.INSTANCE.getTypography(composer, 6).getTitleMedium()), (Function2<? super Composer, ? super Integer, Unit>) function22, composer, ProvidedValue.$stable);
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
    public static final MeasureResult FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2$0$0(MutableState mutableState, final FloatingActionButtonMenuScope floatingActionButtonMenuScope, final MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(constraints.getValue());
        float width = mo8285measureBRTryo0.getWidth();
        Animatable<Float, AnimationVector1D> FloatingActionButtonMenuItem_WMdw5o4$lambda$1 = FloatingActionButtonMenuItem_WMdw5o4$lambda$1(mutableState);
        final int roundToInt = MathKt.roundToInt(width * Math.max(FloatingActionButtonMenuItem_WMdw5o4$lambda$1 != null ? FloatingActionButtonMenuItem_WMdw5o4$lambda$1.getValue().floatValue() : 0.0f, 0.0f));
        return MeasureScope.CC.layout$default(measureScope, roundToInt, mo8285measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2$0$0$0;
                FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2$0$0$0 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2$0$0$0(FloatingActionButtonMenuScope.this, mo8285measureBRTryo0, roundToInt, measureScope, (Placeable.PlacementScope) obj);
                return FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2$0$0$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2$0$0$0(FloatingActionButtonMenuScope floatingActionButtonMenuScope, Placeable placeable, int i, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, floatingActionButtonMenuScope.get$horizontalAlignment().align(placeable.getWidth(), i, measureScope.getLayoutDirection()), 0, 0.0f, (Function1) null, 12, (Object) null);
        return Unit.INSTANCE;
    }

    static {
        float f = 16;
        FabInitialCornerRadius = Dp.m9732constructorimpl(f);
        float m5217getCloseButtonContainerHeightD9Ej5fM = FabMenuBaselineTokens.INSTANCE.m5217getCloseButtonContainerHeightD9Ej5fM();
        FabFinalSize = m5217getCloseButtonContainerHeightD9Ej5fM;
        FabFinalCornerRadius = Dp.m9732constructorimpl(m5217getCloseButtonContainerHeightD9Ej5fM / 2);
        FabFinalIconSize = FabMenuBaselineTokens.INSTANCE.m5219getCloseButtonIconSizeD9Ej5fM();
        FabShadowElevation = FabPrimaryContainerTokens.INSTANCE.m5227getContainerElevationD9Ej5fM();
        FabMenuPaddingHorizontal = Dp.m9732constructorimpl(f);
        FabMenuPaddingBottom = FabMenuBaselineTokens.INSTANCE.m5215getCloseButtonBetweenSpaceD9Ej5fM();
        FabMenuButtonPaddingBottom = Dp.m9732constructorimpl(f);
        FabMenuItemMinWidth = FabMenuBaselineTokens.INSTANCE.m5222getListItemContainerHeightD9Ej5fM();
        FabMenuItemHeight = FabMenuBaselineTokens.INSTANCE.m5222getListItemContainerHeightD9Ej5fM();
        FabMenuItemSpacingVertical = FabMenuBaselineTokens.INSTANCE.m5220getListItemBetweenSpaceD9Ej5fM();
        FabMenuItemContentPaddingStart = FabMenuBaselineTokens.INSTANCE.m5225getListItemLeadingSpaceD9Ej5fM();
        FabMenuItemContentPaddingEnd = FabMenuBaselineTokens.INSTANCE.m5226getListItemTrailingSpaceD9Ej5fM();
        FabMenuItemContentSpacingHorizontal = FabMenuBaselineTokens.INSTANCE.m5223getListItemIconLabelSpaceD9Ej5fM();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ToggleFloatingActionButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, Function1<? super Float, Color> function12, Alignment alignment, Function1<? super Float, Dp> function13, Function1<? super Float, Dp> function14, final Function3<? super ToggleFloatingActionButtonScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Function1<? super Float, Color> function15;
        int i4;
        Alignment alignment2;
        Function1<? super Float, Dp> function16;
        Function1<? super Float, Dp> function17;
        final Modifier modifier3;
        final Function1<? super Float, Color> function18;
        final Alignment alignment3;
        final Function1<? super Float, Dp> function19;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(1041334678);
        ComposerKt.sourceInformation(startRestartGroup, "C(ToggleFloatingActionButton)N(checked,onCheckedChange,modifier,containerColor,contentAlignment,containerSize,containerCornerRadius,content)459@20576L7,456@20362L232,464@20677L25,461@20599L249:FloatingActionButtonMenu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    function15 = function12;
                    if (startRestartGroup.changedInstance(function15)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    function15 = function12;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                function15 = function12;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
                alignment2 = alignment;
            } else {
                alignment2 = alignment;
                if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(alignment2) ? 16384 : 8192;
                }
            }
            if ((196608 & i) != 0) {
                function16 = function13;
                i3 |= ((i2 & 32) == 0 && startRestartGroup.changedInstance(function16)) ? 131072 : 65536;
            } else {
                function16 = function13;
            }
            if ((1572864 & i) != 0) {
                function17 = function14;
                i3 |= ((i2 & 64) == 0 && startRestartGroup.changedInstance(function17)) ? 1048576 : 524288;
            } else {
                function17 = function14;
            }
            if ((12582912 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
            }
            if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "448@19987L16");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    i5 = i3;
                    modifier4 = modifier2;
                } else {
                    modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        function15 = ToggleFloatingActionButtonDefaults.INSTANCE.m4420containerColordgg9oW8(0L, 0L, startRestartGroup, 384, 3);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        alignment2 = Alignment.INSTANCE.getTopEnd();
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        function16 = ToggleFloatingActionButtonDefaults.INSTANCE.containerSize();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        function17 = ToggleFloatingActionButtonDefaults.INSTANCE.containerCornerRadius();
                    }
                    i5 = i3;
                }
                Function1<? super Float, Color> function110 = function15;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1041334678, i5, -1, "androidx.compose.material3.ToggleFloatingActionButton (FloatingActionButtonMenu.kt:454)");
                }
                final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -4725809, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                boolean changed = startRestartGroup.changed(animateFloatAsState);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            float ToggleFloatingActionButton$lambda$0$0;
                            ToggleFloatingActionButton$lambda$0$0 = FloatingActionButtonMenuKt.ToggleFloatingActionButton$lambda$0$0(State.this);
                            return Float.valueOf(ToggleFloatingActionButton$lambda$0$0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i8 = i5 << 3;
                int i9 = (i5 & 126) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (3670016 & i8) | (29360128 & i8) | (i8 & 234881024);
                function18 = function110;
                alignment3 = alignment2;
                function19 = function16;
                modifier3 = modifier4;
                ToggleFloatingActionButton(z, function1, function0, modifier3, function18, alignment3, function19, function17, function3, startRestartGroup, i9, 0);
                startRestartGroup = startRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                function18 = function15;
                alignment3 = alignment2;
                function19 = function16;
            }
            Composer composer2 = startRestartGroup;
            final Function1<? super Float, Dp> function111 = function17;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ToggleFloatingActionButton$lambda$1;
                        ToggleFloatingActionButton$lambda$1 = FloatingActionButtonMenuKt.ToggleFloatingActionButton$lambda$1(z, function1, modifier3, function18, alignment3, function19, function111, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ToggleFloatingActionButton$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        Composer composer22 = startRestartGroup;
        final Function1 function1112 = function17;
        endRestartGroup = composer22.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ToggleFloatingActionButton$lambda$0$0(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ToggleFloatingActionButton(final boolean z, final Function1<? super Boolean, Unit> function1, final Function0<Float> function0, Modifier modifier, Function1<? super Float, Color> function12, Alignment alignment, Function1<? super Float, Dp> function13, Function1<? super Float, Dp> function14, final Function3<? super ToggleFloatingActionButtonScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Alignment alignment2;
        Function1<? super Float, Dp> function15;
        Function1<? super Float, Dp> function16;
        Composer composer2;
        final Function1<? super Float, Color> function17;
        final Alignment alignment3;
        final Function1<? super Float, Dp> function18;
        final Function1<? super Float, Dp> function19;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        Composer composer3;
        Function1<? super Float, Color> function110;
        int i5;
        Alignment alignment4;
        final Function1<? super Float, Dp> function111;
        final Function1<? super Float, Color> function112;
        final Function1<? super Float, Dp> function113;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(2138014434);
        ComposerKt.sourceInformation(startRestartGroup, "C(ToggleFloatingActionButton)N(checked,onCheckedChange,checkedProgress,modifier,containerColor,contentAlignment,containerSize,containerCornerRadius,content)517@23123L45,518@23173L2333:FloatingActionButtonMenu.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0 && startRestartGroup.changedInstance(function12)) {
                    i7 = 16384;
                    i3 |= i7;
                }
                i7 = 8192;
                i3 |= i7;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                alignment2 = alignment;
                i3 |= startRestartGroup.changed(alignment2) ? 131072 : 65536;
                if ((i & 1572864) == 0) {
                    function15 = function13;
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changedInstance(function15)) ? 1048576 : 524288;
                } else {
                    function15 = function13;
                }
                if ((i & 12582912) == 0) {
                    if ((i2 & 128) == 0) {
                        function16 = function14;
                        if (startRestartGroup.changedInstance(function16)) {
                            i6 = 8388608;
                            i3 |= i6;
                        }
                    } else {
                        function16 = function14;
                    }
                    i6 = 4194304;
                    i3 |= i6;
                } else {
                    function16 = function14;
                }
                if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "510@22760L16");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        function111 = function15;
                        companion = modifier2;
                        function113 = function16;
                        function112 = function12;
                        composer3 = startRestartGroup;
                        i5 = i3;
                        alignment4 = alignment2;
                    } else {
                        companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 16) != 0) {
                            function110 = ToggleFloatingActionButtonDefaults.INSTANCE.m4420containerColordgg9oW8(0L, 0L, startRestartGroup, 384, 3);
                            composer3 = startRestartGroup;
                            i3 &= -57345;
                        } else {
                            composer3 = startRestartGroup;
                            function110 = function12;
                        }
                        Alignment topEnd = i4 != 0 ? Alignment.INSTANCE.getTopEnd() : alignment;
                        if ((i2 & 64) != 0) {
                            function15 = ToggleFloatingActionButtonDefaults.INSTANCE.containerSize();
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            Alignment alignment5 = topEnd;
                            i5 = i3 & (-29360129);
                            alignment4 = alignment5;
                            function111 = function15;
                            function112 = function110;
                            function113 = ToggleFloatingActionButtonDefaults.INSTANCE.containerCornerRadius();
                        } else {
                            Alignment alignment6 = topEnd;
                            i5 = i3;
                            alignment4 = alignment6;
                            function111 = function15;
                            function112 = function110;
                            function113 = function14;
                        }
                    }
                    composer3.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2138014434, i5, -1, "androidx.compose.material3.ToggleFloatingActionButton (FloatingActionButtonMenu.kt:516)");
                    }
                    ComposerKt.sourceInformationMarkerStart(composer3, 1637522831, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                    int i9 = (3670016 & i5) ^ 1572864;
                    boolean z2 = (i9 > 1048576 && composer3.changed(function111)) || (i5 & 1572864) == 1048576;
                    Object rememberedValue = composer3.rememberedValue();
                    if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = Dp.m9730boximpl(function111.invoke(Float.valueOf(0.0f)).m9746unboximpl());
                        composer3.updateRememberedValue(rememberedValue);
                    }
                    float m9746unboximpl = ((Dp) rememberedValue).m9746unboximpl();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Modifier m1271size3ABfNKs = SizeKt.m1271size3ABfNKs(Modifier.INSTANCE, m9746unboximpl);
                    ComposerKt.sourceInformationMarkerStart(composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment4, false);
                    Alignment alignment7 = alignment4;
                    ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m1271size3ABfNKs);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer m5864constructorimpl = Updater.m5864constructorimpl(composer3);
                    Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, 826450783, "C519@23279L7,521@23329L207,528@23569L313,536@23948L164,541@24141L303,554@24719L447,534@23891L1609:FloatingActionButtonMenu.kt#uh7d8r");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = composer3.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    final Density density = (Density) consume;
                    ComposerKt.sourceInformationMarkerStart(composer3, 1550680779, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                    boolean changed = composer3.changed(m9746unboximpl);
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        double mo528toPx0680j_4 = density.mo528toPx0680j_4(m9746unboximpl) / 2;
                        rememberedValue2 = Dp.m9730boximpl(density.mo524toDpu2uoSUM((float) Math.hypot(mo528toPx0680j_4, mo528toPx0680j_4)));
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    float m9746unboximpl2 = ((Dp) rememberedValue2).m9746unboximpl();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerStart(composer3, 1550688565, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                    int i10 = i5 & 896;
                    int i11 = (29360128 & i5) ^ 12582912;
                    boolean changed2 = composer3.changed(density) | (i10 == 256) | ((i11 > 8388608 && composer3.changed(function113)) || (i5 & 12582912) == 8388608);
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new GenericShape(new Function3() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Unit ToggleFloatingActionButton$lambda$3$1$0;
                                ToggleFloatingActionButton$lambda$3$1$0 = FloatingActionButtonMenuKt.ToggleFloatingActionButton$lambda$3$1$0(Density.this, function113, function0, (Path) obj, (Size) obj2, (LayoutDirection) obj3);
                                return ToggleFloatingActionButton$lambda$3$1$0;
                            }
                        });
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    final GenericShape genericShape = (GenericShape) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerStart(composer3, 1550700544, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                    boolean changed3 = composer3.changed(genericShape);
                    Object rememberedValue4 = composer3.rememberedValue();
                    if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function1() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit ToggleFloatingActionButton$lambda$3$2$0;
                                ToggleFloatingActionButton$lambda$3$2$0 = FloatingActionButtonMenuKt.ToggleFloatingActionButton$lambda$3$2$0(GenericShape.this, (GraphicsLayerScope) obj);
                                return ToggleFloatingActionButton$lambda$3$2$0;
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue4);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) rememberedValue4);
                    ComposerKt.sourceInformationMarkerStart(composer3, 1550706859, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                    boolean changed4 = ((i11 > 8388608 && composer3.changed(function113)) || (i5 & 12582912) == 8388608) | composer3.changed(density) | (i10 == 256) | ((((57344 & i5) ^ 24576) > 16384 && composer3.changed(function112)) || (i5 & 24576) == 16384);
                    Object rememberedValue5 = composer3.rememberedValue();
                    if (changed4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function1() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit ToggleFloatingActionButton$lambda$3$3$0;
                                ToggleFloatingActionButton$lambda$3$3$0 = FloatingActionButtonMenuKt.ToggleFloatingActionButton$lambda$3$3$0(Density.this, function112, function0, function113, (DrawScope) obj);
                                return ToggleFloatingActionButton$lambda$3$3$0;
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue5);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    int i12 = i5;
                    Function1<? super Float, Dp> function114 = function113;
                    composer2 = composer3;
                    Modifier m1550toggleableO2vRcR0$default = ToggleableKt.m1550toggleableO2vRcR0$default(DrawModifierKt.drawBehind(graphicsLayer, (Function1) rememberedValue5), z, null, RippleKt.m3792rippleH2RKhps$default(false, m9746unboximpl2, 0L, 5, null), false, null, function1, 24, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 1550725499, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                    boolean z3 = (i10 == 256) | ((i9 > 1048576 && composer2.changed(function111)) || (i12 & 1572864) == 1048576);
                    Object rememberedValue6 = composer2.rememberedValue();
                    if (z3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new Function3() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                MeasureResult ToggleFloatingActionButton$lambda$3$4$0;
                                ToggleFloatingActionButton$lambda$3$4$0 = FloatingActionButtonMenuKt.ToggleFloatingActionButton$lambda$3$4$0(Function1.this, function0, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                                return ToggleFloatingActionButton$lambda$3$4$0;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier layout = LayoutModifierKt.layout(m1550toggleableO2vRcR0$default, (Function3) rememberedValue6);
                    ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, layout);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer m5864constructorimpl2 = Updater.m5864constructorimpl(composer2);
                    Updater.m5872setimpl(m5864constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -569655582, "C566@25219L244,572@25476L14:FloatingActionButtonMenu.kt#uh7d8r");
                    ComposerKt.sourceInformationMarkerStart(composer2, -434017142, "CC(remember):FloatingActionButtonMenu.kt#9igjgp");
                    boolean z4 = i10 == 256;
                    Object rememberedValue7 = composer2.rememberedValue();
                    if (z4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new ToggleFloatingActionButtonScope() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$ToggleFloatingActionButton$3$4$scope$1$1
                            @Override // androidx.compose.material3.ToggleFloatingActionButtonScope
                            public float getCheckedProgress() {
                                return function0.invoke().floatValue();
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue7);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    function3.invoke((FloatingActionButtonMenuKt$ToggleFloatingActionButton$3$4$scope$1$1) rememberedValue7, composer2, Integer.valueOf((i12 >> 21) & 112));
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function17 = function112;
                    function19 = function111;
                    function18 = function114;
                    alignment3 = alignment7;
                    modifier3 = companion;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    function17 = function12;
                    alignment3 = alignment;
                    function18 = function14;
                    function19 = function15;
                    modifier3 = modifier2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ToggleFloatingActionButton$lambda$4;
                            ToggleFloatingActionButton$lambda$4 = FloatingActionButtonMenuKt.ToggleFloatingActionButton$lambda$4(z, function1, function0, modifier3, function17, alignment3, function19, function18, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return ToggleFloatingActionButton$lambda$4;
                        }
                    });
                    return;
                }
                return;
            }
            alignment2 = alignment;
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        alignment2 = alignment;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleFloatingActionButton$lambda$3$1$0(Density density, Function1 function1, Function0 function0, Path path, Size size, LayoutDirection layoutDirection) {
        float mo528toPx0680j_4 = density.mo528toPx0680j_4(((Dp) function1.invoke(function0.invoke())).m9746unboximpl());
        Path.CC.addRoundRect$default(path, RoundRectKt.m6574RoundRectsniSvfs(androidx.compose.ui.geometry.SizeKt.m6609toRectuvyYCjk(size.m6593unboximpl()), CornerRadius.m6473constructorimpl((Float.floatToRawIntBits(mo528toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo528toPx0680j_4) & 4294967295L))), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleFloatingActionButton$lambda$3$2$0(GenericShape genericShape, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo528toPx0680j_4(FabShadowElevation));
        graphicsLayerScope.setShape(genericShape);
        graphicsLayerScope.setClip(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleFloatingActionButton$lambda$3$3$0(Density density, Function1 function1, Function0 function0, Function1 function12, DrawScope drawScope) {
        float mo528toPx0680j_4 = density.mo528toPx0680j_4(((Dp) function12.invoke(function0.invoke())).m9746unboximpl());
        DrawScope.CC.m7381drawRoundRectuAw5IA$default(drawScope, ((Color) function1.invoke(function0.invoke())).m6796unboximpl(), 0L, 0L, CornerRadius.m6473constructorimpl((Float.floatToRawIntBits(mo528toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo528toPx0680j_4) & 4294967295L)), null, 0.0f, null, 0, 246, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult ToggleFloatingActionButton$lambda$3$4$0(Function1 function1, Function0 function0, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(constraints.getValue());
        final int i = measureScope.mo522roundToPx0680j_4(((Dp) function1.invoke(function0.invoke())).m9746unboximpl());
        return MeasureScope.CC.layout$default(measureScope, i, i, null, new Function1() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ToggleFloatingActionButton$lambda$3$4$0$0;
                ToggleFloatingActionButton$lambda$3$4$0$0 = FloatingActionButtonMenuKt.ToggleFloatingActionButton$lambda$3$4$0$0(Placeable.this, i, (Placeable.PlacementScope) obj);
                return ToggleFloatingActionButton$lambda$3$4$0$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleFloatingActionButton$lambda$3$4$0$0(Placeable placeable, int i, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, (i - placeable.getWidth()) / 2, (i - placeable.getHeight()) / 2, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    private static final Modifier itemVisible(Modifier modifier, Function0<Boolean> function0) {
        return modifier.then(new MenuItemVisibleElement(function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isVisible(Placeable placeable) {
        Function0<Boolean> visible;
        Object parentData = placeable.getParentData();
        MenuItemVisibilityModifier menuItemVisibilityModifier = parentData instanceof MenuItemVisibilityModifier ? (MenuItemVisibilityModifier) parentData : null;
        boolean z = false;
        if (menuItemVisibilityModifier != null && (visible = menuItemVisibilityModifier.getVisible()) != null && !visible.invoke().booleanValue()) {
            z = true;
        }
        return !z;
    }
}
