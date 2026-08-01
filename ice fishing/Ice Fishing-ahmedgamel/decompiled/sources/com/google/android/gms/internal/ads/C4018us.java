package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.us, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4018us implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34598a;

    /* renamed from: b, reason: collision with root package name */
    public final C2480Ba f34599b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f34600c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f34601d;

    public /* synthetic */ C4018us(C2480Ba c2480Ba, C3243gN c3243gN, C3243gN c3243gN2, int i) {
        this.f34598a = i;
        this.f34599b = c2480Ba;
        this.f34600c = c3243gN;
        this.f34601d = c3243gN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f34598a) {
            case 0:
                Ur b9 = this.f34599b.b();
                T2.a aVar = (T2.a) this.f34600c.f();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C3695os(b9, 2147483647L, aVar, c3360ig, (C3153eo) this.f34601d.f());
            default:
                Ps b10 = this.f34599b.b();
                Ps ps = (C3695os) this.f34600c.f();
                if (true == ((List) this.f34601d.f()).contains("29")) {
                    b10 = ps;
                }
                AbstractC3341iD.j(b10);
                return b10;
        }
    }
}
