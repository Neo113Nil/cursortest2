package defpackage;

import com.yandex.plus.core.graphql.type.RestrictionMode;

/* loaded from: classes8.dex */
public final class qax0 {
    public final String a;
    public final boolean b;
    public final RestrictionMode c;

    public qax0(String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = z ? RestrictionMode.UNRESTRICTED : RestrictionMode.RESTRICTED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qax0)) {
            return false;
        }
        qax0 qax0Var = (qax0) obj;
        return jl40.l(this.a, qax0Var.a) && this.b == qax0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InAppStoreConfig(storeCountryCode=");
        sb.append(this.a);
        sb.append(", isNativePaymentAvailable=");
        return unr0.u(sb, this.b, ')');
    }
}
