package Q2;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public final int f2506a;

    public I(int i) {
        this.f2506a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(C c9);

    public abstract O2.d[] b(C c9);

    public abstract void c(Status status);

    public abstract void d(RuntimeException runtimeException);

    public abstract void e(C c9);

    public abstract void f(S0.s sVar, boolean z6);
}
