package androidx.compose.foundation.pager;

import androidx.compose.ui.layout.MeasureResult;
import java.util.Map;
import kotlin.collections.EmptyMap;

/* loaded from: classes3.dex */
public final class PagerStateKt$EmptyLayoutInfo$1 implements MeasureResult {
    public final /* synthetic */ int $r8$classId;
    public final EmptyMap alignmentLines;

    public PagerStateKt$EmptyLayoutInfo$1(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                this.alignmentLines = emptyMap;
                break;
            case 2:
                EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                emptyMap2.getClass();
                this.alignmentLines = emptyMap2;
                break;
            default:
                EmptyMap emptyMap3 = EmptyMap.INSTANCE;
                emptyMap3.getClass();
                this.alignmentLines = emptyMap3;
                break;
        }
    }

    private final void placeChildren$androidx$compose$foundation$lazy$LazyListStateKt$EmptyLazyListMeasureResult$1() {
    }

    private final void placeChildren$androidx$compose$foundation$lazy$grid$LazyGridStateKt$EmptyLazyGridLayoutInfo$1() {
    }

    private final void placeChildren$androidx$compose$foundation$pager$PagerStateKt$EmptyLayoutInfo$1() {
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Map getAlignmentLines() {
        switch (this.$r8$classId) {
        }
        return this.alignmentLines;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getHeight() {
        switch (this.$r8$classId) {
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getWidth() {
        switch (this.$r8$classId) {
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void placeChildren() {
        int i = this.$r8$classId;
    }
}
