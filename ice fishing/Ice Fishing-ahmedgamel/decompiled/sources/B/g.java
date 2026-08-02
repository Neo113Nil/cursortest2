package B;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class g extends V.b {
    public static final Parcelable.Creator<g> CREATOR = new A3.b(1);

    /* renamed from: v, reason: collision with root package name */
    public SparseArray f245v;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f245v = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f245v.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f245v;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = this.f245v.keyAt(i4);
            parcelableArr[i4] = (Parcelable) this.f245v.valueAt(i4);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
