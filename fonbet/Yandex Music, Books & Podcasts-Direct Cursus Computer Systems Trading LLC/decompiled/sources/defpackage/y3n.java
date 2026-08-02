package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y3n {
    public final String a;
    public final String b;
    public final String c;

    public y3n(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3n)) {
            return false;
        }
        y3n y3nVar = (y3n) obj;
        return Intrinsics.d(this.a, y3nVar.a) && Intrinsics.d(this.b, y3nVar.b) && this.c.equals(y3nVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return su4.o(f1d.m("PurchaseSliderItemText(text=", this.a, ", accentText=", this.b, ", textA11y="), this.c, ")");
    }
}
