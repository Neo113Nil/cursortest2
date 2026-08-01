package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Yo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2879Yo extends k2.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BinderC2895Zo f28741n;

    public C2879Yo(BinderC2895Zo binderC2895Zo) {
        Objects.requireNonNull(binderC2895Zo);
        this.f28741n = binderC2895Zo;
    }

    @Override // k2.c
    public final void onAdFailedToLoad(k2.n nVar) {
        this.f28741n.V3(BinderC2895Zo.Y3(nVar));
    }
}
