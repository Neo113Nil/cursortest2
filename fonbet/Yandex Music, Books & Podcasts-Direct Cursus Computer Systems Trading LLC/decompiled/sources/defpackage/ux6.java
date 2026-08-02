package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class ux6 implements ServiceConnection {
    public Context a;

    public abstract void a(pt0 pt0Var);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l8e l8eVar;
        if (this.a == null) {
            xq0.q("Custom Tabs Service connected before an applicationcontext has been provided.");
            return;
        }
        int i = k8e.a;
        if (iBinder == null) {
            l8eVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(l8e.c);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof l8e)) {
                j8e j8eVar = new j8e();
                j8eVar.a = iBinder;
                l8eVar = j8eVar;
            } else {
                l8eVar = (l8e) queryLocalInterface;
            }
        }
        a(new pt0(l8eVar, componentName));
    }
}
