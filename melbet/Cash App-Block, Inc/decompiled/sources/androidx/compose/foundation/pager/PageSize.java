package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScopeImpl;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes3.dex */
public interface PageSize {

    public final class Fill implements PageSize {
        public static final Fill INSTANCE = new Fill();

        @Override // androidx.compose.foundation.pager.PageSize
        public final int calculateMainAxisPageSize(LazyLayoutMeasureScopeImpl lazyLayoutMeasureScopeImpl, int i) {
            return i;
        }
    }

    public final class Fixed implements PageSize {
        public final float pageSize;

        public Fixed(float f) {
            this.pageSize = f;
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public final int calculateMainAxisPageSize(LazyLayoutMeasureScopeImpl lazyLayoutMeasureScopeImpl, int i) {
            return lazyLayoutMeasureScopeImpl.subcomposeMeasureScope.mo230roundToPx0680j_4(this.pageSize);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fixed)) {
                return false;
            }
            return Dp.m1037equalsimpl0(this.pageSize, ((Fixed) obj).pageSize);
        }

        public final int hashCode() {
            return Float.hashCode(this.pageSize);
        }
    }

    int calculateMainAxisPageSize(LazyLayoutMeasureScopeImpl lazyLayoutMeasureScopeImpl, int i);
}
