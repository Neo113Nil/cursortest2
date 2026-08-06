package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class eo0 implements Parcelable.ClassLoaderCreator {
    public static fo0 GWasM1elztuh(Parcel parcel, ClassLoader classLoader) {
        k41 k41Var;
        if (classLoader == null) {
            classLoader = eo0.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            k41Var = b9xEq24R1.qugwajBSa59j;
        } else if (readInt == 1) {
            k41Var = k61.EljAMC1QTz;
        } else {
            if (readInt != 2) {
                o4.jivtDDk9H(mr0.encWxUiV2("Unsupported MutableState policy ", readInt, " was restored"));
                return null;
            }
            k41Var = b9xEq24R1.Uxq83abb04;
        }
        return new fo0(readValue, k41Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return GWasM1elztuh(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new fo0[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return GWasM1elztuh(parcel, classLoader);
    }
}
