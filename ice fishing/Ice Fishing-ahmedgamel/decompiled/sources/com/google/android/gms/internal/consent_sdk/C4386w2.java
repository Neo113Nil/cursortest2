package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.consent_sdk.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4386w2 implements b3, M3.h, M3.g, a3, A2 {

    /* renamed from: v, reason: collision with root package name */
    public static final J1 f35779v = new J1(27);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35780n;

    /* renamed from: u, reason: collision with root package name */
    public Object f35781u;

    public /* synthetic */ C4386w2(int i, Object obj) {
        this.f35780n = i;
        this.f35781u = obj;
    }

    @Override // M3.h
    public void a(C4336k c4336k) {
        ((AtomicReference) this.f35781u).set(c4336k);
    }

    @Override // M3.g
    public void b(M3.f fVar) {
        ((M3.b) this.f35781u).onConsentFormDismissed(fVar);
    }

    public void c(int i, Object obj, I2 i22) {
        AbstractC4307c2 abstractC4307c2 = (AbstractC4307c2) obj;
        C4331i2 c4331i2 = (C4331i2) this.f35781u;
        c4331i2.y(i, 2);
        c4331i2.A(abstractC4307c2.b(i22));
        i22.d(abstractC4307c2, this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.A2
    public H2 d(Class cls) {
        for (int i = 0; i < 2; i++) {
            A2 a22 = ((A2[]) this.f35781u)[i];
            if (a22.e(cls)) {
                return a22.d(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.consent_sdk.A2
    public boolean e(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((A2[]) this.f35781u)[i].e(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public Object f() {
        switch (this.f35780n) {
            case 1:
                return new C4304c((C4300b) ((C4300b) this.f35781u).f35648a);
            case 4:
                B b9 = C.f35493b;
                E.c(b9);
                return new C4348n((C4386w2) this.f35781u, b9);
            case 7:
                Z2 z22 = (Z2) this.f35781u;
                if (z22 != null) {
                    return z22.f();
                }
                throw new IllegalStateException();
            default:
                return this.f35781u;
        }
    }

    public C4386w2(int i) {
        this.f35780n = i;
        switch (i) {
            case 7:
                break;
            default:
                int i6 = AbstractC4315e2.f35667a;
                C4386w2 c4386w2 = new C4386w2(6, new A2[]{J1.f35546O, f35779v});
                Charset charset = AbstractC4370s2.f35744a;
                this.f35781u = c4386w2;
                break;
        }
    }

    public C4386w2(C4300b c4300b) {
        this.f35780n = 1;
        Objects.requireNonNull(c4300b);
        this.f35781u = c4300b;
    }

    public C4386w2(C4331i2 c4331i2) {
        this.f35780n = 5;
        Charset charset = AbstractC4370s2.f35744a;
        this.f35781u = c4331i2;
        c4331i2.f35688b = this;
    }
}
