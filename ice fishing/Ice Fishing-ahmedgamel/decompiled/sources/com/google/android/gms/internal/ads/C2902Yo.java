package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Yo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2902Yo extends m2.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BinderC2918Zo f29520n;

    public C2902Yo(BinderC2918Zo binderC2918Zo) {
        Objects.requireNonNull(binderC2918Zo);
        this.f29520n = binderC2918Zo;
    }

    @Override // m2.c
    public final void onAdFailedToLoad(m2.n nVar) {
        this.f29520n.V3(BinderC2918Zo.Y3(nVar));
    }
}
