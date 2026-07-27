package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.sp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3920sp extends AbstractC4082vp {

    /* renamed from: A, reason: collision with root package name */
    public final C5107a f34307A;

    /* renamed from: B, reason: collision with root package name */
    public final C3761pr f34308B;

    /* renamed from: z, reason: collision with root package name */
    public final Context f34309z;

    public C3920sp(Context context, C5107a c5107a, C3761pr c3761pr) {
        this.f34309z = context;
        this.f34307A = c5107a;
        this.f34308B = c3761pr;
    }

    @Override // O2.InterfaceC0365b
    public final void j() {
        synchronized (this.f34865u) {
            if (!this.f34867w) {
                this.f34867w = true;
                try {
                    ((InterfaceC2568Ge) this.f34869y.u()).p0(this.f34307A.f41217n);
                    this.f34308B.mo4a();
                } catch (RemoteException e6) {
                    this.f34308B.F(e6);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4082vp, O2.InterfaceC0366c
    public final void onConnectionFailed(L2.b bVar) {
        super.onConnectionFailed(bVar);
        this.f34308B.F(new RemoteException("Connection failed: ".concat(String.valueOf(bVar.f1714w))));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4082vp, O2.InterfaceC0365b
    public final void onConnectionSuspended(int i) {
        int i4 = t2.C.f40822b;
        u2.i.a("Cannot connect to remote service, fallback to local instance.");
        this.f34308B.F(new RemoteException(D.y.j(i, "Connection suspended with cause: ", new StringBuilder(String.valueOf(i).length() + 33))));
    }
}
