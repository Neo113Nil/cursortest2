package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.internal.AnimatedShapeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ToggleButton.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u009d\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u009d\u0001\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u009d\u0001\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u009d\u0001\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a3\u0010%\u001a\u00020&2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0003¢\u0006\u0002\u0010+\"\u001e\u0010\u001d\u001a\u00020\u0003*\u00020\n8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u001e\u0010\"\u001a\u00020\u0003*\u00020\n8@X\u0080\u0004¢\u0006\f\u0012\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!¨\u0006,²\u0006\n\u0010'\u001a\u00020\u0003X\u008a\u0084\u0002"}, d2 = {"ToggleButton", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "shapes", "Landroidx/compose/material3/ToggleButtonShapes;", "colors", "Landroidx/compose/material3/ToggleButtonColors;", "elevation", "Landroidx/compose/material3/ButtonElevation;", "border", "Landroidx/compose/foundation/BorderStroke;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/ToggleButtonShapes;Landroidx/compose/material3/ToggleButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ElevatedToggleButton", "TonalToggleButton", "OutlinedToggleButton", "hasRoundedCornerShapes", "getHasRoundedCornerShapes$annotations", "(Landroidx/compose/material3/ToggleButtonShapes;)V", "getHasRoundedCornerShapes", "(Landroidx/compose/material3/ToggleButtonShapes;)Z", "hasCornerBasedShapes", "getHasCornerBasedShapes$annotations", "getHasCornerBasedShapes", "shapeByInteraction", "Landroidx/compose/ui/graphics/Shape;", "pressed", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "(Landroidx/compose/material3/ToggleButtonShapes;ZZLandroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ToggleButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElevatedToggleButton$lambda$0(boolean z, Function1 function1, Modifier modifier, boolean z2, ToggleButtonShapes toggleButtonShapes, ToggleButtonColors toggleButtonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        ElevatedToggleButton(z, function1, modifier, z2, toggleButtonShapes, toggleButtonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedToggleButton$lambda$0(boolean z, Function1 function1, Modifier modifier, boolean z2, ToggleButtonShapes toggleButtonShapes, ToggleButtonColors toggleButtonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        OutlinedToggleButton(z, function1, modifier, z2, toggleButtonShapes, toggleButtonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleButton$lambda$4(boolean z, Function1 function1, Modifier modifier, boolean z2, ToggleButtonShapes toggleButtonShapes, ToggleButtonColors toggleButtonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        ToggleButton(z, function1, modifier, z2, toggleButtonShapes, toggleButtonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TonalToggleButton$lambda$0(boolean z, Function1 function1, Modifier modifier, boolean z2, ToggleButtonShapes toggleButtonShapes, ToggleButtonColors toggleButtonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        TonalToggleButton(z, function1, modifier, z2, toggleButtonShapes, toggleButtonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getHasCornerBasedShapes$annotations(ToggleButtonShapes toggleButtonShapes) {
    }

    public static /* synthetic */ void getHasRoundedCornerShapes$annotations(ToggleButtonShapes toggleButtonShapes) {
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, ToggleButtonShapes toggleButtonShapes, ToggleButtonColors toggleButtonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        ToggleButtonShapes toggleButtonShapes2;
        ToggleButtonColors toggleButtonColors2;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        int i9;
        int i10;
        final ButtonElevation buttonElevation2;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z4;
        final ToggleButtonShapes toggleButtonShapes3;
        final ToggleButtonColors toggleButtonColors3;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        ToggleButtonShapes toggleButtonShapes4;
        int i11;
        Modifier modifier4;
        int i12;
        ButtonElevation buttonElevation3;
        PaddingValues paddingValues3;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke4;
        final PaddingValues paddingValues4;
        ToggleButtonColors toggleButtonColors4;
        int i13;
        boolean z5;
        ButtonElevation buttonElevation4;
        Modifier modifier5;
        MutableInteractionSource mutableInteractionSource4;
        State<Dp> shadowElevation$material3;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(579209066);
        ComposerKt.sourceInformation(startRestartGroup, "C(ToggleButton)N(checked,onCheckedChange,modifier,enabled,shapes,colors,elevation,border,contentPadding,interactionSource,content)128@6943L14,129@6995L25,133@7265L66,138@7454L24,146@7726L489,135@7337L878:ToggleButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        toggleButtonShapes2 = toggleButtonShapes;
                        if (startRestartGroup.changed(toggleButtonShapes2)) {
                            i16 = 16384;
                            i4 |= i16;
                        }
                    } else {
                        toggleButtonShapes2 = toggleButtonShapes;
                    }
                    i16 = 8192;
                    i4 |= i16;
                } else {
                    toggleButtonShapes2 = toggleButtonShapes;
                }
                if ((196608 & i) == 0) {
                    if ((i3 & 32) == 0) {
                        toggleButtonColors2 = toggleButtonColors;
                        if (startRestartGroup.changed(toggleButtonColors2)) {
                            i15 = 131072;
                            i4 |= i15;
                        }
                    } else {
                        toggleButtonColors2 = toggleButtonColors;
                    }
                    i15 = 65536;
                    i4 |= i15;
                } else {
                    toggleButtonColors2 = toggleButtonColors;
                }
                if ((i & 1572864) == 0) {
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(buttonElevation)) ? 1048576 : 524288;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                    borderStroke2 = borderStroke;
                } else {
                    borderStroke2 = borderStroke;
                    if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(borderStroke2) ? 8388608 : 4194304;
                    }
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0 && startRestartGroup.changed(paddingValues)) {
                        i14 = 67108864;
                        i4 |= i14;
                    }
                    i14 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i14;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changedInstance(function3) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    i10 = i9;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "117@6267L35,118@6358L20,119@6429L17");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            mutableInteractionSource3 = mutableInteractionSource;
                            i11 = i10;
                            i13 = i4;
                            i12 = 6;
                            borderStroke4 = borderStroke2;
                            modifier5 = modifier2;
                            z5 = z3;
                            toggleButtonShapes4 = toggleButtonShapes2;
                            toggleButtonColors4 = toggleButtonColors2;
                            buttonElevation4 = buttonElevation;
                            paddingValues4 = paddingValues;
                        } else {
                            Modifier.Companion companion = i17 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i5 != 0 ? true : z3;
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                toggleButtonShapes4 = ToggleButtonDefaults.INSTANCE.m4406shapesFor8Feqmps(ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM(), startRestartGroup, 54);
                            } else {
                                toggleButtonShapes4 = toggleButtonShapes2;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                                toggleButtonColors2 = ToggleButtonDefaults.INSTANCE.toggleButtonColors(startRestartGroup, 6);
                            }
                            int i18 = i4;
                            if ((i3 & 64) != 0) {
                                i11 = i10;
                                modifier4 = companion;
                                i12 = 6;
                                buttonElevation3 = ButtonDefaults.INSTANCE.m2590buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                i18 &= -3670017;
                            } else {
                                i11 = i10;
                                modifier4 = companion;
                                i12 = 6;
                                buttonElevation3 = buttonElevation;
                            }
                            BorderStroke borderStroke5 = i6 != 0 ? null : borderStroke;
                            if ((i3 & 256) != 0) {
                                paddingValues3 = ButtonDefaults.m2575contentPaddingFor8Feqmps$default(ButtonDefaults.INSTANCE, ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM(), false, false, 6, null);
                                i18 &= -234881025;
                            } else {
                                paddingValues3 = paddingValues;
                            }
                            if (i8 != 0) {
                                borderStroke4 = borderStroke5;
                                paddingValues4 = paddingValues3;
                                toggleButtonColors4 = toggleButtonColors2;
                                i13 = i18;
                                z5 = z6;
                                mutableInteractionSource3 = null;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                borderStroke4 = borderStroke5;
                                paddingValues4 = paddingValues3;
                                toggleButtonColors4 = toggleButtonColors2;
                                i13 = i18;
                                z5 = z6;
                            }
                            buttonElevation4 = buttonElevation3;
                            modifier5 = modifier4;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(579209066, i13, i11, "androidx.compose.material3.ToggleButton (ToggleButton.kt:124)");
                        }
                        if (mutableInteractionSource3 == null) {
                            startRestartGroup.startReplaceGroup(-1960617487);
                            ComposerKt.sourceInformation(startRestartGroup, "126@6766L39");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1725813711, "CC(remember):ToggleButton.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1725814362);
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, i12);
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                        State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource5, startRestartGroup, 0);
                        long m4392containerColorWaAFU9c$material3 = toggleButtonColors4.m4392containerColorWaAFU9c$material3(z5, z);
                        final long m4393contentColorWaAFU9c$material3 = toggleButtonColors4.m4393contentColorWaAFU9c$material3(z5, z);
                        if (buttonElevation4 == null) {
                            startRestartGroup.startReplaceGroup(-1960202708);
                            startRestartGroup.endReplaceGroup();
                            shadowElevation$material3 = null;
                        } else {
                            startRestartGroup.startReplaceGroup(-1725800331);
                            ComposerKt.sourceInformation(startRestartGroup, "132@7184L43");
                            shadowElevation$material3 = buttonElevation4.shadowElevation$material3(z5, mutableInteractionSource5, startRestartGroup, ((i13 >> 9) & 14) | ((i13 >> 12) & 896));
                            startRestartGroup.endReplaceGroup();
                        }
                        float m9746unboximpl = shadowElevation$material3 != null ? shadowElevation$material3.getValue().m9746unboximpl() : Dp.m9732constructorimpl(0);
                        int i19 = i13 << 6;
                        Shape shapeByInteraction = shapeByInteraction(toggleButtonShapes4, ToggleButton$lambda$1(collectIsPressedAsState), z, value, startRestartGroup, ((i13 >> 12) & 14) | (i19 & 896));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1725791710, "CC(remember):ToggleButton.kt#9igjgp");
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: androidx.compose.material3.ToggleButtonKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit ToggleButton$lambda$2$0;
                                    ToggleButton$lambda$2$0 = ToggleButtonKt.ToggleButton$lambda$2$0((SemanticsPropertyReceiver) obj);
                                    return ToggleButton$lambda$2$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        PaddingValues paddingValues5 = paddingValues4;
                        ToggleButtonColors toggleButtonColors5 = toggleButtonColors4;
                        ButtonElevation buttonElevation5 = buttonElevation4;
                        BorderStroke borderStroke6 = borderStroke4;
                        Modifier modifier6 = modifier5;
                        SurfaceKt.m4114Surfaced85dljk(z, function1, SemanticsModifierKt.semantics$default(modifier5, false, (Function1) rememberedValue2, 1, null), z5, shapeByInteraction, m4392containerColorWaAFU9c$material3, m4393contentColorWaAFU9c$material3, 0.0f, m9746unboximpl, borderStroke6, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(-1671845632, true, new Function2() { // from class: androidx.compose.material3.ToggleButtonKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ToggleButton$lambda$3;
                                ToggleButton$lambda$3 = ToggleButtonKt.ToggleButton$lambda$3(m4393contentColorWaAFU9c$material3, paddingValues4, function3, (Composer) obj, ((Integer) obj2).intValue());
                                return ToggleButton$lambda$3;
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i13 & 7294) | (i19 & 1879048192), 48, 128);
                        startRestartGroup = startRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z5;
                        borderStroke3 = borderStroke6;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        toggleButtonColors3 = toggleButtonColors5;
                        buttonElevation2 = buttonElevation5;
                        modifier3 = modifier6;
                        paddingValues2 = paddingValues5;
                        toggleButtonShapes3 = toggleButtonShapes4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        buttonElevation2 = buttonElevation;
                        borderStroke3 = borderStroke;
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        z4 = z3;
                        toggleButtonShapes3 = toggleButtonShapes2;
                        toggleButtonColors3 = toggleButtonColors2;
                        paddingValues2 = paddingValues;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ToggleButtonKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ToggleButton$lambda$4;
                                ToggleButton$lambda$4 = ToggleButtonKt.ToggleButton$lambda$4(z, function1, modifier3, z4, toggleButtonShapes3, toggleButtonColors3, buttonElevation2, borderStroke3, paddingValues2, mutableInteractionSource2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return ToggleButton$lambda$4;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                if ((i2 & 6) != 0) {
                }
                i10 = i9;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i2 & 6) != 0) {
            }
            i10 = i9;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i2 & 6) != 0) {
        }
        i10 = i9;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleButton$lambda$2$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m8900setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m8883getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleButton$lambda$3(long j, final PaddingValues paddingValues, final Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C149@7845L10,150@7878L331,147@7736L473:ToggleButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1671845632, i, -1, "androidx.compose.material3.ToggleButton.<anonymous> (ToggleButton.kt:147)");
            }
            ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j, MaterialTheme.INSTANCE.getTypography(composer, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(1921972184, true, new Function2() { // from class: androidx.compose.material3.ToggleButtonKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ToggleButton$lambda$3$0;
                    ToggleButton$lambda$3$0 = ToggleButtonKt.ToggleButton$lambda$3$0(PaddingValues.this, function3, (Composer) obj, ((Integer) obj2).intValue());
                    return ToggleButton$lambda$3$0;
                }
            }, composer, 54), composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleButton$lambda$3$0(PaddingValues paddingValues, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C151@7892L307:ToggleButton.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1921972184, i, -1, "androidx.compose.material3.ToggleButton.<anonymous>.<anonymous> (ToggleButton.kt:151)");
            }
            Modifier padding = PaddingKt.padding(SizeKt.m1256defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ToggleButtonDefaults.INSTANCE.m4404getMinHeightD9Ej5fM(), 1, null), paddingValues);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
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
            Updater.m5872setimpl(m5864constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            function3.invoke(RowScopeInstance.INSTANCE, composer, 6);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, ToggleButtonShapes toggleButtonShapes, ToggleButtonColors toggleButtonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        ToggleButtonShapes toggleButtonShapes2;
        ToggleButtonColors toggleButtonColors2;
        ButtonElevation buttonElevation2;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        int i9;
        int i10;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        Composer composer2;
        final boolean z4;
        final ToggleButtonShapes toggleButtonShapes3;
        final ToggleButtonColors toggleButtonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        int i11;
        ToggleButtonShapes toggleButtonShapes4;
        int i12;
        ButtonElevation buttonElevation4;
        PaddingValues paddingValues3;
        int i13;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        ButtonElevation buttonElevation5;
        PaddingValues paddingValues4;
        int i14;
        ToggleButtonColors toggleButtonColors4;
        boolean z5;
        ToggleButtonShapes toggleButtonShapes5;
        BorderStroke borderStroke4;
        int i15;
        int i16;
        int i17;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(177028532);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedToggleButton)N(checked,onCheckedChange,modifier,enabled,shapes,colors,elevation,border,contentPadding,interactionSource,content)218@11533L366:ToggleButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        toggleButtonShapes2 = toggleButtonShapes;
                        if (startRestartGroup.changed(toggleButtonShapes2)) {
                            i18 = 16384;
                            i4 |= i18;
                        }
                    } else {
                        toggleButtonShapes2 = toggleButtonShapes;
                    }
                    i18 = 8192;
                    i4 |= i18;
                } else {
                    toggleButtonShapes2 = toggleButtonShapes;
                }
                if ((196608 & i) == 0) {
                    if ((i3 & 32) == 0) {
                        toggleButtonColors2 = toggleButtonColors;
                        if (startRestartGroup.changed(toggleButtonColors2)) {
                            i17 = 131072;
                            i4 |= i17;
                        }
                    } else {
                        toggleButtonColors2 = toggleButtonColors;
                    }
                    i17 = 65536;
                    i4 |= i17;
                } else {
                    toggleButtonColors2 = toggleButtonColors;
                }
                if ((1572864 & i) == 0) {
                    if ((i3 & 64) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i16 = 1048576;
                            i4 |= i16;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i16 = 524288;
                    i4 |= i16;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                    borderStroke2 = borderStroke;
                } else {
                    borderStroke2 = borderStroke;
                    if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(borderStroke2) ? 8388608 : 4194304;
                    }
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0 && startRestartGroup.changed(paddingValues)) {
                        i15 = 67108864;
                        i4 |= i15;
                    }
                    i15 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i15;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changedInstance(function3) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    i10 = i4;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "210@11095L35,211@11186L28,212@11265L25");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            i14 = (i3 & 16) != 0 ? i10 & (-57345) : i10;
                            if ((i3 & 32) != 0) {
                                i14 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i14 &= -3670017;
                            }
                            if ((i3 & 256) != 0) {
                                i14 &= -234881025;
                            }
                            paddingValues4 = paddingValues;
                            mutableInteractionSource3 = mutableInteractionSource;
                            i12 = i9;
                            borderStroke4 = borderStroke2;
                            modifier4 = modifier2;
                            z5 = z3;
                            toggleButtonShapes5 = toggleButtonShapes2;
                            toggleButtonColors4 = toggleButtonColors2;
                            buttonElevation5 = buttonElevation2;
                        } else {
                            Modifier.Companion companion = i19 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i5 == 0 ? z3 : true;
                            if ((i3 & 16) != 0) {
                                i11 = i10 & (-57345);
                                toggleButtonShapes4 = ToggleButtonDefaults.INSTANCE.m4406shapesFor8Feqmps(ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM(), startRestartGroup, 54);
                            } else {
                                i11 = i10;
                                toggleButtonShapes4 = toggleButtonShapes2;
                            }
                            if ((i3 & 32) != 0) {
                                i11 &= -458753;
                                toggleButtonColors2 = ToggleButtonDefaults.INSTANCE.elevatedToggleButtonColors(startRestartGroup, 6);
                            }
                            int i20 = i11;
                            if ((i3 & 64) != 0) {
                                buttonElevation4 = ButtonDefaults.INSTANCE.m2594elevatedButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                i20 &= -3670017;
                                i12 = i9;
                            } else {
                                i12 = i9;
                                buttonElevation4 = buttonElevation2;
                            }
                            BorderStroke borderStroke5 = i6 != 0 ? null : borderStroke;
                            if ((i3 & 256) != 0) {
                                paddingValues3 = ButtonDefaults.m2575contentPaddingFor8Feqmps$default(ButtonDefaults.INSTANCE, ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM(), false, false, 6, null);
                                i13 = i20 & (-234881025);
                            } else {
                                paddingValues3 = paddingValues;
                                i13 = i20;
                            }
                            if (i8 != 0) {
                                modifier4 = companion;
                                buttonElevation5 = buttonElevation4;
                                mutableInteractionSource3 = null;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                modifier4 = companion;
                                buttonElevation5 = buttonElevation4;
                            }
                            paddingValues4 = paddingValues3;
                            i14 = i13;
                            toggleButtonColors4 = toggleButtonColors2;
                            z5 = z6;
                            toggleButtonShapes5 = toggleButtonShapes4;
                            borderStroke4 = borderStroke5;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(177028532, i14, i12, "androidx.compose.material3.ElevatedToggleButton (ToggleButton.kt:218)");
                        }
                        ToggleButton(z, function1, modifier4, z5, toggleButtonShapes5, toggleButtonColors4, buttonElevation5, borderStroke4, paddingValues4, mutableInteractionSource3, function3, startRestartGroup, i14 & 2147483646, i12 & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = startRestartGroup;
                        modifier3 = modifier4;
                        z4 = z5;
                        toggleButtonShapes3 = toggleButtonShapes5;
                        toggleButtonColors3 = toggleButtonColors4;
                        buttonElevation3 = buttonElevation5;
                        borderStroke3 = borderStroke4;
                        paddingValues2 = paddingValues4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        composer2 = startRestartGroup;
                        z4 = z3;
                        toggleButtonShapes3 = toggleButtonShapes2;
                        toggleButtonColors3 = toggleButtonColors2;
                        buttonElevation3 = buttonElevation2;
                        borderStroke3 = borderStroke;
                        paddingValues2 = paddingValues;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ToggleButtonKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ElevatedToggleButton$lambda$0;
                                ElevatedToggleButton$lambda$0 = ToggleButtonKt.ElevatedToggleButton$lambda$0(z, function1, modifier3, z4, toggleButtonShapes3, toggleButtonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return ElevatedToggleButton$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                if ((i2 & 6) != 0) {
                }
                i10 = i4;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i2 & 6) != 0) {
            }
            i10 = i4;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i2 & 6) != 0) {
        }
        i10 = i4;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TonalToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, ToggleButtonShapes toggleButtonShapes, ToggleButtonColors toggleButtonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        ToggleButtonShapes toggleButtonShapes2;
        ToggleButtonColors toggleButtonColors2;
        ButtonElevation buttonElevation2;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        int i9;
        int i10;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        Composer composer2;
        final boolean z4;
        final ToggleButtonShapes toggleButtonShapes3;
        final ToggleButtonColors toggleButtonColors3;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        int i11;
        ToggleButtonShapes toggleButtonShapes4;
        int i12;
        ButtonElevation buttonElevation4;
        PaddingValues paddingValues3;
        int i13;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        ButtonElevation buttonElevation5;
        PaddingValues paddingValues4;
        int i14;
        ToggleButtonColors toggleButtonColors4;
        boolean z5;
        ToggleButtonShapes toggleButtonShapes5;
        BorderStroke borderStroke4;
        int i15;
        int i16;
        int i17;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(-1466986964);
        ComposerKt.sourceInformation(startRestartGroup, "C(TonalToggleButton)N(checked,onCheckedChange,modifier,enabled,shapes,colors,elevation,border,contentPadding,interactionSource,content)291@15440L366:ToggleButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        toggleButtonShapes2 = toggleButtonShapes;
                        if (startRestartGroup.changed(toggleButtonShapes2)) {
                            i18 = 16384;
                            i4 |= i18;
                        }
                    } else {
                        toggleButtonShapes2 = toggleButtonShapes;
                    }
                    i18 = 8192;
                    i4 |= i18;
                } else {
                    toggleButtonShapes2 = toggleButtonShapes;
                }
                if ((196608 & i) == 0) {
                    if ((i3 & 32) == 0) {
                        toggleButtonColors2 = toggleButtonColors;
                        if (startRestartGroup.changed(toggleButtonColors2)) {
                            i17 = 131072;
                            i4 |= i17;
                        }
                    } else {
                        toggleButtonColors2 = toggleButtonColors;
                    }
                    i17 = 65536;
                    i4 |= i17;
                } else {
                    toggleButtonColors2 = toggleButtonColors;
                }
                if ((1572864 & i) == 0) {
                    if ((i3 & 64) == 0) {
                        buttonElevation2 = buttonElevation;
                        if (startRestartGroup.changed(buttonElevation2)) {
                            i16 = 1048576;
                            i4 |= i16;
                        }
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    i16 = 524288;
                    i4 |= i16;
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                    borderStroke2 = borderStroke;
                } else {
                    borderStroke2 = borderStroke;
                    if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(borderStroke2) ? 8388608 : 4194304;
                    }
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0 && startRestartGroup.changed(paddingValues)) {
                        i15 = 67108864;
                        i4 |= i15;
                    }
                    i15 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i15;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changedInstance(function3) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    i10 = i4;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "283@15002L35,284@15093L25,285@15169L28");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            i14 = (i3 & 16) != 0 ? i10 & (-57345) : i10;
                            if ((i3 & 32) != 0) {
                                i14 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i14 &= -3670017;
                            }
                            if ((i3 & 256) != 0) {
                                i14 &= -234881025;
                            }
                            paddingValues4 = paddingValues;
                            mutableInteractionSource3 = mutableInteractionSource;
                            i12 = i9;
                            borderStroke4 = borderStroke2;
                            modifier4 = modifier2;
                            z5 = z3;
                            toggleButtonShapes5 = toggleButtonShapes2;
                            toggleButtonColors4 = toggleButtonColors2;
                            buttonElevation5 = buttonElevation2;
                        } else {
                            Modifier.Companion companion = i19 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i5 == 0 ? z3 : true;
                            if ((i3 & 16) != 0) {
                                i11 = i10 & (-57345);
                                toggleButtonShapes4 = ToggleButtonDefaults.INSTANCE.m4406shapesFor8Feqmps(ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM(), startRestartGroup, 54);
                            } else {
                                i11 = i10;
                                toggleButtonShapes4 = toggleButtonShapes2;
                            }
                            if ((i3 & 32) != 0) {
                                i11 &= -458753;
                                toggleButtonColors2 = ToggleButtonDefaults.INSTANCE.tonalToggleButtonColors(startRestartGroup, 6);
                            }
                            int i20 = i11;
                            if ((i3 & 64) != 0) {
                                buttonElevation4 = ButtonDefaults.INSTANCE.m2596filledTonalButtonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                i20 &= -3670017;
                                i12 = i9;
                            } else {
                                i12 = i9;
                                buttonElevation4 = buttonElevation2;
                            }
                            BorderStroke borderStroke5 = i6 != 0 ? null : borderStroke;
                            if ((i3 & 256) != 0) {
                                paddingValues3 = ButtonDefaults.m2575contentPaddingFor8Feqmps$default(ButtonDefaults.INSTANCE, ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM(), false, false, 6, null);
                                i13 = i20 & (-234881025);
                            } else {
                                paddingValues3 = paddingValues;
                                i13 = i20;
                            }
                            if (i8 != 0) {
                                modifier4 = companion;
                                buttonElevation5 = buttonElevation4;
                                mutableInteractionSource3 = null;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                modifier4 = companion;
                                buttonElevation5 = buttonElevation4;
                            }
                            paddingValues4 = paddingValues3;
                            i14 = i13;
                            toggleButtonColors4 = toggleButtonColors2;
                            z5 = z6;
                            toggleButtonShapes5 = toggleButtonShapes4;
                            borderStroke4 = borderStroke5;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1466986964, i14, i12, "androidx.compose.material3.TonalToggleButton (ToggleButton.kt:291)");
                        }
                        ToggleButton(z, function1, modifier4, z5, toggleButtonShapes5, toggleButtonColors4, buttonElevation5, borderStroke4, paddingValues4, mutableInteractionSource3, function3, startRestartGroup, i14 & 2147483646, i12 & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = startRestartGroup;
                        modifier3 = modifier4;
                        z4 = z5;
                        toggleButtonShapes3 = toggleButtonShapes5;
                        toggleButtonColors3 = toggleButtonColors4;
                        buttonElevation3 = buttonElevation5;
                        borderStroke3 = borderStroke4;
                        paddingValues2 = paddingValues4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        composer2 = startRestartGroup;
                        z4 = z3;
                        toggleButtonShapes3 = toggleButtonShapes2;
                        toggleButtonColors3 = toggleButtonColors2;
                        buttonElevation3 = buttonElevation2;
                        borderStroke3 = borderStroke;
                        paddingValues2 = paddingValues;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ToggleButtonKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TonalToggleButton$lambda$0;
                                TonalToggleButton$lambda$0 = ToggleButtonKt.TonalToggleButton$lambda$0(z, function1, modifier3, z4, toggleButtonShapes3, toggleButtonColors3, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return TonalToggleButton$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                if ((i2 & 6) != 0) {
                }
                i10 = i4;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i2 & 6) != 0) {
            }
            i10 = i4;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i2 & 6) != 0) {
        }
        i10 = i4;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, ToggleButtonShapes toggleButtonShapes, ToggleButtonColors toggleButtonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        ToggleButtonShapes toggleButtonShapes2;
        ToggleButtonColors toggleButtonColors2;
        int i6;
        ButtonElevation buttonElevation2;
        int i7;
        int i8;
        int i9;
        int i10;
        final PaddingValues paddingValues2;
        final ButtonElevation buttonElevation3;
        final Modifier modifier3;
        final boolean z4;
        final ToggleButtonShapes toggleButtonShapes3;
        final ToggleButtonColors toggleButtonColors3;
        final BorderStroke borderStroke2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        int i11;
        ToggleButtonShapes toggleButtonShapes4;
        ToggleButtonColors toggleButtonColors4;
        BorderStroke borderStroke3;
        PaddingValues paddingValues3;
        int i12;
        int i13;
        boolean z5;
        BorderStroke borderStroke4;
        ToggleButtonShapes toggleButtonShapes5;
        ButtonElevation buttonElevation4;
        ToggleButtonColors toggleButtonColors5;
        PaddingValues paddingValues4;
        MutableInteractionSource mutableInteractionSource3;
        int i14;
        int i15;
        int i16;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(-1667310484);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedToggleButton)N(checked,onCheckedChange,modifier,enabled,shapes,colors,elevation,border,contentPadding,interactionSource,content)362@19275L366:ToggleButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
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
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        toggleButtonShapes2 = toggleButtonShapes;
                        if (startRestartGroup.changed(toggleButtonShapes2)) {
                            i17 = 16384;
                            i4 |= i17;
                        }
                    } else {
                        toggleButtonShapes2 = toggleButtonShapes;
                    }
                    i17 = 8192;
                    i4 |= i17;
                } else {
                    toggleButtonShapes2 = toggleButtonShapes;
                }
                if ((196608 & i) == 0) {
                    if ((i3 & 32) == 0) {
                        toggleButtonColors2 = toggleButtonColors;
                        if (startRestartGroup.changed(toggleButtonColors2)) {
                            i16 = 131072;
                            i4 |= i16;
                        }
                    } else {
                        toggleButtonColors2 = toggleButtonColors;
                    }
                    i16 = 65536;
                    i4 |= i16;
                } else {
                    toggleButtonColors2 = toggleButtonColors;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                    buttonElevation2 = buttonElevation;
                } else {
                    buttonElevation2 = buttonElevation;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(buttonElevation2) ? 1048576 : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0 && startRestartGroup.changed(borderStroke)) {
                        i15 = 8388608;
                        i4 |= i15;
                    }
                    i15 = 4194304;
                    i4 |= i15;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0 && startRestartGroup.changed(paddingValues)) {
                        i14 = 67108864;
                        i4 |= i14;
                    }
                    i14 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i14;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changedInstance(function3) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    i10 = i4;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "354@18809L35,355@18900L28");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            int i19 = (i3 & 16) != 0 ? i10 & (-57345) : i10;
                            if ((i3 & 32) != 0) {
                                i19 &= -458753;
                            }
                            if ((i3 & 128) != 0) {
                                i19 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i19 &= -234881025;
                            }
                            borderStroke4 = borderStroke;
                            mutableInteractionSource3 = mutableInteractionSource;
                            buttonElevation4 = buttonElevation2;
                            z5 = z3;
                            toggleButtonShapes5 = toggleButtonShapes2;
                            toggleButtonColors5 = toggleButtonColors2;
                            i13 = i19;
                            companion = modifier2;
                            paddingValues4 = paddingValues;
                        } else {
                            companion = i18 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 16) != 0) {
                                toggleButtonShapes4 = ToggleButtonDefaults.INSTANCE.m4406shapesFor8Feqmps(ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM(), startRestartGroup, 54);
                                i11 = i10 & (-57345);
                            } else {
                                i11 = i10;
                                toggleButtonShapes4 = toggleButtonShapes2;
                            }
                            if ((i3 & 32) != 0) {
                                toggleButtonColors4 = ToggleButtonDefaults.INSTANCE.outlinedToggleButtonColors(startRestartGroup, 6);
                                i11 &= -458753;
                            } else {
                                toggleButtonColors4 = toggleButtonColors2;
                            }
                            if (i6 != 0) {
                                buttonElevation2 = null;
                            }
                            if ((i3 & 128) != 0) {
                                if (z) {
                                    startRestartGroup.startReplaceGroup(450604849);
                                    startRestartGroup.endReplaceGroup();
                                    borderStroke3 = null;
                                } else {
                                    startRestartGroup.startReplaceGroup(-262560119);
                                    ComposerKt.sourceInformation(startRestartGroup, "357@19027L29");
                                    borderStroke3 = ButtonDefaults.INSTANCE.outlinedButtonBorder(z3, startRestartGroup, ((i11 >> 9) & 14) | 48, 0);
                                    startRestartGroup.endReplaceGroup();
                                }
                                i11 &= -29360129;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if ((i3 & 256) != 0) {
                                paddingValues3 = ButtonDefaults.m2575contentPaddingFor8Feqmps$default(ButtonDefaults.INSTANCE, ButtonDefaults.INSTANCE.m2611getMinHeightD9Ej5fM(), false, false, 6, null);
                                i12 = (-234881025) & i11;
                            } else {
                                paddingValues3 = paddingValues;
                                i12 = i11;
                            }
                            boolean z6 = z3;
                            i13 = i12;
                            z5 = z6;
                            ToggleButtonShapes toggleButtonShapes6 = toggleButtonShapes4;
                            borderStroke4 = borderStroke3;
                            toggleButtonShapes5 = toggleButtonShapes6;
                            buttonElevation4 = buttonElevation2;
                            toggleButtonColors5 = toggleButtonColors4;
                            if (i8 != 0) {
                                mutableInteractionSource3 = null;
                                paddingValues4 = paddingValues3;
                            } else {
                                paddingValues4 = paddingValues3;
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1667310484, i13, i9, "androidx.compose.material3.OutlinedToggleButton (ToggleButton.kt:362)");
                        }
                        ToggleButton(z, function1, companion, z5, toggleButtonShapes5, toggleButtonColors5, buttonElevation4, borderStroke4, paddingValues4, mutableInteractionSource3, function3, startRestartGroup, 2147483646 & i13, i9 & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource2 = mutableInteractionSource3;
                        paddingValues2 = paddingValues4;
                        borderStroke2 = borderStroke4;
                        buttonElevation3 = buttonElevation4;
                        toggleButtonColors3 = toggleButtonColors5;
                        toggleButtonShapes3 = toggleButtonShapes5;
                        z4 = z5;
                        modifier3 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        paddingValues2 = paddingValues;
                        buttonElevation3 = buttonElevation2;
                        modifier3 = modifier2;
                        z4 = z3;
                        toggleButtonShapes3 = toggleButtonShapes2;
                        toggleButtonColors3 = toggleButtonColors2;
                        borderStroke2 = borderStroke;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ToggleButtonKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit OutlinedToggleButton$lambda$0;
                                OutlinedToggleButton$lambda$0 = ToggleButtonKt.OutlinedToggleButton$lambda$0(z, function1, modifier3, z4, toggleButtonShapes3, toggleButtonColors3, buttonElevation3, borderStroke2, paddingValues2, mutableInteractionSource2, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return OutlinedToggleButton$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                if ((i2 & 6) != 0) {
                }
                i10 = i4;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i2 & 6) != 0) {
            }
            i10 = i4;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i2 & 6) != 0) {
        }
        i10 = i4;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final boolean getHasRoundedCornerShapes(ToggleButtonShapes toggleButtonShapes) {
        return (toggleButtonShapes.getShape() instanceof RoundedCornerShape) && (toggleButtonShapes.getPressedShape() instanceof RoundedCornerShape) && (toggleButtonShapes.getCheckedShape() instanceof RoundedCornerShape);
    }

    public static final boolean getHasCornerBasedShapes(ToggleButtonShapes toggleButtonShapes) {
        return (toggleButtonShapes.getShape() instanceof CornerBasedShape) && (toggleButtonShapes.getPressedShape() instanceof CornerBasedShape) && (toggleButtonShapes.getCheckedShape() instanceof CornerBasedShape);
    }

    private static final Shape shapeByInteraction(ToggleButtonShapes toggleButtonShapes, boolean z, boolean z2, FiniteAnimationSpec<Float> finiteAnimationSpec, Composer composer, int i) {
        Shape shape;
        composer.startReplaceGroup(-585100128);
        ComposerKt.sourceInformation(composer, "C(shapeByInteraction)N(shapes,pressed,checked,animationSpec):ToggleButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-585100128, i, -1, "androidx.compose.material3.shapeByInteraction (ToggleButton.kt:955)");
        }
        if (z) {
            shape = toggleButtonShapes.getPressedShape();
        } else if (z2) {
            shape = toggleButtonShapes.getCheckedShape();
        } else {
            shape = toggleButtonShapes.getShape();
        }
        if (getHasRoundedCornerShapes(toggleButtonShapes)) {
            composer.startReplaceGroup(-1740235478);
            ComposerKt.sourceInformation(composer, "");
            composer.startMovableGroup(359505585, toggleButtonShapes);
            ComposerKt.sourceInformation(composer, "966@46124L65");
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.RoundedCornerShape");
            Shape rememberAnimatedShape = AnimatedShapeKt.rememberAnimatedShape((RoundedCornerShape) shape, finiteAnimationSpec, composer, (i >> 6) & 112);
            composer.endMovableGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return rememberAnimatedShape;
        }
        if (getHasCornerBasedShapes(toggleButtonShapes)) {
            composer.startReplaceGroup(-1740097652);
            ComposerKt.sourceInformation(composer, "");
            composer.startMovableGroup(359510031, toggleButtonShapes);
            ComposerKt.sourceInformation(composer, "968@46263L63");
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            Shape rememberAnimatedShape2 = AnimatedShapeKt.rememberAnimatedShape((CornerBasedShape) shape, finiteAnimationSpec, composer, (i >> 6) & 112);
            composer.endMovableGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return rememberAnimatedShape2;
        }
        composer.startReplaceGroup(-1740015006);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return shape;
    }

    private static final boolean ToggleButton$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
