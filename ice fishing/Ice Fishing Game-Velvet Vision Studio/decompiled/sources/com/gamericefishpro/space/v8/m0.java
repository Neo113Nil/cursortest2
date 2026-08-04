package com.gamericefishpro.space.v8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements ServiceConnection {
    public final HashMap d = new HashMap();
    public int e = 2;
    public boolean i;
    public IBinder v;
    public final l0 w;
    public ComponentName y;
    public final /* synthetic */ n0 z;

    public m0(n0 n0Var, l0 l0Var) {
        this.z = n0Var;
        this.w = l0Var;
    }

    public final com.gamericefishpro.space.s8.b a(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = e0.a(this.z.b, this.w);
            this.e = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(com.gamericefishpro.space.z8.e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                n0 n0Var = this.z;
                com.gamericefishpro.space.y8.a aVar = n0Var.d;
                Context context = n0Var.b;
                l0 l0Var = this.w;
                try {
                    boolean zD = aVar.d(context, str, intentA, this, 4225, executor);
                    this.i = zD;
                    if (zD) {
                        n0Var.c.sendMessageDelayed(n0Var.c.obtainMessage(1, l0Var), n0Var.f);
                        com.gamericefishpro.space.s8.b bVar = com.gamericefishpro.space.s8.b.y;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.e = 2;
                    try {
                        n0Var.d.c(n0Var.b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    com.gamericefishpro.space.s8.b bVar2 = new com.gamericefishpro.space.s8.b(16, null, null);
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
        } catch (d0 e) {
            return e.d;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        n0 n0Var = this.z;
        synchronized (n0Var.a) {
            try {
                n0Var.c.removeMessages(1, this.w);
                this.v = iBinder;
                this.y = componentName;
                Iterator it = this.d.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.e = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        n0 n0Var = this.z;
        synchronized (n0Var.a) {
            try {
                n0Var.c.removeMessages(1, this.w);
                this.v = null;
                this.y = componentName;
                Iterator it = this.d.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.e = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
