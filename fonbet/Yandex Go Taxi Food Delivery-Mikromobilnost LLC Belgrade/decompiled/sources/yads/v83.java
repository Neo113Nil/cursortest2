package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class v83 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new w83(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new w83[i];
    }
}
