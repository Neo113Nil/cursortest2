package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Fz implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24900a;

    /* renamed from: b, reason: collision with root package name */
    public final C3351iN f24901b;

    /* renamed from: c, reason: collision with root package name */
    public final C3351iN f24902c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f24903d;

    public Fz(C3351iN c3351iN, C3243gN c3243gN, C3351iN c3351iN2) {
        this.f24900a = 2;
        this.f24901b = c3351iN;
        this.f24903d = c3243gN;
        this.f24902c = c3351iN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f24900a) {
            case 0:
                return new Ez((Context) this.f24901b.f31039a, (C2949ay) this.f24902c.f31039a, (C3498lA) this.f24903d.f());
            case 1:
                return new Dz((Context) this.f24901b.f31039a, (ExecutorService) this.f24902c.f31039a, (Cy) this.f24903d.f());
            default:
                Context context = (Context) this.f24901b.f31039a;
                return new C3875sA(context, C3875sA.f33901g, (ExecutorService) this.f24902c.f31039a);
        }
    }

    public /* synthetic */ Fz(C3351iN c3351iN, C3351iN c3351iN2, C3243gN c3243gN, int i) {
        this.f24900a = i;
        this.f24901b = c3351iN;
        this.f24902c = c3351iN2;
        this.f24903d = c3243gN;
    }
}
