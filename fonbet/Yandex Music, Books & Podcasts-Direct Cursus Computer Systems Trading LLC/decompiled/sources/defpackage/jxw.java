package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class jxw extends gr2 {
    @Override // defpackage.gr2
    public final void l(fo0 fo0Var) {
        oyw oywVar = (oyw) ((hyw) fo0Var).s();
        vxw vxwVar = new vxw(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(oywVar.i);
        int i = kxw.a;
        obtain.writeStrongBinder(vxwVar);
        try {
            oywVar.h.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ a8o c(Status status) {
        return status;
    }
}
