package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3266gN implements InterfaceC3534lN, InterfaceC3158eN {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f31326c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC3534lN f31327a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f31328b = f31326c;

    public C3266gN(InterfaceC3534lN interfaceC3534lN) {
        this.f31327a = interfaceC3534lN;
    }

    public static C3266gN a(InterfaceC3534lN interfaceC3534lN) {
        return interfaceC3534lN instanceof C3266gN ? (C3266gN) interfaceC3534lN : new C3266gN(interfaceC3534lN);
    }

    public static InterfaceC3158eN b(InterfaceC3534lN interfaceC3534lN) {
        if (interfaceC3534lN instanceof InterfaceC3158eN) {
            return (InterfaceC3158eN) interfaceC3534lN;
        }
        interfaceC3534lN.getClass();
        return new C3266gN(interfaceC3534lN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        Object obj = this.f31328b;
        Object obj2 = f31326c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f31328b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object f2 = this.f31327a.f();
                Object obj4 = this.f31328b;
                if (obj4 != obj2 && obj4 != f2) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + f2 + ". This is likely due to a circular dependency.");
                }
                this.f31328b = f2;
                this.f31327a = null;
                return f2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
