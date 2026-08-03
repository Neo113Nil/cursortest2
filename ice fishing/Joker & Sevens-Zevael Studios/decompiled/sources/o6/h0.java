package o6;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5278a;

    public h0(int i10) {
        this.f5278a = i10;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(b0 b0Var);

    public abstract m6.d[] b(b0 b0Var);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(b0 b0Var);

    public abstract void f(x4.c cVar, boolean z10);
}
