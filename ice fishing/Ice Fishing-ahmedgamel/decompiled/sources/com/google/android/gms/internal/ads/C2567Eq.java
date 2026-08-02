package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Eq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2567Eq implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25414a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f25415b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f25416c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f25417d;

    /* renamed from: e, reason: collision with root package name */
    public final C3266gN f25418e;

    /* renamed from: f, reason: collision with root package name */
    public final C3374iN f25419f;

    public C2567Eq(C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3374iN c3374iN) {
        this.f25415b = c3266gN;
        this.f25416c = c3266gN2;
        this.f25417d = c3266gN3;
        this.f25418e = c3266gN4;
        this.f25419f = c3374iN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f25414a) {
            case 0:
                return new C2550Dq((Context) this.f25415b.f(), (Executor) this.f25416c.f(), (C3816qi) this.f25419f.f31812a, (Rt) this.f25417d.f(), (C3230fo) this.f25418e.f());
            case 1:
                return new Lz((C3025bx) this.f25415b.f(), (Zz) this.f25416c.f(), (InterfaceC3307hA) this.f25417d.f(), (C4006uA) this.f25418e.f(), (ExecutorService) this.f25419f.f31812a);
            default:
                return new C3253gA((C4263yy) this.f25415b.f(), (C4263yy) this.f25416c.f(), C3266gN.b(this.f25417d), (ExecutorService) this.f25419f.f31812a, (C4006uA) this.f25418e.f());
        }
    }

    public C2567Eq(C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3374iN c3374iN, C3266gN c3266gN4) {
        this.f25415b = c3266gN;
        this.f25416c = c3266gN2;
        this.f25417d = c3266gN3;
        this.f25419f = c3374iN;
        this.f25418e = c3266gN4;
    }

    public C2567Eq(C3266gN c3266gN, C3266gN c3266gN2, C3374iN c3374iN, C3266gN c3266gN3, C3266gN c3266gN4) {
        this.f25415b = c3266gN;
        this.f25416c = c3266gN2;
        this.f25419f = c3374iN;
        this.f25417d = c3266gN3;
        this.f25418e = c3266gN4;
    }
}
