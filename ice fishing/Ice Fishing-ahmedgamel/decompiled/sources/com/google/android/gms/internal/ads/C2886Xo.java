package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Xo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2886Xo extends J2.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f29356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC2918Zo f29357f;

    public C2886Xo(BinderC2918Zo binderC2918Zo, String str) {
        this.f29356e = str;
        Objects.requireNonNull(binderC2918Zo);
        this.f29357f = binderC2918Zo;
    }

    @Override // m2.x
    public final void onAdFailedToLoad(m2.n nVar) {
        this.f29357f.V3(BinderC2918Zo.Y3(nVar));
    }

    @Override // m2.x
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.f29356e;
        this.f29357f.U3((J2.a) obj, str);
    }
}
