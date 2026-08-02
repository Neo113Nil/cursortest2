package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vis extends yis {
    public final Throwable b;

    public vis(Throwable th) {
        super(new tis(r501.a(th, null, null, null, null, null, null, null, null, null, null, null, null, 65534)));
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vis) && jl40.l(this.b, ((vis) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return b64.m("None(throwable=", Extension.C_BRAKE, this.b);
    }
}
