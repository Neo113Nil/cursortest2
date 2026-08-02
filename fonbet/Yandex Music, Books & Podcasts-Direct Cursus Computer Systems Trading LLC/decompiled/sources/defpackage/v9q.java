package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v9q implements x9q {
    public final String a;
    public final String b;

    public v9q(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.x9q
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9q)) {
            return false;
        }
        v9q v9qVar = (v9q) obj;
        return Intrinsics.d(this.a, v9qVar.a) && Intrinsics.d(this.b, v9qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.x9q
    public final String s() {
        return this.a;
    }

    public final String toString() {
        return hrg.s("Default(owner=", this.a, ", kind=", this.b, ")");
    }
}
