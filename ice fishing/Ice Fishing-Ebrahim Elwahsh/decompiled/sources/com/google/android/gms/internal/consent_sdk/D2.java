package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class D2 implements I2 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4320c2 f35665a;

    /* renamed from: b, reason: collision with root package name */
    public final O2 f35666b;

    public D2(O2 o22, AbstractC4320c2 abstractC4320c2) {
        J1 j12 = AbstractC4352k2.f35871a;
        this.f35666b = o22;
        this.f35665a = abstractC4320c2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final void a(Object obj) {
        this.f35666b.getClass();
        N2 n22 = ((AbstractC4368o2) obj).zzc;
        if (n22.f35745d) {
            n22.f35745d = false;
        }
        J1 j12 = AbstractC4352k2.f35871a;
        throw D.y.g(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final int b(AbstractC4368o2 abstractC4368o2) {
        abstractC4368o2.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final boolean c(AbstractC4368o2 abstractC4368o2, AbstractC4368o2 abstractC4368o22) {
        return abstractC4368o2.zzc.equals(abstractC4368o22.zzc);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final void d(Object obj, C4399w2 c4399w2) {
        throw D.y.g(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final void e(Object obj, Object obj2) {
        J2.o(obj, obj2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final int f(AbstractC4368o2 abstractC4368o2) {
        N2 n22 = abstractC4368o2.zzc;
        int i = n22.f35744c;
        if (i != -1) {
            return i;
        }
        n22.f35744c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final boolean g(Object obj) {
        throw D.y.g(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final AbstractC4368o2 i() {
        AbstractC4320c2 abstractC4320c2 = this.f35665a;
        return abstractC4320c2 instanceof AbstractC4368o2 ? (AbstractC4368o2) ((AbstractC4368o2) abstractC4320c2).f(4) : ((AbstractC4364n2) ((AbstractC4368o2) abstractC4320c2).f(5)).i();
    }
}
