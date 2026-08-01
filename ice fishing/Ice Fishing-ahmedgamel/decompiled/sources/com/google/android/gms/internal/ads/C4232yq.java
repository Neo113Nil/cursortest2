package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p2.C4835j;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.yq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4232yq implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35228a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f35229b;

    /* renamed from: c, reason: collision with root package name */
    public final C3351iN f35230c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f35231d;

    public /* synthetic */ C4232yq(C3243gN c3243gN, C3243gN c3243gN2, C3351iN c3351iN, int i) {
        this.f35228a = i;
        this.f35229b = c3243gN;
        this.f35231d = c3243gN2;
        this.f35230c = c3351iN;
    }

    public At a() {
        C2886Zf c2886Zf;
        C2886Zf c2886Zf2;
        switch (this.f35228a) {
            case 4:
                Context context = (Context) this.f35230c.f31039a;
                C3751pu c3751pu = (C3751pu) this.f35229b.f();
                C4290zu c4290zu = (C4290zu) this.f35231d.f();
                C3301ha c3301ha = AbstractC3569ma.f32284j7;
                q2.r rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                    c2886Zf = C4835j.f39733C.f39743h.g().n();
                } else {
                    C5069B g4 = C4835j.f39733C.f39743h.g();
                    synchronized (g4.f41209a) {
                        c2886Zf = g4.f41221n;
                    }
                }
                boolean z3 = false;
                if (c2886Zf != null && c2886Zf.f28921j) {
                    z3 = true;
                }
                if (((Integer) rVar.f40210c.a(AbstractC3569ma.f32431z7)).intValue() > 0) {
                    if (!((Boolean) rVar.f40210c.a(AbstractC3569ma.f32275i7)).booleanValue() || z3) {
                        C4236yu a9 = c4290zu.a(EnumC3912su.f34166v, context, c3751pu, new C4178xq(4, new C3694or(28)));
                        S0.c cVar = new S0.c(19, new C4019ut());
                        C3360ig c3360ig = AbstractC3413jg.f31268a;
                        C4274ze c4274ze = a9.f35238a;
                        return new T8(cVar, new C4274ze(c4274ze, c3360ig), a9.f35239b, ((C3966tu) c4274ze.f35361v).f34424z, c3360ig);
                    }
                }
                return new C4019ut();
            default:
                Context context2 = (Context) this.f35230c.f31039a;
                C3751pu c3751pu2 = (C3751pu) this.f35229b.f();
                C4290zu c4290zu2 = (C4290zu) this.f35231d.f();
                C3301ha c3301ha2 = AbstractC3569ma.f32284j7;
                q2.r rVar2 = q2.r.f40207e;
                if (((Boolean) rVar2.f40210c.a(c3301ha2)).booleanValue()) {
                    c2886Zf2 = C4835j.f39733C.f39743h.g().n();
                } else {
                    C5069B g9 = C4835j.f39733C.f39743h.g();
                    synchronized (g9.f41209a) {
                        c2886Zf2 = g9.f41221n;
                    }
                }
                boolean z6 = false;
                if (c2886Zf2 != null && c2886Zf2.f28921j) {
                    z6 = true;
                }
                if (((Integer) rVar2.f40210c.a(AbstractC3569ma.f32304l7)).intValue() > 0) {
                    if (!((Boolean) rVar2.f40210c.a(AbstractC3569ma.f32275i7)).booleanValue() || z6) {
                        C4236yu a10 = c4290zu2.a(EnumC3912su.f34164n, context2, c3751pu2, new C4178xq(4, new C3694or(28)));
                        S0.c cVar2 = new S0.c(19, new C4019ut());
                        C3360ig c3360ig2 = AbstractC3413jg.f31268a;
                        C4274ze c4274ze2 = a10.f35238a;
                        return new T8(cVar2, new C4274ze(c4274ze2, c3360ig2), a10.f35239b, ((C3966tu) c4274ze2.f35361v).f34424z, c3360ig2);
                    }
                }
                return new C4019ut();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f35228a) {
            case 0:
                return new C3908sq((Context) this.f35229b.f(), (C3577mi) this.f35230c.f31039a, (Executor) this.f35231d.f(), 1);
            case 1:
                return new C3908sq((Context) this.f35229b.f(), (C3201fi) this.f35230c.f31039a, (Executor) this.f35231d.f(), 2);
            case 2:
                return new C2996br((Context) this.f35229b.f(), (Executor) this.f35231d.f(), (C3900si) this.f35230c.f31039a, 0);
            case 3:
                return new C2996br((Context) this.f35229b.f(), (Executor) this.f35231d.f(), (C3900si) this.f35230c.f31039a, 1);
            case 4:
                return a();
            case 5:
                return a();
            case 6:
                InterfaceC3809qy interfaceC3809qy = ((C2949ay) this.f35230c.f31039a).i0() ? (InterfaceC3809qy) C3243gN.b(this.f35229b).f() : (InterfaceC3809qy) C3243gN.b(this.f35231d).f();
                AbstractC3341iD.j(interfaceC3809qy);
                return interfaceC3809qy;
            case 7:
                return new C3648nz("yVK2BtjhkWiqPWfXVe7pCdqpfz2Ps9CcWbBtlKTt4FN37/tD76f0HDGVwAjTsvKH", "Fo5nkU2nfGSO+g2iGIxI5+P04k6pQ8lbcFZjpNOd5oc=", (C3979u6) this.f35230c.f31039a, (C3218fz) this.f35229b.f(), ((C3983uA) this.f35231d.f()).a(114), 1);
            case 8:
                return new C3648nz("50+sX4d44jerXZ0t37Z07Ss5Y2LVKA0u1WWlTsyrM+njWBpcjf8xU2ZOd5yoshWp", "IaakTOOFGOw3T0IOJ/LBUMRFnsvXDEiR+LxXdy42JcU=", (C3979u6) this.f35230c.f31039a, (C3218fz) this.f35229b.f(), ((C3983uA) this.f35231d.f()).a(117), 0);
            case 9:
                Context context = (Context) this.f35230c.f31039a;
                return new Hz(context, context.getSharedPreferences("pcvmspf2", 0), C3243gN.b(this.f35229b), (C3983uA) this.f35231d.f());
            case 10:
                InterfaceC3135eN b9 = C3243gN.b(this.f35229b);
                InterfaceC3135eN b10 = C3243gN.b(this.f35231d);
                if (true == ((C2949ay) this.f35230c.f31039a).h0()) {
                    b9 = b10;
                }
                Zz zz = (Zz) b9.f();
                AbstractC3341iD.j(zz);
                return zz;
            case 11:
                return new C3122eA((Hz) this.f35229b.f(), (ExecutorService) this.f35230c.f31039a, (C3983uA) this.f35231d.f());
            default:
                return new C3444kA((C3983uA) this.f35231d.f(), ((C2949ay) this.f35230c.f31039a).X().B());
        }
    }

    public /* synthetic */ C4232yq(C3243gN c3243gN, C3351iN c3351iN, C3243gN c3243gN2, int i) {
        this.f35228a = i;
        this.f35229b = c3243gN;
        this.f35230c = c3351iN;
        this.f35231d = c3243gN2;
    }

    public /* synthetic */ C4232yq(C3351iN c3351iN, C3243gN c3243gN, C3243gN c3243gN2, int i) {
        this.f35228a = i;
        this.f35230c = c3351iN;
        this.f35229b = c3243gN;
        this.f35231d = c3243gN2;
    }
}
