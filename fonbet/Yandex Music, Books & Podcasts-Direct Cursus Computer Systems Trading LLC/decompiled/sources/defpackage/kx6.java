package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class kx6 extends ux6 {
    public static pt0 b;
    public static vx6 c;

    public static void b(Uri uri) {
        if (c == null) {
            c();
        }
        vx6 vx6Var = c;
        if (vx6Var != null) {
            Bundle bundle = new Bundle();
            try {
                ((j8e) ((l8e) vx6Var.b)).R((qx6) vx6Var.c, uri, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public static void c() {
        pt0 pt0Var;
        vx6 vx6Var;
        if (c != null || (pt0Var = b) == null) {
            return;
        }
        l8e l8eVar = (l8e) pt0Var.a;
        qx6 qx6Var = new qx6();
        qx6Var.attachInterface(qx6Var, i8e.b);
        new Handler(Looper.getMainLooper());
        if (((j8e) l8eVar).X(qx6Var)) {
            vx6Var = new vx6(0, l8eVar, qx6Var, (ComponentName) pt0Var.b);
            c = vx6Var;
        }
        vx6Var = null;
        c = vx6Var;
    }

    @Override // defpackage.ux6
    public final void a(pt0 pt0Var) {
        b = pt0Var;
        try {
            ((j8e) ((l8e) pt0Var.a)).p0();
        } catch (RemoteException unused) {
        }
        c();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
