package O2;

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
    public final HashMap f2361n;

    /* renamed from: u, reason: collision with root package name */
    public int f2362u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2363v;

    /* renamed from: w, reason: collision with root package name */
    public IBinder f2364w;

    /* renamed from: x, reason: collision with root package name */
    public final F f2365x;

    /* renamed from: y, reason: collision with root package name */
    public ComponentName f2366y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ I f2367z;

    public G(I i, F f6) {
        Objects.requireNonNull(i);
        this.f2367z = i;
        this.f2365x = f6;
        this.f2361n = new HashMap();
        this.f2362u = 2;
    }

    public final L2.b a(String str, Executor executor) {
        try {
            Intent a9 = y.a(this.f2367z.f2372b, this.f2365x);
            this.f2362u = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(S2.e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                I i = this.f2367z;
                R2.b bVar = i.f2374d;
                Context context = i.f2372b;
                F f6 = this.f2365x;
                try {
                    boolean c4 = bVar.c(context, str, a9, this, 4225, executor);
                    this.f2363v = c4;
                    if (c4) {
                        i.f2373c.sendMessageDelayed(i.f2373c.obtainMessage(1, f6), i.f2376f);
                        L2.b bVar2 = L2.b.f1710y;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar2;
                    }
                    this.f2362u = 2;
                    try {
                        i.f2374d.b(i.f2372b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    L2.b bVar3 = new L2.b(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar3;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (x e6) {
            return e6.f2485n;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        I i = this.f2367z;
        synchronized (i.f2371a) {
            try {
                i.f2373c.removeMessages(1, this.f2365x);
                this.f2364w = iBinder;
                this.f2366y = componentName;
                Iterator it = this.f2361n.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f2362u = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        I i = this.f2367z;
        synchronized (i.f2371a) {
            try {
                i.f2373c.removeMessages(1, this.f2365x);
                this.f2364w = null;
                this.f2366y = componentName;
                Iterator it = this.f2361n.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f2362u = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
