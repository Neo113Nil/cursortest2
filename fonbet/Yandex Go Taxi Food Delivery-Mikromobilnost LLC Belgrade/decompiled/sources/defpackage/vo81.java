package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class vo81 {
    public final dj71 a;

    public vo81(dj71 dj71Var) {
        this.a = dj71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vo81) && this.a.equals(((vo81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(advertisingInfoHolder=" + this.a + Extension.C_BRAKE;
    }
}
