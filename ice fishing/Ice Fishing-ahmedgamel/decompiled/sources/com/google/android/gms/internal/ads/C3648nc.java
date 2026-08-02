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
import q5.C4876a;
import r2.C4896a;
import r2.C4906k;
import s2.C4949p;
import s2.InterfaceC4919a;
import v2.C5101e;
import v2.InterfaceC5097a;

/* renamed from: com.google.android.gms.internal.ads.nc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3648nc implements InterfaceC3272gc {

    /* renamed from: A, reason: collision with root package name */
    public final C3334hk f33524A;

    /* renamed from: n, reason: collision with root package name */
    public final C4896a f33527n;

    /* renamed from: u, reason: collision with root package name */
    public final C3230fo f33528u;

    /* renamed from: w, reason: collision with root package name */
    public final C2907Zd f33530w;

    /* renamed from: x, reason: collision with root package name */
    public final C2821Tp f33531x;

    /* renamed from: y, reason: collision with root package name */
    public final C2712Ni f33532y;

    /* renamed from: z, reason: collision with root package name */
    public final C3548lk f33533z;

    /* renamed from: v, reason: collision with root package name */
    public x2.l f33529v = null;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC5097a f33525B = null;

    /* renamed from: C, reason: collision with root package name */
    public final C3383ig f33526C = AbstractC3436jg.f32062h;

    public C3648nc(C4896a c4896a, C2907Zd c2907Zd, C2821Tp c2821Tp, C3230fo c3230fo, C2712Ni c2712Ni, C3548lk c3548lk, C3334hk c3334hk) {
        this.f33527n = c4896a;
        this.f33530w = c2907Zd;
        this.f33531x = c2821Tp;
        this.f33528u = c3230fo;
        this.f33532y = c2712Ni;
        this.f33533z = c3548lk;
        this.f33524A = c3334hk;
    }

    public static int a(Map map) {
        String str = (String) map.get(C4876a.PUSH_MINIFIED_BUTTONS_LIST);
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

    public static Uri b(Context context, C3464k7 c3464k7, Uri uri, View view, Activity activity, C3236fu c3236fu) {
        if (c3464k7 != null) {
            try {
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.vd)).booleanValue() || c3236fu == null) {
                    if (c3464k7.c(uri)) {
                        return c3464k7.b(uri, context, view, activity);
                    }
                } else if (c3464k7.c(uri)) {
                    return c3236fu.a(uri, context, view, activity);
                }
            } catch (C3518l7 unused) {
            } catch (Exception e9) {
                C4906k.f40186C.f40196h.d("OpenGmsgHandler.maybeAddClickSignalsToUri", e9);
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
            int i = w2.z.f41712b;
            x2.i.d("Error adding click uptime parameter to url: ".concat(valueOf), e9);
        }
        return uri;
    }

    public final void d(String str, Bundle bundle, String str2) {
        C3230fo c3230fo = this.f33528u;
        if (c3230fo == null) {
            return;
        }
        String encodeToString = bundle != null ? Base64.encodeToString(C4949p.f40498g.f40499a.m(bundle, new JSONObject()).toString().getBytes(), 1) : null;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.se)).booleanValue()) {
            S0.e a9 = c3230fo.a();
            a9.M(NativeAdvancedJsUtils.f18693p, str);
            if (str2 != null) {
                a9.M("gqi", str2);
            }
            if (encodeToString != null) {
                a9.M("hsoe", encodeToString);
            }
            a9.P();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    public final void e(Object obj, Map map) {
        C2712Ni c2712Ni;
        InterfaceC4919a interfaceC4919a = (InterfaceC4919a) obj;
        String str = (String) map.get("u");
        HashMap hashMap = new HashMap();
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) interfaceC4919a;
        if (interfaceC4084vh.J() != null) {
            hashMap = interfaceC4084vh.J().f28432w0;
        }
        String g9 = AbstractC3066cl.g(str, interfaceC4084vh.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i = w2.z.f41712b;
            x2.i.f("Action missing from an open GMSG.");
            return;
        }
        C4896a c4896a = this.f33527n;
        if (c4896a != null && !c4896a.a()) {
            c4896a.b(g9);
        } else {
            P3.a a9 = (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.vb)).booleanValue() && (c2712Ni = this.f33532y) != null && C2712Ni.b(g9)) ? c2712Ni.a(g9, C4949p.f40498g.f40503e) : QC.c(g9);
            a9.a(new LD(0, a9, new C2590Gf(this, map, interfaceC4919a, str2)), this.f33526C);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.J9)).booleanValue() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.E9)).booleanValue() : ((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.D9)).booleanValue()) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(InterfaceC4919a interfaceC4919a, Context context, String str, String str2) {
        Context context2;
        String str3;
        InterfaceC3274ge interfaceC3274ge;
        C3812qe c3812qe;
        x2.g gVar;
        C2821Tp c2821Tp = this.f33531x;
        C3230fo c3230fo = this.f33528u;
        if (c3230fo != null) {
            int i = BinderC2903Yp.f29521A;
            context2 = context;
            str3 = str2;
            BinderC2903Yp.V3(context2, c3230fo, c2821Tp, str3, "offline_open", new HashMap());
        } else {
            context2 = context;
            str3 = str2;
        }
        C4906k c4906k = C4906k.f40186C;
        if (c4906k.f40196h.i(context2)) {
            if (this.f33529v == null) {
                this.f33529v = new x2.l(context2.getApplicationContext(), null);
            }
            x2.l lVar = this.f33529v;
            c2821Tp.getClass();
            c2821Tp.a(new C4297ze(13, c2821Tp, lVar, str3));
            return false;
        }
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) interfaceC4919a;
        St J = interfaceC4084vh.J();
        boolean z6 = (J == null || (gVar = J.f28436y0) == null || gVar.f41866c) ? false : true;
        boolean z9 = (J == null || (c3812qe = J.f28396d0) == null || !c3812qe.f34029a || c3812qe.f34030b == null || !c3812qe.f34031c) ? false : true;
        if (!z6) {
            if (z9) {
            }
            w2.t b9 = w2.D.b(context2);
            boolean a9 = D.H.a(new D.M(context2).f358b);
            boolean w3 = c4906k.f40194f.w(context2);
            boolean z10 = interfaceC4084vh.j0().b() && interfaceC4084vh.j() == null;
            if (!a9) {
                if (!D.H.a(new D.M(context2).f358b)) {
                }
                g(context2, str3, "notifications_disabled");
                return false;
            }
            if (w3) {
                g(context2, str3, "notification_channel_disabled");
                return false;
            }
            if (b9 == null) {
                g(context2, str3, "work_manager_unavailable");
                return false;
            }
            if (z10) {
                g(context2, str3, "ad_no_activity");
                return false;
            }
            if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.B9)).booleanValue()) {
                g(context2, str3, "notification_flow_disabled");
                return false;
            }
            if (interfaceC4084vh.y0() == null || interfaceC4084vh.j() == null) {
                interfaceC4084vh.m0(str3, str);
            } else {
                Activity j6 = interfaceC4084vh.j();
                if (j6 == null) {
                    throw new NullPointerException("Null activity");
                }
                C2787Rp c2787Rp = new C2787Rp(j6, null, str3, str);
                try {
                    AdOverlayInfoParcel adOverlayInfoParcel = interfaceC4084vh.y0().f41115v;
                    if (adOverlayInfoParcel == null || (interfaceC3274ge = adOverlayInfoParcel.f24355O) == null) {
                        throw new v2.h("noioou");
                    }
                    interfaceC3274ge.f0(new Y2.b(c2787Rp));
                } catch (Exception e9) {
                    g(context2, str3, e9.getMessage());
                    return false;
                }
            }
            interfaceC4919a.onAdClicked();
            return true;
        }
        if (c3230fo != null) {
            int i4 = BinderC2903Yp.f29521A;
            BinderC2903Yp.V3(context2, c3230fo, c2821Tp, str3, "onfs", new HashMap());
        }
        return false;
    }

    public final void g(Context context, String str, String str2) {
        C2821Tp c2821Tp = this.f33531x;
        c2821Tp.i(str);
        C3230fo c3230fo = this.f33528u;
        if (c3230fo != null) {
            MA.i("dialog_not_shown_reason", str2);
            BinderC2903Yp.V3(context, c3230fo, c2821Tp, str, "dialog_not_shown", C3793qC.e(1, new Object[]{"dialog_not_shown_reason", str2}, null));
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
    public final void h(InterfaceC4919a interfaceC4919a, Map map, boolean z6, String str, boolean z9, boolean z10) {
        boolean z11;
        Uri build;
        Intent intent;
        ResolveInfo A9;
        Intent intent2;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo A10;
        i(true);
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) interfaceC4919a;
        Context context = interfaceC4084vh.getContext();
        C3464k7 Q02 = interfaceC4084vh.Q0();
        View V8 = interfaceC4084vh.V();
        C3236fu g02 = interfaceC4084vh.g0();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            intent2 = null;
        } else {
            Uri c9 = c(b(context, Q02, Uri.parse(str2), V8, null, g02));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33173v5)).booleanValue()) {
                    z11 = false;
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
                    if (z11) {
                        w2.D d9 = C4906k.f40186C.f40191c;
                        w2.D.L(context, intent3);
                        w2.D.L(context, intent);
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
                                        int i4 = i + 1;
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
            z11 = true;
            if (!"http".equalsIgnoreCase(c9.getScheme())) {
            }
            ArrayList arrayList2 = new ArrayList();
            Intent intent32 = new Intent("android.intent.action.VIEW");
            intent32.addFlags(268435456);
            intent32.setData(c9);
            intent32.setAction("android.intent.action.VIEW");
            if (build != null) {
            }
            if (z11) {
            }
            A9 = SK.A(intent32, arrayList2, context);
            if (A9 == null) {
            }
        }
        if (!z6 || this.f33531x == null || intent2 == null || !f(interfaceC4919a, interfaceC4084vh.getContext(), intent2.getData().toString(), str)) {
            try {
                ((InterfaceC4084vh) interfaceC4919a).v0(new C5101e(intent2, this.f33525B), z9, z10, str);
            } catch (ActivityNotFoundException e9) {
                String message = e9.getMessage();
                int i6 = w2.z.f41712b;
                x2.i.f(message);
            }
        }
    }

    public final void i(boolean z6) {
        C2907Zd c2907Zd = this.f33530w;
        if (c2907Zd != null) {
            c2907Zd.B(z6);
        }
    }

    public final void j(int i) {
        C3230fo c3230fo;
        String str;
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33201y5)).booleanValue() || (c3230fo = this.f33528u) == null) {
            return;
        }
        S0.e a9 = c3230fo.a();
        a9.M(NativeAdvancedJsUtils.f18693p, "cct_action");
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
        a9.M("cct_open_status", str);
        a9.N();
    }
}
