package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wl70 {
    public final String a;
    public final String b;
    public final boolean c;
    public final Bitmap d;
    public final boolean e;

    public wl70(String str, String str2, boolean z, Bitmap bitmap, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = bitmap;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl70)) {
            return false;
        }
        wl70 wl70Var = (wl70) obj;
        return jl40.l(this.a, wl70Var.a) && jl40.l(this.b, wl70Var.b) && this.c == wl70Var.c && jl40.l(this.d, wl70Var.d) && this.e == wl70Var.e;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Bitmap bitmap = this.d;
        return Boolean.hashCode(this.e) + ((e + (bitmap == null ? 0 : bitmap.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderCandidate(name=", this.a, ", rating=", this.b, ", isAvatarLoading=");
        v.append(this.c);
        v.append(", avatar=");
        v.append(this.d);
        v.append(", detailsUnavailable=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
