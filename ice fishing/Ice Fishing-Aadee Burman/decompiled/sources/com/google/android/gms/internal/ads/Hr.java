package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import q2.C4920z0;

/* loaded from: classes2.dex */
public final /* synthetic */ class Hr implements InterfaceC4172xk {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Dr f25396n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2618Jc f25397u;

    public /* synthetic */ Hr(Dr dr, C2618Jc c2618Jc) {
        this.f25396n = dr;
        this.f25397u = c2618Jc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4172xk
    public final void v(C4920z0 c4920z0) {
        this.f25396n.v(c4920z0);
        C2618Jc c2618Jc = this.f25397u;
        if (c2618Jc != null) {
            try {
                Parcel H02 = c2618Jc.H0();
                AbstractC3388j8.c(H02, c4920z0);
                c2618Jc.f1(H02, 3);
            } catch (RemoteException e9) {
                v2.i.i("#007 Could not call remote method.", e9);
            }
        }
        if (c2618Jc != null) {
            try {
                int i = c4920z0.f40210n;
                Parcel H03 = c2618Jc.H0();
                H03.writeInt(i);
                c2618Jc.f1(H03, 2);
            } catch (RemoteException e10) {
                v2.i.i("#007 Could not call remote method.", e10);
            }
        }
    }
}
