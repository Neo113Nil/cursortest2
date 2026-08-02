package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class rif {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        int i = dvt.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public rif(String str, String str2) {
        this.a = dvt.Z(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rif.class == obj.getClass()) {
            rif rifVar = (rif) obj;
            if (Objects.equals(this.a, rifVar.a) && Objects.equals(this.b, rifVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
