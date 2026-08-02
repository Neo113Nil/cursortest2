package m2;

import android.os.RemoteException;
import s2.A0;
import s2.Y0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Object f39405a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public A0 f39406b;

    /* renamed from: c, reason: collision with root package name */
    public u f39407c;

    public final void a(u uVar) {
        Y0 y02;
        synchronized (this.f39405a) {
            this.f39407c = uVar;
            A0 a02 = this.f39406b;
            if (a02 == null) {
                return;
            }
            if (uVar == null) {
                y02 = null;
            } else {
                try {
                    y02 = new Y0(uVar);
                } catch (RemoteException e9) {
                    x2.i.d("Unable to call setVideoLifecycleCallbacks on video controller.", e9);
                }
            }
            a02.Y1(y02);
        }
    }

    public final void b(A0 a02) {
        synchronized (this.f39405a) {
            try {
                this.f39406b = a02;
                u uVar = this.f39407c;
                if (uVar != null) {
                    a(uVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
