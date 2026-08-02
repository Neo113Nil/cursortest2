package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Qz implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27903a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3374iN f27904b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f27905c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f27906d;

    /* renamed from: e, reason: collision with root package name */
    public final C3266gN f27907e;

    /* renamed from: f, reason: collision with root package name */
    public final C3374iN f27908f;

    /* renamed from: g, reason: collision with root package name */
    public final C3266gN f27909g;

    /* renamed from: h, reason: collision with root package name */
    public final C3266gN f27910h;

    public Qz(C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5, C3374iN c3374iN, C3374iN c3374iN2) {
        this.f27905c = c3266gN;
        this.f27906d = c3266gN2;
        this.f27907e = c3266gN3;
        this.f27909g = c3266gN4;
        this.f27910h = c3266gN5;
        this.f27904b = c3374iN;
        this.f27908f = c3374iN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f27903a) {
            case 0:
                return new Pz((My) this.f27905c.f(), (InterfaceC3307hA) this.f27906d.f(), (C3253gA) this.f27907e.f(), (C3521lA) this.f27909g.f(), (C4006uA) this.f27910h.f(), (C2972ay) this.f27904b.f31812a, (ExecutorService) this.f27908f.f31812a);
            default:
                return new Uz((Context) this.f27904b.f31812a, C3266gN.b(this.f27905c), (Yz) this.f27906d.f(), (C4006uA) this.f27907e.f(), (ExecutorService) this.f27908f.f31812a, (Iz) this.f27909g.f(), (Cw) this.f27910h.f());
        }
    }

    public Qz(C3374iN c3374iN, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3374iN c3374iN2, C3266gN c3266gN4, C3266gN c3266gN5) {
        this.f27904b = c3374iN;
        this.f27905c = c3266gN;
        this.f27906d = c3266gN2;
        this.f27907e = c3266gN3;
        this.f27908f = c3374iN2;
        this.f27909g = c3266gN4;
        this.f27910h = c3266gN5;
    }
}
