package defpackage;

import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class lmx extends pww implements uax {
    public final /* synthetic */ bnd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmx(bnd bndVar) {
        super("com.google.android.gms.cast.framework.media.INotificationActionsProvider", 3);
        this.h = bndVar;
    }

    @Override // defpackage.pww
    public final boolean Q0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        if (i == 2) {
            zhj zhjVar = new zhj(this.h);
            parcel2.writeNoException();
            y4x.d(parcel2, zhjVar);
            return true;
        }
        if (i == 3) {
            c5b c5bVar = c5b.a;
            parcel2.writeNoException();
            parcel2.writeTypedList(c5bVar);
            return true;
        }
        if (i != 4) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeIntArray(new int[0]);
        return true;
    }

    @Override // defpackage.uax
    public final List n() {
        return c5b.a;
    }

    @Override // defpackage.uax
    public final int[] t() {
        return new int[0];
    }
}
