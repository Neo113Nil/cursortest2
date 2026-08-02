package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class qp1 implements Parcelable {
    public static final pp1 CREATOR = new pp1();
    public final ArrayList b;
    public final Map c;

    public qp1(Parcel parcel) {
        ArrayList createTypedArrayList = parcel.createTypedArrayList(zp1.CREATOR);
        CREATOR.getClass();
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        this.b = createTypedArrayList;
        this.c = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
        parcel.writeInt(this.c.size());
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public qp1(ArrayList arrayList, Map map) {
        this.b = arrayList;
        this.c = map;
    }
}
