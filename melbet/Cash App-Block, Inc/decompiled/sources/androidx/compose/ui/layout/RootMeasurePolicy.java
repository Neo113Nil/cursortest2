package androidx.compose.ui.layout;

import androidx.compose.ui.draw.PainterNode$measure$1;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.bugsnag.android.TraceEventEnhancer$invoke$1$1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy("Undefined intrinsics block and it is required");

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return MeasureScope.layout$default(measureScope, Constraints.m1027getMinWidthimpl(j), Constraints.m1026getMinHeightimpl(j), RootMeasurePolicy$measure$1.INSTANCE);
        }
        if (size == 1) {
            Placeable mo833measureBRTryo0 = ((Measurable) list.get(0)).mo833measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, ConstraintsKt.m1033constrainWidthK40F9xA(mo833measureBRTryo0.width, j), ConstraintsKt.m1032constrainHeightK40F9xA(mo833measureBRTryo0.height, j), new PainterNode$measure$1(mo833measureBRTryo0, 1));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            Placeable mo833measureBRTryo02 = ((Measurable) list.get(i3)).mo833measureBRTryo0(j);
            i = Math.max(mo833measureBRTryo02.width, i);
            i2 = Math.max(mo833measureBRTryo02.height, i2);
            arrayList.add(mo833measureBRTryo02);
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m1033constrainWidthK40F9xA(i, j), ConstraintsKt.m1032constrainHeightK40F9xA(i2, j), new TraceEventEnhancer$invoke$1$1(1, arrayList));
    }
}
