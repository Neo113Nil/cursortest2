package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.z7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4250z7 extends MA {
    public final Long J;

    /* renamed from: K, reason: collision with root package name */
    public final Long f35284K;

    /* renamed from: L, reason: collision with root package name */
    public final Long f35285L;

    /* renamed from: M, reason: collision with root package name */
    public final Long f35286M;

    /* renamed from: N, reason: collision with root package name */
    public final Long f35287N;

    /* renamed from: O, reason: collision with root package name */
    public final Long f35288O;

    /* renamed from: P, reason: collision with root package name */
    public final Long f35289P;

    /* renamed from: Q, reason: collision with root package name */
    public final Long f35290Q;

    /* renamed from: R, reason: collision with root package name */
    public final Long f35291R;

    /* renamed from: S, reason: collision with root package name */
    public final Long f35292S;

    /* renamed from: T, reason: collision with root package name */
    public final Long f35293T;

    public C4250z7(String str) {
        super(19);
        HashMap p9 = MA.p(str);
        if (p9 != null) {
            this.J = (Long) p9.get(0);
            this.f35284K = (Long) p9.get(1);
            this.f35285L = (Long) p9.get(2);
            this.f35286M = (Long) p9.get(3);
            this.f35287N = (Long) p9.get(4);
            this.f35288O = (Long) p9.get(5);
            this.f35289P = (Long) p9.get(6);
            this.f35290Q = (Long) p9.get(7);
            this.f35291R = (Long) p9.get(8);
            this.f35292S = (Long) p9.get(9);
            this.f35293T = (Long) p9.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.MA
    public final HashMap e() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.J);
        hashMap.put(1, this.f35284K);
        hashMap.put(2, this.f35285L);
        hashMap.put(3, this.f35286M);
        hashMap.put(4, this.f35287N);
        hashMap.put(5, this.f35288O);
        hashMap.put(6, this.f35289P);
        hashMap.put(7, this.f35290Q);
        hashMap.put(8, this.f35291R);
        hashMap.put(9, this.f35292S);
        hashMap.put(10, this.f35293T);
        return hashMap;
    }
}
