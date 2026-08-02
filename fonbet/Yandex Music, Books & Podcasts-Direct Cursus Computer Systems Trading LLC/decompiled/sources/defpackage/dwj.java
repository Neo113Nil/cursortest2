package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dwj extends fwj {
    public final String a;
    public final mkj b;

    public dwj(String str, mkj mkjVar) {
        str.getClass();
        this.a = str;
        this.b = mkjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwj)) {
            return false;
        }
        dwj dwjVar = (dwj) obj;
        return Intrinsics.d(this.a, dwjVar.a) && Intrinsics.d(this.b, dwjVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mkj mkjVar = this.b;
        return hashCode + (mkjVar == null ? 0 : mkjVar.hashCode());
    }

    public final String toString() {
        return "Error(message=" + this.a + ", config=" + this.b + ")";
    }
}
