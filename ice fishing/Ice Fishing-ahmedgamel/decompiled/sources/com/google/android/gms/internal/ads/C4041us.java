package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.us, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4041us implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35361a;

    /* renamed from: b, reason: collision with root package name */
    public final C2500Ba f35362b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f35363c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f35364d;

    public /* synthetic */ C4041us(C2500Ba c2500Ba, C3266gN c3266gN, C3266gN c3266gN2, int i) {
        this.f35361a = i;
        this.f35362b = c2500Ba;
        this.f35363c = c3266gN;
        this.f35364d = c3266gN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f35361a) {
            case 0:
                Ur b9 = this.f35362b.b();
                V2.a aVar = (V2.a) this.f35363c.f();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C3718os(b9, 2147483647L, aVar, c3383ig, (C3230fo) this.f35364d.f());
            default:
                Ps b10 = this.f35362b.b();
                Ps ps = (C3718os) this.f35363c.f();
                if (true == ((List) this.f35364d.f()).contains("29")) {
                    b10 = ps;
                }
                AbstractC3364iD.j(b10);
                return b10;
        }
    }
}
