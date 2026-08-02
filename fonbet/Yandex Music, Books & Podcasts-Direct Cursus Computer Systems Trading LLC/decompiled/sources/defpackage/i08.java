package defpackage;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class i08 {
    public final String a;
    public final String b;

    public i08(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i08.class == obj.getClass()) {
            i08 i08Var = (i08) obj;
            if (Objects.equals(this.a, i08Var.a) && Objects.equals(this.b, i08Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{deviceId='");
        sb.append(this.a);
        sb.append("', platform='");
        return su4.o(sb, this.b, "'}");
    }
}
