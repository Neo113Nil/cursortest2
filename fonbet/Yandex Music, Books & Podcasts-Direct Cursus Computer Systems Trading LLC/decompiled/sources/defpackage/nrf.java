package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nrf {
    public final String a;
    public final String b;

    public nrf(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrf)) {
            return false;
        }
        nrf nrfVar = (nrf) obj;
        return Intrinsics.d(this.a, nrfVar.a) && Intrinsics.d(this.b, nrfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("LazyBlockMeta(id=", this.a, ", type=", this.b, ")");
    }
}
