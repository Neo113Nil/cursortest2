package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vq21 {
    public final CharSequence a;
    public final String b;
    public final String c;
    public final String d;

    public vq21(CharSequence charSequence, String str, String str2, String str3) {
        this.a = charSequence;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq21)) {
            return false;
        }
        vq21 vq21Var = (vq21) obj;
        return jl40.l(this.a, vq21Var.a) && jl40.l(this.b, vq21Var.b) && jl40.l(this.c, vq21Var.c) && jl40.l(this.d, vq21Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserPhotoUploadingEula(text=");
        sb.append((Object) this.a);
        sb.append(", eulaId=");
        sb.append(this.b);
        sb.append(", selfieButtonText=");
        return g8e.r(sb, this.c, ", galleryButtonText=", this.d, Extension.C_BRAKE);
    }
}
