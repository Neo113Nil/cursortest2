package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s8j0 extends u8j0 {
    public final Throwable a;

    public s8j0(Throwable th) {
        this.a = th;
    }

    public final Throwable d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8j0) && jl40.l(this.a, ((s8j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.m("Error(description=", Extension.C_BRAKE, this.a);
    }
}
