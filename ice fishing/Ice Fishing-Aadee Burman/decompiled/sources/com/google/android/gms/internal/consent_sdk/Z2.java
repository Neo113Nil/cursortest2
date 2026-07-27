package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class Z2 implements b3 {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f35644v = new Object();

    /* renamed from: n, reason: collision with root package name */
    public volatile a3 f35645n;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f35646u;

    /* JADX WARN: Multi-variable type inference failed */
    public static Z2 a(a3 a3Var) {
        if (a3Var instanceof Z2) {
            return (Z2) a3Var;
        }
        Z2 z22 = new Z2();
        z22.f35646u = f35644v;
        z22.f35645n = a3Var;
        return z22;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public final Object f() {
        Object obj = this.f35646u;
        Object obj2 = f35644v;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f35646u;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object f3 = this.f35645n.f();
                Object obj4 = this.f35646u;
                if (obj4 != obj2 && obj4 != f3) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + f3 + ". This is likely due to a circular dependency.");
                }
                this.f35646u = f3;
                this.f35645n = null;
                return f3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
