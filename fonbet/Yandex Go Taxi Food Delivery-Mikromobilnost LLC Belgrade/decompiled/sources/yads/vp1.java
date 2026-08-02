package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class vp1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        String readString = parcel.readString();
        zp1.CREATOR.getClass();
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            linkedHashMap2.put(parcel.readString(), parcel.readString());
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
        w4 w4Var = (w4) parcel.readParcelable(w4.class.getClassLoader());
        zp1.CREATOR.getClass();
        int readInt2 = parcel.readInt();
        if (readInt2 == -1) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 < readInt2; i2++) {
                linkedHashMap3.put(parcel.readString(), parcel.readString());
            }
            linkedHashMap = linkedHashMap3;
        }
        return new zp1(readString, linkedHashMap2, createStringArrayList, createStringArrayList2, createStringArrayList3, w4Var, linkedHashMap, (xp2) parcel.readParcelable(xp2.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new zp1[i];
    }
}
