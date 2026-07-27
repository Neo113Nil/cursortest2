package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.yo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4243yo implements InterfaceC3919so {

    /* renamed from: a, reason: collision with root package name */
    public final long f35409a;

    /* renamed from: b, reason: collision with root package name */
    public final C3562m7 f35410b;

    /* renamed from: c, reason: collision with root package name */
    public final Rt f35411c;

    public C4243yo(long j9, Context context, C3562m7 c3562m7, C3214fi c3214fi, String str) {
        this.f35409a = j9;
        this.f35410b = c3562m7;
        this.f35411c = (Rt) ((C4009uN) new C2881Yl(c3214fi.f30795b, context, str).f28863v).d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3919so
    public final void a(q2.d1 d1Var) {
        try {
            this.f35411c.f2(d1Var, new BinderC4135wo(this));
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3919so
    public final void d() {
        try {
            Rt rt = this.f35411c;
            rt.h1(new BinderC4189xo(this));
            rt.i3(new V2.b(null));
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3919so
    public final void i() {
    }
}
