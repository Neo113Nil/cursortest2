package androidx.compose.material3.internal;

import androidx.autofill.HintConstants;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: LinearWavyProgressModifiers.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u001a\u0084\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aC\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010%\"\u000e\u0010&\u001a\u00020'X\u0082T¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"linearWavyProgressIndicator", "Landroidx/compose/ui/Modifier;", NotificationCompat.CATEGORY_PROGRESS, "Lkotlin/Function0;", "", "amplitude", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "color", "Landroidx/compose/ui/graphics/Color;", "trackColor", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "trackStroke", "gapSize", "Landroidx/compose/ui/unit/Dp;", "stopSize", "wavelength", "waveSpeed", "linearWavyProgressIndicator-bMBChCs", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;JJLandroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/graphics/drawscope/Stroke;FFFF)Landroidx/compose/ui/Modifier;", "firstLineHeadProgress", "firstLineTailProgress", "secondLineHeadProgress", "secondLineTailProgress", "linearWavyProgressIndicator-OFGGHrU", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JJLandroidx/compose/ui/graphics/drawscope/Stroke;Landroidx/compose/ui/graphics/drawscope/Stroke;FFFF)Landroidx/compose/ui/Modifier;", "drawStopIndicator", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "progressEnd", "progressIndicatorSize", "Landroidx/compose/ui/geometry/Size;", "maxStopIndicatorSize", "horizontalInsets", "drawStopIndicator-VnkRyUA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJFFLandroidx/compose/ui/graphics/drawscope/Stroke;J)V", "MinAnimationDuration", "", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class LinearWavyProgressModifiersKt {
    private static final int MinAnimationDuration = 50;

    /* renamed from: linearWavyProgressIndicator-bMBChCs, reason: not valid java name */
    public static final Modifier m4805linearWavyProgressIndicatorbMBChCs(Modifier modifier, Function0<Float> function0, Function1<? super Float, Float> function1, long j, long j2, Stroke stroke, Stroke stroke2, float f, float f2, float f3, float f4) {
        return modifier.then(new DeterminateLinearWavyProgressElement(function0, function1, j, j2, stroke, stroke2, f, f2, f3, f4, null));
    }

    /* renamed from: linearWavyProgressIndicator-OFGGHrU, reason: not valid java name */
    public static final Modifier m4804linearWavyProgressIndicatorOFGGHrU(Modifier modifier, Function0<Float> function0, Function0<Float> function02, Function0<Float> function03, Function0<Float> function04, long j, long j2, Stroke stroke, Stroke stroke2, float f, float f2, float f3, float f4) {
        return modifier.then(new IndeterminateLinearWavyProgressElement(function0, function02, function03, function04, j, j2, stroke, stroke2, f, f3, f4, f2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawStopIndicator-VnkRyUA, reason: not valid java name */
    public static final void m4803drawStopIndicatorVnkRyUA(DrawScope drawScope, float f, long j, float f2, float f3, Stroke stroke, long j2) {
        float min = Math.min(stroke.getWidth(), drawScope.mo528toPx0680j_4(f2));
        int i = (int) (j >> 32);
        float intBitsToFloat = (Float.intBitsToFloat(i) - min) - (min == stroke.getWidth() ? 0.0f : stroke.getWidth() / 4.0f);
        float intBitsToFloat2 = (Float.intBitsToFloat(i) * f) + f3;
        if (intBitsToFloat <= intBitsToFloat2) {
            min = Math.max(0.0f, min - (intBitsToFloat2 - intBitsToFloat));
            intBitsToFloat = intBitsToFloat2;
        }
        if (min > 0.0f) {
            if (StrokeCap.m7168equalsimpl0(stroke.getCap(), StrokeCap.INSTANCE.m7173getRoundKaPHkGw())) {
                DrawScope.CC.m7366drawCircleVaOC9Bg$default(drawScope, j2, min / 2.0f, Offset.m6511constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat + r0) << 32)), 0.0f, null, null, 0, 120, null);
                return;
            }
            DrawScope.CC.m7379drawRectnJ9OG0$default(drawScope, j2, Offset.m6511constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (j & 4294967295L)) - min) / 2.0f) & 4294967295L)), Size.m6579constructorimpl((Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        }
    }
}
