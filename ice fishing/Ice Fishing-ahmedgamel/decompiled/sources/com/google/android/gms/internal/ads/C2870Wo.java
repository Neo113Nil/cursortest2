package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Wo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2870Wo extends I2.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f29185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC2918Zo f29186f;

    public C2870Wo(BinderC2918Zo binderC2918Zo, String str) {
        this.f29185e = str;
        Objects.requireNonNull(binderC2918Zo);
        this.f29186f = binderC2918Zo;
    }

    @Override // m2.x
    public final void onAdFailedToLoad(m2.n nVar) {
        this.f29186f.V3(BinderC2918Zo.Y3(nVar));
    }

    @Override // m2.x
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.f29185e;
        this.f29186f.U3((I2.c) obj, str);
    }
}
