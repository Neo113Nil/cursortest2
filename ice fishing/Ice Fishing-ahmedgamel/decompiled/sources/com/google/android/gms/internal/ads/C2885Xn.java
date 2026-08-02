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
import r2.C4906k;
import s2.C4969z0;
import s2.InterfaceC4919a;

/* renamed from: com.google.android.gms.internal.ads.Xn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2885Xn implements InterfaceC3335hl, InterfaceC4919a, InterfaceC2544Dk, InterfaceC4249yk, InterfaceC2850Vk {

    /* renamed from: B, reason: collision with root package name */
    public Boolean f29345B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f29349n;

    /* renamed from: u, reason: collision with root package name */
    public final C3450ju f29350u;

    /* renamed from: v, reason: collision with root package name */
    public final C3230fo f29351v;

    /* renamed from: w, reason: collision with root package name */
    public final Yt f29352w;

    /* renamed from: x, reason: collision with root package name */
    public final St f29353x;

    /* renamed from: y, reason: collision with root package name */
    public final C2821Tp f29354y;

    /* renamed from: z, reason: collision with root package name */
    public final String f29355z;

    /* renamed from: A, reason: collision with root package name */
    public long f29344A = -1;

    /* renamed from: D, reason: collision with root package name */
    public final AtomicBoolean f29347D = new AtomicBoolean(false);

    /* renamed from: E, reason: collision with root package name */
    public final AtomicBoolean f29348E = new AtomicBoolean(false);

    /* renamed from: C, reason: collision with root package name */
    public final boolean f29346C = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32833J7)).booleanValue();

    public C2885Xn(Context context, C3450ju c3450ju, C3230fo c3230fo, Yt yt, St st, C2821Tp c2821Tp, String str) {
        this.f29349n = context;
        this.f29350u = c3450ju;
        this.f29351v = c3230fo;
        this.f29352w = yt;
        this.f29353x = st;
        this.f29354y = c2821Tp;
        this.f29355z = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4249yk
    public final void K(C2867Wl c2867Wl) {
        if (this.f29346C) {
            S0.e b9 = b("ifts");
            b9.M("reason", com.anythink.expressad.foundation.d.g.i);
            if (!TextUtils.isEmpty(c2867Wl.getMessage())) {
                b9.M(com.anythink.expressad.foundation.g.a.f19880q, c2867Wl.getMessage());
            }
            b9.N();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4249yk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(C4969z0 c4969z0) {
        String str;
        C4969z0 c4969z02;
        if (this.f29346C) {
            S0.e b9 = b("ifts");
            b9.M("reason", "adapter");
            int i = c4969z0.f40512n;
            if (c4969z0.f40514v.equals("com.google.android.gms.ads") && (c4969z02 = c4969z0.f40515w) != null && !c4969z02.f40514v.equals("com.google.android.gms.ads")) {
                c4969z0 = c4969z0.f40515w;
                i = c4969z0.f40512n;
            }
            String str2 = c4969z0.f40513u;
            if (i >= 0) {
                b9.M("arec", String.valueOf(i));
            }
            Pattern pattern = this.f29350u.f32123a;
            if (pattern != null && str2 != null) {
                Matcher matcher = pattern.matcher(str2);
                if (matcher.find()) {
                    str = matcher.group();
                    if (str != null) {
                        b9.M("areec", str);
                    }
                    b9.N();
                }
            }
            str = null;
            if (str != null) {
            }
            b9.N();
        }
    }

    public final boolean a() {
        String str;
        if (this.f29345B == null) {
            synchronized (this) {
                if (this.f29345B == null) {
                    String str2 = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32974a2);
                    w2.D d9 = C4906k.f40186C.f40191c;
                    try {
                        str = w2.D.M(this.f29349n);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z6 = false;
                    if (str2 != null && str != null) {
                        try {
                            z6 = Pattern.matches(str2, str);
                        } catch (RuntimeException e9) {
                            C4906k.f40186C.f40196h.d("CsiActionsListener.isPatternMatched", e9);
                        }
                    }
                    this.f29345B = Boolean.valueOf(z6);
                }
            }
        }
        return this.f29345B.booleanValue();
    }

    public final S0.e b(String str) {
        Yt yt = this.f29352w;
        C2590Gf c2590Gf = yt.f29533b;
        S0.e a9 = this.f29351v.a();
        a9.M("gqi", ((Ut) c2590Gf.f25831v).f28801b);
        St st = this.f29353x;
        a9.I(st);
        a9.M(NativeAdvancedJsUtils.f18693p, str);
        a9.M(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, this.f29355z.toUpperCase(Locale.ROOT));
        List list = st.f28425t;
        if (!list.isEmpty()) {
            a9.M("ancn", (String) list.get(0));
        }
        if (st.b()) {
            C4906k c4906k = C4906k.f40186C;
            a9.M("device_connectivity", true != c4906k.f40196h.i(this.f29349n) ? "offline" : "online");
            c4906k.f40198k.getClass();
            a9.M("event_timestamp", String.valueOf(System.currentTimeMillis()));
            a9.M("offline_ad", "1");
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32893Q7)).booleanValue()) {
            C3557lt c3557lt = yt.f29532a;
            boolean z6 = t8.g.B((C3075cu) c3557lt.f32643u) != 1;
            a9.M("scar", String.valueOf(z6));
            if (z6) {
                s2.c1 c1Var = ((C3075cu) c3557lt.f32643u).f30393d;
                a9.M("ragent", c1Var.f40404I);
                a9.M("rtype", t8.g.s(t8.g.u(c1Var)));
            }
        }
        return a9;
    }

    public final void c(S0.e eVar) {
        if (!this.f29353x.b()) {
            eVar.N();
            return;
        }
        C3391io c3391io = ((C3230fo) eVar.f2909v).f31215a;
        String a9 = c3391io.f31902f.a((ConcurrentHashMap) eVar.f2908u);
        C4906k.f40186C.f40198k.getClass();
        C3732p5 c3732p5 = new C3732p5(((Ut) this.f29352w.f29533b.f25831v).f28801b, a9, 2, System.currentTimeMillis());
        C2821Tp c2821Tp = this.f29354y;
        c2821Tp.getClass();
        c2821Tp.a(new S0.l(17, c2821Tp, c3732p5));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4249yk
    public final void d() {
        if (this.f29346C) {
            S0.e b9 = b("ifts");
            b9.M("reason", "blocked");
            b9.N();
        }
    }

    public final boolean e() {
        int i = this.f29353x.f28391b;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2850Vk
    public final void k() {
        if (a()) {
            this.f29348E.set(true);
            C4906k c4906k = C4906k.f40186C;
            c4906k.f40198k.getClass();
            this.f29344A = System.currentTimeMillis();
            S0.e b9 = b("presentation");
            C3324ha c3324ha = AbstractC3592ma.ff;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && e()) {
                AtomicBoolean atomicBoolean = this.f29347D;
                atomicBoolean.set(!w2.D.g(this.f29349n));
                b9.M("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.gf)).booleanValue() && e()) {
                b9.M("fg_al", true != c4906k.f40195g.p() ? "0" : "1");
            }
            b9.N();
        }
    }

    @Override // s2.InterfaceC4919a
    public final void onAdClicked() {
        if (this.f29353x.b()) {
            c(b("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335hl
    public final void s() {
        if (a()) {
            S0.e b9 = b("adapter_impression");
            b9.M("imp_type", String.valueOf(this.f29353x.f28397e));
            if (this.f29348E.get()) {
                b9.M("po", "1");
                C4906k.f40186C.f40198k.getClass();
                b9.M("pil", String.valueOf(System.currentTimeMillis() - this.f29344A));
            } else {
                b9.M("po", "0");
            }
            C3324ha c3324ha = AbstractC3592ma.ff;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && e()) {
                w2.D d9 = C4906k.f40186C.f40191c;
                b9.M("foreground", true != w2.D.g(this.f29349n) ? "1" : "0");
                b9.M("fg_show", true != this.f29347D.get() ? "0" : "1");
            }
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.gf)).booleanValue() && e()) {
                b9.M("fg_al", true == C4906k.f40186C.f40195g.p() ? "1" : "0");
            }
            b9.N();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2544Dk
    public final void v() {
        boolean a9 = a();
        St st = this.f29353x;
        if (a9 || st.b()) {
            S0.e b9 = b("impression");
            b9.M("imp_type", String.valueOf(st.f28397e));
            if (this.f29344A > 0) {
                C4906k.f40186C.f40198k.getClass();
                b9.M("p_imp_l", String.valueOf(System.currentTimeMillis() - this.f29344A));
            }
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ff)).booleanValue() && e()) {
                w2.D d9 = C4906k.f40186C.f40191c;
                b9.M("foreground", true != w2.D.g(this.f29349n) ? "1" : "0");
                b9.M("fg_show", true == this.f29347D.get() ? "1" : "0");
            }
            c(b9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335hl
    public final void w() {
        if (a()) {
            b("adapter_shown").N();
        }
    }
}
