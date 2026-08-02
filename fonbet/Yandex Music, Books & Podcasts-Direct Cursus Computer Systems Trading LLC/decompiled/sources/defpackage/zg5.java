package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zg5 {
    public final String a;
    public final String b;

    public zg5(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg5)) {
            return false;
        }
        zg5 zg5Var = (zg5) obj;
        return Intrinsics.d(this.a, zg5Var.a) && Intrinsics.d(this.b, zg5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("Action(uri=", this.a, ", id=", this.b, ")");
    }
}
