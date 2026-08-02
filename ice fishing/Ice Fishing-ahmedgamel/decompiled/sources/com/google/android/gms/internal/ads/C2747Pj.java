package com.google.android.gms.internal.ads;

import E2.C0315l;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import w2.C5140B;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Pj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2747Pj implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27631a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f27632b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f27633c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f27634d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3534lN f27635e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3534lN f27636f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC3534lN f27637g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC3534lN f27638h;
    public final InterfaceC3534lN i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC3534lN f27639j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC3534lN f27640k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC3534lN f27641l;

    public C2747Pj(C3601mj c3601mj, C3818qk c3818qk, C3266gN c3266gN, C2709Nf c2709Nf, C0315l c0315l, C3266gN c3266gN2, C3374iN c3374iN, C2709Nf c2709Nf2, C2747Pj c2747Pj, C2709Nf c2709Nf3, C3266gN c3266gN3) {
        this.f27631a = 0;
        this.f27635e = c3601mj;
        this.f27636f = c3818qk;
        this.f27632b = c3266gN;
        this.f27637g = c2709Nf;
        this.f27638h = c0315l;
        this.f27633c = c3266gN2;
        this.i = c3374iN;
        this.f27639j = c2709Nf2;
        this.f27640k = c2747Pj;
        this.f27641l = c2709Nf3;
        this.f27634d = c3266gN3;
    }

    public G3.j a() {
        Lu lu = (Lu) this.f27632b.f();
        C5189a b9 = ((C3010bi) this.f27635e).b();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f27633c.f();
        String packageName = ((C3063ci) this.f27637g).f30321b.a().getPackageName();
        AbstractC3364iD.j(packageName);
        C3324ha c3324ha = AbstractC3592ma.f32971a;
        ArrayList A9 = s2.r.f40506e.f40507a.A();
        PackageInfo packageInfo = (PackageInfo) this.f27634d.f();
        InterfaceC3158eN b10 = C3266gN.b((C3266gN) this.f27638h);
        C5140B b11 = ((C2911Zh) this.i).b();
        String str = (String) ((C3266gN) this.f27639j).f();
        C2590Gf a9 = ((Hs) this.f27640k).a();
        C3075cu a10 = ((C3818qk) this.f27636f).a();
        C3657nl c3657nl = (C3657nl) ((C3266gN) this.f27641l).f();
        G3.j jVar = new G3.j();
        jVar.f1116a = lu;
        jVar.f1117b = b9;
        jVar.f1118c = applicationInfo;
        jVar.f1119d = packageName;
        jVar.f1120e = A9;
        jVar.f1121f = packageInfo;
        jVar.f1122g = b10;
        jVar.f1123h = str;
        jVar.i = a9;
        jVar.f1124j = b11;
        jVar.f1125k = a10;
        jVar.f1126l = c3657nl;
        return jVar;
    }

    public S0.q b() {
        return new S0.q(((C2696Mj) this.f27635e).b(), ((C2696Mj) this.f27636f).a(), (C2578Fk) this.f27632b.f(), (C2646Jk) this.f27637g.f(), ((C3926sl) this.f27638h).f34901b.f34490o, ((C4248yj) this.i).a(), (C3120dl) this.f27633c.f(), new C2680Lk(((C3979tk) this.f27639j).f35161b.f()), (C2494Al) this.f27634d.f(), (C3387ik) ((C3266gN) this.f27640k).f(), (C3768po) ((C3266gN) this.f27641l).f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f27631a) {
            case 0:
                C3661np b9 = ((C3601mj) this.f27635e).b();
                C3075cu a9 = ((C3818qk) this.f27636f).a();
                Lu lu = (Lu) this.f27632b.f();
                C2709Nf c2709Nf = (C2709Nf) this.f27637g;
                S0.c cVar = new S0.c(16, ((C3426jN) c2709Nf.f27289b).f(), ((C3426jN) c2709Nf.f27290c).f());
                C2965ar a10 = ((C0315l) this.f27638h).a();
                C3549ll c3549ll = (C3549ll) this.f27633c.f();
                Yt yt = (Yt) ((C3374iN) this.i).f31812a;
                C2709Nf c2709Nf2 = (C2709Nf) this.f27639j;
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                C4297ze c4297ze = new C4297ze(11, c3383ig, ((C3063ci) c2709Nf2.f27289b).a(), C3266gN.b((C2729Oi) c2709Nf2.f27290c));
                G3.j a11 = ((C2747Pj) this.f27640k).a();
                AbstractC3364iD.j(c3383ig);
                C2709Nf c2709Nf3 = (C2709Nf) this.f27641l;
                C3480kN c3480kN = (C3480kN) c2709Nf3.f27289b;
                AbstractC3364iD.j(c3383ig);
                return new C2730Oj(b9, a9, lu, cVar, a10, c3549ll, yt, c4297ze, a11, c3383ig, new C4146wp(c3480kN.f31033a, c3383ig, new C2959al(((C3979tk) c2709Nf3.f27290c).f35161b.f())), (C3608mq) this.f27634d.f());
            case 1:
                return b();
            case 2:
                return a();
            case 3:
                C4297ze c4297ze2 = ((C2801Sm) this.f27635e).f28340b;
                C4297ze c4297ze3 = ((C2801Sm) this.f27637g).f28340b;
                C4297ze c4297ze4 = ((C2801Sm) this.f27638h).f28340b;
                return new C2784Rm((C3972td) c4297ze2.f36135w, (C4026ud) c4297ze3.f36134v, (InterfaceC4134wd) c4297ze4.f36133u, (C2527Ck) this.f27632b.f(), (C2833Uk) this.f27633c.f(), (C3925sk) this.f27634d.f(), (C2562El) ((C3266gN) this.i).f(), (Context) ((C3266gN) this.f27639j).f(), ((C2696Mj) this.f27640k).a(), ((C3010bi) this.f27641l).b(), ((C3818qk) this.f27636f).a());
            case 4:
                return new C3390in(((C3818qk) this.f27636f).a(), (Executor) this.f27632b.f(), (C2649Jn) this.f27633c.f(), (Context) this.f27634d.f(), (C3230fo) ((C3266gN) this.f27635e).f(), (C4260yv) ((C3266gN) this.f27637g).f(), (C2821Tp) ((C3266gN) this.f27638h).f(), (C4252yn) ((C3266gN) this.i).f(), (C3069co) ((C3266gN) this.f27639j).f(), (C3768po) ((C3266gN) this.f27640k).f(), (C3334hk) this.f27641l.f());
            case 5:
                Context context = (Context) this.f27632b.f();
                C3464k7 c3464k7 = (C3464k7) this.f27633c.f();
                C2483Aa c2483Aa = (C2483Aa) this.f27634d.f();
                C5189a b10 = ((C3010bi) this.f27635e).b();
                Object obj = ((C4031ui) this.f27636f).f35333b;
                return new C2649Jn(context, c3464k7, c2483Aa, b10, C4031ui.b(), (C3091d9) ((C3266gN) this.f27637g).f(), (C2898Yk) ((InterfaceC3320hN) this.f27638h).f(), (BinderC2903Yp) ((C3266gN) this.i).f(), (C3236fu) ((C3266gN) this.f27639j).f(), (C3230fo) ((C3266gN) this.f27640k).f(), (C2762Qh) ((C3266gN) this.f27641l).f());
            default:
                return new BinderC3125dr((C3925sk) this.f27632b.f(), (C2562El) this.f27633c.f(), (C2527Ck) this.f27634d.f(), (C2595Gk) ((C3266gN) this.f27635e).f(), (C2646Jk) ((C3266gN) this.f27636f).f(), (C2493Ak) ((C3266gN) this.f27637g).f(), (C3388il) ((C3266gN) this.f27638h).f(), (C2698Ml) ((C3266gN) this.i).f(), (C2782Rk) ((C3266gN) this.f27639j).f(), (C2647Jl) ((C3266gN) this.f27640k).f(), (C3281gl) ((C3266gN) this.f27641l).f());
        }
    }

    public C2747Pj(C2696Mj c2696Mj, C2696Mj c2696Mj2, C3266gN c3266gN, InterfaceC3534lN interfaceC3534lN, C3926sl c3926sl, C4248yj c4248yj, C3266gN c3266gN2, C3979tk c3979tk, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5) {
        this.f27631a = 1;
        this.f27635e = c2696Mj;
        this.f27636f = c2696Mj2;
        this.f27632b = c3266gN;
        this.f27637g = interfaceC3534lN;
        this.f27638h = c3926sl;
        this.i = c4248yj;
        this.f27633c = c3266gN2;
        this.f27639j = c3979tk;
        this.f27634d = c3266gN3;
        this.f27640k = c3266gN4;
        this.f27641l = c3266gN5;
    }

    public C2747Pj(C3818qk c3818qk, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5, C3266gN c3266gN6, C3266gN c3266gN7, C3266gN c3266gN8, C3266gN c3266gN9, InterfaceC3534lN interfaceC3534lN) {
        this.f27631a = 4;
        this.f27636f = c3818qk;
        this.f27632b = c3266gN;
        this.f27633c = c3266gN2;
        this.f27634d = c3266gN3;
        this.f27635e = c3266gN4;
        this.f27637g = c3266gN5;
        this.f27638h = c3266gN6;
        this.i = c3266gN7;
        this.f27639j = c3266gN8;
        this.f27640k = c3266gN9;
        this.f27641l = interfaceC3534lN;
    }

    public C2747Pj(C2801Sm c2801Sm, C2801Sm c2801Sm2, C2801Sm c2801Sm3, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5, C2696Mj c2696Mj, C3010bi c3010bi, C3818qk c3818qk) {
        this.f27631a = 3;
        this.f27635e = c2801Sm;
        this.f27637g = c2801Sm2;
        this.f27638h = c2801Sm3;
        this.f27632b = c3266gN;
        this.f27633c = c3266gN2;
        this.f27634d = c3266gN3;
        this.i = c3266gN4;
        this.f27639j = c3266gN5;
        this.f27640k = c2696Mj;
        this.f27641l = c3010bi;
        this.f27636f = c3818qk;
    }

    public C2747Pj(C3266gN c3266gN, C3010bi c3010bi, C3266gN c3266gN2, C3063ci c3063ci, C3266gN c3266gN3, C3266gN c3266gN4, C2911Zh c2911Zh, C3266gN c3266gN5, Hs hs, C3818qk c3818qk, C3266gN c3266gN6) {
        this.f27631a = 2;
        this.f27632b = c3266gN;
        this.f27635e = c3010bi;
        this.f27633c = c3266gN2;
        this.f27637g = c3063ci;
        this.f27634d = c3266gN3;
        this.f27638h = c3266gN4;
        this.i = c2911Zh;
        this.f27639j = c3266gN5;
        this.f27640k = hs;
        this.f27636f = c3818qk;
        this.f27641l = c3266gN6;
    }

    public /* synthetic */ C2747Pj(C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, InterfaceC3534lN interfaceC3534lN, InterfaceC3534lN interfaceC3534lN2, C3266gN c3266gN4, InterfaceC3534lN interfaceC3534lN3, C3266gN c3266gN5, C3266gN c3266gN6, C3266gN c3266gN7, C3266gN c3266gN8, int i) {
        this.f27631a = i;
        this.f27632b = c3266gN;
        this.f27633c = c3266gN2;
        this.f27634d = c3266gN3;
        this.f27635e = interfaceC3534lN;
        this.f27636f = interfaceC3534lN2;
        this.f27637g = c3266gN4;
        this.f27638h = interfaceC3534lN3;
        this.i = c3266gN5;
        this.f27639j = c3266gN6;
        this.f27640k = c3266gN7;
        this.f27641l = c3266gN8;
    }
}
