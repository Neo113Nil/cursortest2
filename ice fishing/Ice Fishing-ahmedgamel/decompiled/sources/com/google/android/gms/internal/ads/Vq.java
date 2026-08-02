package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import s2.C4969z0;

/* loaded from: classes2.dex */
public final class Vq implements KD {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f29041n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Ut f29042u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ St f29043v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f29044w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C4206xv f29045x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Yt f29046y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Xq f29047z;

    public Vq(Xq xq, long j6, Ut ut, St st, String str, C4206xv c4206xv, Yt yt) {
        this.f29041n = j6;
        this.f29042u = ut;
        this.f29043v = st;
        this.f29044w = str;
        this.f29045x = c4206xv;
        this.f29046y = yt;
        Objects.requireNonNull(xq);
        this.f29047z = xq;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public final void mo10n(Object obj) {
        long j6;
        Xq xq = this.f29047z;
        xq.f29362a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f29041n;
        synchronized (xq) {
            try {
                if (xq.f29366e) {
                    xq.f29363b.k(this.f29042u, this.f29043v, 0, null, elapsedRealtime);
                    j6 = elapsedRealtime;
                } else {
                    j6 = elapsedRealtime;
                }
                if (xq.f29368g) {
                    return;
                }
                St st = this.f29043v;
                synchronized (xq) {
                    Wq wq = (Wq) xq.f29365d.get(st);
                    if (wq != null) {
                        if (wq.f29192c == 8) {
                            ((Wq) xq.f29365d.get(st)).f29193d = j6;
                            xq.f29367f.c(st, j6, null, true);
                        }
                    }
                    xq.f29365d.put(st, new Wq(this.f29044w, st.f28400f0, 0, j6, null));
                    xq.f29367f.c(st, j6, null, true);
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
        C4969z0 c4969z0;
        Integer valueOf;
        long j6;
        int i4;
        C4969z0 c4969z02;
        Xq xq = this.f29047z;
        xq.f29362a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f29041n;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof C2754Pq) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof C3290gu) {
            i = 5;
        } else if (th instanceof C3231fp) {
            i = SK.k(th).f40512n == 3 ? 1 : 6;
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33059j2)).booleanValue() && (th instanceof C3554lq) && (c4969z0 = ((C3554lq) th).f32639u) != null) {
                valueOf = Integer.valueOf(c4969z0.f40512n);
                synchronized (xq) {
                    try {
                        if (xq.f29366e) {
                            i4 = i;
                            xq.f29363b.k(this.f29042u, this.f29043v, i4, th instanceof C3554lq ? (C3554lq) th : null, elapsedRealtime);
                            j6 = elapsedRealtime;
                        } else {
                            j6 = elapsedRealtime;
                            i4 = i;
                        }
                        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.z9)).booleanValue()) {
                            C4260yv c4260yv = xq.f29364c;
                            C4206xv c4206xv = this.f29045x;
                            Yt yt = this.f29046y;
                            St st = this.f29043v;
                            c4260yv.a(c4206xv.a(yt, st, st.f28413n), st.f28434x0);
                        }
                        if (xq.f29368g) {
                            return;
                        }
                        LinkedHashMap linkedHashMap = xq.f29365d;
                        St st2 = this.f29043v;
                        linkedHashMap.put(st2, new Wq(this.f29044w, st2.f28400f0, i4, j6, valueOf));
                        C4969z0 k9 = SK.k(th);
                        int i6 = k9.f40512n;
                        if ((i6 == 3 || i6 == 0) && (c4969z02 = k9.f40515w) != null && !c4969z02.f40514v.equals("com.google.android.gms.ads")) {
                            k9 = SK.k(new C3554lq(13, k9.f40515w));
                        }
                        xq.f29367f.c(st2, j6, k9, false);
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
