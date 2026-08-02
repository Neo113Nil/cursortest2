package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class zc21 {
    public static final vc21 Companion = new vc21();
    public final String a;
    public final yc21 b;

    public /* synthetic */ zc21(int i, String str, yc21 yc21Var) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, uc21.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = yc21Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc21)) {
            return false;
        }
        zc21 zc21Var = (zc21) obj;
        return jl40.l(this.a, zc21Var.a) && jl40.l(this.b, zc21Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yc21 yc21Var = this.b;
        return hashCode + (yc21Var == null ? 0 : yc21Var.hashCode());
    }

    public final String toString() {
        return "UploadPhotoResult(responseType=" + this.a + ", failureReason=" + this.b + Extension.C_BRAKE;
    }
}
