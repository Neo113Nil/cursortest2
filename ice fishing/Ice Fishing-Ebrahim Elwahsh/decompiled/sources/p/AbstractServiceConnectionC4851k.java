package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import b.AbstractBinderC0519c;
import b.C0518b;
import b.InterfaceC0520d;

/* renamed from: p.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC4851k implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, AbstractC4846f abstractC4846f);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0520d interfaceC0520d;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i = AbstractBinderC0519c.f5517n;
        if (iBinder == null) {
            interfaceC0520d = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0520d.f5518j0);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0520d)) {
                C0518b c0518b = new C0518b();
                c0518b.f5516n = iBinder;
                interfaceC0520d = c0518b;
            } else {
                interfaceC0520d = (InterfaceC0520d) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new C4850j(interfaceC0520d, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
