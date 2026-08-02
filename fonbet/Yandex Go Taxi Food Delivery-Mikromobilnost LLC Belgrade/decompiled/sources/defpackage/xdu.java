package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class xdu {
    public final p0c0 a;
    public final ThemeType b;
    public final u92 c;

    public xdu(p0c0 p0c0Var, ThemeType themeType, u92 u92Var) {
        this.a = p0c0Var;
        this.b = themeType;
        this.c = u92Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xdu) {
            xdu xduVar = (xdu) obj;
            return jl40.l(this.a, xduVar.a) && this.b == xduVar.b && this.c == xduVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PinCache(style=" + this.a + ", themeType=" + this.b + ", image=" + this.c + Extension.C_BRAKE;
    }
}
