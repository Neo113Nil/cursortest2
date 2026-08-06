package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class b60 implements defpackage.c60 {
    public android.os.IBinder fWTAfUmVKrZq;

    @Override // defpackage.c60
    public final void ZpBGe2uQfcn8(java.lang.String[] strArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(defpackage.c60.ZpBGe2uQfcn8);
            obtain.writeStringArray(strArr);
            this.fWTAfUmVKrZq.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.fWTAfUmVKrZq;
    }
}
