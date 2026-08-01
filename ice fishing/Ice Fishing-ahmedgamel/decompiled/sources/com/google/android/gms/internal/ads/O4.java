package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class O4 implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final C3657o7 f26587n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3918t f26588u;

    public /* synthetic */ O4(C3918t c3918t, C3657o7 c3657o7) {
        Objects.requireNonNull(c3918t);
        this.f26588u = c3918t;
        this.f26587n = c3657o7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC3550m8 c3442k8;
        AbstractC3043cl.n("Install Referrer service connected.");
        int i = AbstractBinderC3496l8.f31740n;
        if (iBinder == null) {
            c3442k8 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            c3442k8 = queryLocalInterface instanceof InterfaceC3550m8 ? (InterfaceC3550m8) queryLocalInterface : new C3442k8(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
        }
        C3918t c3918t = this.f26588u;
        c3918t.f34180w = c3442k8;
        c3918t.f34177n = 2;
        this.f26587n.h(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC3043cl.v("Install Referrer service disconnected.");
        C3918t c3918t = this.f26588u;
        c3918t.f34180w = null;
        c3918t.f34177n = 0;
    }
}
