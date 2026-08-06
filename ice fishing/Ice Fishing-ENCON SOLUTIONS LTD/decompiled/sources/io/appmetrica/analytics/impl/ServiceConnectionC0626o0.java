package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0626o0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0652p0 f6640a;

    public ServiceConnectionC0626o0(C0652p0 c0652p0) {
        this.f6640a = c0652p0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f6640a) {
            this.f6640a.f6705d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f6640a.f6706e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6640a) {
            this.f6640a.f6705d = null;
        }
    }
}
