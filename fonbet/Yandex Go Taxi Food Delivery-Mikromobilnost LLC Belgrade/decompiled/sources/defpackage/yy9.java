package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yy9 {
    public final String a;
    public final CharSequence b;

    public yy9(CharSequence charSequence, String str) {
        this.a = str;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy9)) {
            return false;
        }
        yy9 yy9Var = (yy9) obj;
        return jl40.l(this.a, yy9Var.a) && jl40.l(this.b, yy9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChargersFeedbackChip(id=" + this.a + ", title=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
