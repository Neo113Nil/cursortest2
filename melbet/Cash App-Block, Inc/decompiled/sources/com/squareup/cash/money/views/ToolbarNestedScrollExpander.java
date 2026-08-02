package com.squareup.cash.money.views;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.recyclerview.widget.RecyclerView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class ToolbarNestedScrollExpander implements NestedScrollConnection {
    public final ParcelableSnapshotMutableFloatState _toolbarHeight;
    public final ParcelableSnapshotMutableFloatState _toolbarScrollDelta;

    public ToolbarNestedScrollExpander(float f, float f2) {
        this._toolbarHeight = new ParcelableSnapshotMutableFloatState(f);
        this._toolbarScrollDelta = new ParcelableSnapshotMutableFloatState(f2);
    }

    public final float consumeScroll$1(float f) {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this._toolbarScrollDelta;
        float floatValue = parcelableSnapshotMutableFloatState.getFloatValue();
        float f2 = f + floatValue;
        float floatValue2 = this._toolbarHeight.getFloatValue();
        if (f2 < RecyclerView.DECELERATION_RATE) {
            f2 = 0.0f;
        }
        if (f2 <= floatValue2) {
            floatValue2 = f2;
        }
        parcelableSnapshotMutableFloatState.setFloatValue(floatValue2);
        return parcelableSnapshotMutableFloatState.getFloatValue() - floatValue;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo242onPostScrollDzOQY0M(int i, long j, long j2) {
        int i2 = (int) (j2 & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i2) <= RecyclerView.DECELERATION_RATE) {
            return 0L;
        }
        float consumeScroll$1 = consumeScroll$1(Float.intBitsToFloat(i2));
        return (Float.floatToRawIntBits(consumeScroll$1) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo326onPreScrollOzD1aCk(int i, long j) {
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i2) >= RecyclerView.DECELERATION_RATE) {
            return 0L;
        }
        float consumeScroll$1 = consumeScroll$1(Float.intBitsToFloat(i2));
        return (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(consumeScroll$1) & BodyPartID.bodyIdMax);
    }
}
