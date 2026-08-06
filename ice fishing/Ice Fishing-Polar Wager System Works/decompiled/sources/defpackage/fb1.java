package defpackage;

/* loaded from: classes.dex */
public final class fb1 implements android.os.Parcelable.ClassLoaderCreator {
    public static defpackage.gb1 IHQe1A4L2xu(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = defpackage.fb1.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new defpackage.gb1();
        }
        defpackage.su0 xiZrDbcSW0 = defpackage.ja1.xiZrDbcSW0.xiZrDbcSW0();
        for (int i = 0; i < readInt; i++) {
            xiZrDbcSW0.add(parcel.readValue(classLoader));
        }
        return new defpackage.gb1(xiZrDbcSW0.r1MBDhnF());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return IHQe1A4L2xu(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new defpackage.gb1[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return IHQe1A4L2xu(parcel, classLoader);
    }
}
