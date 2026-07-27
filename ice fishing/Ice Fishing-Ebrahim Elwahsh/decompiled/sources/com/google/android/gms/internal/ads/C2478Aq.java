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

/* renamed from: com.google.android.gms.internal.ads.Aq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2478Aq implements InterfaceC2505Cj, InterfaceC2639Kh, BD, Kr, LD, H0.d, h3.d, InterfaceC4253yy, InterfaceC3198fK, InterfaceC3404jB, InterfaceC3865ro {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23904n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f23905u;

    public /* synthetic */ C2478Aq(int i, Object obj) {
        this.f23904n = i;
        this.f23905u = obj;
    }

    @Override // h3.d
    public /* synthetic */ void B(Exception exc) {
        C2518Df c2518Df = (C2518Df) this.f23905u;
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ((Dw) c2518Df.f24455w).c(2025, -1L, exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3404jB
    public /* synthetic */ Object a() {
        int i = SN.f27536z;
        return (Rx) this.f23905u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public /* synthetic */ void mo2b(Object obj) {
        LO lo = (LO) obj;
        switch (this.f23904n) {
            case 17:
                lo.n((LN) this.f23905u);
                break;
            default:
                C3100dd c3100dd = (C3100dd) this.f23905u;
                lo.h(c3100dd);
                int i = c3100dd.f30071a;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3198fK
    public Object d(String str) {
        return ((InterfaceC3361iK) this.f23905u).d(str, null);
    }

    public void e(int i, Object obj, OL ol) {
        IK ik = (IK) obj;
        XK xk = (XK) this.f23905u;
        xk.m(i, 2);
        xk.A(ik.d(ol));
        ol.j(ik, this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4253yy
    public /* synthetic */ void f(Object obj, FileOutputStream fileOutputStream) {
        fileOutputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4253yy
    public Object h(FileInputStream fileInputStream) {
        try {
            return JC.a(fileInputStream);
        } catch (IOException e6) {
            throw new C4199xy("Cannot read bytes.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4253yy
    public /* synthetic */ Object i() {
        return (byte[]) this.f23905u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2639Kh
    public /* synthetic */ void k(String str, int i, String str2, boolean z8) {
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f23905u;
        interfaceC3858rh.c1();
        interfaceC3858rh.j0().D();
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
        switch (this.f23904n) {
            case 7:
                ((Vu) this.f23905u).a();
                break;
            default:
                ((C4104wA) this.f23905u).c();
                break;
        }
    }

    @Override // H0.d
    public void onPostMessage(WebView webView, H0.c cVar, Uri uri, boolean z8, H0.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(cVar.a());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            boolean equals = string.equals("startSession");
            C2955aw c2955aw = (C2955aw) this.f23905u;
            if (equals) {
                c2955aw.a(string2);
                return;
            }
            if (string.equals("finishSession")) {
                HashMap hashMap = c2955aw.f29353d;
                Wv wv = (Wv) hashMap.get(string2);
                if (wv != null) {
                    wv.c();
                    hashMap.remove(string2);
                }
            }
        } catch (JSONException e6) {
            AbstractC2720Pd.j("Error parsing JS message in JavaScriptSessionService.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        switch (this.f23904n) {
            case 7:
                break;
            default:
                C4104wA c4104wA = (C4104wA) this.f23905u;
                c4104wA.b(th);
                c4104wA.c();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Kr
    public void u(AbstractC2539Ej abstractC2539Ej) {
        St st = (St) this.f23905u;
        C2492Bn c2492Bn = (C2492Bn) abstractC2539Ej;
        synchronized (st) {
            try {
                st.f27635w = c2492Bn;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31792t4)).booleanValue()) {
                    c2492Bn.f24086u.f30254a = st.f27634v;
                }
                st.f27635w.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ C2478Aq(KO ko, Object obj, int i) {
        this.f23904n = i;
        this.f23905u = obj;
    }

    @Override // com.google.android.gms.internal.ads.BD, com.google.android.gms.internal.ads.InterfaceC3404jB
    public J3.a a() {
        Bundle bundle;
        String str;
        HashMap hashMap;
        C3944tC a9;
        Ls ls = (Ls) this.f23905u;
        ls.getClass();
        C3151ea c3151ea = AbstractC3368ia.oc;
        q2.r rVar = q2.r.f40116e;
        String lowerCase = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() ? ls.f26241e.f30904g.toLowerCase(Locale.ROOT) : ls.f26241e.f30904g;
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31709k2)).booleanValue()) {
            C2544Eo c2544Eo = ls.f26244h;
            synchronized (c2544Eo) {
                bundle = new Bundle(c2544Eo.f24822n);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31638c5)).booleanValue()) {
            C2841Wf n9 = p2.j.f39798C.f39808h.g().n();
            char c4 = (TextUtils.isEmpty(n9.f28423e) || n9.f28425g == null) ? (char) 3 : n9.b() ? (char) 1 : (char) 2;
            str = c4 != 1 ? c4 != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = ls.f26241e.f30919w;
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
                        hashMap2.put(str4, new C4246yr(str4, true, true, false, bundle3));
                    }
                } catch (JSONException e6) {
                    p2.j.f39798C.f39808h.d("RecursiveRtbAdapterMap.parseAdapters", new JSONException("Malformed RTB adapter config."));
                    t2.C.l("Malformed RTB adapter config.", e6);
                }
            }
            ls.b(arrayList, hashMap2);
        } else if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31790t2)).booleanValue()) {
            C4084vr c4084vr = ls.f26239c;
            String str5 = ls.i;
            synchronized (c4084vr) {
                try {
                    C3944tC a10 = c4084vr.a(str5, lowerCase);
                    C3944tC i4 = c4084vr.i(lowerCase);
                    hashMap = new HashMap();
                    Iterator it = ((C3783qC) a10.entrySet()).iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str6 = (String) entry.getKey();
                        if (i4.containsKey(str6)) {
                            C4246yr c4246yr = (C4246yr) i4.get(str6);
                            List list = (List) entry.getValue();
                            hashMap.put(str6, new C4246yr(str6, c4246yr.f35416b, c4246yr.f35417c, c4246yr.f35418d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                        }
                    }
                    CC a11 = i4.entrySet().a();
                    while (a11.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) a11.next();
                        String str7 = (String) entry2.getKey();
                        if (!hashMap.containsKey(str7) && ((C4246yr) entry2.getValue()).f35418d) {
                            hashMap.put(str7, (C4246yr) entry2.getValue());
                        }
                    }
                } finally {
                }
            }
            ls.b(arrayList, hashMap);
        } else {
            C4084vr c4084vr2 = ls.f26239c;
            Iterator it2 = ((C3783qC) c4084vr2.a(ls.i, lowerCase).entrySet()).iterator();
            while (it2.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it2.next();
                String str8 = (String) entry3.getKey();
                List list2 = (List) entry3.getValue();
                Bundle bundle4 = ls.f26241e.f30901d.f40013F;
                arrayList.add(ls.c(str8, list2, bundle4 != null ? bundle4.getBundle(str8) : null, true, true));
            }
            synchronized (c4084vr2) {
                a9 = TextUtils.isEmpty(p2.j.f39798C.f39808h.g().n().f28423e) ? C3944tC.f34377z : C3944tC.a(c4084vr2.f34875b);
            }
            ls.b(arrayList, a9);
        }
        UB n10 = UB.n(arrayList);
        CallableC3538lk callableC3538lk = new CallableC3538lk(arrayList, bundle2, str2);
        C3157eg c3157eg = ls.f26237a;
        GD gd = new GD(n10, true, false);
        gd.f25114I = new FD(gd, callableC3538lk, c3157eg);
        gd.w();
        return gd;
    }

    public C2478Aq(Matcher matcher) {
        this.f23904n = 12;
        matcher.getClass();
        this.f23905u = matcher;
    }

    public C2478Aq(C2955aw c2955aw) {
        this.f23904n = 8;
        Objects.requireNonNull(c2955aw);
        this.f23905u = c2955aw;
    }

    public C2478Aq(C4158xA c4158xA, C4104wA c4104wA) {
        this.f23904n = 11;
        this.f23905u = c4104wA;
        Objects.requireNonNull(c4158xA);
    }

    public C2478Aq(XK xk) {
        this.f23904n = 15;
        this.f23905u = xk;
        xk.f28632b = this;
    }

    private final void c(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Cj, com.google.android.gms.internal.ads.InterfaceC3404jB
    public q2.A0 a() {
        try {
            return ((C3656nu) this.f23905u).f33064a.H();
        } catch (Throwable th) {
            throw new C3334hu(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.Kr
    /* renamed from: a, reason: collision with other method in class */
    public void mo0a() {
        St st = (St) this.f23905u;
        synchronized (st) {
            st.f27635w = null;
        }
    }
}
