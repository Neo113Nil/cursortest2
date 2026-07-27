package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Yb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2871Yb implements InterfaceC2990bc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28833n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f28834u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f28835v;

    public /* synthetic */ C2871Yb(int i, Object obj, Object obj2) {
        this.f28833n = i;
        this.f28834u = obj;
        this.f28835v = obj2;
    }

    public void a(String str, InterfaceC3476kc interfaceC3476kc) {
        synchronized (this.f28834u) {
            ((HashMap) this.f28835v).put(str, interfaceC3476kc);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0290, code lost:
    
        if (r4.equals("_ac") != false) goto L113;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Object obj, Map map) {
        InterfaceC3476kc interfaceC3476kc;
        String str;
        int i = 0;
        switch (this.f28833n) {
            case 0:
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                AbstractC2935ac.b(map, (InterfaceC2524Dl) this.f28834u);
                String str2 = (String) map.get("u");
                if (str2 == null) {
                    int i4 = t2.C.f40822b;
                    u2.i.f("URL missing from click GMSG.");
                    return;
                }
                JD s3 = JD.s(AbstractC2935ac.a(interfaceC3858rh, str2));
                C2888Zb c2888Zb = new C2888Zb((C2657Li) this.f28835v, str2, i);
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                C3945tD y6 = C3686oN.y(s3, c2888Zb, c3157eg);
                y6.c(new MD(i, y6, new Vx(7, interfaceC3858rh)), c3157eg);
                return;
            case 1:
                p2.j jVar = p2.j.f39798C;
                C2569Gf c2569Gf = jVar.f39824y;
                Context context = (Context) this.f28834u;
                if (c2569Gf.a(context)) {
                    String str3 = (String) map.get("eventName");
                    String str4 = (String) map.get("eventId");
                    int hashCode = str3.hashCode();
                    if (hashCode == 94399) {
                        if (str3.equals("_aa")) {
                            i = 2;
                        }
                        i = -1;
                    } else if (hashCode == 94401) {
                        break;
                    } else {
                        if (hashCode == 94407 && str3.equals("_ai")) {
                            i = 1;
                        }
                        i = -1;
                    }
                    C2569Gf c2569Gf2 = jVar.f39824y;
                    HashMap hashMap = (HashMap) this.f28835v;
                    if (i == 0) {
                        Map map2 = (Map) hashMap.get("_ac");
                        c2569Gf2.getClass();
                        c2569Gf2.h(context, "_ac", str4, C2569Gf.f(map2));
                        return;
                    } else if (i == 1) {
                        Map map3 = (Map) hashMap.get("_ai");
                        c2569Gf2.getClass();
                        c2569Gf2.h(context, "_ai", str4, C2569Gf.f(map3));
                        return;
                    } else if (i == 2) {
                        c2569Gf2.h(context, "_aa", str4, null);
                        return;
                    } else {
                        int i9 = t2.C.f40822b;
                        u2.i.c("logScionEvent gmsg contained unsupported eventName");
                        return;
                    }
                }
                return;
            case 2:
                String str5 = (String) map.get("id");
                String str6 = (String) map.get("fail");
                String str7 = (String) map.get("fail_reason");
                String str8 = (String) map.get("fail_stack");
                String str9 = (String) map.get("result");
                if (true == TextUtils.isEmpty(str8)) {
                    str7 = "Unknown Fail Reason.";
                }
                String concat = TextUtils.isEmpty(str8) ? "" : "\n".concat(String.valueOf(str8));
                synchronized (this.f28834u) {
                    try {
                        interfaceC3476kc = (InterfaceC3476kc) ((HashMap) this.f28835v).remove(str5);
                    } catch (JSONException e6) {
                        interfaceC3476kc.b(e6.getMessage());
                    } finally {
                    }
                    if (interfaceC3476kc == null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 50);
                        sb.append("Received result for unexpected method invocation: ");
                        sb.append(str5);
                        String sb2 = sb.toString();
                        int i10 = t2.C.f40822b;
                        u2.i.f(sb2);
                        return;
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str7).length() + concat.length());
                        sb3.append(str7);
                        sb3.append(concat);
                        interfaceC3476kc.b(sb3.toString());
                        return;
                    }
                    if (str9 == null) {
                        interfaceC3476kc.c(null);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str9);
                    if (t2.C.m()) {
                        String jSONObject2 = jSONObject.toString(2);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(jSONObject2).length() + 13);
                        sb4.append("Result GMSG: ");
                        sb4.append(jSONObject2);
                        t2.C.k(sb4.toString());
                    }
                    interfaceC3476kc.c(jSONObject);
                    return;
                }
            case 3:
                C3109dm c3109dm = (C3109dm) ((WeakReference) this.f28834u).get();
                if (c3109dm == null) {
                    return;
                }
                c3109dm.f30227z.a();
                C3151ea c3151ea = AbstractC3368ia.se;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    View view = (View) ((WeakReference) this.f28835v).get();
                    C2508Cm c2508Cm = c3109dm.f30219X;
                    c2508Cm.getClass();
                    if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() || view == null) {
                        return;
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (parent == null) {
                            str = "0";
                        } else if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                            str = "1";
                        } else {
                            parent = parent.getParent();
                        }
                    }
                    C2593Hm a9 = c2508Cm.f24247a.a();
                    a9.r(NativeAdvancedJsUtils.f18064p, "hcp");
                    a9.r("hcp", str);
                    a9.i(c3109dm.f30199C);
                    a9.s();
                    return;
                }
                return;
            case 4:
                ViewOnClickListenerC2542Em viewOnClickListenerC2542Em = (ViewOnClickListenerC2542Em) this.f28834u;
                try {
                    viewOnClickListenerC2542Em.f24818y = Long.valueOf(Long.parseLong((String) map.get(com.anythink.expressad.foundation.d.d.f18754u)));
                } catch (NumberFormatException unused) {
                    int i11 = t2.C.f40822b;
                    u2.i.c("Failed to call parse unconfirmedClickTimestamp.");
                }
                viewOnClickListenerC2542Em.f24817x = (String) map.get("id");
                String str10 = (String) map.get("asset_id");
                C2633Kb c2633Kb = (C2633Kb) this.f28835v;
                if (c2633Kb == null) {
                    int i12 = t2.C.f40822b;
                    u2.i.a("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    Parcel A02 = c2633Kb.A0();
                    A02.writeString(str10);
                    c2633Kb.G0(A02, 1);
                    return;
                } catch (RemoteException e9) {
                    u2.i.i("#007 Could not call remote method.", e9);
                    return;
                }
            case 5:
                C2611In c2611In = (C2611In) this.f28834u;
                InterfaceC3858rh interfaceC3858rh2 = (InterfaceC3858rh) this.f28835v;
                C2895Zi c2895Zi = c2611In.i;
                synchronized (c2895Zi) {
                    c2895Zi.f29049v.add(interfaceC3858rh2);
                    C2827Vi c2827Vi = c2895Zi.f29047n;
                    interfaceC3858rh2.N0("/updateActiveView", c2827Vi.f28287e);
                    interfaceC3858rh2.N0("/untrackActiveViewUnit", c2827Vi.f28288f);
                }
                return;
            default:
                InterfaceC3858rh interfaceC3858rh3 = (InterfaceC3858rh) obj;
                String str11 = (String) map.get("u");
                if (str11 == null) {
                    int i13 = t2.C.f40822b;
                    u2.i.f("URL missing from httpTrack GMSG.");
                    return;
                }
                Ut J = interfaceC3858rh3.J();
                if (J != null && !J.f28155i0) {
                    ((Av) this.f28834u).b(str11, J.f28184x0, null, null);
                    return;
                }
                Wt x02 = interfaceC3858rh3.x0();
                if (x02 == null) {
                    p2.j.f39798C.f39808h.d("BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                p2.j.f39798C.f39810k.getClass();
                C3614n5 c3614n5 = new C3614n5(x02.f28491b, str11, 2, System.currentTimeMillis());
                C2834Vp c2834Vp = (C2834Vp) this.f28835v;
                c2834Vp.getClass();
                c2834Vp.a(new C2593Hm(9, c2834Vp, c3614n5));
                return;
        }
    }

    public C2871Yb() {
        this.f28833n = 2;
        this.f28834u = new Object();
        this.f28835v = new HashMap();
    }

    public C2871Yb(C3109dm c3109dm, View view) {
        this.f28833n = 3;
        this.f28834u = new WeakReference(c3109dm);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.se)).booleanValue()) {
            this.f28835v = new WeakReference(view);
        } else {
            this.f28835v = new WeakReference(null);
        }
    }
}
