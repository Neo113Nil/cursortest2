package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dkd {
    public final String a;
    public final String b;

    public dkd(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkd)) {
            return false;
        }
        dkd dkdVar = (dkd) obj;
        return Intrinsics.d(this.a, dkdVar.a) && this.b.equals(dkdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("GlagolUserConfig(userId=", this.a, ", userToken=", this.b, ")");
    }
}
