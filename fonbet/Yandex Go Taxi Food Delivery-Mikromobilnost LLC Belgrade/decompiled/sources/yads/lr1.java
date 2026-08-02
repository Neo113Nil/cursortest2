package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nk71;
import java.util.LinkedHashMap;
import kotlinx.serialization.KSerializer;

/* loaded from: classes7.dex */
public final class lr1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        return new mr1(readString, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new mr1[i];
    }

    public final KSerializer serializer() {
        return nk71.a;
    }
}
