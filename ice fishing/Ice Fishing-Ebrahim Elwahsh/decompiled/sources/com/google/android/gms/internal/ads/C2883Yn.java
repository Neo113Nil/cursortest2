package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q2.C4927z0;
import q2.InterfaceC4877a;

/* renamed from: com.google.android.gms.internal.ads.Yn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2883Yn implements InterfaceC3271gl, InterfaceC4877a, InterfaceC2506Ck, InterfaceC4185xk, InterfaceC2795Tk {

    /* renamed from: B, reason: collision with root package name */
    public Boolean f28873B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f28877n;

    /* renamed from: u, reason: collision with root package name */
    public final C3494ku f28878u;

    /* renamed from: v, reason: collision with root package name */
    public final C3165eo f28879v;

    /* renamed from: w, reason: collision with root package name */
    public final C2953au f28880w;

    /* renamed from: x, reason: collision with root package name */
    public final Ut f28881x;

    /* renamed from: y, reason: collision with root package name */
    public final C2834Vp f28882y;

    /* renamed from: z, reason: collision with root package name */
    public final String f28883z;

    /* renamed from: A, reason: collision with root package name */
    public long f28872A = -1;

    /* renamed from: D, reason: collision with root package name */
    public final AtomicBoolean f28875D = new AtomicBoolean(false);

    /* renamed from: E, reason: collision with root package name */
    public final AtomicBoolean f28876E = new AtomicBoolean(false);

    /* renamed from: C, reason: collision with root package name */
    public final boolean f28874C = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31472J7)).booleanValue();

    public C2883Yn(Context context, C3494ku c3494ku, C3165eo c3165eo, C2953au c2953au, Ut ut, C2834Vp c2834Vp, String str) {
        this.f28877n = context;
        this.f28878u = c3494ku;
        this.f28879v = c3165eo;
        this.f28880w = c2953au;
        this.f28881x = ut;
        this.f28882y = c2834Vp;
        this.f28883z = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4185xk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(C4927z0 c4927z0) {
        String str;
        C4927z0 c4927z02;
        if (this.f28874C) {
            C2593Hm b9 = b("ifts");
            b9.r("reason", "adapter");
            int i = c4927z0.f40122n;
            if (c4927z0.f40124v.equals("com.google.android.gms.ads") && (c4927z02 = c4927z0.f40125w) != null && !c4927z02.f40124v.equals("com.google.android.gms.ads")) {
                c4927z0 = c4927z0.f40125w;
                i = c4927z0.f40122n;
            }
            String str2 = c4927z0.f40123u;
            if (i >= 0) {
                b9.r("arec", String.valueOf(i));
            }
            Pattern pattern = this.f28878u.f32485a;
            if (pattern != null && str2 != null) {
                Matcher matcher = pattern.matcher(str2);
                if (matcher.find()) {
                    str = matcher.group();
                    if (str != null) {
                        b9.r("areec", str);
                    }
                    b9.s();
                }
            }
            str = null;
            if (str != null) {
            }
            b9.s();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4185xk
    public final void V(C2762Rl c2762Rl) {
        if (this.f28874C) {
            C2593Hm b9 = b("ifts");
            b9.r("reason", com.anythink.expressad.foundation.d.g.i);
            if (!TextUtils.isEmpty(c2762Rl.getMessage())) {
                b9.r(com.anythink.expressad.foundation.g.a.f19251q, c2762Rl.getMessage());
            }
            b9.s();
        }
    }

    public final boolean a() {
        String str;
        if (this.f28873B == null) {
            synchronized (this) {
                if (this.f28873B == null) {
                    String str2 = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31616a2);
                    t2.G g9 = p2.j.f39798C.f39803c;
                    try {
                        str = t2.G.M(this.f28877n);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z8 = false;
                    if (str2 != null && str != null) {
                        try {
                            z8 = Pattern.matches(str2, str);
                        } catch (RuntimeException e6) {
                            p2.j.f39798C.f39808h.d("CsiActionsListener.isPatternMatched", e6);
                        }
                    }
                    this.f28873B = Boolean.valueOf(z8);
                }
            }
        }
        return this.f28873B.booleanValue();
    }

    public final C2593Hm b(String str) {
        C2953au c2953au = this.f28880w;
        C2518Df c2518Df = c2953au.f29349b;
        C2593Hm a9 = this.f28879v.a();
        a9.r("gqi", ((Wt) c2518Df.f24454v).f28491b);
        Ut ut = this.f28881x;
        a9.i(ut);
        a9.r(NativeAdvancedJsUtils.f18064p, str);
        a9.r(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, this.f28883z.toUpperCase(Locale.ROOT));
        List list = ut.f28175t;
        if (!list.isEmpty()) {
            a9.r("ancn", (String) list.get(0));
        }
        if (ut.b()) {
            p2.j jVar = p2.j.f39798C;
            a9.r("device_connectivity", true != jVar.f39808h.i(this.f28877n) ? "offline" : "online");
            jVar.f39810k.getClass();
            a9.r("event_timestamp", String.valueOf(System.currentTimeMillis()));
            a9.r("offline_ad", "1");
        }
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31533Q7)).booleanValue()) {
            Mt mt = c2953au.f29348a;
            boolean z8 = K3.b.M((C3226fu) mt.f26393u) != 1;
            a9.r("scar", String.valueOf(z8));
            if (z8) {
                q2.d1 d1Var = ((C3226fu) mt.f26393u).f30901d;
                a9.r("ragent", d1Var.f40016I);
                a9.r("rtype", K3.b.I(K3.b.J(d1Var)));
            }
        }
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4185xk
    public final void c() {
        if (this.f28874C) {
            C2593Hm b9 = b("ifts");
            b9.r("reason", "blocked");
            b9.s();
        }
    }

    public final void d(C2593Hm c2593Hm) {
        if (!this.f28881x.b()) {
            c2593Hm.s();
            return;
        }
        C3381io c3381io = ((C3165eo) c2593Hm.f25416u).f30506a;
        String a9 = c3381io.f32003f.a((ConcurrentHashMap) c2593Hm.f25417v);
        p2.j.f39798C.f39810k.getClass();
        C3614n5 c3614n5 = new C3614n5(((Wt) this.f28880w.f29349b.f24454v).f28491b, a9, 2, System.currentTimeMillis());
        C2834Vp c2834Vp = this.f28882y;
        c2834Vp.getClass();
        c2834Vp.a(new C2593Hm(9, c2834Vp, c3614n5));
    }

    public final boolean e() {
        int i = this.f28881x.f28141b;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2795Tk
    public final void j() {
        if (a()) {
            this.f28876E.set(true);
            p2.j jVar = p2.j.f39798C;
            jVar.f39810k.getClass();
            this.f28872A = System.currentTimeMillis();
            C2593Hm b9 = b("presentation");
            C3151ea c3151ea = AbstractC3368ia.Ze;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && e()) {
                AtomicBoolean atomicBoolean = this.f28875D;
                atomicBoolean.set(!t2.G.g(this.f28877n));
                b9.r("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.af)).booleanValue() && e()) {
                b9.r("fg_al", true != jVar.f39807g.p() ? "0" : "1");
            }
            b9.s();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3271gl
    public final void o() {
        if (a()) {
            C2593Hm b9 = b("adapter_impression");
            b9.r("imp_type", String.valueOf(this.f28881x.f28147e));
            if (this.f28876E.get()) {
                b9.r("po", "1");
                p2.j.f39798C.f39810k.getClass();
                b9.r("pil", String.valueOf(System.currentTimeMillis() - this.f28872A));
            } else {
                b9.r("po", "0");
            }
            C3151ea c3151ea = AbstractC3368ia.Ze;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && e()) {
                t2.G g9 = p2.j.f39798C.f39803c;
                b9.r("foreground", true != t2.G.g(this.f28877n) ? "1" : "0");
                b9.r("fg_show", true != this.f28875D.get() ? "0" : "1");
            }
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.af)).booleanValue() && e()) {
                b9.r("fg_al", true == p2.j.f39798C.f39807g.p() ? "1" : "0");
            }
            b9.s();
        }
    }

    @Override // q2.InterfaceC4877a
    public final void onAdClicked() {
        if (this.f28881x.b()) {
            d(b("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3271gl
    public final void t() {
        if (a()) {
            b("adapter_shown").s();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
    public final void y() {
        boolean a9 = a();
        Ut ut = this.f28881x;
        if (a9 || ut.b()) {
            C2593Hm b9 = b("impression");
            b9.r("imp_type", String.valueOf(ut.f28147e));
            if (this.f28872A > 0) {
                p2.j.f39798C.f39810k.getClass();
                b9.r("p_imp_l", String.valueOf(System.currentTimeMillis() - this.f28872A));
            }
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ze)).booleanValue() && e()) {
                t2.G g9 = p2.j.f39798C.f39803c;
                b9.r("foreground", true != t2.G.g(this.f28877n) ? "1" : "0");
                b9.r("fg_show", true == this.f28875D.get() ? "1" : "0");
            }
            d(b9);
        }
    }
}
