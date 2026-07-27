package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.atomic.AtomicReference;
import q2.C4903n;

/* renamed from: com.google.android.gms.internal.consent_sdk.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4361n {

    /* renamed from: a, reason: collision with root package name */
    public final C4399w2 f35886a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f35887b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f35888c = new AtomicReference();

    public C4361n(C4399w2 c4399w2, B b9) {
        this.f35886a = c4399w2;
    }

    public final void a(I3.h hVar, I3.g gVar, boolean z8) {
        C.a();
        C4365o c4365o = (C4365o) this.f35887b.get();
        if (c4365o == null) {
            gVar.b(new C4354l0(3, "No available form can be built.").a());
            return;
        }
        C4317c c4317c = (C4317c) this.f35886a.d();
        c4317c.getClass();
        C4313b c4313b = c4317c.f35819a;
        Z2 a9 = Z2.a(new C4325e((C4399w2) c4313b.f35812b, 2));
        C4399w2 c4399w2 = new C4399w2(8, c4365o);
        C4399w2 c4399w22 = new C4399w2(7);
        C4399w2 c4399w23 = (C4399w2) c4313b.f35812b;
        Z2 z22 = (Z2) c4313b.f35816f;
        C4329f c4329f = (C4329f) c4313b.i;
        Z2 z23 = (Z2) c4313b.f35813c;
        Z2 a10 = Z2.a(new m.c1(c4399w23, (Z2) c4313b.f35814d, a9, z23, c4399w2, new C4357m(a9, new C4903n(c4399w23, a9, z22, c4329f, c4399w22, z23, 3)), (Z2) c4313b.f35817g));
        if (((Z2) c4399w22.f35944u) != null) {
            throw new IllegalStateException();
        }
        c4399w22.f35944u = a10;
        C4349k c4349k = (C4349k) c4399w22.d();
        c4349k.f35870n = z8;
        c4349k.b(hVar, gVar);
    }
}
