package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class u4x extends pww {
    public final nkx h;

    public u4x(nkx nkxVar) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 2);
        this.h = nkxVar;
    }

    @Override // defpackage.pww
    public final boolean R0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        int i2 = z1x.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(k5r.i(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
        Integer valueOf = Integer.valueOf(readInt);
        nkx nkxVar = this.h;
        nkxVar.d = true;
        omx omxVar = nkxVar.b;
        if (omxVar != null) {
            bmx bmxVar = omxVar.b;
            bmxVar.getClass();
            if (tjx.f.R(bmxVar, null, valueOf)) {
                tjx.d(bmxVar);
                nkxVar.a = null;
                nkxVar.b = null;
                nkxVar.c = null;
            }
        }
        return true;
    }
}
