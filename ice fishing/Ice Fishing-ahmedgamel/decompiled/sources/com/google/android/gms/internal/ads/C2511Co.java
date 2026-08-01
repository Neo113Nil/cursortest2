package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Co, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2511Co implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24228a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f24229b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f24230c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f24231d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3297hN f24232e;

    /* renamed from: f, reason: collision with root package name */
    public final C3243gN f24233f;

    /* renamed from: g, reason: collision with root package name */
    public final C3243gN f24234g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC3511lN f24235h;
    public final InterfaceC3511lN i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC3511lN f24236j;

    public C2511Co(C2987bi c2987bi, C2794Tj c2794Tj, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3795qk c3795qk, C3243gN c3243gN4, C3243gN c3243gN5, C3243gN c3243gN6) {
        this.f24235h = c2987bi;
        this.i = c2794Tj;
        this.f24229b = c3243gN;
        this.f24230c = c3243gN2;
        this.f24231d = c3243gN3;
        this.f24232e = c3795qk;
        this.f24233f = c3243gN4;
        this.f24234g = c3243gN5;
        this.f24236j = c3243gN6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f24228a) {
            case 0:
                Executor executor = (Executor) this.f24229b.f();
                Context a9 = ((C2987bi) this.f24235h).a();
                WeakReference weakReference = ((C2987bi) this.i).f29310b.f28709d;
                AbstractC3341iD.j(weakReference);
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C2494Bo(executor, a9, weakReference, c3360ig, (C2748Qn) this.f24230c.f(), (ScheduledExecutorService) this.f24231d.f(), (C3421jo) this.f24233f.f(), ((C2987bi) this.f24232e).b(), new C3957tl(((C3956tk) this.f24236j).f34382b.f()), (Wu) this.f24234g.f());
            case 1:
                return new Gr((Context) ((C3351iN) this.f24235h).f31039a, (q2.f1) ((C3351iN) this.i).f31039a, (String) ((C3351iN) this.f24236j).f31039a, (Gt) this.f24229b.f(), (Dr) this.f24230c.f(), (Jt) this.f24231d.f(), ((C2987bi) this.f24232e).b(), (C3441k7) this.f24233f.f(), (C3153eo) this.f24234g.f());
            case 2:
                Context a10 = ((C2987bi) this.f24235h).a();
                String str = ((C2778Sj) ((C2794Tj) this.i).f27785b.f()).f27540u.f28700e;
                AbstractC3341iD.j(str);
                return new C3319hs(a10, str, (String) this.f24229b.f(), (C2778Sj) this.f24230c.f(), (C3697ou) this.f24231d.f(), ((C3795qk) this.f24232e).a(), (C2993bo) this.f24233f.f(), (C2858Xj) this.f24234g.f(), ((Long) ((C3243gN) this.f24236j).f()).longValue());
            case 3:
                Xq xq = (Xq) this.f24229b.f();
                C5110a b9 = ((C2987bi) this.f24232e).b();
                String str2 = ((C2778Sj) ((C2794Tj) this.i).f27785b.f()).f27540u.f28700e;
                AbstractC3341iD.j(str2);
                return new C4183xv(xq, b9, str2, (String) this.f24230c.f(), ((C2987bi) this.f24235h).a(), ((C3795qk) this.f24236j).f33377b.f32935d, (C2945au) this.f24231d.f(), (T2.a) this.f24233f.f(), (C3441k7) this.f24234g.f());
            default:
                return new C2962bA((C4240yy) this.f24229b.f(), (C4240yy) this.f24230c.f(), C3243gN.b(this.f24231d), (C4240yy) this.f24233f.f(), (C4240yy) this.f24234g.f(), C3243gN.b((C3243gN) this.f24235h), (File) ((C3243gN) this.i).f(), (ExecutorService) ((C3351iN) this.f24232e).f31039a, (C3983uA) ((C3243gN) this.f24236j).f());
        }
    }

    public C2511Co(C3243gN c3243gN, C2987bi c2987bi, C2987bi c2987bi2, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C2987bi c2987bi3, C3956tk c3956tk, C3243gN c3243gN5) {
        this.f24229b = c3243gN;
        this.f24235h = c2987bi;
        this.i = c2987bi2;
        this.f24230c = c3243gN2;
        this.f24231d = c3243gN3;
        this.f24233f = c3243gN4;
        this.f24232e = c2987bi3;
        this.f24236j = c3956tk;
        this.f24234g = c3243gN5;
    }

    public C2511Co(C3243gN c3243gN, C2987bi c2987bi, C2794Tj c2794Tj, C3243gN c3243gN2, C2987bi c2987bi2, C3795qk c3795qk, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5) {
        this.f24229b = c3243gN;
        this.f24232e = c2987bi;
        this.i = c2794Tj;
        this.f24230c = c3243gN2;
        this.f24235h = c2987bi2;
        this.f24236j = c3795qk;
        this.f24231d = c3243gN3;
        this.f24233f = c3243gN4;
        this.f24234g = c3243gN5;
    }

    public C2511Co(C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5, C3243gN c3243gN6, C3243gN c3243gN7, C3351iN c3351iN, C3243gN c3243gN8) {
        this.f24229b = c3243gN;
        this.f24230c = c3243gN2;
        this.f24231d = c3243gN3;
        this.f24233f = c3243gN4;
        this.f24234g = c3243gN5;
        this.f24235h = c3243gN6;
        this.i = c3243gN7;
        this.f24232e = c3351iN;
        this.f24236j = c3243gN8;
    }

    public C2511Co(C3351iN c3351iN, C3351iN c3351iN2, C3351iN c3351iN3, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C2987bi c2987bi, C3243gN c3243gN4, C3243gN c3243gN5) {
        this.f24235h = c3351iN;
        this.i = c3351iN2;
        this.f24236j = c3351iN3;
        this.f24229b = c3243gN;
        this.f24230c = c3243gN2;
        this.f24231d = c3243gN3;
        this.f24232e = c2987bi;
        this.f24233f = c3243gN4;
        this.f24234g = c3243gN5;
    }
}
