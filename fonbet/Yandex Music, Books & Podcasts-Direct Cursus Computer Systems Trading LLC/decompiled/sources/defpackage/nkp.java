package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class nkp {
    public static final msg b = new msg("Session", null);
    public final n2x a;

    public nkp(Context context, String str, String str2) {
        n2x n2xVar;
        try {
            n2xVar = w0x.b(context).U0(str, str2, new p3x(this));
        } catch (RemoteException | odi e) {
            w0x.a.a(e, "Unable to call %s on %s.", "newSessionImpl", d1x.class.getSimpleName());
            n2xVar = null;
        }
        this.a = n2xVar;
    }

    public final void a(int i) {
        n2x n2xVar = this.a;
        if (n2xVar == null) {
            return;
        }
        try {
            f2x f2xVar = (f2x) n2xVar;
            Parcel M0 = f2xVar.M0();
            M0.writeInt(i);
            f2xVar.O0(M0, 13);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "notifySessionEnded", n2x.class.getSimpleName());
        }
    }

    public final int b() {
        y1g.B("Must be called from the main thread.");
        n2x n2xVar = this.a;
        if (n2xVar != null) {
            try {
                f2x f2xVar = (f2x) n2xVar;
                Parcel N0 = f2xVar.N0(f2xVar.M0(), 17);
                int readInt = N0.readInt();
                N0.recycle();
                if (readInt >= 211100000) {
                    f2x f2xVar2 = (f2x) n2xVar;
                    Parcel N02 = f2xVar2.N0(f2xVar2.M0(), 18);
                    int readInt2 = N02.readInt();
                    N02.recycle();
                    return readInt2;
                }
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getSessionStartType", n2x.class.getSimpleName());
            }
        }
        return 0;
    }

    public final l9e c() {
        n2x n2xVar = this.a;
        if (n2xVar != null) {
            try {
                f2x f2xVar = (f2x) n2xVar;
                Parcel N0 = f2xVar.N0(f2xVar.M0(), 1);
                l9e S0 = zhj.S0(N0.readStrongBinder());
                N0.recycle();
                return S0;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getWrappedObject", n2x.class.getSimpleName());
            }
        }
        return null;
    }
}
