package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class jc2 extends yp6 {
    public final String a;
    public final String b;
    public final List c;
    public final yp6 d;
    public final int e;

    public jc2(String str, String str2, List list, yp6 yp6Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = yp6Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yp6) {
            jc2 jc2Var = (jc2) ((yp6) obj);
            if (this.a.equals(jc2Var.a)) {
                String str = jc2Var.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c.equals(jc2Var.c)) {
                        yp6 yp6Var = jc2Var.d;
                        yp6 yp6Var2 = this.d;
                        if (yp6Var2 != null ? yp6Var2.equals(yp6Var) : yp6Var == null) {
                            if (this.e == jc2Var.e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        yp6 yp6Var = this.d;
        return ((hashCode2 ^ (yp6Var != null ? yp6Var.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return f1d.i(sb, this.e, "}");
    }
}
