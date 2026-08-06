package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class o41 implements Parcelable.ClassLoaderCreator {
    public static p41 GWasM1elztuh(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = o41.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new p41();
        }
        op0 EljAMC1QTz = d31.EljAMC1QTz.EljAMC1QTz();
        for (int i = 0; i < readInt; i++) {
            EljAMC1QTz.add(parcel.readValue(classLoader));
        }
        return new p41(EljAMC1QTz.X1lG3V04pd());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return GWasM1elztuh(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new p41[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return GWasM1elztuh(parcel, classLoader);
    }
}
