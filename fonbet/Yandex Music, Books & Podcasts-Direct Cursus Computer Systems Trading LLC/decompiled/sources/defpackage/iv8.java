package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class iv8 {
    public final String a;
    public final String b;

    public iv8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv8)) {
            return false;
        }
        iv8 iv8Var = (iv8) obj;
        return Intrinsics.d(this.a, iv8Var.a) && Intrinsics.d(this.b, iv8Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return hrg.s("DivCustomPaymentButton(communicationId=", this.a, ", actionId=", this.b, ")");
    }
}
