package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class wb2 extends tp6 {
    public final List a;
    public final String b;

    public wb2(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tp6)) {
            return false;
        }
        wb2 wb2Var = (wb2) ((tp6) obj);
        if (!this.a.equals(wb2Var.a)) {
            return false;
        }
        String str = wb2Var.b;
        String str2 = this.b;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return su4.o(sb, this.b, "}");
    }
}
