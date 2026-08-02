package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.ranges.RangesKt___RangesKt;
import net.oneformapp.schema.Schema;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class DefaultPagerNestedScrollConnection implements NestedScrollConnection {
    public final Orientation orientation;
    public final PagerState state;

    public DefaultPagerNestedScrollConnection(PagerState pagerState, Orientation orientation) {
        this.state = pagerState;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public final Object mo241onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        return new Velocity(this.orientation == Orientation.Vertical ? Velocity.m1065copyOhffZ5M$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 2, j2) : Velocity.m1065copyOhffZ5M$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1, j2));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo242onPostScrollDzOQY0M(int i, long j, long j2) {
        if (i != 2) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j2 >> 32 : BodyPartID.bodyIdMax & j2)) == RecyclerView.DECELERATION_RATE) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public final long mo326onPreScrollOzD1aCk(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        PagerState pagerState = this.state;
        Schema schema = pagerState.scrollPosition;
        Schema schema2 = pagerState.scrollPosition;
        if (Math.abs(((ParcelableSnapshotMutableFloatState) schema.fieldSortOrder).getFloatValue()) <= 1.0E-6d) {
            return 0L;
        }
        Orientation orientation = Orientation.Horizontal;
        Orientation orientation2 = this.orientation;
        if (Math.abs(Float.intBitsToFloat((int) (orientation2 == orientation ? j >> 32 : j & BodyPartID.bodyIdMax))) <= RecyclerView.DECELERATION_RATE) {
            return 0L;
        }
        PagerMeasureResult layoutInfo = pagerState.getLayoutInfo();
        float floatValue = ((ParcelableSnapshotMutableFloatState) schema2.fieldSortOrder).getFloatValue() * pagerState.getPageSize$foundation();
        float f = ((layoutInfo.pageSize + layoutInfo.pageSpacing) * (-Math.signum(((ParcelableSnapshotMutableFloatState) schema2.fieldSortOrder).getFloatValue()))) + floatValue;
        if (((ParcelableSnapshotMutableFloatState) schema2.fieldSortOrder).getFloatValue() > RecyclerView.DECELERATION_RATE) {
            floatValue = f;
            f = floatValue;
        }
        float f2 = -pagerState.scrollableState.dispatchRawDelta(-RangesKt___RangesKt.coerceIn(Float.intBitsToFloat((int) (orientation2 == orientation ? j >> 32 : j & BodyPartID.bodyIdMax)), floatValue, f));
        float intBitsToFloat = orientation2 == orientation ? f2 : Float.intBitsToFloat((int) (j >> 32));
        if (orientation2 != Orientation.Vertical) {
            f2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        }
        return (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
