package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class Yr implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29529a = 1;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3534lN f29530b;

    public /* synthetic */ Yr() {
    }

    public static void a(Yr yr, InterfaceC3534lN interfaceC3534lN) {
        if (yr.f29530b != null) {
            throw new IllegalStateException();
        }
        yr.f29530b = interfaceC3534lN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f29529a) {
            case 0:
                return new Lr(1, (Set) this.f29530b.f());
            default:
                InterfaceC3534lN interfaceC3534lN = this.f29530b;
                if (interfaceC3534lN != null) {
                    return interfaceC3534lN.f();
                }
                throw new IllegalStateException();
        }
    }

    public Yr(InterfaceC3534lN interfaceC3534lN) {
        this.f29530b = interfaceC3534lN;
    }
}
