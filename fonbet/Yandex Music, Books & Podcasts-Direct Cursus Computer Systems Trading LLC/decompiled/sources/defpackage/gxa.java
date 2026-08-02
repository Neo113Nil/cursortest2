package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gxa {
    public final String a;
    public final String b;

    public gxa(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxa)) {
            return false;
        }
        gxa gxaVar = (gxa) obj;
        return Intrinsics.d(this.a, gxaVar.a) && Intrinsics.d(this.b, gxaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("DynamicToastAction(id=", this.a, ", url=", this.b, ")");
    }
}
