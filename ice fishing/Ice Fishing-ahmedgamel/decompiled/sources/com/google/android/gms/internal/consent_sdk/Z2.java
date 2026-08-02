package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class Z2 implements b3 {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f36413v = new Object();

    /* renamed from: n, reason: collision with root package name */
    public volatile a3 f36414n;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f36415u;

    /* JADX WARN: Multi-variable type inference failed */
    public static Z2 a(a3 a3Var) {
        if (a3Var instanceof Z2) {
            return (Z2) a3Var;
        }
        Z2 z22 = new Z2();
        z22.f36415u = f36413v;
        z22.f36414n = a3Var;
        return z22;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public final Object f() {
        Object obj = this.f36415u;
        Object obj2 = f36413v;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f36415u;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object f2 = this.f36414n.f();
                Object obj4 = this.f36415u;
                if (obj4 != obj2 && obj4 != f2) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + f2 + ". This is likely due to a circular dependency.");
                }
                this.f36415u = f2;
                this.f36414n = null;
                return f2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
