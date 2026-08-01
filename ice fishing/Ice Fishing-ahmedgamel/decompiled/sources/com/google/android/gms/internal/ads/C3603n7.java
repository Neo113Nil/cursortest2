package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.n7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3603n7 extends MA {
    public final /* synthetic */ int J = 0;

    /* renamed from: K, reason: collision with root package name */
    public Long f32687K;

    /* renamed from: L, reason: collision with root package name */
    public Object f32688L;

    /* renamed from: M, reason: collision with root package name */
    public Object f32689M;

    public /* synthetic */ C3603n7() {
        super(19);
    }

    @Override // com.google.android.gms.internal.ads.MA
    public final HashMap e() {
        switch (this.J) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put(0, this.f32687K);
                hashMap.put(1, (Long) this.f32688L);
                hashMap.put(2, (Long) this.f32689M);
                return hashMap;
            default:
                HashMap hashMap2 = new HashMap();
                hashMap2.put(0, this.f32687K);
                hashMap2.put(1, (Boolean) this.f32688L);
                hashMap2.put(2, (Boolean) this.f32689M);
                return hashMap2;
        }
    }

    public C3603n7(String str) {
        super(19);
        HashMap p9 = MA.p(str);
        if (p9 != null) {
            this.f32687K = (Long) p9.get(0);
            this.f32688L = (Boolean) p9.get(1);
            this.f32689M = (Boolean) p9.get(2);
        }
    }
}
