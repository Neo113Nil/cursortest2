package com.gamericefishpro.space.u8;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {
    public final int a;

    public h0(int i) {
        this.a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(a0 a0Var);

    public abstract com.gamericefishpro.space.s8.d[] b(a0 a0Var);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(a0 a0Var);

    public abstract void f(com.gamericefishpro.space.u6.c cVar, boolean z);
}
