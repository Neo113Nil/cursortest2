package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q2n {
    public final String a;
    public final String b;
    public final String c;
    public final Function1 d;
    public final Function1 e;
    public final r2n f;

    public q2n(String str, String str2, String str3, Function1 function1, Function1 function12, r2n r2nVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = function1;
        this.e = function12;
        this.f = r2nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2n)) {
            return false;
        }
        q2n q2nVar = (q2n) obj;
        return Intrinsics.d(this.a, q2nVar.a) && Intrinsics.d(this.b, q2nVar.b) && Intrinsics.d(this.c, q2nVar.c) && this.d.equals(q2nVar.d) && this.e.equals(q2nVar.e) && this.f == q2nVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PurchaseBlockButtonState(buttonText=", this.a, ", buttonAdditionalText=", this.b, ", buttonCombinedTextA11y=");
        m.append(this.c);
        m.append(", startPayment=");
        m.append(this.d);
        m.append(", onVisibilityChanged=");
        m.append(this.e);
        m.append(", type=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
