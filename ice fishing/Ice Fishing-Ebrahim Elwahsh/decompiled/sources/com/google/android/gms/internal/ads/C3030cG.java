package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3030cG extends AbstractC4000uE {

    /* renamed from: a, reason: collision with root package name */
    public final String f29661a;

    /* renamed from: b, reason: collision with root package name */
    public final EI f29662b;

    public C3030cG(String str, EI ei) {
        this.f29661a = str;
        this.f29662b = ei;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f29662b != EI.RAW;
    }

    public final String toString() {
        int ordinal = this.f29662b.ordinal();
        return com.anythink.basead.b.c.i.q(new StringBuilder("(typeUrl="), this.f29661a, ", outputPrefixType=", ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
