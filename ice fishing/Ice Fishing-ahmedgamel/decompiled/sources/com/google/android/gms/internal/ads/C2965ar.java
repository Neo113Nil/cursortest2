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
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.ar, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2965ar implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final Lu f29922a;

    /* renamed from: b, reason: collision with root package name */
    public final C4141wk f29923b;

    /* renamed from: c, reason: collision with root package name */
    public final C4206xv f29924c;

    /* renamed from: d, reason: collision with root package name */
    public final C4260yv f29925d;

    /* renamed from: e, reason: collision with root package name */
    public final RD f29926e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f29927f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2611Hj f29928g;

    /* renamed from: h, reason: collision with root package name */
    public final Xq f29929h;
    public final C3608mq i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f29930j;

    /* renamed from: k, reason: collision with root package name */
    public final Vu f29931k;

    /* renamed from: l, reason: collision with root package name */
    public final S0.q f29932l;

    /* renamed from: m, reason: collision with root package name */
    public final C3069co f29933m;

    public C2965ar(Context context, Lu lu, Xq xq, C4141wk c4141wk, C4206xv c4206xv, C4260yv c4260yv, InterfaceC2611Hj interfaceC2611Hj, RD rd, ScheduledExecutorService scheduledExecutorService, C3608mq c3608mq, Vu vu, S0.q qVar, C3069co c3069co) {
        this.f29930j = context;
        this.f29922a = lu;
        this.f29929h = xq;
        this.f29923b = c4141wk;
        this.f29924c = c4206xv;
        this.f29925d = c4260yv;
        this.f29928g = interfaceC2611Hj;
        this.f29926e = rd;
        this.f29927f = scheduledExecutorService;
        this.i = c3608mq;
        this.f29931k = vu;
        this.f29932l = qVar;
        this.f29933m = c3069co;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) r1.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f33192x6)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(Yt yt) {
        C3324ha c3324ha = AbstractC3592ma.f33202y6;
        s2.r rVar = s2.r.f40506e;
        String str = "No fill.";
        String str2 = true != ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() ? "No ad config." : "No fill.";
        Ut ut = (Ut) yt.f29533b.f25831v;
        int i = ut.f28805f;
        if (i != 0) {
            if (i < 200 || i >= 300) {
                str = (i < 300 || i >= 400) ? D.x.k(i, "Received error HTTP response code: ", new StringBuilder(String.valueOf(i).length() + 35)) : "No location header to follow redirect or too many redirects.";
            }
            C3902sE c3902sE = ut.f28808j;
            return c3902sE == null ? c3902sE.f34696b : str;
        }
        str = str2;
        C3902sE c3902sE2 = ut.f28808j;
        if (c3902sE2 == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final P3.a a(Object obj) {
        P3.a s9;
        int i;
        Bundle bundle;
        C2965ar c2965ar = this;
        Yt yt = (Yt) obj;
        C3324ha c3324ha = AbstractC3592ma.f32828J2;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && (bundle = (Bundle) yt.f29533b.f25833x) != null) {
            C3069co c3069co = c2965ar.f29933m;
            synchronized (c3069co) {
                c3069co.f30371e.putAll(bundle);
            }
        }
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32837K2)).booleanValue()) {
            com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c2965ar.f29933m, "rendering-start");
        }
        String b9 = b(yt);
        C3608mq c3608mq = c2965ar.i;
        C2590Gf c2590Gf = yt.f29533b;
        Ut ut = (Ut) c2590Gf.f25831v;
        c3608mq.f33372d = ut;
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.x9)).booleanValue() && (i = ut.f28805f) != 0 && (i < 200 || i >= 300)) {
            return QC.k(new Zq(3, b9));
        }
        String str = ut.f28815q;
        if (!((Boolean) rVar.f40509c.a(AbstractC3592ma.f33172v4)).booleanValue() || TextUtils.isEmpty(str)) {
            for (St st : (List) c2590Gf.f25830u) {
                c3608mq.b(st, c3608mq.f33369a.size());
                Iterator it = st.f28389a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c3608mq.c(st, 0L, SK.F(1, null, null), false);
                        break;
                    }
                    InterfaceC3340hq a9 = c2965ar.f29928g.a(st.f28391b, (String) it.next());
                    if (a9 == null || !a9.b(yt, st)) {
                    }
                }
            }
        } else {
            List list = (List) c2590Gf.f25830u;
            synchronized (c3608mq) {
                Map map = c3608mq.f33370b;
                if (map.containsKey(str)) {
                    s2.h1 h1Var = (s2.h1) map.get(str);
                    List list2 = c3608mq.f33369a;
                    int indexOf = list2.indexOf(h1Var);
                    try {
                        list2.remove(indexOf);
                    } catch (IndexOutOfBoundsException e9) {
                        C4906k.f40186C.f40196h.d("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e9);
                    }
                    c3608mq.f33370b.remove(str);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c3608mq.b((St) it2.next(), indexOf);
                        indexOf++;
                    }
                }
            }
        }
        C4141wk c4141wk = c2965ar.f29923b;
        C2763Qi c2763Qi = new C2763Qi(yt, c2965ar.f29925d, c2965ar.f29924c);
        RD rd = c2965ar.f29926e;
        c4141wk.I1(c2763Qi, rd);
        if (ut.f28816r > 1) {
            S0.q qVar = c2965ar.f29932l;
            synchronized (qVar) {
                try {
                    if (!((AtomicBoolean) qVar.i).getAndSet(true)) {
                        List list3 = (List) yt.f29533b.f25830u;
                        if (list3.isEmpty()) {
                            ((XD) qVar.f2963h).e(new Zq(3, b(yt)));
                        } else {
                            qVar.f2965k = yt;
                            Xq xq = (Xq) qVar.f2961f;
                            qVar.f2964j = new C2771Qq(yt, xq, (XD) qVar.f2963h);
                            xq.a(list3);
                            for (St a10 = ((C2771Qq) qVar.f2964j).a(); a10 != null; a10 = ((C2771Qq) qVar.f2964j).a()) {
                                qVar.q(a10);
                            }
                        }
                    }
                    s9 = (XD) qVar.f2963h;
                } finally {
                }
            }
        } else {
            String b10 = b(yt);
            Lu lu = c2965ar.f29922a;
            Ju ju = Ju.RENDER_CONFIG_INIT;
            Objects.requireNonNull(lu);
            s9 = new T8(lu, ju, null, Lu.f26979d, Collections.EMPTY_LIST, QC.k(new Zq(3, b10))).s();
            Xq xq2 = c2965ar.f29929h;
            synchronized (xq2) {
                xq2.f29362a.getClass();
                xq2.i = SystemClock.elapsedRealtime();
            }
            int i4 = 0;
            for (St st2 : (List) c2590Gf.f25830u) {
                Iterator it3 = st2.f28389a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String str2 = (String) it3.next();
                    InterfaceC3340hq a11 = c2965ar.f29928g.a(st2.f28391b, str2);
                    if (a11 != null && a11.b(yt, st2)) {
                        T8 a12 = lu.a(s9, Ju.RENDER_CONFIG_WATERFALL);
                        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 15 + String.valueOf(str2).length());
                        sb.append("render-config-");
                        sb.append(i4);
                        sb.append("-");
                        sb.append(str2);
                        String sb2 = sb.toString();
                        Lu lu2 = (Lu) a12.f28483y;
                        Object obj2 = a12.f28480v;
                        P3.a aVar = (P3.a) a12.f28479u;
                        List list4 = (List) a12.f28481w;
                        P3.a aVar2 = (P3.a) a12.f28482x;
                        Objects.requireNonNull(lu2);
                        s9 = new T8(lu2, obj2, sb2, aVar, list4, QC.r(aVar2, Throwable.class, new C3219fd(c2965ar, st2, yt, a11, 4), lu2.f26980a)).s();
                        break;
                    }
                    c2965ar = this;
                }
                i4++;
                c2965ar = this;
            }
            s9.a(new RunnableC3493kj(18, xq2), rd);
        }
        return s9;
    }
}
