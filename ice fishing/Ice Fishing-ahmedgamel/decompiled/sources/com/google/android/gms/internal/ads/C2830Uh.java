package com.google.android.gms.internal.ads;

import X.InterfaceC0417f;
import android.content.Context;
import android.webkit.CookieManager;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import r2.C4896a;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Uh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2830Uh implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28750a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f28751b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f28752c;

    public /* synthetic */ C2830Uh(C3266gN c3266gN, C3266gN c3266gN2, int i) {
        this.f28750a = i;
        this.f28751b = c3266gN;
        this.f28752c = c3266gN2;
    }

    public C3179er a() {
        return new C3179er((C3878rr) this.f28751b.f(), (C2785Rn) this.f28752c.f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        C3383ig c3383ig;
        switch (this.f28750a) {
            case 0:
                return new C2813Th((C2762Qh) this.f28751b.f(), (C3230fo) this.f28752c.f());
            case 1:
                return new C2847Vh((ScheduledExecutorService) this.f28752c.f());
            case 2:
                return ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32789E3)).booleanValue() ? new C3464k7((InterfaceC3358i7) this.f28752c.f()) : new C3464k7((InterfaceC3358i7) this.f28751b.f());
            case 3:
                C3842r8 c3842r8 = (C3842r8) this.f28751b.f();
                C3273gd c3273gd = (C3273gd) this.f28752c.f();
                C3324ha c3324ha = AbstractC3592ma.f32816H6;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    c3383ig = AbstractC3436jg.f32057c;
                } else {
                    c3383ig = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f32808G6)).booleanValue() ? AbstractC3436jg.f32055a : AbstractC3436jg.f32060f;
                }
                AbstractC3364iD.j(c3383ig);
                return new C2864Wi(c3842r8.f34297c, c3273gd, c3383ig);
            case 4:
                C2957aj c2957aj = (C2957aj) this.f28751b.f();
                C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig2);
                Set singleton = ((JSONObject) this.f28752c.f()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2528Cl(c2957aj, c3383ig2));
                AbstractC3364iD.j(singleton);
                return singleton;
            case 5:
                C2957aj c2957aj2 = (C2957aj) this.f28751b.f();
                C3383ig c3383ig3 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig3);
                Set singleton2 = ((JSONObject) this.f28752c.f()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2528Cl(c2957aj2, c3383ig3));
                AbstractC3364iD.j(singleton2);
                return singleton2;
            case 6:
                C2957aj c2957aj3 = (C2957aj) this.f28751b.f();
                C3383ig c3383ig4 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig4);
                Set singleton3 = ((JSONObject) this.f28752c.f()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2528Cl(c2957aj3, c3383ig4));
                AbstractC3364iD.j(singleton3);
                return singleton3;
            case 7:
                C2957aj c2957aj4 = (C2957aj) this.f28751b.f();
                C3383ig c3383ig5 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig5);
                Set singleton4 = ((JSONObject) this.f28752c.f()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2528Cl(c2957aj4, c3383ig5));
                AbstractC3364iD.j(singleton4);
                return singleton4;
            case 8:
                return new C2798Sj((V2.a) this.f28751b.f(), (C2893Yf) this.f28752c.f());
            case 9:
                return new C4896a((Context) this.f28751b.f(), (InterfaceC2488Af) this.f28752c.f());
            case 10:
                return new C2528Cl((C3120dl) this.f28751b.f(), (Executor) this.f28752c.f());
            case 11:
                return new C2528Cl((C3120dl) this.f28751b.f(), (Executor) this.f28752c.f());
            case 12:
                return new C2528Cl((C3120dl) this.f28751b.f(), (Executor) this.f28752c.f());
            case 13:
                return new C2528Cl((C3120dl) this.f28751b.f(), (Executor) this.f28752c.f());
            case 14:
                return new C2528Cl((C3120dl) this.f28751b.f(), (Executor) this.f28752c.f());
            case 15:
                return new C2528Cl((C3120dl) this.f28751b.f(), (Executor) this.f28752c.f());
            case 16:
                return new C2528Cl((C3120dl) this.f28751b.f(), (Executor) this.f28752c.f());
            case 17:
                return new C2528Cl((C3120dl) this.f28751b.f(), (Executor) this.f28752c.f());
            case 18:
                return new C2834Ul((C2782Rk) this.f28751b.f(), (C4304zl) this.f28752c.f());
            case 19:
                return new C3498ko((C3391io) this.f28752c.f(), (String) this.f28751b.f());
            case 20:
                return new C2718No((C2531Co) this.f28751b.f(), (C2768Qn) this.f28752c.f());
            case 21:
                Lu lu = (Lu) this.f28751b.f();
                C4906k.f40186C.f40194f.getClass();
                CookieManager q8 = O2.i.q();
                Ju ju = Ju.WEBVIEW_COOKIE;
                Objects.requireNonNull(lu);
                CallableC3572m7 callableC3572m7 = new CallableC3572m7(4, q8);
                ND nd = Lu.f26979d;
                List list = Collections.EMPTY_LIST;
                P3.a b9 = lu.f26980a.b(callableC3572m7);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                T8 t82 = new T8(lu, ju, null, nd, list, QC.s(b9, 1L, TimeUnit.SECONDS, lu.f26981b));
                C2576Fi c2576Fi = new C2576Fi(14);
                Lu lu2 = (Lu) t82.f28483y;
                return new T8(lu2, t82.f28480v, (String) t82.f28478n, (P3.a) t82.f28479u, (List) t82.f28481w, QC.r((P3.a) t82.f28482x, Exception.class, c2576Fi, lu2.f26980a)).s();
            case 22:
                return a();
            case 23:
                P3.a aVar = (P3.a) this.f28751b.f();
                C3383ig c3383ig6 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig6);
                return new Ur(0, aVar, c3383ig6, (ScheduledExecutorService) this.f28752c.f());
            case 24:
                C3383ig c3383ig7 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig7);
                C3772ps c3772ps = new C3772ps(c3383ig7, 2);
                V2.a aVar2 = (V2.a) this.f28751b.f();
                AbstractC3364iD.j(c3383ig7);
                return new C3718os(c3772ps, ((Long) AbstractC2585Ga.f25771f.r()).longValue(), aVar2, c3383ig7, (C3230fo) this.f28752c.f());
            case 25:
                return new Rt((V2.a) this.f28751b.f(), (C3230fo) this.f28752c.f());
            case 26:
                return new Qr((C3718os) this.f28751b.f(), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ld)).intValue(), (ScheduledExecutorService) this.f28752c.f());
            case 27:
                return new Qr((C3718os) this.f28751b.f(), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.yd)).intValue(), (ScheduledExecutorService) this.f28752c.f());
            case 28:
                return new Jv((Kv) this.f28751b.f(), (Ev) this.f28752c.f());
            default:
                InterfaceC0417f interfaceC0417f = (InterfaceC0417f) this.f28751b.f();
                ExecutorService executorService = AbstractC3436jg.f32061g;
                AbstractC3364iD.j(executorService);
                return new Px(interfaceC0417f, new C4042ut(3, executorService), (C2734On) this.f28752c.f(), new C3609mr((byte) 0, 16));
        }
    }
}
