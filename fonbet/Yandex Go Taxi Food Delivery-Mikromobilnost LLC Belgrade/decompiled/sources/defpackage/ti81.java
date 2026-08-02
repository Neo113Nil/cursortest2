package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.w21;

/* loaded from: classes7.dex */
public final class ti81 {
    public final Drawable a;
    public final w21 b;

    public ti81(Drawable drawable, w21 w21Var) {
        this.a = drawable;
        this.b = w21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti81)) {
            return false;
        }
        ti81 ti81Var = (ti81) obj;
        return jl40.l(this.a, ti81Var.a) && this.b == ti81Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CachedDrawable(drawable=" + this.a + ", imageType=" + this.b + Extension.C_BRAKE;
    }
}
