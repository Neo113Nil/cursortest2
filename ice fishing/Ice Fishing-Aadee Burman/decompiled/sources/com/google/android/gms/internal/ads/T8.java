package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import p2.InterfaceC4829d;
import q2.C4900p;

/* loaded from: classes2.dex */
public final class T8 implements InterfaceC4829d, At {

    /* renamed from: n, reason: collision with root package name */
    public Object f27695n;

    /* renamed from: u, reason: collision with root package name */
    public Object f27696u;

    /* renamed from: v, reason: collision with root package name */
    public Object f27697v;

    /* renamed from: w, reason: collision with root package name */
    public Object f27698w;

    /* renamed from: x, reason: collision with root package name */
    public Object f27699x;

    /* renamed from: y, reason: collision with root package name */
    public Object f27700y;

    public T8(S0.c cVar, C4274ze c4274ze, C3918t c3918t, String str, RD rd) {
        this.f27695n = cVar;
        this.f27696u = c4274ze;
        this.f27697v = c3918t;
        this.f27698w = str;
        this.f27700y = rd;
    }

    public static C3676oQ v(C4051vO c4051vO, RB rb, C3676oQ c3676oQ, K7 k72) {
        AbstractC3604n8 F12 = c4051vO.F1();
        c4051vO.f34696w.b();
        int k22 = c4051vO.f34695v.k2();
        Object f3 = F12.g() ? null : F12.f(k22);
        if (!c4051vO.W1() && !F12.g()) {
            K7 d2 = F12.d(k22, k72, false);
            c4051vO.U1();
            String str = AbstractC3159eu.f29993a;
            d2.getClass();
        }
        for (int i = 0; i < rb.size(); i++) {
            C3676oQ c3676oQ2 = (C3676oQ) rb.get(i);
            if (x(c3676oQ2, f3, c4051vO.W1(), c4051vO.p0(), c4051vO.X1())) {
                return c3676oQ2;
            }
        }
        if (rb.isEmpty() && c3676oQ != null && x(c3676oQ, f3, c4051vO.W1(), c4051vO.p0(), c4051vO.X1())) {
            return c3676oQ;
        }
        return null;
    }

    public static boolean x(C3676oQ c3676oQ, Object obj, boolean z3, int i, int i6) {
        if (!c3676oQ.f32905a.equals(obj)) {
            return false;
        }
        int i9 = c3676oQ.f32906b;
        return z3 ? i9 == i && c3676oQ.f32907c == i6 : i9 == -1 && c3676oQ.f32909e == -1;
    }

    public String a() {
        String str = (String) q2.r.f40204e.f40207c.a(AbstractC3569ma.sb);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) this.f27695n);
            jSONObject.put("eventCategory", (String) this.f27696u);
            jSONObject.putOpt("event", (String) this.f27697v);
            jSONObject.putOpt("errorCode", (Integer) this.f27698w);
            jSONObject.putOpt("rewardType", (String) this.f27699x);
            jSONObject.putOpt("rewardAmount", (Integer) this.f27700y);
        } catch (JSONException unused) {
            int i = u2.z.f41319b;
            v2.i.f("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        int length = String.valueOf(str).length();
        return com.anythink.basead.exoplayer.f.f.o(new StringBuilder(String.valueOf(jSONObject2).length() + length + 14 + 2), str, "(\"h5adsEvent\",", jSONObject2, ");");
    }

    public void b(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f27695n = Integer.valueOf(i);
    }

    public void c(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f27697v) {
            try {
                if (((Context) this.f27699x) != null) {
                    return;
                }
                this.f27699x = context.getApplicationContext();
                C3301ha c3301ha = AbstractC3569ma.f32246f5;
                q2.r rVar = q2.r.f40204e;
                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                    w();
                } else {
                    if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32237e5)).booleanValue()) {
                        C4835j.f39730C.f39739g.i(new S8(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean d(q2.c1 c1Var, String str, AbstractC2772Sd abstractC2772Sd, Ir ir) {
        Vu vu;
        final int i = 1;
        final int i6 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        C3301ha c3301ha = AbstractC3569ma.f32235e3;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            C4900p.a();
        }
        C4835j c4835j = C4835j.f39730C;
        u2.D d2 = c4835j.f39735c;
        Context context = (Context) this.f27699x;
        boolean h9 = u2.D.h(context);
        C3309hi c3309hi = (C3309hi) this.f27696u;
        if (h9 && c1Var.f40104L == null) {
            int i9 = u2.z.f41319b;
            v2.i.c("Failed to load the ad because app ID is missing.");
            c3309hi.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Kr

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ T8 f25980u;

                {
                    this.f25980u = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            C3481ku c3481ku = (C3481ku) this.f25980u.f27697v;
                            ((Hr) c3481ku.f31665w).v(SK.F(6, null, null));
                            break;
                        default:
                            C3481ku c3481ku2 = (C3481ku) this.f25980u.f27697v;
                            ((Hr) c3481ku2.f31665w).v(SK.F(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        if (str == null) {
            int i10 = u2.z.f41319b;
            v2.i.c("Ad unit ID should not be null for NativeAdLoader.");
            c3309hi.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Kr

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ T8 f25980u;

                {
                    this.f25980u = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i6) {
                        case 0:
                            C3481ku c3481ku = (C3481ku) this.f25980u.f27697v;
                            ((Hr) c3481ku.f31665w).v(SK.F(6, null, null));
                            break;
                        default:
                            C3481ku c3481ku2 = (C3481ku) this.f25980u.f27697v;
                            ((Hr) c3481ku2.f31665w).v(SK.F(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        boolean z3 = c1Var.f40120y;
        AbstractC2968bG.r(context, z3);
        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.ka)).booleanValue() && z3) {
            ((C2749Qo) c3309hi.f30840G.f()).b(true);
        }
        c4835j.f39742k.getClass();
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Bundle b9 = AbstractC3043cl.b(new Pair("api-call", valueOf), new Pair("dynamite-enter", valueOf));
        C2999bu c2999bu = (C2999bu) this.f27695n;
        c2999bu.f29343a = c1Var;
        c2999bu.f29361t = b9;
        c2999bu.f29354m = ((Jr) abstractC2772Sd).f25770M;
        C3052cu a9 = c2999bu.a();
        Su e9 = Su.e(context, AbstractC2772Sd.F(a9), 8, c1Var);
        Dr dr = (Dr) ((C3481ku) this.f27697v).f31664v;
        q2.V v9 = a9.f29633o;
        if (v9 != null) {
            dr.n(v9);
        }
        C3309hi c3309hi2 = c3309hi.f30874b;
        C3687ok c3687ok = new C3687ok();
        c3687ok.f32932a = context;
        c3687ok.f32933b = a9;
        C3687ok c3687ok2 = new C3687ok(c3687ok);
        C3796ql c3796ql = new C3796ql();
        c3796ql.b(dr, c3309hi.b());
        C3201fi c3201fi = new C3201fi(c3309hi2, new Ux(16, (Object) null), new C2991bm((int) (objArr3 == true ? 1 : 0), r9.f31663u, (Object) dr.c()), new C3472kl(23), new C3849rl(c3796ql), c3687ok2, new C3657o7(27), null, null);
        if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
            vu = (Vu) c3201fi.f30364e.f();
            vu.i(8);
            vu.c(c1Var.f40102I);
            vu.d(c1Var.f40099F);
        } else {
            vu = null;
        }
        ((C3589mu) c3309hi.f30868V.f()).a(1);
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c3309hi.f30878d.f();
        C2710Oj c2710Oj = (C2710Oj) c3201fi.f30400v0.f();
        Iu c9 = c2710Oj.c(c2710Oj.b());
        C2659Lj c2659Lj = new C2659Lj(c3360ig, scheduledExecutorService, c9);
        this.f27700y = c2659Lj;
        c9.a(new LD(objArr == true ? 1 : 0, c9, new C2991bm(c2659Lj, new C3864s(this, (C3694or) ir, vu, e9, c3201fi), 14, objArr2 == true ? 1 : 0)), c3360ig);
        return true;
    }

    @Override // p2.InterfaceC4829d
    public synchronized void e(View view) {
        if (((AtomicBoolean) this.f27700y).compareAndSet(false, true)) {
            ((C2934aj) this.f27699x).w();
            ((C2508Cl) this.f27698w).Q1(view);
        }
    }

    @Override // p2.InterfaceC4829d
    public void f() {
        if (((AtomicBoolean) this.f27700y).get()) {
            ((C3902sk) this.f27695n).onAdClicked();
        }
    }

    public T8 g(Eu eu) {
        return j(new C4164xc(13, eu));
    }

    public void h(int i) {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.f27696u = Integer.valueOf(i);
    }

    @Override // p2.InterfaceC4829d
    public void i() {
        if (((AtomicBoolean) this.f27700y).get()) {
            ((C2507Ck) this.f27696u).t();
            C2559Fl c2559Fl = (C2559Fl) this.f27697v;
            synchronized (c2559Fl) {
                c2559Fl.M1(C3472kl.f31607F);
            }
        }
    }

    public T8 j(BD bd) {
        C3878sD t6 = QC.t((N3.a) this.f27699x, bd, ((Lu) this.f27700y).f26189a);
        return new T8((Lu) this.f27700y, this.f27697v, (String) this.f27695n, (N3.a) this.f27696u, (List) this.f27698w, t6);
    }

    public U8 k(X8 x82) {
        synchronized (this.f27697v) {
            if (((Y8) this.f27700y) == null) {
                return new U8();
            }
            try {
                if (((W8) this.f27698w).A()) {
                    Y8 y82 = (Y8) this.f27700y;
                    Parcel H02 = y82.H0();
                    AbstractC3388j8.c(H02, x82);
                    Parcel M02 = y82.M0(H02, 2);
                    U8 u82 = (U8) AbstractC3388j8.b(M02, U8.CREATOR);
                    M02.recycle();
                    return u82;
                }
                Y8 y83 = (Y8) this.f27700y;
                Parcel H03 = y83.H0();
                AbstractC3388j8.c(H03, x82);
                Parcel M03 = y83.M0(H03, 1);
                U8 u83 = (U8) AbstractC3388j8.b(M03, U8.CREATOR);
                M03.recycle();
                return u83;
            } catch (RemoteException e9) {
                int i = u2.z.f41319b;
                v2.i.d("Unable to call into cache service.", e9);
                return new U8();
            }
        }
    }

    public void l(int i) {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.f27697v = Integer.valueOf(i);
    }

    public void m(int i) {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.f27698w = Integer.valueOf(i);
    }

    public N3.a n(C4020uu c4020uu, S0.e eVar) {
        InterfaceC3633nk interfaceC3633nk = c4020uu.f34604a;
        this.f27699x = interfaceC3633nk;
        if (c4020uu.f34606c == null) {
            interfaceC3633nk.c().f26645g = c4020uu.f34605b;
            return ((S0.c) this.f27695n).t(eVar, null, c4020uu.f34604a);
        }
        if (interfaceC3633nk.i() != null) {
            C3266gt c3266gt = c4020uu.f34606c.f24837e;
            InterfaceC4181xt i = c4020uu.f34604a.i();
            c3266gt.getClass();
            c3266gt.f30668B = (C3266gt) i;
        }
        return QC.c(c4020uu.f34606c);
    }

    @Override // com.google.android.gms.internal.ads.At
    public Object o() {
        InterfaceC3633nk interfaceC3633nk;
        synchronized (this) {
            interfaceC3633nk = (InterfaceC3633nk) this.f27699x;
        }
        return interfaceC3633nk;
    }

    public GE p() {
        if (((Integer) this.f27695n) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f27696u) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f27697v) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f27698w;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((FE) this.f27699x) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        int intValue = num.intValue();
        FE fe = (FE) this.f27699x;
        if (fe == FE.f24770v) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (fe == FE.f24771w) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (fe == FE.f24772x) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (fe == FE.f24773y) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (fe != FE.f24774z) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new GE(((Integer) this.f27695n).intValue(), ((Integer) this.f27696u).intValue(), ((Integer) this.f27697v).intValue(), ((Integer) this.f27698w).intValue(), (C3556mE) this.f27700y, (FE) this.f27699x);
    }

    public /* synthetic */ void q() {
        synchronized (this.f27697v) {
            try {
                W8 w82 = (W8) this.f27698w;
                if (w82 == null) {
                    return;
                }
                if (w82.i() || ((W8) this.f27698w).e()) {
                    ((W8) this.f27698w).h();
                }
                this.f27698w = null;
                this.f27700y = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public T8 r(long j6) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Lu lu = (Lu) this.f27700y;
        N3.a s9 = QC.s((N3.a) this.f27699x, j6, timeUnit, lu.f26190b);
        return new T8(lu, this.f27697v, (String) this.f27695n, (N3.a) this.f27696u, (List) this.f27698w, s9);
    }

    public Iu s() {
        Lu lu = (Lu) this.f27700y;
        Object obj = this.f27697v;
        String str = (String) this.f27695n;
        if (str == null) {
            lu.getClass();
            str = ((Ju) obj).f25810n;
        }
        Iu iu = new Iu(obj, str, (N3.a) this.f27699x);
        lu.f26191c.M1(new C3105du(1, iu));
        RunnableC3048cq runnableC3048cq = new RunnableC3048cq(11, this, iu);
        C3360ig c3360ig = AbstractC3413jg.f31275h;
        ((N3.a) this.f27696u).a(runnableC3048cq, c3360ig);
        iu.a(new LD(0, iu, new S0.s(this, iu)), c3360ig);
        return iu;
    }

    public void t(AbstractC3604n8 abstractC3604n8) {
        C3493l5 c3493l5 = new C3493l5(4);
        if (((RB) this.f27696u).isEmpty()) {
            u(c3493l5, (C3676oQ) this.f27699x, abstractC3604n8);
            if (!Objects.equals((C3676oQ) this.f27700y, (C3676oQ) this.f27699x)) {
                u(c3493l5, (C3676oQ) this.f27700y, abstractC3604n8);
            }
            if (!Objects.equals((C3676oQ) this.f27698w, (C3676oQ) this.f27699x) && !Objects.equals((C3676oQ) this.f27698w, (C3676oQ) this.f27700y)) {
                u(c3493l5, (C3676oQ) this.f27698w, abstractC3604n8);
            }
        } else {
            for (int i = 0; i < ((RB) this.f27696u).size(); i++) {
                u(c3493l5, (C3676oQ) ((RB) this.f27696u).get(i), abstractC3604n8);
            }
            if (!((RB) this.f27696u).contains((C3676oQ) this.f27698w)) {
                u(c3493l5, (C3676oQ) this.f27698w, abstractC3604n8);
            }
        }
        this.f27697v = c3493l5.s(true);
    }

    public void u(C3493l5 c3493l5, C3676oQ c3676oQ, AbstractC3604n8 abstractC3604n8) {
        if (c3676oQ == null) {
            return;
        }
        if (abstractC3604n8.e(c3676oQ.f32905a) != -1) {
            c3493l5.e(c3676oQ, abstractC3604n8);
            return;
        }
        AbstractC3604n8 abstractC3604n82 = (AbstractC3604n8) ((C3770qC) this.f27697v).get(c3676oQ);
        if (abstractC3604n82 != null) {
            c3493l5.e(c3676oQ, abstractC3604n82);
        }
    }

    public void w() {
        W8 w82;
        synchronized (this.f27697v) {
            if (((Context) this.f27699x) != null && ((W8) this.f27698w) == null) {
                C3657o7 c3657o7 = new C3657o7(this);
                C3694or c3694or = new C3694or(this);
                synchronized (this) {
                    w82 = new W8((Context) this.f27699x, C4835j.f39730C.f39751t.b(), c3657o7, c3694or, 0);
                }
                this.f27698w = w82;
                w82.o();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.At
    public N3.a y(S0.e eVar, InterfaceC4289zt interfaceC4289zt) {
        synchronized (this) {
            C3415ji k9 = interfaceC4289zt.k((InterfaceC4235yt) eVar.f2782v);
            C3857rt c3857rt = new C3857rt((String) this.f27698w);
            switch (k9.f31297a) {
                case 0:
                    k9.f31300d = c3857rt;
                    break;
                default:
                    k9.f31300d = c3857rt;
                    break;
            }
            InterfaceC3633nk interfaceC3633nk = (InterfaceC3633nk) k9.c();
            interfaceC3633nk.f();
            interfaceC3633nk.f();
            q2.c1 c1Var = interfaceC3633nk.f().f29623d;
            if (c1Var.f40104L != null || c1Var.f40109Q != null) {
                this.f27699x = interfaceC3633nk;
                return ((S0.c) this.f27695n).t(eVar, interfaceC4289zt, interfaceC3633nk);
            }
            C3052cu f3 = interfaceC3633nk.f();
            q2.c1 c1Var2 = f3.f29623d;
            String str = f3.f29626g;
            q2.i1 i1Var = f3.f29629k;
            RD rd = (RD) this.f27700y;
            return QC.t(ID.s(((C4274ze) this.f27696u).j(interfaceC3633nk)), new C2513Cq(this, eVar, new C3804qt(interfaceC4289zt, eVar, c1Var2, str, rd, i1Var, null), interfaceC4289zt, interfaceC3633nk, 1), rd);
        }
    }

    public /* synthetic */ T8(String str) {
        this.f27696u = str;
    }

    public T8(int i) {
        switch (i) {
            case 6:
                this.f27695n = null;
                this.f27696u = null;
                this.f27697v = null;
                this.f27698w = null;
                this.f27699x = null;
                this.f27700y = C3556mE.f31913A;
                break;
            default:
                this.f27695n = null;
                this.f27696u = new RunnableC3111e(this);
                this.f27697v = new Object();
                break;
        }
    }

    public T8(Lu lu, Object obj, String str, N3.a aVar, List list, N3.a aVar2) {
        Objects.requireNonNull(lu);
        this.f27700y = lu;
        this.f27697v = obj;
        this.f27695n = str;
        this.f27696u = aVar;
        this.f27698w = list;
        this.f27699x = aVar2;
    }
}
