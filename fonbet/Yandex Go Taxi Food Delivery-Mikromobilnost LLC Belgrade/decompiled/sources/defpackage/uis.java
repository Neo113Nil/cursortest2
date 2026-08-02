package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uis extends yis {
    public final Throwable b;

    public uis(Throwable th) {
        super(new tis(r501.a(th, null, null, null, null, null, null, null, null, null, null, null, null, 65534)));
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uis) && jl40.l(this.b, ((uis) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return b64.m("IssuePinError(throwable=", Extension.C_BRAKE, this.b);
    }
}
