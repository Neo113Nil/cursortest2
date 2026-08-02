package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.consent_sdk.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4409w2 implements b3, O3.h, O3.g, a3, A2 {

    /* renamed from: v, reason: collision with root package name */
    public static final J1 f36548v = new J1(27);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36549n;

    /* renamed from: u, reason: collision with root package name */
    public Object f36550u;

    public /* synthetic */ C4409w2(int i, Object obj) {
        this.f36549n = i;
        this.f36550u = obj;
    }

    @Override // O3.h
    public void a(C4359k c4359k) {
        ((AtomicReference) this.f36550u).set(c4359k);
    }

    @Override // O3.g
    public void b(O3.f fVar) {
        ((O3.b) this.f36550u).onConsentFormDismissed(fVar);
    }

    public void c(int i, Object obj, I2 i22) {
        AbstractC4330c2 abstractC4330c2 = (AbstractC4330c2) obj;
        C4354i2 c4354i2 = (C4354i2) this.f36550u;
        c4354i2.y(i, 2);
        c4354i2.A(abstractC4330c2.b(i22));
        i22.d(abstractC4330c2, this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.A2
    public H2 d(Class cls) {
        for (int i = 0; i < 2; i++) {
            A2 a22 = ((A2[]) this.f36550u)[i];
            if (a22.e(cls)) {
                return a22.d(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.consent_sdk.A2
    public boolean e(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((A2[]) this.f36550u)[i].e(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public Object f() {
        switch (this.f36549n) {
            case 1:
                return new C4327c((C4323b) ((C4323b) this.f36550u).f36417a);
            case 4:
                B b9 = C.f36262b;
                E.c(b9);
                return new C4371n((C4409w2) this.f36550u, b9);
            case 7:
                Z2 z22 = (Z2) this.f36550u;
                if (z22 != null) {
                    return z22.f();
                }
                throw new IllegalStateException();
            default:
                return this.f36550u;
        }
    }

    public C4409w2(int i) {
        this.f36549n = i;
        switch (i) {
            case 7:
                break;
            default:
                int i4 = AbstractC4338e2.f36436a;
                C4409w2 c4409w2 = new C4409w2(6, new A2[]{J1.f36315O, f36548v});
                Charset charset = AbstractC4393s2.f36513a;
                this.f36550u = c4409w2;
                break;
        }
    }

    public C4409w2(C4323b c4323b) {
        this.f36549n = 1;
        Objects.requireNonNull(c4323b);
        this.f36550u = c4323b;
    }

    public C4409w2(C4354i2 c4354i2) {
        this.f36549n = 5;
        Charset charset = AbstractC4393s2.f36513a;
        this.f36550u = c4354i2;
        c4354i2.f36457b = this;
    }
}
