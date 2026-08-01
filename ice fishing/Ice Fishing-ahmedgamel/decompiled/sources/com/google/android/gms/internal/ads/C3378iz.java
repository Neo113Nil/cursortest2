package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.iz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3378iz implements InterfaceCallableC3756pz {

    /* renamed from: a, reason: collision with root package name */
    public final Map f31139a;

    /* renamed from: b, reason: collision with root package name */
    public final C3979u6 f31140b;

    /* renamed from: c, reason: collision with root package name */
    public final C3929tA f31141c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31142d;

    public C3378iz(C3979u6 c3979u6, Map map, C2949ay c2949ay, C3983uA c3983uA) {
        this.f31139a = map;
        this.f31140b = c3979u6;
        this.f31141c = c3983uA.a(112);
        this.f31142d = c2949ay.Y();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        H6 h62;
        try {
            try {
                this.f31141c.a();
                N3.a aVar = (N3.a) this.f31139a.get("gs");
                if (aVar != null && (h62 = (H6) aVar.get(this.f31142d, TimeUnit.MILLISECONDS)) != null) {
                    C3979u6 c3979u6 = this.f31140b;
                    synchronized (c3979u6) {
                        P6 A02 = h62.A0();
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).o0(A02);
                        long x02 = h62.x0();
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).X(x02);
                    }
                }
            } catch (Throwable th) {
                this.f31141c.c();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e9) {
            this.f31141c.b(e9);
        }
        this.f31141c.c();
        return null;
    }
}
