package defpackage;

import com.yandex.plus.core.graphql.type.ARG_CHECKING_PREDICATE_TYPE;

/* loaded from: classes2.dex */
public final class yoc0 {
    public final ARG_CHECKING_PREDICATE_TYPE a;
    public final String b;

    public yoc0(ARG_CHECKING_PREDICATE_TYPE arg_checking_predicate_type, String str) {
        this.a = arg_checking_predicate_type;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final ARG_CHECKING_PREDICATE_TYPE b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoc0)) {
            return false;
        }
        yoc0 yoc0Var = (yoc0) obj;
        return this.a == yoc0Var.a && this.b.equals(yoc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArgCheckingPredicate(type=");
        sb.append(this.a);
        sb.append(", argName=");
        return b64.p(sb, this.b, ')');
    }
}
