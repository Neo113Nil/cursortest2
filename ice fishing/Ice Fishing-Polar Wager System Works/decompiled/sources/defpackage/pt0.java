package defpackage;

/* loaded from: classes.dex */
public final class pt0 implements android.os.Parcelable.ClassLoaderCreator {
    public static defpackage.qt0 IHQe1A4L2xu(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        defpackage.cb1 cb1Var;
        if (classLoader == null) {
            classLoader = defpackage.pt0.class.getClassLoader();
        }
        java.lang.Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            cb1Var = defpackage.n.QPwENk36pDC;
        } else if (readInt == 1) {
            cb1Var = defpackage.ad1.xiZrDbcSW0;
        } else {
            if (readInt != 2) {
                defpackage.db.AARZUJiTa(defpackage.fx0.riuEU0zW4(readInt, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            cb1Var = defpackage.n.AsxAYCCkb3Hi;
        }
        return new defpackage.qt0(readValue, cb1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return IHQe1A4L2xu(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new defpackage.qt0[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return IHQe1A4L2xu(parcel, classLoader);
    }
}
