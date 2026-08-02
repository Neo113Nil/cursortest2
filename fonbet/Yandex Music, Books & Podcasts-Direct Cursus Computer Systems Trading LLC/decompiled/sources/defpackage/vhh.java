package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class vhh implements Runnable {
    public final /* synthetic */ mka a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ awc f;

    public vhh(awc awcVar, mka mkaVar, String str, int i, int i2, Bundle bundle) {
        this.f = awcVar;
        this.a = mkaVar;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mka mkaVar = this.a;
        IBinder binder = ((Messenger) mkaVar.a).getBinder();
        awc awcVar = this.f;
        ((nuh) awcVar.a).e.remove(binder);
        nuh nuhVar = (nuh) awcVar.a;
        int i = this.c;
        int i2 = this.d;
        String str = this.b;
        jhh jhhVar = new jhh(nuhVar, str, i, i2, mkaVar);
        nuhVar.f = jhhVar;
        g8c b = nuhVar.b(this.e);
        nuhVar.f = null;
        if (b == null) {
            StringBuilder u = ouj.u("No root for client ", str, " from service ");
            u.append(vhh.class.getName());
            Log.i("MBServiceCompat", u.toString());
            try {
                mkaVar.A(2, null);
                return;
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat(str));
                return;
            }
        }
        try {
            nuhVar.e.put(binder, jhhVar);
            binder.linkToDeath(jhhVar, 0);
            msh mshVar = nuhVar.h;
            if (mshVar != null) {
                mkaVar.u(mshVar, (Bundle) b.a);
            }
        } catch (RemoteException unused2) {
            Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat(str));
            nuhVar.e.remove(binder);
        }
    }
}
