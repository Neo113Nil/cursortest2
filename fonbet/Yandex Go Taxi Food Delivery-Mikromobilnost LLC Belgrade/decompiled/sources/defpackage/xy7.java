package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xy7 {
    public final String a;
    public final String b;
    public final sy7 c;

    public xy7(String str, String str2, sy7 sy7Var) {
        this.a = str;
        this.b = str2;
        this.c = sy7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy7)) {
            return false;
        }
        xy7 xy7Var = (xy7) obj;
        return jl40.l(this.a, xy7Var.a) && jl40.l(this.b, xy7Var.b) && this.c.equals(xy7Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CommentInput(hint=", this.a, ", text=", this.b, ", action=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
