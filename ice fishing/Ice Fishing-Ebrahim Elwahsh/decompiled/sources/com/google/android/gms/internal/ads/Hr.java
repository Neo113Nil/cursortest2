package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import q2.InterfaceC4877a;
import q2.InterfaceC4916u;

/* loaded from: classes2.dex */
public final class Hr implements InterfaceC4877a, InterfaceC2524Dl {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC4916u f25429n;

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dl
    public final synchronized void C() {
        InterfaceC4916u interfaceC4916u = this.f25429n;
        if (interfaceC4916u != null) {
            try {
                interfaceC4916u.z();
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.g("Remote Exception at onPhysicalClick.", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dl
    public final synchronized void L() {
    }

    @Override // q2.InterfaceC4877a
    public final synchronized void onAdClicked() {
        InterfaceC4916u interfaceC4916u = this.f25429n;
        if (interfaceC4916u != null) {
            try {
                interfaceC4916u.z();
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.g("Remote Exception at onAdClicked.", e6);
            }
        }
    }
}
