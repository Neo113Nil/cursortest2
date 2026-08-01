package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Xo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2863Xo extends H2.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f28575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC2895Zo f28576f;

    public C2863Xo(BinderC2895Zo binderC2895Zo, String str) {
        this.f28575e = str;
        Objects.requireNonNull(binderC2895Zo);
        this.f28576f = binderC2895Zo;
    }

    @Override // k2.x
    public final void onAdFailedToLoad(k2.n nVar) {
        this.f28576f.V3(BinderC2895Zo.Y3(nVar));
    }

    @Override // k2.x
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.f28575e;
        this.f28576f.U3((H2.a) obj, str);
    }
}
