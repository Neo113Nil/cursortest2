package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import b.AbstractBinderC0509c;
import b.C0508b;
import b.InterfaceC0510d;

/* renamed from: p.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC4821k implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, AbstractC4816f abstractC4816f);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0510d interfaceC0510d;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = AbstractBinderC0509c.f5405n;
        if (iBinder == null) {
            interfaceC0510d = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0510d.f5406j0);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0510d)) {
                C0508b c0508b = new C0508b();
                c0508b.f5404n = iBinder;
                interfaceC0510d = c0508b;
            } else {
                interfaceC0510d = (InterfaceC0510d) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new C4820j(interfaceC0510d, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
