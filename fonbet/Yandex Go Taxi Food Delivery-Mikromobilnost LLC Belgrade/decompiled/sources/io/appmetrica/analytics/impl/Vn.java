package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import defpackage.g8e;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class Vn implements ServiceWakeLock {
    public final Context a;
    public final Un b;
    public final HashMap c = new HashMap();

    public Vn(Context context, Un un) {
        this.a = context;
        this.b = un;
    }

    public final String a(String str) {
        return g8e.o("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK.", str);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(String str) {
        try {
            if (this.c.get(str) == null) {
                HashMap hashMap = this.c;
                Un un = this.b;
                Context context = this.a;
                String a = a(str);
                un.a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(a);
                Tn tn = new Tn();
                try {
                    context.bindService(intent, tn, 1);
                } catch (Throwable unused) {
                    tn = null;
                }
                hashMap.put(str, tn);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.c.get(str);
        if (serviceConnection != null) {
            Un un = this.b;
            a(str);
            Context context = this.a;
            un.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
