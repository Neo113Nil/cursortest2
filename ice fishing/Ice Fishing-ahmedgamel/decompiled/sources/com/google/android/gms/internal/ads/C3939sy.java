package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.sy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3939sy implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34958a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f34959b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f34960c;

    public /* synthetic */ C3939sy(C3266gN c3266gN, C3266gN c3266gN2, int i) {
        this.f34958a = i;
        this.f34959b = c3266gN;
        this.f34960c = c3266gN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f34958a) {
            case 0:
                Executor executor = (Executor) this.f34959b.f();
                return new C3885ry(executor);
            default:
                return new C4006uA((Vx) this.f34959b.f(), (Cy) this.f34960c.f());
        }
    }
}
