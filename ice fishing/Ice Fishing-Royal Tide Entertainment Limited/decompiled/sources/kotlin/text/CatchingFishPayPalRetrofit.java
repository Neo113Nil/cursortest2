package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class CatchingFishPayPalRetrofit extends CatchingFishDaggerHilt {
    public static final Parcelable.Creator<CatchingFishPayPalRetrofit> CREATOR = new CatchingFishDatabindingFlux(2);
    public SparseArray CatchingFishWorkManager;

    public CatchingFishPayPalRetrofit(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.CatchingFishWorkManager = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.CatchingFishWorkManager.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // kotlin.text.CatchingFishDaggerHilt, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.CatchingFishWorkManager;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.CatchingFishWorkManager.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.CatchingFishWorkManager.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
