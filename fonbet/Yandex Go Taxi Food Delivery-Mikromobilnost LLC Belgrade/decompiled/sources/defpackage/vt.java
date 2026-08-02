package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes12.dex */
public final class vt implements mer0 {
    public final z4r0 a;
    public final ThemeType b;

    public vt(z4r0 z4r0Var, ThemeType themeType) {
        this.a = z4r0Var;
        this.b = themeType;
    }

    @Override // defpackage.mer0
    public final boolean a(mer0 mer0Var) {
        return (mer0Var instanceof vt) && jl40.l(this.a.a, ((vt) mer0Var).a.a);
    }

    @Override // defpackage.mer0
    public final boolean b(mer0 mer0Var) {
        if (!(mer0Var instanceof vt)) {
            return false;
        }
        vt vtVar = (vt) mer0Var;
        return jl40.l(this.a.a, vtVar.a.a) && vtVar.b == this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt)) {
            return false;
        }
        vt vtVar = (vt) obj;
        return this.a.equals(vtVar.a) && this.b == vtVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionButtonsSettingUiItem(actionButtonsSetting=" + this.a + ", themeType=" + this.b + Extension.C_BRAKE;
    }
}
