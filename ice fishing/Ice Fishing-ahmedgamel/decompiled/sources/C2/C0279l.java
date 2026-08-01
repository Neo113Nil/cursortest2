package C2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3341iD;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.C2709Oi;
import com.google.android.gms.internal.ads.C2942ar;
import com.google.android.gms.internal.ads.C2987bi;
import com.google.android.gms.internal.ads.C2993bo;
import com.google.android.gms.internal.ads.C3213fu;
import com.google.android.gms.internal.ads.C3243gN;
import com.google.android.gms.internal.ads.C3309hi;
import com.google.android.gms.internal.ads.C3315ho;
import com.google.android.gms.internal.ads.C3351iN;
import com.google.android.gms.internal.ads.C3360ig;
import com.google.android.gms.internal.ads.C3441k7;
import com.google.android.gms.internal.ads.C3585mq;
import com.google.android.gms.internal.ads.C3589mu;
import com.google.android.gms.internal.ads.C4118wk;
import com.google.android.gms.internal.ads.C4183xv;
import com.google.android.gms.internal.ads.C4237yv;
import com.google.android.gms.internal.ads.C4270za;
import com.google.android.gms.internal.ads.InterfaceC2591Hj;
import com.google.android.gms.internal.ads.InterfaceC3297hN;
import com.google.android.gms.internal.ads.InterfaceC3511lN;
import com.google.android.gms.internal.ads.Lu;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.Xq;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: C2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279l implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f378a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C2987bi f379b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f380c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f381d;

    /* renamed from: e, reason: collision with root package name */
    public final C3243gN f382e;

    /* renamed from: f, reason: collision with root package name */
    public final C3243gN f383f;

    /* renamed from: g, reason: collision with root package name */
    public final C3243gN f384g;

    /* renamed from: h, reason: collision with root package name */
    public final C3243gN f385h;
    public final C3243gN i;

    /* renamed from: j, reason: collision with root package name */
    public final C3243gN f386j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f387k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC3297hN f388l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC3511lN f389m;

    public C0279l(C2987bi c2987bi, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5, C3243gN c3243gN6, C3243gN c3243gN7, C3243gN c3243gN8, C3243gN c3243gN9, C2709Oi c2709Oi, C3243gN c3243gN10) {
        this.f379b = c2987bi;
        this.f380c = c3243gN;
        this.f381d = c3243gN2;
        this.f382e = c3243gN3;
        this.f383f = c3243gN4;
        this.f384g = c3243gN5;
        this.f385h = c3243gN6;
        this.i = c3243gN7;
        this.f386j = c3243gN8;
        this.f387k = c3243gN9;
        this.f388l = c2709Oi;
        this.f389m = c3243gN10;
    }

    public C2942ar a() {
        Context a9 = this.f379b.a();
        Lu lu = (Lu) this.f380c.f();
        Xq xq = (Xq) this.f381d.f();
        C4118wk c4118wk = (C4118wk) this.f382e.f();
        C4183xv c4183xv = (C4183xv) this.f383f.f();
        C4237yv c4237yv = (C4237yv) this.f384g.f();
        InterfaceC2591Hj interfaceC2591Hj = (InterfaceC2591Hj) this.f385h.f();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new C2942ar(a9, lu, xq, c4118wk, c4183xv, c4237yv, interfaceC2591Hj, c3360ig, (ScheduledExecutorService) this.i.f(), (C3585mq) this.f386j.f(), (Vu) ((C3243gN) this.f387k).f(), ((C2709Oi) this.f388l).a(), (C2993bo) ((C3243gN) this.f389m).f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f378a) {
            case 0:
                C3309hi c3309hi = (C3309hi) ((C3351iN) this.f387k).f31039a;
                Context a9 = this.f379b.a();
                C3441k7 c3441k7 = (C3441k7) this.f380c.f();
                C3589mu c3589mu = (C3589mu) this.f381d.f();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new BinderC0278k(c3309hi, a9, c3441k7, c3589mu, c3360ig, (ScheduledExecutorService) this.f382e.f(), (C3315ho) this.f383f.f(), (C4237yv) this.f384g.f(), ((C2987bi) this.f388l).b(), ((C4270za) this.f389m).a(), (C3213fu) this.f385h.f(), (D) this.i.f(), (C0269b) this.f386j.f());
            default:
                return a();
        }
    }

    public C0279l(C3351iN c3351iN, C2987bi c2987bi, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5, C2987bi c2987bi2, C4270za c4270za, C3243gN c3243gN6, C3243gN c3243gN7, C3243gN c3243gN8) {
        this.f387k = c3351iN;
        this.f379b = c2987bi;
        this.f380c = c3243gN;
        this.f381d = c3243gN2;
        this.f382e = c3243gN3;
        this.f383f = c3243gN4;
        this.f384g = c3243gN5;
        this.f388l = c2987bi2;
        this.f389m = c4270za;
        this.f385h = c3243gN6;
        this.i = c3243gN7;
        this.f386j = c3243gN8;
    }
}
