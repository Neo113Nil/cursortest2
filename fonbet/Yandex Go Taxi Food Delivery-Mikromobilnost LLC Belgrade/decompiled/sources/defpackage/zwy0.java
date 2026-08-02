package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes13.dex */
public final class zwy0 {
    public final Bitmap a;
    public final Bitmap b;

    public zwy0(Bitmap bitmap, Bitmap bitmap2) {
        this.a = bitmap;
        this.b = bitmap2;
    }

    public final Bitmap a(ThemeType themeType) {
        int i = ywy0.a[themeType.ordinal()];
        Bitmap bitmap = this.a;
        if (i == 1) {
            return bitmap;
        }
        if (i == 2) {
            Bitmap bitmap2 = this.b;
            return bitmap2 == null ? bitmap : bitmap2;
        }
        w511.b();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwy0)) {
            return false;
        }
        zwy0 zwy0Var = (zwy0) obj;
        return jl40.l(this.a, zwy0Var.a) && jl40.l(this.b, zwy0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Bitmap bitmap = this.b;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        return "ThemedBitmap(light=" + this.a + ", dark=" + this.b + Extension.C_BRAKE;
    }
}
