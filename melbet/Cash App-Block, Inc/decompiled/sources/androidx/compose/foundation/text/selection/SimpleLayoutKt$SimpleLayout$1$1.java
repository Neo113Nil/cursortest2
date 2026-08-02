package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class SimpleLayoutKt$SimpleLayout$1$1 implements MeasurePolicy {
    public static final SimpleLayoutKt$SimpleLayout$1$1 INSTANCE = new SimpleLayoutKt$SimpleLayout$1$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Placeable mo833measureBRTryo0 = ((Measurable) list.get(i3)).mo833measureBRTryo0(j);
            i = Math.max(i, mo833measureBRTryo0.width);
            i2 = Math.max(i2, mo833measureBRTryo0.height);
            arrayList.add(mo833measureBRTryo0);
        }
        return MeasureScope.layout$default(measureScope, i, i2, new TextStreamsKt$$ExternalSyntheticLambda0(3, arrayList));
    }
}
