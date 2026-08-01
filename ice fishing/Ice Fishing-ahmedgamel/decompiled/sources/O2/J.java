package O2;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public final int f2188a;

    public J(int i) {
        this.f2188a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(D d2);

    public abstract M2.d[] b(D d2);

    public abstract void c(Status status);

    public abstract void d(RuntimeException runtimeException);

    public abstract void e(D d2);

    public abstract void f(C0361k c0361k, boolean z3);
}
