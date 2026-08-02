package com.google.android.gms.internal.ads;

import java.util.Objects;
import o2.AbstractC4801a;
import o2.AbstractC4802b;

/* renamed from: com.google.android.gms.internal.ads.Uo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2837Uo extends AbstractC4801a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f28779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC2918Zo f28780f;

    public C2837Uo(BinderC2918Zo binderC2918Zo, String str) {
        this.f28779e = str;
        Objects.requireNonNull(binderC2918Zo);
        this.f28780f = binderC2918Zo;
    }

    @Override // m2.x
    public final void onAdFailedToLoad(m2.n nVar) {
        this.f28780f.V3(BinderC2918Zo.Y3(nVar));
    }

    @Override // m2.x
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.f28779e;
        this.f28780f.U3((AbstractC4802b) obj, str);
    }
}
