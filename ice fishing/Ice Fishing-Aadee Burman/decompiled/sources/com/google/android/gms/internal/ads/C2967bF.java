package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.bF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2967bF extends AbstractC4257zE {

    /* renamed from: a, reason: collision with root package name */
    public final FE f29248a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29249b;

    /* renamed from: c, reason: collision with root package name */
    public final C3933tE f29250c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC4257zE f29251d;

    public C2967bF(FE fe, String str, C3933tE c3933tE, AbstractC4257zE abstractC4257zE) {
        this.f29248a = fe;
        this.f29249b = str;
        this.f29250c = c3933tE;
        this.f29251d = abstractC4257zE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f29248a != FE.f24762E;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2967bF)) {
            return false;
        }
        C2967bF c2967bF = (C2967bF) obj;
        return c2967bF.f29250c.equals(this.f29250c) && c2967bF.f29251d.equals(this.f29251d) && c2967bF.f29249b.equals(this.f29249b) && c2967bF.f29248a.equals(this.f29248a);
    }

    public final int hashCode() {
        return Objects.hash(C2967bF.class, this.f29249b, this.f29250c, this.f29251d, this.f29248a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f29250c);
        String valueOf2 = String.valueOf(this.f29251d);
        String valueOf3 = String.valueOf(this.f29248a);
        String str = this.f29249b;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + valueOf2.length() + 11 + valueOf3.length() + 1);
        u1.h.i(sb, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", valueOf);
        u1.h.i(sb, ", dekParametersForNewKeys: ", valueOf2, ", variant: ", valueOf3);
        sb.append(")");
        return sb.toString();
    }
}
