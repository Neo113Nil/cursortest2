package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableIntState$Companion$CREATOR$1 implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.$r8$classId) {
            case 0:
                return new ParcelableSnapshotMutableIntState(parcel.readInt());
            case 1:
                return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
            default:
                return new ParcelableSnapshotMutableLongState(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new ParcelableSnapshotMutableIntState[i];
            case 1:
                return new ParcelableSnapshotMutableFloatState[i];
            default:
                return new ParcelableSnapshotMutableLongState[i];
        }
    }
}
