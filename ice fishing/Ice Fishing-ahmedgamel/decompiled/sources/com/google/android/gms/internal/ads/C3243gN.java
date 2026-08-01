package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3243gN implements InterfaceC3511lN, InterfaceC3135eN {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f30560c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC3511lN f30561a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f30562b = f30560c;

    public C3243gN(InterfaceC3511lN interfaceC3511lN) {
        this.f30561a = interfaceC3511lN;
    }

    public static C3243gN a(InterfaceC3511lN interfaceC3511lN) {
        return interfaceC3511lN instanceof C3243gN ? (C3243gN) interfaceC3511lN : new C3243gN(interfaceC3511lN);
    }

    public static InterfaceC3135eN b(InterfaceC3511lN interfaceC3511lN) {
        if (interfaceC3511lN instanceof InterfaceC3135eN) {
            return (InterfaceC3135eN) interfaceC3511lN;
        }
        interfaceC3511lN.getClass();
        return new C3243gN(interfaceC3511lN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        Object obj = this.f30562b;
        Object obj2 = f30560c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f30562b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object f3 = this.f30561a.f();
                Object obj4 = this.f30562b;
                if (obj4 != obj2 && obj4 != f3) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + f3 + ". This is likely due to a circular dependency.");
                }
                this.f30562b = f3;
                this.f30561a = null;
                return f3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
