package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Fz implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25690a;

    /* renamed from: b, reason: collision with root package name */
    public final C3374iN f25691b;

    /* renamed from: c, reason: collision with root package name */
    public final C3374iN f25692c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f25693d;

    public Fz(C3374iN c3374iN, C3266gN c3266gN, C3374iN c3374iN2) {
        this.f25690a = 2;
        this.f25691b = c3374iN;
        this.f25693d = c3266gN;
        this.f25692c = c3374iN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f25690a) {
            case 0:
                return new Ez((Context) this.f25691b.f31812a, (C2972ay) this.f25692c.f31812a, (C3521lA) this.f25693d.f());
            case 1:
                return new Dz((Context) this.f25691b.f31812a, (ExecutorService) this.f25692c.f31812a, (Cy) this.f25693d.f());
            default:
                Context context = (Context) this.f25691b.f31812a;
                return new C3898sA(context, C3898sA.f34669g, (ExecutorService) this.f25692c.f31812a);
        }
    }

    public /* synthetic */ Fz(C3374iN c3374iN, C3374iN c3374iN2, C3266gN c3266gN, int i) {
        this.f25690a = i;
        this.f25691b = c3374iN;
        this.f25692c = c3374iN2;
        this.f25693d = c3266gN;
    }
}
