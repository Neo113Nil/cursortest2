package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ts, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3987ts implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35185a;

    /* renamed from: b, reason: collision with root package name */
    public final C3063ci f35186b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f35187c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f35188d;

    public /* synthetic */ C3987ts(C3063ci c3063ci, C3266gN c3266gN, C3266gN c3266gN2, int i) {
        this.f35185a = i;
        this.f35186b = c3063ci;
        this.f35187c = c3266gN;
        this.f35188d = c3266gN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f35185a) {
            case 0:
                Lr lr = new Lr(0, this.f35186b.f30321b.a());
                V2.a aVar = (V2.a) this.f35187c.f();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C3718os(lr, 2147483647L, aVar, c3383ig, (C3230fo) this.f35188d.f());
            default:
                Ps lr2 = new Lr(0, this.f35186b.f30321b.a());
                Ps ps = (C3718os) this.f35187c.f();
                if (true == ((List) this.f35188d.f()).contains("2")) {
                    lr2 = ps;
                }
                AbstractC3364iD.j(lr2);
                return lr2;
        }
    }
}
