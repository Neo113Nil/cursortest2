package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tgw extends vgw {
    public final Throwable a;
    public final String b;

    public tgw(Throwable th, String str) {
        th.getClass();
        str.getClass();
        this.a = th;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgw)) {
            return false;
        }
        tgw tgwVar = (tgw) obj;
        return Intrinsics.d(this.a, tgwVar.a) && Intrinsics.d(this.b, tgwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(exception=" + this.a + ", message=" + this.b + ")";
    }
}
