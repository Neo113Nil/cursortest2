package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.RecyclerView;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ButtonDefaults {
    public static final float MinHeight;
    public static final float MinWidth;

    static {
        new PaddingValuesImpl(16.0f, 8.0f, 16.0f, 8.0f);
        MinWidth = 64.0f;
        MinHeight = 36.0f;
        new PaddingValuesImpl(8.0f, 8.0f, 8.0f, 8.0f);
    }

    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public static DefaultButtonColors m464buttonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = ((Colors) ((GapComposer) composer).consume(ColorsKt.LocalColors)).m485getPrimary0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            j2 = ColorsKt.m488contentColorForek8zF_U(j, composer);
        }
        if ((i2 & 4) != 0) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ColorsKt.LocalColors;
            GapComposer gapComposer = (GapComposer) composer;
            j3 = ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(0.12f, ((Colors) gapComposer.consume(staticProvidableCompositionLocal)).m484getOnSurface0d7_KjU(), 14), ((Colors) gapComposer.consume(staticProvidableCompositionLocal)).m486getSurface0d7_KjU());
        }
        if ((i2 & 8) != 0) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ColorsKt.LocalColors;
            GapComposer gapComposer2 = (GapComposer) composer;
            long m484getOnSurface0d7_KjU = ((Colors) gapComposer2.consume(staticProvidableCompositionLocal2)).m484getOnSurface0d7_KjU();
            long j5 = ((Color) gapComposer2.consume(ContentColorKt.LocalContentColor)).value;
            if (((Colors) gapComposer2.consume(staticProvidableCompositionLocal2)).isLight()) {
                ColorKt.m690luminance8_81llA(j5);
            } else {
                ColorKt.m690luminance8_81llA(j5);
            }
            j4 = Color.m675copywmQWz5c$default(0.38f, m484getOnSurface0d7_KjU, 14);
        }
        return new DefaultButtonColors(j, j2, j3, j4);
    }

    /* renamed from: elevation-R_JCAzs, reason: not valid java name */
    public static DefaultButtonElevation m465elevationR_JCAzs(int i, int i2, Composer composer) {
        float f = (i2 & 1) != 0 ? 2.0f : 0.0f;
        float f2 = (i2 & 2) != 0 ? 8.0f : 0.0f;
        float f3 = (i2 & 8) != 0 ? 4.0f : 0.0f;
        float f4 = (i2 & 16) != 0 ? 4.0f : 0.0f;
        boolean z = ((((i & 14) ^ 6) > 4 && ((GapComposer) composer).changed(f)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && ((GapComposer) composer).changed(f2)) || (i & 48) == 32) | ((((i & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && ((GapComposer) composer).changed(RecyclerView.DECELERATION_RATE)) || (i & MLKEMEngine.KyberPolyBytes) == 256) | ((((i & 7168) ^ 3072) > 2048 && ((GapComposer) composer).changed(f3)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && ((GapComposer) composer).changed(f4)) || (i & 24576) == 16384);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.Empty) {
            DefaultButtonElevation defaultButtonElevation = new DefaultButtonElevation(f, f2, RecyclerView.DECELERATION_RATE, f3, f4);
            gapComposer.updateRememberedValue(defaultButtonElevation);
            rememberedValue = defaultButtonElevation;
        }
        return (DefaultButtonElevation) rememberedValue;
    }
}
