package P2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes.dex */
public final class A extends c3.g {

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0376f f2419u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2420v;

    public A(AbstractC0376f abstractC0376f, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 0);
        this.f2419u = abstractC0376f;
        this.f2420v = i;
    }

    @Override // c3.g
    public final boolean S(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) c3.h.a(parcel, Bundle.CREATOR);
            c3.h.c(parcel);
            w.i(this.f2419u, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0376f abstractC0376f = this.f2419u;
            abstractC0376f.getClass();
            C c9 = new C(abstractC0376f, readInt, readStrongBinder, bundle);
            z zVar = abstractC0376f.f2457D;
            zVar.sendMessage(zVar.obtainMessage(1, this.f2420v, -1, c9));
            this.f2419u = null;
        } else if (i == 2) {
            parcel.readInt();
            c3.h.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            E e9 = (E) c3.h.a(parcel, E.CREATOR);
            c3.h.c(parcel);
            AbstractC0376f abstractC0376f2 = this.f2419u;
            w.i(abstractC0376f2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            w.h(e9);
            abstractC0376f2.f2472T = e9;
            if (abstractC0376f2 instanceof Z2.b) {
                C0377g c0377g = e9.f2429w;
                C0382l a9 = C0382l.a();
                m mVar = c0377g == null ? null : c0377g.f2481n;
                synchronized (a9) {
                    if (mVar == null) {
                        mVar = C0382l.f2514v;
                    } else {
                        m mVar2 = (m) a9.f2515n;
                        if (mVar2 != null) {
                            if (mVar2.f2516n < mVar.f2516n) {
                            }
                        }
                    }
                    a9.f2515n = mVar;
                }
            }
            Bundle bundle2 = e9.f2426n;
            w.i(this.f2419u, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0376f abstractC0376f3 = this.f2419u;
            abstractC0376f3.getClass();
            C c10 = new C(abstractC0376f3, readInt2, readStrongBinder2, bundle2);
            z zVar2 = abstractC0376f3.f2457D;
            zVar2.sendMessage(zVar2.obtainMessage(1, this.f2420v, -1, c10));
            this.f2419u = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
