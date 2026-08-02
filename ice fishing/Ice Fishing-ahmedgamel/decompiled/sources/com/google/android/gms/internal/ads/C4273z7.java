package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.z7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4273z7 extends MA {
    public final Long J;

    /* renamed from: K, reason: collision with root package name */
    public final Long f36068K;

    /* renamed from: L, reason: collision with root package name */
    public final Long f36069L;

    /* renamed from: M, reason: collision with root package name */
    public final Long f36070M;

    /* renamed from: N, reason: collision with root package name */
    public final Long f36071N;

    /* renamed from: O, reason: collision with root package name */
    public final Long f36072O;

    /* renamed from: P, reason: collision with root package name */
    public final Long f36073P;

    /* renamed from: Q, reason: collision with root package name */
    public final Long f36074Q;

    /* renamed from: R, reason: collision with root package name */
    public final Long f36075R;

    /* renamed from: S, reason: collision with root package name */
    public final Long f36076S;

    /* renamed from: T, reason: collision with root package name */
    public final Long f36077T;

    public C4273z7(String str) {
        super(19);
        HashMap p9 = MA.p(str);
        if (p9 != null) {
            this.J = (Long) p9.get(0);
            this.f36068K = (Long) p9.get(1);
            this.f36069L = (Long) p9.get(2);
            this.f36070M = (Long) p9.get(3);
            this.f36071N = (Long) p9.get(4);
            this.f36072O = (Long) p9.get(5);
            this.f36073P = (Long) p9.get(6);
            this.f36074Q = (Long) p9.get(7);
            this.f36075R = (Long) p9.get(8);
            this.f36076S = (Long) p9.get(9);
            this.f36077T = (Long) p9.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.MA
    public final HashMap e() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.J);
        hashMap.put(1, this.f36068K);
        hashMap.put(2, this.f36069L);
        hashMap.put(3, this.f36070M);
        hashMap.put(4, this.f36071N);
        hashMap.put(5, this.f36072O);
        hashMap.put(6, this.f36073P);
        hashMap.put(7, this.f36074Q);
        hashMap.put(8, this.f36075R);
        hashMap.put(9, this.f36076S);
        hashMap.put(10, this.f36077T);
        return hashMap;
    }
}
