package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes12.dex */
public final class whb implements mer0 {
    public final b5r0 a;
    public final ThemeType b;

    public whb(b5r0 b5r0Var, ThemeType themeType) {
        this.a = b5r0Var;
        this.b = themeType;
    }

    @Override // defpackage.mer0
    public final boolean a(mer0 mer0Var) {
        return (mer0Var instanceof whb) && jl40.l(this.a.a, ((whb) mer0Var).a.a);
    }

    @Override // defpackage.mer0
    public final boolean b(mer0 mer0Var) {
        if (!(mer0Var instanceof whb)) {
            return false;
        }
        whb whbVar = (whb) mer0Var;
        return this.a.c == whbVar.a.c && whbVar.b == this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whb)) {
            return false;
        }
        whb whbVar = (whb) obj;
        return this.a.equals(whbVar.a) && this.b == whbVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckSettingUiItem(checkSetting=" + this.a + ", themeType=" + this.b + Extension.C_BRAKE;
    }
}
