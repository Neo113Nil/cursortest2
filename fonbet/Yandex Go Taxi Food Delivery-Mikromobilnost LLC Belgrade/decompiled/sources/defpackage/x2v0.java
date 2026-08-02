package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class x2v0 {
    public final String a;
    public final wp2 b;

    public x2v0(String str, AppColor$Palette appColor$Palette) {
        this.a = str;
        this.b = appColor$Palette;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2v0)) {
            return false;
        }
        x2v0 x2v0Var = (x2v0) obj;
        return jl40.l(this.a, x2v0Var.a) && jl40.l(this.b, x2v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SubtitleUiState(subtitle=" + this.a + ", subtitleColor=" + this.b + Extension.C_BRAKE;
    }
}
