package com.google.android.gms.internal.ads;

import a3.AbstractC0432a;
import android.os.RemoteException;
import java.util.Objects;
import q2.C4901p0;

/* loaded from: classes2.dex */
public final class Nt implements G2.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26561n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC0432a f26562u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractBinderC3336i8 f26563v;

    public Nt(Ot ot, C4901p0 c4901p0) {
        this.f26562u = c4901p0;
        Objects.requireNonNull(ot);
        this.f26563v = ot;
    }

    @Override // G2.a
    public final void c() {
        AbstractC0432a abstractC0432a = this.f26562u;
        AbstractBinderC3336i8 abstractBinderC3336i8 = this.f26563v;
        switch (this.f26561n) {
            case 0:
                if (((Ot) abstractBinderC3336i8).f26670C != null) {
                    try {
                        C4901p0 c4901p0 = (C4901p0) abstractC0432a;
                        c4901p0.f1(c4901p0.H0(), 1);
                        break;
                    } catch (RemoteException e9) {
                        int i = u2.z.f41319b;
                        v2.i.i("#007 Could not call remote method.", e9);
                        return;
                    }
                }
                break;
            default:
                if (((Qt) abstractBinderC3336i8).f27126w != null) {
                    try {
                        q2.M m4 = (q2.M) abstractC0432a;
                        m4.f1(m4.H0(), 1);
                        break;
                    } catch (RemoteException e10) {
                        int i6 = u2.z.f41319b;
                        v2.i.i("#007 Could not call remote method.", e10);
                    }
                }
                break;
        }
    }

    public Nt(Qt qt, q2.M m4) {
        this.f26562u = m4;
        this.f26563v = qt;
    }
}
