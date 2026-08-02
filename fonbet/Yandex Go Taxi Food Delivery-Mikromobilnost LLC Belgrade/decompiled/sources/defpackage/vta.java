package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vta implements yta {
    public final gta a;
    public final boolean b;

    public vta(gta gtaVar, boolean z) {
        this.a = gtaVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vta)) {
            return false;
        }
        vta vtaVar = (vta) obj;
        return jl40.l(this.a, vtaVar.a) && this.b == vtaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(subscriptionData=" + this.a + ", loading=" + this.b + Extension.C_BRAKE;
    }
}
