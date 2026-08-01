package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.iQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3354iQ extends AbstractC3192fQ {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f31043e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f31044c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f31045d;

    public C3354iQ(AbstractC3604n8 abstractC3604n8, Object obj, Object obj2) {
        super(abstractC3604n8);
        this.f31044c = obj;
        this.f31045d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3192fQ, com.google.android.gms.internal.ads.AbstractC3604n8
    public final U7 b(int i, U7 u72, long j6) {
        this.f30250b.b(i, u72, j6);
        if (Objects.equals(u72.f27893a, this.f31044c)) {
            u72.f27893a = U7.f27891m;
        }
        return u72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3192fQ, com.google.android.gms.internal.ads.AbstractC3604n8
    public final K7 d(int i, K7 k72, boolean z3) {
        this.f30250b.d(i, k72, z3);
        if (Objects.equals(k72.f25866b, this.f31045d) && z3) {
            k72.f25866b = f31043e;
        }
        return k72;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3192fQ, com.google.android.gms.internal.ads.AbstractC3604n8
    public final int e(Object obj) {
        Object obj2;
        if (f31043e.equals(obj) && (obj2 = this.f31045d) != null) {
            obj = obj2;
        }
        return this.f30250b.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3192fQ, com.google.android.gms.internal.ads.AbstractC3604n8
    public final Object f(int i) {
        Object f3 = this.f30250b.f(i);
        return Objects.equals(f3, this.f31045d) ? f31043e : f3;
    }
}
