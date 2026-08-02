package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import s2.InterfaceC4953r0;

/* loaded from: classes2.dex */
public final class Er implements InterfaceC2816Tk {

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f25420n = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.InterfaceC2816Tk
    public final void b(s2.g1 g1Var) {
        Object obj = this.f25420n.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4953r0) obj).R3(g1Var);
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i4 = w2.z.f41712b;
            x2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }
}
