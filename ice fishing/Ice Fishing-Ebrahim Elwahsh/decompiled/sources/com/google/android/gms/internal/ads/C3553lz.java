package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.lz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3553lz implements InterfaceCallableC3930sz {

    /* renamed from: a, reason: collision with root package name */
    public final Map f32625a;

    /* renamed from: b, reason: collision with root package name */
    public final C3830r6 f32626b;

    /* renamed from: c, reason: collision with root package name */
    public final C4104wA f32627c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32628d;

    public C3553lz(C3830r6 c3830r6, Map map, C3066cy c3066cy, C4158xA c4158xA) {
        this.f32625a = map;
        this.f32626b = c3830r6;
        this.f32627c = c4158xA.a(112);
        this.f32628d = c3066cy.Y();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        D6 d62;
        try {
            try {
                this.f32627c.a();
                J3.a aVar = (J3.a) this.f32625a.get("gs");
                if (aVar != null && (d62 = (D6) aVar.get(this.f32628d, TimeUnit.MILLISECONDS)) != null) {
                    C3830r6 c3830r6 = this.f32626b;
                    synchronized (c3830r6) {
                        M6 A02 = d62.A0();
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).o0(A02);
                        long x02 = d62.x0();
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).X(x02);
                    }
                }
            } catch (Throwable th) {
                this.f32627c.c();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e6) {
            this.f32627c.b(e6);
        }
        this.f32627c.c();
        return null;
    }
}
