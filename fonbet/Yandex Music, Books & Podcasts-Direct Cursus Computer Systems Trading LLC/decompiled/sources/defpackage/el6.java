package defpackage;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class el6 implements Serializable {
    private static final long serialVersionUID = -765379192675960412L;
    public final String a;
    public final String b;

    public el6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || el6.class != obj.getClass()) {
            return false;
        }
        el6 el6Var = (el6) obj;
        String str = el6Var.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = el6Var.b;
        String str4 = this.b;
        return str4 == null ? str3 == null : str4.equals(str3);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CopyrightInfo{name='");
        sb.append(this.a);
        sb.append("', cline='");
        return su4.o(sb, this.b, "'}");
    }
}
