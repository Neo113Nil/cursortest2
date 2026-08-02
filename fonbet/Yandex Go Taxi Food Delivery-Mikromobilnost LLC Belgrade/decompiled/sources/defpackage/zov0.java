package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zov0 {
    public final String a;
    public final Drawable b;

    public zov0(BitmapDrawable bitmapDrawable, String str) {
        this.a = str;
        this.b = bitmapDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zov0)) {
            return false;
        }
        zov0 zov0Var = (zov0) obj;
        return jl40.l(this.a, zov0Var.a) && jl40.l(this.b, zov0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Drawable drawable = this.b;
        return hashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "TariffTimeLoadedIcon(iconTag=" + this.a + ", iconDrawable=" + this.b + Extension.C_BRAKE;
    }
}
