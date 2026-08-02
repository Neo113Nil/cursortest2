package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class jmp {
    public static final msg c = new msg("SessionManager", null);
    public final r2x a;
    public final Context b;

    public jmp(r2x r2xVar, Context context) {
        this.a = r2xVar;
        this.b = context;
    }

    public final void a(rmp rmpVar) {
        if (rmpVar == null) {
            jj4.j("SessionManagerListener can't be null");
            return;
        }
        y1g.B("Must be called from the main thread.");
        try {
            r2x r2xVar = this.a;
            s3x s3xVar = new s3x(rmpVar);
            Parcel M0 = r2xVar.M0();
            y4x.d(M0, s3xVar);
            r2xVar.O0(M0, 2);
        } catch (RemoteException e) {
            c.a(e, "Unable to call %s on %s.", "addSessionManagerListener", r2x.class.getSimpleName());
        }
    }

    public final void b(boolean z) {
        msg msgVar = c;
        y1g.B("Must be called from the main thread.");
        try {
            Log.i(msgVar.a, msgVar.d("End session for %s", this.b.getPackageName()));
            r2x r2xVar = this.a;
            Parcel M0 = r2xVar.M0();
            int i = y4x.a;
            M0.writeInt(1);
            M0.writeInt(z ? 1 : 0);
            r2xVar.O0(M0, 6);
        } catch (RemoteException e) {
            msgVar.a(e, "Unable to call %s on %s.", "endCurrentSession", r2x.class.getSimpleName());
        }
    }

    public final nkp c() {
        y1g.B("Must be called from the main thread.");
        try {
            r2x r2xVar = this.a;
            Parcel N0 = r2xVar.N0(r2xVar.M0(), 1);
            l9e S0 = zhj.S0(N0.readStrongBinder());
            N0.recycle();
            return (nkp) zhj.T0(S0);
        } catch (RemoteException e) {
            c.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", r2x.class.getSimpleName());
            return null;
        }
    }
}
