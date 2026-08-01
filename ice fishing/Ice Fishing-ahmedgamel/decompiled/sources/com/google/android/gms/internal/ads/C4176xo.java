package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.xo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4176xo implements InterfaceC3799qo {

    /* renamed from: a, reason: collision with root package name */
    public final long f35051a;

    /* renamed from: b, reason: collision with root package name */
    public final C3657o7 f35052b;

    /* renamed from: c, reason: collision with root package name */
    public final Ot f35053c;

    public C4176xo(long j6, Context context, C3657o7 c3657o7, C3309hi c3309hi, String str) {
        this.f35051a = j6;
        this.f35052b = c3657o7;
        this.f35053c = (Ot) ((C3243gN) new C2991bm(c3309hi.f30874b, context, str).f29324v).f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3799qo
    public final void a(q2.c1 c1Var) {
        try {
            this.f35053c.k1(c1Var, new BinderC4068vo(this));
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3799qo
    public final void f() {
        try {
            Ot ot = this.f35053c;
            ot.Z1(new BinderC4122wo(this));
            ot.X1(new W2.b(null));
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3799qo
    public final void i() {
    }
}
