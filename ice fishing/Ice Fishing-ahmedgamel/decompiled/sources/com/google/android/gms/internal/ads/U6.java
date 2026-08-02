package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class U6 extends MA {
    public String J;

    /* renamed from: K, reason: collision with root package name */
    public final long f28684K;

    /* renamed from: L, reason: collision with root package name */
    public final String f28685L;

    /* renamed from: M, reason: collision with root package name */
    public final String f28686M;

    /* renamed from: N, reason: collision with root package name */
    public final String f28687N;

    public U6(String str) {
        super(19);
        this.J = "E";
        this.f28684K = -1L;
        this.f28685L = "E";
        this.f28686M = "E";
        this.f28687N = "E";
        HashMap p9 = MA.p(str);
        if (p9 != null) {
            this.J = p9.get(0) == null ? "E" : (String) p9.get(0);
            this.f28684K = p9.get(1) != null ? ((Long) p9.get(1)).longValue() : -1L;
            this.f28685L = p9.get(2) == null ? "E" : (String) p9.get(2);
            this.f28686M = p9.get(3) == null ? "E" : (String) p9.get(3);
            this.f28687N = p9.get(4) != null ? (String) p9.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.MA
    public final HashMap e() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.J);
        hashMap.put(4, this.f28687N);
        hashMap.put(3, this.f28686M);
        hashMap.put(2, this.f28685L);
        hashMap.put(1, Long.valueOf(this.f28684K));
        return hashMap;
    }
}
