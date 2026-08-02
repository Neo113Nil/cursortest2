package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class vxw extends pww {
    public final jxw h;

    public vxw(jxw jxwVar) {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks", 0);
        this.h = jxwVar;
    }

    @Override // defpackage.pww
    public final boolean L0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        kxw.b(parcel);
        this.h.g(new Status(readInt, null, null, null));
        return true;
    }
}
