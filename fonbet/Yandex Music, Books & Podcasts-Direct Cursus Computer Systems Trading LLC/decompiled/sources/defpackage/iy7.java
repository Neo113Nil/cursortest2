package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class iy7 {
    public final String a;
    public final String b;
    public final String c;

    public iy7(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iy7.class == obj.getClass()) {
            iy7 iy7Var = (iy7) obj;
            if (Objects.equals(this.a, iy7Var.a) && Objects.equals(this.b, iy7Var.b) && Objects.equals(this.c, iy7Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
