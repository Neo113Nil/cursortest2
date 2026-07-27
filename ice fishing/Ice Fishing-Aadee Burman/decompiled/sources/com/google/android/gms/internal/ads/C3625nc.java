package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p2.C4826a;
import p2.C4835j;
import q2.C4900p;
import q2.InterfaceC4870a;
import q5.C4927a;
import t2.C5037e;
import t2.InterfaceC5033a;

/* renamed from: com.google.android.gms.internal.ads.nc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3625nc implements InterfaceC3249gc {

    /* renamed from: A, reason: collision with root package name */
    public final C3311hk f32737A;

    /* renamed from: n, reason: collision with root package name */
    public final C4826a f32740n;

    /* renamed from: u, reason: collision with root package name */
    public final C3153eo f32741u;

    /* renamed from: w, reason: collision with root package name */
    public final C2884Zd f32743w;

    /* renamed from: x, reason: collision with root package name */
    public final C2800Tp f32744x;

    /* renamed from: y, reason: collision with root package name */
    public final C2692Ni f32745y;

    /* renamed from: z, reason: collision with root package name */
    public final C3525lk f32746z;

    /* renamed from: v, reason: collision with root package name */
    public v2.l f32742v = null;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC5033a f32738B = null;

    /* renamed from: C, reason: collision with root package name */
    public final C3360ig f32739C = AbstractC3413jg.f31275h;

    public C3625nc(C4826a c4826a, C2884Zd c2884Zd, C2800Tp c2800Tp, C3153eo c3153eo, C2692Ni c2692Ni, C3525lk c3525lk, C3311hk c3311hk) {
        this.f32740n = c4826a;
        this.f32743w = c2884Zd;
        this.f32744x = c2800Tp;
        this.f32741u = c3153eo;
        this.f32745y = c2692Ni;
        this.f32746z = c3525lk;
        this.f32737A = c3311hk;
    }

    public static int a(Map map) {
        String str = (String) map.get(C4927a.PUSH_MINIFIED_BUTTONS_LIST);
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri b(Context context, C3441k7 c3441k7, Uri uri, View view, Activity activity, C3213fu c3213fu) {
        if (c3441k7 != null) {
            try {
                if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.vd)).booleanValue() || c3213fu == null) {
                    if (c3441k7.c(uri)) {
                        return c3441k7.b(uri, context, view, activity);
                    }
                } else if (c3441k7.c(uri)) {
                    return c3213fu.a(uri, context, view, activity);
                }
            } catch (C3495l7 unused) {
            } catch (Exception e9) {
                C4835j.f39730C.f39740h.d("OpenGmsgHandler.maybeAddClickSignalsToUri", e9);
            }
        }
        return uri;
    }

    public static Uri c(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e9) {
            String valueOf = String.valueOf(uri.toString());
            int i = u2.z.f41319b;
            v2.i.d("Error adding click uptime parameter to url: ".concat(valueOf), e9);
        }
        return uri;
    }

    public final void d(String str, Bundle bundle, String str2) {
        C3153eo c3153eo = this.f32741u;
        if (c3153eo == null) {
            return;
        }
        String encodeToString = bundle != null ? Base64.encodeToString(C4900p.f40196g.f40197a.m(bundle, new JSONObject()).toString().getBytes(), 1) : null;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.se)).booleanValue()) {
            S0.e a9 = c3153eo.a();
            a9.v(NativeAdvancedJsUtils.f17906p, str);
            if (str2 != null) {
                a9.v("gqi", str2);
            }
            if (encodeToString != null) {
                a9.v("hsoe", encodeToString);
            }
            a9.B();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    public final void e(Object obj, Map map) {
        C2692Ni c2692Ni;
        InterfaceC4870a interfaceC4870a = (InterfaceC4870a) obj;
        String str = (String) map.get("u");
        HashMap hashMap = new HashMap();
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) interfaceC4870a;
        if (interfaceC4061vh.K() != null) {
            hashMap = interfaceC4061vh.K().f27649w0;
        }
        String g4 = AbstractC3043cl.g(str, interfaceC4061vh.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i = u2.z.f41319b;
            v2.i.f("Action missing from an open GMSG.");
            return;
        }
        C4826a c4826a = this.f32740n;
        if (c4826a != null && !c4826a.a()) {
            c4826a.b(g4);
        } else {
            N3.a a9 = (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.vb)).booleanValue() && (c2692Ni = this.f32745y) != null && C2692Ni.b(g4)) ? c2692Ni.a(g4, C4900p.f40196g.f40201e) : QC.c(g4);
            a9.a(new LD(0, a9, new C2570Gf(this, map, interfaceC4870a, str2)), this.f32739C);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (((java.lang.Boolean) q2.r.f40204e.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.J9)).booleanValue() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) q2.r.f40204e.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.E9)).booleanValue() : ((java.lang.Boolean) q2.r.f40204e.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.D9)).booleanValue()) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(InterfaceC4870a interfaceC4870a, Context context, String str, String str2) {
        Context context2;
        String str3;
        InterfaceC3251ge interfaceC3251ge;
        C3789qe c3789qe;
        v2.g gVar;
        C2800Tp c2800Tp = this.f32744x;
        C3153eo c3153eo = this.f32741u;
        if (c3153eo != null) {
            int i = BinderC2880Yp.f28742A;
            context2 = context;
            str3 = str2;
            BinderC2880Yp.V3(context2, c3153eo, c2800Tp, str3, "offline_open", new HashMap());
        } else {
            context2 = context;
            str3 = str2;
        }
        C4835j c4835j = C4835j.f39730C;
        if (c4835j.f39740h.i(context2)) {
            if (this.f32742v == null) {
                this.f32742v = new v2.l(context2.getApplicationContext(), null);
            }
            v2.l lVar = this.f32742v;
            c2800Tp.getClass();
            c2800Tp.a(new C4274ze(13, c2800Tp, lVar, str3));
            return false;
        }
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) interfaceC4870a;
        St K7 = interfaceC4061vh.K();
        boolean z3 = (K7 == null || (gVar = K7.f27653y0) == null || gVar.f41409c) ? false : true;
        boolean z6 = (K7 == null || (c3789qe = K7.f27613d0) == null || !c3789qe.f33247a || c3789qe.f33248b == null || !c3789qe.f33249c) ? false : true;
        if (!z3) {
            if (z6) {
            }
            u2.t b9 = u2.D.b(context2);
            boolean a9 = D.I.a(new D.N(context2).f461b);
            boolean t6 = c4835j.f39738f.t(context2);
            boolean z9 = interfaceC4061vh.i0().b() && interfaceC4061vh.j() == null;
            if (!a9) {
                if (!D.I.a(new D.N(context2).f461b)) {
                }
                g(context2, str3, "notifications_disabled");
                return false;
            }
            if (t6) {
                g(context2, str3, "notification_channel_disabled");
                return false;
            }
            if (b9 == null) {
                g(context2, str3, "work_manager_unavailable");
                return false;
            }
            if (z9) {
                g(context2, str3, "ad_no_activity");
                return false;
            }
            if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.B9)).booleanValue()) {
                g(context2, str3, "notification_flow_disabled");
                return false;
            }
            if (interfaceC4061vh.z0() == null || interfaceC4061vh.j() == null) {
                interfaceC4061vh.m0(str3, str);
            } else {
                Activity j6 = interfaceC4061vh.j();
                if (j6 == null) {
                    throw new NullPointerException("Null activity");
                }
                C2767Rp c2767Rp = new C2767Rp(j6, null, str3, str);
                try {
                    AdOverlayInfoParcel adOverlayInfoParcel = interfaceC4061vh.z0().f40824v;
                    if (adOverlayInfoParcel == null || (interfaceC3251ge = adOverlayInfoParcel.f23575O) == null) {
                        throw new t2.h("noioou");
                    }
                    interfaceC3251ge.Y(new W2.b(c2767Rp));
                } catch (Exception e9) {
                    g(context2, str3, e9.getMessage());
                    return false;
                }
            }
            interfaceC4870a.onAdClicked();
            return true;
        }
        if (c3153eo != null) {
            int i6 = BinderC2880Yp.f28742A;
            BinderC2880Yp.V3(context2, c3153eo, c2800Tp, str3, "onfs", new HashMap());
        }
        return false;
    }

    public final void g(Context context, String str, String str2) {
        C2800Tp c2800Tp = this.f32744x;
        c2800Tp.i(str);
        C3153eo c3153eo = this.f32741u;
        if (c3153eo != null) {
            MA.i("dialog_not_shown_reason", str2);
            BinderC2880Yp.V3(context, c3153eo, c2800Tp, str, "dialog_not_shown", C3770qC.e(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0113, code lost:
    
        if (com.google.android.gms.internal.ads.SK.A(r13, new java.util.ArrayList(), r6) == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0156, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(InterfaceC4870a interfaceC4870a, Map map, boolean z3, String str, boolean z6, boolean z9) {
        boolean z10;
        Uri build;
        Intent intent;
        ResolveInfo A9;
        Intent intent2;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo A10;
        i(true);
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) interfaceC4870a;
        Context context = interfaceC4061vh.getContext();
        C3441k7 R02 = interfaceC4061vh.R0();
        View V8 = interfaceC4061vh.V();
        C3213fu f02 = interfaceC4061vh.f0();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            intent2 = null;
        } else {
            Uri c9 = c(b(context, R02, Uri.parse(str2), V8, null, f02));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32393v5)).booleanValue()) {
                    z10 = false;
                    build = !"http".equalsIgnoreCase(c9.getScheme()) ? c9.buildUpon().scheme("https").build() : "https".equalsIgnoreCase(c9.getScheme()) ? c9.buildUpon().scheme("http").build() : null;
                    ArrayList arrayList = new ArrayList();
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.addFlags(268435456);
                    intent3.setData(c9);
                    intent3.setAction("android.intent.action.VIEW");
                    if (build != null) {
                        intent = null;
                    } else {
                        Intent intent4 = new Intent("android.intent.action.VIEW");
                        intent4.addFlags(268435456);
                        intent4.setData(build);
                        intent4.setAction("android.intent.action.VIEW");
                        intent = intent4;
                    }
                    if (z10) {
                        u2.D d2 = C4835j.f39730C.f39735c;
                        u2.D.L(context, intent3);
                        u2.D.L(context, intent);
                    }
                    A9 = SK.A(intent3, arrayList, context);
                    if (A9 == null) {
                        intent2 = SK.D(intent3, A9);
                    } else {
                        if (intent != null && (A10 = SK.A(intent, new ArrayList(), context)) != null) {
                            intent2 = SK.D(intent3, A10);
                        }
                        if (!arrayList.isEmpty()) {
                            if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                                int size = arrayList.size();
                                int i = 0;
                                loop0: while (i < size) {
                                    ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                    do {
                                        int i6 = i + 1;
                                        if (it.hasNext()) {
                                        }
                                    } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                                    intent2 = SK.D(intent3, resolveInfo);
                                    break loop0;
                                }
                            }
                            if (parseBoolean) {
                                intent2 = SK.D(intent3, (ResolveInfo) arrayList.get(0));
                            }
                        }
                        intent2 = intent3;
                    }
                }
            }
            z10 = true;
            if (!"http".equalsIgnoreCase(c9.getScheme())) {
            }
            ArrayList arrayList2 = new ArrayList();
            Intent intent32 = new Intent("android.intent.action.VIEW");
            intent32.addFlags(268435456);
            intent32.setData(c9);
            intent32.setAction("android.intent.action.VIEW");
            if (build != null) {
            }
            if (z10) {
            }
            A9 = SK.A(intent32, arrayList2, context);
            if (A9 == null) {
            }
        }
        if (!z3 || this.f32744x == null || intent2 == null || !f(interfaceC4870a, interfaceC4061vh.getContext(), intent2.getData().toString(), str)) {
            try {
                ((InterfaceC4061vh) interfaceC4870a).g1(new C5037e(intent2, this.f32738B), z6, z9, str);
            } catch (ActivityNotFoundException e9) {
                String message = e9.getMessage();
                int i9 = u2.z.f41319b;
                v2.i.f(message);
            }
        }
    }

    public final void i(boolean z3) {
        C2884Zd c2884Zd = this.f32743w;
        if (c2884Zd != null) {
            c2884Zd.C(z3);
        }
    }

    public final void j(int i) {
        C3153eo c3153eo;
        String str;
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32422y5)).booleanValue() || (c3153eo = this.f32741u) == null) {
            return;
        }
        S0.e a9 = c3153eo.a();
        a9.v(NativeAdvancedJsUtils.f17906p, "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        a9.v("cct_open_status", str);
        a9.y();
    }
}
