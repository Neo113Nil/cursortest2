package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rj70 {
    public final Drawable a;
    public final String b;
    public final boolean c;

    public rj70(Drawable drawable, String str, boolean z) {
        this.a = drawable;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj70)) {
            return false;
        }
        rj70 rj70Var = (rj70) obj;
        return jl40.l(this.a, rj70Var.a) && jl40.l(this.b, rj70Var.b) && this.c == rj70Var.c;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int hashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangePayload(drawable=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
