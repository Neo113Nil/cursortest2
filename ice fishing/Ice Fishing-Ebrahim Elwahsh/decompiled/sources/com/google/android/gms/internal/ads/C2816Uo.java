package com.google.android.gms.internal.ads;

import java.util.Objects;
import k2.C4643n;
import m2.AbstractC4777a;
import m2.AbstractC4778b;

/* renamed from: com.google.android.gms.internal.ads.Uo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2816Uo extends AbstractC4777a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f28085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC2948ap f28086f;

    public C2816Uo(BinderC2948ap binderC2948ap, String str) {
        this.f28085e = str;
        Objects.requireNonNull(binderC2948ap);
        this.f28086f = binderC2948ap;
    }

    @Override // k2.x
    public final void onAdFailedToLoad(C4643n c4643n) {
        this.f28086f.H3(BinderC2948ap.K3(c4643n));
    }

    @Override // k2.x
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.f28085e;
        this.f28086f.G3((AbstractC4778b) obj, str);
    }
}
