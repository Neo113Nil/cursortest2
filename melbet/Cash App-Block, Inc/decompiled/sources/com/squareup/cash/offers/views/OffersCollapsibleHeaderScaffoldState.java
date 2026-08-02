package com.squareup.cash.offers.views;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda6;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class OffersCollapsibleHeaderScaffoldState {
    public static final WorkLauncherImpl Saver = ListSaverKt.listSaver(new NfcNotAvailableKt$$ExternalSyntheticLambda6(9), new OffersStyledTextKt$$ExternalSyntheticLambda0(3));
    public final ParcelableSnapshotMutableFloatState headerHeightInPx$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    public final ParcelableSnapshotMutableFloatState headerYOffsetInPx$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    public final OffersCollapsibleHeaderScaffoldState$nestedScrollConnection$1 nestedScrollConnection = new NestedScrollConnection() { // from class: com.squareup.cash.offers.views.OffersCollapsibleHeaderScaffoldState$nestedScrollConnection$1
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public final long mo326onPreScrollOzD1aCk(int i, long j) {
            OffersCollapsibleHeaderScaffoldState offersCollapsibleHeaderScaffoldState = OffersCollapsibleHeaderScaffoldState.this;
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = offersCollapsibleHeaderScaffoldState.headerHeightInPx$delegate;
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = offersCollapsibleHeaderScaffoldState.headerYOffsetInPx$delegate;
            int i2 = (int) (BodyPartID.bodyIdMax & j);
            if (Float.intBitsToFloat(i2) == RecyclerView.DECELERATION_RATE) {
                return 0L;
            }
            parcelableSnapshotMutableFloatState2.setFloatValue(RangesKt___RangesKt.coerceIn(Float.intBitsToFloat(i2) + parcelableSnapshotMutableFloatState2.getFloatValue(), -parcelableSnapshotMutableFloatState.getFloatValue(), RecyclerView.DECELERATION_RATE));
            if (parcelableSnapshotMutableFloatState2.getFloatValue() == RecyclerView.DECELERATION_RATE || parcelableSnapshotMutableFloatState2.getFloatValue() == (-parcelableSnapshotMutableFloatState.getFloatValue())) {
                return 0L;
            }
            return j;
        }
    };
}
