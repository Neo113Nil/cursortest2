package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xq80 {
    public final CharSequence a;
    public final wp2 b;
    public final float c;

    public xq80(CharSequence charSequence, AppColor$Palette appColor$Palette, float f) {
        this.a = charSequence;
        this.b = appColor$Palette;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq80)) {
            return false;
        }
        xq80 xq80Var = (xq80) obj;
        return this.a.equals(xq80Var.a) && jl40.l(this.b, xq80Var.b) && Float.compare(this.c, xq80Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + n.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OriginalPriceUiState(text=");
        sb.append((Object) this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", alpha=");
        return uw51.i(sb, this.c, Extension.C_BRAKE);
    }
}
