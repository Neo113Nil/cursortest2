package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class D2 implements I2 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4330c2 f36271a;

    /* renamed from: b, reason: collision with root package name */
    public final O2 f36272b;

    public D2(O2 o22, AbstractC4330c2 abstractC4330c2) {
        J1 j12 = AbstractC4362k2.f36477a;
        this.f36272b = o22;
        this.f36271a = abstractC4330c2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final void a(Object obj) {
        this.f36272b.getClass();
        N2 n22 = ((AbstractC4378o2) obj).zzc;
        if (n22.f36351d) {
            n22.f36351d = false;
        }
        J1 j12 = AbstractC4362k2.f36477a;
        throw D.x.h(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final int b(AbstractC4378o2 abstractC4378o2) {
        abstractC4378o2.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final boolean c(AbstractC4378o2 abstractC4378o2, AbstractC4378o2 abstractC4378o22) {
        return abstractC4378o2.zzc.equals(abstractC4378o22.zzc);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final void d(Object obj, C4409w2 c4409w2) {
        throw D.x.h(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final void e(Object obj, Object obj2) {
        J2.o(obj, obj2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final int f(AbstractC4378o2 abstractC4378o2) {
        N2 n22 = abstractC4378o2.zzc;
        int i = n22.f36350c;
        if (i != -1) {
            return i;
        }
        n22.f36350c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final boolean g(Object obj) {
        throw D.x.h(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final AbstractC4378o2 i() {
        AbstractC4330c2 abstractC4330c2 = this.f36271a;
        return abstractC4330c2 instanceof AbstractC4378o2 ? (AbstractC4378o2) ((AbstractC4378o2) abstractC4330c2).f(4) : ((AbstractC4374n2) ((AbstractC4378o2) abstractC4330c2).f(5)).i();
    }
}
