package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class xo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new yo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new yo[i];
    }
}
