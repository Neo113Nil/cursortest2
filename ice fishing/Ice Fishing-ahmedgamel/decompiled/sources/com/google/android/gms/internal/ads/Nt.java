package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import c3.AbstractC0549a;
import java.util.Objects;
import s2.C4950p0;

/* loaded from: classes2.dex */
public final class Nt implements I2.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27343n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC0549a f27344u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractBinderC3359i8 f27345v;

    public Nt(Ot ot, C4950p0 c4950p0) {
        this.f27344u = c4950p0;
        Objects.requireNonNull(ot);
        this.f27345v = ot;
    }

    @Override // I2.a
    public final void a() {
        AbstractC0549a abstractC0549a = this.f27344u;
        AbstractBinderC3359i8 abstractBinderC3359i8 = this.f27345v;
        switch (this.f27343n) {
            case 0:
                if (((Ot) abstractBinderC3359i8).f27453C != null) {
                    try {
                        C4950p0 c4950p0 = (C4950p0) abstractC0549a;
                        c4950p0.d1(c4950p0.F0(), 1);
                        break;
                    } catch (RemoteException e9) {
                        int i = w2.z.f41712b;
                        x2.i.i("#007 Could not call remote method.", e9);
                        return;
                    }
                }
                break;
            default:
                if (((Qt) abstractBinderC3359i8).f27882w != null) {
                    try {
                        s2.M m9 = (s2.M) abstractC0549a;
                        m9.d1(m9.F0(), 1);
                        break;
                    } catch (RemoteException e10) {
                        int i4 = w2.z.f41712b;
                        x2.i.i("#007 Could not call remote method.", e10);
                    }
                }
                break;
        }
    }

    public Nt(Qt qt, s2.M m9) {
        this.f27344u = m9;
        this.f27345v = qt;
    }
}
