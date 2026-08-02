package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class tx3 {
    public final saf a;
    public final String b;

    public tx3(saf safVar, String str) {
        this.a = safVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx3)) {
            return false;
        }
        tx3 tx3Var = (tx3) obj;
        return this.a.equals(tx3Var.a) && Intrinsics.d(this.b, tx3Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ArtistSelection(coverComposition=" + this.a + ", description=" + this.b + ")";
    }
}
