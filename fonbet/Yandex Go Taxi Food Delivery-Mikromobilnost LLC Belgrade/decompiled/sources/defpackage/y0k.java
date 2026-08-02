package defpackage;

import android.content.Context;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class y0k {
    public final String a;
    public final boolean b;

    public y0k(Context context, k5e k5eVar) {
        Integer c = k5eVar.c();
        String str = (c == null || (str = context.getString(c.intValue())) == null) ? "" : str;
        boolean b = k5eVar.b();
        this.a = str;
        this.b = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0k)) {
            return false;
        }
        y0k y0kVar = (y0k) obj;
        return jl40.l(this.a, y0kVar.a) && this.b == y0kVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("DisplayedConnectionStatus(text=", this.a, ", showProgress=", this.b, Extension.C_BRAKE);
    }
}
