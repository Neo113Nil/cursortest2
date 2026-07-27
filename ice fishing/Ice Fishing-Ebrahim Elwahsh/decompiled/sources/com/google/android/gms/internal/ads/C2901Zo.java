package com.google.android.gms.internal.ads;

import java.util.Objects;
import k2.AbstractC4632c;
import k2.C4643n;

/* renamed from: com.google.android.gms.internal.ads.Zo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2901Zo extends AbstractC4632c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BinderC2948ap f29065n;

    public C2901Zo(BinderC2948ap binderC2948ap) {
        Objects.requireNonNull(binderC2948ap);
        this.f29065n = binderC2948ap;
    }

    @Override // k2.AbstractC4632c
    public final void onAdFailedToLoad(C4643n c4643n) {
        this.f29065n.H3(BinderC2948ap.K3(c4643n));
    }
}
