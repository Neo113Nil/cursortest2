package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import r2.C4906k;
import s2.C4949p;

/* renamed from: com.google.android.gms.internal.ads.kl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3495kl implements InterfaceC3765pl, KD, m2.q, Eu, InterfaceC2951ad, InterfaceC3005bd {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32401n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32395u = new C3495kl(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32396v = new C3495kl(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32397w = new C3495kl(3);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32398x = new C3495kl(4);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32399y = new C3495kl(5);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32400z = new C3495kl(6);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32379A = new C3495kl(7);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32380B = new C3495kl(8);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32381C = new C3495kl(9);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32382D = new C3495kl(10);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32383E = new C3495kl(11);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32384F = new C3495kl(12);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32385G = new C3495kl(13);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32386H = new C3495kl(14);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32387I = new C3495kl(15);
    public static final /* synthetic */ C3495kl J = new C3495kl(16);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32388K = new C3495kl(17);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32389L = new C3495kl(18);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32390M = new C3495kl(19);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32391N = new C3495kl(24);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32392O = new C3495kl(25);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32393P = new C3495kl(26);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C3495kl f32394Q = new C3495kl(27);

    public /* synthetic */ C3495kl(int i) {
        this.f32401n = i;
    }

    public static boolean e(Context context) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33046h6)).booleanValue()) {
            Boolean bool = (Boolean) o(new C3538la(context, 3));
            return bool != null && bool.booleanValue();
        }
        int i = w2.z.f41712b;
        x2.i.f("Omid flag is disabled");
        return false;
    }

    public static String f() {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33046h6)).booleanValue()) {
            return "a.1.5.2-google_20241009";
        }
        return null;
    }

    public static C3232fq g(int i, int i4, WebView webView, String str, String str2, String str3) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33046h6)).booleanValue() && MA.f27044E.f27915u) {
            return (C3232fq) o(new C2964aq(i4, i, webView, str, str2, str3));
        }
        return null;
    }

    public static void h(Uv uv) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33046h6)).booleanValue() && MA.f27044E.f27915u) {
            p(new RunnableC2919Zp(uv, 0));
        }
    }

    public static void i(Uv uv, View view) {
        p(new RunnableC3018bq(uv, view, 1));
    }

    public static final Set j(C3660no c3660no, Executor executor) {
        return ((Boolean) AbstractC2772Ra.f27970a.r()).booleanValue() ? Collections.singleton(new C2528Cl(c3660no, executor)) : Collections.EMPTY_SET;
    }

    public static EnumC2970aw k(String str) {
        return com.anythink.expressad.foundation.g.a.f.f19906a.equals(str) ? EnumC2970aw.NATIVE : "javascript".equals(str) ? EnumC2970aw.JAVASCRIPT : EnumC2970aw.NONE;
    }

    public static Yv l(String str) {
        char c9;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c9 = 0;
            }
            c9 = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c9 = 2;
            }
            c9 = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c9 = 1;
            }
            c9 = 65535;
        }
        return c9 != 0 ? c9 != 1 ? c9 != 2 ? Yv.UNSPECIFIED : Yv.ONE_PIXEL : Yv.DEFINED_BY_JAVASCRIPT : Yv.BEGIN_TO_RENDER;
    }

    public static Vv m(String str) {
        char c9;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c9 = 0;
            }
            c9 = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c9 = 1;
            }
            c9 = 65535;
        } else {
            if (str.equals(com.anythink.basead.exoplayer.k.o.f9230a)) {
                c9 = 2;
            }
            c9 = 65535;
        }
        if (c9 == 0) {
            return Vv.HTML_DISPLAY;
        }
        if (c9 == 1) {
            return Vv.NATIVE_DISPLAY;
        }
        if (c9 != 2) {
            return null;
        }
        return Vv.VIDEO;
    }

    public static final Object o(InterfaceC3124dq interfaceC3124dq) {
        try {
            return interfaceC3124dq.mo2c();
        } catch (RuntimeException e9) {
            C4906k.f40186C.f40196h.e("omid exception", e9);
            return null;
        }
    }

    public static final void p(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e9) {
            C4906k.f40186C.f40196h.e("omid exception", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public void mo5a(Object obj) {
        switch (this.f32401n) {
            case 0:
                ((InterfaceC3603ml) obj).E();
                break;
            case 1:
                ((InterfaceC3711ol) obj).t();
                break;
            case 2:
                ((InterfaceC4088vl) obj).G("MalformedJson");
                break;
            case 3:
                ((InterfaceC4088vl) obj).d();
                break;
            case 4:
                ((InterfaceC4088vl) obj).e();
                break;
            case 5:
                ((InterfaceC4142wl) obj).h();
                break;
            case 6:
                ((InterfaceC4142wl) obj).g();
                break;
            case 7:
                ((InterfaceC4250yl) obj).A();
                break;
            case 8:
                ((InterfaceC4250yl) obj).t();
                break;
            case 9:
                ((InterfaceC2511Bl) obj).n();
                break;
            case 10:
                ((InterfaceC2579Fl) obj).L();
                break;
            case 11:
                ((InterfaceC2579Fl) obj).D();
                break;
            case 12:
                C2613Hl c2613Hl = (C2613Hl) obj;
                if (!c2613Hl.f26106d) {
                    c2613Hl.f26104b.a(c2613Hl.f26103a, c2613Hl.f26105c);
                    c2613Hl.f26106d = true;
                    break;
                }
                break;
            case 13:
                ((InterfaceC3863rc) obj).F();
                break;
            case 14:
                ((InterfaceC3863rc) obj).t();
                break;
            case 15:
                ((m2.u) obj).onVideoEnd();
                break;
            case 16:
                ((m2.u) obj).onVideoStart();
                break;
            case 17:
                ((m2.u) obj).onVideoPlay();
                break;
            case 18:
                ((m2.u) obj).onVideoStart();
                break;
            default:
                ((m2.u) obj).onVideoPause();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2951ad
    public /* synthetic */ Object b(JSONObject jSONObject) {
        return new C2776Re(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3005bd
    public JSONObject n(Object obj) {
        C2566Ep c2566Ep = (C2566Ep) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Da)).booleanValue()) {
            C2776Re c2776Re = c2566Ep.f25413c;
            jSONObject2.put("ad_request_url", c2776Re.f27981f);
            jSONObject2.put("ad_request_post_body", c2776Re.f27978c);
        }
        C2776Re c2776Re2 = c2566Ep.f25413c;
        jSONObject2.put("base_url", c2776Re2.f27977b);
        jSONObject2.put("signals", c2566Ep.f25412b);
        C2634Ip c2634Ip = c2566Ep.f25411a;
        jSONObject3.put("body", c2634Ip.f26347c);
        jSONObject3.put("headers", C4949p.f40498g.f40499a.l(c2634Ip.f26346b));
        jSONObject3.put("response_code", c2634Ip.f26345a);
        jSONObject3.put("latency", c2634Ip.f26348d);
        jSONObject.put(com.anythink.core.common.m.b.g.f15312j, jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", c2776Re2.f27983h);
        return jSONObject;
    }

    @Override // m2.q
    public /* synthetic */ void onUserEarnedReward(I2.b bVar) {
        int i = this.f32401n;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public /* synthetic */ void mo10n(Object obj) {
        ((InterfaceC4084vh) obj).destroy();
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public /* synthetic */ Object a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        w2.z.k("Ad request signals:");
        w2.z.k(jSONObject.toString(2));
        return jSONObject;
    }

    private final /* synthetic */ void c(I2.b bVar) {
    }

    private final /* synthetic */ void d(I2.b bVar) {
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
    }
}
