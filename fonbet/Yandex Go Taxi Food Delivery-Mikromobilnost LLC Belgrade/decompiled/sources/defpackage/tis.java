package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tis extends cva1 {
    public final kao a;

    public tis(kao kaoVar) {
        this.a = kaoVar;
    }

    public final kao e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tis) && this.a == ((tis) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ly3.n("Error(state=", this.a, Extension.C_BRAKE);
    }
}
