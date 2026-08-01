package com.google.android.gms.internal.ads;

import java.util.Objects;
import m2.AbstractC4730a;
import m2.AbstractC4731b;

/* renamed from: com.google.android.gms.internal.ads.To, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2799To extends AbstractC4730a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f27794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC2895Zo f27795f;

    public C2799To(BinderC2895Zo binderC2895Zo, String str) {
        this.f27794e = str;
        Objects.requireNonNull(binderC2895Zo);
        this.f27795f = binderC2895Zo;
    }

    @Override // k2.x
    public final void onAdFailedToLoad(k2.n nVar) {
        this.f27795f.V3(BinderC2895Zo.Y3(nVar));
    }

    @Override // k2.x
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.f27794e;
        this.f27795f.U3((AbstractC4731b) obj, str);
    }
}
