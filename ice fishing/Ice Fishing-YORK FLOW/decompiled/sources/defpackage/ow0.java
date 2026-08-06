package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ow0 implements android.os.Parcelable.ClassLoaderCreator {
    public static defpackage.pw0 ZpBGe2uQfcn8(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        defpackage.ze1 ze1Var;
        if (classLoader == null) {
            classLoader = defpackage.ow0.class.getClassLoader();
        }
        java.lang.Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            ze1Var = defpackage.jVUAPb5NnIYW.z16KqenTjq8o;
        } else if (readInt == 1) {
            ze1Var = defpackage.pa1.Ns0WNyEWdPsk;
        } else {
            if (readInt != 2) {
                throw new java.lang.IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            ze1Var = defpackage.jVUAPb5NnIYW.GoIRkIe1iwj6;
        }
        return new defpackage.pw0(readValue, ze1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return ZpBGe2uQfcn8(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new defpackage.pw0[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return ZpBGe2uQfcn8(parcel, classLoader);
    }
}
