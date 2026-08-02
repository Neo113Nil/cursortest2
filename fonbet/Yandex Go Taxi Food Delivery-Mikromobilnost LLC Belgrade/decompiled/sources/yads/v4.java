package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.mh81;
import kotlinx.serialization.KSerializer;

/* loaded from: classes7.dex */
public final class v4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new w4(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new w4[i];
    }

    public final KSerializer serializer() {
        return mh81.a;
    }
}
