package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ykb implements blb {
    public final String a;
    public final wib b;

    public ykb(String str, wib wibVar) {
        this.a = str;
        this.b = wibVar;
    }

    @Override // defpackage.blb
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykb)) {
            return false;
        }
        ykb ykbVar = (ykb) obj;
        return this.a.equals(ykbVar.a) && this.b.equals(ykbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoOpen(stateKey=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
