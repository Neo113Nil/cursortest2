package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import s2.C4969z0;

/* loaded from: classes2.dex */
public final /* synthetic */ class Hr implements InterfaceC4195xk {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Dr f26139n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2638Jc f26140u;

    public /* synthetic */ Hr(Dr dr, C2638Jc c2638Jc) {
        this.f26139n = dr;
        this.f26140u = c2638Jc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4195xk
    public final void I(C4969z0 c4969z0) {
        this.f26139n.I(c4969z0);
        C2638Jc c2638Jc = this.f26140u;
        if (c2638Jc != null) {
            try {
                Parcel F02 = c2638Jc.F0();
                AbstractC3411j8.c(F02, c4969z0);
                c2638Jc.d1(F02, 3);
            } catch (RemoteException e9) {
                x2.i.i("#007 Could not call remote method.", e9);
            }
        }
        if (c2638Jc != null) {
            try {
                int i = c4969z0.f40512n;
                Parcel F03 = c2638Jc.F0();
                F03.writeInt(i);
                c2638Jc.d1(F03, 2);
            } catch (RemoteException e10) {
                x2.i.i("#007 Could not call remote method.", e10);
            }
        }
    }
}
