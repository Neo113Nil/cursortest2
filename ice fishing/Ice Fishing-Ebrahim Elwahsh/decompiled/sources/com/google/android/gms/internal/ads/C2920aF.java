package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.aF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2920aF extends AE {

    /* renamed from: a, reason: collision with root package name */
    public final String f29187a;

    /* renamed from: b, reason: collision with root package name */
    public final LE f29188b;

    public C2920aF(String str, LE le) {
        this.f29187a = str;
        this.f29188b = le;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f29188b != LE.f26128z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2920aF)) {
            return false;
        }
        C2920aF c2920aF = (C2920aF) obj;
        return c2920aF.f29187a.equals(this.f29187a) && c2920aF.f29188b.equals(this.f29188b);
    }

    public final int hashCode() {
        return Objects.hash(C2920aF.class, this.f29187a, this.f29188b);
    }

    public final String toString() {
        String str = this.f29188b.f26130u;
        String str2 = this.f29187a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 45 + str.length() + 1);
        AbstractC5051n.j(sb, "LegacyKmsAead Parameters (keyUri: ", str2, ", variant: ", str);
        sb.append(")");
        return sb.toString();
    }
}
