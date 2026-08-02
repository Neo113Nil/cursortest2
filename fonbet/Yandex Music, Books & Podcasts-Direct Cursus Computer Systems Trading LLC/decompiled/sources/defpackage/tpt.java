package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class tpt extends qae {
    public final String b;
    public final String c;

    public tpt(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tpt.class != obj.getClass()) {
            return false;
        }
        tpt tptVar = (tpt) obj;
        return this.a.equals(tptVar.a) && Objects.equals(this.b, tptVar.b) && this.c.equals(tptVar.c);
    }

    public final int hashCode() {
        int c = k5r.c(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((c + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.qae
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
