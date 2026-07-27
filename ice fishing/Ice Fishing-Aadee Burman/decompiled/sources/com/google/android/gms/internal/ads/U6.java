package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class U6 extends MA {
    public String J;

    /* renamed from: K, reason: collision with root package name */
    public final long f27887K;

    /* renamed from: L, reason: collision with root package name */
    public final String f27888L;

    /* renamed from: M, reason: collision with root package name */
    public final String f27889M;

    /* renamed from: N, reason: collision with root package name */
    public final String f27890N;

    public U6(String str) {
        super(19);
        this.J = "E";
        this.f27887K = -1L;
        this.f27888L = "E";
        this.f27889M = "E";
        this.f27890N = "E";
        HashMap p9 = MA.p(str);
        if (p9 != null) {
            this.J = p9.get(0) == null ? "E" : (String) p9.get(0);
            this.f27887K = p9.get(1) != null ? ((Long) p9.get(1)).longValue() : -1L;
            this.f27888L = p9.get(2) == null ? "E" : (String) p9.get(2);
            this.f27889M = p9.get(3) == null ? "E" : (String) p9.get(3);
            this.f27890N = p9.get(4) != null ? (String) p9.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.MA
    public final HashMap e() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.J);
        hashMap.put(4, this.f27890N);
        hashMap.put(3, this.f27889M);
        hashMap.put(2, this.f27888L);
        hashMap.put(1, Long.valueOf(this.f27887K));
        return hashMap;
    }
}
