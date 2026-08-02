package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class w5y0 {
    public final CharSequence a;
    public final CharSequence b;
    public final v5y0 c;
    public final Drawable d;

    public w5y0(CharSequence charSequence, CharSequence charSequence2, v5y0 v5y0Var, Drawable drawable) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = v5y0Var;
        this.d = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5y0)) {
            return false;
        }
        w5y0 w5y0Var = (w5y0) obj;
        return jl40.l(this.a, w5y0Var.a) && jl40.l(this.b, w5y0Var.b) && jl40.l(this.c, w5y0Var.c) && jl40.l(this.d, w5y0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        Drawable drawable = this.d;
        return hashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "TaxiOrderScreenshotSharingUiState(title=", ", text=", ", button=");
        r.append(this.c);
        r.append(", icon=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
