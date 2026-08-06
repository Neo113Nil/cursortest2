package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ef1 implements android.os.Parcelable.ClassLoaderCreator {
    public static defpackage.ff1 ZpBGe2uQfcn8(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = defpackage.ef1.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new defpackage.ff1();
        }
        defpackage.ly0 WDYagTQQm9ns = defpackage.ke1.QiMR8OkAhezm.WDYagTQQm9ns();
        for (int i = 0; i < readInt; i++) {
            WDYagTQQm9ns.add(parcel.readValue(classLoader));
        }
        return new defpackage.ff1(WDYagTQQm9ns.fWTAfUmVKrZq());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return ZpBGe2uQfcn8(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new defpackage.ff1[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return ZpBGe2uQfcn8(parcel, classLoader);
    }
}
