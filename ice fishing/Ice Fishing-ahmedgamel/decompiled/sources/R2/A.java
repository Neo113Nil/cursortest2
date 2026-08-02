package R2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes.dex */
public final class A extends e3.g {

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0380f f2740u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2741v;

    public A(AbstractC0380f abstractC0380f, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 0);
        this.f2740u = abstractC0380f;
        this.f2741v = i;
    }

    @Override // e3.g
    public final boolean S(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) e3.h.a(parcel, Bundle.CREATOR);
            e3.h.c(parcel);
            w.i(this.f2740u, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0380f abstractC0380f = this.f2740u;
            abstractC0380f.getClass();
            C c9 = new C(abstractC0380f, readInt, readStrongBinder, bundle);
            z zVar = abstractC0380f.f2778D;
            zVar.sendMessage(zVar.obtainMessage(1, this.f2741v, -1, c9));
            this.f2740u = null;
        } else if (i == 2) {
            parcel.readInt();
            e3.h.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            E e9 = (E) e3.h.a(parcel, E.CREATOR);
            e3.h.c(parcel);
            AbstractC0380f abstractC0380f2 = this.f2740u;
            w.i(abstractC0380f2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            w.h(e9);
            abstractC0380f2.f2793T = e9;
            if (abstractC0380f2 instanceof b3.b) {
                C0381g c0381g = e9.f2750w;
                C0386l a9 = C0386l.a();
                m mVar = c0381g == null ? null : c0381g.f2802n;
                synchronized (a9) {
                    if (mVar == null) {
                        mVar = C0386l.f2835v;
                    } else {
                        m mVar2 = (m) a9.f2836n;
                        if (mVar2 != null) {
                            if (mVar2.f2837n < mVar.f2837n) {
                            }
                        }
                    }
                    a9.f2836n = mVar;
                }
            }
            Bundle bundle2 = e9.f2747n;
            w.i(this.f2740u, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0380f abstractC0380f3 = this.f2740u;
            abstractC0380f3.getClass();
            C c10 = new C(abstractC0380f3, readInt2, readStrongBinder2, bundle2);
            z zVar2 = abstractC0380f3.f2778D;
            zVar2.sendMessage(zVar2.obtainMessage(1, this.f2741v, -1, c10));
            this.f2740u = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
