package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class YF extends AbstractC3848rE {

    /* renamed from: a, reason: collision with root package name */
    public final String f29439a;

    /* renamed from: b, reason: collision with root package name */
    public final C3956tE f29440b;

    public YF(String str, C3956tE c3956tE) {
        this.f29439a = str;
        this.f29440b = c3956tE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f29440b != C3956tE.f35018f;
    }

    public final String toString() {
        return com.IceFishing.LiveIceFishing.k.r(new StringBuilder("(typeUrl="), this.f29439a, ", outputPrefixType=", this.f29440b.f35038b, ")");
    }
}
