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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.dc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3088dc implements InterfaceC3249gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29781n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f29782u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f29783v;

    public /* synthetic */ C3088dc(int i, Object obj, Object obj2) {
        this.f29781n = i;
        this.f29782u = obj;
        this.f29783v = obj2;
    }

    public void a(String str, InterfaceC3733pc interfaceC3733pc) {
        synchronized (this.f29782u) {
            ((HashMap) this.f29783v).put(str, interfaceC3733pc);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0290, code lost:
    
        if (r4.equals("_ac") != false) goto L113;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Object obj, Map map) {
        InterfaceC3733pc interfaceC3733pc;
        String str;
        int i = 0;
        switch (this.f29781n) {
            case 0:
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                AbstractC3195fc.b(map, (InterfaceC2542El) this.f29782u);
                String str2 = (String) map.get("u");
                if (str2 == null) {
                    int i6 = u2.z.f41322b;
                    v2.i.f("URL missing from click GMSG.");
                    return;
                }
                ID s9 = ID.s(AbstractC3195fc.a(interfaceC4061vh, str2));
                C3141ec c3141ec = new C3141ec((C2692Ni) this.f29783v, str2, i);
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                C3878sD t6 = QC.t(s9, c3141ec, c3360ig);
                t6.a(new LD(i, t6, new Ux(7, interfaceC4061vh)), c3360ig);
                return;
            case 1:
                C4835j c4835j = C4835j.f39733C;
                C2621Jf c2621Jf = c4835j.f39759y;
                Context context = (Context) this.f29782u;
                if (c2621Jf.a(context)) {
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
                    C2621Jf c2621Jf2 = c4835j.f39759y;
                    HashMap hashMap = (HashMap) this.f29783v;
                    if (i == 0) {
                        Map map2 = (Map) hashMap.get("_ac");
                        c2621Jf2.getClass();
                        c2621Jf2.h(context, "_ac", str4, C2621Jf.f(map2));
                        return;
                    } else if (i == 1) {
                        Map map3 = (Map) hashMap.get("_ai");
                        c2621Jf2.getClass();
                        c2621Jf2.h(context, "_ai", str4, C2621Jf.f(map3));
                        return;
                    } else if (i == 2) {
                        c2621Jf2.h(context, "_aa", str4, null);
                        return;
                    } else {
                        int i9 = u2.z.f41322b;
                        v2.i.c("logScionEvent gmsg contained unsupported eventName");
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
                synchronized (this.f29782u) {
                    try {
                        interfaceC3733pc = (InterfaceC3733pc) ((HashMap) this.f29783v).remove(str5);
                    } catch (JSONException e9) {
                        interfaceC3733pc.z(e9.getMessage());
                    } finally {
                    }
                    if (interfaceC3733pc == null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 50);
                        sb.append("Received result for unexpected method invocation: ");
                        sb.append(str5);
                        String sb2 = sb.toString();
                        int i10 = u2.z.f41322b;
                        v2.i.f(sb2);
                        return;
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str7).length() + concat.length());
                        sb3.append(str7);
                        sb3.append(concat);
                        interfaceC3733pc.z(sb3.toString());
                        return;
                    }
                    if (str9 == null) {
                        interfaceC3733pc.b(null);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str9);
                    if (u2.z.m()) {
                        String jSONObject2 = jSONObject.toString(2);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(jSONObject2).length() + 13);
                        sb4.append("Result GMSG: ");
                        sb4.append(jSONObject2);
                        u2.z.k(sb4.toString());
                    }
                    interfaceC3733pc.b(jSONObject);
                    return;
                }
            case 3:
                C3205fm c3205fm = (C3205fm) ((WeakReference) this.f29782u).get();
                if (c3205fm == null) {
                    return;
                }
                c3205fm.f30450z.t();
                C3301ha c3301ha = AbstractC3569ma.ye;
                q2.r rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                    View view = (View) ((WeakReference) this.f29783v).get();
                    C2543Em c2543Em = c3205fm.f30442X;
                    c2543Em.getClass();
                    if (!((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() || view == null) {
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
                    S0.e a9 = c2543Em.f24647a.a();
                    a9.v(NativeAdvancedJsUtils.f17906p, "hcp");
                    a9.v("hcp", str);
                    a9.s(c3205fm.f30422C);
                    a9.y();
                    return;
                }
                return;
            case 4:
                ViewOnClickListenerC2577Gm viewOnClickListenerC2577Gm = (ViewOnClickListenerC2577Gm) this.f29782u;
                try {
                    viewOnClickListenerC2577Gm.f25111y = Long.valueOf(Long.parseLong((String) map.get(com.anythink.expressad.foundation.d.d.f18596u)));
                } catch (NumberFormatException unused) {
                    int i11 = u2.z.f41322b;
                    v2.i.c("Failed to call parse unconfirmedClickTimestamp.");
                }
                viewOnClickListenerC2577Gm.f25110x = (String) map.get("id");
                String str10 = (String) map.get("asset_id");
                C2702Ob c2702Ob = (C2702Ob) this.f29783v;
                if (c2702Ob == null) {
                    int i12 = u2.z.f41322b;
                    v2.i.a("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    Parcel H02 = c2702Ob.H0();
                    H02.writeString(str10);
                    c2702Ob.f1(H02, 1);
                    return;
                } catch (RemoteException e10) {
                    v2.i.i("#007 Could not call remote method.", e10);
                    return;
                }
            case 5:
                C2595Hn c2595Hn = (C2595Hn) this.f29782u;
                InterfaceC4061vh interfaceC4061vh2 = (InterfaceC4061vh) this.f29783v;
                C2934aj c2934aj = c2595Hn.i;
                synchronized (c2934aj) {
                    c2934aj.f29084v.add(interfaceC4061vh2);
                    C2841Wi c2841Wi = c2934aj.f29082n;
                    interfaceC4061vh2.a1("/updateActiveView", c2841Wi.f28374e);
                    interfaceC4061vh2.a1("/untrackActiveViewUnit", c2841Wi.f28375f);
                }
                return;
            default:
                InterfaceC4061vh interfaceC4061vh3 = (InterfaceC4061vh) obj;
                String str11 = (String) map.get("u");
                if (str11 == null) {
                    int i13 = u2.z.f41322b;
                    v2.i.f("URL missing from httpTrack GMSG.");
                    return;
                }
                St K7 = interfaceC4061vh3.K();
                if (K7 != null && !K7.f27622i0) {
                    ((C4237yv) this.f29782u).b(str11, K7.f27651x0, null, null);
                    return;
                }
                Ut A02 = interfaceC4061vh3.A0();
                if (A02 == null) {
                    C4835j.f39733C.f39743h.d("BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                C4835j.f39733C.f39745k.getClass();
                C3709p5 c3709p5 = new C3709p5(A02.f28004b, str11, 2, System.currentTimeMillis());
                C2800Tp c2800Tp = (C2800Tp) this.f29783v;
                c2800Tp.getClass();
                c2800Tp.a(new S0.l(14, c2800Tp, c3709p5));
                return;
        }
    }

    public C3088dc() {
        this.f29781n = 2;
        this.f29782u = new Object();
        this.f29783v = new HashMap();
    }

    public C3088dc(C3205fm c3205fm, View view) {
        this.f29781n = 3;
        this.f29782u = new WeakReference(c3205fm);
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.ye)).booleanValue()) {
            this.f29783v = new WeakReference(view);
        } else {
            this.f29783v = new WeakReference(null);
        }
    }
}
