package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import m2.AbstractC4731b;
import q2.InterfaceC4914w0;

/* loaded from: classes2.dex */
public final class K8 extends AbstractC4731b {

    /* renamed from: a, reason: collision with root package name */
    public final N8 f25871a;

    /* renamed from: b, reason: collision with root package name */
    public final L8 f25872b = new L8("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");

    public K8(N8 n82, String str) {
        new AtomicLong();
        this.f25871a = n82;
        new AtomicReference(str);
    }

    @Override // m2.AbstractC4731b
    public final k2.s a() {
        InterfaceC4914w0 interfaceC4914w0;
        try {
            interfaceC4914w0 = this.f25871a.h();
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
            interfaceC4914w0 = null;
        }
        return new k2.s(interfaceC4914w0);
    }

    @Override // m2.AbstractC4731b
    public final void c(Activity activity) {
        try {
            this.f25871a.M3(new W2.b(activity), this.f25872b);
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }
}
