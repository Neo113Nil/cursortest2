package androidx.compose.foundation;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* loaded from: classes.dex */
public final class ImageKt$Image$1$1 implements MeasurePolicy {
    public static final ImageKt$Image$1$1 INSTANCE = new ImageKt$Image$1$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        return MeasureScope.layout$default(measureScope, Constraints.m1027getMinWidthimpl(j), Constraints.m1026getMinHeightimpl(j), new ScrollState$$ExternalSyntheticLambda4(21));
    }
}
