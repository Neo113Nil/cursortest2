package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.Yq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2886Yq implements LD {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f28889n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Wt f28890u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Ut f28891v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f28892w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C4304zv f28893x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C2953au f28894y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C2950ar f28895z;

    public C2886Yq(C2950ar c2950ar, long j9, Wt wt, Ut ut, String str, C4304zv c4304zv, C2953au c2953au) {
        this.f28889n = j9;
        this.f28890u = wt;
        this.f28891v = ut;
        this.f28892w = str;
        this.f28893x = c4304zv;
        this.f28894y = c2953au;
        Objects.requireNonNull(c2950ar);
        this.f28895z = c2950ar;
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public final void mo7l(Object obj) {
        long j9;
        C2950ar c2950ar = this.f28895z;
        c2950ar.f29337a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f28889n;
        synchronized (c2950ar) {
            try {
                if (c2950ar.f29341e) {
                    c2950ar.f29338b.l(this.f28890u, this.f28891v, 0, null, elapsedRealtime);
                    j9 = elapsedRealtime;
                } else {
                    j9 = elapsedRealtime;
                }
                if (c2950ar.f29343g) {
                    return;
                }
                Ut ut = this.f28891v;
                synchronized (c2950ar) {
                    C2903Zq c2903Zq = (C2903Zq) c2950ar.f29340d.get(ut);
                    if (c2903Zq != null) {
                        if (c2903Zq.f29072c == 8) {
                            ((C2903Zq) c2950ar.f29340d.get(ut)).f29073d = j9;
                            c2950ar.f29342f.c(ut, j9, null, true);
                        }
                    }
                    c2950ar.f29340d.put(ut, new C2903Zq(this.f28892w, ut.f28150f0, 0, j9, null));
                    c2950ar.f29342f.c(ut, j9, null, true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.LD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(Throwable th) {
        int i;
        C4927z0 c4927z0;
        Integer valueOf;
        long j9;
        int i4;
        C4927z0 c4927z02;
        C2950ar c2950ar = this.f28895z;
        c2950ar.f29337a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f28889n;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof C2784Sq) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof C3334hu) {
            i = 5;
        } else if (th instanceof C3275gp) {
            i = AbstractC3217fl.k(th).f40122n == 3 ? 1 : 6;
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31699j2)).booleanValue() && (th instanceof C3652nq) && (c4927z0 = ((C3652nq) th).f33032u) != null) {
                valueOf = Integer.valueOf(c4927z0.f40122n);
                synchronized (c2950ar) {
                    try {
                        if (c2950ar.f29341e) {
                            i4 = i;
                            c2950ar.f29338b.l(this.f28890u, this.f28891v, i4, th instanceof C3652nq ? (C3652nq) th : null, elapsedRealtime);
                            j9 = elapsedRealtime;
                        } else {
                            j9 = elapsedRealtime;
                            i4 = i;
                        }
                        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.z9)).booleanValue()) {
                            Av av = c2950ar.f29339c;
                            C4304zv c4304zv = this.f28893x;
                            C2953au c2953au = this.f28894y;
                            Ut ut = this.f28891v;
                            av.a(c4304zv.a(c2953au, ut, ut.f28163n), ut.f28184x0);
                        }
                        if (c2950ar.f29343g) {
                            return;
                        }
                        LinkedHashMap linkedHashMap = c2950ar.f29340d;
                        Ut ut2 = this.f28891v;
                        linkedHashMap.put(ut2, new C2903Zq(this.f28892w, ut2.f28150f0, i4, j9, valueOf));
                        C4927z0 k6 = AbstractC3217fl.k(th);
                        int i9 = k6.f40122n;
                        if ((i9 == 3 || i9 == 0) && (c4927z02 = k6.f40125w) != null && !c4927z02.f40124v.equals("com.google.android.gms.ads")) {
                            k6 = AbstractC3217fl.k(new C3652nq(13, k6.f40125w));
                        }
                        c2950ar.f29342f.c(ut2, j9, k6, false);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            i = 6;
        }
        valueOf = null;
        synchronized (c2950ar) {
        }
    }
}
