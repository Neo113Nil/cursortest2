package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import b.AbstractBinderC0513c;
import b.C0512b;
import b.InterfaceC0514d;

/* renamed from: p.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC4825k implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, AbstractC4820f abstractC4820f);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0514d interfaceC0514d;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = AbstractBinderC0513c.f5370n;
        if (iBinder == null) {
            interfaceC0514d = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0514d.f5371e0);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0514d)) {
                C0512b c0512b = new C0512b();
                c0512b.f5369n = iBinder;
                interfaceC0514d = c0512b;
            } else {
                interfaceC0514d = (InterfaceC0514d) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new C4824j(interfaceC0514d, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
