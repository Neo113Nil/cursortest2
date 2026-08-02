package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class rj81 implements eq81 {
    public final dl61 a;

    public rj81(dl61 dl61Var) {
        this.a = dl61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rj81) && this.a.equals(((rj81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + Extension.C_BRAKE;
    }
}
