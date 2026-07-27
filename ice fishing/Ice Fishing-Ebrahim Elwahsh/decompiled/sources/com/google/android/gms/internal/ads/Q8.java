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
import q2.C4907p;

/* loaded from: classes2.dex */
public final class Q8 implements p2.d, Bt {

    /* renamed from: n, reason: collision with root package name */
    public Object f27119n;

    /* renamed from: u, reason: collision with root package name */
    public Object f27120u;

    /* renamed from: v, reason: collision with root package name */
    public Object f27121v;

    /* renamed from: w, reason: collision with root package name */
    public Object f27122w;

    /* renamed from: x, reason: collision with root package name */
    public Object f27123x;

    /* renamed from: y, reason: collision with root package name */
    public Object f27124y;

    public Q8(C2593Hm c2593Hm, C4017ue c4017ue, C3877s c3877s, String str, SD sd) {
        this.f27119n = c2593Hm;
        this.f27120u = c4017ue;
        this.f27121v = c3877s;
        this.f27122w = str;
        this.f27124y = sd;
    }

    public static BQ u(IO io, UB ub, BQ bq, L7 l72) {
        AbstractC3832r8 r12 = io.r1();
        io.f25557w.b();
        int O12 = io.f25556v.O1();
        Object f6 = r12.g() ? null : r12.f(O12);
        if (!io.A1() && !r12.g()) {
            L7 d2 = r12.d(O12, l72, false);
            io.x1();
            String str = AbstractC3548lu.f32613a;
            d2.getClass();
        }
        for (int i = 0; i < ub.size(); i++) {
            BQ bq2 = (BQ) ub.get(i);
            if (y(bq2, f6, io.A1(), io.m(), io.B1())) {
                return bq2;
            }
        }
        if (ub.isEmpty() && bq != null && y(bq, f6, io.A1(), io.m(), io.B1())) {
            return bq;
        }
        return null;
    }

    public static boolean y(BQ bq, Object obj, boolean z8, int i, int i4) {
        if (!bq.f24043a.equals(obj)) {
            return false;
        }
        int i9 = bq.f24044b;
        return z8 ? i9 == i && bq.f24045c == i4 : i9 == -1 && bq.f24047e == -1;
    }

    public String a() {
        String str = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.sb);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) this.f27119n);
            jSONObject.put("eventCategory", (String) this.f27120u);
            jSONObject.putOpt("event", (String) this.f27121v);
            jSONObject.putOpt("errorCode", (Integer) this.f27122w);
            jSONObject.putOpt("rewardType", (String) this.f27123x);
            jSONObject.putOpt("rewardAmount", (Integer) this.f27124y);
        } catch (JSONException unused) {
            int i = t2.C.f40822b;
            u2.i.f("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        int length = String.valueOf(str).length();
        return com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(jSONObject2).length() + length + 14 + 2), str, "(\"h5adsEvent\",", jSONObject2, ");");
    }

    public void b(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f27119n = Integer.valueOf(i);
    }

    public void c(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f27121v) {
            try {
                if (((Context) this.f27123x) != null) {
                    return;
                }
                this.f27123x = context.getApplicationContext();
                C3151ea c3151ea = AbstractC3368ia.f31665f5;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    w();
                } else {
                    if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31656e5)).booleanValue()) {
                        p2.j.f39798C.f39807g.i(new P8(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p2.d
    public void d() {
        if (((AtomicBoolean) this.f27124y).get()) {
            ((C3808qk) this.f27119n).onAdClicked();
        }
    }

    public boolean e(q2.d1 d1Var, String str, PA pa, Kr kr) {
        Yu yu;
        final int i = 1;
        final int i4 = 0;
        C3151ea c3151ea = AbstractC3368ia.f31654e3;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            C4907p.a();
        }
        p2.j jVar = p2.j.f39798C;
        t2.G g9 = jVar.f39803c;
        Context context = (Context) this.f27123x;
        boolean h9 = t2.G.h(context);
        C3214fi c3214fi = (C3214fi) this.f27120u;
        if (h9 && d1Var.f40018L == null) {
            int i9 = t2.C.f40822b;
            u2.i.c("Failed to load the ad because app ID is missing.");
            c3214fi.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Nr

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Q8 f26613u;

                {
                    this.f26613u = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            C3602mu c3602mu = (C3602mu) this.f26613u.f27121v;
                            ((Jr) c3602mu.f32776w).v(AbstractC3217fl.M(6, null, null));
                            break;
                        default:
                            C3602mu c3602mu2 = (C3602mu) this.f26613u.f27121v;
                            ((Jr) c3602mu2.f32776w).v(AbstractC3217fl.M(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        if (str == null) {
            int i10 = t2.C.f40822b;
            u2.i.c("Ad unit ID should not be null for NativeAdLoader.");
            c3214fi.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Nr

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Q8 f26613u;

                {
                    this.f26613u = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            C3602mu c3602mu = (C3602mu) this.f26613u.f27121v;
                            ((Jr) c3602mu.f32776w).v(AbstractC3217fl.M(6, null, null));
                            break;
                        default:
                            C3602mu c3602mu2 = (C3602mu) this.f26613u.f27121v;
                            ((Jr) c3602mu2.f32776w).v(AbstractC3217fl.M(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        boolean z8 = d1Var.f40034y;
        AbstractC2655Lg.o(context, z8);
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.ka)).booleanValue() && z8) {
            ((C2748Qo) c3214fi.f30762G.d()).b(true);
        }
        jVar.f39810k.getClass();
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Bundle c4 = AbstractC3035cL.c(new Pair("api-call", valueOf), new Pair("dynamite-enter", valueOf));
        C3171eu c3171eu = (C3171eu) this.f27119n;
        c3171eu.f30530a = d1Var;
        c3171eu.f30548t = c4;
        c3171eu.f30541m = ((Mr) pa).f26386U;
        C3226fu a9 = c3171eu.a();
        Vu e6 = Vu.e(context, PA.N(a9), 8, d1Var);
        C3602mu c3602mu = (C3602mu) this.f27121v;
        Fr fr = (Fr) c3602mu.f32775v;
        q2.V v6 = a9.f30911o;
        if (v6 != null) {
            fr.o(v6);
        }
        C3214fi c3214fi2 = c3214fi.f30795b;
        C3646nk c3646nk = new C3646nk();
        c3646nk.f32990a = context;
        c3646nk.f32991b = a9;
        C3646nk c3646nk2 = new C3646nk(c3646nk);
        C3755pl c3755pl = new C3755pl();
        c3755pl.b(fr, c3214fi.b());
        C3809ql c3809ql = new C3809ql(c3755pl);
        C3105di c3105di = new C3105di(c3214fi2, new Vx(16, (Object) null), new C2881Yl(i4, (C4133wm) c3602mu.f32774u, fr.d()), new C3431jl(22), c3809ql, c3646nk2, new C3562m7(26), null, null);
        if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
            yu = (Yu) c3105di.f30137e.d();
            yu.i(8);
            yu.c(d1Var.f40016I);
            yu.d(d1Var.f40013F);
        } else {
            yu = null;
        }
        ((C3710ou) c3214fi.f30788U.d()).a(1);
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c3214fi.f30799d.d();
        C2709Oj c2709Oj = (C2709Oj) c3105di.f30173v0.d();
        Ku c9 = c2709Oj.c(c2709Oj.b());
        C2658Lj c2658Lj = new C2658Lj(c3157eg, scheduledExecutorService, c9);
        this.f27124y = c2658Lj;
        c9.c(new MD(i4, c9, new C2607Ij(c2658Lj, new r(this, (C3761pr) kr, yu, e6, c3105di), 0)), c3157eg);
        return true;
    }

    public Q8 f(Gu gu) {
        return h(new C3907sc(13, gu));
    }

    public void g(int i) {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.f27120u = Integer.valueOf(i);
    }

    public Q8 h(CD cd) {
        C3945tD y6 = C3686oN.y((J3.a) this.f27123x, cd, ((Ou) this.f27124y).f26777a);
        return new Q8((Ou) this.f27124y, this.f27121v, (String) this.f27119n, (J3.a) this.f27120u, (List) this.f27122w, y6);
    }

    @Override // p2.d
    public void i() {
        if (((AtomicBoolean) this.f27124y).get()) {
            ((C2489Bk) this.f27120u).a();
            C2541El c2541El = (C2541El) this.f27121v;
            synchronized (c2541El) {
                c2541El.u1(C3431jl.f32172F);
            }
        }
    }

    public R8 j(U8 u82) {
        synchronized (this.f27121v) {
            if (((V8) this.f27124y) == null) {
                return new R8();
            }
            try {
                if (((T8) this.f27122w).A()) {
                    V8 v82 = (V8) this.f27124y;
                    Parcel A02 = v82.A0();
                    AbstractC3241g8.c(A02, u82);
                    Parcel D02 = v82.D0(A02, 2);
                    R8 r82 = (R8) AbstractC3241g8.b(D02, R8.CREATOR);
                    D02.recycle();
                    return r82;
                }
                V8 v83 = (V8) this.f27124y;
                Parcel A03 = v83.A0();
                AbstractC3241g8.c(A03, u82);
                Parcel D03 = v83.D0(A03, 1);
                R8 r83 = (R8) AbstractC3241g8.b(D03, R8.CREATOR);
                D03.recycle();
                return r83;
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.d("Unable to call into cache service.", e6);
                return new R8();
            }
        }
    }

    public void k(int i) {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.f27121v = Integer.valueOf(i);
    }

    public void l(int i) {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.f27122w = Integer.valueOf(i);
    }

    public J3.a m(C4141wu c4141wu, C2593Hm c2593Hm) {
        InterfaceC3592mk interfaceC3592mk = c4141wu.f35085a;
        this.f27123x = interfaceC3592mk;
        if (c4141wu.f35087c == null) {
            interfaceC3592mk.a().f26743g = c4141wu.f35086b;
            return ((C2593Hm) this.f27119n).g(c2593Hm, null, c4141wu.f35085a);
        }
        if (interfaceC3592mk.i() != null) {
            C3439jt c3439jt = c4141wu.f35087c.f24807e;
            InterfaceC4248yt i = c4141wu.f35085a.i();
            c3439jt.getClass();
            c3439jt.f32210B = (C3439jt) i;
        }
        return C3686oN.c(c4141wu.f35087c);
    }

    public IE n() {
        if (((Integer) this.f27119n) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f27120u) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f27121v) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f27122w;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((GE) this.f27123x) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        int intValue = num.intValue();
        GE ge = (GE) this.f27123x;
        if (ge == GE.f25115c) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (ge == GE.f25116d) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (ge == GE.f25117e) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (ge == GE.f25118f) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (ge != GE.f25119g) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new IE(((Integer) this.f27119n).intValue(), ((Integer) this.f27120u).intValue(), ((Integer) this.f27121v).intValue(), ((Integer) this.f27122w).intValue(), (HE) this.f27124y, (GE) this.f27123x);
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public Object o() {
        InterfaceC3592mk interfaceC3592mk;
        synchronized (this) {
            interfaceC3592mk = (InterfaceC3592mk) this.f27123x;
        }
        return interfaceC3592mk;
    }

    public /* synthetic */ void p() {
        synchronized (this.f27121v) {
            try {
                T8 t82 = (T8) this.f27122w;
                if (t82 == null) {
                    return;
                }
                if (t82.j() || ((T8) this.f27122w).d()) {
                    ((T8) this.f27122w).h();
                }
                this.f27122w = null;
                this.f27124y = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Q8 q(long j9) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Ou ou = (Ou) this.f27124y;
        J3.a w9 = C3686oN.w((J3.a) this.f27123x, j9, timeUnit, ou.f26778b);
        return new Q8(ou, this.f27121v, (String) this.f27119n, (J3.a) this.f27120u, (List) this.f27122w, w9);
    }

    public Ku r() {
        Ou ou = (Ou) this.f27124y;
        Object obj = this.f27121v;
        String str = (String) this.f27119n;
        if (str == null) {
            ou.getClass();
            str = ((Lu) obj).f26268n;
        }
        Ku ku = new Ku(obj, str, (J3.a) this.f27123x);
        ou.f26779c.u1(new Mu(0, ku));
        RunnableC3329hp runnableC3329hp = new RunnableC3329hp(12, this, ku);
        C3157eg c3157eg = AbstractC3212fg.f30745h;
        ((J3.a) this.f27120u).c(runnableC3329hp, c3157eg);
        ku.c(new MD(0, ku, new C2593Hm(this, ku)), c3157eg);
        return ku;
    }

    public void s(AbstractC3832r8 abstractC3832r8) {
        C3398j5 c3398j5 = new C3398j5(4);
        if (((UB) this.f27120u).isEmpty()) {
            t(c3398j5, (BQ) this.f27123x, abstractC3832r8);
            if (!Objects.equals((BQ) this.f27124y, (BQ) this.f27123x)) {
                t(c3398j5, (BQ) this.f27124y, abstractC3832r8);
            }
            if (!Objects.equals((BQ) this.f27122w, (BQ) this.f27123x) && !Objects.equals((BQ) this.f27122w, (BQ) this.f27124y)) {
                t(c3398j5, (BQ) this.f27122w, abstractC3832r8);
            }
        } else {
            for (int i = 0; i < ((UB) this.f27120u).size(); i++) {
                t(c3398j5, (BQ) ((UB) this.f27120u).get(i), abstractC3832r8);
            }
            if (!((UB) this.f27120u).contains((BQ) this.f27122w)) {
                t(c3398j5, (BQ) this.f27122w, abstractC3832r8);
            }
        }
        this.f27121v = c3398j5.s(true);
    }

    public void t(C3398j5 c3398j5, BQ bq, AbstractC3832r8 abstractC3832r8) {
        if (bq == null) {
            return;
        }
        if (abstractC3832r8.e(bq.f24043a) != -1) {
            c3398j5.h(bq, abstractC3832r8);
            return;
        }
        AbstractC3832r8 abstractC3832r82 = (AbstractC3832r8) ((C3944tC) this.f27121v).get(bq);
        if (abstractC3832r82 != null) {
            c3398j5.h(bq, abstractC3832r82);
        }
    }

    @Override // p2.d
    public synchronized void v(View view) {
        if (((AtomicBoolean) this.f27124y).compareAndSet(false, true)) {
            ((C2895Zi) this.f27123x).y();
            ((C2490Bl) this.f27122w).v1(view);
        }
    }

    public void w() {
        T8 t82;
        synchronized (this.f27121v) {
            if (((Context) this.f27123x) != null && ((T8) this.f27122w) == null) {
                C3562m7 c3562m7 = new C3562m7(this);
                C3761pr c3761pr = new C3761pr(this);
                synchronized (this) {
                    t82 = new T8((Context) this.f27123x, p2.j.f39798C.f39819t.b(), c3562m7, c3761pr, 0);
                }
                this.f27122w = t82;
                t82.o();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public J3.a x(C2593Hm c2593Hm, At at) {
        synchronized (this) {
            C3322hi j9 = at.j((InterfaceC4302zt) c2593Hm.f25416u);
            C3924st c3924st = new C3924st((String) this.f27122w);
            switch (j9.f31243a) {
                case 0:
                    j9.f31246d = c3924st;
                    break;
                default:
                    j9.f31246d = c3924st;
                    break;
            }
            InterfaceC3592mk interfaceC3592mk = (InterfaceC3592mk) j9.c();
            interfaceC3592mk.d();
            interfaceC3592mk.d();
            q2.d1 d1Var = interfaceC3592mk.d().f30901d;
            if (d1Var.f40018L != null || d1Var.f40023Q != null) {
                this.f27123x = interfaceC3592mk;
                return ((C2593Hm) this.f27119n).g(c2593Hm, at, interfaceC3592mk);
            }
            C3226fu d2 = interfaceC3592mk.d();
            q2.d1 d1Var2 = d2.f30901d;
            String str = d2.f30904g;
            q2.j1 j1Var = d2.f30907k;
            SD sd = (SD) this.f27124y;
            return C3686oN.y(JD.s(((C4017ue) this.f27120u).j(interfaceC3592mk)), new C2546Eq(this, c2593Hm, new C3870rt(at, c2593Hm, d1Var2, str, sd, j1Var, null), at, interfaceC3592mk, 1), sd);
        }
    }

    public /* synthetic */ Q8(String str) {
        this.f27120u = str;
    }

    public Q8(int i) {
        switch (i) {
            case 6:
                this.f27119n = null;
                this.f27120u = null;
                this.f27121v = null;
                this.f27122w = null;
                this.f27123x = null;
                this.f27124y = HE.f25330e;
                break;
            default:
                this.f27119n = null;
                this.f27120u = new RunnableC3068d(this);
                this.f27121v = new Object();
                break;
        }
    }

    public Q8(Ou ou, Object obj, String str, J3.a aVar, List list, J3.a aVar2) {
        Objects.requireNonNull(ou);
        this.f27124y = ou;
        this.f27121v = obj;
        this.f27119n = str;
        this.f27120u = aVar;
        this.f27122w = list;
        this.f27123x = aVar2;
    }
}
