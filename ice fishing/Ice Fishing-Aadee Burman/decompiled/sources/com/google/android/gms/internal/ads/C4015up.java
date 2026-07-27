package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.up, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4015up extends AbstractC3907sp {

    /* renamed from: A, reason: collision with root package name */
    public int f34591A;

    /* renamed from: z, reason: collision with root package name */
    public String f34592z;

    @Override // com.google.android.gms.internal.ads.AbstractC3907sp, P2.InterfaceC0373c
    public final void onConnectionFailed(M2.b bVar) {
        int i = u2.z.f41319b;
        v2.i.a("Cannot connect to remote service, fallback to local instance.");
        this.f34146n.c(new C4231yp(1));
    }

    @Override // P2.InterfaceC0372b
    public final void r() {
        synchronized (this.f34147u) {
            try {
                if (!this.f34149w) {
                    this.f34149w = true;
                    try {
                        try {
                            int i = this.f34591A;
                            if (i == 2) {
                                ((InterfaceC2637Ke) this.f34151y.u()).q2(this.f34150x, ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Ae)).booleanValue() ? new BinderC3853rp(this.f34146n, this.f34150x) : new BinderC3800qp(this));
                            } else if (i == 3) {
                                ((InterfaceC2637Ke) this.f34151y.u()).V1(this.f34592z, ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Ae)).booleanValue() ? new BinderC3853rp(this.f34146n, this.f34150x) : new BinderC3800qp(this));
                            } else {
                                this.f34146n.c(new C4231yp(1));
                            }
                        } catch (Throwable th) {
                            C4835j.f39730C.f39740h.d("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                            this.f34146n.c(new C4231yp(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f34146n.c(new C4231yp(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
