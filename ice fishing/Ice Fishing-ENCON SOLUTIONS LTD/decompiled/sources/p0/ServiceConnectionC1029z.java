package p0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import s0.C1045a;

/* renamed from: p0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1029z implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8425a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f8426b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8427c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f8428d;

    /* renamed from: e, reason: collision with root package name */
    public final C1028y f8429e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f8430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1002B f8431g;

    public ServiceConnectionC1029z(C1002B c1002b, C1028y c1028y) {
        this.f8431g = c1002b;
        this.f8429e = c1028y;
    }

    public final void a(String str, Executor executor) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f8426b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            C1002B c1002b = this.f8431g;
            C1045a c1045a = c1002b.f8338d;
            Context context = c1002b.f8336b;
            boolean c2 = c1045a.c(context, str, this.f8429e.a(context), this, 4225, executor);
            this.f8427c = c2;
            if (c2) {
                this.f8431g.f8337c.sendMessageDelayed(this.f8431g.f8337c.obtainMessage(1, this.f8429e), this.f8431g.f8340f);
            } else {
                this.f8426b = 2;
                try {
                    C1002B c1002b2 = this.f8431g;
                    c1002b2.f8338d.b(c1002b2.f8336b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f8431g.f8335a) {
            try {
                this.f8431g.f8337c.removeMessages(1, this.f8429e);
                this.f8428d = iBinder;
                this.f8430f = componentName;
                Iterator it = this.f8425a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f8426b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f8431g.f8335a) {
            try {
                this.f8431g.f8337c.removeMessages(1, this.f8429e);
                this.f8428d = null;
                this.f8430f = componentName;
                Iterator it = this.f8425a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f8426b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
