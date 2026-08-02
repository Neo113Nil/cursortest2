package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.op, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3715op extends AbstractC3930sp {

    /* renamed from: A, reason: collision with root package name */
    public final Context f33732A;

    /* renamed from: B, reason: collision with root package name */
    public final RD f33733B;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f33734z;

    public C3715op(Context context, RD rd, int i) {
        this.f33734z = i;
        switch (i) {
            case 1:
                this.f33732A = context;
                this.f33733B = rd;
                this.f34937y = new W8(context, C4906k.f40186C.f40207t.b(), this, this, 2);
                break;
            default:
                this.f33732A = context;
                this.f33733B = rd;
                this.f34937y = new W8(context, C4906k.f40186C.f40207t.b(), this, this, 2);
                break;
        }
    }

    public P3.a c(C2759Qe c2759Qe) {
        synchronized (this.f34933u) {
            try {
                if (this.f34934v) {
                    return this.f34932n;
                }
                this.f34934v = true;
                this.f34936x = c2759Qe;
                this.f34937y.o();
                C3490kg c3490kg = this.f34932n;
                c3490kg.f32256n.a(new RunnableC3493kj(13, this), AbstractC3436jg.f32062h);
                AbstractC3930sp.b(this.f33732A, c3490kg, this.f33733B);
                return c3490kg;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3930sp, R2.InterfaceC0377c
    public void onConnectionFailed(O2.b bVar) {
        switch (this.f33734z) {
            case 0:
                int i = w2.z.f41712b;
                x2.i.a("Cannot connect to remote service, fallback to local instance.");
                this.f34932n.c(new C4254yp(1));
                break;
            default:
                super.onConnectionFailed(bVar);
                break;
        }
    }

    @Override // R2.InterfaceC0376b
    public final void z() {
        switch (this.f33734z) {
            case 0:
                synchronized (this.f34933u) {
                    try {
                        if (!this.f34935w) {
                            this.f34935w = true;
                            try {
                                try {
                                    ((InterfaceC2657Ke) this.f34937y.u()).s1(this.f34936x, ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ae)).booleanValue() ? new BinderC3876rp(this.f34932n, this.f34936x) : new BinderC3823qp(this));
                                } catch (RemoteException | IllegalArgumentException unused) {
                                    this.f34932n.c(new C4254yp(1));
                                }
                            } catch (Throwable th) {
                                C4906k.f40186C.f40196h.d("RemoteAdRequestClientTask.onConnected", th);
                                this.f34932n.c(new C4254yp(1));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                synchronized (this.f34933u) {
                    try {
                        if (!this.f34935w) {
                            this.f34935w = true;
                            try {
                                ((InterfaceC2657Ke) this.f34937y.u()).Q2(this.f34936x, ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ae)).booleanValue() ? new BinderC3876rp(this.f34932n, this.f34936x) : new BinderC3823qp(this));
                            } catch (RemoteException | IllegalArgumentException unused2) {
                                this.f34932n.c(new C4254yp(1));
                            } catch (Throwable th3) {
                                C4906k.f40186C.f40196h.d("RemoteSignalsClientTask.onConnected", th3);
                                this.f34932n.c(new C4254yp(1));
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
