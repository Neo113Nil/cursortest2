package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jxa {
    public final String a;
    public final String b;

    public jxa(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxa)) {
            return false;
        }
        jxa jxaVar = (jxa) obj;
        return Intrinsics.d(this.a, jxaVar.a) && Intrinsics.d(this.b, jxaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("Action(id=", this.a, ", url=", this.b, ")");
    }
}
