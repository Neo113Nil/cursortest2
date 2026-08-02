package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p3n {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final epa f;

    public p3n(String str, String str2, String str3, String str4, String str5, epa epaVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = epaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3n)) {
            return false;
        }
        p3n p3nVar = (p3n) obj;
        return Intrinsics.d(this.a, p3nVar.a) && Intrinsics.d(this.b, p3nVar.b) && Intrinsics.d(this.c, p3nVar.c) && Intrinsics.d(this.d, p3nVar.d) && Intrinsics.d(this.e, p3nVar.e) && this.f.equals(p3nVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return this.f.hashCode() + ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PurchaseButtonState(buttonText=", this.a, ", buttonAdditionalText=", this.b, ", buttonCombinedTextA11y=");
        su4.v(m, this.c, ", oneClickDisclaimerText=", this.d, ", oneClickDisclaimerTextA11y=");
        m.append(this.e);
        m.append(", startPayment=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
