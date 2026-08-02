package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Nv implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27348n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Fv f27349u;

    public /* synthetic */ Nv(Fv fv, int i, boolean z6) {
        this.f27348n = i;
        this.f27349u = fv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fv fv = this.f27349u;
        switch (this.f27348n) {
            case 0:
                fv.v();
                break;
            case 1:
                s2.N n9 = fv.f25663h;
                if (n9 != null) {
                    try {
                        s2.V0 v02 = (s2.V0) fv.f25660e.get();
                        Parcel F02 = n9.F0();
                        AbstractC3411j8.c(F02, v02);
                        n9.d1(F02, 2);
                    } catch (RemoteException unused) {
                        int i = w2.z.f41712b;
                        x2.i.f("Failed to call onAdsExhausted");
                    }
                }
                s2.P p9 = fv.i;
                if (p9 != null) {
                    try {
                        String str = fv.f25666l;
                        Parcel F03 = p9.F0();
                        F03.writeString(str);
                        p9.d1(F03, 2);
                        break;
                    } catch (RemoteException unused2) {
                        int i4 = w2.z.f41712b;
                        x2.i.f("Failed to call onAdsExhausted");
                        return;
                    }
                }
                break;
            case 2:
                if (fv.f25671q != null) {
                    fv.f25672r.getClass();
                    fv.f25671q.A("pae", "paeo_ts", System.currentTimeMillis(), fv.s(), 0, null, fv.f25673s, fv.g());
                    break;
                }
                break;
            case 3:
                fv.e();
                break;
            case 4:
                fv.e();
                break;
            default:
                fv.w();
                break;
        }
    }

    public Nv(Fv fv, int i) {
        this.f27348n = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(fv);
                this.f27349u = fv;
                break;
            case 2:
                Objects.requireNonNull(fv);
                this.f27349u = fv;
                break;
            default:
                Objects.requireNonNull(fv);
                this.f27349u = fv;
                break;
        }
    }
}
