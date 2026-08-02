package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes.dex */
public abstract class VisibilityThresholdsKt {
    public static final Rect RectVisibilityThreshold;
    public static final Map VisibilityThresholdMap;

    static {
        Float valueOf = Float.valueOf(1.0f);
        RectVisibilityThreshold = new Rect(1.0f, 1.0f, 1.0f, 1.0f);
        Pair pair = new Pair(AnimatableKt.IntToVector, valueOf);
        Pair pair2 = new Pair(AnimatableKt.IntSizeToVector, valueOf);
        Pair pair3 = new Pair(AnimatableKt.IntOffsetToVector, valueOf);
        Pair pair4 = new Pair(AnimatableKt.FloatToVector, Float.valueOf(0.01f));
        Pair pair5 = new Pair(AnimatableKt.RectToVector, valueOf);
        Pair pair6 = new Pair(AnimatableKt.SizeToVector, valueOf);
        Pair pair7 = new Pair(AnimatableKt.OffsetToVector, valueOf);
        TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.DpToVector;
        Float valueOf2 = Float.valueOf(0.4f);
        VisibilityThresholdMap = MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair(twoWayConverterImpl, valueOf2), new Pair(AnimatableKt.DpOffsetToVector, valueOf2));
    }
}
