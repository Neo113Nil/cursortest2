package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import s2.InterfaceC4919a;
import s2.InterfaceC4958u;

/* loaded from: classes2.dex */
public final class Fr implements InterfaceC4919a, InterfaceC2579Fl {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC4958u f25643n;

    @Override // com.google.android.gms.internal.ads.InterfaceC2579Fl
    public final synchronized void D() {
        InterfaceC4958u interfaceC4958u = this.f25643n;
        if (interfaceC4958u != null) {
            try {
                interfaceC4958u.t();
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.g("Remote Exception at onPhysicalClick.", e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2579Fl
    public final synchronized void L() {
    }

    @Override // s2.InterfaceC4919a
    public final synchronized void onAdClicked() {
        InterfaceC4958u interfaceC4958u = this.f25643n;
        if (interfaceC4958u != null) {
            try {
                interfaceC4958u.t();
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.g("Remote Exception at onAdClicked.", e9);
            }
        }
    }
}
