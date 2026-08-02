package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.iz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3401iz implements InterfaceCallableC3779pz {

    /* renamed from: a, reason: collision with root package name */
    public final Map f31926a;

    /* renamed from: b, reason: collision with root package name */
    public final C4002u6 f31927b;

    /* renamed from: c, reason: collision with root package name */
    public final C3952tA f31928c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31929d;

    public C3401iz(C4002u6 c4002u6, Map map, C2972ay c2972ay, C4006uA c4006uA) {
        this.f31926a = map;
        this.f31927b = c4002u6;
        this.f31928c = c4006uA.a(112);
        this.f31929d = c2972ay.Y();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        H6 h62;
        try {
            try {
                this.f31928c.a();
                P3.a aVar = (P3.a) this.f31926a.get("gs");
                if (aVar != null && (h62 = (H6) aVar.get(this.f31929d, TimeUnit.MILLISECONDS)) != null) {
                    C4002u6 c4002u6 = this.f31927b;
                    synchronized (c4002u6) {
                        P6 A02 = h62.A0();
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).o0(A02);
                        long x02 = h62.x0();
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).X(x02);
                    }
                }
            } catch (Throwable th) {
                this.f31928c.c();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e9) {
            this.f31928c.b(e9);
        }
        this.f31928c.c();
        return null;
    }
}
