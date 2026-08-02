package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v14 implements y14 {
    public final kao a;

    public v14(kao kaoVar) {
        this.a = kaoVar;
    }

    public final kao a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v14) && this.a == ((v14) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ly3.n("Error(errorState=", this.a, Extension.C_BRAKE);
    }
}
