package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.up, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4038up extends AbstractC3930sp {

    /* renamed from: A, reason: collision with root package name */
    public int f35354A;

    /* renamed from: z, reason: collision with root package name */
    public String f35355z;

    @Override // com.google.android.gms.internal.ads.AbstractC3930sp, R2.InterfaceC0377c
    public final void onConnectionFailed(O2.b bVar) {
        int i = w2.z.f41712b;
        x2.i.a("Cannot connect to remote service, fallback to local instance.");
        this.f34932n.c(new C4254yp(1));
    }

    @Override // R2.InterfaceC0376b
    public final void z() {
        synchronized (this.f34933u) {
            try {
                if (!this.f34935w) {
                    this.f34935w = true;
                    try {
                        try {
                            int i = this.f35354A;
                            if (i == 2) {
                                ((InterfaceC2657Ke) this.f34937y.u()).k2(this.f34936x, ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ae)).booleanValue() ? new BinderC3876rp(this.f34932n, this.f34936x) : new BinderC3823qp(this));
                            } else if (i == 3) {
                                ((InterfaceC2657Ke) this.f34937y.u()).V1(this.f35355z, ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ae)).booleanValue() ? new BinderC3876rp(this.f34932n, this.f34936x) : new BinderC3823qp(this));
                            } else {
                                this.f34932n.c(new C4254yp(1));
                            }
                        } catch (Throwable th) {
                            C4906k.f40186C.f40196h.d("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                            this.f34932n.c(new C4254yp(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f34932n.c(new C4254yp(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
