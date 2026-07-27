package O2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes.dex */
public final class A extends b3.g {

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0369f f2347n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2348u;

    public A(AbstractC0369f abstractC0369f, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f2347n = abstractC0369f;
        this.f2348u = i;
    }

    @Override // b3.g
    public final boolean i0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) b3.h.a(parcel, Bundle.CREATOR);
            b3.h.c(parcel);
            w.i(this.f2347n, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0369f abstractC0369f = this.f2347n;
            abstractC0369f.getClass();
            C c4 = new C(abstractC0369f, readInt, readStrongBinder, bundle);
            z zVar = abstractC0369f.f2385D;
            zVar.sendMessage(zVar.obtainMessage(1, this.f2348u, -1, c4));
            this.f2347n = null;
        } else if (i == 2) {
            parcel.readInt();
            b3.h.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            E e6 = (E) b3.h.a(parcel, E.CREATOR);
            b3.h.c(parcel);
            AbstractC0369f abstractC0369f2 = this.f2347n;
            w.i(abstractC0369f2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            w.h(e6);
            abstractC0369f2.f2400T = e6;
            if (abstractC0369f2 instanceof Y2.b) {
                C0370g c0370g = e6.f2357w;
                C0375l a9 = C0375l.a();
                m mVar = c0370g == null ? null : c0370g.f2409n;
                synchronized (a9) {
                    if (mVar == null) {
                        mVar = C0375l.f2442v;
                    } else {
                        m mVar2 = (m) a9.f2443n;
                        if (mVar2 != null) {
                            if (mVar2.f2444n < mVar.f2444n) {
                            }
                        }
                    }
                    a9.f2443n = mVar;
                }
            }
            Bundle bundle2 = e6.f2354n;
            w.i(this.f2347n, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0369f abstractC0369f3 = this.f2347n;
            abstractC0369f3.getClass();
            C c9 = new C(abstractC0369f3, readInt2, readStrongBinder2, bundle2);
            z zVar2 = abstractC0369f3.f2385D;
            zVar2.sendMessage(zVar2.obtainMessage(1, this.f2348u, -1, c9));
            this.f2347n = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
