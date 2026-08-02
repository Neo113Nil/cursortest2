package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.pp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3769pp extends AbstractC3930sp {

    /* renamed from: A, reason: collision with root package name */
    public final C5189a f33921A;

    /* renamed from: B, reason: collision with root package name */
    public final C3717or f33922B;

    /* renamed from: z, reason: collision with root package name */
    public final Context f33923z;

    public C3769pp(Context context, C5189a c5189a, C3717or c3717or) {
        this.f33923z = context;
        this.f33921A = c5189a;
        this.f33922B = c3717or;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3930sp, R2.InterfaceC0377c
    public final void onConnectionFailed(O2.b bVar) {
        super.onConnectionFailed(bVar);
        this.f33922B.F(new RemoteException("Connection failed: ".concat(String.valueOf(bVar.f2258w))));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3930sp, R2.InterfaceC0376b
    public final void onConnectionSuspended(int i) {
        int i4 = w2.z.f41712b;
        x2.i.a("Cannot connect to remote service, fallback to local instance.");
        this.f33922B.F(new RemoteException(D.x.k(i, "Connection suspended with cause: ", new StringBuilder(String.valueOf(i).length() + 33))));
    }

    @Override // R2.InterfaceC0376b
    public final void z() {
        synchronized (this.f34933u) {
            if (!this.f34935w) {
                this.f34935w = true;
                try {
                    ((InterfaceC2657Ke) this.f34937y.u()).s0(this.f33921A.f41845n);
                    this.f33922B.mo7c();
                } catch (RemoteException e9) {
                    this.f33922B.F(e9);
                }
            }
        }
    }
}
