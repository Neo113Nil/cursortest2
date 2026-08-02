package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class RowKt {
    public static final RowMeasurePolicy DefaultRowMeasurePolicy = new RowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top);

    public static final RowMeasurePolicy rowMeasurePolicy(Arrangement$Horizontal arrangement$Horizontal, BiasAlignment.Vertical vertical, Composer composer, int i) {
        if (Intrinsics.areEqual(arrangement$Horizontal, SpacerKt.Start) && Intrinsics.areEqual(vertical, Alignment.Companion.Top)) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-1073830487);
            gapComposer.end(false);
            return DefaultRowMeasurePolicy;
        }
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && gapComposer2.changed(arrangement$Horizontal)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !gapComposer2.changed(vertical)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue = gapComposer2.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new RowMeasurePolicy(arrangement$Horizontal, vertical);
            gapComposer2.updateRememberedValue(rememberedValue);
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) rememberedValue;
        gapComposer2.end(false);
        return rowMeasurePolicy;
    }
}
