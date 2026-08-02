package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.bj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3011bj implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30100a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f30101b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f30102c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f30103d;

    /* renamed from: e, reason: collision with root package name */
    public final C3266gN f30104e;

    /* renamed from: f, reason: collision with root package name */
    public final C3266gN f30105f;

    public /* synthetic */ C3011bj(C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5, int i) {
        this.f30100a = i;
        this.f30101b = c3266gN;
        this.f30102c = c3266gN2;
        this.f30103d = c3266gN3;
        this.f30104e = c3266gN4;
        this.f30105f = c3266gN5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f30100a) {
            case 0:
                return new C2957aj((C3273gd) this.f30101b.f(), (C2880Xi) this.f30102c.f(), (Executor) this.f30103d.f(), (C2864Wi) this.f30104e.f(), (V2.a) this.f30105f.f());
            default:
                return new C3337hn((Executor) this.f30101b.f(), (C3118dj) this.f30102c.f(), (C2545Dl) this.f30103d.f(), (C2712Ni) this.f30104e.f(), (C3387ik) this.f30105f.f());
        }
    }
}
