package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.n7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3626n7 extends MA {
    public final /* synthetic */ int J = 0;

    /* renamed from: K, reason: collision with root package name */
    public Long f33465K;

    /* renamed from: L, reason: collision with root package name */
    public Object f33466L;

    /* renamed from: M, reason: collision with root package name */
    public Object f33467M;

    public /* synthetic */ C3626n7() {
        super(19);
    }

    @Override // com.google.android.gms.internal.ads.MA
    public final HashMap e() {
        switch (this.J) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put(0, this.f33465K);
                hashMap.put(1, (Long) this.f33466L);
                hashMap.put(2, (Long) this.f33467M);
                return hashMap;
            default:
                HashMap hashMap2 = new HashMap();
                hashMap2.put(0, this.f33465K);
                hashMap2.put(1, (Boolean) this.f33466L);
                hashMap2.put(2, (Boolean) this.f33467M);
                return hashMap2;
        }
    }

    public C3626n7(String str) {
        super(19);
        HashMap p9 = MA.p(str);
        if (p9 != null) {
            this.f33465K = (Long) p9.get(0);
            this.f33466L = (Boolean) p9.get(1);
            this.f33467M = (Boolean) p9.get(2);
        }
    }
}
