package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.eF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3138eF extends AE {

    /* renamed from: a, reason: collision with root package name */
    public final GE f30336a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30337b;

    /* renamed from: c, reason: collision with root package name */
    public final C3731pE f30338c;

    /* renamed from: d, reason: collision with root package name */
    public final AE f30339d;

    public C3138eF(GE ge, String str, C3731pE c3731pE, AE ae) {
        this.f30336a = ge;
        this.f30337b = str;
        this.f30338c = c3731pE;
        this.f30339d = ae;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f30336a != GE.f25123l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3138eF)) {
            return false;
        }
        C3138eF c3138eF = (C3138eF) obj;
        return c3138eF.f30338c.equals(this.f30338c) && c3138eF.f30339d.equals(this.f30339d) && c3138eF.f30337b.equals(this.f30337b) && c3138eF.f30336a.equals(this.f30336a);
    }

    public final int hashCode() {
        return Objects.hash(C3138eF.class, this.f30337b, this.f30338c, this.f30339d, this.f30336a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f30338c);
        String valueOf2 = String.valueOf(this.f30339d);
        String valueOf3 = String.valueOf(this.f30336a);
        String str = this.f30337b;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + valueOf2.length() + 11 + valueOf3.length() + 1);
        AbstractC5051n.j(sb, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", valueOf);
        AbstractC5051n.j(sb, ", dekParametersForNewKeys: ", valueOf2, ", variant: ", valueOf3);
        sb.append(")");
        return sb.toString();
    }
}
