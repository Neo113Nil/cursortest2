package io.appmetrica.analytics.impl;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;

/* renamed from: io.appmetrica.analytics.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractServiceC0897z0 extends Service {
    public C0667r2 a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        C0667r2 c0667r2 = this.a;
        if (c0667r2 == null) {
            c0667r2 = null;
        }
        return c0667r2.a(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0667r2 c0667r2 = this.a;
        if (c0667r2 == null) {
            c0667r2 = null;
        }
        c0667r2.a(configuration);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.a == null) {
            this.a = new C0667r2(this, new A0(this));
        }
        C0667r2 c0667r2 = this.a;
        if (c0667r2 == null) {
            c0667r2 = null;
        }
        c0667r2.b();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C0667r2 c0667r2 = this.a;
        if (c0667r2 == null) {
            c0667r2 = null;
        }
        c0667r2.c();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        C0667r2 c0667r2 = this.a;
        if (c0667r2 == null) {
            c0667r2 = null;
        }
        c0667r2.b(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C0667r2 c0667r2 = this.a;
        if (c0667r2 == null) {
            c0667r2 = null;
        }
        return c0667r2.a(intent, i, i2);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        C0667r2 c0667r2 = this.a;
        if (c0667r2 == null) {
            c0667r2 = null;
        }
        return c0667r2.c(intent);
    }
}
