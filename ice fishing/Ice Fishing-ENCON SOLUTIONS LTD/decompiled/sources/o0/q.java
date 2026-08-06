package o0;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f8297a;

    public q(int i2) {
        this.f8297a = i2;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(l lVar);

    public abstract m0.d[] b(l lVar);

    public abstract void c(Status status);

    public abstract void d(RuntimeException runtimeException);

    public abstract void e(l lVar);

    public abstract void f(o.b bVar, boolean z2);
}
