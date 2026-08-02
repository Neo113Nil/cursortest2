package androidx.versionedparcelable;

import android.os.Parcel;
import android.util.SparseIntArray;
import androidx.collection.ArrayMap;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class VersionedParcelParcel extends VersionedParcel {
    public int mCurrentField;
    public final int mEnd;
    public int mFieldId;
    public int mNextRead;
    public final int mOffset;
    public final Parcel mParcel;
    public final SparseIntArray mPositionLookup;
    public final String mPrefix;

    public VersionedParcelParcel(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(0), new ArrayMap(0), new ArrayMap(0));
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcelParcel createSubParcel() {
        Parcel parcel = this.mParcel;
        int dataPosition = parcel.dataPosition();
        int i = this.mNextRead;
        if (i == this.mOffset) {
            i = this.mEnd;
        }
        return new VersionedParcelParcel(parcel, dataPosition, i, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.mPrefix, "  "), this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean readField(int i) {
        while (true) {
            int i2 = this.mNextRead;
            int i3 = this.mFieldId;
            if (i2 >= this.mEnd) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.mNextRead;
            Parcel parcel = this.mParcel;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.mFieldId = parcel.readInt();
            this.mNextRead += readInt;
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void setOutputField(int i) {
        int i2 = this.mCurrentField;
        SparseIntArray sparseIntArray = this.mPositionLookup;
        Parcel parcel = this.mParcel;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.mCurrentField = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public VersionedParcelParcel(Parcel parcel, int i, int i2, String str, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.mPositionLookup = new SparseIntArray();
        this.mCurrentField = -1;
        this.mFieldId = -1;
        this.mParcel = parcel;
        this.mOffset = i;
        this.mEnd = i2;
        this.mNextRead = i;
        this.mPrefix = str;
    }
}
