package com.yandex.passport.internal.push;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class b0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2;
        h0 createFromParcel;
        switch (this.a) {
            case 0:
                parcel.getClass();
                long readLong = parcel.readLong();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
                return new c0(readLong, readString, readString2, readString3, readString4, readString5, readString6, arrayList, parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt(), parcel.readString());
            case 1:
                parcel.getClass();
                return new h0(parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), com.yandex.passport.sloth.data.h.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
            case 2:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                    parcel2 = parcel;
                } else {
                    parcel2 = parcel;
                    createFromParcel = h0.CREATOR.createFromParcel(parcel2);
                }
                return new j0(createFromParcel, parcel2.readLong(), parcel2.readLong());
            default:
                parcel.getClass();
                return new a1(parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new c0[i];
            case 1:
                return new h0[i];
            case 2:
                return new j0[i];
            default:
                return new a1[i];
        }
    }
}
