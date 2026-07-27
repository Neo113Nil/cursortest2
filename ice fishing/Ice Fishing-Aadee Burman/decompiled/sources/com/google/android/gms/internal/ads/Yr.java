package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class Yr implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28750a = 1;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3511lN f28751b;

    public /* synthetic */ Yr() {
    }

    public static void a(Yr yr, InterfaceC3511lN interfaceC3511lN) {
        if (yr.f28751b != null) {
            throw new IllegalStateException();
        }
        yr.f28751b = interfaceC3511lN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f28750a) {
            case 0:
                return new Lr(1, (Set) this.f28751b.f());
            default:
                InterfaceC3511lN interfaceC3511lN = this.f28751b;
                if (interfaceC3511lN != null) {
                    return interfaceC3511lN.f();
                }
                throw new IllegalStateException();
        }
    }

    public Yr(InterfaceC3511lN interfaceC3511lN) {
        this.f28751b = interfaceC3511lN;
    }
}
