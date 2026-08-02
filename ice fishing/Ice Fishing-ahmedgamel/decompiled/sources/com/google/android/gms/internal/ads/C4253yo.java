package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.yo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4253yo implements InterfaceC3875ro {

    /* renamed from: a, reason: collision with root package name */
    public final long f36009a;

    /* renamed from: b, reason: collision with root package name */
    public final C3680o7 f36010b;

    /* renamed from: c, reason: collision with root package name */
    public final Ot f36011c;

    public C4253yo(long j6, Context context, C3680o7 c3680o7, C3332hi c3332hi, String str) {
        this.f36009a = j6;
        this.f36010b = c3680o7;
        this.f36011c = (Ot) ((C3266gN) new C3067cm(c3332hi.f31635b, context, str).f30366v).f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3875ro
    public final void a(s2.c1 c1Var) {
        try {
            this.f36011c.R1(c1Var, new BinderC4145wo(this));
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3875ro
    public final void f() {
        try {
            Ot ot = this.f36011c;
            ot.X1(new BinderC4199xo(this));
            ot.K1(new Y2.b(null));
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3875ro
    public final void i() {
    }
}
