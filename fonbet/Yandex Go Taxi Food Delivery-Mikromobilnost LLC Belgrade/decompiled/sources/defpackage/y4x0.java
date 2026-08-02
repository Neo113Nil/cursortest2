package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class y4x0 {
    public final FormattedText a;
    public final FormattedText b;
    public final Object c;
    public final r9x0 d;

    public y4x0(FormattedText formattedText, FormattedText formattedText2, Object obj, r9x0 r9x0Var) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = obj;
        this.d = r9x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4x0)) {
            return false;
        }
        y4x0 y4x0Var = (y4x0) obj;
        return this.a.equals(y4x0Var.a) && this.b.equals(y4x0Var.b) && jl40.l(this.c, y4x0Var.c) && jl40.l(this.d, y4x0Var.d);
    }

    public final int hashCode() {
        int c = smw0.c(unr0.c(this.a.a.hashCode() * 31, 31, this.b.a), 31, this.c);
        r9x0 r9x0Var = this.d;
        return c + (r9x0Var == null ? 0 : r9x0Var.hashCode());
    }

    public final String toString() {
        return "TabOption(selectedText=" + this.a + ", unselectedText=" + this.b + ", value=" + this.c + ", action=" + this.d + Extension.C_BRAKE;
    }
}
