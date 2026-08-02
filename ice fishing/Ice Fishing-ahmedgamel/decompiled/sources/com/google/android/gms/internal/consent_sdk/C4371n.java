package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.atomic.AtomicReference;
import s2.C4945n;

/* renamed from: com.google.android.gms.internal.consent_sdk.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4371n {

    /* renamed from: a, reason: collision with root package name */
    public final C4409w2 f36492a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f36493b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f36494c = new AtomicReference();

    public C4371n(C4409w2 c4409w2, B b9) {
        this.f36492a = c4409w2;
    }

    public final void a(O3.h hVar, O3.g gVar, boolean z6) {
        C.a();
        C4375o c4375o = (C4375o) this.f36493b.get();
        if (c4375o == null) {
            gVar.b(new C4364l0(3, "No available form can be built.").a());
            return;
        }
        C4327c c4327c = (C4327c) this.f36492a.f();
        c4327c.getClass();
        C4323b c4323b = c4327c.f36425a;
        Z2 a9 = Z2.a(new C4335e((C4409w2) c4323b.f36418b, 2));
        C4409w2 c4409w2 = new C4409w2(8, c4375o);
        C4409w2 c4409w22 = new C4409w2(7);
        C4409w2 c4409w23 = (C4409w2) c4323b.f36418b;
        Z2 z22 = (Z2) c4323b.f36422f;
        C4339f c4339f = (C4339f) c4323b.i;
        Z2 z23 = (Z2) c4323b.f36419c;
        Z2 a10 = Z2.a(new m.c1(c4409w23, (Z2) c4323b.f36420d, a9, z23, c4409w2, new C4367m(a9, new C4945n(c4409w23, a9, z22, c4339f, c4409w22, z23, 3)), (Z2) c4323b.f36423g));
        if (((Z2) c4409w22.f36550u) != null) {
            throw new IllegalStateException();
        }
        c4409w22.f36550u = a10;
        C4359k c4359k = (C4359k) c4409w22.f();
        c4359k.f36476n = z6;
        c4359k.b(hVar, gVar);
    }
}
