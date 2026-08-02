package androidx.compose.ui.window;

import androidx.compose.animation.SkipToLookaheadSizeNode$measure$1$1;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.bugsnag.android.TraceEventEnhancer$invoke$1$1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class AndroidPopup_androidKt$SimpleStack$1$1 implements MeasurePolicy {
    public final /* synthetic */ int $r8$classId;
    public static final AndroidPopup_androidKt$SimpleStack$1$1 INSTANCE$1 = new AndroidPopup_androidKt$SimpleStack$1$1(1);
    public static final AndroidPopup_androidKt$SimpleStack$1$1 INSTANCE = new AndroidPopup_androidKt$SimpleStack$1$1(0);

    public /* synthetic */ AndroidPopup_androidKt$SimpleStack$1$1(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                int size = list.size();
                if (size == 0) {
                    return MeasureScope.layout$default(measureScope, 0, 0, AndroidPopup_androidKt$Popup$5$1$1.INSTANCE$4);
                }
                if (size == 1) {
                    Placeable mo833measureBRTryo0 = ((Measurable) list.get(0)).mo833measureBRTryo0(j);
                    return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new SkipToLookaheadSizeNode$measure$1$1(mo833measureBRTryo0, 3));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i2 = 0;
                int i3 = 0;
                while (i < size2) {
                    Placeable mo833measureBRTryo02 = ((Measurable) list.get(i)).mo833measureBRTryo0(j);
                    i2 = Math.max(i2, mo833measureBRTryo02.width);
                    i3 = Math.max(i3, mo833measureBRTryo02.height);
                    arrayList.add(mo833measureBRTryo02);
                    i++;
                }
                return MeasureScope.layout$default(measureScope, i2, i3, new TraceEventEnhancer$invoke$1$1(3, arrayList));
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int i4 = 0;
                int i5 = 0;
                while (i < size3) {
                    Placeable mo833measureBRTryo03 = ((Measurable) list.get(i)).mo833measureBRTryo0(j);
                    i4 = Math.max(i4, mo833measureBRTryo03.width);
                    i5 = Math.max(i5, mo833measureBRTryo03.height);
                    arrayList2.add(mo833measureBRTryo03);
                    i++;
                }
                if (list.isEmpty()) {
                    i4 = Constraints.m1027getMinWidthimpl(j);
                    i5 = Constraints.m1026getMinHeightimpl(j);
                }
                return MeasureScope.layout$default(measureScope, i4, i5, new TraceEventEnhancer$invoke$1$1(2, arrayList2));
        }
    }
}
