package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Do, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2548Do implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25214a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f25215b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f25216c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f25217d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3320hN f25218e;

    /* renamed from: f, reason: collision with root package name */
    public final C3266gN f25219f;

    /* renamed from: g, reason: collision with root package name */
    public final C3266gN f25220g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC3534lN f25221h;
    public final InterfaceC3534lN i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC3534lN f25222j;

    public C2548Do(C3010bi c3010bi, C2815Tj c2815Tj, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3818qk c3818qk, C3266gN c3266gN4, C3266gN c3266gN5, C3266gN c3266gN6) {
        this.f25221h = c3010bi;
        this.i = c2815Tj;
        this.f25215b = c3266gN;
        this.f25216c = c3266gN2;
        this.f25217d = c3266gN3;
        this.f25218e = c3818qk;
        this.f25219f = c3266gN4;
        this.f25220g = c3266gN5;
        this.f25222j = c3266gN6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f25214a) {
            case 0:
                Executor executor = (Executor) this.f25215b.f();
                Context a9 = ((C3010bi) this.f25221h).a();
                WeakReference weakReference = ((C3010bi) this.i).f30099b.f29484d;
                AbstractC3364iD.j(weakReference);
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C2531Co(executor, a9, weakReference, c3383ig, (C2785Rn) this.f25216c.f(), (ScheduledExecutorService) this.f25217d.f(), (C3498ko) this.f25219f.f(), ((C3010bi) this.f25218e).b(), new C4034ul(((C3979tk) this.f25222j).f35161b.f()), (Wu) this.f25220g.f());
            case 1:
                return new Gr((Context) ((C3374iN) this.f25221h).f31812a, (s2.f1) ((C3374iN) this.i).f31812a, (String) ((C3374iN) this.f25222j).f31812a, (Gt) this.f25215b.f(), (Dr) this.f25216c.f(), (Jt) this.f25217d.f(), ((C3010bi) this.f25218e).b(), (C3464k7) this.f25219f.f(), (C3230fo) this.f25220g.f());
            case 2:
                Context a10 = ((C3010bi) this.f25221h).a();
                String str = ((C2798Sj) ((C2815Tj) this.i).f28572b.f()).f28332u.f29475e;
                AbstractC3364iD.j(str);
                return new C3342hs(a10, str, (String) this.f25215b.f(), (C2798Sj) this.f25216c.f(), (C3720ou) this.f25217d.f(), ((C3818qk) this.f25218e).a(), (C3069co) this.f25219f.f(), (C2881Xj) this.f25220g.f(), ((Long) ((C3266gN) this.f25222j).f()).longValue());
            case 3:
                Xq xq = (Xq) this.f25215b.f();
                C5189a b9 = ((C3010bi) this.f25218e).b();
                String str2 = ((C2798Sj) ((C2815Tj) this.i).f28572b.f()).f28332u.f29475e;
                AbstractC3364iD.j(str2);
                return new C4206xv(xq, b9, str2, (String) this.f25216c.f(), ((C3010bi) this.f25221h).a(), ((C3818qk) this.f25222j).f34159b.f33721d, (C2968au) this.f25217d.f(), (V2.a) this.f25219f.f(), (C3464k7) this.f25220g.f());
            default:
                return new C2985bA((C4263yy) this.f25215b.f(), (C4263yy) this.f25216c.f(), C3266gN.b(this.f25217d), (C4263yy) this.f25219f.f(), (C4263yy) this.f25220g.f(), C3266gN.b((C3266gN) this.f25221h), (File) ((C3266gN) this.i).f(), (ExecutorService) ((C3374iN) this.f25218e).f31812a, (C4006uA) ((C3266gN) this.f25222j).f());
        }
    }

    public C2548Do(C3266gN c3266gN, C3010bi c3010bi, C3010bi c3010bi2, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3010bi c3010bi3, C3979tk c3979tk, C3266gN c3266gN5) {
        this.f25215b = c3266gN;
        this.f25221h = c3010bi;
        this.i = c3010bi2;
        this.f25216c = c3266gN2;
        this.f25217d = c3266gN3;
        this.f25219f = c3266gN4;
        this.f25218e = c3010bi3;
        this.f25222j = c3979tk;
        this.f25220g = c3266gN5;
    }

    public C2548Do(C3266gN c3266gN, C3010bi c3010bi, C2815Tj c2815Tj, C3266gN c3266gN2, C3010bi c3010bi2, C3818qk c3818qk, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5) {
        this.f25215b = c3266gN;
        this.f25218e = c3010bi;
        this.i = c2815Tj;
        this.f25216c = c3266gN2;
        this.f25221h = c3010bi2;
        this.f25222j = c3818qk;
        this.f25217d = c3266gN3;
        this.f25219f = c3266gN4;
        this.f25220g = c3266gN5;
    }

    public C2548Do(C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5, C3266gN c3266gN6, C3266gN c3266gN7, C3374iN c3374iN, C3266gN c3266gN8) {
        this.f25215b = c3266gN;
        this.f25216c = c3266gN2;
        this.f25217d = c3266gN3;
        this.f25219f = c3266gN4;
        this.f25220g = c3266gN5;
        this.f25221h = c3266gN6;
        this.i = c3266gN7;
        this.f25218e = c3374iN;
        this.f25222j = c3266gN8;
    }

    public C2548Do(C3374iN c3374iN, C3374iN c3374iN2, C3374iN c3374iN3, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3010bi c3010bi, C3266gN c3266gN4, C3266gN c3266gN5) {
        this.f25221h = c3374iN;
        this.i = c3374iN2;
        this.f25222j = c3374iN3;
        this.f25215b = c3266gN;
        this.f25216c = c3266gN2;
        this.f25217d = c3266gN3;
        this.f25218e = c3010bi;
        this.f25219f = c3266gN4;
        this.f25220g = c3266gN5;
    }
}
