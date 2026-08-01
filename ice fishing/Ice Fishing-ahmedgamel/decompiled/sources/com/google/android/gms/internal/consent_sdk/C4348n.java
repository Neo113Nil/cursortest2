package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.atomic.AtomicReference;
import q2.C4896n;

/* renamed from: com.google.android.gms.internal.consent_sdk.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4348n {

    /* renamed from: a, reason: collision with root package name */
    public final C4386w2 f35723a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f35724b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f35725c = new AtomicReference();

    public C4348n(C4386w2 c4386w2, B b9) {
        this.f35723a = c4386w2;
    }

    public final void a(M3.h hVar, M3.g gVar, boolean z3) {
        C.a();
        C4352o c4352o = (C4352o) this.f35724b.get();
        if (c4352o == null) {
            gVar.b(new C4341l0(3, "No available form can be built.").a());
            return;
        }
        C4304c c4304c = (C4304c) this.f35723a.f();
        c4304c.getClass();
        C4300b c4300b = c4304c.f35656a;
        Z2 a9 = Z2.a(new C4312e((C4386w2) c4300b.f35649b, 2));
        C4386w2 c4386w2 = new C4386w2(8, c4352o);
        C4386w2 c4386w22 = new C4386w2(7);
        C4386w2 c4386w23 = (C4386w2) c4300b.f35649b;
        Z2 z22 = (Z2) c4300b.f35653f;
        C4316f c4316f = (C4316f) c4300b.i;
        Z2 z23 = (Z2) c4300b.f35650c;
        Z2 a10 = Z2.a(new m.b1(c4386w23, (Z2) c4300b.f35651d, a9, z23, c4386w2, new C4344m(a9, new C4896n(c4386w23, a9, z22, c4316f, c4386w22, z23, 3)), (Z2) c4300b.f35654g));
        if (((Z2) c4386w22.f35781u) != null) {
            throw new IllegalStateException();
        }
        c4386w22.f35781u = a10;
        C4336k c4336k = (C4336k) c4386w22.f();
        c4336k.f35707n = z3;
        c4336k.b(hVar, gVar);
    }
}
