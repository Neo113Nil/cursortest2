package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class jsn extends arh implements ServiceConnection {
    public static final /* synthetic */ int q = 0;
    public final ComponentName i;
    public final fsn j;
    public final ArrayList k;
    public boolean l;
    public boolean m;
    public dsn n;
    public boolean o;
    public h5n p;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public jsn(Context context, ComponentName componentName) {
        super(context, new qec(14, componentName));
        this.k = new ArrayList();
        this.i = componentName;
        this.j = new fsn();
    }

    @Override // defpackage.arh
    public final yqh c(String str) {
        if (str == null) {
            xq0.x("initialMemberRouteId cannot be null.");
            return null;
        }
        bz2 bz2Var = this.g;
        if (bz2Var == null) {
            return null;
        }
        List list = (List) bz2Var.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((dqh) list.get(i)).d().equals(str)) {
                hsn hsnVar = new hsn(this, str);
                this.k.add(hsnVar);
                if (this.o) {
                    hsnVar.a(this.n);
                }
                m();
                return hsnVar;
            }
        }
        return null;
    }

    @Override // defpackage.arh
    public final zqh d(String str) {
        if (str != null) {
            return j(str, null);
        }
        xq0.x("routeId cannot be null");
        return null;
    }

    @Override // defpackage.arh
    public final zqh e(String str, String str2) {
        if (str == null) {
            xq0.x("routeId cannot be null");
            return null;
        }
        if (str2 != null) {
            return j(str, str2);
        }
        xq0.x("routeGroupId cannot be null");
        return null;
    }

    @Override // defpackage.arh
    public final void f(fqh fqhVar) {
        if (this.o) {
            dsn dsnVar = this.n;
            int i = dsnVar.d;
            dsnVar.d = i + 1;
            dsnVar.b(10, i, 0, fqhVar != null ? fqhVar.a : null, null);
        }
        m();
    }

    public final void i() {
        if (this.m) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.i);
        try {
            this.m = this.a.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    public final isn j(String str, String str2) {
        bz2 bz2Var = this.g;
        if (bz2Var == null) {
            return null;
        }
        List list = (List) bz2Var.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((dqh) list.get(i)).d().equals(str)) {
                isn isnVar = new isn(this, str, str2);
                this.k.add(isnVar);
                if (this.o) {
                    isnVar.a(this.n);
                }
                m();
                return isnVar;
            }
        }
        return null;
    }

    public final void k() {
        if (this.n != null) {
            g(null);
            this.o = false;
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((esn) arrayList.get(i)).c();
            }
            dsn dsnVar = this.n;
            dsnVar.b(2, 0, 0, null, null);
            dsnVar.b.b.clear();
            dsnVar.a.getBinder().unlinkToDeath(dsnVar, 0);
            dsnVar.i.j.post(new csn(dsnVar, 0));
            this.n = null;
        }
    }

    public final void l() {
        if (this.m) {
            this.m = false;
            k();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    public final void m() {
        if (!this.l || (this.e == null && this.k.isEmpty())) {
            l();
        } else {
            i();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.m) {
            k();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        dsn dsnVar = new dsn(this, messenger);
                        int i = dsnVar.d;
                        dsnVar.d = i + 1;
                        dsnVar.g = i;
                        if (dsnVar.b(1, i, 4, null, null)) {
                            try {
                                dsnVar.a.getBinder().linkToDeath(dsnVar, 0);
                                this.n = dsnVar;
                                return;
                            } catch (RemoteException unused) {
                                dsnVar.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k();
    }

    public final String toString() {
        return "Service connection " + this.i.flattenToShortString();
    }
}
