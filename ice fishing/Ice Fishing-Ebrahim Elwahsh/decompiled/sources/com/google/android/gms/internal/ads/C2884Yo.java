package com.google.android.gms.internal.ads;

import java.util.Objects;
import k2.C4643n;

/* renamed from: com.google.android.gms.internal.ads.Yo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2884Yo extends G2.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f28884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC2948ap f28885f;

    public C2884Yo(BinderC2948ap binderC2948ap, String str) {
        this.f28884e = str;
        Objects.requireNonNull(binderC2948ap);
        this.f28885f = binderC2948ap;
    }

    @Override // k2.x
    public final void onAdFailedToLoad(C4643n c4643n) {
        this.f28885f.H3(BinderC2948ap.K3(c4643n));
    }

    @Override // k2.x
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.f28884e;
        this.f28885f.G3((G2.a) obj, str);
    }
}
