package com.google.android.gms.internal.ads;

import java.util.Objects;
import w2.AbstractC5148a;
import w2.AbstractC5149b;

/* renamed from: com.google.android.gms.internal.ads.Vo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2831Vo extends AbstractC5149b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f28238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC2895Zo f28239f;

    public C2831Vo(BinderC2895Zo binderC2895Zo, String str) {
        this.f28238e = str;
        Objects.requireNonNull(binderC2895Zo);
        this.f28239f = binderC2895Zo;
    }

    @Override // k2.x
    public final void onAdFailedToLoad(k2.n nVar) {
        this.f28239f.V3(BinderC2895Zo.Y3(nVar));
    }

    @Override // k2.x
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        this.f28239f.U3((AbstractC5148a) obj, this.f28238e);
    }
}
