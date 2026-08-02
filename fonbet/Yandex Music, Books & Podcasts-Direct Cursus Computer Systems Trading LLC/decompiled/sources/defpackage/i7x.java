package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class i7x extends pww {
    public a h;
    public final int i;

    public i7x(a aVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 4);
        this.h = aVar;
        this.i = i;
    }

    @Override // defpackage.pww
    public final boolean Q0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) z4x.a(parcel, Bundle.CREATOR);
            z4x.b(parcel);
            y1g.H(this.h, "onPostInitComplete can be called only once per call to getRemoteService");
            this.h.x(readInt, readStrongBinder, bundle, this.i);
            this.h = null;
        } else if (i == 2) {
            parcel.readInt();
            z4x.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            gfx gfxVar = (gfx) z4x.a(parcel, gfx.CREATOR);
            z4x.b(parcel);
            a aVar = this.h;
            y1g.H(aVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            y1g.G(gfxVar);
            aVar.A = gfxVar;
            if (aVar.y()) {
                q66 q66Var = gfxVar.d;
                efo g = efo.g();
                ffo ffoVar = q66Var == null ? null : q66Var.a;
                synchronized (g) {
                    if (ffoVar == null) {
                        ffoVar = efo.d;
                    } else {
                        ffo ffoVar2 = (ffo) g.b;
                        if (ffoVar2 != null) {
                            if (ffoVar2.a < ffoVar.a) {
                            }
                        }
                    }
                    g.b = ffoVar;
                }
            }
            Bundle bundle2 = gfxVar.a;
            y1g.H(this.h, "onPostInitComplete can be called only once per call to getRemoteService");
            this.h.x(readInt2, readStrongBinder2, bundle2, this.i);
            this.h = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
