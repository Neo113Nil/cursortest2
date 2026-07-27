package com.google.android.gms.internal.ads;

import X.InterfaceC0413f;
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
import p2.C4826a;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Uh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2808Uh implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27952a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f27953b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f27954c;

    public /* synthetic */ C2808Uh(C3243gN c3243gN, C3243gN c3243gN2, int i) {
        this.f27952a = i;
        this.f27953b = c3243gN;
        this.f27954c = c3243gN2;
    }

    public C3156er a() {
        return new C3156er((C3855rr) this.f27953b.f(), (C2748Qn) this.f27954c.f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        C3360ig c3360ig;
        switch (this.f27952a) {
            case 0:
                return new C2792Th((C2742Qh) this.f27953b.f(), (C3153eo) this.f27954c.f());
            case 1:
                return new C2824Vh((ScheduledExecutorService) this.f27954c.f());
            case 2:
                return ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32008E3)).booleanValue() ? new C3441k7((InterfaceC3335i7) this.f27954c.f()) : new C3441k7((InterfaceC3335i7) this.f27953b.f());
            case 3:
                C3819r8 c3819r8 = (C3819r8) this.f27953b.f();
                C3250gd c3250gd = (C3250gd) this.f27954c.f();
                C3301ha c3301ha = AbstractC3569ma.f32036H6;
                q2.r rVar = q2.r.f40204e;
                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                    c3360ig = AbstractC3413jg.f31270c;
                } else {
                    c3360ig = ((Boolean) rVar.f40207c.a(AbstractC3569ma.f32029G6)).booleanValue() ? AbstractC3413jg.f31268a : AbstractC3413jg.f31273f;
                }
                AbstractC3341iD.j(c3360ig);
                return new C2841Wi(c3819r8.f33529c, c3250gd, c3360ig);
            case 4:
                C2934aj c2934aj = (C2934aj) this.f27953b.f();
                C3360ig c3360ig2 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig2);
                Set singleton = ((JSONObject) this.f27954c.f()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2491Bl(c2934aj, c3360ig2));
                AbstractC3341iD.j(singleton);
                return singleton;
            case 5:
                C2934aj c2934aj2 = (C2934aj) this.f27953b.f();
                C3360ig c3360ig3 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig3);
                Set singleton2 = ((JSONObject) this.f27954c.f()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2491Bl(c2934aj2, c3360ig3));
                AbstractC3341iD.j(singleton2);
                return singleton2;
            case 6:
                C2934aj c2934aj3 = (C2934aj) this.f27953b.f();
                C3360ig c3360ig4 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig4);
                Set singleton3 = ((JSONObject) this.f27954c.f()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2491Bl(c2934aj3, c3360ig4));
                AbstractC3341iD.j(singleton3);
                return singleton3;
            case 7:
                C2934aj c2934aj4 = (C2934aj) this.f27953b.f();
                C3360ig c3360ig5 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig5);
                Set singleton4 = ((JSONObject) this.f27954c.f()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2491Bl(c2934aj4, c3360ig5));
                AbstractC3341iD.j(singleton4);
                return singleton4;
            case 8:
                return new C2778Sj((T2.a) this.f27953b.f(), (C2870Yf) this.f27954c.f());
            case 9:
                return new C4826a((Context) this.f27953b.f(), (InterfaceC2468Af) this.f27954c.f());
            case 10:
                return new C2491Bl((C3097dl) this.f27953b.f(), (Executor) this.f27954c.f());
            case 11:
                return new C2491Bl((C3097dl) this.f27953b.f(), (Executor) this.f27954c.f());
            case 12:
                return new C2491Bl((C3097dl) this.f27953b.f(), (Executor) this.f27954c.f());
            case 13:
                return new C2491Bl((C3097dl) this.f27953b.f(), (Executor) this.f27954c.f());
            case 14:
                return new C2491Bl((C3097dl) this.f27953b.f(), (Executor) this.f27954c.f());
            case 15:
                return new C2491Bl((C3097dl) this.f27953b.f(), (Executor) this.f27954c.f());
            case 16:
                return new C2491Bl((C3097dl) this.f27953b.f(), (Executor) this.f27954c.f());
            case 17:
                return new C2491Bl((C3097dl) this.f27953b.f(), (Executor) this.f27954c.f());
            case 18:
                return new C2796Tl((C2762Rk) this.f27953b.f(), (C4227yl) this.f27954c.f());
            case 19:
                return new C3421jo((C3315ho) this.f27954c.f(), (String) this.f27953b.f());
            case 20:
                return new C2681Mo((C2494Bo) this.f27953b.f(), (C2731Pn) this.f27954c.f());
            case 21:
                Lu lu = (Lu) this.f27953b.f();
                C4835j.f39730C.f39738f.getClass();
                CookieManager l9 = a4.e.l();
                Ju ju = Ju.WEBVIEW_COOKIE;
                Objects.requireNonNull(lu);
                CallableC3549m7 callableC3549m7 = new CallableC3549m7(4, l9);
                ND nd = Lu.f26188d;
                List list = Collections.EMPTY_LIST;
                N3.a b9 = lu.f26189a.b(callableC3549m7);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                T8 t82 = new T8(lu, ju, null, nd, list, QC.s(b9, 1L, TimeUnit.SECONDS, lu.f26190b));
                C2556Fi c2556Fi = new C2556Fi(14);
                Lu lu2 = (Lu) t82.f27700y;
                return new T8(lu2, t82.f27697v, (String) t82.f27695n, (N3.a) t82.f27696u, (List) t82.f27698w, QC.r((N3.a) t82.f27699x, Exception.class, c2556Fi, lu2.f26189a)).s();
            case 22:
                return a();
            case 23:
                N3.a aVar = (N3.a) this.f27953b.f();
                C3360ig c3360ig6 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig6);
                return new Ur(0, aVar, c3360ig6, (ScheduledExecutorService) this.f27954c.f());
            case 24:
                C3360ig c3360ig7 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig7);
                C3749ps c3749ps = new C3749ps(c3360ig7, 2);
                T2.a aVar2 = (T2.a) this.f27953b.f();
                AbstractC3341iD.j(c3360ig7);
                return new C3695os(c3749ps, ((Long) AbstractC2565Ga.f24982f.r()).longValue(), aVar2, c3360ig7, (C3153eo) this.f27954c.f());
            case 25:
                return new Rt((T2.a) this.f27953b.f(), (C3153eo) this.f27954c.f());
            case 26:
                return new Qr((C3695os) this.f27953b.f(), ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Ld)).intValue(), (ScheduledExecutorService) this.f27954c.f());
            case 27:
                return new Qr((C3695os) this.f27953b.f(), ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.yd)).intValue(), (ScheduledExecutorService) this.f27954c.f());
            case 28:
                return new Jv((Kv) this.f27953b.f(), (Ev) this.f27954c.f());
            default:
                InterfaceC0413f interfaceC0413f = (InterfaceC0413f) this.f27953b.f();
                ExecutorService executorService = AbstractC3413jg.f31274g;
                AbstractC3341iD.j(executorService);
                return new Px(interfaceC0413f, new C4019ut(3, executorService), (C2697Nn) this.f27954c.f(), new C3586mr((byte) 0, 16));
        }
    }
}
