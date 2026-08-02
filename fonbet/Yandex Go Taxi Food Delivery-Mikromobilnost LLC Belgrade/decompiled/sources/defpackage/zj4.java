package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class zj4 extends ak4 {
    public final xj4 a;

    public zj4(xj4 xj4Var) {
        this.a = xj4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zj4) && this.a.equals(((zj4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Visible(badgeContent=" + this.a + Extension.C_BRAKE;
    }
}
