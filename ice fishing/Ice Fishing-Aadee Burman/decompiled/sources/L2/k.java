package L2;

import P2.w;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.LD;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public int f1647n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Messenger f1648u;

    /* renamed from: v, reason: collision with root package name */
    public S0.l f1649v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayDeque f1650w;

    /* renamed from: x, reason: collision with root package name */
    public final SparseArray f1651x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f1652y;

    public k(n nVar) {
        this.f1652y = nVar;
        a3.e eVar = new a3.e(Looper.getMainLooper(), new F1.g(2, this), 1);
        Looper.getMainLooper();
        this.f1648u = new Messenger(eVar);
        this.f1650w = new ArrayDeque();
        this.f1651x = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.f1647n;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.f1647n = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f1647n = 4;
            S2.a.a().b((Context) this.f1652y.f1660b, this);
            m mVar = new m(str, securityException);
            Iterator it = this.f1650w.iterator();
            while (it.hasNext()) {
                ((l) it.next()).b(mVar);
            }
            this.f1650w.clear();
            for (int i6 = 0; i6 < this.f1651x.size(); i6++) {
                ((l) this.f1651x.valueAt(i6)).b(mVar);
            }
            this.f1651x.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f1647n == 2 && this.f1650w.isEmpty() && this.f1651x.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f1647n = 3;
                S2.a.a().b((Context) this.f1652y.f1660b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(l lVar) {
        Throwable th;
        int i;
        S2.a a9;
        Context context;
        try {
            try {
                i = this.f1647n;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (i != 0) {
                    if (i == 1) {
                        this.f1650w.add(lVar);
                        return true;
                    }
                    if (i != 2) {
                        return false;
                    }
                    this.f1650w.add(lVar);
                    ((ScheduledExecutorService) this.f1652y.f1661c).execute(new j(this, 0));
                    return true;
                }
                this.f1650w.add(lVar);
                w.k(this.f1647n == 0);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f1647n = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a9 = S2.a.a();
                    context = (Context) this.f1652y.f1660b;
                } catch (SecurityException e9) {
                    e = e9;
                }
                try {
                    if (a9.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) this.f1652y.f1661c).schedule(new j(this, 1), 30L, TimeUnit.SECONDS);
                    } else {
                        a("Unable to bind to service");
                    }
                } catch (SecurityException e10) {
                    e = e10;
                    b("Unable to bind to service", e);
                    return true;
                }
                return true;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f1652y.f1661c).execute(new LD(13, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f1652y.f1661c).execute(new j(this, 2));
    }
}
