package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Qz implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27147a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3351iN f27148b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f27149c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f27150d;

    /* renamed from: e, reason: collision with root package name */
    public final C3243gN f27151e;

    /* renamed from: f, reason: collision with root package name */
    public final C3351iN f27152f;

    /* renamed from: g, reason: collision with root package name */
    public final C3243gN f27153g;

    /* renamed from: h, reason: collision with root package name */
    public final C3243gN f27154h;

    public Qz(C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5, C3351iN c3351iN, C3351iN c3351iN2) {
        this.f27149c = c3243gN;
        this.f27150d = c3243gN2;
        this.f27151e = c3243gN3;
        this.f27153g = c3243gN4;
        this.f27154h = c3243gN5;
        this.f27148b = c3351iN;
        this.f27152f = c3351iN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f27147a) {
            case 0:
                return new Pz((My) this.f27149c.f(), (InterfaceC3284hA) this.f27150d.f(), (C3230gA) this.f27151e.f(), (C3498lA) this.f27153g.f(), (C3983uA) this.f27154h.f(), (C2949ay) this.f27148b.f31039a, (ExecutorService) this.f27152f.f31039a);
            default:
                return new Uz((Context) this.f27148b.f31039a, C3243gN.b(this.f27149c), (Yz) this.f27150d.f(), (C3983uA) this.f27151e.f(), (ExecutorService) this.f27152f.f31039a, (Iz) this.f27153g.f(), (Cw) this.f27154h.f());
        }
    }

    public Qz(C3351iN c3351iN, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3351iN c3351iN2, C3243gN c3243gN4, C3243gN c3243gN5) {
        this.f27148b = c3351iN;
        this.f27149c = c3243gN;
        this.f27150d = c3243gN2;
        this.f27151e = c3243gN3;
        this.f27152f = c3351iN2;
        this.f27153g = c3243gN4;
        this.f27154h = c3243gN5;
    }
}
