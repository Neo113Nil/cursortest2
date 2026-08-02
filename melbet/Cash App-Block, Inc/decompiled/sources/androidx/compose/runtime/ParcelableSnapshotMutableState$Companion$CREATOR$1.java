package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableState$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator {
    public static ParcelableSnapshotMutableState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        NeverEqualPolicy neverEqualPolicy;
        if (classLoader == null) {
            classLoader = ParcelableSnapshotMutableState$Companion$CREATOR$1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            neverEqualPolicy = NeverEqualPolicy.INSTANCE;
        } else if (readInt == 1) {
            neverEqualPolicy = NeverEqualPolicy.INSTANCE$3;
        } else {
            if (readInt != 2) {
                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readInt, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            neverEqualPolicy = NeverEqualPolicy.INSTANCE$1;
        }
        return new ParcelableSnapshotMutableState(readValue, neverEqualPolicy);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return createFromParcel(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }
}
