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
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.xq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4201xq implements InterfaceC2560Ej, InterfaceC2728Oh, AD, Ir, KD, H0.d, l3.d, InterfaceC4209xy, VJ, InterfaceC3254gB, InterfaceC3606mo {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35840n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f35841u;

    public /* synthetic */ C4201xq(int i, Object obj) {
        this.f35840n = i;
        this.f35841u = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2728Oh
    public /* synthetic */ void C(String str, int i, String str2, boolean z6) {
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f35841u;
        interfaceC4084vh.e1();
        interfaceC4084vh.h0().A();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public /* synthetic */ void mo5a(Object obj) {
        InterfaceC4236yO interfaceC4236yO = (InterfaceC4236yO) obj;
        switch (this.f35840n) {
            case 17:
                interfaceC4236yO.h((C4181xN) this.f35841u);
                break;
            default:
                C3058cd c3058cd = (C3058cd) this.f35841u;
                interfaceC4236yO.i(c3058cd);
                int i = c3058cd.f30286a;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.VJ
    public Object b(String str) {
        return ((YJ) this.f35841u).f(str, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3254gB
    /* renamed from: c, reason: collision with other method in class */
    public /* synthetic */ Object mo14c() {
        int i = EN.f25344A;
        return (Qx) this.f35841u;
    }

    @Override // l3.d
    public /* synthetic */ void d(Exception exc) {
        C2590Gf c2590Gf = (C2590Gf) this.f35841u;
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ((Cw) c2590Gf.f25832w).c(2025, -1L, exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4209xy
    public /* synthetic */ void f(Object obj, FileOutputStream fileOutputStream) {
        fileOutputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4209xy
    public Object g(FileInputStream fileInputStream) {
        try {
            return GC.a(fileInputStream);
        } catch (IOException e9) {
            throw new C4101vy("Cannot read bytes.", e9);
        }
    }

    public void h(int i, Object obj, DL dl) {
        AbstractC4286zK abstractC4286zK = (AbstractC4286zK) obj;
        OK ok = (OK) this.f35841u;
        ok.Y(i, 2);
        ok.J1(abstractC4286zK.d(dl));
        dl.a(abstractC4286zK, this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4209xy
    public /* synthetic */ Object i() {
        return (byte[]) this.f35841u;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        switch (this.f35840n) {
            case 7:
                ((Su) this.f35841u).c();
                break;
            default:
                ((C3952tA) this.f35841u).c();
                break;
        }
    }

    @Override // H0.d
    public void onPostMessage(WebView webView, H0.c cVar, Uri uri, boolean z6, H0.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(cVar.a());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            boolean equals = string.equals("startSession");
            Zv zv = (Zv) this.f35841u;
            if (equals) {
                zv.a(string2);
                return;
            }
            if (string.equals("finishSession")) {
                HashMap hashMap = zv.f29748d;
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
    public void s(AbstractC2577Fj abstractC2577Fj) {
        Qt qt = (Qt) this.f35841u;
        C2513Bn c2513Bn = (C2513Bn) abstractC2577Fj;
        synchronized (qt) {
            try {
                qt.f27882w = c2513Bn;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33154t4)).booleanValue()) {
                    c2513Bn.f24723u.f29936a = qt.f27881v;
                }
                qt.f27882w.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f35840n) {
            case 7:
                break;
            default:
                C3952tA c3952tA = (C3952tA) this.f35841u;
                c3952tA.b(th);
                c3952tA.c();
                break;
        }
    }

    public /* synthetic */ C4201xq(C4182xO c4182xO, Object obj, int i) {
        this.f35840n = i;
        this.f35841u = obj;
    }

    @Override // com.google.android.gms.internal.ads.AD
    public P3.a c() {
        Bundle bundle;
        String str;
        HashMap hashMap;
        C3793qC a9;
        Ks ks = (Ks) this.f35841u;
        ks.getClass();
        C3324ha c3324ha = AbstractC3592ma.oc;
        s2.r rVar = s2.r.f40506e;
        String lowerCase = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() ? ks.f26786e.f30396g.toLowerCase(Locale.ROOT) : ks.f26786e.f30396g;
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33068k2)).booleanValue()) {
            C2565Eo c2565Eo = ks.f26789h;
            synchronized (c2565Eo) {
                bundle = new Bundle(c2565Eo.f25409n);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32997c5)).booleanValue()) {
            C2909Zf n9 = C4906k.f40186C.f40196h.g().n();
            char c9 = (TextUtils.isEmpty(n9.f29694e) || n9.f29696g == null) ? (char) 3 : n9.b() ? (char) 1 : (char) 2;
            str = c9 != 1 ? c9 != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = ks.f26786e.f30411w;
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
                        hashMap2.put(str4, new C4148wr(str4, true, true, false, bundle3));
                    }
                } catch (JSONException e9) {
                    C4906k.f40186C.f40196h.d("RecursiveRtbAdapterMap.parseAdapters", new JSONException("Malformed RTB adapter config."));
                    w2.z.l("Malformed RTB adapter config.", e9);
                }
            }
            ks.a(arrayList, hashMap2);
        } else if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33152t2)).booleanValue()) {
            C3986tr c3986tr = ks.f26784c;
            String str5 = ks.i;
            synchronized (c3986tr) {
                try {
                    C3793qC a10 = c3986tr.a(str5, lowerCase);
                    C3793qC i4 = c3986tr.i(lowerCase);
                    hashMap = new HashMap();
                    Iterator it = ((C3631nC) a10.entrySet()).iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str6 = (String) entry.getKey();
                        if (i4.containsKey(str6)) {
                            C4148wr c4148wr = (C4148wr) i4.get(str6);
                            List list = (List) entry.getValue();
                            hashMap.put(str6, new C4148wr(str6, c4148wr.f35673b, c4148wr.f35674c, c4148wr.f35675d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                        }
                    }
                    AbstractC4278zC a11 = i4.entrySet().a();
                    while (a11.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) a11.next();
                        String str7 = (String) entry2.getKey();
                        if (!hashMap.containsKey(str7) && ((C4148wr) entry2.getValue()).f35675d) {
                            hashMap.put(str7, (C4148wr) entry2.getValue());
                        }
                    }
                } finally {
                }
            }
            ks.a(arrayList, hashMap);
        } else {
            C3986tr c3986tr2 = ks.f26784c;
            Iterator it2 = ((C3631nC) c3986tr2.a(ks.i, lowerCase).entrySet()).iterator();
            while (it2.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it2.next();
                String str8 = (String) entry3.getKey();
                List list2 = (List) entry3.getValue();
                Bundle bundle4 = ks.f26786e.f30393d.f40401F;
                arrayList.add(ks.b(str8, list2, bundle4 != null ? bundle4.getBundle(str8) : null, true, true));
            }
            synchronized (c3986tr2) {
                a9 = TextUtils.isEmpty(C4906k.f40186C.f40196h.g().n().f29694e) ? C3793qC.f33993z : C3793qC.a(c3986tr2.f35179b);
            }
            ks.a(arrayList, a9);
        }
        RB n10 = RB.n(arrayList);
        CallableC3602mk callableC3602mk = new CallableC3602mk(arrayList, bundle2, str2);
        C3383ig c3383ig = ks.f26782a;
        FD fd = new FD(n10, true, false);
        fd.f25513I = new ED(fd, callableC3602mk, c3383ig);
        fd.w();
        return fd;
    }

    public C4201xq(Matcher matcher) {
        this.f35840n = 12;
        matcher.getClass();
        this.f35841u = matcher;
    }

    public C4201xq(Zv zv) {
        this.f35840n = 8;
        Objects.requireNonNull(zv);
        this.f35841u = zv;
    }

    public C4201xq(C4006uA c4006uA, C3952tA c3952tA) {
        this.f35840n = 11;
        this.f35841u = c3952tA;
        Objects.requireNonNull(c4006uA);
    }

    public C4201xq(OK ok) {
        this.f35840n = 15;
        this.f35841u = ok;
        ok.f27380n = this;
    }

    private final void e(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2560Ej
    /* renamed from: c */
    public s2.A0 mo12c() {
        try {
            return ((C3558lu) this.f35841u).f32644a.c0();
        } catch (Throwable th) {
            throw new C3290gu(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ir, com.google.android.gms.internal.ads.NP
    /* renamed from: c */
    public void mo11c() {
        Qt qt = (Qt) this.f35841u;
        synchronized (qt) {
            qt.f27882w = null;
        }
    }
}
