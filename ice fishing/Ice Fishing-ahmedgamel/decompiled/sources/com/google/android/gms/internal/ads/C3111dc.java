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
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.dc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3111dc implements InterfaceC3272gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30554n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f30555u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f30556v;

    public /* synthetic */ C3111dc(int i, Object obj, Object obj2) {
        this.f30554n = i;
        this.f30555u = obj;
        this.f30556v = obj2;
    }

    public void a(String str, InterfaceC3756pc interfaceC3756pc) {
        synchronized (this.f30555u) {
            ((HashMap) this.f30556v).put(str, interfaceC3756pc);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0290, code lost:
    
        if (r4.equals("_ac") != false) goto L113;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Object obj, Map map) {
        InterfaceC3756pc interfaceC3756pc;
        String str;
        int i = 0;
        switch (this.f30554n) {
            case 0:
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
                AbstractC3218fc.b(map, (InterfaceC2579Fl) this.f30555u);
                String str2 = (String) map.get("u");
                if (str2 == null) {
                    int i4 = w2.z.f41712b;
                    x2.i.f("URL missing from click GMSG.");
                    return;
                }
                ID s9 = ID.s(AbstractC3218fc.a(interfaceC4084vh, str2));
                C3164ec c3164ec = new C3164ec((C2712Ni) this.f30556v, str2, i);
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                C3901sD t6 = QC.t(s9, c3164ec, c3383ig);
                t6.a(new LD(i, t6, new Ux(7, interfaceC4084vh)), c3383ig);
                return;
            case 1:
                C4906k c4906k = C4906k.f40186C;
                C2641Jf c2641Jf = c4906k.f40212y;
                Context context = (Context) this.f30555u;
                if (c2641Jf.a(context)) {
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
                    C2641Jf c2641Jf2 = c4906k.f40212y;
                    HashMap hashMap = (HashMap) this.f30556v;
                    if (i == 0) {
                        Map map2 = (Map) hashMap.get("_ac");
                        c2641Jf2.getClass();
                        c2641Jf2.h(context, "_ac", str4, C2641Jf.f(map2));
                        return;
                    } else if (i == 1) {
                        Map map3 = (Map) hashMap.get("_ai");
                        c2641Jf2.getClass();
                        c2641Jf2.h(context, "_ai", str4, C2641Jf.f(map3));
                        return;
                    } else if (i == 2) {
                        c2641Jf2.h(context, "_aa", str4, null);
                        return;
                    } else {
                        int i6 = w2.z.f41712b;
                        x2.i.c("logScionEvent gmsg contained unsupported eventName");
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
                synchronized (this.f30555u) {
                    try {
                        interfaceC3756pc = (InterfaceC3756pc) ((HashMap) this.f30556v).remove(str5);
                    } catch (JSONException e9) {
                        interfaceC3756pc.z(e9.getMessage());
                    } finally {
                    }
                    if (interfaceC3756pc == null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 50);
                        sb.append("Received result for unexpected method invocation: ");
                        sb.append(str5);
                        String sb2 = sb.toString();
                        int i9 = w2.z.f41712b;
                        x2.i.f(sb2);
                        return;
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str7).length() + concat.length());
                        sb3.append(str7);
                        sb3.append(concat);
                        interfaceC3756pc.z(sb3.toString());
                        return;
                    }
                    if (str9 == null) {
                        interfaceC3756pc.b(null);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str9);
                    if (w2.z.m()) {
                        String jSONObject2 = jSONObject.toString(2);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(jSONObject2).length() + 13);
                        sb4.append("Result GMSG: ");
                        sb4.append(jSONObject2);
                        w2.z.k(sb4.toString());
                    }
                    interfaceC3756pc.b(jSONObject);
                    return;
                }
            case 3:
                C3282gm c3282gm = (C3282gm) ((WeakReference) this.f30555u).get();
                if (c3282gm == null) {
                    return;
                }
                c3282gm.f31423z.t();
                C3324ha c3324ha = AbstractC3592ma.ye;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    View view = (View) ((WeakReference) this.f30556v).get();
                    C2580Fm c2580Fm = c3282gm.f31415X;
                    c2580Fm.getClass();
                    if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() || view == null) {
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
                    S0.e a9 = c2580Fm.f25632a.a();
                    a9.M(NativeAdvancedJsUtils.f18693p, "hcp");
                    a9.M("hcp", str);
                    a9.I(c3282gm.f31395C);
                    a9.N();
                    return;
                }
                return;
            case 4:
                ViewOnClickListenerC2614Hm viewOnClickListenerC2614Hm = (ViewOnClickListenerC2614Hm) this.f30555u;
                try {
                    viewOnClickListenerC2614Hm.f26112y = Long.valueOf(Long.parseLong((String) map.get(com.anythink.expressad.foundation.d.d.f19383u)));
                } catch (NumberFormatException unused) {
                    int i10 = w2.z.f41712b;
                    x2.i.c("Failed to call parse unconfirmedClickTimestamp.");
                }
                viewOnClickListenerC2614Hm.f26111x = (String) map.get("id");
                String str10 = (String) map.get("asset_id");
                C2722Ob c2722Ob = (C2722Ob) this.f30556v;
                if (c2722Ob == null) {
                    int i11 = w2.z.f41712b;
                    x2.i.a("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    Parcel F02 = c2722Ob.F0();
                    F02.writeString(str10);
                    c2722Ob.d1(F02, 1);
                    return;
                } catch (RemoteException e10) {
                    x2.i.i("#007 Could not call remote method.", e10);
                    return;
                }
            case 5:
                C2632In c2632In = (C2632In) this.f30555u;
                InterfaceC4084vh interfaceC4084vh2 = (InterfaceC4084vh) this.f30556v;
                C2957aj c2957aj = c2632In.i;
                synchronized (c2957aj) {
                    c2957aj.f29859v.add(interfaceC4084vh2);
                    C2864Wi c2864Wi = c2957aj.f29857n;
                    interfaceC4084vh2.Z0("/updateActiveView", c2864Wi.f29173e);
                    interfaceC4084vh2.Z0("/untrackActiveViewUnit", c2864Wi.f29174f);
                }
                return;
            default:
                InterfaceC4084vh interfaceC4084vh3 = (InterfaceC4084vh) obj;
                String str11 = (String) map.get("u");
                if (str11 == null) {
                    int i12 = w2.z.f41712b;
                    x2.i.f("URL missing from httpTrack GMSG.");
                    return;
                }
                St J = interfaceC4084vh3.J();
                if (J != null && !J.f28405i0) {
                    ((C4260yv) this.f30555u).b(str11, J.f28434x0, null, null);
                    return;
                }
                Ut z02 = interfaceC4084vh3.z0();
                if (z02 == null) {
                    C4906k.f40186C.f40196h.d("BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                C4906k.f40186C.f40198k.getClass();
                C3732p5 c3732p5 = new C3732p5(z02.f28801b, str11, 2, System.currentTimeMillis());
                C2821Tp c2821Tp = (C2821Tp) this.f30556v;
                c2821Tp.getClass();
                c2821Tp.a(new S0.l(17, c2821Tp, c3732p5));
                return;
        }
    }

    public C3111dc() {
        this.f30554n = 2;
        this.f30555u = new Object();
        this.f30556v = new HashMap();
    }

    public C3111dc(C3282gm c3282gm, View view) {
        this.f30554n = 3;
        this.f30555u = new WeakReference(c3282gm);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ye)).booleanValue()) {
            this.f30556v = new WeakReference(view);
        } else {
            this.f30556v = new WeakReference(null);
        }
    }
}
