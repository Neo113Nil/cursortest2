package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1;
import androidx.compose.ui.window.PopupLayout;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class TextMeasurePolicy implements MeasurePolicy {
    public final /* synthetic */ int $r8$classId;
    public final Object placements;
    public final Object shouldMeasureLinks;

    public /* synthetic */ TextMeasurePolicy(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.shouldMeasureLinks = obj;
        this.placements = obj2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        Pair pair;
        int i2 = this.$r8$classId;
        int i3 = 0;
        Object obj = this.placements;
        Object obj2 = this.shouldMeasureLinks;
        switch (i2) {
            case 0:
                ArrayList arrayList3 = new ArrayList(list.size());
                List list2 = list;
                int size = list2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj3 = list.get(i4);
                    if (!(((Measurable) obj3).getParentData() instanceof TextRangeLayoutModifier)) {
                        arrayList3.add(obj3);
                    }
                }
                List list3 = (List) ((Function0) obj).invoke();
                if (list3 != null) {
                    ArrayList arrayList4 = new ArrayList(list3.size());
                    int size2 = list3.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Rect rect = (Rect) list3.get(i5);
                        if (rect != null) {
                            float f = rect.top;
                            float f2 = rect.left;
                            int floor = (int) Math.floor(rect.right - f2);
                            int floor2 = (int) Math.floor(rect.bottom - f);
                            arrayList2 = arrayList3;
                            i = 0;
                            pair = new Pair(((Measurable) arrayList3.get(i5)).mo833measureBRTryo0(ConstraintsKt.Constraints$default(0, floor, 0, floor2, 5)), new IntOffset((Math.round(f) & BodyPartID.bodyIdMax) | (Math.round(f2) << 32)));
                        } else {
                            arrayList2 = arrayList3;
                            i = i3;
                            pair = null;
                        }
                        if (pair != null) {
                            arrayList4.add(pair);
                        }
                        i5++;
                        i3 = i;
                        arrayList3 = arrayList2;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList5 = new ArrayList(list.size());
                int size3 = list2.size();
                for (int i6 = i3; i6 < size3; i6++) {
                    Object obj4 = list.get(i6);
                    if (((Measurable) obj4).getParentData() instanceof TextRangeLayoutModifier) {
                        arrayList5.add(obj4);
                    }
                }
                return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), Constraints.m1024getMaxHeightimpl(j), new Navigator$$ExternalSyntheticLambda0(5, arrayList, BasicTextKt.access$measureWithTextRangeMeasureConstraints(arrayList5, (Function0) obj2)));
            default:
                ((PopupLayout) obj2).setParentLayoutDirection((LayoutDirection) obj);
                return MeasureScope.layout$default(measureScope, 0, 0, AndroidPopup_androidKt$Popup$5$1$1.INSTANCE$2);
        }
    }
}
