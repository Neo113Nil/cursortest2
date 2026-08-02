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
import o1.C4797a;
import org.json.JSONArray;
import org.json.JSONObject;
import r2.C4906k;
import x2.C5189a;
import z2.InterfaceC5225b;

/* renamed from: com.google.android.gms.internal.ads.Yb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2889Yb implements InterfaceC3544lg, InterfaceC3598mg, InterfaceC2951ad, InterfaceC3005bd, InterfaceC5225b, B2.b, InterfaceC2538De, T0, KD {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C2889Yb f29464u = new C2889Yb(3);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C2889Yb f29465v = new C2889Yb(7);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C2889Yb f29466w = new C2889Yb(24);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C2889Yb f29467x = new C2889Yb(25);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29468n;

    public /* synthetic */ C2889Yb(int i) {
        this.f29468n = i;
    }

    public static final InterfaceC4084vh g(final A3.r rVar, final Context context, final C3464k7 c3464k7, final C3091d9 c3091d9, final C2483Aa c2483Aa, final C3230fo c3230fo, final BinderC2903Yp binderC2903Yp, final C3717or c3717or, final St st, final Ut ut, final C3236fu c3236fu, final String str, final C4797a c4797a, final C5189a c5189a, final boolean z6, final boolean z9) {
        AbstractC3592ma.a(context);
        try {
            InterfaceC3254gB interfaceC3254gB = new InterfaceC3254gB() { // from class: com.google.android.gms.internal.ads.zh
                @Override // com.google.android.gms.internal.ads.InterfaceC3254gB
                /* renamed from: c */
                public final Object mo14c() {
                    A3.r rVar2 = rVar;
                    String str2 = str;
                    boolean z10 = z6;
                    boolean z11 = z9;
                    BinderC2903Yp binderC2903Yp2 = binderC2903Yp;
                    C3230fo c3230fo2 = c3230fo;
                    C3717or c3717or2 = c3717or;
                    C4797a c4797a2 = c4797a;
                    C3091d9 c3091d92 = c3091d9;
                    St st2 = st;
                    Ut ut2 = ut;
                    C3236fu c3236fu2 = c3236fu;
                    C3464k7 c3464k72 = c3464k7;
                    C2483Aa c2483Aa2 = c2483Aa;
                    C5189a c5189a2 = c5189a;
                    Context context2 = context;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = ViewTreeObserverOnGlobalLayoutListenerC2592Gh.f25837D0;
                        C2779Rh c2779Rh = new C2779Rh(context2);
                        c2779Rh.setBaseContext(context2);
                        C2575Fh c2575Fh = new C2575Fh(new ViewTreeObserverOnGlobalLayoutListenerC2592Gh(c2779Rh, rVar2, str2, z10, c3464k72, c2483Aa2, c5189a2, c3717or2, c4797a2, c3091d92, st2, ut2, c3236fu2), c3230fo2);
                        c2575Fh.setWebViewClient(C4906k.f40186C.f40194f.s(c2575Fh, c3091d92, z11, binderC2903Yp2));
                        c2575Fh.setWebChromeClient(new C4030uh(c2575Fh));
                        return c2575Fh;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object mo14c = interfaceC3254gB.mo14c();
                StrictMode.setThreadPolicy(threadPolicy);
                return (InterfaceC4084vh) mo14c;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new C2541Dh("Webview initialization failed.", th2);
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3598mg
    /* renamed from: a */
    public void mo6a(Object obj) {
        switch (this.f29468n) {
            case 4:
                w2.z.k("Ending javascript session.");
                C2906Zc c2906Zc = (C2906Zc) ((InterfaceC2890Yc) obj);
                HashSet hashSet = c2906Zc.f29670u;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
                    w2.z.k("Unregistering eventhandler: ".concat(String.valueOf(((InterfaceC3272gc) simpleEntry.getValue()).toString())));
                    c2906Zc.f29669n.h((String) simpleEntry.getKey(), (InterfaceC3272gc) simpleEntry.getValue());
                }
                hashSet.clear();
                break;
            default:
                AbstractC3436jg.f32060f.execute(new RunnableC2808Tc((C2740Pc) obj, 2));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2951ad
    public /* synthetic */ Object b(JSONObject jSONObject) {
        switch (this.f29468n) {
            case 6:
                return jSONObject;
            default:
                return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3544lg, com.google.android.gms.internal.ads.InterfaceC3431jb
    /* renamed from: c */
    public void mo0c() {
        int i = this.f29468n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3005bd
    public /* bridge */ /* synthetic */ JSONObject n(Object obj) {
        return (JSONObject) obj;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public Q0[] c() {
        switch (this.f29468n) {
            case 24:
                AtomicInteger atomicInteger = C3437jh.f32063N;
                return new Q0[]{new U2(), new C3890s2()};
            default:
                AtomicInteger atomicInteger2 = C3437jh.f32063N;
                return new Q0[]{new U2(), new C3890s2(), new Q2(InterfaceC3837r3.f34276h0, 32, C3523lC.f32525x)};
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n, reason: collision with other method in class */
    public /* synthetic */ void mo10n(Object obj) {
        ((AbstractC2577Fj) obj).q();
    }

    private final /* synthetic */ void i() {
    }

    private final void j() {
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2538De
    public void e(String str, Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2538De
    public void f(Throwable th, String str, float f2) {
    }
}
