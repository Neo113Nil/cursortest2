package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class O4 implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final C3680o7 f27369n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3941t f27370u;

    public /* synthetic */ O4(C3941t c3941t, C3680o7 c3680o7) {
        Objects.requireNonNull(c3941t);
        this.f27370u = c3941t;
        this.f27369n = c3680o7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC3573m8 c3465k8;
        AbstractC3066cl.n("Install Referrer service connected.");
        int i = AbstractBinderC3519l8.f32520n;
        if (iBinder == null) {
            c3465k8 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            c3465k8 = queryLocalInterface instanceof InterfaceC3573m8 ? (InterfaceC3573m8) queryLocalInterface : new C3465k8(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 1);
        }
        C3941t c3941t = this.f27370u;
        c3941t.f34966w = c3465k8;
        c3941t.f34963n = 2;
        this.f27369n.l(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC3066cl.v("Install Referrer service disconnected.");
        C3941t c3941t = this.f27370u;
        c3941t.f34966w = null;
        c3941t.f34963n = 0;
    }
}
