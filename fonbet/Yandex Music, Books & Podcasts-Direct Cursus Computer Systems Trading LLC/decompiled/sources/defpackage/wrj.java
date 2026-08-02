package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class wrj extends xrj {
    @Override // defpackage.xrj
    public final void a(int i, fo7 fo7Var) {
        Parcel b = fo7Var.b();
        fo7Var.b = null;
        try {
            if (!this.a.transact(i, b, null, 1)) {
                throw new RemoteException(dfi.c(i, "BinderProxy#transact(", ", FLAG_ONEWAY) returned false"));
            }
        } finally {
            b.recycle();
        }
    }
}
