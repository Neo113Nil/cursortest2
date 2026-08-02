package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zc5 implements bd5 {
    public final String a;
    public final String b;

    public zc5(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.bd5
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc5)) {
            return false;
        }
        zc5 zc5Var = (zc5) obj;
        return Intrinsics.d(this.a, zc5Var.a) && Intrinsics.d(this.b, zc5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.bd5
    public final String s() {
        return this.a;
    }

    public final String toString() {
        return hrg.s("Default(owner=", this.a, ", kind=", this.b, ")");
    }
}
