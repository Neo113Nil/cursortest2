package com.google.android.gms.internal.ads;

import java.util.Objects;
import k2.C4643n;

/* renamed from: com.google.android.gms.internal.ads.Xo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2867Xo extends F2.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f28696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC2948ap f28697f;

    public C2867Xo(BinderC2948ap binderC2948ap, String str) {
        this.f28696e = str;
        Objects.requireNonNull(binderC2948ap);
        this.f28697f = binderC2948ap;
    }

    @Override // k2.x
    public final void onAdFailedToLoad(C4643n c4643n) {
        this.f28697f.H3(BinderC2948ap.K3(c4643n));
    }

    @Override // k2.x
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.f28696e;
        this.f28697f.G3((F2.c) obj, str);
    }
}
