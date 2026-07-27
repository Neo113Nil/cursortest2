package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Bq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2495Bq implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24095a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f24096b;

    /* renamed from: c, reason: collision with root package name */
    public final C4117wN f24097c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f24098d;

    public /* synthetic */ C2495Bq(C4009uN c4009uN, C4009uN c4009uN2, C4117wN c4117wN, int i) {
        this.f24095a = i;
        this.f24096b = c4009uN;
        this.f24098d = c4009uN2;
        this.f24097c = c4117wN;
    }

    public Bt a() {
        C2841Wf c2841Wf;
        C2841Wf c2841Wf2;
        switch (this.f24095a) {
            case 4:
                Context context = (Context) this.f24097c.f34977a;
                C3818qu c3818qu = (C3818qu) this.f24096b.d();
                Bu bu = (Bu) this.f24098d.d();
                C3151ea c3151ea = AbstractC3368ia.f31704j7;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    c2841Wf = p2.j.f39798C.f39808h.g().n();
                } else {
                    t2.E g9 = p2.j.f39798C.f39808h.g();
                    synchronized (g9.f40830a) {
                        c2841Wf = g9.f40842n;
                    }
                }
                boolean z8 = false;
                if (c2841Wf != null && c2841Wf.f28427j) {
                    z8 = true;
                }
                if (((Integer) rVar.f40119c.a(AbstractC3368ia.f31850z7)).intValue() > 0) {
                    if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.f31694i7)).booleanValue() || z8) {
                        Au a9 = bu.a(EnumC3979tu.f34494v, context, c3818qu, new C2478Aq(4, new C3761pr(27)));
                        C2593Hm c2593Hm = new C2593Hm(14, new C4086vt());
                        C3157eg c3157eg = AbstractC3212fg.f30738a;
                        C4017ue c4017ue = a9.f23919a;
                        return new Q8(c2593Hm, new C4017ue(c4017ue, c3157eg), a9.f23920b, ((C4087vu) c4017ue.f34631v).f34896z, c3157eg);
                    }
                }
                return new C4086vt();
            default:
                Context context2 = (Context) this.f24097c.f34977a;
                C3818qu c3818qu2 = (C3818qu) this.f24096b.d();
                Bu bu2 = (Bu) this.f24098d.d();
                C3151ea c3151ea2 = AbstractC3368ia.f31704j7;
                q2.r rVar2 = q2.r.f40116e;
                if (((Boolean) rVar2.f40119c.a(c3151ea2)).booleanValue()) {
                    c2841Wf2 = p2.j.f39798C.f39808h.g().n();
                } else {
                    t2.E g10 = p2.j.f39798C.f39808h.g();
                    synchronized (g10.f40830a) {
                        c2841Wf2 = g10.f40842n;
                    }
                }
                boolean z9 = false;
                if (c2841Wf2 != null && c2841Wf2.f28427j) {
                    z9 = true;
                }
                if (((Integer) rVar2.f40119c.a(AbstractC3368ia.f31723l7)).intValue() > 0) {
                    if (!((Boolean) rVar2.f40119c.a(AbstractC3368ia.f31694i7)).booleanValue() || z9) {
                        Au a10 = bu2.a(EnumC3979tu.f34492n, context2, c3818qu2, new C2478Aq(4, new C3761pr(27)));
                        C2593Hm c2593Hm2 = new C2593Hm(14, new C4086vt());
                        C3157eg c3157eg2 = AbstractC3212fg.f30738a;
                        C4017ue c4017ue2 = a10.f23919a;
                        return new Q8(c2593Hm2, new C4017ue(c4017ue2, c3157eg2), a10.f23920b, ((C4087vu) c4017ue2.f34631v).f34896z, c3157eg2);
                    }
                }
                return new C4086vt();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f24095a) {
            case 0:
                return new C4083vq((Context) this.f24096b.d(), (C3482ki) this.f24097c.f34977a, (Executor) this.f24098d.d(), 1);
            case 1:
                return new C4083vq((Context) this.f24096b.d(), (C3105di) this.f24097c.f34977a, (Executor) this.f24098d.d(), 2);
            case 2:
                return new C3168er((Context) this.f24096b.d(), (Executor) this.f24098d.d(), (C3806qi) this.f24097c.f34977a, 0);
            case 3:
                return new C3168er((Context) this.f24096b.d(), (Executor) this.f24098d.d(), (C3806qi) this.f24097c.f34977a, 1);
            case 4:
                return a();
            case 5:
                return a();
            case 6:
                InterfaceC3929sy interfaceC3929sy = ((C3066cy) this.f24097c.f34977a).i0() ? (InterfaceC3929sy) C4009uN.b(this.f24096b).d() : (InterfaceC3929sy) C4009uN.b(this.f24098d).d();
                AbstractC3137eE.h(interfaceC3929sy);
                return interfaceC3929sy;
            case 7:
                return new C3823qz("StEAvb/iigDIlQhq4PghExfp73gHg8IUtO74V2AuLhqk3CKzmFDPWKX0qTLgtCrl", "a0akqO7gmy+q2qeS0xD9lQHxt87lQ1nAIIevL4sq6Y8=", (C3830r6) this.f24097c.f34977a, (C3391iz) this.f24096b.d(), ((C4158xA) this.f24098d.d()).a(114), 1);
            case 8:
                return new C3823qz("yqnoA3qkrpGdV0UDHfD7DkNdKz4CD4Omw8LwQ+mqDfnJnY5wPxLFUyGI2UEZc+9I", "QVM5zcLU6Zl19Cag2KVJanZ3HUWi7v3pEqNBU6r5voo=", (C3830r6) this.f24097c.f34977a, (C3391iz) this.f24096b.d(), ((C4158xA) this.f24098d.d()).a(117), 0);
            case 9:
                Context context = (Context) this.f24097c.f34977a;
                return new Jz(context, context.getSharedPreferences("pcvmspf2", 0), C4009uN.b(this.f24096b), (C4158xA) this.f24098d.d());
            case 10:
                InterfaceC3901sN b9 = C4009uN.b(this.f24096b);
                InterfaceC3901sN b10 = C4009uN.b(this.f24098d);
                if (true == ((C3066cy) this.f24097c.f34977a).h0()) {
                    b9 = b10;
                }
                InterfaceC3024cA interfaceC3024cA = (InterfaceC3024cA) b9.d();
                AbstractC3137eE.h(interfaceC3024cA);
                return interfaceC3024cA;
            case 11:
                return new C3297hA((Jz) this.f24096b.d(), (ExecutorService) this.f24097c.f34977a, (C4158xA) this.f24098d.d());
            default:
                return new C3565mA((C4158xA) this.f24098d.d(), ((C3066cy) this.f24097c.f34977a).X().B());
        }
    }

    public /* synthetic */ C2495Bq(C4009uN c4009uN, C4117wN c4117wN, C4009uN c4009uN2, int i) {
        this.f24095a = i;
        this.f24096b = c4009uN;
        this.f24097c = c4117wN;
        this.f24098d = c4009uN2;
    }

    public /* synthetic */ C2495Bq(C4117wN c4117wN, C4009uN c4009uN, C4009uN c4009uN2, int i) {
        this.f24095a = i;
        this.f24097c = c4117wN;
        this.f24096b = c4009uN;
        this.f24098d = c4009uN2;
    }
}
