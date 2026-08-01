package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import q2.InterfaceC4870a;
import q2.InterfaceC4909u;

/* loaded from: classes2.dex */
public final class Fr implements InterfaceC4870a, InterfaceC2542El {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC4909u f24853n;

    @Override // com.google.android.gms.internal.ads.InterfaceC2542El
    public final synchronized void J() {
        InterfaceC4909u interfaceC4909u = this.f24853n;
        if (interfaceC4909u != null) {
            try {
                interfaceC4909u.t();
            } catch (RemoteException e9) {
                int i = u2.z.f41322b;
                v2.i.g("Remote Exception at onPhysicalClick.", e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2542El
    public final synchronized void M() {
    }

    @Override // q2.InterfaceC4870a
    public final synchronized void onAdClicked() {
        InterfaceC4909u interfaceC4909u = this.f24853n;
        if (interfaceC4909u != null) {
            try {
                interfaceC4909u.t();
            } catch (RemoteException e9) {
                int i = u2.z.f41322b;
                v2.i.g("Remote Exception at onAdClicked.", e9);
            }
        }
    }
}
