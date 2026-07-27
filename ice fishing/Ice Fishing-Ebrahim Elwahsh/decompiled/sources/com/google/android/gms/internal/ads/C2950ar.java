package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ar, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2950ar {

    /* renamed from: a, reason: collision with root package name */
    public final S2.a f29337a;

    /* renamed from: b, reason: collision with root package name */
    public final C3602mu f29338b;

    /* renamed from: c, reason: collision with root package name */
    public final Av f29339c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f29340d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29341e = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31481K7)).booleanValue();

    /* renamed from: f, reason: collision with root package name */
    public final C3706oq f29342f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29343g;

    /* renamed from: h, reason: collision with root package name */
    public long f29344h;
    public long i;

    public C2950ar(S2.a aVar, C3602mu c3602mu, C3706oq c3706oq, Av av) {
        this.f29337a = aVar;
        this.f29338b = c3602mu;
        this.f29342f = c3706oq;
        this.f29339c = av;
    }

    public final synchronized void a(List list) {
        this.f29337a.getClass();
        this.i = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Ut ut = (Ut) it.next();
            String str = ut.f28181w;
            if (!TextUtils.isEmpty(str)) {
                this.f29340d.put(ut, new C2903Zq(str, ut.f28150f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void b(C2953au c2953au, Ut ut, J3.a aVar, C4304zv c4304zv) {
        Wt wt = (Wt) c2953au.f29349b.f24454v;
        this.f29337a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = ut.f28181w;
        if (str != null) {
            this.f29340d.put(ut, new C2903Zq(str, ut.f28150f0, 9, 0L, null));
            C2886Yq c2886Yq = new C2886Yq(this, elapsedRealtime, wt, ut, str, c4304zv, c2953au);
            aVar.c(new MD(0, aVar, c2886Yq), AbstractC3212fg.f30745h);
        }
    }

    public final synchronized void c(Ut ut) {
        C2903Zq c2903Zq = (C2903Zq) this.f29340d.get(ut);
        if (c2903Zq == null || this.f29343g) {
            return;
        }
        c2903Zq.f29072c = 8;
    }

    public final synchronized String d() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f29340d.entrySet().iterator();
            while (it.hasNext()) {
                C2903Zq c2903Zq = (C2903Zq) ((Map.Entry) it.next()).getValue();
                if (c2903Zq.f29072c != Integer.MAX_VALUE) {
                    arrayList.add(c2903Zq.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }
}
