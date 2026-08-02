package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class x3b implements z3b {
    public final String a;
    public final String b;
    public final Drawable c;
    public final boolean d;

    public x3b(String str, String str2, Drawable drawable, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = drawable;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3b)) {
            return false;
        }
        x3b x3bVar = (x3b) obj;
        return jl40.l(this.a, x3bVar.a) && jl40.l(this.b, x3bVar.b) && jl40.l(this.c, x3bVar.c) && this.d == x3bVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Drawable drawable = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (drawable != null ? drawable.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Regular(id=", this.a, ", name=", this.b, ", avatar=");
        v.append(this.c);
        v.append(", needSquareAvatar=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
