package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.pp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3746pp extends AbstractC3907sp {

    /* renamed from: A, reason: collision with root package name */
    public final C5110a f33135A;

    /* renamed from: B, reason: collision with root package name */
    public final C3694or f33136B;

    /* renamed from: z, reason: collision with root package name */
    public final Context f33137z;

    public C3746pp(Context context, C5110a c5110a, C3694or c3694or) {
        this.f33137z = context;
        this.f33135A = c5110a;
        this.f33136B = c3694or;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3907sp, P2.InterfaceC0373c
    public final void onConnectionFailed(M2.b bVar) {
        super.onConnectionFailed(bVar);
        this.f33136B.F(new RemoteException("Connection failed: ".concat(String.valueOf(bVar.f1832w))));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3907sp, P2.InterfaceC0372b
    public final void onConnectionSuspended(int i) {
        int i6 = u2.z.f41319b;
        v2.i.a("Cannot connect to remote service, fallback to local instance.");
        this.f33136B.F(new RemoteException(D.y.m(i, "Connection suspended with cause: ", new StringBuilder(String.valueOf(i).length() + 33))));
    }

    @Override // P2.InterfaceC0372b
    public final void r() {
        synchronized (this.f34147u) {
            if (!this.f34149w) {
                this.f34149w = true;
                try {
                    ((InterfaceC2637Ke) this.f34151y.u()).v0(this.f33135A.f41388n);
                    this.f33136B.mo8c();
                } catch (RemoteException e9) {
                    this.f33136B.F(e9);
                }
            }
        }
    }
}
