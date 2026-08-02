package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.lQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3537lQ extends AbstractC3377iQ {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f32544e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f32545c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f32546d;

    public C3537lQ(AbstractC3627n8 abstractC3627n8, Object obj, Object obj2) {
        super(abstractC3627n8);
        this.f32545c = obj;
        this.f32546d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3377iQ, com.google.android.gms.internal.ads.AbstractC3627n8
    public final U7 b(int i, U7 u72, long j6) {
        this.f31816b.b(i, u72, j6);
        if (Objects.equals(u72.f28690a, this.f32545c)) {
            u72.f28690a = U7.f28688m;
        }
        return u72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3377iQ, com.google.android.gms.internal.ads.AbstractC3627n8
    public final K7 d(int i, K7 k72, boolean z6) {
        this.f31816b.d(i, k72, z6);
        if (Objects.equals(k72.f26618b, this.f32546d) && z6) {
            k72.f26618b = f32544e;
        }
        return k72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3377iQ, com.google.android.gms.internal.ads.AbstractC3627n8
    public final int e(Object obj) {
        Object obj2;
        if (f32544e.equals(obj) && (obj2 = this.f32546d) != null) {
            obj = obj2;
        }
        return this.f31816b.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3377iQ, com.google.android.gms.internal.ads.AbstractC3627n8
    public final Object f(int i) {
        Object f2 = this.f31816b.f(i);
        return Objects.equals(f2, this.f32546d) ? f32544e : f2;
    }
}
