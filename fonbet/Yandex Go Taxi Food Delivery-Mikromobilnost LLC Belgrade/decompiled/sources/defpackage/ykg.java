package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ykg {
    public final zkg a;
    public final zkg b;

    public ykg(zkg zkgVar, zkg zkgVar2) {
        this.a = zkgVar;
        this.b = zkgVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykg)) {
            return false;
        }
        ykg ykgVar = (ykg) obj;
        return this.a.equals(ykgVar.a) && this.b.equals(ykgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Balance(particleColor=" + this.a + ", balanceColor=" + this.b + Extension.C_BRAKE;
    }
}
