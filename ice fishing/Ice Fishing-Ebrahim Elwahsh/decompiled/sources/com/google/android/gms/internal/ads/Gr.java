package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import q2.InterfaceC4911r0;

/* loaded from: classes2.dex */
public final class Gr implements InterfaceC2761Rk {

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f25227n = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.InterfaceC2761Rk
    public final void a(q2.h1 h1Var) {
        Object obj = this.f25227n.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4911r0) obj).v1(h1Var);
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i4 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }
}
