package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class DefaultElevationOverlay {
    public static final DefaultElevationOverlay INSTANCE = new DefaultElevationOverlay();

    /* renamed from: apply-7g2Lkgo, reason: not valid java name */
    public static long m490apply7g2Lkgo(long j, float f, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1687113661);
        Colors colors = (Colors) gapComposer.consume(ColorsKt.LocalColors);
        if (Dp.m1036compareTo0680j_4(f, RecyclerView.DECELERATION_RATE) <= 0 || colors.isLight()) {
            gapComposer.startReplaceGroup(-1095489470);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1095627978);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ElevationOverlayKt.LocalElevationOverlay;
            j = ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, ColorsKt.m488contentColorForek8zF_U(j, gapComposer), 14), j);
            gapComposer.end(false);
        }
        gapComposer.end(false);
        return j;
    }
}
