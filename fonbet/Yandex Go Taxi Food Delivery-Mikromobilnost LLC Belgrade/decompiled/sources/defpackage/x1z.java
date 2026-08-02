package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class x1z implements y1z {
    public final String a;

    public x1z(String str) {
        this.a = str;
    }

    @Override // defpackage.y1z
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1z) && jl40.l(this.a, ((x1z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Removed(bidId=", this.a, Extension.C_BRAKE);
    }
}
