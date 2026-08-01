package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.sy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3916sy implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34172a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f34173b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f34174c;

    public /* synthetic */ C3916sy(C3243gN c3243gN, C3243gN c3243gN2, int i) {
        this.f34172a = i;
        this.f34173b = c3243gN;
        this.f34174c = c3243gN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f34172a) {
            case 0:
                Executor executor = (Executor) this.f34173b.f();
                return new C3862ry(executor);
            default:
                return new C3983uA((Vx) this.f34173b.f(), (Cy) this.f34174c.f());
        }
    }
}
