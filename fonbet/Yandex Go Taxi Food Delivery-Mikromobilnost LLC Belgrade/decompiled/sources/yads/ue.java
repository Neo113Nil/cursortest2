package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ue implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return new ve(parcel.readInt(), readString);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ve[i];
    }
}
