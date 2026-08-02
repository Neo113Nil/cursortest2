package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s471;
import kotlinx.serialization.KSerializer;

/* loaded from: classes7.dex */
public final class gr1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new hr1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new hr1[i];
    }

    public final KSerializer serializer() {
        return s471.a;
    }
}
