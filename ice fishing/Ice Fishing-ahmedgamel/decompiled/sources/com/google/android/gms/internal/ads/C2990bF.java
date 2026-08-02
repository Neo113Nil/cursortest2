package com.google.android.gms.internal.ads;

import java.util.Objects;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.bF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2990bF extends AbstractC4280zE {

    /* renamed from: a, reason: collision with root package name */
    public final FE f30036a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30037b;

    /* renamed from: c, reason: collision with root package name */
    public final C3956tE f30038c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC4280zE f30039d;

    public C2990bF(FE fe, String str, C3956tE c3956tE, AbstractC4280zE abstractC4280zE) {
        this.f30036a = fe;
        this.f30037b = str;
        this.f30038c = c3956tE;
        this.f30039d = abstractC4280zE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f30036a != FE.f25518E;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2990bF)) {
            return false;
        }
        C2990bF c2990bF = (C2990bF) obj;
        return c2990bF.f30038c.equals(this.f30038c) && c2990bF.f30039d.equals(this.f30039d) && c2990bF.f30037b.equals(this.f30037b) && c2990bF.f30036a.equals(this.f30036a);
    }

    public final int hashCode() {
        return Objects.hash(C2990bF.class, this.f30037b, this.f30038c, this.f30039d, this.f30036a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f30038c);
        String valueOf2 = String.valueOf(this.f30039d);
        String valueOf3 = String.valueOf(this.f30036a);
        String str = this.f30037b;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + valueOf2.length() + 11 + valueOf3.length() + 1);
        AbstractC5128c.h(sb, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", valueOf);
        AbstractC5128c.h(sb, ", dekParametersForNewKeys: ", valueOf2, ", variant: ", valueOf3);
        sb.append(")");
        return sb.toString();
    }
}
