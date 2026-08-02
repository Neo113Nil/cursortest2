package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1 implements MeasurePolicy {
    public static final AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1 INSTANCE = new AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Measurable) list.get(i)).mo833measureBRTryo0(j));
        }
        return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), Constraints.m1024getMaxHeightimpl(j), new TextStreamsKt$$ExternalSyntheticLambda0(2, arrayList));
    }
}
