package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ziz0 {
    public final String a;
    public final wp2 b;

    public ziz0(String str, AppColor$Palette appColor$Palette) {
        this.a = str;
        this.b = appColor$Palette;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ziz0)) {
            return false;
        }
        ziz0 ziz0Var = (ziz0) obj;
        return this.a.equals(ziz0Var.a) && jl40.l(this.b, ziz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TitleUiState(text=" + this.a + ", textColor=" + this.b + Extension.C_BRAKE;
    }
}
