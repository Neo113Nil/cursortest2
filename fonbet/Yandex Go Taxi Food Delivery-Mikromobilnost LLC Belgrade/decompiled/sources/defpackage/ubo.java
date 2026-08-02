package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ubo {
    public final tbo a;
    public final tbo b;

    public ubo(tbo tboVar, tbo tboVar2) {
        this.a = tboVar;
        this.b = tboVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubo)) {
            return false;
        }
        ubo uboVar = (ubo) obj;
        return this.a.equals(uboVar.a) && this.b.equals(uboVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EssentialPoints(source=" + this.a + ", destination=" + this.b + Extension.C_BRAKE;
    }
}
