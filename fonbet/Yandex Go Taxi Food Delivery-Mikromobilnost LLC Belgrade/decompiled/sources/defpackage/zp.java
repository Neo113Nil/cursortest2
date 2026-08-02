package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zp {
    public final fr a;
    public final String b;
    public final k7v c;

    public zp(fr frVar, String str, k7v k7vVar) {
        this.a = frVar;
        this.b = str;
        this.c = k7vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp)) {
            return false;
        }
        zp zpVar = (zp) obj;
        return this.a.equals(zpVar.a) && jl40.l(this.b, zpVar.b) && jl40.l(this.c, zpVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        k7v k7vVar = this.c;
        return b + (k7vVar == null ? 0 : k7vVar.hashCode());
    }

    public final String toString() {
        return "MoreActionsModalItem(action=" + this.a + ", text=" + this.b + ", image=" + this.c + Extension.C_BRAKE;
    }
}
