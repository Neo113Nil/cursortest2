package com.gamericefishpro.space.r8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.gamericefishpro.space.u6.s;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ServiceConnection {
    public int d = 0;
    public final Messenger e;
    public s i;
    public final ArrayDeque v;
    public final SparseArray w;
    public final /* synthetic */ m y;

    public k(m mVar) {
        this.y = mVar;
        com.gamericefishpro.space.f9.e eVar = new com.gamericefishpro.space.f9.e(Looper.getMainLooper(), new com.gamericefishpro.space.ma.e(1, this));
        Looper.getMainLooper();
        this.e = new Messenger(eVar);
        this.v = new ArrayDeque();
        this.w = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.d;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.d = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.d = 4;
            com.gamericefishpro.space.y8.a.b().c((Context) this.y.b, this);
            com.gamericefishpro.space.f1.h hVar = new com.gamericefishpro.space.f1.h(str, securityException);
            Iterator it = this.v.iterator();
            while (it.hasNext()) {
                ((l) it.next()).b(hVar);
            }
            this.v.clear();
            for (int i2 = 0; i2 < this.w.size(); i2++) {
                ((l) this.w.valueAt(i2)).b(hVar);
            }
            this.w.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        if (this.d == 2 && this.v.isEmpty() && this.w.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.d = 3;
            com.gamericefishpro.space.y8.a.b().c((Context) this.y.b, this);
        }
    }

    public final synchronized boolean d(l lVar) {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                this.v.add(lVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.v.add(lVar);
            ((ScheduledExecutorService) this.y.c).execute(new j(this, 0));
            return true;
        }
        this.v.add(lVar);
        if (this.d != 0) {
            throw new IllegalStateException();
        }
        Log.isLoggable("MessengerIpcClient", 2);
        this.d = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (com.gamericefishpro.space.y8.a.b().a((Context) this.y.b, intent, this, 1)) {
                ((ScheduledExecutorService) this.y.c).schedule(new j(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e) {
            b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        ((ScheduledExecutorService) this.y.c).execute(new com.gamericefishpro.space.va.a(24, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        ((ScheduledExecutorService) this.y.c).execute(new j(this, 2));
    }
}
