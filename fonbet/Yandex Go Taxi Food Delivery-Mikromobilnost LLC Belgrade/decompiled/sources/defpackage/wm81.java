package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class wm81 implements eq81 {
    public final p671 a;
    public final c171 b;

    public wm81(p671 p671Var, c171 c171Var) {
        this.a = p671Var;
        this.b = c171Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm81)) {
            return false;
        }
        wm81 wm81Var = (wm81) obj;
        return jl40.l(this.a, wm81Var.a) && jl40.l(this.b, wm81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(advertisingConfiguration=" + this.a + ", environmentConfiguration=" + this.b + Extension.C_BRAKE;
    }
}
