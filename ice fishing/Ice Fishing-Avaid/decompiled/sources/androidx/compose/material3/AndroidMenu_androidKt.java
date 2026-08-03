package androidx.compose.material3;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.DropdownMenuPositionProvider;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: AndroidMenu.android.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\u001a\u009f\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aa\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007¢\u0006\u0004\b\u001f\u0010 \u001aO\u0010!\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0002\u0010'\u001ak\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007¢\u0006\u0004\b(\u0010)\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007¢\u0006\u0004\b*\u0010 \u001a\u0090\u0001\u0010+\u001a\u00020\u00012\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001a2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u001a2\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0007¢\u0006\u0002\u00107\"\u0014\u00108\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006;²\u0006\n\u0010<\u001a\u00020=X\u008a\u0084\u0002²\u0006\n\u0010>\u001a\u00020=X\u008a\u0084\u0002"}, d2 = {"DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "offset", "Landroidx/compose/ui/unit/DpOffset;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "border", "Landroidx/compose/foundation/BorderStroke;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-IlH_yew", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Landroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "DropdownMenuPopup", "DropdownMenuPopup-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuPopupContent", "expandedState", "Landroidx/compose/animation/core/MutableTransitionState;", "transformOriginState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "DropdownMenu-4kj-_NE", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenu-ILWXrKs", "DropdownMenuItem", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "colors", "Landroidx/compose/material3/MenuItemColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "DefaultMenuProperties", "getDefaultMenuProperties", "()Landroidx/compose/ui/window/PopupProperties;", "material3", "scale", "", "alpha"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class AndroidMenu_androidKt {
    private static final PopupProperties DefaultMenuProperties = new PopupProperties(true, false, false, false, false, 30, (DefaultConstructorMarker) null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItem$lambda$0(Function2 function2, Function0 function0, Modifier modifier, Function2 function22, Function2 function23, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        DropdownMenuItem(function2, function0, modifier, function22, function23, z, menuItemColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuPopupContent$lambda$7(Modifier modifier, MutableTransitionState mutableTransitionState, MutableState mutableState, Function3 function3, int i, Composer composer, int i2) {
        DropdownMenuPopupContent(modifier, mutableTransitionState, mutableState, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuPopup_ILWXrKs$lambda$4(boolean z, Function0 function0, Modifier modifier, long j, PopupProperties popupProperties, Function3 function3, int i, int i2, Composer composer, int i3) {
        m2486DropdownMenuPopupILWXrKs(z, function0, modifier, j, popupProperties, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenu_4kj__NE$lambda$0(boolean z, Function0 function0, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, Function3 function3, int i, int i2, Composer composer, int i3) {
        m2483DropdownMenu4kj_NE(z, function0, modifier, j, scrollState, popupProperties, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenu_ILWXrKs$lambda$0(boolean z, Function0 function0, Modifier modifier, long j, PopupProperties popupProperties, Function3 function3, int i, int i2, Composer composer, int i3) {
        m2484DropdownMenuILWXrKs(z, function0, modifier, j, popupProperties, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenu_IlH_yew$lambda$4(boolean z, Function0 function0, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, Shape shape, long j2, float f, float f2, BorderStroke borderStroke, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m2485DropdownMenuIlH_yew(z, function0, modifier, j, scrollState, popupProperties, shape, j2, f, f2, borderStroke, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018e  */
    /* renamed from: DropdownMenu-IlH_yew, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2485DropdownMenuIlH_yew(final boolean z, final Function0<Unit> function0, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, Shape shape, long j2, float f, float f2, BorderStroke borderStroke, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function0<Unit> function02;
        Modifier modifier2;
        int i5;
        int i6;
        ScrollState scrollState2;
        int i7;
        PopupProperties popupProperties2;
        Shape shape2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composer2;
        final long j3;
        final float f3;
        final ScrollState scrollState3;
        final PopupProperties popupProperties3;
        final Modifier modifier3;
        final Shape shape3;
        final long j4;
        final float f4;
        final BorderStroke borderStroke2;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        long j5;
        final BorderStroke borderStroke3;
        final Modifier modifier4;
        final ScrollState scrollState4;
        final Shape shape5;
        final long j6;
        final float f5;
        final float f6;
        boolean z2;
        int i16;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(1725609375);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenu)N(expanded,onDismissRequest,modifier,offset:c#ui.unit.DpOffset,scrollState,properties,shape,containerColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,border,content)66@2629L42:AndroidMenu.android.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i4 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i18 = i3 & 4;
        if (i18 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i6 = i4 | (startRestartGroup.changed(j) ? 2048 : 1024);
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        scrollState2 = scrollState;
                        if (startRestartGroup.changed(scrollState2)) {
                            i17 = 16384;
                            i6 |= i17;
                        }
                    } else {
                        scrollState2 = scrollState;
                    }
                    i17 = 8192;
                    i6 |= i17;
                } else {
                    scrollState2 = scrollState;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    popupProperties2 = popupProperties;
                } else {
                    popupProperties2 = popupProperties;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i6 |= startRestartGroup.changed(popupProperties2) ? 131072 : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    shape2 = shape;
                    i6 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape2)) ? 1048576 : 524288;
                } else {
                    shape2 = shape;
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0 && startRestartGroup.changed(j2)) {
                        i16 = 8388608;
                        i6 |= i16;
                    }
                    i16 = 4194304;
                    i6 |= i16;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i6 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i9 = i8;
                    i6 |= startRestartGroup.changed(f) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    i10 = i3 & 512;
                    if (i10 == 0) {
                        i6 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i11 = i10;
                        i6 |= startRestartGroup.changed(f2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i12 = i3 & 1024;
                        if (i12 != 0) {
                            i14 = i2 | 6;
                            i13 = i12;
                        } else if ((i2 & 6) == 0) {
                            i13 = i12;
                            i14 = i2 | (startRestartGroup.changed(borderStroke) ? 4 : 2);
                        } else {
                            i13 = i12;
                            i14 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i14 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
                        }
                        i15 = i14;
                        if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i15 & 19) != 18, i6 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "201@7875L21,204@7987L5,206@8035L14");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 16) != 0) {
                                    i6 &= -57345;
                                }
                                if ((i3 & 64) != 0) {
                                    i6 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    i6 &= -29360129;
                                }
                                j3 = j;
                                j6 = j2;
                                f5 = f;
                                f6 = f2;
                                borderStroke3 = borderStroke;
                                scrollState4 = scrollState2;
                                modifier4 = modifier2;
                                shape5 = shape2;
                            } else {
                                Modifier.Companion companion = i18 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i5 != 0) {
                                    float m9732constructorimpl = Dp.m9732constructorimpl(0);
                                    j3 = DpOffset.m9788constructorimpl((Float.floatToRawIntBits(Dp.m9732constructorimpl(r10)) & 4294967295L) | (Float.floatToRawIntBits(m9732constructorimpl) << 32));
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & 16) != 0) {
                                    scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                    i6 &= -57345;
                                }
                                if (i7 != 0) {
                                    popupProperties2 = DefaultMenuProperties;
                                }
                                if ((i3 & 64) != 0) {
                                    shape4 = MenuDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    i6 &= -3670017;
                                } else {
                                    shape4 = shape2;
                                }
                                if ((i3 & 128) != 0) {
                                    j5 = MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                    i6 = (-29360129) & i6;
                                } else {
                                    j5 = j2;
                                }
                                float m3525getTonalElevationD9Ej5fM = i9 != 0 ? MenuDefaults.INSTANCE.m3525getTonalElevationD9Ej5fM() : f;
                                float m3524getShadowElevationD9Ej5fM = i11 != 0 ? MenuDefaults.INSTANCE.m3524getShadowElevationD9Ej5fM() : f2;
                                if (i13 != 0) {
                                    modifier4 = companion;
                                    scrollState4 = scrollState2;
                                    shape5 = shape4;
                                    j6 = j5;
                                    f5 = m3525getTonalElevationD9Ej5fM;
                                    f6 = m3524getShadowElevationD9Ej5fM;
                                    borderStroke3 = null;
                                } else {
                                    borderStroke3 = borderStroke;
                                    modifier4 = companion;
                                    scrollState4 = scrollState2;
                                    shape5 = shape4;
                                    j6 = j5;
                                    f5 = m3525getTonalElevationD9Ej5fM;
                                    f6 = m3524getShadowElevationD9Ej5fM;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1725609375, i6, i15, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:65)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 453245385, "CC(remember):AndroidMenu.android.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                z2 = false;
                                rememberedValue = new MutableTransitionState(false);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            } else {
                                z2 = false;
                            }
                            final MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z));
                            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                                startRestartGroup.startReplaceGroup(1165888662);
                                ComposerKt.sourceInformation(startRestartGroup, "70@2816L51,71@2903L7,73@2959L313,85@3444L494,81@3282L656");
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 453251378, "CC(remember):AndroidMenu.android.kt#9igjgp");
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m7198boximpl(TransformOrigin.INSTANCE.m7211getCenterSzJe1aQ()), null, 2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                final MutableState mutableState = (MutableState) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Density density = (Density) consume;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 453256216, "CC(remember):AndroidMenu.android.kt#9igjgp");
                                if ((i6 & 7168) == 2048) {
                                    z2 = true;
                                }
                                boolean changed = z2 | startRestartGroup.changed(density);
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new DropdownMenuPositionProvider(j3, density, 0, 0, new Function2() { // from class: androidx.compose.material3.AndroidMenu_androidKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit DropdownMenu_IlH_yew$lambda$2$0;
                                            DropdownMenu_IlH_yew$lambda$2$0 = AndroidMenu_androidKt.DropdownMenu_IlH_yew$lambda$2$0(MutableState.this, (IntRect) obj, (IntRect) obj2);
                                            return DropdownMenu_IlH_yew$lambda$2$0;
                                        }
                                    }, 4, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) rememberedValue3, function02, popupProperties2, ComposableLambdaKt.rememberComposableLambda(-917492520, true, new Function2() { // from class: androidx.compose.material3.AndroidMenu_androidKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit DropdownMenu_IlH_yew$lambda$3;
                                        DropdownMenu_IlH_yew$lambda$3 = AndroidMenu_androidKt.DropdownMenu_IlH_yew$lambda$3(Modifier.this, mutableTransitionState, mutableState, scrollState4, shape5, j6, f5, f6, borderStroke3, function3, (Composer) obj, ((Integer) obj2).intValue());
                                        return DropdownMenu_IlH_yew$lambda$3;
                                    }
                                }, startRestartGroup, 54), startRestartGroup, (i6 & 112) | 3072 | ((i6 >> 9) & 896), 0);
                                composer2 = startRestartGroup;
                                composer2.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(1167008227);
                                startRestartGroup.endReplaceGroup();
                                composer2 = startRestartGroup;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            popupProperties3 = popupProperties2;
                            modifier3 = modifier4;
                            scrollState3 = scrollState4;
                            shape3 = shape5;
                            j4 = j6;
                            f4 = f5;
                            f3 = f6;
                            borderStroke2 = borderStroke3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            j3 = j;
                            f3 = f2;
                            scrollState3 = scrollState2;
                            popupProperties3 = popupProperties2;
                            modifier3 = modifier2;
                            shape3 = shape2;
                            j4 = j2;
                            f4 = f;
                            borderStroke2 = borderStroke;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AndroidMenu_androidKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DropdownMenu_IlH_yew$lambda$4;
                                    DropdownMenu_IlH_yew$lambda$4 = AndroidMenu_androidKt.DropdownMenu_IlH_yew$lambda$4(z, function0, modifier3, j3, scrollState3, popupProperties3, shape3, j4, f4, f3, borderStroke2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return DropdownMenu_IlH_yew$lambda$4;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i11 = i10;
                    i12 = i3 & 1024;
                    if (i12 != 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    i15 = i14;
                    if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i15 & 19) != 18, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i9 = i8;
                i10 = i3 & 512;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                i15 = i14;
                if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i15 & 19) != 18, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i4;
            if ((i & 24576) == 0) {
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i15 = i14;
            if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i15 & 19) != 18, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i4;
        if ((i & 24576) == 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i15 = i14;
        if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i15 & 19) != 18, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenu_IlH_yew$lambda$2$0(MutableState mutableState, IntRect intRect, IntRect intRect2) {
        mutableState.setValue(TransformOrigin.m7198boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenu_IlH_yew$lambda$3(Modifier modifier, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j, float f, float f2, BorderStroke borderStroke, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C86@3458L470:AndroidMenu.android.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-917492520, i, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:86)");
            }
            MenuKt.m3569DropdownMenuContentQj0Zi0g(modifier, mutableTransitionState, mutableState, scrollState, shape, j, f, f2, borderStroke, function3, composer, (MutableTransitionState.$stable << 3) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005d  */
    /* renamed from: DropdownMenuPopup-ILWXrKs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2486DropdownMenuPopupILWXrKs(final boolean z, final Function0<Unit> function0, Modifier modifier, long j, PopupProperties popupProperties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        long j2;
        int i5;
        char c;
        PopupProperties popupProperties2;
        final Modifier modifier3;
        final PopupProperties popupProperties3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        boolean z2;
        long j4;
        Composer startRestartGroup = composer.startRestartGroup(-1257982547);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuPopup)N(expanded,onDismissRequest,modifier,offset:c#ui.unit.DpOffset,properties,content)112@4246L51,113@4329L7,115@4377L235,120@4637L42:AndroidMenu.android.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
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
                j2 = j;
            } else {
                j2 = j;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                }
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
                popupProperties2 = popupProperties;
                c = ' ';
            } else {
                c = ' ';
                if ((i & 24576) == 0) {
                    popupProperties2 = popupProperties;
                    i3 |= startRestartGroup.changed(popupProperties2) ? 16384 : 8192;
                } else {
                    popupProperties2 = popupProperties;
                }
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
            }
            if (startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                popupProperties3 = popupProperties2;
                j3 = j2;
            } else {
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    float f = 0;
                    float m9732constructorimpl = Dp.m9732constructorimpl(f);
                    float m9732constructorimpl2 = Dp.m9732constructorimpl(f);
                    long floatToRawIntBits = Float.floatToRawIntBits(m9732constructorimpl);
                    z2 = false;
                    j4 = DpOffset.m9788constructorimpl((Float.floatToRawIntBits(m9732constructorimpl2) & 4294967295L) | (floatToRawIntBits << c));
                } else {
                    z2 = false;
                    j4 = j2;
                }
                PopupProperties popupProperties4 = i5 != 0 ? DefaultMenuProperties : popupProperties2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1257982547, i3, -1, "androidx.compose.material3.DropdownMenuPopup (AndroidMenu.android.kt:111)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2035409664, "CC(remember):AndroidMenu.android.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m7198boximpl(TransformOrigin.INSTANCE.m7211getCenterSzJe1aQ()), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final MutableState mutableState = (MutableState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density = (Density) consume;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2035405288, "CC(remember):AndroidMenu.android.kt#9igjgp");
                boolean changed = ((i3 & 7168) == 2048 ? true : z2) | startRestartGroup.changed(density);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new DropdownMenuPositionProvider(j4, density, 0, 0, new Function2() { // from class: androidx.compose.material3.AndroidMenu_androidKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit DropdownMenuPopup_ILWXrKs$lambda$1$0;
                            DropdownMenuPopup_ILWXrKs$lambda$1$0 = AndroidMenu_androidKt.DropdownMenuPopup_ILWXrKs$lambda$1$0(MutableState.this, (IntRect) obj, (IntRect) obj2);
                            return DropdownMenuPopup_ILWXrKs$lambda$1$0;
                        }
                    }, 12, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2035397161, "CC(remember):AndroidMenu.android.kt#9igjgp");
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new MutableTransitionState(Boolean.valueOf(z2));
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                final MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                    startRestartGroup.startReplaceGroup(1327357008);
                    ComposerKt.sourceInformation(startRestartGroup, "127@4958L243,123@4796L405");
                    AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider, function0, popupProperties4, ComposableLambdaKt.rememberComposableLambda(-333680730, true, new Function2() { // from class: androidx.compose.material3.AndroidMenu_androidKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit DropdownMenuPopup_ILWXrKs$lambda$3;
                            DropdownMenuPopup_ILWXrKs$lambda$3 = AndroidMenu_androidKt.DropdownMenuPopup_ILWXrKs$lambda$3(Modifier.this, mutableTransitionState, mutableState, function3, (Composer) obj, ((Integer) obj2).intValue());
                            return DropdownMenuPopup_ILWXrKs$lambda$3;
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | 3072 | ((i3 >> 6) & 896), 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1327761589);
                    startRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                popupProperties3 = popupProperties4;
                j3 = j4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AndroidMenu_androidKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DropdownMenuPopup_ILWXrKs$lambda$4;
                        DropdownMenuPopup_ILWXrKs$lambda$4 = AndroidMenu_androidKt.DropdownMenuPopup_ILWXrKs$lambda$4(z, function0, modifier3, j3, popupProperties3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return DropdownMenuPopup_ILWXrKs$lambda$4;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuPopup_ILWXrKs$lambda$1$0(MutableState mutableState, IntRect intRect, IntRect intRect2) {
        mutableState.setValue(TransformOrigin.m7198boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuPopup_ILWXrKs$lambda$3(Modifier modifier, MutableTransitionState mutableTransitionState, MutableState mutableState, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C128@4972L219:AndroidMenu.android.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-333680730, i, -1, "androidx.compose.material3.DropdownMenuPopup.<anonymous> (AndroidMenu.android.kt:128)");
            }
            DropdownMenuPopupContent(modifier, mutableTransitionState, mutableState, function3, composer, (MutableTransitionState.$stable << 3) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void DropdownMenuPopupContent(final Modifier modifier, final MutableTransitionState<Boolean> mutableTransitionState, final MutableState<TransformOrigin> mutableState, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32;
        String str;
        Object currentState;
        boolean z;
        boolean z2;
        String str2;
        Object currentState2;
        int i3;
        Object obj;
        int i4;
        Snapshot.Companion companion;
        Snapshot currentThreadSnapshot;
        Function1<Object, Unit> readObserver;
        Snapshot makeCurrentNonObservable;
        Composer startRestartGroup = composer.startRestartGroup(-1603362751);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuPopupContent)N(modifier,expandedState,transformOriginState,content)146@5528L47,148@5711L14,149@5789L14,151@5840L146,156@6024L146,160@6215L7,164@6315L587,162@6228L708:AndroidMenu.android.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(mutableTransitionState) : startRestartGroup.changedInstance(mutableTransitionState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1603362751, i2, -1, "androidx.compose.material3.DropdownMenuPopupContent (AndroidMenu.android.kt:144)");
            }
            final Transition updateTransition = TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, "DropDownMenu", startRestartGroup, MutableTransitionState.$stable | 48 | ((i2 >> 3) & 14), 0);
            final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
            final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            Function3 function33 = new Function3() { // from class: androidx.compose.material3.AndroidMenu_androidKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    FiniteAnimationSpec DropdownMenuPopupContent$lambda$0;
                    DropdownMenuPopupContent$lambda$0 = AndroidMenu_androidKt.DropdownMenuPopupContent$lambda$0(FiniteAnimationSpec.this, (Transition.Segment) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return DropdownMenuPopupContent$lambda$0;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844118987, "CC(animateFloat)N(transitionSpec,label,targetValueByState)1971@84243L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
            if (updateTransition.isSeeking()) {
                str = "1864@79141L67";
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
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    str = "1864@79141L67";
                    try {
                        Object currentState3 = updateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        startRestartGroup.updateRememberedValue(currentState3);
                        currentState = currentState3;
                    } finally {
                    }
                } else {
                    str = "1864@79141L67";
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            }
            boolean booleanValue = ((Boolean) currentState).booleanValue();
            startRestartGroup.startReplaceGroup(1568151973);
            ComposerKt.sourceInformation(startRestartGroup, "CN(expanded):AndroidMenu.android.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                z = booleanValue;
                ComposerKt.traceEventStart(1568151973, 0, -1, "androidx.compose.material3.DropdownMenuPopupContent.<anonymous> (AndroidMenu.android.kt:152)");
            } else {
                z = booleanValue;
            }
            float f = z ? 1.0f : 0.8f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf = Float.valueOf(f);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(updateTransition);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuPopupContent$$inlined$animateFloat$1
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean booleanValue2 = ((Boolean) ((State) rememberedValue).getValue()).booleanValue();
            startRestartGroup.startReplaceGroup(1568151973);
            ComposerKt.sourceInformation(startRestartGroup, "CN(expanded):AndroidMenu.android.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                z2 = booleanValue2;
                str2 = "CN(expanded):AndroidMenu.android.kt#uh7d8r";
                ComposerKt.traceEventStart(1568151973, 0, -1, "androidx.compose.material3.DropdownMenuPopupContent.<anonymous> (AndroidMenu.android.kt:152)");
            } else {
                z2 = booleanValue2;
                str2 = "CN(expanded):AndroidMenu.android.kt#uh7d8r";
            }
            float f2 = z2 ? 1.0f : 0.8f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf2 = Float.valueOf(f2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(updateTransition);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Boolean>>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuPopupContent$$inlined$animateFloat$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Transition.Segment<Boolean> invoke() {
                        return Transition.this.getSegment();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            String str3 = str2;
            String str4 = str;
            final State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, valueOf2, (FiniteAnimationSpec) function33.invoke(((State) rememberedValue2).getValue(), startRestartGroup, 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function3 function34 = new Function3() { // from class: androidx.compose.material3.AndroidMenu_androidKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    FiniteAnimationSpec DropdownMenuPopupContent$lambda$3;
                    DropdownMenuPopupContent$lambda$3 = AndroidMenu_androidKt.DropdownMenuPopupContent$lambda$3(FiniteAnimationSpec.this, (Transition.Segment) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return DropdownMenuPopupContent$lambda$3;
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
                ComposerKt.sourceInformation(startRestartGroup, str4);
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
            startRestartGroup.startReplaceGroup(286819089);
            ComposerKt.sourceInformation(startRestartGroup, str3);
            if (ComposerKt.isTraceInProgress()) {
                i3 = -1;
                ComposerKt.traceEventStart(286819089, 0, -1, "androidx.compose.material3.DropdownMenuPopupContent.<anonymous> (AndroidMenu.android.kt:157)");
            } else {
                i3 = -1;
            }
            float f3 = booleanValue3 ? 1.0f : 0.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf3 = Float.valueOf(f3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
            boolean changed5 = startRestartGroup.changed(updateTransition);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed5 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuPopupContent$$inlined$animateFloat$3
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean booleanValue4 = ((Boolean) ((State) rememberedValue3).getValue()).booleanValue();
            startRestartGroup.startReplaceGroup(286819089);
            ComposerKt.sourceInformation(startRestartGroup, str3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(286819089, 0, i3, "androidx.compose.material3.DropdownMenuPopupContent.<anonymous> (AndroidMenu.android.kt:157)");
            }
            float f4 = booleanValue4 ? 1.0f : 0.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf4 = Float.valueOf(f4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
            boolean changed6 = startRestartGroup.changed(updateTransition);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed6 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<Boolean>>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuPopupContent$$inlined$animateFloat$4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Transition.Segment<Boolean> invoke() {
                        return Transition.this.getSegment();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, valueOf4, (FiniteAnimationSpec) function34.invoke(((State) rememberedValue4).getValue(), startRestartGroup, 0), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localInspectionMode);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final boolean booleanValue5 = ((Boolean) consume).booleanValue();
            Modifier width = IntrinsicKt.width(modifier, IntrinsicSize.Max);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1061690796, "CC(remember):AndroidMenu.android.kt#9igjgp");
            boolean changed7 = startRestartGroup.changed(booleanValue5) | startRestartGroup.changed(createTransitionAnimation) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && startRestartGroup.changedInstance(mutableTransitionState))) | startRestartGroup.changed(createTransitionAnimation2) | ((i2 & 896) == 256);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed7 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                i4 = i2;
                obj = new Function1() { // from class: androidx.compose.material3.AndroidMenu_androidKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit DropdownMenuPopupContent$lambda$6$0;
                        DropdownMenuPopupContent$lambda$6$0 = AndroidMenu_androidKt.DropdownMenuPopupContent$lambda$6$0(booleanValue5, mutableTransitionState, mutableState, createTransitionAnimation, createTransitionAnimation2, (GraphicsLayerScope) obj2);
                        return DropdownMenuPopupContent$lambda$6$0;
                    }
                };
                startRestartGroup.updateRememberedValue(obj);
            } else {
                obj = rememberedValue5;
                i4 = i2;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(width, (Function1) obj);
            int i5 = i4 & 7168;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, graphicsLayer);
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
            Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            function32 = function3;
            function32.invoke(ColumnScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i5 >> 6) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function32 = function3;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AndroidMenu_androidKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit DropdownMenuPopupContent$lambda$7;
                    DropdownMenuPopupContent$lambda$7 = AndroidMenu_androidKt.DropdownMenuPopupContent$lambda$7(Modifier.this, mutableTransitionState, mutableState, function32, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return DropdownMenuPopupContent$lambda$7;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec DropdownMenuPopupContent$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(-1891222038);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1891222038, i, -1, "androidx.compose.material3.DropdownMenuPopupContent.<anonymous> (AndroidMenu.android.kt:151)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec DropdownMenuPopupContent$lambda$3(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(1122412374);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1122412374, i, -1, "androidx.compose.material3.DropdownMenuPopupContent.<anonymous> (AndroidMenu.android.kt:156)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuPopupContent$lambda$6$0(boolean z, MutableTransitionState mutableTransitionState, MutableState mutableState, State state, State state2, GraphicsLayerScope graphicsLayerScope) {
        float f;
        float f2 = 0.8f;
        float f3 = 1.0f;
        if (!z) {
            f = DropdownMenuPopupContent$lambda$2(state);
        } else {
            f = ((Boolean) mutableTransitionState.getTargetState()).booleanValue() ? 1.0f : 0.8f;
        }
        graphicsLayerScope.setScaleX(f);
        if (!z) {
            f2 = DropdownMenuPopupContent$lambda$2(state);
        } else if (((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
            f2 = 1.0f;
        }
        graphicsLayerScope.setScaleY(f2);
        if (!z) {
            f3 = DropdownMenuPopupContent$lambda$5(state2);
        } else if (!((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
            f3 = 0.0f;
        }
        graphicsLayerScope.setAlpha(f3);
        graphicsLayerScope.mo6968setTransformOrigin__ExYCQ(((TransformOrigin) mutableState.getValue()).getPackedValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0057  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with parameters for shape, color, elevation, and border.", replaceWith = @ReplaceWith(expression = "DropdownMenu(\n    expanded = expanded,\n    onDismissRequest = onDismissRequest,\n    modifier = modifier,\n    offset = offset,\n    scrollState = scrollState,\n    properties = properties,\n    shape = MenuDefaults.shape,\n    containerColor = MenuDefaults.containerColor,\n    tonalElevation = MenuDefaults.TonalElevation,\n    shadowElevation = MenuDefaults.ShadowElevation,\n    border = null,\n    content = content,\n)", imports = {}))
    /* renamed from: DropdownMenu-4kj-_NE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2483DropdownMenu4kj_NE(final boolean z, final Function0 function0, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, final Function3 function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j2;
        ScrollState scrollState2;
        int i5;
        PopupProperties popupProperties2;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final long j3;
        final ScrollState scrollState3;
        final PopupProperties popupProperties3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Modifier modifier4;
        int i8;
        ScrollState scrollState4;
        PopupProperties popupProperties4;
        int i9;
        Modifier modifier5;
        long j4;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1518067413);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenu)N(expanded,onDismissRequest,modifier,offset:c#ui.unit.DpOffset,scrollState,properties,content)222@8606L5,223@8651L14,215@8367L465:AndroidMenu.android.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                j2 = j;
                i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        scrollState2 = scrollState;
                        if (startRestartGroup.changed(scrollState2)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        scrollState2 = scrollState;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    scrollState2 = scrollState;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    popupProperties2 = popupProperties;
                    i3 |= startRestartGroup.changed(popupProperties2) ? 131072 : 65536;
                    if ((1572864 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                    }
                    i6 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i6 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "211@8218L21");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                float f = 0;
                                float m9732constructorimpl = Dp.m9732constructorimpl(f);
                                float m9732constructorimpl2 = Dp.m9732constructorimpl(f);
                                long floatToRawIntBits = Float.floatToRawIntBits(m9732constructorimpl);
                                i7 = -57345;
                                modifier4 = modifier2;
                                j2 = DpOffset.m9788constructorimpl((Float.floatToRawIntBits(m9732constructorimpl2) & 4294967295L) | (floatToRawIntBits << 32));
                            } else {
                                i7 = -57345;
                                modifier4 = modifier2;
                            }
                            if ((i2 & 16) != 0) {
                                i8 = i6 & i7;
                                scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                            } else {
                                i8 = i6;
                            }
                            if (i5 != 0) {
                                j4 = j2;
                                scrollState4 = scrollState2;
                                popupProperties4 = new PopupProperties(true, false, false, false, false, 30, (DefaultConstructorMarker) null);
                                i9 = 1518067413;
                                modifier5 = modifier4;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i9, i8, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:215)");
                                }
                                composer2 = startRestartGroup;
                                m2485DropdownMenuIlH_yew(z, function0, modifier5, j4, scrollState4, popupProperties4, MenuDefaults.INSTANCE.getShape(startRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6), MenuDefaults.INSTANCE.m3525getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m3524getShadowElevationD9Ej5fM(), null, function3, composer2, (i8 & 14) | 905969664 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8), ((i8 >> 15) & 112) | 6, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier5;
                                j3 = j4;
                                scrollState3 = scrollState4;
                                popupProperties3 = popupProperties4;
                            } else {
                                scrollState4 = scrollState2;
                                popupProperties4 = popupProperties2;
                                i9 = 1518067413;
                                modifier5 = modifier4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i8 = i6 & (-57345);
                                scrollState4 = scrollState2;
                                popupProperties4 = popupProperties2;
                            } else {
                                scrollState4 = scrollState2;
                                popupProperties4 = popupProperties2;
                                i8 = i6;
                            }
                            i9 = 1518067413;
                            modifier5 = modifier2;
                        }
                        j4 = j2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        m2485DropdownMenuIlH_yew(z, function0, modifier5, j4, scrollState4, popupProperties4, MenuDefaults.INSTANCE.getShape(startRestartGroup, 6), MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6), MenuDefaults.INSTANCE.m3525getTonalElevationD9Ej5fM(), MenuDefaults.INSTANCE.m3524getShadowElevationD9Ej5fM(), null, function3, composer2, (i8 & 14) | 905969664 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8), ((i8 >> 15) & 112) | 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier5;
                        j3 = j4;
                        scrollState3 = scrollState4;
                        popupProperties3 = popupProperties4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        j3 = j2;
                        scrollState3 = scrollState2;
                        popupProperties3 = popupProperties2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AndroidMenu_androidKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit DropdownMenu_4kj__NE$lambda$0;
                                DropdownMenu_4kj__NE$lambda$0 = AndroidMenu_androidKt.DropdownMenu_4kj__NE$lambda$0(z, function0, modifier3, j3, scrollState3, popupProperties3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return DropdownMenu_4kj__NE$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                popupProperties2 = popupProperties;
                if ((1572864 & i) == 0) {
                }
                i6 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            j2 = j;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            popupProperties2 = popupProperties;
            if ((1572864 & i) == 0) {
            }
            i6 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        j2 = j;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        popupProperties2 = popupProperties;
        if ((1572864 & i) == 0) {
        }
        i6 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0059  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by a DropdownMenu function with a ScrollState parameter", replaceWith = @ReplaceWith(expression = "DropdownMenu(expanded,onDismissRequest, modifier, offset, rememberScrollState(), properties, content)", imports = {"androidx.compose.foundation.rememberScrollState"}))
    /* renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2484DropdownMenuILWXrKs(final boolean z, final Function0 function0, Modifier modifier, long j, PopupProperties popupProperties, final Function3 function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Function3 function32;
        Composer composer2;
        final PopupProperties popupProperties2;
        final Modifier modifier3;
        final long j2;
        ScopeUpdateScope endRestartGroup;
        Composer composer3;
        long j3;
        Composer startRestartGroup = composer.startRestartGroup(1744198621);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenu)N(expanded,onDismissRequest,modifier,offset:c#ui.unit.DpOffset,properties,content)256@9743L21,251@9579L252:AndroidMenu.android.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
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
                i3 |= startRestartGroup.changed(j) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(popupProperties) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                } else {
                    function32 = function3;
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    popupProperties2 = popupProperties;
                    modifier3 = modifier2;
                    j2 = j;
                } else {
                    Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        float m9732constructorimpl = Dp.m9732constructorimpl(0);
                        composer3 = startRestartGroup;
                        j3 = DpOffset.m9788constructorimpl((Float.floatToRawIntBits(Dp.m9732constructorimpl(r3)) & 4294967295L) | (Float.floatToRawIntBits(m9732constructorimpl) << 32));
                    } else {
                        composer3 = startRestartGroup;
                        j3 = j;
                    }
                    PopupProperties popupProperties3 = i5 != 0 ? new PopupProperties(true, false, false, false, false, 30, (DefaultConstructorMarker) null) : popupProperties;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1744198621, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:251)");
                    }
                    Composer composer4 = composer3;
                    composer2 = composer4;
                    m2485DropdownMenuIlH_yew(z, function0, modifier4, j3, ScrollKt.rememberScrollState(0, composer4, 0, 1), popupProperties3, null, 0L, 0.0f, 0.0f, null, function32, composer2, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    j2 = j3;
                    popupProperties2 = popupProperties3;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AndroidMenu_androidKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit DropdownMenu_ILWXrKs$lambda$0;
                            DropdownMenu_ILWXrKs$lambda$0 = AndroidMenu_androidKt.DropdownMenu_ILWXrKs$lambda$0(z, function0, modifier3, j2, popupProperties2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return DropdownMenu_ILWXrKs$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            if ((196608 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItem(final Function2<? super Composer, ? super Integer, Unit> function2, final Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i6;
        boolean z2;
        MenuItemColors menuItemColors2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final boolean z3;
        final MenuItemColors menuItemColors3;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        int i12;
        MutableInteractionSource mutableInteractionSource3;
        PaddingValues paddingValues3;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-532959117);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItem)N(text,onClick,modifier,leadingIcon,trailingIcon,enabled,colors,contentPadding,interactionSource)273@10189L319:AndroidMenu.android.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function24 = function22;
                i3 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function25 = function23;
                    i3 |= startRestartGroup.changedInstance(function25) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                menuItemColors2 = menuItemColors;
                                if (startRestartGroup.changed(menuItemColors2)) {
                                    i13 = 1048576;
                                    i3 |= i13;
                                }
                            } else {
                                menuItemColors2 = menuItemColors;
                            }
                            i13 = 524288;
                            i3 |= i13;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                            i9 = i2 & 256;
                            if (i9 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i10 = i9;
                                i3 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                                i11 = i3;
                                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "287@14808L12");
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i14 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            function24 = null;
                                        }
                                        if (i5 != 0) {
                                            function25 = null;
                                        }
                                        if (i6 != 0) {
                                            z2 = true;
                                        }
                                        if ((i2 & 64) != 0) {
                                            i12 = i11 & (-3670017);
                                            menuItemColors2 = MenuDefaults.INSTANCE.itemColors(startRestartGroup, 6);
                                        } else {
                                            i12 = i11;
                                        }
                                        PaddingValues dropdownMenuItemContentPadding = i8 != 0 ? MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding() : paddingValues;
                                        mutableInteractionSource3 = i10 != 0 ? null : mutableInteractionSource;
                                        paddingValues3 = dropdownMenuItemContentPadding;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i2 & 64) != 0) {
                                            i12 = i11 & (-3670017);
                                            paddingValues3 = paddingValues;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                        } else {
                                            paddingValues3 = paddingValues;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            i12 = i11;
                                        }
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function28 = function25;
                                    boolean z4 = z2;
                                    MenuItemColors menuItemColors4 = menuItemColors2;
                                    Modifier modifier4 = modifier2;
                                    Function2<? super Composer, ? super Integer, Unit> function29 = function24;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-532959117, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:272)");
                                    }
                                    composer2 = startRestartGroup;
                                    MenuKt.DropdownMenuItemContent(function2, function0, modifier4, function29, function28, z4, menuItemColors4, paddingValues3, mutableInteractionSource3, composer2, i12 & 268435454);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    function26 = function29;
                                    function27 = function28;
                                    z3 = z4;
                                    menuItemColors3 = menuItemColors4;
                                    paddingValues2 = paddingValues3;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    function26 = function24;
                                    function27 = function25;
                                    z3 = z2;
                                    menuItemColors3 = menuItemColors2;
                                    paddingValues2 = paddingValues;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.AndroidMenu_androidKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit DropdownMenuItem$lambda$0;
                                            DropdownMenuItem$lambda$0 = AndroidMenu_androidKt.DropdownMenuItem$lambda$0(Function2.this, function0, modifier3, function26, function27, z3, menuItemColors3, paddingValues2, mutableInteractionSource2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            return DropdownMenuItem$lambda$0;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i10 = i9;
                            i11 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i8 = i7;
                        i9 = i2 & 256;
                        if (i9 == 0) {
                        }
                        i10 = i9;
                        i11 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    z2 = z;
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i2 & 256;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    i11 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function25 = function23;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                z2 = z;
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function24 = function22;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function25 = function23;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z2 = z;
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function24 = function22;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function25 = function23;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z2 = z;
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final PopupProperties getDefaultMenuProperties() {
        return DefaultMenuProperties;
    }

    private static final float DropdownMenuPopupContent$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float DropdownMenuPopupContent$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }
}
