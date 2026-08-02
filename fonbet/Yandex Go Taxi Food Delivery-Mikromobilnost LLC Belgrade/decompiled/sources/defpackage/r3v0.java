package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class r3v0 {
    public final ArrayList a;
    public final String b;
    public final String c;
    public final String d;

    public r3v0(String str, String str2, String str3, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3v0)) {
            return false;
        }
        r3v0 r3v0Var = (r3v0) obj;
        return this.a.equals(r3v0Var.a) && this.b.equals(r3v0Var.b) && this.c.equals(r3v0Var.c) && this.d.equals(r3v0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessNativeContent(logoImages=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", buttonText=");
        return b64.p(sb, this.d, ')');
    }
}
