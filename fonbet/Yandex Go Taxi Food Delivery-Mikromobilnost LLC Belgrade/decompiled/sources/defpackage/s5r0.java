package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes12.dex */
public final class s5r0 implements mer0 {
    public final d5r0 a;
    public final ThemeType b;

    public s5r0(d5r0 d5r0Var, ThemeType themeType) {
        this.a = d5r0Var;
        this.b = themeType;
    }

    @Override // defpackage.mer0
    public final boolean a(mer0 mer0Var) {
        return (mer0Var instanceof s5r0) && this.a.a == ((s5r0) mer0Var).a.a;
    }

    @Override // defpackage.mer0
    public final boolean b(mer0 mer0Var) {
        return (mer0Var instanceof s5r0) && ((s5r0) mer0Var).b == this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5r0)) {
            return false;
        }
        s5r0 s5r0Var = (s5r0) obj;
        return this.a.equals(s5r0Var.a) && this.b == s5r0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "SettingGroupHeaderUiItem(header=" + this.a + ", themeType=" + this.b + Extension.C_BRAKE;
    }
}
