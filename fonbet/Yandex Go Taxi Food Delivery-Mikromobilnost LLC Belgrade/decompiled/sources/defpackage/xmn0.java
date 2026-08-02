package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xmn0 {
    public final CharSequence a;
    public final CharSequence b;
    public final Bitmap c;
    public final String d;
    public final String e;
    public final int f;

    public xmn0(CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap, String str, String str2, int i) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = bitmap;
        this.d = str;
        this.e = str2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmn0)) {
            return false;
        }
        xmn0 xmn0Var = (xmn0) obj;
        return jl40.l(this.a, xmn0Var.a) && jl40.l(this.b, xmn0Var.b) && jl40.l(this.c, xmn0Var.c) && jl40.l(this.d, xmn0Var.d) && jl40.l(this.e, xmn0Var.e) && this.f == xmn0Var.f;
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        Bitmap bitmap = this.c;
        return Integer.hashCode(this.f) + unr0.b(unr0.b((b + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ScootersFinishInfoNewbieHelpItemUiState(title=", ", subtitle=", ", image=");
        r.append(this.c);
        r.append(", deeplink=");
        r.append(this.d);
        r.append(", metricaId=");
        r.append(this.e);
        r.append(", step=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
