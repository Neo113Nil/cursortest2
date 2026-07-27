package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class R6 extends AbstractC2720Pd {

    /* renamed from: I, reason: collision with root package name */
    public String f27309I;
    public final long J;

    /* renamed from: K, reason: collision with root package name */
    public final String f27310K;

    /* renamed from: L, reason: collision with root package name */
    public final String f27311L;

    /* renamed from: M, reason: collision with root package name */
    public final String f27312M;

    public R6(String str) {
        super(19);
        this.f27309I = "E";
        this.J = -1L;
        this.f27310K = "E";
        this.f27311L = "E";
        this.f27312M = "E";
        HashMap o9 = AbstractC2720Pd.o(str);
        if (o9 != null) {
            this.f27309I = o9.get(0) == null ? "E" : (String) o9.get(0);
            this.J = o9.get(1) != null ? ((Long) o9.get(1)).longValue() : -1L;
            this.f27310K = o9.get(2) == null ? "E" : (String) o9.get(2);
            this.f27311L = o9.get(3) == null ? "E" : (String) o9.get(3);
            this.f27312M = o9.get(4) != null ? (String) o9.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2720Pd
    public final HashMap f() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f27309I);
        hashMap.put(4, this.f27312M);
        hashMap.put(3, this.f27311L);
        hashMap.put(2, this.f27310K);
        hashMap.put(1, Long.valueOf(this.J));
        return hashMap;
    }
}
