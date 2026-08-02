package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tor {
    public final String a;
    public final String b;
    public final String c;

    public tor(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tor)) {
            return false;
        }
        tor torVar = (tor) obj;
        return Intrinsics.d(this.a, torVar.a) && Intrinsics.d(this.b, torVar.b) && Intrinsics.d(this.c, torVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return su4.o(f1d.m("SubscriptionButtonData(text=", this.a, ", additionalText=", this.b, ", combinedTextA11y="), this.c, ")");
    }
}
