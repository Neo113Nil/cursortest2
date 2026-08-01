package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p2.C4835j;
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.kl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3472kl implements InterfaceC3742pl, KD, k2.q, Eu, InterfaceC2928ad, InterfaceC2982bd {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31624n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31618u = new C3472kl(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31619v = new C3472kl(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31620w = new C3472kl(3);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31621x = new C3472kl(4);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31622y = new C3472kl(5);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31623z = new C3472kl(6);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31602A = new C3472kl(7);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31603B = new C3472kl(8);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31604C = new C3472kl(9);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31605D = new C3472kl(10);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31606E = new C3472kl(11);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31607F = new C3472kl(12);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31608G = new C3472kl(13);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31609H = new C3472kl(14);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31610I = new C3472kl(15);
    public static final /* synthetic */ C3472kl J = new C3472kl(16);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31611K = new C3472kl(17);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31612L = new C3472kl(18);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31613M = new C3472kl(19);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31614N = new C3472kl(24);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31615O = new C3472kl(25);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31616P = new C3472kl(26);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C3472kl f31617Q = new C3472kl(27);

    public /* synthetic */ C3472kl(int i) {
        this.f31624n = i;
    }

    public static boolean e(Context context) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32266h6)).booleanValue()) {
            Boolean bool = (Boolean) o(new C3515la(context, 3));
            return bool != null && bool.booleanValue();
        }
        int i = u2.z.f41322b;
        v2.i.f("Omid flag is disabled");
        return false;
    }

    public static String f() {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32266h6)).booleanValue()) {
            return "a.1.5.2-google_20241009";
        }
        return null;
    }

    public static C3209fq g(int i, int i6, WebView webView, String str, String str2, String str3) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32266h6)).booleanValue() && MA.f26253E.f27159u) {
            return (C3209fq) o(new C2941aq(i6, i, webView, str, str2, str3));
        }
        return null;
    }

    public static void h(Uv uv) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32266h6)).booleanValue() && MA.f26253E.f27159u) {
            p(new RunnableC2896Zp(uv, 0));
        }
    }

    public static void i(Uv uv, View view) {
        p(new RunnableC2995bq(uv, view, 1));
    }

    public static final Set j(C3583mo c3583mo, Executor executor) {
        return ((Boolean) AbstractC2752Ra.f27286a.r()).booleanValue() ? Collections.singleton(new C2491Bl(c3583mo, executor)) : Collections.EMPTY_SET;
    }

    public static Zv k(String str) {
        return com.anythink.expressad.foundation.g.a.f.f19119a.equals(str) ? Zv.NATIVE : "javascript".equals(str) ? Zv.JAVASCRIPT : Zv.NONE;
    }

    public static Xv l(String str) {
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
        return c9 != 0 ? c9 != 1 ? c9 != 2 ? Xv.UNSPECIFIED : Xv.ONE_PIXEL : Xv.DEFINED_BY_JAVASCRIPT : Xv.BEGIN_TO_RENDER;
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
            if (str.equals(com.anythink.basead.exoplayer.k.o.f8444a)) {
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

    public static final Object o(InterfaceC3101dq interfaceC3101dq) {
        try {
            return interfaceC3101dq.mo3c();
        } catch (RuntimeException e9) {
            C4835j.f39733C.f39743h.e("omid exception", e9);
            return null;
        }
    }

    public static final void p(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e9) {
            C4835j.f39733C.f39743h.e("omid exception", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public void mo1a(Object obj) {
        switch (this.f31624n) {
            case 0:
                ((InterfaceC3580ml) obj).E();
                break;
            case 1:
                ((InterfaceC3688ol) obj).t();
                break;
            case 2:
                ((InterfaceC4011ul) obj).H("MalformedJson");
                break;
            case 3:
                ((InterfaceC4011ul) obj).d();
                break;
            case 4:
                ((InterfaceC4011ul) obj).e();
                break;
            case 5:
                ((InterfaceC4065vl) obj).h();
                break;
            case 6:
                ((InterfaceC4065vl) obj).g();
                break;
            case 7:
                ((InterfaceC4173xl) obj).A();
                break;
            case 8:
                ((InterfaceC4173xl) obj).t();
                break;
            case 9:
                ((InterfaceC2474Al) obj).n();
                break;
            case 10:
                ((InterfaceC2542El) obj).M();
                break;
            case 11:
                ((InterfaceC2542El) obj).J();
                break;
            case 12:
                C2576Gl c2576Gl = (C2576Gl) obj;
                if (!c2576Gl.f25105d) {
                    c2576Gl.f25103b.a(c2576Gl.f25102a, c2576Gl.f25104c);
                    c2576Gl.f25105d = true;
                    break;
                }
                break;
            case 13:
                ((InterfaceC3840rc) obj).F();
                break;
            case 14:
                ((InterfaceC3840rc) obj).t();
                break;
            case 15:
                ((k2.u) obj).onVideoEnd();
                break;
            case 16:
                ((k2.u) obj).onVideoStart();
                break;
            case 17:
                ((k2.u) obj).onVideoPlay();
                break;
            case 18:
                ((k2.u) obj).onVideoStart();
                break;
            default:
                ((k2.u) obj).onVideoPause();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2928ad
    public /* synthetic */ Object b(JSONObject jSONObject) {
        return new C2756Re(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bd
    public JSONObject n(Object obj) {
        C2546Ep c2546Ep = (C2546Ep) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Da)).booleanValue()) {
            C2756Re c2756Re = c2546Ep.f24657c;
            jSONObject2.put("ad_request_url", c2756Re.f27297f);
            jSONObject2.put("ad_request_post_body", c2756Re.f27294c);
        }
        C2756Re c2756Re2 = c2546Ep.f24657c;
        jSONObject2.put("base_url", c2756Re2.f27293b);
        jSONObject2.put("signals", c2546Ep.f24656b);
        C2614Ip c2614Ip = c2546Ep.f24655a;
        jSONObject3.put("body", c2614Ip.f25594c);
        jSONObject3.put("headers", C4900p.f40199g.f40200a.l(c2614Ip.f25593b));
        jSONObject3.put("response_code", c2614Ip.f25592a);
        jSONObject3.put("latency", c2614Ip.f25595d);
        jSONObject.put(com.anythink.core.common.m.b.g.f14526j, jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", c2756Re2.f27299h);
        return jSONObject;
    }

    @Override // k2.q
    public /* synthetic */ void onUserEarnedReward(G2.b bVar) {
        int i = this.f31624n;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public /* synthetic */ void mo11n(Object obj) {
        ((InterfaceC4061vh) obj).destroy();
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public /* synthetic */ Object a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        u2.z.k("Ad request signals:");
        u2.z.k(jSONObject.toString(2));
        return jSONObject;
    }

    private final /* synthetic */ void c(G2.b bVar) {
    }

    private final /* synthetic */ void d(G2.b bVar) {
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
    }
}
