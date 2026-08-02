package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s5n extends n351 {
    public final cyu0 c;
    public final float d;

    public s5n(cyu0 cyu0Var, float f) {
        super("dynamic-content-header-key", false, 14);
        this.c = cyu0Var;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5n)) {
            return false;
        }
        s5n s5nVar = (s5n) obj;
        return this.c.equals(s5nVar.c) && y7m.b(this.d, s5nVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "DynamicContentHeaderModel(title=" + this.c + ", paddingTop=" + y7m.c(this.d) + Extension.C_BRAKE;
    }
}
