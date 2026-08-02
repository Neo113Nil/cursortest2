package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class r600 {
    public final boolean a;
    public final Drawable b;
    public final l600 c;

    public r600(boolean z, Drawable drawable, l600 l600Var) {
        this.a = z;
        this.b = drawable;
        this.c = l600Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r600)) {
            return false;
        }
        r600 r600Var = (r600) obj;
        return this.a == r600Var.a && jl40.l(this.b, r600Var.b) && this.c.equals(r600Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Drawable drawable = this.b;
        return this.c.hashCode() + ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public final String toString() {
        return "AvatarState(isLoading=" + this.a + ", drawable=" + this.b + ", clickAction=" + this.c + Extension.C_BRAKE;
    }
}
