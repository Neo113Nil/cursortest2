package p6;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5548a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f5549b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5550c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f5551d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f5552e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f5553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f5554g;

    public c0(d0 d0Var, b0 b0Var) {
        this.f5554g = d0Var;
        this.f5552e = b0Var;
    }

    public final void a(String str, Executor executor) {
        s6.a aVar;
        Context context;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f5549b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            d0 d0Var = this.f5554g;
            aVar = d0Var.f5568d;
            context = d0Var.f5566b;
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean c3 = aVar.c(context, str, this.f5552e.a(context), this, 4225, executor);
            this.f5550c = c3;
            if (c3) {
                this.f5554g.f5567c.sendMessageDelayed(this.f5554g.f5567c.obtainMessage(1, this.f5552e), this.f5554g.f5570f);
            } else {
                this.f5549b = 2;
                try {
                    d0 d0Var2 = this.f5554g;
                    d0Var2.f5568d.b(d0Var2.f5566b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            StrictMode.setVmPolicy(vmPolicy);
            throw th3;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f5554g.f5565a) {
            try {
                this.f5554g.f5567c.removeMessages(1, this.f5552e);
                this.f5551d = iBinder;
                this.f5553f = componentName;
                Iterator it = this.f5548a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f5549b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f5554g.f5565a) {
            try {
                this.f5554g.f5567c.removeMessages(1, this.f5552e);
                this.f5551d = null;
                this.f5553f = componentName;
                Iterator it = this.f5548a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f5549b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
