package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class RG extends UG {

    /* renamed from: a, reason: collision with root package name */
    public final int f27327a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27328b;

    /* renamed from: c, reason: collision with root package name */
    public final QG f27329c;

    /* renamed from: d, reason: collision with root package name */
    public final PG f27330d;

    public RG(int i, int i4, QG qg, PG pg) {
        this.f27327a = i;
        this.f27328b = i4;
        this.f27329c = qg;
        this.f27330d = pg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f27329c != QG.f27135e;
    }

    public final int b() {
        QG qg = QG.f27135e;
        int i = this.f27328b;
        QG qg2 = this.f27329c;
        if (qg2 == qg) {
            return i;
        }
        if (qg2 == QG.f27132b || qg2 == QG.f27133c || qg2 == QG.f27134d) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RG)) {
            return false;
        }
        RG rg = (RG) obj;
        return rg.f27327a == this.f27327a && rg.b() == b() && rg.f27329c == this.f27329c && rg.f27330d == this.f27330d;
    }

    public final int hashCode() {
        return Objects.hash(RG.class, Integer.valueOf(this.f27327a), Integer.valueOf(this.f27328b), this.f27329c, this.f27330d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27329c);
        String valueOf2 = String.valueOf(this.f27330d);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i = this.f27328b;
        int length3 = String.valueOf(i).length();
        int i4 = this.f27327a;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i4).length() + 10);
        AbstractC5051n.j(sb, "HMAC Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        AbstractC5051n.i(sb, ", ", i, "-byte tags, and ", i4);
        sb.append("-byte key)");
        return sb.toString();
    }
}
