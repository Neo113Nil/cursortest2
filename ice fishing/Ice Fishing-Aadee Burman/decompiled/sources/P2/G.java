package P2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class G implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f2433n;

    /* renamed from: u, reason: collision with root package name */
    public int f2434u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2435v;

    /* renamed from: w, reason: collision with root package name */
    public IBinder f2436w;

    /* renamed from: x, reason: collision with root package name */
    public final F f2437x;

    /* renamed from: y, reason: collision with root package name */
    public ComponentName f2438y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ I f2439z;

    public G(I i, F f3) {
        Objects.requireNonNull(i);
        this.f2439z = i;
        this.f2437x = f3;
        this.f2433n = new HashMap();
        this.f2434u = 2;
    }

    public final M2.b a(String str, Executor executor) {
        try {
            Intent a9 = y.a(this.f2439z.f2444b, this.f2437x);
            this.f2434u = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(T2.e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                I i = this.f2439z;
                S2.a aVar = i.f2446d;
                Context context = i.f2444b;
                F f3 = this.f2437x;
                try {
                    boolean c9 = aVar.c(context, str, a9, this, 4225, executor);
                    this.f2435v = c9;
                    if (c9) {
                        i.f2445c.sendMessageDelayed(i.f2445c.obtainMessage(1, f3), i.f2448f);
                        M2.b bVar = M2.b.f1828y;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.f2434u = 2;
                    try {
                        i.f2446d.b(i.f2444b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    M2.b bVar2 = new M2.b(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (x e9) {
            return e9.f2557n;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        I i = this.f2439z;
        synchronized (i.f2443a) {
            try {
                i.f2445c.removeMessages(1, this.f2437x);
                this.f2436w = iBinder;
                this.f2438y = componentName;
                Iterator it = this.f2433n.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f2434u = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        I i = this.f2439z;
        synchronized (i.f2443a) {
            try {
                i.f2445c.removeMessages(1, this.f2437x);
                this.f2436w = null;
                this.f2438y = componentName;
                Iterator it = this.f2433n.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f2434u = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
