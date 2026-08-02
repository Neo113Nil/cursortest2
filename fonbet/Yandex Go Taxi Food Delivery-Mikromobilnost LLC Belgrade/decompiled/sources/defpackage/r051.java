package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class r051 implements z051 {
    public final ocm a;

    public r051(ocm ocmVar) {
        this.a = ocmVar;
    }

    public final ocm a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r051) && jl40.l(this.a, ((r051) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DriveArrowButton(drive=" + this.a + Extension.C_BRAKE;
    }
}
