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
    public final V2.a f29362a;

    /* renamed from: b, reason: collision with root package name */
    public final C3504ku f29363b;

    /* renamed from: c, reason: collision with root package name */
    public final C4260yv f29364c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f29365d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29366e = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.K7)).booleanValue();

    /* renamed from: f, reason: collision with root package name */
    public final C3608mq f29367f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29368g;

    /* renamed from: h, reason: collision with root package name */
    public long f29369h;
    public long i;

    public Xq(V2.a aVar, C3504ku c3504ku, C3608mq c3608mq, C4260yv c4260yv) {
        this.f29362a = aVar;
        this.f29363b = c3504ku;
        this.f29367f = c3608mq;
        this.f29364c = c4260yv;
    }

    public final synchronized void a(List list) {
        this.f29362a.getClass();
        this.i = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            St st = (St) it.next();
            String str = st.f28431w;
            if (!TextUtils.isEmpty(str)) {
                this.f29365d.put(st, new Wq(str, st.f28400f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void b(Yt yt, St st, P3.a aVar, C4206xv c4206xv) {
        Ut ut = (Ut) yt.f29533b.f25831v;
        this.f29362a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = st.f28431w;
        if (str != null) {
            this.f29365d.put(st, new Wq(str, st.f28400f0, 9, 0L, null));
            Vq vq = new Vq(this, elapsedRealtime, ut, st, str, c4206xv, yt);
            aVar.a(new LD(0, aVar, vq), AbstractC3436jg.f32062h);
        }
    }

    public final synchronized void c(St st) {
        Wq wq = (Wq) this.f29365d.get(st);
        if (wq == null || this.f29368g) {
            return;
        }
        wq.f29192c = 8;
    }

    public final synchronized String d() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f29365d.entrySet().iterator();
            while (it.hasNext()) {
                Wq wq = (Wq) ((Map.Entry) it.next()).getValue();
                if (wq.f29192c != Integer.MAX_VALUE) {
                    arrayList.add(wq.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }
}
