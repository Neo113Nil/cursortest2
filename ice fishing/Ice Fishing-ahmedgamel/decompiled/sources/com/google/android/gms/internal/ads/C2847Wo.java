package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Wo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2847Wo extends G2.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f28403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC2895Zo f28404f;

    public C2847Wo(BinderC2895Zo binderC2895Zo, String str) {
        this.f28403e = str;
        Objects.requireNonNull(binderC2895Zo);
        this.f28404f = binderC2895Zo;
    }

    @Override // k2.x
    public final void onAdFailedToLoad(k2.n nVar) {
        this.f28404f.V3(BinderC2895Zo.Y3(nVar));
    }

    @Override // k2.x
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.f28403e;
        this.f28404f.U3((G2.c) obj, str);
    }
}
