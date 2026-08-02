package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class px6 extends ux6 {
    public final /* synthetic */ Context b;

    public px6(Context context) {
        this.b = context;
    }

    @Override // defpackage.ux6
    public final void a(pt0 pt0Var) {
        try {
            ((j8e) ((l8e) pt0Var.a)).p0();
        } catch (RemoteException unused) {
        }
        this.b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
