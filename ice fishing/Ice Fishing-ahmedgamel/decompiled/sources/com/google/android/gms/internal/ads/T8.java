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
import r2.C4906k;
import r2.InterfaceC4899d;
import s2.C4949p;

/* loaded from: classes2.dex */
public final class T8 implements InterfaceC4899d, At {

    /* renamed from: n, reason: collision with root package name */
    public Object f28478n;

    /* renamed from: u, reason: collision with root package name */
    public Object f28479u;

    /* renamed from: v, reason: collision with root package name */
    public Object f28480v;

    /* renamed from: w, reason: collision with root package name */
    public Object f28481w;

    /* renamed from: x, reason: collision with root package name */
    public Object f28482x;

    /* renamed from: y, reason: collision with root package name */
    public Object f28483y;

    public T8(S0.c cVar, C4297ze c4297ze, C3941t c3941t, String str, RD rd) {
        this.f28478n = cVar;
        this.f28479u = c4297ze;
        this.f28480v = c3941t;
        this.f28481w = str;
        this.f28483y = rd;
    }

    public static C3860rQ v(C4074vO c4074vO, RB rb, C3860rQ c3860rQ, K7 k72) {
        AbstractC3627n8 F12 = c4074vO.F1();
        c4074vO.f35459w.b();
        int k22 = c4074vO.f35458v.k2();
        Object f2 = F12.g() ? null : F12.f(k22);
        if (!c4074vO.W1() && !F12.g()) {
            K7 d9 = F12.d(k22, k72, false);
            c4074vO.U1();
            String str = AbstractC3182eu.f30782a;
            d9.getClass();
        }
        for (int i = 0; i < rb.size(); i++) {
            C3860rQ c3860rQ2 = (C3860rQ) rb.get(i);
            if (x(c3860rQ2, f2, c4074vO.W1(), c4074vO.o0(), c4074vO.X1())) {
                return c3860rQ2;
            }
        }
        if (rb.isEmpty() && c3860rQ != null && x(c3860rQ, f2, c4074vO.W1(), c4074vO.o0(), c4074vO.X1())) {
            return c3860rQ;
        }
        return null;
    }

    public static boolean x(C3860rQ c3860rQ, Object obj, boolean z6, int i, int i4) {
        if (!c3860rQ.f34406a.equals(obj)) {
            return false;
        }
        int i6 = c3860rQ.f34407b;
        return z6 ? i6 == i && c3860rQ.f34408c == i4 : i6 == -1 && c3860rQ.f34410e == -1;
    }

    public String a() {
        String str = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.sb);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) this.f28478n);
            jSONObject.put("eventCategory", (String) this.f28479u);
            jSONObject.putOpt("event", (String) this.f28480v);
            jSONObject.putOpt("errorCode", (Integer) this.f28481w);
            jSONObject.putOpt("rewardType", (String) this.f28482x);
            jSONObject.putOpt("rewardAmount", (Integer) this.f28483y);
        } catch (JSONException unused) {
            int i = w2.z.f41712b;
            x2.i.f("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        int length = String.valueOf(str).length();
        return com.IceFishing.LiveIceFishing.k.r(new StringBuilder(String.valueOf(jSONObject2).length() + length + 14 + 2), str, "(\"h5adsEvent\",", jSONObject2, ");");
    }

    public void b(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f28478n = Integer.valueOf(i);
    }

    public void c(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f28480v) {
            try {
                if (((Context) this.f28482x) != null) {
                    return;
                }
                this.f28482x = context.getApplicationContext();
                C3324ha c3324ha = AbstractC3592ma.f33026f5;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    w();
                } else {
                    if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33017e5)).booleanValue()) {
                        C4906k.f40186C.f40195g.i(new S8(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean d(s2.c1 c1Var, String str, AbstractC2792Sd abstractC2792Sd, Ir ir) {
        Vu vu;
        int i = 16;
        final int i4 = 1;
        final int i6 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        C3324ha c3324ha = AbstractC3592ma.f33015e3;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            C4949p.a();
        }
        C4906k c4906k = C4906k.f40186C;
        w2.D d9 = c4906k.f40191c;
        Context context = (Context) this.f28482x;
        boolean h3 = w2.D.h(context);
        C3332hi c3332hi = (C3332hi) this.f28479u;
        if (h3 && c1Var.f40406L == null) {
            int i9 = w2.z.f41712b;
            x2.i.c("Failed to load the ad because app ID is missing.");
            c3332hi.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Kr

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ T8 f26780u;

                {
                    this.f26780u = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            C3504ku c3504ku = (C3504ku) this.f26780u.f28480v;
                            ((Hr) c3504ku.f32447w).I(SK.F(6, null, null));
                            break;
                        default:
                            C3504ku c3504ku2 = (C3504ku) this.f26780u.f28480v;
                            ((Hr) c3504ku2.f32447w).I(SK.F(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        if (str == null) {
            int i10 = w2.z.f41712b;
            x2.i.c("Ad unit ID should not be null for NativeAdLoader.");
            c3332hi.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Kr

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ T8 f26780u;

                {
                    this.f26780u = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i6) {
                        case 0:
                            C3504ku c3504ku = (C3504ku) this.f26780u.f28480v;
                            ((Hr) c3504ku.f32447w).I(SK.F(6, null, null));
                            break;
                        default:
                            C3504ku c3504ku2 = (C3504ku) this.f26780u.f28480v;
                            ((Hr) c3504ku2.f32447w).I(SK.F(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        boolean z6 = c1Var.f40422y;
        AbstractC2991bG.r(context, z6);
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.ka)).booleanValue() && z6) {
            ((C2786Ro) c3332hi.f31601G.f()).b(true);
        }
        c4906k.f40198k.getClass();
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Bundle b9 = AbstractC3066cl.b(new Pair("api-call", valueOf), new Pair("dynamite-enter", valueOf));
        C3022bu c3022bu = (C3022bu) this.f28478n;
        c3022bu.f30131a = c1Var;
        c3022bu.f30149t = b9;
        c3022bu.f30142m = ((Jr) abstractC2792Sd).f26522M;
        C3075cu a9 = c3022bu.a();
        Su j6 = Su.j(context, AbstractC2792Sd.F(a9), 8, c1Var);
        Dr dr = (Dr) ((C3504ku) this.f28480v).f32446v;
        s2.V v9 = a9.f30403o;
        if (v9 != null) {
            dr.n(v9);
        }
        C3332hi c3332hi2 = c3332hi.f31635b;
        C3710ok c3710ok = new C3710ok();
        c3710ok.f33718a = context;
        c3710ok.f33719b = a9;
        C3710ok c3710ok2 = new C3710ok(c3710ok);
        C3819ql c3819ql = new C3819ql();
        c3819ql.b(dr, c3332hi.b());
        C3224fi c3224fi = new C3224fi(c3332hi2, new Ux(i, (Object) null), new C3067cm((int) (objArr3 == true ? 1 : 0), r10.f32445u, (Object) dr.a()), new C3495kl(23), new C3872rl(c3819ql), c3710ok2, new C3680o7(27), null, null);
        if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
            vu = (Vu) c3224fi.f31152e.f();
            vu.i(8);
            vu.c(c1Var.f40404I);
            vu.d(c1Var.f40401F);
        } else {
            vu = null;
        }
        ((C3612mu) c3332hi.f31629V.f()).a(1);
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c3332hi.f31639d.f();
        C2730Oj c2730Oj = (C2730Oj) c3224fi.f31188v0.f();
        Iu c9 = c2730Oj.c(c2730Oj.b());
        C2679Lj c2679Lj = new C2679Lj(c3383ig, scheduledExecutorService, c9);
        this.f28483y = c2679Lj;
        c9.a(new LD(objArr == true ? 1 : 0, c9, new C3067cm(c2679Lj, new C3887s(this, (C3717or) ir, vu, j6, c3224fi), 16, objArr2 == true ? 1 : 0)), c3383ig);
        return true;
    }

    @Override // r2.InterfaceC4899d
    public synchronized void e(View view) {
        if (((AtomicBoolean) this.f28483y).compareAndSet(false, true)) {
            ((C2957aj) this.f28482x).v();
            ((C2545Dl) this.f28481w).R1(view);
        }
    }

    @Override // r2.InterfaceC4899d
    public void f() {
        if (((AtomicBoolean) this.f28483y).get()) {
            ((C3925sk) this.f28478n).onAdClicked();
        }
    }

    public T8 g(Eu eu) {
        return j(new C4187xc(13, eu));
    }

    public void h(int i) {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.f28479u = Integer.valueOf(i);
    }

    @Override // r2.InterfaceC4899d
    public void i() {
        if (((AtomicBoolean) this.f28483y).get()) {
            ((C2527Ck) this.f28479u).t();
            C2596Gl c2596Gl = (C2596Gl) this.f28480v;
            synchronized (c2596Gl) {
                c2596Gl.M1(C3495kl.f32384F);
            }
        }
    }

    public T8 j(BD bd) {
        C3901sD t6 = QC.t((P3.a) this.f28482x, bd, ((Lu) this.f28483y).f26980a);
        return new T8((Lu) this.f28483y, this.f28480v, (String) this.f28478n, (P3.a) this.f28479u, (List) this.f28481w, t6);
    }

    public U8 k(X8 x82) {
        synchronized (this.f28480v) {
            if (((Y8) this.f28483y) == null) {
                return new U8();
            }
            try {
                if (((W8) this.f28481w).A()) {
                    Y8 y82 = (Y8) this.f28483y;
                    Parcel F02 = y82.F0();
                    AbstractC3411j8.c(F02, x82);
                    Parcel K02 = y82.K0(F02, 2);
                    U8 u82 = (U8) AbstractC3411j8.b(K02, U8.CREATOR);
                    K02.recycle();
                    return u82;
                }
                Y8 y83 = (Y8) this.f28483y;
                Parcel F03 = y83.F0();
                AbstractC3411j8.c(F03, x82);
                Parcel K03 = y83.K0(F03, 1);
                U8 u83 = (U8) AbstractC3411j8.b(K03, U8.CREATOR);
                K03.recycle();
                return u83;
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.d("Unable to call into cache service.", e9);
                return new U8();
            }
        }
    }

    public void l(int i) {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.f28480v = Integer.valueOf(i);
    }

    public void m(int i) {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.f28481w = Integer.valueOf(i);
    }

    public P3.a n(C4043uu c4043uu, S0.e eVar) {
        InterfaceC3656nk interfaceC3656nk = c4043uu.f35367a;
        this.f28482x = interfaceC3656nk;
        if (c4043uu.f35369c == null) {
            interfaceC3656nk.c().f27421g = c4043uu.f35368b;
            return ((S0.c) this.f28478n).k(eVar, null, c4043uu.f35367a);
        }
        if (interfaceC3656nk.i() != null) {
            C3289gt c3289gt = c4043uu.f35369c.f25626e;
            InterfaceC4204xt i = c4043uu.f35367a.i();
            c3289gt.getClass();
            c3289gt.f31437B = (C3289gt) i;
        }
        return QC.c(c4043uu.f35369c);
    }

    @Override // com.google.android.gms.internal.ads.At
    public Object o() {
        InterfaceC3656nk interfaceC3656nk;
        synchronized (this) {
            interfaceC3656nk = (InterfaceC3656nk) this.f28482x;
        }
        return interfaceC3656nk;
    }

    public GE p() {
        if (((Integer) this.f28478n) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f28479u) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f28480v) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f28481w;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((FE) this.f28482x) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        int intValue = num.intValue();
        FE fe = (FE) this.f28482x;
        if (fe == FE.f25526v) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (fe == FE.f25527w) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (fe == FE.f25528x) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (fe == FE.f25529y) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (fe != FE.f25530z) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new GE(((Integer) this.f28478n).intValue(), ((Integer) this.f28479u).intValue(), ((Integer) this.f28480v).intValue(), ((Integer) this.f28481w).intValue(), (C3579mE) this.f28483y, (FE) this.f28482x);
    }

    public /* synthetic */ void q() {
        synchronized (this.f28480v) {
            try {
                W8 w82 = (W8) this.f28481w;
                if (w82 == null) {
                    return;
                }
                if (w82.h() || ((W8) this.f28481w).d()) {
                    ((W8) this.f28481w).g();
                }
                this.f28481w = null;
                this.f28483y = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public T8 r(long j6) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Lu lu = (Lu) this.f28483y;
        P3.a s9 = QC.s((P3.a) this.f28482x, j6, timeUnit, lu.f26981b);
        return new T8(lu, this.f28480v, (String) this.f28478n, (P3.a) this.f28479u, (List) this.f28481w, s9);
    }

    public Iu s() {
        Lu lu = (Lu) this.f28483y;
        Object obj = this.f28480v;
        String str = (String) this.f28478n;
        if (str == null) {
            lu.getClass();
            str = ((Ju) obj).f26562n;
        }
        Iu iu = new Iu(obj, str, (P3.a) this.f28482x);
        lu.f26982c.M1(new C3128du(1, iu));
        RunnableC3071cq runnableC3071cq = new RunnableC3071cq(11, this, iu);
        C3383ig c3383ig = AbstractC3436jg.f32062h;
        ((P3.a) this.f28479u).a(runnableC3071cq, c3383ig);
        iu.a(new LD(0, iu, new S0.s(this, iu)), c3383ig);
        return iu;
    }

    public void t(AbstractC3627n8 abstractC3627n8) {
        C3516l5 c3516l5 = new C3516l5(4);
        if (((RB) this.f28479u).isEmpty()) {
            u(c3516l5, (C3860rQ) this.f28482x, abstractC3627n8);
            if (!Objects.equals((C3860rQ) this.f28483y, (C3860rQ) this.f28482x)) {
                u(c3516l5, (C3860rQ) this.f28483y, abstractC3627n8);
            }
            if (!Objects.equals((C3860rQ) this.f28481w, (C3860rQ) this.f28482x) && !Objects.equals((C3860rQ) this.f28481w, (C3860rQ) this.f28483y)) {
                u(c3516l5, (C3860rQ) this.f28481w, abstractC3627n8);
            }
        } else {
            for (int i = 0; i < ((RB) this.f28479u).size(); i++) {
                u(c3516l5, (C3860rQ) ((RB) this.f28479u).get(i), abstractC3627n8);
            }
            if (!((RB) this.f28479u).contains((C3860rQ) this.f28481w)) {
                u(c3516l5, (C3860rQ) this.f28481w, abstractC3627n8);
            }
        }
        this.f28480v = c3516l5.s(true);
    }

    public void u(C3516l5 c3516l5, C3860rQ c3860rQ, AbstractC3627n8 abstractC3627n8) {
        if (c3860rQ == null) {
            return;
        }
        if (abstractC3627n8.e(c3860rQ.f34406a) != -1) {
            c3516l5.e(c3860rQ, abstractC3627n8);
            return;
        }
        AbstractC3627n8 abstractC3627n82 = (AbstractC3627n8) ((C3793qC) this.f28480v).get(c3860rQ);
        if (abstractC3627n82 != null) {
            c3516l5.e(c3860rQ, abstractC3627n82);
        }
    }

    public void w() {
        W8 w82;
        synchronized (this.f28480v) {
            if (((Context) this.f28482x) != null && ((W8) this.f28481w) == null) {
                C3680o7 c3680o7 = new C3680o7(this);
                C3717or c3717or = new C3717or(this);
                synchronized (this) {
                    w82 = new W8((Context) this.f28482x, C4906k.f40186C.f40207t.b(), c3680o7, c3717or, 0);
                }
                this.f28481w = w82;
                w82.o();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.At
    public P3.a y(S0.e eVar, InterfaceC4312zt interfaceC4312zt) {
        synchronized (this) {
            C3438ji k9 = interfaceC4312zt.k((InterfaceC4258yt) eVar.f2909v);
            C3880rt c3880rt = new C3880rt((String) this.f28481w);
            switch (k9.f32084a) {
                case 0:
                    k9.f32087d = c3880rt;
                    break;
                default:
                    k9.f32087d = c3880rt;
                    break;
            }
            InterfaceC3656nk interfaceC3656nk = (InterfaceC3656nk) k9.c();
            interfaceC3656nk.f();
            interfaceC3656nk.f();
            s2.c1 c1Var = interfaceC3656nk.f().f30393d;
            if (c1Var.f40406L != null || c1Var.f40411Q != null) {
                this.f28482x = interfaceC3656nk;
                return ((S0.c) this.f28478n).k(eVar, interfaceC4312zt, interfaceC3656nk);
            }
            C3075cu f2 = interfaceC3656nk.f();
            s2.c1 c1Var2 = f2.f30393d;
            String str = f2.f30396g;
            s2.i1 i1Var = f2.f30399k;
            RD rd = (RD) this.f28483y;
            return QC.t(ID.s(((C4297ze) this.f28479u).j(interfaceC3656nk)), new C2533Cq(this, eVar, new C3827qt(interfaceC4312zt, eVar, c1Var2, str, rd, i1Var, null), interfaceC4312zt, interfaceC3656nk, 1), rd);
        }
    }

    public /* synthetic */ T8(String str) {
        this.f28479u = str;
    }

    public T8(int i) {
        switch (i) {
            case 6:
                this.f28478n = null;
                this.f28479u = null;
                this.f28480v = null;
                this.f28481w = null;
                this.f28482x = null;
                this.f28483y = C3579mE.f32693A;
                break;
            default:
                this.f28478n = null;
                this.f28479u = new RunnableC3134e(this);
                this.f28480v = new Object();
                break;
        }
    }

    public T8(Lu lu, Object obj, String str, P3.a aVar, List list, P3.a aVar2) {
        Objects.requireNonNull(lu);
        this.f28483y = lu;
        this.f28480v = obj;
        this.f28478n = str;
        this.f28479u = aVar;
        this.f28481w = list;
        this.f28482x = aVar2;
    }
}
