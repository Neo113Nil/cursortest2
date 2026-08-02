package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ro8 {
    public final po8 a;
    public final int b;

    public ro8(po8 po8Var, int i) {
        this.a = po8Var;
        this.b = i;
    }

    public static ro8 a(ro8 ro8Var, po8 po8Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            po8Var = ro8Var.a;
        }
        if ((i2 & 2) != 0) {
            i = ro8Var.b;
        }
        ro8Var.getClass();
        return new ro8(po8Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro8)) {
            return false;
        }
        ro8 ro8Var = (ro8) obj;
        return this.a.equals(ro8Var.a) && this.b == ro8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CardSettingsTermState(state=" + this.a + ", bottomPaddingPx=" + this.b + Extension.C_BRAKE;
    }
}
