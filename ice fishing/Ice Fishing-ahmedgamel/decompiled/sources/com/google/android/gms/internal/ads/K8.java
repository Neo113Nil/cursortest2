package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o2.AbstractC4802b;
import s2.InterfaceC4963w0;

/* loaded from: classes2.dex */
public final class K8 extends AbstractC4802b {

    /* renamed from: a, reason: collision with root package name */
    public final N8 f26623a;

    /* renamed from: b, reason: collision with root package name */
    public final L8 f26624b = new L8("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");

    public K8(N8 n82, String str) {
        new AtomicLong();
        this.f26623a = n82;
        new AtomicReference(str);
    }

    @Override // o2.AbstractC4802b
    public final m2.s a() {
        InterfaceC4963w0 interfaceC4963w0;
        try {
            interfaceC4963w0 = this.f26623a.h();
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
            interfaceC4963w0 = null;
        }
        return new m2.s(interfaceC4963w0);
    }

    @Override // o2.AbstractC4802b
    public final void c(Activity activity) {
        try {
            this.f26623a.O0(new Y2.b(activity), this.f26624b);
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }
}
