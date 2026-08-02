package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0267d5 {
    public static final C0267d5 b = new C0267d5();
    public A2 a;

    public final synchronized A2 a() {
        A2 a2;
        try {
            if (this.a == null) {
                this.a = new A2();
            }
            a2 = this.a;
            if (a2 == null) {
                a2 = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }
}
