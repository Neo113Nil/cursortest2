package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nwk {
    public final String a;
    public final String b;

    public nwk(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwk)) {
            return false;
        }
        nwk nwkVar = (nwk) obj;
        return Intrinsics.d(this.a, nwkVar.a) && Intrinsics.d(this.b, nwkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("PlayableData(id=", this.a, ", title=", this.b, ")");
    }
}
