package io.appmetrica.analytics.impl;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;

/* renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0755t0 extends Service {

    /* renamed from: a, reason: collision with root package name */
    public L1 f6921a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        L1 l12 = this.f6921a;
        if (l12 != null) {
            return l12.a(intent);
        }
        kotlin.jvm.internal.i.i("serviceDelegate");
        throw null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        L1 l12 = this.f6921a;
        if (l12 != null) {
            l12.a(configuration);
        } else {
            kotlin.jvm.internal.i.i("serviceDelegate");
            throw null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.f6921a == null) {
            this.f6921a = new L1(this, new C0781u0(this));
        }
        L1 l12 = this.f6921a;
        if (l12 != null) {
            l12.b();
        } else {
            kotlin.jvm.internal.i.i("serviceDelegate");
            throw null;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        L1 l12 = this.f6921a;
        if (l12 != null) {
            l12.c();
        } else {
            kotlin.jvm.internal.i.i("serviceDelegate");
            throw null;
        }
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        L1 l12 = this.f6921a;
        if (l12 != null) {
            l12.b(intent);
        } else {
            kotlin.jvm.internal.i.i("serviceDelegate");
            throw null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        L1 l12 = this.f6921a;
        if (l12 != null) {
            return l12.a(intent, i2, i3);
        }
        kotlin.jvm.internal.i.i("serviceDelegate");
        throw null;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        L1 l12 = this.f6921a;
        if (l12 != null) {
            return l12.c(intent);
        }
        kotlin.jvm.internal.i.i("serviceDelegate");
        throw null;
    }
}
