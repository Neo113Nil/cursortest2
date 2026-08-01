package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.op, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3692op extends AbstractC3907sp {

    /* renamed from: A, reason: collision with root package name */
    public final Context f32946A;

    /* renamed from: B, reason: collision with root package name */
    public final RD f32947B;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f32948z;

    public C3692op(Context context, RD rd, int i) {
        this.f32948z = i;
        switch (i) {
            case 1:
                this.f32946A = context;
                this.f32947B = rd;
                this.f34151y = new W8(context, C4835j.f39733C.f39754t.b(), this, this, 2);
                break;
            default:
                this.f32946A = context;
                this.f32947B = rd;
                this.f34151y = new W8(context, C4835j.f39733C.f39754t.b(), this, this, 2);
                break;
        }
    }

    public N3.a c(C2739Qe c2739Qe) {
        synchronized (this.f34147u) {
            try {
                if (this.f34148v) {
                    return this.f34146n;
                }
                this.f34148v = true;
                this.f34150x = c2739Qe;
                this.f34151y.o();
                C3467kg c3467kg = this.f34146n;
                c3467kg.f31479n.a(new RunnableC3470kj(13, this), AbstractC3413jg.f31275h);
                AbstractC3907sp.b(this.f32946A, c3467kg, this.f32947B);
                return c3467kg;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3907sp, P2.InterfaceC0373c
    public void onConnectionFailed(M2.b bVar) {
        switch (this.f32948z) {
            case 0:
                int i = u2.z.f41322b;
                v2.i.a("Cannot connect to remote service, fallback to local instance.");
                this.f34146n.c(new C4231yp(1));
                break;
            default:
                super.onConnectionFailed(bVar);
                break;
        }
    }

    @Override // P2.InterfaceC0372b
    public final void r() {
        switch (this.f32948z) {
            case 0:
                synchronized (this.f34147u) {
                    try {
                        if (!this.f34149w) {
                            this.f34149w = true;
                            try {
                                try {
                                    ((InterfaceC2637Ke) this.f34151y.u()).v1(this.f34150x, ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ae)).booleanValue() ? new BinderC3853rp(this.f34146n, this.f34150x) : new BinderC3800qp(this));
                                } catch (RemoteException | IllegalArgumentException unused) {
                                    this.f34146n.c(new C4231yp(1));
                                }
                            } catch (Throwable th) {
                                C4835j.f39733C.f39743h.d("RemoteAdRequestClientTask.onConnected", th);
                                this.f34146n.c(new C4231yp(1));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                synchronized (this.f34147u) {
                    try {
                        if (!this.f34149w) {
                            this.f34149w = true;
                            try {
                                ((InterfaceC2637Ke) this.f34151y.u()).T2(this.f34150x, ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ae)).booleanValue() ? new BinderC3853rp(this.f34146n, this.f34150x) : new BinderC3800qp(this));
                            } catch (RemoteException | IllegalArgumentException unused2) {
                                this.f34146n.c(new C4231yp(1));
                            } catch (Throwable th3) {
                                C4835j.f39733C.f39743h.d("RemoteSignalsClientTask.onConnected", th3);
                                this.f34146n.c(new C4231yp(1));
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }
}
