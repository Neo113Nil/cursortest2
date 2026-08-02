package defpackage;

import android.text.SpannableString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class vcc0 {
    public final SpannableString a;
    public final int b;
    public final int c;

    public vcc0(SpannableString spannableString, int i, int i2) {
        this.a = spannableString;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcc0)) {
            return false;
        }
        vcc0 vcc0Var = (vcc0) obj;
        return this.a.equals(vcc0Var.a) && this.b == vcc0Var.b && this.c == vcc0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleLine(text=");
        sb.append((Object) this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}
