package com.yandex.plus.bdui.query;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
                }
                return new b(readString, linkedHashMap, d.c.a(parcel));
            default:
                parcel.getClass();
                String readString2 = parcel.readString();
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    linkedHashMap2.put(parcel.readString(), parcel.createStringArrayList());
                }
                return new e(readString2, linkedHashMap2, d.c.a(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new b[i];
            default:
                return new e[i];
        }
    }
}
