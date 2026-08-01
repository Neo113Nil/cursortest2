package k2;

import android.os.RemoteException;
import q2.A0;
import q2.Y0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Object f38616a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public A0 f38617b;

    /* renamed from: c, reason: collision with root package name */
    public u f38618c;

    public final void a(u uVar) {
        Y0 y02;
        synchronized (this.f38616a) {
            this.f38618c = uVar;
            A0 a02 = this.f38617b;
            if (a02 == null) {
                return;
            }
            if (uVar == null) {
                y02 = null;
            } else {
                try {
                    y02 = new Y0(uVar);
                } catch (RemoteException e9) {
                    v2.i.d("Unable to call setVideoLifecycleCallbacks on video controller.", e9);
                }
            }
            a02.e2(y02);
        }
    }

    public final void b(A0 a02) {
        synchronized (this.f38616a) {
            try {
                this.f38617b = a02;
                u uVar = this.f38618c;
                if (uVar != null) {
                    a(uVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
