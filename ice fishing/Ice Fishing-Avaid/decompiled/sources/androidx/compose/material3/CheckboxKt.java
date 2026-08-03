package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: Checkbox.kt */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\r\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u0011\u001aO\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u0017\u001a_\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u0018\u001a=\u0010\u0019\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u001b\u001a3\u0010\u001c\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010%\u001a;\u0010&\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-\"\u000e\u0010.\u001a\u00020/X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0004\n\u0002\u00102\"\u0010\u00103\u001a\u000201X\u0082\u0004¢\u0006\u0004\n\u0002\u00102\"\u0010\u00104\u001a\u000201X\u0082\u0004¢\u0006\u0004\n\u0002\u00102¨\u00065"}, d2 = {"Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/CheckboxColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "checkmarkStroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "outlineStroke", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "TriStateCheckbox", "state", "Landroidx/compose/ui/state/ToggleableState;", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", "value", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CheckboxColors;Landroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/runtime/Composer;I)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "radius", "", "stroke", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "drawingCache", "Landroidx/compose/material3/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFLandroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/material3/CheckDrawingCache;)V", "SnapAnimationDelay", "", "CheckboxDefaultPadding", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxSize", "RadiusSize", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class CheckboxKt {
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxSize = Dp.m9732constructorimpl(20);
    private static final float RadiusSize;
    private static final int SnapAnimationDelay = 100;

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Checkbox$lambda$2(boolean z, Function1 function1, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        Checkbox(z, function1, modifier, z2, checkboxColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Checkbox$lambda$4(boolean z, Function1 function1, Stroke stroke, Stroke stroke2, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        Checkbox(z, function1, stroke, stroke2, modifier, z2, checkboxColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckboxImpl$lambda$6(boolean z, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, Stroke stroke, Stroke stroke2, int i, Composer composer, int i2) {
        CheckboxImpl(z, toggleableState, modifier, checkboxColors, stroke, stroke2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TriStateCheckbox$lambda$1(ToggleableState toggleableState, Function0 function0, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        TriStateCheckbox(toggleableState, function0, modifier, z, checkboxColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TriStateCheckbox$lambda$2(ToggleableState toggleableState, Function0 function0, Stroke stroke, Stroke stroke2, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        TriStateCheckbox(toggleableState, function0, stroke, stroke2, modifier, z, checkboxColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Checkbox(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        CheckboxColors checkboxColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z4;
        final CheckboxColors checkboxColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        boolean z5;
        CheckboxColors checkboxColors4;
        int i6;
        MutableInteractionSource mutableInteractionSource4;
        Function0 function0;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1406741137);
        ComposerKt.sourceInformation(startRestartGroup, "C(Checkbox)N(checked,onCheckedChange,modifier,enabled,colors,interactionSource)98@4432L7,99@4492L493:Checkbox.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (startRestartGroup.changed(checkboxColors2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "95@4319L8");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                checkboxColors2 = CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                z5 = z3;
                                checkboxColors4 = checkboxColors2;
                                i6 = 6;
                                mutableInteractionSource4 = null;
                                Modifier modifier4 = modifier2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1406741137, i3, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                                }
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                float floor = (float) Math.floor(((Density) consume).mo528toPx0680j_4(CheckboxDefaults.INSTANCE.m2672getStrokeWidthD9Ej5fM()));
                                ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(z);
                                if (function1 == null) {
                                    startRestartGroup.startReplaceGroup(2066141046);
                                    ComposerKt.sourceInformation(startRestartGroup, "103@4629L29");
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1036481580, "CC(remember):Checkbox.kt#9igjgp");
                                    boolean z6 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (z6 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new Function0() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit Checkbox$lambda$1$0;
                                                Checkbox$lambda$1$0 = CheckboxKt.Checkbox$lambda$1$0(Function1.this, z);
                                                return Checkbox$lambda$1$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endReplaceGroup();
                                    function0 = (Function0) rememberedValue;
                                } else {
                                    startRestartGroup.startReplaceGroup(2066206735);
                                    startRestartGroup.endReplaceGroup();
                                    function0 = null;
                                }
                                int i9 = i3 << i6;
                                composer2 = startRestartGroup;
                                TriStateCheckbox(ToggleableState, function0, new Stroke(floor, 0.0f, StrokeCap.INSTANCE.m7174getSquareKaPHkGw(), 0, null, 26, null), new Stroke(floor, 0.0f, 0, 0, null, 30, null), modifier4, z5, checkboxColors4, mutableInteractionSource4, composer2, (Stroke.$stable << i6) | (Stroke.$stable << 9) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (i9 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z4 = z5;
                                checkboxColors3 = checkboxColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                        }
                        z5 = z3;
                        i6 = 6;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        checkboxColors4 = checkboxColors2;
                        Modifier modifier42 = modifier2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float floor2 = (float) Math.floor(((Density) consume2).mo528toPx0680j_4(CheckboxDefaults.INSTANCE.m2672getStrokeWidthD9Ej5fM()));
                        ToggleableState ToggleableState2 = ToggleableStateKt.ToggleableState(z);
                        if (function1 == null) {
                        }
                        int i92 = i3 << i6;
                        composer2 = startRestartGroup;
                        TriStateCheckbox(ToggleableState2, function0, new Stroke(floor2, 0.0f, StrokeCap.INSTANCE.m7174getSquareKaPHkGw(), 0, null, 26, null), new Stroke(floor2, 0.0f, 0, 0, null, 30, null), modifier42, z5, checkboxColors4, mutableInteractionSource4, composer2, (Stroke.$stable << i6) | (Stroke.$stable << 9) | (57344 & i92) | (458752 & i92) | (3670016 & i92) | (i92 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        z4 = z5;
                        checkboxColors3 = checkboxColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                        checkboxColors3 = checkboxColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Checkbox$lambda$2;
                                Checkbox$lambda$2 = CheckboxKt.Checkbox$lambda$2(z, function1, modifier3, z4, checkboxColors3, mutableInteractionSource3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return Checkbox$lambda$2;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Checkbox$lambda$1$0(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Checkbox(final boolean z, final Function1<? super Boolean, Unit> function1, final Stroke stroke, final Stroke stroke2, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        CheckboxColors checkboxColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        final MutableInteractionSource mutableInteractionSource3;
        final Modifier modifier3;
        final boolean z4;
        final CheckboxColors checkboxColors3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        boolean z5;
        CheckboxColors checkboxColors4;
        MutableInteractionSource mutableInteractionSource4;
        Function0 function0;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(534932591);
        ComposerKt.sourceInformation(startRestartGroup, "C(Checkbox)N(checked,onCheckedChange,checkmarkStroke,outlineStroke,modifier,enabled,colors,interactionSource)162@7424L439:Checkbox.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(stroke) : startRestartGroup.changedInstance(stroke) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(stroke2) : startRestartGroup.changedInstance(stroke2) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (startRestartGroup.changed(checkboxColors2)) {
                            i6 = 1048576;
                            i3 |= i6;
                        }
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i6 = 524288;
                    i3 |= i6;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 8388608 : 4194304;
                    }
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "159@7349L8");
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            checkboxColors2 = CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
                        }
                        if (i5 != 0) {
                            modifier4 = modifier2;
                            z5 = z3;
                            checkboxColors4 = checkboxColors2;
                            mutableInteractionSource4 = null;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(534932591, i3, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:161)");
                            }
                            ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(z);
                            if (function1 == null) {
                                startRestartGroup.startReplaceGroup(1848587702);
                                ComposerKt.sourceInformation(startRestartGroup, "166@7561L29");
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1325840916, "CC(remember):Checkbox.kt#9igjgp");
                                boolean z6 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (z6 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function0() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit Checkbox$lambda$3$0;
                                            Checkbox$lambda$3$0 = CheckboxKt.Checkbox$lambda$3$0(Function1.this, z);
                                            return Checkbox$lambda$3$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceGroup();
                                function0 = (Function0) rememberedValue;
                            } else {
                                startRestartGroup.startReplaceGroup(1848653391);
                                startRestartGroup.endReplaceGroup();
                                function0 = null;
                            }
                            TriStateCheckbox(ToggleableState, function0, stroke, stroke2, modifier4, z5, checkboxColors4, mutableInteractionSource4, startRestartGroup, (Stroke.$stable << 6) | (i3 & 896) | (Stroke.$stable << 9) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z4 = z5;
                            checkboxColors3 = checkboxColors4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                    }
                    modifier4 = modifier2;
                    z5 = z3;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    checkboxColors4 = checkboxColors2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ToggleableState ToggleableState2 = ToggleableStateKt.ToggleableState(z);
                    if (function1 == null) {
                    }
                    TriStateCheckbox(ToggleableState2, function0, stroke, stroke2, modifier4, z5, checkboxColors4, mutableInteractionSource4, startRestartGroup, (Stroke.$stable << 6) | (i3 & 896) | (Stroke.$stable << 9) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    z4 = z5;
                    checkboxColors3 = checkboxColors4;
                    mutableInteractionSource3 = mutableInteractionSource4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = modifier2;
                    z4 = z3;
                    checkboxColors3 = checkboxColors2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Checkbox$lambda$4;
                            Checkbox$lambda$4 = CheckboxKt.Checkbox$lambda$4(z, function1, stroke, stroke2, modifier3, z4, checkboxColors3, mutableInteractionSource3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return Checkbox$lambda$4;
                        }
                    });
                    return;
                }
                return;
            }
            z3 = z2;
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Checkbox$lambda$3$0(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TriStateCheckbox(final ToggleableState toggleableState, final Function0<Unit> function0, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        CheckboxColors checkboxColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final CheckboxColors checkboxColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        boolean z4;
        int i6;
        CheckboxColors checkboxColors4;
        MutableInteractionSource mutableInteractionSource4;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1608358065);
        ComposerKt.sourceInformation(startRestartGroup, "C(TriStateCheckbox)N(state,onClick,modifier,enabled,colors,interactionSource)215@9923L7,216@9983L337:Checkbox.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (startRestartGroup.changed(checkboxColors2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "212@9810L8");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier4 = modifier2;
                            z4 = z2;
                            checkboxColors4 = checkboxColors2;
                            i6 = 6;
                        } else {
                            Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z5 = i4 == 0 ? z2 : true;
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                checkboxColors2 = CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                modifier4 = companion;
                                z4 = z5;
                                i6 = 6;
                                mutableInteractionSource4 = null;
                                checkboxColors4 = checkboxColors2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1608358065, i3, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:214)");
                                }
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                float floor = (float) Math.floor(((Density) consume).mo528toPx0680j_4(CheckboxDefaults.INSTANCE.m2672getStrokeWidthD9Ej5fM()));
                                Stroke stroke = new Stroke(floor, 0.0f, StrokeCap.INSTANCE.m7174getSquareKaPHkGw(), 0, null, 26, null);
                                Stroke stroke2 = new Stroke(floor, 0.0f, 0, 0, null, 30, null);
                                int i9 = (i3 & 126) | (Stroke.$stable << i6) | (Stroke.$stable << 9);
                                int i10 = i3 << i6;
                                composer2 = startRestartGroup;
                                TriStateCheckbox(toggleableState, function0, stroke, stroke2, modifier4, z4, checkboxColors4, mutableInteractionSource4, composer2, i9 | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (i10 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z3 = z4;
                                checkboxColors3 = checkboxColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            } else {
                                modifier4 = companion;
                                z4 = z5;
                                i6 = 6;
                                checkboxColors4 = checkboxColors2;
                            }
                        }
                        mutableInteractionSource4 = mutableInteractionSource2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float floor2 = (float) Math.floor(((Density) consume2).mo528toPx0680j_4(CheckboxDefaults.INSTANCE.m2672getStrokeWidthD9Ej5fM()));
                        Stroke stroke3 = new Stroke(floor2, 0.0f, StrokeCap.INSTANCE.m7174getSquareKaPHkGw(), 0, null, 26, null);
                        Stroke stroke22 = new Stroke(floor2, 0.0f, 0, 0, null, 30, null);
                        int i92 = (i3 & 126) | (Stroke.$stable << i6) | (Stroke.$stable << 9);
                        int i102 = i3 << i6;
                        composer2 = startRestartGroup;
                        TriStateCheckbox(toggleableState, function0, stroke3, stroke22, modifier4, z4, checkboxColors4, mutableInteractionSource4, composer2, i92 | (57344 & i102) | (458752 & i102) | (3670016 & i102) | (i102 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        checkboxColors3 = checkboxColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        checkboxColors3 = checkboxColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TriStateCheckbox$lambda$1;
                                TriStateCheckbox$lambda$1 = CheckboxKt.TriStateCheckbox$lambda$1(ToggleableState.this, function0, modifier3, z3, checkboxColors3, mutableInteractionSource3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return TriStateCheckbox$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TriStateCheckbox(final ToggleableState toggleableState, final Function0<Unit> function0, final Stroke stroke, final Stroke stroke2, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z2;
        CheckboxColors checkboxColors2;
        int i5;
        int i6;
        final MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final boolean z3;
        final CheckboxColors checkboxColors3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        MutableInteractionSource mutableInteractionSource3;
        boolean z4;
        int i8;
        Modifier modifier3;
        boolean z5;
        MutableInteractionSource mutableInteractionSource4;
        IndicationNodeFactory m3792rippleH2RKhps$default;
        MutableInteractionSource mutableInteractionSource5;
        boolean z6;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        Modifier.Companion m1201padding3ABfNKs;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-406243761);
        ComposerKt.sourceInformation(startRestartGroup, "C(TriStateCheckbox)N(state,onClick,checkmarkStroke,outlineStroke,modifier,enabled,colors,interactionSource)301@13908L739:Checkbox.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(stroke) : startRestartGroup.changedInstance(stroke) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(stroke2) : startRestartGroup.changedInstance(stroke2) ? 2048 : 1024;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        checkboxColors2 = checkboxColors;
                        if (startRestartGroup.changed(checkboxColors2)) {
                            i9 = 1048576;
                            i3 |= i9;
                        }
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i9 = 524288;
                    i3 |= i9;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "274@12999L8");
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i7 = i6 & (-3670017);
                            checkboxColors2 = CheckboxDefaults.INSTANCE.colors(startRestartGroup, 6);
                        } else {
                            i7 = i6;
                        }
                        if (i5 != 0) {
                            int i11 = i7;
                            mutableInteractionSource3 = null;
                            z4 = z2;
                            i8 = i11;
                            modifier3 = modifier2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-406243761, i8, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:276)");
                            }
                            z5 = ComposeMaterial3Flags.isCheckboxStylingFixEnabled;
                            if (!z5) {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                m3792rippleH2RKhps$default = RippleKt.m3791rippleH2RKhps(false, Dp.m9732constructorimpl(CheckboxTokens.INSTANCE.m5012getStateLayerSizeD9Ej5fM() / 2), checkboxColors2.m2669indicatorColorvNxB06k$material3(toggleableState));
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                m3792rippleH2RKhps$default = RippleKt.m3792rippleH2RKhps$default(false, Dp.m9732constructorimpl(CheckboxTokens.INSTANCE.m5012getStateLayerSizeD9Ej5fM() / 2), 0L, 4, null);
                            }
                            if (function0 == null) {
                                z6 = z4;
                                MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                                companion = ToggleableKt.m1555triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource6, m3792rippleH2RKhps$default, z6, Role.m8874boximpl(Role.INSTANCE.m8883getCheckboxo7Vup1c()), function0);
                                mutableInteractionSource5 = mutableInteractionSource6;
                            } else {
                                mutableInteractionSource5 = mutableInteractionSource4;
                                z6 = z4;
                                companion = Modifier.INSTANCE;
                            }
                            if (function0 == null) {
                                companion2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                            } else {
                                companion2 = Modifier.INSTANCE;
                            }
                            Modifier then = modifier3.then(companion2).then(companion);
                            if (!z5) {
                                m1201padding3ABfNKs = Modifier.INSTANCE;
                            } else {
                                m1201padding3ABfNKs = PaddingKt.m1201padding3ABfNKs(Modifier.INSTANCE, CheckboxDefaultPadding);
                            }
                            Modifier then2 = then.then(m1201padding3ABfNKs);
                            int i12 = i8 << 6;
                            boolean z7 = z6;
                            CheckboxColors checkboxColors4 = checkboxColors2;
                            CheckboxImpl(z7, toggleableState, then2, checkboxColors4, stroke, stroke2, startRestartGroup, ((i8 >> 15) & 14) | ((i8 << 3) & 112) | ((i8 >> 9) & 7168) | (Stroke.$stable << 12) | (57344 & i12) | (Stroke.$stable << 15) | (i12 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            checkboxColors3 = checkboxColors4;
                            composer2 = startRestartGroup;
                            modifier2 = modifier3;
                            mutableInteractionSource2 = mutableInteractionSource5;
                            z3 = z7;
                        }
                        modifier3 = modifier2;
                        z4 = z2;
                        i8 = i7;
                        mutableInteractionSource3 = mutableInteractionSource;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z5 = ComposeMaterial3Flags.isCheckboxStylingFixEnabled;
                        if (!z5) {
                        }
                        if (function0 == null) {
                        }
                        if (function0 == null) {
                        }
                        Modifier then3 = modifier3.then(companion2).then(companion);
                        if (!z5) {
                        }
                        Modifier then22 = then3.then(m1201padding3ABfNKs);
                        int i122 = i8 << 6;
                        boolean z72 = z6;
                        CheckboxColors checkboxColors42 = checkboxColors2;
                        CheckboxImpl(z72, toggleableState, then22, checkboxColors42, stroke, stroke2, startRestartGroup, ((i8 >> 15) & 14) | ((i8 << 3) & 112) | ((i8 >> 9) & 7168) | (Stroke.$stable << 12) | (57344 & i122) | (Stroke.$stable << 15) | (i122 & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        checkboxColors3 = checkboxColors42;
                        composer2 = startRestartGroup;
                        modifier2 = modifier3;
                        mutableInteractionSource2 = mutableInteractionSource5;
                        z3 = z72;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 64) != 0) {
                            i7 = i6 & (-3670017);
                            modifier3 = modifier2;
                            z4 = z2;
                            i8 = i7;
                            mutableInteractionSource3 = mutableInteractionSource;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z5 = ComposeMaterial3Flags.isCheckboxStylingFixEnabled;
                            if (!z5) {
                            }
                            if (function0 == null) {
                            }
                            if (function0 == null) {
                            }
                            Modifier then32 = modifier3.then(companion2).then(companion);
                            if (!z5) {
                            }
                            Modifier then222 = then32.then(m1201padding3ABfNKs);
                            int i1222 = i8 << 6;
                            boolean z722 = z6;
                            CheckboxColors checkboxColors422 = checkboxColors2;
                            CheckboxImpl(z722, toggleableState, then222, checkboxColors422, stroke, stroke2, startRestartGroup, ((i8 >> 15) & 14) | ((i8 << 3) & 112) | ((i8 >> 9) & 7168) | (Stroke.$stable << 12) | (57344 & i1222) | (Stroke.$stable << 15) | (i1222 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            checkboxColors3 = checkboxColors422;
                            composer2 = startRestartGroup;
                            modifier2 = modifier3;
                            mutableInteractionSource2 = mutableInteractionSource5;
                            z3 = z722;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier3 = modifier2;
                            z4 = z2;
                            i8 = i6;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z5 = ComposeMaterial3Flags.isCheckboxStylingFixEnabled;
                            if (!z5) {
                            }
                            if (function0 == null) {
                            }
                            if (function0 == null) {
                            }
                            Modifier then322 = modifier3.then(companion2).then(companion);
                            if (!z5) {
                            }
                            Modifier then2222 = then322.then(m1201padding3ABfNKs);
                            int i12222 = i8 << 6;
                            boolean z7222 = z6;
                            CheckboxColors checkboxColors4222 = checkboxColors2;
                            CheckboxImpl(z7222, toggleableState, then2222, checkboxColors4222, stroke, stroke2, startRestartGroup, ((i8 >> 15) & 14) | ((i8 << 3) & 112) | ((i8 >> 9) & 7168) | (Stroke.$stable << 12) | (57344 & i12222) | (Stroke.$stable << 15) | (i12222 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            checkboxColors3 = checkboxColors4222;
                            composer2 = startRestartGroup;
                            modifier2 = modifier3;
                            mutableInteractionSource2 = mutableInteractionSource5;
                            z3 = z7222;
                        }
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    mutableInteractionSource2 = mutableInteractionSource;
                    composer2 = startRestartGroup;
                    z3 = z2;
                    checkboxColors3 = checkboxColors2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit TriStateCheckbox$lambda$2;
                            TriStateCheckbox$lambda$2 = CheckboxKt.TriStateCheckbox$lambda$2(ToggleableState.this, function0, stroke, stroke2, modifier2, z3, checkboxColors3, mutableInteractionSource2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return TriStateCheckbox$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z2 = z;
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x04a1, code lost:
    
        if (r14.changedInstance(r10) != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04ce, code lost:
    
        if (r14.changedInstance(r12) != false) goto L214;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CheckboxImpl(final boolean z, final ToggleableState toggleableState, final Modifier modifier, final CheckboxColors checkboxColors, final Stroke stroke, final Stroke stroke2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        int i3;
        Object currentState;
        ToggleableState toggleableState2;
        float f;
        boolean changed;
        Object rememberedValue;
        Float f2;
        ToggleableState toggleableState3;
        int i4;
        int i5;
        float f3;
        boolean changed2;
        Object rememberedValue2;
        Object currentState2;
        int i6;
        float f4;
        boolean changed3;
        Object rememberedValue3;
        int i7;
        boolean changed4;
        Object rememberedValue4;
        Object rememberedValue5;
        State<Color> checkmarkColor$material3;
        Stroke stroke3;
        boolean z2;
        final Stroke stroke4;
        boolean z3;
        boolean z4;
        Object obj;
        Modifier modifier2;
        int i8;
        Snapshot.Companion companion;
        Snapshot currentThreadSnapshot;
        Function1<Object, Unit> readObserver;
        Snapshot makeCurrentNonObservable;
        Composer startRestartGroup = composer.startRestartGroup(-891330208);
        ComposerKt.sourceInformation(startRestartGroup, "C(CheckboxImpl)N(enabled,value,modifier,colors,checkmarkStroke,outlineStroke)479@23102L23,480@23194L14,482@23256L608,500@23931L594,516@24547L32,523@24788L24,524@24842L27,531@25113L476,531@25034L555:Checkbox.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(toggleableState.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(checkboxColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? startRestartGroup.changed(stroke) : startRestartGroup.changedInstance(stroke) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & 262144) == 0 ? startRestartGroup.changed(stroke2) : startRestartGroup.changedInstance(stroke2) ? 131072 : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-891330208, i2, -1, "androidx.compose.material3.CheckboxImpl (Checkbox.kt:477)");
            }
            boolean z5 = ComposeMaterial3Flags.isCheckboxStylingFixEnabled;
            int i9 = i2 >> 3;
            int i10 = i9 & 14;
            final Transition updateTransition = TransitionKt.updateTransition(toggleableState, (String) null, startRestartGroup, i10, 2);
            final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
            Function3 function3 = new Function3() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    FiniteAnimationSpec CheckboxImpl$lambda$0;
                    CheckboxImpl$lambda$0 = CheckboxKt.CheckboxImpl$lambda$0(FiniteAnimationSpec.this, (Transition.Segment) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return CheckboxImpl$lambda$0;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844118987, "CC(animateFloat)N(transitionSpec,label,targetValueByState)1971@84243L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            int i11 = i2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
            if (updateTransition.isSeeking()) {
                i3 = i10;
                startRestartGroup.startReplaceGroup(1666827533);
                startRestartGroup.endReplaceGroup();
                currentState = updateTransition.getCurrentState();
            } else {
                startRestartGroup.startReplaceGroup(1666573488);
                ComposerKt.sourceInformation(startRestartGroup, "1864@79141L67");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054612652, "CC(remember):Transition.kt#9igjgp");
                boolean changed5 = startRestartGroup.changed(updateTransition);
                i3 = i10;
                currentState = startRestartGroup.rememberedValue();
                if (changed5 || currentState == Composer.INSTANCE.getEmpty()) {
                    companion = Snapshot.INSTANCE;
                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState3 = updateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        startRestartGroup.updateRememberedValue(currentState3);
                        currentState = currentState3;
                    } finally {
                    }
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            }
            ToggleableState toggleableState4 = (ToggleableState) currentState;
            startRestartGroup.startReplaceGroup(-768316570);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                toggleableState2 = toggleableState4;
                ComposerKt.traceEventStart(-768316570, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:492)");
            } else {
                toggleableState2 = toggleableState4;
            }
            int i12 = WhenMappings.$EnumSwitchMapping$0[toggleableState2.ordinal()];
            float f5 = 0.0f;
            if (i12 != 1) {
                if (i12 == 2) {
                    f = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceGroup();
                    Float valueOf = Float.valueOf(f);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
                    changed = startRestartGroup.changed(updateTransition);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<ToggleableState>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$$inlined$animateFloat$1
                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.state.ToggleableState, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function0
                            public final ToggleableState invoke() {
                                return Transition.this.getTargetState();
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ToggleableState toggleableState5 = (ToggleableState) ((State) rememberedValue).getValue();
                    startRestartGroup.startReplaceGroup(-768316570);
                    ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        f2 = valueOf;
                        toggleableState3 = toggleableState5;
                        i4 = -1;
                    } else {
                        f2 = valueOf;
                        toggleableState3 = toggleableState5;
                        i4 = -1;
                        ComposerKt.traceEventStart(-768316570, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:492)");
                    }
                    i5 = WhenMappings.$EnumSwitchMapping$0[toggleableState3.ordinal()];
                    if (i5 != 1) {
                        if (i5 == 2) {
                            f3 = 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            Float valueOf2 = Float.valueOf(f3);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
                            changed2 = startRestartGroup.changed(updateTransition);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<ToggleableState>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$$inlined$animateFloat$2
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Transition.Segment<ToggleableState> invoke() {
                                        return Transition.this.getSegment();
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            FiniteAnimationSpec finiteAnimationSpec = (FiniteAnimationSpec) function3.invoke(((State) rememberedValue2).getValue(), startRestartGroup, 0);
                            int i13 = i4;
                            final State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, f2, valueOf2, finiteAnimationSpec, vectorConverter, "FloatAnimation", startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Function3 function32 = new Function3() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    FiniteAnimationSpec CheckboxImpl$lambda$2;
                                    CheckboxImpl$lambda$2 = CheckboxKt.CheckboxImpl$lambda$2(FiniteAnimationSpec.this, (Transition.Segment) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                                    return CheckboxImpl$lambda$2;
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
                                boolean changed6 = startRestartGroup.changed(updateTransition);
                                currentState2 = startRestartGroup.rememberedValue();
                                if (changed6 || currentState2 == Composer.INSTANCE.getEmpty()) {
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
                            ToggleableState toggleableState6 = (ToggleableState) currentState2;
                            startRestartGroup.startReplaceGroup(1840054703);
                            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1840054703, 0, i13, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:510)");
                            }
                            i6 = WhenMappings.$EnumSwitchMapping$0[toggleableState6.ordinal()];
                            if (i6 != 1 || i6 == 2) {
                                f4 = 0.0f;
                            } else {
                                if (i6 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f4 = 1.0f;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            Float valueOf3 = Float.valueOf(f4);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
                            changed3 = startRestartGroup.changed(updateTransition);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<ToggleableState>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$$inlined$animateFloat$3
                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.state.ToggleableState, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final ToggleableState invoke() {
                                        return Transition.this.getTargetState();
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ToggleableState toggleableState7 = (ToggleableState) ((State) rememberedValue3).getValue();
                            startRestartGroup.startReplaceGroup(1840054703);
                            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1840054703, 0, i13, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:510)");
                            }
                            i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState7.ordinal()];
                            if (i7 != 1 && i7 != 2) {
                                if (i7 == 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f5 = 1.0f;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            Float valueOf4 = Float.valueOf(f5);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
                            changed4 = startRestartGroup.changed(updateTransition);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<ToggleableState>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$$inlined$animateFloat$4
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Transition.Segment<ToggleableState> invoke() {
                                        return Transition.this.getSegment();
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, valueOf4, (FiniteAnimationSpec) function32.invoke(((State) rememberedValue4).getValue(), startRestartGroup, 0), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
                            composer2 = startRestartGroup;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1869782464, "CC(remember):Checkbox.kt#9igjgp");
                            rememberedValue5 = composer2.rememberedValue();
                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                Object checkDrawingCache = new CheckDrawingCache(null, null, null, 7, null);
                                composer2.updateRememberedValue(checkDrawingCache);
                                rememberedValue5 = checkDrawingCache;
                            }
                            final CheckDrawingCache checkDrawingCache2 = (CheckDrawingCache) rememberedValue5;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (z5) {
                                composer2.startReplaceGroup(-2128586395);
                                ComposerKt.sourceInformation(composer2, "519@24663L30");
                                checkmarkColor$material3 = checkboxColors.checkmarkColor$material3(z, toggleableState, composer2, (i11 & 126) | (i9 & 896));
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-2128520210);
                                ComposerKt.sourceInformation(composer2, "521@24730L21");
                                checkmarkColor$material3 = checkboxColors.checkmarkColor$material3(toggleableState, composer2, i3 | ((i11 >> 6) & 112));
                                composer2.endReplaceGroup();
                            }
                            int i14 = (i11 & 126) | (i9 & 896);
                            final State<Color> boxColor$material3 = checkboxColors.boxColor$material3(z, toggleableState, composer2, i14);
                            final State<Color> borderColor$material3 = checkboxColors.borderColor$material3(z, toggleableState, composer2, i14);
                            Modifier m1263requiredSize3ABfNKs = SizeKt.m1263requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.INSTANCE.getCenter(), false, 2, null), z5 ? CheckboxTokens.INSTANCE.m5005getContainerSizeD9Ej5fM() : CheckboxSize);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1869763908, "CC(remember):Checkbox.kt#9igjgp");
                            boolean changed7 = composer2.changed(boxColor$material3) | composer2.changed(borderColor$material3);
                            if ((i11 & 458752) != 131072) {
                                if ((i11 & 262144) != 0) {
                                    stroke3 = stroke2;
                                } else {
                                    stroke3 = stroke2;
                                }
                                z2 = false;
                                boolean changed8 = changed7 | z2 | composer2.changed(checkmarkColor$material3) | composer2.changed(createTransitionAnimation) | composer2.changed(createTransitionAnimation2);
                                if ((i11 & 57344) == 16384) {
                                    if ((i11 & 32768) != 0) {
                                        stroke4 = stroke;
                                    } else {
                                        stroke4 = stroke;
                                    }
                                    z3 = false;
                                    z4 = changed8 | z3;
                                    Object rememberedValue6 = composer2.rememberedValue();
                                    if (!z4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        final State<Color> state = checkmarkColor$material3;
                                        final Stroke stroke5 = stroke3;
                                        modifier2 = m1263requiredSize3ABfNKs;
                                        i8 = 0;
                                        obj = new Function1() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                Unit CheckboxImpl$lambda$5$0;
                                                CheckboxImpl$lambda$5$0 = CheckboxKt.CheckboxImpl$lambda$5$0(State.this, borderColor$material3, stroke5, state, createTransitionAnimation, createTransitionAnimation2, stroke4, checkDrawingCache2, (DrawScope) obj2);
                                                return CheckboxImpl$lambda$5$0;
                                            }
                                        };
                                        composer2.updateRememberedValue(obj);
                                    } else {
                                        modifier2 = m1263requiredSize3ABfNKs;
                                        obj = rememberedValue6;
                                        i8 = 0;
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    CanvasKt.Canvas(modifier2, (Function1) obj, composer2, i8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    stroke4 = stroke;
                                }
                                z3 = true;
                                z4 = changed8 | z3;
                                Object rememberedValue62 = composer2.rememberedValue();
                                if (z4) {
                                }
                                final State state2 = checkmarkColor$material3;
                                final Stroke stroke52 = stroke3;
                                modifier2 = m1263requiredSize3ABfNKs;
                                i8 = 0;
                                obj = new Function1() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        Unit CheckboxImpl$lambda$5$0;
                                        CheckboxImpl$lambda$5$0 = CheckboxKt.CheckboxImpl$lambda$5$0(State.this, borderColor$material3, stroke52, state2, createTransitionAnimation, createTransitionAnimation2, stroke4, checkDrawingCache2, (DrawScope) obj2);
                                        return CheckboxImpl$lambda$5$0;
                                    }
                                };
                                composer2.updateRememberedValue(obj);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                CanvasKt.Canvas(modifier2, (Function1) obj, composer2, i8);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            } else {
                                stroke3 = stroke2;
                            }
                            z2 = true;
                            boolean changed82 = changed7 | z2 | composer2.changed(checkmarkColor$material3) | composer2.changed(createTransitionAnimation) | composer2.changed(createTransitionAnimation2);
                            if ((i11 & 57344) == 16384) {
                            }
                            z3 = true;
                            z4 = changed82 | z3;
                            Object rememberedValue622 = composer2.rememberedValue();
                            if (z4) {
                            }
                            final State state22 = checkmarkColor$material3;
                            final Stroke stroke522 = stroke3;
                            modifier2 = m1263requiredSize3ABfNKs;
                            i8 = 0;
                            obj = new Function1() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    Unit CheckboxImpl$lambda$5$0;
                                    CheckboxImpl$lambda$5$0 = CheckboxKt.CheckboxImpl$lambda$5$0(State.this, borderColor$material3, stroke522, state22, createTransitionAnimation, createTransitionAnimation2, stroke4, checkDrawingCache2, (DrawScope) obj2);
                                    return CheckboxImpl$lambda$5$0;
                                }
                            };
                            composer2.updateRememberedValue(obj);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            CanvasKt.Canvas(modifier2, (Function1) obj, composer2, i8);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        } else if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    f3 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Float valueOf22 = Float.valueOf(f3);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
                    changed2 = startRestartGroup.changed(updateTransition);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<ToggleableState>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$$inlined$animateFloat$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Transition.Segment<ToggleableState> invoke() {
                            return Transition.this.getSegment();
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    FiniteAnimationSpec finiteAnimationSpec2 = (FiniteAnimationSpec) function3.invoke(((State) rememberedValue2).getValue(), startRestartGroup, 0);
                    int i132 = i4;
                    final State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, f2, valueOf22, finiteAnimationSpec2, vectorConverter, "FloatAnimation", startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Function3 function322 = new Function3() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            FiniteAnimationSpec CheckboxImpl$lambda$2;
                            CheckboxImpl$lambda$2 = CheckboxKt.CheckboxImpl$lambda$2(FiniteAnimationSpec.this, (Transition.Segment) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                            return CheckboxImpl$lambda$2;
                        }
                    };
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844118987, "CC(animateFloat)N(transitionSpec,label,targetValueByState)1971@84243L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
                    if (updateTransition.isSeeking()) {
                    }
                    ToggleableState toggleableState62 = (ToggleableState) currentState2;
                    startRestartGroup.startReplaceGroup(1840054703);
                    ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i6 = WhenMappings.$EnumSwitchMapping$0[toggleableState62.ordinal()];
                    if (i6 != 1) {
                    }
                    f4 = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Float valueOf32 = Float.valueOf(f4);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
                    changed3 = startRestartGroup.changed(updateTransition);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<ToggleableState>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$$inlined$animateFloat$3
                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.state.ToggleableState, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        public final ToggleableState invoke() {
                            return Transition.this.getTargetState();
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ToggleableState toggleableState72 = (ToggleableState) ((State) rememberedValue3).getValue();
                    startRestartGroup.startReplaceGroup(1840054703);
                    ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState72.ordinal()];
                    if (i7 != 1) {
                        if (i7 == 3) {
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Float valueOf42 = Float.valueOf(f5);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
                    changed4 = startRestartGroup.changed(updateTransition);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed4) {
                    }
                    rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<ToggleableState>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$$inlined$animateFloat$4
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Transition.Segment<ToggleableState> invoke() {
                            return Transition.this.getSegment();
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, valueOf32, valueOf42, (FiniteAnimationSpec) function322.invoke(((State) rememberedValue4).getValue(), startRestartGroup, 0), vectorConverter22, "FloatAnimation", startRestartGroup, 0);
                    composer2 = startRestartGroup;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1869782464, "CC(remember):Checkbox.kt#9igjgp");
                    rememberedValue5 = composer2.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    }
                    final CheckDrawingCache checkDrawingCache22 = (CheckDrawingCache) rememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (z5) {
                    }
                    int i142 = (i11 & 126) | (i9 & 896);
                    final State boxColor$material32 = checkboxColors.boxColor$material3(z, toggleableState, composer2, i142);
                    final State borderColor$material32 = checkboxColors.borderColor$material3(z, toggleableState, composer2, i142);
                    Modifier m1263requiredSize3ABfNKs2 = SizeKt.m1263requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.INSTANCE.getCenter(), false, 2, null), z5 ? CheckboxTokens.INSTANCE.m5005getContainerSizeD9Ej5fM() : CheckboxSize);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1869763908, "CC(remember):Checkbox.kt#9igjgp");
                    boolean changed72 = composer2.changed(boxColor$material32) | composer2.changed(borderColor$material32);
                    if ((i11 & 458752) != 131072) {
                    }
                    z2 = true;
                    boolean changed822 = changed72 | z2 | composer2.changed(checkmarkColor$material3) | composer2.changed(createTransitionAnimation3) | composer2.changed(createTransitionAnimation22);
                    if ((i11 & 57344) == 16384) {
                    }
                    z3 = true;
                    z4 = changed822 | z3;
                    Object rememberedValue6222 = composer2.rememberedValue();
                    if (z4) {
                    }
                    final State state222 = checkmarkColor$material3;
                    final Stroke stroke5222 = stroke3;
                    modifier2 = m1263requiredSize3ABfNKs2;
                    i8 = 0;
                    obj = new Function1() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit CheckboxImpl$lambda$5$0;
                            CheckboxImpl$lambda$5$0 = CheckboxKt.CheckboxImpl$lambda$5$0(State.this, borderColor$material32, stroke5222, state222, createTransitionAnimation3, createTransitionAnimation22, stroke4, checkDrawingCache22, (DrawScope) obj2);
                            return CheckboxImpl$lambda$5$0;
                        }
                    };
                    composer2.updateRememberedValue(obj);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    CanvasKt.Canvas(modifier2, (Function1) obj, composer2, i8);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                } else if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            f = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf5 = Float.valueOf(f);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
            changed = startRestartGroup.changed(updateTransition);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<ToggleableState>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$$inlined$animateFloat$1
                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.state.ToggleableState, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final ToggleableState invoke() {
                    return Transition.this.getTargetState();
                }
            });
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ToggleableState toggleableState52 = (ToggleableState) ((State) rememberedValue).getValue();
            startRestartGroup.startReplaceGroup(-768316570);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
            }
            i5 = WhenMappings.$EnumSwitchMapping$0[toggleableState3.ordinal()];
            if (i5 != 1) {
            }
            f3 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf222 = Float.valueOf(f3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
            changed2 = startRestartGroup.changed(updateTransition);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<ToggleableState>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$$inlined$animateFloat$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Transition.Segment<ToggleableState> invoke() {
                    return Transition.this.getSegment();
                }
            });
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FiniteAnimationSpec finiteAnimationSpec22 = (FiniteAnimationSpec) function3.invoke(((State) rememberedValue2).getValue(), startRestartGroup, 0);
            int i1322 = i4;
            final State createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, f2, valueOf222, finiteAnimationSpec22, vectorConverter, "FloatAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function3 function3222 = new Function3() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    FiniteAnimationSpec CheckboxImpl$lambda$2;
                    CheckboxImpl$lambda$2 = CheckboxKt.CheckboxImpl$lambda$2(FiniteAnimationSpec.this, (Transition.Segment) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return CheckboxImpl$lambda$2;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844118987, "CC(animateFloat)N(transitionSpec,label,targetValueByState)1971@84243L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
            if (updateTransition.isSeeking()) {
            }
            ToggleableState toggleableState622 = (ToggleableState) currentState2;
            startRestartGroup.startReplaceGroup(1840054703);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
            }
            i6 = WhenMappings.$EnumSwitchMapping$0[toggleableState622.ordinal()];
            if (i6 != 1) {
            }
            f4 = 0.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf322 = Float.valueOf(f4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054592958, "CC(remember):Transition.kt#9igjgp");
            changed3 = startRestartGroup.changed(updateTransition);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<ToggleableState>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$$inlined$animateFloat$3
                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.state.ToggleableState, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final ToggleableState invoke() {
                    return Transition.this.getTargetState();
                }
            });
            startRestartGroup.updateRememberedValue(rememberedValue3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ToggleableState toggleableState722 = (ToggleableState) ((State) rememberedValue3).getValue();
            startRestartGroup.startReplaceGroup(1840054703);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
            }
            i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState722.ordinal()];
            if (i7 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf422 = Float.valueOf(f5);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1054589890, "CC(remember):Transition.kt#9igjgp");
            changed4 = startRestartGroup.changed(updateTransition);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<ToggleableState>>() { // from class: androidx.compose.material3.CheckboxKt$CheckboxImpl$$inlined$animateFloat$4
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Transition.Segment<ToggleableState> invoke() {
                    return Transition.this.getSegment();
                }
            });
            startRestartGroup.updateRememberedValue(rememberedValue4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf322, valueOf422, (FiniteAnimationSpec) function3222.invoke(((State) rememberedValue4).getValue(), startRestartGroup, 0), vectorConverter222, "FloatAnimation", startRestartGroup, 0);
            composer2 = startRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerStart(composer2, -1869782464, "CC(remember):Checkbox.kt#9igjgp");
            rememberedValue5 = composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            final CheckDrawingCache checkDrawingCache222 = (CheckDrawingCache) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (z5) {
            }
            int i1422 = (i11 & 126) | (i9 & 896);
            final State boxColor$material322 = checkboxColors.boxColor$material3(z, toggleableState, composer2, i1422);
            final State borderColor$material322 = checkboxColors.borderColor$material3(z, toggleableState, composer2, i1422);
            Modifier m1263requiredSize3ABfNKs22 = SizeKt.m1263requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.INSTANCE.getCenter(), false, 2, null), z5 ? CheckboxTokens.INSTANCE.m5005getContainerSizeD9Ej5fM() : CheckboxSize);
            ComposerKt.sourceInformationMarkerStart(composer2, -1869763908, "CC(remember):Checkbox.kt#9igjgp");
            boolean changed722 = composer2.changed(boxColor$material322) | composer2.changed(borderColor$material322);
            if ((i11 & 458752) != 131072) {
            }
            z2 = true;
            boolean changed8222 = changed722 | z2 | composer2.changed(checkmarkColor$material3) | composer2.changed(createTransitionAnimation32) | composer2.changed(createTransitionAnimation222);
            if ((i11 & 57344) == 16384) {
            }
            z3 = true;
            z4 = changed8222 | z3;
            Object rememberedValue62222 = composer2.rememberedValue();
            if (z4) {
            }
            final State state2222 = checkmarkColor$material3;
            final Stroke stroke52222 = stroke3;
            modifier2 = m1263requiredSize3ABfNKs22;
            i8 = 0;
            obj = new Function1() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit CheckboxImpl$lambda$5$0;
                    CheckboxImpl$lambda$5$0 = CheckboxKt.CheckboxImpl$lambda$5$0(State.this, borderColor$material322, stroke52222, state2222, createTransitionAnimation32, createTransitionAnimation222, stroke4, checkDrawingCache222, (DrawScope) obj2);
                    return CheckboxImpl$lambda$5$0;
                }
            };
            composer2.updateRememberedValue(obj);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            CanvasKt.Canvas(modifier2, (Function1) obj, composer2, i8);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.CheckboxKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit CheckboxImpl$lambda$6;
                    CheckboxImpl$lambda$6 = CheckboxKt.CheckboxImpl$lambda$6(z, toggleableState, modifier, checkboxColors, stroke, stroke2, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return CheckboxImpl$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec CheckboxImpl$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(1780794470);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1780794470, i, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:484)");
        }
        if (segment.getInitialState() != ToggleableState.Off && segment.getTargetState() == ToggleableState.Off) {
            finiteAnimationSpec = AnimationSpecKt.snap(100);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec CheckboxImpl$lambda$2(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(630790831);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(630790831, i, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:502)");
        }
        if (segment.getInitialState() == ToggleableState.Off) {
            finiteAnimationSpec = AnimationSpecKt.snap$default(0, 1, null);
        } else if (segment.getTargetState() == ToggleableState.Off) {
            finiteAnimationSpec = AnimationSpecKt.snap(100);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckboxImpl$lambda$5$0(State state, State state2, Stroke stroke, State state3, State state4, State state5, Stroke stroke2, CheckDrawingCache checkDrawingCache, DrawScope drawScope) {
        m2675drawBox1wkBAMs(drawScope, ((Color) state.getValue()).m6796unboximpl(), ((Color) state2.getValue()).m6796unboximpl(), drawScope.mo528toPx0680j_4(RadiusSize), stroke);
        m2676drawCheck3IgeMak(drawScope, ((Color) state3.getValue()).m6796unboximpl(), ((Number) state4.getValue()).floatValue(), ((Number) state5.getValue()).floatValue(), stroke2, checkDrawingCache);
        return Unit.INSTANCE;
    }

    /* renamed from: drawBox-1wkBAMs, reason: not valid java name */
    private static final void m2675drawBox1wkBAMs(DrawScope drawScope, long j, long j2, float f, Stroke stroke) {
        float width = stroke.getWidth() / 2.0f;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() >> 32));
        if (!Color.m6787equalsimpl0(j, j2)) {
            float width2 = stroke.getWidth();
            float width3 = stroke.getWidth();
            long m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits(width2) << 32) | (Float.floatToRawIntBits(width3) & 4294967295L));
            float f2 = 2;
            float width4 = intBitsToFloat - (stroke.getWidth() * f2);
            float width5 = intBitsToFloat - (stroke.getWidth() * f2);
            long m6579constructorimpl = Size.m6579constructorimpl((Float.floatToRawIntBits(width4) << 32) | (Float.floatToRawIntBits(width5) & 4294967295L));
            float max = Math.max(0.0f, f - stroke.getWidth());
            DrawScope.CC.m7381drawRoundRectuAw5IA$default(drawScope, j, m6511constructorimpl, m6579constructorimpl, CornerRadius.m6473constructorimpl((Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L)), Fill.INSTANCE, 0.0f, null, 0, 224, null);
            long m6511constructorimpl2 = Offset.m6511constructorimpl((Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(width) & 4294967295L));
            float width6 = intBitsToFloat - stroke.getWidth();
            float width7 = intBitsToFloat - stroke.getWidth();
            float f3 = f - width;
            DrawScope.CC.m7381drawRoundRectuAw5IA$default(drawScope, j2, m6511constructorimpl2, Size.m6579constructorimpl((Float.floatToRawIntBits(width7) & 4294967295L) | (Float.floatToRawIntBits(width6) << 32)), CornerRadius.m6473constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), stroke, 0.0f, null, 0, 224, null);
            return;
        }
        DrawScope.CC.m7381drawRoundRectuAw5IA$default(drawScope, j, 0L, Size.m6579constructorimpl((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), CornerRadius.m6473constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), Fill.INSTANCE, 0.0f, null, 0, 226, null);
    }

    /* renamed from: drawCheck-3IgeMak, reason: not valid java name */
    private static final void m2676drawCheck3IgeMak(DrawScope drawScope, long j, float f, float f2, Stroke stroke, CheckDrawingCache checkDrawingCache) {
        boolean z = ComposeMaterial3Flags.isCheckboxStylingFixEnabled;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo7294getSizeNHjbRc() >> 32));
        float f3 = z ? 0.65f : 0.7f;
        float f4 = z ? 0.25f : 0.2f;
        float f5 = z ? 0.75f : 0.8f;
        float lerp = MathHelpersKt.lerp(0.4f, 0.5f, f2);
        float lerp2 = MathHelpersKt.lerp(f3, 0.5f, f2);
        float lerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f2);
        float lerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f2);
        checkDrawingCache.getCheckPath().rewind();
        checkDrawingCache.getCheckPath().moveTo(f4 * intBitsToFloat, lerp3 * intBitsToFloat);
        checkDrawingCache.getCheckPath().lineTo(lerp * intBitsToFloat, lerp2 * intBitsToFloat);
        checkDrawingCache.getCheckPath().lineTo(f5 * intBitsToFloat, intBitsToFloat * lerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().rewind();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f, checkDrawingCache.getPathToDraw(), true);
        DrawScope.CC.m7375drawPathLG529CI$default(drawScope, checkDrawingCache.getPathToDraw(), j, 0.0f, stroke, null, 0, 52, null);
    }

    static {
        float f = 2;
        CheckboxDefaultPadding = Dp.m9732constructorimpl(f);
        RadiusSize = Dp.m9732constructorimpl(f);
    }
}
