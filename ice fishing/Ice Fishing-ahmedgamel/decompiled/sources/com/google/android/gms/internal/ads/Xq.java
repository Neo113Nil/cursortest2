package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Xq {

    /* renamed from: a, reason: collision with root package name */
    public final T2.a f28581a;

    /* renamed from: b, reason: collision with root package name */
    public final C3481ku f28582b;

    /* renamed from: c, reason: collision with root package name */
    public final C4237yv f28583c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f28584d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28585e = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.K7)).booleanValue();

    /* renamed from: f, reason: collision with root package name */
    public final C3585mq f28586f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28587g;

    /* renamed from: h, reason: collision with root package name */
    public long f28588h;
    public long i;

    public Xq(T2.a aVar, C3481ku c3481ku, C3585mq c3585mq, C4237yv c4237yv) {
        this.f28581a = aVar;
        this.f28582b = c3481ku;
        this.f28586f = c3585mq;
        this.f28583c = c4237yv;
    }

    public final synchronized void a(List list) {
        this.f28581a.getClass();
        this.i = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            St st = (St) it.next();
            String str = st.f27648w;
            if (!TextUtils.isEmpty(str)) {
                this.f28584d.put(st, new Wq(str, st.f27617f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void b(Yt yt, St st, N3.a aVar, C4183xv c4183xv) {
        Ut ut = (Ut) yt.f28754b.f25043v;
        this.f28581a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = st.f27648w;
        if (str != null) {
            this.f28584d.put(st, new Wq(str, st.f27617f0, 9, 0L, null));
            Vq vq = new Vq(this, elapsedRealtime, ut, st, str, c4183xv, yt);
            aVar.a(new LD(0, aVar, vq), AbstractC3413jg.f31275h);
        }
    }

    public final synchronized void c(St st) {
        Wq wq = (Wq) this.f28584d.get(st);
        if (wq == null || this.f28587g) {
            return;
        }
        wq.f28410c = 8;
    }

    public final synchronized String d() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f28584d.entrySet().iterator();
            while (it.hasNext()) {
                Wq wq = (Wq) ((Map.Entry) it.next()).getValue();
                if (wq.f28410c != Integer.MAX_VALUE) {
                    arrayList.add(wq.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }
}
