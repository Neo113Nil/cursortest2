package defpackage;

import android.text.SpannableStringBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class yx11 implements m1j {
    public final SpannableStringBuilder a;
    public final CharSequence b;
    public final String c;
    public final i911 d;
    public final String e;

    public yx11(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, String str, i911 i911Var, String str2) {
        this.a = spannableStringBuilder;
        this.b = charSequence;
        this.c = str;
        this.d = i911Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx11)) {
            return false;
        }
        yx11 yx11Var = (yx11) obj;
        return this.a.equals(yx11Var.a) && this.b.equals(yx11Var.b) && this.c.equals(yx11Var.c) && this.d.equals(yx11Var.d) && jl40.l(this.e, yx11Var.e);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + unr0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UndergroundInfo(title=");
        sb.append((Object) this.a);
        sb.append(", subtitle=");
        sb.append((Object) this.b);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(", transportType=");
        sb.append(this.d);
        sb.append(", id=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
