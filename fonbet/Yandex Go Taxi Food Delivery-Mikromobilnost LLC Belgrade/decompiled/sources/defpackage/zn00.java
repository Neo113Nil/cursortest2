package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zn00 implements fo00 {
    public final zwy0 a;
    public final CharSequence b;
    public final CharSequence c;
    public final boolean d;

    public zn00(zwy0 zwy0Var, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.a = zwy0Var;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn00)) {
            return false;
        }
        zn00 zn00Var = (zn00) obj;
        return jl40.l(this.a, zn00Var.a) && jl40.l(this.b, zn00Var.b) && jl40.l(this.c, zn00Var.c) && this.d == zn00Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SupermapUniversalMFallbackPinStyle(imageAssetThemedBitmap=" + this.a + ", title=" + ((Object) this.b) + ", subtitle=" + ((Object) this.c) + ", isOrganization=" + this.d + Extension.C_BRAKE;
    }
}
