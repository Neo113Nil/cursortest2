package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.ar, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2942ar implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final Lu f29137a;

    /* renamed from: b, reason: collision with root package name */
    public final C4118wk f29138b;

    /* renamed from: c, reason: collision with root package name */
    public final C4183xv f29139c;

    /* renamed from: d, reason: collision with root package name */
    public final C4237yv f29140d;

    /* renamed from: e, reason: collision with root package name */
    public final RD f29141e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f29142f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2591Hj f29143g;

    /* renamed from: h, reason: collision with root package name */
    public final Xq f29144h;
    public final C3585mq i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f29145j;

    /* renamed from: k, reason: collision with root package name */
    public final Vu f29146k;

    /* renamed from: l, reason: collision with root package name */
    public final S0.q f29147l;

    /* renamed from: m, reason: collision with root package name */
    public final C2993bo f29148m;

    public C2942ar(Context context, Lu lu, Xq xq, C4118wk c4118wk, C4183xv c4183xv, C4237yv c4237yv, InterfaceC2591Hj interfaceC2591Hj, RD rd, ScheduledExecutorService scheduledExecutorService, C3585mq c3585mq, Vu vu, S0.q qVar, C2993bo c2993bo) {
        this.f29145j = context;
        this.f29137a = lu;
        this.f29144h = xq;
        this.f29138b = c4118wk;
        this.f29139c = c4183xv;
        this.f29140d = c4237yv;
        this.f29143g = interfaceC2591Hj;
        this.f29141e = rd;
        this.f29142f = scheduledExecutorService;
        this.i = c3585mq;
        this.f29146k = vu;
        this.f29147l = qVar;
        this.f29148m = c2993bo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) r1.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.f32413x6)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(Yt yt) {
        C3301ha c3301ha = AbstractC3569ma.f32423y6;
        q2.r rVar = q2.r.f40204e;
        String str = "No fill.";
        String str2 = true != ((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() ? "No ad config." : "No fill.";
        Ut ut = (Ut) yt.f28754b.f25043v;
        int i = ut.f28008f;
        if (i != 0) {
            if (i < 200 || i >= 300) {
                str = (i < 300 || i >= 400) ? D.y.m(i, "Received error HTTP response code: ", new StringBuilder(String.valueOf(i).length() + 35)) : "No location header to follow redirect or too many redirects.";
            }
            C3879sE c3879sE = ut.f28011j;
            return c3879sE == null ? c3879sE.f33928b : str;
        }
        str = str2;
        C3879sE c3879sE2 = ut.f28011j;
        if (c3879sE2 == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final N3.a a(Object obj) {
        N3.a s9;
        int i;
        Bundle bundle;
        C2942ar c2942ar = this;
        Yt yt = (Yt) obj;
        C3301ha c3301ha = AbstractC3569ma.J2;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() && (bundle = (Bundle) yt.f28754b.f25045x) != null) {
            C2993bo c2993bo = c2942ar.f29148m;
            synchronized (c2993bo) {
                c2993bo.f29329e.putAll(bundle);
            }
        }
        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32057K2)).booleanValue()) {
            com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2942ar.f29148m, "rendering-start");
        }
        String b9 = b(yt);
        C3585mq c3585mq = c2942ar.i;
        C2570Gf c2570Gf = yt.f28754b;
        Ut ut = (Ut) c2570Gf.f25043v;
        c3585mq.f32594d = ut;
        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.x9)).booleanValue() && (i = ut.f28008f) != 0 && (i < 200 || i >= 300)) {
            return QC.k(new Zq(3, b9));
        }
        String str = ut.f28018q;
        if (!((Boolean) rVar.f40207c.a(AbstractC3569ma.f32392v4)).booleanValue() || TextUtils.isEmpty(str)) {
            for (St st : (List) c2570Gf.f25042u) {
                c3585mq.b(st, c3585mq.f32591a.size());
                Iterator it = st.f27606a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c3585mq.c(st, 0L, SK.F(1, null, null), false);
                        break;
                    }
                    InterfaceC3317hq a9 = c2942ar.f29143g.a(st.f27608b, (String) it.next());
                    if (a9 == null || !a9.b(yt, st)) {
                    }
                }
            }
        } else {
            List list = (List) c2570Gf.f25042u;
            synchronized (c3585mq) {
                Map map = c3585mq.f32592b;
                if (map.containsKey(str)) {
                    q2.h1 h1Var = (q2.h1) map.get(str);
                    List list2 = c3585mq.f32591a;
                    int indexOf = list2.indexOf(h1Var);
                    try {
                        list2.remove(indexOf);
                    } catch (IndexOutOfBoundsException e9) {
                        C4835j.f39730C.f39740h.d("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e9);
                    }
                    c3585mq.f32592b.remove(str);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c3585mq.b((St) it2.next(), indexOf);
                        indexOf++;
                    }
                }
            }
        }
        C4118wk c4118wk = c2942ar.f29138b;
        C2743Qi c2743Qi = new C2743Qi(yt, c2942ar.f29140d, c2942ar.f29139c);
        RD rd = c2942ar.f29141e;
        c4118wk.H1(c2743Qi, rd);
        if (ut.f28019r > 1) {
            S0.q qVar = c2942ar.f29147l;
            synchronized (qVar) {
                try {
                    if (!((AtomicBoolean) qVar.i).getAndSet(true)) {
                        List list3 = (List) yt.f28754b.f25042u;
                        if (list3.isEmpty()) {
                            ((XD) qVar.f2834h).e(new Zq(3, b(yt)));
                        } else {
                            qVar.f2836k = yt;
                            Xq xq = (Xq) qVar.f2832f;
                            qVar.f2835j = new C2751Qq(yt, xq, (XD) qVar.f2834h);
                            xq.a(list3);
                            for (St a10 = ((C2751Qq) qVar.f2835j).a(); a10 != null; a10 = ((C2751Qq) qVar.f2835j).a()) {
                                qVar.q(a10);
                            }
                        }
                    }
                    s9 = (XD) qVar.f2834h;
                } finally {
                }
            }
        } else {
            String b10 = b(yt);
            Lu lu = c2942ar.f29137a;
            Ju ju = Ju.RENDER_CONFIG_INIT;
            Objects.requireNonNull(lu);
            s9 = new T8(lu, ju, null, Lu.f26188d, Collections.EMPTY_LIST, QC.k(new Zq(3, b10))).s();
            Xq xq2 = c2942ar.f29144h;
            synchronized (xq2) {
                xq2.f28581a.getClass();
                xq2.i = SystemClock.elapsedRealtime();
            }
            int i6 = 0;
            for (St st2 : (List) c2570Gf.f25042u) {
                Iterator it3 = st2.f27606a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String str2 = (String) it3.next();
                    InterfaceC3317hq a11 = c2942ar.f29143g.a(st2.f27608b, str2);
                    if (a11 != null && a11.b(yt, st2)) {
                        T8 a12 = lu.a(s9, Ju.RENDER_CONFIG_WATERFALL);
                        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 15 + String.valueOf(str2).length());
                        sb.append("render-config-");
                        sb.append(i6);
                        sb.append("-");
                        sb.append(str2);
                        String sb2 = sb.toString();
                        Lu lu2 = (Lu) a12.f27700y;
                        Object obj2 = a12.f27697v;
                        N3.a aVar = (N3.a) a12.f27696u;
                        List list4 = (List) a12.f27698w;
                        N3.a aVar2 = (N3.a) a12.f27699x;
                        Objects.requireNonNull(lu2);
                        s9 = new T8(lu2, obj2, sb2, aVar, list4, QC.r(aVar2, Throwable.class, new C3196fd(c2942ar, st2, yt, a11, 4), lu2.f26189a)).s();
                        break;
                    }
                    c2942ar = this;
                }
                i6++;
                c2942ar = this;
            }
            s9.a(new RunnableC3470kj(18, xq2), rd);
        }
        return s9;
    }
}
