package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import q2.C4920z0;

/* loaded from: classes2.dex */
public final class Vq implements KD {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f28243n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Ut f28244u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ St f28245v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f28246w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C4183xv f28247x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Yt f28248y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Xq f28249z;

    public Vq(Xq xq, long j6, Ut ut, St st, String str, C4183xv c4183xv, Yt yt) {
        this.f28243n = j6;
        this.f28244u = ut;
        this.f28245v = st;
        this.f28246w = str;
        this.f28247x = c4183xv;
        this.f28248y = yt;
        Objects.requireNonNull(xq);
        this.f28249z = xq;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public final void mo11n(Object obj) {
        long j6;
        Xq xq = this.f28249z;
        xq.f28581a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f28243n;
        synchronized (xq) {
            try {
                if (xq.f28585e) {
                    xq.f28582b.k(this.f28244u, this.f28245v, 0, null, elapsedRealtime);
                    j6 = elapsedRealtime;
                } else {
                    j6 = elapsedRealtime;
                }
                if (xq.f28587g) {
                    return;
                }
                St st = this.f28245v;
                synchronized (xq) {
                    Wq wq = (Wq) xq.f28584d.get(st);
                    if (wq != null) {
                        if (wq.f28410c == 8) {
                            ((Wq) xq.f28584d.get(st)).f28411d = j6;
                            xq.f28586f.c(st, j6, null, true);
                        }
                    }
                    xq.f28584d.put(st, new Wq(this.f28246w, st.f27617f0, 0, j6, null));
                    xq.f28586f.c(st, j6, null, true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.KD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(Throwable th) {
        int i;
        C4920z0 c4920z0;
        Integer valueOf;
        long j6;
        int i6;
        C4920z0 c4920z02;
        Xq xq = this.f28249z;
        xq.f28581a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f28243n;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof C2734Pq) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof C3267gu) {
            i = 5;
        } else if (th instanceof C3208fp) {
            i = SK.k(th).f40213n == 3 ? 1 : 6;
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32280j2)).booleanValue() && (th instanceof C3531lq) && (c4920z0 = ((C3531lq) th).f31859u) != null) {
                valueOf = Integer.valueOf(c4920z0.f40213n);
                synchronized (xq) {
                    try {
                        if (xq.f28585e) {
                            i6 = i;
                            xq.f28582b.k(this.f28244u, this.f28245v, i6, th instanceof C3531lq ? (C3531lq) th : null, elapsedRealtime);
                            j6 = elapsedRealtime;
                        } else {
                            j6 = elapsedRealtime;
                            i6 = i;
                        }
                        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.z9)).booleanValue()) {
                            C4237yv c4237yv = xq.f28583c;
                            C4183xv c4183xv = this.f28247x;
                            Yt yt = this.f28248y;
                            St st = this.f28245v;
                            c4237yv.a(c4183xv.a(yt, st, st.f27630n), st.f27651x0);
                        }
                        if (xq.f28587g) {
                            return;
                        }
                        LinkedHashMap linkedHashMap = xq.f28584d;
                        St st2 = this.f28245v;
                        linkedHashMap.put(st2, new Wq(this.f28246w, st2.f27617f0, i6, j6, valueOf));
                        C4920z0 k9 = SK.k(th);
                        int i9 = k9.f40213n;
                        if ((i9 == 3 || i9 == 0) && (c4920z02 = k9.f40216w) != null && !c4920z02.f40215v.equals("com.google.android.gms.ads")) {
                            k9 = SK.k(new C3531lq(13, k9.f40216w));
                        }
                        xq.f28586f.c(st2, j6, k9, false);
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
        synchronized (xq) {
        }
    }
}
