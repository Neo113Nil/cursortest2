package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class rbt0 {
    public final Bitmap a;
    public final String b;
    public final String c;

    public rbt0(Bitmap bitmap, String str, String str2) {
        this.a = bitmap;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbt0)) {
            return false;
        }
        rbt0 rbt0Var = (rbt0) obj;
        return jl40.l(this.a, rbt0Var.a) && jl40.l(this.b, rbt0Var.b) && jl40.l(this.c, rbt0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FloatButtonState(icon=");
        sb.append(this.a);
        sb.append(", tooltipText=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
