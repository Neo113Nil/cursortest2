package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.xq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4178xq implements InterfaceC2540Ej, InterfaceC2708Oh, AD, Ir, KD, H0.d, j3.d, InterfaceC4186xy, VJ, InterfaceC3231gB, InterfaceC3529lo {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35054n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f35055u;

    public /* synthetic */ C4178xq(int i, Object obj) {
        this.f35054n = i;
        this.f35055u = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public /* synthetic */ void mo1a(Object obj) {
        InterfaceC4213yO interfaceC4213yO = (InterfaceC4213yO) obj;
        switch (this.f35054n) {
            case 17:
                interfaceC4213yO.h((C4158xN) this.f35055u);
                break;
            default:
                C3035cd c3035cd = (C3035cd) this.f35055u;
                interfaceC4213yO.i(c3035cd);
                int i = c3035cd.f29501a;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.VJ
    public Object b(String str) {
        return ((YJ) this.f35055u).f(str, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3231gB
    /* renamed from: c, reason: collision with other method in class */
    public /* synthetic */ Object mo15c() {
        int i = EN.f24583A;
        return (Qx) this.f35055u;
    }

    public void e(int i, Object obj, DL dl) {
        AbstractC4263zK abstractC4263zK = (AbstractC4263zK) obj;
        OK ok = (OK) this.f35055u;
        ok.Y(i, 2);
        ok.I1(abstractC4263zK.d(dl));
        dl.a(abstractC4263zK, this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4186xy
    public /* synthetic */ void f(Object obj, FileOutputStream fileOutputStream) {
        fileOutputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4186xy
    public Object g(FileInputStream fileInputStream) {
        try {
            return GC.a(fileInputStream);
        } catch (IOException e9) {
            throw new C4078vy("Cannot read bytes.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4186xy
    public /* synthetic */ Object i() {
        return (byte[]) this.f35055u;
    }

    @Override // j3.d
    public /* synthetic */ void k(Exception exc) {
        C2570Gf c2570Gf = (C2570Gf) this.f35055u;
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ((Cw) c2570Gf.f25044w).c(2025, -1L, exc);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        switch (this.f35054n) {
            case 7:
                ((Su) this.f35055u).c();
                break;
            default:
                ((C3929tA) this.f35055u).c();
                break;
        }
    }

    @Override // H0.d
    public void onPostMessage(WebView webView, H0.c cVar, Uri uri, boolean z3, H0.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(cVar.a());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            boolean equals = string.equals("startSession");
            Yv yv = (Yv) this.f35055u;
            if (equals) {
                yv.a(string2);
                return;
            }
            if (string.equals("finishSession")) {
                HashMap hashMap = yv.f28758d;
                Uv uv = (Uv) hashMap.get(string2);
                if (uv != null) {
                    uv.c();
                    hashMap.remove(string2);
                }
            }
        } catch (JSONException e9) {
            MA.j("Error parsing JS message in JavaScriptSessionService.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ir
    public void s(AbstractC2557Fj abstractC2557Fj) {
        Qt qt = (Qt) this.f35055u;
        C2476An c2476An = (C2476An) abstractC2557Fj;
        synchronized (qt) {
            try {
                qt.f27126w = c2476An;
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32375t4)).booleanValue()) {
                    c2476An.f23742u.f29151a = qt.f27125v;
                }
                qt.f27126w.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f35054n) {
            case 7:
                break;
            default:
                C3929tA c3929tA = (C3929tA) this.f35055u;
                c3929tA.b(th);
                c3929tA.c();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Oh
    public /* synthetic */ void z(String str, int i, String str2, boolean z3) {
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f35055u;
        interfaceC4061vh.e1();
        interfaceC4061vh.g0().A();
    }

    public /* synthetic */ C4178xq(C4159xO c4159xO, Object obj, int i) {
        this.f35054n = i;
        this.f35055u = obj;
    }

    @Override // com.google.android.gms.internal.ads.AD
    public N3.a c() {
        Bundle bundle;
        String str;
        HashMap hashMap;
        C3770qC a9;
        Ks ks = (Ks) this.f35055u;
        ks.getClass();
        C3301ha c3301ha = AbstractC3569ma.oc;
        q2.r rVar = q2.r.f40204e;
        String lowerCase = ((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() ? ks.f25986e.f29626g.toLowerCase(Locale.ROOT) : ks.f25986e.f29626g;
        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32289k2)).booleanValue()) {
            C2528Do c2528Do = ks.f25989h;
            synchronized (c2528Do) {
                bundle = new Bundle(c2528Do.f24461n);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32218c5)).booleanValue()) {
            C2886Zf n9 = C4835j.f39730C.f39740h.g().n();
            char c9 = (TextUtils.isEmpty(n9.f28917e) || n9.f28919g == null) ? (char) 3 : n9.b() ? (char) 1 : (char) 2;
            str = c9 != 1 ? c9 != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = ks.f25986e.f29641w;
        if (jSONArray != null) {
            HashMap hashMap2 = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                    String str3 = "";
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        str3 = optJSONArray.getString(0);
                    }
                    String str4 = str3;
                    if (!TextUtils.isEmpty(str4)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        Bundle bundle3 = new Bundle();
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                bundle3.putString(next, optJSONObject.optString(next, ""));
                            }
                        }
                        hashMap2.put(str4, new C4125wr(str4, true, true, false, bundle3));
                    }
                } catch (JSONException e9) {
                    C4835j.f39730C.f39740h.d("RecursiveRtbAdapterMap.parseAdapters", new JSONException("Malformed RTB adapter config."));
                    u2.z.l("Malformed RTB adapter config.", e9);
                }
            }
            ks.a(arrayList, hashMap2);
        } else if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32373t2)).booleanValue()) {
            C3963tr c3963tr = ks.f25984c;
            String str5 = ks.i;
            synchronized (c3963tr) {
                try {
                    C3770qC a10 = c3963tr.a(str5, lowerCase);
                    C3770qC i6 = c3963tr.i(lowerCase);
                    hashMap = new HashMap();
                    Iterator it = ((C3608nC) a10.entrySet()).iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str6 = (String) entry.getKey();
                        if (i6.containsKey(str6)) {
                            C4125wr c4125wr = (C4125wr) i6.get(str6);
                            List list = (List) entry.getValue();
                            hashMap.put(str6, new C4125wr(str6, c4125wr.f34892b, c4125wr.f34893c, c4125wr.f34894d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                        }
                    }
                    AbstractC4255zC a11 = i6.entrySet().a();
                    while (a11.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) a11.next();
                        String str7 = (String) entry2.getKey();
                        if (!hashMap.containsKey(str7) && ((C4125wr) entry2.getValue()).f34894d) {
                            hashMap.put(str7, (C4125wr) entry2.getValue());
                        }
                    }
                } finally {
                }
            }
            ks.a(arrayList, hashMap);
        } else {
            C3963tr c3963tr2 = ks.f25984c;
            Iterator it2 = ((C3608nC) c3963tr2.a(ks.i, lowerCase).entrySet()).iterator();
            while (it2.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it2.next();
                String str8 = (String) entry3.getKey();
                List list2 = (List) entry3.getValue();
                Bundle bundle4 = ks.f25986e.f29623d.f40099F;
                arrayList.add(ks.b(str8, list2, bundle4 != null ? bundle4.getBundle(str8) : null, true, true));
            }
            synchronized (c3963tr2) {
                a9 = TextUtils.isEmpty(C4835j.f39730C.f39740h.g().n().f28917e) ? C3770qC.f33209z : C3770qC.a(c3963tr2.f34405b);
            }
            ks.a(arrayList, a9);
        }
        RB n10 = RB.n(arrayList);
        CallableC3579mk callableC3579mk = new CallableC3579mk(arrayList, bundle2, str2);
        C3360ig c3360ig = ks.f25982a;
        FD fd = new FD(n10, true, false);
        fd.f24757I = new ED(fd, callableC3579mk, c3360ig);
        fd.w();
        return fd;
    }

    public C4178xq(Matcher matcher) {
        this.f35054n = 12;
        matcher.getClass();
        this.f35055u = matcher;
    }

    public C4178xq(Yv yv) {
        this.f35054n = 8;
        Objects.requireNonNull(yv);
        this.f35055u = yv;
    }

    public C4178xq(C3983uA c3983uA, C3929tA c3929tA) {
        this.f35054n = 11;
        this.f35055u = c3929tA;
        Objects.requireNonNull(c3983uA);
    }

    public C4178xq(OK ok) {
        this.f35054n = 15;
        this.f35055u = ok;
        ok.f26598n = this;
    }

    private final void d(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2540Ej
    /* renamed from: c */
    public q2.A0 mo13c() {
        try {
            return ((C3535lu) this.f35055u).f31864a.c0();
        } catch (Throwable th) {
            throw new C3267gu(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ir, com.google.android.gms.internal.ads.MP
    /* renamed from: c */
    public void mo12c() {
        Qt qt = (Qt) this.f35055u;
        synchronized (qt) {
            qt.f27126w = null;
        }
    }
}
