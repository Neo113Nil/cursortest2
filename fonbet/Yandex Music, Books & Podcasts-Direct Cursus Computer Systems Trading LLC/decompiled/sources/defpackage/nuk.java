package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nuk {
    public final iuk a;
    public final duk b;

    public nuk(boolean z) {
        this(null, new duk(z));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuk)) {
            return false;
        }
        nuk nukVar = (nuk) obj;
        return Intrinsics.d(this.b, nukVar.b) && Intrinsics.d(this.a, nukVar.a);
    }

    public final int hashCode() {
        iuk iukVar = this.a;
        int hashCode = (iukVar != null ? iukVar.hashCode() : 0) * 31;
        duk dukVar = this.b;
        return hashCode + (dukVar != null ? dukVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }

    public nuk(iuk iukVar, duk dukVar) {
        this.a = iukVar;
        this.b = dukVar;
    }
}
