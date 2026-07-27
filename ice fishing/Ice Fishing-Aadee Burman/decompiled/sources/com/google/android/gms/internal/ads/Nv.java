package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Nv implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26566n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Fv f26567u;

    public /* synthetic */ Nv(Fv fv, int i, boolean z3) {
        this.f26566n = i;
        this.f26567u = fv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fv fv = this.f26567u;
        switch (this.f26566n) {
            case 0:
                fv.v();
                break;
            case 1:
                q2.N n9 = fv.f24873h;
                if (n9 != null) {
                    try {
                        q2.V0 v02 = (q2.V0) fv.f24870e.get();
                        Parcel H02 = n9.H0();
                        AbstractC3388j8.c(H02, v02);
                        n9.f1(H02, 2);
                    } catch (RemoteException unused) {
                        int i = u2.z.f41319b;
                        v2.i.f("Failed to call onAdsExhausted");
                    }
                }
                q2.P p9 = fv.i;
                if (p9 != null) {
                    try {
                        String str = fv.f24876l;
                        Parcel H03 = p9.H0();
                        H03.writeString(str);
                        p9.f1(H03, 2);
                        break;
                    } catch (RemoteException unused2) {
                        int i6 = u2.z.f41319b;
                        v2.i.f("Failed to call onAdsExhausted");
                        return;
                    }
                }
                break;
            case 2:
                if (fv.f24881q != null) {
                    fv.f24882r.getClass();
                    fv.f24881q.A("pae", "paeo_ts", System.currentTimeMillis(), fv.s(), 0, null, fv.f24883s, fv.g());
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
        this.f26566n = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(fv);
                this.f26567u = fv;
                break;
            case 2:
                Objects.requireNonNull(fv);
                this.f26567u = fv;
                break;
            default:
                Objects.requireNonNull(fv);
                this.f26567u = fv;
                break;
        }
    }
}
