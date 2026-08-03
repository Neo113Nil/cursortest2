package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class i implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, c cVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b.d dVar;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i10 = b.c.f794d;
        if (iBinder == null) {
            dVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.d.f795b);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b.d)) {
                b.b bVar = new b.b();
                bVar.f793d = iBinder;
                dVar = bVar;
            } else {
                dVar = (b.d) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new h(dVar, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
