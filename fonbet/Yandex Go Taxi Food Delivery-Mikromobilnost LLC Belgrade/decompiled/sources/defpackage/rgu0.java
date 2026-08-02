package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class rgu0 {
    public final String a;
    public final String b;
    public final ThemeType c;

    public rgu0(String str, String str2, ThemeType themeType) {
        this.a = str;
        this.b = str2;
        this.c = themeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgu0)) {
            return false;
        }
        rgu0 rgu0Var = (rgu0) obj;
        return jl40.l(this.a, rgu0Var.a) && jl40.l(this.b, rgu0Var.b) && this.c == rgu0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThemeType themeType = this.c;
        return hashCode2 + (themeType != null ? themeType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Key(verticalId=", this.a, ", tariffClass=", this.b, ", theme=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
