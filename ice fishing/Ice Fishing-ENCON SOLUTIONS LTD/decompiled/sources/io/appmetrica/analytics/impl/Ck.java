package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Ck implements ServiceWakeLock {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4272a;

    /* renamed from: b, reason: collision with root package name */
    public final Bk f4273b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4274c = new HashMap();

    public Ck(Context context, Bk bk) {
        this.f4272a = context;
        this.f4273b = bk;
    }

    public final String a(String str) {
        return C1.a.i("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK.", str);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(String str) {
        try {
            if (this.f4274c.get(str) == null) {
                HashMap hashMap = this.f4274c;
                Bk bk = this.f4273b;
                Context context = this.f4272a;
                String a2 = a(str);
                bk.f4223a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(a2);
                Ak ak = new Ak();
                try {
                    context.bindService(intent, ak, 1);
                } catch (Throwable unused) {
                    ak = null;
                }
                hashMap.put(str, ak);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4274c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f4274c.get(str);
        if (serviceConnection != null) {
            Bk bk = this.f4273b;
            a(str);
            Context context = this.f4272a;
            bk.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
