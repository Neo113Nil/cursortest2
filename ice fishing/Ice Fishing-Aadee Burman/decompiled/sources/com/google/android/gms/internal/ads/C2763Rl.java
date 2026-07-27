package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Rl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2763Rl implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27322a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.s f27323b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f27324c;

    public /* synthetic */ C2763Rl(S0.s sVar, C3243gN c3243gN, int i) {
        this.f27322a = i;
        this.f27323b = sVar;
        this.f27324c = c3243gN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f27322a) {
            case 0:
                Set u3 = this.f27323b.u((C3257gk) this.f27324c.f());
                AbstractC3341iD.j(u3);
                return u3;
            default:
                return new C2491Bl(new C3632nj(1, (InterfaceC4061vh) this.f27323b.f2841v), (Executor) this.f27324c.f());
        }
    }
}
