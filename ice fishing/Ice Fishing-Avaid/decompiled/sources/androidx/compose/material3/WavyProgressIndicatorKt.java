package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.internal.CircularWavyProgressModifiersKt;
import androidx.compose.material3.internal.LinearWavyProgressModifiersKt;
import androidx.compose.material3.tokens.MotionTokens;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* compiled from: WavyProgressIndicator.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u009c\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00040\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001ai\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0092\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00040\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001ai\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001d\u0010\u0019\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!¨\u0006$"}, d2 = {"LinearWavyProgressIndicator", "", NotificationCompat.CATEGORY_PROGRESS, "Lkotlin/Function0;", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "trackColor", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "trackStroke", "gapSize", "Landroidx/compose/ui/unit/Dp;", "stopSize", "amplitude", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "wavelength", "waveSpeed", "LinearWavyProgressIndicator-1YwxWKA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/graphics/drawscope/Stroke;FFLkotlin/jvm/functions/Function1;FFLandroidx/compose/runtime/Composer;III)V", "LinearWavyProgressIndicator-hvuEXSk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/graphics/drawscope/Stroke;FFFFLandroidx/compose/runtime/Composer;II)V", "CircularWavyProgressIndicator", "CircularWavyProgressIndicator-L8eD4gc", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/graphics/drawscope/Stroke;FLkotlin/jvm/functions/Function1;FFLandroidx/compose/runtime/Composer;II)V", "CircularWavyProgressIndicator-hvuEXSk", "IncreasingAmplitudeAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getIncreasingAmplitudeAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "DecreasingAmplitudeAnimationSpec", "getDecreasingAmplitudeAnimationSpec", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class WavyProgressIndicatorKt {
    private static final AnimationSpec<Float> IncreasingAmplitudeAnimationSpec = AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingStandardCubicBezier(), 2, null);
    private static final AnimationSpec<Float> DecreasingAmplitudeAnimationSpec = AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedAccelerateCubicBezier(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularWavyProgressIndicator_L8eD4gc$lambda$1(Function0 function0, Modifier modifier, long j, long j2, Stroke stroke, Stroke stroke2, float f, Function1 function1, float f2, float f3, int i, int i2, Composer composer, int i3) {
        m4616CircularWavyProgressIndicatorL8eD4gc(function0, modifier, j, j2, stroke, stroke2, f, function1, f2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularWavyProgressIndicator_hvuEXSk$lambda$1(Modifier modifier, long j, long j2, Stroke stroke, Stroke stroke2, float f, float f2, float f3, float f4, int i, int i2, Composer composer, int i3) {
        m4617CircularWavyProgressIndicatorhvuEXSk(modifier, j, j2, stroke, stroke2, f, f2, f3, f4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinearWavyProgressIndicator_1YwxWKA$lambda$1(Function0 function0, Modifier modifier, long j, long j2, Stroke stroke, Stroke stroke2, float f, float f2, Function1 function1, float f3, float f4, int i, int i2, int i3, Composer composer, int i4) {
        m4618LinearWavyProgressIndicator1YwxWKA(function0, modifier, j, j2, stroke, stroke2, f, f2, function1, f3, f4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinearWavyProgressIndicator_hvuEXSk$lambda$4(Modifier modifier, long j, long j2, Stroke stroke, Stroke stroke2, float f, float f2, float f3, float f4, int i, int i2, Composer composer, int i3) {
        m4619LinearWavyProgressIndicatorhvuEXSk(modifier, j, j2, stroke, stroke2, f, f2, f3, f4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016c  */
    /* renamed from: LinearWavyProgressIndicator-1YwxWKA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4618LinearWavyProgressIndicator1YwxWKA(final Function0<Float> function0, Modifier modifier, long j, long j2, Stroke stroke, Stroke stroke2, float f, float f2, Function1<? super Float, Float> function1, float f3, float f4, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long j3;
        int i5;
        long j4;
        float f5;
        Function1<? super Float, Float> function12;
        int i6;
        final float f6;
        Composer composer2;
        final long j5;
        final Modifier modifier3;
        final long j6;
        final Stroke stroke3;
        final float f7;
        final float f8;
        final Function1<? super Float, Float> function13;
        final Stroke stroke4;
        ScopeUpdateScope endRestartGroup;
        long j7;
        Stroke stroke5;
        Stroke stroke6;
        float f9;
        Function1<? super Float, Float> function14;
        float f10;
        float f11;
        int i7;
        Stroke stroke7;
        int i8;
        float f12;
        Function1<? super Float, Float> function15;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(2019304030);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearWavyProgressIndicator)N(progress,modifier,color:c#ui.graphics.Color,trackColor:c#ui.graphics.Color,stroke,trackStroke,gapSize:c#ui.unit.Dp,stopSize:c#ui.unit.Dp,amplitude,wavelength:c#ui.unit.Dp,waveSpeed:c#ui.unit.Dp)113@6037L317,109@5882L1193:WavyProgressIndicator.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i18 = i3 & 2;
        if (i18 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i17 = 256;
                        i4 |= i17;
                    }
                } else {
                    j3 = j;
                }
                i17 = 128;
                i4 |= i17;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    i5 = i18;
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i16 = 2048;
                        i4 |= i16;
                    }
                } else {
                    i5 = i18;
                    j4 = j2;
                }
                i16 = 1024;
                i4 |= i16;
            } else {
                i5 = i18;
                j4 = j2;
            }
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    if ((32768 & i) == 0 ? startRestartGroup.changed(stroke) : startRestartGroup.changedInstance(stroke)) {
                        i15 = 16384;
                        i4 |= i15;
                    }
                }
                i15 = 8192;
                i4 |= i15;
            }
            if ((196608 & i) == 0) {
                if ((i3 & 32) == 0) {
                    if ((262144 & i) == 0 ? startRestartGroup.changed(stroke2) : startRestartGroup.changedInstance(stroke2)) {
                        i14 = 131072;
                        i4 |= i14;
                    }
                }
                i14 = 65536;
                i4 |= i14;
            }
            if ((1572864 & i) != 0) {
                if ((i3 & 64) == 0) {
                    f5 = f;
                    if (startRestartGroup.changed(f5)) {
                        i13 = 1048576;
                        i4 |= i13;
                    }
                } else {
                    f5 = f;
                }
                i13 = 524288;
                i4 |= i13;
            } else {
                f5 = f;
            }
            if ((i & 12582912) == 0) {
                if ((i3 & 128) == 0 && startRestartGroup.changed(f2)) {
                    i12 = 8388608;
                    i4 |= i12;
                }
                i12 = 4194304;
                i4 |= i12;
            }
            if ((i & 100663296) != 0) {
                if ((i3 & 256) == 0) {
                    function12 = function1;
                    if (startRestartGroup.changedInstance(function12)) {
                        i11 = 67108864;
                        i4 |= i11;
                    }
                } else {
                    function12 = function1;
                }
                i11 = GroupFlagsKt.HasAuxSlotFlag;
                i4 |= i11;
            } else {
                function12 = function1;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0 && startRestartGroup.changed(f3)) {
                    i10 = GroupFlagsKt.HasMovableContentFlag;
                    i4 |= i10;
                }
                i10 = GroupFlagsKt.IsMovableContentFlag;
                i4 |= i10;
            }
            if ((i2 & 6) != 0) {
                if ((i3 & 1024) == 0 && startRestartGroup.changed(f4)) {
                    i9 = 4;
                    i6 = i2 | i9;
                }
                i9 = 2;
                i6 = i2 | i9;
            } else {
                i6 = i2;
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i6 & 3) != 2, i4 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "99@5245L14,100@5315L10,101@5378L21,102@5457L17");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
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
                        i6 &= -15;
                    }
                    stroke7 = stroke;
                    stroke6 = stroke2;
                    i7 = i4;
                    function14 = function12;
                    i8 = i6;
                    f10 = f3;
                    f12 = f4;
                    f11 = f2;
                } else {
                    Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 4) != 0) {
                        j7 = WavyProgressIndicatorDefaults.INSTANCE.getIndicatorColor(startRestartGroup, 0);
                        i4 &= -897;
                    } else {
                        j7 = j3;
                    }
                    if ((i3 & 8) != 0) {
                        j4 = WavyProgressIndicatorDefaults.INSTANCE.getTrackColor(startRestartGroup, 0);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        stroke5 = WavyProgressIndicatorDefaults.INSTANCE.getLinearIndicatorStroke(startRestartGroup, 0);
                        i4 &= -57345;
                    } else {
                        stroke5 = stroke;
                    }
                    if ((i3 & 32) != 0) {
                        stroke6 = WavyProgressIndicatorDefaults.INSTANCE.getLinearTrackStroke(startRestartGroup, 0);
                        i4 &= -458753;
                    } else {
                        stroke6 = stroke2;
                    }
                    if ((i3 & 64) != 0) {
                        f5 = WavyProgressIndicatorDefaults.INSTANCE.m4608getLinearIndicatorTrackGapSizeD9Ej5fM();
                        i4 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        f9 = WavyProgressIndicatorDefaults.INSTANCE.m4609getLinearTrackStopIndicatorSizeD9Ej5fM();
                        i4 &= -29360129;
                    } else {
                        f9 = f2;
                    }
                    if ((i3 & 256) != 0) {
                        function14 = WavyProgressIndicatorDefaults.INSTANCE.getIndicatorAmplitude();
                        i4 &= -234881025;
                    } else {
                        function14 = function12;
                    }
                    if ((i3 & 512) != 0) {
                        f10 = WavyProgressIndicatorDefaults.INSTANCE.m4606getLinearDeterminateWavelengthD9Ej5fM();
                        i4 &= -1879048193;
                    } else {
                        f10 = f3;
                    }
                    Modifier modifier4 = companion;
                    if ((i3 & 1024) != 0) {
                        f11 = f9;
                        i7 = i4;
                        f12 = f10;
                        stroke7 = stroke5;
                        i8 = i6 & (-15);
                    } else {
                        f11 = f9;
                        i7 = i4;
                        stroke7 = stroke5;
                        i8 = i6;
                        f12 = f4;
                    }
                    j3 = j7;
                    modifier2 = modifier4;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    function15 = function14;
                    ComposerKt.traceEventStart(2019304030, i7, i8, "androidx.compose.material3.LinearWavyProgressIndicator (WavyProgressIndicator.kt:108)");
                } else {
                    function15 = function14;
                }
                Modifier then = modifier2.then(AccessibilityUtilKt.getIncreaseVerticalSemanticsBounds());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -774014693, "CC(remember):WavyProgressIndicator.kt#9igjgp");
                boolean z = (i7 & 14) == 4;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit LinearWavyProgressIndicator_1YwxWKA$lambda$0$0;
                            LinearWavyProgressIndicator_1YwxWKA$lambda$0$0 = WavyProgressIndicatorKt.LinearWavyProgressIndicator_1YwxWKA$lambda$0$0(Function0.this, (SemanticsPropertyReceiver) obj);
                            return LinearWavyProgressIndicator_1YwxWKA$lambda$0$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float f13 = f12;
                Modifier m4805linearWavyProgressIndicatorbMBChCs = LinearWavyProgressModifiersKt.m4805linearWavyProgressIndicatorbMBChCs(ClipKt.clipToBounds(SizeKt.m1273sizeVpY3zN4(SemanticsModifierKt.semantics(then, true, (Function1) rememberedValue), WavyProgressIndicatorDefaults.INSTANCE.m4605getLinearContainerWidthD9Ej5fM(), WavyProgressIndicatorDefaults.INSTANCE.m4604getLinearContainerHeightD9Ej5fM())), function0, function15, j3, j4, stroke7, stroke6, f5, f11, f10, f13);
                Function1<? super Float, Float> function16 = function15;
                Stroke stroke8 = stroke7;
                float f14 = f11;
                SpacerKt.Spacer(m4805linearWavyProgressIndicatorbMBChCs, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                Modifier modifier5 = modifier2;
                f7 = f14;
                modifier3 = modifier5;
                composer2 = startRestartGroup;
                j5 = j4;
                stroke3 = stroke6;
                f6 = f13;
                float f15 = f10;
                stroke4 = stroke8;
                long j8 = j3;
                function13 = function16;
                f8 = f15;
                j6 = j8;
            } else {
                startRestartGroup.skipToGroupEnd();
                f6 = f4;
                composer2 = startRestartGroup;
                j5 = j4;
                modifier3 = modifier2;
                j6 = j3;
                stroke3 = stroke2;
                f7 = f2;
                f8 = f3;
                function13 = function12;
                stroke4 = stroke;
            }
            final float f16 = f5;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit LinearWavyProgressIndicator_1YwxWKA$lambda$1;
                        LinearWavyProgressIndicator_1YwxWKA$lambda$1 = WavyProgressIndicatorKt.LinearWavyProgressIndicator_1YwxWKA$lambda$1(Function0.this, modifier3, j6, j5, stroke4, stroke3, f16, f7, function13, f8, f6, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return LinearWavyProgressIndicator_1YwxWKA$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i6 & 3) != 2, i4 & 1)) {
        }
        final float f162 = f5;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinearWavyProgressIndicator_1YwxWKA$lambda$0$0(Function0 function0, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Object invoke = function0.invoke();
        if (Float.isNaN(((Number) invoke).floatValue())) {
            invoke = null;
        }
        Float f = (Float) invoke;
        float floatValue = f != null ? f.floatValue() : 0.0f;
        if (floatValue < 0.0f) {
            floatValue = 0.0f;
        }
        if (floatValue > 1.0f) {
            floatValue = 1.0f;
        }
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(floatValue, RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* renamed from: LinearWavyProgressIndicator-hvuEXSk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4619LinearWavyProgressIndicatorhvuEXSk(Modifier modifier, long j, long j2, Stroke stroke, Stroke stroke2, float f, float f2, float f3, float f4, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f5;
        float f6;
        final Modifier modifier3;
        Composer composer2;
        final long j5;
        final long j6;
        final float f7;
        final Stroke stroke3;
        final Stroke stroke4;
        final float f8;
        final float f9;
        ScopeUpdateScope endRestartGroup;
        Stroke stroke5;
        Stroke stroke6;
        float f10;
        float f11;
        Stroke stroke7;
        Stroke stroke8;
        long j7;
        long j8;
        float f12;
        float f13;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-2070567281);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearWavyProgressIndicator)N(modifier,color:c#ui.graphics.Color,trackColor:c#ui.graphics.Color,stroke,trackStroke,gapSize:c#ui.unit.Dp,amplitude,wavelength:c#ui.unit.Dp,waveSpeed:c#ui.unit.Dp)178@9454L65,180@9571L219,187@9842L219,194@10114L221,201@10388L221,219@11063L23,220@11132L23,221@11202L24,222@11273L24,208@10615L1062:WavyProgressIndicator.kt#uh7d8r");
        int i11 = i2 & 1;
        if (i11 != 0) {
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
                    i10 = 32;
                    i3 |= i10;
                }
            } else {
                j3 = j;
            }
            i10 = 16;
            i3 |= i10;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i9 = 256;
                    i3 |= i9;
                }
            } else {
                j4 = j2;
            }
            i9 = 128;
            i3 |= i9;
        } else {
            j4 = j2;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                if ((i & 4096) == 0 ? startRestartGroup.changed(stroke) : startRestartGroup.changedInstance(stroke)) {
                    i8 = 2048;
                    i3 |= i8;
                }
            }
            i8 = 1024;
            i3 |= i8;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                if ((32768 & i) == 0 ? startRestartGroup.changed(stroke2) : startRestartGroup.changedInstance(stroke2)) {
                    i7 = 16384;
                    i3 |= i7;
                }
            }
            i7 = 8192;
            i3 |= i7;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                f5 = f;
                if (startRestartGroup.changed(f5)) {
                    i6 = 131072;
                    i3 |= i6;
                }
            } else {
                f5 = f;
            }
            i6 = 65536;
            i3 |= i6;
        } else {
            f5 = f;
        }
        int i12 = i2 & 64;
        if (i12 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            f6 = f2;
            i3 |= startRestartGroup.changed(f6) ? 1048576 : 524288;
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0 && startRestartGroup.changed(f3)) {
                    i5 = 8388608;
                    i3 |= i5;
                }
                i5 = 4194304;
                i3 |= i5;
            }
            if ((i & 100663296) == 0) {
                if ((i2 & 256) == 0 && startRestartGroup.changed(f4)) {
                    i4 = 67108864;
                    i3 |= i4;
                }
                i4 = GroupFlagsKt.HasAuxSlotFlag;
                i3 |= i4;
            }
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "169@8902L14,170@8972L10,171@9035L21,172@9114L17");
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) != 0) {
                        j3 = WavyProgressIndicatorDefaults.INSTANCE.getIndicatorColor(startRestartGroup, 0);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        j4 = WavyProgressIndicatorDefaults.INSTANCE.getTrackColor(startRestartGroup, 0);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        stroke5 = WavyProgressIndicatorDefaults.INSTANCE.getLinearIndicatorStroke(startRestartGroup, 0);
                        i3 &= -7169;
                    } else {
                        stroke5 = stroke;
                    }
                    if ((i2 & 16) != 0) {
                        stroke6 = WavyProgressIndicatorDefaults.INSTANCE.getLinearTrackStroke(startRestartGroup, 0);
                        i3 &= -57345;
                    } else {
                        stroke6 = stroke2;
                    }
                    if ((i2 & 32) != 0) {
                        f5 = WavyProgressIndicatorDefaults.INSTANCE.m4608getLinearIndicatorTrackGapSizeD9Ej5fM();
                        i3 &= -458753;
                    }
                    if (i12 != 0) {
                        f6 = 1.0f;
                    }
                    if ((i2 & 128) != 0) {
                        f10 = WavyProgressIndicatorDefaults.INSTANCE.m4607getLinearIndeterminateWavelengthD9Ej5fM();
                        i3 = (-29360129) & i3;
                    } else {
                        f10 = f3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        stroke7 = stroke5;
                        stroke8 = stroke6;
                        j7 = j3;
                        j8 = j4;
                        f12 = f5;
                        f13 = f10;
                        f11 = f13;
                    } else {
                        f11 = f4;
                        stroke7 = stroke5;
                        stroke8 = stroke6;
                        j7 = j3;
                        j8 = j4;
                        f12 = f5;
                        f13 = f10;
                    }
                } else {
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
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                    }
                    stroke7 = stroke;
                    stroke8 = stroke2;
                    f13 = f3;
                    f11 = f4;
                    j7 = j3;
                    j8 = j4;
                    f12 = f5;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2070567281, i3, -1, "androidx.compose.material3.LinearWavyProgressIndicator (WavyProgressIndicator.kt:177)");
                }
                InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("LinearWavyProgressIndicatorProgress", startRestartGroup, 6, 0);
                final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, ProgressIndicatorKt.getLinearIndeterminateFirstLineHeadAnimationSpec(), "LinearWavyProgressIndicatorFirstHead", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
                final State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, ProgressIndicatorKt.getLinearIndeterminateFirstLineTailAnimationSpec(), "LinearWavyProgressIndicatorFirstTail", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
                final State<Float> animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, ProgressIndicatorKt.getLinearIndeterminateSecondLineHeadAnimationSpec(), "LinearWavyProgressIndicatorSecondHead", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
                final State<Float> animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, ProgressIndicatorKt.getLinearIndeterminateSecondLineTailAnimationSpec(), "LinearWavyProgressIndicatorSecondTail", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
                Modifier clipToBounds = ClipKt.clipToBounds(SizeKt.m1273sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier2.then(AccessibilityUtilKt.getIncreaseVerticalSemanticsBounds())), WavyProgressIndicatorDefaults.INSTANCE.m4605getLinearContainerWidthD9Ej5fM(), WavyProgressIndicatorDefaults.INSTANCE.m4604getLinearContainerHeightD9Ej5fM()));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1245226074, "CC(remember):WavyProgressIndicator.kt#9igjgp");
                boolean changed = startRestartGroup.changed(animateFloat);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            float LinearWavyProgressIndicator_hvuEXSk$lambda$0$0;
                            LinearWavyProgressIndicator_hvuEXSk$lambda$0$0 = WavyProgressIndicatorKt.LinearWavyProgressIndicator_hvuEXSk$lambda$0$0(State.this);
                            return Float.valueOf(LinearWavyProgressIndicator_hvuEXSk$lambda$0$0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1245223866, "CC(remember):WavyProgressIndicator.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(animateFloat2);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            float LinearWavyProgressIndicator_hvuEXSk$lambda$1$0;
                            LinearWavyProgressIndicator_hvuEXSk$lambda$1$0 = WavyProgressIndicatorKt.LinearWavyProgressIndicator_hvuEXSk$lambda$1$0(State.this);
                            return Float.valueOf(LinearWavyProgressIndicator_hvuEXSk$lambda$1$0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                Function0 function02 = (Function0) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1245221625, "CC(remember):WavyProgressIndicator.kt#9igjgp");
                boolean changed3 = startRestartGroup.changed(animateFloat3);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            float LinearWavyProgressIndicator_hvuEXSk$lambda$2$0;
                            LinearWavyProgressIndicator_hvuEXSk$lambda$2$0 = WavyProgressIndicatorKt.LinearWavyProgressIndicator_hvuEXSk$lambda$2$0(State.this);
                            return Float.valueOf(LinearWavyProgressIndicator_hvuEXSk$lambda$2$0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                Function0 function03 = (Function0) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1245219353, "CC(remember):WavyProgressIndicator.kt#9igjgp");
                boolean changed4 = startRestartGroup.changed(animateFloat4);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function0() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            float LinearWavyProgressIndicator_hvuEXSk$lambda$3$0;
                            LinearWavyProgressIndicator_hvuEXSk$lambda$3$0 = WavyProgressIndicatorKt.LinearWavyProgressIndicator_hvuEXSk$lambda$3$0(State.this);
                            return Float.valueOf(LinearWavyProgressIndicator_hvuEXSk$lambda$3$0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                Function0 function04 = (Function0) rememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float f14 = f6 >= 0.0f ? f6 : 0.0f;
                SpacerKt.Spacer(LinearWavyProgressModifiersKt.m4804linearWavyProgressIndicatorOFGGHrU(clipToBounds, function0, function02, function03, function04, j7, j8, stroke7, stroke8, f12, f14 > 1.0f ? 1.0f : f14, f13, f11), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                composer2 = startRestartGroup;
                j5 = j7;
                j6 = j8;
                stroke3 = stroke7;
                stroke4 = stroke8;
                f7 = f12;
                f8 = f13;
                f9 = f11;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
                j5 = j3;
                j6 = j4;
                f7 = f5;
                stroke3 = stroke;
                stroke4 = stroke2;
                f8 = f3;
                f9 = f4;
            }
            final float f15 = f6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit LinearWavyProgressIndicator_hvuEXSk$lambda$4;
                        LinearWavyProgressIndicator_hvuEXSk$lambda$4 = WavyProgressIndicatorKt.LinearWavyProgressIndicator_hvuEXSk$lambda$4(Modifier.this, j5, j6, stroke3, stroke4, f7, f15, f8, f9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return LinearWavyProgressIndicator_hvuEXSk$lambda$4;
                    }
                });
                return;
            }
            return;
        }
        f6 = f2;
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        final float f152 = f6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearWavyProgressIndicator_hvuEXSk$lambda$0$0(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearWavyProgressIndicator_hvuEXSk$lambda$1$0(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearWavyProgressIndicator_hvuEXSk$lambda$2$0(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearWavyProgressIndicator_hvuEXSk$lambda$3$0(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0145  */
    /* renamed from: CircularWavyProgressIndicator-L8eD4gc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4616CircularWavyProgressIndicatorL8eD4gc(Function0<Float> function0, Modifier modifier, long j, long j2, Stroke stroke, Stroke stroke2, float f, Function1<? super Float, Float> function1, float f2, float f3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        float f4;
        Function1<? super Float, Float> function12;
        float f5;
        final Function0<Float> function02;
        final Stroke stroke3;
        Composer composer2;
        final Modifier modifier3;
        final Stroke stroke4;
        final float f6;
        final float f7;
        final long j5;
        final Function1<? super Float, Float> function13;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        Stroke stroke5;
        Stroke stroke6;
        Function1<? super Float, Float> function14;
        int i4;
        float f8;
        Stroke stroke7;
        Function1<? super Float, Float> function15;
        boolean z;
        Object rememberedValue;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1437375010);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularWavyProgressIndicator)N(progress,modifier,color:c#ui.graphics.Color,trackColor:c#ui.graphics.Color,stroke,trackStroke,gapSize:c#ui.unit.Dp,amplitude,wavelength:c#ui.unit.Dp,waveSpeed:c#ui.unit.Dp)304@15574L485,289@14958L1107:WavyProgressIndicator.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i12 = 256;
                        i3 |= i12;
                    }
                } else {
                    j3 = j;
                }
                i12 = 128;
                i3 |= i12;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i11 = 2048;
                        i3 |= i11;
                    }
                } else {
                    j4 = j2;
                }
                i11 = 1024;
                i3 |= i11;
            } else {
                j4 = j2;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    if ((32768 & i) == 0 ? startRestartGroup.changed(stroke) : startRestartGroup.changedInstance(stroke)) {
                        i10 = 16384;
                        i3 |= i10;
                    }
                }
                i10 = 8192;
                i3 |= i10;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    if ((262144 & i) == 0 ? startRestartGroup.changed(stroke2) : startRestartGroup.changedInstance(stroke2)) {
                        i9 = 131072;
                        i3 |= i9;
                    }
                }
                i9 = 65536;
                i3 |= i9;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    f4 = f;
                    if (startRestartGroup.changed(f4)) {
                        i8 = 1048576;
                        i3 |= i8;
                    }
                } else {
                    f4 = f;
                }
                i8 = 524288;
                i3 |= i8;
            } else {
                f4 = f;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    function12 = function1;
                    if (startRestartGroup.changedInstance(function12)) {
                        i7 = 8388608;
                        i3 |= i7;
                    }
                } else {
                    function12 = function1;
                }
                i7 = 4194304;
                i3 |= i7;
            } else {
                function12 = function1;
            }
            if ((i & 100663296) != 0) {
                if ((i2 & 256) == 0) {
                    f5 = f2;
                    if (startRestartGroup.changed(f5)) {
                        i6 = 67108864;
                        i3 |= i6;
                    }
                } else {
                    f5 = f2;
                }
                i6 = GroupFlagsKt.HasAuxSlotFlag;
                i3 |= i6;
            } else {
                f5 = f2;
            }
            if ((i & 805306368) == 0) {
                if ((i2 & 512) == 0 && startRestartGroup.changed(f3)) {
                    i5 = GroupFlagsKt.HasMovableContentFlag;
                    i3 |= i5;
                }
                i5 = GroupFlagsKt.IsMovableContentFlag;
                i3 |= i5;
            }
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "280@14403L14,281@14473L10,282@14536L23,283@14617L19");
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        j3 = WavyProgressIndicatorDefaults.INSTANCE.getIndicatorColor(startRestartGroup, 0);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        j4 = WavyProgressIndicatorDefaults.INSTANCE.getTrackColor(startRestartGroup, 0);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        stroke5 = WavyProgressIndicatorDefaults.INSTANCE.getCircularIndicatorStroke(startRestartGroup, 0);
                        i3 &= -57345;
                    } else {
                        stroke5 = stroke;
                    }
                    if ((i2 & 32) != 0) {
                        stroke6 = WavyProgressIndicatorDefaults.INSTANCE.getCircularTrackStroke(startRestartGroup, 0);
                        i3 &= -458753;
                    } else {
                        stroke6 = stroke2;
                    }
                    if ((i2 & 64) != 0) {
                        f4 = WavyProgressIndicatorDefaults.INSTANCE.m4602getCircularIndicatorTrackGapSizeD9Ej5fM();
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        function14 = WavyProgressIndicatorDefaults.INSTANCE.getIndicatorAmplitude();
                        i3 &= -29360129;
                    } else {
                        function14 = function12;
                    }
                    if ((i2 & 256) != 0) {
                        f5 = WavyProgressIndicatorDefaults.INSTANCE.m4603getCircularWavelengthD9Ej5fM();
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        i4 = i3 & (-1879048193);
                        f8 = f5;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            stroke7 = stroke5;
                            function15 = function14;
                        } else {
                            stroke7 = stroke5;
                            function15 = function14;
                            ComposerKt.traceEventStart(-1437375010, i4, -1, "androidx.compose.material3.CircularWavyProgressIndicator (WavyProgressIndicator.kt:288)");
                        }
                        float f9 = f5;
                        float f10 = f8;
                        Modifier m4771circularWavyProgressIndicator4ohQjRg = CircularWavyProgressModifiersKt.m4771circularWavyProgressIndicator4ohQjRg(SizeKt.m1271size3ABfNKs(modifier2, WavyProgressIndicatorDefaults.INSTANCE.m4601getCircularContainerSizeD9Ej5fM()), function0, j3, j4, stroke7, stroke6, f4, function15, f9, f10);
                        function02 = function0;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1662127331, "CC(remember):WavyProgressIndicator.kt#9igjgp");
                        z = (i4 & 14) != 4;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function1() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit CircularWavyProgressIndicator_L8eD4gc$lambda$0$0;
                                    CircularWavyProgressIndicator_L8eD4gc$lambda$0$0 = WavyProgressIndicatorKt.CircularWavyProgressIndicator_L8eD4gc$lambda$0$0(Function0.this, (SemanticsPropertyReceiver) obj);
                                    return CircularWavyProgressIndicator_L8eD4gc$lambda$0$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        SpacerKt.Spacer(SemanticsModifierKt.semantics(m4771circularWavyProgressIndicator4ohQjRg, true, (Function1) rememberedValue), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j7 = j4;
                        f7 = f9;
                        j6 = j7;
                        composer2 = startRestartGroup;
                        modifier3 = modifier2;
                        j5 = j3;
                        f6 = f10;
                        function13 = function15;
                        stroke4 = stroke6;
                        stroke3 = stroke7;
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
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                    }
                    if ((i2 & 512) != 0) {
                        i3 &= -1879048193;
                    }
                    stroke5 = stroke;
                    stroke6 = stroke2;
                    function14 = function12;
                }
                i4 = i3;
                f8 = f3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                float f92 = f5;
                float f102 = f8;
                Modifier m4771circularWavyProgressIndicator4ohQjRg2 = CircularWavyProgressModifiersKt.m4771circularWavyProgressIndicator4ohQjRg(SizeKt.m1271size3ABfNKs(modifier2, WavyProgressIndicatorDefaults.INSTANCE.m4601getCircularContainerSizeD9Ej5fM()), function0, j3, j4, stroke7, stroke6, f4, function15, f92, f102);
                function02 = function0;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1662127331, "CC(remember):WavyProgressIndicator.kt#9igjgp");
                if ((i4 & 14) != 4) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new Function1() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit CircularWavyProgressIndicator_L8eD4gc$lambda$0$0;
                        CircularWavyProgressIndicator_L8eD4gc$lambda$0$0 = WavyProgressIndicatorKt.CircularWavyProgressIndicator_L8eD4gc$lambda$0$0(Function0.this, (SemanticsPropertyReceiver) obj);
                        return CircularWavyProgressIndicator_L8eD4gc$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                SpacerKt.Spacer(SemanticsModifierKt.semantics(m4771circularWavyProgressIndicator4ohQjRg2, true, (Function1) rememberedValue), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                long j72 = j4;
                f7 = f92;
                j6 = j72;
                composer2 = startRestartGroup;
                modifier3 = modifier2;
                j5 = j3;
                f6 = f102;
                function13 = function15;
                stroke4 = stroke6;
                stroke3 = stroke7;
            } else {
                function02 = function0;
                startRestartGroup.skipToGroupEnd();
                stroke3 = stroke;
                composer2 = startRestartGroup;
                modifier3 = modifier2;
                stroke4 = stroke2;
                long j8 = j4;
                f6 = f3;
                f7 = f5;
                j5 = j3;
                function13 = function12;
                j6 = j8;
            }
            final float f11 = f4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CircularWavyProgressIndicator_L8eD4gc$lambda$1;
                        CircularWavyProgressIndicator_L8eD4gc$lambda$1 = WavyProgressIndicatorKt.CircularWavyProgressIndicator_L8eD4gc$lambda$1(Function0.this, modifier3, j5, j6, stroke3, stroke4, f11, function13, f7, f6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return CircularWavyProgressIndicator_L8eD4gc$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        final float f112 = f4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularWavyProgressIndicator_L8eD4gc$lambda$0$0(Function0 function0, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        float coerceIn = RangesKt.coerceIn(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f);
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(Float.isNaN(coerceIn) ? 0.0f : coerceIn, RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0130  */
    /* renamed from: CircularWavyProgressIndicator-hvuEXSk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4617CircularWavyProgressIndicatorhvuEXSk(Modifier modifier, long j, long j2, Stroke stroke, Stroke stroke2, float f, float f2, float f3, float f4, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f5;
        float f6;
        final Stroke stroke3;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final float f7;
        final Stroke stroke4;
        final float f8;
        final float f9;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Stroke stroke5;
        int i5;
        Stroke stroke6;
        float f10;
        float f11;
        float f12;
        int i6;
        float f13;
        Stroke stroke7;
        Stroke stroke8;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(958856149);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularWavyProgressIndicator)N(modifier,color:c#ui.graphics.Color,trackColor:c#ui.graphics.Color,stroke,trackStroke,gapSize:c#ui.unit.Dp,amplitude,wavelength:c#ui.unit.Dp,waveSpeed:c#ui.unit.Dp)359@18671L813:WavyProgressIndicator.kt#uh7d8r");
        int i14 = i2 & 1;
        if (i14 != 0) {
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
                    i13 = 32;
                    i3 |= i13;
                }
            } else {
                j3 = j;
            }
            i13 = 16;
            i3 |= i13;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i12 = 256;
                    i3 |= i12;
                }
            } else {
                j4 = j2;
            }
            i12 = 128;
            i3 |= i12;
        } else {
            j4 = j2;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                if ((i & 4096) == 0 ? startRestartGroup.changed(stroke) : startRestartGroup.changedInstance(stroke)) {
                    i11 = 2048;
                    i3 |= i11;
                }
            }
            i11 = 1024;
            i3 |= i11;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                if ((32768 & i) == 0 ? startRestartGroup.changed(stroke2) : startRestartGroup.changedInstance(stroke2)) {
                    i10 = 16384;
                    i3 |= i10;
                }
            }
            i10 = 8192;
            i3 |= i10;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                f5 = f;
                if (startRestartGroup.changed(f5)) {
                    i9 = 131072;
                    i3 |= i9;
                }
            } else {
                f5 = f;
            }
            i9 = 65536;
            i3 |= i9;
        } else {
            f5 = f;
        }
        int i15 = i2 & 64;
        if (i15 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            f6 = f2;
            i3 |= startRestartGroup.changed(f6) ? 1048576 : 524288;
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0 && startRestartGroup.changed(f3)) {
                    i8 = 8388608;
                    i3 |= i8;
                }
                i8 = 4194304;
                i3 |= i8;
            }
            if ((i & 100663296) == 0) {
                if ((i2 & 256) == 0 && startRestartGroup.changed(f4)) {
                    i7 = 67108864;
                    i3 |= i7;
                }
                i7 = GroupFlagsKt.HasAuxSlotFlag;
                i3 |= i7;
            }
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "350@18149L14,351@18219L10,352@18282L23,353@18363L19");
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) != 0) {
                        i4 = 0;
                        j3 = WavyProgressIndicatorDefaults.INSTANCE.getIndicatorColor(startRestartGroup, 0);
                        i3 &= -113;
                    } else {
                        i4 = 0;
                    }
                    if ((i2 & 4) != 0) {
                        j4 = WavyProgressIndicatorDefaults.INSTANCE.getTrackColor(startRestartGroup, i4);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        stroke5 = WavyProgressIndicatorDefaults.INSTANCE.getCircularIndicatorStroke(startRestartGroup, i4);
                        i3 &= -7169;
                    } else {
                        stroke5 = stroke;
                    }
                    if ((i2 & 16) != 0) {
                        i5 = -234881025;
                        stroke6 = WavyProgressIndicatorDefaults.INSTANCE.getCircularTrackStroke(startRestartGroup, i4);
                        i3 &= -57345;
                    } else {
                        i5 = -234881025;
                        stroke6 = stroke2;
                    }
                    if ((i2 & 32) != 0) {
                        f10 = WavyProgressIndicatorDefaults.INSTANCE.m4602getCircularIndicatorTrackGapSizeD9Ej5fM();
                        i3 &= -458753;
                    } else {
                        f10 = f5;
                    }
                    f11 = i15 != 0 ? 1.0f : f6;
                    if ((i2 & 128) != 0) {
                        f12 = WavyProgressIndicatorDefaults.INSTANCE.m4603getCircularWavelengthD9Ej5fM();
                        i3 &= -29360129;
                    } else {
                        f12 = f3;
                    }
                    if ((i2 & 256) != 0) {
                        i6 = i3 & i5;
                        f13 = f12;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            stroke7 = stroke5;
                            stroke8 = stroke6;
                        } else {
                            stroke7 = stroke5;
                            stroke8 = stroke6;
                            ComposerKt.traceEventStart(958856149, i6, -1, "androidx.compose.material3.CircularWavyProgressIndicator (WavyProgressIndicator.kt:358)");
                        }
                        Modifier m1271size3ABfNKs = SizeKt.m1271size3ABfNKs(modifier2, WavyProgressIndicatorDefaults.INSTANCE.m4601getCircularContainerSizeD9Ej5fM());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        float f14 = f10;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                        int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1271size3ABfNKs);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Modifier modifier4 = modifier2;
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
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1902088322, "C360@18764L452,375@19417L61:WavyProgressIndicator.kt#uh7d8r");
                        float f15 = f13;
                        float f16 = f11;
                        Stroke stroke9 = stroke7;
                        Stroke stroke10 = stroke8;
                        f6 = f16;
                        SpacerKt.Spacer(CircularWavyProgressModifiersKt.m4770circularWavyProgressIndicator4JQtiWo(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), j3, j4, stroke7, stroke8, f14, f16, f12, f15), startRestartGroup, 0);
                        SpacerKt.Spacer(ProgressSemanticsKt.progressSemantics(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = startRestartGroup;
                        j5 = j3;
                        f7 = f14;
                        modifier3 = modifier4;
                        f9 = f15;
                        stroke4 = stroke10;
                        stroke3 = stroke9;
                        j6 = j4;
                        f8 = f12;
                    }
                } else {
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
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                    }
                    stroke5 = stroke;
                    stroke6 = stroke2;
                    f12 = f3;
                    f10 = f5;
                    f11 = f6;
                }
                i6 = i3;
                f13 = f4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier m1271size3ABfNKs2 = SizeKt.m1271size3ABfNKs(modifier2, WavyProgressIndicatorDefaults.INSTANCE.m4601getCircularContainerSizeD9Ej5fM());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                float f142 = f10;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1271size3ABfNKs2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier42 = modifier2;
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1902088322, "C360@18764L452,375@19417L61:WavyProgressIndicator.kt#uh7d8r");
                float f152 = f13;
                float f162 = f11;
                Stroke stroke92 = stroke7;
                Stroke stroke102 = stroke8;
                f6 = f162;
                SpacerKt.Spacer(CircularWavyProgressModifiersKt.m4770circularWavyProgressIndicator4JQtiWo(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), j3, j4, stroke7, stroke8, f142, f162, f12, f152), startRestartGroup, 0);
                SpacerKt.Spacer(ProgressSemanticsKt.progressSemantics(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                j5 = j3;
                f7 = f142;
                modifier3 = modifier42;
                f9 = f152;
                stroke4 = stroke102;
                stroke3 = stroke92;
                j6 = j4;
                f8 = f12;
            } else {
                startRestartGroup.skipToGroupEnd();
                stroke3 = stroke;
                composer2 = startRestartGroup;
                modifier3 = modifier2;
                j5 = j3;
                j6 = j4;
                f7 = f5;
                stroke4 = stroke2;
                f8 = f3;
                f9 = f4;
            }
            final float f17 = f6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CircularWavyProgressIndicator_hvuEXSk$lambda$1;
                        CircularWavyProgressIndicator_hvuEXSk$lambda$1 = WavyProgressIndicatorKt.CircularWavyProgressIndicator_hvuEXSk$lambda$1(Modifier.this, j5, j6, stroke3, stroke4, f7, f17, f8, f9, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return CircularWavyProgressIndicator_hvuEXSk$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        f6 = f2;
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        final float f172 = f6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final AnimationSpec<Float> getIncreasingAmplitudeAnimationSpec() {
        return IncreasingAmplitudeAnimationSpec;
    }

    public static final AnimationSpec<Float> getDecreasingAmplitudeAnimationSpec() {
        return DecreasingAmplitudeAnimationSpec;
    }
}
