package B;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class i extends T.b {
    public static final Parcelable.Creator<i> CREATOR = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f26c;

    public i(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f26c = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f26c.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f26c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f26c.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f26c.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
