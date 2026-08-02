package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class thf extends shf {
    public final Exception b;
    public final int c;

    public thf(int i, Exception exc) {
        super(null);
        this.b = exc;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thf)) {
            return false;
        }
        thf thfVar = (thf) obj;
        return jl40.l(this.b, thfVar.b) && this.c == thfVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "CurrentSessionStateError(error=" + this.b + ", code=" + this.c + Extension.C_BRAKE;
    }
}
