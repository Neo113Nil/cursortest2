package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class D2 implements I2 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4307c2 f35502a;

    /* renamed from: b, reason: collision with root package name */
    public final O2 f35503b;

    public D2(O2 o22, AbstractC4307c2 abstractC4307c2) {
        J1 j12 = AbstractC4339k2.f35708a;
        this.f35503b = o22;
        this.f35502a = abstractC4307c2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final void a(Object obj) {
        this.f35503b.getClass();
        N2 n22 = ((AbstractC4355o2) obj).zzc;
        if (n22.f35582d) {
            n22.f35582d = false;
        }
        J1 j12 = AbstractC4339k2.f35708a;
        throw D.y.i(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final int b(AbstractC4355o2 abstractC4355o2) {
        abstractC4355o2.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final boolean c(AbstractC4355o2 abstractC4355o2, AbstractC4355o2 abstractC4355o22) {
        return abstractC4355o2.zzc.equals(abstractC4355o22.zzc);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final void d(Object obj, C4386w2 c4386w2) {
        throw D.y.i(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final void e(Object obj, Object obj2) {
        J2.o(obj, obj2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final int f(AbstractC4355o2 abstractC4355o2) {
        N2 n22 = abstractC4355o2.zzc;
        int i = n22.f35581c;
        if (i != -1) {
            return i;
        }
        n22.f35581c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final boolean g(Object obj) {
        throw D.y.i(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.I2
    public final AbstractC4355o2 i() {
        AbstractC4307c2 abstractC4307c2 = this.f35502a;
        return abstractC4307c2 instanceof AbstractC4355o2 ? (AbstractC4355o2) ((AbstractC4355o2) abstractC4307c2).f(4) : ((AbstractC4351n2) ((AbstractC4355o2) abstractC4307c2).f(5)).i();
    }
}
