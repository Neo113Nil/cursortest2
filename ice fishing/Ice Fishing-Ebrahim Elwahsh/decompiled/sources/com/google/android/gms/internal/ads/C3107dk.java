package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.dk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3107dk implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30189a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4279zN f30190b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f30191c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f30192d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f30193e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4279zN f30194f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4279zN f30195g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4279zN f30196h;

    public C3107dk(C2860Xh c2860Xh, C3700ok c3700ok, C2860Xh c2860Xh2, C2826Vh c2826Vh, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3) {
        this.f30189a = 0;
        this.f30190b = c2860Xh;
        this.f30194f = c3700ok;
        this.f30195g = c2860Xh2;
        this.f30196h = c2826Vh;
        this.f30191c = c4009uN;
        this.f30192d = c4009uN2;
        this.f30193e = c4009uN3;
    }

    public C4299zq a() {
        return new C4299zq((C3482ki) ((C4117wN) this.f30190b).f34977a, (Context) this.f30191c.d(), (Executor) this.f30192d.d(), (C2628Jn) ((C4009uN) this.f30193e).d(), ((C3700ok) this.f30194f).a(), (XA) ((C4009uN) this.f30195g).d(), (C3002bo) ((C4009uN) this.f30196h).d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f30189a) {
            case 0:
                return new C3052ck(((C2860Xh) this.f30190b).a(), ((C3700ok) this.f30194f).a(), ((C2860Xh) this.f30195g).b(), ((C2826Vh) this.f30196h).b(), (C2527Do) this.f30191c.d(), (Zu) this.f30192d.d(), (C2748Qo) ((C4009uN) this.f30193e).d());
            case 1:
                return new C2883Yn(((C2860Xh) this.f30190b).a(), (C3494ku) this.f30191c.d(), (C3165eo) this.f30192d.d(), ((C2675Mj) this.f30194f).b(), ((C2675Mj) this.f30195g).a(), (C2834Vp) ((C4009uN) this.f30193e).d(), (String) ((InterfaceC4063vN) this.f30196h).d());
            case 2:
                return a();
            case 3:
                C3105di c3105di = (C3105di) ((C4117wN) this.f30190b).f34977a;
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C2750Qq(c3105di, c3157eg, ((C2484Bf) this.f30194f).b(), (C3710ou) this.f30191c.d(), (C4242yn) this.f30192d.d(), (C3002bo) ((C4009uN) this.f30193e).d(), ((C2860Xh) this.f30195g).b(), (Context) ((C4009uN) this.f30196h).d(), new C2837Wb(17));
            case 4:
                return new BinderC3655nt((C3214fi) ((C4117wN) this.f30190b).f34977a, (Context) ((C4117wN) this.f30194f).f34977a, (String) ((C4117wN) this.f30196h).f34977a, (C3493kt) this.f30191c.d(), (C3439jt) this.f30192d.d(), ((C2860Xh) this.f30195g).b(), (C3165eo) ((C4009uN) this.f30193e).d());
            case 5:
                return new Zx((Cy) this.f30191c.d(), (Ry) this.f30192d.d(), (C3619nA) ((C4009uN) this.f30193e).d(), (C4158xA) ((C4009uN) this.f30190b).d(), (InterfaceC3929sy) ((C4009uN) this.f30194f).d(), C4009uN.b((C4009uN) this.f30195g), (C3066cy) ((C4117wN) this.f30196h).f34977a);
            case 6:
                return new Sy((ExecutorService) ((C4117wN) this.f30190b).f34977a, C4009uN.b(this.f30191c), C4009uN.b(this.f30192d), (C3619nA) ((C4009uN) this.f30193e).d(), C4009uN.b((C4009uN) this.f30194f), (C3120dy) this.f30195g, (C3066cy) ((C4117wN) this.f30196h).f34977a);
            default:
                return new C3607mz((C3830r6) ((C4117wN) this.f30190b).f34977a, (C3391iz) this.f30191c.d(), (Map) ((C4117wN) this.f30194f).f34977a, (Context) ((C4117wN) this.f30195g).f34977a, (EnumC3714oy) ((C4117wN) this.f30196h).f34977a, (C3066cy) ((C4117wN) this.f30193e).f34977a, (C4158xA) this.f30192d.d());
        }
    }

    public C3107dk(C2860Xh c2860Xh, C4009uN c4009uN, C4009uN c4009uN2, C2675Mj c2675Mj, C2675Mj c2675Mj2, C4009uN c4009uN3, InterfaceC4063vN interfaceC4063vN) {
        this.f30189a = 1;
        this.f30190b = c2860Xh;
        this.f30191c = c4009uN;
        this.f30192d = c4009uN2;
        this.f30194f = c2675Mj;
        this.f30195g = c2675Mj2;
        this.f30193e = c4009uN3;
        this.f30196h = interfaceC4063vN;
    }

    public C3107dk(C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, C4009uN c4009uN5, C4009uN c4009uN6, C4117wN c4117wN) {
        this.f30189a = 5;
        this.f30191c = c4009uN;
        this.f30192d = c4009uN2;
        this.f30193e = c4009uN3;
        this.f30190b = c4009uN4;
        this.f30194f = c4009uN5;
        this.f30195g = c4009uN6;
        this.f30196h = c4117wN;
    }

    public C3107dk(C4117wN c4117wN, C2484Bf c2484Bf, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C2860Xh c2860Xh, C4009uN c4009uN4) {
        this.f30189a = 3;
        this.f30190b = c4117wN;
        this.f30194f = c2484Bf;
        this.f30191c = c4009uN;
        this.f30192d = c4009uN2;
        this.f30193e = c4009uN3;
        this.f30195g = c2860Xh;
        this.f30196h = c4009uN4;
    }

    public /* synthetic */ C3107dk(C4117wN c4117wN, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, InterfaceC4279zN interfaceC4279zN, InterfaceC4279zN interfaceC4279zN2, Object obj, int i) {
        this.f30189a = i;
        this.f30190b = c4117wN;
        this.f30191c = c4009uN;
        this.f30192d = c4009uN2;
        this.f30193e = c4009uN3;
        this.f30194f = interfaceC4279zN;
        this.f30195g = interfaceC4279zN2;
        this.f30196h = (InterfaceC4279zN) obj;
    }

    public C3107dk(C4117wN c4117wN, C4009uN c4009uN, C4117wN c4117wN2, C4117wN c4117wN3, C4117wN c4117wN4, C4117wN c4117wN5, C4009uN c4009uN2) {
        this.f30189a = 7;
        this.f30190b = c4117wN;
        this.f30191c = c4009uN;
        this.f30194f = c4117wN2;
        this.f30195g = c4117wN3;
        this.f30196h = c4117wN4;
        this.f30193e = c4117wN5;
        this.f30192d = c4009uN2;
    }

    public C3107dk(C4117wN c4117wN, C4117wN c4117wN2, C4117wN c4117wN3, C4009uN c4009uN, C4009uN c4009uN2, C2860Xh c2860Xh, C4009uN c4009uN3) {
        this.f30189a = 4;
        this.f30190b = c4117wN;
        this.f30194f = c4117wN2;
        this.f30196h = c4117wN3;
        this.f30191c = c4009uN;
        this.f30192d = c4009uN2;
        this.f30195g = c2860Xh;
        this.f30193e = c4009uN3;
    }
}
