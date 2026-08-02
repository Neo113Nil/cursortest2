package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class o03 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new q03(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new q03[i];
    }
}
