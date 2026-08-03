package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k1 implements Parcelable.ClassLoaderCreator {
    public static l1 a(Parcel parcel, ClassLoader classLoader) {
        z0 z0Var;
        if (classLoader == null) {
            classLoader = k1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            z0Var = z0.f4841i;
        } else if (readInt == 1) {
            z0Var = z0.f4844l;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException(a4.d.h("Unsupported MutableState policy ", readInt, " was restored"));
            }
            z0Var = z0.f4842j;
        }
        return new l1(readValue, z0Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new l1[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
