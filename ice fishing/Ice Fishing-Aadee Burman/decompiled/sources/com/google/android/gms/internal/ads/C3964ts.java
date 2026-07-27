package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ts, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3964ts implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34411a;

    /* renamed from: b, reason: collision with root package name */
    public final C3040ci f34412b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f34413c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f34414d;

    public /* synthetic */ C3964ts(C3040ci c3040ci, C3243gN c3243gN, C3243gN c3243gN2, int i) {
        this.f34411a = i;
        this.f34412b = c3040ci;
        this.f34413c = c3243gN;
        this.f34414d = c3243gN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f34411a) {
            case 0:
                Lr lr = new Lr(0, this.f34412b.f29536b.a());
                T2.a aVar = (T2.a) this.f34413c.f();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C3695os(lr, 2147483647L, aVar, c3360ig, (C3153eo) this.f34414d.f());
            default:
                Ps lr2 = new Lr(0, this.f34412b.f29536b.a());
                Ps ps = (C3695os) this.f34413c.f();
                if (true == ((List) this.f34414d.f()).contains("2")) {
                    lr2 = ps;
                }
                AbstractC3341iD.j(lr2);
                return lr2;
        }
    }
}
