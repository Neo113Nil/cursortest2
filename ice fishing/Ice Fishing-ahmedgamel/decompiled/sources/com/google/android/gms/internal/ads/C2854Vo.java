package com.google.android.gms.internal.ads;

import java.util.Objects;
import y2.AbstractC5205a;
import y2.AbstractC5206b;

/* renamed from: com.google.android.gms.internal.ads.Vo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2854Vo extends AbstractC5206b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f29036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC2918Zo f29037f;

    public C2854Vo(BinderC2918Zo binderC2918Zo, String str) {
        this.f29036e = str;
        Objects.requireNonNull(binderC2918Zo);
        this.f29037f = binderC2918Zo;
    }

    @Override // m2.x
    public final void onAdFailedToLoad(m2.n nVar) {
        this.f29037f.V3(BinderC2918Zo.Y3(nVar));
    }

    @Override // m2.x
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        this.f29037f.U3((AbstractC5205a) obj, this.f29036e);
    }
}
