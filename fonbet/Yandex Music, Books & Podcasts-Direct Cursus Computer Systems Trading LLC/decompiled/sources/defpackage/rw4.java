package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rw4 {
    public final uga a;
    public final String b;

    public rw4(uga ugaVar, String str) {
        str.getClass();
        this.a = ugaVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw4)) {
            return false;
        }
        rw4 rw4Var = (rw4) obj;
        return this.a.equals(rw4Var.a) && Intrinsics.d(this.b, rw4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistId(user=" + this.a + ", kind=" + this.b + ")";
    }
}
