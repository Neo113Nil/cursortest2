package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class YF extends AbstractC3825rE {

    /* renamed from: a, reason: collision with root package name */
    public final String f28662a;

    /* renamed from: b, reason: collision with root package name */
    public final C3933tE f28663b;

    public YF(String str, C3933tE c3933tE) {
        this.f28662a = str;
        this.f28663b = c3933tE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f28663b != C3933tE.f34232f;
    }

    public final String toString() {
        return com.anythink.basead.exoplayer.f.f.o(new StringBuilder("(typeUrl="), this.f28662a, ", outputPrefixType=", this.f28663b.f34252b, ")");
    }
}
