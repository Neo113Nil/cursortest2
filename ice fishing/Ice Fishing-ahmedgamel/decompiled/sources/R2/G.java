package R2;

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
    public final HashMap f2754n;

    /* renamed from: u, reason: collision with root package name */
    public int f2755u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2756v;

    /* renamed from: w, reason: collision with root package name */
    public IBinder f2757w;

    /* renamed from: x, reason: collision with root package name */
    public final F f2758x;

    /* renamed from: y, reason: collision with root package name */
    public ComponentName f2759y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ I f2760z;

    public G(I i, F f2) {
        Objects.requireNonNull(i);
        this.f2760z = i;
        this.f2758x = f2;
        this.f2754n = new HashMap();
        this.f2755u = 2;
    }

    public final O2.b a(String str, Executor executor) {
        try {
            Intent a9 = y.a(this.f2760z.f2765b, this.f2758x);
            this.f2755u = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(V2.e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                I i = this.f2760z;
                U2.a aVar = i.f2767d;
                Context context = i.f2765b;
                F f2 = this.f2758x;
                try {
                    boolean c9 = aVar.c(context, str, a9, this, 4225, executor);
                    this.f2756v = c9;
                    if (c9) {
                        i.f2766c.sendMessageDelayed(i.f2766c.obtainMessage(1, f2), i.f2769f);
                        O2.b bVar = O2.b.f2254y;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.f2755u = 2;
                    try {
                        i.f2767d.b(i.f2765b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    O2.b bVar2 = new O2.b(16, null, null);
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
            return e9.f2878n;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        I i = this.f2760z;
        synchronized (i.f2764a) {
            try {
                i.f2766c.removeMessages(1, this.f2758x);
                this.f2757w = iBinder;
                this.f2759y = componentName;
                Iterator it = this.f2754n.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f2755u = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        I i = this.f2760z;
        synchronized (i.f2764a) {
            try {
                i.f2766c.removeMessages(1, this.f2758x);
                this.f2757w = null;
                this.f2759y = componentName;
                Iterator it = this.f2754n.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f2755u = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
