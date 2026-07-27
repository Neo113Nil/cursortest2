package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import p2.C4835j;
import v2.C5110a;
import x2.InterfaceC5188b;
import z2.InterfaceC5259b;

/* renamed from: com.google.android.gms.internal.ads.Yb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2866Yb implements InterfaceC3521lg, InterfaceC3575mg, InterfaceC2928ad, InterfaceC2982bd, InterfaceC5188b, InterfaceC5259b, InterfaceC2518De, T0, KD {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C2866Yb f28689u = new C2866Yb(3);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C2866Yb f28690v = new C2866Yb(7);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C2866Yb f28691w = new C2866Yb(24);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C2866Yb f28692x = new C2866Yb(25);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28693n;

    public /* synthetic */ C2866Yb(int i) {
        this.f28693n = i;
    }

    public static final InterfaceC4061vh g(final X2.b bVar, final Context context, final C3441k7 c3441k7, final C3068d9 c3068d9, final C2463Aa c2463Aa, final C3153eo c3153eo, final BinderC2880Yp binderC2880Yp, final C3694or c3694or, final St st, final Ut ut, final C3213fu c3213fu, final String str, final k8.b bVar2, final C5110a c5110a, final boolean z3, final boolean z6) {
        AbstractC3569ma.a(context);
        try {
            InterfaceC3231gB interfaceC3231gB = new InterfaceC3231gB() { // from class: com.google.android.gms.internal.ads.zh
                @Override // com.google.android.gms.internal.ads.InterfaceC3231gB
                /* renamed from: c */
                public final Object mo15c() {
                    X2.b bVar3 = bVar;
                    String str2 = str;
                    boolean z9 = z3;
                    boolean z10 = z6;
                    BinderC2880Yp binderC2880Yp2 = binderC2880Yp;
                    C3153eo c3153eo2 = c3153eo;
                    C3694or c3694or2 = c3694or;
                    k8.b bVar4 = bVar2;
                    C3068d9 c3068d92 = c3068d9;
                    St st2 = st;
                    Ut ut2 = ut;
                    C3213fu c3213fu2 = c3213fu;
                    C3441k7 c3441k72 = c3441k7;
                    C2463Aa c2463Aa2 = c2463Aa;
                    C5110a c5110a2 = c5110a;
                    Context context2 = context;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = ViewTreeObserverOnGlobalLayoutListenerC2572Gh.f25049I0;
                        C2759Rh c2759Rh = new C2759Rh(context2);
                        c2759Rh.setBaseContext(context2);
                        C2555Fh c2555Fh = new C2555Fh(new ViewTreeObserverOnGlobalLayoutListenerC2572Gh(c2759Rh, bVar3, str2, z9, c3441k72, c2463Aa2, c5110a2, c3694or2, bVar4, c3068d92, st2, ut2, c3213fu2), c3153eo2);
                        c2555Fh.setWebViewClient(C4835j.f39730C.f39738f.p(c2555Fh, c3068d92, z10, binderC2880Yp2));
                        c2555Fh.setWebChromeClient(new C4007uh(c2555Fh));
                        return c2555Fh;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object mo15c = interfaceC3231gB.mo15c();
                StrictMode.setThreadPolicy(threadPolicy);
                return (InterfaceC4061vh) mo15c;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new C2521Dh("Webview initialization failed.", th2);
        }
    }

    public static final void h(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
            Collections.unmodifiableList(arrayList);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mg
    /* renamed from: a */
    public void mo7a(Object obj) {
        switch (this.f28693n) {
            case 4:
                u2.z.k("Ending javascript session.");
                C2883Zc c2883Zc = (C2883Zc) ((InterfaceC2867Yc) obj);
                HashSet hashSet = c2883Zc.f28893u;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
                    u2.z.k("Unregistering eventhandler: ".concat(String.valueOf(((InterfaceC3249gc) simpleEntry.getValue()).toString())));
                    c2883Zc.f28892n.h((String) simpleEntry.getKey(), (InterfaceC3249gc) simpleEntry.getValue());
                }
                hashSet.clear();
                break;
            default:
                AbstractC3413jg.f31273f.execute(new RunnableC2787Tc((C2720Pc) obj, 2));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2928ad
    public /* synthetic */ Object b(JSONObject jSONObject) {
        switch (this.f28693n) {
            case 6:
                return jSONObject;
            default:
                return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3521lg, com.google.android.gms.internal.ads.InterfaceC3408jb
    /* renamed from: c */
    public void mo0c() {
        int i = this.f28693n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bd
    public /* bridge */ /* synthetic */ JSONObject n(Object obj) {
        return (JSONObject) obj;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public Q0[] c() {
        switch (this.f28693n) {
            case 24:
                AtomicInteger atomicInteger = C3414jh.f31276N;
                return new Q0[]{new U2(), new C3867s2()};
            default:
                AtomicInteger atomicInteger2 = C3414jh.f31276N;
                return new Q0[]{new U2(), new C3867s2(), new Q2(InterfaceC3814r3.m0, 32, C3500lC.f31745x)};
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n, reason: collision with other method in class */
    public /* synthetic */ void mo11n(Object obj) {
        ((AbstractC2557Fj) obj).q();
    }

    private final /* synthetic */ void i() {
    }

    private final void j() {
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2518De
    public void e(String str, Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2518De
    public void f(Throwable th, String str, float f3) {
    }
}
