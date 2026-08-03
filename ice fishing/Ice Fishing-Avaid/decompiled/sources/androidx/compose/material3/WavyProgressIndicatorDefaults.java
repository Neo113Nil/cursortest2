package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: WavyProgressIndicator.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u0019\u001a\u00020\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001e\u001a\u00020\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010 \u001a\u00020\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b!\u0010\u001cR\u0013\u0010\"\u001a\u00020\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001cR\u0013\u0010$\u001a\u00020\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b%\u0010\u001cR\u0013\u0010&\u001a\u00020\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b'\u0010\u001cR\u0013\u0010(\u001a\u00020\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b)\u0010\u001cR\u0013\u0010*\u001a\u00020\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b+\u0010\u001cR\u0013\u0010,\u001a\u00020\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b-\u0010\u001cR,\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00060/¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Landroidx/compose/material3/WavyProgressIndicatorDefaults;", "", "<init>", "()V", "ProgressAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "getProgressAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "indicatorColor", "Landroidx/compose/ui/graphics/Color;", "getIndicatorColor", "(Landroidx/compose/runtime/Composer;I)J", "trackColor", "getTrackColor", "linearIndicatorStroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "getLinearIndicatorStroke", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/drawscope/Stroke;", "circularIndicatorStroke", "getCircularIndicatorStroke", "linearTrackStroke", "getLinearTrackStroke", "circularTrackStroke", "getCircularTrackStroke", "LinearDeterminateWavelength", "Landroidx/compose/ui/unit/Dp;", "getLinearDeterminateWavelength-D9Ej5fM", "()F", "F", "LinearIndeterminateWavelength", "getLinearIndeterminateWavelength-D9Ej5fM", "LinearContainerHeight", "getLinearContainerHeight-D9Ej5fM", "LinearContainerWidth", "getLinearContainerWidth-D9Ej5fM", "LinearTrackStopIndicatorSize", "getLinearTrackStopIndicatorSize-D9Ej5fM", "CircularContainerSize", "getCircularContainerSize-D9Ej5fM", "CircularWavelength", "getCircularWavelength-D9Ej5fM", "LinearIndicatorTrackGapSize", "getLinearIndicatorTrackGapSize-D9Ej5fM", "CircularIndicatorTrackGapSize", "getCircularIndicatorTrackGapSize-D9Ej5fM", "indicatorAmplitude", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, NotificationCompat.CATEGORY_PROGRESS, "getIndicatorAmplitude", "()Lkotlin/jvm/functions/Function1;", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class WavyProgressIndicatorDefaults {
    public static final WavyProgressIndicatorDefaults INSTANCE = new WavyProgressIndicatorDefaults();
    private static final AnimationSpec<Float> ProgressAnimationSpec = AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingLinearCubicBezier(), 2, null);
    private static final float LinearDeterminateWavelength = LinearProgressIndicatorTokens.INSTANCE.m5311getActiveWaveWavelengthD9Ej5fM();
    private static final float LinearIndeterminateWavelength = LinearProgressIndicatorTokens.INSTANCE.m5313getIndeterminateActiveWaveWavelengthD9Ej5fM();
    private static final float LinearContainerHeight = LinearProgressIndicatorTokens.INSTANCE.m5318getWaveHeightD9Ej5fM();
    private static final float LinearContainerWidth = Dp.m9732constructorimpl(240);
    private static final float LinearTrackStopIndicatorSize = LinearProgressIndicatorTokens.INSTANCE.m5314getStopSizeD9Ej5fM();
    private static final float CircularContainerSize = CircularProgressIndicatorTokens.INSTANCE.m5024getWaveSizeD9Ej5fM();
    private static final float CircularWavelength = CircularProgressIndicatorTokens.INSTANCE.m5020getActiveWaveWavelengthD9Ej5fM();
    private static final float LinearIndicatorTrackGapSize = LinearProgressIndicatorTokens.INSTANCE.m5316getTrackActiveSpaceD9Ej5fM();
    private static final float CircularIndicatorTrackGapSize = CircularProgressIndicatorTokens.INSTANCE.m5022getTrackActiveSpaceD9Ej5fM();
    private static final Function1<Float, Float> indicatorAmplitude = new Function1() { // from class: androidx.compose.material3.WavyProgressIndicatorDefaults$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            float indicatorAmplitude$lambda$0;
            indicatorAmplitude$lambda$0 = WavyProgressIndicatorDefaults.indicatorAmplitude$lambda$0(((Float) obj).floatValue());
            return Float.valueOf(indicatorAmplitude$lambda$0);
        }
    };
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float indicatorAmplitude$lambda$0(float f) {
        return (f <= 0.1f || f >= 0.95f) ? 0.0f : 1.0f;
    }

    private WavyProgressIndicatorDefaults() {
    }

    public final AnimationSpec<Float> getProgressAnimationSpec() {
        return ProgressAnimationSpec;
    }

    public final long getIndicatorColor(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -638038381, "C(<get-indicatorColor>)395@20132L5:WavyProgressIndicator.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-638038381, i, -1, "androidx.compose.material3.WavyProgressIndicatorDefaults.<get-indicatorColor> (WavyProgressIndicator.kt:395)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getTrackColor(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 2105992467, "C(<get-trackColor>)399@20264L5:WavyProgressIndicator.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2105992467, i, -1, "androidx.compose.material3.WavyProgressIndicatorDefaults.<get-trackColor> (WavyProgressIndicator.kt:399)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Stroke getLinearIndicatorStroke(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1183295526, "C(<get-linearIndicatorStroke>)407@20501L7:WavyProgressIndicator.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1183295526, i, -1, "androidx.compose.material3.WavyProgressIndicatorDefaults.<get-linearIndicatorStroke> (WavyProgressIndicator.kt:405)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Stroke stroke = new Stroke(((Density) consume).mo528toPx0680j_4(LinearProgressIndicatorTokens.INSTANCE.m5309getActiveThicknessD9Ej5fM()), 0.0f, StrokeCap.INSTANCE.m7173getRoundKaPHkGw(), 0, null, 26, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stroke;
    }

    public final Stroke getCircularIndicatorStroke(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -767650394, "C(<get-circularIndicatorStroke>)419@20900L7:WavyProgressIndicator.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-767650394, i, -1, "androidx.compose.material3.WavyProgressIndicatorDefaults.<get-circularIndicatorStroke> (WavyProgressIndicator.kt:417)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Stroke stroke = new Stroke(((Density) consume).mo528toPx0680j_4(CircularProgressIndicatorTokens.INSTANCE.m5018getActiveThicknessD9Ej5fM()), 0.0f, StrokeCap.INSTANCE.m7173getRoundKaPHkGw(), 0, null, 26, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stroke;
    }

    public final Stroke getLinearTrackStroke(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 892954918, "C(<get-linearTrackStroke>)431@21282L7:WavyProgressIndicator.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(892954918, i, -1, "androidx.compose.material3.WavyProgressIndicatorDefaults.<get-linearTrackStroke> (WavyProgressIndicator.kt:429)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Stroke stroke = new Stroke(((Density) consume).mo528toPx0680j_4(LinearProgressIndicatorTokens.INSTANCE.m5317getTrackThicknessD9Ej5fM()), 0.0f, StrokeCap.INSTANCE.m7173getRoundKaPHkGw(), 0, null, 26, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stroke;
    }

    public final Stroke getCircularTrackStroke(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 916794022, "C(<get-circularTrackStroke>)443@21665L7:WavyProgressIndicator.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(916794022, i, -1, "androidx.compose.material3.WavyProgressIndicatorDefaults.<get-circularTrackStroke> (WavyProgressIndicator.kt:441)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Stroke stroke = new Stroke(((Density) consume).mo528toPx0680j_4(CircularProgressIndicatorTokens.INSTANCE.m5023getTrackThicknessD9Ej5fM()), 0.0f, StrokeCap.INSTANCE.m7173getRoundKaPHkGw(), 0, null, 26, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stroke;
    }

    /* renamed from: getLinearDeterminateWavelength-D9Ej5fM, reason: not valid java name */
    public final float m4606getLinearDeterminateWavelengthD9Ej5fM() {
        return LinearDeterminateWavelength;
    }

    /* renamed from: getLinearIndeterminateWavelength-D9Ej5fM, reason: not valid java name */
    public final float m4607getLinearIndeterminateWavelengthD9Ej5fM() {
        return LinearIndeterminateWavelength;
    }

    /* renamed from: getLinearContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4604getLinearContainerHeightD9Ej5fM() {
        return LinearContainerHeight;
    }

    /* renamed from: getLinearContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m4605getLinearContainerWidthD9Ej5fM() {
        return LinearContainerWidth;
    }

    /* renamed from: getLinearTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m4609getLinearTrackStopIndicatorSizeD9Ej5fM() {
        return LinearTrackStopIndicatorSize;
    }

    /* renamed from: getCircularContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m4601getCircularContainerSizeD9Ej5fM() {
        return CircularContainerSize;
    }

    /* renamed from: getCircularWavelength-D9Ej5fM, reason: not valid java name */
    public final float m4603getCircularWavelengthD9Ej5fM() {
        return CircularWavelength;
    }

    /* renamed from: getLinearIndicatorTrackGapSize-D9Ej5fM, reason: not valid java name */
    public final float m4608getLinearIndicatorTrackGapSizeD9Ej5fM() {
        return LinearIndicatorTrackGapSize;
    }

    /* renamed from: getCircularIndicatorTrackGapSize-D9Ej5fM, reason: not valid java name */
    public final float m4602getCircularIndicatorTrackGapSizeD9Ej5fM() {
        return CircularIndicatorTrackGapSize;
    }

    public final Function1<Float, Float> getIndicatorAmplitude() {
        return indicatorAmplitude;
    }
}
