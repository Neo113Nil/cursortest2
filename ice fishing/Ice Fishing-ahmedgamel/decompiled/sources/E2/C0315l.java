package E2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3364iD;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.C2729Oi;
import com.google.android.gms.internal.ads.C2965ar;
import com.google.android.gms.internal.ads.C3010bi;
import com.google.android.gms.internal.ads.C3069co;
import com.google.android.gms.internal.ads.C3236fu;
import com.google.android.gms.internal.ads.C3266gN;
import com.google.android.gms.internal.ads.C3332hi;
import com.google.android.gms.internal.ads.C3374iN;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.C3391io;
import com.google.android.gms.internal.ads.C3464k7;
import com.google.android.gms.internal.ads.C3608mq;
import com.google.android.gms.internal.ads.C3612mu;
import com.google.android.gms.internal.ads.C4141wk;
import com.google.android.gms.internal.ads.C4206xv;
import com.google.android.gms.internal.ads.C4260yv;
import com.google.android.gms.internal.ads.C4293za;
import com.google.android.gms.internal.ads.InterfaceC2611Hj;
import com.google.android.gms.internal.ads.InterfaceC3320hN;
import com.google.android.gms.internal.ads.InterfaceC3534lN;
import com.google.android.gms.internal.ads.Lu;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.Xq;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: E2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315l implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f838a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C3010bi f839b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f840c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f841d;

    /* renamed from: e, reason: collision with root package name */
    public final C3266gN f842e;

    /* renamed from: f, reason: collision with root package name */
    public final C3266gN f843f;

    /* renamed from: g, reason: collision with root package name */
    public final C3266gN f844g;

    /* renamed from: h, reason: collision with root package name */
    public final C3266gN f845h;
    public final C3266gN i;

    /* renamed from: j, reason: collision with root package name */
    public final C3266gN f846j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f847k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC3320hN f848l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC3534lN f849m;

    public C0315l(C3010bi c3010bi, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5, C3266gN c3266gN6, C3266gN c3266gN7, C3266gN c3266gN8, C3266gN c3266gN9, C2729Oi c2729Oi, C3266gN c3266gN10) {
        this.f839b = c3010bi;
        this.f840c = c3266gN;
        this.f841d = c3266gN2;
        this.f842e = c3266gN3;
        this.f843f = c3266gN4;
        this.f844g = c3266gN5;
        this.f845h = c3266gN6;
        this.i = c3266gN7;
        this.f846j = c3266gN8;
        this.f847k = c3266gN9;
        this.f848l = c2729Oi;
        this.f849m = c3266gN10;
    }

    public C2965ar a() {
        Context a9 = this.f839b.a();
        Lu lu = (Lu) this.f840c.f();
        Xq xq = (Xq) this.f841d.f();
        C4141wk c4141wk = (C4141wk) this.f842e.f();
        C4206xv c4206xv = (C4206xv) this.f843f.f();
        C4260yv c4260yv = (C4260yv) this.f844g.f();
        InterfaceC2611Hj interfaceC2611Hj = (InterfaceC2611Hj) this.f845h.f();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new C2965ar(a9, lu, xq, c4141wk, c4206xv, c4260yv, interfaceC2611Hj, c3383ig, (ScheduledExecutorService) this.i.f(), (C3608mq) this.f846j.f(), (Vu) ((C3266gN) this.f847k).f(), ((C2729Oi) this.f848l).a(), (C3069co) ((C3266gN) this.f849m).f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f838a) {
            case 0:
                C3332hi c3332hi = (C3332hi) ((C3374iN) this.f847k).f31812a;
                Context a9 = this.f839b.a();
                C3464k7 c3464k7 = (C3464k7) this.f840c.f();
                C3612mu c3612mu = (C3612mu) this.f841d.f();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new BinderC0314k(c3332hi, a9, c3464k7, c3612mu, c3383ig, (ScheduledExecutorService) this.f842e.f(), (C3391io) this.f843f.f(), (C4260yv) this.f844g.f(), ((C3010bi) this.f848l).b(), ((C4293za) this.f849m).a(), (C3236fu) this.f845h.f(), (C) this.i.f(), (C0305b) this.f846j.f());
            default:
                return a();
        }
    }

    public C0315l(C3374iN c3374iN, C3010bi c3010bi, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5, C3010bi c3010bi2, C4293za c4293za, C3266gN c3266gN6, C3266gN c3266gN7, C3266gN c3266gN8) {
        this.f847k = c3374iN;
        this.f839b = c3010bi;
        this.f840c = c3266gN;
        this.f841d = c3266gN2;
        this.f842e = c3266gN3;
        this.f843f = c3266gN4;
        this.f844g = c3266gN5;
        this.f848l = c3010bi2;
        this.f849m = c4293za;
        this.f845h = c3266gN6;
        this.i = c3266gN7;
        this.f846j = c3266gN8;
    }
}
