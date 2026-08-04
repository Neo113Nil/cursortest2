package com.gamericefishpro.space.p3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.gamericefishpro.space.f1.t;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.gamericefishpro.space.j4.b {
    public static final Parcelable.Creator<e> CREATOR = new t(6);
    public SparseArray i;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.i = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.i.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // com.gamericefishpro.space.j4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.i;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.i.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.i.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
