package com.google.android.gms.internal.ads;

import C2.C0279l;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import u2.C5069B;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Pj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2727Pj implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26843a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f26844b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f26845c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f26846d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3511lN f26847e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3511lN f26848f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC3511lN f26849g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC3511lN f26850h;
    public final InterfaceC3511lN i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC3511lN f26851j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC3511lN f26852k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC3511lN f26853l;

    public C2727Pj(C3578mj c3578mj, C3795qk c3795qk, C3243gN c3243gN, C2689Nf c2689Nf, C0279l c0279l, C3243gN c3243gN2, C3351iN c3351iN, C2689Nf c2689Nf2, C2727Pj c2727Pj, C2689Nf c2689Nf3, C3243gN c3243gN3) {
        this.f26843a = 0;
        this.f26847e = c3578mj;
        this.f26848f = c3795qk;
        this.f26844b = c3243gN;
        this.f26849g = c2689Nf;
        this.f26850h = c0279l;
        this.f26845c = c3243gN2;
        this.i = c3351iN;
        this.f26851j = c2689Nf2;
        this.f26852k = c2727Pj;
        this.f26853l = c2689Nf3;
        this.f26846d = c3243gN3;
    }

    public E3.j a() {
        Lu lu = (Lu) this.f26844b.f();
        C5110a b9 = ((C2987bi) this.f26847e).b();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f26845c.f();
        String packageName = ((C3040ci) this.f26849g).f29536b.a().getPackageName();
        AbstractC3341iD.j(packageName);
        C3301ha c3301ha = AbstractC3569ma.f32192a;
        ArrayList B9 = q2.r.f40204e.f40205a.B();
        PackageInfo packageInfo = (PackageInfo) this.f26846d.f();
        InterfaceC3135eN b10 = C3243gN.b((C3243gN) this.f26850h);
        C5069B b11 = ((C2888Zh) this.i).b();
        String str = (String) ((C3243gN) this.f26851j).f();
        C2570Gf a9 = ((Hs) this.f26852k).a();
        C3052cu a10 = ((C3795qk) this.f26848f).a();
        C3634nl c3634nl = (C3634nl) ((C3243gN) this.f26853l).f();
        E3.j jVar = new E3.j();
        jVar.f774a = lu;
        jVar.f775b = b9;
        jVar.f776c = applicationInfo;
        jVar.f777d = packageName;
        jVar.f778e = B9;
        jVar.f779f = packageInfo;
        jVar.f780g = b10;
        jVar.f781h = str;
        jVar.i = a9;
        jVar.f782j = b11;
        jVar.f783k = a10;
        jVar.f784l = c3634nl;
        return jVar;
    }

    public S0.q b() {
        return new S0.q(((C2676Mj) this.f26847e).b(), ((C2676Mj) this.f26848f).a(), (C2558Fk) this.f26844b.f(), (C2626Jk) this.f26849g.f(), ((C3903sl) this.f26850h).f34134b.f33718o, ((C4225yj) this.i).a(), (C3097dl) this.f26845c.f(), new C2660Lk(((C3956tk) this.f26851j).f34382b.f()), (C4281zl) this.f26846d.f(), (C3364ik) ((C3243gN) this.f26852k).f(), (C3691oo) ((C3243gN) this.f26853l).f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f26843a) {
            case 0:
                C3638np b9 = ((C3578mj) this.f26847e).b();
                C3052cu a9 = ((C3795qk) this.f26848f).a();
                Lu lu = (Lu) this.f26844b.f();
                C2689Nf c2689Nf = (C2689Nf) this.f26849g;
                S0.c cVar = new S0.c(13, ((C3403jN) c2689Nf.f26506b).f(), ((C3403jN) c2689Nf.f26507c).f());
                C2942ar a10 = ((C0279l) this.f26850h).a();
                C3526ll c3526ll = (C3526ll) this.f26845c.f();
                Yt yt = (Yt) ((C3351iN) this.i).f31039a;
                C2689Nf c2689Nf2 = (C2689Nf) this.f26851j;
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                C4274ze c4274ze = new C4274ze(11, c3360ig, ((C3040ci) c2689Nf2.f26506b).a(), C3243gN.b((C2709Oi) c2689Nf2.f26507c));
                E3.j a11 = ((C2727Pj) this.f26852k).a();
                AbstractC3341iD.j(c3360ig);
                C2689Nf c2689Nf3 = (C2689Nf) this.f26853l;
                C3457kN c3457kN = (C3457kN) c2689Nf3.f26506b;
                AbstractC3341iD.j(c3360ig);
                return new C2710Oj(b9, a9, lu, cVar, a10, c3526ll, yt, c4274ze, a11, c3360ig, new C4123wp(c3457kN.f30246a, c3360ig, new C2936al(((C3956tk) c2689Nf3.f26507c).f34382b.f())), (C3585mq) this.f26846d.f());
            case 1:
                return b();
            case 2:
                return a();
            case 3:
                C4274ze c4274ze2 = ((C2764Rm) this.f26847e).f27326b;
                C4274ze c4274ze3 = ((C2764Rm) this.f26849g).f27326b;
                C4274ze c4274ze4 = ((C2764Rm) this.f26850h).f27326b;
                return new C2747Qm((C3949td) c4274ze2.f35362w, (C4003ud) c4274ze3.f35361v, (InterfaceC4111wd) c4274ze4.f35360u, (C2507Ck) this.f26844b.f(), (C2811Uk) this.f26845c.f(), (C3902sk) this.f26846d.f(), (C2525Dl) ((C3243gN) this.i).f(), (Context) ((C3243gN) this.f26851j).f(), ((C2676Mj) this.f26852k).a(), ((C2987bi) this.f26853l).b(), ((C3795qk) this.f26848f).a());
            case 4:
                return new C3314hn(((C3795qk) this.f26848f).a(), (Executor) this.f26844b.f(), (C2612In) this.f26845c.f(), (Context) this.f26846d.f(), (C3153eo) ((C3243gN) this.f26847e).f(), (C4237yv) ((C3243gN) this.f26849g).f(), (C2800Tp) ((C3243gN) this.f26850h).f(), (C4175xn) ((C3243gN) this.i).f(), (C2993bo) ((C3243gN) this.f26851j).f(), (C3691oo) ((C3243gN) this.f26852k).f(), (C3311hk) this.f26853l.f());
            case 5:
                Context context = (Context) this.f26844b.f();
                C3441k7 c3441k7 = (C3441k7) this.f26845c.f();
                C2463Aa c2463Aa = (C2463Aa) this.f26846d.f();
                C5110a b10 = ((C2987bi) this.f26847e).b();
                Object obj = ((C4008ui) this.f26848f).f34561b;
                return new C2612In(context, c3441k7, c2463Aa, b10, C4008ui.b(), (C3068d9) ((C3243gN) this.f26849g).f(), (C2875Yk) ((InterfaceC3297hN) this.f26850h).f(), (BinderC2880Yp) ((C3243gN) this.i).f(), (C3213fu) ((C3243gN) this.f26851j).f(), (C3153eo) ((C3243gN) this.f26852k).f(), (C2742Qh) ((C3243gN) this.f26853l).f());
            default:
                return new BinderC3102dr((C3902sk) this.f26844b.f(), (C2525Dl) this.f26845c.f(), (C2507Ck) this.f26846d.f(), (C2575Gk) ((C3243gN) this.f26847e).f(), (C2626Jk) ((C3243gN) this.f26848f).f(), (C2473Ak) ((C3243gN) this.f26849g).f(), (C3365il) ((C3243gN) this.f26850h).f(), (C2661Ll) ((C3243gN) this.i).f(), (C2762Rk) ((C3243gN) this.f26851j).f(), (C2610Il) ((C3243gN) this.f26852k).f(), (C3258gl) ((C3243gN) this.f26853l).f());
        }
    }

    public C2727Pj(C2676Mj c2676Mj, C2676Mj c2676Mj2, C3243gN c3243gN, InterfaceC3511lN interfaceC3511lN, C3903sl c3903sl, C4225yj c4225yj, C3243gN c3243gN2, C3956tk c3956tk, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5) {
        this.f26843a = 1;
        this.f26847e = c2676Mj;
        this.f26848f = c2676Mj2;
        this.f26844b = c3243gN;
        this.f26849g = interfaceC3511lN;
        this.f26850h = c3903sl;
        this.i = c4225yj;
        this.f26845c = c3243gN2;
        this.f26851j = c3956tk;
        this.f26846d = c3243gN3;
        this.f26852k = c3243gN4;
        this.f26853l = c3243gN5;
    }

    public C2727Pj(C3795qk c3795qk, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5, C3243gN c3243gN6, C3243gN c3243gN7, C3243gN c3243gN8, C3243gN c3243gN9, InterfaceC3511lN interfaceC3511lN) {
        this.f26843a = 4;
        this.f26848f = c3795qk;
        this.f26844b = c3243gN;
        this.f26845c = c3243gN2;
        this.f26846d = c3243gN3;
        this.f26847e = c3243gN4;
        this.f26849g = c3243gN5;
        this.f26850h = c3243gN6;
        this.i = c3243gN7;
        this.f26851j = c3243gN8;
        this.f26852k = c3243gN9;
        this.f26853l = interfaceC3511lN;
    }

    public C2727Pj(C2764Rm c2764Rm, C2764Rm c2764Rm2, C2764Rm c2764Rm3, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5, C2676Mj c2676Mj, C2987bi c2987bi, C3795qk c3795qk) {
        this.f26843a = 3;
        this.f26847e = c2764Rm;
        this.f26849g = c2764Rm2;
        this.f26850h = c2764Rm3;
        this.f26844b = c3243gN;
        this.f26845c = c3243gN2;
        this.f26846d = c3243gN3;
        this.i = c3243gN4;
        this.f26851j = c3243gN5;
        this.f26852k = c2676Mj;
        this.f26853l = c2987bi;
        this.f26848f = c3795qk;
    }

    public C2727Pj(C3243gN c3243gN, C2987bi c2987bi, C3243gN c3243gN2, C3040ci c3040ci, C3243gN c3243gN3, C3243gN c3243gN4, C2888Zh c2888Zh, C3243gN c3243gN5, Hs hs, C3795qk c3795qk, C3243gN c3243gN6) {
        this.f26843a = 2;
        this.f26844b = c3243gN;
        this.f26847e = c2987bi;
        this.f26845c = c3243gN2;
        this.f26849g = c3040ci;
        this.f26846d = c3243gN3;
        this.f26850h = c3243gN4;
        this.i = c2888Zh;
        this.f26851j = c3243gN5;
        this.f26852k = hs;
        this.f26848f = c3795qk;
        this.f26853l = c3243gN6;
    }

    public /* synthetic */ C2727Pj(C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, InterfaceC3511lN interfaceC3511lN, InterfaceC3511lN interfaceC3511lN2, C3243gN c3243gN4, InterfaceC3511lN interfaceC3511lN3, C3243gN c3243gN5, C3243gN c3243gN6, C3243gN c3243gN7, C3243gN c3243gN8, int i) {
        this.f26843a = i;
        this.f26844b = c3243gN;
        this.f26845c = c3243gN2;
        this.f26846d = c3243gN3;
        this.f26847e = interfaceC3511lN;
        this.f26848f = interfaceC3511lN2;
        this.f26849g = c3243gN4;
        this.f26850h = interfaceC3511lN3;
        this.i = c3243gN5;
        this.f26851j = c3243gN6;
        this.f26852k = c3243gN7;
        this.f26853l = c3243gN8;
    }
}
