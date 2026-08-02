package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ynk0 extends aok0 {
    public final kdc a;

    public ynk0(kdc kdcVar) {
        this.a = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ynk0) && jl40.l(this.a, ((ynk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BoldTimer(backgroundColor=" + this.a + Extension.C_BRAKE;
    }
}
