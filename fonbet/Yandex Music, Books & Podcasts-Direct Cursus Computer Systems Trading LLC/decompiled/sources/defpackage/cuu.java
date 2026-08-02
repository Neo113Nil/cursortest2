package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cuu {
    public final yku a;
    public final xxu b;

    public cuu(yku ykuVar, xxu xxuVar) {
        this.a = ykuVar;
        this.b = xxuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuu)) {
            return false;
        }
        cuu cuuVar = (cuu) obj;
        return this.a.equals(cuuVar.a) && Intrinsics.d(this.b, cuuVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xxu xxuVar = this.b;
        return hashCode + (xxuVar == null ? 0 : xxuVar.hashCode());
    }

    public final String toString() {
        return "WaveLast(wave=" + this.a + ", promo=" + this.b + ")";
    }
}
