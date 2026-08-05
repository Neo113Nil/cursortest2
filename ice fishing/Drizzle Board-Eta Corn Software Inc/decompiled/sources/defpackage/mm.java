package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class mm implements nm {
    public IBinder MdtA4re8;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.MdtA4re8;
    }

    @Override // defpackage.nm
    public final void qoPGr6Ce(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(nm.qoPGr6Ce);
            obtain.writeStringArray(strArr);
            this.MdtA4re8.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
