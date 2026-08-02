package defpackage;

import com.yandex.plus.pay.inapp.api.PlusPayInAppReplacementParams$Strategy;

/* loaded from: classes2.dex */
public final class ucd0 {
    public final String a;
    public final PlusPayInAppReplacementParams$Strategy b;

    public ucd0(String str, PlusPayInAppReplacementParams$Strategy plusPayInAppReplacementParams$Strategy) {
        this.a = str;
        this.b = plusPayInAppReplacementParams$Strategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucd0)) {
            return false;
        }
        ucd0 ucd0Var = (ucd0) obj;
        return jl40.l(this.a, ucd0Var.a) && this.b == ucd0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlusPayInAppReplacementParams(purchaseToken=" + this.a + ", strategy=" + this.b + ')';
    }
}
