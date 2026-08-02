package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zsm0 {
    public final Bitmap a;
    public final Bitmap b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;

    public zsm0(Bitmap bitmap, Bitmap bitmap2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        this.a = bitmap;
        this.b = bitmap2;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = charSequence4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsm0)) {
            return false;
        }
        zsm0 zsm0Var = (zsm0) obj;
        return jl40.l(this.a, zsm0Var.a) && jl40.l(this.b, zsm0Var.b) && jl40.l(this.c, zsm0Var.c) && jl40.l(this.d, zsm0Var.d) && jl40.l(this.e, zsm0Var.e) && this.f.equals(zsm0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Bitmap bitmap = this.b;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        CharSequence charSequence = this.c;
        return this.f.hashCode() + smw0.b(smw0.b((hashCode2 + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethodItem(baseImage=");
        sb.append(this.a);
        sb.append(", complementImage=");
        sb.append(this.b);
        sb.append(", cardText=");
        vfc.A(sb, this.c, ", itemTitle=", this.d, ", itemSubtitle=");
        sb.append((Object) this.e);
        sb.append(", buttonText=");
        sb.append((Object) this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
