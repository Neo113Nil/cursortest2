package androidx.camera.core.processing;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.moneybot.genie.ResolvedStyle;
import com.squareup.cash.moneybot.genie.SliderViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.RangesKt___RangesKt;
import okio.internal.ZipFilesKt$$ExternalSyntheticLambda4;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import xyz.block.genie.expressions.EvalHelpersKt;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieStateBinding;
import xyz.block.genie.state.GenieStateValue;
import xyz.block.genie.state.GenieViewState;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.KeyPath;

/* loaded from: classes3.dex */
public abstract class TargetUtils {
    public static final void SliderView(ComposePlatform.Slider slider, ResolvedStyle resolvedStyle, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        List list;
        SliderColors sliderColors;
        boolean z;
        KeyPath keyPath;
        slider.getClass();
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2064232756);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(slider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(resolvedStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = GenieCompositionLocalsKt.LocalGenieViewState;
            GenieViewState genieViewState = (GenieViewState) gapComposer.consume(staticProvidableCompositionLocal);
            float evalDouble = (float) EvalHelpersKt.evalDouble(expressionEvaluator, slider.minimum, genieViewState, 0.0d);
            float evalDouble2 = (float) EvalHelpersKt.evalDouble(expressionEvaluator, slider.maximum, genieViewState, 1.0d);
            float min = Math.min(evalDouble, evalDouble2);
            float max = Math.max(evalDouble, evalDouble2);
            Double evalDouble3 = EvalHelpersKt.evalDouble(expressionEvaluator, genieViewState, slider.steps);
            int doubleValue = evalDouble3 != null ? (int) evalDouble3.doubleValue() : 0;
            int i3 = doubleValue < 0 ? 0 : doubleValue;
            Binding binding = slider.binding;
            final double d = min;
            GenieViewState genieViewState2 = (GenieViewState) gapComposer.consume(staticProvidableCompositionLocal);
            if (binding == null || (keyPath = binding.key_path) == null || (list = keyPath.segments) == null) {
                list = EmptyList.INSTANCE;
            }
            boolean changed = gapComposer.changed(genieViewState2) | gapComposer.changed(list);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new GenieStateBinding(genieViewState2, list, new Function1() { // from class: xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        GenieStateValue genieStateValue = (GenieStateValue) obj;
                        return Double.valueOf(genieStateValue instanceof GenieStateValue.FloatValue ? ((GenieStateValue.FloatValue) genieStateValue).value : genieStateValue instanceof GenieStateValue.IntValue ? ((GenieStateValue.IntValue) genieStateValue).value : d);
                    }
                }, new ZipFilesKt$$ExternalSyntheticLambda4(9));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            GenieStateBinding genieStateBinding = (GenieStateBinding) rememberedValue;
            Color color = resolvedStyle.contentColor;
            if (color == null) {
                gapComposer.startReplaceGroup(217292936);
                gapComposer.end(false);
                sliderColors = null;
                z = false;
            } else {
                gapComposer.startReplaceGroup(217292937);
                long j = color.value;
                SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                long j2 = Color.Unspecified;
                SliderColors defaultSliderColors$material3 = SliderDefaults.getDefaultSliderColors$material3((ColorScheme) gapComposer.consume(ColorSchemeKt.LocalColorScheme));
                long j3 = j != 16 ? j : defaultSliderColors$material3.thumbColor;
                if (j == 16) {
                    j = defaultSliderColors$material3.activeTrackColor;
                }
                long j4 = j;
                long j5 = j2 != 16 ? j2 : defaultSliderColors$material3.activeTickColor;
                long j6 = j2 != 16 ? j2 : defaultSliderColors$material3.inactiveTrackColor;
                long j7 = j2 != 16 ? j2 : defaultSliderColors$material3.inactiveTickColor;
                long j8 = j2 != 16 ? j2 : defaultSliderColors$material3.disabledThumbColor;
                long j9 = j2 != 16 ? j2 : defaultSliderColors$material3.disabledActiveTrackColor;
                long j10 = j2 != 16 ? j2 : defaultSliderColors$material3.disabledActiveTickColor;
                long j11 = j2 != 16 ? j2 : defaultSliderColors$material3.disabledInactiveTrackColor;
                if (j2 == 16) {
                    j2 = defaultSliderColors$material3.disabledInactiveTickColor;
                }
                sliderColors = new SliderColors(j3, j4, j5, j6, j7, j8, j9, j10, j11, j2);
                z = false;
                gapComposer.end(false);
            }
            if (sliderColors == null) {
                gapComposer.startReplaceGroup(-547177124);
                SliderDefaults sliderDefaults2 = SliderDefaults.INSTANCE;
                sliderColors = SliderDefaults.colors(gapComposer);
            } else {
                gapComposer.startReplaceGroup(-547180472);
            }
            gapComposer.end(z);
            float coerceIn = RangesKt___RangesKt.coerceIn((float) ((Number) genieStateBinding.getValue()).doubleValue(), min, max);
            ClosedFloatRange closedFloatRange = new ClosedFloatRange(min, max);
            boolean changedInstance = gapComposer.changedInstance(genieStateBinding);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SliderViewKt$$ExternalSyntheticLambda0(genieStateBinding, 0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SliderKt.Slider(coerceIn, (Function1) rememberedValue2, modifier2, false, closedFloatRange, i3, sliderColors, null, gapComposer, i2 & 896);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(slider, resolvedStyle, modifier, i, 7);
        }
    }

    public static SpringSpec fast$default(zzb zzbVar) {
        zzbVar.getClass();
        return new SpringSpec(1.0f, 600.0f, null);
    }

    public static String getHumanReadableName(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    public static SpringSpec sharp$default(zzb zzbVar) {
        zzbVar.getClass();
        return new SpringSpec(1.0f, 1000.0f, null);
    }

    public static SpringSpec soft$default(zzb zzbVar) {
        zzbVar.getClass();
        return new SpringSpec(1.0f, 200.0f, null);
    }

    public static SpringSpec steady$default(zzb zzbVar) {
        zzbVar.getClass();
        return new SpringSpec(1.0f, 400.0f, null);
    }
}
