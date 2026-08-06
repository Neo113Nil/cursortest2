package defpackage;

/* loaded from: classes.dex */
public final class o40 implements defpackage.p40 {
    public android.os.IBinder r1MBDhnF;

    @Override // defpackage.p40
    public final void IHQe1A4L2xu(java.lang.String[] strArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(defpackage.p40.IHQe1A4L2xu);
            obtain.writeStringArray(strArr);
            this.r1MBDhnF.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.r1MBDhnF;
    }
}
