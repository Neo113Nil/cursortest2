package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class pmu extends v3g {
    public final String b;
    public final nmu c;

    public pmu(String str, nmu nmuVar) {
        nmuVar.getClass();
        this.b = str;
        this.c = nmuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmu)) {
            return false;
        }
        pmu pmuVar = (pmu) obj;
        return Intrinsics.d(this.b, pmuVar.b) && this.c == pmuVar.c;
    }

    public final int hashCode() {
        String str = this.b;
        return this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Image(imageUrl=" + this.b + ", rounding=" + this.c + ")";
    }
}
