package app.cash.local.views.brand.profile;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.unit.IntSize;

/* loaded from: classes3.dex */
public final class CheckedInHeaderMeasurements {
    public final ParcelableSnapshotMutableState headerSize$delegate = Updater.mutableStateOf$default(new IntSize(0));
    public final ParcelableSnapshotMutableState textColumnSize$delegate = Updater.mutableStateOf$default(new IntSize(0));
    public final ParcelableSnapshotMutableState titleSize$delegate = Updater.mutableStateOf$default(new IntSize(0));
    public final ParcelableSnapshotMutableState avatarSize$delegate = Updater.mutableStateOf$default(new IntSize(0));

    /* renamed from: getTextColumnSize-YbymL2g, reason: not valid java name */
    public final long m1312getTextColumnSizeYbymL2g() {
        return ((IntSize) this.textColumnSize$delegate.getValue()).packedValue;
    }
}
