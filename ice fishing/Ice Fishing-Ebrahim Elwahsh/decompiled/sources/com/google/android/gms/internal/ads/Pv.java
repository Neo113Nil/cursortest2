package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Pv implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27078n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Hv f27079u;

    public /* synthetic */ Pv(Hv hv, int i, boolean z8) {
        this.f27078n = i;
        this.f27079u = hv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Hv hv = this.f27079u;
        switch (this.f27078n) {
            case 0:
                hv.v();
                break;
            case 1:
                q2.N n9 = hv.f25453h;
                if (n9 != null) {
                    try {
                        q2.W0 w02 = (q2.W0) hv.f25450e.get();
                        Parcel A02 = n9.A0();
                        AbstractC3241g8.c(A02, w02);
                        n9.G0(A02, 2);
                    } catch (RemoteException unused) {
                        int i = t2.C.f40822b;
                        u2.i.f("Failed to call onAdsExhausted");
                    }
                }
                q2.P p6 = hv.i;
                if (p6 != null) {
                    try {
                        String str = hv.f25456l;
                        Parcel A03 = p6.A0();
                        A03.writeString(str);
                        p6.G0(A03, 2);
                        break;
                    } catch (RemoteException unused2) {
                        int i4 = t2.C.f40822b;
                        u2.i.f("Failed to call onAdsExhausted");
                        return;
                    }
                }
                break;
            case 2:
                if (hv.f25461q != null) {
                    hv.f25462r.getClass();
                    hv.f25461q.y("pae", "paeo_ts", System.currentTimeMillis(), hv.s(), 0, null, hv.f25463s, hv.g());
                    break;
                }
                break;
            case 3:
                hv.e();
                break;
            case 4:
                hv.e();
                break;
            default:
                hv.w();
                break;
        }
    }

    public Pv(Hv hv, int i) {
        this.f27078n = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(hv);
                this.f27079u = hv;
                break;
            case 2:
                Objects.requireNonNull(hv);
                this.f27079u = hv;
                break;
            default:
                Objects.requireNonNull(hv);
                this.f27079u = hv;
                break;
        }
    }
}
