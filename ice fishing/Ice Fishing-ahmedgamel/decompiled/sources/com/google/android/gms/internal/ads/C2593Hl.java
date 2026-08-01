package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Hl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2593Hl implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25350a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f25351b;

    /* renamed from: c, reason: collision with root package name */
    public final C2676Mj f25352c;

    public C2593Hl(C2676Mj c2676Mj, C3243gN c3243gN) {
        this.f25350a = 0;
        this.f25352c = c2676Mj;
        this.f25351b = c3243gN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f25350a) {
            case 0:
                return new C2576Gl(this.f25352c.a(), (C4237yv) this.f25351b.f());
            case 1:
                return new C2508Cl((Context) this.f25351b.f(), new HashSet(), this.f25352c.a());
            default:
                return new C4283zn((C2575Gk) this.f25351b.f(), this.f25352c.a());
        }
    }

    public /* synthetic */ C2593Hl(C3243gN c3243gN, C2676Mj c2676Mj, int i) {
        this.f25350a = i;
        this.f25351b = c3243gN;
        this.f25352c = c2676Mj;
    }
}
