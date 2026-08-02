package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q3n {
    public final String a;
    public r3n b;
    public w3n c;
    public String d;

    public q3n(String str, r3n r3nVar, w3n w3nVar, String str2) {
        str.getClass();
        this.a = str;
        this.b = r3nVar;
        this.c = w3nVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3n)) {
            return false;
        }
        q3n q3nVar = (q3n) obj;
        return Intrinsics.d(this.a, q3nVar.a) && this.b == q3nVar.b && this.c == q3nVar.c && Intrinsics.d(this.d, q3nVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        w3n w3nVar = this.c;
        int hashCode2 = (hashCode + (w3nVar == null ? 0 : w3nVar.hashCode())) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PurchaseCommunicationFunnelSession(id=" + this.a + ", step=" + this.b + ", paymentResultStep=" + this.c + ", paymentResultFailureDescription=" + this.d + ")";
    }
}
