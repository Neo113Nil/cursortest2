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
import p2.C4835j;
import q2.C4920z0;
import q2.InterfaceC4870a;

/* renamed from: com.google.android.gms.internal.ads.Wn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2846Wn implements InterfaceC3312hl, InterfaceC4870a, InterfaceC2524Dk, InterfaceC4226yk, InterfaceC2827Vk {

    /* renamed from: B, reason: collision with root package name */
    public Boolean f28392B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f28396n;

    /* renamed from: u, reason: collision with root package name */
    public final C3427ju f28397u;

    /* renamed from: v, reason: collision with root package name */
    public final C3153eo f28398v;

    /* renamed from: w, reason: collision with root package name */
    public final Yt f28399w;

    /* renamed from: x, reason: collision with root package name */
    public final St f28400x;

    /* renamed from: y, reason: collision with root package name */
    public final C2800Tp f28401y;

    /* renamed from: z, reason: collision with root package name */
    public final String f28402z;

    /* renamed from: A, reason: collision with root package name */
    public long f28391A = -1;

    /* renamed from: D, reason: collision with root package name */
    public final AtomicBoolean f28394D = new AtomicBoolean(false);

    /* renamed from: E, reason: collision with root package name */
    public final AtomicBoolean f28395E = new AtomicBoolean(false);

    /* renamed from: C, reason: collision with root package name */
    public final boolean f28393C = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32053J7)).booleanValue();

    public C2846Wn(Context context, C3427ju c3427ju, C3153eo c3153eo, Yt yt, St st, C2800Tp c2800Tp, String str) {
        this.f28396n = context;
        this.f28397u = c3427ju;
        this.f28398v = c3153eo;
        this.f28399w = yt;
        this.f28400x = st;
        this.f28401y = c2800Tp;
        this.f28402z = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4226yk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(C4920z0 c4920z0) {
        String str;
        C4920z0 c4920z02;
        if (this.f28393C) {
            S0.e b9 = b("ifts");
            b9.v("reason", "adapter");
            int i = c4920z0.f40213n;
            if (c4920z0.f40215v.equals("com.google.android.gms.ads") && (c4920z02 = c4920z0.f40216w) != null && !c4920z02.f40215v.equals("com.google.android.gms.ads")) {
                c4920z0 = c4920z0.f40216w;
                i = c4920z0.f40213n;
            }
            String str2 = c4920z0.f40214u;
            if (i >= 0) {
                b9.v("arec", String.valueOf(i));
            }
            Pattern pattern = this.f28397u.f31344a;
            if (pattern != null && str2 != null) {
                Matcher matcher = pattern.matcher(str2);
                if (matcher.find()) {
                    str = matcher.group();
                    if (str != null) {
                        b9.v("areec", str);
                    }
                    b9.y();
                }
            }
            str = null;
            if (str != null) {
            }
            b9.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4226yk
    public final void L(C2828Vl c2828Vl) {
        if (this.f28393C) {
            S0.e b9 = b("ifts");
            b9.v("reason", com.anythink.expressad.foundation.d.g.i);
            if (!TextUtils.isEmpty(c2828Vl.getMessage())) {
                b9.v(com.anythink.expressad.foundation.g.a.f19093q, c2828Vl.getMessage());
            }
            b9.y();
        }
    }

    public final boolean a() {
        String str;
        if (this.f28392B == null) {
            synchronized (this) {
                if (this.f28392B == null) {
                    String str2 = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32195a2);
                    u2.D d2 = C4835j.f39733C.f39738c;
                    try {
                        str = u2.D.M(this.f28396n);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z3 = false;
                    if (str2 != null && str != null) {
                        try {
                            z3 = Pattern.matches(str2, str);
                        } catch (RuntimeException e9) {
                            C4835j.f39733C.f39743h.d("CsiActionsListener.isPatternMatched", e9);
                        }
                    }
                    this.f28392B = Boolean.valueOf(z3);
                }
            }
        }
        return this.f28392B.booleanValue();
    }

    public final S0.e b(String str) {
        Yt yt = this.f28399w;
        C2570Gf c2570Gf = yt.f28754b;
        S0.e a9 = this.f28398v.a();
        a9.v("gqi", ((Ut) c2570Gf.f25043v).f28004b);
        St st = this.f28400x;
        a9.s(st);
        a9.v(NativeAdvancedJsUtils.f17906p, str);
        a9.v(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, this.f28402z.toUpperCase(Locale.ROOT));
        List list = st.f27642t;
        if (!list.isEmpty()) {
            a9.v("ancn", (String) list.get(0));
        }
        if (st.b()) {
            C4835j c4835j = C4835j.f39733C;
            a9.v("device_connectivity", true != c4835j.f39743h.i(this.f28396n) ? "offline" : "online");
            c4835j.f39745k.getClass();
            a9.v("event_timestamp", String.valueOf(System.currentTimeMillis()));
            a9.v("offline_ad", "1");
        }
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32113Q7)).booleanValue()) {
            C3534lt c3534lt = yt.f28753a;
            boolean z3 = com.bumptech.glide.d.q((C3052cu) c3534lt.f31863u) != 1;
            a9.v("scar", String.valueOf(z3));
            if (z3) {
                q2.c1 c1Var = ((C3052cu) c3534lt.f31863u).f29623d;
                a9.v("ragent", c1Var.f40105I);
                a9.v("rtype", com.bumptech.glide.d.m(com.bumptech.glide.d.n(c1Var)));
            }
        }
        return a9;
    }

    public final void c(S0.e eVar) {
        if (!this.f28400x.b()) {
            eVar.y();
            return;
        }
        C3315ho c3315ho = ((C3153eo) eVar.f2782v).f29975a;
        String a9 = c3315ho.f30945f.a((ConcurrentHashMap) eVar.f2781u);
        C4835j.f39733C.f39745k.getClass();
        C3709p5 c3709p5 = new C3709p5(((Ut) this.f28399w.f28754b.f25043v).f28004b, a9, 2, System.currentTimeMillis());
        C2800Tp c2800Tp = this.f28401y;
        c2800Tp.getClass();
        c2800Tp.a(new S0.l(14, c2800Tp, c3709p5));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4226yk
    public final void d() {
        if (this.f28393C) {
            S0.e b9 = b("ifts");
            b9.v("reason", "blocked");
            b9.y();
        }
    }

    public final boolean e() {
        int i = this.f28400x.f27608b;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2827Vk
    public final void k() {
        if (a()) {
            this.f28395E.set(true);
            C4835j c4835j = C4835j.f39733C;
            c4835j.f39745k.getClass();
            this.f28391A = System.currentTimeMillis();
            S0.e b9 = b("presentation");
            C3301ha c3301ha = AbstractC3569ma.ff;
            q2.r rVar = q2.r.f40207e;
            if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && e()) {
                AtomicBoolean atomicBoolean = this.f28394D;
                atomicBoolean.set(!u2.D.g(this.f28396n));
                b9.v("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) rVar.f40210c.a(AbstractC3569ma.gf)).booleanValue() && e()) {
                b9.v("fg_al", true != c4835j.f39742g.p() ? "0" : "1");
            }
            b9.y();
        }
    }

    @Override // q2.InterfaceC4870a
    public final void onAdClicked() {
        if (this.f28400x.b()) {
            c(b("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3312hl
    public final void s() {
        if (a()) {
            S0.e b9 = b("adapter_impression");
            b9.v("imp_type", String.valueOf(this.f28400x.f27614e));
            if (this.f28395E.get()) {
                b9.v("po", "1");
                C4835j.f39733C.f39745k.getClass();
                b9.v("pil", String.valueOf(System.currentTimeMillis() - this.f28391A));
            } else {
                b9.v("po", "0");
            }
            C3301ha c3301ha = AbstractC3569ma.ff;
            q2.r rVar = q2.r.f40207e;
            if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && e()) {
                u2.D d2 = C4835j.f39733C.f39738c;
                b9.v("foreground", true != u2.D.g(this.f28396n) ? "1" : "0");
                b9.v("fg_show", true != this.f28394D.get() ? "0" : "1");
            }
            if (((Boolean) rVar.f40210c.a(AbstractC3569ma.gf)).booleanValue() && e()) {
                b9.v("fg_al", true == C4835j.f39733C.f39742g.p() ? "1" : "0");
            }
            b9.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3312hl
    public final void v() {
        if (a()) {
            b("adapter_shown").y();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
    public final void w() {
        boolean a9 = a();
        St st = this.f28400x;
        if (a9 || st.b()) {
            S0.e b9 = b("impression");
            b9.v("imp_type", String.valueOf(st.f27614e));
            if (this.f28391A > 0) {
                C4835j.f39733C.f39745k.getClass();
                b9.v("p_imp_l", String.valueOf(System.currentTimeMillis() - this.f28391A));
            }
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.ff)).booleanValue() && e()) {
                u2.D d2 = C4835j.f39733C.f39738c;
                b9.v("foreground", true != u2.D.g(this.f28396n) ? "1" : "0");
                b9.v("fg_show", true == this.f28394D.get() ? "1" : "0");
            }
            c(b9);
        }
    }
}
