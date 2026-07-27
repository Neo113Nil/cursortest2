package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import q2.InterfaceC4904r0;

/* loaded from: classes2.dex */
public final class Er implements InterfaceC2795Tk {

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f24664n = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.InterfaceC2795Tk
    public final void a(q2.g1 g1Var) {
        Object obj = this.f24664n.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4904r0) obj).p1(g1Var);
        } catch (RemoteException e9) {
            int i = u2.z.f41319b;
            v2.i.i("#007 Could not call remote method.", e9);
        } catch (NullPointerException e10) {
            int i6 = u2.z.f41319b;
            v2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }
}
