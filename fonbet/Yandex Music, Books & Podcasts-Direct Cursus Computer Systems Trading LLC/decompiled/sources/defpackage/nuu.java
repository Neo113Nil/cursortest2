package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nuu {
    public static final nuu c = new nuu(bzs.e, null);
    public final bzs a;
    public final Float b;

    public nuu(bzs bzsVar, Float f) {
        this.a = bzsVar;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuu)) {
            return false;
        }
        nuu nuuVar = (nuu) obj;
        return this.a.equals(nuuVar.a) && Intrinsics.d(this.b, nuuVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "WaveMood(trackParameters=" + this.a + ", collectionHue=" + this.b + ")";
    }
}
