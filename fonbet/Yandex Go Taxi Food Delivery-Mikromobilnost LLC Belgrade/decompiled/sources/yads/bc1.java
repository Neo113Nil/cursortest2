package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class bc1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new cc1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new cc1[i];
    }
}
