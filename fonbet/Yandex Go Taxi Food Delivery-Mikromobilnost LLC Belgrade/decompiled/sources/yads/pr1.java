package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tw71;
import kotlinx.serialization.KSerializer;

/* loaded from: classes7.dex */
public final class pr1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new qr1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new qr1[i];
    }

    public final KSerializer serializer() {
        return tw71.a;
    }
}
