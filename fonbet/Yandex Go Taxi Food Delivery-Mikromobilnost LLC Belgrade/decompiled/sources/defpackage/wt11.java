package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class wt11 implements xt11 {
    public final String a;
    public final ThemeType b;

    public wt11(ThemeType themeType, String str) {
        this.a = str;
        this.b = themeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt11)) {
            return false;
        }
        wt11 wt11Var = (wt11) obj;
        return jl40.l(this.a, wt11Var.a) && this.b == wt11Var.b;
    }

    @Override // defpackage.xt11
    public final String getTag() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ThemeType themeType = this.b;
        return hashCode + (themeType != null ? themeType.hashCode() : 0);
    }

    public final String toString() {
        return "TagWithTheme(tag=" + this.a + ", themeType=" + this.b + Extension.C_BRAKE;
    }
}
