package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import r2.C4906k;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.yq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4255yq implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36012a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f36013b;

    /* renamed from: c, reason: collision with root package name */
    public final C3374iN f36014c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f36015d;

    public /* synthetic */ C4255yq(C3266gN c3266gN, C3266gN c3266gN2, C3374iN c3374iN, int i) {
        this.f36012a = i;
        this.f36013b = c3266gN;
        this.f36015d = c3266gN2;
        this.f36014c = c3374iN;
    }

    public At a() {
        C2909Zf c2909Zf;
        C2909Zf c2909Zf2;
        switch (this.f36012a) {
            case 4:
                Context context = (Context) this.f36014c.f31812a;
                C3774pu c3774pu = (C3774pu) this.f36013b.f();
                C4313zu c4313zu = (C4313zu) this.f36015d.f();
                C3324ha c3324ha = AbstractC3592ma.f33063j7;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    c2909Zf = C4906k.f40186C.f40196h.g().n();
                } else {
                    C5140B g9 = C4906k.f40186C.f40196h.g();
                    synchronized (g9.f41599a) {
                        c2909Zf = g9.f41611n;
                    }
                }
                boolean z6 = false;
                if (c2909Zf != null && c2909Zf.f29698j) {
                    z6 = true;
                }
                if (((Integer) rVar.f40509c.a(AbstractC3592ma.f33211z7)).intValue() > 0) {
                    if (!((Boolean) rVar.f40509c.a(AbstractC3592ma.f33054i7)).booleanValue() || z6) {
                        C4259yu a9 = c4313zu.a(EnumC3935su.f34952v, context, c3774pu, new C4201xq(4, new C3717or(28)));
                        S0.c cVar = new S0.c((Object) new C4042ut(), 22, (byte) 0);
                        C3383ig c3383ig = AbstractC3436jg.f32055a;
                        C4297ze c4297ze = a9.f36022a;
                        return new T8(cVar, new C4297ze(c4297ze, c3383ig), a9.f36023b, ((C3989tu) c4297ze.f36134v).f35198z, c3383ig);
                    }
                }
                return new C4042ut();
            default:
                Context context2 = (Context) this.f36014c.f31812a;
                C3774pu c3774pu2 = (C3774pu) this.f36013b.f();
                C4313zu c4313zu2 = (C4313zu) this.f36015d.f();
                C3324ha c3324ha2 = AbstractC3592ma.f33063j7;
                s2.r rVar2 = s2.r.f40506e;
                if (((Boolean) rVar2.f40509c.a(c3324ha2)).booleanValue()) {
                    c2909Zf2 = C4906k.f40186C.f40196h.g().n();
                } else {
                    C5140B g10 = C4906k.f40186C.f40196h.g();
                    synchronized (g10.f41599a) {
                        c2909Zf2 = g10.f41611n;
                    }
                }
                boolean z9 = false;
                if (c2909Zf2 != null && c2909Zf2.f29698j) {
                    z9 = true;
                }
                if (((Integer) rVar2.f40509c.a(AbstractC3592ma.f33083l7)).intValue() > 0) {
                    if (!((Boolean) rVar2.f40509c.a(AbstractC3592ma.f33054i7)).booleanValue() || z9) {
                        C4259yu a10 = c4313zu2.a(EnumC3935su.f34950n, context2, c3774pu2, new C4201xq(4, new C3717or(28)));
                        S0.c cVar2 = new S0.c((Object) new C4042ut(), 22, (byte) 0);
                        C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                        C4297ze c4297ze2 = a10.f36022a;
                        return new T8(cVar2, new C4297ze(c4297ze2, c3383ig2), a10.f36023b, ((C3989tu) c4297ze2.f36134v).f35198z, c3383ig2);
                    }
                }
                return new C4042ut();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f36012a) {
            case 0:
                return new C3931sq((Context) this.f36013b.f(), (C3600mi) this.f36014c.f31812a, (Executor) this.f36015d.f(), 1);
            case 1:
                return new C3931sq((Context) this.f36013b.f(), (C3224fi) this.f36014c.f31812a, (Executor) this.f36015d.f(), 2);
            case 2:
                return new C3019br((Context) this.f36013b.f(), (Executor) this.f36015d.f(), (C3923si) this.f36014c.f31812a, 0);
            case 3:
                return new C3019br((Context) this.f36013b.f(), (Executor) this.f36015d.f(), (C3923si) this.f36014c.f31812a, 1);
            case 4:
                return a();
            case 5:
                return a();
            case 6:
                InterfaceC3832qy interfaceC3832qy = ((C2972ay) this.f36014c.f31812a).i0() ? (InterfaceC3832qy) C3266gN.b(this.f36013b).f() : (InterfaceC3832qy) C3266gN.b(this.f36015d).f();
                AbstractC3364iD.j(interfaceC3832qy);
                return interfaceC3832qy;
            case 7:
                return new C3671nz("yVK2BtjhkWiqPWfXVe7pCdqpfz2Ps9CcWbBtlKTt4FN37/tD76f0HDGVwAjTsvKH", "Fo5nkU2nfGSO+g2iGIxI5+P04k6pQ8lbcFZjpNOd5oc=", (C4002u6) this.f36014c.f31812a, (C3241fz) this.f36013b.f(), ((C4006uA) this.f36015d.f()).a(114), 1);
            case 8:
                return new C3671nz("50+sX4d44jerXZ0t37Z07Ss5Y2LVKA0u1WWlTsyrM+njWBpcjf8xU2ZOd5yoshWp", "IaakTOOFGOw3T0IOJ/LBUMRFnsvXDEiR+LxXdy42JcU=", (C4002u6) this.f36014c.f31812a, (C3241fz) this.f36013b.f(), ((C4006uA) this.f36015d.f()).a(117), 0);
            case 9:
                Context context = (Context) this.f36014c.f31812a;
                return new Hz(context, context.getSharedPreferences("pcvmspf2", 0), C3266gN.b(this.f36013b), (C4006uA) this.f36015d.f());
            case 10:
                InterfaceC3158eN b9 = C3266gN.b(this.f36013b);
                InterfaceC3158eN b10 = C3266gN.b(this.f36015d);
                if (true == ((C2972ay) this.f36014c.f31812a).h0()) {
                    b9 = b10;
                }
                Zz zz = (Zz) b9.f();
                AbstractC3364iD.j(zz);
                return zz;
            case 11:
                return new C3145eA((Hz) this.f36013b.f(), (ExecutorService) this.f36014c.f31812a, (C4006uA) this.f36015d.f());
            default:
                return new C3467kA((C4006uA) this.f36015d.f(), ((C2972ay) this.f36014c.f31812a).X().B());
        }
    }

    public /* synthetic */ C4255yq(C3266gN c3266gN, C3374iN c3374iN, C3266gN c3266gN2, int i) {
        this.f36012a = i;
        this.f36013b = c3266gN;
        this.f36014c = c3374iN;
        this.f36015d = c3266gN2;
    }

    public /* synthetic */ C4255yq(C3374iN c3374iN, C3266gN c3266gN, C3266gN c3266gN2, int i) {
        this.f36012a = i;
        this.f36014c = c3374iN;
        this.f36013b = c3266gN;
        this.f36015d = c3266gN2;
    }
}
