package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nir extends hdg {
    public final String d;
    public final String e;

    public nir(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.hdg
    public final String X() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nir)) {
            return false;
        }
        nir nirVar = (nir) obj;
        return Intrinsics.d(this.d, nirVar.d) && this.e.equals(nirVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "UrlStoredValue(name=" + this.d + ", value=" + ((Object) this.e) + ')';
    }
}
